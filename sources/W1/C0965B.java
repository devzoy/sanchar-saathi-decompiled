package w1;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: w1.B  reason: case insensitive filesystem */
public final /* synthetic */ class C0965B implements Executor {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Handler f12524e;

    public /* synthetic */ C0965B(Handler handler) {
        this.f12524e = handler;
    }

    public final /* synthetic */ void execute(Runnable runnable) {
        this.f12524e.post(runnable);
    }
}
