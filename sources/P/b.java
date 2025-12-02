package P;

import android.os.Handler;
import android.os.Looper;

public abstract class b {
    public static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
