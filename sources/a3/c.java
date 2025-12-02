package A3;

import v3.l;

public abstract class c {
    public static final Object a(b bVar, Object obj) {
        l.e(bVar, "<this>");
        if (bVar.b(obj)) {
            l.c(obj, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
            return obj;
        }
        throw new ClassCastException("Value cannot be cast to " + bVar.a());
    }
}
