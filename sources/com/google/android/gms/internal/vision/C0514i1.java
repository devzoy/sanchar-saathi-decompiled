package com.google.android.gms.internal.vision;

import A1.a;
import A1.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.vision.i1  reason: case insensitive filesystem */
public final class C0514i1 extends a {
    public static final Parcelable.Creator<C0514i1> CREATOR = new L0();

    /* renamed from: e  reason: collision with root package name */
    public int f7477e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7478f;

    public C0514i1() {
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.i(parcel, 2, this.f7477e);
        c.c(parcel, 3, this.f7478f);
        c.b(parcel, a4);
    }

    public C0514i1(int i4, boolean z4) {
        this.f7477e = i4;
        this.f7478f = z4;
    }
}
