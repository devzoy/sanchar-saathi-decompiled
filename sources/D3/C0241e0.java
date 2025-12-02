package D3;

import java.util.concurrent.CancellationException;

/* renamed from: D3.e0  reason: case insensitive filesystem */
public abstract class C0241e0 {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
