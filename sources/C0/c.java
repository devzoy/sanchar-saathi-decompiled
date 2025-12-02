package C0;

import android.os.Trace;

public abstract class c {
    public static void a(String str, int i4) {
        Trace.beginAsyncSection(str, i4);
    }

    public static void b(String str, int i4) {
        Trace.endAsyncSection(str, i4);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
