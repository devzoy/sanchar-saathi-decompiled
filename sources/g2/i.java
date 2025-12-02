package g2;

import V1.a;
import V1.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import p.f0;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f9147a = {a.f2974i};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f9148b = {a.f2975j};

    public static void a(Context context) {
        e(context, f9147a, "Theme.AppCompat");
    }

    public static void b(Context context, AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.B5, i4, i5);
        boolean z4 = obtainStyledAttributes.getBoolean(j.D5, false);
        obtainStyledAttributes.recycle();
        if (z4) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(a.f2980o, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f9148b, "Theme.MaterialComponents");
    }

    public static void d(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        boolean z4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.B5, i4, i5);
        boolean z5 = false;
        if (!obtainStyledAttributes.getBoolean(j.E5, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(j.C5, -1) != -1) {
                z5 = true;
            }
            z4 = z5;
        } else {
            z4 = f(context, attributeSet, iArr, i4, i5, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z4) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void e(Context context, int[] iArr, String str) {
        if (!g(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    public static boolean f(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (!obtainStyledAttributes.hasValue(i4)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray h(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        b(context, attributeSet, i4, i5);
        d(context, attributeSet, iArr, i4, i5, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
    }

    public static f0 i(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        b(context, attributeSet, i4, i5);
        d(context, attributeSet, iArr, i4, i5, iArr2);
        return f0.v(context, attributeSet, iArr, i4, i5);
    }
}
