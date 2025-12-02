package S;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: S.b  reason: case insensitive filesystem */
public abstract class C0311b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2679a;

    /* renamed from: b  reason: collision with root package name */
    public a f2680b;

    /* renamed from: c  reason: collision with root package name */
    public C0055b f2681c;

    /* renamed from: S.b$a */
    public interface a {
    }

    /* renamed from: S.b$b  reason: collision with other inner class name */
    public interface C0055b {
        void onActionProviderVisibilityChanged(boolean z4);
    }

    public C0311b(Context context) {
        this.f2679a = context;
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract View c(MenuItem menuItem);

    public abstract boolean d();

    public abstract void e(SubMenu subMenu);

    public abstract boolean f();

    public void g() {
        this.f2681c = null;
        this.f2680b = null;
    }

    public void h(a aVar) {
        this.f2680b = aVar;
    }

    public abstract void i(C0055b bVar);
}
