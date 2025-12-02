package D0;

import android.view.View;

public abstract class C extends L {

    /* renamed from: c  reason: collision with root package name */
    public static boolean f566c = true;

    public void a(View view) {
    }

    public float b(View view) {
        if (f566c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f566c = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }

    public void e(View view, float f4) {
        if (f566c) {
            try {
                view.setTransitionAlpha(f4);
                return;
            } catch (NoSuchMethodError unused) {
                f566c = false;
            }
        }
        view.setAlpha(f4);
    }
}
