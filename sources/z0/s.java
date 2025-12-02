package Z0;

import java.util.Collections;
import java.util.List;
import u0.C0935A;
import u0.i;
import u0.u;
import y0.k;

public final class s implements r {

    /* renamed from: a  reason: collision with root package name */
    public final u f3824a;

    /* renamed from: b  reason: collision with root package name */
    public final i f3825b;

    /* renamed from: c  reason: collision with root package name */
    public final C0935A f3826c;

    /* renamed from: d  reason: collision with root package name */
    public final C0935A f3827d;

    public class a extends i {
        public a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        public /* bridge */ /* synthetic */ void i(k kVar, Object obj) {
            android.support.v4.media.session.b.a(obj);
            k(kVar, (q) null);
        }

        public void k(k kVar, q qVar) {
            throw null;
        }
    }

    public class b extends C0935A {
        public b(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class c extends C0935A {
        public c(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM WorkProgress";
        }
    }

    public s(u uVar) {
        this.f3824a = uVar;
        this.f3825b = new a(uVar);
        this.f3826c = new b(uVar);
        this.f3827d = new c(uVar);
    }

    public static List c() {
        return Collections.emptyList();
    }

    public void a(String str) {
        this.f3824a.d();
        k b4 = this.f3826c.b();
        if (str == null) {
            b4.bindNull(1);
        } else {
            b4.bindString(1, str);
        }
        this.f3824a.e();
        try {
            b4.executeUpdateDelete();
            this.f3824a.B();
        } finally {
            this.f3824a.i();
            this.f3826c.h(b4);
        }
    }

    public void b() {
        this.f3824a.d();
        k b4 = this.f3827d.b();
        this.f3824a.e();
        try {
            b4.executeUpdateDelete();
            this.f3824a.B();
        } finally {
            this.f3824a.i();
            this.f3827d.h(b4);
        }
    }
}
