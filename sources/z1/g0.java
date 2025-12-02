package z1;

import F1.a;
import K1.p;
import K1.q;
import android.os.Parcel;

public abstract class g0 extends p implements h0 {
    public g0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public final boolean H(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 == 1) {
            a e4 = e();
            parcel2.writeNoException();
            q.b(parcel2, e4);
        } else if (i4 != 2) {
            return false;
        } else {
            int c4 = c();
            parcel2.writeNoException();
            parcel2.writeInt(c4);
        }
        return true;
    }
}
