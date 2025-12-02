package androidx.core.widget;

import S.C;
import S.C0310a;
import S.C0314e;
import S.C0315f;
import S.C0325p;
import S.C0326q;
import S.C0328t;
import S.C0329u;
import S.r;
import T.m;
import T.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import net.sqlcipher.database.SQLiteDatabase;

public class NestedScrollView extends FrameLayout implements C0328t, C0326q {

    /* renamed from: F  reason: collision with root package name */
    public static final float f4981F = ((float) (Math.log(0.78d) / Math.log(0.9d)));

    /* renamed from: G  reason: collision with root package name */
    public static final a f4982G = new a();

    /* renamed from: H  reason: collision with root package name */
    public static final int[] f4983H = {16843130};

    /* renamed from: A  reason: collision with root package name */
    public final r f4984A;

    /* renamed from: B  reason: collision with root package name */
    public float f4985B;

    /* renamed from: C  reason: collision with root package name */
    public d f4986C;

    /* renamed from: D  reason: collision with root package name */
    public final c f4987D;

    /* renamed from: E  reason: collision with root package name */
    public C0314e f4988E;

    /* renamed from: c  reason: collision with root package name */
    public final float f4989c;

    /* renamed from: d  reason: collision with root package name */
    public long f4990d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f4991e;

    /* renamed from: f  reason: collision with root package name */
    public OverScroller f4992f;

    /* renamed from: g  reason: collision with root package name */
    public EdgeEffect f4993g;

    /* renamed from: h  reason: collision with root package name */
    public EdgeEffect f4994h;

    /* renamed from: i  reason: collision with root package name */
    public int f4995i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4996j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4997k;

    /* renamed from: l  reason: collision with root package name */
    public View f4998l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4999m;

    /* renamed from: n  reason: collision with root package name */
    public VelocityTracker f5000n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5001o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5002p;

    /* renamed from: q  reason: collision with root package name */
    public int f5003q;

    /* renamed from: r  reason: collision with root package name */
    public int f5004r;

    /* renamed from: s  reason: collision with root package name */
    public int f5005s;

    /* renamed from: t  reason: collision with root package name */
    public int f5006t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f5007u;

    /* renamed from: v  reason: collision with root package name */
    public final int[] f5008v;

    /* renamed from: w  reason: collision with root package name */
    public int f5009w;

    /* renamed from: x  reason: collision with root package name */
    public int f5010x;

    /* renamed from: y  reason: collision with root package name */
    public e f5011y;

    /* renamed from: z  reason: collision with root package name */
    public final C0329u f5012z;

    public static class a extends C0310a {
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            o.a(accessibilityEvent, nestedScrollView.getScrollX());
            o.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        public void g(View view, m mVar) {
            int scrollRange;
            super.g(view, mVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            mVar.c0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                mVar.u0(true);
                if (nestedScrollView.getScrollY() > 0) {
                    mVar.b(m.a.f2835r);
                    mVar.b(m.a.f2802C);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    mVar.b(m.a.f2834q);
                    mVar.b(m.a.f2804E);
                }
            }
        }

