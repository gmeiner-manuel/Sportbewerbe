import java.util.ArrayList;

public class Team {

    private String name;
    private boolean natTeam;
    private ArrayList<Sportler> teamMitglieder = new ArrayList<>();

    public Team(String name, boolean natTeam, ArrayList<Sportler> teamMitglieder) {
        setName(name);
        setNatTeam(natTeam);
        setTeamMitglieder(teamMitglieder);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNatTeam() {
        return natTeam;
    }

    public void setNatTeam(boolean natTeam) {
        this.natTeam = natTeam;
    }

    public ArrayList<Sportler> getTeamMitglieder() {
        return teamMitglieder;
    }

    public void setTeamMitglieder(ArrayList<Sportler> teamMitglieder) {
        this.teamMitglieder = teamMitglieder;
    }

    public void addSportler(Sportler s) {

        for (Sportler sportler:teamMitglieder) {
            teamMitglieder.add(s);
        }
    }

    public void remSportler(Sportler s) {

        for (Sportler sportler:teamMitglieder) {
            teamMitglieder.remove(s);
        }
    }

    public double berechneMarktwert() {

        return 0;
    }
}
