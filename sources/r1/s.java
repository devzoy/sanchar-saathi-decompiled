package R1;

import N1.a;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class s implements Executor {

    /* renamed from: e  reason: collision with root package name */
    public final Handler f2583e = new a(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f2583e.post(runnable);
    }
}
