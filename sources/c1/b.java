package C1;

import D1.g;
import E1.d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import z1.C1032o;
import z1.d0;

public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f527b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile b f528c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f529a = new ConcurrentHashMap();

    public static b a() {
        if (f528c == null) {
            synchronized (f527b) {
                try {
                    if (f528c == null) {
                        f528c = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b bVar = f528c;
        C1032o.f(bVar);
        return bVar;
    }

    public static boolean e(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof d0);
    }

    public static void f(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public static final boolean g(Context context, Intent intent, ServiceConnection serviceConnection, int i4, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!g.e() || executor == null) ? context.bindService(intent, serviceConnection, i4) : context.bindService(intent, i4, executor, serviceConnection);
    }

    public void b(Context context, ServiceConnection serviceConnection) {
        if (e(serviceConnection)) {
            ConcurrentHashMap concurrentHashMap = this.f529a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    f(context, (ServiceConnection) concurrentHashMap.get(serviceConnection));
                    return;
                } finally {
                    this.f529a.remove(serviceConnection);
                }
            }
        }
        f(context, serviceConnection);
    }

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i4, Executor executor) {
        return d(context, str, intent, serviceConnection, 4225, true, executor);
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i4, boolean z4, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((d.a(context).b(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!e(serviceConnection)) {
            return g(context, intent, serviceConnection, i4, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f529a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean g4 = g(context, intent, serviceConnection, i4, executor);
            if (g4) {
                return g4;
            }
            return false;
        } finally {
            this.f529a.remove(serviceConnection, serviceConnection);
        }
    }
}
