package O1;

import A1.b;
import android.os.Parcel;
import android.os.Parcelable;
import net.sqlcipher.IBulkCursor;

public final class g implements Parcelable.Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int u4 = b.u(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        while (parcel.dataPosition() < u4) {
            int o4 = b.o(parcel);
            switch (b.l(o4)) {
                case 2:
                    str = b.f(parcel, o4);
                    break;
                case 3:
                    bArr = b.b(parcel, o4);
                    break;
                case 4:
                    bArr2 = b.c(parcel, o4);
                    break;
                case 5:
                    bArr3 = b.c(parcel, o4);
                    break;
                case 6:
                    bArr4 = b.c(parcel, o4);
                    break;
                case 7:
                    bArr5 = b.c(parcel, o4);
                    break;
                case 8:
                    iArr = b.d(parcel, o4);
                    break;
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    bArr6 = b.c(parcel, o4);
                    break;
                default:
                    b.t(parcel, o4);
                    break;
            }
        }
        b.k(parcel, u4);
        return new a(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
    }

    public final /* synthetic */ Object[] newArray(int i4) {
        return new a[i4];
    }
}
