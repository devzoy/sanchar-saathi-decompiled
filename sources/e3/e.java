package E3;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import h3.C0667h;
import h3.C0668i;
import v3.g;
import v3.l;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final d f940a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        d dVar = null;
        try {
            C0667h.a aVar = C0667h.f9633e;
            obj = C0667h.a(new c(a(Looper.getMainLooper(), true), (String) null, 2, (g) null));
        } catch (Throwable th) {
            C0667h.a aVar2 = C0667h.f9633e;
            obj = C0667h.a(C0668i.a(th));
        }
        if (!C0667h.c(obj)) {
            dVar = obj;
        }
        f940a = dVar;
    }

    public static final Handler a(Looper looper, boolean z4) {
        if (!z4) {
            return new Handler(looper);
        }
        Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
        l.c(invoke, "null cannot be cast to non-null type android.os.Handler");
        return (Handler) invoke;
    }
}
