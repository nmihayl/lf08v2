import tkinter
from tkinter import ttk


def btnClose_click():
    frmMain.destroy()


# Hauptfenster erstellen
frmMain = tkinter.Tk()
frmMain.title("Fenster mit Button")
frmMain.wm_geometry('400x200')

# btnClose erstellen
btnClose = ttk.Button(frmMain, text="Beenden", command=btnClose_click)
btnClose.place(x=160, y=80)

# Endlosschleife
frmMain.mainloop()