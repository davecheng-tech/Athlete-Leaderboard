public class Athlete {
    private final String lastName;
    private final String firstName;
    private final String countryCode;

    public Athlete(String lastName, String firstName, String countryCode) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return countryCode;
    }

    public String getName() {
        // List of IOC country codes where names are displayed last-name first
        switch (countryCode) {
            case "CHN":
            case "JPN":
            case "KOR":
            case "VNM":
            case "HKG":
                return lastName.toUpperCase() + " " + firstName; // Last name first
            default:
                return firstName + " " + lastName.toUpperCase(); // Default: First name first
        }
    }
}
