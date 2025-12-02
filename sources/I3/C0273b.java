package I3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w.b;

/* renamed from: I3.b  reason: case insensitive filesystem */
public abstract class C0273b extends y {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1544a = AtomicReferenceFieldUpdater.newUpdater(C0273b.class, Object.class, "_consensus");
    private volatile Object _consensus = C0272a.f1543a;

    public final Object a(Object obj) {
        Object obj2 = f1544a.get(this);
        if (obj2 == C0272a.f1543a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1544a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = C0272a.f1543a;
        return obj2 != obj3 ? obj2 : b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public abstract Object d(Object obj);
}
