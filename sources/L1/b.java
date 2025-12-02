package L1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class b extends Binder implements IInterface {
    public b(String str) {
        attachInterface(this, str);
    }

    public abstract boolean H(int i4, Parcel parcel, Parcel parcel2, int i5);

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        boolean z4;
        if (i4 > 16777215) {
            z4 = super.onTransact(i4, parcel, parcel2, i5);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z4 = false;
        }
        if (z4) {
            return true;
        }
        return H(i4, parcel, parcel2, i5);
    }
}
