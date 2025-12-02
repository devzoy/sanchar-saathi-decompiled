package z2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface b {
    boolean nullSafe() default true;

    Class value();
}
