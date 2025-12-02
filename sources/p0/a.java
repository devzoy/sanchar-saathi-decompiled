package P0;

import A3.b;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import v3.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2204a = new a();

    public static final boolean e(String str, u3.a aVar) {
        l.e(aVar, "block");
        try {
            boolean booleanValue = ((Boolean) aVar.c()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("ClassNotFound: ");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Log.e("ReflectionGuard", sb.toString());
            return false;
        } catch (NoSuchMethodException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NoSuchMethod: ");
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            Log.e("ReflectionGuard", sb2.toString());
            return false;
        }
    }

    public final boolean a(u3.a aVar) {
        l.e(aVar, "classLoader");
        try {
            aVar.c();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean b(Method method, b bVar) {
        l.e(method, "<this>");
        l.e(bVar, "clazz");
        return c(method, t3.a.a(bVar));
    }

    public final boolean c(Method method, Class cls) {
        l.e(method, "<this>");
        l.e(cls, "clazz");
        return method.getReturnType().equals(cls);
    }

    public final boolean d(Method method) {
        l.e(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}
