package M3;

import D3.C0254l;
import D3.C0256m;
import D3.C0260o;
import D3.M;
import D3.N0;
import I3.C;
import h3.C0673n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l3.e;
import l3.i;
import m3.C0794b;
import m3.C0795c;
import n3.h;
import u3.l;
import u3.q;
import v3.m;

public class b extends d implements a {

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1808i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* renamed from: h  reason: collision with root package name */
    public final q f1809h;
    private volatile Object owner;

    public final class a implements C0254l, N0 {

        /* renamed from: e  reason: collision with root package name */
        public final C0256m f1810e;

        /* renamed from: f  reason: collision with root package name */
        public final Object f1811f;

        /* renamed from: M3.b$a$a  reason: collision with other inner class name */
        public static final class C0037a extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ b f1813f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ a f1814g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0037a(b bVar, a aVar) {
                super(1);
                this.f1813f = bVar;
                this.f1814g = aVar;
            }

            public final void a(Throwable th) {
                this.f1813f.a(this.f1814g.f1811f);
            }

            public /* bridge */ /* synthetic */ Object i(Object obj) {
                a((Throwable) obj);
                return C0673n.f9639a;
            }
        }

        /* renamed from: M3.b$a$b  reason: collision with other inner class name */
        public static final class C0038b extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ b f1815f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ a f1816g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0038b(b bVar, a aVar) {
                super(1);
                this.f1815f = bVar;
                this.f1816g = aVar;
            }

            public final void a(Throwable th) {
                b.f1808i.set(this.f1815f, this.f1816g.f1811f);
                this.f1815f.a(this.f1816g.f1811f);
            }

            public /* bridge */ /* synthetic */ Object i(Object obj) {
                a((Throwable) obj);
                return C0673n.f9639a;
            }
        }

        public a(C0256m mVar, Object obj) {
            this.f1810e = mVar;
            this.f1811f = obj;
        }

        public void I(l lVar) {
            this.f1810e.I(lVar);
        }

        public void K(Object obj) {
            this.f1810e.K(obj);
        }

        public i a() {
            return this.f1810e.a();
        }

        public void b(C c4, int i4) {
            this.f1810e.b(c4, i4);
        }

        /* renamed from: c */
        public void v(C0673n nVar, l lVar) {
            b.f1808i.set(b.this, this.f1811f);
            this.f1810e.v(nVar, new C0037a(b.this, this));
        }

        /* renamed from: d */
        public Object u(C0673n nVar, Object obj, l lVar) {
            Object u4 = this.f1810e.u(nVar, obj, new C0038b(b.this, this));
            if (u4 != null) {
                b.f1808i.set(b.this, this.f1811f);
            }
            return u4;
        }

        public void q(Object obj) {
            this.f1810e.q(obj);
        }
    }

    /* renamed from: M3.b$b  reason: collision with other inner class name */
    public static final class C0039b extends m implements q {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b f1817f;

        /* renamed from: M3.b$b$a */
        public static final class a extends m implements l {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ b f1818f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ Object f1819g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, Object obj) {
                super(1);
                this.f1818f = bVar;
                this.f1819g = obj;
            }

            public final void a(Throwable th) {
                this.f1818f.a(this.f1819g);
            }

            public /* bridge */ /* synthetic */ Object i(Object obj) {
                a((Throwable) obj);
                return C0673n.f9639a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0039b(b bVar) {
            super(3);
            this.f1817f = bVar;
        }

        public final l a(L3.a aVar, Object obj, Object obj2) {
            return new a(this.f1817f, obj);
        }

        public /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3) {
            android.support.v4.media.session.b.a(obj);
            return a((L3.a) null, obj2, obj3);
        }
    }

    public b(boolean z4) {
        super(1, z4 ? 1 : 0);
        this.owner = z4 ? null : c.f1820a;
        this.f1809h = new C0039b(this);
    }

    public static /* synthetic */ Object p(b bVar, Object obj, e eVar) {
        if (bVar.c(obj)) {
            return C0673n.f9639a;
        }
        Object q4 = bVar.q(obj, eVar);
        return q4 == C0795c.c() ? q4 : C0673n.f9639a;
    }

    public void a(Object obj) {
        while (o()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1808i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != c.f1820a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                } else if (w.b.a(atomicReferenceFieldUpdater, this, obj2, c.f1820a)) {
                    i();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public Object b(Object obj, e eVar) {
        return p(this, obj, eVar);
    }

    public boolean c(Object obj) {
        int r4 = r(obj);
        if (r4 == 0) {
            return true;
        }
        if (r4 == 1) {
            return false;
        }
        if (r4 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final int n(Object obj) {
        while (o()) {
            Object obj2 = f1808i.get(this);
            if (obj2 != c.f1820a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public boolean o() {
        return h() == 0;
    }

    public final Object q(Object obj, e eVar) {
        C0256m b4 = C0260o.b(C0794b.b(eVar));
        try {
            d(new a(b4, obj));
            Object x4 = b4.x();
            if (x4 == C0795c.c()) {
                h.c(eVar);
            }
            return x4 == C0795c.c() ? x4 : C0673n.f9639a;
        } catch (Throwable th) {
            b4.L();
            throw th;
        }
    }

    public final int r(Object obj) {
        while (!j()) {
            if (obj == null) {
                return 1;
            }
            int n4 = n(obj);
            if (n4 == 1) {
                return 2;
            }
            if (n4 == 2) {
                return 1;
            }
        }
        f1808i.set(this, obj);
        return 0;
    }

    public String toString() {
        return "Mutex@" + M.b(this) + "[isLocked=" + o() + ",owner=" + f1808i.get(this) + ']';
    }
}
