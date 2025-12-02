package D3;

import java.util.concurrent.locks.LockSupport;

/* renamed from: D3.b0  reason: case insensitive filesystem */
public abstract class C0235b0 extends Z {
    public abstract Thread a0();

    public final void b0() {
        Thread a02 = a0();
        if (Thread.currentThread() != a02) {
            C0236c.a();
            LockSupport.unpark(a02);
        }
    }
}
