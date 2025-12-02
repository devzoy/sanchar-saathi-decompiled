package Q1;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;
import u1.C0941a;
import z1.G;

public final class m implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        C0941a aVar = null;
        int i4 = 0;
        G g4 = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                i4 = b.q(parcel, o4);
            } else if (l4 == 2) {
                aVar = (C0941a) b.e(parcel, o4, C0941a.CREATOR);
            } else if (l4 != 3) {
                b.t(parcel, o4);
            } else {
                g4 = (G) b.e(parcel, o4, G.CREATOR);
            }
        }
        b.k(parcel, u4);
        return new l(i4, aVar, g4);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new l[i4];
    }
}
