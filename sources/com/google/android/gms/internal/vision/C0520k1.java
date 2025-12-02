package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.k1  reason: case insensitive filesystem */
public final class C0520k1 implements M1 {

    /* renamed from: b  reason: collision with root package name */
    public static final C0549u1 f7483b = new C0517j1();

    /* renamed from: a  reason: collision with root package name */
    public final C0549u1 f7484a;

    public C0520k1() {
        this(new C0526m1(O0.c(), b()));
    }

    public static C0549u1 b() {
        try {
            return (C0549u1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return f7483b;
        }
    }

    public static boolean c(C0540r1 r1Var) {
        return r1Var.a() == G1.f7284a;
    }

    public final K1 a(Class cls) {
        L1.p(cls);
        C0540r1 b4 = this.f7484a.b(cls);
        Class<N0> cls2 = N0.class;
        if (b4.d()) {
            return cls2.isAssignableFrom(cls) ? C0564z1.j(L1.B(), D0.a(), b4.b()) : C0564z1.j(L1.f(), D0.b(), b4.b());
        }
        if (cls2.isAssignableFrom(cls)) {
            if (c(b4)) {
                return C0558x1.p(cls, b4, B1.b(), C0493c1.c(), L1.B(), D0.a(), C0543s1.b());
            }
            return C0558x1.p(cls, b4, B1.b(), C0493c1.c(), L1.B(), (C0) null, C0543s1.b());
        } else if (c(b4)) {
            return C0558x1.p(cls, b4, B1.a(), C0493c1.a(), L1.f(), D0.b(), C0543s1.a());
        } else {
            return C0558x1.p(cls, b4, B1.a(), C0493c1.a(), L1.v(), (C0) null, C0543s1.a());
        }
    }

    public C0520k1(C0549u1 u1Var) {
        this.f7484a = (C0549u1) R0.f(u1Var, "messageInfoFactory");
    }
}
