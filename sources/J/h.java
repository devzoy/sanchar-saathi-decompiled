package J;

import I.a;
import P.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap f1610a = new ConcurrentHashMap();

    public class a implements b {
        public a() {
        }

        /* renamed from: c */
        public int a(g.b bVar) {
            return bVar.e();
        }

        /* renamed from: d */
        public boolean b(g.b bVar) {
            return bVar.f();
        }
    }

    public interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    public static Object d(Object[] objArr, int i4, b bVar) {
        return e(objArr, (i4 & 1) == 0 ? 400 : 700, (i4 & 2) != 0, bVar);
    }

    public static Object e(Object[] objArr, int i4, boolean z4, b bVar) {
        Object obj = null;
        int i5 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = (Math.abs(bVar.a(obj2) - i4) * 2) + (bVar.b(obj2) == z4 ? 0 : 1);
            if (obj == null || i5 > abs) {
                obj = obj2;
                i5 = abs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, a.c cVar, Resources resources, int i4);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i4);

    public Typeface c(Context context, Resources resources, int i4, String str, int i5) {
        File d4 = i.d(context);
        if (d4 == null) {
            return null;
        }
        try {
            if (!i.b(d4, resources, i4)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(d4.getPath());
            d4.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d4.delete();
        }
    }

    public g.b f(g.b[] bVarArr, int i4) {
        return (g.b) d(bVarArr, i4, new a());
    }
}
