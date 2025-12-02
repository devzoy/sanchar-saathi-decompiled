package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: androidx.datastore.preferences.protobuf.s  reason: case insensitive filesystem */
public final class C0366s {

    /* renamed from: d  reason: collision with root package name */
    public static final C0366s f5241d = new C0366s(true);

    /* renamed from: a  reason: collision with root package name */
    public final i0 f5242a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5243b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5244c;

    /* renamed from: androidx.datastore.preferences.protobuf.s$a */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5245a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f5246b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                androidx.datastore.preferences.protobuf.r0$b[] r0 = androidx.datastore.preferences.protobuf.r0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5246b = r0
                r1 = 1
                androidx.datastore.preferences.protobuf.r0$b r2 = androidx.datastore.preferences.protobuf.r0.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5246b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.r0$b r3 = androidx.datastore.preferences.protobuf.r0.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f5246b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.r0$b r4 = androidx.datastore.preferences.protobuf.r0.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f5246b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.r0$b r5 = androidx.datastore.preferences.protobuf.r0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f5246b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.r0$b r6 = androidx.datastore.preferences.protobuf.r0.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f5246b     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.r0$b r7 = androidx.datastore.preferences.protobuf.r0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f5246b     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.r0$b r8 = androidx.datastore.preferences.protobuf.r0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f5246b     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.r0$b r9 = androidx.datastore.preferences.protobuf.r0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f5246b     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.GROUP     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f5246b     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f5246b     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.STRING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f5246b     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.BYTES     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f5246b     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f5246b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f5246b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f5246b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f5246b     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f5246b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.datastore.preferences.protobuf.r0$b r10 = androidx.datastore.preferences.protobuf.r0.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                androidx.datastore.preferences.protobuf.r0$c[] r9 = androidx.datastore.preferences.protobuf.r0.c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f5245a = r9
                androidx.datastore.preferences.protobuf.r0$c r10 = androidx.datastore.preferences.protobuf.r0.c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f5245a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                androidx.datastore.preferences.protobuf.r0$c r9 = androidx.datastore.preferences.protobuf.r0.c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f5245a     // Catch:{ NoSuchFieldError -> 0x00fd }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f5245a     // Catch:{ NoSuchFieldError -> 0x0107 }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f5245a     // Catch:{ NoSuchFieldError -> 0x0111 }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f5245a     // Catch:{ NoSuchFieldError -> 0x011b }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f5245a     // Catch:{ NoSuchFieldError -> 0x0125 }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f5245a     // Catch:{ NoSuchFieldError -> 0x012f }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f5245a     // Catch:{ NoSuchFieldError -> 0x0139 }
                androidx.datastore.preferences.protobuf.r0$c r1 = androidx.datastore.preferences.protobuf.r0.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0366s.a.<clinit>():void");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface b extends Comparable {
        boolean g();

        r0.b h();

        int i();

