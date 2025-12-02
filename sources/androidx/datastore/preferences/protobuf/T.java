package androidx.datastore.preferences.protobuf;

import Q0.i;
import android.support.v4.media.session.b;
import androidx.datastore.preferences.protobuf.C0372y;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.s0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;
import sun.misc.Unsafe;

public final class T implements f0 {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f5048r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f5049s = p0.A();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f5050a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f5051b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5052c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5053d;

    /* renamed from: e  reason: collision with root package name */
    public final P f5054e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5055f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5056g;

    /* renamed from: h  reason: collision with root package name */
    public final a0 f5057h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5058i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f5059j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5060k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5061l;

    /* renamed from: m  reason: collision with root package name */
    public final V f5062m;

    /* renamed from: n  reason: collision with root package name */
    public final D f5063n;

    /* renamed from: o  reason: collision with root package name */
    public final m0 f5064o;

    /* renamed from: p  reason: collision with root package name */
    public final C0364p f5065p;

    /* renamed from: q  reason: collision with root package name */
    public final K f5066q;

    public T(int[] iArr, Object[] objArr, int i4, int i5, P p4, a0 a0Var, boolean z4, int[] iArr2, int i6, int i7, V v4, D d4, m0 m0Var, C0364p pVar, K k4) {
        this.f5050a = iArr;
        this.f5051b = objArr;
        this.f5052c = i4;
        this.f5053d = i5;
        this.f5056g = p4 instanceof C0370w;
        this.f5057h = a0Var;
        this.f5055f = pVar != null && pVar.e(p4);
        this.f5058i = z4;
        this.f5059j = iArr2;
        this.f5060k = i6;
        this.f5061l = i7;
        this.f5062m = v4;
        this.f5063n = d4;
        this.f5064o = m0Var;
        this.f5065p = pVar;
        this.f5054e = p4;
        this.f5066q = k4;
    }

