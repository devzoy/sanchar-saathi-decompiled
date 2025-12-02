package I3;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: I3.c  reason: case insensitive filesystem */
public abstract class C0274c {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f1545a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f1545a = method;
    }

    public static final boolean a(Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f1545a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
