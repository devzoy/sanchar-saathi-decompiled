package K0;

import D3.V;
import F3.r;
import G3.d;
import G3.f;
import android.app.Activity;
import h3.C0668i;
import h3.C0673n;
import l3.e;
import m3.C0795c;
import n3.k;
import r0.C0907e;
import u3.p;
import v3.l;
import v3.m;

public final class i implements f {

    /* renamed from: b  reason: collision with root package name */
    public final l f1662b;

    /* renamed from: c  reason: collision with root package name */
    public final L0.a f1663c;

    public static final class a extends k implements p {

        /* renamed from: i  reason: collision with root package name */
        public int f1664i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f1665j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ i f1666k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ Activity f1667l;

        /* renamed from: K0.i$a$a  reason: collision with other inner class name */
        public static final class C0030a extends m implements u3.a {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ i f1668f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ R.a f1669g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0030a(i iVar, R.a aVar) {
                super(0);
                this.f1668f = iVar;
                this.f1669g = aVar;
            }

            public final void a() {
                this.f1668f.f1663c.b(this.f1669g);
            }

            public /* bridge */ /* synthetic */ Object c() {
                a();
                return C0673n.f9639a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar, Activity activity, e eVar) {
            super(2, eVar);
            this.f1666k = iVar;
            this.f1667l = activity;
        }

        public static final void w(r rVar, j jVar) {
            rVar.E(jVar);
        }

        public final e j(Object obj, e eVar) {
            a aVar = new a(this.f1666k, this.f1667l, eVar);
            aVar.f1665j = obj;
            return aVar;
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f1664i;
            if (i4 == 0) {
                C0668i.b(obj);
                r rVar = (r) this.f1665j;
                h hVar = new h(rVar);
                this.f1666k.f1663c.a(this.f1667l, new C0907e(), hVar);
                C0030a aVar = new C0030a(this.f1666k, hVar);
                this.f1664i = 1;
                if (F3.p.a(rVar, aVar, this) == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C0673n.f9639a;
        }

        /* renamed from: t */
        public final Object g(r rVar, e eVar) {
            return ((a) j(rVar, eVar)).o(C0673n.f9639a);
        }
    }

    public i(l lVar, L0.a aVar) {
        l.e(lVar, "windowMetricsCalculator");
        l.e(aVar, "windowBackend");
        this.f1662b = lVar;
        this.f1663c = aVar;
    }

    public d a(Activity activity) {
        l.e(activity, "activity");
        return f.k(f.c(new a(this, activity, (e) null)), V.c());
    }
}
