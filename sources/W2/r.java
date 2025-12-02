package w2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class r implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f12669a;

    public /* synthetic */ r(t tVar, s sVar) {
        this.f12669a = tVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f12669a.f12672b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f12669a.c().post(new p(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f12669a.f12672b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f12669a.c().post(new q(this));
    }
}
