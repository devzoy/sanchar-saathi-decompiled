package b1;

import java.util.concurrent.Executor;

/* renamed from: b1.b  reason: case insensitive filesystem */
public enum C0391b implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
