package n3;

import l3.e;
import l3.i;

public abstract class j extends C0807a {
    public j(e eVar) {
        super(eVar);
        if (eVar != null && eVar.a() != l3.j.f11131e) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    public i a() {
        return l3.j.f11131e;
    }
}
