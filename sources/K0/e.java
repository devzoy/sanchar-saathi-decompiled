package K0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import v3.l;
import v3.m;
import v3.x;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f1647a;

    /* renamed from: b  reason: collision with root package name */
    public final H0.d f1648b;

    /* renamed from: c  reason: collision with root package name */
    public final G0.a f1649c;

    public static final class a extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e f1650f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(0);
            this.f1650f = eVar;
        }

        /* renamed from: a */
        public final Boolean c() {
            boolean z4;
            Class b4 = this.f1650f.f();
            Method method = b4.getMethod("getBounds", (Class[]) null);
            Method method2 = b4.getMethod("getType", (Class[]) null);
            Method method3 = b4.getMethod("getState", (Class[]) null);
            P0.a aVar = P0.a.f2204a;
            l.d(method, "getBoundsMethod");
            if (aVar.b(method, x.b(Rect.class)) && aVar.d(method)) {
                l.d(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (aVar.b(method2, x.b(cls)) && aVar.d(method2)) {
                    l.d(method3, "getStateMethod");
                    if (aVar.b(method3, x.b(cls)) && aVar.d(method3)) {
                        z4 = true;
                        return Boolean.valueOf(z4);
                    }
                }
            }
            z4 = false;
            return Boolean.valueOf(z4);
        }
    }

    public static final class b extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e f1651f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar) {
            super(0);
            this.f1651f = eVar;
        }

        /* renamed from: a */
        public final Boolean c() {
            boolean z4;
            Class b4 = this.f1651f.f1648b.b();
            if (b4 == null) {
                return Boolean.FALSE;
            }
            Class d4 = this.f1651f.h();
            Method method = d4.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, b4});
            Method method2 = d4.getMethod("removeWindowLayoutInfoListener", new Class[]{b4});
            P0.a aVar = P0.a.f2204a;
            l.d(method, "addListenerMethod");
            if (aVar.d(method)) {
                l.d(method2, "removeListenerMethod");
                if (aVar.d(method2)) {
                    z4 = true;
                    return Boolean.valueOf(z4);
                }
            }
            z4 = false;
            return Boolean.valueOf(z4);
        }
    }

    public static final class c extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e f1652f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(e eVar) {
            super(0);
            this.f1652f = eVar;
        }

        /* renamed from: a */
        public final Boolean c() {
            boolean z4;
            Class d4 = this.f1652f.h();
            Class<Consumer> cls = Consumer.class;
            Method method = d4.getMethod("addWindowLayoutInfoListener", new Class[]{Context.class, cls});
            Method method2 = d4.getMethod("removeWindowLayoutInfoListener", new Class[]{cls});
            P0.a aVar = P0.a.f2204a;
            l.d(method, "addListenerMethod");
            if (aVar.d(method)) {
                l.d(method2, "removeListenerMethod");
                if (aVar.d(method2)) {
                    z4 = true;
                    return Boolean.valueOf(z4);
                }
            }
            z4 = false;
            return Boolean.valueOf(z4);
        }
    }

    public static final class d extends m implements u3.a {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ e f1653f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(e eVar) {
            super(0);
            this.f1653f = eVar;
        }

        /* renamed from: a */
        public final Boolean c() {
            Method method = this.f1653f.f1649c.c().getMethod("getWindowLayoutComponent", (Class[]) null);
            Class d4 = this.f1653f.h();
            P0.a aVar = P0.a.f2204a;
            l.d(method, "getWindowLayoutComponentMethod");
            return Boolean.valueOf(aVar.d(method) && aVar.c(method, d4));
        }
    }

    public e(ClassLoader classLoader, H0.d dVar) {
        l.e(classLoader, "loader");
        l.e(dVar, "consumerAdapter");
        this.f1647a = classLoader;
        this.f1648b = dVar;
        this.f1649c = new G0.a(classLoader);
    }

    public final boolean e() {
        if (!n()) {
            return false;
        }
        int a4 = H0.e.f1371a.a();
        if (a4 == 1) {
            return i();
        }
        if (2 > a4 || a4 > Integer.MAX_VALUE) {
            return false;
        }
        return j();
    }

    public final Class f() {
        Class<?> loadClass = this.f1647a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        l.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return loadClass;
    }

    public final WindowLayoutComponent g() {
        if (!e()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final Class h() {
        Class<?> loadClass = this.f1647a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        l.d(loadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return loadClass;
    }

    public final boolean i() {
        return l();
    }

    public final boolean j() {
        return i() && m();
    }

    public final boolean k() {
        return P0.a.e("FoldingFeature class is not valid", new a(this));
    }

    public final boolean l() {
        return P0.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new b(this));
    }

    public final boolean m() {
        return P0.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new c(this));
    }

    public final boolean n() {
        return this.f1649c.f() && o() && k();
    }

    public final boolean o() {
        return P0.a.e("WindowExtensions#getWindowLayoutComponent is not valid", new d(this));
    }
}
