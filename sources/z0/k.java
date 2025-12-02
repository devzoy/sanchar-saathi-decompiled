package Z0;

import Z0.j;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u0.C0935A;
import u0.i;
import u0.u;
import u0.x;
import w0.C0960b;

public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final u f3810a;

    /* renamed from: b  reason: collision with root package name */
    public final i f3811b;

    /* renamed from: c  reason: collision with root package name */
    public final C0935A f3812c;

    /* renamed from: d  reason: collision with root package name */
    public final C0935A f3813d;

    public class a extends i {
        public a(u uVar) {
            super(uVar);
        }

        public String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        /* renamed from: k */
        public void i(y0.k kVar, i iVar) {
            String str = iVar.f3807a;
            if (str == null) {
                kVar.bindNull(1);
            } else {
                kVar.bindString(1, str);
            }
            kVar.bindLong(2, (long) iVar.a());
            kVar.bindLong(3, (long) iVar.f3809c);
        }
    }

    public class b extends C0935A {
        public b(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    public class c extends C0935A {
        public c(u uVar) {
            super(uVar);
        }

        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(u uVar) {
        this.f3810a = uVar;
        this.f3811b = new a(uVar);
        this.f3812c = new b(uVar);
        this.f3813d = new c(uVar);
    }

    public static List h() {
        return Collections.emptyList();
    }

    public void a(m mVar) {
        j.a.b(this, mVar);
    }

    public List b() {
        x e4 = x.e("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f3810a.d();
        Cursor b4 = C0960b.b(this.f3810a, e4, false, (CancellationSignal) null);
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

    public void c(i iVar) {
        this.f3810a.d();
        this.f3810a.e();
        try {
            this.f3811b.j(iVar);
            this.f3810a.B();
        } finally {
            this.f3810a.i();
        }
    }

    public void d(String str, int i4) {
        this.f3810a.d();
        y0.k b4 = this.f3812c.b();
        if (str == null) {
            b4.bindNull(1);
        } else {
            b4.bindString(1, str);
        }
        b4.bindLong(2, (long) i4);
        this.f3810a.e();
        try {
            b4.executeUpdateDelete();
            this.f3810a.B();
        } finally {
            this.f3810a.i();
            this.f3812c.h(b4);
        }
    }

    public i e(m mVar) {
        return j.a.a(this, mVar);
    }

    public void f(String str) {
        this.f3810a.d();
        y0.k b4 = this.f3813d.b();
        if (str == null) {
            b4.bindNull(1);
        } else {
            b4.bindString(1, str);
        }
        this.f3810a.e();
        try {
            b4.executeUpdateDelete();
            this.f3810a.B();
        } finally {
            this.f3810a.i();
            this.f3813d.h(b4);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: Z0.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Z0.i g(java.lang.String r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r1 = 2
            u0.x r0 = u0.x.e(r0, r1)
            r2 = 1
            if (r6 != 0) goto L_0x000e
            r0.bindNull(r2)
            goto L_0x0011
        L_0x000e:
            r0.bindString(r2, r6)
        L_0x0011:
            long r6 = (long) r7
            r0.bindLong(r1, r6)
            u0.u r6 = r5.f3810a
            r6.d()
            u0.u r6 = r5.f3810a
            r7 = 0
            r1 = 0
            android.database.Cursor r6 = w0.C0960b.b(r6, r0, r7, r1)
            java.lang.String r7 = "work_spec_id"
            int r7 = w0.C0959a.d(r6, r7)     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "generation"
            int r2 = w0.C0959a.d(r6, r2)     // Catch:{ all -> 0x0054 }
            java.lang.String r3 = "system_id"
            int r3 = w0.C0959a.d(r6, r3)     // Catch:{ all -> 0x0054 }
            boolean r4 = r6.moveToFirst()     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0056
            boolean r4 = r6.isNull(r7)     // Catch:{ all -> 0x0054 }
            if (r4 == 0) goto L_0x0041
            goto L_0x0045
        L_0x0041:
            java.lang.String r1 = r6.getString(r7)     // Catch:{ all -> 0x0054 }
        L_0x0045:
            int r7 = r6.getInt(r2)     // Catch:{ all -> 0x0054 }
            int r2 = r6.getInt(r3)     // Catch:{ all -> 0x0054 }
            Z0.i r3 = new Z0.i     // Catch:{ all -> 0x0054 }
            r3.<init>(r1, r7, r2)     // Catch:{ all -> 0x0054 }
            r1 = r3
            goto L_0x0056
        L_0x0054:
            r7 = move-exception
            goto L_0x005d
        L_0x0056:
            r6.close()
            r0.g()
            return r1
        L_0x005d:
            r6.close()
            r0.g()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.k.g(java.lang.String, int):Z0.i");
    }
}
