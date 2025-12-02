package K3;

import D3.C0236c;
import D3.M;
import I3.A;
import I3.F;
import h3.C0673n;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import v3.g;
import v3.l;
import v3.w;
import z3.e;

public final class a implements Executor, Closeable {

    /* renamed from: l  reason: collision with root package name */
    public static final C0032a f1713l = new C0032a((g) null);

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1714m;

    /* renamed from: n  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1715n;

    /* renamed from: o  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1716o;

    /* renamed from: p  reason: collision with root package name */
    public static final F f1717p = new F("NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: e  reason: collision with root package name */
    public final int f1718e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1719f;

    /* renamed from: g  reason: collision with root package name */
    public final long f1720g;

    /* renamed from: h  reason: collision with root package name */
    public final String f1721h;

    /* renamed from: i  reason: collision with root package name */
    public final d f1722i;

    /* renamed from: j  reason: collision with root package name */
    public final d f1723j;

    /* renamed from: k  reason: collision with root package name */
    public final A f1724k;
    private volatile long parkedWorkersStack;

    /* renamed from: K3.a$a  reason: collision with other inner class name */
    public static final class C0032a {
        public /* synthetic */ C0032a(g gVar) {
            this();
        }

        public C0032a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1725a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                K3.a$d[] r0 = K3.a.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                K3.a$d r1 = K3.a.d.PARKING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                K3.a$d r1 = K3.a.d.BLOCKING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                K3.a$d r1 = K3.a.d.CPU_ACQUIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                K3.a$d r1 = K3.a.d.DORMANT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                K3.a$d r1 = K3.a.d.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f1725a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: K3.a.b.<clinit>():void");
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    static {
        Class<a> cls = a.class;
        f1714m = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        f1715n = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        f1716o = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public a(int i4, int i5, long j4, String str) {
        this.f1718e = i4;
        this.f1719f = i5;
        this.f1720g = j4;
        this.f1721h = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i4 + " should be at least 1").toString());
        } else if (i5 < i4) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should be greater than or equals to core pool size " + i4).toString());
        } else if (i5 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should not exceed maximal supported number of threads 2097150").toString());
        } else if (j4 > 0) {
            this.f1722i = new d();
            this.f1723j = new d();
            this.f1724k = new A((i4 + 1) * 2);
            this.controlState = ((long) i4) << 42;
            this._isTerminated = 0;
        } else {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
    }

