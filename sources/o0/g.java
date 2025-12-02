package O0;

import K0.k;
import S.O;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import v3.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f2026a = new g();

    public final Rect a(Context context) {
        l.e(context, "context");
        Rect a4 = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        l.d(a4, "wm.currentWindowMetrics.bounds");
        return a4;
    }

    public final O b(Context context) {
        l.e(context, "context");
        WindowInsets a4 = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        l.d(a4, "context.getSystemService…indowMetrics.windowInsets");
        O v4 = O.v(a4);
        l.d(v4, "toWindowInsetsCompat(platformInsets)");
        return v4;
    }

    public final k c(Context context) {
        l.e(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        O v4 = O.v(windowManager.getCurrentWindowMetrics().getWindowInsets());
        l.d(v4, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        Rect a4 = windowManager.getCurrentWindowMetrics().getBounds();
        l.d(a4, "wm.currentWindowMetrics.bounds");
        return new k(a4, v4);
    }

    public final Rect d(Context context) {
        l.e(context, "context");
        Rect a4 = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
        l.d(a4, "wm.maximumWindowMetrics.bounds");
        return a4;
    }
}
