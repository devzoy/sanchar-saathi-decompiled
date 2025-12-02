package H1;

import F1.a;
import L1.b;
import L1.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class g extends b implements f {
    public g() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static f asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new h(iBinder);
    }

    public final boolean H(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 == 1) {
            init(a.C0011a.I(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i4 == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), c.b(parcel), parcel.readInt());
            parcel2.writeNoException();
            c.a(parcel2, booleanFlagValue);
        } else if (i4 == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i4 == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else if (i4 != 5) {
            return false;
        } else {
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}
