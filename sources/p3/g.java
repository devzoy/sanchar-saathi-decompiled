package P3;

import C3.o;
import C3.p;
import O3.f;
import O3.h;
import O3.r;
import O3.y;
import h3.C0663d;
import h3.C0664e;
import h3.C0666g;
import h3.C0670k;
import i3.C0746w;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import u3.l;
import v3.m;

public final class g extends h {

    /* renamed from: f  reason: collision with root package name */
    public static final a f2282f = new a((v3.g) null);

    /* renamed from: g  reason: collision with root package name */
    public static final r f2283g = r.a.e(r.f2128f, "/", false, 1, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    public final C0663d f2284e;

    public static final class a {

        /* renamed from: P3.g$a$a  reason: collision with other inner class name */
        public static final class C0049a extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public static final C0049a f2285f = new C0049a();

            public C0049a() {
                super(1);
            }

            /* renamed from: a */
            public final Boolean i(h hVar) {
                v3.l.e(hVar, "entry");
                return Boolean.valueOf(g.f2282f.c(hVar.a()));
            }
        }

        public /* synthetic */ a(v3.g gVar) {
            this();
        }

        public final r b() {
            return g.f2283g;
        }

        public final boolean c(r rVar) {
            return !o.m(rVar.n(), ".class", true);
        }

        public final List d(ClassLoader classLoader) {
            v3.l.e(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources("");
            v3.l.d(resources, "getResources(\"\")");
            ArrayList<T> list = Collections.list(resources);
            v3.l.d(list, "list(this)");
            ArrayList arrayList = new ArrayList();
            for (T t4 : list) {
                a m4 = g.f2282f;
                v3.l.d(t4, "it");
                C0666g e4 = m4.e(t4);
                if (e4 != null) {
                    arrayList.add(e4);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            v3.l.d(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<T> list2 = Collections.list(resources2);
            v3.l.d(list2, "list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (T t5 : list2) {
                a m5 = g.f2282f;
                v3.l.d(t5, "it");
                C0666g f4 = m5.f(t5);
                if (f4 != null) {
                    arrayList2.add(f4);
                }
            }
            return C0746w.D(arrayList, arrayList2);
        }

        public final C0666g e(URL url) {
            v3.l.e(url, "<this>");
            if (!v3.l.a(url.getProtocol(), "file")) {
                return null;
            }
            return C0670k.a(h.f2116b, r.a.d(r.f2128f, new File(url.toURI()), false, 1, (Object) null));
        }

        public final C0666g f(URL url) {
            int M4;
            v3.l.e(url, "<this>");
            String url2 = url.toString();
            v3.l.d(url2, "toString()");
            if (!o.v(url2, "jar:file:", false, 2, (Object) null) || (M4 = p.M(url2, "!", 0, false, 6, (Object) null)) == -1) {
                return null;
            }
            r.a aVar = r.f2128f;
            String substring = url2.substring(4, M4);
            v3.l.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return C0670k.a(i.d(r.a.d(aVar, new File(URI.create(substring)), false, 1, (Object) null), h.f2116b, C0049a.f2285f), b());
        }

        public a() {
        }
    }

    public static final class b extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ClassLoader f2286f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(ClassLoader classLoader) {
            super(0);
            this.f2286f = classLoader;
        }

        /* renamed from: a */
        public final List c() {
            return g.f2282f.d(this.f2286f);
        }
    }

    public g(ClassLoader classLoader, boolean z4) {
        v3.l.e(classLoader, "classLoader");
        this.f2284e = C0664e.a(new b(classLoader));
        if (z4) {
            p().size();
        }
    }

    private final r o(r rVar) {
        return f2283g.s(rVar, true);
    }

    public void a(r rVar, r rVar2) {
        v3.l.e(rVar, "source");
        v3.l.e(rVar2, "target");
        throw new IOException(this + " is read-only");
    }

    public void d(r rVar, boolean z4) {
        v3.l.e(rVar, "dir");
        throw new IOException(this + " is read-only");
    }

    public void f(r rVar, boolean z4) {
        v3.l.e(rVar, "path");
        throw new IOException(this + " is read-only");
    }

    public O3.g h(r rVar) {
        v3.l.e(rVar, "path");
        if (!f2282f.c(rVar)) {
            return null;
        }
        String q4 = q(rVar);
        for (C0666g gVar : p()) {
            O3.g h4 = ((h) gVar.a()).h(((r) gVar.b()).t(q4));
            if (h4 != null) {
                return h4;
            }
        }
        return null;
    }

    public f i(r rVar) {
        v3.l.e(rVar, "file");
        if (f2282f.c(rVar)) {
            String q4 = q(rVar);
            for (C0666g gVar : p()) {
                try {
                    return ((h) gVar.a()).i(((r) gVar.b()).t(q4));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + rVar);
        }
        throw new FileNotFoundException("file not found: " + rVar);
    }

    public f k(r rVar, boolean z4, boolean z5) {
        v3.l.e(rVar, "file");
        throw new IOException("resources are not writable");
    }

    public y l(r rVar) {
        v3.l.e(rVar, "file");
        if (f2282f.c(rVar)) {
            String q4 = q(rVar);
            for (C0666g gVar : p()) {
                try {
                    return ((h) gVar.a()).l(((r) gVar.b()).t(q4));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + rVar);
        }
        throw new FileNotFoundException("file not found: " + rVar);
    }

    public final List p() {
        return (List) this.f2284e.getValue();
    }

    public final String q(r rVar) {
        return o(rVar).r(f2283g).toString();
    }
}
