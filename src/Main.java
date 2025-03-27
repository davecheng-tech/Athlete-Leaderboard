import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Athlete> players = new ArrayList<>();

        players.add(new Athlete("James", "LeBron", "USA"));
        players.add(new Athlete("Curry", "Stephen", "USA"));
        players.add(new Athlete("Doncic", "Luka", "SLO"));
        players.add(new Athlete("Antetokounmpo", "Giannis", "GRE"));
        players.add(new Athlete("Yao", "Ming", "CHN"));
        players.add(new Athlete("Rui", "Hachimura", "JPN"));
        players.add(new Athlete("Ha", "Seung-Jin", "KOR"));
        players.add(new Athlete("Nguyen", "Van Hung", "VNM"));
        players.add(new Athlete("Gasol", "Pau", "ESP"));
        players.add(new Athlete("Nash", "Steve", "CAN"));

        for (Athlete a : players) {
            System.out.printf("%s (%s)%n", a.getName(), a.getCountry());
        }
    }
}