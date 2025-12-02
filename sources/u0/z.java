package u0;

import java.io.File;
import java.util.concurrent.Callable;
import v3.l;
import y0.h;

public final class z implements h.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f12300a;

    /* renamed from: b  reason: collision with root package name */
    public final File f12301b;

    /* renamed from: c  reason: collision with root package name */
    public final Callable f12302c;

    /* renamed from: d  reason: collision with root package name */
    public final h.c f12303d;

    public z(String str, File file, Callable callable, h.c cVar) {
        l.e(cVar, "mDelegate");
        this.f12300a = str;
        this.f12301b = file;
        this.f12302c = callable;
        this.f12303d = cVar;
    }

    public h create(h.b bVar) {
        l.e(bVar, "configuration");
        return new y(bVar.f12718a, this.f12300a, this.f12301b, this.f12302c, bVar.f12720c.f12716a, this.f12303d.create(bVar));
    }
}
