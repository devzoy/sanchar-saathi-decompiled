package D0;

import android.view.View;

public abstract class H extends F {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f569f = true;

    public void d(View view, int i4, int i5, int i6, int i7) {
        if (f569f) {
            try {
                view.setLeftTopRightBottom(i4, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f569f = false;
            }
        }
    }
}
