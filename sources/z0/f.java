package Z0;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.Collections;
import java.util.List;
import u0.i;
import u0.u;
import u0.x;
import w0.C0960b;
import y0.k;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public final u f3804a;

    /* renamed from: b  reason: collision with root package name */
    public final i f3805b;

    public class a extends i {
        public a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, d dVar) {
            if (dVar.a() == null) {
                kVar.bindNull(1);
            } else {
                kVar.bindString(1, dVar.a());
            }
            if (dVar.b() == null) {
                kVar.bindNull(2);
            } else {
                kVar.bindLong(2, dVar.b().longValue());
            }
        }
    }

    public f(u uVar) {
        this.f3804a = uVar;
        this.f3805b = new a(uVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    public Long a(String str) {
        x e4 = x.e("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            e4.bindNull(1);
        } else {
            e4.bindString(1, str);
        }
        this.f3804a.d();
        Long l4 = null;
        Cursor b4 = C0960b.b(this.f3804a, e4, false, (CancellationSignal) null);
        try {
            if (b4.moveToFirst()) {
                if (!b4.isNull(0)) {
                    l4 = Long.valueOf(b4.getLong(0));
                }
            }
            return l4;
        } finally {
            b4.close();
            e4.g();
        }
    }

    public void b(d dVar) {
        this.f3804a.d();
        this.f3804a.e();
        try {
            this.f3805b.j(dVar);
            this.f3804a.B();
        } finally {
            this.f3804a.i();
        }
    }
}
