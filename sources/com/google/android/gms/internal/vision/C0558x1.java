package com.google.android.gms.internal.vision;

import Q0.i;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.vision.x1  reason: case insensitive filesystem */
public final class C0558x1 implements K1 {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f7587r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f7588s = h2.t();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f7589a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f7590b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7591c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7592d;

    /* renamed from: e  reason: collision with root package name */
    public final C0546t1 f7593e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7594f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7595g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7596h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7597i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f7598j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7599k;

    /* renamed from: l  reason: collision with root package name */
    public final int f7600l;

    /* renamed from: m  reason: collision with root package name */
    public final A1 f7601m;

    /* renamed from: n  reason: collision with root package name */
    public final C0493c1 f7602n;

    /* renamed from: o  reason: collision with root package name */
    public final C0486a2 f7603o;

    /* renamed from: p  reason: collision with root package name */
    public final C0 f7604p;

    /* renamed from: q  reason: collision with root package name */
    public final C0538q1 f7605q;

    public C0558x1(int[] iArr, Object[] objArr, int i4, int i5, C0546t1 t1Var, boolean z4, boolean z5, int[] iArr2, int i6, int i7, A1 a12, C0493c1 c1Var, C0486a2 a2Var, C0 c02, C0538q1 q1Var) {
        this.f7589a = iArr;
        this.f7590b = objArr;
        this.f7591c = i4;
        this.f7592d = i5;
        this.f7595g = t1Var instanceof N0;
        this.f7596h = z4;
        this.f7594f = c02 != null && c02.d(t1Var);
        this.f7597i = false;
        this.f7598j = iArr2;
        this.f7599k = i6;
        this.f7600l = i7;
        this.f7601m = a12;
        this.f7602n = c1Var;
        this.f7603o = a2Var;
        this.f7604p = c02;
        this.f7593e = t1Var;
        this.f7605q = q1Var;
    }

    public static boolean C(Object obj, int i4, K1 k12) {
        return k12.d(h2.F(obj, (long) (i4 & 1048575)));
    }

    public static double D(Object obj, long j4) {
        return ((Double) h2.F(obj, j4)).doubleValue();
    }

    public static float K(Object obj, long j4) {
        return ((Float) h2.F(obj, j4)).floatValue();
    }

    public static int O(Object obj, long j4) {
        return ((Integer) h2.F(obj, j4)).intValue();
    }

    public static long Q(Object obj, long j4) {
        return ((Long) h2.F(obj, j4)).longValue();
    }

    public static C0498d2 R(Object obj) {
        N0 n02 = (N0) obj;
        C0498d2 d2Var = n02.zzb;
        if (d2Var != C0498d2.a()) {
            return d2Var;
        }
        C0498d2 g4 = C0498d2.g();
        n02.zzb = g4;
        return g4;
    }

    public static boolean S(Object obj, long j4) {
        return ((Boolean) h2.F(obj, j4)).booleanValue();
    }

