package com.google.android.gms.common.api;

import A1.a;
import A1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import v1.l;
import z1.C1032o;

public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new l();

    /* renamed from: e  reason: collision with root package name */
    public final int f6635e;

    /* renamed from: f  reason: collision with root package name */
    public final String f6636f;

    public Scope(int i4, String str) {
        C1032o.e(str, "scopeUri must not be null or empty");
        this.f6635e = i4;
        this.f6636f = str;
    }

    public String d() {
        return this.f6636f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f6636f.equals(((Scope) obj).f6636f);
    }

    public int hashCode() {
        return this.f6636f.hashCode();
    }

    public String toString() {
        return this.f6636f;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.f6635e;
        int a4 = c.a(parcel);
        c.i(parcel, 1, i5);
        c.m(parcel, 2, d(), false);
        c.b(parcel, a4);
    }

    public Scope(String str) {
        this(1, str);
    }
}
