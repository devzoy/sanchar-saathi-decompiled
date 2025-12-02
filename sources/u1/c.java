package u1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import z1.C1031n;

public class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new m();

    /* renamed from: e  reason: collision with root package name */
    public final String f12312e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12313f;

    /* renamed from: g  reason: collision with root package name */
    public final long f12314g;

    public c(String str, int i4, long j4) {
        this.f12312e = str;
        this.f12313f = i4;
        this.f12314g = j4;
    }

    public String d() {
        return this.f12312e;
    }

    public long e() {
        long j4 = this.f12314g;
        return j4 == -1 ? (long) this.f12313f : j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            return ((d() != null && d().equals(cVar.d())) || (d() == null && cVar.d() == null)) && e() == cVar.e();
        }
    }

    public final int hashCode() {
        return C1031n.b(d(), Long.valueOf(e()));
    }

    public final String toString() {
        C1031n.a c4 = C1031n.c(this);
        c4.a("name", d());
        c4.a("version", Long.valueOf(e()));
        return c4.toString();
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = A1.c.a(parcel);
        A1.c.m(parcel, 1, d(), false);
        A1.c.i(parcel, 2, this.f12313f);
        A1.c.k(parcel, 3, e());
        A1.c.b(parcel, a4);
    }

    public c(String str, long j4) {
        this.f12312e = str;
        this.f12314g = j4;
        this.f12313f = -1;
    }
}
