package u0;

import h3.C0663d;
import h3.C0664e;
import java.util.concurrent.atomic.AtomicBoolean;
import v3.l;
import v3.m;
import y0.k;

/* renamed from: u0.A  reason: case insensitive filesystem */
public abstract class C0935A {

    /* renamed from: a  reason: collision with root package name */
    public final u f12100a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicBoolean f12101b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public final C0663d f12102c = C0664e.a(new a(this));

    /* renamed from: u0.A$a */
    public static final class a extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ C0935A f12103f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C0935A a4) {
            super(0);
            this.f12103f = a4;
        }

        /* renamed from: a */
        public final k c() {
            return this.f12103f.d();
        }
    }

    public C0935A(u uVar) {
        l.e(uVar, "database");
        this.f12100a = uVar;
    }

    public k b() {
        c();
        return g(this.f12101b.compareAndSet(false, true));
    }

    public void c() {
        this.f12100a.c();
    }

    public final k d() {
        return this.f12100a.f(e());
    }

    public abstract String e();

    public final k f() {
        return (k) this.f12102c.getValue();
    }

    public final k g(boolean z4) {
        return z4 ? f() : d();
    }

    public void h(k kVar) {
        l.e(kVar, "statement");
        if (kVar == f()) {
            this.f12101b.set(false);
        }
    }
}
