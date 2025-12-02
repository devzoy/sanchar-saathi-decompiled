package q2;

import android.os.IBinder;

public final class z extends t {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ IBinder f11921f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ C f11922g;

    public z(C c4, IBinder iBinder) {
        this.f11922g = c4;
        this.f11921f = iBinder;
    }

    public final void a() {
        this.f11922g.f11878a.f11892m = k.I(this.f11921f);
        D.q(this.f11922g.f11878a);
        this.f11922g.f11878a.f11886g = false;
        for (Runnable run : this.f11922g.f11878a.f11883d) {
            run.run();
        }
        this.f11922g.f11878a.f11883d.clear();
    }
}
