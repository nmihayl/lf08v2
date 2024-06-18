package Freiburg20240610;

public class Kreis {
    double radius;

    // Konstruktoren erzeugen
    Kreis() {
        radius = 0;
    }

    Kreis(double r) {
        radius = r;
    }

    // Getter und Setter Methoden einrichten
    double getRadius() {
        return radius;
    }

    void setRadius(double r) {
        radius = r;
    }

    double getUmfang() {
        return 2 * Math.PI * radius;
    }

    double getFlaeche() {
        return Math.PI * radius * radius;
    }

    void setUmfang(double u) {
        radius = u / (2 * Math.PI);
    }

    void setFlaeche(double f) {
        radius = Math.sqrt(f/Math.PI);
    }

}
