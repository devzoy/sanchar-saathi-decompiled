package D3;

import D3.p0;
import I3.p;
import I3.q;
import I3.y;
import h3.C0660a;
import h3.C0673n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l3.e;
import l3.i;
import m3.C0794b;
import m3.C0795c;
import n3.h;
import v3.g;
import v3.l;

public class w0 implements p0, C0265t, D0 {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f845e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f846f;
    private volatile Object _parentHandle;
    private volatile Object _state;

    public static final class a extends C0256m {

        /* renamed from: m  reason: collision with root package name */
        public final w0 f847m;

        public a(e eVar, w0 w0Var) {
            super(eVar, 1);
            this.f847m = w0Var;
        }

        public String H() {
            return "AwaitContinuation";
        }

        public Throwable t(p0 p0Var) {
            Throwable e4;
            Object k02 = this.f847m.k0();
            return (!(k02 instanceof c) || (e4 = ((c) k02).e()) == null) ? k02 instanceof C0271z ? ((C0271z) k02).f872a : p0Var.z() : e4;
        }
    }

    public static final class b extends v0 {

        /* renamed from: i  reason: collision with root package name */
        public final w0 f848i;

        /* renamed from: j  reason: collision with root package name */
        public final c f849j;

        /* renamed from: k  reason: collision with root package name */
        public final C0264s f850k;

        /* renamed from: l  reason: collision with root package name */
        public final Object f851l;

        public b(w0 w0Var, c cVar, C0264s sVar, Object obj) {
            this.f848i = w0Var;
            this.f849j = cVar;
            this.f850k = sVar;
            this.f851l = obj;
        }

        public /* bridge */ /* synthetic */ Object i(Object obj) {
            z((Throwable) obj);
            return C0673n.f9639a;
        }

        public void z(Throwable th) {
            this.f848i.a0(this.f849j, this.f850k, this.f851l);
        }
    }

    public static final class c implements C0253k0 {

        /* renamed from: f  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f852f;

        /* renamed from: g  reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f853g;

        /* renamed from: h  reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f854h;
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: e  reason: collision with root package name */
        public final A0 f855e;

        static {
            Class<c> cls = c.class;
            f852f = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting");
            Class<Object> cls2 = Object.class;
            f853g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause");
            f854h = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder");
        }

        public c(A0 a02, boolean z4, Throwable th) {
            this.f855e = a02;
            this._isCompleting = z4 ? 1 : 0;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable e4 = e();
            if (e4 == null) {
                m(th);
            } else if (th != e4) {
                Object d4 = d();
                if (d4 == null) {
                    l(th);
                } else if (d4 instanceof Throwable) {
                    if (th != d4) {
                        ArrayList c4 = c();
                        c4.add(d4);
                        c4.add(th);
                        l(c4);
                    }
                } else if (d4 instanceof ArrayList) {
                    ((ArrayList) d4).add(th);
                } else {
                    throw new IllegalStateException(("State is " + d4).toString());
                }
            }
        }

        public boolean b() {
            return e() == null;
        }

        public final ArrayList c() {
            return new ArrayList(4);
        }

        public final Object d() {
            return f854h.get(this);
        }

        public final Throwable e() {
            return (Throwable) f853g.get(this);
        }

        public final boolean f() {
            return e() != null;
        }

        public final boolean g() {
            return f852f.get(this) != 0;
        }

        public final boolean h() {
            return d() == x0.f862e;
        }

        public final List i(Throwable th) {
            ArrayList arrayList;
            Object d4 = d();
            if (d4 == null) {
                arrayList = c();
            } else if (d4 instanceof Throwable) {
                ArrayList c4 = c();
                c4.add(d4);
                arrayList = c4;
            } else if (d4 instanceof ArrayList) {
                arrayList = (ArrayList) d4;
            } else {
                throw new IllegalStateException(("State is " + d4).toString());
            }
            Throwable e4 = e();
            if (e4 != null) {
                arrayList.add(0, e4);
            }
            if (th != null && !l.a(th, e4)) {
                arrayList.add(th);
            }
            l(x0.f862e);
            return arrayList;
        }

