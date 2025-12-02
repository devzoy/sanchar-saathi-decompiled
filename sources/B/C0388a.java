package b;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b.a  reason: case insensitive filesystem */
public interface C0388a extends IInterface {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6239a = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: b.a$a  reason: collision with other inner class name */
    public static abstract class C0109a extends Binder implements C0388a {

        /* renamed from: b.a$a$a  reason: collision with other inner class name */
        public static class C0110a implements C0388a {

            /* renamed from: c  reason: collision with root package name */
            public IBinder f6240c;

            public C0110a(IBinder iBinder) {
                this.f6240c = iBinder;
            }

            public void B(String str, int i4, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0388a.f6239a);
                    obtain.writeString(str);
                    obtain.writeInt(i4);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.f6240c.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f6240c;
            }
        }

        public static C0388a H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0388a.f6239a);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0388a)) ? new C0110a(iBinder) : (C0388a) queryLocalInterface;
        }
    }

    /* renamed from: b.a$b */
    public static class b {
        public static void b(Parcel parcel, Parcelable parcelable, int i4) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i4);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void B(String str, int i4, String str2, Notification notification);
}
