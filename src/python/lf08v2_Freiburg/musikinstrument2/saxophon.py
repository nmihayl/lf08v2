from musikinstrument import MusikInstrument


class Saxophon(MusikInstrument):
    def __init__(self, modell="unbekannt", hersteller="unbekannt", preis=0.0, stimmung="unbekannt"):
        super().__init__(modell, hersteller, preis)
        self.__stimmung = stimmung

    def get_stimmung(self):
        return self.__stimmung

    def set_stimmung(self, value):
        self.__stimmung = value

    def get_Daten(self):
        daten = "Modell: " + self._modell + "\n" + \
                "Hersteller: " + self._hersteller + "\n" + \
                "Preis: " + str(self._preis) + "\n" + \
                "Stimmung: " + self.__stimmung + "\n"
        return daten
