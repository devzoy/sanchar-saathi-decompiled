package R0;

import Z0.m;
import Z0.u;
import Z0.x;
import i3.C0746w;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import v3.l;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2548a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Map f2549b = new LinkedHashMap();

    public final boolean a(m mVar) {
        boolean containsKey;
        l.e(mVar, "id");
        synchronized (this.f2548a) {
            containsKey = this.f2549b.containsKey(mVar);
        }
        return containsKey;
    }

    public final v b(m mVar) {
        v vVar;
        l.e(mVar, "id");
        synchronized (this.f2548a) {
            vVar = (v) this.f2549b.remove(mVar);
        }
        return vVar;
    }

    public final List c(String str) {
        List I4;
        l.e(str, "workSpecId");
        synchronized (this.f2548a) {
            try {
                Map map = this.f2549b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (l.a(((m) entry.getKey()).b(), str)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (m remove : linkedHashMap.keySet()) {
                    this.f2549b.remove(remove);
                }
                I4 = C0746w.I(linkedHashMap.values());
            } finally {
            }
        }
        return I4;
    }

    public final v d(m mVar) {
        v vVar;
        l.e(mVar, "id");
        synchronized (this.f2548a) {
            try {
                Map map = this.f2549b;
                Object obj = map.get(mVar);
                if (obj == null) {
                    obj = new v(mVar);
                    map.put(mVar, obj);
                }
                vVar = (v) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vVar;
    }

    public final v e(u uVar) {
        l.e(uVar, "spec");
        return d(x.a(uVar));
    }
}
