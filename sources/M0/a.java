package M0;

import H0.d;
import H0.e;
import androidx.window.extensions.layout.WindowLayoutComponent;
import v3.g;
import v3.l;

public abstract class a implements L0.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0033a f1783a = new C0033a((g) null);

    /* renamed from: M0.a$a  reason: collision with other inner class name */
    public static final class C0033a {
        public /* synthetic */ C0033a(g gVar) {
            this();
        }

        public final L0.a a(WindowLayoutComponent windowLayoutComponent, d dVar) {
            l.e(windowLayoutComponent, "component");
            l.e(dVar, "adapter");
            int a4 = e.f1371a.a();
            return a4 >= 2 ? new e(windowLayoutComponent) : a4 == 1 ? new d(windowLayoutComponent, dVar) : new c();
        }

        public C0033a() {
        }
    }
}
