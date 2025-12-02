package l1;

import j1.C0759d;
import java.util.HashMap;
import java.util.Map;

public abstract class h {
    public static Map a(f fVar) {
        C0759d d4 = fVar.d();
        if (d4 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", d4.e());
        hashMap.put("arguments", d4.d());
        return hashMap;
    }
}
