package H0;

import android.app.Activity;
import h3.C0673n;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import u3.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final ClassLoader f1365a;

    public static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final A3.b f1366a;

        /* renamed from: b  reason: collision with root package name */
        public final l f1367b;

        public a(A3.b bVar, l lVar) {
            v3.l.e(bVar, "clazz");
            v3.l.e(lVar, "consumer");
            this.f1366a = bVar;
            this.f1367b = lVar;
        }

        public final void a(Object obj) {
            v3.l.e(obj, "parameter");
            this.f1367b.i(obj);
        }

        public final boolean b(Method method, Object[] objArr) {
            return v3.l.a(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        public final boolean c(Method method, Object[] objArr) {
            return v3.l.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        public final boolean d(Method method, Object[] objArr) {
            return v3.l.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        public final boolean e(Method method, Object[] objArr) {
            return v3.l.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            v3.l.e(obj, "obj");
            v3.l.e(method, "method");
            Object obj2 = null;
            boolean z4 = false;
            if (b(method, objArr)) {
                A3.b bVar = this.f1366a;
                if (objArr != null) {
                    obj2 = objArr[0];
                }
                a(A3.c.a(bVar, obj2));
                return C0673n.f9639a;
            } else if (c(method, objArr)) {
                if (objArr != null) {
                    obj2 = objArr[0];
                }
                if (obj == obj2) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            } else if (d(method, objArr)) {
                return Integer.valueOf(this.f1367b.hashCode());
            } else {
                if (e(method, objArr)) {
                    return this.f1367b.toString();
                }
                throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
            }
        }
    }

    public interface b {
        void a();
    }

    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f1368a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f1369b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f1370c;

        public c(Method method, Object obj, Object obj2) {
            this.f1368a = method;
            this.f1369b = obj;
            this.f1370c = obj2;
        }

        public void a() {
            this.f1368a.invoke(this.f1369b, new Object[]{this.f1370c});
        }
    }

    public d(ClassLoader classLoader) {
        v3.l.e(classLoader, "loader");
        this.f1365a = classLoader;
    }

    public final Object a(A3.b bVar, l lVar) {
        Object newProxyInstance = Proxy.newProxyInstance(this.f1365a, new Class[]{d()}, new a(bVar, lVar));
        v3.l.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return newProxyInstance;
    }

    public final Class b() {
        try {
            return d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final b c(Object obj, A3.b bVar, String str, String str2, Activity activity, l lVar) {
        v3.l.e(obj, "obj");
        v3.l.e(bVar, "clazz");
        v3.l.e(str, "addMethodName");
        v3.l.e(str2, "removeMethodName");
        v3.l.e(activity, "activity");
        v3.l.e(lVar, "consumer");
        Object a4 = a(bVar, lVar);
        obj.getClass().getMethod(str, new Class[]{Activity.class, d()}).invoke(obj, new Object[]{activity, a4});
        return new c(obj.getClass().getMethod(str2, new Class[]{d()}), obj, a4);
    }

    public final Class d() {
        Class<?> loadClass = this.f1365a.loadClass("java.util.function.Consumer");
        v3.l.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
