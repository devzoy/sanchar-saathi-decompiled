package x3;

import java.util.Random;
import v3.l;

public final class b extends a {

    /* renamed from: g  reason: collision with root package name */
    public final a f12704g = new a();

    public static final class a extends ThreadLocal {
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    public Random d() {
        Object obj = this.f12704g.get();
        l.d(obj, "get(...)");
        return (Random) obj;
    }
}
