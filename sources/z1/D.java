package z1;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;
import net.sqlcipher.IBulkCursor;

public final class D implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int u4 = b.u(parcel);
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        String str = null;
        String str2 = null;
        long j4 = 0;
        long j5 = 0;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            switch (b.l(o4)) {
                case 1:
                    i5 = b.q(parcel2, o4);
                    break;
                case 2:
                    i6 = b.q(parcel2, o4);
                    break;
                case 3:
                    i7 = b.q(parcel2, o4);
                    break;
                case 4:
                    j4 = b.r(parcel2, o4);
                    break;
                case 5:
                    j5 = b.r(parcel2, o4);
                    break;
                case 6:
                    str = b.f(parcel2, o4);
                    break;
                case 7:
                    str2 = b.f(parcel2, o4);
                    break;
                case 8:
                    i8 = b.q(parcel2, o4);
                    break;
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION:
                    i4 = b.q(parcel2, o4);
                    break;
                default:
                    b.t(parcel2, o4);
                    break;
            }
        }
        b.k(parcel2, u4);
        return new C1030m(i5, i6, i7, j4, j5, str, str2, i8, i4);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1030m[i4];
    }
}
