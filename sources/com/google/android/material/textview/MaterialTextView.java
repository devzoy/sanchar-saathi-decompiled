package com.google.android.material.textview;

import V1.a;
import V1.j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i2.b;
import i2.c;
import o2.C0822a;
import p.C0857y;

public class MaterialTextView extends C0857y {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public static boolean g(Context context) {
        return b.b(context, a.f2991z, true);
    }

    public static int h(Resources.Theme theme, AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.f3218Q2, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(j.f3223R2, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int i(Context context, TypedArray typedArray, int... iArr) {
        int i4 = -1;
        for (int i5 = 0; i5 < iArr.length && i4 < 0; i5++) {
            i4 = c.c(context, typedArray, iArr[i5], -1);
        }
        return i4;
    }

    public static boolean j(Context context, Resources.Theme theme, AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, j.f3218Q2, i4, i5);
        int i6 = i(context, obtainStyledAttributes, j.f3227S2, j.f3231T2);
        obtainStyledAttributes.recycle();
        return i6 != -1;
    }

    public final void f(Resources.Theme theme, int i4) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i4, j.f3198M2);
        int i5 = i(getContext(), obtainStyledAttributes, j.f3208O2, j.f3213P2);
        obtainStyledAttributes.recycle();
        if (i5 >= 0) {
            setLineHeight(i5);
        }
    }

    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        if (g(context)) {
            f(context.getTheme(), i4);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(C0822a.c(context, attributeSet, i4, i5), attributeSet, i4);
        int h4;
        Context context2 = getContext();
        if (g(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!j(context2, theme, attributeSet, i4, i5) && (h4 = h(theme, attributeSet, i4, i5)) != -1) {
                f(theme, h4);
            }
        }
    }
}
