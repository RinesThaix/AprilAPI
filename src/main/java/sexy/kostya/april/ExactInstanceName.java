package sexy.kostya.april;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Whether you have a method for which you want to select the exact instance of Data Producer
 * on which Remote procedure will be executed, you can use that annotation.
 * The value of it is a Node name of Data Producer instance.
 * Can be present only once in method signature.
 *
 * Created by k.shandurenko on 28/03/2019
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExactInstanceName {}
