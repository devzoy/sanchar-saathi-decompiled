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

public final class c implements C0336b {

    /* renamed from: a  reason: collision with root package name */
    public final u f3799a;

    /* renamed from: b  reason: collision with root package name */
    public final i f3800b;

    public class a extends i {
        public a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, C0335a aVar) {
            if (aVar.b() == null) {
                kVar.bindNull(1);
            } else {
                kVar.bindString(1, aVar.b());
            }
            if (aVar.a() == null) {
                kVar.bindNull(2);
            } else {
                kVar.bindString(2, aVar.a());
            }
        }
    }

    public c(u uVar) {
        this.f3799a = uVar;
        this.f3800b = new a(uVar);
    }

    public static List e() {
        return Collections.emptyList();
    }

    public boolean a(String str) {
        boolean z4 = true;
        x e4 = x.e("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            e4.bindNull(1);
        } else {
            e4.bindString(1, str);
        }
        this.f3799a.d();
        boolean z5 = false;
        Cursor b4 = C0960b.b(this.f3799a, e4, false, (CancellationSignal) null);
        try {
            if (b4.moveToFirst()) {
                if (b4.getInt(0) == 0) {
                    z4 = false;
                }
                z5 = z4;
            }
            return z5;
        } finally {
            b4.close();
            e4.g();
        }
    }

    public boolean b(String str) {
        boolean z4 = true;
        x e4 = x.e("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            e4.bindNull(1);
        } else {
            e4.bindString(1, str);
        }
        this.f3799a.d();
        boolean z5 = false;
        Cursor b4 = C0960b.b(this.f3799a, e4, false, (CancellationSignal) null);
        try {
            if (b4.moveToFirst()) {
                if (b4.getInt(0) == 0) {
                    z4 = false;
                }
                z5 = z4;
            }
            return z5;
        } finally {
            b4.close();
            e4.g();
        }
    }

    public List c(String str) {
        x e4 = x.e("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            e4.bindNull(1);
        } else {
            e4.bindString(1, str);
        }
        this.f3799a.d();
        Cursor b4 = C0960b.b(this.f3799a, e4, false, (CancellationSignal) null);
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

    public void d(C0335a aVar) {
        this.f3799a.d();
        this.f3799a.e();
        try {
            this.f3800b.j(aVar);
            this.f3799a.B();
        } finally {
            this.f3799a.i();
        }
    }
}
