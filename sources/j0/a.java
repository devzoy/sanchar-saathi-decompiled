package J0;

import G3.d;
import K0.f;
import android.app.Activity;
import java.util.concurrent.Executor;
import v3.l;

public final class a implements f {

    /* renamed from: b  reason: collision with root package name */
    public final f f1612b;

    /* renamed from: c  reason: collision with root package name */
    public final I0.a f1613c;

    public a(f fVar, I0.a aVar) {
        this.f1612b = fVar;
        this.f1613c = aVar;
    }

    public d a(Activity activity) {
        l.e(activity, "activity");
        return this.f1612b.a(activity);
    }

    public final void b(Activity activity, Executor executor, R.a aVar) {
        l.e(activity, "activity");
        l.e(executor, "executor");
        l.e(aVar, "consumer");
        this.f1613c.a(executor, aVar, this.f1612b.a(activity));
    }

    public final void c(R.a aVar) {
        l.e(aVar, "consumer");
        this.f1613c.b(aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(f fVar) {
        this(fVar, new I0.a());
        l.e(fVar, "tracker");
    }
}
