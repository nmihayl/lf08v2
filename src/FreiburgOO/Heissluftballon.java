package FreiburgOO;

public class Heissluftballon extends Luftfahrzeug {
    private double ballonVolumen;
    private double korbhoehe;

    public Heissluftballon() {
        this.ballonVolumen = 0.0;
        this.korbhoehe = 0.0;
    }

    public double getBallonVolumen() { return this.ballonVolumen; }
    public void setBallonVolumen(int ballonVolumen) { this.ballonVolumen = ballonVolumen; }
    public double getKorbhoehe() { return this.korbhoehe; }
    public void setKorbhoehe(double korbhoehe) { this.korbhoehe = korbhoehe; }

}