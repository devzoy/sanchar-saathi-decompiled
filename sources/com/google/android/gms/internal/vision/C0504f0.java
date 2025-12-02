package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.vision.f0  reason: case insensitive filesystem */
public final class C0504f0 extends C0510h0 {

    /* renamed from: e  reason: collision with root package name */
    public int f7440e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final int f7441f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C0507g0 f7442g;

    public C0504f0(C0507g0 g0Var) {
        this.f7442g = g0Var;
        this.f7441f = g0Var.t();
    }

    public final byte a() {
        int i4 = this.f7440e;
        if (i4 < this.f7441f) {
            this.f7440e = i4 + 1;
            return this.f7442g.B(i4);
        }
        throw new NoSuchElementException();
    }

    public final boolean hasNext() {
        return this.f7440e < this.f7441f;
    }
}
