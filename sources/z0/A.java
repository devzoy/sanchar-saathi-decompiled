package Z0;

import Z0.z;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import u0.C0935A;
import u0.i;
import u0.u;
import u0.x;
import w0.C0960b;
import y0.k;

public final class A implements z {

    /* renamed from: a  reason: collision with root package name */
    public final u f3787a;

    /* renamed from: b  reason: collision with root package name */
    public final i f3788b;

    /* renamed from: c  reason: collision with root package name */
    public final C0935A f3789c;

    public class a extends i {
        public a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: k */
        public void i(k kVar, y yVar) {
            if (yVar.a() == null) {
                kVar.bindNull(1);
            } else {
                kVar.bindString(1, yVar.a());
            }
            if (yVar.b() == null) {
                kVar.bindNull(2);
            } else {
                kVar.bindString(2, yVar.b());
            }
        }
    }

    public class b extends C0935A {
        public b(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public A(u uVar) {
        this.f3787a = uVar;
        this.f3788b = new a(uVar);
        this.f3789c = new b(uVar);
    }

    public static List e() {
        return Collections.emptyList();
    }

    public void a(y yVar) {
        this.f3787a.d();
        this.f3787a.e();
        try {
            this.f3788b.j(yVar);
            this.f3787a.B();
        } finally {
            this.f3787a.i();
        }
    }

    public void b(String str, Set set) {
        z.a.a(this, str, set);
    }

    public void c(String str) {
        this.f3787a.d();
        k b4 = this.f3789c.b();
        if (str == null) {
            b4.bindNull(1);
        } else {
            b4.bindString(1, str);
        }
        this.f3787a.e();
        try {
            b4.executeUpdateDelete();
            this.f3787a.B();
        } finally {
            this.f3787a.i();
            this.f3789c.h(b4);
        }
    }

    public List d(String str) {
        x e4 = x.e("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            e4.bindNull(1);
        } else {
            e4.bindString(1, str);
        }
        this.f3787a.d();
        Cursor b4 = C0960b.b(this.f3787a, e4, false, (CancellationSignal) null);
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
