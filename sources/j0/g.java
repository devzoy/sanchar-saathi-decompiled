package j0;

import i0.C0695p;
import v3.l;

public abstract class g extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    public final C0695p f10826e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(C0695p pVar, String str) {
        super(str);
        l.e(pVar, "fragment");
        this.f10826e = pVar;
    }

    public final C0695p a() {
        return this.f10826e;
    }
}
