package FreiburgGui;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Program {
    public static void main(String[] args) {
        try{
            JFrame mainFrame = new JFrame(); // neues Objekt erstellen
            mainFrame.setTitle("Das erste Java Fenster"); // Fenster Titel
            mainFrame.setSize(800, 400); // Fenstergroesse
            mainFrame.setLocation(1280, 500); // Fenster Position
            mainFrame.setVisible(true); // Sichtbarkeit festlegen

            JButton btnBeenden = new JButton("Beenden");
            btnBeenden.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e){
                   System.exit(0);
               }
            });
            btnBeenden.setBounds(300,200,100,25);
            mainFrame.getContentPane().add(btnBeenden);
            mainFrame.setVisible(true);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
