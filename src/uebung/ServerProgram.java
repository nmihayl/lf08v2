package uebung;

public class ServerProgram {
    public static void main(String[] args) {
        Server test = new Server();
        test.setName("Test Server");
        test.setHauptspeicher(64);
        test.setPreis(499);

        // Ausgabe
        System.out.println(test.getDaten());
    }
}
