from gebaeude import Gebaeude
from lf08v2_Freiburg.gebaeudeverwaltung import lagerhalle

gebaeude = Gebaeude()


def main():
    gebaeude.set_adresse("Beispielstr. 1")
    gebaeude.set_baujahr(1978)
    gebaeude.set_preis(36998.00)
    print(gebaeude.get_daten())

    lagerhalle.set_adresse("Beispielstr. 2")
    lagerhalle.set_baujahr(1988)
    lagerhalle.set_preis(32398.00)
    lagerhalle.set_lagerflaeche(356.0)

    print(gebaeude.get_daten())


main()
