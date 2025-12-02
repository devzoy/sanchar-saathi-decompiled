package w1;

import D1.h;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: w1.c  reason: case insensitive filesystem */
public final class C0970c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: g  reason: collision with root package name */
    public static final C0970c f12576g = new C0970c();

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f12577c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f12578d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f12579e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public boolean f12580f = false;

    /* renamed from: w1.c$a */
    public interface a {
        void a(boolean z4);
    }

    public static C0970c b() {
        return f12576g;
    }

    public static void c(Application application) {
        C0970c cVar = f12576g;
        synchronized (cVar) {
            try {
                if (!cVar.f12580f) {
                    application.registerActivityLifecycleCallbacks(cVar);
                    application.registerComponentCallbacks(cVar);
                    cVar.f12580f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f12576g) {
            this.f12579e.add(aVar);
        }
    }

    public boolean d() {
        return this.f12577c.get();
    }

    public boolean e(boolean z4) {
        AtomicBoolean atomicBoolean = this.f12578d;
        if (!atomicBoolean.get()) {
            if (h.a()) {
                return z4;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f12577c.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z4) {
        synchronized (f12576g) {
            try {
                Iterator it = this.f12579e.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f12578d;
        boolean compareAndSet = this.f12577c.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f12578d;
        boolean compareAndSet = this.f12577c.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i4) {
        if (i4 == 20 && this.f12577c.compareAndSet(false, true)) {
            this.f12578d.set(true);
            f(true);
        }
    }
}
