package K3;

import F3.i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v3.w;
import w.b;

public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1763b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1764c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1765d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1766e;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray f1767a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        Class<n> cls = n.class;
        f1763b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f1764c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f1765d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f1766e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final h a(h hVar, boolean z4) {
        if (z4) {
            return b(hVar);
        }
        h hVar2 = (h) f1763b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        if (hVar.f1751f.b() == 1) {
            f1766e.incrementAndGet(this);
        }
        int i4 = f1764c.get(this) & 127;
        while (this.f1767a.get(i4) != null) {
            Thread.yield();
        }
        this.f1767a.lazySet(i4, hVar);
        f1764c.incrementAndGet(this);
        return null;
    }

    public final void c(h hVar) {
        if (hVar != null && hVar.f1751f.b() == 1) {
            f1766e.decrementAndGet(this);
        }
    }

    public final int d() {
        return f1764c.get(this) - f1765d.get(this);
    }

    public final int e() {
        return f1763b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f1763b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        do {
        } while (j(dVar));
    }

    public final h g() {
        h hVar = (h) f1763b.getAndSet(this, (Object) null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    public final h i() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1765d;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 - f1764c.get(this) == 0) {
                return null;
            }
            int i5 = i4 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 + 1) && (hVar = (h) this.f1767a.getAndSet(i5, (Object) null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    public final boolean j(d dVar) {
        h i4 = i();
        if (i4 == null) {
            return false;
        }
        dVar.a(i4);
        return true;
    }

    public final h k(boolean z4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f1763b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                boolean z5 = true;
                if (hVar.f1751f.b() != 1) {
                    z5 = false;
                }
                if (z5 == z4) {
                }
            }
            int i4 = f1765d.get(this);
            int i5 = f1764c.get(this);
            while (i4 != i5) {
                if (z4 && f1766e.get(this) == 0) {
                    return null;
                }
                i5--;
                h m4 = m(i5, z4);
                if (m4 != null) {
                    return m4;
                }
            }
            return null;
        } while (!b.a(atomicReferenceFieldUpdater, this, hVar, (Object) null));
        return hVar;
    }

    public final h l(int i4) {
        int i5 = f1765d.get(this);
        int i6 = f1764c.get(this);
        boolean z4 = true;
        if (i4 != 1) {
            z4 = false;
        }
        while (i5 != i6) {
            if (z4 && f1766e.get(this) == 0) {
                return null;
            }
            int i7 = i5 + 1;
            h m4 = m(i5, z4);
            if (m4 != null) {
                return m4;
            }
            i5 = i7;
        }
        return null;
    }

    public final h m(int i4, boolean z4) {
        int i5 = i4 & 127;
        h hVar = (h) this.f1767a.get(i5);
        if (hVar != null) {
            boolean z5 = true;
            if (hVar.f1751f.b() != 1) {
                z5 = false;
            }
            if (z5 == z4 && i.a(this.f1767a, i5, hVar, (Object) null)) {
                if (z4) {
                    f1766e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    public final long n(int i4, w wVar) {
        h i5 = i4 == 3 ? i() : l(i4);
        if (i5 == null) {
            return o(i4, wVar);
        }
        wVar.f12469e = i5;
        return -1;
    }

    public final long o(int i4, w wVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f1763b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar == null) {
                return -2;
            }
            int i5 = 1;
            if (hVar.f1751f.b() != 1) {
                i5 = 2;
            }
            if ((i5 & i4) == 0) {
                return -2;
            }
            long a4 = l.f1759f.a() - hVar.f1750e;
            long j4 = l.f1755b;
            if (a4 < j4) {
                return j4 - a4;
            }
        } while (!b.a(atomicReferenceFieldUpdater, this, hVar, (Object) null));
        wVar.f12469e = hVar;
        return -1;
    }
}
