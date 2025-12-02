package n3;

import l3.e;
import v3.h;
import v3.l;
import v3.x;

public abstract class k extends d implements h {

    /* renamed from: h  reason: collision with root package name */
    public final int f11277h;

    public k(int i4, e eVar) {
        super(eVar);
        this.f11277h = i4;
    }

    public int d() {
        return this.f11277h;
    }

    public String toString() {
        if (m() != null) {
            return super.toString();
        }
        String f4 = x.f(this);
        l.d(f4, "renderLambdaToString(...)");
        return f4;
    }
}
