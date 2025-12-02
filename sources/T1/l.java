package T1;

import A1.b;
import T1.a;
import android.os.Parcel;
import android.os.Parcelable;

public final class l implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        double d4 = 0.0d;
        double d5 = 0.0d;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 2) {
                d4 = b.n(parcel, o4);
            } else if (l4 != 3) {
                b.t(parcel, o4);
            } else {
                d5 = b.n(parcel, o4);
            }
        }
        b.k(parcel, u4);
        return new a.g(d4, d5);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new a.g[i4];
    }
}
