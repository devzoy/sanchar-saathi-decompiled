package androidx.appcompat.widget;

import S.C;
import S.C0327s;
import S.C0328t;
import S.C0329u;
import S.O;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.i;
import h.C0645a;
import h.f;
import p.C0829D;
import p.C0830E;

public class ActionBarOverlayLayout extends ViewGroup implements C0829D, C0327s, C0328t {

    /* renamed from: H  reason: collision with root package name */
    public static final int[] f4384H = {C0645a.f9168b, 16842841};

    /* renamed from: A  reason: collision with root package name */
    public d f4385A;

    /* renamed from: B  reason: collision with root package name */
    public OverScroller f4386B;

    /* renamed from: C  reason: collision with root package name */
    public ViewPropertyAnimator f4387C;

    /* renamed from: D  reason: collision with root package name */
    public final AnimatorListenerAdapter f4388D;

    /* renamed from: E  reason: collision with root package name */
    public final Runnable f4389E;

    /* renamed from: F  reason: collision with root package name */
    public final Runnable f4390F;

    /* renamed from: G  reason: collision with root package name */
    public final C0329u f4391G;

    /* renamed from: c  reason: collision with root package name */
    public int f4392c;

    /* renamed from: d  reason: collision with root package name */
    public int f4393d = 0;

    /* renamed from: e  reason: collision with root package name */
    public ContentFrameLayout f4394e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContainer f4395f;

    /* renamed from: g  reason: collision with root package name */
    public C0830E f4396g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f4397h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4398i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4399j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4400k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4401l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4402m;

    /* renamed from: n  reason: collision with root package name */
    public int f4403n;

    /* renamed from: o  reason: collision with root package name */
    public int f4404o;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f4405p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    public final Rect f4406q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    public final Rect f4407r = new Rect();

    /* renamed from: s  reason: collision with root package name */
    public final Rect f4408s = new Rect();

    /* renamed from: t  reason: collision with root package name */
    public final Rect f4409t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public final Rect f4410u = new Rect();

    /* renamed from: v  reason: collision with root package name */
    public final Rect f4411v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    public O f4412w;

    /* renamed from: x  reason: collision with root package name */
    public O f4413x;

    /* renamed from: y  reason: collision with root package name */
    public O f4414y;

