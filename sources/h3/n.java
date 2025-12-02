package H3;

import D3.t0;
import G3.e;
import h3.C0667h;
import h3.C0673n;
import l3.i;
import l3.j;
import m3.C0795c;
import n3.d;
import n3.h;
import u3.p;
import u3.q;
import v3.l;
import v3.m;

public final class n extends d implements e, n3.e {

    /* renamed from: h  reason: collision with root package name */
    public final e f1463h;

    /* renamed from: i  reason: collision with root package name */
    public final i f1464i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1465j;

    /* renamed from: k  reason: collision with root package name */
    public i f1466k;

    /* renamed from: l  reason: collision with root package name */
    public l3.e f1467l;

    public static final class a extends m implements p {

        /* renamed from: f  reason: collision with root package name */
        public static final a f1468f = new a();

        public a() {
            super(2);
        }

        public final Integer a(int i4, i.b bVar) {
            return Integer.valueOf(i4 + 1);
        }

        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (i.b) obj2);
        }
    }

    public n(e eVar, i iVar) {
        super(l.f1458e, j.f11131e);
        this.f1463h = eVar;
        this.f1464i = iVar;
        this.f1465j = ((Number) iVar.H(0, a.f1468f)).intValue();
    }

    public i a() {
        i iVar = this.f1466k;
        return iVar == null ? j.f11131e : iVar;
    }

    public Object b(Object obj, l3.e eVar) {
        try {
            Object t4 = t(eVar, obj);
            if (t4 == C0795c.c()) {
                h.c(eVar);
            }
            return t4 == C0795c.c() ? t4 : C0673n.f9639a;
        } catch (Throwable th) {
            this.f1466k = new i(th, eVar.a());
            throw th;
        }
    }

    public n3.e l() {
        l3.e eVar = this.f1467l;
        if (eVar instanceof n3.e) {
            return (n3.e) eVar;
        }
        return null;
    }

    public StackTraceElement n() {
        return null;
    }

    public Object o(Object obj) {
        Throwable b4 = C0667h.b(obj);
        if (b4 != null) {
            this.f1466k = new i(b4, a());
        }
        l3.e eVar = this.f1467l;
        if (eVar != null) {
            eVar.q(obj);
        }
        return C0795c.c();
    }

    public void p() {
        super.p();
    }

    public final void s(i iVar, i iVar2, Object obj) {
        if (iVar2 instanceof i) {
            w((i) iVar2, obj);
        }
        p.a(this, iVar);
    }

    public final Object t(l3.e eVar, Object obj) {
        i a4 = eVar.a();
        t0.e(a4);
        i iVar = this.f1466k;
        if (iVar != a4) {
            s(a4, iVar, obj);
            this.f1466k = a4;
        }
        this.f1467l = eVar;
        q a5 = o.f1469a;
        e eVar2 = this.f1463h;
        l.c(eVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        l.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object f4 = a5.f(eVar2, obj, this);
        if (!l.a(f4, C0795c.c())) {
            this.f1467l = null;
        }
        return f4;
    }

    public final void w(i iVar, Object obj) {
        throw new IllegalStateException(C3.h.i("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + iVar.f1456e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
