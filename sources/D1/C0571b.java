package d1;

import androidx.work.impl.workers.ConstraintTrackingWorker;
import y2.C1007a;

/* renamed from: d1.b  reason: case insensitive filesystem */
public final /* synthetic */ class C0571b implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f8673e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C1007a f8674f;

    public /* synthetic */ C0571b(ConstraintTrackingWorker constraintTrackingWorker, C1007a aVar) {
        this.f8673e = constraintTrackingWorker;
        this.f8674f = aVar;
    }

    public final void run() {
        ConstraintTrackingWorker.r(this.f8673e, this.f8674f);
    }
}
