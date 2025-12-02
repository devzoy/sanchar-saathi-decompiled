package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;

public class l extends BaseAdapter {

    /* renamed from: g  reason: collision with root package name */
    public static final int f7950g = r.i().getMaximum(4);

    /* renamed from: c  reason: collision with root package name */
    public final k f7951c;

    /* renamed from: d  reason: collision with root package name */
    public Collection f7952d;

    /* renamed from: e  reason: collision with root package name */
    public c f7953e;

    /* renamed from: f  reason: collision with root package name */
    public final a f7954f;

    public l(k kVar, d dVar, a aVar) {
        this.f7951c = kVar;
        this.f7954f = aVar;
        this.f7952d = dVar.f();
    }

    public int a(int i4) {
        return b() + (i4 - 1);
    }

    public int b() {
        return this.f7951c.o();
    }

    /* renamed from: c */
    public Long getItem(int i4) {
        if (i4 < this.f7951c.o() || i4 > g()) {
            return null;
        }
        return Long.valueOf(this.f7951c.p(h(i4)));
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = V1.g.f3094l
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0075
            com.google.android.material.datepicker.k r8 = r5.f7951c
            int r2 = r8.f7947i
            if (r7 < r2) goto L_0x002d
            goto L_0x0075
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.k r8 = r5.f7951c
            long r7 = r8.p(r7)
            com.google.android.material.datepicker.k r3 = r5.f7951c
            int r3 = r3.f7945g
            com.google.android.material.datepicker.k r4 = com.google.android.material.datepicker.k.n()
            int r4 = r4.f7945g
            if (r3 != r4) goto L_0x0067
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r7)
            r0.setContentDescription(r7)
            goto L_0x006e
        L_0x0067:
            java.lang.String r7 = com.google.android.material.datepicker.e.d(r7)
            r0.setContentDescription(r7)
        L_0x006e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x007d
        L_0x0075:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x007d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0084
            return r0
        L_0x0084:
            long r6 = r6.longValue()
            r5.i(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.l.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public final void e(Context context) {
        if (this.f7953e == null) {
            this.f7953e = new c(context);
        }
    }

    public final boolean f(long j4) {
        throw null;
    }

    public int g() {
        return (this.f7951c.o() + this.f7951c.f7947i) - 1;
    }

    public int getCount() {
        return this.f7951c.f7947i + b();
    }

    public long getItemId(int i4) {
        return (long) (i4 / this.f7951c.f7946h);
    }

    public int h(int i4) {
        return (i4 - this.f7951c.o()) + 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public final void i(TextView textView, long j4) {
        b bVar;
        if (textView != null) {
            if (this.f7954f.g().b(j4)) {
                textView.setEnabled(true);
                bVar = f(j4) ? this.f7953e.f7873b : r.g().getTimeInMillis() == j4 ? this.f7953e.f7874c : this.f7953e.f7872a;
            } else {
                textView.setEnabled(false);
                bVar = this.f7953e.f7878g;
            }
            bVar.b(textView);
        }
    }

    public final void j(MaterialCalendarGridView materialCalendarGridView, long j4) {
        if (k.m(j4).equals(this.f7951c)) {
            i((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f7951c.q(j4)) - materialCalendarGridView.getFirstVisiblePosition()), j4);
        }
    }

    public void k(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f7952d) {
            j(materialCalendarGridView, longValue.longValue());
        }
    }

    public boolean l(int i4) {
        return i4 >= b() && i4 <= g();
    }
}
