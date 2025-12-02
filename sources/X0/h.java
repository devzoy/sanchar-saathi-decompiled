package X0;

import Q0.i;
import V0.a;
import android.content.Context;
import c1.C0403b;
import h3.C0673n;
import i3.C0746w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import v3.l;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public final C0403b f3447a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f3448b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3449c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet f3450d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public Object f3451e;

    public h(Context context, C0403b bVar) {
        l.e(context, "context");
        l.e(bVar, "taskExecutor");
        this.f3447a = bVar;
        Context applicationContext = context.getApplicationContext();
        l.d(applicationContext, "context.applicationContext");
        this.f3448b = applicationContext;
    }

    public static final void b(List list, h hVar) {
        l.e(list, "$listenersList");
        l.e(hVar, "this$0");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(hVar.f3451e);
        }
    }

    public final void c(a aVar) {
        l.e(aVar, "listener");
        synchronized (this.f3449c) {
            try {
                if (this.f3450d.add(aVar)) {
                    if (this.f3450d.size() == 1) {
                        this.f3451e = e();
                        i e4 = i.e();
                        String a4 = i.f3452a;
                        e4.a(a4, getClass().getSimpleName() + ": initial state = " + this.f3451e);
                        h();
                    }
                    aVar.a(this.f3451e);
                }
                C0673n nVar = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context d() {
        return this.f3448b;
    }

    public abstract Object e();

    public final void f(a aVar) {
        l.e(aVar, "listener");
        synchronized (this.f3449c) {
            try {
                if (this.f3450d.remove(aVar) && this.f3450d.isEmpty()) {
                    i();
                }
                C0673n nVar = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Object obj) {
        synchronized (this.f3449c) {
            Object obj2 = this.f3451e;
            if (obj2 == null || !l.a(obj2, obj)) {
                this.f3451e = obj;
                this.f3447a.a().execute(new g(C0746w.I(this.f3450d), this));
                C0673n nVar = C0673n.f9639a;
            }
        }
    }

    public abstract void h();

    public abstract void i();
}
