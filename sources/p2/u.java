package p2;

import R1.g;
import android.os.Bundle;
import q2.s;
import s2.C0923a;

public final class u extends t {
    public u(w wVar, g gVar) {
        super(wVar, new s("OnCompleteUpdateCallback"), gVar);
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.f11727d.c(new C0923a(bundle.getInt("error.code", -2)));
        } else {
            this.f11727d.d((Object) null);
        }
    }
}
