package a1;

import R0.E;
import R0.v;
import androidx.work.WorkerParameters;

public class t implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public E f3976e;

    /* renamed from: f  reason: collision with root package name */
    public v f3977f;

    /* renamed from: g  reason: collision with root package name */
    public WorkerParameters.a f3978g;

    public t(E e4, v vVar, WorkerParameters.a aVar) {
        this.f3976e = e4;
        this.f3977f = vVar;
        this.f3978g = aVar;
    }

    public void run() {
        this.f3976e.n().q(this.f3977f, this.f3978g);
    }
}
