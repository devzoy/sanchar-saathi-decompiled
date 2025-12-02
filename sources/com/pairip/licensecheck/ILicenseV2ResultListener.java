package com.pairip.licensecheck;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public interface ILicenseV2ResultListener extends IInterface {
    public static final String DESCRIPTOR = "com.android.vending.licensing.ILicenseV2ResultListener";

    void verifyLicense(int i4, Bundle bundle) throws RemoteException;

    public static abstract class Stub extends Binder implements ILicenseV2ResultListener {
        static final int TRANSACTION_VERIFY_LICENSE = 1;

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, ILicenseV2ResultListener.DESCRIPTOR);
        }

        public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
            if (i4 >= 1 && i4 <= 16777215) {
                parcel.enforceInterface(ILicenseV2ResultListener.DESCRIPTOR);
            }
            if (i4 == 1) {
                verifyLicense(parcel.readInt(), (Bundle) readTypedObject(parcel, Bundle.CREATOR));
            } else if (i4 != 1598968902) {
                return super.onTransact(i4, parcel, parcel2, i5);
            } else {
                parcel2.writeString(ILicenseV2ResultListener.DESCRIPTOR);
            }
            return true;
        }

        private static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }
}
