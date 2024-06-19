package Freiburg20240610;

import java.util.*;

public class beispielExceptionHandling {
    public static void main(String[] args) {
        // Bereich, in dem nach Exceptions (Ausnahmefehlern) gesucht wird
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Geben Sie eine ganze Zahl ein: ");
            int zahl = input.nextInt();
            System.out.println("Sie haben die Zahl: " + zahl + " eingegeben.");
        } catch(Exception ex) { // catch wird ausgeführt, wenn eine Exception auftritt
            System.out.println("Fehler aufgetreten: " + ex);
        } finally { // finally wird immer durchlaufen - mit und ohne Ausnahmefehler
            System.out.println("Das Programm wird beendet.");
        }
    }
}
