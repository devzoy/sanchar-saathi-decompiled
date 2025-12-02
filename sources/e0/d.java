package e0;

import O3.h;
import O3.r;
import c0.n;
import c0.w;
import c0.x;
import h3.C0663d;
import h3.C0664e;
import h3.C0673n;
import java.util.LinkedHashSet;
import java.util.Set;
import u3.p;
import v3.g;
import v3.l;
import v3.m;

public final class d implements w {

    /* renamed from: f  reason: collision with root package name */
    public static final b f8718f = new b((g) null);

    /* renamed from: g  reason: collision with root package name */
    public static final Set f8719g = new LinkedHashSet();

    /* renamed from: h  reason: collision with root package name */
    public static final h f8720h = new h();

    /* renamed from: a  reason: collision with root package name */
    public final h f8721a;

    /* renamed from: b  reason: collision with root package name */
    public final c f8722b;

    /* renamed from: c  reason: collision with root package name */
    public final p f8723c;

    /* renamed from: d  reason: collision with root package name */
    public final u3.a f8724d;

    /* renamed from: e  reason: collision with root package name */
    public final C0663d f8725e;

    public static final class a extends m implements p {

        /* renamed from: f  reason: collision with root package name */
        public static final a f8726f = new a();

        public a() {
            super(2);
        }

        /* renamed from: a */
        public final n g(r rVar, h hVar) {
            l.e(rVar, "path");
            l.e(hVar, "<anonymous parameter 1>");
            return f.a(rVar);
        }
    }

    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final Set a() {
            return d.f8719g;
        }

        public final h b() {
            return d.f8720h;
        }

        public b() {
        }
    }

    public static final class c extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ d f8727f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar) {
            super(0);
            this.f8727f = dVar;
        }

        /* renamed from: a */
        public final r c() {
            r rVar = (r) this.f8727f.f8724d.c();
            boolean m4 = rVar.m();
            d dVar = this.f8727f;
            if (m4) {
                return rVar.p();
            }
            throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + dVar.f8724d + ", instead got " + rVar).toString());
        }
    }

    /* renamed from: e0.d$d  reason: collision with other inner class name */
    public static final class C0146d extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ d f8728f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0146d(d dVar) {
            super(0);
            this.f8728f = dVar;
        }

        public final void a() {
            b bVar = d.f8718f;
            h b4 = bVar.b();
            d dVar = this.f8728f;
            synchronized (b4) {
                bVar.a().remove(dVar.f().toString());
                C0673n nVar = C0673n.f9639a;
            }
        }

        public /* bridge */ /* synthetic */ Object c() {
            a();
            return C0673n.f9639a;
        }
    }

    public d(h hVar, c cVar, p pVar, u3.a aVar) {
        l.e(hVar, "fileSystem");
        l.e(cVar, "serializer");
        l.e(pVar, "coordinatorProducer");
        l.e(aVar, "producePath");
        this.f8721a = hVar;
        this.f8722b = cVar;
        this.f8723c = pVar;
        this.f8724d = aVar;
        this.f8725e = C0664e.a(new c(this));
    }

    public x a() {
        String rVar = f().toString();
        synchronized (f8720h) {
            Set set = f8719g;
            if (!set.contains(rVar)) {
                set.add(rVar);
            } else {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + rVar + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
        }
        return new e(this.f8721a, f(), this.f8722b, (n) this.f8723c.g(f(), this.f8721a), new C0146d(this));
    }

    public final r f() {
        return (r) this.f8725e.getValue();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(h hVar, c cVar, p pVar, u3.a aVar, int i4, g gVar) {
        this(hVar, cVar, (i4 & 4) != 0 ? a.f8726f : pVar, aVar);
    }
}
