package R0;

import a1.q;
import android.content.Context;
import v0.C0946b;
import v3.l;
import y0.g;

public final class F extends C0946b {

    /* renamed from: c  reason: collision with root package name */
    public final Context f2456c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public F(Context context) {
        super(9, 10);
        l.e(context, "context");
        this.f2456c = context;
    }

    public void a(g gVar) {
        l.e(gVar, "db");
        gVar.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        q.c(this.f2456c, gVar);
        a1.l.c(this.f2456c, gVar);
    }
}
