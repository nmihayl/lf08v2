package uebung;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class vokal {
    public static void main(String[] args) {
        ArrayList<String> vokale = new ArrayList<>();
        String zeichen = "";

        vokale.add("a");
        vokale.add("e");
        vokale.add("o");
        vokale.add("u");
        vokale.add("i");
        vokale.add("ä");
        vokale.add("ö");
        vokale.add("ü");

        zeichen = JOptionPane.showInputDialog("Geben Sie ein Zeichen ein: ");

        if (zeichen != null && zeichen.length() == 1) {
            if (vokale.contains(zeichen)) {
                JOptionPane.showMessageDialog(null, "Das Zeichen ist ein Vokal.");
            } else {
                JOptionPane.showMessageDialog(null, "Das Zeichen ist kein Vokal.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Bitte geben Sie nur ein einzelnes Zeichen ein.");
        }
    }
}
