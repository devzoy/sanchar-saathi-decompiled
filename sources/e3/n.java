package e3;

import android.util.Log;
import i3.C0738o;
import java.util.List;

public abstract class n {
    public static final List b(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String th2 = th.toString();
        Throwable cause = th.getCause();
        String stackTraceString = Log.getStackTraceString(th);
        return C0738o.j(simpleName, th2, "Cause: " + cause + ", Stacktrace: " + stackTraceString);
    }
}