        public boolean j(View view, int i4, Bundle bundle) {
            if (super.j(view, i4, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i4 != 4096) {
                if (i4 == 8192 || i4 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, max, true);
                    return true;
                } else if (i4 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, min, true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public class c implements C0315f {
        public c() {
        }

        public boolean a(float f4) {
            if (f4 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f4);
            return true;
        }

        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        public void c() {
            NestedScrollView.this.f4992f.abortAnimation();
        }
    }

    public interface d {
        void a(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7);
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public int f5014e;

        public class a implements Parcelable.Creator {
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i4) {
                return new e[i4];
            }
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f5014e + "}";
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f5014e);
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f5014e = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, F.a.f941a);
    }

    public static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    public static int g(int i4, int i5, int i6) {
        if (i5 >= i6 || i4 < 0) {
            return 0;
        }
        return i5 + i4 > i6 ? i6 - i5 : i4;
    }

    public final void A() {
        VelocityTracker velocityTracker = this.f5000n;
        if (velocityTracker == null) {
            this.f5000n = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void B() {
        this.f4992f = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f5003q = viewConfiguration.getScaledTouchSlop();
        this.f5004r = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5005s = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void C() {
        if (this.f5000n == null) {
            this.f5000n = VelocityTracker.obtain();
        }
    }

    public final void D(int i4, int i5) {
        this.f4995i = i4;
        this.f5006t = i5;
        X(2, 0);
    }

    public final boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    public final boolean G(View view, int i4, int i5) {
        view.getDrawingRect(this.f4991e);
        offsetDescendantRectToMyCoords(view, this.f4991e);
        return this.f4991e.bottom + i4 >= getScrollY() && this.f4991e.top - i4 <= getScrollY() + i5;
    }

    public final void H(int i4, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4984A.e(0, scrollY2, 0, i4 - scrollY2, (int[]) null, i5, iArr);
    }

    public final void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5006t) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f4995i = (int) motionEvent.getY(i4);
            this.f5006t = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f5000n;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean J(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z4) {
        boolean z5;
        boolean z6;
        int overScrollMode = getOverScrollMode();
        boolean z7 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z8 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z9 = overScrollMode == 0 || (overScrollMode == 1 && z7);
        boolean z10 = overScrollMode == 0 || (overScrollMode == 1 && z8);
        int i12 = i6 + i4;
        int i13 = !z9 ? 0 : i10;
        int i14 = i7 + i5;
        int i15 = !z10 ? 0 : i11;
        int i16 = -i13;
        int i17 = i13 + i8;
        int i18 = -i15;
        int i19 = i15 + i9;
        if (i12 > i17) {
            i12 = i17;
            z5 = true;
        } else if (i12 < i16) {
            z5 = true;
            i12 = i16;
        } else {
            z5 = false;
        }
        if (i14 > i19) {
            i14 = i19;
            z6 = true;
        } else if (i14 < i18) {
            z6 = true;
            i14 = i18;
        } else {
            z6 = false;
        }
        if (z6 && !y(1)) {
            this.f4992f.springBack(i12, i14, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i12, i14, z5, z6);
        return z5 || z6;
    }

    public boolean K(int i4) {
        boolean z4 = i4 == 130;
        int height = getHeight();
        if (z4) {
            this.f4991e.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f4991e;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f4991e.top = getScrollY() - height;
            Rect rect2 = this.f4991e;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f4991e;
        int i5 = rect3.top;
        int i6 = height + i5;
        rect3.bottom = i6;
        return O(i4, i5, i6);
    }

    public final void L() {
        VelocityTracker velocityTracker = this.f5000n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5000n = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f4993g
            float r0 = X.d.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            android.widget.EdgeEffect r0 = r3.f4993g
            float r4 = -r4
            float r4 = X.d.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f4993g
            float r5 = X.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f4993g
            r5.onRelease()
        L_0x002f:
            r1 = r4
            goto L_0x0054
        L_0x0031:
            android.widget.EdgeEffect r0 = r3.f4994h
            float r0 = X.d.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0054
            android.widget.EdgeEffect r0 = r3.f4994h
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = X.d.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f4994h
            float r5 = X.d.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            android.widget.EdgeEffect r5 = r3.f4994h
            r5.onRelease()
            goto L_0x002f
        L_0x0054:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L_0x0063
            r3.invalidate()
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    public final void N(boolean z4) {
        if (z4) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.f5010x = getScrollY();
        postInvalidateOnAnimation();
    }

    public final boolean O(int i4, int i5, int i6) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z4 = false;
        boolean z5 = i4 == 33;
        View u4 = u(z5, i5, i6);
        if (u4 == null) {
            u4 = this;
        }
        if (i5 < scrollY || i6 > i7) {
            P(z5 ? i5 - scrollY : i6 - i7, 0, 1, true);
            z4 = true;
        }
        if (u4 != findFocus()) {
            u4.requestFocus(i4);
        }
        return z4;
    }

    public final int P(int i4, int i5, int i6, boolean z4) {
        int i7;
        int i8;
        VelocityTracker velocityTracker;
        int i9 = i5;
        int i10 = i6;
        if (i10 == 1) {
            X(2, i10);
        }
        boolean z5 = false;
        if (l(0, i4, this.f5008v, this.f5007u, i6)) {
            i8 = i4 - this.f5008v[1];
            i7 = this.f5007u[1];
        } else {
            i8 = i4;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z6 = e() && !z4;
        int i11 = scrollRange;
        boolean z7 = J(0, i8, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i10);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f5008v;
        iArr[1] = 0;
        p(0, scrollY2, 0, i8 - scrollY2, this.f5007u, i6, iArr);
        int i12 = i7 + this.f5007u[1];
        int i13 = i8 - this.f5008v[1];
        int i14 = scrollY + i13;
        if (i14 < 0) {
            if (z6) {
                X.d.d(this.f4993g, ((float) (-i13)) / ((float) getHeight()), ((float) i9) / ((float) getWidth()));
                if (!this.f4994h.isFinished()) {
                    this.f4994h.onRelease();
                }
            }
        } else if (i14 > i11 && z6) {
            X.d.d(this.f4994h, ((float) i13) / ((float) getHeight()), 1.0f - (((float) i9) / ((float) getWidth())));
            if (!this.f4993g.isFinished()) {
                this.f4993g.onRelease();
            }
        }
        if (!this.f4993g.isFinished() || !this.f4994h.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            z5 = z7;
        }
        if (z5 && i10 == 0 && (velocityTracker = this.f5000n) != null) {
            velocityTracker.clear();
        }
        if (i10 == 1) {
            Z(i10);
            this.f4993g.onRelease();
            this.f4994h.onRelease();
        }
        return i12;
    }

    public final void Q(View view) {
        view.getDrawingRect(this.f4991e);
        offsetDescendantRectToMyCoords(view, this.f4991e);
        int h4 = h(this.f4991e);
        if (h4 != 0) {
            scrollBy(0, h4);
        }
    }

    public final boolean R(Rect rect, boolean z4) {
        int h4 = h(rect);
        boolean z5 = h4 != 0;
        if (z5) {
            if (z4) {
                scrollBy(0, h4);
            } else {
                T(0, h4);
            }
        }
        return z5;
    }

    public final boolean S(EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        return x(-i4) < X.d.b(edgeEffect) * ((float) getHeight());
    }

    public final void T(int i4, int i5) {
        U(i4, i5, SQLiteDatabase.MAX_SQL_CACHE_SIZE, false);
    }

    public final void U(int i4, int i5, int i6, boolean z4) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f4990d > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f4992f;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i6);
                N(z4);
            } else {
                if (!this.f4992f.isFinished()) {
                    b();
                }
                scrollBy(i4, i5);
            }
            this.f4990d = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public void V(int i4, int i5, int i6, boolean z4) {
        U(i4 - getScrollX(), i5 - getScrollY(), i6, z4);
    }

    public void W(int i4, int i5, boolean z4) {
        V(i4, i5, SQLiteDatabase.MAX_SQL_CACHE_SIZE, z4);
    }

    public boolean X(int i4, int i5) {
        return this.f4984A.p(i4, i5);
    }

    public final boolean Y(MotionEvent motionEvent) {
        boolean z4;
        if (X.d.b(this.f4993g) != 0.0f) {
            X.d.d(this.f4993g, 0.0f, motionEvent.getX() / ((float) getWidth()));
            z4 = true;
        } else {
            z4 = false;
        }
        if (X.d.b(this.f4994h) == 0.0f) {
            return z4;
        }
        X.d.d(this.f4994h, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
        return true;
    }

    public void Z(int i4) {
        this.f4984A.r(i4);
    }

    public void a(View view, View view2, int i4, int i5) {
        this.f5012z.c(view, view2, i4, i5);
        X(2, i5);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final void b() {
        this.f4992f.abortAnimation();
        Z(1);
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        if (!this.f4992f.isFinished()) {
            this.f4992f.computeScrollOffset();
            int currY = this.f4992f.getCurrY();
            int k4 = k(currY - this.f5010x);
            this.f5010x = currY;
            int[] iArr = this.f5008v;
            iArr[1] = 0;
            l(0, k4, iArr, (int[]) null, 1);
            int i4 = k4 - this.f5008v[1];
            int scrollRange = getScrollRange();
            if (i4 != 0) {
                int scrollY = getScrollY();
                J(0, i4, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
                int scrollY2 = getScrollY() - scrollY;
                int i5 = i4 - scrollY2;
                int[] iArr2 = this.f5008v;
                iArr2[1] = 0;
                p(0, scrollY2, 0, i5, this.f5007u, 1, iArr2);
                i4 = i5 - this.f5008v[1];
            }
            if (i4 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i4 < 0) {
                        if (this.f4993g.isFinished()) {
                            this.f4993g.onAbsorb((int) this.f4992f.getCurrVelocity());
                        }
                    } else if (this.f4994h.isFinished()) {
                        this.f4994h.onAbsorb((int) this.f4992f.getCurrVelocity());
                    }
                }
                b();
            }
            if (!this.f4992f.isFinished()) {
                postInvalidateOnAnimation();
            } else {
                Z(1);
            }
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public boolean d(int i4) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !G(findNextFocus, maxScrollAmount, getHeight())) {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f4991e);
            offsetDescendantRectToMyCoords(findNextFocus, this.f4991e);
            P(h(this.f4991e), 0, 1, true);
            findNextFocus.requestFocus(i4);
        }
        if (findFocus != null && findFocus.isFocused() && E(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    public boolean dispatchNestedFling(float f4, float f5, boolean z4) {
        return this.f4984A.a(f4, f5, z4);
    }

    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f4984A.b(f4, f5);
    }

    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return l(i4, i5, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f4984A.f(i4, i5, i6, i7, iArr);
    }

    public void draw(Canvas canvas) {
        int i4;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i5 = 0;
        if (!this.f4993g.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i4 = getPaddingLeft();
            } else {
                i4 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate((float) i4, (float) min);
            this.f4993g.setSize(width, height);
            if (this.f4993g.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (!this.f4994h.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                i5 = getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i5 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f4994h.setSize(width2, height2);
            if (this.f4994h.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public final boolean e() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    public final boolean f() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f5012z.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f4985B == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f4985B = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f4985B;
    }

    public int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        } else if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public void i(View view, int i4) {
        this.f5012z.d(view, i4);
        Z(i4);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f4984A.l();
    }

    public void j(View view, int i4, int i5, int[] iArr, int i6) {
        l(i4, i5, iArr, (int[]) null, i6);
    }

    public int k(int i4) {
        int height = getHeight();
        if (i4 > 0 && X.d.b(this.f4993g) != 0.0f) {
            int round = Math.round((((float) (-height)) / 4.0f) * X.d.d(this.f4993g, (((float) (-i4)) * 4.0f) / ((float) height), 0.5f));
            if (round != i4) {
                this.f4993g.finish();
            }
            return i4 - round;
        } else if (i4 >= 0 || X.d.b(this.f4994h) == 0.0f) {
            return i4;
        } else {
            float f4 = (float) height;
            int round2 = Math.round((f4 / 4.0f) * X.d.d(this.f4994h, (((float) i4) * 4.0f) / f4, 0.5f));
            if (round2 != i4) {
                this.f4994h.finish();
            }
            return i4 - round2;
        }
    }

    public boolean l(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return this.f4984A.d(i4, i5, iArr, iArr2, i6);
    }

    public void m(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        H(i7, i8, iArr);
    }

    public void measureChild(View view, int i4, int i5) {
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i4, int i5, int i6, int i7, int i8) {
        H(i7, i8, (int[]) null);
    }

    public boolean o(View view, View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4997k = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i4;
        float f4;
        int i5;
        if (motionEvent.getAction() == 8 && !this.f4999m) {
            if (C0325p.a(motionEvent, 2)) {
                i5 = 9;
                f4 = motionEvent.getAxisValue(9);
                i4 = (int) motionEvent.getX();
            } else if (C0325p.a(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i4 = getWidth() / 2;
                i5 = 26;
                f4 = axisValue;
            } else {
                i5 = 0;
                i4 = 0;
                f4 = 0.0f;
            }
            if (f4 != 0.0f) {
                P(-((int) (f4 * getVerticalScrollFactorCompat())), i4, 1, C0325p.a(motionEvent, 8194));
                if (i5 != 0) {
                    this.f4988E.g(motionEvent, i5);
                }
                return true;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.f4999m) {
            return true;
        }
        int i4 = action & 255;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = this.f5006t;
                    if (i5 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i5);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i5 + " in onInterceptTouchEvent");
                        } else {
                            int y4 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y4 - this.f4995i) > this.f5003q && (2 & getNestedScrollAxes()) == 0) {
                                this.f4999m = true;
                                this.f4995i = y4;
                                C();
                                this.f5000n.addMovement(motionEvent);
                                this.f5009w = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i4 != 3) {
                    if (i4 == 6) {
                        I(motionEvent);
                    }
                }
            }
            this.f4999m = false;
            this.f5006t = -1;
            L();
            if (this.f4992f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            Z(0);
        } else {
            int y5 = (int) motionEvent.getY();
            if (!z((int) motionEvent.getX(), y5)) {
                if (!Y(motionEvent) && this.f4992f.isFinished()) {
                    z4 = false;
                }
                this.f4999m = z4;
                L();
            } else {
                this.f4995i = y5;
                this.f5006t = motionEvent.getPointerId(0);
                A();
                this.f5000n.addMovement(motionEvent);
                this.f4992f.computeScrollOffset();
                if (!Y(motionEvent) && this.f4992f.isFinished()) {
                    z4 = false;
                }
                this.f4999m = z4;
                X(2, 0);
            }
        }
        return this.f4999m;
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        int i8 = 0;
        this.f4996j = false;
        View view = this.f4998l;
        if (view != null && F(view, this)) {
            Q(this.f4998l);
        }
        this.f4998l = null;
        if (!this.f4997k) {
            if (this.f5011y != null) {
                scrollTo(getScrollX(), this.f5011y.f5014e);
                this.f5011y = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i8 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int g4 = g(scrollY, paddingTop, i8);
            if (g4 != scrollY) {
                scrollTo(getScrollX(), g4);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4997k = true;
    }

    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f5001o && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        v((int) f5);
        return true;
    }

    public boolean onNestedPreFling(View view, float f4, float f5) {
        return dispatchNestedPreFling(f4, f5);
    }

    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        j(view, i4, i5, iArr, 0);
    }

    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        H(i7, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    public void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        super.scrollTo(i4, i5);
    }

    public boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, (View) null, i4) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        if (findNextFocus != null && !E(findNextFocus)) {
            return findNextFocus.requestFocus(i4, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f5011y = eVar;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f5014e = getScrollY();
        return eVar;
    }

    public void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        d dVar = this.f4986C;
        if (dVar != null) {
            dVar.a(this, i4, i5, i6, i7);
        }
    }

    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && G(findFocus, 0, i7)) {
            findFocus.getDrawingRect(this.f4991e);
            offsetDescendantRectToMyCoords(findFocus, this.f4991e);
            q(h(this.f4991e));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return o(view, view2, i4, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f5009w = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float) this.f5009w);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f5000n;
                velocityTracker.computeCurrentVelocity(1000, (float) this.f5005s);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f5006t);
                if (Math.abs(yVelocity) >= this.f5004r) {
                    if (!r(yVelocity)) {
                        int i4 = -yVelocity;
                        float f4 = (float) i4;
                        if (!dispatchNestedPreFling(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            v(i4);
                        }
                    }
                } else if (this.f4992f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f5006t);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f5006t + " in onTouchEvent");
                } else {
                    int y4 = (int) motionEvent.getY(findPointerIndex);
                    int i5 = this.f4995i - y4;
                    int M4 = i5 - M(i5, motionEvent.getX(findPointerIndex));
                    if (!this.f4999m && Math.abs(M4) > this.f5003q) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f4999m = true;
                        M4 = M4 > 0 ? M4 - this.f5003q : M4 + this.f5003q;
                    }
                    if (this.f4999m) {
                        int P4 = P(M4, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f4995i = y4 - P4;
                        this.f5009w += P4;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f4999m && getChildCount() > 0 && this.f4992f.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4995i = (int) motionEvent.getY(actionIndex);
                this.f5006t = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f4995i = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f5006t));
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f4999m && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f4992f.isFinished()) {
                b();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f5000n;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        this.f4984A.e(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    public final void q(int i4) {
        if (i4 == 0) {
            return;
        }
        if (this.f5002p) {
            T(0, i4);
        } else {
            scrollBy(0, i4);
        }
    }

    public final boolean r(int i4) {
        if (X.d.b(this.f4993g) != 0.0f) {
            if (S(this.f4993g, i4)) {
                this.f4993g.onAbsorb(i4);
            } else {
                v(-i4);
            }
        } else if (X.d.b(this.f4994h) == 0.0f) {
            return false;
        } else {
            int i5 = -i4;
            if (S(this.f4994h, i5)) {
                this.f4994h.onAbsorb(i5);
            } else {
                v(i5);
            }
        }
        return true;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f4996j) {
            Q(view2);
        } else {
            this.f4998l = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z4);
    }

    public void requestDisallowInterceptTouchEvent(boolean z4) {
        if (z4) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    public void requestLayout() {
        this.f4996j = true;
        super.requestLayout();
    }

    public final void s() {
        this.f5006t = -1;
        this.f4999m = false;
        L();
        Z(0);
        this.f4993g.onRelease();
        this.f4994h.onRelease();
    }

    public void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int g4 = g(i4, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int g5 = g(i5, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (g4 != getScrollX() || g5 != getScrollY()) {
                super.scrollTo(g4, g5);
            }
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f5001o) {
            this.f5001o = z4;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z4) {
        this.f4984A.m(z4);
    }

    public void setOnScrollChangeListener(d dVar) {
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f5002p = z4;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i4) {
        return X(i4, 0);
    }

    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f4991e.setEmpty();
        int i4 = 130;
        if (!f()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? w(33) : d(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? w(130) : d(130);
            }
            if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i4 = 33;
                }
                K(i4);
                return false;
            } else if (keyCode == 92) {
                return w(33);
            } else {
                if (keyCode == 93) {
                    return w(130);
                }
                if (keyCode == 122) {
                    K(33);
                    return false;
                } else if (keyCode != 123) {
                    return false;
                } else {
                    K(130);
                    return false;
                }
            }
        }
    }

    public final View u(boolean z4, int i4, int i5) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i4 < bottom && top < i5) {
                boolean z6 = i4 < top && bottom < i5;
                if (view == null) {
                    view = view2;
                    z5 = z6;
                } else {
                    boolean z7 = (z4 && top < view.getTop()) || (!z4 && bottom > view.getBottom());
                    if (z5) {
                        if (z6) {
                            if (!z7) {
                            }
                        }
                    } else if (z6) {
                        view = view2;
                        z5 = true;
                    } else if (!z7) {
                    }
                    view = view2;
                }
            }
        }
        return view;
    }

