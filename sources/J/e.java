package J;

import I.a;
import P.g;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

public abstract class e extends d {

    /* renamed from: g  reason: collision with root package name */
    public final Class f1603g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor f1604h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f1605i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f1606j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f1607k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f1608l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f1609m;

    public e() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Constructor constructor;
        Class cls;
        try {
            cls = t();
            constructor = u(cls);
            method5 = q(cls);
            method4 = r(cls);
            method3 = v(cls);
            method2 = p(cls);
            method = s(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e4) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e4.getClass().getName(), e4);
            cls = null;
            constructor = null;
            method5 = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f1603g = cls;
        this.f1604h = constructor;
        this.f1605i = method5;
        this.f1606j = method4;
        this.f1607k = method3;
        this.f1608l = method2;
        this.f1609m = method;
    }

    public Typeface a(Context context, a.c cVar, Resources resources, int i4) {
        if (!o()) {
            return super.a(context, cVar, resources, i4);
        }
        Object j4 = j();
        if (j4 == null) {
            return null;
        }
        for (a.d dVar : cVar.a()) {
            if (!l(context, j4, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                k(j4);
                return null;
            }
        }
        if (!n(j4)) {
            return null;
        }
        return h(j4);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        Typeface h4;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!o()) {
            g.b f4 = f(bVarArr, i4);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(f4.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(f4.e()).setItalic(f4.f()).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map f5 = i.f(context, bVarArr, cancellationSignal);
            Object j4 = j();
            if (j4 == null) {
                return null;
            }
            boolean z4 = false;
            for (g.b bVar : bVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) f5.get(bVar.d());
                if (byteBuffer != null) {
                    if (!m(j4, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                        k(j4);
                        return null;
                    }
                    z4 = true;
                }
            }
            if (!z4) {
                k(j4);
                return null;
            } else if (n(j4) && (h4 = h(j4)) != null) {
                return Typeface.create(h4, i4);
            } else {
                return null;
            }
        }
        throw th;
    }

    public Typeface c(Context context, Resources resources, int i4, String str, int i5) {
        if (!o()) {
            return super.c(context, resources, i4, str, i5);
        }
        Object j4 = j();
        if (j4 == null) {
            return null;
        }
        if (!l(context, j4, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            k(j4);
            return null;
        } else if (!n(j4)) {
            return null;
        } else {
            return h(j4);
        }
    }

    public abstract Typeface h(Object obj);

    public final Object j() {
        try {
            return this.f1604h.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void k(Object obj) {
        try {
            this.f1608l.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean l(Context context, Object obj, String str, int i4, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            Object obj2 = obj;
            return ((Boolean) this.f1605i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m(Object obj, ByteBuffer byteBuffer, int i4, int i5, int i6) {
        try {
            return ((Boolean) this.f1606j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i4), null, Integer.valueOf(i5), Integer.valueOf(i6)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean n(Object obj) {
        try {
            return ((Boolean) this.f1607k.invoke(obj, (Object[]) null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o() {
        if (this.f1605i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f1605i != null;
    }

    public Method p(Class cls) {
        return cls.getMethod("abortCreation", (Class[]) null);
    }

    public Method q(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public Method r(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public abstract Method s(Class cls);

    public Class t() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor u(Class cls) {
        return cls.getConstructor((Class[]) null);
    }

    public Method v(Class cls) {
        return cls.getMethod("freeze", (Class[]) null);
    }
}
