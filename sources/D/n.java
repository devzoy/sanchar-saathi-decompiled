package d;

import h3.C0673n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import u3.a;
import v3.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f8633a;

    /* renamed from: b  reason: collision with root package name */
    public final a f8634b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8635c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int f8636d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8637e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8638f;

    /* renamed from: g  reason: collision with root package name */
    public final List f8639g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f8640h = new m(this);

    public n(Executor executor, a aVar) {
        l.e(executor, "executor");
        l.e(aVar, "reportFullyDrawn");
        this.f8633a = executor;
        this.f8634b = aVar;
    }

    public static final void d(n nVar) {
        l.e(nVar, "this$0");
        synchronized (nVar.f8635c) {
            try {
                nVar.f8637e = false;
                if (nVar.f8636d == 0 && !nVar.f8638f) {
                    nVar.f8634b.c();
                    nVar.b();
                }
                C0673n nVar2 = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f8635c) {
            try {
                this.f8638f = true;
                for (a c4 : this.f8639g) {
                    c4.c();
                }
                this.f8639g.clear();
                C0673n nVar = C0673n.f9639a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z4;
        synchronized (this.f8635c) {
            z4 = this.f8638f;
        }
        return z4;
    }
}
