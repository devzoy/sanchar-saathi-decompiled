package l1;

import j1.C0759d;
import java.util.List;

/* renamed from: l1.b  reason: case insensitive filesystem */
public abstract class C0775b implements f {
    public C0759d d() {
        return new C0759d(i(), j());
    }

    public boolean e() {
        return Boolean.TRUE.equals(c("noResult"));
    }

    public Boolean f() {
        return g("inTransaction");
    }

    public final Boolean g(String str) {
        Object c4 = c(str);
        if (c4 instanceof Boolean) {
            return (Boolean) c4;
        }
        return null;
    }

    public boolean h() {
        return Boolean.TRUE.equals(c("continueOnError"));
    }

    public final String i() {
        return (String) c("sql");
    }

    public final List j() {
        return (List) c("arguments");
    }
}
