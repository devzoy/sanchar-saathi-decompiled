package com.google.android.gms.internal.vision;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;

public final class L0 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        int i4 = 0;
        boolean z4 = false;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 2) {
                i4 = b.q(parcel, o4);
            } else if (l4 != 3) {
                b.t(parcel, o4);
            } else {
                z4 = b.m(parcel, o4);
            }
        }
        b.k(parcel, u4);
        return new C0514i1(i4, z4);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new C0514i1[i4];
    }
}
