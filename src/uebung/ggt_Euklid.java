package uebung;

public class ggt_Euklid {
    public static void main(String[] args) {
        int m = 3, n = 2, r = 5;

        System.out.println("m = " + m + ", n = " + n);

        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }

        System.out.println("n = " + n);

    }
}
