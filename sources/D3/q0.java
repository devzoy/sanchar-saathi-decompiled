package D3;

import java.util.concurrent.CancellationException;
import v3.l;

public final class q0 extends CancellationException {

    /* renamed from: e  reason: collision with root package name */
    public final transient p0 f841e;

    public q0(String str, Throwable th, p0 p0Var) {
        super(str);
        this.f841e = p0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q0) {
                q0 q0Var = (q0) obj;
                if (!l.a(q0Var.getMessage(), getMessage()) || !l.a(q0Var.f841e, this.f841e) || !l.a(q0Var.getCause(), getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        l.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f841e.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    public String toString() {
        return super.toString() + "; job=" + this.f841e;
    }
}
