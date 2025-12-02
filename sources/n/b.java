package n;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b {

    /* renamed from: c  reason: collision with root package name */
    public Object f11154c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11155d;

    public interface a {
        boolean a(b bVar, Menu menu);

        boolean b(b bVar, MenuItem menuItem);

        void c(b bVar);

        boolean d(b bVar, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f11154c;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f11155d;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i4);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f11154c = obj;
    }

    public abstract void q(int i4);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z4) {
        this.f11155d = z4;
    }
}
