package com.google.android.material.appbar;

import S.C;
import V1.a;
import V1.i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import l2.g;
import l2.h;

public class MaterialToolbar extends Toolbar {

    /* renamed from: R  reason: collision with root package name */
    public static final int f7623R = i.f3134o;

    /* renamed from: Q  reason: collision with root package name */
    public Integer f7624Q;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f2965C);
    }

    public final void O(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.U(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.K(context);
            gVar.T(C.t(this));
            C.j0(this, gVar);
        }
    }

    public final Drawable P(Drawable drawable) {
        if (drawable == null || this.f7624Q == null) {
            return drawable;
        }
        Drawable l4 = K.a.l(drawable);
        K.a.h(l4, this.f7624Q.intValue());
        return l4;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    public void setElevation(float f4) {
        super.setElevation(f4);
        h.d(this, f4);
    }

    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(P(drawable));
    }

    public void setNavigationIconTint(int i4) {
        this.f7624Q = Integer.valueOf(i4);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialToolbar(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f7623R
            android.content.Context r7 = o2.C0822a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r7 = r6.getContext()
            int[] r2 = V1.j.f3239V2
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r7
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = g2.i.h(r0, r1, r2, r3, r4, r5)
            int r9 = V1.j.f3243W2
            boolean r9 = r8.hasValue(r9)
            if (r9 == 0) goto L_0x002b
            int r9 = V1.j.f3243W2
            r0 = -1
            int r9 = r8.getColor(r9, r0)
            r6.setNavigationIconTint(r9)
        L_0x002b:
            r8.recycle()
            r6.O(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
