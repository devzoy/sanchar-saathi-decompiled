package g0;

import g0.f;
import java.util.Arrays;
import java.util.Map;
import v3.l;

public abstract class g {
    public static final f a() {
        return new c((Map) null, true, 1, (v3.g) null);
    }

    public static final c b(f.b... bVarArr) {
        l.e(bVarArr, "pairs");
        c cVar = new c((Map) null, false, 1, (v3.g) null);
        cVar.h((f.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return cVar;
    }
}
