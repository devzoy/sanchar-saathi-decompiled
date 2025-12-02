package R0;

import O.c;
import Q0.q;
import android.os.Handler;
import android.os.Looper;

/* renamed from: R0.d  reason: case insensitive filesystem */
public class C0302d implements q {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f2511a = c.a(Looper.getMainLooper());

    public void a(long j4, Runnable runnable) {
        this.f2511a.postDelayed(runnable, j4);
    }

    public void b(Runnable runnable) {
        this.f2511a.removeCallbacks(runnable);
    }
}
