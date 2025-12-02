package d;

import G.n;
import G.o;
import G.r;
import S.C0321l;
import S.C0322m;
import S.C0324o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.A;
import androidx.lifecycle.C0379f;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.C0382i;
import androidx.lifecycle.C0384k;
import androidx.lifecycle.G;
import androidx.lifecycle.H;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.l;
import androidx.lifecycle.x;
import e.C0584a;
import e.C0585b;
import f.C0614d;
import f.C0615e;
import f.C0616f;
import g.C0631a;
import h3.C0673n;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import m0.C0785a;
import m0.C0786b;
import x0.C0998d;
import x0.C0999e;
import x0.C1000f;
import x0.C1001g;

public abstract class h extends G.e implements C0384k, I, C0379f, C1000f, s, C0615e, H.c, H.d, n, o, C0321l, o {

    /* renamed from: e  reason: collision with root package name */
    public final C0584a f8591e = new C0584a();

    /* renamed from: f  reason: collision with root package name */
    public final C0322m f8592f = new C0322m(new d(this));

    /* renamed from: g  reason: collision with root package name */
    public final l f8593g = new l(this);

    /* renamed from: h  reason: collision with root package name */
    public final C0999e f8594h;

    /* renamed from: i  reason: collision with root package name */
    public H f8595i;

    /* renamed from: j  reason: collision with root package name */
    public q f8596j;

    /* renamed from: k  reason: collision with root package name */
    public final j f8597k;

    /* renamed from: l  reason: collision with root package name */
    public final n f8598l;

    /* renamed from: m  reason: collision with root package name */
    public int f8599m;

    /* renamed from: n  reason: collision with root package name */
    public final AtomicInteger f8600n;

    /* renamed from: o  reason: collision with root package name */
    public final C0614d f8601o;

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList f8602p;

    /* renamed from: q  reason: collision with root package name */
    public final CopyOnWriteArrayList f8603q;

    /* renamed from: r  reason: collision with root package name */
    public final CopyOnWriteArrayList f8604r;

    /* renamed from: s  reason: collision with root package name */
    public final CopyOnWriteArrayList f8605s;

    /* renamed from: t  reason: collision with root package name */
    public final CopyOnWriteArrayList f8606t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f8607u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f8608v;

    public class a extends C0614d {

        /* renamed from: d.h$a$a  reason: collision with other inner class name */
        public class C0143a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ int f8610e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ C0631a.C0163a f8611f;

            public C0143a(int i4, C0631a.C0163a aVar) {
                this.f8610e = i4;
                this.f8611f = aVar;
            }

            public void run() {
                a.this.c(this.f8610e, this.f8611f.a());
            }
        }

        public class b implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ int f8613e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f8614f;

            public b(int i4, IntentSender.SendIntentException sendIntentException) {
                this.f8613e = i4;
                this.f8614f = sendIntentException;
            }

