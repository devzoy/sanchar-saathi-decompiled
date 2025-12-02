package N3;

import T2.a;
import Y2.i;
import Y2.j;
import android.os.Build;

public class a implements T2.a, j.c {

    /* renamed from: c  reason: collision with root package name */
    public j f2011c;

    public void onAttachedToEngine(a.b bVar) {
        j jVar = new j(bVar.b(), "flutter_native_splash");
        this.f2011c = jVar;
        jVar.e(this);
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f2011c.e((j.c) null);
    }

    public void onMethodCall(i iVar, j.d dVar) {
        if (iVar.f3766a.equals("getPlatformVersion")) {
            dVar.a("Android " + Build.VERSION.RELEASE);
            return;
        }
        dVar.c();
    }
}
