package d1;

import androidx.work.impl.workers.ConstraintTrackingWorker;

/* renamed from: d1.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0570a implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ConstraintTrackingWorker f8672e;

    public /* synthetic */ C0570a(ConstraintTrackingWorker constraintTrackingWorker) {
        this.f8672e = constraintTrackingWorker;
    }

    public final void run() {
        ConstraintTrackingWorker.s(this.f8672e);
    }
}
