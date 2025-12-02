package a1;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import v3.l;

public abstract class m {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        l.e(connectivityManager, "<this>");
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i4) {
        l.e(networkCapabilities, "<this>");
        return networkCapabilities.hasCapability(i4);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        l.e(connectivityManager, "<this>");
        l.e(networkCallback, "networkCallback");
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
