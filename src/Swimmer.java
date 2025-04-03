/**
 * Subclass for swimmers. 
 *
 * Example: "LEDECKY Katie [Freestyle - 3:56.46]"
 * 
 * Overrides getName() to include stroke and personal best time.
 * 
 * @author
 */
public class Swimmer extends Athlete {
    private final String stroke;
    private final String bestTime;

    /**
     * Constructs a Swimmer.
     * 
     * @param lastName the swimmer's last name
     * @param firstName the swimmer's first name
     * @param countryCode the IOC country code (e.g. "USA")
     * @param stroke the swimmer's specialty stroke (e.g. "Freestyle")
     * @param bestTime the swimmer's best time (e.g. "3:56.46")
     */
    public Swimmer(String lastName, String firstName, String countryCode, String stroke, String bestTime) {
        super(lastName, firstName, countryCode);
        this.stroke = stroke;
        this.bestTime = bestTime;
    }

    public String getStroke() {
        return stroke;
    }

    public String getBestTime() {
        return bestTime;
    }

    @Override
    public String getName() {
        return super.getName() + " (" + stroke + " - " + bestTime + ")";
    }
}