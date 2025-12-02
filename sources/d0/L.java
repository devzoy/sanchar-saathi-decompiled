package D0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

public abstract class L {

    /* renamed from: a  reason: collision with root package name */
    public static Field f571a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f572b;

    public abstract void a(View view);

    public abstract float b(View view);

    public abstract void c(View view);

    public abstract void d(View view, int i4, int i5, int i6, int i7);

    public abstract void e(View view, float f4);

    public void f(View view, int i4) {
        if (!f572b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f571a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f572b = true;
        }
        Field field = f571a;
        if (field != null) {
            try {
                f571a.setInt(view, i4 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}
