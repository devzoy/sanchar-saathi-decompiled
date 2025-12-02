package T1;

import A1.b;
import T1.a;
import android.os.Parcel;
import android.os.Parcelable;

public final class o implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        int i4 = 0;
        String str2 = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 2) {
                str = b.f(parcel, o4);
            } else if (l4 == 3) {
                str2 = b.f(parcel, o4);
            } else if (l4 != 4) {
                b.t(parcel, o4);
            } else {
                i4 = b.q(parcel, o4);
            }
        }
        b.k(parcel, u4);
        return new a.l(str, str2, i4);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new a.l[i4];
    }
}
