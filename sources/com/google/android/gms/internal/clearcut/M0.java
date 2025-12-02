package com.google.android.gms.internal.clearcut;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class M0 {

    /* renamed from: c  reason: collision with root package name */
    public static final M0 f6827c = new M0();

    /* renamed from: a  reason: collision with root package name */
    public final S0 f6828a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap f6829b = new ConcurrentHashMap();

    public M0() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        S0 s02 = null;
        for (int i4 = 0; i4 <= 0; i4++) {
            s02 = c(strArr[0]);
            if (s02 != null) {
                break;
            }
        }
        this.f6828a = s02 == null ? new C0455q0() : s02;
    }

    public static M0 a() {
        return f6827c;
    }

    public static S0 c(String str) {
        try {
            return (S0) Class.forName(str).getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final R0 b(Class cls) {
        C0413c0.e(cls, "messageType");
        R0 r02 = (R0) this.f6829b.get(cls);
        if (r02 != null) {
            return r02;
        }
        R0 a4 = this.f6828a.a(cls);
        C0413c0.e(cls, "messageType");
        C0413c0.e(a4, "schema");
        R0 r03 = (R0) this.f6829b.putIfAbsent(cls, a4);
        return r03 != null ? r03 : a4;
    }

    public final R0 d(Object obj) {
        return b(obj.getClass());
    }
}
