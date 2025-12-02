package Q1;

import A1.a;
import A1.c;
import android.os.Parcel;
import android.os.Parcelable;
import z1.E;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: e  reason: collision with root package name */
    public final int f2429e;

    /* renamed from: f  reason: collision with root package name */
    public final E f2430f;

    public j(int i4, E e4) {
        this.f2429e = i4;
        this.f2430f = e4;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.i(parcel, 1, this.f2429e);
        c.l(parcel, 2, this.f2430f, i4, false);
        c.b(parcel, a4);
    }
}