    public static int k(C0486a2 a2Var, Object obj) {
        return a2Var.l(a2Var.f(obj));
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x038b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.vision.C0558x1 p(java.lang.Class r31, com.google.android.gms.internal.vision.C0540r1 r32, com.google.android.gms.internal.vision.A1 r33, com.google.android.gms.internal.vision.C0493c1 r34, com.google.android.gms.internal.vision.C0486a2 r35, com.google.android.gms.internal.vision.C0 r36, com.google.android.gms.internal.vision.C0538q1 r37) {
        /*
            r0 = r32
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.I1
            if (r1 == 0) goto L_0x0403
            com.google.android.gms.internal.vision.I1 r0 = (com.google.android.gms.internal.vision.I1) r0
            int r1 = r0.a()
            int r2 = com.google.android.gms.internal.vision.G1.f7285b
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0014
            r11 = r4
            goto L_0x0015
        L_0x0014:
            r11 = r3
        L_0x0015:
            java.lang.String r1 = r0.c()
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0031
            r5 = r4
        L_0x0027:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0032
            r5 = r7
            goto L_0x0027
        L_0x0031:
            r7 = r4
        L_0x0032:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0051
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003e:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003e
        L_0x004e:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0051:
            if (r7 != 0) goto L_0x005e
            int[] r7 = f7587r
            r9 = r3
            r10 = r9
            r12 = r10
            r13 = r12
            r15 = r13
            r14 = r7
            r7 = r15
            goto L_0x016f
        L_0x005e:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007d
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006a:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007a
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006a
        L_0x007a:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007d:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0089:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0099
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0089
        L_0x0099:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009c:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bb
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a8:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b8
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a8
        L_0x00b8:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bb:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00da
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c7:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d7
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c7
        L_0x00d7:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00da:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e6:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f6
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e6
        L_0x00f6:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f9:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0105:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0116
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0105
        L_0x0116:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011a:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0126:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0138
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0126
        L_0x0138:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013d:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0162
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x014b:
            int r17 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r6) goto L_0x015d
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r17
            goto L_0x014b
        L_0x015d:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r17
        L_0x0162:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r14
            r14 = r3
            r3 = r5
            r5 = r16
        L_0x016f:
            sun.misc.Unsafe r8 = f7588s
            java.lang.Object[] r16 = r0.e()
            com.google.android.gms.internal.vision.t1 r17 = r0.b()
            java.lang.Class r6 = r17.getClass()
            r17 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 << r4
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r19 = r15 + r13
            r13 = r7
            r21 = r15
            r7 = r17
            r22 = r19
            r17 = 0
            r20 = 0
        L_0x0193:
            if (r7 >= r2) goto L_0x03d8
            int r23 = r7 + 1
            char r7 = r1.charAt(r7)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r4) goto L_0x01c5
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01a6:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r2) goto L_0x01bf
            r2 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r23
            r7 = r7 | r2
            int r23 = r23 + 13
            r4 = r25
            r2 = r26
            goto L_0x01a6
        L_0x01bf:
            int r2 = r4 << r23
            r7 = r7 | r2
            r2 = r25
            goto L_0x01c9
        L_0x01c5:
            r26 = r2
            r2 = r23
        L_0x01c9:
            int r4 = r2 + 1
            char r2 = r1.charAt(r2)
            r23 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r4) goto L_0x01fb
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = r23
            r23 = 13
        L_0x01dc:
            int r25 = r4 + 1
            char r4 = r1.charAt(r4)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x01f5
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r23
            r2 = r2 | r4
            int r23 = r23 + 13
            r4 = r25
            r15 = r27
            goto L_0x01dc
        L_0x01f5:
            int r4 = r4 << r23
            r2 = r2 | r4
            r4 = r25
            goto L_0x01ff
        L_0x01fb:
            r27 = r15
            r4 = r23
        L_0x01ff:
            r15 = r2 & 255(0xff, float:3.57E-43)
            r23 = r10
            r10 = r2 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L_0x020d
            int r10 = r17 + 1
            r14[r17] = r20
            r17 = r10
        L_0x020d:
            r10 = 51
            r28 = r9
            if (r15 < r10) goto L_0x02a8
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r9) goto L_0x023c
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r29 = 13
        L_0x0222:
            int r30 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r9) goto L_0x0237
            r9 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r29
            r4 = r4 | r9
            int r29 = r29 + 13
            r10 = r30
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0222
        L_0x0237:
            int r9 = r10 << r29
            r4 = r4 | r9
            r10 = r30
        L_0x023c:
            int r9 = r15 + -51
            r29 = r10
            r10 = 9
            if (r9 == r10) goto L_0x025d
            r10 = 17
            if (r9 != r10) goto L_0x0249
            goto L_0x025d
        L_0x0249:
            r10 = 12
            if (r9 != r10) goto L_0x025b
            if (r11 != 0) goto L_0x025b
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r10 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r10
        L_0x025b:
            r10 = 1
            goto L_0x026a
        L_0x025d:
            int r9 = r20 / 3
            r10 = 1
            int r9 = r9 << r10
            int r9 = r9 + r10
            int r24 = r13 + 1
            r13 = r16[r13]
            r12[r9] = r13
            r13 = r24
        L_0x026a:
            int r4 = r4 << r10
            r9 = r16[r4]
            boolean r10 = r9 instanceof java.lang.reflect.Field
            if (r10 == 0) goto L_0x0274
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x027c
        L_0x0274:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = t(r6, r9)
            r16[r4] = r9
        L_0x027c:
            long r9 = r8.objectFieldOffset(r9)
            int r9 = (int) r9
            int r4 = r4 + 1
            r10 = r16[r4]
            r25 = r9
            boolean r9 = r10 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x028e
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x0296
        L_0x028e:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = t(r6, r10)
            r16[r4] = r10
        L_0x0296:
            long r9 = r8.objectFieldOffset(r10)
            int r4 = (int) r9
            r18 = r13
            r9 = r25
            r25 = r29
            r29 = r0
            r13 = r1
            r0 = r4
            r4 = 0
            goto L_0x03a2
        L_0x02a8:
            int r9 = r13 + 1
            r10 = r16[r13]
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = t(r6, r10)
            r29 = r0
            r0 = 9
            if (r15 == r0) goto L_0x02bc
            r0 = 17
            if (r15 != r0) goto L_0x02c0
        L_0x02bc:
            r24 = 1
            goto L_0x0323
        L_0x02c0:
            r0 = 27
            if (r15 == r0) goto L_0x02c8
            r0 = 49
            if (r15 != r0) goto L_0x02cb
        L_0x02c8:
            r24 = 1
            goto L_0x0316
        L_0x02cb:
            r0 = 12
            if (r15 == r0) goto L_0x0301
            r0 = 30
            if (r15 == r0) goto L_0x0301
            r0 = 44
            if (r15 != r0) goto L_0x02d8
            goto L_0x0301
        L_0x02d8:
            r0 = 50
            if (r15 != r0) goto L_0x02fa
            int r0 = r21 + 1
            r14[r21] = r20
            int r21 = r20 / 3
            r24 = 1
            int r21 = r21 << 1
            int r25 = r13 + 2
            r9 = r16[r9]
            r12[r21] = r9
            r9 = r2 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x02fc
            int r21 = r21 + 1
            int r9 = r13 + 3
            r13 = r16[r25]
            r12[r21] = r13
            r21 = r0
        L_0x02fa:
            r0 = r9
            goto L_0x0330
        L_0x02fc:
            r21 = r0
            r0 = r25
            goto L_0x0330
        L_0x0301:
            if (r11 != 0) goto L_0x0313
            int r0 = r20 / 3
            r24 = 1
            int r0 = r0 << 1
            int r0 = r0 + 1
            int r13 = r13 + 2
            r9 = r16[r9]
            r12[r0] = r9
        L_0x0311:
            r0 = r13
            goto L_0x0330
        L_0x0313:
            r24 = 1
            goto L_0x02fa
        L_0x0316:
            int r0 = r20 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            int r13 = r13 + 2
            r9 = r16[r9]
            r12[r0] = r9
            goto L_0x0311
        L_0x0323:
            int r0 = r20 / 3
            int r0 = r0 << 1
            int r0 = r0 + 1
            java.lang.Class r13 = r10.getType()
            r12[r0] = r13
            goto L_0x02fa
        L_0x0330:
            long r9 = r8.objectFieldOffset(r10)
            int r9 = (int) r9
            r10 = r2 & 4096(0x1000, float:5.74E-42)
            r13 = 4096(0x1000, float:5.74E-42)
            if (r10 != r13) goto L_0x038b
            r10 = 17
            if (r15 > r10) goto L_0x038b
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r13) goto L_0x0365
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x034e:
            int r25 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r13) goto L_0x0360
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r18
            r4 = r4 | r10
            int r18 = r18 + 13
            r10 = r25
            goto L_0x034e
        L_0x0360:
            int r10 = r10 << r18
            r4 = r4 | r10
        L_0x0363:
            r10 = 1
            goto L_0x0368
        L_0x0365:
            r25 = r10
            goto L_0x0363
        L_0x0368:
            int r18 = r3 << 1
            int r24 = r4 / 32
            int r18 = r18 + r24
            r10 = r16[r18]
            boolean r13 = r10 instanceof java.lang.reflect.Field
            if (r13 == 0) goto L_0x037a
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
        L_0x0376:
            r18 = r0
            r13 = r1
            goto L_0x0383
        L_0x037a:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = t(r6, r10)
            r16[r18] = r10
            goto L_0x0376
        L_0x0383:
            long r0 = r8.objectFieldOffset(r10)
            int r0 = (int) r0
            int r4 = r4 % 32
            goto L_0x0394
        L_0x038b:
            r18 = r0
            r13 = r1
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r25 = r4
            r4 = 0
        L_0x0394:
            r1 = 18
            if (r15 < r1) goto L_0x03a2
            r1 = 49
            if (r15 > r1) goto L_0x03a2
            int r1 = r22 + 1
            r14[r22] = r9
            r22 = r1
        L_0x03a2:
            int r1 = r20 + 1
            r5[r20] = r7
            int r7 = r20 + 2
            r10 = r2 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x03af
            r10 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b0
        L_0x03af:
            r10 = 0
        L_0x03b0:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03b7
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03b8
        L_0x03b7:
            r2 = 0
        L_0x03b8:
            r2 = r2 | r10
            int r10 = r15 << 20
            r2 = r2 | r10
            r2 = r2 | r9
            r5[r1] = r2
            int r20 = r20 + 3
            int r1 = r4 << 20
            r0 = r0 | r1
            r5[r7] = r0
            r1 = r13
            r13 = r18
            r10 = r23
            r7 = r25
            r2 = r26
            r15 = r27
            r9 = r28
            r0 = r29
            r4 = 1
            goto L_0x0193
        L_0x03d8:
            r29 = r0
            r28 = r9
            r23 = r10
            r27 = r15
            com.google.android.gms.internal.vision.x1 r0 = new com.google.android.gms.internal.vision.x1
            com.google.android.gms.internal.vision.t1 r10 = r29.b()
            r1 = 0
            r2 = r5
            r5 = r0
            r6 = r2
            r7 = r12
            r8 = r28
            r9 = r23
            r12 = r1
            r13 = r14
            r14 = r27
            r15 = r19
            r16 = r33
            r17 = r34
            r18 = r35
            r19 = r36
            r20 = r37
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        L_0x0403:
            android.support.v4.media.session.b.a(r32)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0558x1.p(java.lang.Class, com.google.android.gms.internal.vision.r1, com.google.android.gms.internal.vision.A1, com.google.android.gms.internal.vision.c1, com.google.android.gms.internal.vision.a2, com.google.android.gms.internal.vision.C0, com.google.android.gms.internal.vision.q1):com.google.android.gms.internal.vision.x1");
    }

    public static Field t(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    public static List u(Object obj, long j4) {
        return (List) h2.F(obj, j4);
    }

    public static void v(int i4, Object obj, y2 y2Var) {
        if (obj instanceof String) {
            y2Var.w(i4, (String) obj);
        } else {
            y2Var.G(i4, (C0507g0) obj);
        }
    }

    public static void w(C0486a2 a2Var, Object obj, y2 y2Var) {
        a2Var.d(a2Var.f(obj), y2Var);
    }

    public final boolean A(Object obj, int i4, int i5) {
        return h2.b(obj, (long) (P(i5) & 1048575)) == i4;
    }

    public final boolean B(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? z(obj, i4) : (i6 & i7) != 0;
    }

    public final int E(int i4, int i5) {
        int length = (this.f7589a.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = this.f7589a[i7];
            if (i4 == i8) {
                return i7;
            }
            if (i4 < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    public final Object F(int i4) {
        return this.f7590b[(i4 / 3) << 1];
    }

    public final void G(Object obj, int i4) {
        int P4 = P(i4);
        long j4 = (long) (1048575 & P4);
        if (j4 != 1048575) {
            h2.h(obj, j4, (1 << (P4 >>> 20)) | h2.b(obj, j4));
        }
    }

    public final void H(Object obj, int i4, int i5) {
        h2.h(obj, (long) (P(i5) & 1048575), i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0487, code lost:
        r10 = r10 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x029e, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void I(java.lang.Object r18, com.google.android.gms.internal.vision.y2 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f7594f
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.vision.C0 r3 = r0.f7604p
            com.google.android.gms.internal.vision.F0 r3 = r3.b(r1)
            com.google.android.gms.internal.vision.O1 r5 = r3.f7218a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.j()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            int[] r6 = r0.f7589a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f7588s
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002f:
            if (r10 >= r6) goto L_0x048b
            int r13 = r0.N(r10)
            int[] r14 = r0.f7589a
            r15 = r14[r10]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r16
            int r4 = r16 >>> 20
            r9 = 17
            if (r4 > r9) goto L_0x005a
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0054
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0054:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x005b
        L_0x005a:
            r8 = 0
        L_0x005b:
            if (r5 == 0) goto L_0x0079
            com.google.android.gms.internal.vision.C0 r9 = r0.f7604p
            int r9 = r9.a(r5)
            if (r9 > r15) goto L_0x0079
            com.google.android.gms.internal.vision.C0 r9 = r0.f7604p
            r9.c(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0077
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005b
        L_0x0077:
            r5 = 0
            goto L_0x005b
        L_0x0079:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            switch(r4) {
                case 0: goto L_0x047c;
                case 1: goto L_0x0470;
                case 2: goto L_0x0464;
                case 3: goto L_0x0458;
                case 4: goto L_0x044c;
                case 5: goto L_0x0440;
                case 6: goto L_0x0434;
                case 7: goto L_0x0428;
                case 8: goto L_0x041c;
                case 9: goto L_0x040b;
                case 10: goto L_0x03fc;
                case 11: goto L_0x03ef;
                case 12: goto L_0x03e2;
                case 13: goto L_0x03d5;
                case 14: goto L_0x03c8;
                case 15: goto L_0x03bb;
                case 16: goto L_0x03ae;
                case 17: goto L_0x039d;
                case 18: goto L_0x038d;
                case 19: goto L_0x037d;
                case 20: goto L_0x036d;
                case 21: goto L_0x035d;
                case 22: goto L_0x034d;
                case 23: goto L_0x033d;
                case 24: goto L_0x032d;
                case 25: goto L_0x031d;
                case 26: goto L_0x030e;
                case 27: goto L_0x02fb;
                case 28: goto L_0x02ec;
                case 29: goto L_0x02dd;
                case 30: goto L_0x02ce;
                case 31: goto L_0x02bf;
                case 32: goto L_0x02b0;
                case 33: goto L_0x02a1;
                case 34: goto L_0x0290;
                case 35: goto L_0x0280;
                case 36: goto L_0x0270;
                case 37: goto L_0x0260;
                case 38: goto L_0x0250;
                case 39: goto L_0x0240;
                case 40: goto L_0x0230;
                case 41: goto L_0x0220;
                case 42: goto L_0x0210;
                case 43: goto L_0x0200;
                case 44: goto L_0x01f0;
                case 45: goto L_0x01e0;
                case 46: goto L_0x01d0;
                case 47: goto L_0x01c0;
                case 48: goto L_0x01b0;
                case 49: goto L_0x019d;
                case 50: goto L_0x0194;
                case 51: goto L_0x0185;
                case 52: goto L_0x0176;
                case 53: goto L_0x0167;
                case 54: goto L_0x0158;
                case 55: goto L_0x0149;
                case 56: goto L_0x013a;
                case 57: goto L_0x012b;
                case 58: goto L_0x011c;
                case 59: goto L_0x010d;
                case 60: goto L_0x00fa;
                case 61: goto L_0x00ea;
                case 62: goto L_0x00dc;
                case 63: goto L_0x00ce;
                case 64: goto L_0x00c0;
                case 65: goto L_0x00b2;
                case 66: goto L_0x00a4;
                case 67: goto L_0x0096;
                case 68: goto L_0x0084;
                default: goto L_0x0081;
            }
        L_0x0081:
            r4 = 0
            goto L_0x0487
        L_0x0084:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.K1 r8 = r0.q(r10)
            r2.N(r15, r4, r8)
            goto L_0x0081
        L_0x0096:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = Q(r1, r13)
            r2.M(r15, r13)
            goto L_0x0081
        L_0x00a4:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = O(r1, r13)
            r2.e(r15, r4)
            goto L_0x0081
        L_0x00b2:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = Q(r1, r13)
            r2.h(r15, r13)
            goto L_0x0081
        L_0x00c0:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = O(r1, r13)
            r2.B(r15, r4)
            goto L_0x0081
        L_0x00ce:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = O(r1, r13)
            r2.H(r15, r4)
            goto L_0x0081
        L_0x00dc:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = O(r1, r13)
            r2.y(r15, r4)
            goto L_0x0081
        L_0x00ea:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.g0 r4 = (com.google.android.gms.internal.vision.C0507g0) r4
            r2.G(r15, r4)
            goto L_0x0081
        L_0x00fa:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.K1 r8 = r0.q(r10)
            r2.K(r15, r4, r8)
            goto L_0x0081
        L_0x010d:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            v(r15, r4, r2)
            goto L_0x0081
        L_0x011c:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            boolean r4 = S(r1, r13)
            r2.F(r15, r4)
            goto L_0x0081
        L_0x012b:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = O(r1, r13)
            r2.s(r15, r4)
            goto L_0x0081
        L_0x013a:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = Q(r1, r13)
            r2.L(r15, r13)
            goto L_0x0081
        L_0x0149:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = O(r1, r13)
            r2.m(r15, r4)
            goto L_0x0081
        L_0x0158:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = Q(r1, r13)
            r2.n(r15, r13)
            goto L_0x0081
        L_0x0167:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = Q(r1, r13)
            r2.C(r15, r13)
            goto L_0x0081
        L_0x0176:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            float r4 = K(r1, r13)
            r2.E(r15, r4)
            goto L_0x0081
        L_0x0185:
            boolean r4 = r0.A(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            double r13 = D(r1, r13)
            r2.D(r15, r13)
            goto L_0x0081
        L_0x0194:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.x(r2, r15, r4, r10)
            goto L_0x0081
        L_0x019d:
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.K1 r13 = r0.q(r10)
            com.google.android.gms.internal.vision.L1.x(r4, r8, r2, r13)
            goto L_0x0081
        L_0x01b0:
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            com.google.android.gms.internal.vision.L1.K(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01c0:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.Z(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01d0:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.Q(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01e0:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.b0(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01f0:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.c0(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0200:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.W(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0210:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.d0(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0220:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.a0(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0230:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.N(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0240:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.T(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0250:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.G(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0260:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.C(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0270:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.y(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0280:
            r15 = 1
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.l(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0290:
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.vision.L1.K(r4, r8, r2, r15)
        L_0x029e:
            r4 = r15
            goto L_0x0487
        L_0x02a1:
            r15 = 0
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.Z(r4, r8, r2, r15)
            goto L_0x029e
        L_0x02b0:
            r15 = 0
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.Q(r4, r8, r2, r15)
            goto L_0x029e
        L_0x02bf:
            r15 = 0
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.b0(r4, r8, r2, r15)
            goto L_0x029e
        L_0x02ce:
            r15 = 0
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.c0(r4, r8, r2, r15)
            goto L_0x029e
        L_0x02dd:
            r15 = 0
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.W(r4, r8, r2, r15)
            goto L_0x029e
        L_0x02ec:
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.w(r4, r8, r2)
            goto L_0x0081
        L_0x02fb:
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.K1 r13 = r0.q(r10)
            com.google.android.gms.internal.vision.L1.k(r4, r8, r2, r13)
            goto L_0x0081
        L_0x030e:
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.j(r4, r8, r2)
            goto L_0x0081
        L_0x031d:
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.vision.L1.d0(r4, r8, r2, r15)
            goto L_0x029e
        L_0x032d:
            r15 = 0
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.a0(r4, r8, r2, r15)
            goto L_0x029e
        L_0x033d:
            r15 = 0
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.N(r4, r8, r2, r15)
            goto L_0x029e
        L_0x034d:
            r15 = 0
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.T(r4, r8, r2, r15)
            goto L_0x029e
        L_0x035d:
            r15 = 0
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.G(r4, r8, r2, r15)
            goto L_0x029e
        L_0x036d:
            r15 = 0
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.C(r4, r8, r2, r15)
            goto L_0x029e
        L_0x037d:
            r15 = 0
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.y(r4, r8, r2, r15)
            goto L_0x029e
        L_0x038d:
            r15 = 0
            int[] r4 = r0.f7589a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.l(r4, r8, r2, r15)
            goto L_0x029e
        L_0x039d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.K1 r13 = r0.q(r10)
            r2.N(r15, r8, r13)
            goto L_0x0487
        L_0x03ae:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            long r13 = r7.getLong(r1, r13)
            r2.M(r15, r13)
            goto L_0x0487
        L_0x03bb:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            int r8 = r7.getInt(r1, r13)
            r2.e(r15, r8)
            goto L_0x0487
        L_0x03c8:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            long r13 = r7.getLong(r1, r13)
            r2.h(r15, r13)
            goto L_0x0487
        L_0x03d5:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            int r8 = r7.getInt(r1, r13)
            r2.B(r15, r8)
            goto L_0x0487
        L_0x03e2:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            int r8 = r7.getInt(r1, r13)
            r2.H(r15, r8)
            goto L_0x0487
        L_0x03ef:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            int r8 = r7.getInt(r1, r13)
            r2.y(r15, r8)
            goto L_0x0487
        L_0x03fc:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.g0 r8 = (com.google.android.gms.internal.vision.C0507g0) r8
            r2.G(r15, r8)
            goto L_0x0487
        L_0x040b:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.K1 r13 = r0.q(r10)
            r2.K(r15, r8, r13)
            goto L_0x0487
        L_0x041c:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            java.lang.Object r8 = r7.getObject(r1, r13)
            v(r15, r8, r2)
            goto L_0x0487
        L_0x0428:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            boolean r8 = com.google.android.gms.internal.vision.h2.w(r1, r13)
            r2.F(r15, r8)
            goto L_0x0487
        L_0x0434:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            int r8 = r7.getInt(r1, r13)
            r2.s(r15, r8)
            goto L_0x0487
        L_0x0440:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            long r13 = r7.getLong(r1, r13)
            r2.L(r15, r13)
            goto L_0x0487
        L_0x044c:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            int r8 = r7.getInt(r1, r13)
            r2.m(r15, r8)
            goto L_0x0487
        L_0x0458:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            long r13 = r7.getLong(r1, r13)
            r2.n(r15, r13)
            goto L_0x0487
        L_0x0464:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            long r13 = r7.getLong(r1, r13)
            r2.C(r15, r13)
            goto L_0x0487
        L_0x0470:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            float r8 = com.google.android.gms.internal.vision.h2.x(r1, r13)
            r2.E(r15, r8)
            goto L_0x0487
        L_0x047c:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            double r13 = com.google.android.gms.internal.vision.h2.C(r1, r13)
            r2.D(r15, r13)
        L_0x0487:
            int r10 = r10 + 3
            goto L_0x002f
        L_0x048b:
            if (r5 == 0) goto L_0x04a2
            com.google.android.gms.internal.vision.C0 r4 = r0.f7604p
            r4.c(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a0
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048b
        L_0x04a0:
            r5 = 0
            goto L_0x048b
        L_0x04a2:
            com.google.android.gms.internal.vision.a2 r3 = r0.f7603o
            w(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0558x1.I(java.lang.Object, com.google.android.gms.internal.vision.y2):void");
    }

    public final void J(Object obj, Object obj2, int i4) {
        int N4 = N(i4);
        int i5 = this.f7589a[i4];
        long j4 = (long) (N4 & 1048575);
        if (A(obj2, i5, i4)) {
            Object F4 = A(obj, i5, i4) ? h2.F(obj, j4) : null;
            Object F5 = h2.F(obj2, j4);
            if (F4 != null && F5 != null) {
                h2.j(obj, j4, R0.e(F4, F5));
                H(obj, i5, i4);
            } else if (F5 != null) {
                h2.j(obj, j4, F5);
                H(obj, i5, i4);
            }
        }
    }

    public final S0 L(int i4) {
        return (S0) this.f7590b[((i4 / 3) << 1) + 1];
    }

    public final boolean M(Object obj, Object obj2, int i4) {
        return z(obj, i4) == z(obj2, i4);
    }

    public final int N(int i4) {
        return this.f7589a[i4 + 1];
    }

    public final int P(int i4) {
        return this.f7589a[i4 + 2];
    }

    public final int T(int i4) {
        if (i4 < this.f7591c || i4 > this.f7592d) {
            return -1;
        }
        return E(i4, 0);
    }

    public final Object a() {
        return this.f7601m.b(this.f7593e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016d, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x022b, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f7589a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022f
            int r3 = r8.N(r1)
            int[] r4 = r8.f7589a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x021b;
                case 1: goto L_0x020f;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e3;
                case 6: goto L_0x01db;
                case 7: goto L_0x01cf;
                case 8: goto L_0x01c1;
                case 9: goto L_0x01b6;
                case 10: goto L_0x01aa;
                case 11: goto L_0x01a2;
                case 12: goto L_0x019a;
                case 13: goto L_0x0192;
                case 14: goto L_0x0186;
                case 15: goto L_0x017e;
                case 16: goto L_0x0172;
                case 17: goto L_0x0163;
                case 18: goto L_0x0157;
                case 19: goto L_0x0157;
                case 20: goto L_0x0157;
                case 21: goto L_0x0157;
                case 22: goto L_0x0157;
                case 23: goto L_0x0157;
                case 24: goto L_0x0157;
                case 25: goto L_0x0157;
                case 26: goto L_0x0157;
                case 27: goto L_0x0157;
                case 28: goto L_0x0157;
                case 29: goto L_0x0157;
                case 30: goto L_0x0157;
                case 31: goto L_0x0157;
                case 32: goto L_0x0157;
                case 33: goto L_0x0157;
                case 34: goto L_0x0157;
                case 35: goto L_0x0157;
                case 36: goto L_0x0157;
                case 37: goto L_0x0157;
                case 38: goto L_0x0157;
                case 39: goto L_0x0157;
                case 40: goto L_0x0157;
                case 41: goto L_0x0157;
                case 42: goto L_0x0157;
                case 43: goto L_0x0157;
                case 44: goto L_0x0157;
                case 45: goto L_0x0157;
                case 46: goto L_0x0157;
                case 47: goto L_0x0157;
                case 48: goto L_0x0157;
                case 49: goto L_0x0157;
                case 50: goto L_0x014b;
                case 51: goto L_0x0135;
                case 52: goto L_0x0123;
                case 53: goto L_0x0111;
                case 54: goto L_0x00ff;
                case 55: goto L_0x00f1;
                case 56: goto L_0x00df;
                case 57: goto L_0x00d1;
                case 58: goto L_0x00bf;
                case 59: goto L_0x00ab;
                case 60: goto L_0x009a;
                case 61: goto L_0x0089;
                case 62: goto L_0x007c;
                case 63: goto L_0x006f;
                case 64: goto L_0x0062;
                case 65: goto L_0x0051;
                case 66: goto L_0x0044;
                case 67: goto L_0x0033;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x022b
        L_0x0020:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            java.lang.Object r3 = com.google.android.gms.internal.vision.h2.F(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L_0x0030:
            int r2 = r2 + r3
            goto L_0x022b
        L_0x0033:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = Q(r9, r5)
            int r3 = com.google.android.gms.internal.vision.R0.b(r3)
            goto L_0x0030
        L_0x0044:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0030
        L_0x0051:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = Q(r9, r5)
            int r3 = com.google.android.gms.internal.vision.R0.b(r3)
            goto L_0x0030
        L_0x0062:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0030
        L_0x006f:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0030
        L_0x007c:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0030
        L_0x0089:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.h2.F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x009a:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            java.lang.Object r3 = com.google.android.gms.internal.vision.h2.F(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x00ab:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.h2.F(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x00bf:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            boolean r3 = S(r9, r5)
            int r3 = com.google.android.gms.internal.vision.R0.c(r3)
            goto L_0x0030
        L_0x00d1:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0030
        L_0x00df:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = Q(r9, r5)
            int r3 = com.google.android.gms.internal.vision.R0.b(r3)
            goto L_0x0030
        L_0x00f1:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = O(r9, r5)
            goto L_0x0030
        L_0x00ff:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = Q(r9, r5)
            int r3 = com.google.android.gms.internal.vision.R0.b(r3)
            goto L_0x0030
        L_0x0111:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = Q(r9, r5)
            int r3 = com.google.android.gms.internal.vision.R0.b(r3)
            goto L_0x0030
        L_0x0123:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            float r3 = K(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0030
        L_0x0135:
            boolean r3 = r8.A(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            double r3 = D(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.vision.R0.b(r3)
            goto L_0x0030
        L_0x014b:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.h2.F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x0157:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.h2.F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x0163:
            java.lang.Object r3 = com.google.android.gms.internal.vision.h2.F(r9, r5)
            if (r3 == 0) goto L_0x016d
            int r7 = r3.hashCode()
        L_0x016d:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x022b
        L_0x0172:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.h2.o(r9, r5)
            int r3 = com.google.android.gms.internal.vision.R0.b(r3)
            goto L_0x0030
        L_0x017e:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.h2.b(r9, r5)
            goto L_0x0030
        L_0x0186:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.h2.o(r9, r5)
            int r3 = com.google.android.gms.internal.vision.R0.b(r3)
            goto L_0x0030
        L_0x0192:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.h2.b(r9, r5)
            goto L_0x0030
        L_0x019a:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.h2.b(r9, r5)
            goto L_0x0030
        L_0x01a2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.h2.b(r9, r5)
            goto L_0x0030
        L_0x01aa:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.h2.F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x01b6:
            java.lang.Object r3 = com.google.android.gms.internal.vision.h2.F(r9, r5)
            if (r3 == 0) goto L_0x016d
            int r7 = r3.hashCode()
            goto L_0x016d
        L_0x01c1:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.h2.F(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x01cf:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.vision.h2.w(r9, r5)
            int r3 = com.google.android.gms.internal.vision.R0.c(r3)
            goto L_0x0030
        L_0x01db:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.h2.b(r9, r5)
            goto L_0x0030
        L_0x01e3:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.h2.o(r9, r5)
            int r3 = com.google.android.gms.internal.vision.R0.b(r3)
            goto L_0x0030
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.h2.b(r9, r5)
            goto L_0x0030
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.h2.o(r9, r5)
            int r3 = com.google.android.gms.internal.vision.R0.b(r3)
            goto L_0x0030
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.h2.o(r9, r5)
            int r3 = com.google.android.gms.internal.vision.R0.b(r3)
            goto L_0x0030
        L_0x020f:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.vision.h2.x(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0030
        L_0x021b:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.vision.h2.C(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.vision.R0.b(r3)
            goto L_0x0030
        L_0x022b:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022f:
            int r2 = r2 * 53
            com.google.android.gms.internal.vision.a2 r0 = r8.f7603o
            java.lang.Object r0 = r0.f(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f7594f
            if (r0 == 0) goto L_0x024d
            int r2 = r2 * 53
            com.google.android.gms.internal.vision.C0 r0 = r8.f7604p
            com.google.android.gms.internal.vision.F0 r9 = r0.b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0558x1.b(java.lang.Object):int");
    }

    public final void c(Object obj) {
        int i4;
        int i5 = this.f7599k;
        while (true) {
            i4 = this.f7600l;
            if (i5 >= i4) {
                break;
            }
            long N4 = (long) (N(this.f7598j[i5]) & 1048575);
            Object F4 = h2.F(obj, N4);
            if (F4 != null) {
                h2.j(obj, N4, this.f7605q.i(F4));
            }
            i5++;
        }
        int length = this.f7598j.length;
        while (i4 < length) {
            this.f7602n.d(obj, (long) this.f7598j[i4]);
            i4++;
        }
        this.f7603o.j(obj);
        if (this.f7594f) {
            this.f7604p.f(obj);
        }
    }

    public final boolean d(Object obj) {
        int i4;
        int i5;
        Object obj2 = obj;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.f7599k) {
            int i9 = this.f7598j[i8];
            int i10 = this.f7589a[i9];
            int N4 = N(i9);
            int i11 = this.f7589a[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = f7588s.getInt(obj2, (long) i12);
                }
                i4 = i7;
                i5 = i12;
            } else {
                i5 = i6;
                i4 = i7;
            }
            if ((268435456 & N4) != 0 && !B(obj, i9, i5, i4, i13)) {
                return false;
            }
            int i14 = (267386880 & N4) >>> 20;
            if (i14 != 9 && i14 != 17) {
                if (i14 != 27) {
                    if (i14 == 60 || i14 == 68) {
                        if (A(obj2, i10, i9) && !C(obj2, N4, q(i9))) {
                            return false;
                        }
                    } else if (i14 != 49) {
                        if (i14 == 50 && !this.f7605q.c(h2.F(obj2, (long) (N4 & 1048575))).isEmpty()) {
                            this.f7605q.g(F(i9));
                            throw null;
                        }
                    }
                }
                List list = (List) h2.F(obj2, (long) (N4 & 1048575));
                if (!list.isEmpty()) {
                    K1 q4 = q(i9);
                    for (int i15 = 0; i15 < list.size(); i15++) {
                        if (!q4.d(list.get(i15))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (B(obj, i9, i5, i4, i13) && !C(obj2, N4, q(i9))) {
                return false;
            }
            i8++;
            i6 = i5;
            i7 = i4;
        }
        return !this.f7594f || this.f7604p.b(obj2).m();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        if (com.google.android.gms.internal.vision.L1.q(com.google.android.gms.internal.vision.h2.F(r10, r6), com.google.android.gms.internal.vision.h2.F(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        if (com.google.android.gms.internal.vision.h2.o(r10, r6) == com.google.android.gms.internal.vision.h2.o(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        if (com.google.android.gms.internal.vision.h2.b(r10, r6) == com.google.android.gms.internal.vision.h2.b(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (com.google.android.gms.internal.vision.h2.o(r10, r6) == com.google.android.gms.internal.vision.h2.o(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b3, code lost:
        if (com.google.android.gms.internal.vision.h2.b(r10, r6) == com.google.android.gms.internal.vision.h2.b(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        if (com.google.android.gms.internal.vision.h2.b(r10, r6) == com.google.android.gms.internal.vision.h2.b(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (com.google.android.gms.internal.vision.h2.b(r10, r6) == com.google.android.gms.internal.vision.h2.b(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        if (com.google.android.gms.internal.vision.L1.q(com.google.android.gms.internal.vision.h2.F(r10, r6), com.google.android.gms.internal.vision.h2.F(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0102, code lost:
        if (com.google.android.gms.internal.vision.L1.q(com.google.android.gms.internal.vision.h2.F(r10, r6), com.google.android.gms.internal.vision.h2.F(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0118, code lost:
        if (com.google.android.gms.internal.vision.L1.q(com.google.android.gms.internal.vision.h2.F(r10, r6), com.google.android.gms.internal.vision.h2.F(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012a, code lost:
        if (com.google.android.gms.internal.vision.h2.w(r10, r6) == com.google.android.gms.internal.vision.h2.w(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013c, code lost:
        if (com.google.android.gms.internal.vision.h2.b(r10, r6) == com.google.android.gms.internal.vision.h2.b(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0150, code lost:
        if (com.google.android.gms.internal.vision.h2.o(r10, r6) == com.google.android.gms.internal.vision.h2.o(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0162, code lost:
        if (com.google.android.gms.internal.vision.h2.b(r10, r6) == com.google.android.gms.internal.vision.h2.b(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0176, code lost:
        if (com.google.android.gms.internal.vision.h2.o(r10, r6) == com.google.android.gms.internal.vision.h2.o(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018a, code lost:
        if (com.google.android.gms.internal.vision.h2.o(r10, r6) == com.google.android.gms.internal.vision.h2.o(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.h2.x(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.h2.x(r11, r6))) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c0, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.h2.C(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.h2.C(r11, r6))) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.vision.L1.q(com.google.android.gms.internal.vision.h2.F(r10, r6), com.google.android.gms.internal.vision.h2.F(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            int[] r0 = r9.f7589a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01cb
            int r4 = r9.N(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a8;
                case 1: goto L_0x018e;
                case 2: goto L_0x017a;
                case 3: goto L_0x0166;
                case 4: goto L_0x0154;
                case 5: goto L_0x0140;
                case 6: goto L_0x012e;
                case 7: goto L_0x011c;
                case 8: goto L_0x0106;
                case 9: goto L_0x00f0;
                case 10: goto L_0x00da;
                case 11: goto L_0x00c8;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00a5;
                case 14: goto L_0x0092;
                case 15: goto L_0x0081;
                case 16: goto L_0x006e;
                case 17: goto L_0x0059;
                case 18: goto L_0x004b;
                case 19: goto L_0x004b;
                case 20: goto L_0x004b;
                case 21: goto L_0x004b;
                case 22: goto L_0x004b;
                case 23: goto L_0x004b;
                case 24: goto L_0x004b;
                case 25: goto L_0x004b;
                case 26: goto L_0x004b;
                case 27: goto L_0x004b;
                case 28: goto L_0x004b;
                case 29: goto L_0x004b;
                case 30: goto L_0x004b;
                case 31: goto L_0x004b;
                case 32: goto L_0x004b;
                case 33: goto L_0x004b;
                case 34: goto L_0x004b;
                case 35: goto L_0x004b;
                case 36: goto L_0x004b;
                case 37: goto L_0x004b;
                case 38: goto L_0x004b;
                case 39: goto L_0x004b;
                case 40: goto L_0x004b;
                case 41: goto L_0x004b;
                case 42: goto L_0x004b;
                case 43: goto L_0x004b;
                case 44: goto L_0x004b;
                case 45: goto L_0x004b;
                case 46: goto L_0x004b;
                case 47: goto L_0x004b;
                case 48: goto L_0x004b;
                case 49: goto L_0x004b;
                case 50: goto L_0x003d;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c4
        L_0x001c:
            int r4 = r9.P(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.vision.h2.b(r10, r4)
            int r4 = com.google.android.gms.internal.vision.h2.b(r11, r4)
            if (r8 != r4) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.h2.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.L1.q(r4, r5)
            if (r4 != 0) goto L_0x01c4
        L_0x003a:
            r3 = r1
            goto L_0x01c4
        L_0x003d:
            java.lang.Object r3 = com.google.android.gms.internal.vision.h2.F(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r11, r6)
            boolean r3 = com.google.android.gms.internal.vision.L1.q(r3, r4)
            goto L_0x01c4
        L_0x004b:
            java.lang.Object r3 = com.google.android.gms.internal.vision.h2.F(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r11, r6)
            boolean r3 = com.google.android.gms.internal.vision.L1.q(r3, r4)
            goto L_0x01c4
        L_0x0059:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.h2.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.L1.q(r4, r5)
            if (r4 != 0) goto L_0x01c4
            goto L_0x003a
        L_0x006e:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.vision.h2.o(r10, r6)
            long r6 = com.google.android.gms.internal.vision.h2.o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x0081:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.vision.h2.b(r10, r6)
            int r5 = com.google.android.gms.internal.vision.h2.b(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x0092:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.vision.h2.o(r10, r6)
            long r6 = com.google.android.gms.internal.vision.h2.o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x00a5:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.vision.h2.b(r10, r6)
            int r5 = com.google.android.gms.internal.vision.h2.b(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x00b6:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.vision.h2.b(r10, r6)
            int r5 = com.google.android.gms.internal.vision.h2.b(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x00c8:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.vision.h2.b(r10, r6)
            int r5 = com.google.android.gms.internal.vision.h2.b(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x00da:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.h2.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.L1.q(r4, r5)
            if (r4 != 0) goto L_0x01c4
            goto L_0x003a
        L_0x00f0:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.h2.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.L1.q(r4, r5)
            if (r4 != 0) goto L_0x01c4
            goto L_0x003a
        L_0x0106:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.h2.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.L1.q(r4, r5)
            if (r4 != 0) goto L_0x01c4
            goto L_0x003a
        L_0x011c:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            boolean r4 = com.google.android.gms.internal.vision.h2.w(r10, r6)
            boolean r5 = com.google.android.gms.internal.vision.h2.w(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x012e:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.vision.h2.b(r10, r6)
            int r5 = com.google.android.gms.internal.vision.h2.b(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x0140:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.vision.h2.o(r10, r6)
            long r6 = com.google.android.gms.internal.vision.h2.o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x0154:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.vision.h2.b(r10, r6)
            int r5 = com.google.android.gms.internal.vision.h2.b(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x0166:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.vision.h2.o(r10, r6)
            long r6 = com.google.android.gms.internal.vision.h2.o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x017a:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.vision.h2.o(r10, r6)
            long r6 = com.google.android.gms.internal.vision.h2.o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x018e:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            float r4 = com.google.android.gms.internal.vision.h2.x(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.vision.h2.x(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x01a8:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            double r4 = com.google.android.gms.internal.vision.h2.C(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.vision.h2.C(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x01c4:
            if (r3 != 0) goto L_0x01c7
            return r1
        L_0x01c7:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01cb:
            com.google.android.gms.internal.vision.a2 r0 = r9.f7603o
            java.lang.Object r0 = r0.f(r10)
            com.google.android.gms.internal.vision.a2 r2 = r9.f7603o
            java.lang.Object r2 = r2.f(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01de
            return r1
        L_0x01de:
            boolean r0 = r9.f7594f
            if (r0 == 0) goto L_0x01f3
            com.google.android.gms.internal.vision.C0 r0 = r9.f7604p
            com.google.android.gms.internal.vision.F0 r10 = r0.b(r10)
            com.google.android.gms.internal.vision.C0 r0 = r9.f7604p
            com.google.android.gms.internal.vision.F0 r11 = r0.b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0558x1.e(java.lang.Object, java.lang.Object):boolean");
    }

    public final void f(Object obj, Object obj2) {
        obj2.getClass();
        for (int i4 = 0; i4 < this.f7589a.length; i4 += 3) {
            int N4 = N(i4);
            long j4 = (long) (1048575 & N4);
            int i5 = this.f7589a[i4];
            switch ((N4 & 267386880) >>> 20) {
                case 0:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.f(obj, j4, h2.C(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case 1:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.g(obj, j4, h2.x(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case 2:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.i(obj, j4, h2.o(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case 3:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.i(obj, j4, h2.o(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case 4:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.h(obj, j4, h2.b(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case 5:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.i(obj, j4, h2.o(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case 6:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.h(obj, j4, h2.b(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case 7:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.k(obj, j4, h2.w(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case 8:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.j(obj, j4, h2.F(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION:
                    y(obj, obj2, i4);
                    break;
                case IBulkCursor.GET_EXTRAS_TRANSACTION:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.j(obj, j4, h2.F(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case IBulkCursor.RESPOND_TRANSACTION:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.h(obj, j4, h2.b(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case IBulkCursor.CLOSE_TRANSACTION:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.h(obj, j4, h2.b(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case 13:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.h(obj, j4, h2.b(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case 14:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.i(obj, j4, h2.o(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case 15:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.h(obj, j4, h2.b(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case SQLiteDatabase.NO_LOCALIZED_COLLATORS:
                    if (!z(obj2, i4)) {
                        break;
                    } else {
                        h2.i(obj, j4, h2.o(obj2, j4));
                        G(obj, i4);
                        break;
                    }
                case 17:
                    y(obj, obj2, i4);
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
                    this.f7602n.b(obj, obj2, j4);
                    break;
                case 50:
                    L1.n(this.f7605q, obj, obj2, j4);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!A(obj2, i5, i4)) {
                        break;
                    } else {
                        h2.j(obj, j4, h2.F(obj2, j4));
                        H(obj, i5, i4);
                        break;
                    }
                case 60:
                    J(obj, obj2, i4);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!A(obj2, i5, i4)) {
                        break;
                    } else {
                        h2.j(obj, j4, h2.F(obj2, j4));
                        H(obj, i5, i4);
                        break;
                    }
                case 68:
                    J(obj, obj2, i4);
                    break;
            }
        }
        L1.o(this.f7603o, obj, obj2);
        if (this.f7594f) {
            L1.m(this.f7604p, obj, obj2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04d5, code lost:
        r8 = false;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04d9, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0513, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x061b, code lost:
        r8 = (r8 + r9) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0743, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0744, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x08da, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x08db, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0932, code lost:
        r3 = r3 + 3;
        r6 = r8;
        r11 = r10;
        r9 = r13;
        r7 = 1048575;
        r8 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r0.f7596h
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x0488
            sun.misc.Unsafe r2 = f7588s
            r12 = r11
            r13 = r12
        L_0x0016:
            int[] r14 = r0.f7589a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0480
            int r14 = r0.N(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f7589a
            r3 = r3[r12]
            r14 = r14 & r7
            long r4 = (long) r14
            com.google.android.gms.internal.vision.G0 r14 = com.google.android.gms.internal.vision.G0.DOUBLE_LIST_PACKED
            int r14 = r14.a()
            if (r15 < r14) goto L_0x003f
            com.google.android.gms.internal.vision.G0 r14 = com.google.android.gms.internal.vision.G0.SINT64_LIST_PACKED
            int r14 = r14.a()
            if (r15 > r14) goto L_0x003f
            int[] r14 = r0.f7589a
            int r17 = r12 + 2
            r14 = r14[r17]
        L_0x003f:
            switch(r15) {
                case 0: goto L_0x046c;
                case 1: goto L_0x0460;
                case 2: goto L_0x0450;
                case 3: goto L_0x0440;
                case 4: goto L_0x0430;
                case 5: goto L_0x0424;
                case 6: goto L_0x0418;
                case 7: goto L_0x040c;
                case 8: goto L_0x03ee;
                case 9: goto L_0x03da;
                case 10: goto L_0x03c8;
                case 11: goto L_0x03b8;
                case 12: goto L_0x03a8;
                case 13: goto L_0x039c;
                case 14: goto L_0x0390;
                case 15: goto L_0x0380;
                case 16: goto L_0x0370;
                case 17: goto L_0x035a;
                case 18: goto L_0x0350;
                case 19: goto L_0x0346;
                case 20: goto L_0x033c;
                case 21: goto L_0x0332;
                case 22: goto L_0x0328;
                case 23: goto L_0x031e;
                case 24: goto L_0x0314;
                case 25: goto L_0x030a;
                case 26: goto L_0x0300;
                case 27: goto L_0x02f2;
                case 28: goto L_0x02e8;
                case 29: goto L_0x02de;
                case 30: goto L_0x02d4;
                case 31: goto L_0x02ca;
                case 32: goto L_0x02c0;
                case 33: goto L_0x02b6;
                case 34: goto L_0x02ac;
                case 35: goto L_0x0296;
                case 36: goto L_0x0280;
                case 37: goto L_0x026a;
                case 38: goto L_0x0254;
                case 39: goto L_0x023e;
                case 40: goto L_0x0228;
                case 41: goto L_0x0212;
                case 42: goto L_0x01fc;
                case 43: goto L_0x01e7;
                case 44: goto L_0x01d2;
                case 45: goto L_0x01bd;
                case 46: goto L_0x01a8;
                case 47: goto L_0x0193;
                case 48: goto L_0x017b;
                case 49: goto L_0x016d;
                case 50: goto L_0x015d;
                case 51: goto L_0x014f;
                case 52: goto L_0x0143;
                case 53: goto L_0x0133;
                case 54: goto L_0x0123;
                case 55: goto L_0x0113;
                case 56: goto L_0x0107;
                case 57: goto L_0x00fb;
                case 58: goto L_0x00ef;
                case 59: goto L_0x00d1;
                case 60: goto L_0x00be;
                case 61: goto L_0x00ad;
                case 62: goto L_0x009e;
                case 63: goto L_0x008f;
                case 64: goto L_0x0084;
                case 65: goto L_0x0079;
                case 66: goto L_0x006a;
                case 67: goto L_0x005b;
                case 68: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x047a
        L_0x0044:
            boolean r14 = r0.A(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r1, r4)
            com.google.android.gms.internal.vision.t1 r4 = (com.google.android.gms.internal.vision.C0546t1) r4
            com.google.android.gms.internal.vision.K1 r5 = r0.q(r12)
            int r3 = com.google.android.gms.internal.vision.C0551v0.Q(r3, r4, r5)
        L_0x0058:
            int r13 = r13 + r3
            goto L_0x047a
        L_0x005b:
            boolean r14 = r0.A(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            long r4 = Q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.i0(r3, r4)
            goto L_0x0058
        L_0x006a:
            boolean r14 = r0.A(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = O(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.p0(r3, r4)
            goto L_0x0058
        L_0x0079:
            boolean r4 = r0.A(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.q0(r3, r9)
            goto L_0x0058
        L_0x0084:
            boolean r4 = r0.A(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.w0(r3, r11)
            goto L_0x0058
        L_0x008f:
            boolean r14 = r0.A(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = O(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.y0(r3, r4)
            goto L_0x0058
        L_0x009e:
            boolean r14 = r0.A(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = O(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.l0(r3, r4)
            goto L_0x0058
        L_0x00ad:
            boolean r14 = r0.A(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r1, r4)
            com.google.android.gms.internal.vision.g0 r4 = (com.google.android.gms.internal.vision.C0507g0) r4
            int r3 = com.google.android.gms.internal.vision.C0551v0.P(r3, r4)
            goto L_0x0058
        L_0x00be:
            boolean r14 = r0.A(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r1, r4)
            com.google.android.gms.internal.vision.K1 r5 = r0.q(r12)
            int r3 = com.google.android.gms.internal.vision.L1.a(r3, r4, r5)
            goto L_0x0058
        L_0x00d1:
            boolean r14 = r0.A(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r1, r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.vision.C0507g0
            if (r5 == 0) goto L_0x00e7
            com.google.android.gms.internal.vision.g0 r4 = (com.google.android.gms.internal.vision.C0507g0) r4
            int r3 = com.google.android.gms.internal.vision.C0551v0.P(r3, r4)
            goto L_0x0058
        L_0x00e7:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.google.android.gms.internal.vision.C0551v0.C(r3, r4)
            goto L_0x0058
        L_0x00ef:
            boolean r4 = r0.A(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.D(r3, r8)
            goto L_0x0058
        L_0x00fb:
            boolean r4 = r0.A(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.t0(r3, r11)
            goto L_0x0058
        L_0x0107:
            boolean r4 = r0.A(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.m0(r3, r9)
            goto L_0x0058
        L_0x0113:
            boolean r14 = r0.A(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = O(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.h0(r3, r4)
            goto L_0x0058
        L_0x0123:
            boolean r14 = r0.A(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            long r4 = Q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.d0(r3, r4)
            goto L_0x0058
        L_0x0133:
            boolean r14 = r0.A(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            long r4 = Q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.X(r3, r4)
            goto L_0x0058
        L_0x0143:
            boolean r4 = r0.A(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.A(r3, r6)
            goto L_0x0058
        L_0x014f:
            boolean r4 = r0.A(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            r4 = 0
            int r3 = com.google.android.gms.internal.vision.C0551v0.z(r3, r4)
            goto L_0x0058
        L_0x015d:
            com.google.android.gms.internal.vision.q1 r14 = r0.f7605q
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r1, r4)
            java.lang.Object r5 = r0.F(r12)
            int r3 = r14.j(r3, r4, r5)
            goto L_0x0058
        L_0x016d:
            java.util.List r4 = u(r1, r4)
            com.google.android.gms.internal.vision.K1 r5 = r0.q(r12)
            int r3 = com.google.android.gms.internal.vision.L1.s(r3, r4, r5)
            goto L_0x0058
        L_0x017b:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.A(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
        L_0x018f:
            int r3 = r3 + r5
            int r3 = r3 + r4
            goto L_0x0058
        L_0x0193:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.P(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x01a8:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.V(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x01bd:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.S(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x01d2:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.E(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x01e7:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.M(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x01fc:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.Y(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x0212:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.S(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x0228:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.V(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x023e:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.I(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x0254:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.u(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x026a:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.e(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x0280:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.S(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x0296:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.L1.V(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.c0(r3)
            int r5 = com.google.android.gms.internal.vision.C0551v0.k0(r4)
            goto L_0x018f
        L_0x02ac:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.z(r3, r4, r11)
            goto L_0x0058
        L_0x02b6:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.O(r3, r4, r11)
            goto L_0x0058
        L_0x02c0:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.U(r3, r4, r11)
            goto L_0x0058
        L_0x02ca:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.R(r3, r4, r11)
            goto L_0x0058
        L_0x02d4:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.D(r3, r4, r11)
            goto L_0x0058
        L_0x02de:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.L(r3, r4, r11)
            goto L_0x0058
        L_0x02e8:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.r(r3, r4)
            goto L_0x0058
        L_0x02f2:
            java.util.List r4 = u(r1, r4)
            com.google.android.gms.internal.vision.K1 r5 = r0.q(r12)
            int r3 = com.google.android.gms.internal.vision.L1.c(r3, r4, r5)
            goto L_0x0058
        L_0x0300:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.b(r3, r4)
            goto L_0x0058
        L_0x030a:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.X(r3, r4, r11)
            goto L_0x0058
        L_0x0314:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.R(r3, r4, r11)
            goto L_0x0058
        L_0x031e:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.U(r3, r4, r11)
            goto L_0x0058
        L_0x0328:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.H(r3, r4, r11)
            goto L_0x0058
        L_0x0332:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.t(r3, r4, r11)
            goto L_0x0058
        L_0x033c:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.d(r3, r4, r11)
            goto L_0x0058
        L_0x0346:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.R(r3, r4, r11)
            goto L_0x0058
        L_0x0350:
            java.util.List r4 = u(r1, r4)
            int r3 = com.google.android.gms.internal.vision.L1.U(r3, r4, r11)
            goto L_0x0058
        L_0x035a:
            boolean r14 = r0.z(r1, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r1, r4)
            com.google.android.gms.internal.vision.t1 r4 = (com.google.android.gms.internal.vision.C0546t1) r4
            com.google.android.gms.internal.vision.K1 r5 = r0.q(r12)
            int r3 = com.google.android.gms.internal.vision.C0551v0.Q(r3, r4, r5)
            goto L_0x0058
        L_0x0370:
            boolean r14 = r0.z(r1, r12)
            if (r14 == 0) goto L_0x047a
            long r4 = com.google.android.gms.internal.vision.h2.o(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.i0(r3, r4)
            goto L_0x0058
        L_0x0380:
            boolean r14 = r0.z(r1, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = com.google.android.gms.internal.vision.h2.b(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.p0(r3, r4)
            goto L_0x0058
        L_0x0390:
            boolean r4 = r0.z(r1, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.q0(r3, r9)
            goto L_0x0058
        L_0x039c:
            boolean r4 = r0.z(r1, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.w0(r3, r11)
            goto L_0x0058
        L_0x03a8:
            boolean r14 = r0.z(r1, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = com.google.android.gms.internal.vision.h2.b(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.y0(r3, r4)
            goto L_0x0058
        L_0x03b8:
            boolean r14 = r0.z(r1, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = com.google.android.gms.internal.vision.h2.b(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.l0(r3, r4)
            goto L_0x0058
        L_0x03c8:
            boolean r14 = r0.z(r1, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r1, r4)
            com.google.android.gms.internal.vision.g0 r4 = (com.google.android.gms.internal.vision.C0507g0) r4
            int r3 = com.google.android.gms.internal.vision.C0551v0.P(r3, r4)
            goto L_0x0058
        L_0x03da:
            boolean r14 = r0.z(r1, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r1, r4)
            com.google.android.gms.internal.vision.K1 r5 = r0.q(r12)
            int r3 = com.google.android.gms.internal.vision.L1.a(r3, r4, r5)
            goto L_0x0058
        L_0x03ee:
            boolean r14 = r0.z(r1, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.h2.F(r1, r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.vision.C0507g0
            if (r5 == 0) goto L_0x0404
            com.google.android.gms.internal.vision.g0 r4 = (com.google.android.gms.internal.vision.C0507g0) r4
            int r3 = com.google.android.gms.internal.vision.C0551v0.P(r3, r4)
            goto L_0x0058
        L_0x0404:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.google.android.gms.internal.vision.C0551v0.C(r3, r4)
            goto L_0x0058
        L_0x040c:
            boolean r4 = r0.z(r1, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.D(r3, r8)
            goto L_0x0058
        L_0x0418:
            boolean r4 = r0.z(r1, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.t0(r3, r11)
            goto L_0x0058
        L_0x0424:
            boolean r4 = r0.z(r1, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.m0(r3, r9)
            goto L_0x0058
        L_0x0430:
            boolean r14 = r0.z(r1, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = com.google.android.gms.internal.vision.h2.b(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.h0(r3, r4)
            goto L_0x0058
        L_0x0440:
            boolean r14 = r0.z(r1, r12)
            if (r14 == 0) goto L_0x047a
            long r4 = com.google.android.gms.internal.vision.h2.o(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.d0(r3, r4)
            goto L_0x0058
        L_0x0450:
            boolean r14 = r0.z(r1, r12)
            if (r14 == 0) goto L_0x047a
            long r4 = com.google.android.gms.internal.vision.h2.o(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C0551v0.X(r3, r4)
            goto L_0x0058
        L_0x0460:
            boolean r4 = r0.z(r1, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C0551v0.A(r3, r6)
            goto L_0x0058
        L_0x046c:
            boolean r4 = r0.z(r1, r12)
            if (r4 == 0) goto L_0x047a
            r4 = 0
            int r3 = com.google.android.gms.internal.vision.C0551v0.z(r3, r4)
            goto L_0x0058
        L_0x047a:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0480:
            com.google.android.gms.internal.vision.a2 r2 = r0.f7603o
            int r1 = k(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x0488:
            sun.misc.Unsafe r2 = f7588s
            r5 = r7
            r3 = r11
            r4 = r3
            r12 = r4
        L_0x048e:
            int[] r13 = r0.f7589a
            int r13 = r13.length
            if (r3 >= r13) goto L_0x093d
            int r13 = r0.N(r3)
            int[] r14 = r0.f7589a
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r6 = r17 >>> 20
            r11 = 17
            if (r6 > r11) goto L_0x04b8
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r11 = r11 >>> 20
            int r11 = r8 << r11
            if (r14 == r5) goto L_0x04b9
            long r8 = (long) r14
            int r12 = r2.getInt(r1, r8)
            r5 = r14
            goto L_0x04b9
        L_0x04b8:
            r11 = 0
        L_0x04b9:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r6) {
                case 0: goto L_0x0922;
                case 1: goto L_0x090f;
                case 2: goto L_0x08ff;
                case 3: goto L_0x08ef;
                case 4: goto L_0x08df;
                case 5: goto L_0x08ce;
                case 6: goto L_0x08c1;
                case 7: goto L_0x08b6;
                case 8: goto L_0x089a;
                case 9: goto L_0x0888;
                case 10: goto L_0x0878;
                case 11: goto L_0x086a;
                case 12: goto L_0x085c;
                case 13: goto L_0x0851;
                case 14: goto L_0x0845;
                case 15: goto L_0x0837;
                case 16: goto L_0x0829;
                case 17: goto L_0x0815;
                case 18: goto L_0x0808;
                case 19: goto L_0x07fb;
                case 20: goto L_0x07ee;
                case 21: goto L_0x07e1;
                case 22: goto L_0x07d4;
                case 23: goto L_0x07c7;
                case 24: goto L_0x07ba;
                case 25: goto L_0x07ae;
                case 26: goto L_0x07a2;
                case 27: goto L_0x0792;
                case 28: goto L_0x0786;
                case 29: goto L_0x0779;
                case 30: goto L_0x076d;
                case 31: goto L_0x0761;
                case 32: goto L_0x0755;
                case 33: goto L_0x0749;
                case 34: goto L_0x0738;
                case 35: goto L_0x0722;
                case 36: goto L_0x070c;
                case 37: goto L_0x06f6;
                case 38: goto L_0x06e0;
                case 39: goto L_0x06ca;
                case 40: goto L_0x06b4;
                case 41: goto L_0x069e;
                case 42: goto L_0x0688;
                case 43: goto L_0x0673;
                case 44: goto L_0x065e;
                case 45: goto L_0x0649;
                case 46: goto L_0x0634;
                case 47: goto L_0x061f;
                case 48: goto L_0x0607;
                case 49: goto L_0x05f7;
                case 50: goto L_0x05e7;
                case 51: goto L_0x05d9;
                case 52: goto L_0x05cc;
                case 53: goto L_0x05bc;
                case 54: goto L_0x05ac;
                case 55: goto L_0x059c;
                case 56: goto L_0x058e;
                case 57: goto L_0x0582;
                case 58: goto L_0x0576;
                case 59: goto L_0x0558;
                case 60: goto L_0x0544;
                case 61: goto L_0x0533;
                case 62: goto L_0x0524;
                case 63: goto L_0x0515;
                case 64: goto L_0x0508;
                case 65: goto L_0x04fb;
                case 66: goto L_0x04ec;
                case 67: goto L_0x04dd;
                case 68: goto L_0x04c0;
                default: goto L_0x04bf;
            }
        L_0x04bf:
            goto L_0x04d5
        L_0x04c0:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.t1 r6 = (com.google.android.gms.internal.vision.C0546t1) r6
            com.google.android.gms.internal.vision.K1 r8 = r0.q(r3)
            int r6 = com.google.android.gms.internal.vision.C0551v0.Q(r15, r6, r8)
        L_0x04d4:
            int r4 = r4 + r6
        L_0x04d5:
            r6 = 0
            r8 = 0
            r10 = 0
        L_0x04d9:
            r13 = 0
            goto L_0x0932
        L_0x04dd:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            long r8 = Q(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C0551v0.i0(r15, r8)
            goto L_0x04d4
        L_0x04ec:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            int r6 = O(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C0551v0.p0(r15, r6)
            goto L_0x04d4
        L_0x04fb:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r8 = 0
            int r6 = com.google.android.gms.internal.vision.C0551v0.q0(r15, r8)
            goto L_0x04d4
        L_0x0508:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r6 = 0
            int r8 = com.google.android.gms.internal.vision.C0551v0.w0(r15, r6)
        L_0x0513:
            int r4 = r4 + r8
            goto L_0x04d5
        L_0x0515:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            int r6 = O(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C0551v0.y0(r15, r6)
            goto L_0x04d4
        L_0x0524:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            int r6 = O(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C0551v0.l0(r15, r6)
            goto L_0x04d4
        L_0x0533:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.g0 r6 = (com.google.android.gms.internal.vision.C0507g0) r6
            int r6 = com.google.android.gms.internal.vision.C0551v0.P(r15, r6)
            goto L_0x04d4
        L_0x0544:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.K1 r8 = r0.q(r3)
            int r6 = com.google.android.gms.internal.vision.L1.a(r15, r6, r8)
            goto L_0x04d4
        L_0x0558:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            boolean r8 = r6 instanceof com.google.android.gms.internal.vision.C0507g0
            if (r8 == 0) goto L_0x056e
            com.google.android.gms.internal.vision.g0 r6 = (com.google.android.gms.internal.vision.C0507g0) r6
            int r6 = com.google.android.gms.internal.vision.C0551v0.P(r15, r6)
            goto L_0x04d4
        L_0x056e:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.android.gms.internal.vision.C0551v0.C(r15, r6)
            goto L_0x04d4
        L_0x0576:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r6 = 1
            int r8 = com.google.android.gms.internal.vision.C0551v0.D(r15, r6)
            goto L_0x0513
        L_0x0582:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r6 = 0
            int r8 = com.google.android.gms.internal.vision.C0551v0.t0(r15, r6)
            goto L_0x0513
        L_0x058e:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r8 = 0
            int r6 = com.google.android.gms.internal.vision.C0551v0.m0(r15, r8)
            goto L_0x04d4
        L_0x059c:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            int r6 = O(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C0551v0.h0(r15, r6)
            goto L_0x04d4
        L_0x05ac:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            long r8 = Q(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C0551v0.d0(r15, r8)
            goto L_0x04d4
        L_0x05bc:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            long r8 = Q(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C0551v0.X(r15, r8)
            goto L_0x04d4
        L_0x05cc:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r6 = 0
            int r8 = com.google.android.gms.internal.vision.C0551v0.A(r15, r6)
            goto L_0x0513
        L_0x05d9:
            boolean r6 = r0.A(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r8 = 0
            int r6 = com.google.android.gms.internal.vision.C0551v0.z(r15, r8)
            goto L_0x04d4
        L_0x05e7:
            com.google.android.gms.internal.vision.q1 r6 = r0.f7605q
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.F(r3)
            int r6 = r6.j(r15, r8, r9)
            goto L_0x04d4
        L_0x05f7:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.vision.K1 r8 = r0.q(r3)
            int r6 = com.google.android.gms.internal.vision.L1.s(r15, r6, r8)
            goto L_0x04d4
        L_0x0607:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.A(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
        L_0x061b:
            int r8 = r8 + r9
            int r8 = r8 + r6
            goto L_0x0513
        L_0x061f:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.P(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x0634:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.V(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x0649:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.S(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x065e:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.E(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x0673:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.M(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x0688:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.Y(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x069e:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.S(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x06b4:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.V(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x06ca:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.I(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x06e0:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.u(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x06f6:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.e(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x070c:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.S(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x0722:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.V(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C0551v0.c0(r15)
            int r9 = com.google.android.gms.internal.vision.C0551v0.k0(r6)
            goto L_0x061b
        L_0x0738:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            r10 = 0
            int r6 = com.google.android.gms.internal.vision.L1.z(r15, r6, r10)
        L_0x0743:
            int r4 = r4 + r6
        L_0x0744:
            r6 = 0
            r8 = 0
            goto L_0x04d9
        L_0x0749:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.O(r15, r6, r10)
            goto L_0x0743
        L_0x0755:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.U(r15, r6, r10)
            goto L_0x0743
        L_0x0761:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.R(r15, r6, r10)
            goto L_0x0743
        L_0x076d:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.D(r15, r6, r10)
            goto L_0x0743
        L_0x0779:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.L(r15, r6, r10)
            goto L_0x04d4
        L_0x0786:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.r(r15, r6)
            goto L_0x04d4
        L_0x0792:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.vision.K1 r8 = r0.q(r3)
            int r6 = com.google.android.gms.internal.vision.L1.c(r15, r6, r8)
            goto L_0x04d4
        L_0x07a2:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.b(r15, r6)
            goto L_0x04d4
        L_0x07ae:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            r10 = 0
            int r6 = com.google.android.gms.internal.vision.L1.X(r15, r6, r10)
            goto L_0x0743
        L_0x07ba:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.R(r15, r6, r10)
            goto L_0x0743
        L_0x07c7:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.U(r15, r6, r10)
            goto L_0x0743
        L_0x07d4:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.H(r15, r6, r10)
            goto L_0x0743
        L_0x07e1:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.t(r15, r6, r10)
            goto L_0x0743
        L_0x07ee:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.d(r15, r6, r10)
            goto L_0x0743
        L_0x07fb:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.R(r15, r6, r10)
            goto L_0x0743
        L_0x0808:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.L1.U(r15, r6, r10)
            goto L_0x04d4
        L_0x0815:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.t1 r6 = (com.google.android.gms.internal.vision.C0546t1) r6
            com.google.android.gms.internal.vision.K1 r8 = r0.q(r3)
            int r6 = com.google.android.gms.internal.vision.C0551v0.Q(r15, r6, r8)
            goto L_0x04d4
        L_0x0829:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            long r8 = r2.getLong(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C0551v0.i0(r15, r8)
            goto L_0x04d4
        L_0x0837:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            int r6 = r2.getInt(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C0551v0.p0(r15, r6)
            goto L_0x04d4
        L_0x0845:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            r8 = 0
            int r6 = com.google.android.gms.internal.vision.C0551v0.q0(r15, r8)
            goto L_0x04d4
        L_0x0851:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            r6 = 0
            int r8 = com.google.android.gms.internal.vision.C0551v0.w0(r15, r6)
            goto L_0x0513
        L_0x085c:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            int r6 = r2.getInt(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C0551v0.y0(r15, r6)
            goto L_0x04d4
        L_0x086a:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            int r6 = r2.getInt(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C0551v0.l0(r15, r6)
            goto L_0x04d4
        L_0x0878:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.g0 r6 = (com.google.android.gms.internal.vision.C0507g0) r6
            int r6 = com.google.android.gms.internal.vision.C0551v0.P(r15, r6)
            goto L_0x04d4
        L_0x0888:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.K1 r8 = r0.q(r3)
            int r6 = com.google.android.gms.internal.vision.L1.a(r15, r6, r8)
            goto L_0x04d4
        L_0x089a:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            boolean r8 = r6 instanceof com.google.android.gms.internal.vision.C0507g0
            if (r8 == 0) goto L_0x08ae
            com.google.android.gms.internal.vision.g0 r6 = (com.google.android.gms.internal.vision.C0507g0) r6
            int r6 = com.google.android.gms.internal.vision.C0551v0.P(r15, r6)
            goto L_0x04d4
        L_0x08ae:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.android.gms.internal.vision.C0551v0.C(r15, r6)
            goto L_0x04d4
        L_0x08b6:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            r6 = 1
            int r8 = com.google.android.gms.internal.vision.C0551v0.D(r15, r6)
            goto L_0x0513
        L_0x08c1:
            r6 = 1
            r8 = r12 & r11
            r10 = 0
            if (r8 == 0) goto L_0x0744
            int r8 = com.google.android.gms.internal.vision.C0551v0.t0(r15, r10)
            int r4 = r4 + r8
            goto L_0x0744
        L_0x08ce:
            r6 = 1
            r10 = 0
            r8 = r12 & r11
            r13 = 0
            if (r8 == 0) goto L_0x08db
            int r8 = com.google.android.gms.internal.vision.C0551v0.m0(r15, r13)
        L_0x08da:
            int r4 = r4 + r8
        L_0x08db:
            r6 = 0
            r8 = 0
            goto L_0x0932
        L_0x08df:
            r6 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x08db
            int r8 = r2.getInt(r1, r8)
            int r8 = com.google.android.gms.internal.vision.C0551v0.h0(r15, r8)
            goto L_0x08da
        L_0x08ef:
            r6 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x08db
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.vision.C0551v0.d0(r15, r8)
            goto L_0x08da
        L_0x08ff:
            r6 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x08db
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.vision.C0551v0.X(r15, r8)
            goto L_0x08da
        L_0x090f:
            r6 = 1
            r10 = 0
            r13 = 0
            r8 = r12 & r11
            if (r8 == 0) goto L_0x0920
            r8 = 0
            int r9 = com.google.android.gms.internal.vision.C0551v0.A(r15, r8)
            int r4 = r4 + r9
        L_0x091d:
            r6 = 0
            goto L_0x0932
        L_0x0920:
            r8 = 0
            goto L_0x091d
        L_0x0922:
            r6 = 1
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = r12 & r11
            r6 = 0
            if (r9 == 0) goto L_0x0932
            int r11 = com.google.android.gms.internal.vision.C0551v0.z(r15, r6)
            int r4 = r4 + r11
        L_0x0932:
            int r3 = r3 + 3
            r6 = r8
            r11 = r10
            r9 = r13
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            goto L_0x048e
        L_0x093d:
            r10 = r11
            com.google.android.gms.internal.vision.a2 r2 = r0.f7603o
            int r2 = k(r2, r1)
            int r4 = r4 + r2
            boolean r2 = r0.f7594f
            if (r2 == 0) goto L_0x099a
            com.google.android.gms.internal.vision.C0 r2 = r0.f7604p
            com.google.android.gms.internal.vision.F0 r1 = r2.b(r1)
            r11 = r10
        L_0x0950:
            com.google.android.gms.internal.vision.O1 r2 = r1.f7218a
            int r2 = r2.j()
            r3 = 0
            if (r11 >= r2) goto L_0x0972
            com.google.android.gms.internal.vision.O1 r2 = r1.f7218a
            java.util.Map$Entry r2 = r2.h(r11)
            java.lang.Object r5 = r2.getKey()
            android.support.v4.media.session.b.a(r5)
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.vision.F0.h(r3, r2)
            int r10 = r10 + r2
            int r11 = r11 + 1
            goto L_0x0950
        L_0x0972:
            com.google.android.gms.internal.vision.O1 r1 = r1.f7218a
            java.lang.Iterable r1 = r1.m()
            java.util.Iterator r1 = r1.iterator()
        L_0x097c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0999
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r5 = r2.getKey()
            android.support.v4.media.session.b.a(r5)
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.vision.F0.h(r3, r2)
            int r10 = r10 + r2
            goto L_0x097c
        L_0x0999:
            int r4 = r4 + r10
        L_0x099a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0558x1.g(java.lang.Object):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.lang.Object r14, com.google.android.gms.internal.vision.y2 r15) {
        /*
            r13 = this;
            int r0 = r15.a()
            int r1 = com.google.android.gms.internal.vision.x2.f7607b
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0529
            com.google.android.gms.internal.vision.a2 r0 = r13.f7603o
            w(r0, r14, r15)
            boolean r0 = r13.f7594f
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.vision.C0 r0 = r13.f7604p
            com.google.android.gms.internal.vision.F0 r0 = r0.b(r14)
            com.google.android.gms.internal.vision.O1 r1 = r0.f7218a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.l()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0034
        L_0x0032:
            r0 = r3
            r1 = r0
        L_0x0034:
            int[] r7 = r13.f7589a
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0039:
            if (r7 < 0) goto L_0x0511
            int r8 = r13.N(r7)
            int[] r9 = r13.f7589a
            r9 = r9[r7]
        L_0x0043:
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.internal.vision.C0 r10 = r13.f7604p
            int r10 = r10.a(r1)
            if (r10 <= r9) goto L_0x0061
            com.google.android.gms.internal.vision.C0 r10 = r13.f7604p
            r10.c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0043
        L_0x005f:
            r1 = r3
            goto L_0x0043
        L_0x0061:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fe;
                case 1: goto L_0x04ee;
                case 2: goto L_0x04de;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04be;
                case 5: goto L_0x04ae;
                case 6: goto L_0x049e;
                case 7: goto L_0x048d;
                case 8: goto L_0x047c;
                case 9: goto L_0x0467;
                case 10: goto L_0x0454;
                case 11: goto L_0x0443;
                case 12: goto L_0x0432;
                case 13: goto L_0x0421;
                case 14: goto L_0x0410;
                case 15: goto L_0x03ff;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03d9;
                case 18: goto L_0x03c8;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03a6;
                case 21: goto L_0x0395;
                case 22: goto L_0x0384;
                case 23: goto L_0x0373;
                case 24: goto L_0x0362;
                case 25: goto L_0x0351;
                case 26: goto L_0x0340;
                case 27: goto L_0x032b;
                case 28: goto L_0x031a;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f8;
                case 31: goto L_0x02e7;
                case 32: goto L_0x02d6;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b4;
                case 35: goto L_0x02a3;
                case 36: goto L_0x0292;
                case 37: goto L_0x0281;
                case 38: goto L_0x0270;
                case 39: goto L_0x025f;
                case 40: goto L_0x024e;
                case 41: goto L_0x023d;
                case 42: goto L_0x022c;
                case 43: goto L_0x021b;
                case 44: goto L_0x020a;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d7;
                case 48: goto L_0x01c6;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a6;
                case 51: goto L_0x0195;
                case 52: goto L_0x0184;
                case 53: goto L_0x0173;
                case 54: goto L_0x0162;
                case 55: goto L_0x0151;
                case 56: goto L_0x0140;
                case 57: goto L_0x012f;
                case 58: goto L_0x011e;
                case 59: goto L_0x010d;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d4;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b2;
                case 65: goto L_0x00a1;
                case 66: goto L_0x0090;
                case 67: goto L_0x007f;
                case 68: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x050d
        L_0x006a:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            com.google.android.gms.internal.vision.K1 r10 = r13.q(r7)
            r15.N(r9, r8, r10)
            goto L_0x050d
        L_0x007f:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = Q(r14, r10)
            r15.M(r9, r10)
            goto L_0x050d
        L_0x0090:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = O(r14, r10)
            r15.e(r9, r8)
            goto L_0x050d
        L_0x00a1:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = Q(r14, r10)
            r15.h(r9, r10)
            goto L_0x050d
        L_0x00b2:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = O(r14, r10)
            r15.B(r9, r8)
            goto L_0x050d
        L_0x00c3:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = O(r14, r10)
            r15.H(r9, r8)
            goto L_0x050d
        L_0x00d4:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = O(r14, r10)
            r15.y(r9, r8)
            goto L_0x050d
        L_0x00e5:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            com.google.android.gms.internal.vision.g0 r8 = (com.google.android.gms.internal.vision.C0507g0) r8
            r15.G(r9, r8)
            goto L_0x050d
        L_0x00f8:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            com.google.android.gms.internal.vision.K1 r10 = r13.q(r7)
            r15.K(r9, r8, r10)
            goto L_0x050d
        L_0x010d:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            v(r9, r8, r15)
            goto L_0x050d
        L_0x011e:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = S(r14, r10)
            r15.F(r9, r8)
            goto L_0x050d
        L_0x012f:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = O(r14, r10)
            r15.s(r9, r8)
            goto L_0x050d
        L_0x0140:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = Q(r14, r10)
            r15.L(r9, r10)
            goto L_0x050d
        L_0x0151:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = O(r14, r10)
            r15.m(r9, r8)
            goto L_0x050d
        L_0x0162:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = Q(r14, r10)
            r15.n(r9, r10)
            goto L_0x050d
        L_0x0173:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = Q(r14, r10)
            r15.C(r9, r10)
            goto L_0x050d
        L_0x0184:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = K(r14, r10)
            r15.E(r9, r8)
            goto L_0x050d
        L_0x0195:
            boolean r10 = r13.A(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = D(r14, r10)
            r15.D(r9, r10)
            goto L_0x050d
        L_0x01a6:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            r13.x(r15, r9, r8, r7)
            goto L_0x050d
        L_0x01b1:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.K1 r10 = r13.q(r7)
            com.google.android.gms.internal.vision.L1.x(r9, r8, r15, r10)
            goto L_0x050d
        L_0x01c6:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.K(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01d7:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.Z(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01e8:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.Q(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01f9:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.b0(r9, r8, r15, r4)
            goto L_0x050d
        L_0x020a:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.c0(r9, r8, r15, r4)
            goto L_0x050d
        L_0x021b:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.W(r9, r8, r15, r4)
            goto L_0x050d
        L_0x022c:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.d0(r9, r8, r15, r4)
            goto L_0x050d
        L_0x023d:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.a0(r9, r8, r15, r4)
            goto L_0x050d
        L_0x024e:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.N(r9, r8, r15, r4)
            goto L_0x050d
        L_0x025f:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.T(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0270:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.G(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0281:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.C(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0292:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.y(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02a3:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.l(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02b4:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.K(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02c5:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.Z(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02d6:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.Q(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02e7:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.b0(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02f8:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.c0(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0309:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.W(r9, r8, r15, r5)
            goto L_0x050d
        L_0x031a:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.w(r9, r8, r15)
            goto L_0x050d
        L_0x032b:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.K1 r10 = r13.q(r7)
            com.google.android.gms.internal.vision.L1.k(r9, r8, r15, r10)
            goto L_0x050d
        L_0x0340:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.j(r9, r8, r15)
            goto L_0x050d
        L_0x0351:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.d0(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0362:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.a0(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0373:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.N(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0384:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.T(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0395:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.G(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03a6:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.C(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03b7:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.y(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03c8:
            int[] r9 = r13.f7589a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.L1.l(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03d9:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            com.google.android.gms.internal.vision.K1 r10 = r13.q(r7)
            r15.N(r9, r8, r10)
            goto L_0x050d
        L_0x03ee:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.h2.o(r14, r10)
            r15.M(r9, r10)
            goto L_0x050d
        L_0x03ff:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.h2.b(r14, r10)
            r15.e(r9, r8)
            goto L_0x050d
        L_0x0410:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.h2.o(r14, r10)
            r15.h(r9, r10)
            goto L_0x050d
        L_0x0421:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.h2.b(r14, r10)
            r15.B(r9, r8)
            goto L_0x050d
        L_0x0432:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.h2.b(r14, r10)
            r15.H(r9, r8)
            goto L_0x050d
        L_0x0443:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.h2.b(r14, r10)
            r15.y(r9, r8)
            goto L_0x050d
        L_0x0454:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            com.google.android.gms.internal.vision.g0 r8 = (com.google.android.gms.internal.vision.C0507g0) r8
            r15.G(r9, r8)
            goto L_0x050d
        L_0x0467:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            com.google.android.gms.internal.vision.K1 r10 = r13.q(r7)
            r15.K(r9, r8, r10)
            goto L_0x050d
        L_0x047c:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.h2.F(r14, r10)
            v(r9, r8, r15)
            goto L_0x050d
        L_0x048d:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.vision.h2.w(r14, r10)
            r15.F(r9, r8)
            goto L_0x050d
        L_0x049e:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.h2.b(r14, r10)
            r15.s(r9, r8)
            goto L_0x050d
        L_0x04ae:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.h2.o(r14, r10)
            r15.L(r9, r10)
            goto L_0x050d
        L_0x04be:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.h2.b(r14, r10)
            r15.m(r9, r8)
            goto L_0x050d
        L_0x04ce:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.h2.o(r14, r10)
            r15.n(r9, r10)
            goto L_0x050d
        L_0x04de:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.h2.o(r14, r10)
            r15.C(r9, r10)
            goto L_0x050d
        L_0x04ee:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.vision.h2.x(r14, r10)
            r15.E(r9, r8)
            goto L_0x050d
        L_0x04fe:
            boolean r10 = r13.z(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.vision.h2.C(r14, r10)
            r15.D(r9, r10)
        L_0x050d:
            int r7 = r7 + -3
            goto L_0x0039
        L_0x0511:
            if (r1 == 0) goto L_0x0528
            com.google.android.gms.internal.vision.C0 r14 = r13.f7604p
            r14.c(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0526
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x0511
        L_0x0526:
            r1 = r3
            goto L_0x0511
        L_0x0528:
            return
        L_0x0529:
            boolean r0 = r13.f7596h
            if (r0 == 0) goto L_0x0a44
            boolean r0 = r13.f7594f
            if (r0 == 0) goto L_0x054a
            com.google.android.gms.internal.vision.C0 r0 = r13.f7604p
            com.google.android.gms.internal.vision.F0 r0 = r0.b(r14)
            com.google.android.gms.internal.vision.O1 r1 = r0.f7218a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054a
            java.util.Iterator r0 = r0.j()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x054c
        L_0x054a:
            r0 = r3
            r1 = r0
        L_0x054c:
            int[] r7 = r13.f7589a
            int r7 = r7.length
            r8 = r5
        L_0x0550:
            if (r8 >= r7) goto L_0x0a28
            int r9 = r13.N(r8)
            int[] r10 = r13.f7589a
            r10 = r10[r8]
        L_0x055a:
            if (r1 == 0) goto L_0x0578
            com.google.android.gms.internal.vision.C0 r11 = r13.f7604p
            int r11 = r11.a(r1)
            if (r11 > r10) goto L_0x0578
            com.google.android.gms.internal.vision.C0 r11 = r13.f7604p
            r11.c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0576
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x055a
        L_0x0576:
            r1 = r3
            goto L_0x055a
        L_0x0578:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a15;
                case 1: goto L_0x0a05;
                case 2: goto L_0x09f5;
                case 3: goto L_0x09e5;
                case 4: goto L_0x09d5;
                case 5: goto L_0x09c5;
                case 6: goto L_0x09b5;
                case 7: goto L_0x09a4;
                case 8: goto L_0x0993;
                case 9: goto L_0x097e;
                case 10: goto L_0x096b;
                case 11: goto L_0x095a;
                case 12: goto L_0x0949;
                case 13: goto L_0x0938;
                case 14: goto L_0x0927;
                case 15: goto L_0x0916;
                case 16: goto L_0x0905;
                case 17: goto L_0x08f0;
                case 18: goto L_0x08df;
                case 19: goto L_0x08ce;
                case 20: goto L_0x08bd;
                case 21: goto L_0x08ac;
                case 22: goto L_0x089b;
                case 23: goto L_0x088a;
                case 24: goto L_0x0879;
                case 25: goto L_0x0868;
                case 26: goto L_0x0857;
                case 27: goto L_0x0842;
                case 28: goto L_0x0831;
                case 29: goto L_0x0820;
                case 30: goto L_0x080f;
                case 31: goto L_0x07fe;
                case 32: goto L_0x07ed;
                case 33: goto L_0x07dc;
                case 34: goto L_0x07cb;
                case 35: goto L_0x07ba;
                case 36: goto L_0x07a9;
                case 37: goto L_0x0798;
                case 38: goto L_0x0787;
                case 39: goto L_0x0776;
                case 40: goto L_0x0765;
                case 41: goto L_0x0754;
                case 42: goto L_0x0743;
                case 43: goto L_0x0732;
                case 44: goto L_0x0721;
                case 45: goto L_0x0710;
                case 46: goto L_0x06ff;
                case 47: goto L_0x06ee;
                case 48: goto L_0x06dd;
                case 49: goto L_0x06c8;
                case 50: goto L_0x06bd;
                case 51: goto L_0x06ac;
                case 52: goto L_0x069b;
                case 53: goto L_0x068a;
                case 54: goto L_0x0679;
                case 55: goto L_0x0668;
                case 56: goto L_0x0657;
                case 57: goto L_0x0646;
                case 58: goto L_0x0635;
                case 59: goto L_0x0624;
                case 60: goto L_0x060f;
                case 61: goto L_0x05fc;
                case 62: goto L_0x05eb;
                case 63: goto L_0x05da;
                case 64: goto L_0x05c9;
                case 65: goto L_0x05b8;
                case 66: goto L_0x05a7;
                case 67: goto L_0x0596;
                case 68: goto L_0x0581;
                default: goto L_0x057f;
            }
        L_0x057f:
            goto L_0x0a24
        L_0x0581:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            com.google.android.gms.internal.vision.K1 r11 = r13.q(r8)
            r15.N(r10, r9, r11)
            goto L_0x0a24
        L_0x0596:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = Q(r14, r11)
            r15.M(r10, r11)
            goto L_0x0a24
        L_0x05a7:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = O(r14, r11)
            r15.e(r10, r9)
            goto L_0x0a24
        L_0x05b8:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = Q(r14, r11)
            r15.h(r10, r11)
            goto L_0x0a24
        L_0x05c9:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = O(r14, r11)
            r15.B(r10, r9)
            goto L_0x0a24
        L_0x05da:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = O(r14, r11)
            r15.H(r10, r9)
            goto L_0x0a24
        L_0x05eb:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = O(r14, r11)
            r15.y(r10, r9)
            goto L_0x0a24
        L_0x05fc:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            com.google.android.gms.internal.vision.g0 r9 = (com.google.android.gms.internal.vision.C0507g0) r9
            r15.G(r10, r9)
            goto L_0x0a24
        L_0x060f:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            com.google.android.gms.internal.vision.K1 r11 = r13.q(r8)
            r15.K(r10, r9, r11)
            goto L_0x0a24
        L_0x0624:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            v(r10, r9, r15)
            goto L_0x0a24
        L_0x0635:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = S(r14, r11)
            r15.F(r10, r9)
            goto L_0x0a24
        L_0x0646:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = O(r14, r11)
            r15.s(r10, r9)
            goto L_0x0a24
        L_0x0657:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = Q(r14, r11)
            r15.L(r10, r11)
            goto L_0x0a24
        L_0x0668:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = O(r14, r11)
            r15.m(r10, r9)
            goto L_0x0a24
        L_0x0679:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = Q(r14, r11)
            r15.n(r10, r11)
            goto L_0x0a24
        L_0x068a:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = Q(r14, r11)
            r15.C(r10, r11)
            goto L_0x0a24
        L_0x069b:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = K(r14, r11)
            r15.E(r10, r9)
            goto L_0x0a24
        L_0x06ac:
            boolean r11 = r13.A(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = D(r14, r11)
            r15.D(r10, r11)
            goto L_0x0a24
        L_0x06bd:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            r13.x(r15, r10, r9, r8)
            goto L_0x0a24
        L_0x06c8:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.K1 r11 = r13.q(r8)
            com.google.android.gms.internal.vision.L1.x(r10, r9, r15, r11)
            goto L_0x0a24
        L_0x06dd:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.K(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ee:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.Z(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ff:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.Q(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0710:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.b0(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0721:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.c0(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0732:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.W(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0743:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.d0(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0754:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.a0(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0765:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.N(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0776:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.T(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0787:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.G(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0798:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.C(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07a9:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.y(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07ba:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.l(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07cb:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.K(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07dc:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.Z(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07ed:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.Q(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07fe:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.b0(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x080f:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.c0(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0820:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.W(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0831:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.w(r10, r9, r15)
            goto L_0x0a24
        L_0x0842:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.K1 r11 = r13.q(r8)
            com.google.android.gms.internal.vision.L1.k(r10, r9, r15, r11)
            goto L_0x0a24
        L_0x0857:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.j(r10, r9, r15)
            goto L_0x0a24
        L_0x0868:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.d0(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0879:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.a0(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x088a:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.N(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x089b:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.T(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ac:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.G(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08bd:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.C(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ce:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.y(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08df:
            int[] r10 = r13.f7589a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.L1.l(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08f0:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            com.google.android.gms.internal.vision.K1 r11 = r13.q(r8)
            r15.N(r10, r9, r11)
            goto L_0x0a24
        L_0x0905:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.h2.o(r14, r11)
            r15.M(r10, r11)
            goto L_0x0a24
        L_0x0916:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.h2.b(r14, r11)
            r15.e(r10, r9)
            goto L_0x0a24
        L_0x0927:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.h2.o(r14, r11)
            r15.h(r10, r11)
            goto L_0x0a24
        L_0x0938:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.h2.b(r14, r11)
            r15.B(r10, r9)
            goto L_0x0a24
        L_0x0949:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.h2.b(r14, r11)
            r15.H(r10, r9)
            goto L_0x0a24
        L_0x095a:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.h2.b(r14, r11)
            r15.y(r10, r9)
            goto L_0x0a24
        L_0x096b:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            com.google.android.gms.internal.vision.g0 r9 = (com.google.android.gms.internal.vision.C0507g0) r9
            r15.G(r10, r9)
            goto L_0x0a24
        L_0x097e:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            com.google.android.gms.internal.vision.K1 r11 = r13.q(r8)
            r15.K(r10, r9, r11)
            goto L_0x0a24
        L_0x0993:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.h2.F(r14, r11)
            v(r10, r9, r15)
            goto L_0x0a24
        L_0x09a4:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.vision.h2.w(r14, r11)
            r15.F(r10, r9)
            goto L_0x0a24
        L_0x09b5:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.h2.b(r14, r11)
            r15.s(r10, r9)
            goto L_0x0a24
        L_0x09c5:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.h2.o(r14, r11)
            r15.L(r10, r11)
            goto L_0x0a24
        L_0x09d5:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.h2.b(r14, r11)
            r15.m(r10, r9)
            goto L_0x0a24
        L_0x09e5:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.h2.o(r14, r11)
            r15.n(r10, r11)
            goto L_0x0a24
        L_0x09f5:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.h2.o(r14, r11)
            r15.C(r10, r11)
            goto L_0x0a24
        L_0x0a05:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.vision.h2.x(r14, r11)
            r15.E(r10, r9)
            goto L_0x0a24
        L_0x0a15:
            boolean r11 = r13.z(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.vision.h2.C(r14, r11)
            r15.D(r10, r11)
        L_0x0a24:
            int r8 = r8 + 3
            goto L_0x0550
        L_0x0a28:
            if (r1 == 0) goto L_0x0a3e
            com.google.android.gms.internal.vision.C0 r2 = r13.f7604p
            r2.c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a28
        L_0x0a3c:
            r1 = r3
            goto L_0x0a28
        L_0x0a3e:
            com.google.android.gms.internal.vision.a2 r0 = r13.f7603o
            w(r0, r14, r15)
            return
        L_0x0a44:
            r13.I(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0558x1.h(java.lang.Object, com.google.android.gms.internal.vision.y2):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02d7, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r10 = r19;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0321, code lost:
        if (r0 == r15) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0340, code lost:
        if (r0 == r15) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f5, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fa, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x022e, code lost:
        r2 = r5;
        r29 = r7;
        r18 = r10;
        r7 = r20;
        r19 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02ce, code lost:
        if (r0 == r15) goto L_0x02d0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.vision.C0492c0 r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f7596h
            if (r0 == 0) goto L_0x037f
            sun.misc.Unsafe r9 = f7588s
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r7 = r8
            r1 = r10
            r2 = r16
            r6 = r2
        L_0x001d:
            if (r0 >= r13) goto L_0x0364
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002f
            int r0 = com.google.android.gms.internal.vision.C0488b0.c(r0, r12, r3, r11)
            int r3 = r11.f7421a
            r4 = r0
            r17 = r3
            goto L_0x0032
        L_0x002f:
            r17 = r0
            r4 = r3
        L_0x0032:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r0 = r15.j(r5, r2)
        L_0x003e:
            r2 = r0
            goto L_0x0045
        L_0x0040:
            int r0 = r15.T(r5)
            goto L_0x003e
        L_0x0045:
            if (r2 != r10) goto L_0x0052
            r2 = r4
            r25 = r5
            r29 = r9
            r19 = r10
            r18 = r16
            goto L_0x0343
        L_0x0052:
            int[] r0 = r15.f7589a
            int r1 = r2 + 1
            r1 = r0[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r33 = r5
            r5 = r1 & r8
            r18 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x0239
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r20 = r2
            if (r0 == r7) goto L_0x0091
            if (r7 == r5) goto L_0x0085
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0087
        L_0x0085:
            r7 = r18
        L_0x0087:
            if (r0 == r5) goto L_0x008e
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
        L_0x008e:
            r2 = r7
            r7 = r0
            goto L_0x0093
        L_0x0091:
            r2 = r18
        L_0x0093:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x0216;
                case 1: goto L_0x01ff;
                case 2: goto L_0x01de;
                case 3: goto L_0x01de;
                case 4: goto L_0x01c7;
                case 5: goto L_0x01a9;
                case 6: goto L_0x0193;
                case 7: goto L_0x0173;
                case 8: goto L_0x0152;
                case 9: goto L_0x0128;
                case 10: goto L_0x0112;
                case 11: goto L_0x01c7;
                case 12: goto L_0x00fd;
                case 13: goto L_0x0193;
                case 14: goto L_0x01a9;
                case 15: goto L_0x00dd;
                case 16: goto L_0x00a3;
                default: goto L_0x0097;
            }
        L_0x0097:
            r25 = r33
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            goto L_0x022e
        L_0x00a3:
            if (r3 != 0) goto L_0x00d0
            int r10 = com.google.android.gms.internal.vision.C0488b0.j(r12, r4, r11)
            long r0 = r11.f7422b
            long r17 = com.google.android.gms.internal.vision.C0545t0.a(r0)
            r0 = r2
            r1 = r31
            r4 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r25 = r33
            r8 = r4
            r26 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
        L_0x00c7:
            r7 = r20
            r1 = r25
            r8 = r26
            r10 = -1
            goto L_0x001d
        L_0x00d0:
            r25 = r33
            r26 = r5
            r8 = r20
            r20 = r7
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x022e
        L_0x00dd:
            r25 = r33
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x00fa
            int r0 = com.google.android.gms.internal.vision.C0488b0.h(r12, r4, r11)
            int r1 = r11.f7421a
            int r1 = com.google.android.gms.internal.vision.C0545t0.d(r1)
            r7.putInt(r14, r8, r1)
        L_0x00f5:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            goto L_0x00c7
        L_0x00fa:
            r5 = r4
            goto L_0x022e
        L_0x00fd:
            r25 = r33
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x00fa
            int r0 = com.google.android.gms.internal.vision.C0488b0.h(r12, r4, r11)
            int r1 = r11.f7421a
            r7.putInt(r14, r8, r1)
            goto L_0x00f5
        L_0x0112:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x00fa
            int r0 = com.google.android.gms.internal.vision.C0488b0.p(r12, r4, r11)
            java.lang.Object r1 = r11.f7423c
            r7.putObject(r14, r8, r1)
            goto L_0x00f5
        L_0x0128:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x00fa
            com.google.android.gms.internal.vision.K1 r0 = r15.q(r10)
            int r0 = com.google.android.gms.internal.vision.C0488b0.f(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0148
            java.lang.Object r1 = r11.f7423c
            r7.putObject(r14, r8, r1)
            goto L_0x00f5
        L_0x0148:
            java.lang.Object r2 = r11.f7423c
            java.lang.Object r1 = com.google.android.gms.internal.vision.R0.e(r1, r2)
            r7.putObject(r14, r8, r1)
            goto L_0x00f5
        L_0x0152:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x00fa
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0169
            int r0 = com.google.android.gms.internal.vision.C0488b0.m(r12, r4, r11)
            goto L_0x016d
        L_0x0169:
            int r0 = com.google.android.gms.internal.vision.C0488b0.o(r12, r4, r11)
        L_0x016d:
            java.lang.Object r1 = r11.f7423c
            r7.putObject(r14, r8, r1)
            goto L_0x00f5
        L_0x0173:
            r25 = r33
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x00fa
            int r0 = com.google.android.gms.internal.vision.C0488b0.j(r12, r4, r11)
            long r1 = r11.f7422b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018c
            r1 = 1
            goto L_0x018e
        L_0x018c:
            r1 = r16
        L_0x018e:
            com.google.android.gms.internal.vision.h2.k(r14, r8, r1)
            goto L_0x00f5
        L_0x0193:
            r25 = r33
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x00fa
            int r0 = com.google.android.gms.internal.vision.C0488b0.g(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x00f5
        L_0x01a9:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 1
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x00fa
            long r17 = com.google.android.gms.internal.vision.C0488b0.k(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x00f5
        L_0x01c7:
            r25 = r33
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x022e
            int r0 = com.google.android.gms.internal.vision.C0488b0.h(r12, r5, r11)
            int r1 = r11.f7421a
            r7.putInt(r14, r8, r1)
            goto L_0x00f5
        L_0x01de:
            r25 = r33
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x022e
            int r17 = com.google.android.gms.internal.vision.C0488b0.j(r12, r5, r11)
            long r4 = r11.f7422b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x00c7
        L_0x01ff:
            r25 = r33
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x022e
            float r0 = com.google.android.gms.internal.vision.C0488b0.n(r12, r5)
            com.google.android.gms.internal.vision.h2.g(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x00f5
        L_0x0216:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 1
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x022e
            double r0 = com.google.android.gms.internal.vision.C0488b0.l(r12, r5)
            com.google.android.gms.internal.vision.h2.f(r14, r8, r0)
            int r0 = r5 + 8
            goto L_0x00f5
        L_0x022e:
            r2 = r5
            r29 = r7
            r18 = r10
            r7 = r20
            r19 = -1
            goto L_0x0343
        L_0x0239:
            r25 = r33
            r5 = r4
            r20 = r7
            r7 = r18
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r0 = 27
            if (r10 != r0) goto L_0x0292
            r0 = 2
            if (r3 != r0) goto L_0x0285
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.vision.X0 r0 = (com.google.android.gms.internal.vision.X0) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0269
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0260
            r1 = 10
            goto L_0x0262
        L_0x0260:
            int r1 = r1 << 1
        L_0x0262:
            com.google.android.gms.internal.vision.X0 r0 = r0.b(r1)
            r7.putObject(r14, r8, r0)
        L_0x0269:
            r8 = r0
            com.google.android.gms.internal.vision.K1 r0 = r15.q(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r18 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.vision.C0488b0.d(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r2 = r18
            goto L_0x00c7
        L_0x0285:
            r18 = r4
            r15 = r5
            r27 = r6
            r29 = r7
            r28 = r20
            r19 = -1
            goto L_0x0324
        L_0x0292:
            r18 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02f2
            r1 = r21
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r4 = r3
            r3 = r5
            r33 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r27 = r6
            r6 = r25
            r28 = r20
            r20 = r7
            r7 = r33
            r23 = r8
            r9 = r26
            r8 = r18
            r29 = r20
            r19 = -1
            r20 = r10
            r9 = r21
            r11 = r20
            r12 = r23
            r14 = r35
            int r0 = r0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02d7
        L_0x02d0:
            r2 = r0
        L_0x02d1:
            r6 = r27
            r7 = r28
            goto L_0x0343
        L_0x02d7:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r10 = r19
            r1 = r25
            r6 = r27
            r7 = r28
        L_0x02eb:
            r9 = r29
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x001d
        L_0x02f2:
            r33 = r3
            r15 = r5
            r27 = r6
            r29 = r7
            r23 = r8
            r28 = r20
            r1 = r21
            r19 = -1
            r20 = r10
            r0 = 50
            r9 = r20
            if (r9 != r0) goto L_0x0326
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x0324
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r18
            r6 = r23
            r8 = r35
            int r0 = r0.n(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x02d7
            goto L_0x02d0
        L_0x0324:
            r2 = r15
            goto L_0x02d1
        L_0x0326:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r25
            r10 = r23
            r12 = r18
            r13 = r35
            int r0 = r0.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02d7
            goto L_0x02d0
        L_0x0343:
            com.google.android.gms.internal.vision.d2 r4 = R(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.vision.C0488b0.b(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r10 = r19
            r1 = r25
            goto L_0x02eb
        L_0x0364:
            r27 = r6
            r1 = r8
            r29 = r9
            if (r7 == r1) goto L_0x0375
            long r1 = (long) r7
            r3 = r31
            r6 = r27
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x0375:
            r4 = r34
            if (r0 != r4) goto L_0x037a
            return
        L_0x037a:
            com.google.android.gms.internal.vision.W0 r0 = com.google.android.gms.internal.vision.W0.e()
            throw r0
        L_0x037f:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.o(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0558x1.i(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.c0):void");
    }

    public final int j(int i4, int i5) {
        if (i4 < this.f7591c || i4 > this.f7592d) {
            return -1;
        }
        return E(i4, i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014d, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015e, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019e, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int l(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.vision.C0492c0 r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f7588s
            int[] r7 = r0.f7589a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018f;
                case 52: goto L_0x0181;
                case 53: goto L_0x0171;
                case 54: goto L_0x0171;
                case 55: goto L_0x0161;
                case 56: goto L_0x0150;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x0161;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x0150;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a2
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a2
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.vision.K1 r2 = r0.q(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.vision.C0488b0.e(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.f7423c
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x0055:
            java.lang.Object r3 = r11.f7423c
            java.lang.Object r3 = com.google.android.gms.internal.vision.R0.e(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x0060:
            if (r5 != 0) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C0488b0.j(r3, r4, r11)
            long r3 = r11.f7422b
            long r3 = com.google.android.gms.internal.vision.C0545t0.a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x0075:
            if (r5 != 0) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r11)
            int r3 = r11.f7421a
            int r3 = com.google.android.gms.internal.vision.C0545t0.d(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x008a:
            if (r5 != 0) goto L_0x01a2
            int r3 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r11)
            int r4 = r11.f7421a
            com.google.android.gms.internal.vision.S0 r5 = r0.L(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.b(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.vision.d2 r1 = R(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.c(r2, r4)
            r2 = r3
            goto L_0x01a3
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019e
        L_0x00b8:
            if (r5 != r15) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C0488b0.p(r3, r4, r11)
            java.lang.Object r3 = r11.f7423c
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x00c5:
            if (r5 != r15) goto L_0x01a2
            com.google.android.gms.internal.vision.K1 r2 = r0.q(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.vision.C0488b0.f(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.f7423c
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.f7423c
            java.lang.Object r3 = com.google.android.gms.internal.vision.R0.e(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a3
        L_0x00f3:
            if (r5 != r15) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r11)
            int r4 = r11.f7421a
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.vision.k2.g(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.f()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.vision.R0.f7357a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a3
        L_0x0127:
            if (r5 != 0) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C0488b0.j(r3, r4, r11)
            long r3 = r11.f7422b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x0140:
            if (r5 != r7) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C0488b0.g(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x014d:
            int r2 = r4 + 4
            goto L_0x019e
        L_0x0150:
            r2 = 1
            if (r5 != r2) goto L_0x01a2
            long r2 = com.google.android.gms.internal.vision.C0488b0.k(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x015e:
            int r2 = r4 + 8
            goto L_0x019e
        L_0x0161:
            if (r5 != 0) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r11)
            int r3 = r11.f7421a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x0171:
            if (r5 != 0) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C0488b0.j(r3, r4, r11)
            long r3 = r11.f7422b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x0181:
            if (r5 != r7) goto L_0x01a2
            float r2 = com.google.android.gms.internal.vision.C0488b0.n(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x014d
        L_0x018f:
            r2 = 1
            if (r5 != r2) goto L_0x01a2
            double r2 = com.google.android.gms.internal.vision.C0488b0.l(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x015e
        L_0x019e:
            r12.putInt(r1, r13, r8)
            goto L_0x01a3
        L_0x01a2:
            r2 = r4
        L_0x01a3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0558x1.l(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.vision.c0):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x035e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ce  */
    public final int m(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.vision.C0492c0 r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f7588s
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.vision.X0 r12 = (com.google.android.gms.internal.vision.X0) r12
            boolean r13 = r12.a()
            r14 = 1
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 << r14
        L_0x002c:
            com.google.android.gms.internal.vision.X0 r12 = r12.b(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 0
            r11 = 2
            switch(r26) {
                case 18: goto L_0x0341;
                case 19: goto L_0x031f;
                case 20: goto L_0x02fb;
                case 21: goto L_0x02fb;
                case 22: goto L_0x02e2;
                case 23: goto L_0x02be;
                case 24: goto L_0x027f;
                case 25: goto L_0x0259;
                case 26: goto L_0x01a4;
                case 27: goto L_0x018a;
                case 28: goto L_0x0132;
                case 29: goto L_0x02e2;
                case 30: goto L_0x00f9;
                case 31: goto L_0x027f;
                case 32: goto L_0x02be;
                case 33: goto L_0x00ac;
                case 34: goto L_0x007e;
                case 35: goto L_0x0341;
                case 36: goto L_0x031f;
                case 37: goto L_0x02fb;
                case 38: goto L_0x02fb;
                case 39: goto L_0x02e2;
                case 40: goto L_0x02be;
                case 41: goto L_0x027f;
                case 42: goto L_0x0259;
                case 43: goto L_0x02e2;
                case 44: goto L_0x00f9;
                case 45: goto L_0x027f;
                case 46: goto L_0x02be;
                case 47: goto L_0x00ac;
                case 48: goto L_0x007e;
                case 49: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x035c
        L_0x003b:
            r1 = 3
            if (r6 != r1) goto L_0x007b
            com.google.android.gms.internal.vision.K1 r1 = r15.q(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.vision.C0488b0.e(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f7423c
            r12.add(r8)
        L_0x005b:
            if (r4 >= r5) goto L_0x007b
            int r8 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r9 = r7.f7421a
            if (r2 != r9) goto L_0x007b
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.vision.C0488b0.e(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f7423c
            r12.add(r8)
            goto L_0x005b
        L_0x007b:
            r1 = r4
            goto L_0x035e
        L_0x007e:
            if (r6 != r11) goto L_0x009d
            com.google.android.gms.internal.vision.g1 r12 = (com.google.android.gms.internal.vision.C0508g1) r12
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r2 = r7.f7421a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x0094
            if (r1 != r2) goto L_0x008f
            goto L_0x035e
        L_0x008f:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.a()
            throw r1
        L_0x0094:
            com.google.android.gms.internal.vision.C0488b0.j(r3, r1, r7)
            long r1 = r7.f7422b
            com.google.android.gms.internal.vision.C0545t0.a(r1)
            throw r10
        L_0x009d:
            if (r6 == 0) goto L_0x00a1
            goto L_0x035c
        L_0x00a1:
            com.google.android.gms.internal.vision.g1 r12 = (com.google.android.gms.internal.vision.C0508g1) r12
            com.google.android.gms.internal.vision.C0488b0.j(r3, r4, r7)
            long r1 = r7.f7422b
            com.google.android.gms.internal.vision.C0545t0.a(r1)
            throw r10
        L_0x00ac:
            if (r6 != r11) goto L_0x00d0
            com.google.android.gms.internal.vision.P0 r12 = (com.google.android.gms.internal.vision.P0) r12
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r2 = r7.f7421a
            int r2 = r2 + r1
        L_0x00b7:
            if (r1 >= r2) goto L_0x00c7
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r1, r7)
            int r4 = r7.f7421a
            int r4 = com.google.android.gms.internal.vision.C0545t0.d(r4)
            r12.u(r4)
            goto L_0x00b7
        L_0x00c7:
            if (r1 != r2) goto L_0x00cb
            goto L_0x035e
        L_0x00cb:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.a()
            throw r1
        L_0x00d0:
            if (r6 != 0) goto L_0x007b
            com.google.android.gms.internal.vision.P0 r12 = (com.google.android.gms.internal.vision.P0) r12
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r4 = r7.f7421a
            int r4 = com.google.android.gms.internal.vision.C0545t0.d(r4)
            r12.u(r4)
        L_0x00e1:
            if (r1 >= r5) goto L_0x035e
            int r4 = com.google.android.gms.internal.vision.C0488b0.h(r3, r1, r7)
            int r6 = r7.f7421a
            if (r2 != r6) goto L_0x035e
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r4 = r7.f7421a
            int r4 = com.google.android.gms.internal.vision.C0545t0.d(r4)
            r12.u(r4)
            goto L_0x00e1
        L_0x00f9:
            if (r6 != r11) goto L_0x0100
            int r2 = com.google.android.gms.internal.vision.C0488b0.i(r3, r4, r12, r7)
            goto L_0x0111
        L_0x0100:
            if (r6 != 0) goto L_0x007b
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.vision.C0488b0.a(r2, r3, r4, r5, r6, r7)
        L_0x0111:
            com.google.android.gms.internal.vision.N0 r1 = (com.google.android.gms.internal.vision.N0) r1
            com.google.android.gms.internal.vision.d2 r3 = r1.zzb
            com.google.android.gms.internal.vision.d2 r4 = com.google.android.gms.internal.vision.C0498d2.a()
            if (r3 != r4) goto L_0x011c
            goto L_0x011d
        L_0x011c:
            r10 = r3
        L_0x011d:
            com.google.android.gms.internal.vision.S0 r3 = r15.L(r8)
            com.google.android.gms.internal.vision.a2 r4 = r0.f7603o
            r5 = r21
            java.lang.Object r3 = com.google.android.gms.internal.vision.L1.i(r5, r12, r3, r10, r4)
            com.google.android.gms.internal.vision.d2 r3 = (com.google.android.gms.internal.vision.C0498d2) r3
            if (r3 == 0) goto L_0x012f
            r1.zzb = r3
        L_0x012f:
            r1 = r2
            goto L_0x035e
        L_0x0132:
            if (r6 != r11) goto L_0x007b
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r4 = r7.f7421a
            if (r4 < 0) goto L_0x0185
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0180
            if (r4 != 0) goto L_0x0148
            com.google.android.gms.internal.vision.g0 r4 = com.google.android.gms.internal.vision.C0507g0.f7445f
            r12.add(r4)
            goto L_0x0150
        L_0x0148:
            com.google.android.gms.internal.vision.g0 r6 = com.google.android.gms.internal.vision.C0507g0.y(r3, r1, r4)
            r12.add(r6)
        L_0x014f:
            int r1 = r1 + r4
        L_0x0150:
            if (r1 >= r5) goto L_0x035e
            int r4 = com.google.android.gms.internal.vision.C0488b0.h(r3, r1, r7)
            int r6 = r7.f7421a
            if (r2 != r6) goto L_0x035e
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r4 = r7.f7421a
            if (r4 < 0) goto L_0x017b
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0176
            if (r4 != 0) goto L_0x016e
            com.google.android.gms.internal.vision.g0 r4 = com.google.android.gms.internal.vision.C0507g0.f7445f
            r12.add(r4)
            goto L_0x0150
        L_0x016e:
            com.google.android.gms.internal.vision.g0 r6 = com.google.android.gms.internal.vision.C0507g0.y(r3, r1, r4)
            r12.add(r6)
            goto L_0x014f
        L_0x0176:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.a()
            throw r1
        L_0x017b:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.b()
            throw r1
        L_0x0180:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.a()
            throw r1
        L_0x0185:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.b()
            throw r1
        L_0x018a:
            if (r6 != r11) goto L_0x007b
            com.google.android.gms.internal.vision.K1 r1 = r15.q(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.vision.C0488b0.d(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x035e
        L_0x01a4:
            if (r6 != r11) goto L_0x007b
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01f9
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r4 = r7.f7421a
            if (r4 < 0) goto L_0x01f4
            if (r4 != 0) goto L_0x01c1
            r12.add(r6)
            goto L_0x01cc
        L_0x01c1:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.vision.R0.f7357a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01cb:
            int r1 = r1 + r4
        L_0x01cc:
            if (r1 >= r5) goto L_0x035e
            int r4 = com.google.android.gms.internal.vision.C0488b0.h(r3, r1, r7)
            int r8 = r7.f7421a
            if (r2 != r8) goto L_0x035e
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r4 = r7.f7421a
            if (r4 < 0) goto L_0x01ef
            if (r4 != 0) goto L_0x01e4
            r12.add(r6)
            goto L_0x01cc
        L_0x01e4:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.vision.R0.f7357a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01cb
        L_0x01ef:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.b()
            throw r1
        L_0x01f4:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.b()
            throw r1
        L_0x01f9:
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r4 = r7.f7421a
            if (r4 < 0) goto L_0x0254
            if (r4 != 0) goto L_0x0207
            r12.add(r6)
            goto L_0x021a
        L_0x0207:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.vision.k2.g(r3, r1, r8)
            if (r9 == 0) goto L_0x024f
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.vision.R0.f7357a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x0219:
            r1 = r8
        L_0x021a:
            if (r1 >= r5) goto L_0x035e
            int r4 = com.google.android.gms.internal.vision.C0488b0.h(r3, r1, r7)
            int r8 = r7.f7421a
            if (r2 != r8) goto L_0x035e
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r4 = r7.f7421a
            if (r4 < 0) goto L_0x024a
            if (r4 != 0) goto L_0x0232
            r12.add(r6)
            goto L_0x021a
        L_0x0232:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.vision.k2.g(r3, r1, r8)
            if (r9 == 0) goto L_0x0245
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.vision.R0.f7357a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x0219
        L_0x0245:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.f()
            throw r1
        L_0x024a:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.b()
            throw r1
        L_0x024f:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.f()
            throw r1
        L_0x0254:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.b()
            throw r1
        L_0x0259:
            if (r6 != r11) goto L_0x0273
            com.google.android.gms.internal.vision.e0 r12 = (com.google.android.gms.internal.vision.C0500e0) r12
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r2 = r7.f7421a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x026f
            if (r1 != r2) goto L_0x026a
            goto L_0x035e
        L_0x026a:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.a()
            throw r1
        L_0x026f:
            com.google.android.gms.internal.vision.C0488b0.j(r3, r1, r7)
            throw r10
        L_0x0273:
            if (r6 == 0) goto L_0x0277
            goto L_0x035c
        L_0x0277:
            com.google.android.gms.internal.vision.e0 r12 = (com.google.android.gms.internal.vision.C0500e0) r12
            com.google.android.gms.internal.vision.C0488b0.j(r3, r4, r7)
            long r1 = r7.f7422b
            throw r10
        L_0x027f:
            if (r6 != r11) goto L_0x029f
            com.google.android.gms.internal.vision.P0 r12 = (com.google.android.gms.internal.vision.P0) r12
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r2 = r7.f7421a
            int r2 = r2 + r1
        L_0x028a:
            if (r1 >= r2) goto L_0x0296
            int r4 = com.google.android.gms.internal.vision.C0488b0.g(r3, r1)
            r12.u(r4)
            int r1 = r1 + 4
            goto L_0x028a
        L_0x0296:
            if (r1 != r2) goto L_0x029a
            goto L_0x035e
        L_0x029a:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.a()
            throw r1
        L_0x029f:
            if (r6 != r9) goto L_0x007b
            com.google.android.gms.internal.vision.P0 r12 = (com.google.android.gms.internal.vision.P0) r12
            int r1 = com.google.android.gms.internal.vision.C0488b0.g(r17, r18)
            r12.u(r1)
        L_0x02aa:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x035e
            int r4 = com.google.android.gms.internal.vision.C0488b0.h(r3, r1, r7)
            int r6 = r7.f7421a
            if (r2 != r6) goto L_0x035e
            int r1 = com.google.android.gms.internal.vision.C0488b0.g(r3, r4)
            r12.u(r1)
            goto L_0x02aa
        L_0x02be:
            if (r6 != r11) goto L_0x02d8
            com.google.android.gms.internal.vision.g1 r12 = (com.google.android.gms.internal.vision.C0508g1) r12
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r2 = r7.f7421a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x02d4
            if (r1 != r2) goto L_0x02cf
            goto L_0x035e
        L_0x02cf:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.a()
            throw r1
        L_0x02d4:
            com.google.android.gms.internal.vision.C0488b0.k(r3, r1)
            throw r10
        L_0x02d8:
            if (r6 == r14) goto L_0x02dc
            goto L_0x035c
        L_0x02dc:
            com.google.android.gms.internal.vision.g1 r12 = (com.google.android.gms.internal.vision.C0508g1) r12
            com.google.android.gms.internal.vision.C0488b0.k(r17, r18)
            throw r10
        L_0x02e2:
            if (r6 != r11) goto L_0x02ea
            int r1 = com.google.android.gms.internal.vision.C0488b0.i(r3, r4, r12, r7)
            goto L_0x035e
        L_0x02ea:
            if (r6 != 0) goto L_0x007b
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.vision.C0488b0.a(r20, r21, r22, r23, r24, r25)
            goto L_0x035e
        L_0x02fb:
            if (r6 != r11) goto L_0x0314
            com.google.android.gms.internal.vision.g1 r12 = (com.google.android.gms.internal.vision.C0508g1) r12
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r2 = r7.f7421a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x0310
            if (r1 != r2) goto L_0x030b
            goto L_0x035e
        L_0x030b:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.a()
            throw r1
        L_0x0310:
            com.google.android.gms.internal.vision.C0488b0.j(r3, r1, r7)
            throw r10
        L_0x0314:
            if (r6 == 0) goto L_0x0317
            goto L_0x035c
        L_0x0317:
            com.google.android.gms.internal.vision.g1 r12 = (com.google.android.gms.internal.vision.C0508g1) r12
            com.google.android.gms.internal.vision.C0488b0.j(r3, r4, r7)
            long r1 = r7.f7422b
            throw r10
        L_0x031f:
            if (r6 != r11) goto L_0x0338
            com.google.android.gms.internal.vision.M0 r12 = (com.google.android.gms.internal.vision.M0) r12
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r2 = r7.f7421a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x0334
            if (r1 != r2) goto L_0x032f
            goto L_0x035e
        L_0x032f:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.a()
            throw r1
        L_0x0334:
            com.google.android.gms.internal.vision.C0488b0.n(r3, r1)
            throw r10
        L_0x0338:
            if (r6 == r9) goto L_0x033b
            goto L_0x035c
        L_0x033b:
            com.google.android.gms.internal.vision.M0 r12 = (com.google.android.gms.internal.vision.M0) r12
            com.google.android.gms.internal.vision.C0488b0.n(r17, r18)
            throw r10
        L_0x0341:
            if (r6 != r11) goto L_0x035a
            com.google.android.gms.internal.vision.z0 r12 = (com.google.android.gms.internal.vision.C0563z0) r12
            int r1 = com.google.android.gms.internal.vision.C0488b0.h(r3, r4, r7)
            int r2 = r7.f7421a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x0356
            if (r1 != r2) goto L_0x0351
            goto L_0x035e
        L_0x0351:
            com.google.android.gms.internal.vision.W0 r1 = com.google.android.gms.internal.vision.W0.a()
            throw r1
        L_0x0356:
            com.google.android.gms.internal.vision.C0488b0.l(r3, r1)
            throw r10
        L_0x035a:
            if (r6 == r14) goto L_0x035f
        L_0x035c:
            goto L_0x007b
        L_0x035e:
            return r1
        L_0x035f:
            com.google.android.gms.internal.vision.z0 r12 = (com.google.android.gms.internal.vision.C0563z0) r12
            com.google.android.gms.internal.vision.C0488b0.l(r17, r18)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0558x1.m(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.vision.c0):int");
    }

    public final int n(Object obj, byte[] bArr, int i4, int i5, int i6, long j4, C0492c0 c0Var) {
        Unsafe unsafe = f7588s;
        Object F4 = F(i6);
        Object object = unsafe.getObject(obj, j4);
        if (this.f7605q.d(object)) {
            Object h4 = this.f7605q.h(F4);
            this.f7605q.e(h4, object);
            unsafe.putObject(obj, j4, h4);
            object = h4;
        }
        this.f7605q.g(F4);
        this.f7605q.b(object);
        int h5 = C0488b0.h(bArr, i4, c0Var);
        int i7 = c0Var.f7421a;
        if (i7 < 0 || i7 > i5 - h5) {
            throw W0.a();
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x03a3, code lost:
        if (r0 == r15) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03ae, code lost:
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r1 = r31;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r2 = r18;
        r5 = r19;
        r6 = r21;
        r3 = r24;
        r10 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03ef, code lost:
        if (r0 == r15) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011e, code lost:
        r5 = r6 | r21;
        r6 = r31;
        r3 = r7;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0124, code lost:
        r1 = r11;
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014c, code lost:
        r5 = r6 | r21;
        r6 = r31;
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01dc, code lost:
        r5 = r6 | r21;
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01e0, code lost:
        r3 = r7;
        r1 = r11;
        r11 = r33;
        r26 = r13;
        r13 = r2;
        r2 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0302, code lost:
        r2 = r3;
        r19 = r6;
        r8 = r7;
        r25 = r10;
        r18 = r13;
        r6 = r31;
        r7 = r33;
        r31 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int o(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.vision.C0492c0 r34) {
        /*
            r28 = this;
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r11 = r33
            r9 = r34
            sun.misc.Unsafe r10 = f7588s
            r16 = 0
            r0 = r31
            r2 = r16
            r3 = r2
            r5 = r3
            r1 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x0491
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.vision.C0488b0.c(r0, r12, r3, r9)
            int r3 = r9.f7421a
            r4 = r3
            r3 = r0
            goto L_0x002c
        L_0x002b:
            r4 = r0
        L_0x002c:
            int r0 = r4 >>> 3
            r8 = r4 & 7
            r7 = 3
            if (r0 <= r1) goto L_0x003b
            int r2 = r2 / r7
            int r1 = r15.j(r0, r2)
        L_0x0038:
            r2 = r1
            r1 = -1
            goto L_0x0040
        L_0x003b:
            int r1 = r15.T(r0)
            goto L_0x0038
        L_0x0040:
            if (r2 != r1) goto L_0x0051
            r31 = r0
            r17 = r1
            r2 = r3
            r8 = r4
            r19 = r5
            r25 = r10
            r7 = r11
            r18 = r16
            goto L_0x0415
        L_0x0051:
            int[] r1 = r15.f7589a
            int r19 = r2 + 1
            r7 = r1[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r7 & r19
            int r11 = r19 >>> 20
            r19 = r4
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r7 & r17
            long r12 = (long) r4
            r4 = 17
            r20 = r7
            if (r11 > r4) goto L_0x0312
            int r4 = r2 + 2
            r1 = r1[r4]
            int r4 = r1 >>> 20
            r7 = 1
            int r21 = r7 << r4
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r4
            r17 = r8
            if (r1 == r6) goto L_0x008a
            if (r6 == r4) goto L_0x0082
            long r7 = (long) r6
            r10.putInt(r14, r7, r5)
        L_0x0082:
            long r5 = (long) r1
            int r5 = r10.getInt(r14, r5)
            r7 = r1
        L_0x0088:
            r6 = r5
            goto L_0x008c
        L_0x008a:
            r7 = r6
            goto L_0x0088
        L_0x008c:
            r1 = 5
            switch(r11) {
                case 0: goto L_0x02e5;
                case 1: goto L_0x02c9;
                case 2: goto L_0x02a5;
                case 3: goto L_0x02a5;
                case 4: goto L_0x0289;
                case 5: goto L_0x0263;
                case 6: goto L_0x0245;
                case 7: goto L_0x0218;
                case 8: goto L_0x01ef;
                case 9: goto L_0x01a9;
                case 10: goto L_0x018d;
                case 11: goto L_0x0289;
                case 12: goto L_0x0152;
                case 13: goto L_0x0245;
                case 14: goto L_0x0263;
                case 15: goto L_0x012e;
                case 16: goto L_0x00f6;
                case 17: goto L_0x009e;
                default: goto L_0x0090;
            }
        L_0x0090:
            r12 = r30
            r11 = r0
            r13 = r2
            r18 = r4
            r31 = r7
            r7 = r19
            r17 = -1
            goto L_0x0302
        L_0x009e:
            r8 = r17
            r1 = 3
            if (r8 != r1) goto L_0x00e8
            int r1 = r0 << 3
            r5 = r1 | 4
            com.google.android.gms.internal.vision.K1 r1 = r15.q(r2)
            r11 = r0
            r0 = r1
            r17 = -1
            r1 = r30
            r8 = r2
            r2 = r3
            r3 = r32
            r18 = r4
            r31 = r7
            r7 = r19
            r4 = r5
            r5 = r34
            int r0 = com.google.android.gms.internal.vision.C0488b0.e(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x00cc
            java.lang.Object r1 = r9.f7423c
            r10.putObject(r14, r12, r1)
            goto L_0x00d9
        L_0x00cc:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.f7423c
            java.lang.Object r1 = com.google.android.gms.internal.vision.R0.e(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x00d9:
            r5 = r6 | r21
            r12 = r30
            r6 = r31
            r13 = r32
            r3 = r7
            r2 = r8
            r1 = r11
        L_0x00e4:
            r11 = r33
            goto L_0x001a
        L_0x00e8:
            r11 = r0
            r18 = r4
            r31 = r7
            r7 = r19
            r17 = -1
            r12 = r30
            r13 = r2
            goto L_0x0302
        L_0x00f6:
            r11 = r0
            r18 = r4
            r31 = r7
            r8 = r17
            r7 = r19
            r17 = -1
            r4 = r2
            if (r8 != 0) goto L_0x0129
            r1 = r12
            r12 = r30
            int r8 = com.google.android.gms.internal.vision.C0488b0.j(r12, r3, r9)
            r19 = r1
            long r0 = r9.f7422b
            long r22 = com.google.android.gms.internal.vision.C0545t0.a(r0)
            r0 = r10
            r2 = r19
            r1 = r29
            r13 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
        L_0x011e:
            r5 = r6 | r21
            r6 = r31
            r3 = r7
            r0 = r8
        L_0x0124:
            r1 = r11
            r2 = r13
        L_0x0126:
            r13 = r32
            goto L_0x00e4
        L_0x0129:
            r12 = r30
            r13 = r4
            goto L_0x0302
        L_0x012e:
            r11 = r0
            r18 = r4
            r31 = r7
            r4 = r12
            r8 = r17
            r7 = r19
            r17 = -1
            r12 = r30
            r13 = r2
            if (r8 != 0) goto L_0x0302
            int r0 = com.google.android.gms.internal.vision.C0488b0.h(r12, r3, r9)
            int r1 = r9.f7421a
            int r1 = com.google.android.gms.internal.vision.C0545t0.d(r1)
            r10.putInt(r14, r4, r1)
        L_0x014c:
            r5 = r6 | r21
            r6 = r31
            r3 = r7
            goto L_0x0124
        L_0x0152:
            r11 = r0
            r18 = r4
            r31 = r7
            r4 = r12
            r8 = r17
            r7 = r19
            r17 = -1
            r12 = r30
            r13 = r2
            if (r8 != 0) goto L_0x0302
            int r0 = com.google.android.gms.internal.vision.C0488b0.h(r12, r3, r9)
            int r1 = r9.f7421a
            com.google.android.gms.internal.vision.S0 r2 = r15.L(r13)
            if (r2 == 0) goto L_0x0189
            boolean r2 = r2.b(r1)
            if (r2 == 0) goto L_0x0176
            goto L_0x0189
        L_0x0176:
            com.google.android.gms.internal.vision.d2 r2 = R(r29)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.c(r7, r1)
            r5 = r6
            r3 = r7
            r1 = r11
            r2 = r13
            r6 = r31
            goto L_0x0126
        L_0x0189:
            r10.putInt(r14, r4, r1)
            goto L_0x014c
        L_0x018d:
            r11 = r0
            r18 = r4
            r31 = r7
            r4 = r12
            r8 = r17
            r7 = r19
            r0 = 2
            r17 = -1
            r12 = r30
            r13 = r2
            if (r8 != r0) goto L_0x0302
            int r0 = com.google.android.gms.internal.vision.C0488b0.p(r12, r3, r9)
            java.lang.Object r1 = r9.f7423c
            r10.putObject(r14, r4, r1)
            goto L_0x014c
        L_0x01a9:
            r11 = r0
            r18 = r4
            r31 = r7
            r4 = r12
            r8 = r17
            r7 = r19
            r0 = 2
            r17 = -1
            r12 = r30
            r13 = r2
            if (r8 != r0) goto L_0x01eb
            com.google.android.gms.internal.vision.K1 r0 = r15.q(r13)
            r2 = r32
            int r0 = com.google.android.gms.internal.vision.C0488b0.f(r0, r12, r3, r2, r9)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x01cf
            java.lang.Object r1 = r9.f7423c
            r10.putObject(r14, r4, r1)
            goto L_0x01dc
        L_0x01cf:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r3 = r9.f7423c
            java.lang.Object r1 = com.google.android.gms.internal.vision.R0.e(r1, r3)
            r10.putObject(r14, r4, r1)
        L_0x01dc:
            r5 = r6 | r21
            r6 = r31
        L_0x01e0:
            r3 = r7
            r1 = r11
            r11 = r33
            r26 = r13
            r13 = r2
            r2 = r26
            goto L_0x001a
        L_0x01eb:
            r2 = r32
            goto L_0x0302
        L_0x01ef:
            r11 = r0
            r18 = r4
            r31 = r7
            r4 = r12
            r8 = r17
            r7 = r19
            r0 = 2
            r17 = -1
            r12 = r30
            r13 = r2
            r2 = r32
            if (r8 != r0) goto L_0x0302
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r20 & r0
            if (r0 != 0) goto L_0x020e
            int r0 = com.google.android.gms.internal.vision.C0488b0.m(r12, r3, r9)
            goto L_0x0212
        L_0x020e:
            int r0 = com.google.android.gms.internal.vision.C0488b0.o(r12, r3, r9)
        L_0x0212:
            java.lang.Object r1 = r9.f7423c
            r10.putObject(r14, r4, r1)
            goto L_0x01dc
        L_0x0218:
            r11 = r0
            r18 = r4
            r31 = r7
            r4 = r12
            r8 = r17
            r7 = r19
            r17 = -1
            r12 = r30
            r13 = r2
            r2 = r32
            if (r8 != 0) goto L_0x0302
            int r0 = com.google.android.gms.internal.vision.C0488b0.j(r12, r3, r9)
            r3 = r0
            long r0 = r9.f7422b
            r19 = 0
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x023a
            r0 = 1
            goto L_0x023c
        L_0x023a:
            r0 = r16
        L_0x023c:
            com.google.android.gms.internal.vision.h2.k(r14, r4, r0)
            r5 = r6 | r21
            r6 = r31
            r0 = r3
            goto L_0x01e0
        L_0x0245:
            r11 = r0
            r18 = r4
            r31 = r7
            r4 = r12
            r8 = r17
            r7 = r19
            r17 = -1
            r12 = r30
            r13 = r2
            r2 = r32
            if (r8 != r1) goto L_0x0302
            int r0 = com.google.android.gms.internal.vision.C0488b0.g(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
            goto L_0x01dc
        L_0x0263:
            r11 = r0
            r18 = r4
            r31 = r7
            r4 = r12
            r8 = r17
            r7 = r19
            r0 = 1
            r17 = -1
            r12 = r30
            r13 = r2
            r2 = r32
            if (r8 != r0) goto L_0x0302
            long r19 = com.google.android.gms.internal.vision.C0488b0.k(r12, r3)
            r0 = r10
            r1 = r29
            r8 = r3
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x014c
        L_0x0289:
            r11 = r0
            r18 = r4
            r31 = r7
            r4 = r12
            r8 = r17
            r7 = r19
            r17 = -1
            r12 = r30
            r13 = r2
            if (r8 != 0) goto L_0x0302
            int r0 = com.google.android.gms.internal.vision.C0488b0.h(r12, r3, r9)
            int r1 = r9.f7421a
            r10.putInt(r14, r4, r1)
            goto L_0x014c
        L_0x02a5:
            r11 = r0
            r18 = r4
            r31 = r7
            r4 = r12
            r8 = r17
            r7 = r19
            r17 = -1
            r12 = r30
            r13 = r2
            if (r8 != 0) goto L_0x0302
            int r8 = com.google.android.gms.internal.vision.C0488b0.j(r12, r3, r9)
            long r2 = r9.f7422b
            r0 = r10
            r1 = r29
            r19 = r2
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x011e
        L_0x02c9:
            r11 = r0
            r18 = r4
            r31 = r7
            r4 = r12
            r8 = r17
            r7 = r19
            r17 = -1
            r12 = r30
            r13 = r2
            if (r8 != r1) goto L_0x0302
            float r0 = com.google.android.gms.internal.vision.C0488b0.n(r12, r3)
            com.google.android.gms.internal.vision.h2.g(r14, r4, r0)
            int r0 = r3 + 4
            goto L_0x014c
        L_0x02e5:
            r11 = r0
            r18 = r4
            r31 = r7
            r4 = r12
            r8 = r17
            r7 = r19
            r0 = 1
            r17 = -1
            r12 = r30
            r13 = r2
            if (r8 != r0) goto L_0x0302
            double r0 = com.google.android.gms.internal.vision.C0488b0.l(r12, r3)
            com.google.android.gms.internal.vision.h2.f(r14, r4, r0)
            int r0 = r3 + 8
            goto L_0x014c
        L_0x0302:
            r2 = r3
            r19 = r6
            r8 = r7
            r25 = r10
            r18 = r13
            r6 = r31
            r7 = r33
            r31 = r11
            goto L_0x0415
        L_0x0312:
            r4 = r0
            r7 = r19
            r17 = -1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r26 = r12
            r12 = r30
            r13 = r2
            r1 = r26
            r0 = 27
            if (r11 != r0) goto L_0x0374
            r0 = 2
            if (r8 != r0) goto L_0x0365
            java.lang.Object r0 = r10.getObject(r14, r1)
            com.google.android.gms.internal.vision.X0 r0 = (com.google.android.gms.internal.vision.X0) r0
            boolean r8 = r0.a()
            if (r8 != 0) goto L_0x0346
            int r8 = r0.size()
            if (r8 != 0) goto L_0x033d
            r8 = 10
            goto L_0x033f
        L_0x033d:
            int r8 = r8 << 1
        L_0x033f:
            com.google.android.gms.internal.vision.X0 r0 = r0.b(r8)
            r10.putObject(r14, r1, r0)
        L_0x0346:
            r8 = r0
            com.google.android.gms.internal.vision.K1 r0 = r15.q(r13)
            r1 = r7
            r2 = r30
            r11 = r4
            r4 = r32
            r19 = r5
            r5 = r8
            r21 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.vision.C0488b0.d(r0, r1, r2, r3, r4, r5, r6)
            r3 = r7
            r1 = r11
            r2 = r13
            r5 = r19
            r6 = r21
            goto L_0x0126
        L_0x0365:
            r19 = r5
            r21 = r6
            r15 = r3
            r31 = r4
            r24 = r7
            r25 = r10
            r18 = r13
            goto L_0x03f2
        L_0x0374:
            r19 = r5
            r21 = r6
            r5 = r4
            r0 = 49
            if (r11 > r0) goto L_0x03c8
            r6 = r20
            r20 = r10
            long r9 = (long) r6
            r0 = r28
            r22 = r1
            r1 = r29
            r2 = r30
            r6 = r3
            r4 = r32
            r31 = r5
            r5 = r7
            r15 = r6
            r6 = r31
            r24 = r7
            r7 = r8
            r8 = r13
            r25 = r20
            r18 = r13
            r12 = r22
            r14 = r34
            int r0 = r0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x03ae
        L_0x03a5:
            r7 = r33
            r2 = r0
        L_0x03a8:
            r6 = r21
            r8 = r24
            goto L_0x0415
        L_0x03ae:
            r15 = r28
            r14 = r29
            r12 = r30
            r1 = r31
            r13 = r32
            r11 = r33
            r9 = r34
            r2 = r18
            r5 = r19
            r6 = r21
            r3 = r24
            r10 = r25
            goto L_0x001a
        L_0x03c8:
            r22 = r1
            r15 = r3
            r31 = r5
            r24 = r7
            r25 = r10
            r18 = r13
            r6 = r20
            r0 = 50
            if (r11 != r0) goto L_0x03f6
            r0 = 2
            if (r8 != r0) goto L_0x03f2
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r18
            r6 = r22
            r8 = r34
            int r0 = r0.n(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x03ae
            goto L_0x03a5
        L_0x03f2:
            r7 = r33
            r2 = r15
            goto L_0x03a8
        L_0x03f6:
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r15
            r4 = r32
            r5 = r24
            r7 = r6
            r6 = r31
            r9 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r10 = r22
            r12 = r18
            r13 = r34
            int r0 = r0.l(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0477
            goto L_0x03a5
        L_0x0415:
            if (r8 != r7) goto L_0x0419
            if (r7 != 0) goto L_0x041c
        L_0x0419:
            r9 = r28
            goto L_0x0427
        L_0x041c:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r28
            r0 = r2
            r3 = r8
            r5 = r19
            goto L_0x049c
        L_0x0427:
            boolean r0 = r9.f7594f
            if (r0 == 0) goto L_0x0463
            r10 = r34
            com.google.android.gms.internal.vision.A0 r0 = r10.f7424d
            com.google.android.gms.internal.vision.A0 r1 = com.google.android.gms.internal.vision.A0.b()
            if (r0 == r1) goto L_0x0460
            com.google.android.gms.internal.vision.t1 r0 = r9.f7593e
            com.google.android.gms.internal.vision.A0 r1 = r10.f7424d
            r11 = r31
            r1.a(r0, r11)
            com.google.android.gms.internal.vision.d2 r4 = R(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.vision.C0488b0.b(r0, r1, r2, r3, r4, r5)
        L_0x044d:
            r14 = r29
            r12 = r30
            r13 = r32
            r3 = r8
            r15 = r9
            r9 = r10
            r1 = r11
            r2 = r18
            r5 = r19
            r10 = r25
            r11 = r7
            goto L_0x001a
        L_0x0460:
            r11 = r31
            goto L_0x0467
        L_0x0463:
            r11 = r31
            r10 = r34
        L_0x0467:
            com.google.android.gms.internal.vision.d2 r4 = R(r29)
            r0 = r8
            r1 = r30
            r3 = r32
            r5 = r34
            int r0 = com.google.android.gms.internal.vision.C0488b0.b(r0, r1, r2, r3, r4, r5)
            goto L_0x044d
        L_0x0477:
            r11 = r31
            r8 = r24
            r15 = r28
            r14 = r29
            r12 = r30
            r13 = r32
            r9 = r34
            r3 = r8
            r1 = r11
            r2 = r18
            r5 = r19
            r6 = r21
            r10 = r25
            goto L_0x00e4
        L_0x0491:
            r19 = r5
            r21 = r6
            r25 = r10
            r7 = r11
            r9 = r15
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x049c:
            if (r6 == r1) goto L_0x04a7
            long r1 = (long) r6
            r4 = r29
            r6 = r25
            r6.putInt(r4, r1, r5)
            goto L_0x04a9
        L_0x04a7:
            r4 = r29
        L_0x04a9:
            int r1 = r9.f7599k
            r2 = 0
        L_0x04ac:
            int r5 = r9.f7600l
            if (r1 >= r5) goto L_0x04bf
            int[] r5 = r9.f7598j
            r5 = r5[r1]
            com.google.android.gms.internal.vision.a2 r6 = r9.f7603o
            java.lang.Object r2 = r9.s(r4, r5, r2, r6)
            com.google.android.gms.internal.vision.d2 r2 = (com.google.android.gms.internal.vision.C0498d2) r2
            int r1 = r1 + 1
            goto L_0x04ac
        L_0x04bf:
            if (r2 == 0) goto L_0x04c6
            com.google.android.gms.internal.vision.a2 r1 = r9.f7603o
            r1.h(r4, r2)
        L_0x04c6:
            if (r7 != 0) goto L_0x04d2
            r1 = r32
            if (r0 != r1) goto L_0x04cd
            goto L_0x04d8
        L_0x04cd:
            com.google.android.gms.internal.vision.W0 r0 = com.google.android.gms.internal.vision.W0.e()
            throw r0
        L_0x04d2:
            r1 = r32
            if (r0 > r1) goto L_0x04d9
            if (r3 != r7) goto L_0x04d9
        L_0x04d8:
            return r0
        L_0x04d9:
            com.google.android.gms.internal.vision.W0 r0 = com.google.android.gms.internal.vision.W0.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0558x1.o(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.vision.c0):int");
    }

    public final K1 q(int i4) {
        int i5 = (i4 / 3) << 1;
        K1 k12 = (K1) this.f7590b[i5];
        if (k12 != null) {
            return k12;
        }
        K1 b4 = F1.a().b((Class) this.f7590b[i5 + 1]);
        this.f7590b[i5] = b4;
        return b4;
    }

    public final Object r(int i4, int i5, Map map, S0 s02, Object obj, C0486a2 a2Var) {
        this.f7605q.g(F(i4));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!s02.b(((Integer) entry.getValue()).intValue())) {
                if (obj == null) {
                    obj = a2Var.a();
                }
                C0534p0 F4 = C0507g0.F(C0523l1.a((C0532o1) null, entry.getKey(), entry.getValue()));
                try {
                    C0523l1.b(F4.b(), (C0532o1) null, entry.getKey(), entry.getValue());
                    a2Var.c(obj, i5, F4.a());
                    it.remove();
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return obj;
    }

    public final Object s(Object obj, int i4, Object obj2, C0486a2 a2Var) {
        S0 L4;
        int i5 = this.f7589a[i4];
        Object F4 = h2.F(obj, (long) (N(i4) & 1048575));
        if (F4 == null || (L4 = L(i4)) == null) {
            return obj2;
        }
        return r(i4, i5, this.f7605q.b(F4), L4, obj2, a2Var);
    }

    public final void x(y2 y2Var, int i4, Object obj, int i5) {
        if (obj != null) {
            this.f7605q.g(F(i5));
            y2Var.I(i4, (C0532o1) null, this.f7605q.c(obj));
        }
    }

    public final void y(Object obj, Object obj2, int i4) {
        long N4 = (long) (N(i4) & 1048575);
        if (z(obj2, i4)) {
            Object F4 = h2.F(obj, N4);
            Object F5 = h2.F(obj2, N4);
            if (F4 != null && F5 != null) {
                h2.j(obj, N4, R0.e(F4, F5));
                G(obj, i4);
            } else if (F5 != null) {
                h2.j(obj, N4, F5);
                G(obj, i4);
            }
        }
    }

    public final boolean z(Object obj, int i4) {
        int P4 = P(i4);
        long j4 = (long) (P4 & 1048575);
        if (j4 == 1048575) {
            int N4 = N(i4);
            long j5 = (long) (N4 & 1048575);
            switch ((N4 & 267386880) >>> 20) {
                case 0:
                    return h2.C(obj, j5) != 0.0d;
                case 1:
                    return h2.x(obj, j5) != 0.0f;
                case 2:
                    return h2.o(obj, j5) != 0;
                case 3:
                    return h2.o(obj, j5) != 0;
                case 4:
                    return h2.b(obj, j5) != 0;
                case 5:
                    return h2.o(obj, j5) != 0;
                case 6:
                    return h2.b(obj, j5) != 0;
                case 7:
                    return h2.w(obj, j5);
                case 8:
                    Object F4 = h2.F(obj, j5);
                    if (F4 instanceof String) {
                        return !((String) F4).isEmpty();
                    }
                    if (F4 instanceof C0507g0) {
                        return !C0507g0.f7445f.equals(F4);
                    }
                    throw new IllegalArgumentException();
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION:
                    return h2.F(obj, j5) != null;
                case IBulkCursor.GET_EXTRAS_TRANSACTION:
                    return !C0507g0.f7445f.equals(h2.F(obj, j5));
                case IBulkCursor.RESPOND_TRANSACTION:
                    return h2.b(obj, j5) != 0;
                case IBulkCursor.CLOSE_TRANSACTION:
                    return h2.b(obj, j5) != 0;
                case 13:
                    return h2.b(obj, j5) != 0;
                case 14:
                    return h2.o(obj, j5) != 0;
                case 15:
                    return h2.b(obj, j5) != 0;
                case SQLiteDatabase.NO_LOCALIZED_COLLATORS:
                    return h2.o(obj, j5) != 0;
                case 17:
                    return h2.F(obj, j5) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (h2.b(obj, j4) & (1 << (P4 >>> 20))) != 0;
        }
    }
}
