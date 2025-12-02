package l3;

import l3.f;
import u3.p;
import v3.l;

public interface i {

    public static final class a {
        public static i b(i iVar, i iVar2) {
            l.e(iVar2, "context");
            return iVar2 == j.f11131e ? iVar : (i) iVar2.H(iVar, new h());
        }

        public static i c(i iVar, b bVar) {
            d dVar;
            l.e(iVar, "acc");
            l.e(bVar, "element");
            i B4 = iVar.B(bVar.getKey());
            j jVar = j.f11131e;
            if (B4 == jVar) {
                return bVar;
            }
            f.b bVar2 = f.f11129d;
            f fVar = (f) B4.d(bVar2);
            if (fVar == null) {
                dVar = new d(B4, bVar);
            } else {
                i B5 = B4.B(bVar2);
                if (B5 == jVar) {
                    return new d(bVar, fVar);
                }
                dVar = new d(new d(B5, bVar), fVar);
            }
            return dVar;
        }
    }

    public interface b extends i {

        public static final class a {
            public static Object a(b bVar, Object obj, p pVar) {
                l.e(pVar, "operation");
                return pVar.g(obj, bVar);
            }

            public static b b(b bVar, c cVar) {
                l.e(cVar, "key");
                if (!l.a(bVar.getKey(), cVar)) {
                    return null;
                }
                l.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static i c(b bVar, c cVar) {
                l.e(cVar, "key");
                return l.a(bVar.getKey(), cVar) ? j.f11131e : bVar;
            }

            public static i d(b bVar, i iVar) {
                l.e(iVar, "context");
                return a.b(bVar, iVar);
            }
        }

        b d(c cVar);

        c getKey();
    }

    public interface c {
    }

    i B(c cVar);

    Object H(Object obj, p pVar);

    b d(c cVar);

    i h(i iVar);
}
