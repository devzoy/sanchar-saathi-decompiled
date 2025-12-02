package androidx.coordinatorlayout.widget;

import S.C;
import S.C0317h;
import S.C0327s;
import S.C0328t;
import S.C0329u;
import S.C0330v;
import S.O;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements C0327s, C0328t {

    /* renamed from: A  reason: collision with root package name */
    public static final R.d f4917A = new R.f(12);

    /* renamed from: w  reason: collision with root package name */
    public static final String f4918w;

    /* renamed from: x  reason: collision with root package name */
    public static final Class[] f4919x = {Context.class, AttributeSet.class};

    /* renamed from: y  reason: collision with root package name */
    public static final ThreadLocal f4920y = new ThreadLocal();

    /* renamed from: z  reason: collision with root package name */
    public static final Comparator f4921z = new h();

    /* renamed from: c  reason: collision with root package name */
    public final List f4922c;

    /* renamed from: d  reason: collision with root package name */
    public final E.b f4923d;

    /* renamed from: e  reason: collision with root package name */
    public final List f4924e;

    /* renamed from: f  reason: collision with root package name */
    public final List f4925f;

    /* renamed from: g  reason: collision with root package name */
    public Paint f4926g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f4927h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f4928i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4929j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4930k;

    /* renamed from: l  reason: collision with root package name */
    public int[] f4931l;

    /* renamed from: m  reason: collision with root package name */
    public View f4932m;

    /* renamed from: n  reason: collision with root package name */
    public View f4933n;

    /* renamed from: o  reason: collision with root package name */
    public f f4934o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4935p;

    /* renamed from: q  reason: collision with root package name */
    public O f4936q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4937r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f4938s;

    /* renamed from: t  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f4939t;

    /* renamed from: u  reason: collision with root package name */
    public C0330v f4940u;

    /* renamed from: v  reason: collision with root package name */
    public final C0329u f4941v;

    public class a implements C0330v {
        public a() {
        }

        public O a(View view, O o4) {
            return CoordinatorLayout.this.U(o4);
        }
    }

    public static abstract class b {
        public b() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
            if (i5 == 0) {
                return z(coordinatorLayout, view, view2, view3, i4);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
            if (i4 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public O f(CoordinatorLayout coordinatorLayout, View view, O o4) {
            return o4;
        }

        public void g(e eVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f4, float f5, boolean z4) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f4, float f5) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i6) {
            if (i6 == 0) {
                p(coordinatorLayout, view, view2, i4, i5, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7, int i8) {
            if (i8 == 0) {
                r(coordinatorLayout, view, view2, i4, i5, i6, i7);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            iArr[0] = iArr[0] + i6;
            iArr[1] = iArr[1] + i7;
            s(coordinatorLayout, view, view2, i4, i5, i6, i7, i8);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
            if (i5 == 0) {
                u(coordinatorLayout, view, view2, view3, i4);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z4) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4) {
            return false;
        }

        public b(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class value();
    }

    public class d implements ViewGroup.OnHierarchyChangeListener {
        public d() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f4939t;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.F(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f4939t;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.F(0);
            return true;
        }
    }

    public static class h implements Comparator {
        /* renamed from: a */
        public int compare(View view, View view2) {
            float G4 = C.G(view);
            float G5 = C.G(view2);
            if (G4 > G5) {
                return -1;
            }
            return G4 < G5 ? 1 : 0;
        }
    }

    static {
        Package packageR = CoordinatorLayout.class.getPackage();
        f4918w = packageR != null ? packageR.getName() : null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, D.a.f548a);
    }

    public static b I(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f4918w;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f4920y;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f4919x);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (b) constructor.newInstance(new Object[]{context, attributeSet});
        } catch (Exception e4) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e4);
        }
    }

    public static void M(Rect rect) {
        rect.setEmpty();
        f4917A.a(rect);
    }

    public static int P(int i4) {
        if (i4 == 0) {
            return 17;
        }
        return i4;
    }

    public static int Q(int i4) {
        if ((i4 & 7) == 0) {
            i4 |= 8388611;
        }
        return (i4 & 112) == 0 ? i4 | 48 : i4;
    }

    public static int R(int i4) {
        if (i4 == 0) {
            return 8388661;
        }
        return i4;
    }

    public static Rect b() {
        Rect rect = (Rect) f4917A.b();
        return rect == null ? new Rect() : rect;
    }

    private static int d(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }

    public final void A(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        Rect b4 = b();
        b4.set(getPaddingLeft() + eVar.leftMargin, getPaddingTop() + eVar.topMargin, (getWidth() - getPaddingRight()) - eVar.rightMargin, (getHeight() - getPaddingBottom()) - eVar.bottomMargin);
        if (this.f4936q != null && C.u(this) && !C.u(view)) {
            b4.left += this.f4936q.j();
            b4.top += this.f4936q.l();
            b4.right -= this.f4936q.k();
            b4.bottom -= this.f4936q.i();
        }
        Rect b5 = b();
        C0317h.a(Q(eVar.f4946c), view.getMeasuredWidth(), view.getMeasuredHeight(), b4, b5, i4);
        view.layout(b5.left, b5.top, b5.right, b5.bottom);
        M(b4);
        M(b5);
    }

    public final void B(View view, View view2, int i4) {
        Rect b4 = b();
        Rect b5 = b();
        try {
            r(view2, b4);
            s(view, i4, b4, b5);
            view.layout(b5.left, b5.top, b5.right, b5.bottom);
        } finally {
            M(b4);
            M(b5);
        }
    }

    public final void C(View view, int i4, int i5) {
        e eVar = (e) view.getLayoutParams();
        int b4 = C0317h.b(R(eVar.f4946c), i5);
        int i6 = b4 & 7;
        int i7 = b4 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i5 == 1) {
            i4 = width - i4;
        }
        int u4 = u(i4) - measuredWidth;
        if (i6 == 1) {
            u4 += measuredWidth / 2;
        } else if (i6 == 5) {
            u4 += measuredWidth;
        }
        int i8 = i7 != 16 ? i7 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(u4, ((width - getPaddingRight()) - measuredWidth) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(i8, ((height - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public final void D(View view, Rect rect, int i4) {
        boolean z4;
        boolean z5;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        if (C.M(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            e eVar = (e) view.getLayoutParams();
            b e4 = eVar.e();
            Rect b4 = b();
            Rect b5 = b();
            b5.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (e4 == null || !e4.b(this, view, b4)) {
                b4.set(b5);
            } else if (!b5.contains(b4)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + b4.toShortString() + " | Bounds:" + b5.toShortString());
            }
            M(b5);
            if (b4.isEmpty()) {
                M(b4);
                return;
            }
            int b6 = C0317h.b(eVar.f4951h, i4);
            boolean z6 = true;
            if ((b6 & 48) != 48 || (i9 = (b4.top - eVar.topMargin) - eVar.f4953j) >= (i10 = rect.top)) {
                z4 = false;
            } else {
                T(view, i10 - i9);
                z4 = true;
            }
            if ((b6 & 80) == 80 && (height = ((getHeight() - b4.bottom) - eVar.bottomMargin) + eVar.f4953j) < (i8 = rect.bottom)) {
                T(view, height - i8);
                z4 = true;
            }
            if (!z4) {
                T(view, 0);
            }
            if ((b6 & 3) != 3 || (i6 = (b4.left - eVar.leftMargin) - eVar.f4952i) >= (i7 = rect.left)) {
                z5 = false;
            } else {
                S(view, i7 - i6);
                z5 = true;
            }
            if ((b6 & 5) != 5 || (width = ((getWidth() - b4.right) - eVar.rightMargin) + eVar.f4952i) >= (i5 = rect.right)) {
                z6 = z5;
            } else {
                S(view, width - i5);
            }
            if (!z6) {
                S(view, 0);
            }
            M(b4);
        }
    }

    public void E(View view, int i4) {
        b e4;
        View view2 = view;
        e eVar = (e) view.getLayoutParams();
        if (eVar.f4954k != null) {
            Rect b4 = b();
            Rect b5 = b();
            Rect b6 = b();
            r(eVar.f4954k, b4);
            boolean z4 = false;
            p(view2, false, b5);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i5 = measuredHeight;
            t(view, i4, b4, b6, eVar, measuredWidth, measuredHeight);
            if (!(b6.left == b5.left && b6.top == b5.top)) {
                z4 = true;
            }
            e(eVar, b6, measuredWidth, i5);
            int i6 = b6.left - b5.left;
            int i7 = b6.top - b5.top;
            if (i6 != 0) {
                C.R(view2, i6);
            }
            if (i7 != 0) {
                C.S(view2, i7);
            }
            if (z4 && (e4 = eVar.e()) != null) {
                e4.h(this, view2, eVar.f4954k);
            }
            M(b4);
            M(b5);
            M(b6);
        }
    }

    public final void F(int i4) {
        boolean z4;
        int i5 = i4;
        int x4 = C.x(this);
        int size = this.f4922c.size();
        Rect b4 = b();
        Rect b5 = b();
        Rect b6 = b();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.f4922c.get(i6);
            e eVar = (e) view.getLayoutParams();
            if (i5 != 0 || view.getVisibility() != 8) {
                for (int i7 = 0; i7 < i6; i7++) {
                    if (eVar.f4955l == ((View) this.f4922c.get(i7))) {
                        E(view, x4);
                    }
                }
                p(view, true, b5);
                if (eVar.f4950g != 0 && !b5.isEmpty()) {
                    int b7 = C0317h.b(eVar.f4950g, x4);
                    int i8 = b7 & 112;
                    if (i8 == 48) {
                        b4.top = Math.max(b4.top, b5.bottom);
                    } else if (i8 == 80) {
                        b4.bottom = Math.max(b4.bottom, getHeight() - b5.top);
                    }
                    int i9 = b7 & 7;
                    if (i9 == 3) {
                        b4.left = Math.max(b4.left, b5.right);
                    } else if (i9 == 5) {
                        b4.right = Math.max(b4.right, getWidth() - b5.left);
                    }
                }
                if (eVar.f4951h != 0 && view.getVisibility() == 0) {
                    D(view, b4, x4);
                }
                if (i5 != 2) {
                    v(view, b6);
                    if (!b6.equals(b5)) {
                        L(view, b5);
                    }
                }
                for (int i10 = i6 + 1; i10 < size; i10++) {
                    View view2 = (View) this.f4922c.get(i10);
                    e eVar2 = (e) view2.getLayoutParams();
                    b e4 = eVar2.e();
                    if (e4 != null && e4.e(this, view2, view)) {
                        if (i5 != 0 || !eVar2.f()) {
                            if (i5 != 2) {
                                z4 = e4.h(this, view2, view);
                            } else {
                                e4.i(this, view2, view);
                                z4 = true;
                            }
                            if (i5 == 1) {
                                eVar2.o(z4);
                            }
                        } else {
                            eVar2.j();
                        }
                    }
                }
            }
        }
        M(b4);
        M(b5);
        M(b6);
    }

    public void G(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.a()) {
            View view2 = eVar.f4954k;
            if (view2 != null) {
                B(view, view2, i4);
                return;
            }
            int i5 = eVar.f4948e;
            if (i5 >= 0) {
                C(view, i5, i4);
            } else {
                A(view, i4);
            }
        } else {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
    }

    public void H(View view, int i4, int i5, int i6, int i7) {
        measureChildWithMargins(view, i4, i5, i6, i7);
    }

    public final boolean J(MotionEvent motionEvent, int i4) {
        MotionEvent motionEvent2 = motionEvent;
        int i5 = i4;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f4924e;
        x(list);
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z4 = false;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) list.get(i6);
            e eVar = (e) view.getLayoutParams();
            b e4 = eVar.e();
            if ((!z4 && !z5) || actionMasked == 0) {
                if (!z4 && e4 != null) {
                    if (i5 == 0) {
                        z4 = e4.k(this, view, motionEvent2);
                    } else if (i5 == 1) {
                        z4 = e4.D(this, view, motionEvent2);
                    }
                    if (z4) {
                        this.f4932m = view;
                    }
                }
                boolean c4 = eVar.c();
                boolean h4 = eVar.h(this, view);
                z5 = h4 && !c4;
                if (h4 && !z5) {
                    break;
                }
            } else if (e4 != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i5 == 0) {
                    e4.k(this, view, motionEvent3);
                } else if (i5 == 1) {
                    e4.D(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z4;
    }

    public final void K() {
        this.f4922c.clear();
        this.f4923d.c();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            e w4 = w(childAt);
            w4.d(this, childAt);
            this.f4923d.b(childAt);
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i5 != i4) {
                    View childAt2 = getChildAt(i5);
                    if (w4.b(this, childAt, childAt2)) {
                        if (!this.f4923d.d(childAt2)) {
                            this.f4923d.b(childAt2);
                        }
                        this.f4923d.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f4922c.addAll(this.f4923d.h());
        Collections.reverse(this.f4922c);
    }

    public void L(View view, Rect rect) {
        ((e) view.getLayoutParams()).p(rect);
    }

    public void N() {
        if (this.f4930k && this.f4934o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4934o);
        }
        this.f4935p = false;
    }

    public final void O(boolean z4) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            b e4 = ((e) childAt.getLayoutParams()).e();
            if (e4 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z4) {
                    e4.k(this, childAt, obtain);
                } else {
                    e4.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            ((e) getChildAt(i5).getLayoutParams()).l();
        }
        this.f4932m = null;
        this.f4929j = false;
    }

    public final void S(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        int i5 = eVar.f4952i;
        if (i5 != i4) {
            C.R(view, i4 - i5);
            eVar.f4952i = i4;
        }
    }

    public final void T(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        int i5 = eVar.f4953j;
        if (i5 != i4) {
            C.S(view, i4 - i5);
            eVar.f4953j = i4;
        }
    }

    public final O U(O o4) {
        if (R.c.a(this.f4936q, o4)) {
            return o4;
        }
        this.f4936q = o4;
        boolean z4 = false;
        boolean z5 = o4 != null && o4.l() > 0;
        this.f4937r = z5;
        if (!z5 && getBackground() == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        O f4 = f(o4);
        requestLayout();
        return f4;
    }

    public final void V() {
        if (C.u(this)) {
            if (this.f4940u == null) {
                this.f4940u = new a();
            }
            C.t0(this, this.f4940u);
            setSystemUiVisibility(1280);
            return;
        }
        C.t0(this, (C0330v) null);
    }

    public void a(View view, View view2, int i4, int i5) {
        b e4;
        this.f4941v.c(view, view2, i4, i5);
        this.f4933n = view2;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i5) && (e4 = eVar.e()) != null) {
                e4.v(this, childAt, view, view2, i4, i5);
            }
        }
    }

    public void c() {
        if (this.f4930k) {
            if (this.f4934o == null) {
                this.f4934o = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4934o);
        }
        this.f4935p = true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    public boolean drawChild(Canvas canvas, View view, long j4) {
        e eVar = (e) view.getLayoutParams();
        b bVar = eVar.f4944a;
        if (bVar != null) {
            float d4 = bVar.d(this, view);
            if (d4 > 0.0f) {
                if (this.f4926g == null) {
                    this.f4926g = new Paint();
                }
                this.f4926g.setColor(eVar.f4944a.c(this, view));
                this.f4926g.setAlpha(d(Math.round(d4 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()), this.f4926g);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, j4);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4938s;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void e(e eVar, Rect rect, int i4, int i5) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + eVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i4) - eVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + eVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i5) - eVar.bottomMargin));
        rect.set(max, max2, i4 + max, i5 + max2);
    }

    public final O f(O o4) {
        b e4;
        if (o4.o()) {
            return o4;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (C.u(childAt) && (e4 = ((e) childAt.getLayoutParams()).e()) != null) {
                o4 = e4.f(this, childAt, o4);
                if (o4.o()) {
                    break;
                }
            }
        }
        return o4;
    }

    public void g() {
        int childCount = getChildCount();
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= childCount) {
                break;
            } else if (y(getChildAt(i4))) {
                z4 = true;
                break;
            } else {
                i4++;
            }
        }
        if (z4 == this.f4935p) {
            return;
        }
        if (z4) {
            c();
        } else {
            N();
        }
    }

    public final List<View> getDependencySortedChildren() {
        K();
        return Collections.unmodifiableList(this.f4922c);
    }

    public final O getLastWindowInsets() {
        return this.f4936q;
    }

    public int getNestedScrollAxes() {
        return this.f4941v.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f4938s;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* renamed from: h */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    public void i(View view, int i4) {
        this.f4941v.d(view, i4);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i4)) {
                b e4 = eVar.e();
                if (e4 != null) {
                    e4.C(this, childAt, view, i4);
                }
                eVar.k(i4);
                eVar.j();
            }
        }
        this.f4933n = null;
    }

    public void j(View view, int i4, int i5, int[] iArr, int i6) {
        b e4;
        int childCount = getChildCount();
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i6;
            } else {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i6) && (e4 = eVar.e()) != null) {
                    int[] iArr2 = this.f4927h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e4.q(this, childAt, view, i4, i5, iArr2, i6);
                    int[] iArr3 = this.f4927h;
                    i7 = i4 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    int[] iArr4 = this.f4927h;
                    i8 = i5 > 0 ? Math.max(i8, iArr4[1]) : Math.min(i8, iArr4[1]);
                    z4 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z4) {
            F(1);
        }
    }

    /* renamed from: k */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* renamed from: l */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public void m(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        b e4;
        boolean z4;
        int min;
        int childCount = getChildCount();
        boolean z5 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i8) && (e4 = eVar.e()) != null) {
                    int[] iArr2 = this.f4927h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e4.t(this, childAt, view, i4, i5, i6, i7, i8, iArr2);
                    int[] iArr3 = this.f4927h;
                    i9 = i6 > 0 ? Math.max(i9, iArr3[0]) : Math.min(i9, iArr3[0]);
                    if (i7 > 0) {
                        z4 = true;
                        min = Math.max(i10, this.f4927h[1]);
                    } else {
                        z4 = true;
                        min = Math.min(i10, this.f4927h[1]);
                    }
                    i10 = min;
                    z5 = z4;
                }
            }
        }
        iArr[0] = iArr[0] + i9;
        iArr[1] = iArr[1] + i10;
        if (z5) {
            F(1);
        }
    }

    public void n(View view, int i4, int i5, int i6, int i7, int i8) {
        m(view, i4, i5, i6, i7, 0, this.f4928i);
    }

    public boolean o(View view, View view2, int i4, int i5) {
        int i6 = i5;
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b e4 = eVar.e();
                if (e4 != null) {
                    boolean A4 = e4.A(this, childAt, view, view2, i4, i5);
                    z4 |= A4;
                    eVar.q(i6, A4);
                } else {
                    eVar.q(i6, false);
                }
            }
        }
        return z4;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        O(false);
        if (this.f4935p) {
            if (this.f4934o == null) {
                this.f4934o = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f4934o);
        }
        if (this.f4936q == null && C.u(this)) {
            C.d0(this);
        }
        this.f4930k = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O(false);
        if (this.f4935p && this.f4934o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f4934o);
        }
        View view = this.f4933n;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f4930k = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f4937r && this.f4938s != null) {
            O o4 = this.f4936q;
            int l4 = o4 != null ? o4.l() : 0;
            if (l4 > 0) {
                this.f4938s.setBounds(0, 0, getWidth(), l4);
                this.f4938s.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            O(true);
        }
        boolean J4 = J(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            O(true);
        }
        return J4;
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        b e4;
        int x4 = C.x(this);
        int size = this.f4922c.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) this.f4922c.get(i8);
            if (view.getVisibility() != 8 && ((e4 = ((e) view.getLayoutParams()).e()) == null || !e4.l(this, view, x4))) {
                G(view, x4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011c, code lost:
        if (r0.m(r30, r20, r11, r21, r23, 0) == false) goto L_0x012c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.K()
            r30.g()
            int r8 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r9 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            int r10 = S.C.x(r30)
            r2 = 1
            if (r10 != r2) goto L_0x0021
            r12 = r2
            goto L_0x0022
        L_0x0021:
            r12 = 0
        L_0x0022:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r8 + r9
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            S.O r3 = r7.f4936q
            if (r3 == 0) goto L_0x004b
            boolean r3 = S.C.u(r30)
            if (r3 == 0) goto L_0x004b
            r19 = r2
            goto L_0x004d
        L_0x004b:
            r19 = 0
        L_0x004d:
            java.util.List r2 = r7.f4922c
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x0057:
            if (r3 >= r6) goto L_0x0171
            java.util.List r0 = r7.f4922c
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0073
            r22 = r3
            r29 = r6
            r28 = r8
            goto L_0x0169
        L_0x0073:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r1
            int r0 = r1.f4948e
            if (r0 < 0) goto L_0x00bc
            if (r13 == 0) goto L_0x00bc
            int r0 = r7.u(r0)
            int r11 = r1.f4946c
            int r11 = R(r11)
            int r11 = S.C0317h.b(r11, r10)
            r11 = r11 & 7
            r22 = r2
            r2 = 3
            if (r11 != r2) goto L_0x0097
            if (r12 == 0) goto L_0x009c
        L_0x0097:
            r2 = 5
            if (r11 != r2) goto L_0x00a8
            if (r12 == 0) goto L_0x00a8
        L_0x009c:
            int r2 = r14 - r9
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r11 = r0
            r21 = r2
            goto L_0x00c1
        L_0x00a8:
            if (r11 != r2) goto L_0x00ac
            if (r12 == 0) goto L_0x00b1
        L_0x00ac:
            r2 = 3
            if (r11 != r2) goto L_0x00ba
            if (r12 == 0) goto L_0x00ba
        L_0x00b1:
            int r0 = r0 - r8
            r11 = 0
            int r0 = java.lang.Math.max(r11, r0)
            r21 = r0
            goto L_0x00c1
        L_0x00ba:
            r11 = 0
            goto L_0x00bf
        L_0x00bc:
            r22 = r2
            goto L_0x00ba
        L_0x00bf:
            r21 = r11
        L_0x00c1:
            if (r19 == 0) goto L_0x00f3
            boolean r0 = S.C.u(r20)
            if (r0 != 0) goto L_0x00f3
            S.O r0 = r7.f4936q
            int r0 = r0.j()
            S.O r2 = r7.f4936q
            int r2 = r2.k()
            int r0 = r0 + r2
            S.O r2 = r7.f4936q
            int r2 = r2.l()
            S.O r11 = r7.f4936q
            int r11 = r11.i()
            int r2 = r2 + r11
            int r0 = r14 - r0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r2
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r11 = r0
            r23 = r2
            goto L_0x00f7
        L_0x00f3:
            r11 = r31
            r23 = r32
        L_0x00f7:
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r0 = r1.e()
            if (r0 == 0) goto L_0x011f
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r11
            r27 = r4
            r4 = r21
            r28 = r8
            r8 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.m(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0139
            goto L_0x012c
        L_0x011f:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r8
            r25 = r22
            r22 = r3
            r8 = r5
        L_0x012c:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r11
            r3 = r21
            r4 = r23
            r0.H(r1, r2, r3, r4, r5)
        L_0x0139:
            int r0 = r20.getMeasuredWidth()
            int r0 = r17 + r0
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r8, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r18 + r2
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r11 = r25
            int r2 = android.view.View.combineMeasuredStates(r11, r2)
            r5 = r0
            r4 = r1
        L_0x0169:
            int r3 = r22 + 1
            r8 = r28
            r6 = r29
            goto L_0x0057
        L_0x0171:
            r11 = r2
            r1 = r4
            r8 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r11
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r8, r2, r0)
            int r2 = r11 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        b e4;
        int childCount = getChildCount();
        boolean z5 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(0) && (e4 = eVar.e()) != null) {
                    z5 |= e4.n(this, childAt, view, f4, f5, z4);
                }
            }
        }
        if (z5) {
            F(1);
        }
        return z5;
    }

    public boolean onNestedPreFling(View view, float f4, float f5) {
        b e4;
        int childCount = getChildCount();
        boolean z4 = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(0) && (e4 = eVar.e()) != null) {
                    z4 |= e4.o(this, childAt, view, f4, f5);
                }
            }
        }
        return z4;
    }

    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        j(view, i4, i5, iArr, 0);
    }

    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        n(view, i4, i5, i6, i7, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        SparseArray sparseArray = gVar.f4963g;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            b e4 = w(childAt).e();
            if (!(id == -1 || e4 == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                e4.x(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable y4;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int id = childAt.getId();
            b e4 = ((e) childAt.getLayoutParams()).e();
            if (!(id == -1 || e4 == null || (y4 = e4.y(this, childAt)) == null)) {
                sparseArray.append(id, y4);
            }
        }
        gVar.f4963g = sparseArray;
        return gVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return o(view, view2, i4, 0);
    }

    public void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f4932m
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0017
            boolean r3 = r0.J(r1, r4)
            if (r3 == 0) goto L_0x0015
            goto L_0x0018
        L_0x0015:
            r6 = r5
            goto L_0x002c
        L_0x0017:
            r3 = r5
        L_0x0018:
            android.view.View r6 = r0.f4932m
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r6 = r6.e()
            if (r6 == 0) goto L_0x0015
            android.view.View r7 = r0.f4932m
            boolean r6 = r6.D(r0, r7, r1)
        L_0x002c:
            android.view.View r7 = r0.f4932m
            r8 = 0
            if (r7 != 0) goto L_0x0037
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x004a
        L_0x0037:
            if (r3 == 0) goto L_0x004a
            long r11 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x004a:
            if (r8 == 0) goto L_0x004f
            r8.recycle()
        L_0x004f:
            if (r2 == r4) goto L_0x0054
            r1 = 3
            if (r2 != r1) goto L_0x0057
        L_0x0054:
            r0.O(r5)
        L_0x0057:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view, boolean z4, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z4) {
            r(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List q(View view) {
        List g4 = this.f4923d.g(view);
        this.f4925f.clear();
        if (g4 != null) {
            this.f4925f.addAll(g4);
        }
        return this.f4925f;
    }

    public void r(View view, Rect rect) {
        E.c.a(this, view, rect);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        b e4 = ((e) view.getLayoutParams()).e();
        if (e4 == null || !e4.w(this, view, rect, z4)) {
            return super.requestChildRectangleOnScreen(view, rect, z4);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z4) {
        super.requestDisallowInterceptTouchEvent(z4);
        if (z4 && !this.f4929j) {
            O(false);
            this.f4929j = true;
        }
    }

    public void s(View view, int i4, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        t(view, i4, rect, rect2, eVar, measuredWidth, measuredHeight);
        e(eVar, rect2, measuredWidth, measuredHeight);
    }

    public void setFitsSystemWindows(boolean z4) {
        super.setFitsSystemWindows(z4);
        V();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f4939t = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f4938s;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f4938s = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f4938s.setState(getDrawableState());
                }
                K.a.g(this.f4938s, C.x(this));
                this.f4938s.setVisible(getVisibility() == 0, false);
                this.f4938s.setCallback(this);
            }
            C.X(this);
        }
    }

    public void setStatusBarBackgroundColor(int i4) {
        setStatusBarBackground(new ColorDrawable(i4));
    }

    public void setStatusBarBackgroundResource(int i4) {
        setStatusBarBackground(i4 != 0 ? H.a.d(getContext(), i4) : null);
    }

    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z4 = i4 == 0;
        Drawable drawable = this.f4938s;
        if (drawable != null && drawable.isVisible() != z4) {
            this.f4938s.setVisible(z4, false);
        }
    }

    public final void t(View view, int i4, Rect rect, Rect rect2, e eVar, int i5, int i6) {
        int b4 = C0317h.b(P(eVar.f4946c), i4);
        int b5 = C0317h.b(Q(eVar.f4947d), i4);
        int i7 = b4 & 7;
        int i8 = b4 & 112;
        int i9 = b5 & 7;
        int i10 = b5 & 112;
        int width = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            width -= i5 / 2;
        } else if (i7 != 5) {
            width -= i5;
        }
        if (i8 == 16) {
            height -= i6 / 2;
        } else if (i8 != 80) {
            height -= i6;
        }
        rect2.set(width, height, i5 + width, i6 + height);
    }

    public final int u(int i4) {
        int[] iArr = this.f4931l;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i4);
            return 0;
        } else if (i4 >= 0 && i4 < iArr.length) {
            return iArr[i4];
        } else {
            Log.e("CoordinatorLayout", "Keyline index " + i4 + " out of range for " + this);
            return 0;
        }
    }

    public void v(View view, Rect rect) {
        rect.set(((e) view.getLayoutParams()).g());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4938s;
    }

    public e w(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f4945b) {
            c cVar = null;
            for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (c) cls.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.n((b) cVar.value().getDeclaredConstructor((Class[]) null).newInstance((Object[]) null));
                } catch (Exception e4) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e4);
                }
            }
            eVar.f4945b = true;
        }
        return eVar;
    }

    public final void x(List list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        Comparator comparator = f4921z;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean y(View view) {
        return this.f4923d.i(view);
    }

    public boolean z(View view, int i4, int i5) {
        Rect b4 = b();
        r(view, b4);
        try {
            return b4.contains(i4, i5);
        } finally {
            M(b4);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedArray typedArray;
        this.f4922c = new ArrayList();
        this.f4923d = new E.b();
        this.f4924e = new ArrayList();
        this.f4925f = new ArrayList();
        this.f4927h = new int[2];
        this.f4928i = new int[2];
        this.f4941v = new C0329u(this);
        if (i4 == 0) {
            typedArray = context.obtainStyledAttributes(attributeSet, D.c.f551b, 0, D.b.f549a);
        } else {
            typedArray = context.obtainStyledAttributes(attributeSet, D.c.f551b, i4, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i4 == 0) {
                saveAttributeDataForStyleable(context, D.c.f551b, attributeSet, typedArray, 0, D.b.f549a);
            } else {
                saveAttributeDataForStyleable(context, D.c.f551b, attributeSet, typedArray, i4, 0);
            }
        }
        int resourceId = typedArray.getResourceId(D.c.f552c, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f4931l = resources.getIntArray(resourceId);
            float f4 = resources.getDisplayMetrics().density;
            int length = this.f4931l.length;
            for (int i5 = 0; i5 < length; i5++) {
                int[] iArr = this.f4931l;
                iArr[i5] = (int) (((float) iArr[i5]) * f4);
            }
        }
        this.f4938s = typedArray.getDrawable(D.c.f553d);
        typedArray.recycle();
        V();
        super.setOnHierarchyChangeListener(new d());
        if (C.v(this) == 0) {
            C.q0(this, 1);
        }
    }

    public static class g extends Z.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public SparseArray f4963g;

        public static class a implements Parcelable.ClassLoaderCreator {
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
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f4963g = new SparseArray(readInt);
            for (int i4 = 0; i4 < readInt; i4++) {
                this.f4963g.append(iArr[i4], readParcelableArray[i4]);
            }
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            SparseArray sparseArray = this.f4963g;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr[i5] = this.f4963g.keyAt(i5);
                parcelableArr[i5] = (Parcelable) this.f4963g.valueAt(i5);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i4);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public b f4944a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4945b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f4946c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f4947d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f4948e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f4949f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f4950g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f4951h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f4952i;

        /* renamed from: j  reason: collision with root package name */
        public int f4953j;

        /* renamed from: k  reason: collision with root package name */
        public View f4954k;

        /* renamed from: l  reason: collision with root package name */
        public View f4955l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f4956m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f4957n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f4958o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f4959p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f4960q = new Rect();

        /* renamed from: r  reason: collision with root package name */
        public Object f4961r;

        public e(int i4, int i5) {
            super(i4, i5);
        }

        public boolean a() {
            return this.f4954k == null && this.f4949f != -1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r0 = r1.f4944a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            /*
                r1 = this;
                android.view.View r0 = r1.f4955l
                if (r4 == r0) goto L_0x001b
                int r0 = S.C.x(r2)
                boolean r0 = r1.r(r4, r0)
                if (r0 != 0) goto L_0x001b
                androidx.coordinatorlayout.widget.CoordinatorLayout$b r0 = r1.f4944a
                if (r0 == 0) goto L_0x0019
                boolean r2 = r0.e(r2, r3, r4)
                if (r2 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r2 = 0
                goto L_0x001c
            L_0x001b:
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.e.b(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View):boolean");
        }

        public boolean c() {
            if (this.f4944a == null) {
                this.f4956m = false;
            }
            return this.f4956m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f4949f == -1) {
                this.f4955l = null;
                this.f4954k = null;
                return null;
            }
            if (this.f4954k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f4954k;
        }

        public b e() {
            return this.f4944a;
        }

        public boolean f() {
            return this.f4959p;
        }

        public Rect g() {
            return this.f4960q;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z4 = this.f4956m;
            if (z4) {
                return true;
            }
            b bVar = this.f4944a;
            boolean a4 = (bVar != null ? bVar.a(coordinatorLayout, view) : false) | z4;
            this.f4956m = a4;
            return a4;
        }

        public boolean i(int i4) {
            if (i4 == 0) {
                return this.f4957n;
            }
            if (i4 != 1) {
                return false;
            }
            return this.f4958o;
        }

        public void j() {
            this.f4959p = false;
        }

        public void k(int i4) {
            q(i4, false);
        }

        public void l() {
            this.f4956m = false;
        }

        public final void m(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f4949f);
            this.f4954k = findViewById;
            if (findViewById != null) {
                if (findViewById != coordinatorLayout) {
                    ViewParent parent = findViewById.getParent();
                    while (parent != coordinatorLayout && parent != null) {
                        if (parent != view) {
                            if (parent instanceof View) {
                                findViewById = (View) parent;
                            }
                            parent = parent.getParent();
                        } else if (coordinatorLayout.isInEditMode()) {
                            this.f4955l = null;
                            this.f4954k = null;
                            return;
                        } else {
                            throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                        }
                    }
                    this.f4955l = findViewById;
                } else if (coordinatorLayout.isInEditMode()) {
                    this.f4955l = null;
                    this.f4954k = null;
                } else {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
            } else if (coordinatorLayout.isInEditMode()) {
                this.f4955l = null;
                this.f4954k = null;
            } else {
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f4949f) + " to anchor view " + view);
            }
        }

        public void n(b bVar) {
            b bVar2 = this.f4944a;
            if (bVar2 != bVar) {
                if (bVar2 != null) {
                    bVar2.j();
                }
                this.f4944a = bVar;
                this.f4961r = null;
                this.f4945b = true;
                if (bVar != null) {
                    bVar.g(this);
                }
            }
        }

        public void o(boolean z4) {
            this.f4959p = z4;
        }

        public void p(Rect rect) {
            this.f4960q.set(rect);
        }

        public void q(int i4, boolean z4) {
            if (i4 == 0) {
                this.f4957n = z4;
            } else if (i4 == 1) {
                this.f4958o = z4;
            }
        }

        public final boolean r(View view, int i4) {
            int b4 = C0317h.b(((e) view.getLayoutParams()).f4950g, i4);
            return b4 != 0 && (C0317h.b(this.f4951h, i4) & b4) == b4;
        }

        public final boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f4954k.getId() != this.f4949f) {
                return false;
            }
            View view2 = this.f4954k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f4955l = null;
                    this.f4954k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
            this.f4955l = view2;
            return true;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D.c.f554e);
            this.f4946c = obtainStyledAttributes.getInteger(D.c.f555f, 0);
            this.f4949f = obtainStyledAttributes.getResourceId(D.c.f556g, -1);
            this.f4947d = obtainStyledAttributes.getInteger(D.c.f557h, 0);
            this.f4948e = obtainStyledAttributes.getInteger(D.c.f561l, -1);
            this.f4950g = obtainStyledAttributes.getInt(D.c.f560k, 0);
            this.f4951h = obtainStyledAttributes.getInt(D.c.f559j, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(D.c.f558i);
            this.f4945b = hasValue;
            if (hasValue) {
                this.f4944a = CoordinatorLayout.I(context, attributeSet, obtainStyledAttributes.getString(D.c.f558i));
            }
            obtainStyledAttributes.recycle();
            b bVar = this.f4944a;
            if (bVar != null) {
                bVar.g(this);
            }
        }

        public e(e eVar) {
            super(eVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
