package D0;

import android.os.Build;
import android.view.View;

public class J extends H {

    /* renamed from: g  reason: collision with root package name */
    public static boolean f570g = true;

    public void f(View view, int i4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i4);
        } else if (f570g) {
            try {
                view.setTransitionVisibility(i4);
            } catch (NoSuchMethodError unused) {
                f570g = false;
            }
        }
    }
}
