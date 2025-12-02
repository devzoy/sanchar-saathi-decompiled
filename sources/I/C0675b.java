package i;

import G.a;
import G.g;
import G.u;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import i0.C0699u;
import n.b;
import p.h0;

/* renamed from: i.b  reason: case insensitive filesystem */
public abstract class C0675b extends C0699u implements C0676c, u.a {

    /* renamed from: B  reason: collision with root package name */
    public C0677d f9641B;

    /* renamed from: C  reason: collision with root package name */
    public Resources f9642C;

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d0().d(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(d0().f(context));
    }

    public void closeOptionsMenu() {
        C0674a e02 = e0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (e02 == null || !e02.g()) {
            super.closeOptionsMenu();
        }
    }

    public C0677d d0() {
        if (this.f9641B == null) {
            this.f9641B = C0677d.g(this, this);
        }
        return this.f9641B;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        C0674a e02 = e0();
        if (keyCode != 82 || e02 == null || !e02.p(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public C0674a e0() {
        return d0().m();
    }

    public void f0(u uVar) {
        uVar.t(this);
    }

    public View findViewById(int i4) {
        return d0().i(i4);
    }

    public void g0(int i4) {
    }

    public MenuInflater getMenuInflater() {
        return d0().l();
    }

    public Resources getResources() {
        if (this.f9642C == null && h0.b()) {
            this.f9642C = new h0(this, super.getResources());
        }
        Resources resources = this.f9642C;
        return resources == null ? super.getResources() : resources;
    }

    public void h0(u uVar) {
    }

    public void i0() {
    }

    public void invalidateOptionsMenu() {
        d0().o();
    }

    public void j(b bVar) {
    }

    public boolean j0() {
        Intent q4 = q();
        if (q4 == null) {
            return false;
        }
        if (m0(q4)) {
            u v4 = u.v(this);
            f0(v4);
            h0(v4);
            v4.w();
            try {
                a.n(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            l0(q4);
            return true;
        }
    }

    public final boolean k0(KeyEvent keyEvent) {
        return false;
    }

    public void l0(Intent intent) {
        g.e(this, intent);
    }

    public boolean m0(Intent intent) {
        return g.f(this, intent);
    }

    public b n(b.a aVar) {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f9642C != null) {
            this.f9642C.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        d0().p(configuration);
    }

    public void onContentChanged() {
        i0();
    }

    public void onCreate(Bundle bundle) {
        C0677d d02 = d0();
        d02.n();
        d02.q(bundle);
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        d0().r();
    }

    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (k0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    public final boolean onMenuItemSelected(int i4, MenuItem menuItem) {
        if (super.onMenuItemSelected(i4, menuItem)) {
            return true;
        }
        C0674a e02 = e0();
        if (menuItem.getItemId() != 16908332 || e02 == null || (e02.j() & 4) == 0) {
            return false;
        }
        return j0();
    }

    public boolean onMenuOpened(int i4, Menu menu) {
        return super.onMenuOpened(i4, menu);
    }

    public void onPanelClosed(int i4, Menu menu) {
        super.onPanelClosed(i4, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        d0().s(bundle);
    }

    public void onPostResume() {
        super.onPostResume();
        d0().t();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        d0().u(bundle);
    }

    public void onStart() {
        super.onStart();
        d0().v();
    }

    public void onStop() {
        super.onStop();
        d0().w();
    }

    public void onTitleChanged(CharSequence charSequence, int i4) {
        super.onTitleChanged(charSequence, i4);
        d0().E(charSequence);
    }

    public void openOptionsMenu() {
        C0674a e02 = e0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (e02 == null || !e02.q()) {
            super.openOptionsMenu();
        }
    }

    public Intent q() {
        return g.a(this);
    }

    public void setContentView(int i4) {
        d0().A(i4);
    }

    public void setTheme(int i4) {
        super.setTheme(i4);
        d0().D(i4);
    }

    public void v(b bVar) {
    }

    public void setContentView(View view) {
        d0().B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d0().C(view, layoutParams);
    }
}
