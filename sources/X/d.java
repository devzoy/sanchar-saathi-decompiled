package X;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public abstract class d {

    public static class a {
        public static void a(EdgeEffect edgeEffect, float f4, float f5) {
            edgeEffect.onPull(f4, f5);
        }
    }

    public static class b {
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        public static float c(EdgeEffect edgeEffect, float f4, float f5) {
            try {
                return edgeEffect.onPullDistance(f4, f5);
            } catch (Throwable unused) {
                edgeEffect.onPull(f4, f5);
                return 0.0f;
            }
        }
    }

    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? b.a(context, attributeSet) : new EdgeEffect(context);
    }

    public static float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void c(EdgeEffect edgeEffect, float f4, float f5) {
        a.a(edgeEffect, f4, f5);
    }

    public static float d(EdgeEffect edgeEffect, float f4, float f5) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f4, f5);
        }
        c(edgeEffect, f4, f5);
        return f4;
    }
}
