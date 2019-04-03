package sexy.kostya.april;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * If your method is of void return type, you can mark it with that annotation to make it execute on
 * call on all instances of Data Producers with producer name of your Data Retriever.
 * Without this annotation, method will be executed only on a single instance of
 * such a Data Producer (if there are any).
 *
 * Created by k.shandurenko on 28/03/2019
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AllInstancesMethod {}
