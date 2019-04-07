package sexy.kostya.april;

import java.util.concurrent.TimeUnit;

/**
 * Object for declaring time
 * @author PROgrammer_JARvis
 */
public @interface Time {

    /**
     * Period of time in specified units.
     * @return period of time in specified units
     */
    long value();

    /**
     * Units in which the time is measured.
     * @return units in which the time is measured
     */
    TimeUnit units() default TimeUnit.MILLISECONDS;
}
