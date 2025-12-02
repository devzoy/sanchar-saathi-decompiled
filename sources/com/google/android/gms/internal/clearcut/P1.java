package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import v1.C0952f;
import z1.C1022e;
import z1.C1025h;

public final class P1 extends C1025h {
    public P1(Context context, Looper looper, C1022e eVar, C0952f.a aVar, C0952f.b bVar) {
        super(context, looper, 40, eVar, aVar, bVar);
    }

    public final String D() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    public final String E() {
        return "com.google.android.gms.clearcut.service.START";
    }

    public final int i() {
        return 11925000;
    }

    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return queryLocalInterface instanceof T1 ? (T1) queryLocalInterface : new U1(iBinder);
    }
}
