package Freiburg20240610;

import java.util.*;

public class BeispielArrayZufallzahlen {
    public static void main(String[] args) {
        int anzahlElemente = 20;
        int[] feld = new int[anzahlElemente];
        for (int i = 0; i < anzahlElemente; i++) {
            // (int) wandelt in einen ganzzahligen Wert um und schneidet Nachkommastellen weg
            feld[i] = (int)(Math.random() * 100); // Zufallszahl wird mit random erzeugt
            System.out.println(feld[i]);
        }
        System.out.println();
        System.out.println((feld[3]));

        feld[3] = 3;
        System.out.println((feld[3]));
        System.out.println((feld[3]));
    }
}
