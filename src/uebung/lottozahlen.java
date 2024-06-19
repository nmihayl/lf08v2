package uebung;

import java.util.Arrays;

public class lottozahlen {

    public static void main(String[] args) {
        int[] gewinnZahlen = new int[6];
        for (int i = 0; i < 6; i++) {
            gewinnZahlen[i] = (int)(Math.random()* 49)+1; ;
        }
        System.out.println("Die Gewinnzahlen sind " + Arrays.toString(gewinnZahlen));
    }
}