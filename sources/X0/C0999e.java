package x0;

import android.os.Bundle;
import androidx.lifecycle.C0380g;
import v3.g;
import v3.l;

/* renamed from: x0.e  reason: case insensitive filesystem */
public final class C0999e {

    /* renamed from: d  reason: collision with root package name */
    public static final a f12698d = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final C1000f f12699a;

    /* renamed from: b  reason: collision with root package name */
    public final C0998d f12700b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12701c;

    /* renamed from: x0.e$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final C0999e a(C1000f fVar) {
            l.e(fVar, "owner");
            return new C0999e(fVar, (g) null);
        }

        public a() {
        }
    }

    public /* synthetic */ C0999e(C1000f fVar, g gVar) {
        this(fVar);
    }

    public static final C0999e a(C1000f fVar) {
        return f12698d.a(fVar);
    }

    public final C0998d b() {
        return this.f12700b;
    }

    public final void c() {
        C0380g b4 = this.f12699a.b();
        if (b4.b() == C0380g.b.INITIALIZED) {
            b4.a(new C0996b(this.f12699a));
            this.f12700b.e(b4);
            this.f12701c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void d(Bundle bundle) {
        if (!this.f12701c) {
            c();
        }
        C0380g b4 = this.f12699a.b();
        if (!b4.b().f(C0380g.b.STARTED)) {
            this.f12700b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + b4.b()).toString());
    }

    public final void e(Bundle bundle) {
        l.e(bundle, "outBundle");
        this.f12700b.g(bundle);
    }

    public C0999e(C1000f fVar) {
        this.f12699a = fVar;
        this.f12700b = new C0998d();
    }
}
