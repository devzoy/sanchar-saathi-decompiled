package I3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w.b;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1573a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur");
    private volatile Object _cur;

    public r(boolean z4) {
        this._cur = new s(8, z4);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1573a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            int a4 = sVar.a(obj);
            if (a4 == 0) {
                return true;
            }
            if (a4 == 1) {
                b.a(f1573a, this, sVar, sVar.i());
            } else if (a4 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1573a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (!sVar.d()) {
                b.a(f1573a, this, sVar, sVar.i());
            } else {
                return;
            }
        }
    }

    public final int c() {
        return ((s) f1573a.get(this)).f();
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1573a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            Object j4 = sVar.j();
            if (j4 != s.f1577h) {
                return j4;
            }
            b.a(f1573a, this, sVar, sVar.i());
        }
    }
}
