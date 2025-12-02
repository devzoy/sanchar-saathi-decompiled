package H0;

import v3.l;

public final class i extends h {

    /* renamed from: b  reason: collision with root package name */
    public final Object f1381b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1382c;

    /* renamed from: d  reason: collision with root package name */
    public final j f1383d;

    /* renamed from: e  reason: collision with root package name */
    public final g f1384e;

    public i(Object obj, String str, j jVar, g gVar) {
        l.e(obj, "value");
        l.e(str, "tag");
        l.e(jVar, "verificationMode");
        l.e(gVar, "logger");
        this.f1381b = obj;
        this.f1382c = str;
        this.f1383d = jVar;
        this.f1384e = gVar;
    }

    public Object a() {
        return this.f1381b;
    }

    public h c(String str, u3.l lVar) {
        l.e(str, "message");
        l.e(lVar, "condition");
        if (((Boolean) lVar.i(this.f1381b)).booleanValue()) {
            return this;
        }
        return new f(this.f1381b, this.f1382c, str, this.f1384e, this.f1383d);
    }
}
