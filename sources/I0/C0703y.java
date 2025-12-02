package i0;

import R.g;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* renamed from: i0.y  reason: case insensitive filesystem */
public class C0703y {

    /* renamed from: a  reason: collision with root package name */
    public final C0679A f10237a;

    public C0703y(C0679A a4) {
        this.f10237a = a4;
    }

    public static C0703y b(C0679A a4) {
        return new C0703y((C0679A) g.d(a4, "callbacks == null"));
    }

    public void a(C0695p pVar) {
        I q4 = this.f10237a.q();
        C0679A a4 = this.f10237a;
        q4.l(a4, a4, pVar);
    }

    public void c() {
        this.f10237a.q().x();
    }

    public boolean d(MenuItem menuItem) {
        return this.f10237a.q().A(menuItem);
    }

    public void e() {
        this.f10237a.q().B();
    }

    public void f() {
        this.f10237a.q().D();
    }

    public void g() {
        this.f10237a.q().M();
    }

    public void h() {
        this.f10237a.q().Q();
    }

    public void i() {
        this.f10237a.q().R();
    }

    public void j() {
        this.f10237a.q().T();
    }

    public boolean k() {
        return this.f10237a.q().a0(true);
    }

    public I l() {
        return this.f10237a.q();
    }

    public void m() {
        this.f10237a.q().X0();
    }

    public View n(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f10237a.q().w0().onCreateView(view, str, context, attributeSet);
    }
}
