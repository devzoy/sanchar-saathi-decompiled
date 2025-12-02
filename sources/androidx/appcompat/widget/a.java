package androidx.appcompat.widget;

import S.C0311b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import h.C0645a;
import java.util.ArrayList;
import n.C0796a;
import o.C0813f;
import p.C0847n;
import p.N;
import p.g0;

public class a extends androidx.appcompat.view.menu.a implements C0311b.a {

    /* renamed from: A  reason: collision with root package name */
    public e f4619A;

    /* renamed from: B  reason: collision with root package name */
    public C0084a f4620B;

    /* renamed from: C  reason: collision with root package name */
    public c f4621C;

    /* renamed from: D  reason: collision with root package name */
    public b f4622D;

    /* renamed from: E  reason: collision with root package name */
    public final f f4623E = new f();

    /* renamed from: F  reason: collision with root package name */
    public int f4624F;

    /* renamed from: m  reason: collision with root package name */
    public d f4625m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f4626n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4627o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4628p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4629q;

    /* renamed from: r  reason: collision with root package name */
    public int f4630r;

    /* renamed from: s  reason: collision with root package name */
    public int f4631s;

    /* renamed from: t  reason: collision with root package name */
    public int f4632t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4633u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4634v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4635w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4636x;

    /* renamed from: y  reason: collision with root package name */
    public int f4637y;

