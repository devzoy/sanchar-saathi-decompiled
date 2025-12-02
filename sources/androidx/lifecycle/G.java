package androidx.lifecycle;

import m0.C0785a;
import m0.C0788d;
import n0.C0799c;
import v3.g;
import v3.l;

public class G {

    /* renamed from: b  reason: collision with root package name */
    public static final b f5353b = new b((g) null);

    /* renamed from: c  reason: collision with root package name */
    public static final C0785a.b f5354c = C0799c.a.f11230a;

    /* renamed from: a  reason: collision with root package name */
    public final C0788d f5355a;

    public static class a extends d {

        /* renamed from: d  reason: collision with root package name */
        public static final b f5356d = new b((g) null);

        /* renamed from: e  reason: collision with root package name */
        public static final C0785a.b f5357e = new C0091a();

        /* renamed from: androidx.lifecycle.G$a$a  reason: collision with other inner class name */
        public static final class C0091a implements C0785a.b {
        }

        public static final class b {
            public /* synthetic */ b(g gVar) {
                this();
            }

            public b() {
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public b() {
        }
    }

    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f5358a = a.f5359a;

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ a f5359a = new a();
        }

        F a(Class cls) {
            l.e(cls, "modelClass");
            return C0799c.f11229a.c();
        }

        F b(A3.b bVar, C0785a aVar) {
            l.e(bVar, "modelClass");
            l.e(aVar, "extras");
            return c(t3.a.a(bVar), aVar);
        }

        F c(Class cls, C0785a aVar) {
            l.e(cls, "modelClass");
            l.e(aVar, "extras");
            return a(cls);
        }
    }

    public static class d implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f5360b = new a((g) null);

        /* renamed from: c  reason: collision with root package name */
        public static final C0785a.b f5361c = C0799c.a.f11230a;

        public static final class a {
            public /* synthetic */ a(g gVar) {
                this();
            }

            public a() {
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public G(H h4, c cVar) {
        this(h4, cVar, (C0785a) null, 4, (g) null);
        l.e(h4, "store");
        l.e(cVar, "factory");
    }

    public final F a(A3.b bVar) {
        l.e(bVar, "modelClass");
        return C0788d.b(this.f5355a, bVar, (String) null, 2, (Object) null);
    }

    public F b(Class cls) {
        l.e(cls, "modelClass");
        return a(t3.a.c(cls));
    }

    public F c(String str, Class cls) {
        l.e(str, "key");
        l.e(cls, "modelClass");
        return this.f5355a.a(t3.a.c(cls), str);
    }

    public G(C0788d dVar) {
        this.f5355a = dVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(H h4, c cVar, C0785a aVar, int i4, g gVar) {
        this(h4, cVar, (i4 & 4) != 0 ? C0785a.C0184a.f11134b : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public G(H h4, c cVar, C0785a aVar) {
        this(new C0788d(h4, cVar, aVar));
        l.e(h4, "store");
        l.e(cVar, "factory");
        l.e(aVar, "defaultCreationExtras");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public G(I i4, c cVar) {
        this(i4.t(), cVar, C0799c.f11229a.a(i4));
        l.e(i4, "owner");
        l.e(cVar, "factory");
    }
}
