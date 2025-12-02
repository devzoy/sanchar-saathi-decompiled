package B1;

import J1.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import u1.c;
import w1.C0971d;
import w1.C0977j;
import z1.C1022e;
import z1.C1025h;
import z1.C1037u;

public final class e extends C1025h {

    /* renamed from: K  reason: collision with root package name */
    public final C1037u f250K;

    public e(Context context, Looper looper, C1022e eVar, C1037u uVar, C0971d dVar, C0977j jVar) {
        super(context, looper, 270, eVar, dVar, jVar);
        this.f250K = uVar;
    }

    public final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean H() {
        return true;
    }

    public final int i() {
        return 203400000;
    }

    public final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    public final c[] u() {
        return d.f1618b;
    }

    public final Bundle z() {
        return this.f250K.b();
    }
}
