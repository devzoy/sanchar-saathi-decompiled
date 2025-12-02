package H3;

import G3.e;
import java.util.concurrent.CancellationException;

public final class a extends CancellationException {

    /* renamed from: e  reason: collision with root package name */
    public final transient e f1437e;

    public a(e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f1437e = eVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
