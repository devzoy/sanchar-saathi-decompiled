package p;

import J.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import h.j;

public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f11504a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f11505b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f11506c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f11507d = {16843518};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f11508e = {16842919};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f11509f = {16842912};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f11510g = {16842913};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f11511h = {-16842919, -16842908};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f11512i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f11513j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(j.f9576z0);
        try {
            if (!obtainStyledAttributes.hasValue(j.f9350E0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i4) {
        ColorStateList e4 = e(context, i4);
        if (e4 != null && e4.isStateful()) {
            return e4.getColorForState(f11505b, e4.getDefaultColor());
        }
        TypedValue f4 = f();
        context.getTheme().resolveAttribute(16842803, f4, true);
        return d(context, i4, f4.getFloat());
    }

    public static int c(Context context, int i4) {
        int[] iArr = f11513j;
        iArr[0] = i4;
        f0 u4 = f0.u(context, (AttributeSet) null, iArr);
        try {
            return u4.b(0, 0);
        } finally {
            u4.w();
        }
    }

    public static int d(Context context, int i4, float f4) {
        int c4 = c(context, i4);
        return a.d(c4, Math.round(((float) Color.alpha(c4)) * f4));
    }

    public static ColorStateList e(Context context, int i4) {
        int[] iArr = f11513j;
        iArr[0] = i4;
        f0 u4 = f0.u(context, (AttributeSet) null, iArr);
        try {
            return u4.c(0);
        } finally {
            u4.w();
        }
    }

    public static TypedValue f() {
        ThreadLocal threadLocal = f11504a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
