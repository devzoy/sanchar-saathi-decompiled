package O;

import android.os.Handler;
import android.os.Looper;

public abstract class c {

    public static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler a(Looper looper) {
        return a.a(looper);
    }
}
