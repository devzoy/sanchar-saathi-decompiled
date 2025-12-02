package T1;

import A1.b;
import T1.a;
import android.os.Parcel;
import android.os.Parcelable;
import net.sqlcipher.IBulkCursor;

public final class j implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u4 = b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            switch (b.l(o4)) {
                case 2:
                    str = b.f(parcel2, o4);
                    break;
                case 3:
                    str2 = b.f(parcel2, o4);
                    break;
                case 4:
                    str3 = b.f(parcel2, o4);
                    break;
                case 5:
                    str4 = b.f(parcel2, o4);
                    break;
                case 6:
                    str5 = b.f(parcel2, o4);
                    break;
                case 7:
                    str6 = b.f(parcel2, o4);
                    break;
                case 8:
                    str7 = b.f(parcel2, o4);
                    break;
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    str8 = b.f(parcel2, o4);
                    break;
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    str9 = b.f(parcel2, o4);
                    break;
                case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                    str10 = b.f(parcel2, o4);
                    break;
                case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                    str11 = b.f(parcel2, o4);
                    break;
                case 13:
                    str12 = b.f(parcel2, o4);
                    break;
                case 14:
                    str13 = b.f(parcel2, o4);
                    break;
                case 15:
                    str14 = b.f(parcel2, o4);
                    break;
                default:
                    b.t(parcel2, o4);
                    break;
            }
        }
        b.k(parcel2, u4);
        return new a.e(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new a.e[i4];
    }
}
