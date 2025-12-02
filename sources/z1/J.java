package z1;

import android.os.IBinder;
import android.os.Parcel;

public final class J implements C1029l {

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f12875c;

    public J(IBinder iBinder) {
        this.f12875c = iBinder;
    }

    public final void E(C1028k kVar, C1024g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(kVar != null ? kVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                Y.a(gVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f12875c.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final IBinder asBinder() {
        return this.f12875c;
    }
}
