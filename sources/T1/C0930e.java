package t1;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t1.e  reason: case insensitive filesystem */
public final class C0930e implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        boolean z4 = false;
        long j4 = 0;
        long j5 = 0;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                z4 = b.m(parcel, o4);
            } else if (l4 == 2) {
                j5 = b.r(parcel, o4);
            } else if (l4 != 3) {
                b.t(parcel, o4);
            } else {
                j4 = b.r(parcel, o4);
            }
        }
        b.k(parcel, u4);
        return new C0929d(z4, j4, j5);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new C0929d[i4];
    }
}
