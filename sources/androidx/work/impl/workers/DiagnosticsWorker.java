package androidx.work.impl.workers;

import Q0.i;
import R0.E;
import Z0.j;
import Z0.o;
import Z0.v;
import Z0.z;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import d1.C0573d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import v3.l;

public final class DiagnosticsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.e(context, "context");
        l.e(workerParameters, "parameters");
    }

    public c.a o() {
        E l4 = E.l(a());
        l.d(l4, "getInstance(applicationContext)");
        WorkDatabase q4 = l4.q();
        l.d(q4, "workManager.workDatabase");
        v J4 = q4.J();
        o H4 = q4.H();
        z K4 = q4.K();
        j G4 = q4.G();
        List i4 = J4.i(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List b4 = J4.b();
        List t4 = J4.t(200);
        if (!i4.isEmpty()) {
            i.e().f(C0573d.f8676a, "Recently completed work:\n\n");
            i.e().f(C0573d.f8676a, C0573d.d(H4, K4, G4, i4));
        }
        if (!b4.isEmpty()) {
            i.e().f(C0573d.f8676a, "Running work:\n\n");
            i.e().f(C0573d.f8676a, C0573d.d(H4, K4, G4, b4));
        }
        if (!t4.isEmpty()) {
            i.e().f(C0573d.f8676a, "Enqueued work:\n\n");
            i.e().f(C0573d.f8676a, C0573d.d(H4, K4, G4, t4));
        }
        c.a c4 = c.a.c();
        l.d(c4, "success()");
        return c4;
    }
}
