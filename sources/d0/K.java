package D0;

import android.graphics.Matrix;
import android.view.View;

public class K extends J {
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    public void d(View view, int i4, int i5, int i6, int i7) {
        view.setLeftTopRightBottom(i4, i5, i6, i7);
    }

    public void e(View view, float f4) {
        view.setTransitionAlpha(f4);
    }

    public void f(View view, int i4) {
        view.setTransitionVisibility(i4);
    }

    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
