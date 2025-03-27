/**
 * The Athlete class represents an athlete with a first name, last name,
 * and an IOC country code. It provides functionality to return the athlete's
 * name formatted according to the conventions of their country.
 * 
 * For specific countries (CHN, JPN, KOR, VNM, HKG), the last name is displayed first.
 * In all other cases, the first name is displayed first.
 * The last name is always shown in uppercase for emphasis.
 * 
 * Example:
 * - CHN athlete: "YAO Ming"
 * - USA athlete: "LeBron JAMES"
 * 
 * This class is immutable.
 * 
 * @author 
 */
public class Athlete {
    private final String lastName;
    private final String firstName;
    private final String countryCode;

    /**
     * Constructs an Athlete with the given last name, first name, and IOC country code.
     *
     * @param lastName the athlete's last name
     * @param firstName the athlete's first name
     * @param countryCode the athlete's IOC country code (e.g. "USA", "CHN")
     */
    public Athlete(String lastName, String firstName, String countryCode) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.countryCode = countryCode;
    }

    /**
     * Returns the IOC country code of the athlete.
     *
     * @return the country code (e.g. "USA", "CHN")
     */
    public String getCountry() {
        return countryCode;
    }

    /**
     * Returns the full name of the athlete, formatted according to naming conventions
     * of the athlete's country.
     * <p>
     * Countries using last-name-first format: CHN, JPN, KOR, VNM, HKG.
     * All other countries use first-name-first format.
     * The last name is always displayed in uppercase.
     *
     * @return the formatted full name of the athlete
     */
    public String getName() {
        switch (countryCode) {
            case "CHN":
            case "JPN":
            case "KOR":
            case "VNM":
            case "HKG":
                return lastName.toUpperCase() + " " + firstName;
            default:
                return firstName + " " + lastName.toUpperCase();
        }
    }
}