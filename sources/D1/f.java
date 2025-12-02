package D1;

import android.content.Context;
import android.content.pm.PackageManager;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f730a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f731b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f732c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f733d;

    public static boolean a(Context context) {
        return g(context.getPackageManager());
    }

    public static boolean b(Context context) {
        return d(context.getPackageManager());
    }

    public static boolean c(Context context) {
        if (b(context) && !g.b()) {
            return true;
        }
        if (e(context)) {
            return !g.c() || g.f();
        }
        return false;
    }

    public static boolean d(PackageManager packageManager) {
        if (f730a == null) {
            f730a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f730a.booleanValue();
    }

    public static boolean e(Context context) {
        if (f731b == null) {
            f731b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f731b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f732c == null) {
            f732c = Boolean.valueOf(g.c() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
        }
        return f732c.booleanValue();
    }

    public static boolean g(PackageManager packageManager) {
        if (f733d == null) {
            boolean z4 = false;
            if (g.c() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z4 = true;
            }
            f733d = Boolean.valueOf(z4);
        }
        return f733d.booleanValue();
    }
}
