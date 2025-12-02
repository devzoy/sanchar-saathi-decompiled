package b2;

import J.a;
import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import i2.b;

/* renamed from: b2.a  reason: case insensitive filesystem */
public abstract class C0393a {
    public static int a(Context context, int i4, int i5) {
        TypedValue a4 = b.a(context, i4);
        return a4 != null ? a4.data : i5;
    }

    public static int b(Context context, int i4, String str) {
        return b.c(context, i4, str);
    }

    public static int c(View view, int i4) {
        return b.d(view, i4);
    }

    public static int d(View view, int i4, int i5) {
        return a(view.getContext(), i4, i5);
    }

    public static int e(int i4, int i5) {
        return a.b(i5, i4);
    }

    public static int f(int i4, int i5, float f4) {
        return e(i4, a.d(i5, Math.round(((float) Color.alpha(i5)) * f4)));
    }

    public static int g(View view, int i4, int i5, float f4) {
        return f(c(view, i4), c(view, i5), f4);
    }
}
