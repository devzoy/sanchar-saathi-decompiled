package J;

import I.a;
import I.b;
import P.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import v.e;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final h f1595a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f1596b = new e(16);

    public static class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        public b.C0023b f1597a;

        public a(b.C0023b bVar) {
            this.f1597a = bVar;
        }

        public void a(int i4) {
            b.C0023b bVar = this.f1597a;
            if (bVar != null) {
                bVar.f(i4);
            }
        }

        public void b(Typeface typeface) {
            b.C0023b bVar = this.f1597a;
            if (bVar != null) {
                bVar.g(typeface);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1595a = new g();
        } else {
            f1595a = new f();
        }
    }

    public static Typeface a(Context context, Typeface typeface, int i4) {
        if (context != null) {
            return Typeface.create(typeface, i4);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4) {
        return f1595a.b(context, cancellationSignal, bVarArr, i4);
    }

    public static Typeface c(Context context, a.b bVar, Resources resources, int i4, String str, int i5, int i6, b.C0023b bVar2, Handler handler, boolean z4) {
        Typeface typeface;
        a.b bVar3 = bVar;
        b.C0023b bVar4 = bVar2;
        Handler handler2 = handler;
        if (bVar3 instanceof a.e) {
            a.e eVar = (a.e) bVar3;
            Typeface g4 = g(eVar.c());
            if (g4 != null) {
                if (bVar4 != null) {
                    bVar4.d(g4, handler2);
                }
                return g4;
            }
            typeface = g.a(context, eVar.b(), i6, !z4 ? bVar4 == null : eVar.a() == 0, z4 ? eVar.d() : -1, b.C0023b.e(handler), new a(bVar4));
            Resources resources2 = resources;
            int i7 = i6;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f1595a.a(context, (a.c) bVar3, resources, i6);
            if (bVar4 != null) {
                if (typeface != null) {
                    bVar4.d(typeface, handler2);
                } else {
                    bVar4.c(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f1596b.d(e(resources, i4, str, i5, i6), typeface);
        }
        return typeface;
    }

    public static Typeface d(Context context, Resources resources, int i4, String str, int i5, int i6) {
        Typeface c4 = f1595a.c(context, resources, i4, str, i6);
        if (c4 != null) {
            f1596b.d(e(resources, i4, str, i5, i6), c4);
        }
        return c4;
    }

    public static String e(Resources resources, int i4, String str, int i5, int i6) {
        return resources.getResourcePackageName(i4) + '-' + str + '-' + i5 + '-' + i4 + '-' + i6;
    }

    public static Typeface f(Resources resources, int i4, String str, int i5, int i6) {
        return (Typeface) f1596b.c(e(resources, i4, str, i5, i6));
    }

    public static Typeface g(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
