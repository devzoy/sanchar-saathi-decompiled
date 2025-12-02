package O3;

import O3.r;
import P3.b;
import v3.g;
import v3.l;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2115a = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    public static final h f2116b;

    /* renamed from: c  reason: collision with root package name */
    public static final r f2117c;

    /* renamed from: d  reason: collision with root package name */
    public static final h f2118d;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    static {
        h hVar;
        try {
            Class.forName("java.nio.file.Files");
            hVar = new n();
        } catch (ClassNotFoundException unused) {
            hVar = new m();
        }
        f2116b = hVar;
        r.a aVar = r.f2128f;
        String property = System.getProperty("java.io.tmpdir");
        l.d(property, "getProperty(\"java.io.tmpdir\")");
        f2117c = r.a.e(aVar, property, false, 1, (Object) null);
        ClassLoader classLoader = P3.g.class.getClassLoader();
        l.d(classLoader, "ResourceFileSystem::class.java.classLoader");
        f2118d = new P3.g(classLoader, false);
    }

    public abstract void a(r rVar, r rVar2);

    public final void b(r rVar, boolean z4) {
        l.e(rVar, "dir");
        b.a(this, rVar, z4);
    }

    public final void c(r rVar) {
        l.e(rVar, "dir");
        d(rVar, false);
    }

    public abstract void d(r rVar, boolean z4);

    public final void e(r rVar) {
        l.e(rVar, "path");
        f(rVar, false);
    }

    public abstract void f(r rVar, boolean z4);

    public final boolean g(r rVar) {
        l.e(rVar, "path");
        return b.b(this, rVar);
    }

    public abstract g h(r rVar);

    public abstract f i(r rVar);

    public final f j(r rVar) {
        l.e(rVar, "file");
        return k(rVar, false, false);
    }

    public abstract f k(r rVar, boolean z4, boolean z5);

    public abstract y l(r rVar);
}