    /* renamed from: z  reason: collision with root package name */
    public O f4415z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4387C = null;
            actionBarOverlayLayout.f4402m = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4387C = null;
            actionBarOverlayLayout.f4402m = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4387C = actionBarOverlayLayout.f4395f.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f4388D);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4387C = actionBarOverlayLayout.f4395f.animate().translationY((float) (-ActionBarOverlayLayout.this.f4395f.getHeight())).setListener(ActionBarOverlayLayout.this.f4388D);
        }
    }

    public interface d {
        void a();

        void b();

        void c(int i4);

        void d();

        void e(boolean z4);

        void f();
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i4, int i5) {
            super(i4, i5);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        O o4 = O.f2642b;
        this.f4412w = o4;
        this.f4413x = o4;
        this.f4414y = o4;
        this.f4415z = o4;
        this.f4388D = new a();
        this.f4389E = new b();
        this.f4390F = new c();
        v(context);
        this.f4391G = new C0329u(this);
    }

    public final void A() {
        u();
        this.f4389E.run();
    }

    public final boolean B(float f4) {
        this.f4386B.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f4386B.getFinalY() > this.f4395f.getHeight();
    }

    public void a(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    public void b(Menu menu, i.a aVar) {
        z();
        this.f4396g.b(menu, aVar);
    }

    public boolean c() {
        z();
        return this.f4396g.c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d() {
        z();
        this.f4396g.d();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f4397h != null && !this.f4398i) {
            int bottom = this.f4395f.getVisibility() == 0 ? (int) (((float) this.f4395f.getBottom()) + this.f4395f.getTranslationY() + 0.5f) : 0;
            this.f4397h.setBounds(0, bottom, getWidth(), this.f4397h.getIntrinsicHeight() + bottom);
            this.f4397h.draw(canvas);
        }
    }

    public boolean e() {
        z();
        return this.f4396g.e();
    }

    public boolean f() {
        z();
        return this.f4396g.f();
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public boolean g() {
        z();
        return this.f4396g.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4395f;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.f4391G.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f4396g.getTitle();
    }

    public boolean h() {
        z();
        return this.f4396g.h();
    }

    public void i(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void j(View view, int i4, int i5, int[] iArr, int i6) {
        if (i6 == 0) {
            onNestedPreScroll(view, i4, i5, iArr);
        }
    }

    public void k(int i4) {
        z();
        if (i4 == 2) {
            this.f4396g.t();
        } else if (i4 == 5) {
            this.f4396g.u();
        } else if (i4 == 109) {
            setOverlayMode(true);
        }
    }

    public void l() {
        z();
        this.f4396g.i();
    }

    public void m(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        n(view, i4, i5, i6, i7, i8);
    }

    public void n(View view, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i4, i5, i6, i7);
        }
    }

    public boolean o(View view, View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        O v4 = O.v(windowInsets);
        boolean q4 = q(this.f4395f, new Rect(v4.j(), v4.l(), v4.k(), v4.i()), true, true, false, true);
        C.e(this, v4, this.f4405p);
        Rect rect = this.f4405p;
        O m4 = v4.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f4412w = m4;
        boolean z4 = true;
        if (!this.f4413x.equals(m4)) {
            this.f4413x = this.f4412w;
            q4 = true;
        }
        if (!this.f4406q.equals(this.f4405p)) {
            this.f4406q.set(this.f4405p);
        } else {
            z4 = q4;
        }
        if (z4) {
            requestLayout();
        }
        return v4.a().c().b().u();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        C.d0(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = eVar.leftMargin + paddingLeft;
                int i10 = eVar.topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    public void onMeasure(int i4, int i5) {
        int i6;
        z();
        measureChildWithMargins(this.f4395f, i4, 0, i5, 0);
        e eVar = (e) this.f4395f.getLayoutParams();
        int max = Math.max(0, this.f4395f.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f4395f.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f4395f.getMeasuredState());
        boolean z4 = (C.F(this) & 256) != 0;
        if (z4) {
            i6 = this.f4392c;
            if (this.f4400k && this.f4395f.getTabContainer() != null) {
                i6 += this.f4392c;
            }
        } else {
            i6 = this.f4395f.getVisibility() != 8 ? this.f4395f.getMeasuredHeight() : 0;
        }
        this.f4407r.set(this.f4405p);
        O o4 = this.f4412w;
        this.f4414y = o4;
        if (this.f4399j || z4) {
            this.f4414y = new O.b(this.f4414y).c(J.b.b(o4.j(), this.f4414y.l() + i6, this.f4414y.k(), this.f4414y.i())).a();
        } else {
            Rect rect = this.f4407r;
            rect.top += i6;
            rect.bottom = rect.bottom;
            this.f4414y = o4.m(0, i6, 0, 0);
        }
        q(this.f4394e, this.f4407r, true, true, true, true);
        if (!this.f4415z.equals(this.f4414y)) {
            O o5 = this.f4414y;
            this.f4415z = o5;
            C.f(this.f4394e, o5);
        }
        measureChildWithMargins(this.f4394e, i4, 0, i5, 0);
        e eVar2 = (e) this.f4394e.getLayoutParams();
        int max3 = Math.max(max, this.f4394e.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f4394e.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f4394e.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        if (!this.f4401l || !z4) {
            return false;
        }
        if (B(f5)) {
            p();
        } else {
            A();
        }
        this.f4402m = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f4403n + i5;
        this.f4403n = i8;
        setActionBarHideOffset(i8);
    }

    public void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f4391G.b(view, view2, i4);
        this.f4403n = getActionBarHideOffset();
        u();
        d dVar = this.f4385A;
        if (dVar != null) {
            dVar.b();
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f4395f.getVisibility() != 0) {
            return false;
        }
        return this.f4401l;
    }

    public void onStopNestedScroll(View view) {
        if (this.f4401l && !this.f4402m) {
            if (this.f4403n <= this.f4395f.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.f4385A;
        if (dVar != null) {
            dVar.d();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        z();
        int i5 = this.f4404o ^ i4;
        this.f4404o = i4;
        boolean z4 = false;
        boolean z5 = (i4 & 4) == 0;
        if ((i4 & 256) != 0) {
            z4 = true;
        }
        d dVar = this.f4385A;
        if (dVar != null) {
            dVar.e(!z4);
            if (z5 || !z4) {
                this.f4385A.a();
            } else {
                this.f4385A.f();
            }
        }
        if ((i5 & 256) != 0 && this.f4385A != null) {
            C.d0(this);
        }
    }

    public void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.f4393d = i4;
        d dVar = this.f4385A;
        if (dVar != null) {
            dVar.c(i4);
        }
    }

    public final void p() {
        u();
        this.f4390F.run();
    }

    public final boolean q(View view, Rect rect, boolean z4, boolean z5, boolean z6, boolean z7) {
        boolean z8;
        int i4;
        int i5;
        int i6;
        int i7;
        e eVar = (e) view.getLayoutParams();
        if (!z4 || eVar.leftMargin == (i7 = rect.left)) {
            z8 = false;
        } else {
            eVar.leftMargin = i7;
            z8 = true;
        }
        if (z5 && eVar.topMargin != (i6 = rect.top)) {
            eVar.topMargin = i6;
            z8 = true;
        }
        if (z7 && eVar.rightMargin != (i5 = rect.right)) {
            eVar.rightMargin = i5;
            z8 = true;
        }
        if (!z6 || eVar.bottomMargin == (i4 = rect.bottom)) {
            return z8;
        }
        eVar.bottomMargin = i4;
        return true;
    }

    /* renamed from: r */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    /* renamed from: s */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i4) {
        u();
        this.f4395f.setTranslationY((float) (-Math.max(0, Math.min(i4, this.f4395f.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f4385A = dVar;
        if (getWindowToken() != null) {
            this.f4385A.c(this.f4393d);
            int i4 = this.f4404o;
            if (i4 != 0) {
                onWindowSystemUiVisibilityChanged(i4);
                C.d0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f4400k = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f4401l) {
            this.f4401l = z4;
            if (!z4) {
                u();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i4) {
        z();
        this.f4396g.setIcon(i4);
    }

    public void setLogo(int i4) {
        z();
        this.f4396g.q(i4);
    }

    public void setOverlayMode(boolean z4) {
        this.f4399j = z4;
        this.f4398i = z4 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i4) {
    }

    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f4396g.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f4396g.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final C0830E t(View view) {
        if (view instanceof C0830E) {
            return (C0830E) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void u() {
        removeCallbacks(this.f4389E);
        removeCallbacks(this.f4390F);
        ViewPropertyAnimator viewPropertyAnimator = this.f4387C;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4384H);
        boolean z4 = false;
        this.f4392c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f4397h = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z4 = true;
        }
        this.f4398i = z4;
        this.f4386B = new OverScroller(context);
    }

    public boolean w() {
        return this.f4399j;
    }

    public final void x() {
        u();
        postDelayed(this.f4390F, 600);
    }

    public final void y() {
        u();
        postDelayed(this.f4389E, 600);
    }

    public void z() {
        if (this.f4394e == null) {
            this.f4394e = (ContentFrameLayout) findViewById(f.f9270b);
            this.f4395f = (ActionBarContainer) findViewById(f.f9271c);
            this.f4396g = t(findViewById(f.f9269a));
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f4396g.setIcon(drawable);
    }
}
