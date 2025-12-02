package N2;

import M2.b;
import N2.C0294h;
import N2.C0295i;
import O2.e;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.C0384k;
import androidx.lifecycle.l;
import io.flutter.plugin.platform.f;
import java.util.List;

/* renamed from: N2.g  reason: case insensitive filesystem */
public abstract class C0293g extends Activity implements C0294h.c, C0384k {

    /* renamed from: g  reason: collision with root package name */
    public static final int f1903g = View.generateViewId();

    /* renamed from: c  reason: collision with root package name */
    public boolean f1904c = false;

    /* renamed from: d  reason: collision with root package name */
    public C0294h f1905d;

    /* renamed from: e  reason: collision with root package name */
    public l f1906e;

    /* renamed from: f  reason: collision with root package name */
    public final OnBackInvokedCallback f1907f;

    /* renamed from: N2.g$a */
    public class a implements OnBackAnimationCallback {
        public a() {
        }

        public void onBackCancelled() {
            C0293g.this.H();
        }

        public void onBackInvoked() {
            C0293g.this.I();
        }

        public void onBackProgressed(BackEvent backEvent) {
            C0293g.this.X(backEvent);
        }

        public void onBackStarted(BackEvent backEvent) {
            C0293g.this.T(backEvent);
        }
    }

    public C0293g() {
        this.f1907f = Build.VERSION.SDK_INT < 33 ? null : M();
        this.f1906e = new l(this);
    }

    public H A() {
        return N() == C0295i.a.opaque ? H.surface : H.texture;
    }

    public boolean B() {
        return true;
    }

    public io.flutter.embedding.engine.a C(Context context) {
        return null;
    }

    public void D(n nVar) {
    }

    public boolean E() {
        return this.f1904c;
    }

    public I F() {
        return N() == C0295i.a.opaque ? I.opaque : I.transparent;
    }

    public void G(io.flutter.embedding.engine.a aVar) {
        if (!this.f1905d.p()) {
            W2.a.a(aVar);
        }
    }

    public void H() {
        if (U("cancelBackGesture")) {
            this.f1905d.h();
        }
    }

    public void I() {
        if (U("commitBackGesture")) {
            this.f1905d.i();
        }
    }

