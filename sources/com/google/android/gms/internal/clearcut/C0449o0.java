package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.o0  reason: case insensitive filesystem */
public final class C0449o0 extends C0440l0 {
    public C0449o0() {
        super();
    }

    public static C0422f0 e(Object obj, long j4) {
        return (C0422f0) C0423f1.M(obj, j4);
    }

    public final void a(Object obj, long j4) {
        e(obj, j4).m();
    }

    public final void b(Object obj, Object obj2, long j4) {
        C0422f0 e4 = e(obj, j4);
        C0422f0 e5 = e(obj2, j4);
        int size = e4.size();
        int size2 = e5.size();
        if (size > 0 && size2 > 0) {
            if (!e4.j()) {
                e4 = e4.h(size2 + size);
            }
            e4.addAll(e5);
        }
        if (size > 0) {
            e5 = e4;
        }
        C0423f1.i(obj, j4, e5);
    }
}
