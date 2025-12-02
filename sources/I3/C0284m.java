package I3;

import D3.F;
import D3.H;
import D3.O;
import D3.Q;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l3.i;
import l3.j;

/* renamed from: I3.m  reason: case insensitive filesystem */
public final class C0284m extends F implements Q {

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1559l = AtomicIntegerFieldUpdater.newUpdater(C0284m.class, "runningWorkers");

    /* renamed from: g  reason: collision with root package name */
    public final F f1560g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1561h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Q f1562i;

    /* renamed from: j  reason: collision with root package name */
    public final r f1563j;

    /* renamed from: k  reason: collision with root package name */
    public final Object f1564k;
    private volatile int runningWorkers;

    /* renamed from: I3.m$a */
    public final class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public Runnable f1565e;

        public a(Runnable runnable) {
            this.f1565e = runnable;
        }

        public void run() {
            int i4 = 0;
            while (true) {
                try {
                    this.f1565e.run();
                } catch (Throwable th) {
                    H.a(j.f11131e, th);
                }
                Runnable O4 = C0284m.this.P();
                if (O4 != null) {
                    this.f1565e = O4;
                    i4++;
                    if (i4 >= 16 && C0284m.this.f1560g.L(C0284m.this)) {
                        C0284m.this.f1560g.K(C0284m.this, this);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C0284m(F f4, int i4) {
        this.f1560g = f4;
        this.f1561h = i4;
        Q q4 = f4 instanceof Q ? (Q) f4 : null;
        this.f1562i = q4 == null ? O.a() : q4;
        this.f1563j = new r(false);
        this.f1564k = new Object();
    }

    public void K(i iVar, Runnable runnable) {
        Runnable P4;
        this.f1563j.a(runnable);
        if (f1559l.get(this) < this.f1561h && Q() && (P4 = P()) != null) {
            this.f1560g.K(this, new a(P4));
        }
    }

    public final Runnable P() {
        while (true) {
            Runnable runnable = (Runnable) this.f1563j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1564k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1559l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1563j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean Q() {
        synchronized (this.f1564k) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1559l;
            if (atomicIntegerFieldUpdater.get(this) >= this.f1561h) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
