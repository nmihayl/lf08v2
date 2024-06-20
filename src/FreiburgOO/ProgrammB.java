package FreiburgOO;

public class ProgrammB {
    public static void main(String[] args) {
        System.out.println("Beispielflugzeug");
        Flugzeug f = new Flugzeug();
        Luftfahrzeug beispielFlugzeug = new Luftfahrzeug();
        f.setBezeichnung("A310");
        f.setGewicht(71840);
        f.setBaujahr(1995);
        f.setSpannweite(43.90);
        f.setMotorenAnzahl(2);

        // Ausgabe
        System.out.println(f.getDaten());
        System.out.println(" ");

        Luftfahrzeug beispielLuftfahrzeug = new Luftfahrzeug();
        beispielLuftfahrzeug.setBezeichnung("A310");
        beispielLuftfahrzeug.setGewicht(71840);
        beispielLuftfahrzeug.setBaujahr(1995);

        // Ausgabe
        System.out.println(beispielLuftfahrzeug.getDaten());

        System.out.println("Beispielheissluftballon");
        Heissluftballon b = new Heissluftballon();
        b.setBezeichnung("Ultra Magic");
        b.setGewicht(478.5);
        b.setBaujahr(2018);
        b.setBallonVolumen(4000);
        b.setKorbhoehe(1.10);

        // Ausgabe
        System.out.println(b.getDaten());
    }
}
