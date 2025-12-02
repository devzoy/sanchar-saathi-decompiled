package androidx.work.impl;

import R0.C0301c;
import R0.C0304f;
import R0.C0305g;
import R0.C0306h;
import R0.C0307i;
import R0.C0308j;
import R0.C0309k;
import R0.F;
import R0.m;
import R0.n;
import R0.s;
import R0.y;
import Z0.C0336b;
import Z0.e;
import Z0.j;
import Z0.o;
import Z0.r;
import Z0.v;
import Z0.z;
import android.content.Context;
import java.util.concurrent.Executor;
import u0.t;
import u0.u;
import v3.g;
import v3.l;
import y0.h;
import z0.C1014f;

public abstract class WorkDatabase extends u {

    /* renamed from: p  reason: collision with root package name */
    public static final a f6136p = new a((g) null);

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public static final h c(Context context, h.b bVar) {
            l.e(context, "$context");
            l.e(bVar, "configuration");
            h.b.a a4 = h.b.f12717f.a(context);
            a4.d(bVar.f12719b).c(bVar.f12720c).e(true).a(true);
            return new C1014f().create(a4.b());
        }

        public final WorkDatabase b(Context context, Executor executor, boolean z4) {
            l.e(context, "context");
            l.e(executor, "queryExecutor");
            Class<WorkDatabase> cls = WorkDatabase.class;
            return (WorkDatabase) (z4 ? t.c(context, cls).c() : t.a(context, cls, "androidx.work.workdb").f(new y(context))).g(executor).a(C0301c.f2510a).b(C0307i.f2515c).b(new s(context, 2, 3)).b(C0308j.f2516c).b(C0309k.f2517c).b(new s(context, 5, 6)).b(R0.l.f2518c).b(m.f2519c).b(n.f2520c).b(new F(context)).b(new s(context, 10, 11)).b(C0304f.f2512c).b(C0305g.f2513c).b(C0306h.f2514c).e().d();
        }

        public a() {
        }
    }

    public static final WorkDatabase D(Context context, Executor executor, boolean z4) {
        return f6136p.b(context, executor, z4);
    }

    public abstract C0336b E();

    public abstract e F();

    public abstract j G();

    public abstract o H();

    public abstract r I();

    public abstract v J();

    public abstract z K();
}
