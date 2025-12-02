package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import net.sqlcipher.IBulkCursor;
import t1.C0929d;
import t1.C0931f;

public abstract class S1 extends C0471w implements R1 {
    public S1() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public final boolean H(int i4, Parcel parcel, Parcel parcel2, int i5) {
        switch (i4) {
            case 1:
                o((Status) V.a(parcel, Status.CREATOR));
                return true;
            case 2:
                u((Status) V.a(parcel, Status.CREATOR));
                return true;
            case 3:
                k((Status) V.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 4:
                C((Status) V.a(parcel, Status.CREATOR));
                return true;
            case 5:
                D((Status) V.a(parcel, Status.CREATOR), parcel.readLong());
                return true;
            case 6:
                t((Status) V.a(parcel, Status.CREATOR), (C0931f[]) parcel.createTypedArray(C0931f.CREATOR));
                return true;
            case 7:
                m((DataHolder) V.a(parcel, DataHolder.CREATOR));
                return true;
            case 8:
                g((Status) V.a(parcel, Status.CREATOR), (C0929d) V.a(parcel, C0929d.CREATOR));
                return true;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                A((Status) V.a(parcel, Status.CREATOR), (C0929d) V.a(parcel, C0929d.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
