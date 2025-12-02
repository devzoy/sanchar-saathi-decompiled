package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public final a f8274e;

    /* renamed from: f  reason: collision with root package name */
    public final a f8275f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8276g;

    /* renamed from: h  reason: collision with root package name */
    public int f8277h;

    /* renamed from: i  reason: collision with root package name */
    public int f8278i;

    /* renamed from: j  reason: collision with root package name */
    public int f8279j;

    /* renamed from: k  reason: collision with root package name */
    public int f8280k;

    public static class a implements Parcelable.Creator {
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: b */
        public c[] newArray(int i4) {
            return new c[i4];
        }
    }

    public c(int i4, int i5, int i6, int i7) {
        this.f8277h = i4;
        this.f8278i = i5;
        this.f8279j = i6;
        this.f8276g = i7;
        this.f8280k = d(i4);
        this.f8274e = new a(59);
        this.f8275f = new a(i7 == 1 ? 24 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return c(resources, charSequence, "%02d");
    }

    public static String c(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    public static int d(int i4) {
        return i4 >= 12 ? 1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f8277h == cVar.f8277h && this.f8278i == cVar.f8278i && this.f8276g == cVar.f8276g && this.f8279j == cVar.f8279j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8276g), Integer.valueOf(this.f8277h), Integer.valueOf(this.f8278i), Integer.valueOf(this.f8279j)});
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f8277h);
        parcel.writeInt(this.f8278i);
        parcel.writeInt(this.f8279j);
        parcel.writeInt(this.f8276g);
    }

    public c(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
