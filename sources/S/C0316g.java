package S;

import R.c;
import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* renamed from: S.g  reason: case insensitive filesystem */
public final class C0316g {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayCutout f2692a;

    /* renamed from: S.g$a */
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C0316g(DisplayCutout displayCutout) {
        this.f2692a = displayCutout;
    }

    public static C0316g e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C0316g(displayCutout);
    }

    public int a() {
        return a.c(this.f2692a);
    }

    public int b() {
        return a.d(this.f2692a);
    }

    public int c() {
        return a.e(this.f2692a);
    }

    public int d() {
        return a.f(this.f2692a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0316g.class != obj.getClass()) {
            return false;
        }
        return c.a(this.f2692a, ((C0316g) obj).f2692a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f2692a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f2692a + "}";
    }
}
