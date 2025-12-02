package D3;

import u3.l;
import v3.g;

/* renamed from: D3.y  reason: case insensitive filesystem */
public final class C0270y {

    /* renamed from: a  reason: collision with root package name */
    public final Object f865a;

    /* renamed from: b  reason: collision with root package name */
    public final C0250j f866b;

    /* renamed from: c  reason: collision with root package name */
    public final l f867c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f868d;

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f869e;

    public C0270y(Object obj, C0250j jVar, l lVar, Object obj2, Throwable th) {
        this.f865a = obj;
        this.f866b = jVar;
        this.f867c = lVar;
        this.f868d = obj2;
        this.f869e = th;
    }

    public static /* synthetic */ C0270y b(C0270y yVar, Object obj, C0250j jVar, l lVar, Object obj2, Throwable th, int i4, Object obj3) {
        if ((i4 & 1) != 0) {
            obj = yVar.f865a;
        }
        if ((i4 & 2) != 0) {
            jVar = yVar.f866b;
        }
        C0250j jVar2 = jVar;
        if ((i4 & 4) != 0) {
            lVar = yVar.f867c;
        }
        l lVar2 = lVar;
        if ((i4 & 8) != 0) {
            obj2 = yVar.f868d;
        }
        Object obj4 = obj2;
        if ((i4 & 16) != 0) {
            th = yVar.f869e;
        }
        return yVar.a(obj, jVar2, lVar2, obj4, th);
    }

    public final C0270y a(Object obj, C0250j jVar, l lVar, Object obj2, Throwable th) {
        return new C0270y(obj, jVar, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f869e != null;
    }

    public final void d(C0256m mVar, Throwable th) {
        C0250j jVar = this.f866b;
        if (jVar != null) {
            mVar.j(jVar, th);
        }
        l lVar = this.f867c;
        if (lVar != null) {
            mVar.k(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0270y)) {
            return false;
        }
        C0270y yVar = (C0270y) obj;
        return v3.l.a(this.f865a, yVar.f865a) && v3.l.a(this.f866b, yVar.f866b) && v3.l.a(this.f867c, yVar.f867c) && v3.l.a(this.f868d, yVar.f868d) && v3.l.a(this.f869e, yVar.f869e);
    }

    public int hashCode() {
        Object obj = this.f865a;
        int i4 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        C0250j jVar = this.f866b;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        l lVar = this.f867c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f868d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f869e;
        if (th != null) {
            i4 = th.hashCode();
        }
        return hashCode4 + i4;
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f865a + ", cancelHandler=" + this.f866b + ", onCancellation=" + this.f867c + ", idempotentResume=" + this.f868d + ", cancelCause=" + this.f869e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0270y(Object obj, C0250j jVar, l lVar, Object obj2, Throwable th, int i4, g gVar) {
        this(obj, (i4 & 2) != 0 ? null : jVar, (i4 & 4) != 0 ? null : lVar, (i4 & 8) != 0 ? null : obj2, (i4 & 16) != 0 ? null : th);
    }
}
