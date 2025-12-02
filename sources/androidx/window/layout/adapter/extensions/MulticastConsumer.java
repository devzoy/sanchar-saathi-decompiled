package androidx.window.layout.adapter.extensions;

import K0.j;
import M0.f;
import R.a;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import h3.C0673n;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import v3.l;

public final class MulticastConsumer implements a, Consumer<WindowLayoutInfo> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6048a;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f6049b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public j f6050c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f6051d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        l.e(context, "context");
        this.f6048a = context;
    }

    public final void a(a aVar) {
        l.e(aVar, "listener");
        ReentrantLock reentrantLock = this.f6049b;
        reentrantLock.lock();
        try {
            j jVar = this.f6050c;
            if (jVar != null) {
                aVar.accept(jVar);
            }
            this.f6051d.add(aVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean b() {
        return this.f6051d.isEmpty();
    }

    public final void c(a aVar) {
        l.e(aVar, "listener");
        ReentrantLock reentrantLock = this.f6049b;
        reentrantLock.lock();
        try {
            this.f6051d.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void accept(WindowLayoutInfo windowLayoutInfo) {
        l.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f6049b;
        reentrantLock.lock();
        try {
            j c4 = f.f1795a.c(this.f6048a, windowLayoutInfo);
            this.f6050c = c4;
            for (a accept : this.f6051d) {
                accept.accept(c4);
            }
            C0673n nVar = C0673n.f9639a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
