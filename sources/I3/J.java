package I3;

import D3.I0;
import l3.i;
import u3.p;
import v3.l;
import v3.m;

public abstract class J {

    /* renamed from: a  reason: collision with root package name */
    public static final F f1532a = new F("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    public static final p f1533b = a.f1536f;

    /* renamed from: c  reason: collision with root package name */
    public static final p f1534c = b.f1537f;

    /* renamed from: d  reason: collision with root package name */
    public static final p f1535d = c.f1538f;

    public static final class a extends m implements p {

        /* renamed from: f  reason: collision with root package name */
        public static final a f1536f = new a();

        public a() {
            super(2);
        }

        /* renamed from: a */
        public final Object g(Object obj, i.b bVar) {
            if (!(bVar instanceof I0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    public static final class b extends m implements p {

        /* renamed from: f  reason: collision with root package name */
        public static final b f1537f = new b();

        public b() {
            super(2);
        }

        /* renamed from: a */
        public final I0 g(I0 i02, i.b bVar) {
            if (i02 != null) {
                return i02;
            }
            if (bVar instanceof I0) {
                return (I0) bVar;
            }
            return null;
        }
    }

    public static final class c extends m implements p {

        /* renamed from: f  reason: collision with root package name */
        public static final c f1538f = new c();

        public c() {
            super(2);
        }

        /* renamed from: a */
        public final N g(N n4, i.b bVar) {
            if (bVar instanceof I0) {
                I0 i02 = (I0) bVar;
                n4.a(i02, i02.k(n4.f1539a));
            }
            return n4;
        }
    }

    public static final void a(i iVar, Object obj) {
        if (obj != f1532a) {
            if (obj instanceof N) {
                ((N) obj).b(iVar);
                return;
            }
            Object H4 = iVar.H((Object) null, f1534c);
            l.c(H4, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((I0) H4).m(iVar, obj);
        }
    }

    public static final Object b(i iVar) {
        Object H4 = iVar.H(0, f1533b);
        l.b(H4);
        return H4;
    }

    public static final Object c(i iVar, Object obj) {
        if (obj == null) {
            obj = b(iVar);
        }
        if (obj == 0) {
            return f1532a;
        }
        if (obj instanceof Integer) {
            return iVar.H(new N(iVar, ((Number) obj).intValue()), f1535d);
        }
        l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((I0) obj).k(iVar);
    }
}
