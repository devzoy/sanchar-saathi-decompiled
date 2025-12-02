package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r0.C0909g;
import r0.C0910h;
import r0.C0911i;
import r0.C0912j;

public class ProfileInstallerInitializer implements B0.b {

    public static class a {
        public static void c(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new C0912j(runnable));
        }
    }

    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    public static void l(Context context) {
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new C0911i(context));
    }

    public List a() {
        return Collections.emptyList();
    }

    /* renamed from: f */
    public c b(Context context) {
        g(context.getApplicationContext());
        return new c();
    }

    public void g(Context context) {
        a.c(new C0909g(this, context));
    }

    /* renamed from: h */
    public void i(Context context) {
        b.a(Looper.getMainLooper()).postDelayed(new C0910h(context), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
    }
}
