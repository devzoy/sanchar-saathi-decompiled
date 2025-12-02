package A;

import z.d;

public abstract class b {
    public static void a(f fVar, d dVar, int i4) {
        int i5;
        c[] cVarArr;
        int i6;
        if (i4 == 0) {
            i6 = fVar.f130G0;
            cVarArr = fVar.f133J0;
            i5 = 0;
        } else {
            i6 = fVar.f131H0;
            cVarArr = fVar.f132I0;
            i5 = 2;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            c cVar = cVarArr[i7];
            cVar.a();
            b(fVar, dVar, i4, i5, cVar);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: A.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: z.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: z.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: A.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: z.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: A.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: z.i} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: A.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: A.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: z.i} */
    /* JADX WARNING: type inference failed for: r5v10, types: [z.i] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r7 == 2) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        if (r7 == 2) goto L_0x002f;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0249 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x03a1  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x04b6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x04d4  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x04d7  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x04db  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x04ef A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x038f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:314:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x018c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(A.f r37, z.d r38, int r39, int r40, A.c r41) {
        /*
            r0 = r37
            r9 = r38
            r1 = r41
            A.e r10 = r1.f3a
            A.e r11 = r1.f5c
            A.e r12 = r1.f4b
            A.e r13 = r1.f6d
            A.e r2 = r1.f7e
            float r3 = r1.f13k
            A.e$b[] r4 = r0.f56M
            r4 = r4[r39]
            A.e$b r5 = A.e.b.WRAP_CONTENT
            r14 = 1
            if (r4 != r5) goto L_0x001d
            r4 = r14
            goto L_0x001e
        L_0x001d:
            r4 = 0
        L_0x001e:
            r5 = 2
            if (r39 != 0) goto L_0x0038
            int r7 = r2.f95m0
            if (r7 != 0) goto L_0x0027
            r8 = r14
            goto L_0x0028
        L_0x0027:
            r8 = 0
        L_0x0028:
            if (r7 != r14) goto L_0x002c
            r15 = r14
            goto L_0x002d
        L_0x002c:
            r15 = 0
        L_0x002d:
            if (r7 != r5) goto L_0x0031
        L_0x002f:
            r5 = r14
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            r16 = r15
            r7 = 0
            r15 = r8
            r8 = r10
            goto L_0x0047
        L_0x0038:
            int r7 = r2.f97n0
            if (r7 != 0) goto L_0x003e
            r8 = r14
            goto L_0x003f
        L_0x003e:
            r8 = 0
        L_0x003f:
            if (r7 != r14) goto L_0x0043
            r15 = r14
            goto L_0x0044
        L_0x0043:
            r15 = 0
        L_0x0044:
            if (r7 != r5) goto L_0x0031
            goto L_0x002f
        L_0x0047:
            r20 = 0
            if (r7 != 0) goto L_0x0123
            A.d[] r6 = r8.f53J
            r6 = r6[r40]
            if (r5 == 0) goto L_0x0054
            r18 = 1
            goto L_0x0056
        L_0x0054:
            r18 = 4
        L_0x0056:
            int r22 = r6.b()
            A.e$b[] r14 = r8.f56M
            r14 = r14[r39]
            r24 = r3
            A.e$b r3 = A.e.b.MATCH_CONSTRAINT
            if (r14 != r3) goto L_0x006e
            int[] r14 = r8.f96n
            r14 = r14[r39]
            if (r14 != 0) goto L_0x006e
            r25 = r7
            r14 = 1
            goto L_0x0071
        L_0x006e:
            r25 = r7
            r14 = 0
        L_0x0071:
            A.d r7 = r6.f28d
            if (r7 == 0) goto L_0x007d
            if (r8 == r10) goto L_0x007d
            int r7 = r7.b()
            int r22 = r22 + r7
        L_0x007d:
            r7 = r22
            if (r5 == 0) goto L_0x008a
            if (r8 == r10) goto L_0x008a
            if (r8 == r12) goto L_0x008a
            r22 = r15
            r18 = 5
            goto L_0x008c
        L_0x008a:
            r22 = r15
        L_0x008c:
            A.d r15 = r6.f28d
            if (r15 == 0) goto L_0x00be
            if (r8 != r12) goto L_0x009f
            r26 = r2
            z.i r2 = r6.f31g
            z.i r15 = r15.f31g
            r27 = r10
            r10 = 6
            r9.h(r2, r15, r7, r10)
            goto L_0x00ac
        L_0x009f:
            r26 = r2
            r27 = r10
            z.i r2 = r6.f31g
            z.i r10 = r15.f31g
            r15 = 8
            r9.h(r2, r10, r7, r15)
        L_0x00ac:
            if (r14 == 0) goto L_0x00b2
            if (r5 != 0) goto L_0x00b2
            r2 = 5
            goto L_0x00b4
        L_0x00b2:
            r2 = r18
        L_0x00b4:
            z.i r10 = r6.f31g
            A.d r6 = r6.f28d
            z.i r6 = r6.f31g
            r9.e(r10, r6, r7, r2)
            goto L_0x00c2
        L_0x00be:
            r26 = r2
            r27 = r10
        L_0x00c2:
            if (r4 == 0) goto L_0x00f6
            int r2 = r8.M()
            r6 = 8
            if (r2 == r6) goto L_0x00e4
            A.e$b[] r2 = r8.f56M
            r2 = r2[r39]
            if (r2 != r3) goto L_0x00e4
            A.d[] r2 = r8.f53J
            int r3 = r40 + 1
            r3 = r2[r3]
            z.i r3 = r3.f31g
            r2 = r2[r40]
            z.i r2 = r2.f31g
            r6 = 0
            r7 = 5
            r9.h(r3, r2, r6, r7)
            goto L_0x00e5
        L_0x00e4:
            r6 = 0
        L_0x00e5:
            A.d[] r2 = r8.f53J
            r2 = r2[r40]
            z.i r2 = r2.f31g
            A.d[] r3 = r0.f53J
            r3 = r3[r40]
            z.i r3 = r3.f31g
            r7 = 8
            r9.h(r2, r3, r6, r7)
        L_0x00f6:
            A.d[] r2 = r8.f53J
            int r3 = r40 + 1
            r2 = r2[r3]
            A.d r2 = r2.f28d
            if (r2 == 0) goto L_0x0111
            A.e r2 = r2.f26b
            A.d[] r3 = r2.f53J
            r3 = r3[r40]
            A.d r3 = r3.f28d
            if (r3 == 0) goto L_0x0111
            A.e r3 = r3.f26b
            if (r3 == r8) goto L_0x010f
            goto L_0x0111
        L_0x010f:
            r20 = r2
        L_0x0111:
            if (r20 == 0) goto L_0x0118
            r8 = r20
            r7 = r25
            goto L_0x0119
        L_0x0118:
            r7 = 1
        L_0x0119:
            r15 = r22
            r3 = r24
            r2 = r26
            r10 = r27
            goto L_0x0047
        L_0x0123:
            r26 = r2
            r24 = r3
            r27 = r10
            r22 = r15
            if (r13 == 0) goto L_0x0189
            A.d[] r2 = r11.f53J
            int r3 = r40 + 1
            r2 = r2[r3]
            A.d r2 = r2.f28d
            if (r2 == 0) goto L_0x0189
            A.d[] r2 = r13.f53J
            r2 = r2[r3]
            A.e$b[] r6 = r13.f56M
            r6 = r6[r39]
            A.e$b r7 = A.e.b.MATCH_CONSTRAINT
            if (r6 != r7) goto L_0x015f
            int[] r6 = r13.f96n
            r6 = r6[r39]
            if (r6 != 0) goto L_0x015f
            if (r5 != 0) goto L_0x015f
            A.d r6 = r2.f28d
            A.e r7 = r6.f26b
            if (r7 != r0) goto L_0x015f
            z.i r7 = r2.f31g
            z.i r6 = r6.f31g
            int r8 = r2.b()
            int r8 = -r8
            r10 = 5
            r9.e(r7, r6, r8, r10)
            goto L_0x0175
        L_0x015f:
            r10 = 5
            if (r5 == 0) goto L_0x0175
            A.d r6 = r2.f28d
            A.e r7 = r6.f26b
            if (r7 != r0) goto L_0x0175
            z.i r7 = r2.f31g
            z.i r6 = r6.f31g
            int r8 = r2.b()
            int r8 = -r8
            r14 = 4
            r9.e(r7, r6, r8, r14)
        L_0x0175:
            z.i r6 = r2.f31g
            A.d[] r7 = r11.f53J
            r3 = r7[r3]
            A.d r3 = r3.f28d
            z.i r3 = r3.f31g
            int r2 = r2.b()
            int r2 = -r2
            r7 = 6
            r9.j(r6, r3, r2, r7)
            goto L_0x018a
        L_0x0189:
            r10 = 5
        L_0x018a:
            if (r4 == 0) goto L_0x01a3
            A.d[] r0 = r0.f53J
            int r2 = r40 + 1
            r0 = r0[r2]
            z.i r0 = r0.f31g
            A.d[] r3 = r11.f53J
            r2 = r3[r2]
            z.i r3 = r2.f31g
            int r2 = r2.b()
            r4 = 8
            r9.h(r0, r3, r2, r4)
        L_0x01a3:
            java.util.ArrayList r0 = r1.f10h
            if (r0 == 0) goto L_0x0247
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0247
            boolean r3 = r1.f20r
            if (r3 == 0) goto L_0x01ba
            boolean r3 = r1.f22t
            if (r3 != 0) goto L_0x01ba
            int r3 = r1.f12j
            float r3 = (float) r3
            goto L_0x01bc
        L_0x01ba:
            r3 = r24
        L_0x01bc:
            r4 = 0
            r29 = r4
            r7 = r20
            r6 = 0
        L_0x01c2:
            if (r6 >= r2) goto L_0x0247
            java.lang.Object r8 = r0.get(r6)
            A.e r8 = (A.e) r8
            float[] r14 = r8.f103q0
            r14 = r14[r39]
            int r15 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r15 >= 0) goto L_0x01ec
            boolean r14 = r1.f22t
            if (r14 == 0) goto L_0x01e8
            A.d[] r8 = r8.f53J
            int r14 = r40 + 1
            r14 = r8[r14]
            z.i r14 = r14.f31g
            r8 = r8[r40]
            z.i r8 = r8.f31g
            r10 = 4
            r15 = 0
            r9.e(r14, r8, r15, r10)
            goto L_0x0203
        L_0x01e8:
            r10 = 4
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x01ed
        L_0x01ec:
            r10 = 4
        L_0x01ed:
            int r15 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r15 != 0) goto L_0x0206
            A.d[] r8 = r8.f53J
            int r14 = r40 + 1
            r14 = r8[r14]
            z.i r14 = r14.f31g
            r8 = r8[r40]
            z.i r8 = r8.f31g
            r4 = 8
            r15 = 0
            r9.e(r14, r8, r15, r4)
        L_0x0203:
            r17 = r0
            goto L_0x023f
        L_0x0206:
            r15 = 0
            if (r7 == 0) goto L_0x023a
            A.d[] r4 = r7.f53J
            r7 = r4[r40]
            z.i r7 = r7.f31g
            int r17 = r40 + 1
            r4 = r4[r17]
            z.i r4 = r4.f31g
            A.d[] r10 = r8.f53J
            r15 = r10[r40]
            z.i r15 = r15.f31g
            r10 = r10[r17]
            z.i r10 = r10.f31g
            r17 = r0
            z.b r0 = r38.r()
            r28 = r0
            r30 = r3
            r31 = r14
            r32 = r7
            r33 = r4
            r34 = r15
            r35 = r10
            r28.l(r29, r30, r31, r32, r33, r34, r35)
            r9.d(r0)
            goto L_0x023c
        L_0x023a:
            r17 = r0
        L_0x023c:
            r7 = r8
            r29 = r14
        L_0x023f:
            int r6 = r6 + 1
            r0 = r17
            r4 = 0
            r10 = 5
            goto L_0x01c2
        L_0x0247:
            if (r12 == 0) goto L_0x0250
            if (r12 == r13) goto L_0x024d
            if (r5 == 0) goto L_0x0250
        L_0x024d:
            r10 = r27
            goto L_0x0253
        L_0x0250:
            r10 = r27
            goto L_0x02a3
        L_0x0253:
            A.d[] r0 = r10.f53J
            r0 = r0[r40]
            A.d[] r1 = r11.f53J
            int r2 = r40 + 1
            r1 = r1[r2]
            A.d r0 = r0.f28d
            if (r0 == 0) goto L_0x0265
            z.i r0 = r0.f31g
            r3 = r0
            goto L_0x0267
        L_0x0265:
            r3 = r20
        L_0x0267:
            A.d r0 = r1.f28d
            if (r0 == 0) goto L_0x026f
            z.i r0 = r0.f31g
            r5 = r0
            goto L_0x0271
        L_0x026f:
            r5 = r20
        L_0x0271:
            A.d[] r0 = r12.f53J
            r0 = r0[r40]
            A.d[] r1 = r13.f53J
            r1 = r1[r2]
            if (r3 == 0) goto L_0x04b4
            if (r5 == 0) goto L_0x04b4
            if (r39 != 0) goto L_0x0285
            r2 = r26
            float r2 = r2.f73b0
        L_0x0283:
            r4 = r2
            goto L_0x028a
        L_0x0285:
            r2 = r26
            float r2 = r2.f75c0
            goto L_0x0283
        L_0x028a:
            int r6 = r0.b()
            int r7 = r1.b()
            z.i r2 = r0.f31g
            z.i r8 = r1.f31g
            r10 = 7
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x04b4
        L_0x02a3:
            if (r22 == 0) goto L_0x0393
            if (r12 == 0) goto L_0x0393
            int r0 = r1.f12j
            if (r0 <= 0) goto L_0x02b2
            int r1 = r1.f11i
            if (r1 != r0) goto L_0x02b2
            r23 = 1
            goto L_0x02b4
        L_0x02b2:
            r23 = 0
        L_0x02b4:
            r14 = r12
            r15 = r14
        L_0x02b6:
            if (r14 == 0) goto L_0x04b4
            A.e[] r0 = r14.f107s0
            r0 = r0[r39]
            r8 = r0
        L_0x02bd:
            if (r8 == 0) goto L_0x02cc
            int r0 = r8.M()
            r6 = 8
            if (r0 != r6) goto L_0x02ce
            A.e[] r0 = r8.f107s0
            r8 = r0[r39]
            goto L_0x02bd
        L_0x02cc:
            r6 = 8
        L_0x02ce:
            if (r8 != 0) goto L_0x02d9
            if (r14 != r13) goto L_0x02d3
            goto L_0x02d9
        L_0x02d3:
            r17 = r8
            r19 = 5
            goto L_0x0386
        L_0x02d9:
            A.d[] r0 = r14.f53J
            r0 = r0[r40]
            z.i r1 = r0.f31g
            A.d r2 = r0.f28d
            if (r2 == 0) goto L_0x02e6
            z.i r2 = r2.f31g
            goto L_0x02e8
        L_0x02e6:
            r2 = r20
        L_0x02e8:
            if (r15 == r14) goto L_0x02f3
            A.d[] r2 = r15.f53J
            int r3 = r40 + 1
            r2 = r2[r3]
            z.i r2 = r2.f31g
            goto L_0x0304
        L_0x02f3:
            if (r14 != r12) goto L_0x0304
            if (r15 != r14) goto L_0x0304
            A.d[] r2 = r10.f53J
            r2 = r2[r40]
            A.d r2 = r2.f28d
            if (r2 == 0) goto L_0x0302
            z.i r2 = r2.f31g
            goto L_0x0304
        L_0x0302:
            r2 = r20
        L_0x0304:
            int r0 = r0.b()
            A.d[] r3 = r14.f53J
            int r4 = r40 + 1
            r3 = r3[r4]
            int r3 = r3.b()
            if (r8 == 0) goto L_0x0326
            A.d[] r5 = r8.f53J
            r5 = r5[r40]
            z.i r7 = r5.f31g
            A.d[] r6 = r14.f53J
            r6 = r6[r4]
            z.i r6 = r6.f31g
            r36 = r7
            r7 = r6
            r6 = r36
            goto L_0x0339
        L_0x0326:
            A.d[] r5 = r11.f53J
            r5 = r5[r4]
            A.d r5 = r5.f28d
            if (r5 == 0) goto L_0x0331
            z.i r6 = r5.f31g
            goto L_0x0333
        L_0x0331:
            r6 = r20
        L_0x0333:
            A.d[] r7 = r14.f53J
            r7 = r7[r4]
            z.i r7 = r7.f31g
        L_0x0339:
            if (r5 == 0) goto L_0x0340
            int r5 = r5.b()
            int r3 = r3 + r5
        L_0x0340:
            if (r15 == 0) goto L_0x034b
            A.d[] r5 = r15.f53J
            r5 = r5[r4]
            int r5 = r5.b()
            int r0 = r0 + r5
        L_0x034b:
            if (r1 == 0) goto L_0x02d3
            if (r2 == 0) goto L_0x02d3
            if (r6 == 0) goto L_0x02d3
            if (r7 == 0) goto L_0x02d3
            if (r14 != r12) goto L_0x035d
            A.d[] r0 = r12.f53J
            r0 = r0[r40]
            int r0 = r0.b()
        L_0x035d:
            r5 = r0
            if (r14 != r13) goto L_0x036b
            A.d[] r0 = r13.f53J
            r0 = r0[r4]
            int r0 = r0.b()
            r17 = r0
            goto L_0x036d
        L_0x036b:
            r17 = r3
        L_0x036d:
            if (r23 == 0) goto L_0x0372
            r18 = 8
            goto L_0x0374
        L_0x0372:
            r18 = 5
        L_0x0374:
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r3 = r5
            r5 = r6
            r19 = 5
            r6 = r7
            r7 = r17
            r17 = r8
            r8 = r18
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0386:
            int r0 = r14.M()
            r8 = 8
            if (r0 == r8) goto L_0x038f
            r15 = r14
        L_0x038f:
            r14 = r17
            goto L_0x02b6
        L_0x0393:
            r8 = 8
            if (r16 == 0) goto L_0x04b4
            if (r12 == 0) goto L_0x04b4
            int r0 = r1.f12j
            if (r0 <= 0) goto L_0x03a4
            int r1 = r1.f11i
            if (r1 != r0) goto L_0x03a4
            r23 = 1
            goto L_0x03a6
        L_0x03a4:
            r23 = 0
        L_0x03a6:
            r14 = r12
            r15 = r14
        L_0x03a8:
            if (r14 == 0) goto L_0x045f
            A.e[] r0 = r14.f107s0
            r0 = r0[r39]
        L_0x03ae:
            if (r0 == 0) goto L_0x03bb
            int r1 = r0.M()
            if (r1 != r8) goto L_0x03bb
            A.e[] r0 = r0.f107s0
            r0 = r0[r39]
            goto L_0x03ae
        L_0x03bb:
            if (r14 == r12) goto L_0x044c
            if (r14 == r13) goto L_0x044c
            if (r0 == 0) goto L_0x044c
            if (r0 != r13) goto L_0x03c6
            r7 = r20
            goto L_0x03c7
        L_0x03c6:
            r7 = r0
        L_0x03c7:
            A.d[] r0 = r14.f53J
            r0 = r0[r40]
            z.i r1 = r0.f31g
            A.d r2 = r0.f28d
            if (r2 == 0) goto L_0x03d3
            z.i r2 = r2.f31g
        L_0x03d3:
            A.d[] r2 = r15.f53J
            int r3 = r40 + 1
            r2 = r2[r3]
            z.i r2 = r2.f31g
            int r0 = r0.b()
            A.d[] r4 = r14.f53J
            r4 = r4[r3]
            int r4 = r4.b()
            if (r7 == 0) goto L_0x03f9
            A.d[] r5 = r7.f53J
            r5 = r5[r40]
            z.i r6 = r5.f31g
            A.d r8 = r5.f28d
            if (r8 == 0) goto L_0x03f6
            z.i r8 = r8.f31g
            goto L_0x040a
        L_0x03f6:
            r8 = r20
            goto L_0x040a
        L_0x03f9:
            A.d[] r5 = r13.f53J
            r5 = r5[r40]
            if (r5 == 0) goto L_0x0402
            z.i r6 = r5.f31g
            goto L_0x0404
        L_0x0402:
            r6 = r20
        L_0x0404:
            A.d[] r8 = r14.f53J
            r8 = r8[r3]
            z.i r8 = r8.f31g
        L_0x040a:
            if (r5 == 0) goto L_0x0411
            int r5 = r5.b()
            int r4 = r4 + r5
        L_0x0411:
            r17 = r4
            A.d[] r4 = r15.f53J
            r3 = r4[r3]
            int r3 = r3.b()
            int r3 = r3 + r0
            if (r23 == 0) goto L_0x0421
            r19 = 8
            goto L_0x0423
        L_0x0421:
            r19 = 4
        L_0x0423:
            if (r1 == 0) goto L_0x0441
            if (r2 == 0) goto L_0x0441
            if (r6 == 0) goto L_0x0441
            if (r8 == 0) goto L_0x0441
            r4 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r5 = r6
            r18 = 4
            r6 = r8
            r21 = r7
            r7 = r17
            r17 = r15
            r15 = 8
            r8 = r19
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0449
        L_0x0441:
            r21 = r7
            r17 = r15
            r15 = 8
            r18 = 4
        L_0x0449:
            r0 = r21
            goto L_0x0451
        L_0x044c:
            r17 = r15
            r18 = 4
            r15 = r8
        L_0x0451:
            int r1 = r14.M()
            if (r1 == r15) goto L_0x0458
            goto L_0x045a
        L_0x0458:
            r14 = r17
        L_0x045a:
            r8 = r15
            r15 = r14
            r14 = r0
            goto L_0x03a8
        L_0x045f:
            A.d[] r0 = r12.f53J
            r0 = r0[r40]
            A.d[] r1 = r10.f53J
            r1 = r1[r40]
            A.d r1 = r1.f28d
            A.d[] r2 = r13.f53J
            int r3 = r40 + 1
            r10 = r2[r3]
            A.d[] r2 = r11.f53J
            r2 = r2[r3]
            A.d r14 = r2.f28d
            r15 = 5
            if (r1 == 0) goto L_0x04a4
            if (r12 == r13) goto L_0x0486
            z.i r2 = r0.f31g
            z.i r1 = r1.f31g
            int r0 = r0.b()
            r9.e(r2, r1, r0, r15)
            goto L_0x04a4
        L_0x0486:
            if (r14 == 0) goto L_0x04a4
            z.i r2 = r0.f31g
            z.i r3 = r1.f31g
            int r4 = r0.b()
            z.i r5 = r10.f31g
            z.i r6 = r14.f31g
            int r7 = r10.b()
            r8 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r8
            r8 = r15
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x04a4:
            if (r14 == 0) goto L_0x04b4
            if (r12 == r13) goto L_0x04b4
            z.i r0 = r10.f31g
            z.i r1 = r14.f31g
            int r2 = r10.b()
            int r2 = -r2
            r9.e(r0, r1, r2, r15)
        L_0x04b4:
            if (r22 != 0) goto L_0x04b8
            if (r16 == 0) goto L_0x050e
        L_0x04b8:
            if (r12 == 0) goto L_0x050e
            if (r12 == r13) goto L_0x050e
            A.d[] r0 = r12.f53J
            r1 = r0[r40]
            A.d[] r2 = r13.f53J
            r3 = 1
            int r3 = r40 + 1
            r2 = r2[r3]
            A.d r4 = r1.f28d
            if (r4 == 0) goto L_0x04ce
            z.i r4 = r4.f31g
            goto L_0x04d0
        L_0x04ce:
            r4 = r20
        L_0x04d0:
            A.d r5 = r2.f28d
            if (r5 == 0) goto L_0x04d7
            z.i r5 = r5.f31g
            goto L_0x04d9
        L_0x04d7:
            r5 = r20
        L_0x04d9:
            if (r11 == r13) goto L_0x04e9
            A.d[] r5 = r11.f53J
            r5 = r5[r3]
            A.d r5 = r5.f28d
            if (r5 == 0) goto L_0x04e7
            z.i r5 = r5.f31g
            r20 = r5
        L_0x04e7:
            r5 = r20
        L_0x04e9:
            if (r12 != r13) goto L_0x04ed
            r2 = r0[r3]
        L_0x04ed:
            if (r4 == 0) goto L_0x050e
            if (r5 == 0) goto L_0x050e
            int r6 = r1.b()
            A.d[] r0 = r13.f53J
            r0 = r0[r3]
            int r7 = r0.b()
            z.i r1 = r1.f31g
            z.i r8 = r2.f31g
            r10 = 5
            r11 = 1056964608(0x3f000000, float:0.5)
            r0 = r38
            r2 = r4
            r3 = r6
            r4 = r11
            r6 = r8
            r8 = r10
            r0.c(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x050e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A.b.b(A.f, z.d, int, int, A.c):void");
    }
}
