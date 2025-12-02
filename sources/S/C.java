package S;

import S.C0310a;
import S.O;
import T.m;
import T.p;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap f2620a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f2621b = null;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f2622c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2623d = {F.d.f964b, F.d.f965c, F.d.f976n, F.d.f987y, F.d.f948B, F.d.f949C, F.d.f950D, F.d.f951E, F.d.f952F, F.d.f953G, F.d.f966d, F.d.f967e, F.d.f968f, F.d.f969g, F.d.f970h, F.d.f971i, F.d.f972j, F.d.f973k, F.d.f974l, F.d.f975m, F.d.f977o, F.d.f978p, F.d.f979q, F.d.f980r, F.d.f981s, F.d.f982t, F.d.f983u, F.d.f984v, F.d.f985w, F.d.f986x, F.d.f988z, F.d.f947A};

    /* renamed from: e  reason: collision with root package name */
    public static final C0331w f2624e = new B();

    /* renamed from: f  reason: collision with root package name */
    public static final e f2625f = new e();

    public class a extends f {
        public a(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        /* renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(k.d(view));
        }

        /* renamed from: i */
        public void d(View view, Boolean bool) {
            k.j(view, bool.booleanValue());
        }

        /* renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public class b extends f {
        public b(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        /* renamed from: h */
        public CharSequence c(View view) {
            return k.b(view);
        }

        /* renamed from: i */
        public void d(View view, CharSequence charSequence) {
            k.h(view, charSequence);
        }

        /* renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class c extends f {
        public c(int i4, Class cls, int i5, int i6) {
            super(i4, cls, i5, i6);
        }

        /* renamed from: h */
        public CharSequence c(View view) {
            return m.b(view);
        }

        /* renamed from: i */
        public void d(View view, CharSequence charSequence) {
            m.e(view, charSequence);
        }

        /* renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    public class d extends f {
        public d(int i4, Class cls, int i5) {
            super(i4, cls, i5);
        }

        /* renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        /* renamed from: i */
        public void d(View view, Boolean bool) {
            k.g(view, bool.booleanValue());
        }

        /* renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: c  reason: collision with root package name */
        public final WeakHashMap f2626c = new WeakHashMap();

        public final void a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
        }

        public void onViewAttachedToWindow(View view) {
            a(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f2627a;

        /* renamed from: b  reason: collision with root package name */
        public final Class f2628b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2629c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2630d;

        public f(int i4, Class cls, int i5) {
            this(i4, cls, 0, i5);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.f2629c;
        }

        public abstract Object c(View view);

        public abstract void d(View view, Object obj);

        public Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f2627a);
            if (this.f2628b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                C.h(view);
                view.setTag(this.f2627a, obj);
                C.Q(view, this.f2630d);
            }
        }

        public abstract boolean g(Object obj, Object obj2);

        public f(int i4, Class cls, int i5, int i6) {
            this.f2627a = i4;
            this.f2628b = cls;
            this.f2630d = i5;
            this.f2629c = i6;
        }
    }

    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class h {

        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public O f2631a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f2632b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ C0330v f2633c;

            public a(View view, C0330v vVar) {
                this.f2632b = view;
                this.f2633c = vVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                O w4 = O.w(windowInsets, view);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 < 30) {
                    h.a(windowInsets, this.f2632b);
                    if (w4.equals(this.f2631a)) {
                        return this.f2633c.a(view, w4).u();
                    }
                }
                this.f2631a = w4;
                O a4 = this.f2633c.a(view, w4);
                if (i4 >= 30) {
                    return a4.u();
                }
                C.d0(view);
                return a4.u();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(F.d.f962P);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static O b(View view, O o4, Rect rect) {
            WindowInsets u4 = o4.u();
            if (u4 != null) {
                return O.w(view.computeSystemWindowInsets(u4, rect), view);
            }
            rect.setEmpty();
            return o4;
        }

        public static boolean c(View view, float f4, float f5, boolean z4) {
            return view.dispatchNestedFling(f4, f5, z4);
        }

        public static boolean d(View view, float f4, float f5) {
            return view.dispatchNestedPreFling(f4, f5);
        }

        public static boolean e(View view, int i4, int i5, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i4, i5, iArr, iArr2);
        }

        public static boolean f(View view, int i4, int i5, int i6, int i7, int[] iArr) {
            return view.dispatchNestedScroll(i4, i5, i6, i7, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static O j(View view) {
            return O.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f4) {
            view.setElevation(f4);
        }

        public static void t(View view, boolean z4) {
            view.setNestedScrollingEnabled(z4);
        }

        public static void u(View view, C0330v vVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(F.d.f958L, vVar);
            }
            if (vVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(F.d.f962P));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, vVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f4) {
            view.setTranslationZ(f4);
        }

        public static void x(View view, float f4) {
            view.setZ(f4);
        }

        public static boolean y(View view, int i4) {
            return view.startNestedScroll(i4);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class i {
        public static O a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            O v4 = O.v(rootWindowInsets);
            v4.s(v4);
            v4.d(view.getRootView());
            return v4;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i4) {
            view.setScrollIndicators(i4);
        }

        public static void d(View view, int i4, int i5) {
            view.setScrollIndicators(i4, i5);
        }
    }

    public static class j {
        public static void a(View view, Collection<View> collection, int i4) {
            view.addKeyboardNavigationClusters(collection, i4);
        }

        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        public static int d(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean e(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean f(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean h(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View i(View view, View view2, int i4) {
            return view.keyboardNavigationClusterSearch(view2, i4);
        }

        public static boolean j(View view) {
            return view.restoreDefaultFocus();
        }

        public static void k(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void l(View view, boolean z4) {
            view.setFocusedByDefault(z4);
        }

        public static void m(View view, int i4) {
            view.setImportantForAutofill(i4);
        }

        public static void n(View view, boolean z4) {
            view.setKeyboardNavigationCluster(z4);
        }

        public static void o(View view, int i4) {
            view.setNextClusterForwardId(i4);
        }

        public static void p(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class k {
        public static void a(View view, n nVar) {
            v.g gVar = (v.g) view.getTag(F.d.f961O);
            if (gVar == null) {
                gVar = new v.g();
                view.setTag(F.d.f961O, gVar);
            }
            Objects.requireNonNull(nVar);
            D d4 = new D(nVar);
            gVar.put(nVar, d4);
            view.addOnUnhandledKeyEventListener(d4);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, n nVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            v.g gVar = (v.g) view.getTag(F.d.f961O);
            if (gVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) gVar.get(nVar)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i4) {
            return view.requireViewById(i4);
        }

        public static void g(View view, boolean z4) {
            view.setAccessibilityHeading(z4);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, U.a aVar) {
            view.setAutofillId((AutofillId) null);
        }

        public static void j(View view, boolean z4) {
            view.setScreenReaderFocusable(z4);
        }
    }

    public static class l {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4, int i5) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i4, i5);
        }

        public static void e(View view, V.a aVar) {
            view.setContentCaptureSession((ContentCaptureSession) null);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class m {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        public static void d(View view, int i4) {
            view.setImportantForContentCapture(i4);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public interface n {
    }

    public static int A(View view) {
        return view.getPaddingEnd();
    }

    public static int B(View view) {
        return view.getPaddingStart();
    }

    public static O C(View view) {
        return i.a(view);
    }

    public static CharSequence D(View view) {
        return (CharSequence) x0().e(view);
    }

    public static String E(View view) {
        return h.k(view);
    }

    public static int F(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float G(View view) {
        return h.m(view);
    }

    public static boolean H(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean I(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean J(View view) {
        return view.hasTransientState();
    }

    public static boolean K(View view) {
        Boolean bool = (Boolean) a().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean L(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean M(View view) {
        return view.isLaidOut();
    }

    public static boolean N(View view) {
        return h.p(view);
    }

    public static boolean O(View view) {
        return view.isPaddingRelative();
    }

    public static boolean P(View view) {
        Boolean bool = (Boolean) f0().e(view);
        return bool != null && bool.booleanValue();
    }

    public static void Q(View view, int i4) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z4 = m(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i5 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z4) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z4) {
                    i5 = 2048;
                }
                obtain.setEventType(i5);
                obtain.setContentChangeTypes(i4);
                if (z4) {
                    obtain.getText().add(m(view));
                    r0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i4 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i4);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i4);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e4);
                }
            }
        }
    }

    public static void R(View view, int i4) {
        view.offsetLeftAndRight(i4);
    }

    public static void S(View view, int i4) {
        view.offsetTopAndBottom(i4);
    }

    public static O T(View view, O o4) {
        WindowInsets u4 = o4.u();
        if (u4 != null) {
            WindowInsets b4 = g.b(view, u4);
            if (!b4.equals(u4)) {
                return O.w(b4, view);
            }
        }
        return o4;
    }

    public static void U(View view, T.m mVar) {
        view.onInitializeAccessibilityNodeInfo(mVar.B0());
    }

    public static f V() {
        return new b(F.d.f957K, CharSequence.class, 8, 28);
    }

    public static boolean W(View view, int i4, Bundle bundle) {
        return view.performAccessibilityAction(i4, bundle);
    }

    public static void X(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void Y(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void Z(View view, Runnable runnable, long j4) {
        view.postOnAnimationDelayed(runnable, j4);
    }

    public static f a() {
        return new d(F.d.f956J, Boolean.class, 28);
    }

    public static void a0(View view, int i4) {
        b0(i4, view);
        Q(view, 0);
    }

    public static int b(View view, CharSequence charSequence, p pVar) {
        int o4 = o(view, charSequence);
        if (o4 != -1) {
            c(view, new m.a(o4, charSequence, pVar));
        }
        return o4;
    }

    public static void b0(int i4, View view) {
        List n4 = n(view);
        for (int i5 = 0; i5 < n4.size(); i5++) {
            if (((m.a) n4.get(i5)).b() == i4) {
                n4.remove(i5);
                return;
            }
        }
    }

    public static void c(View view, m.a aVar) {
        h(view);
        b0(aVar.b(), view);
        n(view).add(aVar);
        Q(view, 0);
    }

    public static void c0(View view, m.a aVar, CharSequence charSequence, p pVar) {
        if (pVar == null && charSequence == null) {
            a0(view, aVar.b());
        } else {
            c(view, aVar.a(charSequence, pVar));
        }
    }

    public static K d(View view) {
        if (f2620a == null) {
            f2620a = new WeakHashMap();
        }
        K k4 = (K) f2620a.get(view);
        if (k4 != null) {
            return k4;
        }
        K k5 = new K(view);
        f2620a.put(view, k5);
        return k5;
    }

    public static void d0(View view) {
        g.c(view);
    }

    public static O e(View view, O o4, Rect rect) {
        return h.b(view, o4, rect);
    }

    public static void e0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.d(view, context, iArr, attributeSet, typedArray, i4, i5);
        }
    }

    public static O f(View view, O o4) {
        WindowInsets u4 = o4.u();
        if (u4 != null) {
            WindowInsets a4 = g.a(view, u4);
            if (!a4.equals(u4)) {
                return O.w(a4, view);
            }
        }
        return o4;
    }

    public static f f0() {
        return new a(F.d.f959M, Boolean.class, 28);
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        return false;
    }

    public static void g0(View view, C0310a aVar) {
        if (aVar == null && (k(view) instanceof C0310a.C0054a)) {
            aVar = new C0310a();
        }
        r0(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    public static void h(View view) {
        C0310a j4 = j(view);
        if (j4 == null) {
            j4 = new C0310a();
        }
        g0(view, j4);
    }

    public static void h0(View view, boolean z4) {
        a().f(view, Boolean.valueOf(z4));
    }

    public static int i() {
        return View.generateViewId();
    }

    public static void i0(View view, int i4) {
        view.setAccessibilityLiveRegion(i4);
    }

    public static C0310a j(View view) {
        View.AccessibilityDelegate k4 = k(view);
        if (k4 == null) {
            return null;
        }
        return k4 instanceof C0310a.C0054a ? ((C0310a.C0054a) k4).f2678a : new C0310a(k4);
    }

    public static void j0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static View.AccessibilityDelegate k(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : l(view);
    }

    public static void k0(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    public static View.AccessibilityDelegate l(View view) {
        if (f2622c) {
            return null;
        }
        if (f2621b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2621b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2622c = true;
                return null;
            }
        }
        try {
            Object obj = f2621b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f2622c = true;
            return null;
        }
    }

    public static void l0(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static CharSequence m(View view) {
        return (CharSequence) V().e(view);
    }

    public static void m0(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static List n(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(F.d.f954H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(F.d.f954H, arrayList2);
        return arrayList2;
    }

    public static void n0(View view, float f4) {
        h.s(view, f4);
    }

    public static int o(View view, CharSequence charSequence) {
        List n4 = n(view);
        for (int i4 = 0; i4 < n4.size(); i4++) {
            if (TextUtils.equals(charSequence, ((m.a) n4.get(i4)).c())) {
                return ((m.a) n4.get(i4)).b();
            }
        }
        int i5 = -1;
        int i6 = 0;
        while (true) {
            int[] iArr = f2623d;
            if (i6 >= iArr.length || i5 != -1) {
                return i5;
            }
            int i7 = iArr[i6];
            boolean z4 = true;
            for (int i8 = 0; i8 < n4.size(); i8++) {
                z4 &= ((m.a) n4.get(i8)).b() != i7;
            }
            if (z4) {
                i5 = i7;
            }
            i6++;
        }
        return i5;
    }

    public static void o0(View view, boolean z4) {
        view.setFitsSystemWindows(z4);
    }

    public static ColorStateList p(View view) {
        return h.g(view);
    }

    public static void p0(View view, boolean z4) {
        view.setHasTransientState(z4);
    }

    public static PorterDuff.Mode q(View view) {
        return h.h(view);
    }

    public static void q0(View view, int i4) {
        view.setImportantForAccessibility(i4);
    }

    public static Rect r(View view) {
        return view.getClipBounds();
    }

    public static void r0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static Display s(View view) {
        return view.getDisplay();
    }

    public static void s0(View view, int i4) {
        j.m(view, i4);
    }

    public static float t(View view) {
        return h.i(view);
    }

    public static void t0(View view, C0330v vVar) {
        h.u(view, vVar);
    }

    public static boolean u(View view) {
        return view.getFitsSystemWindows();
    }

    public static void u0(View view, int i4, int i5, int i6, int i7) {
        view.setPaddingRelative(i4, i5, i6, i7);
    }

    public static int v(View view) {
        return view.getImportantForAccessibility();
    }

    public static void v0(View view, int i4, int i5) {
        i.d(view, i4, i5);
    }

    public static int w(View view) {
        return j.c(view);
    }

    public static void w0(View view, String str) {
        h.v(view, str);
    }

    public static int x(View view) {
        return view.getLayoutDirection();
    }

    public static f x0() {
        return new c(F.d.f960N, CharSequence.class, 64, 30);
    }

    public static int y(View view) {
        return view.getMinimumHeight();
    }

    public static void y0(View view) {
        h.z(view);
    }

    public static int z(View view) {
        return view.getMinimumWidth();
    }
}
