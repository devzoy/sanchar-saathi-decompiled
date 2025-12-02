package com.google.android.gms.common.api;

import A1.a;
import A1.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import u1.C0941a;
import v1.C0949c;
import v1.C0956j;
import v1.m;
import z1.C1031n;

public final class Status extends a implements C0956j, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new m();

    /* renamed from: i  reason: collision with root package name */
    public static final Status f6637i = new Status(-1);

    /* renamed from: j  reason: collision with root package name */
    public static final Status f6638j = new Status(0);

    /* renamed from: k  reason: collision with root package name */
    public static final Status f6639k = new Status(14);

    /* renamed from: l  reason: collision with root package name */
    public static final Status f6640l = new Status(8);

    /* renamed from: m  reason: collision with root package name */
    public static final Status f6641m = new Status(15);

    /* renamed from: n  reason: collision with root package name */
    public static final Status f6642n = new Status(16);

    /* renamed from: o  reason: collision with root package name */
    public static final Status f6643o = new Status(17);

    /* renamed from: p  reason: collision with root package name */
    public static final Status f6644p = new Status(18);

    /* renamed from: e  reason: collision with root package name */
    public final int f6645e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6646f;

    /* renamed from: g  reason: collision with root package name */
    public final PendingIntent f6647g;

    /* renamed from: h  reason: collision with root package name */
    public final C0941a f6648h;

    public Status(int i4, String str, PendingIntent pendingIntent, C0941a aVar) {
        this.f6645e = i4;
        this.f6646f = str;
        this.f6647g = pendingIntent;
        this.f6648h = aVar;
    }

    public Status c() {
        return this;
    }

    public C0941a d() {
        return this.f6648h;
    }

    public int e() {
        return this.f6645e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f6645e == status.f6645e && C1031n.a(this.f6646f, status.f6646f) && C1031n.a(this.f6647g, status.f6647g) && C1031n.a(this.f6648h, status.f6648h);
    }

    public String g() {
        return this.f6646f;
    }

    public boolean h() {
        return this.f6647g != null;
    }

    public int hashCode() {
        return C1031n.b(Integer.valueOf(this.f6645e), this.f6646f, this.f6647g, this.f6648h);
    }

    public boolean i() {
        return this.f6645e <= 0;
    }

    public final String j() {
        String str = this.f6646f;
        return str != null ? str : C0949c.a(this.f6645e);
    }

    public String toString() {
        C1031n.a c4 = C1031n.c(this);
        c4.a("statusCode", j());
        c4.a("resolution", this.f6647g);
        return c4.toString();
    }

    public void writeToParcel(Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.i(parcel, 1, e());
        c.m(parcel, 2, g(), false);
        c.l(parcel, 3, this.f6647g, i4, false);
        c.l(parcel, 4, d(), i4, false);
        c.b(parcel, a4);
    }

    public Status(int i4) {
        this(i4, (String) null);
    }

    public Status(C0941a aVar, String str) {
        this(aVar, str, 17);
    }

    public Status(int i4, String str) {
        this(i4, str, (PendingIntent) null);
    }

    public Status(C0941a aVar, String str, int i4) {
        this(i4, str, aVar.g(), aVar);
    }

    public Status(int i4, String str, PendingIntent pendingIntent) {
        this(i4, str, pendingIntent, (C0941a) null);
    }
}
