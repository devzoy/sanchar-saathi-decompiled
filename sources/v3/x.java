package v3;

import A3.b;
import A3.d;
import A3.e;
import A3.f;
import A3.g;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final y f12470a;

    /* renamed from: b  reason: collision with root package name */
    public static final b[] f12471b = new b[0];

    static {
        y yVar = null;
        try {
            yVar = (y) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (yVar == null) {
            yVar = new y();
        }
        f12470a = yVar;
    }

    public static e a(i iVar) {
        return f12470a.a(iVar);
    }

    public static b b(Class cls) {
        return f12470a.b(cls);
    }

    public static d c(Class cls) {
        return f12470a.c(cls, "");
    }

    public static f d(o oVar) {
        return f12470a.d(oVar);
    }

    public static g e(q qVar) {
        return f12470a.e(qVar);
    }

    public static String f(h hVar) {
        return f12470a.f(hVar);
    }

    public static String g(m mVar) {
        return f12470a.g(mVar);
    }
}
