package q2;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class C implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ D f11878a;

    public /* synthetic */ C(D d4, B b4) {
        this.f11878a = d4;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f11878a.f11881b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        D d4 = this.f11878a;
        d4.c().post(new z(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11878a.f11881b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        D d4 = this.f11878a;
        d4.c().post(new C0893A(this));
    }
}
