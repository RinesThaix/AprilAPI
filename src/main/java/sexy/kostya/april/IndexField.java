package sexy.kostya.april;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Can be used multiple times in method signature.
 * Creates an index using all marked arguments that will be used by Distributors
 * to select Data Producer on which Remote procedures will be executed.
 * In other words, allows you to force Remote procedures execution with same
 * indexed fields on same Data Producer instances.
 *
 * Created by k.shandurenko on 27/03/2019
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface IndexField {}
