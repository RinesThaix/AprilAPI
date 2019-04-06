package sexy.kostya.april;

/**
 * Main point of April API access.
 * Is not related to Distributors in any way.
 * Created by k.shandurenko on 27/03/2019
 */
public final class April {

    private static volatile AprilInstance INSTANCE;

    /**
     * Get implementation of AprilInstance.
     * @return implementation of AprilInstance.
     */
    public static synchronized AprilInstance getInstance() {
        return INSTANCE;
    }

    /**
     * Set up implementation of AprilInstance.
     * @param instance implementation of AprilInstance. As for AprilOriginal, instantiate AprilInstanceImpl
     *                 and pass it as an argument.
     */
    public static synchronized void setInstance(AprilInstance instance) {
        April.INSTANCE = instance;
    }
}
