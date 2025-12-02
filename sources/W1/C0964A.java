package w1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: w1.A  reason: case insensitive filesystem */
public final /* synthetic */ class C0964A implements Executor {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Handler f12523e;

    public /* synthetic */ C0964A(Handler handler) {
        this.f12523e = handler;
    }

    public final /* synthetic */ void execute(Runnable runnable) {
        this.f12523e.post(runnable);
    }
}
