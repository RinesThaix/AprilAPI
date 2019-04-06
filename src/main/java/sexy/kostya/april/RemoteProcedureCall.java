package sexy.kostya.april;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Allows you to override producer's name for annotated method execution or
 * not to set it in @Retriever annotation at all.
 *
 * Created by k.shandurenko on 06/04/2019
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RemoteProcedureCall {

    String producer();

}
