package Freiburg20240610;

import javax.swing.JOptionPane;

public class Kreistest {
    public static void main(String[] args) {
        // Eingabe
        String kreisradius, einheit;
        double r;

        kreisradius = JOptionPane.showInputDialog("Geben Sie den Kreisradius ein: ");
        r = Double.parseDouble(kreisradius);

        einheit = JOptionPane.showInputDialog("Geben Sie die Maßeinheit ein: ");

        // Verarbeitung
        // Den Konstruktor anwenden
        Kreis k = new Kreis(r);

        // Verarbeitung und Ausgabe
        System.out.println("Kreisradius: " + k.getRadius() + " " + einheit);
        System.out.println("Kreisumfang: " + k.getUmfang() + " " + einheit);
        System.out.println("Kreisfläche: " + k.getFlaeche() + " " + einheit + '\u00b2');

    }
}
