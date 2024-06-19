package uebung;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;

public class vokal {
    public static void main(String[] args) {
        ArrayList<String> vokale = new ArrayList<>(Arrays.asList(
                "a", "e", "i", "o", "u",
                "ä", "ö", "ü",
                "A", "E", "I", "O", "U",
                "Ä", "Ö", "U"
        ));
        String zeichen = "";

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
