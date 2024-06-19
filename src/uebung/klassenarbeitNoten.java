package uebung;

import java.util.*;

public class klassenarbeitNoten {
    public static void main(String[] args) {
        try {
            notenAuswerten();
        } catch(Exception ex) {
            System.out.println("Es ist ein Fehler aufgetreten: " + ex);
        } finally {
            System.out.println("Das Program wird beendet.");
        }
    }

    public static void notenAuswerten() {
        Scanner input = new Scanner(System.in);
        System.out.println("Wie viele Noten werden eingegeben?");
        int anzahl = input.nextInt();
        int[] noten = new int[anzahl];
        int[] anzahlProNote = new int[6];
        double summe = 0.0;
        for(int i = 0; i < anzahl; i++) {
            System.out.println("Geben Sie bitte die " + (i+1) + ". Note ein.");
            noten[i] = input.nextInt();
            switch(noten[i]) {
                case 1:
                    anzahlProNote[0]++;
                case 2:
                    anzahlProNote[1]++;
                case 3:
                    anzahlProNote[2]++;
                case 4:
                    anzahlProNote[3]++;
                case 5:
                    anzahlProNote[4]++;
                case 6:
                    anzahlProNote[5]++;
                    break;
                default:
                    break;
            }
            summe += noten[i];
        }

        double durchschnitt = summe / anzahl;

        System.out.println("In der Klassenarbeit wurden " + anzahlProNote[0] + " Einsen geschrieben.");
        System.out.println("In der Klassenarbeit wurden " + anzahlProNote[1] + " Zweien geschrieben.");
        System.out.println("In der Klassenarbeit wurden " + anzahlProNote[2] + " Dreien geschrieben.");
        System.out.println("In der Klassenarbeit wurden " + anzahlProNote[3] + " Vieren geschrieben.");
        System.out.println("In der Klassenarbeit wurden " + anzahlProNote[4] + " Fünfen geschrieben.");
        System.out.println("In der Klassenarbeit wurden " + anzahlProNote[5] + " Sechsen geschrieben.");
        System.out.println("Der Notendurchschnitt liegt bei: " + durchschnitt);
    }


}