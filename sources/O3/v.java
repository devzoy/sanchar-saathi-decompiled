package O3;

import java.util.concurrent.atomic.AtomicReference;
import v3.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f2147a = new v();

    /* renamed from: b  reason: collision with root package name */
    public static final int f2148b = 65536;

    /* renamed from: c  reason: collision with root package name */
    public static final u f2149c = new u(new byte[0], 0, 0, false, false);

    /* renamed from: d  reason: collision with root package name */
    public static final int f2150d;

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReference[] f2151e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f2150d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i4 = 0; i4 < highestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference();
        }
        f2151e = atomicReferenceArr;
    }

    public static final void b(u uVar) {
        l.e(uVar, "segment");
        if (uVar.f2145f != null || uVar.f2146g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (!uVar.f2143d) {
            AtomicReference a4 = f2147a.a();
            u uVar2 = f2149c;
            u uVar3 = (u) a4.getAndSet(uVar2);
            if (uVar3 != uVar2) {
                int i4 = uVar3 != null ? uVar3.f2142c : 0;
                if (i4 >= f2148b) {
                    a4.set(uVar3);
                    return;
                }
                uVar.f2145f = uVar3;
                uVar.f2141b = 0;
                uVar.f2142c = i4 + 8192;
                a4.set(uVar);
            }
        }
    }

    public static final u c() {
        AtomicReference a4 = f2147a.a();
        u uVar = f2149c;
        u uVar2 = (u) a4.getAndSet(uVar);
        if (uVar2 == uVar) {
            return new u();
        }
        if (uVar2 == null) {
            a4.set((Object) null);
            return new u();
        }
        a4.set(uVar2.f2145f);
        uVar2.f2145f = null;
        uVar2.f2142c = 0;
        return uVar2;
    }

    public final AtomicReference a() {
        return f2151e[(int) (Thread.currentThread().getId() & (((long) f2150d) - 1))];
    }
}
