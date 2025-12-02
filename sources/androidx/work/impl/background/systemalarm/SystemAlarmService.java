package androidx.work.impl.background.systemalarm;

import Q0.i;
import a1.w;
import android.content.Intent;
import androidx.lifecycle.n;
import androidx.work.impl.background.systemalarm.d;

public class SystemAlarmService extends n implements d.c {

    /* renamed from: f  reason: collision with root package name */
    public static final String f6152f = i.i("SystemAlarmService");

    /* renamed from: d  reason: collision with root package name */
    public d f6153d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6154e;

    public void c() {
        this.f6154e = true;
        i.e().a(f6152f, "All commands completed in dispatcher");
        w.a();
        stopSelf();
    }

    public final void g() {
        d dVar = new d(this);
        this.f6153d = dVar;
        dVar.l(this);
    }

    public void onCreate() {
        super.onCreate();
        g();
        this.f6154e = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6154e = true;
        this.f6153d.j();
    }

    public int onStartCommand(Intent intent, int i4, int i5) {
        super.onStartCommand(intent, i4, i5);
        if (this.f6154e) {
            i.e().f(f6152f, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f6153d.j();
            g();
            this.f6154e = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f6153d.a(intent, i5);
        return 3;
    }
}
