package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.h1  reason: case insensitive filesystem */
public final class C0511h1 extends C0493c1 {
    public C0511h1() {
        super();
    }

    public static X0 e(Object obj, long j4) {
        return (X0) h2.F(obj, j4);
    }

    public final void b(Object obj, Object obj2, long j4) {
        X0 e4 = e(obj, j4);
        X0 e5 = e(obj2, j4);
        int size = e4.size();
        int size2 = e5.size();
        if (size > 0 && size2 > 0) {
            if (!e4.a()) {
                e4 = e4.b(size2 + size);
            }
            e4.addAll(e5);
        }
        if (size > 0) {
            e5 = e4;
        }
        h2.j(obj, j4, e5);
    }

    public final void d(Object obj, long j4) {
        e(obj, j4).d();
    }
}
