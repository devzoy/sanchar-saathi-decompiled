package Q1;

import A1.a;
import A1.c;
import android.os.Parcel;
import android.os.Parcelable;
import u1.C0941a;
import z1.G;

public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: e  reason: collision with root package name */
    public final int f2431e;

    /* renamed from: f  reason: collision with root package name */
    public final C0941a f2432f;

    /* renamed from: g  reason: collision with root package name */
    public final G f2433g;

    public l(int i4, C0941a aVar, G g4) {
        this.f2431e = i4;
        this.f2432f = aVar;
        this.f2433g = g4;
    }

    public final C0941a d() {
        return this.f2432f;
    }

    public final G e() {
        return this.f2433g;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.i(parcel, 1, this.f2431e);
        c.l(parcel, 2, this.f2432f, i4, false);
        c.l(parcel, 3, this.f2433g, i4, false);
        c.b(parcel, a4);
    }
}
