package G0;

import java.lang.reflect.Method;
import v3.l;
import v3.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f1262a;

    /* renamed from: G0.a$a  reason: collision with other inner class name */
    public static final class C0017a extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a f1263f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0017a(a aVar) {
            super(0);
            this.f1263f = aVar;
        }

        /* renamed from: a */
        public final Class c() {
            Class<?> loadClass = this.f1263f.f1262a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            l.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            return loadClass;
        }
    }

    public static final class b extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a f1264f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f1264f = aVar;
        }

        /* renamed from: a */
        public final Boolean c() {
            Method declaredMethod = this.f1264f.d().getDeclaredMethod("getWindowExtensions", (Class[]) null);
            Class c4 = this.f1264f.c();
            P0.a aVar = P0.a.f2204a;
            l.d(declaredMethod, "getWindowExtensionsMethod");
            return Boolean.valueOf(aVar.c(declaredMethod, c4) && aVar.d(declaredMethod));
        }
    }

    public a(ClassLoader classLoader) {
        l.e(classLoader, "loader");
        this.f1262a = classLoader;
    }

    public final Class c() {
        Class<?> loadClass = this.f1262a.loadClass("androidx.window.extensions.WindowExtensions");
        l.d(loadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        return loadClass;
    }

    public final Class d() {
        Class<?> loadClass = this.f1262a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        l.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return loadClass;
    }

    public final boolean e() {
        return P0.a.f2204a.a(new C0017a(this));
    }

    public final boolean f() {
        return e() && P0.a.e("WindowExtensionsProvider#getWindowExtensions is not valid", new b(this));
    }
}
