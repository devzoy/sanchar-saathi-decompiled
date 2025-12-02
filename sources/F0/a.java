package F0;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v.C0944a;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final C0944a f1019a;

    /* renamed from: b  reason: collision with root package name */
    public final C0944a f1020b;

    /* renamed from: c  reason: collision with root package name */
    public final C0944a f1021c;

    public a(C0944a aVar, C0944a aVar2, C0944a aVar3) {
        this.f1019a = aVar;
        this.f1020b = aVar2;
        this.f1021c = aVar3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i4) {
        w(i4);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i4) {
        w(i4);
        C(charSequence);
    }

    public abstract void E(int i4);

    public void F(int i4, int i5) {
        w(i5);
        E(i4);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i4) {
        w(i4);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i4) {
        w(i4);
        I(str);
    }

    public void K(c cVar, a aVar) {
        try {
            e(cVar.getClass()).invoke((Object) null, new Object[]{cVar, aVar});
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        }
    }

    public void L(c cVar) {
        if (cVar == null) {
            I((String) null);
            return;
        }
        N(cVar);
        a b4 = b();
        K(cVar, b4);
        b4.a();
    }

    public void M(c cVar, int i4) {
        w(i4);
        L(cVar);
    }

    public final void N(c cVar) {
        try {
            I(c(cVar.getClass()).getName());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e4);
        }
    }

    public abstract void a();

    public abstract a b();

    public final Class c(Class cls) {
        Class cls2 = (Class) this.f1021c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f1021c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) {
        Method method = (Method) this.f1019a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Class<a> cls = a.class;
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f1019a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method e(Class cls) {
        Method method = (Method) this.f1020b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c4 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c4.getDeclaredMethod("write", new Class[]{cls, a.class});
        this.f1020b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z4, int i4) {
        return !m(i4) ? z4 : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i4) {
        return !m(i4) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i4) {
        return !m(i4) ? charSequence : k();
    }

    public abstract boolean m(int i4);

    public c n(String str, a aVar) {
        try {
            return (c) d(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        }
    }

    public abstract int o();

    public int p(int i4, int i5) {
        return !m(i5) ? i4 : o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i4) {
        return !m(i4) ? parcelable : q();
    }

    public abstract String s();

    public String t(String str, int i4) {
        return !m(i4) ? str : s();
    }

    public c u() {
        String s4 = s();
        if (s4 == null) {
            return null;
        }
        return n(s4, b());
    }

    public c v(c cVar, int i4) {
        return !m(i4) ? cVar : u();
    }

    public abstract void w(int i4);

    public void x(boolean z4, boolean z5) {
    }

    public abstract void y(boolean z4);

    public void z(boolean z4, int i4) {
        w(i4);
        y(z4);
    }
}
