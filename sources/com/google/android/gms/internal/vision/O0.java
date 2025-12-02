package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.N0;

public final class O0 implements C0549u1 {

    /* renamed from: a  reason: collision with root package name */
    public static final O0 f7323a = new O0();

    public static O0 c() {
        return f7323a;
    }

    public final boolean a(Class cls) {
        return N0.class.isAssignableFrom(cls);
    }

    public final C0540r1 b(Class cls) {
        Class<N0> cls2 = N0.class;
        if (!cls2.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (C0540r1) N0.l(cls.asSubclass(cls2)).n(N0.d.f7317c, (Object) null, (Object) null);
        } catch (Exception e4) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e4);
        }
    }
}
