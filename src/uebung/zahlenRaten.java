package uebung;

import java.util.Random;
import java.util.Scanner;

public class zahlenRaten {
    public static void main(String[] args) {
        Random rand = new Random();
        int max = 200;
        int min = 1;
        int randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println("Debug: The correct number is " + randomNum);

        Scanner input = new Scanner(System.in);
        int guess = 0;

        while (guess != randomNum) {
            System.out.print("Guess between 1 and 200: ");
            guess = Integer.parseInt(input.nextLine());

            if (guess < randomNum) {
                System.out.println("Higher!");
            } else if (guess > randomNum) {
                System.out.println("Lower!");
            } else {
                System.out.println("You got it! The correct number is " + randomNum);
            }
        }

        input.close();
    }
}
