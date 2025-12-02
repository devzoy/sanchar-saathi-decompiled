package I3;

import D3.A;
import D3.C0254l;
import D3.C0256m;
import D3.D;
import D3.F;
import D3.J0;
import D3.M;
import D3.T;
import D3.Z;
import h3.C0673n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l3.i;
import n3.e;
import v3.l;
import w.b;

/* renamed from: I3.j  reason: case insensitive filesystem */
public final class C0281j extends T implements e, l3.e {

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1552l = AtomicReferenceFieldUpdater.newUpdater(C0281j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: h  reason: collision with root package name */
    public final F f1553h;

    /* renamed from: i  reason: collision with root package name */
    public final l3.e f1554i;

    /* renamed from: j  reason: collision with root package name */
    public Object f1555j = C0282k.f1557a;

    /* renamed from: k  reason: collision with root package name */
    public final Object f1556k = J.b(a());

    public C0281j(F f4, l3.e eVar) {
        super(-1);
        this.f1553h = f4;
        this.f1554i = eVar;
    }

    public i a() {
        return this.f1554i.a();
    }

    public void c(Object obj, Throwable th) {
        if (obj instanceof A) {
            ((A) obj).f773b.i(th);
        }
    }

    public l3.e d() {
        return this;
    }

    public Object h() {
        Object obj = this.f1555j;
        this.f1555j = C0282k.f1557a;
        return obj;
    }

    public final void i() {
        do {
        } while (f1552l.get(this) == C0282k.f1558b);
    }

    public final C0256m j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1552l;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f1552l.set(this, C0282k.f1558b);
                return null;
            } else if (obj instanceof C0256m) {
                if (b.a(f1552l, this, obj, C0282k.f1558b)) {
                    return (C0256m) obj;
                }
            } else if (obj != C0282k.f1558b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final C0256m k() {
        Object obj = f1552l.get(this);
        if (obj instanceof C0256m) {
            return (C0256m) obj;
        }
        return null;
    }

    public e l() {
        l3.e eVar = this.f1554i;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public final boolean m() {
        return f1552l.get(this) != null;
    }

    public final boolean n(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1552l;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            F f4 = C0282k.f1558b;
            if (l.a(obj, f4)) {
                if (b.a(f1552l, this, f4, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (b.a(f1552l, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public final void o() {
        i();
        C0256m k4 = k();
        if (k4 != null) {
            k4.p();
        }
    }

    public final Throwable p(C0254l lVar) {
        F f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1552l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            f4 = C0282k.f1558b;
            if (obj != f4) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (b.a(f1552l, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
        } while (!b.a(f1552l, this, f4, lVar));
        return null;
    }

    public void q(Object obj) {
        i a4;
        Object c4;
        i a5 = this.f1554i.a();
        Object d4 = D.d(obj, (u3.l) null, 1, (Object) null);
        if (this.f1553h.L(a5)) {
            this.f1555j = d4;
            this.f801g = 0;
            this.f1553h.K(a5, this);
            return;
        }
        Z b4 = J0.f784a.b();
        if (b4.U()) {
            this.f1555j = d4;
            this.f801g = 0;
            b4.Q(this);
            return;
        }
        b4.S(true);
        try {
            a4 = a();
            c4 = J.c(a4, this.f1556k);
            this.f1554i.q(obj);
            C0673n nVar = C0673n.f9639a;
            J.a(a4, c4);
            do {
            } while (b4.X());
        } catch (Throwable th) {
            b4.N(true);
            throw th;
        }
        b4.N(true);
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f1553h + ", " + M.c(this.f1554i) + ']';
    }
}
