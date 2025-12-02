package net.sqlcipher;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IContentObserver extends IInterface {

    public static class Default implements IContentObserver {
        public IBinder asBinder() {
            return null;
        }

        public void onChange(boolean z4) {
        }
    }

    public static abstract class Stub extends Binder implements IContentObserver {
        private static final String DESCRIPTOR = "net.sqlcipher.IContentObserver";
        static final int TRANSACTION_onChange = 1;

        public static class Proxy implements IContentObserver {
            public static IContentObserver sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            public void onChange(boolean z4) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z4 ? 1 : 0);
                    if (this.mRemote.transact(1, obtain, (Parcel) null, 1) || Stub.getDefaultImpl() == null) {
                        obtain.recycle();
                    } else {
                        Stub.getDefaultImpl().onChange(z4);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IContentObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IContentObserver)) ? new Proxy(iBinder) : (IContentObserver) queryLocalInterface;
        }

        public static IContentObserver getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IContentObserver iContentObserver) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            } else if (iContentObserver == null) {
                return false;
            } else {
                Proxy.sDefaultImpl = iContentObserver;
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
            if (i4 == 1) {
                parcel.enforceInterface(DESCRIPTOR);
                onChange(parcel.readInt() != 0);
                return true;
            } else if (i4 != 1598968902) {
                return super.onTransact(i4, parcel, parcel2, i5);
            } else {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
        }
    }

    void onChange(boolean z4);
}
