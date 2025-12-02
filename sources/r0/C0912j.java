package r0;

import android.view.Choreographer;

/* renamed from: r0.j  reason: case insensitive filesystem */
public final /* synthetic */ class C0912j implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f11965a;

    public /* synthetic */ C0912j(Runnable runnable) {
        this.f11965a = runnable;
    }

    public final void doFrame(long j4) {
        this.f11965a.run();
    }
}
