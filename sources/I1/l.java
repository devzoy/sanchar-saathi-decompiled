package i1;

import Y2.i;
import Y2.j;
import android.content.Context;
import java.util.List;
import java.util.Objects;

public final class l implements j.c {

    /* renamed from: c  reason: collision with root package name */
    public final Context f10248c;

    /* renamed from: d  reason: collision with root package name */
    public final C0705a f10249d;

    /* renamed from: e  reason: collision with root package name */
    public final p f10250e;

    /* renamed from: f  reason: collision with root package name */
    public final w f10251f;

    public l(Context context, C0705a aVar, p pVar, w wVar) {
        this.f10248c = context;
        this.f10249d = aVar;
        this.f10250e = pVar;
        this.f10251f = wVar;
    }

    public void onMethodCall(i iVar, j.d dVar) {
        String str = iVar.f3766a;
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1544053025:
                if (str.equals("checkServiceStatus")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1017315255:
                if (str.equals("shouldShowRequestPermissionRationale")) {
                    c4 = 1;
                    break;
                }
                break;
            case -576207927:
                if (str.equals("checkPermissionStatus")) {
                    c4 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c4 = 3;
                    break;
                }
                break;
            case 1669188213:
                if (str.equals("requestPermissions")) {
                    c4 = 4;
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                int parseInt = Integer.parseInt(iVar.f3767b.toString());
                w wVar = this.f10251f;
                Context context = this.f10248c;
                Objects.requireNonNull(dVar);
                wVar.a(parseInt, context, new C0707c(dVar), new C0708d(dVar));
                return;
            case 1:
                int parseInt2 = Integer.parseInt(iVar.f3767b.toString());
                p pVar = this.f10250e;
                Objects.requireNonNull(dVar);
                pVar.i(parseInt2, new C0712h(dVar), new C0713i(dVar));
                return;
            case 2:
                int parseInt3 = Integer.parseInt(iVar.f3767b.toString());
                p pVar2 = this.f10250e;
                Objects.requireNonNull(dVar);
                pVar2.c(parseInt3, new C0709e(dVar));
                return;
            case 3:
                C0705a aVar = this.f10249d;
                Context context2 = this.f10248c;
                Objects.requireNonNull(dVar);
                aVar.a(context2, new C0714j(dVar), new C0715k(dVar));
                return;
            case 4:
                p pVar3 = this.f10250e;
                Objects.requireNonNull(dVar);
                pVar3.g((List) iVar.b(), new C0710f(dVar), new C0711g(dVar));
                return;
            default:
                dVar.c();
                return;
        }
    }
}
