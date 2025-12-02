package D3;

import l3.f;
import l3.i;
import l3.j;
import n3.e;
import u3.p;
import v3.m;
import v3.w;

public abstract class E {

    public static final class a extends m implements p {

        /* renamed from: f  reason: collision with root package name */
        public static final a f775f = new a();

        public a() {
            super(2);
        }

        /* renamed from: a */
        public final i g(i iVar, i.b bVar) {
            return iVar.h(bVar);
        }
    }

    public static final class b extends m implements p {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w f776f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ boolean f777g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(w wVar, boolean z4) {
            super(2);
            this.f776f = wVar;
            this.f777g = z4;
        }

        /* renamed from: a */
        public final i g(i iVar, i.b bVar) {
            return iVar.h(bVar);
        }
    }

    public static final class c extends m implements p {

        /* renamed from: f  reason: collision with root package name */
        public static final c f778f = new c();

        public c() {
            super(2);
        }

        public final Boolean a(boolean z4, i.b bVar) {
            return Boolean.valueOf(z4);
        }

        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (i.b) obj2);
        }
    }

    public static final i a(i iVar, i iVar2, boolean z4) {
        boolean c4 = c(iVar);
        boolean c5 = c(iVar2);
        if (!c4 && !c5) {
            return iVar.h(iVar2);
        }
        w wVar = new w();
        wVar.f12469e = iVar2;
        j jVar = j.f11131e;
        i iVar3 = (i) iVar.H(jVar, new b(wVar, z4));
        if (c5) {
            wVar.f12469e = ((i) wVar.f12469e).H(jVar, a.f775f);
        }
        return iVar3.h((i) wVar.f12469e);
    }

    public static final String b(i iVar) {
        return null;
    }

    public static final boolean c(i iVar) {
        return ((Boolean) iVar.H(Boolean.FALSE, c.f778f)).booleanValue();
    }

    public static final i d(I i4, i iVar) {
        i a4 = a(i4.p(), iVar, true);
        return (a4 == V.a() || a4.d(f.f11129d) != null) ? a4 : a4.h(V.a());
    }

    public static final i e(i iVar, i iVar2) {
        return !c(iVar2) ? iVar.h(iVar2) : a(iVar, iVar2, false);
    }

    public static final L0 f(e eVar) {
        while (!(eVar instanceof S) && (eVar = eVar.l()) != null) {
            if (eVar instanceof L0) {
                return (L0) eVar;
            }
        }
        return null;
    }

    public static final L0 g(l3.e eVar, i iVar, Object obj) {
        if (!(eVar instanceof e) || iVar.d(M0.f794e) == null) {
            return null;
        }
        L0 f4 = f((e) eVar);
        if (f4 != null) {
            f4.U0(iVar, obj);
        }
        return f4;
    }
}
