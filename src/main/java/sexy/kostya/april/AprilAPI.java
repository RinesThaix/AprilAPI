package sexy.kostya.april;

/**
 * Main point of April API access.
 * Is not related to Distributors in any way.
 * Created by k.shandurenko on 27/03/2019
 */
public final class AprilAPI {

    private static volatile April INSTANCE;

    /**
     * Get implementation of AprilInstance.
     * @return implementation of AprilInstance.
     */
    public static April getInstance() {
        return INSTANCE;
    }

    /**
     * Set up implementation of AprilInstance.
     * @param instance implementation of AprilInstance. As for AprilOriginal, instantiate AprilInstanceImpl
     *                 and pass it as an argument.
     */
    public static void setInstance(April instance) {
        AprilAPI.INSTANCE = instance;
    }
}