        boolean j();
    }

    public C0366s() {
        this.f5242a = i0.q();
    }

    public static int b(r0.b bVar, int i4, Object obj) {
        int O4 = C0358j.O(i4);
        if (bVar == r0.b.GROUP) {
            O4 *= 2;
        }
        return O4 + c(bVar, obj);
    }

    public static int c(r0.b bVar, Object obj) {
        switch (a.f5246b[bVar.ordinal()]) {
            case 1:
                return C0358j.i(((Double) obj).doubleValue());
            case 2:
                return C0358j.q(((Float) obj).floatValue());
            case 3:
                return C0358j.x(((Long) obj).longValue());
            case 4:
                return C0358j.S(((Long) obj).longValue());
            case 5:
                return C0358j.v(((Integer) obj).intValue());
            case 6:
                return C0358j.o(((Long) obj).longValue());
            case 7:
                return C0358j.m(((Integer) obj).intValue());
            case 8:
                return C0358j.d(((Boolean) obj).booleanValue());
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                return C0358j.s((P) obj);
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                return C0358j.A((P) obj);
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                return obj instanceof C0355g ? C0358j.g((C0355g) obj) : C0358j.N((String) obj);
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                return obj instanceof C0355g ? C0358j.g((C0355g) obj) : C0358j.e((byte[]) obj);
            case 13:
                return C0358j.Q(((Integer) obj).intValue());
            case 14:
                return C0358j.F(((Integer) obj).intValue());
            case 15:
                return C0358j.H(((Long) obj).longValue());
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                return C0358j.J(((Integer) obj).intValue());
            case 17:
                return C0358j.L(((Long) obj).longValue());
            case 18:
                return C0358j.k(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(b bVar, Object obj) {
        r0.b h4 = bVar.h();
        int i4 = bVar.i();
        if (!bVar.g()) {
            return b(h4, i4, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i5 = 0;
        if (!bVar.j()) {
            int i6 = 0;
            while (i5 < size) {
                i6 += b(h4, i4, list.get(i5));
                i5++;
            }
            return i6;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            int i7 = 0;
            while (i5 < size) {
                i7 += c(h4, list.get(i5));
                i5++;
            }
            return C0358j.O(i4) + i7 + C0358j.Q(i7);
        }
    }

    public static int i(r0.b bVar, boolean z4) {
        if (z4) {
            return 2;
        }
        return bVar.f();
    }

    public static boolean l(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        throw null;
    }

    public static boolean m(r0.b bVar, Object obj) {
        C0372y.a(obj);
        switch (a.f5245a[bVar.b().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof C0355g) || (obj instanceof byte[]);
            case 8:
                return obj instanceof Integer;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                return obj instanceof P;
            default:
                return false;
        }
    }

    public static C0366s r() {
        return new C0366s();
    }

    public static void u(C0358j jVar, r0.b bVar, int i4, Object obj) {
        if (bVar == r0.b.GROUP) {
            jVar.q0(i4, (P) obj);
            return;
        }
        jVar.M0(i4, i(bVar, false));
        v(jVar, bVar, obj);
    }

    public static void v(C0358j jVar, r0.b bVar, Object obj) {
        switch (a.f5246b[bVar.ordinal()]) {
            case 1:
                jVar.h0(((Double) obj).doubleValue());
                return;
            case 2:
                jVar.p0(((Float) obj).floatValue());
                return;
            case 3:
                jVar.x0(((Long) obj).longValue());
                return;
            case 4:
                jVar.Q0(((Long) obj).longValue());
                return;
            case 5:
                jVar.v0(((Integer) obj).intValue());
                return;
            case 6:
                jVar.n0(((Long) obj).longValue());
                return;
            case 7:
                jVar.l0(((Integer) obj).intValue());
                return;
            case 8:
                jVar.b0(((Boolean) obj).booleanValue());
                return;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                jVar.s0((P) obj);
                return;
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                jVar.z0((P) obj);
                return;
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                if (obj instanceof C0355g) {
                    jVar.f0((C0355g) obj);
                    return;
                } else {
                    jVar.L0((String) obj);
                    return;
                }
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                if (obj instanceof C0355g) {
                    jVar.f0((C0355g) obj);
                    return;
                } else {
                    jVar.c0((byte[]) obj);
                    return;
                }
            case 13:
                jVar.O0(((Integer) obj).intValue());
                return;
            case 14:
                jVar.D0(((Integer) obj).intValue());
                return;
            case 15:
                jVar.F0(((Long) obj).longValue());
                return;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                jVar.H0(((Integer) obj).intValue());
                return;
            case 17:
                jVar.J0(((Long) obj).longValue());
                return;
            case 18:
                jVar.j0(((Integer) obj).intValue());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public C0366s clone() {
        C0366s r4 = r();
        int k4 = this.f5242a.k();
        for (int i4 = 0; i4 < k4; i4++) {
            Map.Entry j4 = this.f5242a.j(i4);
            android.support.v4.media.session.b.a(j4.getKey());
            r4.s((b) null, j4.getValue());
        }
        for (Map.Entry entry : this.f5242a.m()) {
            android.support.v4.media.session.b.a(entry.getKey());
            r4.s((b) null, entry.getValue());
        }
        r4.f5244c = this.f5244c;
        return r4;
    }

    public Iterator e() {
        return j() ? Collections.emptyIterator() : this.f5244c ? new B(this.f5242a.h().iterator()) : this.f5242a.h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0366s)) {
            return false;
        }
        return this.f5242a.equals(((C0366s) obj).f5242a);
    }

    public int f() {
        int k4 = this.f5242a.k();
        int i4 = 0;
        for (int i5 = 0; i5 < k4; i5++) {
            i4 += g(this.f5242a.j(i5));
        }
        for (Map.Entry g4 : this.f5242a.m()) {
            i4 += g(g4);
        }
        return i4;
    }

    public final int g(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public int h() {
        int k4 = this.f5242a.k();
        int i4 = 0;
        for (int i5 = 0; i5 < k4; i5++) {
            Map.Entry j4 = this.f5242a.j(i5);
            android.support.v4.media.session.b.a(j4.getKey());
            i4 += d((b) null, j4.getValue());
        }
        for (Map.Entry entry : this.f5242a.m()) {
            android.support.v4.media.session.b.a(entry.getKey());
            i4 += d((b) null, entry.getValue());
        }
        return i4;
    }

    public int hashCode() {
        return this.f5242a.hashCode();
    }

    public boolean j() {
        return this.f5242a.isEmpty();
    }

    public boolean k() {
        int k4 = this.f5242a.k();
        for (int i4 = 0; i4 < k4; i4++) {
            if (!l(this.f5242a.j(i4))) {
                return false;
            }
        }
        for (Map.Entry l4 : this.f5242a.m()) {
            if (!l(l4)) {
                return false;
            }
        }
        return true;
    }

    public Iterator n() {
        return j() ? Collections.emptyIterator() : this.f5244c ? new B(this.f5242a.entrySet().iterator()) : this.f5242a.entrySet().iterator();
    }

    public void o() {
        if (!this.f5243b) {
            int k4 = this.f5242a.k();
            for (int i4 = 0; i4 < k4; i4++) {
                Map.Entry j4 = this.f5242a.j(i4);
                if (j4.getValue() instanceof C0370w) {
                    ((C0370w) j4.getValue()).D();
                }
            }
            this.f5242a.p();
            this.f5243b = true;
        }
    }

    public void p(C0366s sVar) {
        int k4 = sVar.f5242a.k();
        for (int i4 = 0; i4 < k4; i4++) {
            q(sVar.f5242a.j(i4));
        }
        for (Map.Entry q4 : sVar.f5242a.m()) {
            q(q4);
        }
    }

    public final void q(Map.Entry entry) {
        android.support.v4.media.session.b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public void s(b bVar, Object obj) {
        if (!bVar.g()) {
            t(bVar, obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object t4 : arrayList) {
                t(bVar, t4);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f5242a.r(bVar, obj);
    }

    public final void t(b bVar, Object obj) {
        if (!m(bVar.h(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(bVar.i()), bVar.h().b(), obj.getClass().getName()}));
        }
    }

    public C0366s(boolean z4) {
        this(i0.q());
        o();
    }

    public C0366s(i0 i0Var) {
        this.f5242a = i0Var;
        o();
    }
}
