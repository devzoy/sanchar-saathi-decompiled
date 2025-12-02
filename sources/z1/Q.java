package z1;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class Q extends i0 {

    /* renamed from: c  reason: collision with root package name */
    public C1021d f12886c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12887d;

    public Q(C1021d dVar, int i4) {
        this.f12886c = dVar;
        this.f12887d = i4;
    }

    public final void G(int i4, IBinder iBinder, Bundle bundle) {
        C1032o.g(this.f12886c, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f12886c.M(i4, iBinder, bundle, this.f12887d);
        this.f12886c = null;
    }

    public final void n(int i4, IBinder iBinder, V v4) {
        C1021d dVar = this.f12886c;
        C1032o.g(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        C1032o.f(v4);
        dVar.U(v4);
        G(i4, iBinder, v4.f12893e);
    }

    public final void v(int i4, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