        public A0 j() {
            return this.f855e;
        }

        public final void k(boolean z4) {
            f852f.set(this, z4 ? 1 : 0);
        }

        public final void l(Object obj) {
            f854h.set(this, obj);
        }

        public final void m(Throwable th) {
            f853g.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + j() + ']';
        }
    }

    public static final class d extends q.a {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ w0 f856d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f857e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(q qVar, w0 w0Var, Object obj) {
            super(qVar);
            this.f856d = w0Var;
            this.f857e = obj;
        }

        /* renamed from: f */
        public Object d(q qVar) {
            if (this.f856d.k0() == this.f857e) {
                return null;
            }
            return p.a();
        }
    }

    static {
        Class<w0> cls = w0.class;
        Class<Object> cls2 = Object.class;
        f845e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f846f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public w0(boolean z4) {
        this._state = z4 ? x0.f864g : x0.f863f;
    }

    public static /* synthetic */ CancellationException I0(w0 w0Var, Throwable th, String str, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                str = null;
            }
            return w0Var.H0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    public void A0() {
    }

    public i B(i.c cVar) {
        return p0.a.e(this, cVar);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [D3.j0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B0(D3.Y r3) {
        /*
            r2 = this;
            D3.A0 r0 = new D3.A0
            r0.<init>()
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            D3.j0 r1 = new D3.j0
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f845e
            w.b.a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.w0.B0(D3.Y):void");
    }

    public final void C0(v0 v0Var) {
        v0Var.n(new A0());
        w.b.a(f845e, this, v0Var, v0Var.s());
    }

    public final boolean D() {
        return !(k0() instanceof C0253k0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D0(D3.v0 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.k0()
            boolean r1 = r0 instanceof D3.v0
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f845e
            D3.Y r2 = D3.x0.f864g
            boolean r0 = w.b.a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof D3.C0253k0
            if (r1 == 0) goto L_0x0027
            D3.k0 r0 = (D3.C0253k0) r0
            D3.A0 r0 = r0.j()
            if (r0 == 0) goto L_0x0027
            r4.v()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.w0.D0(D3.v0):void");
    }

    public final void E0(r rVar) {
        f846f.set(this, rVar);
    }

    public final int F0(Object obj) {
        if (obj instanceof Y) {
            if (((Y) obj).b()) {
                return 0;
            }
            if (!w.b.a(f845e, this, obj, x0.f864g)) {
                return -1;
            }
            A0();
            return 1;
        } else if (!(obj instanceof C0251j0)) {
            return 0;
        } else {
            if (!w.b.a(f845e, this, obj, ((C0251j0) obj).j())) {
                return -1;
            }
            A0();
            return 1;
        }
    }

    public final String G0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof C0253k0 ? ((C0253k0) obj).b() ? "Active" : "New" : obj instanceof C0271z ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    public Object H(Object obj, u3.p pVar) {
        return p0.a.b(this, obj, pVar);
    }

    public final CancellationException H0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = X();
            }
            cancellationException = new q0(str, th, this);
        }
        return cancellationException;
    }

    public final String J0() {
        return u0() + '{' + G0(k0()) + '}';
    }

    public final boolean K0(C0253k0 k0Var, Object obj) {
        if (!w.b.a(f845e, this, k0Var, x0.g(obj))) {
            return false;
        }
        y0((Throwable) null);
        z0(obj);
        Z(k0Var, obj);
        return true;
    }

    public final boolean L0(C0253k0 k0Var, Throwable th) {
        A0 i02 = i0(k0Var);
        if (i02 == null) {
            return false;
        }
        if (!w.b.a(f845e, this, k0Var, new c(i02, false, th))) {
            return false;
        }
        w0(i02, th);
        return true;
    }

    public final Object M0(Object obj, Object obj2) {
        return !(obj instanceof C0253k0) ? x0.f858a : (((obj instanceof Y) || (obj instanceof v0)) && !(obj instanceof C0264s) && !(obj2 instanceof C0271z)) ? K0((C0253k0) obj, obj2) ? obj2 : x0.f860c : N0((C0253k0) obj, obj2);
    }

    public final boolean N(Object obj, A0 a02, v0 v0Var) {
        int y4;
        d dVar = new d(v0Var, this, obj);
        do {
            y4 = a02.t().y(v0Var, a02, dVar);
            if (y4 == 1) {
                return true;
            }
        } while (y4 != 2);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        if (r2 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0067, code lost:
        w0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006a, code lost:
        r7 = d0(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        if (r7 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0074, code lost:
        if (O0(r1, r7, r8) == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0078, code lost:
        return D3.x0.f859b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007d, code lost:
        return c0(r1, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object N0(D3.C0253k0 r7, java.lang.Object r8) {
        /*
            r6 = this;
            D3.A0 r0 = r6.i0(r7)
            if (r0 != 0) goto L_0x000b
            I3.F r7 = D3.x0.f860c
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof D3.w0.c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r7
            D3.w0$c r1 = (D3.w0.c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            D3.w0$c r1 = new D3.w0$c
            r1.<init>(r0, r3, r2)
        L_0x001d:
            v3.w r3 = new v3.w
            r3.<init>()
            monitor-enter(r1)
            boolean r4 = r1.g()     // Catch:{ all -> 0x002f }
            if (r4 == 0) goto L_0x0031
            I3.F r7 = D3.x0.f858a     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            return r7
        L_0x002f:
            r7 = move-exception
            goto L_0x007e
        L_0x0031:
            r4 = 1
            r1.k(r4)     // Catch:{ all -> 0x002f }
            if (r1 == r7) goto L_0x0045
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f845e     // Catch:{ all -> 0x002f }
            boolean r4 = w.b.a(r4, r6, r7, r1)     // Catch:{ all -> 0x002f }
            if (r4 != 0) goto L_0x0045
            I3.F r7 = D3.x0.f860c     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            return r7
        L_0x0045:
            boolean r4 = r1.f()     // Catch:{ all -> 0x002f }
            boolean r5 = r8 instanceof D3.C0271z     // Catch:{ all -> 0x002f }
            if (r5 == 0) goto L_0x0051
            r5 = r8
            D3.z r5 = (D3.C0271z) r5     // Catch:{ all -> 0x002f }
            goto L_0x0052
        L_0x0051:
            r5 = r2
        L_0x0052:
            if (r5 == 0) goto L_0x0059
            java.lang.Throwable r5 = r5.f872a     // Catch:{ all -> 0x002f }
            r1.a(r5)     // Catch:{ all -> 0x002f }
        L_0x0059:
            java.lang.Throwable r5 = r1.e()     // Catch:{ all -> 0x002f }
            if (r4 != 0) goto L_0x0060
            r2 = r5
        L_0x0060:
            r3.f12469e = r2     // Catch:{ all -> 0x002f }
            h3.n r3 = h3.C0673n.f9639a     // Catch:{ all -> 0x002f }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x006a
            r6.w0(r0, r2)
        L_0x006a:
            D3.s r7 = r6.d0(r7)
            if (r7 == 0) goto L_0x0079
            boolean r7 = r6.O0(r1, r7, r8)
            if (r7 == 0) goto L_0x0079
            I3.F r7 = D3.x0.f859b
            return r7
        L_0x0079:
            java.lang.Object r7 = r6.c0(r1, r8)
            return r7
        L_0x007e:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.w0.N0(D3.k0, java.lang.Object):java.lang.Object");
    }

    public final void O(Throwable th, List list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th2 = (Throwable) it.next();
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C0660a.a(th, th2);
                }
            }
        }
    }

    public final boolean O0(c cVar, C0264s sVar, Object obj) {
        while (p0.a.d(sVar.f842i, false, false, new b(this, cVar, sVar, obj), 1, (Object) null) == B0.f774e) {
            sVar = v0(sVar);
            if (sVar == null) {
                return false;
            }
        }
        return true;
    }

    public void P(Object obj) {
    }

    public final Object Q(e eVar) {
        Object k02;
        do {
            k02 = k0();
            if (!(k02 instanceof C0253k0)) {
                if (!(k02 instanceof C0271z)) {
                    return x0.h(k02);
                }
                throw ((C0271z) k02).f872a;
            }
        } while (F0(k02) < 0);
        return R(eVar);
    }

    public final Object R(e eVar) {
        a aVar = new a(C0794b.b(eVar), this);
        aVar.A();
        C0260o.a(aVar, j(new E0(aVar)));
        Object x4 = aVar.x();
        if (x4 == C0795c.c()) {
            h.c(eVar);
        }
        return x4;
    }

    public final boolean S(Throwable th) {
        return T(th);
    }

    public final boolean T(Object obj) {
        Object a4 = x0.f858a;
        if (h0() && (a4 = V(obj)) == x0.f859b) {
            return true;
        }
        if (a4 == x0.f858a) {
            a4 = q0(obj);
        }
        if (a4 == x0.f858a || a4 == x0.f859b) {
            return true;
        }
        if (a4 == x0.f861d) {
            return false;
        }
        P(a4);
        return true;
    }

    public void U(Throwable th) {
        T(th);
    }

    public final Object V(Object obj) {
        Object M02;
        do {
            Object k02 = k0();
            if (!(k02 instanceof C0253k0) || ((k02 instanceof c) && ((c) k02).g())) {
                return x0.f858a;
            }
            M02 = M0(k02, new C0271z(b0(obj), false, 2, (g) null));
        } while (M02 == x0.f860c);
        return M02;
    }

    public final boolean W(Throwable th) {
        if (p0()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        r j02 = j0();
        return (j02 == null || j02 == B0.f774e) ? z4 : j02.e(th) || z4;
    }

    public String X() {
        return "Job was cancelled";
    }

    public boolean Y(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return T(th) && g0();
    }

    public final void Z(C0253k0 k0Var, Object obj) {
        r j02 = j0();
        if (j02 != null) {
            j02.a();
            E0(B0.f774e);
        }
        Throwable th = null;
        C0271z zVar = obj instanceof C0271z ? (C0271z) obj : null;
        if (zVar != null) {
            th = zVar.f872a;
        }
        if (k0Var instanceof v0) {
            try {
                ((v0) k0Var).z(th);
            } catch (Throwable th2) {
                m0(new C("Exception in completion handler " + k0Var + " for " + this, th2));
            }
        } else {
            A0 j4 = k0Var.j();
            if (j4 != null) {
                x0(j4, th);
            }
        }
    }

    public final void a0(c cVar, C0264s sVar, Object obj) {
        C0264s v02 = v0(sVar);
        if (v02 == null || !O0(cVar, v02, obj)) {
            P(c0(cVar, obj));
        }
    }

    public boolean b() {
        Object k02 = k0();
        return (k02 instanceof C0253k0) && ((C0253k0) k02).b();
    }

    public final Throwable b0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new q0(X(), (Throwable) null, this) : th;
        }
        l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((D0) obj).x();
    }

    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new q0(X(), (Throwable) null, this);
        }
        U(cancellationException);
    }

    public final Object c0(c cVar, Object obj) {
        boolean f4;
        Throwable f02;
        C0271z zVar = obj instanceof C0271z ? (C0271z) obj : null;
        Throwable th = zVar != null ? zVar.f872a : null;
        synchronized (cVar) {
            f4 = cVar.f();
            List i4 = cVar.i(th);
            f02 = f0(cVar, i4);
            if (f02 != null) {
                O(f02, i4);
            }
        }
        if (!(f02 == null || f02 == th)) {
            obj = new C0271z(f02, false, 2, (g) null);
        }
        if (f02 != null && (W(f02) || l0(f02))) {
            l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C0271z) obj).b();
        }
        if (!f4) {
            y0(f02);
        }
        z0(obj);
        w.b.a(f845e, this, cVar, x0.g(obj));
        Z(cVar, obj);
        return obj;
    }

    public i.b d(i.c cVar) {
        return p0.a.c(this, cVar);
    }

    public final C0264s d0(C0253k0 k0Var) {
        C0264s sVar = k0Var instanceof C0264s ? (C0264s) k0Var : null;
        if (sVar != null) {
            return sVar;
        }
        A0 j4 = k0Var.j();
        if (j4 != null) {
            return v0(j4);
        }
        return null;
    }

    public final Throwable e0(Object obj) {
        C0271z zVar = obj instanceof C0271z ? (C0271z) obj : null;
        if (zVar != null) {
            return zVar.f872a;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable f0(D3.w0.c r4, java.util.List r5) {
        /*
            r3 = this;
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r4 = r4.f()
            if (r4 == 0) goto L_0x0017
            D3.q0 r4 = new D3.q0
            java.lang.String r5 = r3.X()
            r4.<init>(r5, r1, r3)
            return r4
        L_0x0017:
            return r1
        L_0x0018:
            r4 = r5
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x001f:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r4.next()
            r2 = r0
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r2 = r2 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto L_0x001f
            r1 = r0
        L_0x0031:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0036
            return r1
        L_0x0036:
            r4 = 0
            java.lang.Object r4 = r5.get(r4)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.w0.f0(D3.w0$c, java.util.List):java.lang.Throwable");
    }

    public final r g(C0265t tVar) {
        W d4 = p0.a.d(this, true, false, new C0264s(tVar), 2, (Object) null);
        l.c(d4, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r) d4;
    }

    public boolean g0() {
        return true;
    }

    public final i.c getKey() {
        return p0.f838b;
    }

    public p0 getParent() {
        r j02 = j0();
        if (j02 != null) {
            return j02.getParent();
        }
        return null;
    }

    public i h(i iVar) {
        return p0.a.f(this, iVar);
    }

    public boolean h0() {
        return false;
    }

    public final boolean i() {
        int F02;
        do {
            F02 = F0(k0());
            if (F02 == 0) {
                return false;
            }
        } while (F02 != 1);
        return true;
    }

    public final A0 i0(C0253k0 k0Var) {
        A0 j4 = k0Var.j();
        if (j4 != null) {
            return j4;
        }
        if (k0Var instanceof Y) {
            return new A0();
        }
        if (k0Var instanceof v0) {
            C0((v0) k0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + k0Var).toString());
    }

    public final W j(u3.l lVar) {
        return w(false, true, lVar);
    }

    public final r j0() {
        return (r) f846f.get(this);
    }

    public final Object k0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f845e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y)) {
                return obj;
            }
            ((y) obj).a(this);
        }
    }

    public boolean l0(Throwable th) {
        return false;
    }

    public void m0(Throwable th) {
        throw th;
    }

    public final void n0(p0 p0Var) {
        if (p0Var == null) {
            E0(B0.f774e);
            return;
        }
        p0Var.i();
        r g4 = p0Var.g(this);
        E0(g4);
        if (D()) {
            g4.a();
            E0(B0.f774e);
        }
    }

    public final boolean o0() {
        Object k02 = k0();
        return (k02 instanceof C0271z) || ((k02 instanceof c) && ((c) k02).f());
    }

    public boolean p0() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        w0(((D3.w0.c) r2).j(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return D3.x0.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object q0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.k0()
            boolean r3 = r2 instanceof D3.w0.c
            if (r3 == 0) goto L_0x0050
            monitor-enter(r2)
            r3 = r2
            D3.w0$c r3 = (D3.w0.c) r3     // Catch:{ all -> 0x001a }
            boolean r3 = r3.h()     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x001c
            I3.F r7 = D3.x0.f861d     // Catch:{ all -> 0x001a }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r7 = move-exception
            goto L_0x004e
        L_0x001c:
            r3 = r2
            D3.w0$c r3 = (D3.w0.c) r3     // Catch:{ all -> 0x001a }
            boolean r3 = r3.f()     // Catch:{ all -> 0x001a }
            if (r7 != 0) goto L_0x0027
            if (r3 != 0) goto L_0x0033
        L_0x0027:
            if (r1 != 0) goto L_0x002d
            java.lang.Throwable r1 = r6.b0(r7)     // Catch:{ all -> 0x001a }
        L_0x002d:
            r7 = r2
            D3.w0$c r7 = (D3.w0.c) r7     // Catch:{ all -> 0x001a }
            r7.a(r1)     // Catch:{ all -> 0x001a }
        L_0x0033:
            r7 = r2
            D3.w0$c r7 = (D3.w0.c) r7     // Catch:{ all -> 0x001a }
            java.lang.Throwable r7 = r7.e()     // Catch:{ all -> 0x001a }
            if (r3 != 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            D3.w0$c r2 = (D3.w0.c) r2
            D3.A0 r7 = r2.j()
            r6.w0(r7, r0)
        L_0x0049:
            I3.F r7 = D3.x0.f858a
            return r7
        L_0x004e:
            monitor-exit(r2)
            throw r7
        L_0x0050:
            boolean r3 = r2 instanceof D3.C0253k0
            if (r3 == 0) goto L_0x00a1
            if (r1 != 0) goto L_0x005a
            java.lang.Throwable r1 = r6.b0(r7)
        L_0x005a:
            r3 = r2
            D3.k0 r3 = (D3.C0253k0) r3
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x006e
            boolean r2 = r6.L0(r3, r1)
            if (r2 == 0) goto L_0x0002
            I3.F r7 = D3.x0.f858a
            return r7
        L_0x006e:
            D3.z r3 = new D3.z
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.M0(r2, r3)
            I3.F r4 = D3.x0.f858a
            if (r3 == r4) goto L_0x0086
            I3.F r2 = D3.x0.f860c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0086:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a1:
            I3.F r7 = D3.x0.f861d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.w0.q0(java.lang.Object):java.lang.Object");
    }

    public final boolean r0(Object obj) {
        Object M02;
        do {
            M02 = M0(k0(), obj);
            if (M02 == x0.f858a) {
                return false;
            }
            if (M02 == x0.f859b) {
                return true;
            }
        } while (M02 == x0.f860c);
        P(M02);
        return true;
    }

    public final Object s0(Object obj) {
        Object M02;
        do {
            M02 = M0(k0(), obj);
            if (M02 == x0.f858a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, e0(obj));
            }
        } while (M02 == x0.f860c);
        return M02;
    }

    public final v0 t0(u3.l lVar, boolean z4) {
        v0 v0Var = null;
        if (z4) {
            if (lVar instanceof r0) {
                v0Var = (r0) lVar;
            }
            if (v0Var == null) {
                v0Var = new C0259n0(lVar);
            }
        } else {
            if (lVar instanceof v0) {
                v0Var = (v0) lVar;
            }
            if (v0Var == null) {
                v0Var = new C0261o0(lVar);
            }
        }
        v0Var.B(this);
        return v0Var;
    }

    public String toString() {
        return J0() + '@' + M.b(this);
    }

    public String u0() {
        return M.a(this);
    }

    public final C0264s v0(q qVar) {
        while (qVar.u()) {
            qVar = qVar.t();
        }
        while (true) {
            qVar = qVar.s();
            if (!qVar.u()) {
                if (qVar instanceof C0264s) {
                    return (C0264s) qVar;
                }
                if (qVar instanceof A0) {
                    return null;
                }
            }
        }
    }

    public final W w(boolean z4, boolean z5, u3.l lVar) {
        v0 t02 = t0(lVar, z4);
        while (true) {
            Object k02 = k0();
            if (k02 instanceof Y) {
                Y y4 = (Y) k02;
                if (!y4.b()) {
                    B0(y4);
                } else if (w.b.a(f845e, this, k02, t02)) {
                    return t02;
                }
            } else {
                Throwable th = null;
                if (k02 instanceof C0253k0) {
                    A0 j4 = ((C0253k0) k02).j();
                    if (j4 == null) {
                        l.c(k02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        C0((v0) k02);
                    } else {
                        W w4 = B0.f774e;
                        if (z4 && (k02 instanceof c)) {
                            synchronized (k02) {
                                try {
                                    th = ((c) k02).e();
                                    if (th != null) {
                                        if ((lVar instanceof C0264s) && !((c) k02).g()) {
                                        }
                                        C0673n nVar = C0673n.f9639a;
                                    }
                                    if (N(k02, j4, t02)) {
                                        if (th == null) {
                                            return t02;
                                        }
                                        w4 = t02;
                                        C0673n nVar2 = C0673n.f9639a;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        if (th != null) {
                            if (z5) {
                                lVar.i(th);
                            }
                            return w4;
                        } else if (N(k02, j4, t02)) {
                            return t02;
                        }
                    }
                } else {
                    if (z5) {
                        C0271z zVar = k02 instanceof C0271z ? (C0271z) k02 : null;
                        if (zVar != null) {
                            th = zVar.f872a;
                        }
                        lVar.i(th);
                    }
                    return B0.f774e;
                }
            }
        }
    }

    public final void w0(A0 a02, Throwable th) {
        y0(th);
        Object r4 = a02.r();
        l.c(r4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C c4 = null;
        for (q qVar = (q) r4; !l.a(qVar, a02); qVar = qVar.s()) {
            if (qVar instanceof r0) {
                v0 v0Var = (v0) qVar;
                try {
                    v0Var.z(th);
                } catch (Throwable th2) {
                    if (c4 != null) {
                        C0660a.a(c4, th2);
                    } else {
                        c4 = new C("Exception in completion handler " + v0Var + " for " + this, th2);
                        C0673n nVar = C0673n.f9639a;
                    }
                }
            }
        }
        if (c4 != null) {
            m0(c4);
        }
        W(th);
    }

    public CancellationException x() {
        Throwable th;
        Object k02 = k0();
        CancellationException cancellationException = null;
        if (k02 instanceof c) {
            th = ((c) k02).e();
        } else if (k02 instanceof C0271z) {
            th = ((C0271z) k02).f872a;
        } else if (!(k02 instanceof C0253k0)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + k02).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new q0("Parent job is " + G0(k02), th, this);
    }

    public final void x0(A0 a02, Throwable th) {
        Object r4 = a02.r();
        l.c(r4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C c4 = null;
        for (q qVar = (q) r4; !l.a(qVar, a02); qVar = qVar.s()) {
            if (qVar instanceof v0) {
                v0 v0Var = (v0) qVar;
                try {
                    v0Var.z(th);
                } catch (Throwable th2) {
                    if (c4 != null) {
                        C0660a.a(c4, th2);
                    } else {
                        c4 = new C("Exception in completion handler " + v0Var + " for " + this, th2);
                        C0673n nVar = C0673n.f9639a;
                    }
                }
            }
        }
        if (c4 != null) {
            m0(c4);
        }
    }

    public final void y(D0 d02) {
        T(d02);
    }

    public void y0(Throwable th) {
    }

    public final CancellationException z() {
        Object k02 = k0();
        if (k02 instanceof c) {
            Throwable e4 = ((c) k02).e();
            if (e4 != null) {
                CancellationException H02 = H0(e4, M.a(this) + " is cancelling");
                if (H02 != null) {
                    return H02;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (k02 instanceof C0253k0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (k02 instanceof C0271z) {
            return I0(this, ((C0271z) k02).f872a, (String) null, 1, (Object) null);
        } else {
            return new q0(M.a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    public void z0(Object obj) {
    }
}
