package Q1;

import J1.a;
import J1.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public final class g extends a implements IInterface {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void K(j jVar, f fVar) {
        Parcel H4 = H();
        c.b(H4, jVar);
        c.c(H4, fVar);
        I(12, H4);
    }
}