    /* renamed from: z  reason: collision with root package name */
    public final SparseBooleanArray f4638z = new SparseBooleanArray();

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    public class C0084a extends h {
        public C0084a(Context context, l lVar, View view) {
            super(context, lVar, view, false, C0645a.f9175i);
            if (!((g) lVar.getItem()).l()) {
                View view2 = a.this.f4625m;
                f(view2 == null ? (View) a.this.f4204k : view2);
            }
            j(a.this.f4623E);
        }

        public void e() {
            a aVar = a.this;
            aVar.f4620B = null;
            aVar.f4624F = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        public C0813f a() {
            C0084a aVar = a.this.f4620B;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public e f4641e;

        public c(e eVar) {
            this.f4641e = eVar;
        }

        public void run() {
            if (a.this.f4198e != null) {
                a.this.f4198e.d();
            }
            View view = (View) a.this.f4204k;
            if (!(view == null || view.getWindowToken() == null || !this.f4641e.m())) {
                a.this.f4619A = this.f4641e;
            }
            a.this.f4621C = null;
        }
    }

    public class d extends C0847n implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.a$d$a  reason: collision with other inner class name */
        public class C0085a extends N {

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ a f4644l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0085a(View view, a aVar) {
                super(view);
                this.f4644l = aVar;
            }

            public C0813f b() {
                e eVar = a.this.f4619A;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            public boolean c() {
                a.this.K();
                return true;
            }

            public boolean d() {
                a aVar = a.this;
                if (aVar.f4621C != null) {
                    return false;
                }
                aVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, C0645a.f9174h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            g0.a(this, getContentDescription());
            setOnTouchListener(new C0085a(this, a.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.K();
            return true;
        }

        public boolean setFrame(int i4, int i5, int i6, int i7) {
            boolean frame = super.setFrame(i4, i5, i6, i7);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                K.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z4) {
            super(context, eVar, view, z4, C0645a.f9175i);
            h(8388613);
            j(a.this.f4623E);
        }

        public void e() {
            if (a.this.f4198e != null) {
                a.this.f4198e.close();
            }
            a.this.f4619A = null;
            super.e();
        }
    }

    public class f implements i.a {
        public f() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z4) {
            if (eVar instanceof l) {
                eVar.D().e(false);
            }
            i.a m4 = a.this.m();
            if (m4 != null) {
                m4.b(eVar, z4);
            }
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == a.this.f4198e) {
                return false;
            }
            a.this.f4624F = ((l) eVar).getItem().getItemId();
            i.a m4 = a.this.m();
            if (m4 != null) {
                return m4.c(eVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, h.g.f9297c, h.g.f9296b);
    }

    public Drawable A() {
        d dVar = this.f4625m;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f4627o) {
            return this.f4626n;
        }
        return null;
    }

    public boolean B() {
        j jVar;
        c cVar = this.f4621C;
        if (cVar == null || (jVar = this.f4204k) == null) {
            e eVar = this.f4619A;
            if (eVar == null) {
                return false;
            }
            eVar.b();
            return true;
        }
        ((View) jVar).removeCallbacks(cVar);
        this.f4621C = null;
        return true;
    }

    public boolean C() {
        C0084a aVar = this.f4620B;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.f4621C != null || E();
    }

    public boolean E() {
        e eVar = this.f4619A;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f4633u) {
            this.f4632t = C0796a.b(this.f4197d).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f4198e;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z4) {
        this.f4636x = z4;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f4204k = actionMenuView;
        actionMenuView.b(this.f4198e);
    }

    public void I(Drawable drawable) {
        d dVar = this.f4625m;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f4627o = true;
        this.f4626n = drawable;
    }

    public void J(boolean z4) {
        this.f4628p = z4;
        this.f4629q = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f4628p || E() || (eVar = this.f4198e) == null || this.f4204k == null || this.f4621C != null || eVar.z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f4197d, this.f4198e, this.f4625m, true));
        this.f4621C = cVar;
        ((View) this.f4204k).post(cVar);
        return true;
    }

    public void b(androidx.appcompat.view.menu.e eVar, boolean z4) {
        y();
        super.b(eVar, z4);
    }

    public void c(g gVar, j.a aVar) {
        aVar.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f4204k);
        if (this.f4622D == null) {
            this.f4622D = new b();
        }
        actionMenuItemView.setPopupCallback(this.f4622D);
    }

    public void d(Context context, androidx.appcompat.view.menu.e eVar) {
        super.d(context, eVar);
        Resources resources = context.getResources();
        C0796a b4 = C0796a.b(context);
        if (!this.f4629q) {
            this.f4628p = b4.f();
        }
        if (!this.f4635w) {
            this.f4630r = b4.c();
        }
        if (!this.f4633u) {
            this.f4632t = b4.d();
        }
        int i4 = this.f4630r;
        if (this.f4628p) {
            if (this.f4625m == null) {
                d dVar = new d(this.f4196c);
                this.f4625m = dVar;
                if (this.f4627o) {
                    dVar.setImageDrawable(this.f4626n);
                    this.f4626n = null;
                    this.f4627o = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4625m.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.f4625m.getMeasuredWidth();
        } else {
            this.f4625m = null;
        }
        this.f4631s = i4;
        this.f4637y = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean e(l lVar) {
        boolean z4 = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l lVar2 = lVar;
        while (lVar2.e0() != this.f4198e) {
            lVar2 = (l) lVar2.e0();
        }
        View z5 = z(lVar2.getItem());
        if (z5 == null) {
            return false;
        }
        this.f4624F = lVar.getItem().getItemId();
        int size = lVar.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            MenuItem item = lVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z4 = true;
                break;
            }
            i4++;
        }
        C0084a aVar = new C0084a(this.f4197d, lVar, z5);
        this.f4620B = aVar;
        aVar.g(z4);
        this.f4620B.k();
        super.e(lVar);
        return true;
    }

    public void f(boolean z4) {
        j jVar;
        super.f(z4);
        ((View) this.f4204k).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f4198e;
        boolean z5 = false;
        if (eVar != null) {
            ArrayList s4 = eVar.s();
            int size = s4.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0311b a4 = ((g) s4.get(i4)).a();
                if (a4 != null) {
                    a4.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f4198e;
        ArrayList z6 = eVar2 != null ? eVar2.z() : null;
        if (this.f4628p && z6 != null) {
            int size2 = z6.size();
            if (size2 == 1) {
                z5 = !((g) z6.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z5 = true;
            }
        }
        if (z5) {
            if (this.f4625m == null) {
                this.f4625m = new d(this.f4196c);
            }
            ViewGroup viewGroup = (ViewGroup) this.f4625m.getParent();
            if (viewGroup != this.f4204k) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f4625m);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f4204k;
                actionMenuView.addView(this.f4625m, actionMenuView.F());
            }
        } else {
            d dVar = this.f4625m;
            if (dVar != null && dVar.getParent() == (jVar = this.f4204k)) {
                ((ViewGroup) jVar).removeView(this.f4625m);
            }
        }
        ((ActionMenuView) this.f4204k).setOverflowReserved(this.f4628p);
    }

    public boolean h() {
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        int i7;
        boolean z4;
        a aVar = this;
        androidx.appcompat.view.menu.e eVar = aVar.f4198e;
        View view = null;
        boolean z5 = false;
        if (eVar != null) {
            arrayList = eVar.E();
            i4 = arrayList.size();
        } else {
            arrayList = null;
            i4 = 0;
        }
        int i8 = aVar.f4632t;
        int i9 = aVar.f4631s;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f4204k;
        boolean z6 = false;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < i4; i12++) {
            g gVar = (g) arrayList.get(i12);
            if (gVar.o()) {
                i10++;
            } else if (gVar.n()) {
                i11++;
            } else {
                z6 = true;
            }
            if (aVar.f4636x && gVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (aVar.f4628p && (z6 || i11 + i10 > i8)) {
            i8--;
        }
        int i13 = i8 - i10;
        SparseBooleanArray sparseBooleanArray = aVar.f4638z;
        sparseBooleanArray.clear();
        if (aVar.f4634v) {
            int i14 = aVar.f4637y;
            i5 = i9 / i14;
            i6 = i14 + ((i9 % i14) / i5);
        } else {
            i6 = 0;
            i5 = 0;
        }
        int i15 = 0;
        int i16 = 0;
        while (i15 < i4) {
            g gVar2 = (g) arrayList.get(i15);
            if (gVar2.o()) {
                View n4 = aVar.n(gVar2, view, viewGroup);
                if (aVar.f4634v) {
                    i5 -= ActionMenuView.L(n4, i6, i5, makeMeasureSpec, z5 ? 1 : 0);
                } else {
                    n4.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n4.getMeasuredWidth();
                i9 -= measuredWidth;
                if (i16 == 0) {
                    i16 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z4 = z5;
                i7 = i4;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z7 = sparseBooleanArray.get(groupId2);
                boolean z8 = (i13 > 0 || z7) && i9 > 0 && (!aVar.f4634v || i5 > 0);
                boolean z9 = z8;
                i7 = i4;
                if (z8) {
                    View n5 = aVar.n(gVar2, (View) null, viewGroup);
                    if (aVar.f4634v) {
                        int L4 = ActionMenuView.L(n5, i6, i5, makeMeasureSpec, 0);
                        i5 -= L4;
                        if (L4 == 0) {
                            z9 = false;
                        }
                    } else {
                        n5.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z10 = z9;
                    int measuredWidth2 = n5.getMeasuredWidth();
                    i9 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z8 = z10 & (!aVar.f4634v ? i9 + i16 > 0 : i9 >= 0);
                }
                if (z8 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z7) {
                    sparseBooleanArray.put(groupId2, false);
                    int i17 = 0;
                    while (i17 < i15) {
                        g gVar3 = (g) arrayList.get(i17);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i13++;
                            }
                            gVar3.u(false);
                        }
                        i17++;
                    }
                }
                if (z8) {
                    i13--;
                }
                gVar2.u(z8);
                z4 = false;
            } else {
                z4 = z5;
                i7 = i4;
                gVar2.u(z4);
            }
            i15++;
            z5 = z4;
            i4 = i7;
            view = null;
            aVar = this;
        }
        return true;
    }

    public boolean l(ViewGroup viewGroup, int i4) {
        if (viewGroup.getChildAt(i4) == this.f4625m) {
            return false;
        }
        return super.l(viewGroup, i4);
    }

    public View n(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    public j o(ViewGroup viewGroup) {
        j jVar = this.f4204k;
        j o4 = super.o(viewGroup);
        if (jVar != o4) {
            ((ActionMenuView) o4).setPresenter(this);
        }
        return o4;
    }

    public boolean q(int i4, g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }

    public final View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f4204k;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }
}
