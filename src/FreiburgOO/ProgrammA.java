package FreiburgOO;

public class ProgrammA {
    public static void main(String[] args) {
        Luftfahrzeug beispielLuftfahrzeug = new Luftfahrzeug();
        beispielLuftfahrzeug.setBezeichnung("A310");
        beispielLuftfahrzeug.setGewicht(71840);
        beispielLuftfahrzeug.setBaujahr(1995);

        // Ausgabe
        System.out.println(beispielLuftfahrzeug.getDaten());
    }
}
