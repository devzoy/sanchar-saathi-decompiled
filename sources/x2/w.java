package X2;

import M2.b;
import Y2.a;
import Y2.e;
import java.util.HashMap;

public class w {

    /* renamed from: a  reason: collision with root package name */
    public final a f3658a;

    public w(P2.a aVar) {
        this.f3658a = new a(aVar, "flutter/system", e.f3764a);
    }

    public void a() {
        b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f3658a.c(hashMap);
    }
}
