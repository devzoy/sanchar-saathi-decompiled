package l3;

import l3.i;
import v3.l;

public interface f extends i.b {

    /* renamed from: d  reason: collision with root package name */
    public static final b f11129d = b.f11130e;

    public static final class a {
        public static i.b a(f fVar, i.c cVar) {
            i.b b4;
            l.e(cVar, "key");
            if (cVar instanceof b) {
                b bVar = (b) cVar;
                if (!bVar.a(fVar.getKey()) || (b4 = bVar.b(fVar)) == null) {
                    return null;
                }
                return b4;
            } else if (f.f11129d != cVar) {
                return null;
            } else {
                l.c(fVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return fVar;
            }
        }

        public static i b(f fVar, i.c cVar) {
            l.e(cVar, "key");
            if (!(cVar instanceof b)) {
                return f.f11129d == cVar ? j.f11131e : fVar;
            }
            b bVar = (b) cVar;
            return (!bVar.a(fVar.getKey()) || bVar.b(fVar) == null) ? fVar : j.f11131e;
        }
    }

    public static final class b implements i.c {

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ b f11130e = new b();
    }

    e J(e eVar);

    void e(e eVar);
}
