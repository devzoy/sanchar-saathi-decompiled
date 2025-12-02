package m0;

import A3.b;
import androidx.lifecycle.F;
import androidx.lifecycle.G;
import androidx.lifecycle.H;
import n0.C0799c;
import v3.l;

/* renamed from: m0.d  reason: case insensitive filesystem */
public final class C0788d {

    /* renamed from: a  reason: collision with root package name */
    public final H f11136a;

    /* renamed from: b  reason: collision with root package name */
    public final G.c f11137b;

    /* renamed from: c  reason: collision with root package name */
    public final C0785a f11138c;

    public C0788d(H h4, G.c cVar, C0785a aVar) {
        l.e(h4, "store");
        l.e(cVar, "factory");
        l.e(aVar, "extras");
        this.f11136a = h4;
        this.f11137b = cVar;
        this.f11138c = aVar;
    }

    public static /* synthetic */ F b(C0788d dVar, b bVar, String str, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str = C0799c.f11229a.b(bVar);
        }
        return dVar.a(bVar, str);
    }

    public final F a(b bVar, String str) {
        l.e(bVar, "modelClass");
        l.e(str, "key");
        F b4 = this.f11136a.b(str);
        if (bVar.b(b4)) {
            l.c(b4, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return b4;
        }
        C0786b bVar2 = new C0786b(this.f11138c);
        bVar2.b(C0799c.a.f11230a, str);
        F a4 = C0789e.a(this.f11137b, bVar, bVar2);
        this.f11136a.c(str, a4);
        return a4;
    }
}
