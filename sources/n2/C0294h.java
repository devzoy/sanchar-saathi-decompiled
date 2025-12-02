package N2;

import O2.e;
import P2.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.window.BackEvent;
import androidx.lifecycle.C0380g;
import io.flutter.embedding.engine.b;
import io.flutter.embedding.engine.renderer.m;
import io.flutter.plugin.platform.f;
import java.util.List;

/* renamed from: N2.h  reason: case insensitive filesystem */
public class C0294h implements C0288b {

    /* renamed from: a  reason: collision with root package name */
    public c f1909a;

    /* renamed from: b  reason: collision with root package name */
    public io.flutter.embedding.engine.a f1910b;

    /* renamed from: c  reason: collision with root package name */
    public u f1911c;

    /* renamed from: d  reason: collision with root package name */
    public f f1912d;

    /* renamed from: e  reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f1913e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1914f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1915g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1916h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1917i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f1918j;

    /* renamed from: k  reason: collision with root package name */
    public io.flutter.embedding.engine.b f1919k;

    /* renamed from: l  reason: collision with root package name */
    public final m f1920l;

    /* renamed from: N2.h$a */
    public class a implements m {
        public a() {
        }

        public void d() {
            C0294h.this.f1909a.d();
            boolean unused = C0294h.this.f1915g = false;
        }

        public void g() {
            C0294h.this.f1909a.g();
            boolean unused = C0294h.this.f1915g = true;
            boolean unused2 = C0294h.this.f1916h = true;
        }
    }

    /* renamed from: N2.h$b */
    public class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ u f1922c;

        public b(u uVar) {
            this.f1922c = uVar;
        }

