package u0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import u0.j;

public interface k extends IInterface {

    public static abstract class a extends Binder implements k {

        /* renamed from: u0.k$a$a  reason: collision with other inner class name */
        public static class C0202a implements k {

            /* renamed from: c  reason: collision with root package name */
            public IBinder f12173c;

            public C0202a(IBinder iBinder) {
                this.f12173c = iBinder;
            }

            public IBinder asBinder() {
                return this.f12173c;
            }

            public int s(j jVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(jVar);
                    obtain.writeString(str);
                    this.f12173c.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void z(int i4, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i4);
                    obtain.writeStringArray(strArr);
                    this.f12173c.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static k H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof k)) ? new C0202a(iBinder) : (k) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i4 != 1598968902) {
                if (i4 == 1) {
                    int s4 = s(j.a.H(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(s4);
                } else if (i4 == 2) {
                    x(j.a.H(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                } else if (i4 != 3) {
                    return super.onTransact(i4, parcel, parcel2, i5);
                } else {
                    z(parcel.readInt(), parcel.createStringArray());
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
    }

    int s(j jVar, String str);

    void x(j jVar, int i4);

    void z(int i4, String[] strArr);
}
