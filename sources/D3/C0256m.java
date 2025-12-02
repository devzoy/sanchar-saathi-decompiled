package D3;

import D3.p0;
import I3.C;
import I3.C0281j;
import I3.F;
import h3.C0662c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l3.i;
import m3.C0795c;
import n3.e;
import u3.l;
import v3.g;
import w.b;

/* renamed from: D3.m  reason: case insensitive filesystem */
public class C0256m extends T implements C0254l, e, N0 {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f827j;

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f828k;

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f829l;
    private volatile int _decisionAndIndex = 536870911;
    private volatile Object _parentHandle;
    private volatile Object _state = C0238d.f815e;

    /* renamed from: h  reason: collision with root package name */
    public final l3.e f830h;

    /* renamed from: i  reason: collision with root package name */
    public final i f831i;

    static {
        Class<C0256m> cls = C0256m.class;
        f827j = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex");
        Class<Object> cls2 = Object.class;
        f828k = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f829l = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public C0256m(l3.e eVar, int i4) {
        super(i4);
        this.f830h = eVar;
        this.f831i = eVar.a();
    }

    public static /* synthetic */ void O(C0256m mVar, Object obj, int i4, l lVar, int i5, Object obj2) {
        if (obj2 == null) {
            if ((i5 & 4) != 0) {
                lVar = null;
            }
            mVar.N(obj, i4, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    public void A() {
        W B4 = B();
        if (B4 != null && D()) {
            B4.a();
            f829l.set(this, B0.f774e);
        }
    }

    public final W B() {
        p0 p0Var = (p0) a().d(p0.f838b);
        if (p0Var == null) {
            return null;
        }
        W d4 = p0.a.d(p0Var, true, false, new C0263q(this), 2, (Object) null);
        b.a(f829l, this, (Object) null, d4);
        return d4;
    }

    public final void C(Object obj) {
        Object obj2 = obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f828k;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof C0238d)) {
                if (obj3 instanceof C0250j ? true : obj3 instanceof C) {
                    G(obj2, obj3);
                } else if (obj3 instanceof C0271z) {
                    C0271z zVar = (C0271z) obj3;
                    if (!zVar.b()) {
                        G(obj2, obj3);
                    }
                    if (obj3 instanceof C0262p) {
                        Throwable th = null;
                        if (!(obj3 instanceof C0271z)) {
                            zVar = null;
                        }
                        if (zVar != null) {
                            th = zVar.f872a;
                        }
                        if (obj2 instanceof C0250j) {
                            j((C0250j) obj2, th);
                            return;
                        }
                        v3.l.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        m((C) obj2, th);
                        return;
                    }
                    return;
                } else if (obj3 instanceof C0270y) {
                    C0270y yVar = (C0270y) obj3;
                    if (yVar.f866b != null) {
                        G(obj2, obj3);
                    }
                    if (!(obj2 instanceof C)) {
                        v3.l.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        C0250j jVar = (C0250j) obj2;
                        if (yVar.c()) {
                            j(jVar, yVar.f869e);
                            return;
                        } else {
                            if (b.a(f828k, this, obj3, C0270y.b(yVar, (Object) null, jVar, (l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                } else if (!(obj2 instanceof C)) {
                    v3.l.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (b.a(f828k, this, obj3, new C0270y(obj3, (C0250j) obj2, (l) null, (Object) null, (Throwable) null, 28, (g) null))) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (b.a(f828k, this, obj3, obj2)) {
                return;
            }
        }
    }

    public boolean D() {
        return !(y() instanceof C0);
    }

    public final boolean E() {
        if (U.c(this.f801g)) {
            l3.e eVar = this.f830h;
            v3.l.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C0281j) eVar).m()) {
                return true;
            }
        }
        return false;
    }

    public final C0250j F(l lVar) {
        return lVar instanceof C0250j ? (C0250j) lVar : new C0257m0(lVar);
    }

    public final void G(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String H() {
        return "CancellableContinuation";
    }

    public void I(l lVar) {
        C(F(lVar));
    }

    public final void J(Throwable th) {
        if (!o(th)) {
            n(th);
            r();
        }
    }

    public void K(Object obj) {
        s(this.f801g);
    }

    public final void L() {
        Throwable p4;
        l3.e eVar = this.f830h;
        C0281j jVar = eVar instanceof C0281j ? (C0281j) eVar : null;
        if (jVar != null && (p4 = jVar.p(this)) != null) {
            p();
            n(p4);
        }
    }

    public final boolean M() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f828k;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (!(obj instanceof C0270y) || ((C0270y) obj).f868d == null) {
            f827j.set(this, 536870911);
            atomicReferenceFieldUpdater.set(this, C0238d.f815e);
            return true;
        }
        p();
        return false;
    }

    public final void N(Object obj, int i4, l lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f828k;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0) {
            } else {
                if (obj2 instanceof C0262p) {
                    C0262p pVar = (C0262p) obj2;
                    if (pVar.c()) {
                        if (lVar != null) {
                            k(lVar, pVar.f872a);
                            return;
                        }
                        return;
                    }
                }
                i(obj);
                throw new C0662c();
            }
        } while (!b.a(f828k, this, obj2, P((C0) obj2, obj, i4, lVar, (Object) null)));
        r();
        s(i4);
    }

    public final Object P(C0 c02, Object obj, int i4, l lVar, Object obj2) {
        if (obj instanceof C0271z) {
            return obj;
        }
        if (!U.b(i4) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(c02 instanceof C0250j) && obj2 == null) {
            return obj;
        }
        return new C0270y(obj, c02 instanceof C0250j ? (C0250j) c02 : null, lVar, obj2, (Throwable) null, 16, (g) null);
    }

    public final boolean Q() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f827j;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f827j.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
        return true;
    }

    public final F R(Object obj, Object obj2, l lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f828k;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof C0) {
            } else if (!(obj3 instanceof C0270y) || obj2 == null || ((C0270y) obj3).f868d != obj2) {
                return null;
            } else {
                return C0258n.f833a;
            }
        } while (!b.a(f828k, this, obj3, P((C0) obj3, obj, this.f801g, lVar, obj2)));
        r();
        return C0258n.f833a;
    }

    public final boolean S() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f827j;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f827j.compareAndSet(this, i4, 536870912 + (536870911 & i4)));
        return true;
    }

    public i a() {
        return this.f831i;
    }

    public void b(C c4, int i4) {
        int i5;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f827j;
        do {
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, ((i5 >> 29) << 29) + i4));
        C(c4);
    }

    public void c(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f828k;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0) {
                throw new IllegalStateException("Not completed");
            } else if (!(obj2 instanceof C0271z)) {
                if (obj2 instanceof C0270y) {
                    C0270y yVar = (C0270y) obj2;
                    if (!yVar.c()) {
                        Throwable th2 = th;
                        if (b.a(f828k, this, obj2, C0270y.b(yVar, (Object) null, (C0250j) null, (l) null, (Object) null, th, 15, (Object) null))) {
                            yVar.d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once");
                    }
                } else {
                    Throwable th3 = th;
                    if (b.a(f828k, this, obj2, new C0270y(obj2, (C0250j) null, (l) null, (Object) null, th, 14, (g) null))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final l3.e d() {
        return this.f830h;
    }

    public Throwable e(Object obj) {
        Throwable e4 = super.e(obj);
        if (e4 != null) {
            return e4;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj instanceof C0270y ? ((C0270y) obj).f865a : obj;
    }

    public Object h() {
        return y();
    }

    public final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void j(C0250j jVar, Throwable th) {
        try {
            jVar.a(th);
        } catch (Throwable th2) {
            i a4 = a();
            H.a(a4, new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(l lVar, Throwable th) {
        try {
            lVar.i(th);
        } catch (Throwable th2) {
            i a4 = a();
            H.a(a4, new C("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public e l() {
        l3.e eVar = this.f830h;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public final void m(C c4, Throwable th) {
        int i4 = f827j.get(this) & 536870911;
        if (i4 != 536870911) {
            try {
                c4.o(i4, th, a());
            } catch (Throwable th2) {
                i a4 = a();
                H.a(a4, new C("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
    }

    public boolean n(Throwable th) {
        Object obj;
        boolean z4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f828k;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z4 = false;
            if (!(obj instanceof C0)) {
                return false;
            }
            if ((obj instanceof C0250j) || (obj instanceof C)) {
                z4 = true;
            }
        } while (!b.a(f828k, this, obj, new C0262p(this, th, z4)));
        C0 c02 = (C0) obj;
        if (c02 instanceof C0250j) {
            j((C0250j) obj, th);
        } else if (c02 instanceof C) {
            m((C) obj, th);
        }
        r();
        s(this.f801g);
        return true;
    }

    public final boolean o(Throwable th) {
        if (!E()) {
            return false;
        }
        l3.e eVar = this.f830h;
        v3.l.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C0281j) eVar).n(th);
    }

    public final void p() {
        W w4 = w();
        if (w4 != null) {
            w4.a();
            f829l.set(this, B0.f774e);
        }
    }

    public void q(Object obj) {
        O(this, D.b(obj, this), this.f801g, (l) null, 4, (Object) null);
    }

    public final void r() {
        if (!E()) {
            p();
        }
    }

    public final void s(int i4) {
        if (!Q()) {
            U.a(this, i4);
        }
    }

    public Throwable t(p0 p0Var) {
        return p0Var.z();
    }

    public String toString() {
        return H() + '(' + M.c(this.f830h) + "){" + z() + "}@" + M.b(this);
    }

    public Object u(Object obj, Object obj2, l lVar) {
        return R(obj, obj2, lVar);
    }

    public void v(Object obj, l lVar) {
        N(obj, this.f801g, lVar);
    }

    public final W w() {
        return (W) f829l.get(this);
    }

    public final Object x() {
        p0 p0Var;
        boolean E4 = E();
        if (S()) {
            if (w() == null) {
                B();
            }
            if (E4) {
                L();
            }
            return C0795c.c();
        }
        if (E4) {
            L();
        }
        Object y4 = y();
        if (y4 instanceof C0271z) {
            throw ((C0271z) y4).f872a;
        } else if (!U.b(this.f801g) || (p0Var = (p0) a().d(p0.f838b)) == null || p0Var.b()) {
            return f(y4);
        } else {
            CancellationException z4 = p0Var.z();
            c(y4, z4);
            throw z4;
        }
    }

    public final Object y() {
        return f828k.get(this);
    }

    public final String z() {
        Object y4 = y();
        return y4 instanceof C0 ? "Active" : y4 instanceof C0262p ? "Cancelled" : "Completed";
    }
}
