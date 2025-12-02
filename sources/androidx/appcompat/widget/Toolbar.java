package androidx.appcompat.widget;

import S.C;
import S.C0317h;
import S.C0320k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import h.C0645a;
import h.j;
import i.C0674a;
import j.C0754a;
import java.util.ArrayList;
import java.util.List;
import p.C0830E;
import p.C0845l;
import p.C0847n;
import p.C0857y;
import p.X;
import p.f0;
import p.i0;

public class Toolbar extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f4566A;

    /* renamed from: B  reason: collision with root package name */
    public ColorStateList f4567B;

    /* renamed from: C  reason: collision with root package name */
    public ColorStateList f4568C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f4569D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f4570E;

    /* renamed from: F  reason: collision with root package name */
    public final ArrayList f4571F;

    /* renamed from: G  reason: collision with root package name */
    public final ArrayList f4572G;

    /* renamed from: H  reason: collision with root package name */
    public final int[] f4573H;

    /* renamed from: I  reason: collision with root package name */
    public final ActionMenuView.e f4574I;

    /* renamed from: J  reason: collision with root package name */
    public d f4575J;

    /* renamed from: K  reason: collision with root package name */
    public a f4576K;

    /* renamed from: L  reason: collision with root package name */
    public d f4577L;

    /* renamed from: M  reason: collision with root package name */
    public i.a f4578M;

    /* renamed from: N  reason: collision with root package name */
    public e.a f4579N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f4580O;

    /* renamed from: P  reason: collision with root package name */
    public final Runnable f4581P;

    /* renamed from: c  reason: collision with root package name */
    public ActionMenuView f4582c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f4583d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f4584e;

    /* renamed from: f  reason: collision with root package name */
    public ImageButton f4585f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f4586g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f4587h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f4588i;

    /* renamed from: j  reason: collision with root package name */
    public ImageButton f4589j;

    /* renamed from: k  reason: collision with root package name */
    public View f4590k;

    /* renamed from: l  reason: collision with root package name */
    public Context f4591l;

    /* renamed from: m  reason: collision with root package name */
    public int f4592m;

    /* renamed from: n  reason: collision with root package name */
    public int f4593n;

    /* renamed from: o  reason: collision with root package name */
    public int f4594o;

    /* renamed from: p  reason: collision with root package name */
    public int f4595p;

    /* renamed from: q  reason: collision with root package name */
    public int f4596q;

    /* renamed from: r  reason: collision with root package name */
    public int f4597r;

    /* renamed from: s  reason: collision with root package name */
    public int f4598s;

    /* renamed from: t  reason: collision with root package name */
    public int f4599t;

    /* renamed from: u  reason: collision with root package name */
    public int f4600u;

    /* renamed from: v  reason: collision with root package name */
    public X f4601v;

    /* renamed from: w  reason: collision with root package name */
    public int f4602w;

    /* renamed from: x  reason: collision with root package name */
    public int f4603x;

    /* renamed from: y  reason: collision with root package name */
    public int f4604y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f4605z;

    public class a implements ActionMenuView.e {
        public a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            Toolbar.this.getClass();
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.N();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    public class d implements i {

        /* renamed from: c  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f4609c;

        /* renamed from: d  reason: collision with root package name */
        public androidx.appcompat.view.menu.g f4610d;

        public d() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z4) {
        }

        public void d(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f4609c;
            if (!(eVar2 == null || (gVar = this.f4610d) == null)) {
                eVar2.f(gVar);
            }
            this.f4609c = eVar;
        }

        public boolean e(l lVar) {
            return false;
        }

        public void f(boolean z4) {
            if (this.f4610d != null) {
                androidx.appcompat.view.menu.e eVar = this.f4609c;
                if (eVar != null) {
                    int size = eVar.size();
                    int i4 = 0;
                    while (i4 < size) {
                        if (this.f4609c.getItem(i4) != this.f4610d) {
                            i4++;
                        } else {
                            return;
                        }
                    }
                }
                i(this.f4609c, this.f4610d);
            }
        }

        public boolean h() {
            return false;
        }

        public boolean i(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.f4590k;
            if (view instanceof n.c) {
                ((n.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f4590k);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f4589j);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f4590k = null;
            toolbar3.a();
            this.f4610d = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        public boolean j(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.f4589j.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f4589j);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f4589j);
            }
            Toolbar.this.f4590k = gVar.getActionView();
            this.f4610d = gVar;
            ViewParent parent2 = Toolbar.this.f4590k.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f4590k);
                }
                e m4 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                m4.f9640a = (toolbar4.f4595p & 112) | 8388611;
                m4.f4612b = 2;
                toolbar4.f4590k.setLayoutParams(m4);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f4590k);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            gVar.r(true);
            View view = Toolbar.this.f4590k;
            if (view instanceof n.c) {
                ((n.c) view).c();
            }
            return true;
        }
    }

    public interface f {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9166K);
    }

    private MenuInflater getMenuInflater() {
        return new n.g(getContext());
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f4582c;
        return actionMenuView != null && actionMenuView.J();
    }

    public final int B(View view, int i4, int[] iArr, int i5) {
        e eVar = (e) view.getLayoutParams();
        int i6 = eVar.leftMargin - iArr[0];
        int max = i4 + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        int q4 = q(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, q4, max + measuredWidth, view.getMeasuredHeight() + q4);
        return max + measuredWidth + eVar.rightMargin;
    }

    public final int C(View view, int i4, int[] iArr, int i5) {
        e eVar = (e) view.getLayoutParams();
        int i6 = eVar.rightMargin - iArr[1];
        int max = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int q4 = q(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, q4, max, view.getMeasuredHeight() + q4);
        return max - (measuredWidth + eVar.leftMargin);
    }

    public final int D(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i8) + Math.max(0, i9);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + max + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void E(View view, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i8 >= 0) {
            if (mode != 0) {
                i8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void F() {
        removeCallbacks(this.f4581P);
        post(this.f4581P);
    }

    public void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((e) childAt.getLayoutParams()).f4612b == 2 || childAt == this.f4582c)) {
                removeViewAt(childCount);
                this.f4572G.add(childAt);
            }
        }
    }

    public void H(int i4, int i5) {
        h();
        this.f4601v.g(i4, i5);
    }

    public void I(androidx.appcompat.view.menu.e eVar, a aVar) {
        if (eVar != null || this.f4582c != null) {
            k();
            androidx.appcompat.view.menu.e N4 = this.f4582c.N();
            if (N4 != eVar) {
                if (N4 != null) {
                    N4.O(this.f4576K);
                    N4.O(this.f4577L);
                }
                if (this.f4577L == null) {
                    this.f4577L = new d();
                }
                aVar.G(true);
                if (eVar != null) {
                    eVar.c(aVar, this.f4591l);
                    eVar.c(this.f4577L, this.f4591l);
                } else {
                    aVar.d(this.f4591l, (androidx.appcompat.view.menu.e) null);
                    this.f4577L.d(this.f4591l, (androidx.appcompat.view.menu.e) null);
                    aVar.f(true);
                    this.f4577L.f(true);
                }
                this.f4582c.setPopupTheme(this.f4592m);
                this.f4582c.setPresenter(aVar);
                this.f4576K = aVar;
            }
        }
    }

    public void J(Context context, int i4) {
        this.f4594o = i4;
        TextView textView = this.f4584e;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public void K(Context context, int i4) {
        this.f4593n = i4;
        TextView textView = this.f4583d;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public final boolean L() {
        if (!this.f4580O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean N() {
        ActionMenuView actionMenuView = this.f4582c;
        return actionMenuView != null && actionMenuView.P();
    }

    public void a() {
        for (int size = this.f4572G.size() - 1; size >= 0; size--) {
            addView((View) this.f4572G.get(size));
        }
        this.f4572G.clear();
    }

    public final void b(List list, int i4) {
        boolean z4 = C.x(this) == 1;
        int childCount = getChildCount();
        int b4 = C0317h.b(i4, C.x(this));
        list.clear();
        if (z4) {
            for (int i5 = childCount - 1; i5 >= 0; i5--) {
                View childAt = getChildAt(i5);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f4612b == 0 && M(childAt) && p(eVar.f9640a) == b4) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f4612b == 0 && M(childAt2) && p(eVar2.f9640a) == b4) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e m4 = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        m4.f4612b = 1;
        if (!z4 || this.f4590k == null) {
            addView(view, m4);
            return;
        }
        view.setLayoutParams(m4);
        this.f4572G.add(view);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f4582c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r1.f4582c
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.K()
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.d():boolean");
    }

    public void e() {
        d dVar = this.f4577L;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f4610d;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f4582c;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    public void g() {
        if (this.f4589j == null) {
            C0845l lVar = new C0845l(getContext(), (AttributeSet) null, C0645a.f9165J);
            this.f4589j = lVar;
            lVar.setImageDrawable(this.f4587h);
            this.f4589j.setContentDescription(this.f4588i);
            e m4 = generateDefaultLayoutParams();
            m4.f9640a = (this.f4595p & 112) | 8388611;
            m4.f4612b = 2;
            this.f4589j.setLayoutParams(m4);
            this.f4589j.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f4589j;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f4589j;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        X x4 = this.f4601v;
        if (x4 != null) {
            return x4.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.f4603x;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        X x4 = this.f4601v;
        if (x4 != null) {
            return x4.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        X x4 = this.f4601v;
        if (x4 != null) {
            return x4.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        X x4 = this.f4601v;
        if (x4 != null) {
            return x4.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f4602w;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.N();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f4582c
            if (r0 == 0) goto L_0x0020
            androidx.appcompat.view.menu.e r0 = r0.N()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0020
            int r0 = r3.getContentInsetEnd()
            int r1 = r3.f4603x
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0024
        L_0x0020:
            int r0 = r3.getContentInsetEnd()
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        return C.x(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return C.x(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f4602w, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f4586g;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f4586g;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f4582c.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f4585f;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f4585f;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public a getOuterActionMenuPresenter() {
        return this.f4576K;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f4582c.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4591l;
    }

    public int getPopupTheme() {
        return this.f4592m;
    }

    public CharSequence getSubtitle() {
        return this.f4566A;
    }

    public final TextView getSubtitleTextView() {
        return this.f4584e;
    }

    public CharSequence getTitle() {
        return this.f4605z;
    }

    public int getTitleMarginBottom() {
        return this.f4600u;
    }

    public int getTitleMarginEnd() {
        return this.f4598s;
    }

    public int getTitleMarginStart() {
        return this.f4597r;
    }

    public int getTitleMarginTop() {
        return this.f4599t;
    }

    public final TextView getTitleTextView() {
        return this.f4583d;
    }

    public C0830E getWrapper() {
        if (this.f4575J == null) {
            this.f4575J = new d(this, true);
        }
        return this.f4575J;
    }

    public final void h() {
        if (this.f4601v == null) {
            this.f4601v = new X();
        }
    }

    public final void i() {
        if (this.f4586g == null) {
            this.f4586g = new C0847n(getContext());
        }
    }

    public final void j() {
        k();
        if (this.f4582c.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f4582c.getMenu();
            if (this.f4577L == null) {
                this.f4577L = new d();
            }
            this.f4582c.setExpandedActionViewsExclusive(true);
            eVar.c(this.f4577L, this.f4591l);
        }
    }

    public final void k() {
        if (this.f4582c == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f4582c = actionMenuView;
            actionMenuView.setPopupTheme(this.f4592m);
            this.f4582c.setOnMenuItemClickListener(this.f4574I);
            this.f4582c.O(this.f4578M, this.f4579N);
            e m4 = generateDefaultLayoutParams();
            m4.f9640a = (this.f4595p & 112) | 8388613;
            this.f4582c.setLayoutParams(m4);
            c(this.f4582c, false);
        }
    }

    public final void l() {
        if (this.f4585f == null) {
            this.f4585f = new C0845l(getContext(), (AttributeSet) null, C0645a.f9165J);
            e m4 = generateDefaultLayoutParams();
            m4.f9640a = (this.f4595p & 112) | 8388611;
            this.f4585f.setLayoutParams(m4);
        }
    }

    /* renamed from: m */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: n */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* renamed from: o */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof C0674a.C0165a ? new e((C0674a.C0165a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4581P);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4570E = false;
        }
        if (!this.f4570E) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4570E = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4570E = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02a1 A[LOOP:0: B:103:0x029f->B:104:0x02a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02c3 A[LOOP:1: B:106:0x02c1->B:107:0x02c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fc A[LOOP:2: B:114:0x02fa->B:115:0x02fc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0227  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = S.C.x(r19)
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = r3
            goto L_0x000d
        L_0x000c:
            r1 = r2
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f4573H
            r11[r3] = r2
            r11[r2] = r2
            int r12 = S.C.y(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = r2
        L_0x003b:
            android.widget.ImageButton r13 = r0.f4585f
            boolean r13 = r0.M(r13)
            if (r13 == 0) goto L_0x0056
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f4585f
            int r13 = r0.C(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0058
        L_0x004e:
            android.widget.ImageButton r13 = r0.f4585f
            int r13 = r0.B(r13, r6, r11, r12)
        L_0x0054:
            r14 = r10
            goto L_0x0058
        L_0x0056:
            r13 = r6
            goto L_0x0054
        L_0x0058:
            android.widget.ImageButton r15 = r0.f4589j
            boolean r15 = r0.M(r15)
            if (r15 == 0) goto L_0x006f
            if (r1 == 0) goto L_0x0069
            android.widget.ImageButton r15 = r0.f4589j
            int r14 = r0.C(r15, r14, r11, r12)
            goto L_0x006f
        L_0x0069:
            android.widget.ImageButton r15 = r0.f4589j
            int r13 = r0.B(r15, r13, r11, r12)
        L_0x006f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f4582c
            boolean r15 = r0.M(r15)
            if (r15 == 0) goto L_0x0086
            if (r1 == 0) goto L_0x0080
            androidx.appcompat.widget.ActionMenuView r15 = r0.f4582c
            int r13 = r0.B(r15, r13, r11, r12)
            goto L_0x0086
        L_0x0080:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f4582c
            int r14 = r0.C(r15, r14, r11, r12)
        L_0x0086:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f4590k
            boolean r13 = r0.M(r13)
            if (r13 == 0) goto L_0x00c3
            if (r1 == 0) goto L_0x00bd
            android.view.View r13 = r0.f4590k
            int r10 = r0.C(r13, r10, r11, r12)
            goto L_0x00c3
        L_0x00bd:
            android.view.View r13 = r0.f4590k
            int r3 = r0.B(r13, r3, r11, r12)
        L_0x00c3:
            android.widget.ImageView r13 = r0.f4586g
            boolean r13 = r0.M(r13)
            if (r13 == 0) goto L_0x00da
            if (r1 == 0) goto L_0x00d4
            android.widget.ImageView r13 = r0.f4586g
            int r10 = r0.C(r13, r10, r11, r12)
            goto L_0x00da
        L_0x00d4:
            android.widget.ImageView r13 = r0.f4586g
            int r3 = r0.B(r13, r3, r11, r12)
        L_0x00da:
            android.widget.TextView r13 = r0.f4583d
            boolean r13 = r0.M(r13)
            android.widget.TextView r14 = r0.f4584e
            boolean r14 = r0.M(r14)
            if (r13 == 0) goto L_0x00ff
            android.widget.TextView r15 = r0.f4583d
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r2 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f4583d
            int r7 = r7.getMeasuredHeight()
            int r2 = r2 + r7
            int r7 = r15.bottomMargin
            int r2 = r2 + r7
            goto L_0x0102
        L_0x00ff:
            r23 = r7
            r2 = 0
        L_0x0102:
            if (r14 == 0) goto L_0x011c
            android.widget.TextView r7 = r0.f4584e
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f4584e
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r2 = r2 + r15
            goto L_0x011e
        L_0x011c:
            r16 = r4
        L_0x011e:
            if (r13 != 0) goto L_0x012a
            if (r14 == 0) goto L_0x0123
            goto L_0x012a
        L_0x0123:
            r18 = r6
            r22 = r12
        L_0x0127:
            r2 = 0
            goto L_0x0291
        L_0x012a:
            if (r13 == 0) goto L_0x012f
            android.widget.TextView r4 = r0.f4583d
            goto L_0x0131
        L_0x012f:
            android.widget.TextView r4 = r0.f4584e
        L_0x0131:
            if (r14 == 0) goto L_0x0136
            android.widget.TextView r7 = r0.f4584e
            goto L_0x0138
        L_0x0136:
            android.widget.TextView r7 = r0.f4583d
        L_0x0138:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r7 = (androidx.appcompat.widget.Toolbar.e) r7
            if (r13 == 0) goto L_0x014e
            android.widget.TextView r15 = r0.f4583d
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0158
        L_0x014e:
            if (r14 == 0) goto L_0x015b
            android.widget.TextView r15 = r0.f4584e
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015b
        L_0x0158:
            r17 = 1
            goto L_0x015d
        L_0x015b:
            r17 = 0
        L_0x015d:
            int r15 = r0.f4604y
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a5
            r6 = 80
            if (r15 == r6) goto L_0x0197
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r15 = r4.topMargin
            r22 = r12
            int r12 = r0.f4599t
            r24 = r3
            int r3 = r15 + r12
            if (r6 >= r3) goto L_0x0180
            int r6 = r15 + r12
            goto L_0x0195
        L_0x0180:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f4600u
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0195
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0195:
            int r8 = r8 + r6
            goto L_0x01b4
        L_0x0197:
            r24 = r3
            r22 = r12
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.f4600u
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L_0x01b4
        L_0x01a5:
            r24 = r3
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f4599t
            int r8 = r2 + r3
        L_0x01b4:
            if (r1 == 0) goto L_0x0227
            if (r17 == 0) goto L_0x01bc
            int r1 = r0.f4597r
        L_0x01ba:
            r2 = 1
            goto L_0x01be
        L_0x01bc:
            r1 = 0
            goto L_0x01ba
        L_0x01be:
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f4583d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f4583d
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f4583d
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f4583d
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f4598s
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f5
        L_0x01f4:
            r2 = r10
        L_0x01f5:
            if (r14 == 0) goto L_0x021b
            android.widget.TextView r1 = r0.f4584e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f4584e
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f4584e
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f4584e
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f4598s
            int r1 = r10 - r1
            goto L_0x021c
        L_0x021b:
            r1 = r10
        L_0x021c:
            if (r17 == 0) goto L_0x0223
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0223:
            r3 = r24
            goto L_0x0127
        L_0x0227:
            if (r17 == 0) goto L_0x022e
            int r2 = r0.f4597r
            r1 = r2
        L_0x022c:
            r2 = 0
            goto L_0x0230
        L_0x022e:
            r1 = 0
            goto L_0x022c
        L_0x0230:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r24 + r3
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0265
            android.widget.TextView r1 = r0.f4583d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r4 = r0.f4583d
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r3
            android.widget.TextView r5 = r0.f4583d
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f4583d
            r6.layout(r3, r8, r4, r5)
            int r6 = r0.f4598s
            int r4 = r4 + r6
            int r1 = r1.bottomMargin
            int r8 = r5 + r1
            goto L_0x0266
        L_0x0265:
            r4 = r3
        L_0x0266:
            if (r14 == 0) goto L_0x028a
            android.widget.TextView r1 = r0.f4584e
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f4584e
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r5 = r0.f4584e
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f4584e
            r6.layout(r3, r8, r1, r5)
            int r5 = r0.f4598s
            int r1 = r1 + r5
            goto L_0x028b
        L_0x028a:
            r1 = r3
        L_0x028b:
            if (r17 == 0) goto L_0x0291
            int r3 = java.lang.Math.max(r4, r1)
        L_0x0291:
            java.util.ArrayList r1 = r0.f4571F
            r4 = 3
            r0.b(r1, r4)
            java.util.ArrayList r1 = r0.f4571F
            int r1 = r1.size()
            r4 = r3
            r3 = r2
        L_0x029f:
            if (r3 >= r1) goto L_0x02b2
            java.util.ArrayList r5 = r0.f4571F
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            r12 = r22
            int r4 = r0.B(r5, r4, r11, r12)
            int r3 = r3 + 1
            goto L_0x029f
        L_0x02b2:
            r12 = r22
            java.util.ArrayList r1 = r0.f4571F
            r3 = 5
            r0.b(r1, r3)
            java.util.ArrayList r1 = r0.f4571F
            int r1 = r1.size()
            r3 = r2
        L_0x02c1:
            if (r3 >= r1) goto L_0x02d2
            java.util.ArrayList r5 = r0.f4571F
            java.lang.Object r5 = r5.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r10 = r0.C(r5, r10, r11, r12)
            int r3 = r3 + 1
            goto L_0x02c1
        L_0x02d2:
            java.util.ArrayList r1 = r0.f4571F
            r3 = 1
            r0.b(r1, r3)
            java.util.ArrayList r1 = r0.f4571F
            int r1 = r0.u(r1, r11)
            int r3 = r16 - r18
            int r3 = r3 - r23
            int r3 = r3 / 2
            int r6 = r18 + r3
            int r3 = r1 / 2
            int r6 = r6 - r3
            int r1 = r1 + r6
            if (r6 >= r4) goto L_0x02ed
            goto L_0x02f4
        L_0x02ed:
            if (r1 <= r10) goto L_0x02f3
            int r1 = r1 - r10
            int r4 = r6 - r1
            goto L_0x02f4
        L_0x02f3:
            r4 = r6
        L_0x02f4:
            java.util.ArrayList r1 = r0.f4571F
            int r1 = r1.size()
        L_0x02fa:
            if (r2 >= r1) goto L_0x030b
            java.util.ArrayList r3 = r0.f4571F
            java.lang.Object r3 = r3.get(r2)
            android.view.View r3 = (android.view.View) r3
            int r4 = r0.B(r3, r4, r11, r12)
            int r2 = r2 + 1
            goto L_0x02fa
        L_0x030b:
            java.util.ArrayList r1 = r0.f4571F
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr = this.f4573H;
        char b4 = i0.b(this);
        int i13 = 0;
        char c4 = b4 ^ 1;
        if (M(this.f4585f)) {
            E(this.f4585f, i4, 0, i5, 0, this.f4596q);
            i8 = this.f4585f.getMeasuredWidth() + s(this.f4585f);
            i7 = Math.max(0, this.f4585f.getMeasuredHeight() + t(this.f4585f));
            i6 = View.combineMeasuredStates(0, this.f4585f.getMeasuredState());
        } else {
            i8 = 0;
            i7 = 0;
            i6 = 0;
        }
        if (M(this.f4589j)) {
            E(this.f4589j, i4, 0, i5, 0, this.f4596q);
            i8 = this.f4589j.getMeasuredWidth() + s(this.f4589j);
            i7 = Math.max(i7, this.f4589j.getMeasuredHeight() + t(this.f4589j));
            i6 = View.combineMeasuredStates(i6, this.f4589j.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i8);
        iArr[b4] = Math.max(0, currentContentInsetStart - i8);
        if (M(this.f4582c)) {
            E(this.f4582c, i4, max, i5, 0, this.f4596q);
            i9 = this.f4582c.getMeasuredWidth() + s(this.f4582c);
            i7 = Math.max(i7, this.f4582c.getMeasuredHeight() + t(this.f4582c));
            i6 = View.combineMeasuredStates(i6, this.f4582c.getMeasuredState());
        } else {
            i9 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i9);
        iArr[c4] = Math.max(0, currentContentInsetEnd - i9);
        if (M(this.f4590k)) {
            max2 += D(this.f4590k, i4, max2, i5, 0, iArr);
            i7 = Math.max(i7, this.f4590k.getMeasuredHeight() + t(this.f4590k));
            i6 = View.combineMeasuredStates(i6, this.f4590k.getMeasuredState());
        }
        if (M(this.f4586g)) {
            max2 += D(this.f4586g, i4, max2, i5, 0, iArr);
            i7 = Math.max(i7, this.f4586g.getMeasuredHeight() + t(this.f4586g));
            i6 = View.combineMeasuredStates(i6, this.f4586g.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (((e) childAt.getLayoutParams()).f4612b == 0 && M(childAt)) {
                max2 += D(childAt, i4, max2, i5, 0, iArr);
                i7 = Math.max(i7, childAt.getMeasuredHeight() + t(childAt));
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i15 = this.f4599t + this.f4600u;
        int i16 = this.f4597r + this.f4598s;
        if (M(this.f4583d)) {
            D(this.f4583d, i4, max2 + i16, i5, i15, iArr);
            int measuredWidth = this.f4583d.getMeasuredWidth() + s(this.f4583d);
            i10 = this.f4583d.getMeasuredHeight() + t(this.f4583d);
            i12 = View.combineMeasuredStates(i6, this.f4583d.getMeasuredState());
            i11 = measuredWidth;
        } else {
            i10 = 0;
            i12 = i6;
            i11 = 0;
        }
        if (M(this.f4584e)) {
            i11 = Math.max(i11, D(this.f4584e, i4, max2 + i16, i5, i10 + i15, iArr));
            i10 += this.f4584e.getMeasuredHeight() + t(this.f4584e);
            i12 = View.combineMeasuredStates(i12, this.f4584e.getMeasuredState());
        } else {
            int i17 = i12;
        }
        int max3 = Math.max(i7, i10);
        int paddingLeft = max2 + i11 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i4, -16777216 & i12);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i5, i12 << 16);
        if (!L()) {
            i13 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i13);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f4582c;
        androidx.appcompat.view.menu.e N4 = actionMenuView != null ? actionMenuView.N() : null;
        int i4 = gVar.f4613g;
        if (!(i4 == 0 || this.f4577L == null || N4 == null || (findItem = N4.findItem(i4)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f4614h) {
            F();
        }
    }

    public void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        h();
        X x4 = this.f4601v;
        boolean z4 = true;
        if (i4 != 1) {
            z4 = false;
        }
        x4.f(z4);
    }

    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.f4577L;
        if (!(dVar == null || (gVar = dVar.f4610d) == null)) {
            gVar2.f4613g = gVar.getItemId();
        }
        gVar2.f4614h = A();
        return gVar2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4569D = false;
        }
        if (!this.f4569D) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4569D = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4569D = false;
        }
        return true;
    }

    public final int p(int i4) {
        int x4 = C.x(this);
        int b4 = C0317h.b(i4, x4) & 7;
        return (b4 == 1 || b4 == 3 || b4 == 5) ? b4 : x4 == 1 ? 5 : 3;
    }

    public final int q(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int r4 = r(eVar.f9640a);
        if (r4 == 48) {
            return getPaddingTop() - i5;
        }
        if (r4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i6 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i7 = eVar.topMargin;
        if (i6 < i7) {
            i6 = i7;
        } else {
            int i8 = (((height - paddingBottom) - measuredHeight) - i6) - paddingTop;
            int i9 = eVar.bottomMargin;
            if (i8 < i9) {
                i6 = Math.max(0, i6 - (i9 - i8));
            }
        }
        return paddingTop + i6;
    }

    public final int r(int i4) {
        int i5 = i4 & 112;
        return (i5 == 16 || i5 == 48 || i5 == 80) ? i5 : this.f4604y & 112;
    }

    public final int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C0320k.b(marginLayoutParams) + C0320k.a(marginLayoutParams);
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(C0754a.b(getContext(), i4));
    }

    public void setCollapsible(boolean z4) {
        this.f4580O = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f4603x) {
            this.f4603x = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f4602w) {
            this.f4602w = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i4) {
        setLogo(C0754a.b(getContext(), i4));
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(C0754a.b(getContext(), i4));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f4585f.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f4582c.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.f4592m != i4) {
            this.f4592m = i4;
            if (i4 == 0) {
                this.f4591l = getContext();
            } else {
                this.f4591l = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f4600u = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f4598s = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f4597r = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f4599t = i4;
        requestLayout();
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    public final int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int u(List list, int[] iArr) {
        int i4 = iArr[0];
        int i5 = iArr[1];
        int size = list.size();
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            View view = (View) list.get(i6);
            e eVar = (e) view.getLayoutParams();
            int i8 = eVar.leftMargin - i4;
            int i9 = eVar.rightMargin - i5;
            int max = Math.max(0, i8);
            int max2 = Math.max(0, i9);
            int max3 = Math.max(0, -i8);
            int max4 = Math.max(0, -i9);
            i7 += max + view.getMeasuredWidth() + max2;
            i6++;
            i5 = max4;
            i4 = max3;
        }
        return i7;
    }

    public boolean v() {
        d dVar = this.f4577L;
        return (dVar == null || dVar.f4610d == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f4582c;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i4) {
        getMenuInflater().inflate(i4, getMenu());
    }

    public final boolean y(View view) {
        return view.getParent() == this || this.f4572G.contains(view);
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f4582c;
        return actionMenuView != null && actionMenuView.I();
    }

    public static class e extends C0674a.C0165a {

        /* renamed from: b  reason: collision with root package name */
        public int f4612b = 0;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i4, int i5) {
            super(i4, i5);
            this.f9640a = 8388627;
        }

        public e(e eVar) {
            super((C0674a.C0165a) eVar);
            this.f4612b = eVar.f4612b;
        }

        public e(C0674a.C0165a aVar) {
            super(aVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4604y = 8388627;
        this.f4571F = new ArrayList();
        this.f4572G = new ArrayList();
        this.f4573H = new int[2];
        this.f4574I = new a();
        this.f4581P = new b();
        f0 v4 = f0.v(getContext(), attributeSet, j.f9494i3, i4, 0);
        C.e0(this, context, j.f9494i3, attributeSet, v4.r(), i4, 0);
        this.f4593n = v4.n(j.f9383K3, 0);
        this.f4594o = v4.n(j.f9338B3, 0);
        this.f4604y = v4.l(j.f9499j3, this.f4604y);
        this.f4595p = v4.l(j.f9504k3, 48);
        int e4 = v4.e(j.f9353E3, 0);
        e4 = v4.s(j.f9378J3) ? v4.e(j.f9378J3, e4) : e4;
        this.f4600u = e4;
        this.f4599t = e4;
        this.f4598s = e4;
        this.f4597r = e4;
        int e5 = v4.e(j.f9368H3, -1);
        if (e5 >= 0) {
            this.f4597r = e5;
        }
        int e6 = v4.e(j.f9363G3, -1);
        if (e6 >= 0) {
            this.f4598s = e6;
        }
        int e7 = v4.e(j.f9373I3, -1);
        if (e7 >= 0) {
            this.f4599t = e7;
        }
        int e8 = v4.e(j.f9358F3, -1);
        if (e8 >= 0) {
            this.f4600u = e8;
        }
        this.f4596q = v4.f(j.f9559v3, -1);
        int e9 = v4.e(j.f9539r3, Integer.MIN_VALUE);
        int e10 = v4.e(j.f9519n3, Integer.MIN_VALUE);
        int f4 = v4.f(j.f9529p3, 0);
        int f5 = v4.f(j.f9534q3, 0);
        h();
        this.f4601v.e(f4, f5);
        if (!(e9 == Integer.MIN_VALUE && e10 == Integer.MIN_VALUE)) {
            this.f4601v.g(e9, e10);
        }
        this.f4602w = v4.e(j.f9544s3, Integer.MIN_VALUE);
        this.f4603x = v4.e(j.f9524o3, Integer.MIN_VALUE);
        this.f4587h = v4.g(j.f9514m3);
        this.f4588i = v4.p(j.f9509l3);
        CharSequence p4 = v4.p(j.f9348D3);
        if (!TextUtils.isEmpty(p4)) {
            setTitle(p4);
        }
        CharSequence p5 = v4.p(j.f9333A3);
        if (!TextUtils.isEmpty(p5)) {
            setSubtitle(p5);
        }
        this.f4591l = getContext();
        setPopupTheme(v4.n(j.f9579z3, 0));
        Drawable g4 = v4.g(j.f9574y3);
        if (g4 != null) {
            setNavigationIcon(g4);
        }
        CharSequence p6 = v4.p(j.f9569x3);
        if (!TextUtils.isEmpty(p6)) {
            setNavigationContentDescription(p6);
        }
        Drawable g5 = v4.g(j.f9549t3);
        if (g5 != null) {
            setLogo(g5);
        }
        CharSequence p7 = v4.p(j.f9554u3);
        if (!TextUtils.isEmpty(p7)) {
            setLogoDescription(p7);
        }
        if (v4.s(j.f9388L3)) {
            setTitleTextColor(v4.c(j.f9388L3));
        }
        if (v4.s(j.f9343C3)) {
            setSubtitleTextColor(v4.c(j.f9343C3));
        }
        if (v4.s(j.f9564w3)) {
            x(v4.n(j.f9564w3, 0));
        }
        v4.w();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f4589j;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.f4589j.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f4589j;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f4587h);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f4586g)) {
                c(this.f4586g, true);
            }
        } else {
            ImageView imageView = this.f4586g;
            if (imageView != null && y(imageView)) {
                removeView(this.f4586g);
                this.f4572G.remove(this.f4586g);
            }
        }
        ImageView imageView2 = this.f4586g;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f4586g;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f4585f;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f4585f)) {
                c(this.f4585f, true);
            }
        } else {
            ImageButton imageButton = this.f4585f;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f4585f);
                this.f4572G.remove(this.f4585f);
            }
        }
        ImageButton imageButton2 = this.f4585f;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f4584e == null) {
                Context context = getContext();
                C0857y yVar = new C0857y(context);
                this.f4584e = yVar;
                yVar.setSingleLine();
                this.f4584e.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f4594o;
                if (i4 != 0) {
                    this.f4584e.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f4568C;
                if (colorStateList != null) {
                    this.f4584e.setTextColor(colorStateList);
                }
            }
            if (!y(this.f4584e)) {
                c(this.f4584e, true);
            }
        } else {
            TextView textView = this.f4584e;
            if (textView != null && y(textView)) {
                removeView(this.f4584e);
                this.f4572G.remove(this.f4584e);
            }
        }
        TextView textView2 = this.f4584e;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f4566A = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4568C = colorStateList;
        TextView textView = this.f4584e;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f4583d == null) {
                Context context = getContext();
                C0857y yVar = new C0857y(context);
                this.f4583d = yVar;
                yVar.setSingleLine();
                this.f4583d.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f4593n;
                if (i4 != 0) {
                    this.f4583d.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f4567B;
                if (colorStateList != null) {
                    this.f4583d.setTextColor(colorStateList);
                }
            }
            if (!y(this.f4583d)) {
                c(this.f4583d, true);
            }
        } else {
            TextView textView = this.f4583d;
            if (textView != null && y(textView)) {
                removeView(this.f4583d);
                this.f4572G.remove(this.f4583d);
            }
        }
        TextView textView2 = this.f4583d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f4605z = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f4567B = colorStateList;
        TextView textView = this.f4583d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class g extends Z.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public int f4613g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f4614h;

        public class a implements Parcelable.ClassLoaderCreator {
            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i4) {
                return new g[i4];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4613g = parcel.readInt();
            this.f4614h = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f4613g);
            parcel.writeInt(this.f4614h ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
