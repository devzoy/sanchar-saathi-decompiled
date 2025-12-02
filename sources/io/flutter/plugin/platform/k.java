package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

public class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final Map f10553a = new HashMap();

    public boolean a(String str, i iVar) {
        if (this.f10553a.containsKey(str)) {
            return false;
        }
        this.f10553a.put(str, iVar);
        return true;
    }

    public i b(String str) {
        return (i) this.f10553a.get(str);
    }
}
