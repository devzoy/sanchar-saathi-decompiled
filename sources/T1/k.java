package T1;

import A1.b;
import T1.a;
import android.os.Parcel;
import android.os.Parcelable;

public final class k implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            switch (b.l(o4)) {
                case 2:
                    str = b.f(parcel, o4);
                    break;
                case 3:
                    str2 = b.f(parcel, o4);
                    break;
                case 4:
                    str3 = b.f(parcel, o4);
                    break;
                case 5:
                    str4 = b.f(parcel, o4);
                    break;
                case 6:
                    str5 = b.f(parcel, o4);
                    break;
                case 7:
                    str6 = b.f(parcel, o4);
                    break;
                case 8:
                    str7 = b.f(parcel, o4);
                    break;
                default:
                    b.t(parcel, o4);
                    break;
            }
        }
        b.k(parcel, u4);
        return new a.h(str, str2, str3, str4, str5, str6, str7);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new a.h[i4];
    }
}
