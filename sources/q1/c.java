package Q1;

import A1.b;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        Intent intent = null;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                i4 = b.q(parcel, o4);
            } else if (l4 == 2) {
                i5 = b.q(parcel, o4);
            } else if (l4 != 3) {
                b.t(parcel, o4);
            } else {
                intent = (Intent) b.e(parcel, o4, Intent.CREATOR);
            }
        }
        b.k(parcel, u4);
        return new b(i4, i5, intent);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new b[i4];
    }
}
