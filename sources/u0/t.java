package u0;

import C3.o;
import C3.p;
import android.content.Context;
import u0.u;
import v3.l;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final t f12228a = new t();

    public static final u.a a(Context context, Class cls, String str) {
        l.e(context, "context");
        l.e(cls, "klass");
        if (!(str == null || p.I(str))) {
            return new u.a(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    public static final Object b(Class cls, String str) {
        String str2;
        l.e(cls, "klass");
        l.e(str, "suffix");
        Package packageR = cls.getPackage();
        l.b(packageR);
        String name = packageR.getName();
        String canonicalName = cls.getCanonicalName();
        l.b(canonicalName);
        l.d(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            l.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String str3 = canonicalName;
        String str4 = o.s(str3, '.', '_', false, 4, (Object) null) + str;
        try {
            if (name.length() == 0) {
                str2 = str4;
            } else {
                str2 = name + '.' + str4;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            l.c(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            return cls2.newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }

    public static final u.a c(Context context, Class cls) {
        l.e(context, "context");
        l.e(cls, "klass");
        return new u.a(context, cls, (String) null);
    }
}
