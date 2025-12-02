package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.clearcut.a  reason: case insensitive filesystem */
public abstract class C0406a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f7014c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7015d;

    public C0406a(IBinder iBinder, String str) {
        this.f7014c = iBinder;
        this.f7015d = str;
    }

    public final Parcel H() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7015d);
        return obtain;
    }

    public final void I(int i4, Parcel parcel) {
        try {
            this.f7014c.transact(1, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f7014c;
    }
}
