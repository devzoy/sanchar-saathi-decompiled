package v3;

import java.io.Serializable;

public abstract class m implements h, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public final int f12462e;

    public m(int i4) {
        this.f12462e = i4;
    }

    public int d() {
        return this.f12462e;
    }

    public String toString() {
        String g4 = x.g(this);
        l.d(g4, "renderLambdaToString(...)");
        return g4;
    }
}
