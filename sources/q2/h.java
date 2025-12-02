package q2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class h extends Binder implements IInterface {
    public h(String str) {
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
    }

    public abstract boolean H(int i4, Parcel parcel, Parcel parcel2, int i5);

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
