package I3;

import v3.l;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f1567a = new F("CONDITION_FALSE");

    public static final Object a() {
        return f1567a;
    }

    public static final q b(Object obj) {
        q qVar;
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null && (qVar = zVar.f1588a) != null) {
            return qVar;
        }
        l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (q) obj;
    }
}
