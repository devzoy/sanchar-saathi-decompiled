package I3;

import D3.M;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v3.l;
import v3.p;

public class q {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1568e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1569f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1570g;
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public static abstract class a extends C0273b {

        /* renamed from: b  reason: collision with root package name */
        public final q f1571b;

        /* renamed from: c  reason: collision with root package name */
        public q f1572c;

        public a(q qVar) {
            this.f1571b = qVar;
        }

        /* renamed from: e */
        public void b(q qVar, Object obj) {
            boolean z4 = obj == null;
            q qVar2 = z4 ? this.f1571b : this.f1572c;
            if (qVar2 != null && w.b.a(q.f1568e, qVar, this, qVar2) && z4) {
                q qVar3 = this.f1571b;
                q qVar4 = this.f1572c;
                l.b(qVar4);
                qVar3.q(qVar4);
            }
        }
    }

    public /* synthetic */ class b extends p {
        public b(Object obj) {
            super(obj, M.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return M.a(this.f12446f);
        }
    }

    static {
        Class<q> cls = q.class;
        Class<Object> cls2 = Object.class;
        f1568e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next");
        f1569f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev");
        f1570g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef");
    }

    public final boolean n(q qVar) {
        f1569f.lazySet(qVar, this);
        f1568e.lazySet(qVar, this);
        while (r() == this) {
            if (w.b.a(f1568e, this, this, qVar)) {
                qVar.q(this);
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: I3.q} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (w.b.a(r4, r3, r2, ((I3.z) r5).f1588a) != false) goto L_0x0045;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final I3.q o(I3.y r9) {
        /*
            r8 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1569f
            java.lang.Object r0 = r0.get(r8)
            I3.q r0 = (I3.q) r0
            r1 = 0
            r2 = r0
        L_0x000a:
            r3 = r1
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f1568e
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L_0x0020
            if (r0 != r2) goto L_0x0016
            return r2
        L_0x0016:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f1569f
            boolean r0 = w.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L_0x001f
            goto L_0x0000
        L_0x001f:
            return r2
        L_0x0020:
            boolean r6 = r8.u()
            if (r6 == 0) goto L_0x0027
            return r1
        L_0x0027:
            if (r5 != r9) goto L_0x002a
            return r2
        L_0x002a:
            boolean r6 = r5 instanceof I3.y
            if (r6 == 0) goto L_0x0034
            I3.y r5 = (I3.y) r5
            r5.a(r2)
            goto L_0x0000
        L_0x0034:
            boolean r6 = r5 instanceof I3.z
            if (r6 == 0) goto L_0x0050
            if (r3 == 0) goto L_0x0047
            I3.z r5 = (I3.z) r5
            I3.q r5 = r5.f1588a
            boolean r2 = w.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L_0x0045
            goto L_0x0000
        L_0x0045:
            r2 = r3
            goto L_0x000a
        L_0x0047:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f1569f
            java.lang.Object r2 = r4.get(r2)
            I3.q r2 = (I3.q) r2
            goto L_0x000b
        L_0x0050:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            v3.l.c(r5, r3)
            r3 = r5
            I3.q r3 = (I3.q) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.q.o(I3.y):I3.q");
    }

    public final q p(q qVar) {
        while (qVar.u()) {
            qVar = (q) f1569f.get(qVar);
        }
        return qVar;
    }

    public final void q(q qVar) {
        q qVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1569f;
        do {
            qVar2 = (q) atomicReferenceFieldUpdater.get(qVar);
            if (r() != qVar) {
                return;
            }
        } while (!w.b.a(f1569f, qVar, qVar2, this));
        if (u()) {
            qVar.o((y) null);
        }
    }

    public final Object r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1568e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y)) {
                return obj;
            }
            ((y) obj).a(this);
        }
    }

    public final q s() {
        return p.b(r());
    }

    public final q t() {
        q o4 = o((y) null);
        return o4 == null ? p((q) f1569f.get(this)) : o4;
    }

    public String toString() {
        return new b(this) + '@' + M.b(this);
    }

    public boolean u() {
        return r() instanceof z;
    }

    public boolean v() {
        return w() == null;
    }

    public final q w() {
        Object r4;
        q qVar;
        do {
            r4 = r();
            if (r4 instanceof z) {
                return ((z) r4).f1588a;
            }
            if (r4 == this) {
                return (q) r4;
            }
            l.c(r4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            qVar = (q) r4;
        } while (!w.b.a(f1568e, this, r4, qVar.x()));
        qVar.o((y) null);
        return null;
    }

    public final z x() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1570g;
        z zVar = (z) atomicReferenceFieldUpdater.get(this);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this);
        atomicReferenceFieldUpdater.lazySet(this, zVar2);
        return zVar2;
    }

    public final int y(q qVar, q qVar2, a aVar) {
        f1569f.lazySet(qVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1568e;
        atomicReferenceFieldUpdater.lazySet(qVar, qVar2);
        aVar.f1572c = qVar2;
        if (!w.b.a(atomicReferenceFieldUpdater, this, qVar2, aVar)) {
            return 0;
        }
        return aVar.a(this) == null ? 1 : 2;
    }
}
