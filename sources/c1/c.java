package c1;

import a1.s;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public class c implements C0403b {

    /* renamed from: a  reason: collision with root package name */
    public final s f6503a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6504b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final Executor f6505c = new a();

    public class a implements Executor {
        public a() {
        }

        public void execute(Runnable runnable) {
            c.this.f6504b.post(runnable);
        }
    }

    public c(Executor executor) {
        this.f6503a = new s(executor);
    }

    public Executor a() {
        return this.f6505c;
    }

    /* renamed from: d */
    public s b() {
        return this.f6503a;
    }
}
