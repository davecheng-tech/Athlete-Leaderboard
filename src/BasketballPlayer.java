/**
 * Subclass of Athlete for basketball.
 * 
 * Example: "#23 LeBron JAMES (Forward)"
 * 
 * @author
 */
public class BasketballPlayer extends Athlete {
    private final int jerseyNumber;
    private final String position;

    /**
     * Constructs a BasketballPlayer.
     * 
     * @param lastName the player's last name
     * @param firstName the player's first name
     * @param countryCode the IOC country code (e.g. "USA")
     * @param jerseyNumber the player's jersey number
     * @param position the player's court position (e.g. "Guard", "Forward")
     */
    public BasketballPlayer(String lastName, String firstName, String countryCode, int jerseyNumber, String position) {
        super(lastName, firstName, countryCode);
        this.jerseyNumber = jerseyNumber;
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String getName() {
        return "#" + jerseyNumber + " " + super.getName() + " (" + position + ")";
    }
}