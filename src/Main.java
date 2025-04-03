/**
 * The Main class demonstrates object-oriented programming concepts using
 * Athlete, BasketballPlayer, Swimmer, and Team classes.
 */
public class Main {

    /**
     * The entry point of the program.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // USA Basketball Players
        BasketballPlayer lebron = new BasketballPlayer("James", "LeBron", "USA", 6, "Forward");
        BasketballPlayer steph = new BasketballPlayer("Curry", "Stephen", "USA", 30, "Guard");
        BasketballPlayer kd = new BasketballPlayer("Durant", "Kevin", "USA", 7, "Forward");

        // USA Swimmers
        Swimmer ledecky = new Swimmer("Ledecky", "Katie", "USA", "Freestyle", "3:56.46");
        Swimmer dressel = new Swimmer("Dressel", "Caeleb", "USA", "Butterfly", "49.45");

        // CHN Basketball Players
        BasketballPlayer yao = new BasketballPlayer("Yao", "Ming", "CHN", 11, "Center");
        BasketballPlayer zhouQi = new BasketballPlayer("Zhou", "Qi", "CHN", 15, "Center");
        BasketballPlayer wangZhelin = new BasketballPlayer("Wang", "Zhelin", "CHN", 31, "Center");

        // CHN Swimmers
        Swimmer sunYang = new Swimmer("Sun", "Yang", "CHN", "Freestyle", "3:40.14");
        Swimmer yeShiwen = new Swimmer("Ye", "Shiwen", "CHN", "Medley", "4:28.43");

        // Create USA team
        Team usaTeam = new Team("USA");
        usaTeam.addAthlete(lebron);
        usaTeam.addAthlete(steph);
        usaTeam.addAthlete(kd);
        usaTeam.addAthlete(ledecky);
        usaTeam.addAthlete(dressel);

        // Create CHN team
        Team chinaTeam = new Team("CHN");
        chinaTeam.addAthlete(yao);
        chinaTeam.addAthlete(zhouQi);
        chinaTeam.addAthlete(wangZhelin);
        chinaTeam.addAthlete(sunYang);
        chinaTeam.addAthlete(yeShiwen);

        // Print rosters
        System.out.println("=== USA Team Roster ===");
        printTeamRoster(usaTeam);

        System.out.println("=== CHN Team Roster ===");
        printTeamRoster(chinaTeam);
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