package S;

import android.support.v4.media.session.b;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: S.m  reason: case insensitive filesystem */
public class C0322m {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f2693a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f2694b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final Map f2695c = new HashMap();

    public C0322m(Runnable runnable) {
        this.f2693a = runnable;
    }

    public void a(C0324o oVar) {
        this.f2694b.add(oVar);
        this.f2693a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f2694b.iterator();
        while (it.hasNext()) {
            ((C0324o) it.next()).c(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator it = this.f2694b.iterator();
        while (it.hasNext()) {
            ((C0324o) it.next()).b(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator it = this.f2694b.iterator();
        while (it.hasNext()) {
            if (((C0324o) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator it = this.f2694b.iterator();
        while (it.hasNext()) {
            ((C0324o) it.next()).d(menu);
        }
    }

    public void f(C0324o oVar) {
        this.f2694b.remove(oVar);
        b.a(this.f2695c.remove(oVar));
        this.f2693a.run();
    }
}
