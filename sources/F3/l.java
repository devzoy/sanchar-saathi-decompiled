package F3;

import D3.C0241e0;
import java.util.concurrent.CancellationException;

public abstract /* synthetic */ class l {
    public static final void a(s sVar, Throwable th) {
        CancellationException cancellationException = null;
        if (th != null) {
            if (th instanceof CancellationException) {
                cancellationException = (CancellationException) th;
            }
            if (cancellationException == null) {
                cancellationException = C0241e0.a("Channel was consumed, consumer had failed", th);
            }
        }
        sVar.c(cancellationException);
    }
}
