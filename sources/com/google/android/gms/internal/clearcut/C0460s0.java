package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.s0  reason: case insensitive filesystem */
public final class C0460s0 implements A0 {

    /* renamed from: a  reason: collision with root package name */
    public A0[] f7156a;

    public C0460s0(A0... a0Arr) {
        this.f7156a = a0Arr;
    }

    public final boolean a(Class cls) {
        for (A0 a4 : this.f7156a) {
            if (a4.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final C0481z0 b(Class cls) {
        for (A0 a02 : this.f7156a) {
            if (a02.a(cls)) {
                return a02.b(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
