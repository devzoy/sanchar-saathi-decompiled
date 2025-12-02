package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

public abstract class a implements i {

    /* renamed from: c  reason: collision with root package name */
    public Context f4196c;

    /* renamed from: d  reason: collision with root package name */
    public Context f4197d;

    /* renamed from: e  reason: collision with root package name */
    public e f4198e;

    /* renamed from: f  reason: collision with root package name */
    public LayoutInflater f4199f;

    /* renamed from: g  reason: collision with root package name */
    public LayoutInflater f4200g;

    /* renamed from: h  reason: collision with root package name */
    public i.a f4201h;

    /* renamed from: i  reason: collision with root package name */
    public int f4202i;

    /* renamed from: j  reason: collision with root package name */
    public int f4203j;

    /* renamed from: k  reason: collision with root package name */
    public j f4204k;

    /* renamed from: l  reason: collision with root package name */
    public int f4205l;

    public a(Context context, int i4, int i5) {
        this.f4196c = context;
        this.f4199f = LayoutInflater.from(context);
        this.f4202i = i4;
        this.f4203j = i5;
    }

    public void a(View view, int i4) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f4204k).addView(view, i4);
    }

    public void b(e eVar, boolean z4) {
        i.a aVar = this.f4201h;
        if (aVar != null) {
            aVar.b(eVar, z4);
        }
    }

    public abstract void c(g gVar, j.a aVar);

    public void d(Context context, e eVar) {
        this.f4197d = context;
        this.f4200g = LayoutInflater.from(context);
        this.f4198e = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(androidx.appcompat.view.menu.l r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.i$a r0 = r1.f4201h
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.e r2 = r1.f4198e
        L_0x0009:
            boolean r2 = r0.c(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.a.e(androidx.appcompat.view.menu.l):boolean");
    }

    public void f(boolean z4) {
        ViewGroup viewGroup = (ViewGroup) this.f4204k;
        if (viewGroup != null) {
            e eVar = this.f4198e;
            int i4 = 0;
            if (eVar != null) {
                eVar.r();
                ArrayList E4 = this.f4198e.E();
                int size = E4.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    g gVar = (g) E4.get(i6);
                    if (q(i5, gVar)) {
                        View childAt = viewGroup.getChildAt(i5);
                        g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                        View n4 = n(gVar, childAt, viewGroup);
                        if (gVar != itemData) {
                            n4.setPressed(false);
                            n4.jumpDrawablesToCurrentState();
                        }
                        if (n4 != childAt) {
                            a(n4, i5);
                        }
                        i5++;
                    }
                }
                i4 = i5;
            }
            while (i4 < viewGroup.getChildCount()) {
                if (!l(viewGroup, i4)) {
                    i4++;
                }
            }
        }
    }

    public j.a g(ViewGroup viewGroup) {
        return (j.a) this.f4199f.inflate(this.f4203j, viewGroup, false);
    }

    public boolean i(e eVar, g gVar) {
        return false;
    }

    public boolean j(e eVar, g gVar) {
        return false;
    }

    public void k(i.a aVar) {
        this.f4201h = aVar;
    }

    public boolean l(ViewGroup viewGroup, int i4) {
        viewGroup.removeViewAt(i4);
        return true;
    }

    public i.a m() {
        return this.f4201h;
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        j.a g4 = view instanceof j.a ? (j.a) view : g(viewGroup);
        c(gVar, g4);
        return (View) g4;
    }

    public j o(ViewGroup viewGroup) {
        if (this.f4204k == null) {
            j jVar = (j) this.f4199f.inflate(this.f4202i, viewGroup, false);
            this.f4204k = jVar;
            jVar.b(this.f4198e);
            f(true);
        }
        return this.f4204k;
    }

    public void p(int i4) {
        this.f4205l = i4;
    }

    public abstract boolean q(int i4, g gVar);
}
