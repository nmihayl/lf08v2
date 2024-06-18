package Freiburg20240610;

import java.util.Scanner;

public class BeispielEinUndAusgabe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie bitte ihren Namen ein: ");
        String name = input.nextLine();
        System.out.println("Geben Sie bitte ihr Alter ein: ");
        int alter = input.nextInt();
        System.out.println("Geben Sie bitte ihre Körpergröße ein: ");
        double groesse = input.nextDouble();
        System.out.println("Geben Sie bitte ihr Gewicht ein: ");
        double gewicht = input.nextDouble();

        // Ausgabe der Daten
        System.out.println("Sie heissen " + name + ", sind " + alter + " Jahre alt und sind " + groesse + " m groß und wiegen " + gewicht + " Kilogramm.");
        input.close();
    }

}
