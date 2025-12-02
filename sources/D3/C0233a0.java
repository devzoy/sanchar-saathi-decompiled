package D3;

import I3.L;
import I3.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l3.i;
import v3.l;
import w.b;

/* renamed from: D3.a0  reason: case insensitive filesystem */
public abstract class C0233a0 extends C0235b0 implements Q {

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f812j;

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f813k;

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f814l;
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: D3.a0$a */
    public static final class a extends L {
    }

    static {
        Class<C0233a0> cls = C0233a0.class;
        Class<Object> cls2 = Object.class;
        f812j = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        f813k = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
        f814l = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted");
    }

    private final boolean D() {
        return f814l.get(this) != 0;
    }

    public final void K(i iVar, Runnable runnable) {
        e0(runnable);
    }

    public long R() {
        if (super.R() == 0) {
            return 0;
        }
        Object obj = f812j.get(this);
        if (obj != null) {
            if (!(obj instanceof s)) {
                return obj == C0239d0.f817b ? Long.MAX_VALUE : 0;
            }
            if (!((s) obj).g()) {
                return 0;
            }
        }
        a aVar = (a) f813k.get(this);
        return Long.MAX_VALUE;
    }

    public long W() {
        if (X()) {
            return 0;
        }
        a aVar = (a) f813k.get(this);
        Runnable d02 = d0();
        if (d02 == null) {
            return R();
        }
        d02.run();
        return 0;
    }

    public void Z() {
        J0.f784a.c();
        j0(true);
        c0();
        do {
        } while (W() <= 0);
        h0();
    }

    public final void c0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f812j;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (b.a(f812j, this, (Object) null, C0239d0.f817b)) {
                    return;
                }
            } else if (obj instanceof s) {
                ((s) obj).d();
                return;
            } else if (obj != C0239d0.f817b) {
                s sVar = new s(8, true);
                l.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                if (b.a(f812j, this, obj, sVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final Runnable d0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f812j;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof s) {
                l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                s sVar = (s) obj;
                Object j4 = sVar.j();
                if (j4 != s.f1577h) {
                    return (Runnable) j4;
                }
                b.a(f812j, this, obj, sVar.i());
            } else if (obj == C0239d0.f817b) {
                return null;
            } else {
                if (b.a(f812j, this, obj, (Object) null)) {
                    l.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void e0(Runnable runnable) {
        if (f0(runnable)) {
            b0();
        } else {
            N.f795m.e0(runnable);
        }
    }

    public final boolean f0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f812j;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (D()) {
                return false;
            }
            if (obj == null) {
                if (b.a(f812j, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof s) {
                l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                s sVar = (s) obj;
                int a4 = sVar.a(runnable);
                if (a4 == 0) {
                    return true;
                }
                if (a4 == 1) {
                    b.a(f812j, this, obj, sVar.i());
                } else if (a4 == 2) {
                    return false;
                }
            } else if (obj == C0239d0.f817b) {
                return false;
            } else {
                s sVar2 = new s(8, true);
                l.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar2.a((Runnable) obj);
                sVar2.a(runnable);
                if (b.a(f812j, this, obj, sVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean g0() {
        if (!V()) {
            return false;
        }
        a aVar = (a) f813k.get(this);
        Object obj = f812j.get(this);
        if (obj != null) {
            if (obj instanceof s) {
                return ((s) obj).g();
            }
            if (obj != C0239d0.f817b) {
                return false;
            }
        }
        return true;
    }

    public final void h0() {
        C0236c.a();
        System.nanoTime();
        a aVar = (a) f813k.get(this);
    }

    public final void i0() {
        f812j.set(this, (Object) null);
        f813k.set(this, (Object) null);
    }

    public final void j0(boolean z4) {
        f814l.set(this, z4 ? 1 : 0);
    }
}
