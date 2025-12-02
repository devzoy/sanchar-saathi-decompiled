package N2;

import K0.c;
import K0.f;
import K0.j;
import N2.E;
import N2.l;
import a3.C0348a;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import g3.C0644h;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.n;
import io.flutter.plugin.editing.m;
import io.flutter.plugin.editing.p;
import io.flutter.view.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class u extends FrameLayout implements C0348a.c, E.e {

    /* renamed from: A  reason: collision with root package name */
    public w f1953A;

    /* renamed from: c  reason: collision with root package name */
    public m f1954c;

    /* renamed from: d  reason: collision with root package name */
    public n f1955d;

    /* renamed from: e  reason: collision with root package name */
    public l f1956e;

    /* renamed from: f  reason: collision with root package name */
    public n f1957f;

    /* renamed from: g  reason: collision with root package name */
    public n f1958g;

    /* renamed from: h  reason: collision with root package name */
    public final Set f1959h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1960i;

    /* renamed from: j  reason: collision with root package name */
    public io.flutter.embedding.engine.a f1961j;

    /* renamed from: k  reason: collision with root package name */
    public final Set f1962k;

    /* renamed from: l  reason: collision with root package name */
    public C0348a f1963l;

    /* renamed from: m  reason: collision with root package name */
    public p f1964m;

    /* renamed from: n  reason: collision with root package name */
    public io.flutter.plugin.editing.n f1965n;

    /* renamed from: o  reason: collision with root package name */
    public m f1966o;

    /* renamed from: p  reason: collision with root package name */
    public Z2.a f1967p;

    /* renamed from: q  reason: collision with root package name */
    public E f1968q;

    /* renamed from: r  reason: collision with root package name */
    public C0287a f1969r;

    /* renamed from: s  reason: collision with root package name */
    public io.flutter.view.d f1970s;

    /* renamed from: t  reason: collision with root package name */
    public TextServicesManager f1971t;

    /* renamed from: u  reason: collision with root package name */
    public J f1972u;

    /* renamed from: v  reason: collision with root package name */
    public final FlutterRenderer.h f1973v;

    /* renamed from: w  reason: collision with root package name */
    public final d.k f1974w;

    /* renamed from: x  reason: collision with root package name */
    public final ContentObserver f1975x;

    /* renamed from: y  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.m f1976y;

    /* renamed from: z  reason: collision with root package name */
    public R.a f1977z;

    public class a implements d.k {
        public a() {
        }

        public void a(boolean z4, boolean z5) {
            u.this.z(z4, z5);
        }
    }

    public class b extends ContentObserver {
        public b(Handler handler) {
            super(handler);
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z4) {
            super.onChange(z4);
            if (u.this.f1961j != null) {
                M2.b.f("FlutterView", "System settings changed. Sending user settings to Flutter.");
                u.this.B();
            }
        }
    }

    public class c implements io.flutter.embedding.engine.renderer.m {
        public c() {
        }

        public void d() {
            boolean unused = u.this.f1960i = false;
            for (io.flutter.embedding.engine.renderer.m d4 : u.this.f1959h) {
                d4.d();
            }
        }

        public void g() {
            boolean unused = u.this.f1960i = true;
            for (io.flutter.embedding.engine.renderer.m g4 : u.this.f1959h) {
                g4.g();
            }
        }
    }

    public class d implements io.flutter.embedding.engine.renderer.m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FlutterRenderer f1981a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Runnable f1982b;

        public d(FlutterRenderer flutterRenderer, Runnable runnable) {
            this.f1981a = flutterRenderer;
            this.f1982b = runnable;
        }

        public void d() {
        }

        public void g() {
            this.f1981a.t(this);
            this.f1982b.run();
            u uVar = u.this;
            if (!(uVar.f1957f instanceof l) && uVar.f1956e != null) {
                u.this.f1956e.a();
                u.this.x();
            }
        }
    }

    public enum e {
        NONE,
        LEFT,
        RIGHT,
        BOTH
    }

    public u(Context context, m mVar) {
        this(context, (AttributeSet) null, mVar);
    }

    public void A(Runnable runnable) {
        if (this.f1956e == null) {
            M2.b.f("FlutterView", "Tried to revert the image view, but no image view is used.");
            return;
        }
        n nVar = this.f1958g;
        if (nVar == null) {
            M2.b.f("FlutterView", "Tried to revert the image view, but no previous surface was used.");
            return;
        }
        this.f1957f = nVar;
        this.f1958g = null;
        FlutterRenderer t4 = this.f1961j.t();
        if (this.f1961j == null || t4 == null) {
            this.f1956e.a();
            x();
            runnable.run();
            return;
        }
        this.f1957f.b();
        t4.i(new d(t4, runnable));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r1 != false) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B() {
        /*
            r6 = this;
            android.content.res.Resources r0 = r6.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L_0x0013
            X2.u$c r0 = X2.u.c.dark
            goto L_0x0015
        L_0x0013:
            X2.u$c r0 = X2.u.c.light
        L_0x0015:
            android.view.textservice.TextServicesManager r1 = r6.f1971t
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x003e
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L_0x003c
            java.util.List r1 = r1.getEnabledSpellCheckerInfos()
            java.util.stream.Stream r1 = r1.stream()
            N2.s r4 = new N2.s
            r4.<init>()
            boolean r1 = r1.anyMatch(r4)
            android.view.textservice.TextServicesManager r4 = r6.f1971t
            boolean r4 = r4.isSpellCheckerEnabled()
            if (r4 == 0) goto L_0x003e
            if (r1 == 0) goto L_0x003e
        L_0x003c:
            r1 = r3
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            io.flutter.embedding.engine.a r4 = r6.f1961j
            X2.u r4 = r4.w()
            X2.u$b r4 = r4.d()
            android.content.res.Resources r5 = r6.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            X2.u$b r4 = r4.f(r5)
            android.content.res.Resources r5 = r6.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            X2.u$b r4 = r4.c(r5)
            X2.u$b r1 = r4.d(r1)
            android.content.Context r4 = r6.getContext()
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r5 = "show_password"
            int r4 = android.provider.Settings.System.getInt(r4, r5, r3)
            if (r4 != r3) goto L_0x0078
            r2 = r3
        L_0x0078:
            X2.u$b r1 = r1.b(r2)
            android.content.Context r2 = r6.getContext()
            boolean r2 = android.text.format.DateFormat.is24HourFormat(r2)
            X2.u$b r1 = r1.g(r2)
            X2.u$b r0 = r1.e(r0)
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.u.B():void");
    }

    public final void C() {
        if (!v()) {
            M2.b.g("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.f1973v.f10391a = getResources().getDisplayMetrics().density;
        this.f1973v.f10406p = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f1961j.t().x(this.f1973v);
    }

    public void a(KeyEvent keyEvent) {
        getRootView().dispatchKeyEvent(keyEvent);
    }

    public void autofill(SparseArray sparseArray) {
        this.f1964m.j(sparseArray);
    }

    public PointerIcon b(int i4) {
        return PointerIcon.getSystemIcon(getContext(), i4);
    }

    public boolean c(KeyEvent keyEvent) {
        return this.f1964m.q(keyEvent);
    }

    public boolean checkInputConnectionProxy(View view) {
        io.flutter.embedding.engine.a aVar = this.f1961j;
        return aVar != null ? aVar.q().G(view) : super.checkInputConnectionProxy(view);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            getKeyDispatcherState().startTracking(keyEvent, this);
        } else if (keyEvent.getAction() == 1) {
            getKeyDispatcherState().handleUpEvent(keyEvent);
        }
        return (v() && this.f1968q.b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        io.flutter.view.d dVar = this.f1970s;
        if (dVar == null || !dVar.A()) {
            return null;
        }
        return this.f1970s;
    }

    public io.flutter.embedding.engine.a getAttachedFlutterEngine() {
        return this.f1961j;
    }

    public Y2.b getBinaryMessenger() {
        return this.f1961j.k();
    }

    public l getCurrentImageSurface() {
        return this.f1956e;
    }

    public FlutterRenderer.h getViewportMetrics() {
        return this.f1973v;
    }

    public boolean k() {
        l lVar = this.f1956e;
        if (lVar != null) {
            return lVar.e();
        }
        return false;
    }

    public void l(io.flutter.embedding.engine.renderer.m mVar) {
        this.f1959h.add(mVar);
    }

    public void m(l lVar) {
        io.flutter.embedding.engine.a aVar = this.f1961j;
        if (aVar != null) {
            lVar.c(aVar.t());
        }
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        M2.b.f("FlutterView", "Attaching to a FlutterEngine: " + aVar);
        if (v()) {
            if (aVar == this.f1961j) {
                M2.b.f("FlutterView", "Already attached to this engine. Doing nothing.");
                return;
            } else {
                M2.b.f("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
                s();
            }
        }
        this.f1961j = aVar;
        FlutterRenderer t4 = aVar.t();
        this.f1960i = t4.m();
        this.f1957f.c(t4);
        t4.i(this.f1976y);
        this.f1963l = new C0348a(this, this.f1961j.n());
        this.f1964m = new p(this, this.f1961j.z(), this.f1961j.v(), this.f1961j.q());
        try {
            TextServicesManager textServicesManager = (TextServicesManager) getContext().getSystemService("textservices");
            this.f1971t = textServicesManager;
            this.f1965n = new io.flutter.plugin.editing.n(textServicesManager, this.f1961j.x());
        } catch (Exception unused) {
            M2.b.b("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
        }
        this.f1966o = new m(this, this.f1964m.p(), this.f1961j.v());
        this.f1967p = this.f1961j.m();
        this.f1968q = new E(this);
        this.f1969r = new C0287a(this.f1961j.t(), false);
        io.flutter.view.d dVar = new io.flutter.view.d(this, aVar.h(), (AccessibilityManager) getContext().getSystemService("accessibility"), getContext().getContentResolver(), this.f1961j.q());
        this.f1970s = dVar;
        dVar.Y(this.f1974w);
        z(this.f1970s.A(), this.f1970s.C());
        this.f1961j.q().a(this.f1970s);
        this.f1961j.q().E(this.f1961j.t());
        this.f1964m.p().restartInput(this);
        B();
        getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, this.f1975x);
        C();
        aVar.q().F(this);
        Iterator it = this.f1962k.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        } else if (this.f1960i) {
            this.f1976y.g();
        }
    }

    public e o() {
        Context context = getContext();
        if (context.getResources().getConfiguration().orientation == 2) {
            int rotation = ((DisplayManager) context.getSystemService("display")).getDisplay(0).getRotation();
            if (rotation == 1) {
                return e.RIGHT;
            }
            if (rotation == 3) {
                return e.LEFT;
            }
            if (rotation == 0 || rotation == 2) {
                return e.BOTH;
            }
        }
        return e.NONE;
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets onApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 == 29) {
            Insets a4 = windowInsets.getSystemGestureInsets();
            this.f1973v.f10402l = a4.top;
            this.f1973v.f10403m = a4.right;
            this.f1973v.f10404n = a4.bottom;
            this.f1973v.f10405o = a4.left;
        }
        boolean z4 = true;
        boolean z5 = (getWindowSystemUiVisibility() & 4) == 0;
        if ((getWindowSystemUiVisibility() & 2) != 0) {
            z4 = false;
        }
        if (i4 >= 30) {
            Insets a5 = windowInsets.getInsets(WindowInsets.Type.systemBars());
            this.f1973v.f10394d = a5.top;
            this.f1973v.f10395e = a5.right;
            this.f1973v.f10396f = a5.bottom;
            this.f1973v.f10397g = a5.left;
            Insets a6 = windowInsets.getInsets(WindowInsets.Type.ime());
            this.f1973v.f10398h = a6.top;
            this.f1973v.f10399i = a6.right;
            this.f1973v.f10400j = a6.bottom;
            this.f1973v.f10401k = a6.left;
            Insets a7 = windowInsets.getInsets(WindowInsets.Type.systemGestures());
            this.f1973v.f10402l = a7.top;
            this.f1973v.f10403m = a7.right;
            this.f1973v.f10404n = a7.bottom;
            this.f1973v.f10405o = a7.left;
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                Insets a8 = displayCutout.getWaterfallInsets();
                FlutterRenderer.h hVar = this.f1973v;
                hVar.f10394d = Math.max(Math.max(hVar.f10394d, a8.top), displayCutout.getSafeInsetTop());
                FlutterRenderer.h hVar2 = this.f1973v;
                hVar2.f10395e = Math.max(Math.max(hVar2.f10395e, a8.right), displayCutout.getSafeInsetRight());
                FlutterRenderer.h hVar3 = this.f1973v;
                hVar3.f10396f = Math.max(Math.max(hVar3.f10396f, a8.bottom), displayCutout.getSafeInsetBottom());
                FlutterRenderer.h hVar4 = this.f1973v;
                hVar4.f10397g = Math.max(Math.max(hVar4.f10397g, a8.left), displayCutout.getSafeInsetLeft());
            }
        } else {
            e eVar = e.NONE;
            if (!z4) {
                eVar = o();
            }
            this.f1973v.f10394d = z5 ? windowInsets.getSystemWindowInsetTop() : 0;
            this.f1973v.f10395e = (eVar == e.RIGHT || eVar == e.BOTH) ? 0 : windowInsets.getSystemWindowInsetRight();
            this.f1973v.f10396f = (!z4 || t(windowInsets) != 0) ? 0 : windowInsets.getSystemWindowInsetBottom();
            this.f1973v.f10397g = (eVar == e.LEFT || eVar == e.BOTH) ? 0 : windowInsets.getSystemWindowInsetLeft();
            FlutterRenderer.h hVar5 = this.f1973v;
            hVar5.f10398h = 0;
            hVar5.f10399i = 0;
            hVar5.f10400j = t(windowInsets);
            this.f1973v.f10401k = 0;
        }
        ArrayList arrayList = new ArrayList();
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        if (displayCutout2 != null) {
            for (Rect next : displayCutout2.getBoundingRects()) {
                M2.b.f("FlutterView", "DisplayCutout area reported with bounds = " + next.toString());
                arrayList.add(new FlutterRenderer.c(next, FlutterRenderer.e.CUTOUT, FlutterRenderer.d.UNKNOWN));
            }
        }
        this.f1973v.c(arrayList);
        if (Build.VERSION.SDK_INT >= 35) {
            this.f1953A.c(getContext(), this.f1973v);
        }
        M2.b.f("FlutterView", "Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: " + this.f1973v.f10394d + ", Left: " + this.f1973v.f10397g + ", Right: " + this.f1973v.f10395e + "\nKeyboard insets: Bottom: " + this.f1973v.f10400j + ", Left: " + this.f1973v.f10401k + ", Right: " + this.f1973v.f10399i + "System Gesture Insets - Left: " + this.f1973v.f10405o + ", Top: " + this.f1973v.f10402l + ", Right: " + this.f1973v.f10403m + ", Bottom: " + this.f1973v.f10400j);
        C();
        return onApplyWindowInsets;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1972u = r();
        Activity e4 = C0644h.e(getContext());
        if (this.f1972u != null && e4 != null) {
            this.f1977z = new t(this);
            this.f1972u.a(e4, H.a.g(getContext()), this.f1977z);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f1961j != null) {
            M2.b.f("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
            this.f1967p.d(configuration);
            B();
            C0644h.c(getContext(), this.f1961j);
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return !v() ? super.onCreateInputConnection(editorInfo) : this.f1964m.n(this, this.f1968q, editorInfo);
    }

    public void onDetachedFromWindow() {
        R.a aVar;
        J j4 = this.f1972u;
        if (!(j4 == null || (aVar = this.f1977z) == null)) {
            j4.b(aVar);
        }
        this.f1977z = null;
        this.f1972u = null;
        super.onDetachedFromWindow();
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!v() || !this.f1969r.i(motionEvent, getContext())) {
            return super.onGenericMotionEvent(motionEvent);
        }
        return true;
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return !v() ? super.onHoverEvent(motionEvent) : this.f1970s.J(motionEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i4) {
        super.onProvideAutofillVirtualStructure(viewStructure, i4);
        this.f1964m.y(viewStructure, i4);
    }

    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        M2.b.f("FlutterView", "Size changed. Sending Flutter new viewport metrics. FlutterView was " + i6 + " x " + i7 + ", it is now " + i4 + " x " + i5);
        FlutterRenderer.h hVar = this.f1973v;
        hVar.f10392b = i4;
        hVar.f10393c = i5;
        C();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!v()) {
            return super.onTouchEvent(motionEvent);
        }
        requestUnbufferedDispatch(motionEvent);
        return this.f1969r.j(motionEvent);
    }

    public void p() {
        this.f1957f.d();
        l lVar = this.f1956e;
        if (lVar == null) {
            l q4 = q();
            this.f1956e = q4;
            addView(q4);
        } else {
            lVar.k(getWidth(), getHeight());
        }
        this.f1958g = this.f1957f;
        l lVar2 = this.f1956e;
        this.f1957f = lVar2;
        io.flutter.embedding.engine.a aVar = this.f1961j;
        if (aVar != null) {
            lVar2.c(aVar.t());
        }
    }

    public l q() {
        return new l(getContext(), getWidth(), getHeight(), l.b.background);
    }

    public J r() {
        try {
            return new J(new J0.a(f.f1654a.d(getContext())));
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public void s() {
        M2.b.f("FlutterView", "Detaching from a FlutterEngine: " + this.f1961j);
        if (!v()) {
            M2.b.f("FlutterView", "FlutterView not attached to an engine. Not detaching.");
            return;
        }
        Iterator it = this.f1962k.iterator();
        if (!it.hasNext()) {
            getContext().getContentResolver().unregisterContentObserver(this.f1975x);
            this.f1961j.q().P();
            this.f1961j.q().d();
            this.f1970s.Q();
            this.f1970s = null;
            this.f1964m.p().restartInput(this);
            this.f1964m.o();
            this.f1968q.d();
            io.flutter.plugin.editing.n nVar = this.f1965n;
            if (nVar != null) {
                nVar.b();
            }
            C0348a aVar = this.f1963l;
            if (aVar != null) {
                aVar.c();
            }
            FlutterRenderer t4 = this.f1961j.t();
            this.f1960i = false;
            t4.t(this.f1976y);
            t4.z();
            t4.w(false);
            n nVar2 = this.f1958g;
            if (nVar2 != null && this.f1957f == this.f1956e) {
                this.f1957f = nVar2;
            }
            this.f1957f.a();
            x();
            this.f1958g = null;
            this.f1961j = null;
            return;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    public void setDelegate(w wVar) {
        this.f1953A = wVar;
    }

    public void setVisibility(int i4) {
        super.setVisibility(i4);
        n nVar = this.f1957f;
        if (nVar instanceof m) {
            ((m) nVar).setVisibility(i4);
        }
    }

    public void setWindowInfoListenerDisplayFeatures(j jVar) {
        List<K0.a> a4 = jVar.a();
        ArrayList arrayList = new ArrayList();
        for (K0.a aVar : a4) {
            M2.b.f("FlutterView", "WindowInfoTracker Display Feature reported with bounds = " + aVar.a().toString() + " and type = " + aVar.getClass().getSimpleName());
            if (aVar instanceof K0.c) {
                K0.c cVar = (K0.c) aVar;
                arrayList.add(new FlutterRenderer.c(aVar.a(), cVar.b() == c.a.f1633d ? FlutterRenderer.e.HINGE : FlutterRenderer.e.FOLD, cVar.getState() == c.b.f1636c ? FlutterRenderer.d.POSTURE_FLAT : cVar.getState() == c.b.f1637d ? FlutterRenderer.d.POSTURE_HALF_OPENED : FlutterRenderer.d.UNKNOWN));
            } else {
                arrayList.add(new FlutterRenderer.c(aVar.a(), FlutterRenderer.e.UNKNOWN, FlutterRenderer.d.UNKNOWN));
            }
        }
        this.f1973v.d(arrayList);
        C();
    }

    public final int t(WindowInsets windowInsets) {
        if (((double) windowInsets.getSystemWindowInsetBottom()) < ((double) getRootView().getHeight()) * 0.18d) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    public final void u() {
        M2.b.f("FlutterView", "Initializing FlutterView");
        if (this.f1954c != null) {
            M2.b.f("FlutterView", "Internally using a FlutterSurfaceView.");
            addView(this.f1954c);
        } else if (this.f1955d != null) {
            M2.b.f("FlutterView", "Internally using a FlutterTextureView.");
            addView(this.f1955d);
        } else {
            M2.b.f("FlutterView", "Internally using a FlutterImageView.");
            addView(this.f1956e);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAutofill(1);
    }

    public boolean v() {
        io.flutter.embedding.engine.a aVar = this.f1961j;
        return aVar != null && aVar.t() == this.f1957f.getAttachedRenderer();
    }

    public final void x() {
        l lVar = this.f1956e;
        if (lVar != null) {
            lVar.g();
            removeView(this.f1956e);
            this.f1956e = null;
        }
    }

    public void y(io.flutter.embedding.engine.renderer.m mVar) {
        this.f1959h.remove(mVar);
    }

    public final void z(boolean z4, boolean z5) {
        boolean z6 = false;
        if (!this.f1961j.t().n()) {
            if (!z4 && !z5) {
                z6 = true;
            }
            setWillNotDraw(z6);
            return;
        }
        setWillNotDraw(false);
    }

    public u(Context context, n nVar) {
        this(context, (AttributeSet) null, nVar);
    }

    public u(Context context, AttributeSet attributeSet, m mVar) {
        super(context, attributeSet);
        this.f1959h = new HashSet();
        this.f1962k = new HashSet();
        this.f1973v = new FlutterRenderer.h();
        this.f1974w = new a();
        this.f1975x = new b(new Handler(Looper.getMainLooper()));
        this.f1976y = new c();
        this.f1953A = new w();
        this.f1954c = mVar;
        this.f1957f = mVar;
        u();
    }

    public u(Context context, AttributeSet attributeSet, n nVar) {
        super(context, attributeSet);
        this.f1959h = new HashSet();
        this.f1962k = new HashSet();
        this.f1973v = new FlutterRenderer.h();
        this.f1974w = new a();
        this.f1975x = new b(new Handler(Looper.getMainLooper()));
        this.f1976y = new c();
        this.f1953A = new w();
        this.f1955d = nVar;
        this.f1957f = nVar;
        u();
    }
}
