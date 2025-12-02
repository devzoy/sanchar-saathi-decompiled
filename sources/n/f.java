package n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import n.b;
import o.C0810c;
import o.C0812e;
import v.g;

public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11168a;

    /* renamed from: b  reason: collision with root package name */
    public final b f11169b;

    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f11170a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f11171b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f11172c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final g f11173d = new g();

        public a(Context context, ActionMode.Callback callback) {
            this.f11171b = context;
            this.f11170a = callback;
        }

        public boolean a(b bVar, Menu menu) {
            return this.f11170a.onCreateActionMode(e(bVar), f(menu));
        }

        public boolean b(b bVar, MenuItem menuItem) {
            return this.f11170a.onActionItemClicked(e(bVar), new C0810c(this.f11171b, (L.b) menuItem));
        }

        public void c(b bVar) {
            this.f11170a.onDestroyActionMode(e(bVar));
        }

        public boolean d(b bVar, Menu menu) {
            return this.f11170a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f11172c.size();
            for (int i4 = 0; i4 < size; i4++) {
                f fVar = (f) this.f11172c.get(i4);
                if (fVar != null && fVar.f11169b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f11171b, bVar);
            this.f11172c.add(fVar2);
            return fVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f11173d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0812e eVar = new C0812e(this.f11171b, (L.a) menu);
            this.f11173d.put(menu, eVar);
            return eVar;
        }
    }

    public f(Context context, b bVar) {
        this.f11168a = context;
        this.f11169b = bVar;
    }

    public void finish() {
        this.f11169b.c();
    }

    public View getCustomView() {
        return this.f11169b.d();
    }

    public Menu getMenu() {
        return new C0812e(this.f11168a, (L.a) this.f11169b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f11169b.f();
    }

    public CharSequence getSubtitle() {
        return this.f11169b.g();
    }

    public Object getTag() {
        return this.f11169b.h();
    }

    public CharSequence getTitle() {
        return this.f11169b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.f11169b.j();
    }

    public void invalidate() {
        this.f11169b.k();
    }

    public boolean isTitleOptional() {
        return this.f11169b.l();
    }

    public void setCustomView(View view) {
        this.f11169b.m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f11169b.o(charSequence);
    }

    public void setTag(Object obj) {
        this.f11169b.p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f11169b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean z4) {
        this.f11169b.s(z4);
    }

    public void setSubtitle(int i4) {
        this.f11169b.n(i4);
    }

    public void setTitle(int i4) {
        this.f11169b.q(i4);
    }
}
