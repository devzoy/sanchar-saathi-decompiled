package F3;

import D3.C0254l;
import D3.C0256m;
import D3.C0260o;
import D3.N0;
import I3.C;
import I3.C0275d;
import I3.C0276e;
import I3.C0283l;
import I3.D;
import I3.E;
import I3.F;
import I3.O;
import I3.x;
import h3.C0660a;
import h3.C0667h;
import h3.C0668i;
import h3.C0673n;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l3.e;
import m3.C0794b;
import m3.C0795c;
import n3.h;
import u3.l;
import u3.p;
import u3.q;
import v3.g;
import v3.m;
import v3.z;

public class b implements d {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1037h;

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1038i;

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1039j;

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1040k;

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1041l;

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1042m;

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1043n;

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1044o;

    /* renamed from: p  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1045p;
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: e  reason: collision with root package name */
    public final int f1046e;

    /* renamed from: f  reason: collision with root package name */
    public final l f1047f;

    /* renamed from: g  reason: collision with root package name */
    public final q f1048g;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public final class a implements f, N0 {

        /* renamed from: e  reason: collision with root package name */
        public Object f1049e = c.f1070p;

        /* renamed from: f  reason: collision with root package name */
        public C0256m f1050f;

        public a() {
        }

        public Object a(e eVar) {
            j jVar;
            b bVar = b.this;
            j jVar2 = (j) b.f1042m.get(bVar);
            while (!bVar.V()) {
                long andIncrement = b.f1038i.getAndIncrement(bVar);
                int i4 = c.f1056b;
                long j4 = andIncrement / ((long) i4);
                int i5 = (int) (andIncrement % ((long) i4));
                if (jVar2.f1526g != j4) {
                    j a4 = bVar.H(j4, jVar2);
                    if (a4 == null) {
                        continue;
                    } else {
                        jVar = a4;
                    }
                } else {
                    jVar = jVar2;
                }
                Object q4 = bVar.A0(jVar, i5, andIncrement, (Object) null);
                if (q4 == c.f1067m) {
                    throw new IllegalStateException("unreachable");
                } else if (q4 == c.f1069o) {
                    if (andIncrement < bVar.O()) {
                        jVar.b();
                    }
                    jVar2 = jVar;
                } else if (q4 == c.f1068n) {
                    return f(jVar, i5, andIncrement, eVar);
                } else {
                    jVar.b();
                    this.f1049e = q4;
                    return n3.b.a(true);
                }
            }
            return n3.b.a(g());
        }

        public void b(C c4, int i4) {
            C0256m mVar = this.f1050f;
            if (mVar != null) {
                mVar.b(c4, i4);
            }
        }

        public final Object f(j jVar, int i4, long j4, e eVar) {
            Boolean a4;
            b bVar = b.this;
            C0256m b4 = C0260o.b(C0794b.b(eVar));
            try {
                this.f1050f = b4;
                Object q4 = bVar.A0(jVar, i4, j4, this);
                if (q4 == c.f1067m) {
                    bVar.l0(this, jVar, i4);
                } else {
                    l lVar = null;
                    if (q4 == c.f1069o) {
                        if (j4 < bVar.O()) {
                            jVar.b();
                        }
                        j jVar2 = (j) b.f1042m.get(bVar);
                        while (true) {
                            if (bVar.V()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f1038i.getAndIncrement(bVar);
                            int i5 = c.f1056b;
                            long j5 = andIncrement / ((long) i5);
                            int i6 = (int) (andIncrement % ((long) i5));
                            if (jVar2.f1526g != j5) {
                                j a5 = bVar.H(j5, jVar2);
                                if (a5 != null) {
                                    jVar2 = a5;
                                }
                            }
                            Object q5 = bVar.A0(jVar2, i6, andIncrement, this);
                            if (q5 == c.f1067m) {
                                bVar.l0(this, jVar2, i6);
                                break;
                            } else if (q5 == c.f1069o) {
                                if (andIncrement < bVar.O()) {
                                    jVar2.b();
                                }
                            } else if (q5 != c.f1068n) {
                                jVar2.b();
                                this.f1049e = q5;
                                this.f1050f = null;
                                a4 = n3.b.a(true);
                                l lVar2 = bVar.f1047f;
                                if (lVar2 != null) {
                                    lVar = x.a(lVar2, q5, b4.a());
                                }
                            } else {
                                throw new IllegalStateException("unexpected");
                            }
                        }
                    } else {
                        jVar.b();
                        this.f1049e = q4;
                        this.f1050f = null;
                        a4 = n3.b.a(true);
                        l lVar3 = bVar.f1047f;
                        if (lVar3 != null) {
                            lVar = x.a(lVar3, q4, b4.a());
                        }
                    }
                    b4.v(a4, lVar);
                }
                Object x4 = b4.x();
                if (x4 == C0795c.c()) {
                    h.c(eVar);
                }
                return x4;
            } catch (Throwable th) {
                b4.L();
                throw th;
            }
        }

        public final boolean g() {
            this.f1049e = c.z();
            Throwable K4 = b.this.K();
            if (K4 == null) {
                return false;
            }
            throw E.a(K4);
        }

        public final void h() {
            C0256m mVar = this.f1050f;
            v3.l.b(mVar);
            this.f1050f = null;
            this.f1049e = c.z();
            Throwable K4 = b.this.K();
            if (K4 == null) {
                C0667h.a aVar = C0667h.f9633e;
                mVar.q(C0667h.a(Boolean.FALSE));
                return;
            }
            C0667h.a aVar2 = C0667h.f9633e;
            mVar.q(C0667h.a(C0668i.a(K4)));
        }

        public final boolean i(Object obj) {
            C0256m mVar = this.f1050f;
            v3.l.b(mVar);
            l lVar = null;
            this.f1050f = null;
            this.f1049e = obj;
            Boolean bool = Boolean.TRUE;
            l lVar2 = b.this.f1047f;
            if (lVar2 != null) {
                lVar = x.a(lVar2, obj, mVar.a());
            }
            return c.B(mVar, bool, lVar);
        }

        public final void j() {
            C0256m mVar = this.f1050f;
            v3.l.b(mVar);
            this.f1050f = null;
            this.f1049e = c.z();
            Throwable K4 = b.this.K();
            if (K4 == null) {
                C0667h.a aVar = C0667h.f9633e;
                mVar.q(C0667h.a(Boolean.FALSE));
                return;
            }
            C0667h.a aVar2 = C0667h.f9633e;
            mVar.q(C0667h.a(C0668i.a(K4)));
        }

        public Object next() {
            Object obj = this.f1049e;
            if (obj != c.f1070p) {
                this.f1049e = c.f1070p;
                if (obj != c.z()) {
                    return obj;
                }
                throw E.a(b.this.L());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
    }

    /* renamed from: F3.b$b  reason: collision with other inner class name */
    public static final class C0012b extends m implements q {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b f1052f;

        /* renamed from: F3.b$b$a */
        public static final class a extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ Object f1053f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ b f1054g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Object obj, b bVar, L3.a aVar) {
                super(1);
                this.f1053f = obj;
                this.f1054g = bVar;
            }

            public final void a(Throwable th) {
                if (this.f1053f != c.z()) {
                    l lVar = this.f1054g.f1047f;
                    throw null;
                }
            }

            public /* bridge */ /* synthetic */ Object i(Object obj) {
                a((Throwable) obj);
                return C0673n.f9639a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0012b(b bVar) {
            super(3);
            this.f1052f = bVar;
        }

        public final l a(L3.a aVar, Object obj, Object obj2) {
            return new a(obj2, this.f1052f, aVar);
        }

        public /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.session.b.a(obj);
            return a((L3.a) null, obj2, obj3);
        }
    }

    static {
        Class<b> cls = b.class;
        f1037h = AtomicLongFieldUpdater.newUpdater(cls, "sendersAndCloseStatus");
        f1038i = AtomicLongFieldUpdater.newUpdater(cls, "receivers");
        f1039j = AtomicLongFieldUpdater.newUpdater(cls, "bufferEnd");
        f1040k = AtomicLongFieldUpdater.newUpdater(cls, "completedExpandBuffersAndPauseFlag");
        Class<Object> cls2 = Object.class;
        f1041l = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "sendSegment");
        f1042m = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "receiveSegment");
        f1043n = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "bufferEndSegment");
        f1044o = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_closeCause");
        f1045p = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "closeHandler");
    }

    public b(int i4, l lVar) {
        this.f1046e = i4;
        this.f1047f = lVar;
        if (i4 >= 0) {
            this.bufferEnd = c.A(i4);
            this.completedExpandBuffersAndPauseFlag = J();
            j jVar = new j(0, (j) null, this, 3);
            this.sendSegment = jVar;
            this.receiveSegment = jVar;
            if (Z()) {
                jVar = c.f1055a;
                v3.l.c(jVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = jVar;
            this.f1048g = lVar != null ? new C0012b(this) : null;
            this._closeCause = c.f1073s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i4 + ", should be >=0").toString());
    }

    public static /* synthetic */ void R(b bVar, long j4, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                j4 = 1;
            }
            bVar.Q(j4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    public static /* synthetic */ Object n0(b bVar, e eVar) {
        j jVar = (j) f1042m.get(bVar);
        while (!bVar.V()) {
            long andIncrement = f1038i.getAndIncrement(bVar);
            int i4 = c.f1056b;
            long j4 = andIncrement / ((long) i4);
            int i5 = (int) (andIncrement % ((long) i4));
            if (jVar.f1526g != j4) {
                j a4 = bVar.H(j4, jVar);
                if (a4 == null) {
                    continue;
                } else {
                    jVar = a4;
                }
            }
            Object q4 = bVar.A0(jVar, i5, andIncrement, (Object) null);
            if (q4 == c.f1067m) {
                throw new IllegalStateException("unexpected");
            } else if (q4 == c.f1069o) {
                if (andIncrement < bVar.O()) {
                    jVar.b();
                }
            } else if (q4 == c.f1068n) {
                return bVar.o0(jVar, i5, andIncrement, eVar);
            } else {
                jVar.b();
                return q4;
            }
        }
        throw E.a(bVar.L());
    }

    public static /* synthetic */ Object t0(b bVar, Object obj, e eVar) {
        j jVar = (j) f1041l.get(bVar);
        while (true) {
            long andIncrement = f1037h.getAndIncrement(bVar);
            long j4 = 1152921504606846975L & andIncrement;
            boolean j5 = bVar.X(andIncrement);
            int i4 = c.f1056b;
            long j6 = j4 / ((long) i4);
            int i5 = (int) (j4 % ((long) i4));
            if (jVar.f1526g != j6) {
                j b4 = bVar.I(j6, jVar);
                if (b4 != null) {
                    jVar = b4;
                } else if (j5) {
                    Object h02 = bVar.h0(obj, eVar);
                    if (h02 == C0795c.c()) {
                        return h02;
                    }
                }
            }
            int r4 = bVar.C0(jVar, i5, obj, j4, (Object) null, j5);
            if (r4 == 0) {
                jVar.b();
                break;
            } else if (r4 == 1) {
                break;
            } else if (r4 != 2) {
                if (r4 == 3) {
                    Object u02 = bVar.u0(jVar, i5, obj, j4, eVar);
                    if (u02 == C0795c.c()) {
                        return u02;
                    }
                } else if (r4 == 4) {
                    if (j4 < bVar.M()) {
                        jVar.b();
                    }
                    Object h03 = bVar.h0(obj, eVar);
                    if (h03 == C0795c.c()) {
                        return h03;
                    }
                } else if (r4 == 5) {
                    jVar.b();
                }
            } else if (j5) {
                jVar.p();
                Object h04 = bVar.h0(obj, eVar);
                if (h04 == C0795c.c()) {
                    return h04;
                }
            }
        }
        return C0673n.f9639a;
    }

    public void A(l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1045p;
        if (!w.b.a(atomicReferenceFieldUpdater, this, (Object) null, lVar)) {
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != c.f1071q) {
                    if (obj == c.f1072r) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!w.b.a(f1045p, this, c.f1071q, c.f1072r));
            lVar.i(K());
        }
    }

    public final Object A0(j jVar, int i4, long j4, Object obj) {
        Object w4 = jVar.w(i4);
        if (w4 == null) {
            if (j4 >= (f1037h.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return c.f1068n;
                }
                if (jVar.r(i4, w4, obj)) {
                    D();
                    return c.f1067m;
                }
            }
        } else if (w4 == c.f1058d && jVar.r(i4, w4, c.f1063i)) {
            D();
            return jVar.y(i4);
        }
        return B0(jVar, i4, j4, obj);
    }

    public final void B(long j4) {
        O d4;
        j jVar = (j) f1042m.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1038i;
            long j5 = atomicLongFieldUpdater.get(this);
            if (j4 >= Math.max(((long) this.f1046e) + j5, J())) {
                if (atomicLongFieldUpdater.compareAndSet(this, j5, j5 + 1)) {
                    int i4 = c.f1056b;
                    long j6 = j5 / ((long) i4);
                    int i5 = (int) (j5 % ((long) i4));
                    if (jVar.f1526g != j6) {
                        j H4 = H(j6, jVar);
                        if (H4 == null) {
                            continue;
                        } else {
                            jVar = H4;
                        }
                    }
                    Object A02 = A0(jVar, i5, j5, (Object) null);
                    if (A02 != c.f1069o) {
                        jVar.b();
                        l lVar = this.f1047f;
                        if (!(lVar == null || (d4 = x.d(lVar, A02, (O) null, 2, (Object) null)) == null)) {
                            throw d4;
                        }
                    } else if (j5 < O()) {
                        jVar.b();
                    }
                }
            } else {
                return;
            }
        }
    }

    public final Object B0(j jVar, int i4, long j4, Object obj) {
        while (true) {
            Object w4 = jVar.w(i4);
            if (w4 == null || w4 == c.f1059e) {
                if (j4 < (f1037h.get(this) & 1152921504606846975L)) {
                    if (jVar.r(i4, w4, c.f1062h)) {
                        D();
                        return c.f1069o;
                    }
                } else if (obj == null) {
                    return c.f1068n;
                } else {
                    if (jVar.r(i4, w4, obj)) {
                        D();
                        return c.f1067m;
                    }
                }
            } else if (w4 == c.f1058d) {
                if (jVar.r(i4, w4, c.f1063i)) {
                    D();
                    return jVar.y(i4);
                }
            } else if (w4 == c.f1064j) {
                return c.f1069o;
            } else {
                if (w4 == c.f1062h) {
                    return c.f1069o;
                }
                if (w4 == c.z()) {
                    D();
                    return c.f1069o;
                } else if (w4 != c.f1061g && jVar.r(i4, w4, c.f1060f)) {
                    boolean z4 = w4 instanceof u;
                    if (z4) {
                        w4 = ((u) w4).f1091a;
                    }
                    if (x0(w4, jVar, i4)) {
                        jVar.A(i4, c.f1063i);
                        D();
                        return jVar.y(i4);
                    }
                    jVar.A(i4, c.f1064j);
                    jVar.x(i4, false);
                    if (z4) {
                        D();
                    }
                    return c.f1069o;
                }
            }
        }
    }

    public Object C() {
        j jVar;
        long j4 = f1038i.get(this);
        long j5 = f1037h.get(this);
        if (W(j5)) {
            return h.f1079a.a(K());
        }
        if (j4 >= (j5 & 1152921504606846975L)) {
            return h.f1079a.b();
        }
        F i4 = c.f1065k;
        j jVar2 = (j) f1042m.get(this);
        while (!V()) {
            long andIncrement = f1038i.getAndIncrement(this);
            int i5 = c.f1056b;
            long j6 = andIncrement / ((long) i5);
            int i6 = (int) (andIncrement % ((long) i5));
            if (jVar2.f1526g != j6) {
                j a4 = H(j6, jVar2);
                if (a4 == null) {
                    continue;
                } else {
                    jVar = a4;
                }
            } else {
                jVar = jVar2;
            }
            Object q4 = A0(jVar, i6, andIncrement, i4);
            if (q4 == c.f1067m) {
                N0 n02 = i4 instanceof N0 ? (N0) i4 : null;
                if (n02 != null) {
                    l0(n02, jVar, i6);
                }
                G0(andIncrement);
                jVar.p();
                return h.f1079a.b();
            } else if (q4 == c.f1069o) {
                if (andIncrement < O()) {
                    jVar.b();
                }
                jVar2 = jVar;
            } else if (q4 != c.f1068n) {
                jVar.b();
                return h.f1079a.c(q4);
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        return h.f1079a.a(K());
    }

    public final int C0(j jVar, int i4, Object obj, long j4, Object obj2, boolean z4) {
        jVar.B(i4, obj);
        if (z4) {
            return D0(jVar, i4, obj, j4, obj2, z4);
        }
        Object w4 = jVar.w(i4);
        if (w4 == null) {
            if (s(j4)) {
                if (jVar.r(i4, (Object) null, c.f1058d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (jVar.r(i4, (Object) null, obj2)) {
                    return 2;
                }
            }
        } else if (w4 instanceof N0) {
            jVar.s(i4);
            if (w0(w4, obj)) {
                jVar.A(i4, c.f1063i);
                j0();
                return 0;
            }
            if (jVar.t(i4, c.f1065k) != c.f1065k) {
                jVar.x(i4, true);
            }
            return 5;
        }
        return D0(jVar, i4, obj, j4, obj2, z4);
    }

    public final void D() {
        if (!Z()) {
            j jVar = (j) f1043n.get(this);
            while (true) {
                long andIncrement = f1039j.getAndIncrement(this);
                int i4 = c.f1056b;
                long j4 = andIncrement / ((long) i4);
                if (O() <= andIncrement) {
                    if (jVar.f1526g < j4 && jVar.e() != null) {
                        e0(j4, jVar);
                    }
                    R(this, 0, 1, (Object) null);
                    return;
                }
                if (jVar.f1526g != j4) {
                    j F4 = F(j4, jVar, andIncrement);
                    if (F4 == null) {
                        continue;
                    } else {
                        jVar = F4;
                    }
                }
                if (y0(jVar, (int) (andIncrement % ((long) i4)), andIncrement)) {
                    R(this, 0, 1, (Object) null);
                    return;
                }
                R(this, 0, 1, (Object) null);
            }
        }
    }

    public final int D0(j jVar, int i4, Object obj, long j4, Object obj2, boolean z4) {
        while (true) {
            Object w4 = jVar.w(i4);
            if (w4 == null) {
                if (!s(j4) || z4) {
                    if (z4) {
                        if (jVar.r(i4, (Object) null, c.f1064j)) {
                            jVar.x(i4, false);
                            return 4;
                        }
                    } else if (obj2 == null) {
                        return 3;
                    } else {
                        if (jVar.r(i4, (Object) null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.r(i4, (Object) null, c.f1058d)) {
                    return 1;
                }
            } else if (w4 == c.f1059e) {
                if (jVar.r(i4, w4, c.f1058d)) {
                    return 1;
                }
            } else if (w4 == c.f1065k) {
                jVar.s(i4);
                return 5;
            } else if (w4 == c.f1062h) {
                jVar.s(i4);
                return 5;
            } else if (w4 == c.z()) {
                jVar.s(i4);
                z();
                return 4;
            } else {
                jVar.s(i4);
                if (w4 instanceof u) {
                    w4 = ((u) w4).f1091a;
                }
                if (w0(w4, obj)) {
                    jVar.A(i4, c.f1063i);
                    j0();
                    return 0;
                }
                if (jVar.t(i4, c.f1065k) != c.f1065k) {
                    jVar.x(i4, true);
                }
                return 5;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return F3.h.f1079a.c(h3.C0673n.f9639a);
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object E(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f1037h
            long r0 = r0.get(r14)
            boolean r0 = r14.v0(r0)
            if (r0 == 0) goto L_0x0013
            F3.h$b r15 = F3.h.f1079a
            java.lang.Object r15 = r15.b()
            return r15
        L_0x0013:
            I3.F r8 = F3.c.f1064j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1041l
            java.lang.Object r0 = r0.get(r14)
            F3.j r0 = (F3.j) r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f1037h
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = r14.X(r1)
            int r1 = F3.c.f1056b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f1526g
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0059
            F3.j r1 = r14.I(r2, r0)
            if (r1 != 0) goto L_0x0057
            if (r11 == 0) goto L_0x0021
        L_0x004b:
            F3.h$b r15 = F3.h.f1079a
            java.lang.Throwable r0 = r14.N()
            java.lang.Object r15 = r15.a(r0)
            goto L_0x00ba
        L_0x0057:
            r13 = r1
            goto L_0x005a
        L_0x0059:
            r13 = r0
        L_0x005a:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = r0.C0(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b6
            r1 = 1
            if (r0 == r1) goto L_0x00ad
            r1 = 2
            if (r0 == r1) goto L_0x0090
            r1 = 3
            if (r0 == r1) goto L_0x0088
            r1 = 4
            if (r0 == r1) goto L_0x007c
            r1 = 5
            if (r0 == r1) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            r13.b()
        L_0x007a:
            r0 = r13
            goto L_0x0021
        L_0x007c:
            long r0 = r14.M()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x004b
            r13.b()
            goto L_0x004b
        L_0x0088:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L_0x0090:
            if (r11 == 0) goto L_0x0096
            r13.p()
            goto L_0x004b
        L_0x0096:
            boolean r15 = r8 instanceof D3.N0
            if (r15 == 0) goto L_0x009d
            D3.N0 r8 = (D3.N0) r8
            goto L_0x009e
        L_0x009d:
            r8 = 0
        L_0x009e:
            if (r8 == 0) goto L_0x00a3
            r14.m0(r8, r13, r12)
        L_0x00a3:
            r13.p()
            F3.h$b r15 = F3.h.f1079a
            java.lang.Object r15 = r15.b()
            goto L_0x00ba
        L_0x00ad:
            F3.h$b r15 = F3.h.f1079a
            h3.n r0 = h3.C0673n.f9639a
            java.lang.Object r15 = r15.c(r0)
            goto L_0x00ba
        L_0x00b6:
            r13.b()
            goto L_0x00ad
        L_0x00ba:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.b.E(java.lang.Object):java.lang.Object");
    }

    public final void E0(long j4) {
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1038i;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if (j5 >= j4 || f1038i.compareAndSet(this, j5, j4)) {
            }
            j5 = atomicLongFieldUpdater.get(this);
            return;
        } while (f1038i.compareAndSet(this, j5, j4));
    }

    public final j F(long j4, j jVar, long j5) {
        Object c4;
        long j6 = j4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1043n;
        p pVar = (p) c.y();
        j jVar2 = jVar;
        loop0:
        while (true) {
            c4 = C0275d.c(jVar2, j6, pVar);
            if (D.c(c4)) {
                break;
            }
            C b4 = D.b(c4);
            while (true) {
                C c5 = (C) atomicReferenceFieldUpdater.get(this);
                if (c5.f1526g >= b4.f1526g) {
                    break loop0;
                } else if (b4.q()) {
                    if (w.b.a(atomicReferenceFieldUpdater, this, c5, b4)) {
                        if (c5.m()) {
                            c5.k();
                        }
                    } else if (b4.m()) {
                        b4.k();
                    }
                }
            }
        }
        if (D.c(c4)) {
            z();
            e0(j4, jVar);
            R(this, 0, 1, (Object) null);
            return null;
        }
        j jVar3 = (j) D.b(c4);
        long j7 = jVar3.f1526g;
        if (j7 <= j6) {
            return jVar3;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1039j;
        int i4 = c.f1056b;
        if (atomicLongFieldUpdater.compareAndSet(this, j5 + 1, ((long) i4) * j7)) {
            Q((jVar3.f1526g * ((long) i4)) - j5);
            return null;
        }
        R(this, 0, 1, (Object) null);
        return null;
    }

    public final void F0(long j4) {
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1037h;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            j6 = 1152921504606846975L & j5;
            if (j6 < j4) {
            } else {
                return;
            }
        } while (!f1037h.compareAndSet(this, j5, c.w(j6, (int) (j5 >> 60))));
    }

    public boolean G() {
        return X(f1037h.get(this));
    }

    public final void G0(long j4) {
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        if (!Z()) {
            do {
            } while (J() <= j4);
            int g4 = c.f1057c;
            int i4 = 0;
            while (i4 < g4) {
                long J4 = J();
                if (J4 != (4611686018427387903L & f1040k.get(this)) || J4 != J()) {
                    i4++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1040k;
            do {
                j5 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j5, c.v(j5 & 4611686018427387903L, true)));
            while (true) {
                long J5 = J();
                atomicLongFieldUpdater = f1040k;
                long j7 = atomicLongFieldUpdater.get(this);
                long j8 = j7 & 4611686018427387903L;
                boolean z4 = (4611686018427387904L & j7) != 0;
                if (J5 == j8 && J5 == J()) {
                    break;
                } else if (!z4) {
                    atomicLongFieldUpdater.compareAndSet(this, j7, c.v(j8, true));
                }
            }
            do {
                j6 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, c.v(j6 & 4611686018427387903L, false)));
        }
    }

    public final j H(long j4, j jVar) {
        Object c4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1042m;
        p pVar = (p) c.y();
        loop0:
        while (true) {
            c4 = C0275d.c(jVar, j4, pVar);
            if (D.c(c4)) {
                break;
            }
            C b4 = D.b(c4);
            while (true) {
                C c5 = (C) atomicReferenceFieldUpdater.get(this);
                if (c5.f1526g >= b4.f1526g) {
                    break loop0;
                } else if (b4.q()) {
                    if (w.b.a(atomicReferenceFieldUpdater, this, c5, b4)) {
                        if (c5.m()) {
                            c5.k();
                        }
                    } else if (b4.m()) {
                        b4.k();
                    }
                }
            }
        }
        if (D.c(c4)) {
            z();
            if (jVar.f1526g * ((long) c.f1056b) >= O()) {
                return null;
            }
            jVar.b();
            return null;
        }
        j jVar2 = (j) D.b(c4);
        if (!Z() && j4 <= J() / ((long) c.f1056b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1043n;
            while (true) {
                C c6 = (C) atomicReferenceFieldUpdater2.get(this);
                if (c6.f1526g >= jVar2.f1526g || !jVar2.q()) {
                    break;
                } else if (w.b.a(atomicReferenceFieldUpdater2, this, c6, jVar2)) {
                    if (c6.m()) {
                        c6.k();
                    }
                } else if (jVar2.m()) {
                    jVar2.k();
                }
            }
        }
        long j5 = jVar2.f1526g;
        if (j5 <= j4) {
            return jVar2;
        }
        int i4 = c.f1056b;
        E0(j5 * ((long) i4));
        if (jVar2.f1526g * ((long) i4) >= O()) {
            return null;
        }
        jVar2.b();
        return null;
    }

    public final j I(long j4, j jVar) {
        Object c4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1041l;
        p pVar = (p) c.y();
        loop0:
        while (true) {
            c4 = C0275d.c(jVar, j4, pVar);
            if (D.c(c4)) {
                break;
            }
            C b4 = D.b(c4);
            while (true) {
                C c5 = (C) atomicReferenceFieldUpdater.get(this);
                if (c5.f1526g >= b4.f1526g) {
                    break loop0;
                } else if (b4.q()) {
                    if (w.b.a(atomicReferenceFieldUpdater, this, c5, b4)) {
                        if (c5.m()) {
                            c5.k();
                        }
                    } else if (b4.m()) {
                        b4.k();
                    }
                }
            }
        }
        if (D.c(c4)) {
            z();
            if (jVar.f1526g * ((long) c.f1056b) >= M()) {
                return null;
            }
            jVar.b();
            return null;
        }
        j jVar2 = (j) D.b(c4);
        long j5 = jVar2.f1526g;
        if (j5 <= j4) {
            return jVar2;
        }
        int i4 = c.f1056b;
        F0(j5 * ((long) i4));
        if (jVar2.f1526g * ((long) i4) >= M()) {
            return null;
        }
        jVar2.b();
        return null;
    }

    public final long J() {
        return f1039j.get(this);
    }

    public final Throwable K() {
        return (Throwable) f1044o.get(this);
    }

    public final Throwable L() {
        Throwable K4 = K();
        return K4 == null ? new m("Channel was closed") : K4;
    }

    public final long M() {
        return f1038i.get(this);
    }

    public final Throwable N() {
        Throwable K4 = K();
        return K4 == null ? new n("Channel was closed") : K4;
    }

    public final long O() {
        return f1037h.get(this) & 1152921504606846975L;
    }

    public final boolean P() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1042m;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long M4 = M();
            if (O() <= M4) {
                return false;
            }
            int i4 = c.f1056b;
            long j4 = M4 / ((long) i4);
            if (jVar.f1526g == j4 || (jVar = H(j4, jVar)) != null) {
                jVar.b();
                if (T(jVar, (int) (M4 % ((long) i4)), M4)) {
                    return true;
                }
                f1038i.compareAndSet(this, M4, M4 + 1);
            } else if (((j) atomicReferenceFieldUpdater.get(this)).f1526g < j4) {
                return false;
            }
        }
    }

    public final void Q(long j4) {
        if ((f1040k.addAndGet(this, j4) & 4611686018427387904L) != 0) {
            do {
            } while ((f1040k.get(this) & 4611686018427387904L) != 0);
        }
    }

    public final void S() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1045p;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!w.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? c.f1071q : c.f1072r));
        if (obj != null) {
            l lVar = (l) z.a(obj, 1);
            ((l) obj).i(K());
        }
    }

    public final boolean T(j jVar, int i4, long j4) {
        Object w4;
        do {
            w4 = jVar.w(i4);
            if (w4 != null && w4 != c.f1059e) {
                if (w4 == c.f1058d) {
                    return true;
                }
                if (w4 == c.f1064j || w4 == c.z() || w4 == c.f1063i || w4 == c.f1062h) {
                    return false;
                }
                if (w4 == c.f1061g) {
                    return true;
                }
                return w4 != c.f1060f && j4 == M();
            }
        } while (!jVar.r(i4, w4, c.f1062h));
        D();
        return false;
    }

    public final boolean U(long j4, boolean z4) {
        int i4 = (int) (j4 >> 60);
        if (i4 == 0 || i4 == 1) {
            return false;
        }
        if (i4 == 2) {
            y(j4 & 1152921504606846975L);
            if (z4 && P()) {
                return false;
            }
        } else if (i4 == 3) {
            x(j4 & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i4).toString());
        }
        return true;
    }

    public boolean V() {
        return W(f1037h.get(this));
    }

    public final boolean W(long j4) {
        return U(j4, true);
    }

    public final boolean X(long j4) {
        return U(j4, false);
    }

    public boolean Y() {
        return false;
    }

    public final boolean Z() {
        long J4 = J();
        return J4 == 0 || J4 == Long.MAX_VALUE;
    }

    public final long a0(j jVar) {
        do {
            int i4 = c.f1056b;
            while (true) {
                i4--;
                if (-1 < i4) {
                    long j4 = (jVar.f1526g * ((long) c.f1056b)) + ((long) i4);
                    if (j4 < M()) {
                        return -1;
                    }
                    while (true) {
                        Object w4 = jVar.w(i4);
                        if (w4 == null || w4 == c.f1059e) {
                            if (jVar.r(i4, w4, c.z())) {
                                jVar.p();
                                break;
                            }
                        } else if (w4 == c.f1058d) {
                            return j4;
                        }
                    }
                } else {
                    jVar = (j) jVar.g();
                }
            }
        } while (jVar != null);
        return -1;
    }

    public final void b0() {
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1037h;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if (((int) (j4 >> 60)) == 0) {
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, c.w(1152921504606846975L & j4, 1)));
    }

    public final void c(CancellationException cancellationException) {
        t(cancellationException);
    }

    public final void c0() {
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1037h;
        do {
            j4 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, c.w(1152921504606846975L & j4, 3)));
    }

    public final void d0() {
        long j4;
        long b4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1037h;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            int i4 = (int) (j4 >> 60);
            if (i4 == 0) {
                b4 = c.w(j4 & 1152921504606846975L, 2);
            } else if (i4 == 1) {
                b4 = c.w(j4 & 1152921504606846975L, 3);
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, b4));
    }

    public final void e0(long j4, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f1526g < j4 && (jVar3 = (j) jVar.e()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.h() || (jVar2 = (j) jVar.e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1043n;
                while (true) {
                    C c4 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c4.f1526g < jVar.f1526g) {
                        if (!jVar.q()) {
                            continue;
                            break;
                        } else if (w.b.a(atomicReferenceFieldUpdater, this, c4, jVar)) {
                            if (c4.m()) {
                                c4.k();
                                return;
                            }
                            return;
                        } else if (jVar.m()) {
                            jVar.k();
                        }
                    } else {
                        return;
                    }
                }
            } else {
                jVar = jVar2;
            }
        }
    }

    public Object f(e eVar) {
        return n0(this, eVar);
    }

    public void f0() {
    }

    public final void g0(C0254l lVar) {
        C0667h.a aVar = C0667h.f9633e;
        lVar.q(C0667h.a(C0668i.a(L())));
    }

    public final Object h0(Object obj, e eVar) {
        O d4;
        C0256m mVar = new C0256m(C0794b.b(eVar), 1);
        mVar.A();
        l lVar = this.f1047f;
        if (lVar == null || (d4 = x.d(lVar, obj, (O) null, 2, (Object) null)) == null) {
            Throwable N4 = N();
            C0667h.a aVar = C0667h.f9633e;
            mVar.q(C0667h.a(C0668i.a(N4)));
        } else {
            C0660a.a(d4, N());
            C0667h.a aVar2 = C0667h.f9633e;
            mVar.q(C0667h.a(C0668i.a(d4)));
        }
        Object x4 = mVar.x();
        if (x4 == C0795c.c()) {
            h.c(eVar);
        }
        return x4 == C0795c.c() ? x4 : C0673n.f9639a;
    }

    public final void i0(Object obj, C0254l lVar) {
        l lVar2 = this.f1047f;
        if (lVar2 != null) {
            x.b(lVar2, obj, lVar.a());
        }
        Throwable N4 = N();
        C0667h.a aVar = C0667h.f9633e;
        lVar.q(C0667h.a(C0668i.a(N4)));
    }

    public f iterator() {
        return new a();
    }

    public void j0() {
    }

    public void k0() {
    }

    public final void l0(N0 n02, j jVar, int i4) {
        k0();
        n02.b(jVar, i4);
    }

    public final void m0(N0 n02, j jVar, int i4) {
        n02.b(jVar, i4 + c.f1056b);
    }

    public Object n(Object obj, e eVar) {
        return t0(this, obj, eVar);
    }

    public boolean o(Throwable th) {
        return w(th, false);
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v2, types: [u3.l] */
    /* JADX WARNING: type inference failed for: r7v3, types: [D3.N0] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o0(F3.j r9, int r10, long r11, l3.e r13) {
        /*
            r8 = this;
            l3.e r0 = m3.C0794b.b(r13)
            D3.m r0 = D3.C0260o.b(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r0
            java.lang.Object r1 = r1.A0(r2, r3, r4, r6)     // Catch:{ all -> 0x001c }
            I3.F r2 = F3.c.f1067m     // Catch:{ all -> 0x001c }
            if (r1 != r2) goto L_0x001f
            r8.l0(r0, r9, r10)     // Catch:{ all -> 0x001c }
            goto L_0x00c0
        L_0x001c:
            r9 = move-exception
            goto L_0x00ce
        L_0x001f:
            I3.F r10 = F3.c.f1069o     // Catch:{ all -> 0x001c }
            r7 = 0
            if (r1 != r10) goto L_0x00b0
            long r1 = r8.O()     // Catch:{ all -> 0x001c }
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x0031
            r9.b()     // Catch:{ all -> 0x001c }
        L_0x0031:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f1042m     // Catch:{ all -> 0x001c }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x001c }
            F3.j r9 = (F3.j) r9     // Catch:{ all -> 0x001c }
        L_0x003b:
            boolean r10 = r8.V()     // Catch:{ all -> 0x001c }
            if (r10 == 0) goto L_0x0046
            r8.g0(r0)     // Catch:{ all -> 0x001c }
            goto L_0x00c0
        L_0x0046:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = f1038i     // Catch:{ all -> 0x001c }
            long r10 = r10.getAndIncrement(r8)     // Catch:{ all -> 0x001c }
            int r12 = F3.c.f1056b     // Catch:{ all -> 0x001c }
            long r1 = (long) r12     // Catch:{ all -> 0x001c }
            long r1 = r10 / r1
            long r3 = (long) r12     // Catch:{ all -> 0x001c }
            long r3 = r10 % r3
            int r12 = (int) r3     // Catch:{ all -> 0x001c }
            long r3 = r9.f1526g     // Catch:{ all -> 0x001c }
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0065
            F3.j r1 = r8.H(r1, r9)     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0064
            goto L_0x003b
        L_0x0064:
            r9 = r1
        L_0x0065:
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r10
            r6 = r0
            java.lang.Object r1 = r1.A0(r2, r3, r4, r6)     // Catch:{ all -> 0x001c }
            I3.F r2 = F3.c.f1067m     // Catch:{ all -> 0x001c }
            if (r1 != r2) goto L_0x007d
            if (r0 == 0) goto L_0x0077
            r7 = r0
        L_0x0077:
            if (r7 == 0) goto L_0x00c0
            r8.l0(r7, r9, r12)     // Catch:{ all -> 0x001c }
            goto L_0x00c0
        L_0x007d:
            I3.F r12 = F3.c.f1069o     // Catch:{ all -> 0x001c }
            if (r1 != r12) goto L_0x008f
            long r1 = r8.O()     // Catch:{ all -> 0x001c }
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x003b
            r9.b()     // Catch:{ all -> 0x001c }
            goto L_0x003b
        L_0x008f:
            I3.F r10 = F3.c.f1068n     // Catch:{ all -> 0x001c }
            if (r1 == r10) goto L_0x00a8
            r9.b()     // Catch:{ all -> 0x001c }
            u3.l r9 = r8.f1047f     // Catch:{ all -> 0x001c }
            if (r9 == 0) goto L_0x00a4
            l3.i r10 = r0.a()     // Catch:{ all -> 0x001c }
            u3.l r7 = I3.x.a(r9, r1, r10)     // Catch:{ all -> 0x001c }
        L_0x00a4:
            r0.v(r1, r7)     // Catch:{ all -> 0x001c }
            goto L_0x00c0
        L_0x00a8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001c }
            java.lang.String r10 = "unexpected"
            r9.<init>(r10)     // Catch:{ all -> 0x001c }
            throw r9     // Catch:{ all -> 0x001c }
        L_0x00b0:
            r9.b()     // Catch:{ all -> 0x001c }
            u3.l r9 = r8.f1047f     // Catch:{ all -> 0x001c }
            if (r9 == 0) goto L_0x00a4
            l3.i r10 = r0.a()     // Catch:{ all -> 0x001c }
            u3.l r7 = I3.x.a(r9, r1, r10)     // Catch:{ all -> 0x001c }
            goto L_0x00a4
        L_0x00c0:
            java.lang.Object r9 = r0.x()
            java.lang.Object r10 = m3.C0795c.c()
            if (r9 != r10) goto L_0x00cd
            n3.h.c(r13)
        L_0x00cd:
            return r9
        L_0x00ce:
            r0.L()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.b.o0(F3.j, int, long, l3.e):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b3, code lost:
        r12 = (F3.j) r12.g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p0(F3.j r12) {
        /*
            r11 = this;
            u3.l r0 = r11.f1047f
            r1 = 0
            r2 = 1
            java.lang.Object r3 = I3.C0283l.b(r1, r2, r1)
        L_0x0008:
            int r4 = F3.c.f1056b
            int r4 = r4 - r2
        L_0x000b:
            r5 = -1
            if (r5 >= r4) goto L_0x00b3
            long r6 = r12.f1526g
            int r8 = F3.c.f1056b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L_0x0016:
            java.lang.Object r8 = r12.w(r4)
            I3.F r9 = F3.c.f1063i
            if (r8 == r9) goto L_0x00bb
            I3.F r9 = F3.c.f1058d
            if (r8 != r9) goto L_0x0048
            long r9 = r11.M()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00bb
            I3.F r9 = F3.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0040
            java.lang.Object r5 = r12.v(r4)
            I3.O r1 = I3.x.c(r0, r5, r1)
        L_0x0040:
            r12.s(r4)
            r12.p()
            goto L_0x00af
        L_0x0048:
            I3.F r9 = F3.c.f1059e
            if (r8 == r9) goto L_0x00a2
            if (r8 != 0) goto L_0x0051
            goto L_0x00a2
        L_0x0051:
            boolean r9 = r8 instanceof D3.N0
            if (r9 != 0) goto L_0x006e
            boolean r9 = r8 instanceof F3.u
            if (r9 == 0) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            I3.F r9 = F3.c.f1061g
            if (r8 == r9) goto L_0x00bb
            I3.F r9 = F3.c.f1060f
            if (r8 != r9) goto L_0x0067
            goto L_0x00bb
        L_0x0067:
            I3.F r9 = F3.c.f1061g
            if (r8 == r9) goto L_0x0016
            goto L_0x00af
        L_0x006e:
            long r9 = r11.M()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x00bb
            boolean r9 = r8 instanceof F3.u
            if (r9 == 0) goto L_0x0080
            r9 = r8
            F3.u r9 = (F3.u) r9
            D3.N0 r9 = r9.f1091a
            goto L_0x0083
        L_0x0080:
            r9 = r8
            D3.N0 r9 = (D3.N0) r9
        L_0x0083:
            I3.F r10 = F3.c.z()
            boolean r8 = r12.r(r4, r8, r10)
            if (r8 == 0) goto L_0x0016
            if (r0 == 0) goto L_0x0097
            java.lang.Object r5 = r12.v(r4)
            I3.O r1 = I3.x.c(r0, r5, r1)
        L_0x0097:
            java.lang.Object r3 = I3.C0283l.c(r3, r9)
            r12.s(r4)
            r12.p()
            goto L_0x00af
        L_0x00a2:
            I3.F r9 = F3.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L_0x0016
            r12.p()
        L_0x00af:
            int r4 = r4 + -1
            goto L_0x000b
        L_0x00b3:
            I3.e r12 = r12.g()
            F3.j r12 = (F3.j) r12
            if (r12 != 0) goto L_0x0008
        L_0x00bb:
            if (r3 == 0) goto L_0x00e1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto L_0x00c7
            D3.N0 r3 = (D3.N0) r3
            r11.r0(r3)
            goto L_0x00e1
        L_0x00c7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            v3.l.c(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        L_0x00d3:
            if (r5 >= r12) goto L_0x00e1
            java.lang.Object r0 = r3.get(r12)
            D3.N0 r0 = (D3.N0) r0
            r11.r0(r0)
            int r12 = r12 + -1
            goto L_0x00d3
        L_0x00e1:
            if (r1 != 0) goto L_0x00e4
            return
        L_0x00e4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.b.p0(F3.j):void");
    }

    public final void q0(N0 n02) {
        s0(n02, true);
    }

    public final void r0(N0 n02) {
        s0(n02, false);
    }

    public final boolean s(long j4) {
        return j4 < J() || j4 < M() + ((long) this.f1046e);
    }

    public final void s0(N0 n02, boolean z4) {
        if (n02 instanceof C0254l) {
            e eVar = (e) n02;
            C0667h.a aVar = C0667h.f9633e;
            eVar.q(C0667h.a(C0668i.a(z4 ? L() : N())));
        } else if (n02 instanceof a) {
            ((a) n02).j();
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + n02).toString());
        }
    }

    public boolean t(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return w(th, true);
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [I3.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b2, code lost:
        r3 = r3.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b9, code lost:
        if (r3 != null) goto L_0x01da;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f1037h
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r2 = (int) r2
            r3 = 3
            r4 = 2
            if (r2 == r4) goto L_0x001e
            if (r2 == r3) goto L_0x0018
            goto L_0x0023
        L_0x0018:
            java.lang.String r2 = "cancelled,"
            r1.append(r2)
            goto L_0x0023
        L_0x001e:
            java.lang.String r2 = "closed,"
            r1.append(r2)
        L_0x0023:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "capacity="
            r2.append(r5)
            int r5 = r0.f1046e
            r2.append(r5)
            r5 = 44
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "data=["
            r1.append(r2)
            F3.j[] r2 = new F3.j[r3]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f1042m
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f1041l
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f1043n
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = i3.C0738o.j(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x006e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r2.next()
            r8 = r4
            F3.j r8 = (F3.j) r8
            F3.j r9 = F3.c.f1055a
            if (r8 == r9) goto L_0x006e
            r3.add(r4)
            goto L_0x006e
        L_0x0085:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01de
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x009a
            goto L_0x00b4
        L_0x009a:
            r4 = r3
            F3.j r4 = (F3.j) r4
            long r8 = r4.f1526g
        L_0x009f:
            java.lang.Object r4 = r2.next()
            r10 = r4
            F3.j r10 = (F3.j) r10
            long r10 = r10.f1526g
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00ae
            r3 = r4
            r8 = r10
        L_0x00ae:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x009f
        L_0x00b4:
            F3.j r3 = (F3.j) r3
            long r10 = r16.M()
            long r12 = r16.O()
        L_0x00be:
            int r2 = F3.c.f1056b
            r4 = r6
        L_0x00c1:
            if (r4 >= r2) goto L_0x01b2
            long r8 = r3.f1526g
            int r14 = F3.c.f1056b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00d3
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01bb
        L_0x00d3:
            java.lang.Object r15 = r3.w(r4)
            java.lang.Object r6 = r3.v(r4)
            boolean r7 = r15 instanceof D3.C0254l
            if (r7 == 0) goto L_0x00f5
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00e9
            if (r14 < 0) goto L_0x00e9
            java.lang.String r7 = "receive"
            goto L_0x0178
        L_0x00e9:
            if (r14 >= 0) goto L_0x00f1
            if (r7 < 0) goto L_0x00f1
            java.lang.String r7 = "send"
            goto L_0x0178
        L_0x00f1:
            java.lang.String r7 = "cont"
            goto L_0x0178
        L_0x00f5:
            boolean r7 = r15 instanceof F3.u
            if (r7 == 0) goto L_0x0111
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EB("
            r7.append(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x0178
        L_0x0111:
            I3.F r7 = F3.c.f1060f
            boolean r7 = v3.l.a(r15, r7)
            if (r7 == 0) goto L_0x011d
            r7 = 1
            goto L_0x0125
        L_0x011d:
            I3.F r7 = F3.c.f1061g
            boolean r7 = v3.l.a(r15, r7)
        L_0x0125:
            if (r7 == 0) goto L_0x012a
            java.lang.String r7 = "resuming_sender"
            goto L_0x0178
        L_0x012a:
            if (r15 != 0) goto L_0x012e
            r7 = 1
            goto L_0x0136
        L_0x012e:
            I3.F r7 = F3.c.f1059e
            boolean r7 = v3.l.a(r15, r7)
        L_0x0136:
            if (r7 == 0) goto L_0x013a
            r7 = 1
            goto L_0x0142
        L_0x013a:
            I3.F r7 = F3.c.f1063i
            boolean r7 = v3.l.a(r15, r7)
        L_0x0142:
            if (r7 == 0) goto L_0x0146
            r7 = 1
            goto L_0x014e
        L_0x0146:
            I3.F r7 = F3.c.f1062h
            boolean r7 = v3.l.a(r15, r7)
        L_0x014e:
            if (r7 == 0) goto L_0x0152
            r7 = 1
            goto L_0x015a
        L_0x0152:
            I3.F r7 = F3.c.f1065k
            boolean r7 = v3.l.a(r15, r7)
        L_0x015a:
            if (r7 == 0) goto L_0x015e
            r7 = 1
            goto L_0x0166
        L_0x015e:
            I3.F r7 = F3.c.f1064j
            boolean r7 = v3.l.a(r15, r7)
        L_0x0166:
            if (r7 == 0) goto L_0x016a
            r7 = 1
            goto L_0x0172
        L_0x016a:
            I3.F r7 = F3.c.z()
            boolean r7 = v3.l.a(r15, r7)
        L_0x0172:
            if (r7 != 0) goto L_0x01ac
            java.lang.String r7 = r15.toString()
        L_0x0178:
            if (r6 == 0) goto L_0x019a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r1.append(r6)
            goto L_0x01ac
        L_0x019a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r1.append(r6)
        L_0x01ac:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto L_0x00c1
        L_0x01b2:
            I3.e r2 = r3.e()
            r3 = r2
            F3.j r3 = (F3.j) r3
            if (r3 != 0) goto L_0x01da
        L_0x01bb:
            char r2 = C3.r.Z(r1)
            if (r2 != r5) goto L_0x01d0
            int r2 = r1.length()
            r4 = 1
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "this.deleteCharAt(index)"
            v3.l.d(r2, r3)
        L_0x01d0:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L_0x01da:
            r6 = 0
            r7 = 1
            goto L_0x00be
        L_0x01de:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.b.toString():java.lang.String");
    }

    public final void u(j jVar, long j4) {
        Object b4 = C0283l.b((Object) null, 1, (g) null);
        loop0:
        while (jVar != null) {
            for (int i4 = c.f1056b - 1; -1 < i4; i4--) {
                if ((jVar.f1526g * ((long) c.f1056b)) + ((long) i4) < j4) {
                    break loop0;
                }
                while (true) {
                    Object w4 = jVar.w(i4);
                    if (w4 == null || w4 == c.f1059e) {
                        if (jVar.r(i4, w4, c.z())) {
                            jVar.p();
                            break;
                        }
                    } else if (w4 instanceof u) {
                        if (jVar.r(i4, w4, c.z())) {
                            b4 = C0283l.c(b4, ((u) w4).f1091a);
                            jVar.x(i4, true);
                            break;
                        }
                    } else if (!(w4 instanceof N0)) {
                        break;
                    } else if (jVar.r(i4, w4, c.z())) {
                        b4 = C0283l.c(b4, w4);
                        jVar.x(i4, true);
                        break;
                    }
                }
            }
            jVar = (j) jVar.g();
        }
        if (b4 == null) {
            return;
        }
        if (!(b4 instanceof ArrayList)) {
            q0((N0) b4);
            return;
        }
        v3.l.c(b4, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        ArrayList arrayList = (ArrayList) b4;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            q0((N0) arrayList.get(size));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u0(F3.j r21, int r22, java.lang.Object r23, long r24, l3.e r26) {
        /*
            r20 = this;
            r9 = r20
            r0 = r23
            l3.e r1 = m3.C0794b.b(r26)
            D3.m r10 = D3.C0260o.b(r1)
            r8 = 0
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r7 = r10
            int r1 = r1.C0(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x00fa
            r11 = 1
            if (r1 == r11) goto L_0x00f1
            r12 = 2
            if (r1 == r12) goto L_0x00e9
            r13 = 4
            if (r1 == r13) goto L_0x00dc
            java.lang.String r14 = "unexpected"
            r15 = 5
            if (r1 != r15) goto L_0x00d6
            r21.b()     // Catch:{ all -> 0x0068 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f1041l     // Catch:{ all -> 0x0068 }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0068 }
            F3.j r1 = (F3.j) r1     // Catch:{ all -> 0x0068 }
        L_0x0039:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f1037h     // Catch:{ all -> 0x0068 }
            long r2 = r2.getAndIncrement(r9)     // Catch:{ all -> 0x0068 }
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r16 = r2 & r4
            boolean r18 = r9.X(r2)     // Catch:{ all -> 0x0068 }
            int r2 = F3.c.f1056b     // Catch:{ all -> 0x0068 }
            long r3 = (long) r2     // Catch:{ all -> 0x0068 }
            long r3 = r16 / r3
            long r5 = (long) r2     // Catch:{ all -> 0x0068 }
            long r5 = r16 % r5
            int r8 = (int) r5     // Catch:{ all -> 0x0068 }
            long r5 = r1.f1526g     // Catch:{ all -> 0x0068 }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006d
            F3.j r2 = r9.I(r3, r1)     // Catch:{ all -> 0x0068 }
            if (r2 != 0) goto L_0x006b
            if (r18 == 0) goto L_0x0039
        L_0x0063:
            r9.i0(r0, r10)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x0068:
            r0 = move-exception
            goto L_0x011f
        L_0x006b:
            r7 = r2
            goto L_0x006e
        L_0x006d:
            r7 = r1
        L_0x006e:
            r1 = r20
            r2 = r7
            r3 = r8
            r4 = r23
            r5 = r16
            r21 = r7
            r7 = r10
            r19 = r8
            r8 = r18
            int r1 = r1.C0(r2, r3, r4, r5, r7, r8)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x00c8
            if (r1 == r11) goto L_0x00bc
            if (r1 == r12) goto L_0x00a7
            r2 = 3
            if (r1 == r2) goto L_0x00a1
            if (r1 == r13) goto L_0x0095
            if (r1 == r15) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r21.b()     // Catch:{ all -> 0x0068 }
        L_0x0092:
            r1 = r21
            goto L_0x0039
        L_0x0095:
            long r1 = r20.M()     // Catch:{ all -> 0x0068 }
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.b()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            r0.<init>(r14)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x00a7:
            if (r18 == 0) goto L_0x00ad
            r21.p()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00ad:
            if (r10 == 0) goto L_0x00b1
            r0 = r10
            goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            if (r0 == 0) goto L_0x0108
            r2 = r21
            r1 = r19
            r9.m0(r0, r2, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x00bc:
            h3.h$a r0 = h3.C0667h.f9633e     // Catch:{ all -> 0x0068 }
            h3.n r0 = h3.C0673n.f9639a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = h3.C0667h.a(r0)     // Catch:{ all -> 0x0068 }
        L_0x00c4:
            r10.q(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x00c8:
            r2 = r21
            r2.b()     // Catch:{ all -> 0x0068 }
            h3.h$a r0 = h3.C0667h.f9633e     // Catch:{ all -> 0x0068 }
            h3.n r0 = h3.C0673n.f9639a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = h3.C0667h.a(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00c4
        L_0x00d6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            r0.<init>(r14)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x00dc:
            long r1 = r20.M()     // Catch:{ all -> 0x0068 }
            int r1 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0063
            r21.b()     // Catch:{ all -> 0x0068 }
            goto L_0x0063
        L_0x00e9:
            r0 = r21
            r1 = r22
            r9.m0(r10, r0, r1)     // Catch:{ all -> 0x0068 }
            goto L_0x0108
        L_0x00f1:
            h3.h$a r0 = h3.C0667h.f9633e     // Catch:{ all -> 0x0068 }
            h3.n r0 = h3.C0673n.f9639a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = h3.C0667h.a(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00c4
        L_0x00fa:
            r0 = r21
            r21.b()     // Catch:{ all -> 0x0068 }
            h3.h$a r0 = h3.C0667h.f9633e     // Catch:{ all -> 0x0068 }
            h3.n r0 = h3.C0673n.f9639a     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = h3.C0667h.a(r0)     // Catch:{ all -> 0x0068 }
            goto L_0x00c4
        L_0x0108:
            java.lang.Object r0 = r10.x()
            java.lang.Object r1 = m3.C0795c.c()
            if (r0 != r1) goto L_0x0115
            n3.h.c(r26)
        L_0x0115:
            java.lang.Object r1 = m3.C0795c.c()
            if (r0 != r1) goto L_0x011c
            return r0
        L_0x011c:
            h3.n r0 = h3.C0673n.f9639a
            return r0
        L_0x011f:
            r10.L()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: F3.b.u0(F3.j, int, java.lang.Object, long, l3.e):java.lang.Object");
    }

    public final j v() {
        j jVar = f1043n.get(this);
        j jVar2 = (j) f1041l.get(this);
        if (jVar2.f1526g > ((j) jVar).f1526g) {
            jVar = jVar2;
        }
        j jVar3 = (j) f1042m.get(this);
        if (jVar3.f1526g > ((j) jVar).f1526g) {
            jVar = jVar3;
        }
        return (j) C0275d.b((C0276e) jVar);
    }

    public final boolean v0(long j4) {
        if (X(j4)) {
            return false;
        }
        return !s(j4 & 1152921504606846975L);
    }

    public boolean w(Throwable th, boolean z4) {
        if (z4) {
            b0();
        }
        boolean a4 = w.b.a(f1044o, this, c.f1073s, th);
        if (z4) {
            c0();
        } else {
            d0();
        }
        z();
        f0();
        if (a4) {
            S();
        }
        return a4;
    }

    public final boolean w0(Object obj, Object obj2) {
        if (obj instanceof a) {
            v3.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        } else if (obj instanceof C0254l) {
            v3.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            C0254l lVar = (C0254l) obj;
            l lVar2 = this.f1047f;
            return c.B(lVar, obj2, lVar2 != null ? x.a(lVar2, obj2, lVar.a()) : null);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    public final void x(long j4) {
        p0(y(j4));
    }

    public final boolean x0(Object obj, j jVar, int i4) {
        if (obj instanceof C0254l) {
            v3.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.C((C0254l) obj, C0673n.f9639a, (l) null, 2, (Object) null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final j y(long j4) {
        j v4 = v();
        if (Y()) {
            long a02 = a0(v4);
            if (a02 != -1) {
                B(a02);
            }
        }
        u(v4, j4);
        return v4;
    }

    public final boolean y0(j jVar, int i4, long j4) {
        Object w4 = jVar.w(i4);
        if (!(w4 instanceof N0) || j4 < f1038i.get(this) || !jVar.r(i4, w4, c.f1061g)) {
            return z0(jVar, i4, j4);
        }
        if (x0(w4, jVar, i4)) {
            jVar.A(i4, c.f1058d);
            return true;
        }
        jVar.A(i4, c.f1064j);
        jVar.x(i4, false);
        return false;
    }

    public final void z() {
        G();
    }

    public final boolean z0(j jVar, int i4, long j4) {
        while (true) {
            Object w4 = jVar.w(i4);
            if (w4 instanceof N0) {
                if (j4 < f1038i.get(this)) {
                    if (jVar.r(i4, w4, new u((N0) w4))) {
                        return true;
                    }
                } else if (jVar.r(i4, w4, c.f1061g)) {
                    if (x0(w4, jVar, i4)) {
                        jVar.A(i4, c.f1058d);
                        return true;
                    }
                    jVar.A(i4, c.f1064j);
                    jVar.x(i4, false);
                    return false;
                }
            } else if (w4 == c.f1064j) {
                return false;
            } else {
                if (w4 == null) {
                    if (jVar.r(i4, w4, c.f1059e)) {
                        return true;
                    }
                } else if (w4 == c.f1058d || w4 == c.f1062h || w4 == c.f1063i || w4 == c.f1065k || w4 == c.z()) {
                    return true;
                } else {
                    if (w4 != c.f1060f) {
                        throw new IllegalStateException(("Unexpected cell state: " + w4).toString());
                    }
                }
            }
        }
        return true;
    }
}
