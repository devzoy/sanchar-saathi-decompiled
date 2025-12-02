package n;

import android.content.Context;
import android.content.res.Configuration;
import h.C0646b;

/* renamed from: n.a  reason: case insensitive filesystem */
public class C0796a {

    /* renamed from: a  reason: collision with root package name */
    public Context f11153a;

    public C0796a(Context context) {
        this.f11153a = context;
    }

    public static C0796a b(Context context) {
        return new C0796a(context);
    }

    public boolean a() {
        return this.f11153a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f11153a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f11153a.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600) {
            return 5;
        }
        if (i4 > 960 && i5 > 720) {
            return 5;
        }
        if (i4 > 720 && i5 > 960) {
            return 5;
        }
        if (i4 >= 500) {
            return 4;
        }
        if (i4 > 640 && i5 > 480) {
            return 4;
        }
        if (i4 <= 480 || i5 <= 640) {
            return i4 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean e() {
        return this.f11153a.getResources().getBoolean(C0646b.f9193a);
    }

    public boolean f() {
        return true;
    }
}
