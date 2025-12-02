package c1;

import java.util.concurrent.Executor;

/* renamed from: c1.b  reason: case insensitive filesystem */
public interface C0403b {
    Executor a();

    C0402a b();

    void c(Runnable runnable) {
        b().execute(runnable);
    }
}
