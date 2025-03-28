import java.util.ArrayList;
import java.util.List;

/**
 * The Team class represents a team of athletes from the same country.
 * It demonstrates a HAS-A relationship: a Team HAS-A list of Athlete objects.
 * 
 * All athletes on a team must be from the same country.
 * 
 * This class is mutable: athletes can be added after creation.
 * 
 * @author 
 */
public class Team {
    private final String countryCode;
    private final List<Athlete> members;

    /**
     * Constructs a Team for a specific country.
     *
     * @param countryCode the IOC country code (e.g. "USA", "CHN")
     */
    public Team(String countryCode) {
        this.countryCode = countryCode;
        this.members = new ArrayList<>();
    }

    /**
     * Adds an athlete to the team if they match the team's country.
     *
     * @param athlete the Athlete to add
     * @throws IllegalArgumentException if athlete's country doesn't match the team
     */
    public void addAthlete(Athlete athlete) {
        if (!athlete.getCountry().equals(countryCode)) {
            throw new IllegalArgumentException("Athlete country does not match team country.");
        }
        members.add(athlete);
    }

    /**
     * Returns a formatted list of athlete names on this team.
     *
     * @return a list of names
     */
    public List<String> getAthleteNames() {
        List<String> names = new ArrayList<>();
        for (Athlete a : members) {
            names.add(a.getName());
        }
        return names;
    }

    /**
     * Returns the IOC country code of the team.
     *
     * @return the country code
     */
    public String getCountryCode() {
        return countryCode;
    }
}