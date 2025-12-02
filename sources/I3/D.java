package I3;

import v3.l;

public abstract class D {
    public static Object a(Object obj) {
        return obj;
    }

    public static final C b(Object obj) {
        if (obj != C0275d.f1546a) {
            l.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (C) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean c(Object obj) {
        return obj == C0275d.f1546a;
    }
}
