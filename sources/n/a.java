package N;

import android.net.ConnectivityManager;

public abstract class a {
    public static boolean a(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
