package X0;

import N.a;
import Q0.i;
import V0.b;
import a1.m;
import a1.n;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import c1.C0403b;
import v3.l;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3456a;

    static {
        String i4 = i.i("NetworkStateTracker");
        l.d(i4, "tagWithPrefix(\"NetworkStateTracker\")");
        f3456a = i4;
    }

    public static final h a(Context context, C0403b bVar) {
        l.e(context, "context");
        l.e(bVar, "taskExecutor");
        return new j(context, bVar);
    }

    public static final b c(ConnectivityManager connectivityManager) {
        l.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z4 = false;
        boolean z5 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean d4 = d(connectivityManager);
        boolean a4 = a.a(connectivityManager);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z4 = true;
        }
        return new b(z5, d4, a4, z4);
    }

    public static final boolean d(ConnectivityManager connectivityManager) {
        l.e(connectivityManager, "<this>");
        try {
            NetworkCapabilities a4 = m.a(connectivityManager, n.a(connectivityManager));
            if (a4 != null) {
                return m.b(a4, 16);
            }
            return false;
        } catch (SecurityException e4) {
            i.e().d(f3456a, "Unable to validate active network", e4);
            return false;
        }
    }
}
