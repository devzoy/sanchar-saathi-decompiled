package u0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        /* renamed from: u0.j$a$a  reason: collision with other inner class name */
        public static class C0201a implements j {

            /* renamed from: c  reason: collision with root package name */
            public IBinder f12172c;

            public C0201a(IBinder iBinder) {
                this.f12172c = iBinder;
            }

            public IBinder asBinder() {
                return this.f12172c;
            }

            public void p(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f12172c.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static j H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof j)) ? new C0201a(iBinder) : (j) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i4 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            } else if (i4 != 1) {
                return super.onTransact(i4, parcel, parcel2, i5);
            } else {
                p(parcel.createStringArray());
                return true;
            }
        }
    }

    void p(String[] strArr);
}
