package w1;

import android.os.Bundle;
import java.util.Objects;

public final class d0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0974g f12583e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f12584f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ e0 f12585g;

    public d0(e0 e0Var, C0974g gVar, String str) {
        this.f12583e = gVar;
        this.f12584f = str;
        Objects.requireNonNull(e0Var);
        this.f12585g = e0Var;
    }

    public final void run() {
        Bundle bundle;
        e0 e0Var = this.f12585g;
        if (e0Var.k() > 0) {
            C0974g gVar = this.f12583e;
            if (e0Var.l() != null) {
                bundle = e0Var.l().getBundle(this.f12584f);
            } else {
                bundle = null;
            }
            gVar.f(bundle);
        }
        if (e0Var.k() >= 2) {
            this.f12583e.j();
        }
        if (e0Var.k() >= 3) {
            this.f12583e.h();
        }
        if (e0Var.k() >= 4) {
            this.f12583e.k();
        }
        if (e0Var.k() >= 5) {
            this.f12583e.g();
        }
    }
}
