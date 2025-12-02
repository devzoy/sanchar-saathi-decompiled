package u1;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        long j4 = -1;
        int i4 = 0;
        String str = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                str = b.f(parcel, o4);
            } else if (l4 == 2) {
                i4 = b.q(parcel, o4);
            } else if (l4 != 3) {
                b.t(parcel, o4);
            } else {
                j4 = b.r(parcel, o4);
            }
        }
        b.k(parcel, u4);
        return new c(str, i4, j4);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new c[i4];
    }
}
