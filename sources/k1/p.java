package K1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class p extends Binder implements IInterface {
    public p(String str) {
        attachInterface(this, str);
    }

    public boolean H(int i4, Parcel parcel, Parcel parcel2, int i5) {
        return false;
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i4, parcel, parcel2, i5)) {
            return true;
        }
        return H(i4, parcel, parcel2, i5);
    }
}
