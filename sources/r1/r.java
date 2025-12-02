package R1;

import java.util.concurrent.Executor;

public final class r implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
