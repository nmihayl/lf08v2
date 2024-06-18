package uebung;

import java.util.Scanner;

public class kapitalverdopplung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Startkapital: ");
        double sk = Double.parseDouble(input.nextLine());

        System.out.print("Zinssatz: ");
        double zs = Double.parseDouble(input.nextLine());

        int jahr = 0;

        double kapital = sk;

        while (kapital < 2 * sk) {
            kapital = kapital * (1 + zs/100);
            jahr = jahr + 1;
        }

        System.out.printf("Kapital: " + "%.2f", kapital);
        System.out.println(" Kapitalverdoppelung nach " + jahr + " Jahren.");
    }
}
