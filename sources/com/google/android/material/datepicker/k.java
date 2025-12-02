package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class k implements Comparable, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public final Calendar f7943e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7944f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7945g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7946h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7947i;

    /* renamed from: j  reason: collision with root package name */
    public final long f7948j;

    /* renamed from: k  reason: collision with root package name */
    public String f7949k;

    public static class a implements Parcelable.Creator {
        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return k.l(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public k[] newArray(int i4) {
            return new k[i4];
        }
    }

    public k(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d4 = r.d(calendar);
        this.f7943e = d4;
        this.f7944f = d4.get(2);
        this.f7945g = d4.get(1);
        this.f7946h = d4.getMaximum(7);
        this.f7947i = d4.getActualMaximum(5);
        this.f7948j = d4.getTimeInMillis();
    }

    public static k l(int i4, int i5) {
        Calendar i6 = r.i();
        i6.set(1, i4);
        i6.set(2, i5);
        return new k(i6);
    }

    public static k m(long j4) {
        Calendar i4 = r.i();
        i4.setTimeInMillis(j4);
        return new k(i4);
    }

    public static k n() {
        return new k(r.g());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f7944f == kVar.f7944f && this.f7945g == kVar.f7945g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7944f), Integer.valueOf(this.f7945g)});
    }

    /* renamed from: k */
    public int compareTo(k kVar) {
        return this.f7943e.compareTo(kVar.f7943e);
    }

    public int o() {
        int firstDayOfWeek = this.f7943e.get(7) - this.f7943e.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f7946h : firstDayOfWeek;
    }

    public long p(int i4) {
        Calendar d4 = r.d(this.f7943e);
        d4.set(5, i4);
        return d4.getTimeInMillis();
    }

    public int q(long j4) {
        Calendar d4 = r.d(this.f7943e);
        d4.setTimeInMillis(j4);
        return d4.get(5);
    }

    public String r(Context context) {
        if (this.f7949k == null) {
            this.f7949k = e.c(context, this.f7943e.getTimeInMillis());
        }
        return this.f7949k;
    }

    public long s() {
        return this.f7943e.getTimeInMillis();
    }

    public k t(int i4) {
        Calendar d4 = r.d(this.f7943e);
        d4.add(2, i4);
        return new k(d4);
    }

    public int u(k kVar) {
        if (this.f7943e instanceof GregorianCalendar) {
            return ((kVar.f7945g - this.f7945g) * 12) + (kVar.f7944f - this.f7944f);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f7945g);
        parcel.writeInt(this.f7944f);
    }
}
