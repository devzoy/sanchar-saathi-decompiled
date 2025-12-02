package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0407a0;

/* renamed from: com.google.android.gms.internal.clearcut.q0  reason: case insensitive filesystem */
public final class C0455q0 implements S0 {

    /* renamed from: b  reason: collision with root package name */
    public static final A0 f7152b = new C0457r0();

    /* renamed from: a  reason: collision with root package name */
    public final A0 f7153a;

    public C0455q0() {
        this(new C0460s0(Z.c(), c()));
    }

    public static boolean b(C0481z0 z0Var) {
        return z0Var.a() == C0407a0.c.f7028i;
    }

    public static A0 c() {
        try {
            return (A0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return f7152b;
        }
    }

    public final R0 a(Class cls) {
        T0.I(cls);
        C0481z0 b4 = this.f7153a.b(cls);
        Class<C0407a0> cls2 = C0407a0.class;
        if (b4.b()) {
            return cls2.isAssignableFrom(cls) ? G0.a(T0.B(), T.b(), b4.c()) : G0.a(T0.z(), T.c(), b4.c());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean b5 = b(b4);
            H0 b6 = J0.b();
            C0440l0 d4 = C0440l0.d();
            Y0 B4 = T0.B();
            if (b5) {
                return F0.s(cls, b4, b6, d4, B4, T.b(), C0478y0.b());
            }
            return F0.s(cls, b4, b6, d4, B4, (P) null, C0478y0.b());
        }
        boolean b7 = b(b4);
        H0 a4 = J0.a();
        C0440l0 c4 = C0440l0.c();
        if (b7) {
            return F0.s(cls, b4, a4, c4, T0.z(), T.c(), C0478y0.a());
        }
        return F0.s(cls, b4, a4, c4, T0.A(), (P) null, C0478y0.a());
    }

    public C0455q0(A0 a02) {
        this.f7153a = (A0) C0413c0.e(a02, "messageInfoFactory");
    }
}
