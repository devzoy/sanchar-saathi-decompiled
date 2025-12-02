package T1;

import A1.b;
import T1.a;
import android.os.Parcel;
import android.os.Parcelable;
import net.sqlcipher.IBulkCursor;

public final class f implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        boolean z4 = false;
        String str = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            switch (b.l(o4)) {
                case 2:
                    i4 = b.q(parcel, o4);
                    break;
                case 3:
                    i5 = b.q(parcel, o4);
                    break;
                case 4:
                    i6 = b.q(parcel, o4);
                    break;
                case 5:
                    i7 = b.q(parcel, o4);
                    break;
                case 6:
                    i8 = b.q(parcel, o4);
                    break;
                case 7:
                    i9 = b.q(parcel, o4);
                    break;
                case 8:
                    z4 = b.m(parcel, o4);
                    break;
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    str = b.f(parcel, o4);
                    break;
                default:
                    b.t(parcel, o4);
                    break;
            }
        }
        b.k(parcel, u4);
        return new a.b(i4, i5, i6, i7, i8, i9, z4, str);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new a.b[i4];
    }
}
