package Q0;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2418a = i.i("WorkerFactory");

    public class a extends v {
        public c a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    public static v c() {
        return new a();
    }

    public abstract c a(Context context, String str, WorkerParameters workerParameters);

    public final c b(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        c a4 = a(context, str, workerParameters);
        if (a4 == null) {
            try {
                cls = Class.forName(str).asSubclass(c.class);
            } catch (Throwable th) {
                i e4 = i.e();
                String str2 = f2418a;
                e4.d(str2, "Invalid class: " + str, th);
                cls = null;
            }
            if (cls != null) {
                try {
                    a4 = (c) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    i e5 = i.e();
                    String str3 = f2418a;
                    e5.d(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a4 == null || !a4.j()) {
            return a4;
        }
        String name = getClass().getName();
        throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
