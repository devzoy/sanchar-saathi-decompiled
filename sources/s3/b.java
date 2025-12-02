package s3;

import h3.C0660a;
import java.io.Closeable;

public abstract class b {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C0660a.a(th, th2);
        }
    }
}
