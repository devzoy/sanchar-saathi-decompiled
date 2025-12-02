package I3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v3.g;

public final class s {

    /* renamed from: e  reason: collision with root package name */
    public static final a f1574e = new a((g) null);

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1575f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1576g;

    /* renamed from: h  reason: collision with root package name */
    public static final F f1577h = new F("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a  reason: collision with root package name */
    public final int f1578a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1579b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1580c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceArray f1581d;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final int a(long j4) {
            return (j4 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j4, int i4) {
            return d(j4, 1073741823) | ((long) i4);
        }

        public final long c(long j4, int i4) {
            return d(j4, 1152921503533105152L) | (((long) i4) << 30);
        }

        public final long d(long j4, long j5) {
            return j4 & (~j5);
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f1582a;

        public b(int i4) {
            this.f1582a = i4;
        }
    }

    static {
        Class<s> cls = s.class;
        f1575f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f1576g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public s(int i4, boolean z4) {
        this.f1578a = i4;
        this.f1579b = z4;
        int i5 = i4 - 1;
        this.f1580c = i5;
        this.f1581d = new AtomicReferenceArray(i4);
        if (i5 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        } else if ((i4 & i5) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[LOOP:1: B:20:0x006a->B:23:0x007f, LOOP_START, PHI: r0 
      PHI: (r0v3 I3.s) = (r0v2 I3.s), (r0v5 I3.s) binds: [B:19:0x0062, B:23:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f1576g
        L_0x0002:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0016
            I3.s$a r13 = f1574e
            int r13 = r13.a(r3)
            return r13
        L_0x0016:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f1580c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L_0x0030
            return r6
        L_0x0030:
            boolean r2 = r12.f1579b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f1581d
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L_0x004f
            int r2 = r12.f1578a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x004e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L_0x0002
        L_0x004e:
            return r6
        L_0x004f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f1576g
            I3.s$a r5 = f1574e
            long r5 = r5.c(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0002
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f1581d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L_0x006a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f1576g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0081
            I3.s r0 = r0.i()
            I3.s r0 = r0.e(r9, r13)
            if (r0 != 0) goto L_0x006a
        L_0x0081:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.s.a(java.lang.Object):int");
    }

    public final s b(long j4) {
        s sVar = new s(this.f1578a * 2, this.f1579b);
        int i4 = (int) (1073741823 & j4);
        int i5 = (int) ((1152921503533105152L & j4) >> 30);
        while (true) {
            int i6 = this.f1580c;
            if ((i4 & i6) != (i5 & i6)) {
                Object obj = this.f1581d.get(i6 & i4);
                if (obj == null) {
                    obj = new b(i4);
                }
                sVar.f1581d.set(sVar.f1580c & i4, obj);
                i4++;
            } else {
                f1576g.set(sVar, f1574e.d(j4, 1152921504606846976L));
                return sVar;
            }
        }
    }

    public final s c(long j4) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1575f;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar != null) {
                return sVar;
            }
            w.b.a(f1575f, this, (Object) null, b(j4));
        }
    }

    public final boolean d() {
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1576g;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j4 | 2305843009213693952L));
        return true;
    }

    public final s e(int i4, Object obj) {
        Object obj2 = this.f1581d.get(this.f1580c & i4);
        if (!(obj2 instanceof b) || ((b) obj2).f1582a != i4) {
            return null;
        }
        this.f1581d.set(i4 & this.f1580c, obj);
        return this;
    }

    public final int f() {
        long j4 = f1576g.get(this);
        return (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j4))) & 1073741823;
    }

    public final boolean g() {
        long j4 = f1576g.get(this);
        return ((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30));
    }

    public final long h() {
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1576g;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                return j4;
            }
            j5 = j4 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j5));
        return j5;
    }

    public final s i() {
        return c(h());
    }

    public final Object j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1576g;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j4) != 0) {
                return f1577h;
            }
            int i4 = (int) (1073741823 & j4);
            int i5 = this.f1580c;
            if ((((int) ((1152921503533105152L & j4) >> 30)) & i5) == (i4 & i5)) {
                return null;
            }
            Object obj = this.f1581d.get(i5 & i4);
            if (obj == null) {
                if (this.f1579b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i6 = (i4 + 1) & 1073741823;
                if (f1576g.compareAndSet(this, j4, f1574e.b(j4, i6))) {
                    this.f1581d.set(this.f1580c & i4, (Object) null);
                    return obj;
                } else if (this.f1579b) {
                    s sVar = this;
                    do {
                        sVar = sVar.k(i4, i6);
                    } while (sVar != null);
                    return obj;
                }
            }
        }
    }

    public final s k(int i4, int i5) {
        long j4;
        int i6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1576g;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            i6 = (int) (1073741823 & j4);
            if ((1152921504606846976L & j4) != 0) {
                return i();
            }
        } while (!f1576g.compareAndSet(this, j4, f1574e.b(j4, i5)));
        this.f1581d.set(this.f1580c & i6, (Object) null);
        return null;
    }
}
