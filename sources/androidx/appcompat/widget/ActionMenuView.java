package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b;
import p.i0;

public class ActionMenuView extends b implements e.b, j {

    /* renamed from: A  reason: collision with root package name */
    public int f4419A;

    /* renamed from: B  reason: collision with root package name */
    public int f4420B;

    /* renamed from: C  reason: collision with root package name */
    public e f4421C;

    /* renamed from: r  reason: collision with root package name */
    public androidx.appcompat.view.menu.e f4422r;

    /* renamed from: s  reason: collision with root package name */
    public Context f4423s;

    /* renamed from: t  reason: collision with root package name */
    public int f4424t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4425u;

    /* renamed from: v  reason: collision with root package name */
    public a f4426v;

    /* renamed from: w  reason: collision with root package name */
    public i.a f4427w;

    /* renamed from: x  reason: collision with root package name */
    public e.a f4428x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4429y;

    /* renamed from: z  reason: collision with root package name */
    public int f4430z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements i.a {
        public void b(androidx.appcompat.view.menu.e eVar, boolean z4) {
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends b.a {

        /* renamed from: c  reason: collision with root package name */
        public boolean f4431c;

        /* renamed from: d  reason: collision with root package name */
        public int f4432d;

        /* renamed from: e  reason: collision with root package name */
        public int f4433e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4434f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4435g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4436h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f4431c = cVar.f4431c;
        }

        public c(int i4, int i5) {
            super(i4, i5);
            this.f4431c = false;
        }
    }

    public class d implements e.a {
        public d() {
        }

        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f4421C;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f4428x;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static int L(View view, int i4, int i5, int i6, int i7) {
        int i8;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i6) - i7, View.MeasureSpec.getMode(i6));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z4 = false;
        boolean z5 = actionMenuItemView != null && actionMenuItemView.f();
        if (i5 > 0) {
            i8 = 2;
            if (!z5 || i5 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i5 * i4, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i9 = measuredWidth / i4;
                if (measuredWidth % i4 != 0) {
                    i9++;
                }
                if (!z5 || i9 >= 2) {
                    i8 = i9;
                }
                if (!cVar.f4431c && z5) {
                    z4 = true;
                }
                cVar.f4434f = z4;
                cVar.f4432d = i8;
                view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i8, 1073741824), makeMeasureSpec);
                return i8;
            }
        }
        i8 = 0;
        z4 = true;
        cVar.f4434f = z4;
        cVar.f4432d = i8;
        view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i8, 1073741824), makeMeasureSpec);
        return i8;
    }

    public void B() {
        a aVar = this.f4426v;
        if (aVar != null) {
            aVar.y();
        }
    }

    /* renamed from: C */
    public c m() {
        c cVar = new c(-2, -2);
        cVar.f4664b = 16;
        return cVar;
    }

    /* renamed from: D */
    public c n(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* renamed from: E */
    public c o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return m();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f4664b <= 0) {
            cVar.f4664b = 16;
        }
        return cVar;
    }

    public c F() {
        c C4 = m();
        C4.f4431c = true;
        return C4;
    }

    public boolean G(int i4) {
        boolean z4 = false;
        if (i4 == 0) {
            return false;
        }
        View childAt = getChildAt(i4 - 1);
        View childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof a)) {
            z4 = ((a) childAt).a();
        }
        return (i4 <= 0 || !(childAt2 instanceof a)) ? z4 : z4 | ((a) childAt2).b();
    }

    public boolean H() {
        a aVar = this.f4426v;
        return aVar != null && aVar.B();
    }

    public boolean I() {
        a aVar = this.f4426v;
        return aVar != null && aVar.D();
    }

    public boolean J() {
        a aVar = this.f4426v;
        return aVar != null && aVar.E();
    }

    public boolean K() {
        return this.f4425u;
    }

    public final void M(int i4, int i5) {
        int i6;
        boolean z4;
        int i7;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        int i10;
        boolean z7;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingTop, -2);
        int i11 = size - paddingLeft;
        int i12 = this.f4419A;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = i12 + (i14 / i13);
        int childCount = getChildCount();
        int i16 = 0;
        int i17 = 0;
        boolean z8 = false;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        long j4 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            int i21 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z9 = childAt instanceof ActionMenuItemView;
                int i22 = i18 + 1;
                if (z9) {
                    int i23 = this.f4420B;
                    i10 = i22;
                    z7 = false;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    i10 = i22;
                    z7 = false;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f4436h = z7;
                cVar.f4433e = z7 ? 1 : 0;
                cVar.f4432d = z7;
                cVar.f4434f = z7;
                cVar.leftMargin = z7;
                cVar.rightMargin = z7;
                cVar.f4435g = z9 && ((ActionMenuItemView) childAt).f();
                int L4 = L(childAt, i15, cVar.f4431c ? 1 : i13, childMeasureSpec, paddingTop);
                i19 = Math.max(i19, L4);
                if (cVar.f4434f) {
                    i20++;
                }
                if (cVar.f4431c) {
                    z8 = true;
                }
                i13 -= L4;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (L4 == 1) {
                    j4 |= (long) (1 << i17);
                    i16 = i16;
                } else {
                    int i24 = i16;
                }
                i18 = i10;
            }
            i17++;
            size2 = i21;
        }
        int i25 = size2;
        boolean z10 = z8 && i18 == 2;
        boolean z11 = false;
        while (true) {
            if (i20 <= 0 || i13 <= 0) {
                i8 = mode;
                i6 = i11;
                z4 = z11;
                i7 = i16;
            } else {
                int i26 = Integer.MAX_VALUE;
                int i27 = 0;
                int i28 = 0;
                long j5 = 0;
                while (i28 < childCount) {
                    boolean z12 = z11;
                    c cVar2 = (c) getChildAt(i28).getLayoutParams();
                    int i29 = i16;
                    if (cVar2.f4434f) {
                        int i30 = cVar2.f4432d;
                        if (i30 < i26) {
                            j5 = 1 << i28;
                            i26 = i30;
                            i27 = 1;
                        } else if (i30 == i26) {
                            i27++;
                            j5 |= 1 << i28;
                        }
                    }
                    i28++;
                    i16 = i29;
                    z11 = z12;
                }
                z4 = z11;
                i7 = i16;
                j4 |= j5;
                if (i27 > i13) {
                    i8 = mode;
                    i6 = i11;
                    break;
                }
                int i31 = i26 + 1;
                int i32 = 0;
                while (i32 < childCount) {
                    View childAt2 = getChildAt(i32);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i33 = i11;
                    int i34 = mode;
                    long j6 = (long) (1 << i32);
                    if ((j5 & j6) == 0) {
                        if (cVar3.f4432d == i31) {
                            j4 |= j6;
                        }
                        z6 = z10;
                    } else {
                        if (!z10 || !cVar3.f4435g || i13 != 1) {
                            z6 = z10;
                        } else {
                            int i35 = this.f4420B;
                            z6 = z10;
                            childAt2.setPadding(i35 + i15, 0, i35, 0);
                        }
                        cVar3.f4432d++;
                        cVar3.f4436h = true;
                        i13--;
                    }
                    i32++;
                    mode = i34;
                    i11 = i33;
                    z10 = z6;
                }
                i16 = i7;
                z11 = true;
            }
        }
        boolean z13 = !z8 && i18 == 1;
        if (i13 <= 0 || j4 == 0 || (i13 >= i18 - 1 && !z13 && i19 <= 1)) {
            i9 = 0;
            z5 = z4;
        } else {
            float bitCount = (float) Long.bitCount(j4);
            if (!z13) {
                i9 = 0;
                if ((j4 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f4435g) {
                    bitCount -= 0.5f;
                }
                int i36 = childCount - 1;
                if ((j4 & ((long) (1 << i36))) != 0 && !((c) getChildAt(i36).getLayoutParams()).f4435g) {
                    bitCount -= 0.5f;
                }
            } else {
                i9 = 0;
            }
            int i37 = bitCount > 0.0f ? (int) (((float) (i13 * i15)) / bitCount) : i9;
            z5 = z4;
            for (int i38 = i9; i38 < childCount; i38++) {
                if ((j4 & ((long) (1 << i38))) != 0) {
                    View childAt3 = getChildAt(i38);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f4433e = i37;
                        cVar4.f4436h = true;
                        if (i38 == 0 && !cVar4.f4435g) {
                            cVar4.leftMargin = (-i37) / 2;
                        }
                        z5 = true;
                    } else if (cVar4.f4431c) {
                        cVar4.f4433e = i37;
                        cVar4.f4436h = true;
                        cVar4.rightMargin = (-i37) / 2;
                        z5 = true;
                    } else {
                        if (i38 != 0) {
                            cVar4.leftMargin = i37 / 2;
                        }
                        if (i38 != childCount - 1) {
                            cVar4.rightMargin = i37 / 2;
                        }
                    }
                }
            }
        }
        if (z5) {
            for (int i39 = i9; i39 < childCount; i39++) {
                View childAt4 = getChildAt(i39);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f4436h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f4432d * i15) + cVar5.f4433e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i6, i8 != 1073741824 ? i7 : i25);
    }

    public androidx.appcompat.view.menu.e N() {
        return this.f4422r;
    }

    public void O(i.a aVar, e.a aVar2) {
        this.f4427w = aVar;
        this.f4428x = aVar2;
    }

    public boolean P() {
        a aVar = this.f4426v;
        return aVar != null && aVar.K();
    }

    public boolean a(g gVar) {
        return this.f4422r.L(gVar, 0);
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f4422r = eVar;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f4422r == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f4422r = eVar;
            eVar.R(new d());
            a aVar = new a(context);
            this.f4426v = aVar;
            aVar.J(true);
            a aVar2 = this.f4426v;
            i.a aVar3 = this.f4427w;
            if (aVar3 == null) {
                aVar3 = new b();
            }
            aVar2.k(aVar3);
            this.f4422r.c(this.f4426v, this.f4423s);
            this.f4426v.H(this);
        }
        return this.f4422r;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f4426v.A();
    }

    public int getPopupTheme() {
        return this.f4424t;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a aVar = this.f4426v;
        if (aVar != null) {
            aVar.f(false);
            if (this.f4426v.E()) {
                this.f4426v.B();
                this.f4426v.K();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        B();
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i8;
        int i9;
        if (!this.f4429y) {
            super.onLayout(z4, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i10 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i11 = i6 - i4;
        int paddingRight = (i11 - getPaddingRight()) - getPaddingLeft();
        boolean b4 = i0.b(this);
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f4431c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (G(i14)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b4) {
                        i8 = getPaddingLeft() + cVar.leftMargin;
                        i9 = i8 + measuredWidth;
                    } else {
                        i9 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i8 = i9 - measuredWidth;
                    }
                    int i15 = i10 - (measuredHeight / 2);
                    childAt.layout(i8, i15, i9, measuredHeight + i15);
                    paddingRight -= measuredWidth;
                    i12 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    G(i14);
                    i13++;
                }
            }
        }
        if (childCount == 1 && i12 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i16 = (i11 / 2) - (measuredWidth2 / 2);
            int i17 = i10 - (measuredHeight2 / 2);
            childAt2.layout(i16, i17, measuredWidth2 + i16, measuredHeight2 + i17);
            return;
        }
        int i18 = i13 - (i12 ^ 1);
        int max = Math.max(0, i18 > 0 ? paddingRight / i18 : 0);
        if (b4) {
            int width = getWidth() - getPaddingRight();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt3 = getChildAt(i19);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f4431c) {
                    int i20 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i10 - (measuredHeight3 / 2);
                    childAt3.layout(i20 - measuredWidth3, i21, i20, measuredHeight3 + i21);
                    width = i20 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt4 = getChildAt(i22);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f4431c) {
                int i23 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i24 = i10 - (measuredHeight4 / 2);
                childAt4.layout(i23, i24, i23 + measuredWidth4, measuredHeight4 + i24);
                paddingLeft = i23 + measuredWidth4 + cVar3.rightMargin + max;
            }
        }
    }

    public void onMeasure(int i4, int i5) {
        androidx.appcompat.view.menu.e eVar;
        boolean z4 = this.f4429y;
        boolean z5 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.f4429y = z5;
        if (z4 != z5) {
            this.f4430z = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (!(!this.f4429y || (eVar = this.f4422r) == null || size == this.f4430z)) {
            this.f4430z = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (!this.f4429y || childCount <= 0) {
            for (int i6 = 0; i6 < childCount; i6++) {
                c cVar = (c) getChildAt(i6).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i4, i5);
            return;
        }
        M(i4, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.f4426v.G(z4);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f4421C = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f4426v.I(drawable);
    }

    public void setOverflowReserved(boolean z4) {
        this.f4425u = z4;
    }

    public void setPopupTheme(int i4) {
        if (this.f4424t != i4) {
            this.f4424t = i4;
            if (i4 == 0) {
                this.f4423s = getContext();
            } else {
                this.f4423s = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(a aVar) {
        this.f4426v = aVar;
        aVar.H(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f4419A = (int) (56.0f * f4);
        this.f4420B = (int) (f4 * 4.0f);
        this.f4423s = context;
        this.f4424t = 0;
    }
}
