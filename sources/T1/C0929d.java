package t1;

import A1.a;
import A1.c;
import android.os.Parcel;
import android.os.Parcelable;
import z1.C1031n;

/* renamed from: t1.d  reason: case insensitive filesystem */
public final class C0929d extends a {
    public static final Parcelable.Creator<C0929d> CREATOR = new C0930e();

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12066e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12067f;

    /* renamed from: g  reason: collision with root package name */
    public final long f12068g;

    public C0929d(boolean z4, long j4, long j5) {
        this.f12066e = z4;
        this.f12067f = j4;
        this.f12068g = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0929d) {
            C0929d dVar = (C0929d) obj;
            return this.f12066e == dVar.f12066e && this.f12067f == dVar.f12067f && this.f12068g == dVar.f12068g;
        }
    }

    public final int hashCode() {
        return C1031n.b(Boolean.valueOf(this.f12066e), Long.valueOf(this.f12067f), Long.valueOf(this.f12068g));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f12066e + ",collectForDebugStartTimeMillis: " + this.f12067f + ",collectForDebugExpiryTimeMillis: " + this.f12068g + "]";
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.c(parcel, 1, this.f12066e);
        c.k(parcel, 2, this.f12068g);
        c.k(parcel, 3, this.f12067f);
        c.b(parcel, a4);
    }
}
