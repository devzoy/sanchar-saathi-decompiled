package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0129a();

    /* renamed from: e  reason: collision with root package name */
    public final k f7854e;

    /* renamed from: f  reason: collision with root package name */
    public final k f7855f;

    /* renamed from: g  reason: collision with root package name */
    public final c f7856g;

    /* renamed from: h  reason: collision with root package name */
    public k f7857h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7858i;

    /* renamed from: j  reason: collision with root package name */
    public final int f7859j;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    public static class C0129a implements Parcelable.Creator {
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            Class<k> cls = k.class;
            return new a((k) parcel.readParcelable(cls.getClassLoader()), (k) parcel.readParcelable(cls.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (k) parcel.readParcelable(cls.getClassLoader()), (C0129a) null);
        }

        /* renamed from: b */
        public a[] newArray(int i4) {
            return new a[i4];
        }
    }

    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final long f7860e = r.a(k.l(1900, 0).f7948j);

        /* renamed from: f  reason: collision with root package name */
        public static final long f7861f = r.a(k.l(2100, 11).f7948j);

        /* renamed from: a  reason: collision with root package name */
        public long f7862a = f7860e;

        /* renamed from: b  reason: collision with root package name */
        public long f7863b = f7861f;

        /* renamed from: c  reason: collision with root package name */
        public Long f7864c;

        /* renamed from: d  reason: collision with root package name */
        public c f7865d = f.a(Long.MIN_VALUE);

        public b(a aVar) {
            this.f7862a = aVar.f7854e.f7948j;
            this.f7863b = aVar.f7855f.f7948j;
            this.f7864c = Long.valueOf(aVar.f7857h.f7948j);
            this.f7865d = aVar.f7856g;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f7865d);
            k m4 = k.m(this.f7862a);
            k m5 = k.m(this.f7863b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l4 = this.f7864c;
            return new a(m4, m5, cVar, l4 == null ? null : k.m(l4.longValue()), (C0129a) null);
        }

        public b b(long j4) {
            this.f7864c = Long.valueOf(j4);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean b(long j4);
    }

    public /* synthetic */ a(k kVar, k kVar2, c cVar, k kVar3, C0129a aVar) {
        this(kVar, kVar2, cVar, kVar3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7854e.equals(aVar.f7854e) && this.f7855f.equals(aVar.f7855f) && R.c.a(this.f7857h, aVar.f7857h) && this.f7856g.equals(aVar.f7856g);
    }

    public c g() {
        return this.f7856g;
    }

    public k h() {
        return this.f7855f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7854e, this.f7855f, this.f7857h, this.f7856g});
    }

    public int i() {
        return this.f7859j;
    }

    public k j() {
        return this.f7857h;
    }

    public k k() {
        return this.f7854e;
    }

    public int l() {
        return this.f7858i;
    }

    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f7854e, 0);
        parcel.writeParcelable(this.f7855f, 0);
        parcel.writeParcelable(this.f7857h, 0);
        parcel.writeParcelable(this.f7856g, 0);
    }

    public a(k kVar, k kVar2, c cVar, k kVar3) {
        this.f7854e = kVar;
        this.f7855f = kVar2;
        this.f7857h = kVar3;
        this.f7856g = cVar;
        if (kVar3 != null && kVar.compareTo(kVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (kVar3 == null || kVar3.compareTo(kVar2) <= 0) {
            this.f7859j = kVar.u(kVar2) + 1;
            this.f7858i = (kVar2.f7945g - kVar.f7945g) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }
}