    public static boolean B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C0370w) {
            return ((C0370w) obj).C();
        }
        return true;
    }

    public static boolean E(int i4) {
        return (i4 & SQLiteDatabase.CREATE_IF_NECESSARY) != 0;
    }

    public static long F(Object obj, long j4) {
        return p0.x(obj, j4);
    }

    public static T N(Class cls, N n4, V v4, D d4, m0 m0Var, C0364p pVar, K k4) {
        if (n4 instanceof d0) {
            return P((d0) n4, v4, d4, m0Var, pVar, k4);
        }
        b.a(n4);
        return O((j0) null, v4, d4, m0Var, pVar, k4);
    }

    public static T O(j0 j0Var, V v4, D d4, m0 m0Var, C0364p pVar, K k4) {
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.datastore.preferences.protobuf.T P(androidx.datastore.preferences.protobuf.d0 r31, androidx.datastore.preferences.protobuf.V r32, androidx.datastore.preferences.protobuf.D r33, androidx.datastore.preferences.protobuf.m0 r34, androidx.datastore.preferences.protobuf.C0364p r35, androidx.datastore.preferences.protobuf.K r36) {
        /*
            java.lang.String r0 = r31.e()
            int r1 = r0.length()
            r2 = 0
            char r3 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r5) goto L_0x001d
            r3 = 1
        L_0x0013:
            int r6 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x001e
            r3 = r6
            goto L_0x0013
        L_0x001d:
            r6 = 1
        L_0x001e:
            int r3 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x003d
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x002a:
            int r9 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x003a
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r8
            r6 = r6 | r3
            int r8 = r8 + 13
            r3 = r9
            goto L_0x002a
        L_0x003a:
            int r3 = r3 << r8
            r6 = r6 | r3
            r3 = r9
        L_0x003d:
            if (r6 != 0) goto L_0x004e
            int[] r6 = f5048r
            r10 = r2
            r11 = r10
            r12 = r11
            r13 = r12
            r15 = r13
            r17 = r15
            r16 = r6
            r6 = r17
            goto L_0x0158
        L_0x004e:
            int r6 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x006d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x005a:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x006a
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r3 = r3 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x005a
        L_0x006a:
            int r6 = r6 << r8
            r3 = r3 | r6
            r6 = r9
        L_0x006d:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x008c
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0079:
            int r10 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0089
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r10
            goto L_0x0079
        L_0x0089:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r10
        L_0x008c:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00ab
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0098:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00a8
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r8 = r8 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x0098
        L_0x00a8:
            int r9 = r9 << r10
            r8 = r8 | r9
            r9 = r11
        L_0x00ab:
            int r10 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00ca
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00b7:
            int r12 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto L_0x00c7
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x00b7
        L_0x00c7:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00ca:
            int r11 = r10 + 1
            char r10 = r0.charAt(r10)
            if (r10 < r5) goto L_0x00e9
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00d6:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00e6
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00d6
        L_0x00e6:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00e9:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x0108
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00f5:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0105
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00f5
        L_0x0105:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x0108:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0127
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0114:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0124
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x0114
        L_0x0124:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0127:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0148
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0133:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0144
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0133
        L_0x0144:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0148:
            int r15 = r13 + r11
            int r15 = r15 + r12
            int[] r12 = new int[r15]
            int r15 = r3 * 2
            int r15 = r15 + r6
            r6 = r3
            r16 = r12
            r17 = r13
            r3 = r14
            r12 = r8
            r13 = r9
        L_0x0158:
            sun.misc.Unsafe r8 = f5049s
            java.lang.Object[] r9 = r31.d()
            androidx.datastore.preferences.protobuf.P r14 = r31.c()
            java.lang.Class r14 = r14.getClass()
            int r2 = r10 * 3
            int[] r2 = new int[r2]
            int r10 = r10 * 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            int r19 = r17 + r11
            r21 = r17
            r22 = r19
            r11 = 0
            r20 = 0
        L_0x0177:
            if (r3 >= r1) goto L_0x03bc
            int r23 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x019f
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r7 = r23
            r23 = 13
        L_0x0187:
            int r24 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r5) goto L_0x0199
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r23
            r3 = r3 | r7
            int r23 = r23 + 13
            r7 = r24
            goto L_0x0187
        L_0x0199:
            int r7 = r7 << r23
            r3 = r3 | r7
            r7 = r24
            goto L_0x01a1
        L_0x019f:
            r7 = r23
        L_0x01a1:
            int r23 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r5) goto L_0x01c7
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01af:
            int r25 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01c1
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r7 = r7 | r4
            int r23 = r23 + 13
            r4 = r25
            goto L_0x01af
        L_0x01c1:
            int r4 = r4 << r23
            r7 = r7 | r4
            r4 = r25
            goto L_0x01c9
        L_0x01c7:
            r4 = r23
        L_0x01c9:
            r5 = r7 & 255(0xff, float:3.57E-43)
            r25 = r1
            r1 = r7 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x01d6
            int r1 = r11 + 1
            r16[r11] = r20
            r11 = r1
        L_0x01d6:
            r1 = 51
            r27 = r11
            if (r5 < r1) goto L_0x027f
            int r1 = r4 + 1
            char r4 = r0.charAt(r4)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r11) goto L_0x0205
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r29 = 13
        L_0x01eb:
            int r30 = r1 + 1
            char r1 = r0.charAt(r1)
            if (r1 < r11) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r29
            r4 = r4 | r1
            int r29 = r29 + 13
            r1 = r30
            r11 = 55296(0xd800, float:7.7486E-41)
            goto L_0x01eb
        L_0x0200:
            int r1 = r1 << r29
            r4 = r4 | r1
            r1 = r30
        L_0x0205:
            int r11 = r5 + -51
            r29 = r1
            r1 = 9
            if (r11 == r1) goto L_0x0234
            r1 = 17
            if (r11 != r1) goto L_0x0212
            goto L_0x0234
        L_0x0212:
            r1 = 12
            if (r11 != r1) goto L_0x0241
            androidx.datastore.preferences.protobuf.a0 r1 = r31.b()
            androidx.datastore.preferences.protobuf.a0 r11 = androidx.datastore.preferences.protobuf.a0.PROTO2
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x0226
            r1 = r7 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0241
        L_0x0226:
            int r1 = r20 / 3
            int r1 = r1 * 2
            r11 = 1
            int r1 = r1 + r11
            int r11 = r15 + 1
            r15 = r9[r15]
            r10[r1] = r15
        L_0x0232:
            r15 = r11
            goto L_0x0241
        L_0x0234:
            int r1 = r20 / 3
            int r1 = r1 * 2
            r11 = 1
            int r1 = r1 + r11
            int r11 = r15 + 1
            r15 = r9[r15]
            r10[r1] = r15
            goto L_0x0232
        L_0x0241:
            int r4 = r4 * 2
            r1 = r9[r4]
            boolean r11 = r1 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x024e
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
        L_0x024b:
            r30 = r12
            goto L_0x0257
        L_0x024e:
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = d0(r14, r1)
            r9[r4] = r1
            goto L_0x024b
        L_0x0257:
            long r11 = r8.objectFieldOffset(r1)
            int r1 = (int) r11
            int r4 = r4 + 1
            r11 = r9[r4]
            boolean r12 = r11 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x0267
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x026f
        L_0x0267:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = d0(r14, r11)
            r9[r4] = r11
        L_0x026f:
            long r11 = r8.objectFieldOffset(r11)
            int r4 = (int) r11
            r26 = r13
            r23 = r15
            r12 = r29
            r15 = r0
            r0 = r4
            r4 = 0
            goto L_0x037a
        L_0x027f:
            r30 = r12
            int r1 = r15 + 1
            r11 = r9[r15]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = d0(r14, r11)
            r12 = 9
            if (r5 == r12) goto L_0x0293
            r12 = 17
            if (r5 != r12) goto L_0x0298
        L_0x0293:
            r26 = r13
            r13 = 1
            goto L_0x0302
        L_0x0298:
            r12 = 27
            if (r5 == r12) goto L_0x02a0
            r12 = 49
            if (r5 != r12) goto L_0x02a4
        L_0x02a0:
            r26 = r13
            r13 = 1
            goto L_0x02f6
        L_0x02a4:
            r12 = 12
            if (r5 == r12) goto L_0x02da
            r12 = 30
            if (r5 == r12) goto L_0x02da
            r12 = 44
            if (r5 != r12) goto L_0x02b1
            goto L_0x02da
        L_0x02b1:
            r12 = 50
            if (r5 != r12) goto L_0x02d1
            int r12 = r21 + 1
            r16[r21] = r20
            int r21 = r20 / 3
            int r21 = r21 * 2
            int r26 = r15 + 2
            r1 = r9[r1]
            r10[r21] = r1
            r1 = r7 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x02d5
            int r21 = r21 + 1
            int r1 = r15 + 3
            r15 = r9[r26]
            r10[r21] = r15
            r21 = r12
        L_0x02d1:
            r26 = r13
        L_0x02d3:
            r13 = 1
            goto L_0x030d
        L_0x02d5:
            r21 = r12
            r1 = r26
            goto L_0x02d1
        L_0x02da:
            androidx.datastore.preferences.protobuf.a0 r12 = r31.b()
            r26 = r13
            androidx.datastore.preferences.protobuf.a0 r13 = androidx.datastore.preferences.protobuf.a0.PROTO2
            if (r12 == r13) goto L_0x02e8
            r12 = r7 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x02d3
        L_0x02e8:
            int r12 = r20 / 3
            int r12 = r12 * 2
            r13 = 1
            int r12 = r12 + r13
            int r15 = r15 + 2
            r1 = r9[r1]
            r10[r12] = r1
        L_0x02f4:
            r1 = r15
            goto L_0x030d
        L_0x02f6:
            int r12 = r20 / 3
            int r12 = r12 * 2
            int r12 = r12 + r13
            int r15 = r15 + 2
            r1 = r9[r1]
            r10[r12] = r1
            goto L_0x02f4
        L_0x0302:
            int r12 = r20 / 3
            int r12 = r12 * 2
            int r12 = r12 + r13
            java.lang.Class r15 = r11.getType()
            r10[r12] = r15
        L_0x030d:
            long r11 = r8.objectFieldOffset(r11)
            int r11 = (int) r11
            r12 = r7 & 4096(0x1000, float:5.74E-42)
            if (r12 == 0) goto L_0x0363
            r12 = 17
            if (r5 > r12) goto L_0x0363
            int r12 = r4 + 1
            char r4 = r0.charAt(r4)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x0340
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r23 = 13
        L_0x0329:
            int r24 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r15) goto L_0x033b
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r23
            r4 = r4 | r12
            int r23 = r23 + 13
            r12 = r24
            goto L_0x0329
        L_0x033b:
            int r12 = r12 << r23
            r4 = r4 | r12
            r12 = r24
        L_0x0340:
            int r23 = r6 * 2
            int r24 = r4 / 32
            int r23 = r23 + r24
            r13 = r9[r23]
            boolean r15 = r13 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0352
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
        L_0x034e:
            r15 = r0
            r23 = r1
            goto L_0x035b
        L_0x0352:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = d0(r14, r13)
            r9[r23] = r13
            goto L_0x034e
        L_0x035b:
            long r0 = r8.objectFieldOffset(r13)
            int r0 = (int) r0
            int r4 = r4 % 32
            goto L_0x036b
        L_0x0363:
            r15 = r0
            r23 = r1
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r4
            r4 = 0
        L_0x036b:
            r1 = 18
            if (r5 < r1) goto L_0x0379
            r1 = 49
            if (r5 > r1) goto L_0x0379
            int r1 = r22 + 1
            r16[r22] = r11
            r22 = r1
        L_0x0379:
            r1 = r11
        L_0x037a:
            int r11 = r20 + 1
            r2[r20] = r3
            int r3 = r20 + 2
            r13 = r7 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0387
            r13 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0388
        L_0x0387:
            r13 = 0
        L_0x0388:
            r28 = r6
            r6 = r7 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x0391
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0392
        L_0x0391:
            r6 = 0
        L_0x0392:
            r6 = r6 | r13
            r7 = r7 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x039a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x039b
        L_0x039a:
            r7 = 0
        L_0x039b:
            r6 = r6 | r7
            int r5 = r5 << 20
            r5 = r5 | r6
            r1 = r1 | r5
            r2[r11] = r1
            int r20 = r20 + 3
            int r1 = r4 << 20
            r0 = r0 | r1
            r2[r3] = r0
            r3 = r12
            r0 = r15
            r15 = r23
            r1 = r25
            r13 = r26
            r11 = r27
            r6 = r28
            r12 = r30
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0177
        L_0x03bc:
            r30 = r12
            r26 = r13
            androidx.datastore.preferences.protobuf.T r0 = new androidx.datastore.preferences.protobuf.T
            androidx.datastore.preferences.protobuf.P r13 = r31.c()
            androidx.datastore.preferences.protobuf.a0 r14 = r31.b()
            r15 = 0
            r8 = r0
            r9 = r2
            r11 = r30
            r12 = r26
            r18 = r19
            r19 = r32
            r20 = r33
            r21 = r34
            r22 = r35
            r23 = r36
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.P(androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.V, androidx.datastore.preferences.protobuf.D, androidx.datastore.preferences.protobuf.m0, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.K):androidx.datastore.preferences.protobuf.T");
    }

    public static long R(int i4) {
        return (long) (i4 & 1048575);
    }

    public static boolean S(Object obj, long j4) {
        return ((Boolean) p0.z(obj, j4)).booleanValue();
    }

    public static double T(Object obj, long j4) {
        return ((Double) p0.z(obj, j4)).doubleValue();
    }

    public static float U(Object obj, long j4) {
        return ((Float) p0.z(obj, j4)).floatValue();
    }

    public static int V(Object obj, long j4) {
        return ((Integer) p0.z(obj, j4)).intValue();
    }

    public static long W(Object obj, long j4) {
        return ((Long) p0.z(obj, j4)).longValue();
    }

    public static Field d0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int j0(int i4) {
        return (i4 & 267386880) >>> 20;
    }

    public static boolean k(Object obj, long j4) {
        return p0.p(obj, j4);
    }

    public static void l(Object obj) {
        if (!B(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    public static double m(Object obj, long j4) {
        return p0.u(obj, j4);
    }

    public static float p(Object obj, long j4) {
        return p0.v(obj, j4);
    }

    public static int u(Object obj, long j4) {
        return p0.w(obj, j4);
    }

    public static boolean v(int i4) {
        return (i4 & 536870912) != 0;
    }

    public static boolean y(Object obj, int i4, f0 f0Var) {
        return f0Var.i(p0.z(obj, R(i4)));
    }

    public final boolean A(Object obj, int i4, int i5) {
        Map g4 = this.f5066q.g(p0.z(obj, R(i4)));
        if (g4.isEmpty()) {
            return true;
        }
        if (this.f5066q.f(r(i5)).f5041c.b() != r0.c.MESSAGE) {
            return true;
        }
        f0 f0Var = null;
        for (Object next : g4.values()) {
            if (f0Var == null) {
                f0Var = b0.a().c(next.getClass());
            }
            if (!f0Var.i(next)) {
                return false;
            }
        }
        return true;
    }

    public final boolean C(Object obj, Object obj2, int i4) {
        long Y3 = (long) (Y(i4) & 1048575);
        return p0.w(obj, Y3) == p0.w(obj2, Y3);
    }

    public final boolean D(Object obj, int i4, int i5) {
        return p0.w(obj, (long) (Y(i5) & 1048575)) == i4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:70|69|164|165|(0)(0)|189|207|199) */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0291, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0124, code lost:
        r12 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0125, code lost:
        r13 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x05fe */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0604 A[Catch:{ all -> 0x0291 }] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x062b  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x066d A[LOOP:6: B:193:0x0669->B:195:0x066d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0682  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void G(androidx.datastore.preferences.protobuf.m0 r20, androidx.datastore.preferences.protobuf.C0364p r21, java.lang.Object r22, androidx.datastore.preferences.protobuf.e0 r23, androidx.datastore.preferences.protobuf.C0363o r24) {
        /*
            r19 = this;
            r8 = r19
            r7 = r20
            r15 = r22
            r0 = r23
            r6 = r24
            r17 = 0
            r9 = r17
            r18 = r9
        L_0x0010:
            int r2 = r23.r()     // Catch:{ all -> 0x005c }
            int r3 = r8.X(r2)     // Catch:{ all -> 0x005c }
            r10 = 0
            if (r3 >= 0) goto L_0x00c9
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x0041
            int r0 = r8.f5060k
            r4 = r18
        L_0x0024:
            int r1 = r8.f5061l
            if (r0 >= r1) goto L_0x003b
            int[] r1 = r8.f5059j
            r3 = r1[r0]
            r1 = r19
            r2 = r22
            r5 = r20
            r6 = r22
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0024
        L_0x003b:
            if (r4 == 0) goto L_0x0040
            r7.o(r15, r4)
        L_0x0040:
            return
        L_0x0041:
            boolean r1 = r8.f5055f     // Catch:{ all -> 0x00c6 }
            if (r1 != 0) goto L_0x004a
            r5 = r21
            r12 = r17
            goto L_0x0053
        L_0x004a:
            androidx.datastore.preferences.protobuf.P r1 = r8.f5054e     // Catch:{ all -> 0x00c6 }
            r5 = r21
            java.lang.Object r1 = r5.b(r6, r1, r2)     // Catch:{ all -> 0x00c6 }
            r12 = r1
        L_0x0053:
            if (r12 == 0) goto L_0x007c
            if (r9 != 0) goto L_0x0061
            androidx.datastore.preferences.protobuf.s r1 = r21.d(r22)     // Catch:{ all -> 0x005c }
            goto L_0x0062
        L_0x005c:
            r0 = move-exception
            r13 = r7
            r11 = r15
            goto L_0x0664
        L_0x0061:
            r1 = r9
        L_0x0062:
            r9 = r21
            r10 = r22
            r11 = r23
            r13 = r24
            r14 = r1
            r4 = r15
            r15 = r18
            r16 = r20
            java.lang.Object r18 = r9.g(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0077 }
            r9 = r1
        L_0x0075:
            r15 = r4
            goto L_0x0010
        L_0x0077:
            r0 = move-exception
            r11 = r4
        L_0x0079:
            r13 = r7
            goto L_0x0664
        L_0x007c:
            r4 = r15
            boolean r1 = r7.q(r0)     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x008a
            boolean r1 = r23.B()     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x009c
            goto L_0x0075
        L_0x008a:
            if (r18 != 0) goto L_0x0091
            java.lang.Object r1 = r7.f(r4)     // Catch:{ all -> 0x0077 }
            goto L_0x0093
        L_0x0091:
            r1 = r18
        L_0x0093:
            boolean r2 = r7.m(r1, r0, r10)     // Catch:{ all -> 0x00c1 }
            r18 = r1
            if (r2 == 0) goto L_0x009c
            goto L_0x0075
        L_0x009c:
            int r0 = r8.f5060k
            r5 = r18
        L_0x00a0:
            int r1 = r8.f5061l
            if (r0 >= r1) goto L_0x00ba
            int[] r1 = r8.f5059j
            r3 = r1[r0]
            r1 = r19
            r2 = r22
            r11 = r4
            r4 = r5
            r5 = r20
            r6 = r22
            java.lang.Object r5 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            r4 = r11
            goto L_0x00a0
        L_0x00ba:
            r11 = r4
            if (r5 == 0) goto L_0x00c0
            r7.o(r11, r5)
        L_0x00c0:
            return
        L_0x00c1:
            r0 = move-exception
            r11 = r4
        L_0x00c3:
            r18 = r1
            goto L_0x0079
        L_0x00c6:
            r0 = move-exception
            r11 = r15
            goto L_0x0079
        L_0x00c9:
            r5 = r21
            r11 = r15
            int r4 = r8.k0(r3)     // Catch:{ all -> 0x00e0 }
            int r1 = j0(r4)     // Catch:{ a -> 0x00e2 }
            switch(r1) {
                case 0: goto L_0x05ed;
                case 1: goto L_0x05db;
                case 2: goto L_0x05c9;
                case 3: goto L_0x05b7;
                case 4: goto L_0x05a5;
                case 5: goto L_0x0593;
                case 6: goto L_0x0581;
                case 7: goto L_0x056f;
                case 8: goto L_0x0565;
                case 9: goto L_0x0551;
                case 10: goto L_0x053f;
                case 11: goto L_0x052d;
                case 12: goto L_0x0518;
                case 13: goto L_0x0506;
                case 14: goto L_0x04f4;
                case 15: goto L_0x04e2;
                case 16: goto L_0x04d0;
                case 17: goto L_0x04bc;
                case 18: goto L_0x04ab;
                case 19: goto L_0x049a;
                case 20: goto L_0x0489;
                case 21: goto L_0x0478;
                case 22: goto L_0x0467;
                case 23: goto L_0x0456;
                case 24: goto L_0x0445;
                case 25: goto L_0x0434;
                case 26: goto L_0x042d;
                case 27: goto L_0x0419;
                case 28: goto L_0x0408;
                case 29: goto L_0x03f7;
                case 30: goto L_0x03d6;
                case 31: goto L_0x03c5;
                case 32: goto L_0x03b4;
                case 33: goto L_0x03a3;
                case 34: goto L_0x0392;
                case 35: goto L_0x0381;
                case 36: goto L_0x0370;
                case 37: goto L_0x035f;
                case 38: goto L_0x034e;
                case 39: goto L_0x033d;
                case 40: goto L_0x032c;
                case 41: goto L_0x031b;
                case 42: goto L_0x030a;
                case 43: goto L_0x02f9;
                case 44: goto L_0x02d8;
                case 45: goto L_0x02c7;
                case 46: goto L_0x02b6;
                case 47: goto L_0x02a5;
                case 48: goto L_0x0294;
                case 49: goto L_0x0279;
                case 50: goto L_0x0267;
                case 51: goto L_0x0253;
                case 52: goto L_0x023f;
                case 53: goto L_0x022b;
                case 54: goto L_0x0217;
                case 55: goto L_0x0203;
                case 56: goto L_0x01ef;
                case 57: goto L_0x01db;
                case 58: goto L_0x01c7;
                case 59: goto L_0x01bf;
                case 60: goto L_0x01ad;
                case 61: goto L_0x019d;
                case 62: goto L_0x018a;
                case 63: goto L_0x0174;
                case 64: goto L_0x0161;
                case 65: goto L_0x014e;
                case 66: goto L_0x013b;
                case 67: goto L_0x0128;
                case 68: goto L_0x0114;
                default: goto L_0x00d7;
            }     // Catch:{ a -> 0x00e2 }
        L_0x00d7:
            if (r18 != 0) goto L_0x00dd
            java.lang.Object r18 = r7.f(r11)     // Catch:{ a -> 0x00e2 }
        L_0x00dd:
            r1 = r18
            goto L_0x00e6
        L_0x00e0:
            r0 = move-exception
            goto L_0x0079
        L_0x00e2:
            r12 = r6
        L_0x00e3:
            r13 = r7
            goto L_0x05fe
        L_0x00e6:
            boolean r2 = r7.m(r1, r0, r10)     // Catch:{ a -> 0x0111, all -> 0x010f }
            if (r2 != 0) goto L_0x010c
            int r0 = r8.f5060k
            r4 = r1
        L_0x00ef:
            int r1 = r8.f5061l
            if (r0 >= r1) goto L_0x0106
            int[] r1 = r8.f5059j
            r3 = r1[r0]
            r1 = r19
            r2 = r22
            r5 = r20
            r6 = r22
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x00ef
        L_0x0106:
            if (r4 == 0) goto L_0x010b
            r7.o(r11, r4)
        L_0x010b:
            return
        L_0x010c:
            r18 = r1
            goto L_0x0124
        L_0x010f:
            r0 = move-exception
            goto L_0x00c3
        L_0x0111:
            r18 = r1
            goto L_0x00e2
        L_0x0114:
            java.lang.Object r1 = r8.M(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.P r1 = (androidx.datastore.preferences.protobuf.P) r1     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.f0 r4 = r8.s(r3)     // Catch:{ a -> 0x00e2 }
            r0.d(r1, r4, r6)     // Catch:{ a -> 0x00e2 }
            r8.i0(r11, r2, r3, r1)     // Catch:{ a -> 0x00e2 }
        L_0x0124:
            r12 = r6
        L_0x0125:
            r13 = r7
            goto L_0x065c
        L_0x0128:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            long r14 = r23.l()     // Catch:{ a -> 0x00e2 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x013b:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            int r1 = r23.j()     // Catch:{ a -> 0x00e2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x014e:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            long r14 = r23.t()     // Catch:{ a -> 0x00e2 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x0161:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            int r1 = r23.C()     // Catch:{ a -> 0x00e2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x0174:
            int r1 = r23.c()     // Catch:{ a -> 0x00e2 }
            r8.q(r3)     // Catch:{ a -> 0x00e2 }
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x018a:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            int r1 = r23.y()     // Catch:{ a -> 0x00e2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x019d:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.g r1 = r23.w()     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x01ad:
            java.lang.Object r1 = r8.M(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.P r1 = (androidx.datastore.preferences.protobuf.P) r1     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.f0 r4 = r8.s(r3)     // Catch:{ a -> 0x00e2 }
            r0.K(r1, r4, r6)     // Catch:{ a -> 0x00e2 }
            r8.i0(r11, r2, r3, r1)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x01bf:
            r8.b0(r11, r4, r0)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x01c7:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            boolean r1 = r23.q()     // Catch:{ a -> 0x00e2 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x01db:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            int r1 = r23.p()     // Catch:{ a -> 0x00e2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x01ef:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            long r14 = r23.h()     // Catch:{ a -> 0x00e2 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x0203:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            int r1 = r23.z()     // Catch:{ a -> 0x00e2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x0217:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            long r14 = r23.f()     // Catch:{ a -> 0x00e2 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x022b:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            long r14 = r23.I()     // Catch:{ a -> 0x00e2 }
            java.lang.Long r1 = java.lang.Long.valueOf(r14)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x023f:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            float r1 = r23.readFloat()     // Catch:{ a -> 0x00e2 }
            java.lang.Float r1 = java.lang.Float.valueOf(r1)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x0253:
            long r12 = R(r4)     // Catch:{ a -> 0x00e2 }
            double r14 = r23.readDouble()     // Catch:{ a -> 0x00e2 }
            java.lang.Double r1 = java.lang.Double.valueOf(r14)     // Catch:{ a -> 0x00e2 }
            androidx.datastore.preferences.protobuf.p0.O(r11, r12, r1)     // Catch:{ a -> 0x00e2 }
            r8.f0(r11, r2, r3)     // Catch:{ a -> 0x00e2 }
            goto L_0x0124
        L_0x0267:
            java.lang.Object r4 = r8.r(r3)     // Catch:{ a -> 0x00e2 }
            r1 = r19
            r2 = r22
            r5 = r24
            r12 = r6
            r6 = r23
            r1.H(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x00e3 }
            goto L_0x0125
        L_0x0279:
            r12 = r6
            long r4 = R(r4)     // Catch:{ a -> 0x00e3 }
            androidx.datastore.preferences.protobuf.f0 r6 = r8.s(r3)     // Catch:{ a -> 0x00e3 }
            r1 = r19
            r2 = r22
            r3 = r4
            r5 = r23
            r13 = r7
            r7 = r24
            r1.Z(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0291:
            r0 = move-exception
            goto L_0x0664
        L_0x0294:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.k(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x02a5:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.b(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x02b6:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.H(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x02c7:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.i(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x02d8:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r4 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r4 = r1.b(r11, r4)     // Catch:{ a -> 0x05fe }
            r0.N(r4)     // Catch:{ a -> 0x05fe }
            r8.q(r3)     // Catch:{ a -> 0x05fe }
            r5 = 0
            r1 = r22
            r3 = r4
            r4 = r5
            r5 = r18
            r6 = r20
            java.lang.Object r18 = androidx.datastore.preferences.protobuf.h0.z(r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x02f9:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.m(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x030a:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.n(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x031b:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.g(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x032c:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.L(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x033d:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.M(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x034e:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.u(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x035f:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.G(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0370:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.x(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0381:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.E(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0392:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.k(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x03a3:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.b(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x03b4:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.H(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x03c5:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.i(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x03d6:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r4 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r4 = r1.b(r11, r4)     // Catch:{ a -> 0x05fe }
            r0.N(r4)     // Catch:{ a -> 0x05fe }
            r8.q(r3)     // Catch:{ a -> 0x05fe }
            r5 = 0
            r1 = r22
            r3 = r4
            r4 = r5
            r5 = r18
            r6 = r20
            java.lang.Object r18 = androidx.datastore.preferences.protobuf.h0.z(r1, r2, r3, r4, r5, r6)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x03f7:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.m(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0408:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.D(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0419:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.f0 r5 = r8.s(r3)     // Catch:{ a -> 0x05fe }
            r1 = r19
            r2 = r22
            r3 = r4
            r4 = r23
            r6 = r24
            r1.a0(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x042d:
            r12 = r6
            r13 = r7
            r8.c0(r11, r4, r0)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0434:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.n(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0445:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.g(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0456:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.L(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0467:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.M(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0478:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.u(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0489:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.G(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x049a:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.x(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x04ab:
            r12 = r6
            r13 = r7
            androidx.datastore.preferences.protobuf.D r1 = r8.f5063n     // Catch:{ a -> 0x05fe }
            long r2 = R(r4)     // Catch:{ a -> 0x05fe }
            java.util.List r1 = r1.b(r11, r2)     // Catch:{ a -> 0x05fe }
            r0.E(r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x04bc:
            r12 = r6
            r13 = r7
            java.lang.Object r1 = r8.L(r11, r3)     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.P r1 = (androidx.datastore.preferences.protobuf.P) r1     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.f0 r2 = r8.s(r3)     // Catch:{ a -> 0x05fe }
            r0.d(r1, r2, r12)     // Catch:{ a -> 0x05fe }
            r8.h0(r11, r3, r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x04d0:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            long r4 = r23.l()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.N(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x04e2:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            int r4 = r23.j()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.M(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x04f4:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            long r4 = r23.t()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.N(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0506:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            int r4 = r23.C()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.M(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0518:
            r12 = r6
            r13 = r7
            int r1 = r23.c()     // Catch:{ a -> 0x05fe }
            r8.q(r3)     // Catch:{ a -> 0x05fe }
            long r4 = R(r4)     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.M(r11, r4, r1)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x052d:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            int r4 = r23.y()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.M(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x053f:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.g r4 = r23.w()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.O(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0551:
            r12 = r6
            r13 = r7
            java.lang.Object r1 = r8.L(r11, r3)     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.P r1 = (androidx.datastore.preferences.protobuf.P) r1     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.f0 r2 = r8.s(r3)     // Catch:{ a -> 0x05fe }
            r0.K(r1, r2, r12)     // Catch:{ a -> 0x05fe }
            r8.h0(r11, r3, r1)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0565:
            r12 = r6
            r13 = r7
            r8.b0(r11, r4, r0)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x056f:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            boolean r4 = r23.q()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.E(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0581:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            int r4 = r23.p()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.M(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x0593:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            long r4 = r23.h()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.N(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x05a5:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            int r4 = r23.z()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.M(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x05b7:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            long r4 = r23.f()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.N(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x05c9:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            long r4 = r23.I()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.N(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x05db:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            float r4 = r23.readFloat()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.L(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x05ed:
            r12 = r6
            r13 = r7
            long r1 = R(r4)     // Catch:{ a -> 0x05fe }
            double r4 = r23.readDouble()     // Catch:{ a -> 0x05fe }
            androidx.datastore.preferences.protobuf.p0.K(r11, r1, r4)     // Catch:{ a -> 0x05fe }
            r8.e0(r11, r3)     // Catch:{ a -> 0x05fe }
            goto L_0x065c
        L_0x05fe:
            boolean r1 = r13.q(r0)     // Catch:{ all -> 0x0291 }
            if (r1 == 0) goto L_0x062b
            boolean r1 = r23.B()     // Catch:{ all -> 0x0291 }
            if (r1 != 0) goto L_0x065c
            int r0 = r8.f5060k
            r4 = r18
        L_0x060e:
            int r1 = r8.f5061l
            if (r0 >= r1) goto L_0x0625
            int[] r1 = r8.f5059j
            r3 = r1[r0]
            r1 = r19
            r2 = r22
            r5 = r20
            r6 = r22
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x060e
        L_0x0625:
            if (r4 == 0) goto L_0x062a
            r13.o(r11, r4)
        L_0x062a:
            return
        L_0x062b:
            if (r18 != 0) goto L_0x0632
            java.lang.Object r1 = r13.f(r11)     // Catch:{ all -> 0x0291 }
            goto L_0x0634
        L_0x0632:
            r1 = r18
        L_0x0634:
            boolean r2 = r13.m(r1, r0, r10)     // Catch:{ all -> 0x0661 }
            if (r2 != 0) goto L_0x065a
            int r0 = r8.f5060k
            r4 = r1
        L_0x063d:
            int r1 = r8.f5061l
            if (r0 >= r1) goto L_0x0654
            int[] r1 = r8.f5059j
            r3 = r1[r0]
            r1 = r19
            r2 = r22
            r5 = r20
            r6 = r22
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x063d
        L_0x0654:
            if (r4 == 0) goto L_0x0659
            r13.o(r11, r4)
        L_0x0659:
            return
        L_0x065a:
            r18 = r1
        L_0x065c:
            r15 = r11
            r6 = r12
            r7 = r13
            goto L_0x0010
        L_0x0661:
            r0 = move-exception
            r18 = r1
        L_0x0664:
            int r1 = r8.f5060k
            r7 = r1
            r4 = r18
        L_0x0669:
            int r1 = r8.f5061l
            if (r7 >= r1) goto L_0x0680
            int[] r1 = r8.f5059j
            r3 = r1[r7]
            r1 = r19
            r2 = r22
            r5 = r20
            r6 = r22
            java.lang.Object r4 = r1.o(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            goto L_0x0669
        L_0x0680:
            if (r4 == 0) goto L_0x0685
            r13.o(r11, r4)
        L_0x0685:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.G(androidx.datastore.preferences.protobuf.m0, androidx.datastore.preferences.protobuf.p, java.lang.Object, androidx.datastore.preferences.protobuf.e0, androidx.datastore.preferences.protobuf.o):void");
    }

    public final void H(Object obj, int i4, Object obj2, C0363o oVar, e0 e0Var) {
        long R3 = R(k0(i4));
        Object z4 = p0.z(obj, R3);
        if (z4 == null) {
            z4 = this.f5066q.b(obj2);
            p0.O(obj, R3, z4);
        } else if (this.f5066q.d(z4)) {
            Object b4 = this.f5066q.b(obj2);
            this.f5066q.a(b4, z4);
            p0.O(obj, R3, b4);
            z4 = b4;
        }
        e0Var.a(this.f5066q.h(z4), this.f5066q.f(obj2), oVar);
    }

    public final void I(Object obj, Object obj2, int i4) {
        if (w(obj2, i4)) {
            long R3 = R(k0(i4));
            Unsafe unsafe = f5049s;
            Object object = unsafe.getObject(obj2, R3);
            if (object != null) {
                f0 s4 = s(i4);
                if (!w(obj, i4)) {
                    if (!B(object)) {
                        unsafe.putObject(obj, R3, object);
                    } else {
                        Object d4 = s4.d();
                        s4.a(d4, object);
                        unsafe.putObject(obj, R3, d4);
                    }
                    e0(obj, i4);
                    return;
                }
                Object object2 = unsafe.getObject(obj, R3);
                if (!B(object2)) {
                    Object d5 = s4.d();
                    s4.a(d5, object2);
                    unsafe.putObject(obj, R3, d5);
                    object2 = d5;
                }
                s4.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + Q(i4) + " is present but null: " + obj2);
        }
    }

    public final void J(Object obj, Object obj2, int i4) {
        int Q4 = Q(i4);
        if (D(obj2, Q4, i4)) {
            long R3 = R(k0(i4));
            Unsafe unsafe = f5049s;
            Object object = unsafe.getObject(obj2, R3);
            if (object != null) {
                f0 s4 = s(i4);
                if (!D(obj, Q4, i4)) {
                    if (!B(object)) {
                        unsafe.putObject(obj, R3, object);
                    } else {
                        Object d4 = s4.d();
                        s4.a(d4, object);
                        unsafe.putObject(obj, R3, d4);
                    }
                    f0(obj, Q4, i4);
                    return;
                }
                Object object2 = unsafe.getObject(obj, R3);
                if (!B(object2)) {
                    Object d5 = s4.d();
                    s4.a(d5, object2);
                    unsafe.putObject(obj, R3, d5);
                    object2 = d5;
                }
                s4.a(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + Q(i4) + " is present but null: " + obj2);
        }
    }

    public final void K(Object obj, Object obj2, int i4) {
        int k02 = k0(i4);
        long R3 = R(k02);
        int Q4 = Q(i4);
        switch (j0(k02)) {
            case 0:
                if (w(obj2, i4)) {
                    p0.K(obj, R3, p0.u(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case 1:
                if (w(obj2, i4)) {
                    p0.L(obj, R3, p0.v(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case 2:
                if (w(obj2, i4)) {
                    p0.N(obj, R3, p0.x(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case 3:
                if (w(obj2, i4)) {
                    p0.N(obj, R3, p0.x(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case 4:
                if (w(obj2, i4)) {
                    p0.M(obj, R3, p0.w(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case 5:
                if (w(obj2, i4)) {
                    p0.N(obj, R3, p0.x(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case 6:
                if (w(obj2, i4)) {
                    p0.M(obj, R3, p0.w(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case 7:
                if (w(obj2, i4)) {
                    p0.E(obj, R3, p0.p(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case 8:
                if (w(obj2, i4)) {
                    p0.O(obj, R3, p0.z(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                I(obj, obj2, i4);
                return;
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                if (w(obj2, i4)) {
                    p0.O(obj, R3, p0.z(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                if (w(obj2, i4)) {
                    p0.M(obj, R3, p0.w(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                if (w(obj2, i4)) {
                    p0.M(obj, R3, p0.w(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case 13:
                if (w(obj2, i4)) {
                    p0.M(obj, R3, p0.w(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case 14:
                if (w(obj2, i4)) {
                    p0.N(obj, R3, p0.x(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case 15:
                if (w(obj2, i4)) {
                    p0.M(obj, R3, p0.w(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                if (w(obj2, i4)) {
                    p0.N(obj, R3, p0.x(obj2, R3));
                    e0(obj, i4);
                    return;
                }
                return;
            case 17:
                I(obj, obj2, i4);
                return;
            case 18:
            case 19:
            case i.f2380c:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f5063n.c(obj, obj2, R3);
                return;
            case 50:
                h0.E(this.f5066q, obj, obj2, R3);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (D(obj2, Q4, i4)) {
                    p0.O(obj, R3, p0.z(obj2, R3));
                    f0(obj, Q4, i4);
                    return;
                }
                return;
            case 60:
                J(obj, obj2, i4);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (D(obj2, Q4, i4)) {
                    p0.O(obj, R3, p0.z(obj2, R3));
                    f0(obj, Q4, i4);
                    return;
                }
                return;
            case 68:
                J(obj, obj2, i4);
                return;
            default:
                return;
        }
    }

    public final Object L(Object obj, int i4) {
        f0 s4 = s(i4);
        long R3 = R(k0(i4));
        if (!w(obj, i4)) {
            return s4.d();
        }
        Object object = f5049s.getObject(obj, R3);
        if (B(object)) {
            return object;
        }
        Object d4 = s4.d();
        if (object != null) {
            s4.a(d4, object);
        }
        return d4;
    }

    public final Object M(Object obj, int i4, int i5) {
        f0 s4 = s(i5);
        if (!D(obj, i4, i5)) {
            return s4.d();
        }
        Object object = f5049s.getObject(obj, R(k0(i5)));
        if (B(object)) {
            return object;
        }
        Object d4 = s4.d();
        if (object != null) {
            s4.a(d4, object);
        }
        return d4;
    }

    public final int Q(int i4) {
        return this.f5050a[i4];
    }

    public final int X(int i4) {
        if (i4 < this.f5052c || i4 > this.f5053d) {
            return -1;
        }
        return g0(i4, 0);
    }

    public final int Y(int i4) {
        return this.f5050a[i4 + 2];
    }

    public final void Z(Object obj, long j4, e0 e0Var, f0 f0Var, C0363o oVar) {
        e0Var.A(this.f5063n.b(obj, j4), f0Var, oVar);
    }

    public void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        for (int i4 = 0; i4 < this.f5050a.length; i4 += 3) {
            K(obj, obj2, i4);
        }
        h0.F(this.f5064o, obj, obj2);
        if (this.f5055f) {
            h0.D(this.f5065p, obj, obj2);
        }
    }

    public final void a0(Object obj, int i4, e0 e0Var, f0 f0Var, C0363o oVar) {
        e0Var.F(this.f5063n.b(obj, R(i4)), f0Var, oVar);
    }

    public boolean b(Object obj, Object obj2) {
        int length = this.f5050a.length;
        for (int i4 = 0; i4 < length; i4 += 3) {
            if (!n(obj, obj2, i4)) {
                return false;
            }
        }
        if (!this.f5064o.g(obj).equals(this.f5064o.g(obj2))) {
            return false;
        }
        if (this.f5055f) {
            return this.f5065p.c(obj).equals(this.f5065p.c(obj2));
        }
        return true;
    }

    public final void b0(Object obj, int i4, e0 e0Var) {
        if (v(i4)) {
            p0.O(obj, R(i4), e0Var.J());
        } else if (this.f5056g) {
            p0.O(obj, R(i4), e0Var.o());
        } else {
            p0.O(obj, R(i4), e0Var.w());
        }
    }

    public final boolean c(Object obj, Object obj2, int i4) {
        return w(obj, i4) == w(obj2, i4);
    }

    public final void c0(Object obj, int i4, e0 e0Var) {
        if (v(i4)) {
            e0Var.v(this.f5063n.b(obj, R(i4)));
        } else {
            e0Var.s(this.f5063n.b(obj, R(i4)));
        }
    }

    public Object d() {
        return this.f5062m.a(this.f5054e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016b, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int e(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f5050a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022d
            int r3 = r8.k0(r1)
            int r4 = r8.Q(r1)
            long r5 = R(r3)
            int r3 = j0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020d;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01ed;
                case 5: goto L_0x01e1;
                case 6: goto L_0x01d9;
                case 7: goto L_0x01cd;
                case 8: goto L_0x01bf;
                case 9: goto L_0x01b4;
                case 10: goto L_0x01a8;
                case 11: goto L_0x01a0;
                case 12: goto L_0x0198;
                case 13: goto L_0x0190;
                case 14: goto L_0x0184;
                case 15: goto L_0x017c;
                case 16: goto L_0x0170;
                case 17: goto L_0x0161;
                case 18: goto L_0x0155;
                case 19: goto L_0x0155;
                case 20: goto L_0x0155;
                case 21: goto L_0x0155;
                case 22: goto L_0x0155;
                case 23: goto L_0x0155;
                case 24: goto L_0x0155;
                case 25: goto L_0x0155;
                case 26: goto L_0x0155;
                case 27: goto L_0x0155;
                case 28: goto L_0x0155;
                case 29: goto L_0x0155;
                case 30: goto L_0x0155;
                case 31: goto L_0x0155;
                case 32: goto L_0x0155;
                case 33: goto L_0x0155;
                case 34: goto L_0x0155;
                case 35: goto L_0x0155;
                case 36: goto L_0x0155;
                case 37: goto L_0x0155;
                case 38: goto L_0x0155;
                case 39: goto L_0x0155;
                case 40: goto L_0x0155;
                case 41: goto L_0x0155;
                case 42: goto L_0x0155;
                case 43: goto L_0x0155;
                case 44: goto L_0x0155;
                case 45: goto L_0x0155;
                case 46: goto L_0x0155;
                case 47: goto L_0x0155;
                case 48: goto L_0x0155;
                case 49: goto L_0x0155;
                case 50: goto L_0x0149;
                case 51: goto L_0x0133;
                case 52: goto L_0x0121;
                case 53: goto L_0x010f;
                case 54: goto L_0x00fd;
                case 55: goto L_0x00ef;
                case 56: goto L_0x00dd;
                case 57: goto L_0x00cf;
                case 58: goto L_0x00bd;
                case 59: goto L_0x00a9;
                case 60: goto L_0x0098;
                case 61: goto L_0x0087;
                case 62: goto L_0x007a;
                case 63: goto L_0x006d;
                case 64: goto L_0x0060;
                case 65: goto L_0x004f;
                case 66: goto L_0x0042;
                case 67: goto L_0x0031;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0229
        L_0x001e:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.z(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L_0x002e:
            int r2 = r2 + r3
            goto L_0x0229
        L_0x0031:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = W(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.f(r3)
            goto L_0x002e
        L_0x0042:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = V(r9, r5)
            goto L_0x002e
        L_0x004f:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = W(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.f(r3)
            goto L_0x002e
        L_0x0060:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = V(r9, r5)
            goto L_0x002e
        L_0x006d:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = V(r9, r5)
            goto L_0x002e
        L_0x007a:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = V(r9, r5)
            goto L_0x002e
        L_0x0087:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.z(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0098:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.z(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00a9:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.z(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x00bd:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            boolean r3 = S(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.c(r3)
            goto L_0x002e
        L_0x00cf:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = V(r9, r5)
            goto L_0x002e
        L_0x00dd:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = W(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.f(r3)
            goto L_0x002e
        L_0x00ef:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = V(r9, r5)
            goto L_0x002e
        L_0x00fd:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = W(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.f(r3)
            goto L_0x002e
        L_0x010f:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = W(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.f(r3)
            goto L_0x002e
        L_0x0121:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            float r3 = U(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0133:
            boolean r3 = r8.D(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            double r3 = T(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.f(r3)
            goto L_0x002e
        L_0x0149:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.z(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0155:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.z(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x0161:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.z(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
        L_0x016b:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0229
        L_0x0170:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.p0.x(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.f(r3)
            goto L_0x002e
        L_0x017c:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.p0.w(r9, r5)
            goto L_0x002e
        L_0x0184:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.p0.x(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.f(r3)
            goto L_0x002e
        L_0x0190:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.p0.w(r9, r5)
            goto L_0x002e
        L_0x0198:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.p0.w(r9, r5)
            goto L_0x002e
        L_0x01a0:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.p0.w(r9, r5)
            goto L_0x002e
        L_0x01a8:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.z(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01b4:
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.z(r9, r5)
            if (r3 == 0) goto L_0x016b
            int r7 = r3.hashCode()
            goto L_0x016b
        L_0x01bf:
            int r2 = r2 * 53
            java.lang.Object r3 = androidx.datastore.preferences.protobuf.p0.z(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002e
        L_0x01cd:
            int r2 = r2 * 53
            boolean r3 = androidx.datastore.preferences.protobuf.p0.p(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.c(r3)
            goto L_0x002e
        L_0x01d9:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.p0.w(r9, r5)
            goto L_0x002e
        L_0x01e1:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.p0.x(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.f(r3)
            goto L_0x002e
        L_0x01ed:
            int r2 = r2 * 53
            int r3 = androidx.datastore.preferences.protobuf.p0.w(r9, r5)
            goto L_0x002e
        L_0x01f5:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.p0.x(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.f(r3)
            goto L_0x002e
        L_0x0201:
            int r2 = r2 * 53
            long r3 = androidx.datastore.preferences.protobuf.p0.x(r9, r5)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.f(r3)
            goto L_0x002e
        L_0x020d:
            int r2 = r2 * 53
            float r3 = androidx.datastore.preferences.protobuf.p0.v(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002e
        L_0x0219:
            int r2 = r2 * 53
            double r3 = androidx.datastore.preferences.protobuf.p0.u(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = androidx.datastore.preferences.protobuf.C0372y.f(r3)
            goto L_0x002e
        L_0x0229:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022d:
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.m0 r0 = r8.f5064o
            java.lang.Object r0 = r0.g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f5055f
            if (r0 == 0) goto L_0x024b
            int r2 = r2 * 53
            androidx.datastore.preferences.protobuf.p r0 = r8.f5065p
            androidx.datastore.preferences.protobuf.s r9 = r0.c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.e(java.lang.Object):int");
    }

    public final void e0(Object obj, int i4) {
        int Y3 = Y(i4);
        long j4 = (long) (1048575 & Y3);
        if (j4 != 1048575) {
            p0.M(obj, j4, (1 << (Y3 >>> 20)) | p0.w(obj, j4));
        }
    }

    public void f(Object obj, e0 e0Var, C0363o oVar) {
        oVar.getClass();
        l(obj);
        G(this.f5064o, this.f5065p, obj, e0Var, oVar);
    }

    public final void f0(Object obj, int i4, int i5) {
        p0.M(obj, (long) (Y(i5) & 1048575), i4);
    }

    public void g(Object obj, s0 s0Var) {
        if (s0Var.x() == s0.a.DESCENDING) {
            m0(obj, s0Var);
        } else {
            l0(obj, s0Var);
        }
    }

    public final int g0(int i4, int i5) {
        int length = (this.f5050a.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int Q4 = Q(i7);
            if (i4 == Q4) {
                return i7;
            }
            if (i4 < Q4) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    public void h(Object obj) {
        if (B(obj)) {
            if (obj instanceof C0370w) {
                C0370w wVar = (C0370w) obj;
                wVar.m();
                wVar.l();
                wVar.E();
            }
            int length = this.f5050a.length;
            for (int i4 = 0; i4 < length; i4 += 3) {
                int k02 = k0(i4);
                long R3 = R(k02);
                int j02 = j0(k02);
                if (j02 != 9) {
                    if (j02 == 60 || j02 == 68) {
                        if (D(obj, Q(i4), i4)) {
                            s(i4).h(f5049s.getObject(obj, R3));
                        }
                    } else {
                        switch (j02) {
                            case 17:
                                break;
                            case 18:
                            case 19:
                            case i.f2380c:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f5063n.a(obj, R3);
                                continue;
                            case 50:
                                Unsafe unsafe = f5049s;
                                Object object = unsafe.getObject(obj, R3);
                                if (object != null) {
                                    unsafe.putObject(obj, R3, this.f5066q.e(object));
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (w(obj, i4)) {
                    s(i4).h(f5049s.getObject(obj, R3));
                }
            }
            this.f5064o.j(obj);
            if (this.f5055f) {
                this.f5065p.f(obj);
            }
        }
    }

    public final void h0(Object obj, int i4, Object obj2) {
        f5049s.putObject(obj, R(k0(i4)), obj2);
        e0(obj, i4);
    }

    public final boolean i(Object obj) {
        int i4;
        int i5;
        Object obj2 = obj;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f5060k) {
            int i9 = this.f5059j[i8];
            int Q4 = Q(i9);
            int k02 = k0(i9);
            int i10 = this.f5050a[i9 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i6) {
                if (i11 != 1048575) {
                    i7 = f5049s.getInt(obj2, (long) i11);
                }
                i4 = i7;
                i5 = i11;
            } else {
                i5 = i6;
                i4 = i7;
            }
            if (E(k02) && !x(obj, i9, i5, i4, i12)) {
                return false;
            }
            int j02 = j0(k02);
            if (j02 != 9 && j02 != 17) {
                if (j02 != 27) {
                    if (j02 == 60 || j02 == 68) {
                        if (D(obj2, Q4, i9) && !y(obj2, k02, s(i9))) {
                            return false;
                        }
                    } else if (j02 != 49) {
                        if (j02 == 50 && !A(obj2, k02, i9)) {
                            return false;
                        }
                    }
                }
                if (!z(obj2, k02, i9)) {
                    return false;
                }
            } else if (x(obj, i9, i5, i4, i12) && !y(obj2, k02, s(i9))) {
                return false;
            }
            i8++;
            i6 = i5;
            i7 = i4;
        }
        return !this.f5055f || this.f5065p.c(obj2).k();
    }

    public final void i0(Object obj, int i4, int i5, Object obj2) {
        f5049s.putObject(obj, R(k0(i5)), obj2);
        f0(obj, i4, i5);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x034d, code lost:
        r12 = r12 + r0;
        r15 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0602, code lost:
        r11 = r11 + 3;
        r0 = r14;
        r1 = r16;
        r10 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        r12 = r12 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01bc, code lost:
        r1 = (r1 + r2) + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int j(java.lang.Object r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            sun.misc.Unsafe r8 = f5049s
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r10
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x000d:
            int[] r2 = r6.f5050a
            int r2 = r2.length
            if (r11 >= r2) goto L_0x060c
            int r2 = r6.k0(r11)
            int r3 = j0(r2)
            int r13 = r6.Q(r11)
            int[] r4 = r6.f5050a
            int r5 = r11 + 2
            r4 = r4[r5]
            r5 = r4 & r10
            r14 = 17
            r15 = 1
            if (r3 > r14) goto L_0x0042
            if (r5 == r0) goto L_0x0038
            if (r5 != r10) goto L_0x0031
            r1 = 0
            goto L_0x0037
        L_0x0031:
            long r0 = (long) r5
            int r0 = r8.getInt(r7, r0)
            r1 = r0
        L_0x0037:
            r0 = r5
        L_0x0038:
            int r4 = r4 >>> 20
            int r4 = r15 << r4
            r14 = r0
            r16 = r1
            r17 = r4
            goto L_0x0047
        L_0x0042:
            r14 = r0
            r16 = r1
            r17 = 0
        L_0x0047:
            long r1 = R(r2)
            androidx.datastore.preferences.protobuf.t r0 = androidx.datastore.preferences.protobuf.C0367t.DOUBLE_LIST_PACKED
            int r0 = r0.b()
            if (r3 < r0) goto L_0x005c
            androidx.datastore.preferences.protobuf.t r0 = androidx.datastore.preferences.protobuf.C0367t.SINT64_LIST_PACKED
            int r0 = r0.b()
            if (r3 > r0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r5 = 0
        L_0x005d:
            r4 = 0
            r9 = 0
            switch(r3) {
                case 0: goto L_0x05e9;
                case 1: goto L_0x05d1;
                case 2: goto L_0x05b6;
                case 3: goto L_0x059b;
                case 4: goto L_0x0580;
                case 5: goto L_0x056a;
                case 6: goto L_0x0552;
                case 7: goto L_0x053c;
                case 8: goto L_0x0513;
                case 9: goto L_0x04f4;
                case 10: goto L_0x04d7;
                case 11: goto L_0x04bc;
                case 12: goto L_0x04a1;
                case 13: goto L_0x048a;
                case 14: goto L_0x0474;
                case 15: goto L_0x0459;
                case 16: goto L_0x043e;
                case 17: goto L_0x041d;
                case 18: goto L_0x0410;
                case 19: goto L_0x0403;
                case 20: goto L_0x03f6;
                case 21: goto L_0x03e9;
                case 22: goto L_0x03dc;
                case 23: goto L_0x03cf;
                case 24: goto L_0x03c2;
                case 25: goto L_0x03b6;
                case 26: goto L_0x03aa;
                case 27: goto L_0x039a;
                case 28: goto L_0x038e;
                case 29: goto L_0x0381;
                case 30: goto L_0x0375;
                case 31: goto L_0x0369;
                case 32: goto L_0x035d;
                case 33: goto L_0x0351;
                case 34: goto L_0x0342;
                case 35: goto L_0x0324;
                case 36: goto L_0x0306;
                case 37: goto L_0x02e8;
                case 38: goto L_0x02ca;
                case 39: goto L_0x02ac;
                case 40: goto L_0x028e;
                case 41: goto L_0x0270;
                case 42: goto L_0x0252;
                case 43: goto L_0x0234;
                case 44: goto L_0x0217;
                case 45: goto L_0x01fa;
                case 46: goto L_0x01dd;
                case 47: goto L_0x01c0;
                case 48: goto L_0x01a0;
                case 49: goto L_0x0190;
                case 50: goto L_0x0180;
                case 51: goto L_0x0172;
                case 52: goto L_0x0166;
                case 53: goto L_0x0156;
                case 54: goto L_0x0146;
                case 55: goto L_0x0136;
                case 56: goto L_0x012a;
                case 57: goto L_0x011e;
                case 58: goto L_0x0112;
                case 59: goto L_0x00f4;
                case 60: goto L_0x00e1;
                case 61: goto L_0x00d0;
                case 62: goto L_0x00c1;
                case 63: goto L_0x00b2;
                case 64: goto L_0x00a5;
                case 65: goto L_0x009a;
                case 66: goto L_0x008b;
                case 67: goto L_0x007c;
                case 68: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x0079
        L_0x0064:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.P r0 = (androidx.datastore.preferences.protobuf.P) r0
            androidx.datastore.preferences.protobuf.f0 r1 = r6.s(r11)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.r(r13, r0, r1)
        L_0x0078:
            int r12 = r12 + r0
        L_0x0079:
            r15 = 0
            goto L_0x0602
        L_0x007c:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            long r0 = W(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.K(r13, r0)
            goto L_0x0078
        L_0x008b:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = V(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.I(r13, r0)
            goto L_0x0078
        L_0x009a:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.C0358j.G(r13, r9)
            goto L_0x0078
        L_0x00a5:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r1 = androidx.datastore.preferences.protobuf.C0358j.E(r13, r0)
        L_0x00b0:
            int r12 = r12 + r1
            goto L_0x0079
        L_0x00b2:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = V(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.j(r13, r0)
            goto L_0x0078
        L_0x00c1:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = V(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.P(r13, r0)
            goto L_0x0078
        L_0x00d0:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0355g) r0
            int r0 = androidx.datastore.preferences.protobuf.C0358j.f(r13, r0)
            goto L_0x0078
        L_0x00e1:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            androidx.datastore.preferences.protobuf.f0 r1 = r6.s(r11)
            int r0 = androidx.datastore.preferences.protobuf.h0.o(r13, r0, r1)
            goto L_0x0078
        L_0x00f4:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r1)
            boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C0355g
            if (r1 == 0) goto L_0x010a
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0355g) r0
            int r0 = androidx.datastore.preferences.protobuf.C0358j.f(r13, r0)
            goto L_0x0078
        L_0x010a:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = androidx.datastore.preferences.protobuf.C0358j.M(r13, r0)
            goto L_0x0078
        L_0x0112:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.C0358j.c(r13, r15)
            goto L_0x0078
        L_0x011e:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r1 = androidx.datastore.preferences.protobuf.C0358j.l(r13, r0)
            goto L_0x00b0
        L_0x012a:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.C0358j.n(r13, r9)
            goto L_0x0078
        L_0x0136:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = V(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.u(r13, r0)
            goto L_0x0078
        L_0x0146:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            long r0 = W(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.R(r13, r0)
            goto L_0x0078
        L_0x0156:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            long r0 = W(r7, r1)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.w(r13, r0)
            goto L_0x0078
        L_0x0166:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.C0358j.p(r13, r4)
            goto L_0x0078
        L_0x0172:
            boolean r0 = r6.D(r7, r13, r11)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r0 = androidx.datastore.preferences.protobuf.C0358j.h(r13, r0)
            goto L_0x0078
        L_0x0180:
            androidx.datastore.preferences.protobuf.K r0 = r6.f5066q
            java.lang.Object r1 = r8.getObject(r7, r1)
            java.lang.Object r2 = r6.r(r11)
            int r0 = r0.c(r13, r1, r2)
            goto L_0x0078
        L_0x0190:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            androidx.datastore.preferences.protobuf.f0 r1 = r6.s(r11)
            int r0 = androidx.datastore.preferences.protobuf.h0.j(r13, r0, r1)
            goto L_0x0078
        L_0x01a0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.t(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x01b4
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x01b4:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
        L_0x01bc:
            int r1 = r1 + r2
            int r1 = r1 + r0
            goto L_0x00b0
        L_0x01c0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.r(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x01d4
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x01d4:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x01dd:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.i(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x01f1
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x01f1:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x01fa:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.g(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x020e
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x020e:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x0217:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.e(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x022b
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x022b:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x0234:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.w(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x0248
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0248:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x0252:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.b(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x0266
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0266:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x0270:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.g(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x0284
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0284:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x028e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.i(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x02a2
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02a2:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x02ac:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.l(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x02c0
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02c0:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x02ca:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.y(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x02de
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02de:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x02e8:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.n(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x02fc
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x02fc:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x0306:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.g(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x031a
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x031a:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x0324:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.i(r0)
            if (r0 <= 0) goto L_0x0079
            boolean r1 = r6.f5058i
            if (r1 == 0) goto L_0x0338
            long r1 = (long) r5
            r8.putInt(r7, r1, r0)
        L_0x0338:
            int r1 = androidx.datastore.preferences.protobuf.C0358j.O(r13)
            int r2 = androidx.datastore.preferences.protobuf.C0358j.Q(r0)
            goto L_0x01bc
        L_0x0342:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            int r0 = androidx.datastore.preferences.protobuf.h0.s(r13, r0, r3)
        L_0x034d:
            int r12 = r12 + r0
            r15 = r3
            goto L_0x0602
        L_0x0351:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.q(r13, r0, r3)
            goto L_0x034d
        L_0x035d:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.h(r13, r0, r3)
            goto L_0x034d
        L_0x0369:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.f(r13, r0, r3)
            goto L_0x034d
        L_0x0375:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.d(r13, r0, r3)
            goto L_0x034d
        L_0x0381:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.v(r13, r0, r3)
            goto L_0x0078
        L_0x038e:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.c(r13, r0)
            goto L_0x0078
        L_0x039a:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            androidx.datastore.preferences.protobuf.f0 r1 = r6.s(r11)
            int r0 = androidx.datastore.preferences.protobuf.h0.p(r13, r0, r1)
            goto L_0x0078
        L_0x03aa:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.u(r13, r0)
            goto L_0x0078
        L_0x03b6:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            int r0 = androidx.datastore.preferences.protobuf.h0.a(r13, r0, r3)
            goto L_0x034d
        L_0x03c2:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.f(r13, r0, r3)
            goto L_0x034d
        L_0x03cf:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.h(r13, r0, r3)
            goto L_0x034d
        L_0x03dc:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.k(r13, r0, r3)
            goto L_0x034d
        L_0x03e9:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.x(r13, r0, r3)
            goto L_0x034d
        L_0x03f6:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.m(r13, r0, r3)
            goto L_0x034d
        L_0x0403:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.f(r13, r0, r3)
            goto L_0x034d
        L_0x0410:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = androidx.datastore.preferences.protobuf.h0.h(r13, r0, r3)
            goto L_0x0078
        L_0x041d:
            r0 = r18
            r9 = r1
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            androidx.datastore.preferences.protobuf.P r0 = (androidx.datastore.preferences.protobuf.P) r0
            androidx.datastore.preferences.protobuf.f0 r1 = r6.s(r11)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.r(r13, r0, r1)
            goto L_0x0078
        L_0x043e:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            long r0 = r8.getLong(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.K(r13, r0)
            goto L_0x0078
        L_0x0459:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.I(r13, r0)
            goto L_0x0078
        L_0x0474:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.C0358j.G(r13, r9)
            goto L_0x0078
        L_0x048a:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            r0 = 0
            int r1 = androidx.datastore.preferences.protobuf.C0358j.E(r13, r0)
            goto L_0x00b0
        L_0x04a1:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.j(r13, r0)
            goto L_0x0078
        L_0x04bc:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.P(r13, r0)
            goto L_0x0078
        L_0x04d7:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0355g) r0
            int r0 = androidx.datastore.preferences.protobuf.C0358j.f(r13, r0)
            goto L_0x0078
        L_0x04f4:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            androidx.datastore.preferences.protobuf.f0 r1 = r6.s(r11)
            int r0 = androidx.datastore.preferences.protobuf.h0.o(r13, r0, r1)
            goto L_0x0078
        L_0x0513:
            r9 = r1
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r8.getObject(r7, r9)
            boolean r1 = r0 instanceof androidx.datastore.preferences.protobuf.C0355g
            if (r1 == 0) goto L_0x0534
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0355g) r0
            int r0 = androidx.datastore.preferences.protobuf.C0358j.f(r13, r0)
            goto L_0x0078
        L_0x0534:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = androidx.datastore.preferences.protobuf.C0358j.M(r13, r0)
            goto L_0x0078
        L_0x053c:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            int r0 = androidx.datastore.preferences.protobuf.C0358j.c(r13, r15)
            goto L_0x0078
        L_0x0552:
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0079
            r15 = 0
            int r0 = androidx.datastore.preferences.protobuf.C0358j.l(r13, r15)
        L_0x0567:
            int r12 = r12 + r0
            goto L_0x0602
        L_0x056a:
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            int r0 = androidx.datastore.preferences.protobuf.C0358j.n(r13, r9)
            goto L_0x0567
        L_0x0580:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            int r0 = r8.getInt(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.u(r13, r0)
            goto L_0x0567
        L_0x059b:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            long r0 = r8.getLong(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.R(r13, r0)
            goto L_0x0567
        L_0x05b6:
            r9 = r1
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            long r0 = r8.getLong(r7, r9)
            int r0 = androidx.datastore.preferences.protobuf.C0358j.w(r13, r0)
            goto L_0x0567
        L_0x05d1:
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r9 = r4
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            int r0 = androidx.datastore.preferences.protobuf.C0358j.p(r13, r9)
            goto L_0x0567
        L_0x05e9:
            r15 = 0
            r0 = r18
            r1 = r19
            r2 = r11
            r3 = r14
            r4 = r16
            r5 = r17
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0602
            r0 = 0
            int r0 = androidx.datastore.preferences.protobuf.C0358j.h(r13, r0)
            goto L_0x0567
        L_0x0602:
            int r11 = r11 + 3
            r0 = r14
            r1 = r16
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x060c:
            androidx.datastore.preferences.protobuf.m0 r0 = r6.f5064o
            int r0 = r6.t(r0, r7)
            int r12 = r12 + r0
            boolean r0 = r6.f5055f
            if (r0 == 0) goto L_0x0622
            androidx.datastore.preferences.protobuf.p r0 = r6.f5065p
            androidx.datastore.preferences.protobuf.s r0 = r0.c(r7)
            int r0 = r0.h()
            int r12 = r12 + r0
        L_0x0622:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.j(java.lang.Object):int");
    }

    public final int k0(int i4) {
        return this.f5050a[i4 + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02ba, code lost:
        r19 = r4;
        r20 = r11;
        r16 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0617, code lost:
        r15 = r15 + 3;
        r0 = r9;
        r1 = r16;
        r2 = r17;
        r11 = r20;
        r13 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        r20 = r11;
        r16 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0629  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l0(java.lang.Object r22, androidx.datastore.preferences.protobuf.s0 r23) {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r8 = r23
            boolean r0 = r6.f5055f
            if (r0 == 0) goto L_0x0022
            androidx.datastore.preferences.protobuf.p r0 = r6.f5065p
            androidx.datastore.preferences.protobuf.s r0 = r0.c(r7)
            boolean r1 = r0.j()
            if (r1 != 0) goto L_0x0022
            java.util.Iterator r0 = r0.n()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r10 = r0
            goto L_0x0024
        L_0x0022:
            r1 = 0
            r10 = 0
        L_0x0024:
            int[] r0 = r6.f5050a
            int r11 = r0.length
            sun.misc.Unsafe r12 = f5049s
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r13
            r2 = 0
            r15 = 0
        L_0x002f:
            if (r15 >= r11) goto L_0x0625
            int r3 = r6.k0(r15)
            int r5 = r6.Q(r15)
            int r4 = j0(r3)
            r9 = 17
            if (r4 > r9) goto L_0x006a
            int[] r9 = r6.f5050a
            int r16 = r15 + 2
            r9 = r9[r16]
            r14 = r9 & r13
            if (r14 == r0) goto L_0x005b
            if (r14 != r13) goto L_0x0051
            r17 = r1
            r2 = 0
            goto L_0x0059
        L_0x0051:
            r17 = r1
            long r0 = (long) r14
            int r0 = r12.getInt(r7, r0)
            r2 = r0
        L_0x0059:
            r0 = r14
            goto L_0x005d
        L_0x005b:
            r17 = r1
        L_0x005d:
            int r1 = r9 >>> 20
            r9 = 1
            int r1 = r9 << r1
            r9 = r0
            r18 = r1
            r14 = r17
        L_0x0067:
            r17 = r2
            goto L_0x0072
        L_0x006a:
            r17 = r1
            r9 = r0
            r14 = r17
            r18 = 0
            goto L_0x0067
        L_0x0072:
            if (r14 == 0) goto L_0x0091
            androidx.datastore.preferences.protobuf.p r0 = r6.f5065p
            int r0 = r0.a(r14)
            if (r0 > r5) goto L_0x0091
            androidx.datastore.preferences.protobuf.p r0 = r6.f5065p
            r0.j(r8, r14)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r14 = r0
            goto L_0x0072
        L_0x008f:
            r14 = 0
            goto L_0x0072
        L_0x0091:
            long r2 = R(r3)
            switch(r4) {
                case 0: goto L_0x05f8;
                case 1: goto L_0x05d8;
                case 2: goto L_0x05b8;
                case 3: goto L_0x0597;
                case 4: goto L_0x0576;
                case 5: goto L_0x0555;
                case 6: goto L_0x0534;
                case 7: goto L_0x0513;
                case 8: goto L_0x04f2;
                case 9: goto L_0x04cd;
                case 10: goto L_0x04aa;
                case 11: goto L_0x0489;
                case 12: goto L_0x0468;
                case 13: goto L_0x0447;
                case 14: goto L_0x0426;
                case 15: goto L_0x0405;
                case 16: goto L_0x03e4;
                case 17: goto L_0x03be;
                case 18: goto L_0x03ae;
                case 19: goto L_0x039e;
                case 20: goto L_0x038e;
                case 21: goto L_0x037e;
                case 22: goto L_0x036e;
                case 23: goto L_0x035e;
                case 24: goto L_0x034e;
                case 25: goto L_0x033e;
                case 26: goto L_0x032f;
                case 27: goto L_0x031c;
                case 28: goto L_0x030d;
                case 29: goto L_0x02fe;
                case 30: goto L_0x02ef;
                case 31: goto L_0x02e0;
                case 32: goto L_0x02d1;
                case 33: goto L_0x02c2;
                case 34: goto L_0x02ac;
                case 35: goto L_0x029c;
                case 36: goto L_0x028c;
                case 37: goto L_0x027c;
                case 38: goto L_0x026c;
                case 39: goto L_0x025c;
                case 40: goto L_0x024c;
                case 41: goto L_0x023c;
                case 42: goto L_0x022c;
                case 43: goto L_0x021c;
                case 44: goto L_0x020c;
                case 45: goto L_0x01fc;
                case 46: goto L_0x01ec;
                case 47: goto L_0x01dc;
                case 48: goto L_0x01cc;
                case 49: goto L_0x01b9;
                case 50: goto L_0x01b0;
                case 51: goto L_0x01a1;
                case 52: goto L_0x0192;
                case 53: goto L_0x0183;
                case 54: goto L_0x0174;
                case 55: goto L_0x0165;
                case 56: goto L_0x0156;
                case 57: goto L_0x0147;
                case 58: goto L_0x0138;
                case 59: goto L_0x0129;
                case 60: goto L_0x0116;
                case 61: goto L_0x0106;
                case 62: goto L_0x00f8;
                case 63: goto L_0x00ea;
                case 64: goto L_0x00dc;
                case 65: goto L_0x00ce;
                case 66: goto L_0x00c0;
                case 67: goto L_0x00b2;
                case 68: goto L_0x00a0;
                default: goto L_0x0098;
            }
        L_0x0098:
            r20 = r11
            r16 = r14
            r19 = 0
            goto L_0x0617
        L_0x00a0:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            androidx.datastore.preferences.protobuf.f0 r1 = r6.s(r15)
            r8.O(r5, r0, r1)
            goto L_0x0098
        L_0x00b2:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = W(r7, r2)
            r8.z(r5, r0)
            goto L_0x0098
        L_0x00c0:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = V(r7, r2)
            r8.M(r5, r0)
            goto L_0x0098
        L_0x00ce:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = W(r7, r2)
            r8.o(r5, r0)
            goto L_0x0098
        L_0x00dc:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = V(r7, r2)
            r8.g(r5, r0)
            goto L_0x0098
        L_0x00ea:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = V(r7, r2)
            r8.H(r5, r0)
            goto L_0x0098
        L_0x00f8:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = V(r7, r2)
            r8.e(r5, r0)
            goto L_0x0098
        L_0x0106:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0355g) r0
            r8.l(r5, r0)
            goto L_0x0098
        L_0x0116:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            androidx.datastore.preferences.protobuf.f0 r1 = r6.s(r15)
            r8.s(r5, r0, r1)
            goto L_0x0098
        L_0x0129:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            java.lang.Object r0 = r12.getObject(r7, r2)
            r6.o0(r5, r0, r8)
            goto L_0x0098
        L_0x0138:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            boolean r0 = S(r7, r2)
            r8.d(r5, r0)
            goto L_0x0098
        L_0x0147:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = V(r7, r2)
            r8.m(r5, r0)
            goto L_0x0098
        L_0x0156:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = W(r7, r2)
            r8.w(r5, r0)
            goto L_0x0098
        L_0x0165:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            int r0 = V(r7, r2)
            r8.i(r5, r0)
            goto L_0x0098
        L_0x0174:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = W(r7, r2)
            r8.G(r5, r0)
            goto L_0x0098
        L_0x0183:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            long r0 = W(r7, r2)
            r8.c(r5, r0)
            goto L_0x0098
        L_0x0192:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            float r0 = U(r7, r2)
            r8.A(r5, r0)
            goto L_0x0098
        L_0x01a1:
            boolean r0 = r6.D(r7, r5, r15)
            if (r0 == 0) goto L_0x0098
            double r0 = T(r7, r2)
            r8.n(r5, r0)
            goto L_0x0098
        L_0x01b0:
            java.lang.Object r0 = r12.getObject(r7, r2)
            r6.n0(r8, r5, r0, r15)
            goto L_0x0098
        L_0x01b9:
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.f0 r2 = r6.s(r15)
            androidx.datastore.preferences.protobuf.h0.S(r0, r1, r8, r2)
            goto L_0x0098
        L_0x01cc:
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 1
            androidx.datastore.preferences.protobuf.h0.Z(r0, r1, r8, r4)
            goto L_0x0098
        L_0x01dc:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.Y(r0, r1, r8, r4)
            goto L_0x0098
        L_0x01ec:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.X(r0, r1, r8, r4)
            goto L_0x0098
        L_0x01fc:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.W(r0, r1, r8, r4)
            goto L_0x0098
        L_0x020c:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.O(r0, r1, r8, r4)
            goto L_0x0098
        L_0x021c:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.b0(r0, r1, r8, r4)
            goto L_0x0098
        L_0x022c:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.L(r0, r1, r8, r4)
            goto L_0x0098
        L_0x023c:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.P(r0, r1, r8, r4)
            goto L_0x0098
        L_0x024c:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.Q(r0, r1, r8, r4)
            goto L_0x0098
        L_0x025c:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.T(r0, r1, r8, r4)
            goto L_0x0098
        L_0x026c:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.c0(r0, r1, r8, r4)
            goto L_0x0098
        L_0x027c:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.U(r0, r1, r8, r4)
            goto L_0x0098
        L_0x028c:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.R(r0, r1, r8, r4)
            goto L_0x0098
        L_0x029c:
            r4 = 1
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.N(r0, r1, r8, r4)
            goto L_0x0098
        L_0x02ac:
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            androidx.datastore.preferences.protobuf.h0.Z(r0, r1, r8, r4)
        L_0x02ba:
            r19 = r4
            r20 = r11
            r16 = r14
            goto L_0x0617
        L_0x02c2:
            r4 = 0
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.Y(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02d1:
            r4 = 0
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.X(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02e0:
            r4 = 0
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.W(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02ef:
            r4 = 0
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.O(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x02fe:
            r4 = 0
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.b0(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x030d:
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.M(r0, r1, r8)
            goto L_0x0098
        L_0x031c:
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.f0 r2 = r6.s(r15)
            androidx.datastore.preferences.protobuf.h0.V(r0, r1, r8, r2)
            goto L_0x0098
        L_0x032f:
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.a0(r0, r1, r8)
            goto L_0x0098
        L_0x033e:
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r4 = 0
            androidx.datastore.preferences.protobuf.h0.L(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x034e:
            r4 = 0
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.P(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x035e:
            r4 = 0
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.Q(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x036e:
            r4 = 0
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.T(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x037e:
            r4 = 0
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.c0(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x038e:
            r4 = 0
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.U(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x039e:
            r4 = 0
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.R(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x03ae:
            r4 = 0
            int r0 = r6.Q(r15)
            java.lang.Object r1 = r12.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            androidx.datastore.preferences.protobuf.h0.N(r0, r1, r8, r4)
            goto L_0x02ba
        L_0x03be:
            r4 = 0
            r0 = r21
            r1 = r22
            r16 = r14
            r13 = r2
            r2 = r15
            r3 = r9
            r19 = r4
            r4 = r17
            r20 = r11
            r11 = r5
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            androidx.datastore.preferences.protobuf.f0 r1 = r6.s(r15)
            r8.O(r11, r0, r1)
            goto L_0x0617
        L_0x03e4:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.z(r11, r0)
            goto L_0x0617
        L_0x0405:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.M(r11, r0)
            goto L_0x0617
        L_0x0426:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.o(r11, r0)
            goto L_0x0617
        L_0x0447:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.g(r11, r0)
            goto L_0x0617
        L_0x0468:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.H(r11, r0)
            goto L_0x0617
        L_0x0489:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.e(r11, r0)
            goto L_0x0617
        L_0x04aa:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            androidx.datastore.preferences.protobuf.g r0 = (androidx.datastore.preferences.protobuf.C0355g) r0
            r8.l(r11, r0)
            goto L_0x0617
        L_0x04cd:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            androidx.datastore.preferences.protobuf.f0 r1 = r6.s(r15)
            r8.s(r11, r0, r1)
            goto L_0x0617
        L_0x04f2:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            java.lang.Object r0 = r12.getObject(r7, r13)
            r6.o0(r11, r0, r8)
            goto L_0x0617
        L_0x0513:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            boolean r0 = k(r7, r13)
            r8.d(r11, r0)
            goto L_0x0617
        L_0x0534:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.m(r11, r0)
            goto L_0x0617
        L_0x0555:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.w(r11, r0)
            goto L_0x0617
        L_0x0576:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            int r0 = r12.getInt(r7, r13)
            r8.i(r11, r0)
            goto L_0x0617
        L_0x0597:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.G(r11, r0)
            goto L_0x0617
        L_0x05b8:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            long r0 = r12.getLong(r7, r13)
            r8.c(r11, r0)
            goto L_0x0617
        L_0x05d8:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            float r0 = p(r7, r13)
            r8.A(r11, r0)
            goto L_0x0617
        L_0x05f8:
            r20 = r11
            r16 = r14
            r19 = 0
            r13 = r2
            r11 = r5
            r0 = r21
            r1 = r22
            r2 = r15
            r3 = r9
            r4 = r17
            r5 = r18
            boolean r0 = r0.x(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0617
            double r0 = m(r7, r13)
            r8.n(r11, r0)
        L_0x0617:
            int r15 = r15 + 3
            r0 = r9
            r1 = r16
            r2 = r17
            r11 = r20
            r13 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x002f
        L_0x0625:
            r17 = r1
        L_0x0627:
            if (r1 == 0) goto L_0x063e
            androidx.datastore.preferences.protobuf.p r0 = r6.f5065p
            r0.j(r8, r1)
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x063c
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r1 = r0
            goto L_0x0627
        L_0x063c:
            r1 = 0
            goto L_0x0627
        L_0x063e:
            androidx.datastore.preferences.protobuf.m0 r0 = r6.f5064o
            r6.p0(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.l0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m0(java.lang.Object r11, androidx.datastore.preferences.protobuf.s0 r12) {
        /*
            r10 = this;
            androidx.datastore.preferences.protobuf.m0 r0 = r10.f5064o
            r10.p0(r0, r11, r12)
            boolean r0 = r10.f5055f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            androidx.datastore.preferences.protobuf.p r0 = r10.f5065p
            androidx.datastore.preferences.protobuf.s r0 = r0.c(r11)
            boolean r2 = r0.j()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.e()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f5050a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.k0(r3)
            int r5 = r10.Q(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            androidx.datastore.preferences.protobuf.p r6 = r10.f5065p
            int r6 = r6.a(r2)
            if (r6 <= r5) goto L_0x0050
            androidx.datastore.preferences.protobuf.p r6 = r10.f5065p
            r6.j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = j0(r4)
            r7 = 0
            r8 = 1
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            androidx.datastore.preferences.protobuf.f0 r6 = r10.s(r3)
            r12.O(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            long r6 = W(r11, r6)
            r12.z(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            int r4 = V(r11, r6)
            r12.M(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            long r6 = W(r11, r6)
            r12.o(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            int r4 = V(r11, r6)
            r12.g(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            int r4 = V(r11, r6)
            r12.H(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            int r4 = V(r11, r6)
            r12.e(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            androidx.datastore.preferences.protobuf.g r4 = (androidx.datastore.preferences.protobuf.C0355g) r4
            r12.l(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            androidx.datastore.preferences.protobuf.f0 r6 = r10.s(r3)
            r12.s(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            r10.o0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            boolean r4 = S(r11, r6)
            r12.d(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            int r4 = V(r11, r6)
            r12.m(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            long r6 = W(r11, r6)
            r12.w(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            int r4 = V(r11, r6)
            r12.i(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            long r6 = W(r11, r6)
            r12.G(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            long r6 = W(r11, r6)
            r12.c(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            float r4 = U(r11, r6)
            r12.A(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.D(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            double r6 = T(r11, r6)
            r12.n(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            r10.n0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.f0 r6 = r10.s(r3)
            androidx.datastore.preferences.protobuf.h0.S(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.X(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.O(r5, r4, r12, r8)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.L(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.c0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.U(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.X(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.O(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.M(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.f0 r6 = r10.s(r3)
            androidx.datastore.preferences.protobuf.h0.V(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.Q(r3)
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.a0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.L(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.c0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.U(r5, r4, r12, r7)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.Q(r3)
            long r8 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r8)
            java.util.List r4 = (java.util.List) r4
            androidx.datastore.preferences.protobuf.h0.N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            androidx.datastore.preferences.protobuf.f0 r6 = r10.s(r3)
            r12.O(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            long r6 = F(r11, r6)
            r12.z(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            int r4 = u(r11, r6)
            r12.M(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            long r6 = F(r11, r6)
            r12.o(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            int r4 = u(r11, r6)
            r12.g(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            int r4 = u(r11, r6)
            r12.H(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            int r4 = u(r11, r6)
            r12.e(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            androidx.datastore.preferences.protobuf.g r4 = (androidx.datastore.preferences.protobuf.C0355g) r4
            r12.l(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            androidx.datastore.preferences.protobuf.f0 r6 = r10.s(r3)
            r12.s(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            java.lang.Object r4 = androidx.datastore.preferences.protobuf.p0.z(r11, r6)
            r10.o0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            boolean r4 = k(r11, r6)
            r12.d(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            int r4 = u(r11, r6)
            r12.m(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            long r6 = F(r11, r6)
            r12.w(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            int r4 = u(r11, r6)
            r12.i(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            long r6 = F(r11, r6)
            r12.G(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            long r6 = F(r11, r6)
            r12.c(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            float r4 = p(r11, r6)
            r12.A(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.w(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = R(r4)
            double r6 = m(r11, r6)
            r12.n(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            androidx.datastore.preferences.protobuf.p r11 = r10.f5065p
            r11.j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.m0(java.lang.Object, androidx.datastore.preferences.protobuf.s0):void");
    }

    public final boolean n(Object obj, Object obj2, int i4) {
        int k02 = k0(i4);
        long R3 = R(k02);
        switch (j0(k02)) {
            case 0:
                return c(obj, obj2, i4) && Double.doubleToLongBits(p0.u(obj, R3)) == Double.doubleToLongBits(p0.u(obj2, R3));
            case 1:
                return c(obj, obj2, i4) && Float.floatToIntBits(p0.v(obj, R3)) == Float.floatToIntBits(p0.v(obj2, R3));
            case 2:
                return c(obj, obj2, i4) && p0.x(obj, R3) == p0.x(obj2, R3);
            case 3:
                return c(obj, obj2, i4) && p0.x(obj, R3) == p0.x(obj2, R3);
            case 4:
                return c(obj, obj2, i4) && p0.w(obj, R3) == p0.w(obj2, R3);
            case 5:
                return c(obj, obj2, i4) && p0.x(obj, R3) == p0.x(obj2, R3);
            case 6:
                return c(obj, obj2, i4) && p0.w(obj, R3) == p0.w(obj2, R3);
            case 7:
                return c(obj, obj2, i4) && p0.p(obj, R3) == p0.p(obj2, R3);
            case 8:
                return c(obj, obj2, i4) && h0.H(p0.z(obj, R3), p0.z(obj2, R3));
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                return c(obj, obj2, i4) && h0.H(p0.z(obj, R3), p0.z(obj2, R3));
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                return c(obj, obj2, i4) && h0.H(p0.z(obj, R3), p0.z(obj2, R3));
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                return c(obj, obj2, i4) && p0.w(obj, R3) == p0.w(obj2, R3);
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                return c(obj, obj2, i4) && p0.w(obj, R3) == p0.w(obj2, R3);
            case 13:
                return c(obj, obj2, i4) && p0.w(obj, R3) == p0.w(obj2, R3);
            case 14:
                return c(obj, obj2, i4) && p0.x(obj, R3) == p0.x(obj2, R3);
            case 15:
                return c(obj, obj2, i4) && p0.w(obj, R3) == p0.w(obj2, R3);
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                return c(obj, obj2, i4) && p0.x(obj, R3) == p0.x(obj2, R3);
            case 17:
                return c(obj, obj2, i4) && h0.H(p0.z(obj, R3), p0.z(obj2, R3));
            case 18:
            case 19:
            case i.f2380c:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return h0.H(p0.z(obj, R3), p0.z(obj2, R3));
            case 50:
                return h0.H(p0.z(obj, R3), p0.z(obj2, R3));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return C(obj, obj2, i4) && h0.H(p0.z(obj, R3), p0.z(obj2, R3));
            default:
                return true;
        }
    }

    public final void n0(s0 s0Var, int i4, Object obj, int i5) {
        if (obj != null) {
            s0Var.L(i4, this.f5066q.f(r(i5)), this.f5066q.g(obj));
        }
    }

    public final Object o(Object obj, int i4, Object obj2, m0 m0Var, Object obj3) {
        Q(i4);
        if (p0.z(obj, R(k0(i4))) == null) {
            return obj2;
        }
        q(i4);
        return obj2;
    }

    public final void o0(int i4, Object obj, s0 s0Var) {
        if (obj instanceof String) {
            s0Var.E(i4, (String) obj);
        } else {
            s0Var.l(i4, (C0355g) obj);
        }
    }

    public final void p0(m0 m0Var, Object obj, s0 s0Var) {
        m0Var.t(m0Var.g(obj), s0Var);
    }

    public final C0372y.a q(int i4) {
        b.a(this.f5051b[((i4 / 3) * 2) + 1]);
        return null;
    }

    public final Object r(int i4) {
        return this.f5051b[(i4 / 3) * 2];
    }

    public final f0 s(int i4) {
        int i5 = (i4 / 3) * 2;
        f0 f0Var = (f0) this.f5051b[i5];
        if (f0Var != null) {
            return f0Var;
        }
        f0 c4 = b0.a().c((Class) this.f5051b[i5 + 1]);
        this.f5051b[i5] = c4;
        return c4;
    }

    public final int t(m0 m0Var, Object obj) {
        return m0Var.h(m0Var.g(obj));
    }

    public final boolean w(Object obj, int i4) {
        int Y3 = Y(i4);
        long j4 = (long) (1048575 & Y3);
        if (j4 == 1048575) {
            int k02 = k0(i4);
            long R3 = R(k02);
            switch (j0(k02)) {
                case 0:
                    return Double.doubleToRawLongBits(p0.u(obj, R3)) != 0;
                case 1:
                    return Float.floatToRawIntBits(p0.v(obj, R3)) != 0;
                case 2:
                    return p0.x(obj, R3) != 0;
                case 3:
                    return p0.x(obj, R3) != 0;
                case 4:
                    return p0.w(obj, R3) != 0;
                case 5:
                    return p0.x(obj, R3) != 0;
                case 6:
                    return p0.w(obj, R3) != 0;
                case 7:
                    return p0.p(obj, R3);
                case 8:
                    Object z4 = p0.z(obj, R3);
                    if (z4 instanceof String) {
                        return !((String) z4).isEmpty();
                    }
                    if (z4 instanceof C0355g) {
                        return !C0355g.f5093f.equals(z4);
                    }
                    throw new IllegalArgumentException();
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    return p0.z(obj, R3) != null;
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    return !C0355g.f5093f.equals(p0.z(obj, R3));
                case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                    return p0.w(obj, R3) != 0;
                case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                    return p0.w(obj, R3) != 0;
                case 13:
                    return p0.w(obj, R3) != 0;
                case 14:
                    return p0.x(obj, R3) != 0;
                case 15:
                    return p0.w(obj, R3) != 0;
                case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                    return p0.x(obj, R3) != 0;
                case 17:
                    return p0.z(obj, R3) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (p0.w(obj, j4) & (1 << (Y3 >>> 20))) != 0;
        }
    }

    public final boolean x(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? w(obj, i4) : (i6 & i7) != 0;
    }

    public final boolean z(Object obj, int i4, int i5) {
        List list = (List) p0.z(obj, R(i4));
        if (list.isEmpty()) {
            return true;
        }
        f0 s4 = s(i5);
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (!s4.i(list.get(i6))) {
                return false;
            }
        }
        return true;
    }
}
