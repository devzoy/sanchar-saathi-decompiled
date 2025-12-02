package z1;

import A1.a;
import A1.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new C1038v();

    /* renamed from: e  reason: collision with root package name */
    public final int f13020e;

    /* renamed from: f  reason: collision with root package name */
    public List f13021f;

    public r(int i4, List list) {
        this.f13020e = i4;
        this.f13021f = list;
    }

    public final int d() {
        return this.f13020e;
    }

    public final List e() {
        return this.f13021f;
    }

    public final void g(C1030m mVar) {
        if (this.f13021f == null) {
            this.f13021f = new ArrayList();
        }
        this.f13021f.add(mVar);
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.i(parcel, 1, this.f13020e);
        c.q(parcel, 2, this.f13021f, false);
        c.b(parcel, a4);
    }
}
