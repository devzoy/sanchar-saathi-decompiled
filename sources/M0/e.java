package M0;

import L0.a;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import h3.C0673n;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import v3.l;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f1791a;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f1792b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public final Map f1793c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map f1794d = new LinkedHashMap();

    public e(WindowLayoutComponent windowLayoutComponent) {
        l.e(windowLayoutComponent, "component");
        this.f1791a = windowLayoutComponent;
    }

    public void a(Context context, Executor executor, R.a aVar) {
        C0673n nVar;
        l.e(context, "context");
        l.e(executor, "executor");
        l.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f1792b;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f1793c.get(context);
            if (multicastConsumer != null) {
                multicastConsumer.a(aVar);
                this.f1794d.put(aVar, context);
                nVar = C0673n.f9639a;
            } else {
                nVar = null;
            }
            if (nVar == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                this.f1793c.put(context, multicastConsumer2);
                this.f1794d.put(aVar, context);
                multicastConsumer2.a(aVar);
                this.f1791a.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
            C0673n nVar2 = C0673n.f9639a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public void b(R.a aVar) {
        l.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f1792b;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f1794d.get(aVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) this.f1793c.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.c(aVar);
            this.f1794d.remove(aVar);
            if (multicastConsumer.b()) {
                this.f1793c.remove(context);
                this.f1791a.removeWindowLayoutInfoListener(multicastConsumer);
            }
            C0673n nVar = C0673n.f9639a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
