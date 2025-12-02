package M3;

import I3.C;
import java.util.concurrent.atomic.AtomicReferenceArray;
import l3.i;

public final class f extends C {

    /* renamed from: i  reason: collision with root package name */
    public final AtomicReferenceArray f1838i = new AtomicReferenceArray(e.f1837f);

    public f(long j4, f fVar, int i4) {
        super(j4, fVar, i4);
    }

    public int n() {
        return e.f1837f;
    }

    public void o(int i4, Throwable th, i iVar) {
        r().set(i4, e.f1836e);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f1838i;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f1526g + ", hashCode=" + hashCode() + ']';
    }
}
