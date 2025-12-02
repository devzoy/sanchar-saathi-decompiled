package n;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n.b;

public class e extends b implements e.a {

    /* renamed from: e  reason: collision with root package name */
    public Context f11161e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f11162f;

    /* renamed from: g  reason: collision with root package name */
    public b.a f11163g;

    /* renamed from: h  reason: collision with root package name */
    public WeakReference f11164h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11165i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11166j;

    /* renamed from: k  reason: collision with root package name */
    public androidx.appcompat.view.menu.e f11167k;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z4) {
        this.f11161e = context;
        this.f11162f = actionBarContextView;
        this.f11163g = aVar;
        androidx.appcompat.view.menu.e S3 = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f11167k = S3;
        S3.R(this);
        this.f11166j = z4;
    }

    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f11163g.b(this, menuItem);
    }

    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f11162f.l();
    }

    public void c() {
        if (!this.f11165i) {
            this.f11165i = true;
            this.f11162f.sendAccessibilityEvent(32);
            this.f11163g.c(this);
        }
    }

    public View d() {
        WeakReference weakReference = this.f11164h;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f11167k;
    }

    public MenuInflater f() {
        return new g(this.f11162f.getContext());
    }

    public CharSequence g() {
        return this.f11162f.getSubtitle();
    }

    public CharSequence i() {
        return this.f11162f.getTitle();
    }

    public void k() {
        this.f11163g.d(this, this.f11167k);
    }

    public boolean l() {
        return this.f11162f.j();
    }

    public void m(View view) {
        this.f11162f.setCustomView(view);
        this.f11164h = view != null ? new WeakReference(view) : null;
    }

    public void n(int i4) {
        o(this.f11161e.getString(i4));
    }

    public void o(CharSequence charSequence) {
        this.f11162f.setSubtitle(charSequence);
    }

    public void q(int i4) {
        r(this.f11161e.getString(i4));
    }

    public void r(CharSequence charSequence) {
        this.f11162f.setTitle(charSequence);
    }

    public void s(boolean z4) {
        super.s(z4);
        this.f11162f.setTitleOptional(z4);
    }
}
