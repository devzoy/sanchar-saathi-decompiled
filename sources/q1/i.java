package Q1;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class i implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                arrayList = b.h(parcel, o4);
            } else if (l4 != 2) {
                b.t(parcel, o4);
            } else {
                str = b.f(parcel, o4);
            }
        }
        b.k(parcel, u4);
        return new h(arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new h[i4];
    }
}
