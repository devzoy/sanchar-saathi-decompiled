package D3;

import I3.B;
import I3.C0282k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import l3.e;
import l3.i;
import m3.C0794b;
import m3.C0795c;
import u3.l;

public final class S extends B {

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f800i = AtomicIntegerFieldUpdater.newUpdater(S.class, "_decision");
    private volatile int _decision;

    public S(i iVar, e eVar) {
        super(iVar, eVar);
    }

    private final boolean U0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f800i;
        do {
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f800i.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean V0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f800i;
        do {
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f800i.compareAndSet(this, 0, 1));
        return true;
    }

    public void P(Object obj) {
        P0(obj);
    }

    public void P0(Object obj) {
        if (!U0()) {
            C0282k.c(C0794b.b(this.f1524h), D.a(obj, this.f1524h), (l) null, 2, (Object) null);
        }
    }

    public final Object T0() {
        if (V0()) {
            return C0795c.c();
        }
        Object h4 = x0.h(k0());
        if (!(h4 instanceof C0271z)) {
            return h4;
        }
        throw ((C0271z) h4).f872a;
    }
}