        public boolean onPreDraw() {
            if (C0294h.this.f1915g && C0294h.this.f1913e != null) {
                this.f1922c.getViewTreeObserver().removeOnPreDrawListener(this);
                C0294h.this.f1913e = null;
            }
            return C0294h.this.f1915g;
        }
    }

    /* renamed from: N2.h$c */
    public interface c extends f.d {
        H A();

        boolean B();

        io.flutter.embedding.engine.a C(Context context);

        void D(n nVar);

        boolean E();

        I F();

        void G(io.flutter.embedding.engine.a aVar);

        Context a();

        C0380g b();

        void d();

        Activity e();

        void f();

        void g();

        String i();

        String j();

        List m();

        boolean n();

        boolean o();

        boolean p();

        String q();

        boolean r();

        String s();

        void t(io.flutter.embedding.engine.a aVar);

        String u();

        f v(Activity activity, io.flutter.embedding.engine.a aVar);

        String w();

        boolean x();

        void y(m mVar);

        e z();
    }

    public C0294h(c cVar) {
        this(cVar, (io.flutter.embedding.engine.b) null);
    }

    public void A(Bundle bundle) {
        byte[] bArr;
        Bundle bundle2;
        M2.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        l();
        if (bundle != null) {
            bundle2 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
        } else {
            bundle2 = null;
            bArr = null;
        }
        if (this.f1909a.r()) {
            this.f1910b.u().j(bArr);
        }
        if (this.f1909a.n()) {
            this.f1910b.i().d(bundle2);
        }
    }

    public void B() {
        io.flutter.embedding.engine.a aVar;
        M2.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        l();
        if (this.f1909a.p() && (aVar = this.f1910b) != null) {
            aVar.l().e();
        }
    }

    public void C(Bundle bundle) {
        M2.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        l();
        if (this.f1909a.r()) {
            bundle.putByteArray("framework", this.f1910b.u().h());
        }
        if (this.f1909a.n()) {
            Bundle bundle2 = new Bundle();
            this.f1910b.i().f(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
        if (this.f1909a.q() != null && !this.f1909a.o()) {
            bundle.putBoolean("enableOnBackInvokedCallbackState", this.f1909a.E());
        }
    }

    public void D() {
        M2.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        l();
        k();
        Integer num = this.f1918j;
        if (num != null) {
            this.f1911c.setVisibility(num.intValue());
        }
    }

    public void E() {
        io.flutter.embedding.engine.a aVar;
        M2.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        l();
        if (this.f1909a.p() && (aVar = this.f1910b) != null) {
            aVar.l().d();
        }
        this.f1918j = Integer.valueOf(this.f1911c.getVisibility());
        this.f1911c.setVisibility(8);
        io.flutter.embedding.engine.a aVar2 = this.f1910b;
        if (aVar2 != null) {
            aVar2.t().o(40);
        }
    }

    public void F(int i4) {
        l();
        io.flutter.embedding.engine.a aVar = this.f1910b;
        if (aVar != null) {
            if (this.f1916h && i4 >= 10) {
                aVar.k().n();
                this.f1910b.y().a();
            }
            this.f1910b.t().o(i4);
            this.f1910b.q().o0(i4);
        }
    }

    public void G() {
        l();
        if (this.f1910b != null) {
            M2.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f1910b.i().g();
            return;
        }
        M2.b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }

    public void H(boolean z4) {
        io.flutter.embedding.engine.a aVar;
        l();
        StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        sb.append(z4 ? "true" : "false");
        M2.b.f("FlutterActivityAndFragmentDelegate", sb.toString());
        if (this.f1909a.p() && (aVar = this.f1910b) != null) {
            if (z4) {
                aVar.l().a();
            } else {
                aVar.l().f();
            }
        }
    }

    public void I() {
        this.f1909a = null;
        this.f1910b = null;
        this.f1911c = null;
        this.f1912d = null;
    }

    public void J() {
        M2.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String q4 = this.f1909a.q();
        if (q4 != null) {
            io.flutter.embedding.engine.a a4 = O2.a.b().a(q4);
            this.f1910b = a4;
            this.f1914f = true;
            if (a4 == null) {
                throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + q4 + "'");
            }
            return;
        }
        c cVar = this.f1909a;
        io.flutter.embedding.engine.a C4 = cVar.C(cVar.a());
        this.f1910b = C4;
        if (C4 != null) {
            this.f1914f = true;
            return;
        }
        String i4 = this.f1909a.i();
        if (i4 != null) {
            io.flutter.embedding.engine.b a5 = O2.c.b().a(i4);
            if (a5 != null) {
                this.f1910b = a5.a(e(new b.C0174b(this.f1909a.a())));
                this.f1914f = false;
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + i4 + "'");
        }
        M2.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        io.flutter.embedding.engine.b bVar = this.f1919k;
        if (bVar == null) {
            bVar = new io.flutter.embedding.engine.b(this.f1909a.a(), this.f1909a.z().b());
        }
        this.f1910b = bVar.a(e(new b.C0174b(this.f1909a.a()).h(false).l(this.f1909a.r())));
        this.f1914f = false;
    }

    public void K(BackEvent backEvent) {
        l();
        if (this.f1910b != null) {
            M2.b.f("FlutterActivityAndFragmentDelegate", "Forwarding startBackGesture() to FlutterEngine.");
            this.f1910b.j().d(backEvent);
            return;
        }
        M2.b.g("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
    }

    public void L(BackEvent backEvent) {
        l();
        if (this.f1910b != null) {
            M2.b.f("FlutterActivityAndFragmentDelegate", "Forwarding updateBackGestureProgress() to FlutterEngine.");
            this.f1910b.j().e(backEvent);
            return;
        }
        M2.b.g("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
    }

    public void M() {
        f fVar = this.f1912d;
        if (fVar != null) {
            fVar.E();
        }
    }

    public final b.C0174b e(b.C0174b bVar) {
        String w4 = this.f1909a.w();
        if (w4 == null || w4.isEmpty()) {
            w4 = M2.a.e().c().g();
        }
        a.c cVar = new a.c(w4, this.f1909a.s());
        String j4 = this.f1909a.j();
        if (j4 == null && (j4 = q(this.f1909a.e().getIntent())) == null) {
            j4 = "/";
        }
        return bVar.i(cVar).k(j4).j(this.f1909a.m());
    }

    public void f() {
        if (!this.f1909a.o()) {
            this.f1909a.f();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f1909a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public void h() {
        l();
        if (this.f1910b != null) {
            M2.b.f("FlutterActivityAndFragmentDelegate", "Forwarding cancelBackGesture() to FlutterEngine.");
            this.f1910b.j().b();
            return;
        }
        M2.b.g("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
    }

    public void i() {
        l();
        if (this.f1910b != null) {
            M2.b.f("FlutterActivityAndFragmentDelegate", "Forwarding commitBackGesture() to FlutterEngine.");
            this.f1910b.j().c();
            return;
        }
        M2.b.g("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
    }

    public final void j(u uVar) {
        if (this.f1909a.A() == H.surface) {
            if (this.f1913e != null) {
                uVar.getViewTreeObserver().removeOnPreDrawListener(this.f1913e);
            }
            this.f1913e = new b(uVar);
            uVar.getViewTreeObserver().addOnPreDrawListener(this.f1913e);
            return;
        }
        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
    }

    public final void k() {
        String str;
        if (this.f1909a.q() == null && !this.f1910b.k().m()) {
            String j4 = this.f1909a.j();
            if (j4 == null && (j4 = q(this.f1909a.e().getIntent())) == null) {
                j4 = "/";
            }
            String u4 = this.f1909a.u();
            if (("Executing Dart entrypoint: " + this.f1909a.s() + ", library uri: " + u4) == null) {
                str = "\"\"";
            } else {
                str = u4 + ", and sending initial route: " + j4;
            }
            M2.b.f("FlutterActivityAndFragmentDelegate", str);
            this.f1910b.o().c(j4);
            String w4 = this.f1909a.w();
            if (w4 == null || w4.isEmpty()) {
                w4 = M2.a.e().c().g();
            }
            this.f1910b.k().k(u4 == null ? new a.c(w4, this.f1909a.s()) : new a.c(w4, u4, this.f1909a.s()), this.f1909a.m());
        }
    }

    public final void l() {
        if (this.f1909a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    /* renamed from: m */
    public Activity g() {
        Activity e4 = this.f1909a.e();
        if (e4 != null) {
            return e4;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    public io.flutter.embedding.engine.a n() {
        return this.f1910b;
    }

    public boolean o() {
        return this.f1917i;
    }

    public boolean p() {
        return this.f1914f;
    }

    public final String q(Intent intent) {
        Uri data;
        if (!this.f1909a.x() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public void r(int i4, int i5, Intent intent) {
        l();
        if (this.f1910b != null) {
            M2.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i4 + "\nresultCode: " + i5 + "\ndata: " + intent);
            this.f1910b.i().onActivityResult(i4, i5, intent);
            return;
        }
        M2.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }

    public void s(Context context) {
        l();
        if (this.f1910b == null) {
            J();
        }
        if (this.f1909a.n()) {
            M2.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f1910b.i().c(this, this.f1909a.b());
        }
        c cVar = this.f1909a;
        this.f1912d = cVar.v(cVar.e(), this.f1910b);
        this.f1909a.G(this.f1910b);
        this.f1917i = true;
    }

    public void t() {
        l();
        if (this.f1910b != null) {
            M2.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f1910b.o().a();
            return;
        }
        M2.b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }

    public View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i4, boolean z4) {
        M2.b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        l();
        boolean z5 = false;
        if (this.f1909a.A() == H.surface) {
            Context a4 = this.f1909a.a();
            if (this.f1909a.F() == I.transparent) {
                z5 = true;
            }
            m mVar = new m(a4, z5);
            this.f1909a.y(mVar);
            this.f1911c = new u(this.f1909a.a(), mVar);
        } else {
            n nVar = new n(this.f1909a.a());
            if (this.f1909a.F() == I.opaque) {
                z5 = true;
            }
            nVar.setOpaque(z5);
            this.f1909a.D(nVar);
            this.f1911c = new u(this.f1909a.a(), nVar);
        }
        this.f1911c.l(this.f1920l);
        if (this.f1909a.B()) {
            M2.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.f1911c.n(this.f1910b);
        }
        this.f1911c.setId(i4);
        if (z4) {
            j(this.f1911c);
        }
        return this.f1911c;
    }

    public void v() {
        M2.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        l();
        if (this.f1913e != null) {
            this.f1911c.getViewTreeObserver().removeOnPreDrawListener(this.f1913e);
            this.f1913e = null;
        }
        u uVar = this.f1911c;
        if (uVar != null) {
            uVar.s();
            this.f1911c.y(this.f1920l);
        }
    }

    public void w() {
        io.flutter.embedding.engine.a aVar;
        if (this.f1917i) {
            M2.b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
            l();
            this.f1909a.t(this.f1910b);
            if (this.f1909a.n()) {
                M2.b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
                if (this.f1909a.e().isChangingConfigurations()) {
                    this.f1910b.i().b();
                } else {
                    this.f1910b.i().e();
                }
            }
            f fVar = this.f1912d;
            if (fVar != null) {
                fVar.q();
                this.f1912d = null;
            }
            if (this.f1909a.p() && (aVar = this.f1910b) != null) {
                aVar.l().b();
            }
            if (this.f1909a.o()) {
                this.f1910b.g();
                if (this.f1909a.q() != null) {
                    O2.a.b().d(this.f1909a.q());
                }
                this.f1910b = null;
            }
            this.f1917i = false;
        }
    }

    public void x(Intent intent) {
        l();
        if (this.f1910b != null) {
            M2.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
            this.f1910b.i().onNewIntent(intent);
            String q4 = q(intent);
            if (q4 != null && !q4.isEmpty()) {
                this.f1910b.o().b(q4);
                return;
            }
            return;
        }
        M2.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
    }

    public void y() {
        io.flutter.embedding.engine.a aVar;
        M2.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        l();
        if (this.f1909a.p() && (aVar = this.f1910b) != null) {
            aVar.l().c();
        }
    }

    public void z() {
        M2.b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        l();
        if (this.f1910b != null) {
            M();
            this.f1910b.q().n0();
            return;
        }
        M2.b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
    }

    public C0294h(c cVar, io.flutter.embedding.engine.b bVar) {
        this.f1920l = new a();
        this.f1909a = cVar;
        this.f1916h = false;
        this.f1919k = bVar;
    }
}
