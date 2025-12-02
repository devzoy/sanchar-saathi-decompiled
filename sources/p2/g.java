package P2;

import P2.c;
import android.os.Handler;
import android.os.Looper;
import g3.C0637a;

public class g implements c.d {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f2269a = C0637a.a(Looper.getMainLooper());

    public void a(Runnable runnable) {
        this.f2269a.post(runnable);
    }
}
