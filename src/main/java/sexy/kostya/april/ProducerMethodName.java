package sexy.kostya.april;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Initially, interface method will generate Remote procedure call to the
 * method of Data Producer with exactly the same name.
 * This annotation allows you to specify another method to be executed on Data Producer side.
 * Keep in mind, that you can create methods with ListenableFuture<T> return type and
 * future (in any case) suffix that will be truncated not to use this annotation.
 *
 * Created by k.shandurenko on 03/04/2019
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ProducerMethodName {

    /**
     * Name of the method on producer side that must be executed as an invocation
     * of marked remote procedure call.
     * @return method name on producer side.
     */
    String name();

}
