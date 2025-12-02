package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.m1  reason: case insensitive filesystem */
public final class C0526m1 implements C0549u1 {

    /* renamed from: a  reason: collision with root package name */
    public C0549u1[] f7486a;

    public C0526m1(C0549u1... u1VarArr) {
        this.f7486a = u1VarArr;
    }

    public final boolean a(Class cls) {
        for (C0549u1 a4 : this.f7486a) {
            if (a4.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final C0540r1 b(Class cls) {
        for (C0549u1 u1Var : this.f7486a) {
            if (u1Var.a(cls)) {
                return u1Var.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
