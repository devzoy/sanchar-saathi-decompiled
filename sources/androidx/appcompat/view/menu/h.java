package androidx.appcompat.view.menu;

import S.C;
import S.C0317h;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import o.C0811d;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4323a;

    /* renamed from: b  reason: collision with root package name */
    public final e f4324b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4325c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4326d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4327e;

    /* renamed from: f  reason: collision with root package name */
    public View f4328f;

    /* renamed from: g  reason: collision with root package name */
    public int f4329g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4330h;

    /* renamed from: i  reason: collision with root package name */
    public i.a f4331i;

    /* renamed from: j  reason: collision with root package name */
    public C0811d f4332j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f4333k;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f4334l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public void onDismiss() {
            h.this.e();
        }
    }

    public h(Context context, e eVar, View view, boolean z4, int i4) {
        this(context, eVar, view, z4, i4, 0);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [androidx.appcompat.view.menu.i, o.d] */
    /* JADX WARNING: type inference failed for: r8v1, types: [androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r2v2, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.C0811d a() {
        /*
            r15 = this;
            android.content.Context r0 = r15.f4323a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r15.f4323a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = h.C0648d.f9202a
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x003d
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r3 = r15.f4323a
            android.view.View r4 = r15.f4328f
            int r5 = r15.f4326d
            int r6 = r15.f4327e
            boolean r7 = r15.f4325c
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x004f
        L_0x003d:
            androidx.appcompat.view.menu.k r0 = new androidx.appcompat.view.menu.k
            android.content.Context r9 = r15.f4323a
            androidx.appcompat.view.menu.e r10 = r15.f4324b
            android.view.View r11 = r15.f4328f
            int r12 = r15.f4326d
            int r13 = r15.f4327e
            boolean r14 = r15.f4325c
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x004f:
            androidx.appcompat.view.menu.e r1 = r15.f4324b
            r0.l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r15.f4334l
            r0.u(r1)
            android.view.View r1 = r15.f4328f
            r0.p(r1)
            androidx.appcompat.view.menu.i$a r1 = r15.f4331i
            r0.k(r1)
            boolean r1 = r15.f4330h
            r0.r(r1)
            int r1 = r15.f4329g
            r0.s(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h.a():o.d");
    }

    public void b() {
        if (d()) {
            this.f4332j.dismiss();
        }
    }

    public C0811d c() {
        if (this.f4332j == null) {
            this.f4332j = a();
        }
        return this.f4332j;
    }

    public boolean d() {
        C0811d dVar = this.f4332j;
        return dVar != null && dVar.c();
    }

    public void e() {
        this.f4332j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f4333k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f4328f = view;
    }

    public void g(boolean z4) {
        this.f4330h = z4;
        C0811d dVar = this.f4332j;
        if (dVar != null) {
            dVar.r(z4);
        }
    }

    public void h(int i4) {
        this.f4329g = i4;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f4333k = onDismissListener;
    }

    public void j(i.a aVar) {
        this.f4331i = aVar;
        C0811d dVar = this.f4332j;
        if (dVar != null) {
            dVar.k(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i4, int i5, boolean z4, boolean z5) {
        C0811d c4 = c();
        c4.v(z5);
        if (z4) {
            if ((C0317h.b(this.f4329g, C.x(this.f4328f)) & 7) == 5) {
                i4 -= this.f4328f.getWidth();
            }
            c4.t(i4);
            c4.w(i5);
            int i6 = (int) ((this.f4323a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c4.q(new Rect(i4 - i6, i5 - i6, i4 + i6, i5 + i6));
        }
        c4.a();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f4328f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i4, int i5) {
        if (d()) {
            return true;
        }
        if (this.f4328f == null) {
            return false;
        }
        l(i4, i5, true, true);
        return true;
    }

    public h(Context context, e eVar, View view, boolean z4, int i4, int i5) {
        this.f4329g = 8388611;
        this.f4334l = new a();
        this.f4323a = context;
        this.f4324b = eVar;
        this.f4328f = view;
        this.f4325c = z4;
        this.f4326d = i4;
        this.f4327e = i5;
    }
}
