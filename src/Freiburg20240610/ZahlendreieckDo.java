package Freiburg20240610;

public class ZahlendreieckDo {

    public static void main(String[] args) {
        int z = 11;
        String ausgabe = "";

        do {
            // ausgabe += z + " ";
            ausgabe = ausgabe + z + " "; // ausgabe = ausgabe + z + " "
            System.out.println(ausgabe);
            z++; // z = z + 1 oder z += 1
        } while (z<10);
    }
}
