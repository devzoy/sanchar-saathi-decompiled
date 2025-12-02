package J1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f1614c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1615d;

    public a(IBinder iBinder, String str) {
        this.f1614c = iBinder;
        this.f1615d = str;
    }

    public final Parcel H() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1615d);
        return obtain;
    }

    public final void I(int i4, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f1614c.transact(i4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final void J(int i4, Parcel parcel) {
        try {
            this.f1614c.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f1614c;
    }
}
