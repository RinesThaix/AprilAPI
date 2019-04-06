package sexy.kostya.april;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * Allows you not to send Remote procedure calls across the network all the time you call a method.
 * Using that annotation, you can cache the result of method invocation with exactly
 * the same arguments for specified amount of time.
 *
 * Created by k.shandurenko on 28/03/2019
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cacheable {

    /**
     * Time for which data shall be cached.
     * @return time value.
     */
    Time time();

}
