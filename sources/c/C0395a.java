package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a  reason: case insensitive filesystem */
public interface C0395a extends IInterface {

    /* renamed from: b  reason: collision with root package name */
    public static final String f6275b = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: c.a$a  reason: collision with other inner class name */
    public static abstract class C0113a extends Binder implements C0395a {

        /* renamed from: c.a$a$a  reason: collision with other inner class name */
        public static class C0114a implements C0395a {

            /* renamed from: c  reason: collision with root package name */
            public IBinder f6276c;

            public C0114a(IBinder iBinder) {
                this.f6276c = iBinder;
            }

            public IBinder asBinder() {
                return this.f6276c;
            }
        }

        public C0113a() {
            attachInterface(this, C0395a.f6275b);
        }

        public static C0395a H(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0395a.f6275b);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C0395a)) ? new C0114a(iBinder) : (C0395a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            String str = C0395a.f6275b;
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i4 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i4 != 1) {
                return super.onTransact(i4, parcel, parcel2, i5);
            } else {
                F(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
                return true;
            }
        }
    }

    /* renamed from: c.a$b */
    public static class b {
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void F(int i4, Bundle bundle);
}
