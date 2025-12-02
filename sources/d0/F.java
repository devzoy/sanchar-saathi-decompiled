package D0;

import android.graphics.Matrix;
import android.view.View;

public abstract class F extends C {

    /* renamed from: d  reason: collision with root package name */
    public static boolean f567d = true;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f568e = true;

    public void g(View view, Matrix matrix) {
        if (f567d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f567d = false;
            }
        }
    }

    public void h(View view, Matrix matrix) {
        if (f568e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f568e = false;
            }
        }
    }
}
