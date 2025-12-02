package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import v3.l;

public final class CombineContinuationsWorker extends Worker {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        l.e(context, "context");
        l.e(workerParameters, "workerParams");
    }

    public c.a o() {
        c.a d4 = c.a.d(g());
        l.d(d4, "success(inputData)");
        return d4;
    }
}
