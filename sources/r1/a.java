package R1;

public final class a extends IllegalStateException {
    public a(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(f fVar) {
        if (!fVar.h()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception e4 = fVar.e();
        return new a("Complete with: ".concat(e4 != null ? "failure" : fVar.i() ? "result ".concat(String.valueOf(fVar.f())) : fVar.g() ? "cancellation" : "unknown issue"), e4);
    }
}
