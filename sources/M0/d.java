package M0;

import H0.d;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import h3.C0673n;
import i3.C0738o;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import u3.l;
import v3.j;
import v3.x;

public final class d implements L0.a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f1785a;

    /* renamed from: b  reason: collision with root package name */
    public final H0.d f1786b;

    /* renamed from: c  reason: collision with root package name */
    public final ReentrantLock f1787c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    public final Map f1788d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Map f1789e = new LinkedHashMap();

    /* renamed from: f  reason: collision with root package name */
    public final Map f1790f = new LinkedHashMap();

    public /* synthetic */ class a extends j implements l {
        public a(Object obj) {
            super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object i(Object obj) {
            o((WindowLayoutInfo) obj);
            return C0673n.f9639a;
        }

        public final void o(WindowLayoutInfo windowLayoutInfo) {
            v3.l.e(windowLayoutInfo, "p0");
            ((MulticastConsumer) this.f12446f).accept(windowLayoutInfo);
        }
    }

    public d(WindowLayoutComponent windowLayoutComponent, H0.d dVar) {
        v3.l.e(windowLayoutComponent, "component");
        v3.l.e(dVar, "consumerAdapter");
        this.f1785a = windowLayoutComponent;
        this.f1786b = dVar;
    }

    public void a(Context context, Executor executor, R.a aVar) {
        C0673n nVar;
        v3.l.e(context, "context");
        v3.l.e(executor, "executor");
        v3.l.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f1787c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f1788d.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(aVar);
                this.f1789e.put(aVar, context);
                nVar = C0673n.f9639a;
            } else {
                nVar = null;
            }
            if (nVar == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.f1788d.put(context, multicastConsumer2);
                this.f1789e.put(aVar, context);
                multicastConsumer2.a(aVar);
                if (context instanceof Activity) {
                    this.f1790f.put(multicastConsumer2, this.f1786b.c(this.f1785a, x.b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new a(multicastConsumer2)));
                } else {
                    multicastConsumer2.accept(new WindowLayoutInfo(C0738o.h()));
                    reentrantLock.unlock();
                    return;
                }
            }
            C0673n nVar2 = C0673n.f9639a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void b(R.a aVar) {
        v3.l.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f1787c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f1789e.get(aVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f1788d.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.c(aVar);
            this.f1789e.remove(aVar);
            if (multicastConsumer.b()) {
                this.f1788d.remove(context);
                d.b bVar = (d.b) this.f1790f.remove(multicastConsumer);
                if (bVar != null) {
                    bVar.a();
                }
            }
            C0673n nVar = C0673n.f9639a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
