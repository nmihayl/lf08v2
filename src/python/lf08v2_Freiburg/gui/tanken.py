import tkinter
from tkinter import messagebox
from tkinter import ttk


def btnClose_click():
    frmMain.quit()


def btnCalc_click():
    try:
        menge = float(txtVolume.get())
        preis = float(txtPrice.get())
        ergebnis = menge * preis
        txtResult.delete(0, 'end')
        txtResult.insert(0, ergebnis)
    except Exception as e:
        messagebox.showwarning(title="Warnung", message="Es ist folgender Fehler aufgetreten: \n" + e.args[0])


# Hauptfenster erzeugen
frmMain = tkinter.Tk()
frmMain.title("Kostenrechner: Tanken")
frmMain.wm_geometry('350x200')

btnClose = ttk.Button(frmMain, text="Beenden", command=btnCalc_click())
btnClose.place(x=229, y=150)

btnCalc = ttk.Button(frmMain, text="Berechnen", command=btnCalc_click())
btnCalc.place(x=120, y=150)

# Label erzeugen
lblVolume = ttk.Label(frmMain, text="Menge in Liter")
lblVolume.place(x=50, y=50)

lblPrice = ttk.Label(frmMain, text="Preis pro Liter in Euro")
lblVolume.place(x=10, y=80)

lblResult = ttk.Label(frmMain, text="Kosten in Euro")
lblResult.place(x=50, y=110)

# Entries anlegen
txtVolume = ttk.Entry(frmMain, foreground="red")
txtVolume.insert(0, "0")
txtVolume.place(x=140, y=50)

txtPrice = ttk.Entry(frmMain, foreground="red")
txtPrice.insert(0, "0")
txtPrice.place(x=140, y=80)

frmMain.mainloop()
