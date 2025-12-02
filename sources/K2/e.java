package K2;

import Y2.i;
import Y2.j;

public class e implements j.c {

    /* renamed from: c  reason: collision with root package name */
    public final a f1709c;

    public e(a aVar) {
        this.f1709c = aVar;
    }

    public void onMethodCall(i iVar, j.d dVar) {
        if ("check".equals(iVar.f3766a)) {
            dVar.a(this.f1709c.d());
        } else {
            dVar.c();
        }
    }
}
