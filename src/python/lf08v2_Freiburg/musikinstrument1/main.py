from musikinstrument import MusikInstrument

instrument = MusikInstrument("PRS Custom 24 BW", "PRS")


def main():
    instrument.set_preis(3998.00)
    print(instrument.get_Daten())


main()  # Programm ausführen
