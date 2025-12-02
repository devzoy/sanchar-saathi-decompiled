package a1;

import android.net.ConnectivityManager;
import v3.l;

public abstract class o {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        l.e(connectivityManager, "<this>");
        l.e(networkCallback, "networkCallback");
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
