package Freiburg20240610;

public class ZahlendreieckWhile {

    public static void main(String[] args) {
        int z = 0;
        String ausgabe = "";

        while (z < 10) {
            // ausgabe += z + " ";
            ausgabe = ausgabe + z + " "; // ausgabe = ausgabe + z + " "
            System.out.println(ausgabe);
            z++; // z = z + 1 oder z += 1
        }

        System.out.println("String " + (2+3));
        System.out.println();
    }
}
