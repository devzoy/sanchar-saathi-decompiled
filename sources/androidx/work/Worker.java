package androidx.work;

import Q0.e;
import android.content.Context;
import androidx.work.c;
import b1.C0392c;
import y2.C1007a;

public abstract class Worker extends c {

    /* renamed from: g  reason: collision with root package name */
    public C0392c f6080g;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                Worker.this.f6080g.p(Worker.this.o());
            } catch (Throwable th) {
                Worker.this.f6080g.q(th);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ C0392c f6082e;

        public b(C0392c cVar) {
            this.f6082e = cVar;
        }

        public void run() {
            try {
                this.f6082e.p(Worker.this.p());
            } catch (Throwable th) {
                this.f6082e.q(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public C1007a d() {
        C0392c t4 = C0392c.t();
        c().execute(new b(t4));
        return t4;
    }

    public final C1007a m() {
        this.f6080g = C0392c.t();
        c().execute(new a());
        return this.f6080g;
    }

    public abstract c.a o();

    public e p() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }
}
