package z2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: z2.a  reason: case insensitive filesystem */
public @interface C1043a {
    boolean deserialize() default true;

    boolean serialize() default true;
}
