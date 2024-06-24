class Gebaeude:
    def __init__(self, adresse="unbekannt", preis=0.0, baujahr=0):
        self.baujahr = baujahr
        self.adresse = adresse
        self.preis = preis

    def get_adresse(self):
        return self._adresse

    def set_adresse(self, value):
        self.__adresse = value

    def get_preis(self):
        return self.__preis

    def set_preis(self, value):
        self.__preis = value

    def get_baujahr(self):
        return self.__baujahr

    def set_baujahr(self, value):
        self._baujahr = value

    def get_daten(self):
        daten = "Adresse: " + self.__adresse + "\n" + \
                "Baujahr: " + str(self.__baujahr) + "\n" + \
                "Preis: " + str(self.__preis)
        return daten



