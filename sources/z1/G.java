package z1;

import A1.a;
import A1.c;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import u1.C0941a;
import z1.C1027j;

public final class G extends a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* renamed from: e  reason: collision with root package name */
    public final int f12867e;

    /* renamed from: f  reason: collision with root package name */
    public final IBinder f12868f;

    /* renamed from: g  reason: collision with root package name */
    public final C0941a f12869g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f12870h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f12871i;

    public G(int i4, IBinder iBinder, C0941a aVar, boolean z4, boolean z5) {
        this.f12867e = i4;
        this.f12868f = iBinder;
        this.f12869g = aVar;
        this.f12870h = z4;
        this.f12871i = z5;
    }

    public final C1027j d() {
        IBinder iBinder = this.f12868f;
        if (iBinder == null) {
            return null;
        }
        return C1027j.a.I(iBinder);
    }

    public final C0941a e() {
        return this.f12869g;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g4 = (G) obj;
        return this.f12869g.equals(g4.f12869g) && C1031n.a(d(), g4.d());
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.i(parcel, 1, this.f12867e);
        c.h(parcel, 2, this.f12868f, false);
        c.l(parcel, 3, this.f12869g, i4, false);
        c.c(parcel, 4, this.f12870h);
        c.c(parcel, 5, this.f12871i);
        c.b(parcel, a4);
    }
}
