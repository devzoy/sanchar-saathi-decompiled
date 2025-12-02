package io.flutter.plugin.platform;

import M2.b;
import N2.C0287a;
import N2.G;
import N2.u;
import X2.q;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g3.C0644h;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.editing.p;
import io.flutter.view.TextureRegistry;
import io.flutter.view.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class t implements n {

    /* renamed from: w  reason: collision with root package name */
    public static Class[] f10574w = {SurfaceView.class};

    /* renamed from: x  reason: collision with root package name */
    public static boolean f10575x = true;

    /* renamed from: y  reason: collision with root package name */
    public static boolean f10576y = true;

    /* renamed from: a  reason: collision with root package name */
    public final k f10577a = new k();

    /* renamed from: b  reason: collision with root package name */
    public C0287a f10578b;

    /* renamed from: c  reason: collision with root package name */
    public Context f10579c;

    /* renamed from: d  reason: collision with root package name */
    public u f10580d;

    /* renamed from: e  reason: collision with root package name */
    public TextureRegistry f10581e;

    /* renamed from: f  reason: collision with root package name */
    public p f10582f;

    /* renamed from: g  reason: collision with root package name */
    public q f10583g;

    /* renamed from: h  reason: collision with root package name */
    public final C0750a f10584h = new C0750a();

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f10585i = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f10586j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public final SparseArray f10587k = new SparseArray();

    /* renamed from: l  reason: collision with root package name */
    public final SparseArray f10588l = new SparseArray();

    /* renamed from: m  reason: collision with root package name */
    public final SparseArray f10589m = new SparseArray();

    /* renamed from: n  reason: collision with root package name */
    public final SparseArray f10590n = new SparseArray();

    /* renamed from: o  reason: collision with root package name */
    public int f10591o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10592p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f10593q = true;

    /* renamed from: r  reason: collision with root package name */
    public final HashSet f10594r = new HashSet();

    /* renamed from: s  reason: collision with root package name */
    public final HashSet f10595s = new HashSet();

    /* renamed from: t  reason: collision with root package name */
    public final G f10596t = G.a();

    /* renamed from: u  reason: collision with root package name */
    public boolean f10597u = false;

    /* renamed from: v  reason: collision with root package name */
    public final q.g f10598v = new a();

    public class a implements q.g {
        public a() {
        }

        public void a(boolean z4) {
            boolean unused = t.this.f10593q = z4;
        }

        public void b(int i4, double d4, double d5) {
            if (!t.this.b(i4)) {
                m mVar = (m) t.this.f10590n.get(i4);
                if (mVar == null) {
                    b.b("PlatformViewsController", "Setting offset for unknown platform view with id: " + i4);
                    return;
                }
                int l4 = t.this.y0(d4);
                int l5 = t.this.y0(d5);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mVar.getLayoutParams();
                layoutParams.topMargin = l4;
                layoutParams.leftMargin = l5;
                mVar.setLayoutParams(layoutParams);
            }
        }

        public void c(int i4, int i5) {
            View view;
            if (t.B0(i5)) {
                if (t.this.b(i4)) {
                    view = ((C) t.this.f10585i.get(Integer.valueOf(i4))).g();
                } else {
                    h hVar = (h) t.this.f10587k.get(i4);
                    if (hVar == null) {
                        b.b("PlatformViewsController", "Setting direction to an unknown view with id: " + i4);
                        return;
                    }
                    view = hVar.c();
                }
                if (view == null) {
                    b.b("PlatformViewsController", "Setting direction to a null view with id: " + i4);
                    return;
                }
                view.setLayoutDirection(i5);
                return;
            }
            throw new IllegalStateException("Trying to set unknown direction value: " + i5 + "(view id: " + i4 + ")");
        }

        public void d(q.f fVar) {
            int i4 = fVar.f3602a;
            float f4 = t.this.f10579c.getResources().getDisplayMetrics().density;
            if (t.this.b(i4)) {
                ((C) t.this.f10585i.get(Integer.valueOf(i4))).c(t.this.x0(f4, fVar, true));
                return;
            }
            h hVar = (h) t.this.f10587k.get(i4);
            if (hVar == null) {
                b.b("PlatformViewsController", "Sending touch to an unknown view with id: " + i4);
                return;
            }
            View c4 = hVar.c();
            if (c4 == null) {
                b.b("PlatformViewsController", "Sending touch to a null view with id: " + i4);
                return;
            }
            c4.dispatchTouchEvent(t.this.x0(f4, fVar, false));
        }

        public void e(int i4) {
            View view;
            if (t.this.b(i4)) {
                view = ((C) t.this.f10585i.get(Integer.valueOf(i4))).g();
            } else {
                h hVar = (h) t.this.f10587k.get(i4);
                if (hVar == null) {
                    b.b("PlatformViewsController", "Clearing focus on an unknown view with id: " + i4);
                    return;
                }
                view = hVar.c();
            }
            if (view == null) {
                b.b("PlatformViewsController", "Clearing focus on a null view with id: " + i4);
                return;
            }
            view.clearFocus();
        }

        public long f(q.d dVar) {
            t.this.T(dVar);
            int i4 = dVar.f3586a;
            if (t.this.f10590n.get(i4) != null) {
                throw new IllegalStateException("Trying to create an already created platform view, view id: " + i4);
            } else if (t.this.f10581e == null) {
                throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i4);
            } else if (t.this.f10580d != null) {
                h M4 = t.this.M(dVar, true);
                View c4 = M4.c();
                if (c4.getParent() == null) {
                    if (C0644h.f(c4, t.f10574w)) {
                        if (dVar.f3593h == q.d.a.TEXTURE_WITH_HYBRID_FALLBACK) {
                            t.this.H(M4, dVar);
                            return -2;
                        } else if (!t.this.f10597u) {
                            return t.this.J(M4, dVar);
                        }
                    }
                    return t.this.I(M4, dVar);
                }
                throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            } else {
                throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i4);
            }
        }

        public void g(q.e eVar, q.b bVar) {
            int l4 = t.this.y0(eVar.f3600b);
            int l5 = t.this.y0(eVar.f3601c);
            int i4 = eVar.f3599a;
            if (t.this.b(i4)) {
                float m4 = t.this.V();
                C c4 = (C) t.this.f10585i.get(Integer.valueOf(i4));
                t.this.d0(c4);
                c4.k(l4, l5, new s(this, c4, m4, bVar));
                return;
            }
            h hVar = (h) t.this.f10587k.get(i4);
            m mVar = (m) t.this.f10590n.get(i4);
            if (hVar == null || mVar == null) {
                b.b("PlatformViewsController", "Resizing unknown platform view with id: " + i4);
                return;
            }
            if (l4 > mVar.getRenderTargetWidth() || l5 > mVar.getRenderTargetHeight()) {
                mVar.b(l4, l5);
            }
            ViewGroup.LayoutParams layoutParams = mVar.getLayoutParams();
            layoutParams.width = l4;
            layoutParams.height = l5;
            mVar.setLayoutParams(layoutParams);
            View c5 = hVar.c();
            if (c5 != null) {
                ViewGroup.LayoutParams layoutParams2 = c5.getLayoutParams();
                layoutParams2.width = l4;
                layoutParams2.height = l5;
                c5.setLayoutParams(layoutParams2);
            }
            bVar.a(new q.c(t.this.v0((double) mVar.getRenderTargetWidth()), t.this.v0((double) mVar.getRenderTargetHeight())));
        }

        public void h(int i4) {
            h hVar = (h) t.this.f10587k.get(i4);
            if (hVar == null) {
                b.b("PlatformViewsController", "Disposing unknown platform view with id: " + i4);
                return;
            }
            if (hVar.c() != null) {
                View c4 = hVar.c();
                ViewGroup viewGroup = (ViewGroup) c4.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(c4);
                }
            }
            t.this.f10587k.remove(i4);
            try {
                hVar.a();
            } catch (RuntimeException e4) {
                b.c("PlatformViewsController", "Disposing platform view threw an exception", e4);
            }
            if (t.this.b(i4)) {
                C c5 = (C) t.this.f10585i.get(Integer.valueOf(i4));
                View g4 = c5.g();
                if (g4 != null) {
                    t.this.f10586j.remove(g4.getContext());
                }
                c5.d();
                t.this.f10585i.remove(Integer.valueOf(i4));
                return;
            }
            m mVar = (m) t.this.f10590n.get(i4);
            if (mVar != null) {
                mVar.removeAllViews();
                mVar.a();
                mVar.c();
                ViewGroup viewGroup2 = (ViewGroup) mVar.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(mVar);
                }
                t.this.f10590n.remove(i4);
                return;
            }
            S2.a aVar = (S2.a) t.this.f10588l.get(i4);
            if (aVar != null) {
                aVar.removeAllViews();
                aVar.b();
                ViewGroup viewGroup3 = (ViewGroup) aVar.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(aVar);
                }
                t.this.f10588l.remove(i4);
            }
        }

        public void i(q.d dVar) {
            t.this.S(19);
            t.this.T(dVar);
            t.this.H(t.this.M(dVar, false), dVar);
        }

        public final /* synthetic */ void k(C c4, float f4, q.b bVar) {
            t.this.A0(c4);
            if (t.this.f10579c != null) {
                f4 = t.this.V();
            }
            bVar.a(new q.c(t.this.w0((double) c4.f(), f4), t.this.w0((double) c4.e(), f4)));
        }
    }

    public static boolean B0(int i4) {
        return i4 == 0 || i4 == 1;
    }

    public static l e0(TextureRegistry textureRegistry) {
        if (f10576y && Build.VERSION.SDK_INT >= 29) {
            TextureRegistry.SurfaceProducer b4 = textureRegistry.b();
            b.e("PlatformViewsController", "PlatformView is using SurfaceProducer backend");
            return new A(b4);
        } else if (!f10575x || Build.VERSION.SDK_INT < 29) {
            TextureRegistry.SurfaceTextureEntry c4 = textureRegistry.c();
            b.e("PlatformViewsController", "PlatformView is using SurfaceTexture backend");
            return new B(c4);
        } else {
            TextureRegistry.ImageTextureEntry a4 = textureRegistry.a();
            b.e("PlatformViewsController", "PlatformView is using ImageReader backend");
            return new C0751b(a4);
        }
    }

    public static MotionEvent.PointerCoords p0(Object obj, float f4) {
        List list = (List) obj;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((Double) list.get(2)).doubleValue();
        double d4 = (double) f4;
        pointerCoords.toolMajor = (float) (((Double) list.get(3)).doubleValue() * d4);
        pointerCoords.toolMinor = (float) (((Double) list.get(4)).doubleValue() * d4);
        pointerCoords.touchMajor = (float) (((Double) list.get(5)).doubleValue() * d4);
        pointerCoords.touchMinor = (float) (((Double) list.get(6)).doubleValue() * d4);
        pointerCoords.x = (float) (((Double) list.get(7)).doubleValue() * d4);
        pointerCoords.y = (float) (((Double) list.get(8)).doubleValue() * d4);
        return pointerCoords;
    }

    public static List q0(Object obj, float f4) {
        ArrayList arrayList = new ArrayList();
        for (Object p02 : (List) obj) {
            arrayList.add(p0(p02, f4));
        }
        return arrayList;
    }

    public static MotionEvent.PointerProperties r0(Object obj) {
        List list = (List) obj;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = ((Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    public static List s0(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object r02 : (List) obj) {
            arrayList.add(r0(r02));
        }
        return arrayList;
    }

    public static void z0(MotionEvent motionEvent, MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length >= 1) {
            motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
        }
    }

    public final void A0(C c4) {
        p pVar = this.f10582f;
        if (pVar != null) {
            pVar.F();
            c4.i();
        }
    }

    public void C(Context context, TextureRegistry textureRegistry, P2.a aVar) {
        if (this.f10579c == null) {
            this.f10579c = context;
            this.f10581e = textureRegistry;
            q qVar = new q(aVar);
            this.f10583g = qVar;
            qVar.e(this.f10598v);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public void D(p pVar) {
        this.f10582f = pVar;
    }

    public void E(FlutterRenderer flutterRenderer) {
        this.f10578b = new C0287a(flutterRenderer, true);
    }

    public void F(u uVar) {
        this.f10580d = uVar;
        for (int i4 = 0; i4 < this.f10590n.size(); i4++) {
            this.f10580d.addView((m) this.f10590n.valueAt(i4));
        }
        for (int i5 = 0; i5 < this.f10588l.size(); i5++) {
            this.f10580d.addView((S2.a) this.f10588l.valueAt(i5));
        }
        for (int i6 = 0; i6 < this.f10587k.size(); i6++) {
            ((h) this.f10587k.valueAt(i6)).d(this.f10580d);
        }
    }

    public boolean G(View view) {
        if (view == null || !this.f10586j.containsKey(view.getContext())) {
            return false;
        }
        View view2 = (View) this.f10586j.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public final void H(h hVar, q.d dVar) {
        S(19);
        b.e("PlatformViewsController", "Using hybrid composition for platform view: " + dVar.f3586a);
    }

    public long I(h hVar, q.d dVar) {
        long j4;
        m mVar;
        S(23);
        b.e("PlatformViewsController", "Hosting view in view hierarchy for platform view: " + dVar.f3586a);
        int y02 = y0(dVar.f3588c);
        int y03 = y0(dVar.f3589d);
        if (this.f10597u) {
            mVar = new m(this.f10579c);
            j4 = -1;
        } else {
            l e02 = e0(this.f10581e);
            m mVar2 = new m(this.f10579c, e02);
            long b4 = e02.b();
            mVar = mVar2;
            j4 = b4;
        }
        mVar.setTouchProcessor(this.f10578b);
        mVar.b(y02, y03);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(y02, y03);
        int y04 = y0(dVar.f3590e);
        int y05 = y0(dVar.f3591f);
        layoutParams.topMargin = y04;
        layoutParams.leftMargin = y05;
        mVar.setLayoutParams(layoutParams);
        View c4 = hVar.c();
        c4.setLayoutParams(new FrameLayout.LayoutParams(y02, y03));
        c4.setImportantForAccessibility(4);
        mVar.addView(c4);
        mVar.setOnDescendantFocusChangeListener(new q(this, dVar));
        this.f10580d.addView(mVar);
        this.f10590n.append(dVar.f3586a, mVar);
        f0(hVar);
        return j4;
    }

    public final long J(h hVar, q.d dVar) {
        S(20);
        b.e("PlatformViewsController", "Hosting view in a virtual display for platform view: " + dVar.f3586a);
        l e02 = e0(this.f10581e);
        h hVar2 = hVar;
        l lVar = e02;
        C b4 = C.b(this.f10579c, this.f10584h, hVar2, lVar, y0(dVar.f3588c), y0(dVar.f3589d), dVar.f3586a, (Object) null, new r(this, dVar));
        if (b4 != null) {
            this.f10585i.put(Integer.valueOf(dVar.f3586a), b4);
            View c4 = hVar.c();
            this.f10586j.put(c4.getContext(), c4);
            return e02.b();
        }
        throw new IllegalStateException("Failed creating virtual display for a " + dVar.f3587b + " with id: " + dVar.f3586a);
    }

    public FlutterOverlaySurface K() {
        return L(new C0752c(this.f10580d.getContext(), this.f10580d.getWidth(), this.f10580d.getHeight(), this.f10584h));
    }

    public FlutterOverlaySurface L(C0752c cVar) {
        int i4 = this.f10591o;
        this.f10591o = i4 + 1;
        this.f10589m.put(i4, cVar);
        return new FlutterOverlaySurface(i4, cVar.getSurface());
    }

    public h M(q.d dVar, boolean z4) {
        i b4 = this.f10577a.b(dVar.f3587b);
        if (b4 != null) {
            h a4 = b4.a(z4 ? new MutableContextWrapper(this.f10579c) : this.f10579c, dVar.f3586a, dVar.f3594i != null ? b4.b().b(dVar.f3594i) : null);
            View c4 = a4.c();
            if (c4 != null) {
                c4.setLayoutDirection(dVar.f3592g);
                this.f10587k.put(dVar.f3586a, a4);
                f0(a4);
                return a4;
            }
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + dVar.f3587b);
    }

    public void N() {
        for (int i4 = 0; i4 < this.f10589m.size(); i4++) {
            C0752c cVar = (C0752c) this.f10589m.valueAt(i4);
            cVar.a();
            cVar.g();
        }
    }

    public void O() {
        q qVar = this.f10583g;
        if (qVar != null) {
            qVar.e((q.g) null);
        }
        N();
        this.f10583g = null;
        this.f10579c = null;
        this.f10581e = null;
    }

    public void P() {
        for (int i4 = 0; i4 < this.f10590n.size(); i4++) {
            this.f10580d.removeView((m) this.f10590n.valueAt(i4));
        }
        for (int i5 = 0; i5 < this.f10588l.size(); i5++) {
            this.f10580d.removeView((S2.a) this.f10588l.valueAt(i5));
        }
        N();
        t0();
        this.f10580d = null;
        this.f10592p = false;
        for (int i6 = 0; i6 < this.f10587k.size(); i6++) {
            ((h) this.f10587k.valueAt(i6)).e();
        }
    }

    public void Q() {
        this.f10582f = null;
    }

    public final void R() {
        while (this.f10587k.size() > 0) {
            this.f10598v.h(this.f10587k.keyAt(0));
        }
    }

    public final void S(int i4) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < i4) {
            throw new IllegalStateException("Trying to use platform views with API " + i5 + ", required API level is: " + i4);
        }
    }

    public final void T(q.d dVar) {
        if (!B0(dVar.f3592g)) {
            throw new IllegalStateException("Trying to create a view with unknown direction value: " + dVar.f3592g + "(view id: " + dVar.f3586a + ")");
        }
    }

    public final void U(boolean z4) {
        for (int i4 = 0; i4 < this.f10589m.size(); i4++) {
            int keyAt = this.f10589m.keyAt(i4);
            C0752c cVar = (C0752c) this.f10589m.valueAt(i4);
            if (this.f10594r.contains(Integer.valueOf(keyAt))) {
                this.f10580d.m(cVar);
                z4 &= cVar.e();
            } else {
                if (!this.f10592p) {
                    cVar.a();
                }
                cVar.setVisibility(8);
                this.f10580d.removeView(cVar);
            }
        }
        for (int i5 = 0; i5 < this.f10588l.size(); i5++) {
            int keyAt2 = this.f10588l.keyAt(i5);
            View view = (View) this.f10588l.get(keyAt2);
            if (!this.f10595s.contains(Integer.valueOf(keyAt2)) || (!z4 && this.f10593q)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public final float V() {
        return this.f10579c.getResources().getDisplayMetrics().density;
    }

    public j W() {
        return this.f10577a;
    }

    public boolean X(int i4) {
        h hVar = (h) this.f10587k.get(i4);
        if (hVar == null) {
            return false;
        }
        if (this.f10588l.get(i4) != null) {
            return true;
        }
        View c4 = hVar.c();
        if (c4 == null) {
            throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        } else if (c4.getParent() == null) {
            Context context = this.f10579c;
            S2.a aVar = new S2.a(context, context.getResources().getDisplayMetrics().density, this.f10578b);
            aVar.setOnDescendantFocusChangeListener(new o(this, i4));
            this.f10588l.put(i4, aVar);
            c4.setImportantForAccessibility(4);
            aVar.addView(c4);
            this.f10580d.addView(aVar);
            return true;
        } else {
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
    }

    public final void Y() {
        if (this.f10593q && !this.f10592p) {
            this.f10580d.p();
            this.f10592p = true;
        }
    }

    public final /* synthetic */ void Z(q.d dVar, View view, boolean z4) {
        if (z4) {
            this.f10583g.d(dVar.f3586a);
            return;
        }
        p pVar = this.f10582f;
        if (pVar != null) {
            pVar.k(dVar.f3586a);
        }
    }

    public void a(d dVar) {
        this.f10584h.c(dVar);
    }

    public final /* synthetic */ void a0(q.d dVar, View view, boolean z4) {
        if (z4) {
            this.f10583g.d(dVar.f3586a);
        }
    }

    public boolean b(int i4) {
        return this.f10585i.containsKey(Integer.valueOf(i4));
    }

    public final /* synthetic */ void b0(int i4, View view, boolean z4) {
        if (z4) {
            this.f10583g.d(i4);
            return;
        }
        p pVar = this.f10582f;
        if (pVar != null) {
            pVar.k(i4);
        }
    }

    public View c(int i4) {
        if (b(i4)) {
            return ((C) this.f10585i.get(Integer.valueOf(i4))).g();
        }
        h hVar = (h) this.f10587k.get(i4);
        if (hVar == null) {
            return null;
        }
        return hVar.c();
    }

    public final /* synthetic */ void c0() {
        U(false);
    }

    public void d() {
        this.f10584h.c((d) null);
    }

    public final void d0(C c4) {
        p pVar = this.f10582f;
        if (pVar != null) {
            pVar.t();
            c4.h();
        }
    }

    public final void f0(h hVar) {
        u uVar = this.f10580d;
        if (uVar == null) {
            b.e("PlatformViewsController", "null flutterView");
        } else {
            hVar.d(uVar);
        }
    }

    public void g0() {
    }

    public void h0() {
        this.f10594r.clear();
        this.f10595s.clear();
    }

    public void i0() {
        R();
    }

    public void j0(int i4, int i5, int i6, int i7, int i8) {
        if (this.f10589m.get(i4) != null) {
            Y();
            C0752c cVar = (C0752c) this.f10589m.get(i4);
            if (cVar.getParent() == null) {
                this.f10580d.addView(cVar);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i7, i8);
            layoutParams.leftMargin = i5;
            layoutParams.topMargin = i6;
            cVar.setLayoutParams(layoutParams);
            cVar.setVisibility(0);
            cVar.bringToFront();
            this.f10594r.add(Integer.valueOf(i4));
            return;
        }
        throw new IllegalStateException("The overlay surface (id:" + i4 + ") doesn't exist");
    }

    public void k0(int i4, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        Y();
        if (X(i4)) {
            S2.a aVar = (S2.a) this.f10588l.get(i4);
            aVar.a(flutterMutatorsStack, i5, i6, i7, i8);
            aVar.setVisibility(0);
            aVar.bringToFront();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10);
            View c4 = ((h) this.f10587k.get(i4)).c();
            if (c4 != null) {
                c4.setLayoutParams(layoutParams);
                c4.bringToFront();
            }
            this.f10595s.add(Integer.valueOf(i4));
        }
    }

    public void l0() {
        boolean z4 = false;
        if (!this.f10592p || !this.f10595s.isEmpty()) {
            if (this.f10592p && this.f10580d.k()) {
                z4 = true;
            }
            U(z4);
            return;
        }
        this.f10592p = false;
        this.f10580d.A(new p(this));
    }

    public void m0() {
        R();
    }

    public void n0() {
        for (C j4 : this.f10585i.values()) {
            j4.j();
        }
    }

    public void o0(int i4) {
        if (i4 >= 40) {
            for (C a4 : this.f10585i.values()) {
                a4.a();
            }
        }
    }

    public final void t0() {
        if (this.f10580d == null) {
            b.b("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i4 = 0; i4 < this.f10589m.size(); i4++) {
            this.f10580d.removeView((View) this.f10589m.valueAt(i4));
        }
        this.f10589m.clear();
    }

    public void u0(boolean z4) {
        this.f10597u = z4;
    }

    public final int v0(double d4) {
        return w0(d4, V());
    }

    public final int w0(double d4, float f4) {
        return (int) Math.round(d4 / ((double) f4));
    }

    public MotionEvent x0(float f4, q.f fVar, boolean z4) {
        q.f fVar2 = fVar;
        MotionEvent b4 = this.f10596t.b(G.a.c(fVar2.f3617p));
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) q0(fVar2.f3608g, f4).toArray(new MotionEvent.PointerCoords[fVar2.f3606e]);
        if (z4 || b4 == null) {
            return MotionEvent.obtain(fVar2.f3603b.longValue(), fVar2.f3604c.longValue(), fVar2.f3605d, fVar2.f3606e, (MotionEvent.PointerProperties[]) s0(fVar2.f3607f).toArray(new MotionEvent.PointerProperties[fVar2.f3606e]), pointerCoordsArr, fVar2.f3609h, fVar2.f3610i, fVar2.f3611j, fVar2.f3612k, fVar2.f3613l, fVar2.f3614m, fVar2.f3615n, fVar2.f3616o);
        }
        z0(b4, pointerCoordsArr);
        return b4;
    }

    public final int y0(double d4) {
        return (int) Math.round(d4 * ((double) V()));
    }
}
