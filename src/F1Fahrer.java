public class F1Fahrer extends Sportler {

    private double jahresGehalt;

    public F1Fahrer(int id, String vorname, String nachname, String nat, double jahresGehalt) {
        super(id, vorname, nachname, nat);
        setJahresGehalt(jahresGehalt);
    }

    public double getJahresGehalt() {
        return jahresGehalt;
    }

    public void setJahresGehalt(double jahresGehalt) {
        this.jahresGehalt = jahresGehalt;
    }

    @Override
    public String toString() {
        return "F1Fahrer{" +
                "jahresGehalt=" + jahresGehalt +
                '}';
    }
}
