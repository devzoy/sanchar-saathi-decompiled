package I3;

import D3.C0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l3.i;

public abstract class C extends C0276e implements C0 {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1525h = AtomicIntegerFieldUpdater.newUpdater(C.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: g  reason: collision with root package name */
    public final long f1526g;

    public C(long j4, C c4, int i4) {
        super(c4);
        this.f1526g = j4;
        this.cleanedAndPointers = i4 << 16;
    }

    public boolean h() {
        return f1525h.get(this) == n() && !i();
    }

    public final boolean m() {
        return f1525h.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i4, Throwable th, i iVar);

    public final void p() {
        if (f1525h.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1525h;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 65536 + i4));
        return true;
    }
}