    public static /* synthetic */ boolean D(a aVar, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = f1715n.get(aVar);
        }
        return aVar.B(j4);
    }

    public static /* synthetic */ void i(a aVar, Runnable runnable, i iVar, boolean z4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            iVar = l.f1760g;
        }
        if ((i4 & 4) != 0) {
            z4 = false;
        }
        aVar.h(runnable, iVar, z4);
    }

    public final boolean B(long j4) {
        if (e.a(((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21)), 0) < this.f1718e) {
            int d4 = d();
            if (d4 == 1 && this.f1718e > 1) {
                d();
            }
            if (d4 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        c m4;
        do {
            m4 = m();
            if (m4 == null) {
                return false;
            }
        } while (!c.j().compareAndSet(m4, -1, 0));
        LockSupport.unpark(m4);
        return true;
    }

    public final boolean c(h hVar) {
        return hVar.f1751f.b() == 1 ? this.f1723j.a(hVar) : this.f1722i.a(hVar);
    }

    public void close() {
        w(10000);
    }

    public final int d() {
        synchronized (this.f1724k) {
            try {
                if (j()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1715n;
                long j4 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j4 & 2097151);
                int a4 = e.a(i4 - ((int) ((j4 & 4398044413952L) >> 21)), 0);
                if (a4 >= this.f1718e) {
                    return 0;
                }
                if (i4 >= this.f1719f) {
                    return 0;
                }
                int i5 = ((int) (f1715n.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f1724k.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i5);
                this.f1724k.c(i5, cVar);
                if (i5 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    int i6 = a4 + 1;
                    cVar.start();
                    return i6;
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final h e(Runnable runnable, i iVar) {
        long a4 = l.f1759f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, a4, iVar);
        }
        h hVar = (h) runnable;
        hVar.f1750e = a4;
        hVar.f1751f = iVar;
        return hVar;
    }

    public void execute(Runnable runnable) {
        i(this, runnable, (i) null, false, 6, (Object) null);
    }

    public final c g() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !l.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void h(Runnable runnable, i iVar, boolean z4) {
        C0236c.a();
        h e4 = e(runnable, iVar);
        boolean z5 = false;
        boolean z6 = e4.f1751f.b() == 1;
        long addAndGet = z6 ? f1715n.addAndGet(this, 2097152) : 0;
        c g4 = g();
        h z7 = z(g4, e4, z4);
        if (z7 == null || c(z7)) {
            if (z4 && g4 != null) {
                z5 = true;
            }
            if (z6) {
                x(addAndGet, z5);
            } else if (!z5) {
                y();
            }
        } else {
            throw new RejectedExecutionException(this.f1721h + " was terminated");
        }
    }

    public final boolean j() {
        return f1716o.get(this) != 0;
    }

    public final int k(c cVar) {
        Object i4 = cVar.i();
        while (i4 != f1717p) {
            if (i4 == null) {
                return 0;
            }
            c cVar2 = (c) i4;
            int h4 = cVar2.h();
            if (h4 != 0) {
                return h4;
            }
            i4 = cVar2.i();
        }
        return -1;
    }

    public final c m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1714m;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f1724k.b((int) (2097151 & j4));
            if (cVar == null) {
                return null;
            }
            long j5 = (2097152 + j4) & -2097152;
            int k4 = k(cVar);
            if (k4 >= 0) {
                if (f1714m.compareAndSet(this, j4, ((long) k4) | j5)) {
                    cVar.r(f1717p);
                    return cVar;
                }
            }
        }
    }

    public final boolean r(c cVar) {
        long j4;
        int h4;
        if (cVar.i() != f1717p) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1714m;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            h4 = cVar.h();
            cVar.r(this.f1724k.b((int) (2097151 & j4)));
        } while (!f1714m.compareAndSet(this, j4, ((2097152 + j4) & -2097152) | ((long) h4)));
        return true;
    }

    public final void s(c cVar, int i4, int i5) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1714m;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            int i6 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & -2097152;
            if (i6 == i4) {
                i6 = i5 == 0 ? k(cVar) : i5;
            }
            if (i6 >= 0) {
                if (f1714m.compareAndSet(this, j4, j5 | ((long) i6))) {
                    return;
                }
            }
        }
    }

    public final void t(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            C0236c.a();
            throw th;
        }
        C0236c.a();
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a4 = this.f1724k.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < a4; i9++) {
            c cVar = (c) this.f1724k.b(i9);
            if (cVar != null) {
                int e4 = cVar.f1727e.e();
                int i10 = b.f1725a[cVar.f1729g.ordinal()];
                if (i10 == 1) {
                    i6++;
                } else if (i10 == 2) {
                    i5++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(e4);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i10 == 3) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e4);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i10 == 4) {
                    i7++;
                    if (e4 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(e4);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i10 == 5) {
                    i8++;
                }
            }
        }
        long j4 = f1715n.get(this);
        return this.f1721h + '@' + M.b(this) + "[Pool Size {core = " + this.f1718e + ", max = " + this.f1719f + "}, Worker States {CPU = " + i4 + ", blocking = " + i5 + ", parked = " + i6 + ", dormant = " + i7 + ", terminated = " + i8 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f1722i.c() + ", global blocking queue size = " + this.f1723j.c() + ", Control State {created workers= " + ((int) (2097151 & j4)) + ", blocking tasks = " + ((int) ((4398044413952L & j4) >> 21)) + ", CPUs acquired = " + (this.f1718e - ((int) ((9223367638808264704L & j4) >> 42))) + "}]";
    }

    public final void w(long j4) {
        int i4;
        h hVar;
        if (f1716o.compareAndSet(this, 0, 1)) {
            c g4 = g();
            synchronized (this.f1724k) {
                i4 = (int) (f1715n.get(this) & 2097151);
            }
            if (1 <= i4) {
                int i5 = 1;
                while (true) {
                    Object b4 = this.f1724k.b(i5);
                    l.b(b4);
                    c cVar = (c) b4;
                    if (cVar != g4) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j4);
                        }
                        cVar.f1727e.f(this.f1723j);
                    }
                    if (i5 == i4) {
                        break;
                    }
                    i5++;
                }
            }
            this.f1723j.b();
            this.f1722i.b();
            while (true) {
                if (g4 != null) {
                    hVar = g4.g(true);
                    if (hVar != null) {
                        continue;
                        t(hVar);
                    }
                }
                hVar = (h) this.f1722i.d();
                if (hVar == null && (hVar = (h) this.f1723j.d()) == null) {
                    break;
                }
                t(hVar);
            }
            if (g4 != null) {
                g4.u(d.TERMINATED);
            }
            f1714m.set(this, 0);
            f1715n.set(this, 0);
        }
    }

    public final void x(long j4, boolean z4) {
        if (!z4 && !F() && !B(j4)) {
            F();
        }
    }

    public final void y() {
        if (!F() && !D(this, 0, 1, (Object) null)) {
            F();
        }
    }

    public final h z(c cVar, h hVar, boolean z4) {
        if (cVar == null || cVar.f1729g == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f1751f.b() == 0 && cVar.f1729g == d.BLOCKING) {
            return hVar;
        }
        cVar.f1733k = true;
        return cVar.f1727e.a(hVar, z4);
    }

    public final class c extends Thread {

        /* renamed from: m  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f1726m = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: e  reason: collision with root package name */
        public final n f1727e;

        /* renamed from: f  reason: collision with root package name */
        public final w f1728f;

        /* renamed from: g  reason: collision with root package name */
        public d f1729g;

        /* renamed from: h  reason: collision with root package name */
        public long f1730h;

        /* renamed from: i  reason: collision with root package name */
        public long f1731i;
        private volatile int indexInArray;

        /* renamed from: j  reason: collision with root package name */
        public int f1732j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1733k;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        public c() {
            setDaemon(true);
            this.f1727e = new n();
            this.f1728f = new w();
            this.f1729g = d.DORMANT;
            this.nextParkedWorker = a.f1717p;
            this.f1732j = x3.c.f12705e.b();
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f1726m;
        }

        public final void b(int i4) {
            if (i4 != 0) {
                a.f1715n.addAndGet(a.this, -2097152);
                if (this.f1729g != d.TERMINATED) {
                    this.f1729g = d.DORMANT;
                }
            }
        }

        public final void c(int i4) {
            if (i4 != 0 && u(d.BLOCKING)) {
                a.this.y();
            }
        }

        public final void d(h hVar) {
            int b4 = hVar.f1751f.b();
            k(b4);
            c(b4);
            a.this.t(hVar);
            b(b4);
        }

        public final h e(boolean z4) {
            h o4;
            h o5;
            if (z4) {
                boolean z5 = m(a.this.f1718e * 2) == 0;
                if (z5 && (o5 = o()) != null) {
                    return o5;
                }
                h g4 = this.f1727e.g();
                if (g4 != null) {
                    return g4;
                }
                if (!z5 && (o4 = o()) != null) {
                    return o4;
                }
            } else {
                h o6 = o();
                if (o6 != null) {
                    return o6;
                }
            }
            return v(3);
        }

        public final h f() {
            h h4 = this.f1727e.h();
            if (h4 != null) {
                return h4;
            }
            h hVar = (h) a.this.f1723j.d();
            return hVar == null ? v(1) : hVar;
        }

        public final h g(boolean z4) {
            return s() ? e(z4) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final void k(int i4) {
            this.f1730h = 0;
            if (this.f1729g == d.PARKING) {
                this.f1729g = d.BLOCKING;
            }
        }

        public final boolean l() {
            return this.nextParkedWorker != a.f1717p;
        }

        public final int m(int i4) {
            int i5 = this.f1732j;
            int i6 = i5 ^ (i5 << 13);
            int i7 = i6 ^ (i6 >> 17);
            int i8 = i7 ^ (i7 << 5);
            this.f1732j = i8;
            int i9 = i4 - 1;
            return (i9 & i4) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i4;
        }

        public final void n() {
            if (this.f1730h == 0) {
                this.f1730h = System.nanoTime() + a.this.f1720g;
            }
            LockSupport.parkNanos(a.this.f1720g);
            if (System.nanoTime() - this.f1730h >= 0) {
                this.f1730h = 0;
                w();
            }
        }

        public final h o() {
            if (m(2) == 0) {
                h hVar = (h) a.this.f1722i.d();
                return hVar != null ? hVar : (h) a.this.f1723j.d();
            }
            h hVar2 = (h) a.this.f1723j.d();
            return hVar2 != null ? hVar2 : (h) a.this.f1722i.d();
        }

        public final void p() {
            loop0:
            while (true) {
                boolean z4 = false;
                while (!a.this.j() && this.f1729g != d.TERMINATED) {
                    h g4 = g(this.f1733k);
                    if (g4 != null) {
                        this.f1731i = 0;
                        d(g4);
                    } else {
                        this.f1733k = false;
                        if (this.f1731i == 0) {
                            t();
                        } else if (!z4) {
                            z4 = true;
                        } else {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f1731i);
                            this.f1731i = 0;
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        public final void q(int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f1721h);
            sb.append("-worker-");
            sb.append(i4 == 0 ? "TERMINATED" : String.valueOf(i4));
            setName(sb.toString());
            this.indexInArray = i4;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            p();
        }

        public final boolean s() {
            long j4;
            if (this.f1729g == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater b4 = a.f1715n;
            do {
                j4 = b4.get(aVar);
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    return false;
                }
            } while (!a.f1715n.compareAndSet(aVar, j4, j4 - 4398046511104L));
            this.f1729g = d.CPU_ACQUIRED;
            return true;
        }

        public final void t() {
            if (!l()) {
                a.this.r(this);
                return;
            }
            f1726m.set(this, -1);
            while (l() && f1726m.get(this) == -1 && !a.this.j() && this.f1729g != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f1729g;
            boolean z4 = dVar2 == d.CPU_ACQUIRED;
            if (z4) {
                a.f1715n.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f1729g = dVar;
            }
            return z4;
        }

        public final h v(int i4) {
            int i5 = (int) (a.f1715n.get(a.this) & 2097151);
            if (i5 < 2) {
                return null;
            }
            int m4 = m(i5);
            a aVar = a.this;
            long j4 = Long.MAX_VALUE;
            for (int i6 = 0; i6 < i5; i6++) {
                m4++;
                if (m4 > i5) {
                    m4 = 1;
                }
                c cVar = (c) aVar.f1724k.b(m4);
                if (cVar == null || cVar == this) {
                    int i7 = i4;
                } else {
                    long n4 = cVar.f1727e.n(i4, this.f1728f);
                    if (n4 == -1) {
                        w wVar = this.f1728f;
                        h hVar = (h) wVar.f12469e;
                        wVar.f12469e = null;
                        return hVar;
                    } else if (n4 > 0) {
                        j4 = Math.min(j4, n4);
                    }
                }
            }
            if (j4 == Long.MAX_VALUE) {
                j4 = 0;
            }
            this.f1731i = j4;
            return null;
        }

        public final void w() {
            a aVar = a.this;
            synchronized (aVar.f1724k) {
                try {
                    if (!aVar.j()) {
                        if (((int) (a.f1715n.get(aVar) & 2097151)) > aVar.f1718e) {
                            if (f1726m.compareAndSet(this, -1, 1)) {
                                int i4 = this.indexInArray;
                                q(0);
                                aVar.s(this, i4, 0);
                                int andDecrement = (int) (a.f1715n.getAndDecrement(aVar) & 2097151);
                                if (andDecrement != i4) {
                                    Object b4 = aVar.f1724k.b(andDecrement);
                                    l.b(b4);
                                    c cVar = (c) b4;
                                    aVar.f1724k.c(i4, cVar);
                                    cVar.q(i4);
                                    aVar.s(cVar, andDecrement, i4);
                                }
                                aVar.f1724k.c(andDecrement, (Object) null);
                                C0673n nVar = C0673n.f9639a;
                                this.f1729g = d.TERMINATED;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(a aVar, int i4) {
            this();
            q(i4);
        }
    }
}
