package uebung;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class Collatzfolge {
    public static void main(String[] args) {
        ArrayList<Integer> ungeradeZahlen = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

        int auswahl = 0;

        auswahl = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie eine Zahl ein: "));

        int iterations = 5;
        int iterationCount = 0;

        while (iterationCount < iterations) {
            if (ungeradeZahlen.contains(auswahl)) {
                auswahl = (auswahl * 3) + 1;
            } else {
                auswahl = auswahl / 2;
            }
            iterationCount = iterationCount + 1;
            System.out.println("Iteration #" + iterationCount);
            System.out.println("Result: " + auswahl);
            System.out.println();
        }
    }
}
