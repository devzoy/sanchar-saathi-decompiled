package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.Parcel;
import t1.C0931f;

public final class U1 extends C0406a implements T1 {
    public U1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void i(R1 r12, C0931f fVar) {
        Parcel H4 = H();
        V.b(H4, r12);
        V.c(H4, fVar);
        I(1, H4);
    }
}
