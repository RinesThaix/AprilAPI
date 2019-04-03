package sexy.kostya.april;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * Can be used only on synchronous methods.
 * Whether execution of Remote procedure call ended up with a timeout or
 * could not find an executor (Data Producer with required producer's name),
 * will retry for given amount of times sleeping between them by given amount of time.
 * If after all it didn't succeed, throws exception anyways.
 *
 * Created by k.shandurenko on 03/04/2019
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Retriable {

    /**
     * Amount of retries.
     * @return amount of retries.
     */
    int retries() default 3;

    /**
     * Time value of sleeping between retries.
     * @return time value.
     */
    long timeBetweenRetries() default 500;

    /**
     * Time unit for time value of sleeping between retries.
     * @return time unit.
     */
    TimeUnit timeUnit() default TimeUnit.MILLISECONDS;

}
