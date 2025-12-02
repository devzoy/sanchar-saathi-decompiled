package com.google.android.gms.internal.vision;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class E2 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        long j4 = 0;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 2) {
                i4 = b.q(parcel, o4);
            } else if (l4 == 3) {
                i5 = b.q(parcel, o4);
            } else if (l4 == 4) {
                i6 = b.q(parcel, o4);
            } else if (l4 == 5) {
                j4 = b.r(parcel, o4);
            } else if (l4 != 6) {
                b.t(parcel, o4);
            } else {
                i7 = b.q(parcel, o4);
            }
        }
        b.k(parcel, u4);
        return new C2(i4, i5, i6, j4, i7);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new C2[i4];
    }
}
