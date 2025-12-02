package M0;

import K0.j;
import L0.a;
import android.content.Context;
import i3.C0738o;
import java.util.concurrent.Executor;
import v3.l;

public final class c implements a {
    public static final void d(R.a aVar) {
        l.e(aVar, "$callback");
        aVar.accept(new j(C0738o.h()));
    }

    public void a(Context context, Executor executor, R.a aVar) {
        l.e(context, "context");
        l.e(executor, "executor");
        l.e(aVar, "callback");
        executor.execute(new b(aVar));
    }

    public void b(R.a aVar) {
        l.e(aVar, "callback");
    }
}
