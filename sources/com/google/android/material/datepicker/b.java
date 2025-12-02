package com.google.android.material.datepicker;

import R.g;
import S.C;
import V1.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import i2.c;
import l2.k;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f7866a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f7867b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f7868c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f7869d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7870e;

    /* renamed from: f  reason: collision with root package name */
    public final k f7871f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i4, k kVar, Rect rect) {
        g.b(rect.left);
        g.b(rect.top);
        g.b(rect.right);
        g.b(rect.bottom);
        this.f7866a = rect;
        this.f7867b = colorStateList2;
        this.f7868c = colorStateList;
        this.f7869d = colorStateList3;
        this.f7870e = i4;
        this.f7871f = kVar;
    }

    public static b a(Context context, int i4) {
        g.a(i4 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, j.f3344r2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(j.f3349s2, 0), obtainStyledAttributes.getDimensionPixelOffset(j.f3359u2, 0), obtainStyledAttributes.getDimensionPixelOffset(j.f3354t2, 0), obtainStyledAttributes.getDimensionPixelOffset(j.f3364v2, 0));
        ColorStateList a4 = c.a(context, obtainStyledAttributes, j.f3369w2);
        ColorStateList a5 = c.a(context, obtainStyledAttributes, j.f3143B2);
        ColorStateList a6 = c.a(context, obtainStyledAttributes, j.f3384z2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(j.f3138A2, 0);
        k m4 = k.b(context, obtainStyledAttributes.getResourceId(j.f3374x2, 0), obtainStyledAttributes.getResourceId(j.f3379y2, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a4, a5, a6, dimensionPixelSize, m4, rect);
    }

    public void b(TextView textView) {
        l2.g gVar = new l2.g();
        l2.g gVar2 = new l2.g();
        gVar.setShapeAppearanceModel(this.f7871f);
        gVar2.setShapeAppearanceModel(this.f7871f);
        gVar.U(this.f7868c);
        gVar.Z((float) this.f7870e, this.f7869d);
        textView.setTextColor(this.f7867b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f7867b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f7866a;
        C.j0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
