package sexy.kostya.april;

/**
 * Main point of April API access.
 * Is not related to Distributors in any way.
 * Created by k.shandurenko on 27/03/2019
 */
public final class AprilAPI {

    private static volatile April INSTANCE;

    /**
     * Get implementation of {@link April}.
     * @return implementation of {@link April}.
     */
    public static April getInstance() {
        return INSTANCE;
    }

    /**
     * Set up implementation of {@link April}.
     * @param instance implementation of {@link April}. As for AprilOriginal, instantiate AprilImpl
     *                 and pass it as an argument.
     */
    public static void setInstance(April instance) {
        AprilAPI.INSTANCE = instance;
    }
}
