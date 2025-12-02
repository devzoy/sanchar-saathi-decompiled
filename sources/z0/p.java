package Z0;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u0.i;
import u0.u;
import u0.x;
import w0.C0960b;
import y0.k;

public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    public final u f3821a;

    /* renamed from: b  reason: collision with root package name */
    public final i f3822b;

    public class a extends i {
        public a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, n nVar) {
            if (nVar.a() == null) {
                kVar.bindNull(1);
            } else {
                kVar.bindString(1, nVar.a());
            }
            if (nVar.b() == null) {
                kVar.bindNull(2);
            } else {
                kVar.bindString(2, nVar.b());
            }
        }
    }

    public p(u uVar) {
        this.f3821a = uVar;
        this.f3822b = new a(uVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    public void a(n nVar) {
        this.f3821a.d();
        this.f3821a.e();
        try {
            this.f3822b.j(nVar);
            this.f3821a.B();
        } finally {
            this.f3821a.i();
        }
    }

    public List b(String str) {
        x e4 = x.e("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            e4.bindNull(1);
        } else {
            e4.bindString(1, str);
        }
        this.f3821a.d();
        Cursor b4 = C0960b.b(this.f3821a, e4, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(b4.getCount());
            while (b4.moveToNext()) {
                arrayList.add(b4.isNull(0) ? null : b4.getString(0));
            }
            return arrayList;
        } finally {
            b4.close();
            e4.g();
        }
    }
}
