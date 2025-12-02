package z1;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: z1.v  reason: case insensitive filesystem */
public final class C1038v implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        ArrayList arrayList = null;
        int i4 = 0;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                i4 = b.q(parcel, o4);
            } else if (l4 != 2) {
                b.t(parcel, o4);
            } else {
                arrayList = b.j(parcel, o4, C1030m.CREATOR);
            }
        }
        b.k(parcel, u4);
        return new r(i4, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new r[i4];
    }
}
