package a1;

import Q0.i;
import android.content.Context;
import android.os.PowerManager;
import h3.C0673n;
import java.util.LinkedHashMap;
import java.util.Map;
import v3.l;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3983a;

    static {
        String i4 = i.i("WakeLocks");
        l.d(i4, "tagWithPrefix(\"WakeLocks\")");
        f3983a = i4;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        x xVar = x.f3984a;
        synchronized (xVar) {
            linkedHashMap.putAll(xVar.a());
            C0673n nVar = C0673n.f9639a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                i e4 = i.e();
                String str2 = f3983a;
                e4.k(str2, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String str) {
        l.e(context, "context");
        l.e(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        l.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        x xVar = x.f3984a;
        synchronized (xVar) {
            String str3 = (String) xVar.a().put(newWakeLock, str2);
        }
        l.d(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
