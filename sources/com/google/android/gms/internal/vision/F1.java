package com.google.android.gms.internal.vision;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class F1 {

    /* renamed from: c  reason: collision with root package name */
    public static final F1 f7221c = new F1();

    /* renamed from: a  reason: collision with root package name */
    public final M1 f7222a = new C0520k1();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap f7223b = new ConcurrentHashMap();

    public static F1 a() {
        return f7221c;
    }

    public final K1 b(Class cls) {
        R0.f(cls, "messageType");
        K1 k12 = (K1) this.f7223b.get(cls);
        if (k12 != null) {
            return k12;
        }
        K1 a4 = this.f7222a.a(cls);
        R0.f(cls, "messageType");
        R0.f(a4, "schema");
        K1 k13 = (K1) this.f7223b.putIfAbsent(cls, a4);
        return k13 != null ? k13 : a4;
    }

    public final K1 c(Object obj) {
        return b(obj.getClass());
    }
}
