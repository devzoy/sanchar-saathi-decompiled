package D0;

import android.os.Build;
import android.view.ViewGroup;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f722a = true;

    public static u a(ViewGroup viewGroup) {
        return new t(viewGroup);
    }

    public static void b(ViewGroup viewGroup, boolean z4) {
        if (f722a) {
            try {
                viewGroup.suppressLayout(z4);
            } catch (NoSuchMethodError unused) {
                f722a = false;
            }
        }
    }

    public static void c(ViewGroup viewGroup, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z4);
        } else {
            b(viewGroup, z4);
        }
    }
}
