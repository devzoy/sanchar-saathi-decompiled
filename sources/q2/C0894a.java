package q2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: q2.a  reason: case insensitive filesystem */
public abstract class C0894a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f11894c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11895d = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    public C0894a(IBinder iBinder, String str) {
        this.f11894c = iBinder;
    }

    public final Parcel H() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f11895d);
        return obtain;
    }

    public final void I(int i4, Parcel parcel) {
        try {
            this.f11894c.transact(i4, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f11894c;
    }
}
