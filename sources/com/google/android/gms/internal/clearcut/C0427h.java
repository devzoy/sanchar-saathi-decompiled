package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.h  reason: case insensitive filesystem */
public final /* synthetic */ class C0427h implements C0442m {

    /* renamed from: a  reason: collision with root package name */
    public final String f7098a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7099b = false;

    public C0427h(String str, boolean z4) {
        this.f7098a = str;
    }

    public final Object a() {
        return Boolean.valueOf(Z1.h(C0418e.f7056i.getContentResolver(), this.f7098a, this.f7099b));
    }
}
