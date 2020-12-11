import java.util.ArrayList;

public class Sportbewerbe {

    public static void main(String[] args) {

        ArrayList<Team> teams = new ArrayList<>();
        ArrayList<Sportler> sportlers = new ArrayList<>();

        Sportler sp = new F1Fahrer(1, "Manuel", "Gmeiner", "AT", 100000);
        Sportler sp2 = new Radfahrer(2, "Arbi", "Saidov", "RU", 100, 4);
        Sportler sp3 = new Fußballspieler(3, "Johann", "Gruber", "BG", 1000000);
        Sportler sp4 = new F1Fahrer(4, "James", "Gong", "AT", 500000);
        Sportler sp5 = new Radfahrer(5, "Julian", "Help", "AT", 103, 6);
        Sportler sp6 = new Fußballspieler(6, "Johann", "Gruber", "BG", 600000);
        Sportler sp7 = new F1Fahrer(4, "James", "Gong", "AT", 500000);
        Sportler sp8 = new Radfahrer(5, "Julian", "Help", "AT", 103, 6);
        Sportler sp9 = new Fußballspieler(6, "Johann", "Gruber", "BG", 600000);

        Team t1 = new Radteam("RadlerWös", true, sportlers, 3);
        Team t2 = new Formel1Team("Formel1Schwitzer", false, sportlers, 3);
        Team t3 = new Fußballteam("FC Wels", true, sportlers, "Welser ST");

        teams.add(t1);
        teams.add(t2);
        teams.add(t3);

        sportlers.add(sp);
        sportlers.add(sp2);
        sportlers.add(sp3);
        sportlers.add(sp4);
        sportlers.add(sp5);
        sportlers.add(sp6);
        sportlers.add(sp7);
        sportlers.add(sp8);
        sportlers.add(sp9);

        System.out.println("Teams Ausgabe");
        System.out.println(t1.toString());
        System.out.println("");
        System.out.println(t2.toString());
        System.out.println("");
        System.out.println(t3.toString());

    }
}
