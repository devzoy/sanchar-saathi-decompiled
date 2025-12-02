package u0;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import v3.l;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final u f12177a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f12178b;

    public m(u uVar) {
        l.e(uVar, "database");
        this.f12177a = uVar;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        l.d(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f12178b = newSetFromMap;
    }
}
