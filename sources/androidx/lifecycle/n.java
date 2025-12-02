package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import v3.l;

public abstract class n extends Service implements C0384k {

    /* renamed from: c  reason: collision with root package name */
    public final D f5397c = new D(this);

    public C0380g b() {
        return this.f5397c.a();
    }

    public IBinder onBind(Intent intent) {
        l.e(intent, "intent");
        this.f5397c.b();
        return null;
    }

    public void onCreate() {
        this.f5397c.c();
        super.onCreate();
    }

    public void onDestroy() {
        this.f5397c.d();
        super.onDestroy();
    }

    public void onStart(Intent intent, int i4) {
        this.f5397c.e();
        super.onStart(intent, i4);
    }

    public int onStartCommand(Intent intent, int i4, int i5) {
        return super.onStartCommand(intent, i4, i5);
    }
}
