package z1;

import A1.a;
import A1.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: z1.f  reason: case insensitive filesystem */
public class C1023f extends a {
    public static final Parcelable.Creator<C1023f> CREATOR = new X();

    /* renamed from: e  reason: collision with root package name */
    public final C1034q f12969e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f12970f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f12971g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f12972h;

    /* renamed from: i  reason: collision with root package name */
    public final int f12973i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f12974j;

    public C1023f(C1034q qVar, boolean z4, boolean z5, int[] iArr, int i4, int[] iArr2) {
        this.f12969e = qVar;
        this.f12970f = z4;
        this.f12971g = z5;
        this.f12972h = iArr;
        this.f12973i = i4;
        this.f12974j = iArr2;
    }

    public int d() {
        return this.f12973i;
    }

    public int[] e() {
        return this.f12972h;
    }

    public int[] g() {
        return this.f12974j;
    }

    public boolean h() {
        return this.f12970f;
    }

    public boolean i() {
        return this.f12971g;
    }

    public final C1034q j() {
        return this.f12969e;
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.l(parcel, 1, this.f12969e, i4, false);
        c.c(parcel, 2, h());
        c.c(parcel, 3, i());
        c.j(parcel, 4, e(), false);
        c.i(parcel, 5, d());
        c.j(parcel, 6, g(), false);
        c.b(parcel, a4);
    }
}
