package J;

import android.graphics.Color;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f1589a = new ThreadLocal();

    public static int a(int i4, int i5) {
        return 255 - (((255 - i5) * (255 - i4)) / 255);
    }

    public static int b(int i4, int i5) {
        int alpha = Color.alpha(i5);
        int alpha2 = Color.alpha(i4);
        int a4 = a(alpha2, alpha);
        return Color.argb(a4, c(Color.red(i4), alpha2, Color.red(i5), alpha, a4), c(Color.green(i4), alpha2, Color.green(i5), alpha, a4), c(Color.blue(i4), alpha2, Color.blue(i5), alpha, a4));
    }

    public static int c(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((i4 * 255) * i5) + ((i6 * i7) * (255 - i5))) / (i8 * 255);
    }

    public static int d(int i4, int i5) {
        if (i5 >= 0 && i5 <= 255) {
            return (i4 & 16777215) | (i5 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
