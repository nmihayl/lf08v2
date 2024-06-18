package Freiburg20240610;

import java.util.*;

public class ifBeispiel {

    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("Geben Sie eine Zahl ein: ");
           float zahl = input.nextFloat();
           if (zahl >= 10.0 && zahl <= 20.0) {
               System.out.println("Die Zahl " + zahl + " liegt zwischen 10 und 20");
           } else {
               System.out.println("Die eingegebene Zahl " + zahl + " liegt außerhalb des Wertebereichs.");
           }
           input.close();
    }

}
