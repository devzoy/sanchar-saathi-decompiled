package O;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static long f2019a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f2020b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f2021c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f2022d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f2023e;

    static {
        Class<String> cls = String.class;
        Class<Trace> cls2 = Trace.class;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f2019a = cls2.getField("TRACE_TAG_APP").getLong((Object) null);
                Class cls3 = Long.TYPE;
                f2020b = cls2.getMethod("isTagEnabled", new Class[]{cls3});
                Class cls4 = Integer.TYPE;
                f2021c = cls2.getMethod("asyncTraceBegin", new Class[]{cls3, cls, cls4});
                f2022d = cls2.getMethod("asyncTraceEnd", new Class[]{cls3, cls, cls4});
                f2023e = cls2.getMethod("traceCounter", new Class[]{cls3, cls, cls4});
            } catch (Exception e4) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e4);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
