package w1;

import J1.f;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import u1.C0941a;
import u1.d;

public abstract class Y extends C0974g implements DialogInterface.OnCancelListener {

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f12564d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference f12565e = new AtomicReference((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public final Handler f12566f = new f(Looper.getMainLooper());

    /* renamed from: g  reason: collision with root package name */
    public final d f12567g;

    public Y(C0975h hVar, d dVar) {
        super(hVar);
        this.f12567g = dVar;
    }

    public static final int n(U u4) {
        if (u4 == null) {
            return -1;
        }
        return u4.a();
    }

    public final void e(int i4, int i5, Intent intent) {
        U u4 = (U) this.f12565e.get();
        if (i4 != 1) {
            if (i4 == 2) {
                int f4 = this.f12567g.f(b());
                if (f4 == 0) {
                    r();
                    return;
                } else if (u4 == null) {
                    return;
                } else {
                    if (u4.b().d() == 18 && f4 == 18) {
                        return;
                    }
                }
            }
        } else if (i5 == -1) {
            r();
            return;
        } else if (i5 == 0) {
            if (u4 != null) {
                int i6 = 13;
                if (intent != null) {
                    i6 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                s(new C0941a(i6, (PendingIntent) null, u4.b().toString()), n(u4));
                return;
            }
            return;
        }
        if (u4 != null) {
            s(u4.b(), u4.a());
        }
    }

    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f12565e.set(bundle.getBoolean("resolving_error", false) ? new U(new C0941a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    public final void i(Bundle bundle) {
        super.i(bundle);
        U u4 = (U) this.f12565e.get();
        if (u4 != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", u4.a());
            bundle.putInt("failed_status", u4.b().d());
            bundle.putParcelable("failed_resolution", u4.b().g());
        }
    }

    public void j() {
        super.j();
        this.f12564d = true;
    }

    public void k() {
        super.k();
        this.f12564d = false;
    }

    /* renamed from: l */
    public final void r() {
        this.f12565e.set((Object) null);
        p();
    }

    /* renamed from: m */
    public final void s(C0941a aVar, int i4) {
        this.f12565e.set((Object) null);
        o(aVar, i4);
    }

    public abstract void o(C0941a aVar, int i4);

    public final void onCancel(DialogInterface dialogInterface) {
        s(new C0941a(13, (PendingIntent) null), n((U) this.f12565e.get()));
    }

    public abstract void p();

    public final void q(C0941a aVar, int i4) {
        U u4 = new U(aVar, i4);
        if (X.a(this.f12565e, (Object) null, u4)) {
            this.f12566f.post(new W(this, u4));
        }
    }
}
