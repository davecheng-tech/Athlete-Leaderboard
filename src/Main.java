/**
 * The Main class demonstrates object-oriented programming concepts
 * using the Athlete and Team classes.
 */
public class Main {

    /**
     * The entry point of the program.
     *
     * This method creates Athlete objects representing basketball players
     * from different countries, assigns them to country-based teams, and
     * prints each team's roster to the console.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create athletes
        Athlete lebron = new Athlete("James", "LeBron", "USA");
        Athlete curry = new Athlete("Curry", "Stephen", "USA");
        Athlete yao = new Athlete("Yao", "Ming", "CHN");
        Athlete lin = new Athlete("Lin", "Jeremy", "CHN");
        Athlete hachimura = new Athlete("Rui", "Hachimura", "JPN");
        Athlete watanabe = new Athlete("Watanabe", "Yuta", "JPN");

        // Create teams
        Team usaTeam = new Team("USA");
        usaTeam.addAthlete(lebron);
        usaTeam.addAthlete(curry);

        Team chinaTeam = new Team("CHN");
        chinaTeam.addAthlete(yao);
        chinaTeam.addAthlete(lin);

        Team japanTeam = new Team("JPN");
        japanTeam.addAthlete(hachimura);
        japanTeam.addAthlete(watanabe);

        // Print team rosters
        printTeamRoster(usaTeam);
        printTeamRoster(chinaTeam);
        printTeamRoster(japanTeam);
    }

    /**
     * Prints the roster of the specified team to the console.
     *
     * Each athlete's formatted name is printed on a separate line,
     * preceded by a dash.
     *
     * @param team the team whose roster should be printed
     */
    private static void printTeamRoster(Team team) {
        System.out.printf("Team %s Roster:%n", team.getCountryCode());
        for (String name : team.getAthleteNames()) {
            System.out.println(" - " + name);
        }
        System.out.println();
    }
}