package com.google.android.material.datepicker;

import V1.a;
import V1.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import i2.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f7872a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7873b;

    /* renamed from: c  reason: collision with root package name */
    public final b f7874c;

    /* renamed from: d  reason: collision with root package name */
    public final b f7875d;

    /* renamed from: e  reason: collision with root package name */
    public final b f7876e;

    /* renamed from: f  reason: collision with root package name */
    public final b f7877f;

    /* renamed from: g  reason: collision with root package name */
    public final b f7878g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f7879h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.c(context, a.f2983r, h.class.getCanonicalName()), j.f3299i2);
        this.f7872a = b.a(context, obtainStyledAttributes.getResourceId(j.f3314l2, 0));
        this.f7878g = b.a(context, obtainStyledAttributes.getResourceId(j.f3304j2, 0));
        this.f7873b = b.a(context, obtainStyledAttributes.getResourceId(j.f3309k2, 0));
        this.f7874c = b.a(context, obtainStyledAttributes.getResourceId(j.f3319m2, 0));
        ColorStateList a4 = i2.c.a(context, obtainStyledAttributes, j.f3324n2);
        this.f7875d = b.a(context, obtainStyledAttributes.getResourceId(j.f3334p2, 0));
        this.f7876e = b.a(context, obtainStyledAttributes.getResourceId(j.f3329o2, 0));
        this.f7877f = b.a(context, obtainStyledAttributes.getResourceId(j.f3339q2, 0));
        Paint paint = new Paint();
        this.f7879h = paint;
        paint.setColor(a4.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
