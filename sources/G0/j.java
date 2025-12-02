package g0;

import O3.d;
import androidx.datastore.preferences.protobuf.C0355g;
import androidx.datastore.preferences.protobuf.C0370w;
import c0.C0401c;
import e0.c;
import f0.f;
import f0.g;
import f0.h;
import g0.f;
import h3.C0665f;
import h3.C0673n;
import i3.C0746w;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l3.e;
import net.sqlcipher.IBulkCursor;
import v3.g;
import v3.l;

public final class j implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final j f9060a = new j();

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9061a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                f0.h$b[] r0 = f0.h.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f0.h$b r1 = f0.h.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                f0.h$b r1 = f0.h.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f0.h$b r1 = f0.h.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f0.h$b r1 = f0.h.b.INTEGER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f0.h$b r1 = f0.h.b.LONG     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f0.h$b r1 = f0.h.b.STRING     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f0.h$b r1 = f0.h.b.STRING_SET     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f0.h$b r1 = f0.h.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                f0.h$b r1 = f0.h.b.VALUE_NOT_SET     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                f9061a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: g0.j.a.<clinit>():void");
        }
    }

    public Object b(d dVar, e eVar) {
        f a4 = f0.d.f8985a.a(dVar.G());
        c b4 = g.b(new f.b[0]);
        Map R3 = a4.R();
        l.d(R3, "preferencesProto.preferencesMap");
        for (Map.Entry entry : R3.entrySet()) {
            String str = (String) entry.getKey();
            h hVar = (h) entry.getValue();
            j jVar = f9060a;
            l.d(str, "name");
            l.d(hVar, "value");
            jVar.d(str, hVar, b4);
        }
        return b4.d();
    }

    public final void d(String str, h hVar, c cVar) {
        h.b g02 = hVar.g0();
        switch (g02 == null ? -1 : a.f9061a[g02.ordinal()]) {
            case -1:
                throw new C0401c("Value case is null.", (Throwable) null, 2, (g) null);
            case 1:
                cVar.j(h.a(str), Boolean.valueOf(hVar.X()));
                return;
            case 2:
                cVar.j(h.d(str), Float.valueOf(hVar.b0()));
                return;
            case 3:
                cVar.j(h.c(str), Double.valueOf(hVar.a0()));
                return;
            case 4:
                cVar.j(h.e(str), Integer.valueOf(hVar.c0()));
                return;
            case 5:
                cVar.j(h.f(str), Long.valueOf(hVar.d0()));
                return;
            case 6:
                f.a g4 = h.g(str);
                String e02 = hVar.e0();
                l.d(e02, "value.string");
                cVar.j(g4, e02);
                return;
            case 7:
                f.a h4 = h.h(str);
                List T3 = hVar.f0().T();
                l.d(T3, "value.stringSet.stringsList");
                cVar.j(h4, C0746w.L(T3));
                return;
            case 8:
                f.a b4 = h.b(str);
                byte[] F4 = hVar.Y().F();
                l.d(F4, "value.bytes.toByteArray()");
                cVar.j(b4, F4);
                return;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                throw new C0401c("Value not set.", (Throwable) null, 2, (g) null);
            default:
                throw new C0665f();
        }
    }

    /* renamed from: e */
    public f a() {
        return g.a();
    }

    public final h f(Object obj) {
        if (obj instanceof Boolean) {
            C0370w m4 = h.h0().u(((Boolean) obj).booleanValue()).m();
            l.d(m4, "newBuilder().setBoolean(value).build()");
            return (h) m4;
        } else if (obj instanceof Float) {
            C0370w m5 = h.h0().x(((Number) obj).floatValue()).m();
            l.d(m5, "newBuilder().setFloat(value).build()");
            return (h) m5;
        } else if (obj instanceof Double) {
            C0370w m6 = h.h0().w(((Number) obj).doubleValue()).m();
            l.d(m6, "newBuilder().setDouble(value).build()");
            return (h) m6;
        } else if (obj instanceof Integer) {
            C0370w m7 = h.h0().y(((Number) obj).intValue()).m();
            l.d(m7, "newBuilder().setInteger(value).build()");
            return (h) m7;
        } else if (obj instanceof Long) {
            C0370w m8 = h.h0().z(((Number) obj).longValue()).m();
            l.d(m8, "newBuilder().setLong(value).build()");
            return (h) m8;
        } else if (obj instanceof String) {
            C0370w m9 = h.h0().A((String) obj).m();
            l.d(m9, "newBuilder().setString(value).build()");
            return (h) m9;
        } else if (obj instanceof Set) {
            h.a h02 = h.h0();
            g.a U3 = f0.g.U();
            l.c(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            C0370w m10 = h02.B(U3.u((Set) obj)).m();
            l.d(m10, "newBuilder().setStringSe…                ).build()");
            return (h) m10;
        } else if (obj instanceof byte[]) {
            C0370w m11 = h.h0().v(C0355g.w((byte[]) obj)).m();
            l.d(m11, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return (h) m11;
        } else {
            throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
        }
    }

    /* renamed from: g */
    public Object c(f fVar, O3.c cVar, e eVar) {
        Map a4 = fVar.a();
        f.a U3 = f0.f.U();
        for (Map.Entry entry : a4.entrySet()) {
            U3.u(((f.a) entry.getKey()).a(), f(entry.getValue()));
        }
        ((f0.f) U3.m()).i(cVar.E());
        return C0673n.f9639a;
    }
}
