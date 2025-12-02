package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0407a0;

public final class Z implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Z f6994a = new Z();

    public static Z c() {
        return f6994a;
    }

    public final boolean a(Class cls) {
        return C0407a0.class.isAssignableFrom(cls);
    }

    public final C0481z0 b(Class cls) {
        Class<C0407a0> cls2 = C0407a0.class;
        if (!cls2.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (C0481z0) C0407a0.q(cls.asSubclass(cls2)).k(C0407a0.c.f7022c, (Object) null, (Object) null);
        } catch (Exception e4) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e4);
        }
    }
}
