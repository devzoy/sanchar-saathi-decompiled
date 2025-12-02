package R0;

import v0.C0946b;
import v3.l;
import y0.g;

/* renamed from: R0.g  reason: case insensitive filesystem */
public final class C0305g extends C0946b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0305g f2513c = new C0305g();

    public C0305g() {
        super(12, 13);
    }

    public void a(g gVar) {
        l.e(gVar, "db");
        gVar.execSQL("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        gVar.execSQL("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
