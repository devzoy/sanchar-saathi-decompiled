package a1;

import java.util.concurrent.Executor;

public class v implements Executor {
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
