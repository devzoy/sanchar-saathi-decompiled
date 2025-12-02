package i;

import I.b;
import S.C;
import S.C0318i;
import S.C0319j;
import S.C0330v;
import S.K;
import S.L;
import S.M;
import S.O;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.C0384k;
import h.C0645a;
import h.C0647c;
import j.C0754a;
import java.util.List;
import n.b;
import n.f;
import org.xmlpull.v1.XmlPullParser;
import p.C0829D;
import p.C0842i;
import p.f0;
import p.h0;
import p.i0;

/* renamed from: i.e  reason: case insensitive filesystem */
public class C0678e extends C0677d implements e.a, LayoutInflater.Factory2 {

    /* renamed from: c0  reason: collision with root package name */
    public static final v.g f9646c0 = new v.g();

    /* renamed from: d0  reason: collision with root package name */
    public static final boolean f9647d0 = false;

    /* renamed from: e0  reason: collision with root package name */
    public static final int[] f9648e0 = {16842836};

    /* renamed from: f0  reason: collision with root package name */
    public static final boolean f9649f0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: g0  reason: collision with root package name */
    public static final boolean f9650g0 = true;

    /* renamed from: A  reason: collision with root package name */
    public boolean f9651A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f9652B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f9653C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f9654D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f9655E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f9656F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f9657G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f9658H;

    /* renamed from: I  reason: collision with root package name */
    public q[] f9659I;

    /* renamed from: J  reason: collision with root package name */
    public q f9660J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f9661K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f9662L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f9663M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f9664N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f9665O;

    /* renamed from: P  reason: collision with root package name */
    public int f9666P;

    /* renamed from: Q  reason: collision with root package name */
    public int f9667Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f9668R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f9669S;

    /* renamed from: T  reason: collision with root package name */
    public j f9670T;

    /* renamed from: U  reason: collision with root package name */
    public j f9671U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f9672V;

    /* renamed from: W  reason: collision with root package name */
    public int f9673W;

    /* renamed from: X  reason: collision with root package name */
    public final Runnable f9674X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f9675Y;

    /* renamed from: Z  reason: collision with root package name */
    public Rect f9676Z;

    /* renamed from: a0  reason: collision with root package name */
    public Rect f9677a0;

    /* renamed from: b0  reason: collision with root package name */
    public g f9678b0;

    /* renamed from: f  reason: collision with root package name */
    public final Object f9679f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f9680g;

    /* renamed from: h  reason: collision with root package name */
    public Window f9681h;

    /* renamed from: i  reason: collision with root package name */
    public h f9682i;

    /* renamed from: j  reason: collision with root package name */
    public final C0676c f9683j;

    /* renamed from: k  reason: collision with root package name */
    public C0674a f9684k;

    /* renamed from: l  reason: collision with root package name */
    public MenuInflater f9685l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f9686m;

    /* renamed from: n  reason: collision with root package name */
    public C0829D f9687n;

    /* renamed from: o  reason: collision with root package name */
    public f f9688o;

    /* renamed from: p  reason: collision with root package name */
    public r f9689p;

    /* renamed from: q  reason: collision with root package name */
    public n.b f9690q;

    /* renamed from: r  reason: collision with root package name */
    public ActionBarContextView f9691r;

    /* renamed from: s  reason: collision with root package name */
    public PopupWindow f9692s;

    /* renamed from: t  reason: collision with root package name */
    public Runnable f9693t;

    /* renamed from: u  reason: collision with root package name */
    public K f9694u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9695v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f9696w;

    /* renamed from: x  reason: collision with root package name */
    public ViewGroup f9697x;

    /* renamed from: y  reason: collision with root package name */
    public TextView f9698y;

    /* renamed from: z  reason: collision with root package name */
    public View f9699z;

