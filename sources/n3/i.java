package n3;

import java.lang.reflect.Method;
import v3.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f11271a = new i();

    /* renamed from: b  reason: collision with root package name */
    public static final a f11272b = new a((Method) null, (Method) null, (Method) null);

    /* renamed from: c  reason: collision with root package name */
    public static a f11273c;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Method f11274a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f11275b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f11276c;

        public a(Method method, Method method2, Method method3) {
            this.f11274a = method;
            this.f11275b = method2;
            this.f11276c = method3;
        }
    }

    public final a a(C0807a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", (Class[]) null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class[]) null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class[]) null));
            f11273c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f11272b;
            f11273c = aVar3;
            return aVar3;
        }
    }

    public final String b(C0807a aVar) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        l.e(aVar, "continuation");
        a aVar2 = f11273c;
        if (aVar2 == null) {
            aVar2 = a(aVar);
        }
        if (aVar2 == f11272b || (method = aVar2.f11274a) == null || (invoke = method.invoke(aVar.getClass(), (Object[]) null)) == null || (method2 = aVar2.f11275b) == null || (invoke2 = method2.invoke(invoke, (Object[]) null)) == null) {
            return null;
        }
        Method method3 = aVar2.f11276c;
        Object invoke3 = method3 != null ? method3.invoke(invoke2, (Object[]) null) : null;
        if (invoke3 instanceof String) {
            return (String) invoke3;
        }
        return null;
    }
}
