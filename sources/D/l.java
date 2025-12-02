package d;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0380g;
import androidx.lifecycle.C0384k;
import androidx.lifecycle.J;
import x0.C0998d;
import x0.C0999e;
import x0.C1000f;
import x0.C1001g;

public class l extends Dialog implements C0384k, s, C1000f {

    /* renamed from: c  reason: collision with root package name */
    public androidx.lifecycle.l f8629c;

    /* renamed from: d  reason: collision with root package name */
    public final C0999e f8630d = C0999e.f12698d.a(this);

    /* renamed from: e  reason: collision with root package name */
    public final q f8631e = new q(new k(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context, int i4) {
        super(context, i4);
        v3.l.e(context, "context");
    }

    public static final void e(l lVar) {
        v3.l.e(lVar, "this$0");
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v3.l.e(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    public C0380g b() {
        return c();
    }

    public final androidx.lifecycle.l c() {
        androidx.lifecycle.l lVar = this.f8629c;
        if (lVar != null) {
            return lVar;
        }
        androidx.lifecycle.l lVar2 = new androidx.lifecycle.l(this);
        this.f8629c = lVar2;
        return lVar2;
    }

    public void d() {
        Window window = getWindow();
        v3.l.b(window);
        View decorView = window.getDecorView();
        v3.l.d(decorView, "window!!.decorView");
        J.a(decorView, this);
        Window window2 = getWindow();
        v3.l.b(window2);
        View decorView2 = window2.getDecorView();
        v3.l.d(decorView2, "window!!.decorView");
        v.a(decorView2, this);
        Window window3 = getWindow();
        v3.l.b(window3);
        View decorView3 = window3.getDecorView();
        v3.l.d(decorView3, "window!!.decorView");
        C1001g.a(decorView3, this);
    }

    public final q k() {
        return this.f8631e;
    }

    public C0998d l() {
        return this.f8630d.b();
    }

    public void onBackPressed() {
        this.f8631e.k();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            q qVar = this.f8631e;
            OnBackInvokedDispatcher a4 = getOnBackInvokedDispatcher();
            v3.l.d(a4, "onBackInvokedDispatcher");
            qVar.n(a4);
        }
        this.f8630d.d(bundle);
        c().h(C0380g.a.ON_CREATE);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        v3.l.d(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f8630d.e(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public void onStart() {
        super.onStart();
        c().h(C0380g.a.ON_RESUME);
    }

    public void onStop() {
        c().h(C0380g.a.ON_DESTROY);
        this.f8629c = null;
        super.onStop();
    }

    public void setContentView(int i4) {
        d();
        super.setContentView(i4);
    }

    public void setContentView(View view) {
        v3.l.e(view, "view");
        d();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        v3.l.e(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