    /* renamed from: i.e$a */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            C0678e eVar = C0678e.this;
            if ((eVar.f9673W & 1) != 0) {
                eVar.U(0);
            }
            C0678e eVar2 = C0678e.this;
            if ((eVar2.f9673W & 4096) != 0) {
                eVar2.U(108);
            }
            C0678e eVar3 = C0678e.this;
            eVar3.f9672V = false;
            eVar3.f9673W = 0;
        }
    }

    /* renamed from: i.e$b */
    public class b implements C0330v {
        public b() {
        }

        public O a(View view, O o4) {
            int l4 = o4.l();
            int L02 = C0678e.this.L0(o4, (Rect) null);
            if (l4 != L02) {
                o4 = o4.p(o4.j(), L02, o4.k(), o4.i());
            }
            return C.T(view, o4);
        }
    }

    /* renamed from: i.e$c */
    public class c implements ContentFrameLayout.a {
        public c() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            C0678e.this.S();
        }
    }

    /* renamed from: i.e$d */
    public class d implements Runnable {

        /* renamed from: i.e$d$a */
        public class a extends M {
            public a() {
            }

            public void b(View view) {
                C0678e.this.f9691r.setAlpha(1.0f);
                C0678e.this.f9694u.h((L) null);
                C0678e.this.f9694u = null;
            }

            public void c(View view) {
                C0678e.this.f9691r.setVisibility(0);
            }
        }

        public d() {
        }

        public void run() {
            C0678e eVar = C0678e.this;
            eVar.f9692s.showAtLocation(eVar.f9691r, 55, 0, 0);
            C0678e.this.V();
            if (C0678e.this.D0()) {
                C0678e.this.f9691r.setAlpha(0.0f);
                C0678e eVar2 = C0678e.this;
                eVar2.f9694u = C.d(eVar2.f9691r).b(1.0f);
                C0678e.this.f9694u.h(new a());
                return;
            }
            C0678e.this.f9691r.setAlpha(1.0f);
            C0678e.this.f9691r.setVisibility(0);
        }
    }

    /* renamed from: i.e$e  reason: collision with other inner class name */
    public class C0166e extends M {
        public C0166e() {
        }

        public void b(View view) {
            C0678e.this.f9691r.setAlpha(1.0f);
            C0678e.this.f9694u.h((L) null);
            C0678e.this.f9694u = null;
        }

        public void c(View view) {
            C0678e.this.f9691r.setVisibility(0);
            C0678e.this.f9691r.sendAccessibilityEvent(32);
            if (C0678e.this.f9691r.getParent() instanceof View) {
                C.d0((View) C0678e.this.f9691r.getParent());
            }
        }
    }

    /* renamed from: i.e$f */
    public final class f implements i.a {
        public f() {
        }

        public void b(e eVar, boolean z4) {
            C0678e.this.L(eVar);
        }

        public boolean c(e eVar) {
            Window.Callback f02 = C0678e.this.f0();
            if (f02 == null) {
                return true;
            }
            f02.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: i.e$g */
    public class g implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public b.a f9707a;

        /* renamed from: i.e$g$a */
        public class a extends M {
            public a() {
            }

            public void b(View view) {
                C0678e.this.f9691r.setVisibility(8);
                C0678e eVar = C0678e.this;
                PopupWindow popupWindow = eVar.f9692s;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.f9691r.getParent() instanceof View) {
                    C.d0((View) C0678e.this.f9691r.getParent());
                }
                C0678e.this.f9691r.removeAllViews();
                C0678e.this.f9694u.h((L) null);
                C0678e eVar2 = C0678e.this;
                eVar2.f9694u = null;
                C.d0(eVar2.f9697x);
            }
        }

        public g(b.a aVar) {
            this.f9707a = aVar;
        }

        public boolean a(n.b bVar, Menu menu) {
            return this.f9707a.a(bVar, menu);
        }

        public boolean b(n.b bVar, MenuItem menuItem) {
            return this.f9707a.b(bVar, menuItem);
        }

        public void c(n.b bVar) {
            this.f9707a.c(bVar);
            C0678e eVar = C0678e.this;
            if (eVar.f9692s != null) {
                eVar.f9681h.getDecorView().removeCallbacks(C0678e.this.f9693t);
            }
            C0678e eVar2 = C0678e.this;
            if (eVar2.f9691r != null) {
                eVar2.V();
                C0678e eVar3 = C0678e.this;
                eVar3.f9694u = C.d(eVar3.f9691r).b(0.0f);
                C0678e.this.f9694u.h(new a());
            }
            C0678e eVar4 = C0678e.this;
            C0676c cVar = eVar4.f9683j;
            if (cVar != null) {
                cVar.j(eVar4.f9690q);
            }
            C0678e eVar5 = C0678e.this;
            eVar5.f9690q = null;
            C.d0(eVar5.f9697x);
        }

        public boolean d(n.b bVar, Menu menu) {
            C.d0(C0678e.this.f9697x);
            return this.f9707a.d(bVar, menu);
        }
    }

    /* renamed from: i.e$h */
    public class h extends n.i {
        public h(Window.Callback callback) {
            super(callback);
        }

        public final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(C0678e.this.f9680g, callback);
            n.b F02 = C0678e.this.F0(aVar);
            if (F02 != null) {
                return aVar.e(F02);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0678e.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || C0678e.this.r0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i4, Menu menu) {
            if (i4 != 0 || (menu instanceof e)) {
                return super.onCreatePanelMenu(i4, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i4, Menu menu) {
            super.onMenuOpened(i4, menu);
            C0678e.this.u0(i4);
            return true;
        }

        public void onPanelClosed(int i4, Menu menu) {
            super.onPanelClosed(i4, menu);
            C0678e.this.v0(i4);
        }

        public boolean onPreparePanel(int i4, View view, Menu menu) {
            e eVar = menu instanceof e ? (e) menu : null;
            if (i4 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i4, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List list, Menu menu, int i4) {
            e eVar;
            q d02 = C0678e.this.d0(0, true);
            if (d02 == null || (eVar = d02.f9728j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i4);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i4);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i4) {
            if (!C0678e.this.m0() || i4 != 0) {
                return super.onWindowStartingActionMode(callback, i4);
            }
            return b(callback);
        }
    }

    /* renamed from: i.e$i */
    public class i extends j {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f9711c;

        public i(Context context) {
            super();
            this.f9711c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return this.f9711c.isPowerSaveMode() ? 2 : 1;
        }

        public void d() {
            C0678e.this.F();
        }
    }

    /* renamed from: i.e$j */
    public abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f9713a;

        /* renamed from: i.e$j$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            public void onReceive(Context context, Intent intent) {
                j.this.d();
            }
        }

        public j() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f9713a;
            if (broadcastReceiver != null) {
                try {
                    C0678e.this.f9680g.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f9713a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b4 = b();
            if (b4 != null && b4.countActions() != 0) {
                if (this.f9713a == null) {
                    this.f9713a = new a();
                }
                C0678e.this.f9680g.registerReceiver(this.f9713a, b4);
            }
        }
    }

    /* renamed from: i.e$k */
    public class k extends j {

        /* renamed from: c  reason: collision with root package name */
        public final i f9716c;

        public k(i iVar) {
            super();
            this.f9716c = iVar;
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.f9716c.d() ? 2 : 1;
        }

        public void d() {
            C0678e.this.F();
        }
    }

    /* renamed from: i.e$l */
    public static class l {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i4 = configuration.densityDpi;
            int i5 = configuration2.densityDpi;
            if (i4 != i5) {
                configuration3.densityDpi = i5;
            }
        }
    }

    /* renamed from: i.e$m */
    public static class m {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* renamed from: i.e$n */
    public static class n {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i4 = configuration.colorMode & 3;
            int i5 = configuration2.colorMode;
            if (i4 != (i5 & 3)) {
                configuration3.colorMode |= i5 & 3;
            }
            int i6 = configuration.colorMode & 12;
            int i7 = configuration2.colorMode;
            if (i6 != (i7 & 12)) {
                configuration3.colorMode |= i7 & 12;
            }
        }
    }

    /* renamed from: i.e$o */
    public static class o {
        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: i.e$p */
    public class p extends ContentFrameLayout {
        public p(Context context) {
            super(context);
        }

        public final boolean b(int i4, int i5) {
            return i4 < -5 || i5 < -5 || i4 > getWidth() + 5 || i5 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return C0678e.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            C0678e.this.N(0);
            return true;
        }

        public void setBackgroundResource(int i4) {
            setBackgroundDrawable(C0754a.b(getContext(), i4));
        }
    }

    /* renamed from: i.e$q */
    public static final class q {

        /* renamed from: a  reason: collision with root package name */
        public int f9719a;

        /* renamed from: b  reason: collision with root package name */
        public int f9720b;

        /* renamed from: c  reason: collision with root package name */
        public int f9721c;

        /* renamed from: d  reason: collision with root package name */
        public int f9722d;

        /* renamed from: e  reason: collision with root package name */
        public int f9723e;

        /* renamed from: f  reason: collision with root package name */
        public int f9724f;

        /* renamed from: g  reason: collision with root package name */
        public ViewGroup f9725g;

        /* renamed from: h  reason: collision with root package name */
        public View f9726h;

        /* renamed from: i  reason: collision with root package name */
        public View f9727i;

        /* renamed from: j  reason: collision with root package name */
        public e f9728j;

        /* renamed from: k  reason: collision with root package name */
        public androidx.appcompat.view.menu.c f9729k;

        /* renamed from: l  reason: collision with root package name */
        public Context f9730l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f9731m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f9732n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f9733o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f9734p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f9735q = false;

        /* renamed from: r  reason: collision with root package name */
        public boolean f9736r;

        /* renamed from: s  reason: collision with root package name */
        public Bundle f9737s;

        public q(int i4) {
            this.f9719a = i4;
        }

        public androidx.appcompat.view.menu.j a(i.a aVar) {
            if (this.f9728j == null) {
                return null;
            }
            if (this.f9729k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f9730l, h.g.f9304j);
                this.f9729k = cVar;
                cVar.k(aVar);
                this.f9728j.b(this.f9729k);
            }
            return this.f9729k.c(this.f9725g);
        }

        public boolean b() {
            if (this.f9726h == null) {
                return false;
            }
            if (this.f9727i != null) {
                return true;
            }
            return this.f9729k.a().getCount() > 0;
        }

        public void c(e eVar) {
            androidx.appcompat.view.menu.c cVar;
            e eVar2 = this.f9728j;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.O(this.f9729k);
                }
                this.f9728j = eVar;
                if (eVar != null && (cVar = this.f9729k) != null) {
                    eVar.b(cVar);
                }
            }
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C0645a.f9167a, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                newTheme.applyStyle(i4, true);
            }
            newTheme.resolveAttribute(C0645a.f9157B, typedValue, true);
            int i5 = typedValue.resourceId;
            if (i5 != 0) {
                newTheme.applyStyle(i5, true);
            } else {
                newTheme.applyStyle(h.i.f9326a, true);
            }
            n.d dVar = new n.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f9730l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(h.j.f9576z0);
            this.f9720b = obtainStyledAttributes.getResourceId(h.j.f9340C0, 0);
            this.f9724f = obtainStyledAttributes.getResourceId(h.j.f9335B0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: i.e$r */
    public final class r implements i.a {
        public r() {
        }

        public void b(e eVar, boolean z4) {
            e D4 = eVar.D();
            boolean z5 = D4 != eVar;
            C0678e eVar2 = C0678e.this;
            if (z5) {
                eVar = D4;
            }
            q Y3 = eVar2.Y(eVar);
            if (Y3 == null) {
                return;
            }
            if (z5) {
                C0678e.this.K(Y3.f9719a, Y3, D4);
                C0678e.this.O(Y3, true);
                return;
            }
            C0678e.this.O(Y3, z4);
        }

        public boolean c(e eVar) {
            Window.Callback f02;
            if (eVar != eVar.D()) {
                return true;
            }
            C0678e eVar2 = C0678e.this;
            if (!eVar2.f9653C || (f02 = eVar2.f0()) == null || C0678e.this.f9665O) {
                return true;
            }
            f02.onMenuOpened(108, eVar);
            return true;
        }
    }

    public C0678e(Activity activity, C0676c cVar) {
        this(activity, (Window) null, cVar, activity);
    }

    public static Configuration Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f4 = configuration.fontScale;
            float f5 = configuration2.fontScale;
            if (f4 != f5) {
                configuration3.fontScale = f5;
            }
            int i4 = configuration.mcc;
            int i5 = configuration2.mcc;
            if (i4 != i5) {
                configuration3.mcc = i5;
            }
            int i6 = configuration.mnc;
            int i7 = configuration2.mnc;
            if (i6 != i7) {
                configuration3.mnc = i7;
            }
            m.a(configuration, configuration2, configuration3);
            int i8 = configuration.touchscreen;
            int i9 = configuration2.touchscreen;
            if (i8 != i9) {
                configuration3.touchscreen = i9;
            }
            int i10 = configuration.keyboard;
            int i11 = configuration2.keyboard;
            if (i10 != i11) {
                configuration3.keyboard = i11;
            }
            int i12 = configuration.keyboardHidden;
            int i13 = configuration2.keyboardHidden;
            if (i12 != i13) {
                configuration3.keyboardHidden = i13;
            }
            int i14 = configuration.navigation;
            int i15 = configuration2.navigation;
            if (i14 != i15) {
                configuration3.navigation = i15;
            }
            int i16 = configuration.navigationHidden;
            int i17 = configuration2.navigationHidden;
            if (i16 != i17) {
                configuration3.navigationHidden = i17;
            }
            int i18 = configuration.orientation;
            int i19 = configuration2.orientation;
            if (i18 != i19) {
                configuration3.orientation = i19;
            }
            int i20 = configuration.screenLayout & 15;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 15)) {
                configuration3.screenLayout |= i21 & 15;
            }
            int i22 = configuration.screenLayout & 192;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 192)) {
                configuration3.screenLayout |= i23 & 192;
            }
            int i24 = configuration.screenLayout & 48;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 48)) {
                configuration3.screenLayout |= i25 & 48;
            }
            int i26 = configuration.screenLayout & 768;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 768)) {
                configuration3.screenLayout |= i27 & 768;
            }
            n.a(configuration, configuration2, configuration3);
            int i28 = configuration.uiMode & 15;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 15)) {
                configuration3.uiMode |= i29 & 15;
            }
            int i30 = configuration.uiMode & 48;
            int i31 = configuration2.uiMode;
            if (i30 != (i31 & 48)) {
                configuration3.uiMode |= i31 & 48;
            }
            int i32 = configuration.screenWidthDp;
            int i33 = configuration2.screenWidthDp;
            if (i32 != i33) {
                configuration3.screenWidthDp = i33;
            }
            int i34 = configuration.screenHeightDp;
            int i35 = configuration2.screenHeightDp;
            if (i34 != i35) {
                configuration3.screenHeightDp = i35;
            }
            int i36 = configuration.smallestScreenWidthDp;
            int i37 = configuration2.smallestScreenWidthDp;
            if (i36 != i37) {
                configuration3.smallestScreenWidthDp = i37;
            }
            l.a(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    public void A(int i4) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.f9697x.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f9680g).inflate(i4, viewGroup);
        this.f9682i.a().onContentChanged();
    }

    public final boolean A0(q qVar, KeyEvent keyEvent) {
        C0829D d4;
        C0829D d5;
        C0829D d6;
        if (this.f9665O) {
            return false;
        }
        if (qVar.f9731m) {
            return true;
        }
        q qVar2 = this.f9660J;
        if (!(qVar2 == null || qVar2 == qVar)) {
            O(qVar2, false);
        }
        Window.Callback f02 = f0();
        if (f02 != null) {
            qVar.f9727i = f02.onCreatePanelView(qVar.f9719a);
        }
        int i4 = qVar.f9719a;
        boolean z4 = i4 == 0 || i4 == 108;
        if (z4 && (d6 = this.f9687n) != null) {
            d6.d();
        }
        if (qVar.f9727i == null) {
            if (z4) {
                y0();
            }
            e eVar = qVar.f9728j;
            if (eVar == null || qVar.f9736r) {
                if (eVar == null && (!j0(qVar) || qVar.f9728j == null)) {
                    return false;
                }
                if (z4 && this.f9687n != null) {
                    if (this.f9688o == null) {
                        this.f9688o = new f();
                    }
                    this.f9687n.b(qVar.f9728j, this.f9688o);
                }
                qVar.f9728j.d0();
                if (!f02.onCreatePanelMenu(qVar.f9719a, qVar.f9728j)) {
                    qVar.c((e) null);
                    if (z4 && (d5 = this.f9687n) != null) {
                        d5.b((Menu) null, this.f9688o);
                    }
                    return false;
                }
                qVar.f9736r = false;
            }
            qVar.f9728j.d0();
            Bundle bundle = qVar.f9737s;
            if (bundle != null) {
                qVar.f9728j.P(bundle);
                qVar.f9737s = null;
            }
            if (!f02.onPreparePanel(0, qVar.f9727i, qVar.f9728j)) {
                if (z4 && (d4 = this.f9687n) != null) {
                    d4.b((Menu) null, this.f9688o);
                }
                qVar.f9728j.c0();
                return false;
            }
            boolean z5 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            qVar.f9734p = z5;
            qVar.f9728j.setQwertyMode(z5);
            qVar.f9728j.c0();
        }
        qVar.f9731m = true;
        qVar.f9732n = false;
        this.f9660J = qVar;
        return true;
    }

    public void B(View view) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.f9697x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f9682i.a().onContentChanged();
    }

    public final void B0(boolean z4) {
        C0829D d4 = this.f9687n;
        if (d4 == null || !d4.h() || (ViewConfiguration.get(this.f9680g).hasPermanentMenuKey() && !this.f9687n.e())) {
            q d02 = d0(0, true);
            d02.f9735q = true;
            O(d02, false);
            x0(d02, (KeyEvent) null);
            return;
        }
        Window.Callback f02 = f0();
        if (this.f9687n.c() && z4) {
            this.f9687n.f();
            if (!this.f9665O) {
                f02.onPanelClosed(108, d0(0, true).f9728j);
            }
        } else if (f02 != null && !this.f9665O) {
            if (this.f9672V && (this.f9673W & 1) != 0) {
                this.f9681h.getDecorView().removeCallbacks(this.f9674X);
                this.f9674X.run();
            }
            q d03 = d0(0, true);
            e eVar = d03.f9728j;
            if (eVar != null && !d03.f9736r && f02.onPreparePanel(0, d03.f9727i, eVar)) {
                f02.onMenuOpened(108, d03.f9728j);
                this.f9687n.g();
            }
        }
    }

    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.f9697x.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f9682i.a().onContentChanged();
    }

    public final int C0(int i4) {
        if (i4 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i4 != 9) {
            return i4;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    public void D(int i4) {
        this.f9667Q = i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f9697x;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean D0() {
        /*
            r1 = this;
            boolean r0 = r1.f9696w
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f9697x
            if (r0 == 0) goto L_0x0010
            boolean r0 = S.C.M(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0678e.D0():boolean");
    }

    public final void E(CharSequence charSequence) {
        this.f9686m = charSequence;
        C0829D d4 = this.f9687n;
        if (d4 != null) {
            d4.setWindowTitle(charSequence);
        } else if (y0() != null) {
            y0().t(charSequence);
        } else {
            TextView textView = this.f9698y;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public final boolean E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f9681h.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C.L((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public boolean F() {
        return G(true);
    }

    public n.b F0(b.a aVar) {
        C0676c cVar;
        if (aVar != null) {
            n.b bVar = this.f9690q;
            if (bVar != null) {
                bVar.c();
            }
            g gVar = new g(aVar);
            C0674a m4 = m();
            if (m4 != null) {
                n.b u4 = m4.u(gVar);
                this.f9690q = u4;
                if (!(u4 == null || (cVar = this.f9683j) == null)) {
                    cVar.v(u4);
                }
            }
            if (this.f9690q == null) {
                this.f9690q = G0(gVar);
            }
            return this.f9690q;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public final boolean G(boolean z4) {
        if (this.f9665O) {
            return false;
        }
        int J4 = J();
        boolean J02 = J0(n0(this.f9680g, J4), z4);
        if (J4 == 0) {
            c0(this.f9680g).e();
        } else {
            j jVar = this.f9670T;
            if (jVar != null) {
                jVar.a();
            }
        }
        if (J4 == 3) {
            b0(this.f9680g).e();
        } else {
            j jVar2 = this.f9671U;
            if (jVar2 != null) {
                jVar2.a();
            }
        }
        return J02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n.b G0(n.b.a r8) {
        /*
            r7 = this;
            r7.V()
            n.b r0 = r7.f9690q
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof i.C0678e.g
            if (r0 != 0) goto L_0x0014
            i.e$g r0 = new i.e$g
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            i.c r0 = r7.f9683j
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f9665O
            if (r2 != 0) goto L_0x0022
            n.b r0 = r0.n(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f9690q = r0
            goto L_0x0162
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f9691r
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f9656F
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f9680g
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = h.C0645a.f9170d
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f9680g
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            n.d r4 = new n.d
            android.content.Context r6 = r7.f9680g
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f9680g
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f9691r = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = h.C0645a.f9172f
            r5.<init>(r4, r1, r6)
            r7.f9692s = r5
            r6 = 2
            X.g.b(r5, r6)
            android.widget.PopupWindow r5 = r7.f9692s
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f9691r
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f9692s
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = h.C0645a.f9168b
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f9691r
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f9692s
            r4 = -2
            r0.setHeight(r4)
            i.e$d r0 = new i.e$d
            r0.<init>()
            r7.f9693t = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f9697x
            int r4 = h.f.f9276h
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.a0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f9691r = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f9691r
            if (r0 == 0) goto L_0x0162
            r7.V()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f9691r
            r0.k()
            n.e r0 = new n.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f9691r
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f9691r
            android.widget.PopupWindow r6 = r7.f9692s
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = r2
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.a(r0, r3)
            if (r8 == 0) goto L_0x0160
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f9691r
            r8.h(r0)
            r7.f9690q = r0
            boolean r8 = r7.D0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f9691r
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f9691r
            S.K r8 = S.C.d(r8)
            S.K r8 = r8.b(r0)
            r7.f9694u = r8
            i.e$e r0 = new i.e$e
            r0.<init>()
            r8.h(r0)
            goto L_0x0150
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f9691r
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f9691r
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f9691r
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f9691r
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0150
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f9691r
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            S.C.d0(r8)
        L_0x0150:
            android.widget.PopupWindow r8 = r7.f9692s
            if (r8 == 0) goto L_0x0162
            android.view.Window r8 = r7.f9681h
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f9693t
            r8.post(r0)
            goto L_0x0162
        L_0x0160:
            r7.f9690q = r1
        L_0x0162:
            n.b r8 = r7.f9690q
            if (r8 == 0) goto L_0x016d
            i.c r0 = r7.f9683j
            if (r0 == 0) goto L_0x016d
            r0.v(r8)
        L_0x016d:
            n.b r8 = r7.f9690q
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0678e.G0(n.b$a):n.b");
    }

    public final void H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f9697x.findViewById(16908290);
        View decorView = this.f9681h.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f9680g.obtainStyledAttributes(h.j.f9576z0);
        obtainStyledAttributes.getValue(h.j.f9385L0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(h.j.f9390M0, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(h.j.f9375J0)) {
            obtainStyledAttributes.getValue(h.j.f9375J0, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(h.j.f9380K0)) {
            obtainStyledAttributes.getValue(h.j.f9380K0, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(h.j.f9365H0)) {
            obtainStyledAttributes.getValue(h.j.f9365H0, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(h.j.f9370I0)) {
            obtainStyledAttributes.getValue(h.j.f9370I0, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final void H0() {
        if (this.f9696w) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void I(Window window) {
        if (this.f9681h == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof h)) {
                h hVar = new h(callback);
                this.f9682i = hVar;
                window.setCallback(hVar);
                f0 u4 = f0.u(this.f9680g, (AttributeSet) null, f9648e0);
                Drawable h4 = u4.h(0);
                if (h4 != null) {
                    window.setBackgroundDrawable(h4);
                }
                u4.w();
                this.f9681h = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final C0675b I0() {
        Context context = this.f9680g;
        while (context != null) {
            if (!(context instanceof C0675b)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (C0675b) context;
            }
        }
        return null;
    }

    public final int J() {
        int i4 = this.f9666P;
        return i4 != -100 ? i4 : C0677d.j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean J0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f9680g
            r1 = 0
            android.content.res.Configuration r0 = r6.P(r0, r7, r1)
            boolean r2 = r6.l0()
            android.content.Context r3 = r6.f9680g
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.f9662L
            if (r8 == 0) goto L_0x0047
            boolean r8 = f9649f0
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.f9663M
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f9679f
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f9679f
            android.app.Activity r8 = (android.app.Activity) r8
            G.a.o(r8)
            r8 = r4
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.K0(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f9679f
            boolean r0 = r8 instanceof i.C0675b
            if (r0 == 0) goto L_0x005e
            i.b r8 = (i.C0675b) r8
            r8.g0(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0678e.J0(int, boolean):boolean");
    }

    public void K(int i4, q qVar, Menu menu) {
        if (menu == null) {
            if (qVar == null && i4 >= 0) {
                q[] qVarArr = this.f9659I;
                if (i4 < qVarArr.length) {
                    qVar = qVarArr[i4];
                }
            }
            if (qVar != null) {
                menu = qVar.f9728j;
            }
        }
        if ((qVar == null || qVar.f9733o) && !this.f9665O) {
            this.f9682i.a().onPanelClosed(i4, menu);
        }
    }

    public final void K0(int i4, boolean z4, Configuration configuration) {
        Resources resources = this.f9680g.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i4 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i5 = this.f9667Q;
        if (i5 != 0) {
            this.f9680g.setTheme(i5);
            this.f9680g.getTheme().applyStyle(this.f9667Q, true);
        }
        if (z4) {
            Object obj = this.f9679f;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C0384k) {
                    if (((C0384k) activity).b().b().f(C0380g.b.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f9664N) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    public void L(e eVar) {
        if (!this.f9658H) {
            this.f9658H = true;
            this.f9687n.l();
            Window.Callback f02 = f0();
            if (f02 != null && !this.f9665O) {
                f02.onPanelClosed(108, eVar);
            }
            this.f9658H = false;
        }
    }

    public final int L0(O o4, Rect rect) {
        boolean z4;
        boolean z5;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        int i5 = 0;
        int l4 = o4 != null ? o4.l() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f9691r;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f9691r.getLayoutParams();
            boolean z6 = true;
            if (this.f9691r.isShown()) {
                if (this.f9676Z == null) {
                    this.f9676Z = new Rect();
                    this.f9677a0 = new Rect();
                }
                Rect rect2 = this.f9676Z;
                Rect rect3 = this.f9677a0;
                if (o4 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(o4.j(), o4.l(), o4.k(), o4.i());
                }
                i0.a(this.f9697x, rect2, rect3);
                int i6 = rect2.top;
                int i7 = rect2.left;
                int i8 = rect2.right;
                O C4 = C.C(this.f9697x);
                int j4 = C4 == null ? 0 : C4.j();
                int k4 = C4 == null ? 0 : C4.k();
                if (marginLayoutParams2.topMargin == i6 && marginLayoutParams2.leftMargin == i7 && marginLayoutParams2.rightMargin == i8) {
                    z5 = false;
                } else {
                    marginLayoutParams2.topMargin = i6;
                    marginLayoutParams2.leftMargin = i7;
                    marginLayoutParams2.rightMargin = i8;
                    z5 = true;
                }
                if (i6 <= 0 || this.f9699z != null) {
                    View view = this.f9699z;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i4 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == j4 && marginLayoutParams.rightMargin == k4))) {
                        marginLayoutParams.height = i4;
                        marginLayoutParams.leftMargin = j4;
                        marginLayoutParams.rightMargin = k4;
                        this.f9699z.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f9680g);
                    this.f9699z = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = j4;
                    layoutParams.rightMargin = k4;
                    this.f9697x.addView(this.f9699z, -1, layoutParams);
                }
                View view3 = this.f9699z;
                if (view3 == null) {
                    z6 = false;
                }
                if (z6 && view3.getVisibility() != 0) {
                    M0(this.f9699z);
                }
                if (!this.f9655E && z6) {
                    l4 = 0;
                }
                z4 = z6;
                z6 = z5;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z4 = false;
            } else {
                z4 = false;
                z6 = false;
            }
            if (z6) {
                this.f9691r.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f9699z;
        if (view4 != null) {
            if (!z4) {
                i5 = 8;
            }
            view4.setVisibility(i5);
        }
        return l4;
    }

    public final void M() {
        j jVar = this.f9670T;
        if (jVar != null) {
            jVar.a();
        }
        j jVar2 = this.f9671U;
        if (jVar2 != null) {
            jVar2.a();
        }
    }

    public final void M0(View view) {
        view.setBackgroundColor((C.F(view) & 8192) != 0 ? H.a.c(this.f9680g, C0647c.f9195b) : H.a.c(this.f9680g, C0647c.f9194a));
    }

    public void N(int i4) {
        O(d0(i4, true), true);
    }

    public void O(q qVar, boolean z4) {
        ViewGroup viewGroup;
        C0829D d4;
        if (!z4 || qVar.f9719a != 0 || (d4 = this.f9687n) == null || !d4.c()) {
            WindowManager windowManager = (WindowManager) this.f9680g.getSystemService("window");
            if (!(windowManager == null || !qVar.f9733o || (viewGroup = qVar.f9725g) == null)) {
                windowManager.removeView(viewGroup);
                if (z4) {
                    K(qVar.f9719a, qVar, (Menu) null);
                }
            }
            qVar.f9731m = false;
            qVar.f9732n = false;
            qVar.f9733o = false;
            qVar.f9726h = null;
            qVar.f9735q = true;
            if (this.f9660J == qVar) {
                this.f9660J = null;
                return;
            }
            return;
        }
        L(qVar.f9728j);
    }

    public final Configuration P(Context context, int i4, Configuration configuration) {
        int i5 = i4 != 1 ? i4 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i5 | (configuration2.uiMode & -49);
        return configuration2;
    }

    public final ViewGroup Q() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f9680g.obtainStyledAttributes(h.j.f9576z0);
        if (obtainStyledAttributes.hasValue(h.j.f9350E0)) {
            if (obtainStyledAttributes.getBoolean(h.j.f9395N0, false)) {
                z(1);
            } else if (obtainStyledAttributes.getBoolean(h.j.f9350E0, false)) {
                z(108);
            }
            if (obtainStyledAttributes.getBoolean(h.j.f9355F0, false)) {
                z(109);
            }
            if (obtainStyledAttributes.getBoolean(h.j.f9360G0, false)) {
                z(10);
            }
            this.f9656F = obtainStyledAttributes.getBoolean(h.j.f9330A0, false);
            obtainStyledAttributes.recycle();
            X();
            this.f9681h.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f9680g);
            if (this.f9657G) {
                viewGroup = this.f9655E ? (ViewGroup) from.inflate(h.g.f9309o, (ViewGroup) null) : (ViewGroup) from.inflate(h.g.f9308n, (ViewGroup) null);
            } else if (this.f9656F) {
                viewGroup = (ViewGroup) from.inflate(h.g.f9300f, (ViewGroup) null);
                this.f9654D = false;
                this.f9653C = false;
            } else if (this.f9653C) {
                TypedValue typedValue = new TypedValue();
                this.f9680g.getTheme().resolveAttribute(C0645a.f9170d, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new n.d(this.f9680g, typedValue.resourceId) : this.f9680g).inflate(h.g.f9310p, (ViewGroup) null);
                C0829D d4 = (C0829D) viewGroup.findViewById(h.f.f9284p);
                this.f9687n = d4;
                d4.setWindowCallback(f0());
                if (this.f9654D) {
                    this.f9687n.k(109);
                }
                if (this.f9651A) {
                    this.f9687n.k(2);
                }
                if (this.f9652B) {
                    this.f9687n.k(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                C.t0(viewGroup, new b());
                if (this.f9687n == null) {
                    this.f9698y = (TextView) viewGroup.findViewById(h.f.f9265L);
                }
                i0.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(h.f.f9270b);
                ViewGroup viewGroup2 = (ViewGroup) this.f9681h.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f9681h.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f9653C + ", windowActionBarOverlay: " + this.f9654D + ", android:windowIsFloating: " + this.f9656F + ", windowActionModeOverlay: " + this.f9655E + ", windowNoTitle: " + this.f9657G + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    public View R(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f9678b0 == null) {
            String string = this.f9680g.obtainStyledAttributes(h.j.f9576z0).getString(h.j.f9345D0);
            if (string == null) {
                this.f9678b0 = new g();
            } else {
                try {
                    this.f9678b0 = (g) Class.forName(string).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f9678b0 = new g();
                }
            }
        }
        boolean z4 = f9647d0;
        boolean z5 = false;
        if (z4) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z5 = E0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z5 = true;
            }
        }
        return this.f9678b0.q(view, str, context, attributeSet, z5, z4, true, h0.b());
    }

    public void S() {
        e eVar;
        C0829D d4 = this.f9687n;
        if (d4 != null) {
            d4.l();
        }
        if (this.f9692s != null) {
            this.f9681h.getDecorView().removeCallbacks(this.f9693t);
            if (this.f9692s.isShowing()) {
                try {
                    this.f9692s.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f9692s = null;
        }
        V();
        q d02 = d0(0, false);
        if (d02 != null && (eVar = d02.f9728j) != null) {
            eVar.close();
        }
    }

    public boolean T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f9679f;
        if (((obj instanceof C0318i.a) || (obj instanceof f)) && (decorView = this.f9681h.getDecorView()) != null && C0318i.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f9682i.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? p0(keyCode, keyEvent) : s0(keyCode, keyEvent);
    }

    public void U(int i4) {
        q d02;
        q d03 = d0(i4, true);
        if (d03.f9728j != null) {
            Bundle bundle = new Bundle();
            d03.f9728j.Q(bundle);
            if (bundle.size() > 0) {
                d03.f9737s = bundle;
            }
            d03.f9728j.d0();
            d03.f9728j.clear();
        }
        d03.f9736r = true;
        d03.f9735q = true;
        if ((i4 == 108 || i4 == 0) && this.f9687n != null && (d02 = d0(0, false)) != null) {
            d02.f9731m = false;
            A0(d02, (KeyEvent) null);
        }
    }

    public void V() {
        K k4 = this.f9694u;
        if (k4 != null) {
            k4.c();
        }
    }

    public final void W() {
        if (!this.f9696w) {
            this.f9697x = Q();
            CharSequence e02 = e0();
            if (!TextUtils.isEmpty(e02)) {
                C0829D d4 = this.f9687n;
                if (d4 != null) {
                    d4.setWindowTitle(e02);
                } else if (y0() != null) {
                    y0().t(e02);
                } else {
                    TextView textView = this.f9698y;
                    if (textView != null) {
                        textView.setText(e02);
                    }
                }
            }
            H();
            w0(this.f9697x);
            this.f9696w = true;
            q d02 = d0(0, false);
            if (this.f9665O) {
                return;
            }
            if (d02 == null || d02.f9728j == null) {
                k0(108);
            }
        }
    }

    public final void X() {
        if (this.f9681h == null) {
            Object obj = this.f9679f;
            if (obj instanceof Activity) {
                I(((Activity) obj).getWindow());
            }
        }
        if (this.f9681h == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public q Y(Menu menu) {
        q[] qVarArr = this.f9659I;
        int length = qVarArr != null ? qVarArr.length : 0;
        for (int i4 = 0; i4 < length; i4++) {
            q qVar = qVarArr[i4];
            if (qVar != null && qVar.f9728j == menu) {
                return qVar;
            }
        }
        return null;
    }

    public boolean a(e eVar, MenuItem menuItem) {
        q Y3;
        Window.Callback f02 = f0();
        if (f02 == null || this.f9665O || (Y3 = Y(eVar.D())) == null) {
            return false;
        }
        return f02.onMenuItemSelected(Y3.f9719a, menuItem);
    }

    public final Context a0() {
        C0674a m4 = m();
        Context k4 = m4 != null ? m4.k() : null;
        return k4 == null ? this.f9680g : k4;
    }

    public void b(e eVar) {
        B0(true);
    }

    public final j b0(Context context) {
        if (this.f9671U == null) {
            this.f9671U = new i(context);
        }
        return this.f9671U;
    }

    public final j c0(Context context) {
        if (this.f9670T == null) {
            this.f9670T = new k(i.a(context));
        }
        return this.f9670T;
    }

    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ((ViewGroup) this.f9697x.findViewById(16908290)).addView(view, layoutParams);
        this.f9682i.a().onContentChanged();
    }

    public q d0(int i4, boolean z4) {
        q[] qVarArr = this.f9659I;
        if (qVarArr == null || qVarArr.length <= i4) {
            q[] qVarArr2 = new q[(i4 + 1)];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.f9659I = qVarArr2;
            qVarArr = qVarArr2;
        }
        q qVar = qVarArr[i4];
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(i4);
        qVarArr[i4] = qVar2;
        return qVar2;
    }

    public final CharSequence e0() {
        Object obj = this.f9679f;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f9686m;
    }

    public Context f(Context context) {
        this.f9662L = true;
        int n02 = n0(context, J());
        Configuration configuration = null;
        if (f9650g0 && (context instanceof ContextThemeWrapper)) {
            try {
                o.a((ContextThemeWrapper) context, P(context, n02, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof n.d) {
            try {
                ((n.d) context).a(P(context, n02, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f9649f0) {
            return super.f(context);
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = Z(configuration2, configuration3);
            }
            Configuration P4 = P(context, n02, configuration);
            n.d dVar = new n.d(context, h.i.f9327b);
            dVar.a(P4);
            try {
                if (context.getTheme() != null) {
                    b.c.a(dVar.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            return super.f(dVar);
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException("Application failed to obtain resources from itself", e4);
        }
    }

    public final Window.Callback f0() {
        return this.f9681h.getCallback();
    }

    public final void g0() {
        W();
        if (this.f9653C && this.f9684k == null) {
            Object obj = this.f9679f;
            if (obj instanceof Activity) {
                this.f9684k = new j((Activity) this.f9679f, this.f9654D);
            } else if (obj instanceof Dialog) {
                this.f9684k = new j((Dialog) this.f9679f);
            }
            C0674a aVar = this.f9684k;
            if (aVar != null) {
                aVar.r(this.f9675Y);
            }
        }
    }

    public final boolean h0(q qVar) {
        View view = qVar.f9727i;
        if (view != null) {
            qVar.f9726h = view;
            return true;
        } else if (qVar.f9728j == null) {
            return false;
        } else {
            if (this.f9689p == null) {
                this.f9689p = new r();
            }
            View view2 = (View) qVar.a(this.f9689p);
            qVar.f9726h = view2;
            return view2 != null;
        }
    }

    public View i(int i4) {
        W();
        return this.f9681h.findViewById(i4);
    }

    public final boolean i0(q qVar) {
        qVar.d(a0());
        qVar.f9725g = new p(qVar.f9730l);
        qVar.f9721c = 81;
        return true;
    }

    public final boolean j0(q qVar) {
        Resources.Theme theme;
        Context context = this.f9680g;
        int i4 = qVar.f9719a;
        if ((i4 == 0 || i4 == 108) && this.f9687n != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(C0645a.f9170d, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(C0645a.f9171e, typedValue, true);
            } else {
                theme2.resolveAttribute(C0645a.f9171e, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                n.d dVar = new n.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        e eVar = new e(context);
        eVar.R(this);
        qVar.c(eVar);
        return true;
    }

    public int k() {
        return this.f9666P;
    }

    public final void k0(int i4) {
        this.f9673W = (1 << i4) | this.f9673W;
        if (!this.f9672V) {
            C.Y(this.f9681h.getDecorView(), this.f9674X);
            this.f9672V = true;
        }
    }

    public MenuInflater l() {
        if (this.f9685l == null) {
            g0();
            C0674a aVar = this.f9684k;
            this.f9685l = new n.g(aVar != null ? aVar.k() : this.f9680g);
        }
        return this.f9685l;
    }

    public final boolean l0() {
        if (!this.f9669S && (this.f9679f instanceof Activity)) {
            PackageManager packageManager = this.f9680g.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f9680g, this.f9679f.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                this.f9668R = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e4) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e4);
                this.f9668R = false;
            }
        }
        this.f9669S = true;
        return this.f9668R;
    }

    public C0674a m() {
        g0();
        return this.f9684k;
    }

    public boolean m0() {
        return this.f9695v;
    }

    public void n() {
        LayoutInflater from = LayoutInflater.from(this.f9680g);
        if (from.getFactory() == null) {
            C0319j.a(from, this);
        } else if (!(from.getFactory2() instanceof C0678e)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public int n0(Context context, int i4) {
        if (i4 == -100) {
            return -1;
        }
        if (i4 != -1) {
            if (i4 != 0) {
                if (!(i4 == 1 || i4 == 2)) {
                    if (i4 == 3) {
                        return b0(context).c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                return -1;
            } else {
                return c0(context).c();
            }
        }
        return i4;
    }

    public void o() {
        C0674a m4 = m();
        if (m4 == null || !m4.l()) {
            k0(0);
        }
    }

    public boolean o0() {
        n.b bVar = this.f9690q;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        C0674a m4 = m();
        return m4 != null && m4.h();
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(view, str, context, attributeSet);
    }

    public void p(Configuration configuration) {
        C0674a m4;
        if (this.f9653C && this.f9696w && (m4 = m()) != null) {
            m4.m(configuration);
        }
        C0842i.b().g(this.f9680g);
        G(false);
    }

    public boolean p0(int i4, KeyEvent keyEvent) {
        boolean z4 = true;
        if (i4 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z4 = false;
            }
            this.f9661K = z4;
        } else if (i4 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void q(Bundle bundle) {
        String str;
        this.f9662L = true;
        G(false);
        X();
        Object obj = this.f9679f;
        if (obj instanceof Activity) {
            try {
                str = G.g.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C0674a y02 = y0();
                if (y02 == null) {
                    this.f9675Y = true;
                } else {
                    y02.r(true);
                }
            }
            C0677d.c(this);
        }
        this.f9663M = true;
    }

    public final boolean q0(int i4, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        q d02 = d0(i4, true);
        if (!d02.f9733o) {
            return A0(d02, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9679f
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            i.C0677d.x(r3)
        L_0x0009:
            boolean r0 = r3.f9672V
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f9681h
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f9674X
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.f9664N = r0
            r0 = 1
            r3.f9665O = r0
            int r0 = r3.f9666P
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f9679f
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            v.g r0 = f9646c0
            java.lang.Object r1 = r3.f9679f
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f9666P
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            v.g r0 = f9646c0
            java.lang.Object r1 = r3.f9679f
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            i.a r0 = r3.f9684k
            if (r0 == 0) goto L_0x005e
            r0.n()
        L_0x005e:
            r3.M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0678e.r():void");
    }

    public boolean r0(int i4, KeyEvent keyEvent) {
        C0674a m4 = m();
        if (m4 != null && m4.o(i4, keyEvent)) {
            return true;
        }
        q qVar = this.f9660J;
        if (qVar == null || !z0(qVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f9660J == null) {
                q d02 = d0(0, true);
                A0(d02, keyEvent);
                boolean z02 = z0(d02, keyEvent.getKeyCode(), keyEvent, 1);
                d02.f9731m = false;
                if (z02) {
                    return true;
                }
            }
            return false;
        }
        q qVar2 = this.f9660J;
        if (qVar2 != null) {
            qVar2.f9732n = true;
        }
        return true;
    }

    public void s(Bundle bundle) {
        W();
    }

    public boolean s0(int i4, KeyEvent keyEvent) {
        if (i4 == 4) {
            boolean z4 = this.f9661K;
            this.f9661K = false;
            q d02 = d0(0, false);
            if (d02 != null && d02.f9733o) {
                if (!z4) {
                    O(d02, true);
                }
                return true;
            } else if (o0()) {
                return true;
            }
        } else if (i4 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void t() {
        C0674a m4 = m();
        if (m4 != null) {
            m4.s(true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            n.b r0 = r4.f9690q
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            i.e$q r2 = r4.d0(r5, r0)
            if (r5 != 0) goto L_0x0043
            p.D r5 = r4.f9687n
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.h()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f9680g
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            p.D r5 = r4.f9687n
            boolean r5 = r5.c()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f9665O
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.A0(r2, r6)
            if (r5 == 0) goto L_0x0062
            p.D r5 = r4.f9687n
            boolean r0 = r5.g()
            goto L_0x0068
        L_0x003c:
            p.D r5 = r4.f9687n
            boolean r0 = r5.f()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f9733o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f9732n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f9731m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f9736r
            if (r5 == 0) goto L_0x005b
            r2.f9731m = r1
            boolean r5 = r4.A0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = r0
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.x0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = r1
            goto L_0x0068
        L_0x0064:
            r4.O(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f9680g
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.C0678e.t0(int, android.view.KeyEvent):boolean");
    }

    public void u(Bundle bundle) {
    }

    public void u0(int i4) {
        C0674a m4;
        if (i4 == 108 && (m4 = m()) != null) {
            m4.i(true);
        }
    }

    public void v() {
        this.f9664N = true;
        F();
    }

    public void v0(int i4) {
        if (i4 == 108) {
            C0674a m4 = m();
            if (m4 != null) {
                m4.i(false);
            }
        } else if (i4 == 0) {
            q d02 = d0(i4, true);
            if (d02.f9733o) {
                O(d02, false);
            }
        }
    }

    public void w() {
        this.f9664N = false;
        C0674a m4 = m();
        if (m4 != null) {
            m4.s(false);
        }
    }

    public void w0(ViewGroup viewGroup) {
    }

    public final void x0(q qVar, KeyEvent keyEvent) {
        int i4;
        ViewGroup.LayoutParams layoutParams;
        if (!qVar.f9733o && !this.f9665O) {
            if (qVar.f9719a != 0 || (this.f9680g.getResources().getConfiguration().screenLayout & 15) != 4) {
                Window.Callback f02 = f0();
                if (f02 == null || f02.onMenuOpened(qVar.f9719a, qVar.f9728j)) {
                    WindowManager windowManager = (WindowManager) this.f9680g.getSystemService("window");
                    if (windowManager != null && A0(qVar, keyEvent)) {
                        ViewGroup viewGroup = qVar.f9725g;
                        if (viewGroup == null || qVar.f9735q) {
                            if (viewGroup == null) {
                                if (!i0(qVar) || qVar.f9725g == null) {
                                    return;
                                }
                            } else if (qVar.f9735q && viewGroup.getChildCount() > 0) {
                                qVar.f9725g.removeAllViews();
                            }
                            if (!h0(qVar) || !qVar.b()) {
                                qVar.f9735q = true;
                                return;
                            }
                            ViewGroup.LayoutParams layoutParams2 = qVar.f9726h.getLayoutParams();
                            if (layoutParams2 == null) {
                                layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                            }
                            qVar.f9725g.setBackgroundResource(qVar.f9720b);
                            ViewParent parent = qVar.f9726h.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(qVar.f9726h);
                            }
                            qVar.f9725g.addView(qVar.f9726h, layoutParams2);
                            if (!qVar.f9726h.hasFocus()) {
                                qVar.f9726h.requestFocus();
                            }
                        } else {
                            View view = qVar.f9727i;
                            if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                                i4 = -1;
                                qVar.f9732n = false;
                                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i4, -2, qVar.f9722d, qVar.f9723e, 1002, 8519680, -3);
                                layoutParams3.gravity = qVar.f9721c;
                                layoutParams3.windowAnimations = qVar.f9724f;
                                windowManager.addView(qVar.f9725g, layoutParams3);
                                qVar.f9733o = true;
                                return;
                            }
                        }
                        i4 = -2;
                        qVar.f9732n = false;
                        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i4, -2, qVar.f9722d, qVar.f9723e, 1002, 8519680, -3);
                        layoutParams32.gravity = qVar.f9721c;
                        layoutParams32.windowAnimations = qVar.f9724f;
                        windowManager.addView(qVar.f9725g, layoutParams32);
                        qVar.f9733o = true;
                        return;
                    }
                    return;
                }
                O(qVar, true);
            }
        }
    }

    public final C0674a y0() {
        return this.f9684k;
    }

    public boolean z(int i4) {
        int C02 = C0(i4);
        if (this.f9657G && C02 == 108) {
            return false;
        }
        if (this.f9653C && C02 == 1) {
            this.f9653C = false;
        }
        if (C02 == 1) {
            H0();
            this.f9657G = true;
            return true;
        } else if (C02 == 2) {
            H0();
            this.f9651A = true;
            return true;
        } else if (C02 == 5) {
            H0();
            this.f9652B = true;
            return true;
        } else if (C02 == 10) {
            H0();
            this.f9655E = true;
            return true;
        } else if (C02 == 108) {
            H0();
            this.f9653C = true;
            return true;
        } else if (C02 != 109) {
            return this.f9681h.requestFeature(C02);
        } else {
            H0();
            this.f9654D = true;
            return true;
        }
    }

    public final boolean z0(q qVar, int i4, KeyEvent keyEvent, int i5) {
        e eVar;
        boolean z4 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f9731m || A0(qVar, keyEvent)) && (eVar = qVar.f9728j) != null) {
            z4 = eVar.performShortcut(i4, keyEvent, i5);
        }
        if (z4 && (i5 & 1) == 0 && this.f9687n == null) {
            O(qVar, true);
        }
        return z4;
    }

    public C0678e(Dialog dialog, C0676c cVar) {
        this(dialog.getContext(), dialog.getWindow(), cVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public C0678e(Context context, Window window, C0676c cVar, Object obj) {
        C0675b I02;
        this.f9694u = null;
        this.f9695v = true;
        this.f9666P = -100;
        this.f9674X = new a();
        this.f9680g = context;
        this.f9683j = cVar;
        this.f9679f = obj;
        if (this.f9666P == -100 && (obj instanceof Dialog) && (I02 = I0()) != null) {
            this.f9666P = I02.d0().k();
        }
        if (this.f9666P == -100) {
            v.g gVar = f9646c0;
            Integer num = (Integer) gVar.get(obj.getClass().getName());
            if (num != null) {
                this.f9666P = num.intValue();
                gVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            I(window);
        }
        C0842i.h();
    }
}
