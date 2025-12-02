package S;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.util.Objects;

public abstract class G {

    public static class a {
        public static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    public static class b {
        public static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        public static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    public static class c {
        public static int a(ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i4, i5, i6);
        }

        public static int b(ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i4, i5, i6);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        r1 = r1.getDimensionPixelSize(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.res.Resources r1, int r2, R.h r3, int r4) {
        /*
            r0 = -1
            if (r2 == r0) goto L_0x000e
            if (r2 == 0) goto L_0x000d
            int r1 = r1.getDimensionPixelSize(r2)
            if (r1 >= 0) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r4 = r1
        L_0x000d:
            return r4
        L_0x000e:
            java.lang.Object r1 = r3.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S.G.a(android.content.res.Resources, int, R.h, int):int");
    }

    public static int b(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    public static int c(Resources resources, int i4, int i5) {
        if (i4 == 4194304 && i5 == 26) {
            return b(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static int d(Resources resources, int i4, int i5) {
        if (i4 == 4194304 && i5 == 26) {
            return b(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float e(ViewConfiguration viewConfiguration, Context context) {
        return a.a(viewConfiguration);
    }

    public static int f(Context context, ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i4, i5, i6);
        }
        if (!i(i4, i5, i6)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int c4 = c(resources, i6, i5);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, c4, new E(viewConfiguration), Integer.MIN_VALUE);
    }

    public static int g(Context context, ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i4, i5, i6);
        }
        if (!i(i4, i5, i6)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int d4 = d(resources, i6, i5);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, d4, new F(viewConfiguration), Integer.MAX_VALUE);
    }

    public static float h(ViewConfiguration viewConfiguration, Context context) {
        return a.b(viewConfiguration);
    }

    public static boolean i(int i4, int i5, int i6) {
        InputDevice device = InputDevice.getDevice(i4);
        return (device == null || device.getMotionRange(i5, i6) == null) ? false : true;
    }

    public static boolean j(ViewConfiguration viewConfiguration, Context context) {
        return b.b(viewConfiguration);
    }
}