            public void run() {
                a.this.b(this.f8613e, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f8614f));
            }
        }

        public a() {
        }

        public void f(int i4, C0631a aVar, Object obj, G.b bVar) {
            Bundle bundle;
            h hVar = h.this;
            C0631a.C0163a b4 = aVar.b(hVar, obj);
            if (b4 != null) {
                new Handler(Looper.getMainLooper()).post(new C0143a(i4, b4));
                return;
            }
            Intent a4 = aVar.a(hVar, obj);
            if (a4.getExtras() != null && a4.getExtras().getClassLoader() == null) {
                a4.setExtrasClassLoader(hVar.getClassLoader());
            }
            if (a4.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a4.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a4.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a4.getAction())) {
                String[] stringArrayExtra = a4.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                G.a.p(hVar, stringArrayExtra, i4);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a4.getAction())) {
                C0616f fVar = (C0616f) a4.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    G.a.s(hVar, fVar.e(), i4, fVar.a(), fVar.c(), fVar.d(), 0, bundle);
                } catch (IntentSender.SendIntentException e4) {
                    new Handler(Looper.getMainLooper()).post(new b(i4, e4));
                }
            } else {
                G.a.r(hVar, a4, i4, bundle);
            }
        }
    }

    public class b implements C0382i {
        public b() {
        }

        public void d(C0384k kVar, C0380g.a aVar) {
            if (aVar == C0380g.a.ON_STOP) {
                Window window = h.this.getWindow();
                View peekDecorView = window != null ? window.peekDecorView() : null;
                if (peekDecorView != null) {
                    g.a(peekDecorView);
                }
            }
        }
    }

    public class c implements C0382i {
        public c() {
        }

        public void d(C0384k kVar, C0380g.a aVar) {
            if (aVar == C0380g.a.ON_DESTROY) {
                h.this.f8591e.b();
                if (!h.this.isChangingConfigurations()) {
                    h.this.t().a();
                }
                h.this.f8597k.f();
            }
        }
    }

    public class d implements C0382i {
        public d() {
        }

        public void d(C0384k kVar, C0380g.a aVar) {
            h.this.H();
            h.this.b().c(this);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public void run() {
            try {
                h.super.onBackPressed();
            } catch (IllegalStateException e4) {
                if (!TextUtils.equals(e4.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e4;
                }
            } catch (NullPointerException e5) {
                if (!TextUtils.equals(e5.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e5;
                }
            }
        }
    }

    public class f implements C0382i {
        public f() {
        }

        public void d(C0384k kVar, C0380g.a aVar) {
            if (aVar == C0380g.a.ON_CREATE && Build.VERSION.SDK_INT >= 33) {
                h.this.f8596j.n(C0144h.a((h) kVar));
            }
        }
    }

    public static class g {
        public static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: d.h$h  reason: collision with other inner class name */
    public static class C0144h {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public Object f8621a;

        /* renamed from: b  reason: collision with root package name */
        public H f8622b;
    }

    public interface j extends Executor {
        void f();

        void l(View view);
    }

    public class k implements j, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final long f8623e = (SystemClock.uptimeMillis() + 10000);

        /* renamed from: f  reason: collision with root package name */
        public Runnable f8624f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f8625g = false;

        public k() {
        }

        public final /* synthetic */ void b() {
            Runnable runnable = this.f8624f;
            if (runnable != null) {
                runnable.run();
                this.f8624f = null;
            }
        }

        public void execute(Runnable runnable) {
            this.f8624f = runnable;
            View decorView = h.this.getWindow().getDecorView();
            if (!this.f8625g) {
                decorView.postOnAnimation(new i(this));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        public void f() {
            h.this.getWindow().getDecorView().removeCallbacks(this);
            h.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        public void l(View view) {
            if (!this.f8625g) {
                this.f8625g = true;
                view.getViewTreeObserver().addOnDrawListener(this);
            }
        }

        public void onDraw() {
            Runnable runnable = this.f8624f;
            if (runnable != null) {
                runnable.run();
                this.f8624f = null;
                if (h.this.f8598l.c()) {
                    this.f8625g = false;
                    h.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f8623e) {
                this.f8625g = false;
                h.this.getWindow().getDecorView().post(this);
            }
        }

        public void run() {
            h.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public h() {
        C0999e a4 = C0999e.a(this);
        this.f8594h = a4;
        this.f8596j = null;
        j G4 = G();
        this.f8597k = G4;
        this.f8598l = new n(G4, new e(this));
        this.f8600n = new AtomicInteger();
        this.f8601o = new a();
        this.f8602p = new CopyOnWriteArrayList();
        this.f8603q = new CopyOnWriteArrayList();
        this.f8604r = new CopyOnWriteArrayList();
        this.f8605s = new CopyOnWriteArrayList();
        this.f8606t = new CopyOnWriteArrayList();
        this.f8607u = false;
        this.f8608v = false;
        if (b() != null) {
            b().a(new b());
            b().a(new c());
            b().a(new d());
            a4.c();
            A.a(this);
            l().h("android:support:activity-result", new f(this));
            E(new g(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public final void E(C0585b bVar) {
        this.f8591e.a(bVar);
    }

    public final void F(R.a aVar) {
        this.f8604r.add(aVar);
    }

    public final j G() {
        return new k();
    }

    public void H() {
        if (this.f8595i == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.f8595i = iVar.f8622b;
            }
            if (this.f8595i == null) {
                this.f8595i = new H();
            }
        }
    }

    public void I() {
        J.a(getWindow().getDecorView(), this);
        K.a(getWindow().getDecorView(), this);
        C1001g.a(getWindow().getDecorView(), this);
        v.a(getWindow().getDecorView(), this);
        u.a(getWindow().getDecorView(), this);
    }

    public void J() {
        invalidateOptionsMenu();
    }

    public final /* synthetic */ C0673n K() {
        reportFullyDrawn();
        return null;
    }

    public final /* synthetic */ Bundle L() {
        Bundle bundle = new Bundle();
        this.f8601o.h(bundle);
        return bundle;
    }

    public final /* synthetic */ void M(Context context) {
        Bundle b4 = l().b("android:support:activity-result");
        if (b4 != null) {
            this.f8601o.g(b4);
        }
    }

    public Object N() {
        return null;
    }

    public C0380g b() {
        return this.f8593g;
    }

    public final void c(R.a aVar) {
        this.f8605s.add(aVar);
    }

    public final void d(R.a aVar) {
        this.f8603q.add(aVar);
    }

    public final void e(R.a aVar) {
        this.f8603q.remove(aVar);
    }

    public final void g(R.a aVar) {
        this.f8606t.add(aVar);
    }

    public final void h(R.a aVar) {
        this.f8602p.add(aVar);
    }

    public final q k() {
        if (this.f8596j == null) {
            this.f8596j = new q(new e());
            b().a(new f());
        }
        return this.f8596j;
    }

    public final C0998d l() {
        return this.f8594h.b();
    }

    public final void m(R.a aVar) {
        this.f8606t.remove(aVar);
    }

    public C0785a o() {
        C0786b bVar = new C0786b();
        if (getApplication() != null) {
            bVar.b(G.a.f5357e, getApplication());
        }
        bVar.b(A.f5337a, this);
        bVar.b(A.f5338b, this);
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            bVar.b(A.f5339c, getIntent().getExtras());
        }
        return bVar;
    }

    public void onActivityResult(int i4, int i5, Intent intent) {
        if (!this.f8601o.b(i4, i5, intent)) {
            super.onActivityResult(i4, i5, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f8602p.iterator();
        while (it.hasNext()) {
            ((R.a) it.next()).accept(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f8594h.d(bundle);
        this.f8591e.c(this);
        super.onCreate(bundle);
        x.e(this);
        int i4 = this.f8599m;
        if (i4 != 0) {
            setContentView(i4);
        }
    }

    public boolean onCreatePanelMenu(int i4, Menu menu) {
        if (i4 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i4, menu);
        this.f8592f.b(menu, getMenuInflater());
        return true;
    }

    public boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        if (i4 == 0) {
            return this.f8592f.d(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean z4) {
        if (!this.f8607u) {
            Iterator it = this.f8605s.iterator();
            while (it.hasNext()) {
                ((R.a) it.next()).accept(new G.f(z4));
            }
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f8604r.iterator();
        while (it.hasNext()) {
            ((R.a) it.next()).accept(intent);
        }
    }

    public void onPanelClosed(int i4, Menu menu) {
        this.f8592f.c(menu);
        super.onPanelClosed(i4, menu);
    }

    public void onPictureInPictureModeChanged(boolean z4) {
        if (!this.f8608v) {
            Iterator it = this.f8606t.iterator();
            while (it.hasNext()) {
                ((R.a) it.next()).accept(new r(z4));
            }
        }
    }

    public boolean onPreparePanel(int i4, View view, Menu menu) {
        if (i4 != 0) {
            return true;
        }
        super.onPreparePanel(i4, view, menu);
        this.f8592f.e(menu);
        return true;
    }

    public void onRequestPermissionsResult(int i4, String[] strArr, int[] iArr) {
        if (!this.f8601o.b(i4, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i4, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object N4 = N();
        H h4 = this.f8595i;
        if (h4 == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            h4 = iVar.f8622b;
        }
        if (h4 == null && N4 == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f8621a = N4;
        iVar2.f8622b = h4;
        return iVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C0380g b4 = b();
        if (b4 instanceof l) {
            ((l) b4).m(C0380g.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f8594h.e(bundle);
    }

    public void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        Iterator it = this.f8603q.iterator();
        while (it.hasNext()) {
            ((R.a) it.next()).accept(Integer.valueOf(i4));
        }
    }

    public final C0614d p() {
        return this.f8601o;
    }

    public void r(C0324o oVar) {
        this.f8592f.f(oVar);
    }

    public void reportFullyDrawn() {
        try {
            if (C0.a.h()) {
                C0.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.f8598l.b();
            C0.a.f();
        } catch (Throwable th) {
            C0.a.f();
            throw th;
        }
    }

    public final void s(R.a aVar) {
        this.f8602p.remove(aVar);
    }

    public abstract void setContentView(int i4);

    public void setContentView(View view) {
        I();
        this.f8597k.l(getWindow().getDecorView());
        super.setContentView(view);
    }

    public void startActivityForResult(Intent intent, int i4) {
        super.startActivityForResult(intent, i4);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7) {
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7);
    }

    public H t() {
        if (getApplication() != null) {
            H();
            return this.f8595i;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void u(C0324o oVar) {
        this.f8592f.a(oVar);
    }

    public final void w(R.a aVar) {
        this.f8605s.remove(aVar);
    }

    public void startActivityForResult(Intent intent, int i4, Bundle bundle) {
        super.startActivityForResult(intent, i4, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i4, Intent intent, int i5, int i6, int i7, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i4, intent, i5, i6, i7, bundle);
    }

    /* JADX INFO: finally extract failed */
    public void onMultiWindowModeChanged(boolean z4, Configuration configuration) {
        this.f8607u = true;
        try {
            super.onMultiWindowModeChanged(z4, configuration);
            this.f8607u = false;
            Iterator it = this.f8605s.iterator();
            while (it.hasNext()) {
                ((R.a) it.next()).accept(new G.f(z4, configuration));
            }
        } catch (Throwable th) {
            this.f8607u = false;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public void onPictureInPictureModeChanged(boolean z4, Configuration configuration) {
        this.f8608v = true;
        try {
            super.onPictureInPictureModeChanged(z4, configuration);
            this.f8608v = false;
            Iterator it = this.f8606t.iterator();
            while (it.hasNext()) {
                ((R.a) it.next()).accept(new r(z4, configuration));
            }
        } catch (Throwable th) {
            this.f8608v = false;
            throw th;
        }
    }
}
