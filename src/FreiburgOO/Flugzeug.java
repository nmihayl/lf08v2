package FreiburgOO;

public class Flugzeug extends Luftfahrzeug {
    // Attribute
    private double spannweite;
    private int motorenAnzahl;

    // Konstruktor
    public Flugzeug() {
        this.spannweite = 0.0;
        this.motorenAnzahl = 0;
    }

    // Getter und Setter
    public double getSpannweite() {
        return this.spannweite;
    }

    public void setSpannweite(double spannweite) {
        this.spannweite = spannweite;
    }

    public int getMotorenAnzahl() {
        return this.motorenAnzahl;
    }

    public void setMotorenAnzahl(int motorenAnzahl) {
        this.motorenAnzahl = motorenAnzahl;
    }

    // weitere Methode
    public String getDaten() {
        String daten = "Spannweite: " + this.spannweite + "\n" + "Anzahl Motoren: " + this.motorenAnzahl;
        return daten;
    }
}
