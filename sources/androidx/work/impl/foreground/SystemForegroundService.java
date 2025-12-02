package androidx.work.impl.foreground;

import Q0.i;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.n;
import androidx.work.impl.foreground.a;

public class SystemForegroundService extends n implements a.b {

    /* renamed from: h  reason: collision with root package name */
    public static final String f6199h = i.i("SystemFgService");

    /* renamed from: i  reason: collision with root package name */
    public static SystemForegroundService f6200i = null;

    /* renamed from: d  reason: collision with root package name */
    public Handler f6201d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f6202e;

    /* renamed from: f  reason: collision with root package name */
    public a f6203f;

    /* renamed from: g  reason: collision with root package name */
    public NotificationManager f6204g;

    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f6205e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Notification f6206f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f6207g;

        public a(int i4, Notification notification, int i5) {
            this.f6205e = i4;
            this.f6206f = notification;
            this.f6207g = i5;
        }

        public void run() {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 31) {
                e.a(SystemForegroundService.this, this.f6205e, this.f6206f, this.f6207g);
            } else if (i4 >= 29) {
                d.a(SystemForegroundService.this, this.f6205e, this.f6206f, this.f6207g);
            } else {
                SystemForegroundService.this.startForeground(this.f6205e, this.f6206f);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f6209e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Notification f6210f;

        public b(int i4, Notification notification) {
            this.f6209e = i4;
            this.f6210f = notification;
        }

        public void run() {
            SystemForegroundService.this.f6204g.notify(this.f6209e, this.f6210f);
        }
    }

    public class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f6212e;

        public c(int i4) {
            this.f6212e = i4;
        }

        public void run() {
            SystemForegroundService.this.f6204g.cancel(this.f6212e);
        }
    }

    public static class d {
        public static void a(Service service, int i4, Notification notification, int i5) {
            service.startForeground(i4, notification, i5);
        }
    }

    public static class e {
        public static void a(Service service, int i4, Notification notification, int i5) {
            try {
                service.startForeground(i4, notification, i5);
            } catch (ForegroundServiceStartNotAllowedException e4) {
                i.e().l(SystemForegroundService.f6199h, "Unable to start foreground service", e4);
            }
        }
    }

    private void h() {
        this.f6201d = new Handler(Looper.getMainLooper());
        this.f6204g = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f6203f = aVar;
        aVar.n(this);
    }

    public void a() {
        this.f6202e = true;
        i.e().a(f6199h, "All commands completed.");
        stopForeground(true);
        f6200i = null;
        stopSelf();
    }

    public void d(int i4) {
        this.f6201d.post(new c(i4));
    }

    public void e(int i4, int i5, Notification notification) {
        this.f6201d.post(new a(i4, notification, i5));
    }

    public void f(int i4, Notification notification) {
        this.f6201d.post(new b(i4, notification));
    }

    public void onCreate() {
        super.onCreate();
        f6200i = this;
        h();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f6203f.l();
    }

    public int onStartCommand(Intent intent, int i4, int i5) {
        super.onStartCommand(intent, i4, i5);
        if (this.f6202e) {
            i.e().f(f6199h, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f6203f.l();
            h();
            this.f6202e = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f6203f.m(intent);
        return 3;
    }
}
