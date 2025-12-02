package z1;

import A1.a;
import A1.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z1.m  reason: case insensitive filesystem */
public class C1030m extends a {
    public static final Parcelable.Creator<C1030m> CREATOR = new D();

    /* renamed from: e  reason: collision with root package name */
    public final int f13001e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13002f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13003g;

    /* renamed from: h  reason: collision with root package name */
    public final long f13004h;

    /* renamed from: i  reason: collision with root package name */
    public final long f13005i;

    /* renamed from: j  reason: collision with root package name */
    public final String f13006j;

    /* renamed from: k  reason: collision with root package name */
    public final String f13007k;

    /* renamed from: l  reason: collision with root package name */
    public final int f13008l;

    /* renamed from: m  reason: collision with root package name */
    public final int f13009m;

    public C1030m(int i4, int i5, int i6, long j4, long j5, String str, String str2, int i7, int i8) {
        this.f13001e = i4;
        this.f13002f = i5;
        this.f13003g = i6;
        this.f13004h = j4;
        this.f13005i = j5;
        this.f13006j = str;
        this.f13007k = str2;
        this.f13008l = i7;
        this.f13009m = i8;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.f13001e;
        int a4 = c.a(parcel);
        c.i(parcel, 1, i5);
        c.i(parcel, 2, this.f13002f);
        c.i(parcel, 3, this.f13003g);
        c.k(parcel, 4, this.f13004h);
        c.k(parcel, 5, this.f13005i);
        c.m(parcel, 6, this.f13006j, false);
        c.m(parcel, 7, this.f13007k, false);
        c.i(parcel, 8, this.f13008l);
        c.i(parcel, 9, this.f13009m);
        c.b(parcel, a4);
    }
}
