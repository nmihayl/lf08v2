class MusikInstrument:
    # Attribute
    __modell = "unbekannt"
    __hersteller = "unbekannt"
    __preis = 0.0

    # Konstruktor
    def __init__(self, modell="unbekannt", hersteller="unbekannt", preis=0.0):
        self.__modell = modell
        self.__hersteller = hersteller
        self.__preis = 0.0

    # Getter und Setter erzeugen
    def get_modell(self):
        return self.__modell

    def set_modell(self, value):
        self.__modell = value

    def get_hersteller(self):
        return self.__hersteller

    def set_hersteller(self, value):
        self.__hersteller = value

    def get_preis(self):
        return self.__preis

    def set_preis(self, value):
        self.__preis = value

    # Methoden
    def get_Daten(self):
        daten = "Modell: " + self.__modell + "\n" + \
                "Hersteller: " + self.__hersteller + "\n" + \
                "Preis: " + str(self.__preis) + "\n"
        return daten
