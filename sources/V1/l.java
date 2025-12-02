package v1;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

public final class l implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        int i4 = 0;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            int l4 = b.l(o4);
            if (l4 == 1) {
                i4 = b.q(parcel, o4);
            } else if (l4 != 2) {
                b.t(parcel, o4);
            } else {
                str = b.f(parcel, o4);
            }
        }
        b.k(parcel, u4);
        return new Scope(i4, str);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new Scope[i4];
    }
}
