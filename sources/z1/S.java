package z1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

public final class S implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f12888a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1021d f12889b;

    public S(C1021d dVar, int i4) {
        Objects.requireNonNull(dVar);
        this.f12889b = dVar;
        this.f12888a = i4;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C1021d dVar = this.f12889b;
        if (iBinder == null) {
            dVar.X(16);
            return;
        }
        synchronized (dVar.Z()) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                dVar.a0((queryLocalInterface == null || !(queryLocalInterface instanceof C1029l)) ? new J(iBinder) : (C1029l) queryLocalInterface);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f12889b.T(0, (Bundle) null, this.f12888a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C1021d dVar = this.f12889b;
        synchronized (dVar.Z()) {
            dVar.a0((C1029l) null);
        }
        C1021d dVar2 = this.f12889b;
        int i4 = this.f12888a;
        Handler handler = dVar2.f12935l;
        handler.sendMessage(handler.obtainMessage(6, i4, 1));
    }
}
