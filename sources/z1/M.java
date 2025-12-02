package z1;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class M implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        int i4 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                i4 = b.q(parcel, o4);
            } else if (l4 == 2) {
                z4 = b.m(parcel, o4);
            } else if (l4 == 3) {
                z5 = b.m(parcel, o4);
            } else if (l4 == 4) {
                i5 = b.q(parcel, o4);
            } else if (l4 != 5) {
                b.t(parcel, o4);
            } else {
                i6 = b.q(parcel, o4);
            }
        }
        b.k(parcel, u4);
        return new C1034q(i4, z4, z5, i5, i6);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1034q[i4];
    }
}
