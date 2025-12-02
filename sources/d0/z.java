package D0;

import S.C;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public static final L f724a;

    /* renamed from: b  reason: collision with root package name */
    public static final Property f725b = new a(Float.class, "translationAlpha");

    /* renamed from: c  reason: collision with root package name */
    public static final Property f726c = new b(Rect.class, "clipBounds");

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(z.c(view));
        }

        /* renamed from: b */
        public void set(View view, Float f4) {
            z.g(view, f4.floatValue());
        }
    }

    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Rect get(View view) {
            return C.r(view);
        }

        /* renamed from: b */
        public void set(View view, Rect rect) {
            C.m0(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f724a = new K();
        } else {
            f724a = new J();
        }
    }

    public static void a(View view) {
        f724a.a(view);
    }

    public static y b(View view) {
        return new x(view);
    }

    public static float c(View view) {
        return f724a.b(view);
    }

    public static O d(View view) {
        return new N(view);
    }

    public static void e(View view) {
        f724a.c(view);
    }

    public static void f(View view, int i4, int i5, int i6, int i7) {
        f724a.d(view, i4, i5, i6, i7);
    }

    public static void g(View view, float f4) {
        f724a.e(view, f4);
    }

    public static void h(View view, int i4) {
        f724a.f(view, i4);
    }

    public static void i(View view, Matrix matrix) {
        f724a.g(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        f724a.h(view, matrix);
    }
}
