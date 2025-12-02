package com.google.android.gms.internal.clearcut;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;
import net.sqlcipher.IBulkCursor;

public final class Y1 implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        int i6 = 0;
        boolean z5 = true;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            switch (b.l(o4)) {
                case 2:
                    str = b.f(parcel, o4);
                    break;
                case 3:
                    i4 = b.q(parcel, o4);
                    break;
                case 4:
                    i5 = b.q(parcel, o4);
                    break;
                case 5:
                    str2 = b.f(parcel, o4);
                    break;
                case 6:
                    str3 = b.f(parcel, o4);
                    break;
                case 7:
                    z5 = b.m(parcel, o4);
                    break;
                case 8:
                    str4 = b.f(parcel, o4);
                    break;
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    z4 = b.m(parcel, o4);
                    break;
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    i6 = b.q(parcel, o4);
                    break;
                default:
                    b.t(parcel, o4);
                    break;
            }
        }
        b.k(parcel, u4);
        return new X1(str, i4, i5, str2, str3, z5, str4, z4, i6);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new X1[i4];
    }
}
