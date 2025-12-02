package z1;

import A1.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import u1.c;

public final class V extends a {
    public static final Parcelable.Creator<V> CREATOR = new W();

    /* renamed from: e  reason: collision with root package name */
    public Bundle f12893e;

    /* renamed from: f  reason: collision with root package name */
    public c[] f12894f;

    /* renamed from: g  reason: collision with root package name */
    public int f12895g;

    /* renamed from: h  reason: collision with root package name */
    public C1023f f12896h;

    public V(Bundle bundle, c[] cVarArr, int i4, C1023f fVar) {
        this.f12893e = bundle;
        this.f12894f = cVarArr;
        this.f12895g = i4;
        this.f12896h = fVar;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = A1.c.a(parcel);
        A1.c.d(parcel, 1, this.f12893e, false);
        A1.c.p(parcel, 2, this.f12894f, i4, false);
        A1.c.i(parcel, 3, this.f12895g);
        A1.c.l(parcel, 4, this.f12896h, i4, false);
        A1.c.b(parcel, a4);
    }
}
