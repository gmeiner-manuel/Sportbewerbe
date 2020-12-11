public class Sportler {

    private String vorname;
    private String nachname;
    private int id;
    private String nat;

    public Sportler(int id, String vorname, String nachname, String nat) {
        setId(id);
        setNachname(nachname);
        setVorname(vorname);
        setNat(nat);
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    @Override
    public String toString() {
        return "Sportler{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", id=" + id +
                ", nat='" + nat + '\'' +
                '}';
    }
}
