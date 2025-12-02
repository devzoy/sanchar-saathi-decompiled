package w1;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Objects;
import u1.C0941a;
import u1.d;
import z1.C1032o;

public final class W implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final U f12562e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Y f12563f;

    public W(Y y4, U u4) {
        Objects.requireNonNull(y4);
        this.f12563f = y4;
        this.f12562e = u4;
    }

    public final void run() {
        Y y4 = this.f12563f;
        if (y4.f12564d) {
            U u4 = this.f12562e;
            C0941a b4 = u4.b();
            if (b4.h()) {
                y4.f12612c.startActivityForResult(GoogleApiActivity.a(y4.b(), (PendingIntent) C1032o.f(b4.g()), u4.a(), false), 1);
                return;
            }
            Activity b5 = y4.b();
            int d4 = b4.d();
            d dVar = y4.f12567g;
            if (dVar.a(b5, d4, (String) null) != null) {
                dVar.q(y4.b(), y4.f12612c, b4.d(), 2, y4);
            } else if (b4.d() == 18) {
                dVar.u(y4.b().getApplicationContext(), new V(this, dVar.t(y4.b(), y4)));
            } else {
                y4.s(b4, u4.a());
            }
        }
    }
}
