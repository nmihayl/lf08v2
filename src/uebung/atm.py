import tkinter as tk
from tkinter import messagebox
import sqlite3
from datetime import datetime


class ATMInterface:
    def __init__(self, root):
        self.root = root
        self.root.title("Geldautomat")
        self.root.geometry("1024x768")

        self.conn = sqlite3.connect('atm.db')
        self.cursor = self.conn.cursor()
        self.create_db()

        self.current_account = None

        self.show_account_selection_screen()

    def create_db(self):
        self.cursor.execute('''
            CREATE TABLE IF NOT EXISTS accounts (
                account_number INTEGER PRIMARY KEY,
                pin TEXT,
                balance REAL
            )
        ''')

        self.cursor.execute('''
            CREATE TABLE IF NOT EXISTS transactions (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                account_number INTEGER,
                date TEXT,
                amount REAL,
                FOREIGN KEY(account_number) REFERENCES accounts(account_number)
            )
        ''')

        self.cursor.execute('SELECT * FROM accounts')
        if not self.cursor.fetchone():
            self.cursor.executemany('INSERT INTO accounts (account_number, pin, balance) VALUES (?, ?, ?)', [
                (1, '1234', 1000.00),
                (2, '5678', 1500.00),
                (3, '4321', 500.00)
            ])
            self.conn.commit()

    def show_account_selection_screen(self):
        for widget in self.root.winfo_children():
            widget.destroy()

        self.account_label = tk.Label(self.root, text="Wählen Sie Ihren Kontoinhaber:", font=("Arial", 24))
        self.account_label.pack(pady=20)

        self.cursor.execute('SELECT account_number FROM accounts')
        accounts = self.cursor.fetchall()

        for account in accounts:
            btn = tk.Button(self.root, text=f"Konto {account[0]}", font=("Arial", 18),
                            command=lambda acc=account[0]: self.select_account(acc))
            btn.pack(pady=10)

    def select_account(self, account_number):
        self.current_account = account_number
        self.show_pin_screen()

    def show_pin_screen(self):
        for widget in self.root.winfo_children():
            widget.destroy()

        self.pin_label = tk.Label(self.root, text="Geben Sie Ihre PIN ein:", font=("Arial", 24))
        self.pin_label.pack(pady=20)

        self.pin_entry = tk.Entry(self.root, font=("Arial", 18), show='*')
        self.pin_entry.pack(pady=10)

        self.pin_confirm_button = tk.Button(self.root, text="Bestätigen", font=("Arial", 18),
                                            command=self.validate_pin)
        self.pin_confirm_button.pack(pady=20)

    def validate_pin(self):
        entered_pin = self.pin_entry.get()
        self.cursor.execute('SELECT pin FROM accounts WHERE account_number = ?', (self.current_account,))
        valid_pin = self.cursor.fetchone()[0]

        if entered_pin == valid_pin:
            self.show_main_screen()
        else:
            messagebox.showwarning("Ungültige PIN", "Die eingegebene PIN ist falsch.")
            self.show_pin_screen()

    def show_main_screen(self):
        for widget in self.root.winfo_children():
            widget.destroy()

        self.cursor.execute('SELECT balance FROM accounts WHERE account_number = ?', (self.current_account,))
        self.balance = self.cursor.fetchone()[0]

        self.balance_label = tk.Label(self.root, text=f"Aktueller Kontostand: {self.balance} €", font=("Arial", 24))
        self.balance_label.pack(pady=20)

        amounts = [20, 50, 100]
        for amount in amounts:
            btn = tk.Button(self.root, text=f"{amount} €", font=("Arial", 18),
                            command=lambda amt=amount: self.enter_pin(amt))
            btn.pack(pady=10)

        self.custom_amount_label = tk.Label(self.root, text="benutzerdefinierter Betrag:", font=("Arial", 18))
        self.custom_amount_label.pack(pady=20)
        self.custom_amount_entry = tk.Entry(self.root, font=("Arial", 18))
        self.custom_amount_entry.pack(pady=10)

        self.confirm_button = tk.Button(self.root, text="Bestätigen", font=("Arial", 18),
                                        command=self.confirm_custom_amount)
        self.confirm_button.pack(pady=20)

        self.history_button = tk.Button(self.root, text="Transaktionshistorie", font=("Arial", 18),
                                        command=self.show_history)
        self.history_button.pack(pady=20)

        self.help_button = tk.Button(self.root, text="Hilfe", font=("Arial", 18), command=self.show_help)
        self.help_button.pack(side="left", padx=20, pady=10)

        self.cancel_button = tk.Button(self.root, text="Beenden", font=("Arial", 18), command=self.exit_program)
        self.cancel_button.pack(side="right", padx=20, pady=10)

    def enter_pin(self, amount):
        self.pin_window = tk.Toplevel(self.root)
        self.pin_window.title("PIN Eingeben")
        self.pin_window.geometry("300x200")

        self.pin_label = tk.Label(self.pin_window, text="Geben Sie Ihre PIN ein:", font=("Arial", 18))
        self.pin_label.pack(pady=20)
        self.pin_entry = tk.Entry(self.pin_window, font=("Arial", 18), show='*')
        self.pin_entry.pack(pady=10)

        self.pin_confirm_button = tk.Button(self.pin_window, text="Bestätigen", font=("Arial", 18),
                                            command=lambda amt=amount: self.validate_transaction_pin(amt))
        self.pin_confirm_button.pack(pady=20)

    def validate_transaction_pin(self, amount):
        entered_pin = self.pin_entry.get()
        self.cursor.execute('SELECT pin FROM accounts WHERE account_number = ?', (self.current_account,))
        valid_pin = self.cursor.fetchone()[0]

        if entered_pin == valid_pin:
            self.pin_window.destroy()
            self.withdraw(amount)
        else:
            messagebox.showwarning("Ungültige PIN", "Die eingegebene PIN ist falsch.")
            self.pin_window.destroy()

    def withdraw(self, amount):
        if self.balance >= amount:
            self.balance -= amount
            self.update_balance()
            self.log_transaction(amount)
            messagebox.showinfo("Erfolg", f"Bitte nehmen Sie Ihre {amount} €")
            self.show_main_screen()
        else:
            messagebox.showwarning("Unzureichende Mittel", "Ihr Guthaben reicht für diese Transaktion nicht aus.")

    def update_balance(self):
        self.cursor.execute('UPDATE accounts SET balance = ? WHERE account_number = ?',
                            (self.balance, self.current_account))
        self.conn.commit()

    def confirm_custom_amount(self):
        try:
            amount = float(self.custom_amount_entry.get())
            if amount <= 0:
                raise ValueError("Der Betrag muss positiv sein.")
            self.enter_pin(amount)
        except ValueError as e:
            messagebox.showwarning("Ungültige Eingabe", str(e))

    def log_transaction(self, amount):
        date = datetime.now().strftime("%Y-%m-%d %H:%M:%S")
        self.cursor.execute("INSERT INTO transactions (account_number, date, amount) VALUES (?, ?, ?)",
                            (self.current_account, date, amount))
        self.conn.commit()

    def show_history(self):
        history_window = tk.Toplevel(self.root)
        history_window.title("Transaktionshistorie")
        history_window.geometry("600x400")

        scrollbar = tk.Scrollbar(history_window)
        scrollbar.pack(side=tk.RIGHT, fill=tk.Y)

        listbox = tk.Listbox(history_window, yscrollcommand=scrollbar.set, font=("Arial", 14))
        listbox.pack(fill=tk.BOTH, expand=True)
        scrollbar.config(command=listbox.yview)

        self.cursor.execute("SELECT date, amount FROM transactions WHERE account_number = ?", (self.current_account,))
        transactions = self.cursor.fetchall()

        for transaction in transactions:
            listbox.insert(tk.END, f"Datum: {transaction[0]} - Betrag: {transaction[1]} €")

    def show_help(self):
        messagebox.showinfo("Hilfe",
                            "Um Geld abzuheben, wählen Sie einen voreingestellten Betrag aus oder geben Sie einen "
                            "benutzerdefinierten Betrag ein und drücken Sie „Bestätigen“.")

    def exit_program(self):
        self.conn.close()
        self.root.quit()

    def __del__(self):
        self.conn.close()


if __name__ == "__main__":
    root = tk.Tk()
    app = ATMInterface(root)
    root.mainloop()
