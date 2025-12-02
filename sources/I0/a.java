package I0;

import D3.C0247h0;
import D3.C0248i;
import D3.I;
import D3.J;
import D3.K;
import D3.p0;
import G3.d;
import G3.e;
import h3.C0668i;
import h3.C0673n;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import l3.i;
import m3.C0795c;
import n3.k;
import u3.p;
import v3.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f1502a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final Map f1503b = new LinkedHashMap();

    /* renamed from: I0.a$a  reason: collision with other inner class name */
    public static final class C0025a extends k implements p {

        /* renamed from: i  reason: collision with root package name */
        public int f1504i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ d f1505j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ R.a f1506k;

        /* renamed from: I0.a$a$a  reason: collision with other inner class name */
        public static final class C0026a implements e {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ R.a f1507e;

            public C0026a(R.a aVar) {
                this.f1507e = aVar;
            }

            public final Object b(Object obj, l3.e eVar) {
                this.f1507e.accept(obj);
                return C0673n.f9639a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0025a(d dVar, R.a aVar, l3.e eVar) {
            super(2, eVar);
            this.f1505j = dVar;
            this.f1506k = aVar;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new C0025a(this.f1505j, this.f1506k, eVar);
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f1504i;
            if (i4 == 0) {
                C0668i.b(obj);
                d dVar = this.f1505j;
                C0026a aVar = new C0026a(this.f1506k);
                this.f1504i = 1;
                if (dVar.c(aVar, this) == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(I i4, l3.e eVar) {
            return ((C0025a) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public final void a(Executor executor, R.a aVar, d dVar) {
        l.e(executor, "executor");
        l.e(aVar, "consumer");
        l.e(dVar, "flow");
        ReentrantLock reentrantLock = this.f1502a;
        reentrantLock.lock();
        try {
            if (this.f1503b.get(aVar) == null) {
                this.f1503b.put(aVar, C0248i.b(J.a(C0247h0.a(executor)), (i) null, (K) null, new C0025a(dVar, aVar, (l3.e) null), 3, (Object) null));
            }
            C0673n nVar = C0673n.f9639a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(R.a aVar) {
        l.e(aVar, "consumer");
        ReentrantLock reentrantLock = this.f1502a;
        reentrantLock.lock();
        try {
            p0 p0Var = (p0) this.f1503b.get(aVar);
            if (p0Var != null) {
                p0.a.a(p0Var, (CancellationException) null, 1, (Object) null);
            }
            p0 p0Var2 = (p0) this.f1503b.remove(aVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
