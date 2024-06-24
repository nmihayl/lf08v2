from gebaeude import Gebaeude


class Lagerhalle(Gebaeude):

    def __init__(self, adresse="unbekannt", baujahr=0, preis=0.0, lagerflaeche=0.0):
        super().__init__(adresse, baujahr, preis)
        self.__lagerflaeche = lagerflaeche

    def get_lagerflaeche(self):
        return self.__lagerflaeche

    def set_lagerflaeche(self, value):
        self.__lagerflaeche = value
