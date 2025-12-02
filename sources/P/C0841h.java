package p;

import K.a;
import X.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* renamed from: p.h  reason: case insensitive filesystem */
public class C0841h {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f11542a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f11543b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f11544c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11545d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11546e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11547f;

    public C0841h(CompoundButton compoundButton) {
        this.f11542a = compoundButton;
    }

    public void a() {
        Drawable a4 = c.a(this.f11542a);
        if (a4 == null) {
            return;
        }
        if (this.f11545d || this.f11546e) {
            Drawable mutate = a.l(a4).mutate();
            if (this.f11545d) {
                a.i(mutate, this.f11543b);
            }
            if (this.f11546e) {
                a.j(mutate, this.f11544c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f11542a.getDrawableState());
            }
            this.f11542a.setButtonDrawable(mutate);
        }
    }

    public int b(int i4) {
        return i4;
    }

    public ColorStateList c() {
        return this.f11543b;
    }

    public PorterDuff.Mode d() {
        return this.f11544c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(2:6|7)|9|10|(1:14)|15|(1:17)|18|(1:20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f11542a
            android.content.Context r0 = r0.getContext()
            int[] r1 = h.j.f9415R0
            r2 = 0
            p.f0 r0 = p.f0.v(r0, r11, r1, r12, r2)
            android.widget.CompoundButton r3 = r10.f11542a
            android.content.Context r4 = r3.getContext()
            int[] r5 = h.j.f9415R0
            android.content.res.TypedArray r7 = r0.r()
            r9 = 0
            r6 = r11
            r8 = r12
            S.C.e0(r3, r4, r5, r6, r7, r8, r9)
            int r11 = h.j.f9423T0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x003f
            int r11 = h.j.f9423T0     // Catch:{ all -> 0x003d }
            int r11 = r0.n(r11, r2)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x003f
            android.widget.CompoundButton r12 = r10.f11542a     // Catch:{ NotFoundException -> 0x003f }
            android.content.Context r1 = r12.getContext()     // Catch:{ NotFoundException -> 0x003f }
            android.graphics.drawable.Drawable r11 = j.C0754a.b(r1, r11)     // Catch:{ NotFoundException -> 0x003f }
            r12.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x003f }
            goto L_0x005c
        L_0x003d:
            r11 = move-exception
            goto L_0x008c
        L_0x003f:
            int r11 = h.j.f9419S0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x005c
            int r11 = h.j.f9419S0     // Catch:{ all -> 0x003d }
            int r11 = r0.n(r11, r2)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x005c
            android.widget.CompoundButton r12 = r10.f11542a     // Catch:{ all -> 0x003d }
            android.content.Context r1 = r12.getContext()     // Catch:{ all -> 0x003d }
            android.graphics.drawable.Drawable r11 = j.C0754a.b(r1, r11)     // Catch:{ all -> 0x003d }
            r12.setButtonDrawable(r11)     // Catch:{ all -> 0x003d }
        L_0x005c:
            int r11 = h.j.f9427U0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x006f
            android.widget.CompoundButton r11 = r10.f11542a     // Catch:{ all -> 0x003d }
            int r12 = h.j.f9427U0     // Catch:{ all -> 0x003d }
            android.content.res.ColorStateList r12 = r0.c(r12)     // Catch:{ all -> 0x003d }
            X.c.c(r11, r12)     // Catch:{ all -> 0x003d }
        L_0x006f:
            int r11 = h.j.f9431V0     // Catch:{ all -> 0x003d }
            boolean r11 = r0.s(r11)     // Catch:{ all -> 0x003d }
            if (r11 == 0) goto L_0x0088
            android.widget.CompoundButton r11 = r10.f11542a     // Catch:{ all -> 0x003d }
            int r12 = h.j.f9431V0     // Catch:{ all -> 0x003d }
            r1 = -1
            int r12 = r0.k(r12, r1)     // Catch:{ all -> 0x003d }
            r1 = 0
            android.graphics.PorterDuff$Mode r12 = p.K.d(r12, r1)     // Catch:{ all -> 0x003d }
            X.c.d(r11, r12)     // Catch:{ all -> 0x003d }
        L_0x0088:
            r0.w()
            return
        L_0x008c:
            r0.w()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C0841h.e(android.util.AttributeSet, int):void");
    }

    public void f() {
        if (this.f11547f) {
            this.f11547f = false;
            return;
        }
        this.f11547f = true;
        a();
    }

    public void g(ColorStateList colorStateList) {
        this.f11543b = colorStateList;
        this.f11545d = true;
        a();
    }

    public void h(PorterDuff.Mode mode) {
        this.f11544c = mode;
        this.f11546e = true;
        a();
    }
}
