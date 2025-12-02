package androidx.lifecycle;

import java.util.Map;
import q.C0882c;
import r.C0902b;

public abstract class p {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f5401k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f5402a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public C0902b f5403b = new C0902b();

    /* renamed from: c  reason: collision with root package name */
    public int f5404c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5405d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f5406e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f5407f;

    /* renamed from: g  reason: collision with root package name */
    public int f5408g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5409h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5410i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f5411j;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            Object obj;
            synchronized (p.this.f5402a) {
                obj = p.this.f5407f;
                p.this.f5407f = p.f5401k;
            }
            p.this.j(obj);
        }
    }

    public class b extends c {
        public b(s sVar) {
            super(sVar);
        }

        public boolean c() {
            return true;
        }
    }

    public abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final s f5414a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5415b;

        /* renamed from: c  reason: collision with root package name */
        public int f5416c = -1;

        public c(s sVar) {
            this.f5414a = sVar;
        }

        public void a(boolean z4) {
            if (z4 != this.f5415b) {
                this.f5415b = z4;
                p.this.b(z4 ? 1 : -1);
                if (this.f5415b) {
                    p.this.d(this);
                }
            }
        }

        public void b() {
        }

        public abstract boolean c();
    }

    public p() {
        Object obj = f5401k;
        this.f5407f = obj;
        this.f5411j = new a();
        this.f5406e = obj;
        this.f5408g = -1;
    }

    public static void a(String str) {
        if (!C0882c.g().b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    public void b(int i4) {
        int i5 = this.f5404c;
        this.f5404c = i4 + i5;
        if (!this.f5405d) {
            this.f5405d = true;
            while (true) {
                try {
                    int i6 = this.f5404c;
                    if (i5 != i6) {
                        boolean z4 = i5 == 0 && i6 > 0;
                        boolean z5 = i5 > 0 && i6 == 0;
                        if (z4) {
                            f();
                        } else if (z5) {
                            g();
                        }
                        i5 = i6;
                    } else {
                        this.f5405d = false;
                        return;
                    }
                } catch (Throwable th) {
                    this.f5405d = false;
                    throw th;
                }
            }
        }
    }

    public final void c(c cVar) {
        if (cVar.f5415b) {
            if (!cVar.c()) {
                cVar.a(false);
                return;
            }
            int i4 = cVar.f5416c;
            int i5 = this.f5408g;
            if (i4 < i5) {
                cVar.f5416c = i5;
                cVar.f5414a.a(this.f5406e);
            }
        }
    }

    public void d(c cVar) {
        if (this.f5409h) {
            this.f5410i = true;
            return;
        }
        this.f5409h = true;
        do {
            this.f5410i = false;
            if (cVar == null) {
                C0902b.d v4 = this.f5403b.v();
                while (v4.hasNext()) {
                    c((c) ((Map.Entry) v4.next()).getValue());
                    if (this.f5410i) {
                        break;
                    }
                }
            } else {
                c(cVar);
                cVar = null;
            }
        } while (this.f5410i);
        this.f5409h = false;
    }

    public void e(s sVar) {
        a("observeForever");
        b bVar = new b(sVar);
        if (((c) this.f5403b.y(sVar, bVar)) == null) {
            bVar.a(true);
        }
    }

    public void f() {
    }

    public void g() {
    }

    public void h(Object obj) {
        boolean z4;
        synchronized (this.f5402a) {
            z4 = this.f5407f == f5401k;
            this.f5407f = obj;
        }
        if (z4) {
            C0882c.g().c(this.f5411j);
        }
    }

    public void i(s sVar) {
        a("removeObserver");
        c cVar = (c) this.f5403b.z(sVar);
        if (cVar != null) {
            cVar.b();
            cVar.a(false);
        }
    }

    public void j(Object obj) {
        a("setValue");
        this.f5408g++;
        this.f5406e = obj;
        d((c) null);
    }
}
