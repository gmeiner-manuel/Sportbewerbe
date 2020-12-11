import java.util.ArrayList;

public class Radteam extends Team {

    private int anzFahrer;

    public Radteam(String name, boolean natTeam, ArrayList<Sportler> teamMitglieder, int anzFahrer) {
        super(name, natTeam, teamMitglieder);
        setAnzFahrer(anzFahrer);
    }

    public void setAnzFahrer(int anzFahrer) {
        this.anzFahrer = anzFahrer;
    }

    public int getAnzFahrer() {
        return anzFahrer;
    }
}
