package uebung;

public class Server {

    // Attribute
    protected String name;
    protected double preis;
    protected int hauptspeicher;

    // Konstruktor
    public Server() {
        this.name = name;
        this.preis = preis;
        this.hauptspeicher = hauptspeicher;
    }

    // Getter und Setter
    public void setDaten(String name) {
        this.name = name;
    }

    public double getPreis() {
        return this.preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getHauptspeicher() {
        return this.hauptspeicher;
    }

    public void setHauptspeicher(int hauptspeicher) {
        this.hauptspeicher = hauptspeicher;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // weitere Methode
    public String getDaten() {
        String daten = "Name: " + name + "\nPreis: " + preis + "\nHauptspeicher: " + hauptspeicher;
        return daten;
    }

}
