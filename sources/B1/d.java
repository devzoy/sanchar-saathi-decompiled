package B1;

import R1.f;
import android.content.Context;
import v1.C0947a;
import v1.C0951e;
import w1.C0981n;
import z1.C1036t;
import z1.C1037u;
import z1.r;

public final class d extends C0951e implements C1036t {

    /* renamed from: l  reason: collision with root package name */
    public static final C0947a.g f247l;

    /* renamed from: m  reason: collision with root package name */
    public static final C0947a.C0204a f248m;

    /* renamed from: n  reason: collision with root package name */
    public static final C0947a f249n;

    static {
        C0947a.g gVar = new C0947a.g();
        f247l = gVar;
        b bVar = new b();
        f248m = bVar;
        f249n = new C0947a("ClientTelemetry.API", bVar, gVar);
    }

    public d(Context context, C1037u uVar) {
        super(context, f249n, (C0947a.d) uVar, C0951e.a.f12421c);
    }

    public final f a(r rVar) {
        C0981n.a a4 = C0981n.a();
        a4.d(J1.d.f1617a);
        a4.c(false);
        a4.b(new c(rVar));
        return e(a4.a());
    }
}
