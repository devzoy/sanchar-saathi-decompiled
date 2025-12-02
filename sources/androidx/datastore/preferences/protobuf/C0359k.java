package androidx.datastore.preferences.protobuf;

import android.support.v4.media.session.b;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.s0;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.sqlcipher.IBulkCursor;

/* renamed from: androidx.datastore.preferences.protobuf.k  reason: case insensitive filesystem */
public final class C0359k implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public final C0358j f5161a;

    /* renamed from: androidx.datastore.preferences.protobuf.k$a */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5162a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.r0$b[] r0 = androidx.datastore.preferences.protobuf.r0.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5162a = r0
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5162a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5162a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5162a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5162a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5162a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5162a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f5162a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f5162a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f5162a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f5162a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f5162a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.r0$b r1 = androidx.datastore.preferences.protobuf.r0.b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0359k.a.<clinit>():void");
        }
    }

    public C0359k(C0358j jVar) {
        C0358j jVar2 = (C0358j) C0372y.b(jVar, "output");
        this.f5161a = jVar2;
        jVar2.f5154a = this;
    }

    public static C0359k P(C0358j jVar) {
        C0359k kVar = jVar.f5154a;
        return kVar != null ? kVar : new C0359k(jVar);
    }

    public void A(int i4, float f4) {
        this.f5161a.o0(i4, f4);
    }

    public void B(int i4, List list) {
        int i5 = 0;
        if (list instanceof C) {
            C c4 = (C) list;
            while (i5 < list.size()) {
                l0(i4, c4.g(i5));
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.K0(i4, (String) list.get(i5));
            i5++;
        }
    }

    public void C(int i4, List list, f0 f0Var) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            O(i4, list.get(i5), f0Var);
        }
    }

    public void D(int i4) {
        this.f5161a.M0(i4, 4);
    }

    public void E(int i4, String str) {
        this.f5161a.K0(i4, str);
    }

    public void F(int i4, List list, boolean z4) {
        if (list instanceof C0371x) {
            b.a(list);
            q0(i4, (C0371x) null, z4);
            return;
        }
        r0(i4, list, z4);
    }

    public void G(int i4, long j4) {
        this.f5161a.P0(i4, j4);
    }

    public void H(int i4, int i5) {
        this.f5161a.i0(i4, i5);
    }

    public void I(int i4, List list, boolean z4) {
        if (list instanceof G) {
            b.a(list);
            j0(i4, (G) null, z4);
            return;
        }
        k0(i4, list, z4);
    }

    public void J(int i4, List list, boolean z4) {
        if (list instanceof C0371x) {
            b.a(list);
            Z(i4, (C0371x) null, z4);
            return;
        }
        a0(i4, list, z4);
    }

    public void K(int i4, List list, boolean z4) {
        if (list instanceof C0360l) {
            b.a(list);
            X(i4, (C0360l) null, z4);
            return;
        }
        Y(i4, list, z4);
    }

    public void L(int i4, I.a aVar, Map map) {
        if (this.f5161a.X()) {
            V(i4, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f5161a.M0(i4, 2);
            this.f5161a.O0(I.b(aVar, entry.getKey(), entry.getValue()));
            I.e(this.f5161a, aVar, entry.getKey(), entry.getValue());
        }
    }

    public void M(int i4, int i5) {
        this.f5161a.G0(i4, i5);
    }

    public void N(int i4, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f5161a.e0(i4, (C0355g) list.get(i5));
        }
    }

    public void O(int i4, Object obj, f0 f0Var) {
        this.f5161a.r0(i4, (P) obj, f0Var);
    }

    public final void Q(int i4, C0353e eVar, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public final void R(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.d(((Boolean) list.get(i7)).booleanValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.b0(((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.a0(i4, ((Boolean) list.get(i5)).booleanValue());
            i5++;
        }
    }

    public final void S(int i4, boolean z4, Object obj, I.a aVar) {
        this.f5161a.M0(i4, 2);
        this.f5161a.O0(I.b(aVar, Boolean.valueOf(z4), obj));
        I.e(this.f5161a, aVar, Boolean.valueOf(z4), obj);
    }

    public final void T(int i4, I.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i5 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i5] = intValue.intValue();
            i5++;
        }
        Arrays.sort(iArr);
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = iArr[i6];
            Object obj = map.get(Integer.valueOf(i7));
            this.f5161a.M0(i4, 2);
            this.f5161a.O0(I.b(aVar, Integer.valueOf(i7), obj));
            I.e(this.f5161a, aVar, Integer.valueOf(i7), obj);
        }
    }

    public final void U(int i4, I.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i5 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i5] = longValue.longValue();
            i5++;
        }
        Arrays.sort(jArr);
        for (int i6 = 0; i6 < size; i6++) {
            long j4 = jArr[i6];
            Object obj = map.get(Long.valueOf(j4));
            this.f5161a.M0(i4, 2);
            this.f5161a.O0(I.b(aVar, Long.valueOf(j4), obj));
            I.e(this.f5161a, aVar, Long.valueOf(j4), obj);
        }
    }

    public final void V(int i4, I.a aVar, Map map) {
        switch (a.f5162a[aVar.f5039a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    S(i4, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    S(i4, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                T(i4, aVar, map);
                return;
            case 7:
            case 8:
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                U(i4, aVar, map);
                return;
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                W(i4, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f5039a);
        }
    }

    public final void W(int i4, I.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i5 = 0;
        for (String str : map.keySet()) {
            strArr[i5] = str;
            i5++;
        }
        Arrays.sort(strArr);
        for (int i6 = 0; i6 < size; i6++) {
            String str2 = strArr[i6];
            Object obj = map.get(str2);
            this.f5161a.M0(i4, 2);
            this.f5161a.O0(I.b(aVar, str2, obj));
            I.e(this.f5161a, aVar, str2, obj);
        }
    }

    public final void X(int i4, C0360l lVar, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public final void Y(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.i(((Double) list.get(i7)).doubleValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.h0(((Double) list.get(i5)).doubleValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.g0(i4, ((Double) list.get(i5)).doubleValue());
            i5++;
        }
    }

    public final void Z(int i4, C0371x xVar, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public void a(int i4, List list, boolean z4) {
        if (list instanceof C0371x) {
            b.a(list);
            h0(i4, (C0371x) null, z4);
            return;
        }
        i0(i4, list, z4);
    }

    public final void a0(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.k(((Integer) list.get(i7)).intValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.j0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.i0(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public void b(int i4, List list, boolean z4) {
        if (list instanceof C0368u) {
            b.a(list);
            f0(i4, (C0368u) null, z4);
            return;
        }
        g0(i4, list, z4);
    }

    public final void b0(int i4, C0371x xVar, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public void c(int i4, long j4) {
        this.f5161a.w0(i4, j4);
    }

    public final void c0(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.m(((Integer) list.get(i7)).intValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.l0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.k0(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public void d(int i4, boolean z4) {
        this.f5161a.a0(i4, z4);
    }

    public final void d0(int i4, G g4, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public void e(int i4, int i5) {
        this.f5161a.N0(i4, i5);
    }

    public final void e0(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.o(((Long) list.get(i7)).longValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.n0(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.m0(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void f(int i4, Object obj) {
        if (obj instanceof C0355g) {
            this.f5161a.B0(i4, (C0355g) obj);
        } else {
            this.f5161a.A0(i4, (P) obj);
        }
    }

    public final void f0(int i4, C0368u uVar, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public void g(int i4, int i5) {
        this.f5161a.C0(i4, i5);
    }

    public final void g0(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.q(((Float) list.get(i7)).floatValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.p0(((Float) list.get(i5)).floatValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.o0(i4, ((Float) list.get(i5)).floatValue());
            i5++;
        }
    }

    public void h(int i4) {
        this.f5161a.M0(i4, 3);
    }

    public final void h0(int i4, C0371x xVar, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public void i(int i4, int i5) {
        this.f5161a.u0(i4, i5);
    }

    public final void i0(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.v(((Integer) list.get(i7)).intValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.v0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.u0(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public void j(int i4, List list, boolean z4) {
        if (list instanceof G) {
            b.a(list);
            d0(i4, (G) null, z4);
            return;
        }
        e0(i4, list, z4);
    }

    public final void j0(int i4, G g4, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public void k(int i4, List list, boolean z4) {
        if (list instanceof C0371x) {
            b.a(list);
            m0(i4, (C0371x) null, z4);
            return;
        }
        n0(i4, list, z4);
    }

    public final void k0(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.x(((Long) list.get(i7)).longValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.x0(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.w0(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public void l(int i4, C0355g gVar) {
        this.f5161a.e0(i4, gVar);
    }

    public final void l0(int i4, Object obj) {
        if (obj instanceof String) {
            this.f5161a.K0(i4, (String) obj);
        } else {
            this.f5161a.e0(i4, (C0355g) obj);
        }
    }

    public void m(int i4, int i5) {
        this.f5161a.k0(i4, i5);
    }

    public final void m0(int i4, C0371x xVar, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public void n(int i4, double d4) {
        this.f5161a.g0(i4, d4);
    }

    public final void n0(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.F(((Integer) list.get(i7)).intValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.D0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.C0(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public void o(int i4, long j4) {
        this.f5161a.E0(i4, j4);
    }

    public final void o0(int i4, G g4, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public void p(int i4, List list, boolean z4) {
        if (list instanceof G) {
            b.a(list);
            o0(i4, (G) null, z4);
            return;
        }
        p0(i4, list, z4);
    }

    public final void p0(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.H(((Long) list.get(i7)).longValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.F0(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.E0(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public void q(int i4, List list, boolean z4) {
        if (list instanceof C0371x) {
            b.a(list);
            b0(i4, (C0371x) null, z4);
            return;
        }
        c0(i4, list, z4);
    }

    public final void q0(int i4, C0371x xVar, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public void r(int i4, List list, boolean z4) {
        if (list instanceof G) {
            b.a(list);
            w0(i4, (G) null, z4);
            return;
        }
        x0(i4, list, z4);
    }

    public void r0(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.J(((Integer) list.get(i7)).intValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.H0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.G0(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public void s(int i4, Object obj, f0 f0Var) {
        this.f5161a.y0(i4, (P) obj, f0Var);
    }

    public final void s0(int i4, G g4, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public void t(int i4, List list, boolean z4) {
        if (list instanceof C0353e) {
            b.a(list);
            Q(i4, (C0353e) null, z4);
            return;
        }
        R(i4, list, z4);
    }

    public final void t0(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.L(((Long) list.get(i7)).longValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.J0(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.I0(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public void u(int i4, List list, boolean z4) {
        if (list instanceof C0371x) {
            b.a(list);
            u0(i4, (C0371x) null, z4);
            return;
        }
        v0(i4, list, z4);
    }

    public final void u0(int i4, C0371x xVar, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public void v(int i4, List list, boolean z4) {
        if (list instanceof G) {
            b.a(list);
            s0(i4, (G) null, z4);
            return;
        }
        t0(i4, list, z4);
    }

    public void v0(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.Q(((Integer) list.get(i7)).intValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.O0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.N0(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public void w(int i4, long j4) {
        this.f5161a.m0(i4, j4);
    }

    public final void w0(int i4, G g4, boolean z4) {
        if (z4) {
            this.f5161a.M0(i4, 2);
            throw null;
        }
        throw null;
    }

    public s0.a x() {
        return s0.a.ASCENDING;
    }

    public final void x0(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f5161a.M0(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0358j.S(((Long) list.get(i7)).longValue());
            }
            this.f5161a.O0(i6);
            while (i5 < list.size()) {
                this.f5161a.Q0(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f5161a.P0(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public void y(int i4, List list, f0 f0Var) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            s(i4, list.get(i5), f0Var);
        }
    }

    public void z(int i4, long j4) {
        this.f5161a.I0(i4, j4);
    }
}
