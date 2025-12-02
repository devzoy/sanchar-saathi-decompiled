package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public class f implements a.c {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: e  reason: collision with root package name */
    public final long f7880e;

    public static class a implements Parcelable.Creator {
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public f[] newArray(int i4) {
            return new f[i4];
        }
    }

    public /* synthetic */ f(long j4, a aVar) {
        this(j4);
    }

    public static f a(long j4) {
        return new f(j4);
    }

    public boolean b(long j4) {
        return j4 >= this.f7880e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return this.f7880e == ((f) obj).f7880e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7880e)});
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeLong(this.f7880e);
    }

    public f(long j4) {
        this.f7880e = j4;
    }
}
