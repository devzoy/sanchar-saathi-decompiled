package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0407a0;

public final class O0 implements C0481z0 {

    /* renamed from: a  reason: collision with root package name */
    public final B0 f6860a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6861b;

    /* renamed from: c  reason: collision with root package name */
    public final P0 f6862c;

    public O0(B0 b02, String str, Object[] objArr) {
        this.f6860a = b02;
        this.f6861b = str;
        this.f6862c = new P0(b02.getClass(), str, objArr);
    }

    public final int a() {
        return (this.f6862c.f6873d & 1) == 1 ? C0407a0.c.f7028i : C0407a0.c.f7029j;
    }

    public final boolean b() {
        return (this.f6862c.f6873d & 2) == 2;
    }

    public final B0 c() {
        return this.f6860a;
    }

    public final int d() {
        return this.f6862c.f6874e;
    }

    public final P0 e() {
        return this.f6862c;
    }

    public final int f() {
        return this.f6862c.f6877h;
    }

    public final int g() {
        return this.f6862c.f6878i;
    }

    public final int h() {
        return this.f6862c.f6879j;
    }

    public final int i() {
        return this.f6862c.f6882m;
    }

    public final int[] j() {
        return this.f6862c.f6883n;
    }

    public final int k() {
        return this.f6862c.f6881l;
    }

    public final int l() {
        return this.f6862c.f6880k;
    }
}
