package S;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public class O {

    /* renamed from: b  reason: collision with root package name */
    public static final O f2642b;

    /* renamed from: a  reason: collision with root package name */
    public final l f2643a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f2644a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f2645b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f2646c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f2647d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2644a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2645b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2646c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e4) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e4.getMessage(), e4);
            }
        }

        public static O a(View view) {
            if (f2647d && view.isAttachedToWindow()) {
                try {
                    Object obj = f2644a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f2645b.get(obj);
                        Rect rect2 = (Rect) f2646c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            O a4 = new b().b(J.b.c(rect)).c(J.b.c(rect2)).a();
                            a4.s(a4);
                            a4.d(view.getRootView());
                            return a4;
                        }
                    }
                } catch (IllegalAccessException e4) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e4.getMessage(), e4);
                }
            }
            return null;
        }
    }

    public static class e extends d {
        public e() {
        }

        public e(O o4) {
            super(o4);
        }
    }

    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final O f2656a;

        /* renamed from: b  reason: collision with root package name */
        public J.b[] f2657b;

        public f() {
            this(new O((O) null));
        }

        public final void a() {
            J.b[] bVarArr = this.f2657b;
            if (bVarArr != null) {
                J.b bVar = bVarArr[m.d(1)];
                J.b bVar2 = this.f2657b[m.d(2)];
                if (bVar2 == null) {
                    bVar2 = this.f2656a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f2656a.f(1);
                }
                f(J.b.a(bVar, bVar2));
                J.b bVar3 = this.f2657b[m.d(16)];
                if (bVar3 != null) {
                    e(bVar3);
                }
                J.b bVar4 = this.f2657b[m.d(32)];
                if (bVar4 != null) {
                    c(bVar4);
                }
                J.b bVar5 = this.f2657b[m.d(64)];
                if (bVar5 != null) {
                    g(bVar5);
                }
            }
        }

        public abstract O b();

        public void c(J.b bVar) {
        }

        public abstract void d(J.b bVar);

        public void e(J.b bVar) {
        }

        public abstract void f(J.b bVar);

        public void g(J.b bVar) {
        }

        public f(O o4) {
            this.f2656a = o4;
        }
    }

    public static class i extends h {
        public i(O o4, WindowInsets windowInsets) {
            super(o4, windowInsets);
        }

        public O a() {
            return O.v(this.f2663c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f2663c, iVar.f2663c) && Objects.equals(this.f2667g, iVar.f2667g);
        }

        public C0316g f() {
            return C0316g.e(this.f2663c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f2663c.hashCode();
        }

        public i(O o4, i iVar) {
            super(o4, (h) iVar);
        }
    }

    public static class k extends j {

        /* renamed from: q  reason: collision with root package name */
        public static final O f2672q = O.v(WindowInsets.CONSUMED);

        public k(O o4, WindowInsets windowInsets) {
            super(o4, windowInsets);
        }

        public final void d(View view) {
        }

        public J.b g(int i4) {
            return J.b.d(this.f2663c.getInsets(n.a(i4)));
        }

        public k(O o4, k kVar) {
            super(o4, (j) kVar);
        }
    }

    public static class l {

        /* renamed from: b  reason: collision with root package name */
        public static final O f2673b = new b().a().a().b().c();

        /* renamed from: a  reason: collision with root package name */
        public final O f2674a;

        public l(O o4) {
            this.f2674a = o4;
        }

        public O a() {
            return this.f2674a;
        }

        public O b() {
            return this.f2674a;
        }

        public O c() {
            return this.f2674a;
        }

        public void d(View view) {
        }

        public void e(O o4) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && R.c.a(k(), lVar.k()) && R.c.a(i(), lVar.i()) && R.c.a(f(), lVar.f());
        }

        public C0316g f() {
            return null;
        }

        public J.b g(int i4) {
            return J.b.f1590e;
        }

        public J.b h() {
            return k();
        }

        public int hashCode() {
            return R.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        public J.b i() {
            return J.b.f1590e;
        }

        public J.b j() {
            return k();
        }

        public J.b k() {
            return J.b.f1590e;
        }

        public J.b l() {
            return k();
        }

        public O m(int i4, int i5, int i6, int i7) {
            return f2673b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void p(J.b[] bVarArr) {
        }

        public void q(J.b bVar) {
        }

        public void r(O o4) {
        }

        public void s(J.b bVar) {
        }
    }

    public static final class m {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        public static int d(int i4) {
            if (i4 == 1) {
                return 0;
            }
            if (i4 == 2) {
                return 1;
            }
            if (i4 == 4) {
                return 2;
            }
            if (i4 == 8) {
                return 3;
            }
            if (i4 == 16) {
                return 4;
            }
            if (i4 == 32) {
                return 5;
            }
            if (i4 == 64) {
                return 6;
            }
            if (i4 == 128) {
                return 7;
            }
            if (i4 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i4);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 16;
        }

        public static int i() {
            return 64;
        }
    }

    public static final class n {
        public static int a(int i4) {
            int a4;
            int i5 = 0;
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i4 & i6) != 0) {
                    if (i6 == 1) {
                        a4 = WindowInsets.Type.statusBars();
                    } else if (i6 == 2) {
                        a4 = WindowInsets.Type.navigationBars();
                    } else if (i6 == 4) {
                        a4 = WindowInsets.Type.captionBar();
                    } else if (i6 == 8) {
                        a4 = WindowInsets.Type.ime();
                    } else if (i6 == 16) {
                        a4 = WindowInsets.Type.systemGestures();
                    } else if (i6 == 32) {
                        a4 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i6 == 64) {
                        a4 = WindowInsets.Type.tappableElement();
                    } else if (i6 == 128) {
                        a4 = WindowInsets.Type.displayCutout();
                    }
                    i5 |= a4;
                }
            }
            return i5;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f2642b = k.f2672q;
        } else {
            f2642b = l.f2673b;
        }
    }

    public O(WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f2643a = new k(this, windowInsets);
        } else if (i4 >= 29) {
            this.f2643a = new j(this, windowInsets);
        } else {
            this.f2643a = new i(this, windowInsets);
        }
    }

    public static J.b n(J.b bVar, int i4, int i5, int i6, int i7) {
        int max = Math.max(0, bVar.f1591a - i4);
        int max2 = Math.max(0, bVar.f1592b - i5);
        int max3 = Math.max(0, bVar.f1593c - i6);
        int max4 = Math.max(0, bVar.f1594d - i7);
        return (max == i4 && max2 == i5 && max3 == i6 && max4 == i7) ? bVar : J.b.b(max, max2, max3, max4);
    }

    public static O v(WindowInsets windowInsets) {
        return w(windowInsets, (View) null);
    }

    public static O w(WindowInsets windowInsets, View view) {
        O o4 = new O((WindowInsets) R.g.c(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            o4.s(C.C(view));
            o4.d(view.getRootView());
        }
        return o4;
    }

    public O a() {
        return this.f2643a.a();
    }

    public O b() {
        return this.f2643a.b();
    }

    public O c() {
        return this.f2643a.c();
    }

    public void d(View view) {
        this.f2643a.d(view);
    }

    public C0316g e() {
        return this.f2643a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        return R.c.a(this.f2643a, ((O) obj).f2643a);
    }

    public J.b f(int i4) {
        return this.f2643a.g(i4);
    }

    public J.b g() {
        return this.f2643a.h();
    }

    public J.b h() {
        return this.f2643a.i();
    }

    public int hashCode() {
        l lVar = this.f2643a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f2643a.k().f1594d;
    }

    public int j() {
        return this.f2643a.k().f1591a;
    }

    public int k() {
        return this.f2643a.k().f1593c;
    }

    public int l() {
        return this.f2643a.k().f1592b;
    }

    public O m(int i4, int i5, int i6, int i7) {
        return this.f2643a.m(i4, i5, i6, i7);
    }

    public boolean o() {
        return this.f2643a.n();
    }

    public O p(int i4, int i5, int i6, int i7) {
        return new b(this).c(J.b.b(i4, i5, i6, i7)).a();
    }

    public void q(J.b[] bVarArr) {
        this.f2643a.p(bVarArr);
    }

    public void r(J.b bVar) {
        this.f2643a.q(bVar);
    }

    public void s(O o4) {
        this.f2643a.r(o4);
    }

    public void t(J.b bVar) {
        this.f2643a.s(bVar);
    }

    public WindowInsets u() {
        l lVar = this.f2643a;
        if (lVar instanceof g) {
            return ((g) lVar).f2663c;
        }
        return null;
    }

    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        public static Field f2649e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f2650f = false;

        /* renamed from: g  reason: collision with root package name */
        public static Constructor f2651g = null;

        /* renamed from: h  reason: collision with root package name */
        public static boolean f2652h = false;

        /* renamed from: c  reason: collision with root package name */
        public WindowInsets f2653c;

        /* renamed from: d  reason: collision with root package name */
        public J.b f2654d;

        public c() {
            this.f2653c = h();
        }

        private static WindowInsets h() {
            Class<WindowInsets> cls = WindowInsets.class;
            if (!f2650f) {
                try {
                    f2649e = cls.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
                }
                f2650f = true;
            }
            Field field = f2649e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e5);
                }
            }
            if (!f2652h) {
                try {
                    f2651g = cls.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e6) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
                }
                f2652h = true;
            }
            Constructor constructor = f2651g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
                }
            }
            return null;
        }

        public O b() {
            a();
            O v4 = O.v(this.f2653c);
            v4.q(this.f2657b);
            v4.t(this.f2654d);
            return v4;
        }

        public void d(J.b bVar) {
            this.f2654d = bVar;
        }

        public void f(J.b bVar) {
            WindowInsets windowInsets = this.f2653c;
            if (windowInsets != null) {
                this.f2653c = windowInsets.replaceSystemWindowInsets(bVar.f1591a, bVar.f1592b, bVar.f1593c, bVar.f1594d);
            }
        }

        public c(O o4) {
            super(o4);
            this.f2653c = o4.u();
        }
    }

    public static class d extends f {

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets.Builder f2655c;

        public d() {
            this.f2655c = X.a();
        }

        public O b() {
            a();
            O v4 = O.v(this.f2655c.build());
            v4.q(this.f2657b);
            return v4;
        }

        public void c(J.b bVar) {
            WindowInsets.Builder unused = this.f2655c.setMandatorySystemGestureInsets(bVar.e());
        }

        public void d(J.b bVar) {
            WindowInsets.Builder unused = this.f2655c.setStableInsets(bVar.e());
        }

        public void e(J.b bVar) {
            WindowInsets.Builder unused = this.f2655c.setSystemGestureInsets(bVar.e());
        }

        public void f(J.b bVar) {
            WindowInsets.Builder unused = this.f2655c.setSystemWindowInsets(bVar.e());
        }

        public void g(J.b bVar) {
            WindowInsets.Builder unused = this.f2655c.setTappableElementInsets(bVar.e());
        }

        public d(O o4) {
            super(o4);
            WindowInsets.Builder builder;
            WindowInsets u4 = o4.u();
            if (u4 != null) {
                builder = W.a(u4);
            } else {
                builder = X.a();
            }
            this.f2655c = builder;
        }
    }

    public static class h extends g {

        /* renamed from: m  reason: collision with root package name */
        public J.b f2668m = null;

        public h(O o4, WindowInsets windowInsets) {
            super(o4, windowInsets);
        }

        public O b() {
            return O.v(this.f2663c.consumeStableInsets());
        }

        public O c() {
            return O.v(this.f2663c.consumeSystemWindowInsets());
        }

        public final J.b i() {
            if (this.f2668m == null) {
                this.f2668m = J.b.b(this.f2663c.getStableInsetLeft(), this.f2663c.getStableInsetTop(), this.f2663c.getStableInsetRight(), this.f2663c.getStableInsetBottom());
            }
            return this.f2668m;
        }

        public boolean n() {
            return this.f2663c.isConsumed();
        }

        public void s(J.b bVar) {
            this.f2668m = bVar;
        }

        public h(O o4, h hVar) {
            super(o4, (g) hVar);
            this.f2668m = hVar.f2668m;
        }
    }

    public static class g extends l {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f2658h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f2659i;

        /* renamed from: j  reason: collision with root package name */
        public static Class f2660j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f2661k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f2662l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f2663c;

        /* renamed from: d  reason: collision with root package name */
        public J.b[] f2664d;

        /* renamed from: e  reason: collision with root package name */
        public J.b f2665e;

        /* renamed from: f  reason: collision with root package name */
        public O f2666f;

        /* renamed from: g  reason: collision with root package name */
        public J.b f2667g;

        public g(O o4, WindowInsets windowInsets) {
            super(o4);
            this.f2665e = null;
            this.f2663c = windowInsets;
        }

        private J.b t(int i4, boolean z4) {
            J.b bVar = J.b.f1590e;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    bVar = J.b.a(bVar, u(i5, z4));
                }
            }
            return bVar;
        }

        private J.b v() {
            O o4 = this.f2666f;
            return o4 != null ? o4.h() : J.b.f1590e;
        }

        private J.b w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2658h) {
                    x();
                }
                Method method = f2659i;
                if (!(method == null || f2660j == null || f2661k == null)) {
                    try {
                        Object invoke = method.invoke(view, (Object[]) null);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f2661k.get(f2662l.get(invoke));
                        if (rect != null) {
                            return J.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e4) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        private static void x() {
            try {
                f2659i = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2660j = cls;
                f2661k = cls.getDeclaredField("mVisibleInsets");
                f2662l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2661k.setAccessible(true);
                f2662l.setAccessible(true);
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
            f2658h = true;
        }

        public void d(View view) {
            J.b w4 = w(view);
            if (w4 == null) {
                w4 = J.b.f1590e;
            }
            q(w4);
        }

        public void e(O o4) {
            o4.s(this.f2666f);
            o4.r(this.f2667g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f2667g, ((g) obj).f2667g);
        }

        public J.b g(int i4) {
            return t(i4, false);
        }

        public final J.b k() {
            if (this.f2665e == null) {
                this.f2665e = J.b.b(this.f2663c.getSystemWindowInsetLeft(), this.f2663c.getSystemWindowInsetTop(), this.f2663c.getSystemWindowInsetRight(), this.f2663c.getSystemWindowInsetBottom());
            }
            return this.f2665e;
        }

        public O m(int i4, int i5, int i6, int i7) {
            b bVar = new b(O.v(this.f2663c));
            bVar.c(O.n(k(), i4, i5, i6, i7));
            bVar.b(O.n(i(), i4, i5, i6, i7));
            return bVar.a();
        }

        public boolean o() {
            return this.f2663c.isRound();
        }

        public void p(J.b[] bVarArr) {
            this.f2664d = bVarArr;
        }

        public void q(J.b bVar) {
            this.f2667g = bVar;
        }

        public void r(O o4) {
            this.f2666f = o4;
        }

        public J.b u(int i4, boolean z4) {
            int i5;
            if (i4 == 1) {
                return z4 ? J.b.b(0, Math.max(v().f1592b, k().f1592b), 0, 0) : J.b.b(0, k().f1592b, 0, 0);
            }
            J.b bVar = null;
            if (i4 != 2) {
                if (i4 == 8) {
                    J.b[] bVarArr = this.f2664d;
                    if (bVarArr != null) {
                        bVar = bVarArr[m.d(8)];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    J.b k4 = k();
                    J.b v4 = v();
                    int i6 = k4.f1594d;
                    if (i6 > v4.f1594d) {
                        return J.b.b(0, 0, 0, i6);
                    }
                    J.b bVar2 = this.f2667g;
                    return (bVar2 == null || bVar2.equals(J.b.f1590e) || (i5 = this.f2667g.f1594d) <= v4.f1594d) ? J.b.f1590e : J.b.b(0, 0, 0, i5);
                } else if (i4 == 16) {
                    return j();
                } else {
                    if (i4 == 32) {
                        return h();
                    }
                    if (i4 == 64) {
                        return l();
                    }
                    if (i4 != 128) {
                        return J.b.f1590e;
                    }
                    O o4 = this.f2666f;
                    C0316g e4 = o4 != null ? o4.e() : f();
                    return e4 != null ? J.b.b(e4.b(), e4.d(), e4.c(), e4.a()) : J.b.f1590e;
                }
            } else if (z4) {
                J.b v5 = v();
                J.b i7 = i();
                return J.b.b(Math.max(v5.f1591a, i7.f1591a), 0, Math.max(v5.f1593c, i7.f1593c), Math.max(v5.f1594d, i7.f1594d));
            } else {
                J.b k5 = k();
                O o5 = this.f2666f;
                if (o5 != null) {
                    bVar = o5.h();
                }
                int i8 = k5.f1594d;
                if (bVar != null) {
                    i8 = Math.min(i8, bVar.f1594d);
                }
                return J.b.b(k5.f1591a, 0, k5.f1593c, i8);
            }
        }

        public g(O o4, g gVar) {
            this(o4, new WindowInsets(gVar.f2663c));
        }
    }

    public static class j extends i {

        /* renamed from: n  reason: collision with root package name */
        public J.b f2669n = null;

        /* renamed from: o  reason: collision with root package name */
        public J.b f2670o = null;

        /* renamed from: p  reason: collision with root package name */
        public J.b f2671p = null;

        public j(O o4, WindowInsets windowInsets) {
            super(o4, windowInsets);
        }

        public J.b h() {
            if (this.f2670o == null) {
                this.f2670o = J.b.d(this.f2663c.getMandatorySystemGestureInsets());
            }
            return this.f2670o;
        }

        public J.b j() {
            if (this.f2669n == null) {
                this.f2669n = J.b.d(this.f2663c.getSystemGestureInsets());
            }
            return this.f2669n;
        }

        public J.b l() {
            if (this.f2671p == null) {
                this.f2671p = J.b.d(this.f2663c.getTappableElementInsets());
            }
            return this.f2671p;
        }

        public O m(int i4, int i5, int i6, int i7) {
            return O.v(this.f2663c.inset(i4, i5, i6, i7));
        }

        public void s(J.b bVar) {
        }

        public j(O o4, j jVar) {
            super(o4, (i) jVar);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final f f2648a;

        public b() {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                this.f2648a = new e();
            } else if (i4 >= 29) {
                this.f2648a = new d();
            } else {
                this.f2648a = new c();
            }
        }

        public O a() {
            return this.f2648a.b();
        }

        public b b(J.b bVar) {
            this.f2648a.d(bVar);
            return this;
        }

        public b c(J.b bVar) {
            this.f2648a.f(bVar);
            return this;
        }

        public b(O o4) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                this.f2648a = new e(o4);
            } else if (i4 >= 29) {
                this.f2648a = new d(o4);
            } else {
                this.f2648a = new c(o4);
            }
        }
    }

    public O(O o4) {
        if (o4 != null) {
            l lVar = o4.f2643a;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && (lVar instanceof k)) {
                this.f2643a = new k(this, (k) lVar);
            } else if (i4 >= 29 && (lVar instanceof j)) {
                this.f2643a = new j(this, (j) lVar);
            } else if (lVar instanceof i) {
                this.f2643a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f2643a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f2643a = new g(this, (g) lVar);
            } else {
                this.f2643a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f2643a = new l(this);
    }
}
