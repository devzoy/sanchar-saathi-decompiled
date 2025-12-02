package O0;

import android.view.DisplayCutout;
import v3.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f2027a = new h();

    public final int a(DisplayCutout displayCutout) {
        l.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int b(DisplayCutout displayCutout) {
        l.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int c(DisplayCutout displayCutout) {
        l.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int d(DisplayCutout displayCutout) {
        l.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
