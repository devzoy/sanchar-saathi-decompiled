package t1;

import A1.a;
import A1.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.clearcut.M1;
import com.google.android.gms.internal.clearcut.X1;
import java.util.Arrays;
import t1.C0926a;
import z1.C1031n;

/* renamed from: t1.f  reason: case insensitive filesystem */
public final class C0931f extends a {
    public static final Parcelable.Creator<C0931f> CREATOR = new C0932g();

    /* renamed from: e  reason: collision with root package name */
    public X1 f12069e;

    /* renamed from: f  reason: collision with root package name */
    public byte[] f12070f;

    /* renamed from: g  reason: collision with root package name */
    public int[] f12071g;

    /* renamed from: h  reason: collision with root package name */
    public String[] f12072h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f12073i;

    /* renamed from: j  reason: collision with root package name */
    public byte[][] f12074j;

    /* renamed from: k  reason: collision with root package name */
    public O1.a[] f12075k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12076l;

    /* renamed from: m  reason: collision with root package name */
    public final M1 f12077m;

    public C0931f(X1 x12, M1 m12, C0926a.c cVar, C0926a.c cVar2, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, O1.a[] aVarArr, boolean z4) {
        this.f12069e = x12;
        this.f12077m = m12;
        this.f12071g = iArr;
        this.f12072h = null;
        this.f12073i = iArr2;
        this.f12074j = null;
        this.f12075k = null;
        this.f12076l = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0931f) {
            C0931f fVar = (C0931f) obj;
            return C1031n.a(this.f12069e, fVar.f12069e) && Arrays.equals(this.f12070f, fVar.f12070f) && Arrays.equals(this.f12071g, fVar.f12071g) && Arrays.equals(this.f12072h, fVar.f12072h) && C1031n.a(this.f12077m, fVar.f12077m) && C1031n.a((Object) null, (Object) null) && C1031n.a((Object) null, (Object) null) && Arrays.equals(this.f12073i, fVar.f12073i) && Arrays.deepEquals(this.f12074j, fVar.f12074j) && Arrays.equals(this.f12075k, fVar.f12075k) && this.f12076l == fVar.f12076l;
        }
    }

    public final int hashCode() {
        return C1031n.b(this.f12069e, this.f12070f, this.f12071g, this.f12072h, this.f12077m, null, null, this.f12073i, this.f12074j, this.f12075k, Boolean.valueOf(this.f12076l));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f12069e);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f12070f;
        sb.append(bArr == null ? null : new String(bArr));
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f12071g));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f12072h));
        sb.append(", LogEvent: ");
        sb.append(this.f12077m);
        sb.append(", ExtensionProducer: ");
        sb.append((Object) null);
        sb.append(", VeProducer: ");
        sb.append((Object) null);
        sb.append(", ExperimentIDs: ");
        sb.append(Arrays.toString(this.f12073i));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.toString(this.f12074j));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.f12075k));
        sb.append(", AddPhenotypeExperimentTokens: ");
        sb.append(this.f12076l);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i4) {
        int a4 = c.a(parcel);
        c.l(parcel, 2, this.f12069e, i4, false);
        c.e(parcel, 3, this.f12070f, false);
        c.j(parcel, 4, this.f12071g, false);
        c.n(parcel, 5, this.f12072h, false);
        c.j(parcel, 6, this.f12073i, false);
        c.f(parcel, 7, this.f12074j, false);
        c.c(parcel, 8, this.f12076l);
        c.p(parcel, 9, this.f12075k, i4, false);
        c.b(parcel, a4);
    }

    public C0931f(X1 x12, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z4, O1.a[] aVarArr) {
        this.f12069e = x12;
        this.f12070f = bArr;
        this.f12071g = iArr;
        this.f12072h = strArr;
        this.f12077m = null;
        this.f12073i = iArr2;
        this.f12074j = bArr2;
        this.f12075k = aVarArr;
        this.f12076l = z4;
    }
}