    public final void J() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    public final void K() {
        if (N() == C0295i.a.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final View L() {
        return this.f1905d.u((LayoutInflater) null, (ViewGroup) null, (Bundle) null, f1903g, A() == H.surface);
    }

    public final OnBackInvokedCallback M() {
        return Build.VERSION.SDK_INT >= 34 ? new a() : new C0292f(this);
    }

    public C0295i.a N() {
        return getIntent().hasExtra("background_mode") ? C0295i.a.valueOf(getIntent().getStringExtra("background_mode")) : C0295i.a.opaque;
    }

    public io.flutter.embedding.engine.a O() {
        return this.f1905d.n();
    }

    public Bundle P() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final boolean Q() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    public void R() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f1907f);
            this.f1904c = true;
        }
    }

    public void S() {
        W();
        C0294h hVar = this.f1905d;
        if (hVar != null) {
            hVar.I();
            this.f1905d = null;
        }
    }

    public void T(BackEvent backEvent) {
        if (U("startBackGesture")) {
            this.f1905d.K(backEvent);
        }
    }

    public final boolean U(String str) {
        C0294h hVar = this.f1905d;
        if (hVar == null) {
            b.g("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        } else if (hVar.o()) {
            return true;
        } else {
            b.g("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
            return false;
        }
    }

    public final void V() {
        try {
            Bundle P4 = P();
            if (P4 != null) {
                int i4 = P4.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i4 != -1) {
                    setTheme(i4);
                    return;
                }
                return;
            }
            b.f("FlutterActivity", "Using the launch theme as normal theme.");
        } catch (PackageManager.NameNotFoundException unused) {
            b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public void W() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f1907f);
            this.f1904c = false;
        }
    }

    public void X(BackEvent backEvent) {
        if (U("updateBackGestureProgress")) {
            this.f1905d.L(backEvent);
        }
    }

    public Context a() {
        return this;
    }

    public C0380g b() {
        return this.f1906e;
    }

    public boolean c() {
        return false;
    }

    public void d() {
    }

    public Activity e() {
        return this;
    }

    public void f() {
        b.g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + O() + " evicted by another attaching activity");
        C0294h hVar = this.f1905d;
        if (hVar != null) {
            hVar.v();
            this.f1905d.w();
        }
    }

    public void g() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    public void h(boolean z4) {
        if (z4 && !this.f1904c) {
            R();
        } else if (!z4 && this.f1904c) {
            W();
        }
    }

    public String i() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    public String j() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle P4 = P();
            if (P4 != null) {
                return P4.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public List m() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public boolean n() {
        return true;
    }

    public boolean o() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (q() != null || this.f1905d.p()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public void onActivityResult(int i4, int i5, Intent intent) {
        if (U("onActivityResult")) {
            this.f1905d.r(i4, i5, intent);
        }
    }

    public void onBackPressed() {
        if (U("onBackPressed")) {
            this.f1905d.t();
        }
    }

    public void onCreate(Bundle bundle) {
        V();
        super.onCreate(bundle);
        if (bundle != null) {
            h(bundle.getBoolean("enableOnBackInvokedCallbackState"));
        }
        C0294h hVar = new C0294h(this);
        this.f1905d = hVar;
        hVar.s(this);
        this.f1905d.A(bundle);
        this.f1906e.h(C0380g.a.ON_CREATE);
        K();
        setContentView(L());
        J();
    }

    public void onDestroy() {
        super.onDestroy();
        if (U("onDestroy")) {
            this.f1905d.v();
            this.f1905d.w();
        }
        S();
        this.f1906e.h(C0380g.a.ON_DESTROY);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (U("onNewIntent")) {
            this.f1905d.x(intent);
        }
    }

    public void onPause() {
        super.onPause();
        if (U("onPause")) {
            this.f1905d.y();
        }
        this.f1906e.h(C0380g.a.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        if (U("onPostResume")) {
            this.f1905d.z();
        }
    }

    public void onResume() {
        super.onResume();
        this.f1906e.h(C0380g.a.ON_RESUME);
        if (U("onResume")) {
            this.f1905d.B();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (U("onSaveInstanceState")) {
            this.f1905d.C(bundle);
        }
    }

    public void onStart() {
        super.onStart();
        this.f1906e.h(C0380g.a.ON_START);
        if (U("onStart")) {
            this.f1905d.D();
        }
    }

    public void onStop() {
        super.onStop();
        if (U("onStop")) {
            this.f1905d.E();
        }
        this.f1906e.h(C0380g.a.ON_STOP);
    }

    public void onTrimMemory(int i4) {
        super.onTrimMemory(i4);
        if (U("onTrimMemory")) {
            this.f1905d.F(i4);
        }
    }

    public void onUserLeaveHint() {
        if (U("onUserLeaveHint")) {
            this.f1905d.G();
        }
    }

    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        if (U("onWindowFocusChanged")) {
            this.f1905d.H(z4);
        }
    }

    public boolean p() {
        return true;
    }

    public String q() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public boolean r() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : q() == null;
    }

    public String s() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle P4 = P();
            String string = P4 != null ? P4.getString("io.flutter.Entrypoint") : null;
            return string != null ? string : "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public void t(io.flutter.embedding.engine.a aVar) {
    }

    public String u() {
        try {
            Bundle P4 = P();
            if (P4 != null) {
                return P4.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public f v(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new f(e(), aVar.p(), this);
    }

    public String w() {
        String dataString;
        if (!Q() || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public boolean x() {
        try {
            return C0295i.a(P());
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public void y(m mVar) {
    }

    public e z() {
        return e.a(getIntent());
    }
}
