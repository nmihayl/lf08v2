package Freiburg20240610;

import java.util.Scanner;

public class BeispielEinUndAusgabe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie bitte ihren Namen ein: ");
        String name = input.nextLine();
        System.out.println("Hallo " + name + "!");
    }

}
