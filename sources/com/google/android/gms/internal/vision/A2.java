package com.google.android.gms.internal.vision;

import T1.a;
import android.os.IBinder;
import android.os.Parcel;

public final class A2 extends C0483a implements H1 {
    public A2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
    }

    public final void a() {
        J(3, H());
    }

    public final a[] l(F1.a aVar, C2 c22) {
        Parcel H4 = H();
        C0487b.a(H4, aVar);
        C0487b.b(H4, c22);
        Parcel I4 = I(2, H4);
        a[] aVarArr = (a[]) I4.createTypedArray(a.CREATOR);
        I4.recycle();
        return aVarArr;
    }

    public final a[] r(F1.a aVar, C2 c22) {
        Parcel H4 = H();
        C0487b.a(H4, aVar);
        C0487b.b(H4, c22);
        Parcel I4 = I(1, H4);
        a[] aVarArr = (a[]) I4.createTypedArray(a.CREATOR);
        I4.recycle();
        return aVarArr;
    }
}
