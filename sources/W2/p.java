package w2;

import android.os.IBinder;

public final class p extends j {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ IBinder f12666f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ r f12667g;

    public p(r rVar, IBinder iBinder) {
        this.f12666f = iBinder;
        this.f12667g = rVar;
    }

    public final void a() {
        this.f12667g.f12669a.f12683m = e.I(this.f12666f);
        t.q(this.f12667g.f12669a);
        this.f12667g.f12669a.f12677g = false;
        for (Runnable run : this.f12667g.f12669a.f12674d) {
            run.run();
        }
        this.f12667g.f12669a.f12674d.clear();
    }
}
