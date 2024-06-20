package uebung;

public class matrix {
    public static void main(String[] args) {
        int zahl = 4;
        System.out.println();
        System.out.println("Matrix");
        for (int zeile =0; zeile < 10; zeile++) {
            for (int spalte=0; spalte < 10; spalte++) {
                if (zeile == 4 || spalte == 4 || (zeile * 10 + spalte)%zahl == 0) {
                    System.out.print(" **");
                } else {
                    System.out.print(" " + zeile + spalte);
                }
            }
            System.out.println();
        }
    }
}
