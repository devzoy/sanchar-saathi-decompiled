package I3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v3.l;
import w.b;

/* renamed from: I3.e  reason: case insensitive filesystem */
public abstract class C0276e {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1547e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1548f;
    private volatile Object _next;
    private volatile Object _prev;

    static {
        Class<C0276e> cls = C0276e.class;
        Class<Object> cls2 = Object.class;
        f1547e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f1548f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
    }

    public C0276e(C0276e eVar) {
        this._prev = eVar;
    }

    public final void b() {
        f1548f.lazySet(this, (Object) null);
    }

    public final C0276e c() {
        C0276e g4 = g();
        while (g4 != null && g4.h()) {
            g4 = (C0276e) f1548f.get(g4);
        }
        return g4;
    }

    public final C0276e d() {
        C0276e e4;
        C0276e e5 = e();
        l.b(e5);
        while (e5.h() && (e4 = e5.e()) != null) {
            e5 = e4;
        }
        return e5;
    }

    public final C0276e e() {
        Object a4 = f();
        if (a4 == C0275d.f1546a) {
            return null;
        }
        return (C0276e) a4;
    }

    public final Object f() {
        return f1547e.get(this);
    }

    public final C0276e g() {
        return (C0276e) f1548f.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return b.a(f1547e, this, (Object) null, C0275d.f1546a);
    }

    public final void k() {
        Object obj;
        if (!i()) {
            while (true) {
                C0276e c4 = c();
                C0276e d4 = d();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1548f;
                do {
                    obj = atomicReferenceFieldUpdater.get(d4);
                } while (!b.a(atomicReferenceFieldUpdater, d4, obj, ((C0276e) obj) == null ? null : c4));
                if (c4 != null) {
                    f1547e.set(c4, d4);
                }
                if ((!d4.h() || d4.i()) && (c4 == null || !c4.h())) {
                    return;
                }
            }
        }
    }

    public final boolean l(C0276e eVar) {
        return b.a(f1547e, this, (Object) null, eVar);
    }
}
