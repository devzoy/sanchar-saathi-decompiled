package androidx.lifecycle;

import G3.n;
import G3.t;
import androidx.lifecycle.C0380g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import r.C0901a;
import r.C0902b;
import v3.g;

public class l extends C0380g {

    /* renamed from: k  reason: collision with root package name */
    public static final a f5385k = new a((g) null);

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5386b;

    /* renamed from: c  reason: collision with root package name */
    public C0901a f5387c;

    /* renamed from: d  reason: collision with root package name */
    public C0380g.b f5388d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference f5389e;

    /* renamed from: f  reason: collision with root package name */
    public int f5390f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5391g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5392h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f5393i;

    /* renamed from: j  reason: collision with root package name */
    public final n f5394j;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final C0380g.b a(C0380g.b bVar, C0380g.b bVar2) {
            v3.l.e(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public C0380g.b f5395a;

        /* renamed from: b  reason: collision with root package name */
        public C0382i f5396b;

        public b(C0383j jVar, C0380g.b bVar) {
            v3.l.e(bVar, "initialState");
            v3.l.b(jVar);
            this.f5396b = o.f(jVar);
            this.f5395a = bVar;
        }

        public final void a(C0384k kVar, C0380g.a aVar) {
            v3.l.e(aVar, "event");
            C0380g.b f4 = aVar.f();
            this.f5395a = l.f5385k.a(this.f5395a, f4);
            C0382i iVar = this.f5396b;
            v3.l.b(kVar);
            iVar.d(kVar, aVar);
            this.f5395a = f4;
        }

        public final C0380g.b b() {
            return this.f5395a;
        }
    }

    public l(C0384k kVar, boolean z4) {
        this.f5386b = z4;
        this.f5387c = new C0901a();
        C0380g.b bVar = C0380g.b.INITIALIZED;
        this.f5388d = bVar;
        this.f5393i = new ArrayList();
        this.f5389e = new WeakReference(kVar);
        this.f5394j = t.a(bVar);
    }

    public void a(C0383j jVar) {
        C0384k kVar;
        v3.l.e(jVar, "observer");
        f("addObserver");
        C0380g.b bVar = this.f5388d;
        C0380g.b bVar2 = C0380g.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C0380g.b.INITIALIZED;
        }
        b bVar3 = new b(jVar, bVar2);
        if (((b) this.f5387c.y(jVar, bVar3)) == null && (kVar = (C0384k) this.f5389e.get()) != null) {
            boolean z4 = this.f5390f != 0 || this.f5391g;
            C0380g.b e4 = e(jVar);
            this.f5390f++;
            while (bVar3.b().compareTo(e4) < 0 && this.f5387c.contains(jVar)) {
                l(bVar3.b());
                C0380g.a b4 = C0380g.a.Companion.b(bVar3.b());
                if (b4 != null) {
                    bVar3.a(kVar, b4);
                    k();
                    e4 = e(jVar);
                } else {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
            }
            if (!z4) {
                n();
            }
            this.f5390f--;
        }
    }

    public C0380g.b b() {
        return this.f5388d;
    }

    public void c(C0383j jVar) {
        v3.l.e(jVar, "observer");
        f("removeObserver");
        this.f5387c.z(jVar);
    }

    public final void d(C0384k kVar) {
        Iterator s4 = this.f5387c.s();
        v3.l.d(s4, "observerMap.descendingIterator()");
        while (s4.hasNext() && !this.f5392h) {
            Map.Entry entry = (Map.Entry) s4.next();
            v3.l.d(entry, "next()");
            C0383j jVar = (C0383j) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f5388d) > 0 && !this.f5392h && this.f5387c.contains(jVar)) {
                C0380g.a a4 = C0380g.a.Companion.a(bVar.b());
                if (a4 != null) {
                    l(a4.f());
                    bVar.a(kVar, a4);
                    k();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = (androidx.lifecycle.l.b) r4.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.C0380g.b e(androidx.lifecycle.C0383j r4) {
        /*
            r3 = this;
            r.a r0 = r3.f5387c
            java.util.Map$Entry r4 = r0.A(r4)
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.Object r4 = r4.getValue()
            androidx.lifecycle.l$b r4 = (androidx.lifecycle.l.b) r4
            if (r4 == 0) goto L_0x0016
            androidx.lifecycle.g$b r4 = r4.b()
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            java.util.ArrayList r1 = r3.f5393i
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x002d
            java.util.ArrayList r0 = r3.f5393i
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.g$b r0 = (androidx.lifecycle.C0380g.b) r0
        L_0x002d:
            androidx.lifecycle.l$a r1 = f5385k
            androidx.lifecycle.g$b r2 = r3.f5388d
            androidx.lifecycle.g$b r4 = r1.a(r2, r4)
            androidx.lifecycle.g$b r4 = r1.a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.l.e(androidx.lifecycle.j):androidx.lifecycle.g$b");
    }

    public final void f(String str) {
        if (this.f5386b && !m.a()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void g(C0384k kVar) {
        C0902b.d v4 = this.f5387c.v();
        v3.l.d(v4, "observerMap.iteratorWithAdditions()");
        while (v4.hasNext() && !this.f5392h) {
            Map.Entry entry = (Map.Entry) v4.next();
            C0383j jVar = (C0383j) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f5388d) < 0 && !this.f5392h && this.f5387c.contains(jVar)) {
                l(bVar.b());
                C0380g.a b4 = C0380g.a.Companion.b(bVar.b());
                if (b4 != null) {
                    bVar.a(kVar, b4);
                    k();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
            }
        }
    }

    public void h(C0380g.a aVar) {
        v3.l.e(aVar, "event");
        f("handleLifecycleEvent");
        j(aVar.f());
    }

    public final boolean i() {
        if (this.f5387c.size() == 0) {
            return true;
        }
        Map.Entry t4 = this.f5387c.t();
        v3.l.b(t4);
        C0380g.b b4 = ((b) t4.getValue()).b();
        Map.Entry w4 = this.f5387c.w();
        v3.l.b(w4);
        C0380g.b b5 = ((b) w4.getValue()).b();
        return b4 == b5 && this.f5388d == b5;
    }

    public final void j(C0380g.b bVar) {
        C0380g.b bVar2 = this.f5388d;
        if (bVar2 != bVar) {
            if (bVar2 == C0380g.b.INITIALIZED && bVar == C0380g.b.DESTROYED) {
                throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f5388d + " in component " + this.f5389e.get()).toString());
            }
            this.f5388d = bVar;
            if (this.f5391g || this.f5390f != 0) {
                this.f5392h = true;
                return;
            }
            this.f5391g = true;
            n();
            this.f5391g = false;
            if (this.f5388d == C0380g.b.DESTROYED) {
                this.f5387c = new C0901a();
            }
        }
    }

    public final void k() {
        ArrayList arrayList = this.f5393i;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void l(C0380g.b bVar) {
        this.f5393i.add(bVar);
    }

    public void m(C0380g.b bVar) {
        v3.l.e(bVar, "state");
        f("setCurrentState");
        j(bVar);
    }

    public final void n() {
        C0384k kVar = (C0384k) this.f5389e.get();
        if (kVar != null) {
            while (!i()) {
                this.f5392h = false;
                C0380g.b bVar = this.f5388d;
                Map.Entry t4 = this.f5387c.t();
                v3.l.b(t4);
                if (bVar.compareTo(((b) t4.getValue()).b()) < 0) {
                    d(kVar);
                }
                Map.Entry w4 = this.f5387c.w();
                if (!this.f5392h && w4 != null && this.f5388d.compareTo(((b) w4.getValue()).b()) > 0) {
                    g(kVar);
                }
            }
            this.f5392h = false;
            this.f5394j.setValue(b());
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l(C0384k kVar) {
        this(kVar, true);
        v3.l.e(kVar, "provider");
    }
}
