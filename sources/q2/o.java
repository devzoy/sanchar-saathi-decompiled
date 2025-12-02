package q2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f11901a = new HashSet(Arrays.asList(new String[]{"app_update", "review"}));

    /* renamed from: b  reason: collision with root package name */
    public static final Set f11902b = new HashSet(Arrays.asList(new String[]{"native", "unity"}));

    /* renamed from: c  reason: collision with root package name */
    public static final Map f11903c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final s f11904d = new s("PlayCoreVersion");

    public static synchronized Map a(String str) {
        Map map;
        synchronized (o.class) {
            try {
                Map map2 = f11903c;
                if (!map2.containsKey("app_update")) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("java", 11004);
                    map2.put("app_update", hashMap);
                }
                map = (Map) map2.get("app_update");
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return map;
    }
}
