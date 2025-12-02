package I3;

import l3.i;

/* renamed from: I3.i  reason: case insensitive filesystem */
public final class C0280i extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    public final transient i f1551e;

    public C0280i(i iVar) {
        this.f1551e = iVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.f1551e.toString();
    }
}
