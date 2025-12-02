package G3;

import D3.C0256m;
import H3.c;
import H3.d;
import h3.C0667h;
import h3.C0673n;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l3.e;
import m3.C0794b;
import m3.C0795c;
import n3.h;
import v3.l;
import w.b;

public final class u extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1346a = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d */
    public boolean a(s sVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1346a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, t.f1344a);
        return true;
    }

    public final Object e(e eVar) {
        C0256m mVar = new C0256m(C0794b.b(eVar), 1);
        mVar.A();
        if (!b.a(f1346a, this, t.f1344a, mVar)) {
            C0667h.a aVar = C0667h.f9633e;
            mVar.q(C0667h.a(C0673n.f9639a));
        }
        Object x4 = mVar.x();
        if (x4 == C0795c.c()) {
            h.c(eVar);
        }
        return x4 == C0795c.c() ? x4 : C0673n.f9639a;
    }

    /* renamed from: f */
    public e[] b(s sVar) {
        f1346a.set(this, (Object) null);
        return c.f1441a;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1346a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null && obj != t.f1345b) {
                if (obj == t.f1344a) {
                    if (b.a(f1346a, this, obj, t.f1345b)) {
                        return;
                    }
                } else if (b.a(f1346a, this, obj, t.f1344a)) {
                    C0667h.a aVar = C0667h.f9633e;
                    ((C0256m) obj).q(C0667h.a(C0673n.f9639a));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = f1346a.getAndSet(this, t.f1344a);
        l.b(andSet);
        return andSet == t.f1345b;
    }
}
