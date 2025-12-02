package B1;

import J1.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import z1.r;

public final class a extends J1.a implements IInterface {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void K(r rVar) {
        Parcel H4 = H();
        c.b(H4, rVar);
        J(1, H4);
    }
}
