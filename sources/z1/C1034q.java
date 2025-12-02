package z1;

import A1.a;
import A1.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z1.q  reason: case insensitive filesystem */
public class C1034q extends a {
    public static final Parcelable.Creator<C1034q> CREATOR = new M();

    /* renamed from: e  reason: collision with root package name */
    public final int f13015e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13016f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13017g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13018h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13019i;

    public C1034q(int i4, boolean z4, boolean z5, int i5, int i6) {
        this.f13015e = i4;
        this.f13016f = z4;
        this.f13017g = z5;
        this.f13018h = i5;
        this.f13019i = i6;
    }

    public int d() {
        return this.f13018h;
    }

    public int e() {
        return this.f13019i;
    }

    public boolean g() {
        return this.f13016f;
    }

    public boolean h() {
        return this.f13017g;
    }

    public int i() {
        return this.f13015e;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.i(parcel, 1, i());
        c.c(parcel, 2, g());
        c.c(parcel, 3, h());
        c.i(parcel, 4, d());
        c.i(parcel, 5, e());
        c.b(parcel, a4);
    }
}
