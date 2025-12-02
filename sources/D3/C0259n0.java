package D3;

import h3.C0673n;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import u3.l;

/* renamed from: D3.n0  reason: case insensitive filesystem */
public final class C0259n0 extends r0 {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f834j = AtomicIntegerFieldUpdater.newUpdater(C0259n0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: i  reason: collision with root package name */
    public final l f835i;

    public C0259n0(l lVar) {
        this.f835i = lVar;
    }

    public /* bridge */ /* synthetic */ Object i(Object obj) {
        z((Throwable) obj);
        return C0673n.f9639a;
    }

    public void z(Throwable th) {
        if (f834j.compareAndSet(this, 0, 1)) {
            this.f835i.i(th);
        }
    }
}
