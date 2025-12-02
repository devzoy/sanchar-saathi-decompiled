package a1;

import android.net.ConnectivityManager;
import android.net.Network;
import v3.l;

public abstract class n {
    public static final Network a(ConnectivityManager connectivityManager) {
        l.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
