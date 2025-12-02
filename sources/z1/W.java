package z1;

import A1.b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import u1.c;

public final class W implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        Bundle bundle = null;
        C1023f fVar = null;
        int i4 = 0;
        c[] cVarArr = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                bundle = b.a(parcel, o4);
            } else if (l4 == 2) {
                cVarArr = (c[]) b.i(parcel, o4, c.CREATOR);
            } else if (l4 == 3) {
                i4 = b.q(parcel, o4);
            } else if (l4 != 4) {
                b.t(parcel, o4);
            } else {
                fVar = (C1023f) b.e(parcel, o4, C1023f.CREATOR);
            }
        }
        b.k(parcel, u4);
        return new V(bundle, cVarArr, i4, fVar);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new V[i4];
    }
}
