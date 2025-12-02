package z1;

import K1.p;
import K1.q;
import android.os.Bundle;
import android.os.Parcel;

public abstract class i0 extends p implements C1028k {
    public i0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final boolean H(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 == 1) {
            q.c(parcel);
            G(parcel.readInt(), parcel.readStrongBinder(), (Bundle) q.a(parcel, Bundle.CREATOR));
        } else if (i4 == 2) {
            q.c(parcel);
            v(parcel.readInt(), (Bundle) q.a(parcel, Bundle.CREATOR));
        } else if (i4 != 3) {
            return false;
        } else {
            q.c(parcel);
            n(parcel.readInt(), parcel.readStrongBinder(), (V) q.a(parcel, V.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
