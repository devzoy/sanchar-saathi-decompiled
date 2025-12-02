package com.google.android.gms.internal.vision;

import A1.a;
import S1.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class C2 extends a {
    public static final Parcelable.Creator<C2> CREATOR = new E2();

    /* renamed from: e  reason: collision with root package name */
    public int f7199e;

    /* renamed from: f  reason: collision with root package name */
    public int f7200f;

    /* renamed from: g  reason: collision with root package name */
    public int f7201g;

    /* renamed from: h  reason: collision with root package name */
    public long f7202h;

    /* renamed from: i  reason: collision with root package name */
    public int f7203i;

    public C2() {
    }

    public static C2 d(c cVar) {
        C2 c22 = new C2();
        c22.f7199e = cVar.c().f();
        c22.f7200f = cVar.c().b();
        c22.f7203i = cVar.c().d();
        c22.f7201g = cVar.c().c();
        c22.f7202h = cVar.c().e();
        return c22;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = A1.c.a(parcel);
        A1.c.i(parcel, 2, this.f7199e);
        A1.c.i(parcel, 3, this.f7200f);
        A1.c.i(parcel, 4, this.f7201g);
        A1.c.k(parcel, 5, this.f7202h);
        A1.c.i(parcel, 6, this.f7203i);
        A1.c.b(parcel, a4);
    }

    public C2(int i4, int i5, int i6, long j4, int i7) {
        this.f7199e = i4;
        this.f7200f = i5;
        this.f7201g = i6;
        this.f7202h = j4;
        this.f7203i = i7;
    }
}
