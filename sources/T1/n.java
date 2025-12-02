package T1;

import A1.b;
import T1.a;
import android.os.Parcel;
import android.os.Parcelable;

public final class n implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        int i4 = 0;
        String str = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 2) {
                i4 = b.q(parcel, o4);
            } else if (l4 != 3) {
                b.t(parcel, o4);
            } else {
                str = b.f(parcel, o4);
            }
        }
        b.k(parcel, u4);
        return new a.i(i4, str);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new a.i[i4];
    }
}
