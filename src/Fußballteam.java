import java.util.ArrayList;

public class Fußballteam extends Team {

    private String stadionName;

    public Fußballteam(String name, boolean natTeam, ArrayList<Sportler> teamMitglieder, String stadionName) {
        super(name, natTeam, teamMitglieder);
        setStadionName(stadionName);
    }

    public void setStadionName(String stadionName) {
        this.stadionName = stadionName;
    }

    public String getStadionName() {
        return stadionName;
    }
}
