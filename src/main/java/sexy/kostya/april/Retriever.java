package sexy.kostya.april;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

/**
 * Created by k.shandurenko on 26/03/2019
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Retriever {

    /**
     * Name of the producer to which all remote procedure calls from current interface will be sent to.
     * @return producer's name.
     */
    String producer() default "";

    /**
     * Time value for maximal time you can wait for remote procedure call's result retrieve.
     * @return time value.
     */
    long timeout() default 1;

    /**
     * Time unit for timeout time value.
     * @return time unit.
     */
    TimeUnit timeoutTimeUnit() default TimeUnit.SECONDS;

    /**
     * Whether all remote procedure calls must be executed on a randomly selected single instance of Data Producer.
     * @return true/false.
     */
    boolean sameProducerNodeBetweenCalls() default false;

}
