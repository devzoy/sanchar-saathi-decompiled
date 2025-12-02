package K0;

import H0.d;
import M0.a;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.sidecar.b;
import h3.C0663d;
import h3.C0664e;
import v3.l;
import v3.m;
import v3.x;

public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f1654a = a.f1655a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f1655a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final boolean f1656b = false;

        /* renamed from: c  reason: collision with root package name */
        public static final String f1657c = x.b(f.class).c();

        /* renamed from: d  reason: collision with root package name */
        public static final C0663d f1658d = C0664e.a(C0029a.f1660f);

        /* renamed from: e  reason: collision with root package name */
        public static g f1659e = b.f1630a;

        /* renamed from: K0.f$a$a  reason: collision with other inner class name */
        public static final class C0029a extends m implements u3.a {

            /* renamed from: f  reason: collision with root package name */
            public static final C0029a f1660f = new C0029a();

            public C0029a() {
                super(0);
            }

            /* renamed from: a */
            public final L0.a c() {
                WindowLayoutComponent g4;
                try {
                    ClassLoader classLoader = f.class.getClassLoader();
                    e eVar = classLoader != null ? new e(classLoader, new d(classLoader)) : null;
                    if (eVar == null || (g4 = eVar.g()) == null) {
                        return null;
                    }
                    a.C0033a aVar = M0.a.f1783a;
                    l.d(classLoader, "loader");
                    return aVar.a(g4, new d(classLoader));
                } catch (Throwable unused) {
                    if (!a.f1656b) {
                        return null;
                    }
                    Log.d(a.f1657c, "Failed to load WindowExtensions");
                    return null;
                }
            }
        }

        public final L0.a c() {
            return (L0.a) f1658d.getValue();
        }

        public final f d(Context context) {
            l.e(context, "context");
            L0.a c4 = c();
            if (c4 == null) {
                c4 = b.f6069c.a(context);
            }
            return f1659e.a(new i(m.f1677b, c4));
        }
    }

    G3.d a(Activity activity);
}
