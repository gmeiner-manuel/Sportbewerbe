import java.util.ArrayList;

public class Formel1Team extends Team {

    private double budget;

    public Formel1Team(String name, boolean natTeam, ArrayList<Sportler> teamMitglieder, double budget) {
        super(name, natTeam, teamMitglieder);
        setBudget(budget);
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
