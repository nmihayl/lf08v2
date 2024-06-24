from musikinstrument import MusikInstrument


class Gitarre(MusikInstrument):
    def __init__(self, modell="unbekannt", hersteller="unbekannt", preis=0.0, groesse="unbekannt"):
        super().__init__(modell, hersteller, preis)
        self.__groesse = groesse

    def get_groesse(self):
        return self.__groesse

    def set_groesse(self, value):
        self.__groesse = value

    def get_modell(self):
        return self.__modell

    def set_modell(self, value):
        self.__modell = value

    def get_hersteller(self):
        return self.__hersteller

    def set_hersteller(self, value):
        self.__hersteller = value

    def get_preis(self):
        return self.preis

    def set_preis(self, value):
        self.preis = value

    def get_Daten(self):
        daten = "Modell: " + self.__modell + "\n" + \
                "Hersteller: " + self.__hersteller + "\n" + \
                "Größe: " + self.__groesse + "\n" + \
                "Preis: " + "\n" + str(self.preis)
        return daten
