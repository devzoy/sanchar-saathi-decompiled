package O3;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;
import v3.l;

public abstract /* synthetic */ class p {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f2127a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        l.e(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C3.p.z(message, "getsockname failed", false, 2, (Object) null) : false;
    }

    public static final y b(File file) {
        l.e(file, "<this>");
        return new k(new FileInputStream(file), z.f2155b);
    }
}
