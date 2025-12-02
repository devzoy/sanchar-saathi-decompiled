package n0;

import A3.b;
import androidx.lifecycle.C0379f;
import androidx.lifecycle.F;
import androidx.lifecycle.I;
import m0.C0785a;
import v3.l;

/* renamed from: n0.c  reason: case insensitive filesystem */
public final class C0799c {

    /* renamed from: a  reason: collision with root package name */
    public static final C0799c f11229a = new C0799c();

    /* renamed from: n0.c$a */
    public static final class a implements C0785a.b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f11230a = new a();
    }

    public final C0785a a(I i4) {
        l.e(i4, "owner");
        return i4 instanceof C0379f ? ((C0379f) i4).o() : C0785a.C0184a.f11134b;
    }

    public final String b(b bVar) {
        l.e(bVar, "modelClass");
        String a4 = d.a(bVar);
        if (a4 != null) {
            return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + a4;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final F c() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