    public void v(int i4) {
        if (getChildCount() > 0) {
            this.f4992f.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
        }
    }

    public boolean w(int i4) {
        int childCount;
        boolean z4 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f4991e;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f4991e.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f4991e;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f4991e;
        return O(i4, rect3.top, rect3.bottom);
    }

    public final float x(int i4) {
        double log = Math.log((double) ((((float) Math.abs(i4)) * 0.35f) / (this.f4989c * 0.015f)));
        float f4 = f4981F;
        return (float) (((double) (this.f4989c * 0.015f)) * Math.exp((((double) f4) / (((double) f4) - 1.0d)) * log));
    }

    public boolean y(int i4) {
        return this.f4984A.k(i4);
    }

    public final boolean z(int i4, int i5) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i5 >= childAt.getTop() - scrollY && i5 < childAt.getBottom() - scrollY && i4 >= childAt.getLeft() && i4 < childAt.getRight();
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4991e = new Rect();
        this.f4996j = true;
        this.f4997k = false;
        this.f4998l = null;
        this.f4999m = false;
        this.f5002p = true;
        this.f5006t = -1;
        this.f5007u = new int[2];
        this.f5008v = new int[2];
        c cVar = new c();
        this.f4987D = cVar;
        this.f4988E = new C0314e(getContext(), cVar);
        this.f4993g = X.d.a(context, attributeSet);
        this.f4994h = X.d.a(context, attributeSet);
        this.f4989c = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4983H, i4, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f5012z = new C0329u(this);
        this.f4984A = new r(this);
        setNestedScrollingEnabled(true);
        C.g0(this, f4982G);
    }

    public void addView(View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
