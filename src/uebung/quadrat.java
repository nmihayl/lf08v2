package uebung;

import java.util.Scanner;

public class quadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl der Seitenlänge = ");
        int sideLength = scanner.nextInt();

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == 0 || i == sideLength - 1 || j == 0 || j == sideLength - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
