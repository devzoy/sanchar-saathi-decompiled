package l3;

import l3.i;
import u3.p;
import v3.l;

/* renamed from: l3.a  reason: case insensitive filesystem */
public abstract class C0783a implements i.b {

    /* renamed from: e  reason: collision with root package name */
    public final i.c f11124e;

    public C0783a(i.c cVar) {
        l.e(cVar, "key");
        this.f11124e = cVar;
    }

    public i B(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    public Object H(Object obj, p pVar) {
        return i.b.a.a(this, obj, pVar);
    }

    public i.b d(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    public i.c getKey() {
        return this.f11124e;
    }

    public i h(i iVar) {
        return i.b.a.d(this, iVar);
    }
}
