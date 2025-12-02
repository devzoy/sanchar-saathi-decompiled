package androidx.lifecycle;

import androidx.lifecycle.C0380g;
import androidx.lifecycle.G;
import m0.C0785a;
import v3.l;
import x0.C1000f;

public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    public static final C0785a.b f5337a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final C0785a.b f5338b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final C0785a.b f5339c = new a();

    public static final class a implements C0785a.b {
    }

    public static final class b implements C0785a.b {
    }

    public static final class c implements C0785a.b {
    }

    public static final class d implements G.c {
        public F c(Class cls, C0785a aVar) {
            l.e(cls, "modelClass");
            l.e(aVar, "extras");
            return new C();
        }
    }

    public static final void a(C1000f fVar) {
        l.e(fVar, "<this>");
        C0380g.b b4 = fVar.b().b();
        if (b4 != C0380g.b.INITIALIZED && b4 != C0380g.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (fVar.l().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            B b5 = new B(fVar.l(), (I) fVar);
            fVar.l().h("androidx.lifecycle.internal.SavedStateHandlesProvider", b5);
            fVar.b().a(new z(b5));
        }
    }

    public static final C b(I i4) {
        l.e(i4, "<this>");
        return (C) new G(i4, (G.c) new d()).c("androidx.lifecycle.internal.SavedStateHandlesVM", C.class);
    }
}
