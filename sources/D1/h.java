package D1;

import K1.b;
import K1.s;
import K1.t;
import K1.x;
import android.os.Process;

public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f734a;

    public static boolean a() {
        Boolean bool = f734a;
        if (bool == null) {
            if (g.d()) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object a4 = t.a(Process.class, "isIsolated", new s[0]);
                    Object[] objArr = new Object[0];
                    if (a4 != null) {
                        bool = (Boolean) a4;
                    } else {
                        throw new b(x.a("expected a non-null reference", objArr));
                    }
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            f734a = bool;
        }
        return bool.booleanValue();
    }
}
