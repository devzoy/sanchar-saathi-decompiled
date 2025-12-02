package z1;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import u1.C0941a;

/* renamed from: z1.i  reason: case insensitive filesystem */
public abstract class C1026i {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f12995a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static int f12996b = 9;

    /* renamed from: c  reason: collision with root package name */
    public static c0 f12997c = null;

    /* renamed from: d  reason: collision with root package name */
    public static HandlerThread f12998d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Executor f12999e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f13000f = false;

    public static C1026i a(Context context) {
        synchronized (f12995a) {
            try {
                if (f12997c == null) {
                    f12997c = new c0(context.getApplicationContext(), f13000f ? b().getLooper() : context.getMainLooper(), f12999e);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f12997c;
    }

    public static HandlerThread b() {
        synchronized (f12995a) {
            try {
                HandlerThread handlerThread = f12998d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f12996b);
                f12998d = handlerThread2;
                handlerThread2.start();
                HandlerThread handlerThread3 = f12998d;
                return handlerThread3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract C0941a c(Z z4, ServiceConnection serviceConnection, String str, Executor executor);

    public final void d(String str, String str2, int i4, ServiceConnection serviceConnection, String str3, boolean z4) {
        e(new Z(str, str2, 4225, z4), serviceConnection, str3);
    }

    public abstract void e(Z z4, ServiceConnection serviceConnection, String str);
}
