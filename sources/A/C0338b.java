package a;

/* renamed from: a.b  reason: case insensitive filesystem */
public abstract class C0338b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3889a = "_COROUTINE";

    public static final StackTraceElement b(Throwable th, String str) {
        StackTraceElement stackTraceElement = th.getStackTrace()[0];
        return new StackTraceElement(f3889a + '.' + str, "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }
}
