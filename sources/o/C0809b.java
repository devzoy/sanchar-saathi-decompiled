package o;

import L.b;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import v.g;

/* renamed from: o.b  reason: case insensitive filesystem */
public abstract class C0809b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11299a;

    /* renamed from: b  reason: collision with root package name */
    public g f11300b;

    /* renamed from: c  reason: collision with root package name */
    public g f11301c;

    public C0809b(Context context) {
        this.f11299a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.f11300b == null) {
            this.f11300b = new g();
        }
        MenuItem menuItem2 = (MenuItem) this.f11300b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0810c cVar = new C0810c(this.f11299a, bVar);
        this.f11300b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    public final void e() {
        g gVar = this.f11300b;
        if (gVar != null) {
            gVar.clear();
        }
        g gVar2 = this.f11301c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    public final void f(int i4) {
        if (this.f11300b != null) {
            int i5 = 0;
            while (i5 < this.f11300b.size()) {
                if (((b) this.f11300b.i(i5)).getGroupId() == i4) {
                    this.f11300b.k(i5);
                    i5--;
                }
                i5++;
            }
        }
    }

    public final void g(int i4) {
        if (this.f11300b != null) {
            for (int i5 = 0; i5 < this.f11300b.size(); i5++) {
                if (((b) this.f11300b.i(i5)).getItemId() == i4) {
                    this.f11300b.k(i5);
                    return;
                }
            }
        }
    }
}
