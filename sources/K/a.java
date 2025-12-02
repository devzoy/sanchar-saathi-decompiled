package K;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public abstract class a {

    /* renamed from: K.a$a  reason: collision with other inner class name */
    public static class C0027a {
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static void e(Drawable drawable, float f4, float f5) {
            drawable.setHotspot(f4, f5);
        }

        public static void f(Drawable drawable, int i4, int i5, int i6, int i7) {
            drawable.setHotspotBounds(i4, i5, i6, i7);
        }

        public static void g(Drawable drawable, int i4) {
            drawable.setTint(i4);
        }

        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    public static class b {
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        public static boolean b(Drawable drawable, int i4) {
            return drawable.setLayoutDirection(i4);
        }
    }

    public static void a(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int b(Drawable drawable) {
        return b.a(drawable);
    }

    public static boolean c(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void d(Drawable drawable, boolean z4) {
        drawable.setAutoMirrored(z4);
    }

    public static void e(Drawable drawable, float f4, float f5) {
        C0027a.e(drawable, f4, f5);
    }

    public static void f(Drawable drawable, int i4, int i5, int i6, int i7) {
        C0027a.f(drawable, i4, i5, i6, i7);
    }

    public static boolean g(Drawable drawable, int i4) {
        return b.b(drawable, i4);
    }

    public static void h(Drawable drawable, int i4) {
        C0027a.g(drawable, i4);
    }

    public static void i(Drawable drawable, ColorStateList colorStateList) {
        C0027a.h(drawable, colorStateList);
    }

    public static void j(Drawable drawable, PorterDuff.Mode mode) {
        C0027a.i(drawable, mode);
    }

    public static Drawable k(Drawable drawable) {
        return drawable instanceof b ? ((b) drawable).b() : drawable;
    }

    public static Drawable l(Drawable drawable) {
        return drawable;
    }
}
