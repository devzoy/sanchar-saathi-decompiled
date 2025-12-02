package Q1;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;
import z1.E;

public final class k implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        E e4 = null;
        int i4 = 0;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                i4 = b.q(parcel, o4);
            } else if (l4 != 2) {
                b.t(parcel, o4);
            } else {
                e4 = (E) b.e(parcel, o4, E.CREATOR);
            }
        }
        b.k(parcel, u4);
        return new j(i4, e4);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new j[i4];
    }
}
