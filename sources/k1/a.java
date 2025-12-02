package K1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f1680c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1681d;

    public a(IBinder iBinder, String str) {
        this.f1680c = iBinder;
        this.f1681d = str;
    }

    public final Parcel H(int i4, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f1680c.transact(i4, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e4) {
            throw e4;
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel I() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f1681d);
        return obtain;
    }

    public final IBinder asBinder() {
        return this.f1680c;
    }
}
