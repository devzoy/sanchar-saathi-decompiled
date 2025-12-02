package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.vision.a  reason: case insensitive filesystem */
public abstract class C0483a implements IInterface {

    /* renamed from: c  reason: collision with root package name */
    public final IBinder f7410c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7411d;

    public C0483a(IBinder iBinder, String str) {
        this.f7410c = iBinder;
        this.f7411d = str;
    }

    public final Parcel H() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7411d);
        return obtain;
    }

    public final Parcel I(int i4, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f7410c.transact(i4, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e4) {
            throw e4;
        } finally {
            parcel.recycle();
        }
    }

    public final void J(int i4, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f7410c.transact(i4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f7410c;
    }
}
