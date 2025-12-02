package M3;

import D3.C0254l;
import D3.N0;
import F3.i;
import I3.C;
import I3.C0275d;
import I3.D;
import h3.C0673n;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u3.l;
import u3.p;
import v3.j;
import v3.m;

public class d {

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1822c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1823d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1824e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1825f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1826g;
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    public final int f1827a;

    /* renamed from: b  reason: collision with root package name */
    public final l f1828b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public /* synthetic */ class a extends j implements p {

        /* renamed from: n  reason: collision with root package name */
        public static final a f1829n = new a();

        public a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
            return o(((Number) obj).longValue(), (f) obj2);
        }

        public final f o(long j4, f fVar) {
            return e.h(j4, fVar);
        }
    }

    public static final class b extends m implements l {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ d f1830f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(1);
            this.f1830f = dVar;
        }

        public final void a(Throwable th) {
            this.f1830f.i();
        }

        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return C0673n.f9639a;
        }
    }

    public /* synthetic */ class c extends j implements p {

        /* renamed from: n  reason: collision with root package name */
        public static final c f1831n = new c();

        public c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
            return o(((Number) obj).longValue(), (f) obj2);
        }

        public final f o(long j4, f fVar) {
            return e.h(j4, fVar);
        }
    }

    static {
        Class<d> cls = d.class;
        Class<Object> cls2 = Object.class;
        f1822c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head");
        f1823d = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx");
        f1824e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail");
        f1825f = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx");
        f1826g = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits");
    }

    public d(int i4, int i5) {
        this.f1827a = i4;
        if (i4 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i4).toString());
        } else if (i5 < 0 || i5 > i4) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i4).toString());
        } else {
            f fVar = new f(0, (f) null, 2);
            this.head = fVar;
            this.tail = fVar;
            this._availablePermits = i4 - i5;
            this.f1828b = new b(this);
        }
    }

    public final void d(C0254l lVar) {
        while (g() <= 0) {
            v3.l.c(lVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (e((N0) lVar)) {
                return;
            }
        }
        lVar.v(C0673n.f9639a, this.f1828b);
    }

    public final boolean e(N0 n02) {
        Object c4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1824e;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f1825f.getAndIncrement(this);
        a aVar = a.f1829n;
        long f4 = andIncrement / ((long) e.f1837f);
        loop0:
        while (true) {
            c4 = C0275d.c(fVar, f4, aVar);
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
        f fVar2 = (f) D.b(c4);
        int f5 = (int) (andIncrement % ((long) e.f1837f));
        if (i.a(fVar2.r(), f5, (Object) null, n02)) {
            n02.b(fVar2, f5);
            return true;
        }
        if (!i.a(fVar2.r(), f5, e.f1833b, e.f1834c)) {
            return false;
        }
        if (n02 instanceof C0254l) {
            v3.l.c(n02, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((C0254l) n02).v(C0673n.f9639a, this.f1828b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + n02).toString());
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void f() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f1826g
            int r1 = r0.get(r3)
            int r2 = r3.f1827a
            if (r1 <= r2) goto L_0x0010
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.d.f():void");
    }

    public final int g() {
        int andDecrement;
        do {
            andDecrement = f1826g.getAndDecrement(this);
        } while (andDecrement > this.f1827a);
        return andDecrement;
    }

    public int h() {
        return Math.max(f1826g.get(this), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f1826g
            int r0 = r0.getAndIncrement(r3)
            int r1 = r3.f1827a
            if (r0 >= r1) goto L_0x0014
            if (r0 < 0) goto L_0x000d
            return
        L_0x000d:
            boolean r0 = r3.l()
            if (r0 == 0) goto L_0x0000
            return
        L_0x0014:
            r3.f()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.append(r2)
            int r2 = r3.f1827a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.d.i():void");
    }

    public boolean j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1826g;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > this.f1827a) {
                f();
            } else if (i4 <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean k(Object obj) {
        if (obj instanceof C0254l) {
            v3.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            C0254l lVar = (C0254l) obj;
            Object u4 = lVar.u(C0673n.f9639a, (Object) null, this.f1828b);
            if (u4 == null) {
                return false;
            }
            lVar.K(u4);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + obj).toString());
    }

    public final boolean l() {
        Object c4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1822c;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f1823d.getAndIncrement(this);
        long f4 = andIncrement / ((long) e.f1837f);
        c cVar = c.f1831n;
        loop0:
        while (true) {
            c4 = C0275d.c(fVar, f4, cVar);
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
        f fVar2 = (f) D.b(c4);
        fVar2.b();
        int i4 = (fVar2.f1526g > f4 ? 1 : (fVar2.f1526g == f4 ? 0 : -1));
        if (i4 > 0) {
            return false;
        }
        int f5 = (int) (andIncrement % ((long) e.f1837f));
        Object andSet = fVar2.r().getAndSet(f5, e.f1833b);
        if (andSet == null) {
            int d4 = e.f1832a;
            for (int i5 = 0; i5 < d4; i5++) {
                if (fVar2.r().get(f5) == e.f1834c) {
                    return true;
                }
            }
            return !i.a(fVar2.r(), f5, e.f1833b, e.f1835d);
        } else if (andSet == e.f1836e) {
            return false;
        } else {
            return k(andSet);
        }
    }
}
