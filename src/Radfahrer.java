public class Radfahrer extends Sportler {

    private int watt;
    private int anzSiege;

    public Radfahrer(int id, String vorname, String nachname, String nat, int watt, int anzSiege) {
        super(id, vorname, nachname, nat);
        setAnzSiege(anzSiege);
        setWatt(watt);
    }

    public int getWatt() {
        return watt;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public int getAnzSiege() {
        return anzSiege;
    }

    public void setAnzSiege(int anzSiege) {
        this.anzSiege = anzSiege;
    }

    @Override
    public String toString() {
        return "Radfahrer{" +
                "watt=" + watt +
                ", anzSiege=" + anzSiege +
                '}';
    }
}
