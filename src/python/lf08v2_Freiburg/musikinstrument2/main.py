from gitarre import Gitarre
from saxophon import Saxophon

gitarre = Gitarre("PRS Custom 24 BW", "PRS", preis=3998.00)  # Objekt erzeugen
saxophon = Saxophon("Yamaha YAS-280S", "Yamaha", preis=1179.00)  # Objekt erzeugen


def main():
    gitarre.set_groesse("4/4")
    print(gitarre.get_Daten())

    saxophon.set_stimmung("Eb")
    print(saxophon.get_Daten())


main()  # Programm ausführen


# Beispiel Destruktor
def __del__(self):
    pass
