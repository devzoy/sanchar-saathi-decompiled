package w2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: w2.a  reason: case insensitive filesystem */
public abstract class C0993a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f12654c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12655d = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    public C0993a(IBinder iBinder, String str) {
        this.f12654c = iBinder;
    }

    public final Parcel H() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f12655d);
        return obtain;
    }

    public final void I(int i4, Parcel parcel) {
        try {
            this.f12654c.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public final IBinder asBinder() {
        return this.f12654c;
    }
}
