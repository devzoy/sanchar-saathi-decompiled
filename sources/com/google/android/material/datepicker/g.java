package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

public class g extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static final int f7881f = 4;

    /* renamed from: c  reason: collision with root package name */
    public final Calendar f7882c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7883d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7884e;

    public g() {
        Calendar i4 = r.i();
        this.f7882c = i4;
        this.f7883d = i4.getMaximum(7);
        this.f7884e = i4.getFirstDayOfWeek();
    }

    /* renamed from: a */
    public Integer getItem(int i4) {
        if (i4 >= this.f7883d) {
            return null;
        }
        return Integer.valueOf(b(i4));
    }

    public final int b(int i4) {
        int i5 = i4 + this.f7884e;
        int i6 = this.f7883d;
        return i5 > i6 ? i5 - i6 : i5;
    }

    public int getCount() {
        return this.f7883d;
    }

    public long getItemId(int i4) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r5v9, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r5 != 0) goto L_0x0017
            android.content.Context r5 = r6.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r0 = V1.g.f3095m
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r5 = r3.f7882c
            int r4 = r3.b(r4)
            r1 = 7
            r5.set(r1, r4)
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            java.util.Calendar r5 = r3.f7882c
            int r2 = f7881f
            java.lang.String r4 = r5.getDisplayName(r1, r2, r4)
            r0.setText(r4)
            android.content.Context r4 = r6.getContext()
            int r5 = V1.h.f3113j
            java.lang.String r4 = r4.getString(r5)
            java.util.Calendar r5 = r3.f7882c
            r6 = 2
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getDisplayName(r1, r6, r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.setContentDescription(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.g.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
