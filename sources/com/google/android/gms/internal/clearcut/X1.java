package com.google.android.gms.internal.clearcut;

import A1.a;
import A1.c;
import android.os.Parcel;
import android.os.Parcelable;
import z1.C1031n;
import z1.C1032o;

public final class X1 extends a {
    public static final Parcelable.Creator<X1> CREATOR = new Y1();

    /* renamed from: e  reason: collision with root package name */
    public final String f6979e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6980f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6981g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6982h;

    /* renamed from: i  reason: collision with root package name */
    public final String f6983i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6984j;

    /* renamed from: k  reason: collision with root package name */
    public final String f6985k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f6986l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6987m;

    public X1(String str, int i4, int i5, String str2, String str3, String str4, boolean z4, E1 e12) {
        this.f6979e = (String) C1032o.f(str);
        this.f6980f = i4;
        this.f6981g = i5;
        this.f6985k = str2;
        this.f6982h = str3;
        this.f6983i = str4;
        this.f6984j = !z4;
        this.f6986l = z4;
        this.f6987m = e12.f();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof X1) {
            X1 x12 = (X1) obj;
            return C1031n.a(this.f6979e, x12.f6979e) && this.f6980f == x12.f6980f && this.f6981g == x12.f6981g && C1031n.a(this.f6985k, x12.f6985k) && C1031n.a(this.f6982h, x12.f6982h) && C1031n.a(this.f6983i, x12.f6983i) && this.f6984j == x12.f6984j && this.f6986l == x12.f6986l && this.f6987m == x12.f6987m;
        }
    }

    public final int hashCode() {
        return C1031n.b(this.f6979e, Integer.valueOf(this.f6980f), Integer.valueOf(this.f6981g), this.f6985k, this.f6982h, this.f6983i, Boolean.valueOf(this.f6984j), Boolean.valueOf(this.f6986l), Integer.valueOf(this.f6987m));
    }

    public final String toString() {
        return "PlayLoggerContext[" + "package=" + this.f6979e + ',' + "packageVersionCode=" + this.f6980f + ',' + "logSource=" + this.f6981g + ',' + "logSourceName=" + this.f6985k + ',' + "uploadAccount=" + this.f6982h + ',' + "loggingId=" + this.f6983i + ',' + "logAndroidId=" + this.f6984j + ',' + "isAnonymous=" + this.f6986l + ',' + "qosTier=" + this.f6987m + "]";
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.m(parcel, 2, this.f6979e, false);
        c.i(parcel, 3, this.f6980f);
        c.i(parcel, 4, this.f6981g);
        c.m(parcel, 5, this.f6982h, false);
        c.m(parcel, 6, this.f6983i, false);
        c.c(parcel, 7, this.f6984j);
        c.m(parcel, 8, this.f6985k, false);
        c.c(parcel, 9, this.f6986l);
        c.i(parcel, 10, this.f6987m);
        c.b(parcel, a4);
    }

    public X1(String str, int i4, int i5, String str2, String str3, boolean z4, String str4, boolean z5, int i6) {
        this.f6979e = str;
        this.f6980f = i4;
        this.f6981g = i5;
        this.f6982h = str2;
        this.f6983i = str3;
        this.f6984j = z4;
        this.f6985k = str4;
        this.f6986l = z5;
        this.f6987m = i6;
    }
}
