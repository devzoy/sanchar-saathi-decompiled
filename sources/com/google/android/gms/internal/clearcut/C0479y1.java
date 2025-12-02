package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.y1  reason: case insensitive filesystem */
public abstract class C0479y1 {

    /* renamed from: e  reason: collision with root package name */
    public volatile int f7186e = -1;

    public static final void b(C0479y1 y1Var, byte[] bArr, int i4, int i5) {
        try {
            C0467u1 q4 = C0467u1.q(bArr, 0, i5);
            y1Var.a(q4);
            q4.n();
        } catch (IOException e4) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e4);
        }
    }

    public abstract void a(C0467u1 u1Var);

    public final int e() {
        int g4 = g();
        this.f7186e = g4;
        return g4;
    }

    public abstract int g();

    public C0479y1 h() {
        return (C0479y1) super.clone();
    }

    public String toString() {
        return A1.a(this);
    }
}
