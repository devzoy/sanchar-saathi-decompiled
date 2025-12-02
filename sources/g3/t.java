package G3;

import F3.a;
import H3.m;
import I3.F;
import l3.i;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final F f1344a = new F("NONE");

    /* renamed from: b  reason: collision with root package name */
    public static final F f1345b = new F("PENDING");

    public static final n a(Object obj) {
        if (obj == null) {
            obj = m.f1460a;
        }
        return new s(obj);
    }

    public static final d d(r rVar, i iVar, int i4, a aVar) {
        return (((i4 < 0 || i4 >= 2) && i4 != -2) || aVar != a.DROP_OLDEST) ? q.a(rVar, iVar, i4, aVar) : rVar;
    }
}
