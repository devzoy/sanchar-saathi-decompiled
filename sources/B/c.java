package B;

import A.d;
import A.e;
import A.f;
import java.util.ArrayList;
import java.util.Iterator;

public class c extends m {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f178k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public int f179l;

    public c(e eVar, int i4) {
        super(eVar);
        this.f229f = i4;
        q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01ad, code lost:
        if (r1 != r7) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01d3, code lost:
        if (r1 != r7) goto L_0x01d5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(B.d r26) {
        /*
            r25 = this;
            r0 = r25
            B.f r1 = r0.f231h
            boolean r1 = r1.f198j
            if (r1 == 0) goto L_0x043d
            B.f r1 = r0.f232i
            boolean r1 = r1.f198j
            if (r1 != 0) goto L_0x0010
            goto L_0x043d
        L_0x0010:
            A.e r1 = r0.f225b
            A.e r1 = r1.E()
            if (r1 == 0) goto L_0x0023
            boolean r3 = r1 instanceof A.f
            if (r3 == 0) goto L_0x0023
            A.f r1 = (A.f) r1
            boolean r1 = r1.V0()
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            B.f r3 = r0.f232i
            int r3 = r3.f195g
            B.f r4 = r0.f231h
            int r4 = r4.f195g
            int r3 = r3 - r4
            java.util.ArrayList r4 = r0.f178k
            int r4 = r4.size()
            r5 = 0
        L_0x0034:
            r6 = -1
            r7 = 8
            if (r5 >= r4) goto L_0x004c
            java.util.ArrayList r8 = r0.f178k
            java.lang.Object r8 = r8.get(r5)
            B.m r8 = (B.m) r8
            A.e r8 = r8.f225b
            int r8 = r8.M()
            if (r8 != r7) goto L_0x004d
            int r5 = r5 + 1
            goto L_0x0034
        L_0x004c:
            r5 = r6
        L_0x004d:
            int r8 = r4 + -1
            r9 = r8
        L_0x0050:
            if (r9 < 0) goto L_0x0066
            java.util.ArrayList r10 = r0.f178k
            java.lang.Object r10 = r10.get(r9)
            B.m r10 = (B.m) r10
            A.e r10 = r10.f225b
            int r10 = r10.M()
            if (r10 != r7) goto L_0x0065
            int r9 = r9 + -1
            goto L_0x0050
        L_0x0065:
            r6 = r9
        L_0x0066:
            r9 = 0
        L_0x0067:
            r11 = 2
            if (r9 >= r11) goto L_0x010b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0071:
            if (r13 >= r4) goto L_0x00fd
            java.util.ArrayList r2 = r0.f178k
            java.lang.Object r2 = r2.get(r13)
            B.m r2 = (B.m) r2
            A.e r11 = r2.f225b
            int r11 = r11.M()
            if (r11 != r7) goto L_0x0085
            goto L_0x00f6
        L_0x0085:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0090
            if (r13 < r5) goto L_0x0090
            B.f r11 = r2.f231h
            int r11 = r11.f194f
            int r14 = r14 + r11
        L_0x0090:
            B.g r11 = r2.f228e
            int r7 = r11.f195g
            A.e$b r10 = r2.f227d
            A.e$b r12 = A.e.b.MATCH_CONSTRAINT
            if (r10 == r12) goto L_0x009c
            r10 = 1
            goto L_0x009d
        L_0x009c:
            r10 = 0
        L_0x009d:
            if (r10 == 0) goto L_0x00bf
            int r11 = r0.f229f
            if (r11 != 0) goto L_0x00ae
            A.e r12 = r2.f225b
            B.j r12 = r12.f78e
            B.g r12 = r12.f228e
            boolean r12 = r12.f198j
            if (r12 != 0) goto L_0x00ae
            return
        L_0x00ae:
            r12 = 1
            if (r11 != r12) goto L_0x00bc
            A.e r11 = r2.f225b
            B.l r11 = r11.f80f
            B.g r11 = r11.f228e
            boolean r11 = r11.f198j
            if (r11 != 0) goto L_0x00bc
            return
        L_0x00bc:
            r19 = r7
            goto L_0x00d5
        L_0x00bf:
            r19 = r7
            r12 = 1
            int r7 = r2.f224a
            if (r7 != r12) goto L_0x00ce
            if (r9 != 0) goto L_0x00ce
            int r7 = r11.f210m
            int r15 = r15 + 1
        L_0x00cc:
            r10 = 1
            goto L_0x00d7
        L_0x00ce:
            boolean r7 = r11.f198j
            if (r7 == 0) goto L_0x00d5
            r7 = r19
            goto L_0x00cc
        L_0x00d5:
            r7 = r19
        L_0x00d7:
            if (r10 != 0) goto L_0x00eb
            int r15 = r15 + 1
            A.e r7 = r2.f225b
            float[] r7 = r7.f103q0
            int r10 = r0.f229f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00ec
            float r17 = r17 + r7
            goto L_0x00ec
        L_0x00eb:
            int r14 = r14 + r7
        L_0x00ec:
            if (r13 >= r8) goto L_0x00f6
            if (r13 >= r6) goto L_0x00f6
            B.f r2 = r2.f232i
            int r2 = r2.f194f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x00f6:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0071
        L_0x00fd:
            if (r14 < r3) goto L_0x0108
            if (r15 != 0) goto L_0x0102
            goto L_0x0108
        L_0x0102:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0067
        L_0x0108:
            r2 = r16
            goto L_0x0110
        L_0x010b:
            r2 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x0110:
            B.f r7 = r0.f231h
            int r7 = r7.f195g
            if (r1 == 0) goto L_0x011a
            B.f r7 = r0.f232i
            int r7 = r7.f195g
        L_0x011a:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r3) goto L_0x0131
            r10 = 1073741824(0x40000000, float:2.0)
            if (r1 == 0) goto L_0x012a
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x0131
        L_0x012a:
            int r11 = r14 - r3
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x0131:
            if (r15 <= 0) goto L_0x023b
            int r10 = r3 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x013d:
            if (r12 >= r4) goto L_0x01ef
            java.util.ArrayList r9 = r0.f178k
            java.lang.Object r9 = r9.get(r12)
            B.m r9 = (B.m) r9
            r19 = r11
            A.e r11 = r9.f225b
            int r11 = r11.M()
            r20 = r14
            r14 = 8
            if (r11 != r14) goto L_0x015f
        L_0x0155:
            r23 = r1
            r24 = r2
            r21 = r7
            r22 = r10
            goto L_0x01dd
        L_0x015f:
            A.e$b r11 = r9.f227d
            A.e$b r14 = A.e.b.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x0155
            B.g r11 = r9.f228e
            boolean r14 = r11.f198j
            if (r14 != 0) goto L_0x0155
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0182
            A.e r14 = r9.f225b
            float[] r14 = r14.f103q0
            r21 = r7
            int r7 = r0.f229f
            r7 = r14[r7]
            float r7 = r7 * r10
            float r7 = r7 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r14
            int r7 = (int) r7
            goto L_0x0186
        L_0x0182:
            r21 = r7
            r7 = r19
        L_0x0186:
            int r14 = r0.f229f
            if (r14 != 0) goto L_0x01b0
            A.e r14 = r9.f225b
            r22 = r10
            int r10 = r14.f100p
            int r14 = r14.f98o
            r23 = r1
            int r1 = r9.f224a
            r24 = r2
            r2 = 1
            if (r1 != r2) goto L_0x01a2
            int r1 = r11.f210m
            int r1 = java.lang.Math.min(r7, r1)
            goto L_0x01a3
        L_0x01a2:
            r1 = r7
        L_0x01a3:
            int r1 = java.lang.Math.max(r14, r1)
            if (r10 <= 0) goto L_0x01ad
            int r1 = java.lang.Math.min(r10, r1)
        L_0x01ad:
            if (r1 == r7) goto L_0x01d8
            goto L_0x01d5
        L_0x01b0:
            r23 = r1
            r24 = r2
            r22 = r10
            A.e r1 = r9.f225b
            int r2 = r1.f106s
            int r1 = r1.f104r
            int r10 = r9.f224a
            r14 = 1
            if (r10 != r14) goto L_0x01c8
            int r10 = r11.f210m
            int r10 = java.lang.Math.min(r7, r10)
            goto L_0x01c9
        L_0x01c8:
            r10 = r7
        L_0x01c9:
            int r1 = java.lang.Math.max(r1, r10)
            if (r2 <= 0) goto L_0x01d3
            int r1 = java.lang.Math.min(r2, r1)
        L_0x01d3:
            if (r1 == r7) goto L_0x01d8
        L_0x01d5:
            int r13 = r13 + 1
            r7 = r1
        L_0x01d8:
            B.g r1 = r9.f228e
            r1.d(r7)
        L_0x01dd:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r10 = r22
            r1 = r23
            r2 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x013d
        L_0x01ef:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x022c
            int r15 = r15 - r13
            r1 = 0
            r14 = 0
        L_0x01fc:
            if (r1 >= r4) goto L_0x022e
            java.util.ArrayList r2 = r0.f178k
            java.lang.Object r2 = r2.get(r1)
            B.m r2 = (B.m) r2
            A.e r7 = r2.f225b
            int r7 = r7.M()
            r9 = 8
            if (r7 != r9) goto L_0x0211
            goto L_0x0229
        L_0x0211:
            if (r1 <= 0) goto L_0x021a
            if (r1 < r5) goto L_0x021a
            B.f r7 = r2.f231h
            int r7 = r7.f194f
            int r14 = r14 + r7
        L_0x021a:
            B.g r7 = r2.f228e
            int r7 = r7.f195g
            int r14 = r14 + r7
            if (r1 >= r8) goto L_0x0229
            if (r1 >= r6) goto L_0x0229
            B.f r2 = r2.f232i
            int r2 = r2.f194f
            int r2 = -r2
            int r14 = r14 + r2
        L_0x0229:
            int r1 = r1 + 1
            goto L_0x01fc
        L_0x022c:
            r14 = r20
        L_0x022e:
            int r1 = r0.f179l
            r2 = 2
            if (r1 != r2) goto L_0x0239
            if (r13 != 0) goto L_0x0239
            r1 = 0
            r0.f179l = r1
            goto L_0x0245
        L_0x0239:
            r1 = 0
            goto L_0x0245
        L_0x023b:
            r23 = r1
            r24 = r2
            r21 = r7
            r20 = r14
            r1 = 0
            r2 = 2
        L_0x0245:
            if (r14 <= r3) goto L_0x0249
            r0.f179l = r2
        L_0x0249:
            if (r24 <= 0) goto L_0x0251
            if (r15 != 0) goto L_0x0251
            if (r5 != r6) goto L_0x0251
            r0.f179l = r2
        L_0x0251:
            int r2 = r0.f179l
            r7 = 1
            if (r2 != r7) goto L_0x02f6
            r9 = r24
            if (r9 <= r7) goto L_0x025f
            int r3 = r3 - r14
            int r2 = r9 + -1
            int r3 = r3 / r2
            goto L_0x0266
        L_0x025f:
            if (r9 != r7) goto L_0x0265
            int r3 = r3 - r14
            r2 = 2
            int r3 = r3 / r2
            goto L_0x0266
        L_0x0265:
            r3 = r1
        L_0x0266:
            if (r15 <= 0) goto L_0x0269
            r3 = r1
        L_0x0269:
            r2 = r1
            r7 = r21
        L_0x026c:
            if (r2 >= r4) goto L_0x043d
            if (r23 == 0) goto L_0x0275
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x0276
        L_0x0275:
            r1 = r2
        L_0x0276:
            java.util.ArrayList r9 = r0.f178k
            java.lang.Object r1 = r9.get(r1)
            B.m r1 = (B.m) r1
            A.e r9 = r1.f225b
            int r9 = r9.M()
            r10 = 8
            if (r9 != r10) goto L_0x0293
            B.f r9 = r1.f231h
            r9.d(r7)
            B.f r1 = r1.f232i
            r1.d(r7)
            goto L_0x02f2
        L_0x0293:
            if (r2 <= 0) goto L_0x029a
            if (r23 == 0) goto L_0x0299
            int r7 = r7 - r3
            goto L_0x029a
        L_0x0299:
            int r7 = r7 + r3
        L_0x029a:
            if (r2 <= 0) goto L_0x02ab
            if (r2 < r5) goto L_0x02ab
            if (r23 == 0) goto L_0x02a6
            B.f r9 = r1.f231h
            int r9 = r9.f194f
            int r7 = r7 - r9
            goto L_0x02ab
        L_0x02a6:
            B.f r9 = r1.f231h
            int r9 = r9.f194f
            int r7 = r7 + r9
        L_0x02ab:
            if (r23 == 0) goto L_0x02b3
            B.f r9 = r1.f232i
            r9.d(r7)
            goto L_0x02b8
        L_0x02b3:
            B.f r9 = r1.f231h
            r9.d(r7)
        L_0x02b8:
            B.g r9 = r1.f228e
            int r10 = r9.f195g
            A.e$b r11 = r1.f227d
            A.e$b r12 = A.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x02c9
            int r11 = r1.f224a
            r12 = 1
            if (r11 != r12) goto L_0x02c9
            int r10 = r9.f210m
        L_0x02c9:
            if (r23 == 0) goto L_0x02cd
            int r7 = r7 - r10
            goto L_0x02ce
        L_0x02cd:
            int r7 = r7 + r10
        L_0x02ce:
            if (r23 == 0) goto L_0x02d7
            B.f r9 = r1.f231h
            r9.d(r7)
        L_0x02d5:
            r9 = 1
            goto L_0x02dd
        L_0x02d7:
            B.f r9 = r1.f232i
            r9.d(r7)
            goto L_0x02d5
        L_0x02dd:
            r1.f230g = r9
            if (r2 >= r8) goto L_0x02f2
            if (r2 >= r6) goto L_0x02f2
            if (r23 == 0) goto L_0x02ec
            B.f r1 = r1.f232i
            int r1 = r1.f194f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x02f2
        L_0x02ec:
            B.f r1 = r1.f232i
            int r1 = r1.f194f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x02f2:
            int r2 = r2 + 1
            goto L_0x026c
        L_0x02f6:
            r9 = r24
            if (r2 != 0) goto L_0x038d
            int r3 = r3 - r14
            r2 = 1
            int r7 = r9 + 1
            int r3 = r3 / r7
            if (r15 <= 0) goto L_0x0302
            r3 = r1
        L_0x0302:
            r2 = r1
            r7 = r21
        L_0x0305:
            if (r2 >= r4) goto L_0x043d
            if (r23 == 0) goto L_0x030e
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x030f
        L_0x030e:
            r1 = r2
        L_0x030f:
            java.util.ArrayList r9 = r0.f178k
            java.lang.Object r1 = r9.get(r1)
            B.m r1 = (B.m) r1
            A.e r9 = r1.f225b
            int r9 = r9.M()
            r10 = 8
            if (r9 != r10) goto L_0x032c
            B.f r9 = r1.f231h
            r9.d(r7)
            B.f r1 = r1.f232i
            r1.d(r7)
            goto L_0x0389
        L_0x032c:
            if (r23 == 0) goto L_0x0330
            int r7 = r7 - r3
            goto L_0x0331
        L_0x0330:
            int r7 = r7 + r3
        L_0x0331:
            if (r2 <= 0) goto L_0x0342
            if (r2 < r5) goto L_0x0342
            if (r23 == 0) goto L_0x033d
            B.f r9 = r1.f231h
            int r9 = r9.f194f
            int r7 = r7 - r9
            goto L_0x0342
        L_0x033d:
            B.f r9 = r1.f231h
            int r9 = r9.f194f
            int r7 = r7 + r9
        L_0x0342:
            if (r23 == 0) goto L_0x034a
            B.f r9 = r1.f232i
            r9.d(r7)
            goto L_0x034f
        L_0x034a:
            B.f r9 = r1.f231h
            r9.d(r7)
        L_0x034f:
            B.g r9 = r1.f228e
            int r10 = r9.f195g
            A.e$b r11 = r1.f227d
            A.e$b r12 = A.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0364
            int r11 = r1.f224a
            r12 = 1
            if (r11 != r12) goto L_0x0364
            int r9 = r9.f210m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x0364:
            if (r23 == 0) goto L_0x0368
            int r7 = r7 - r10
            goto L_0x0369
        L_0x0368:
            int r7 = r7 + r10
        L_0x0369:
            if (r23 == 0) goto L_0x0371
            B.f r9 = r1.f231h
            r9.d(r7)
            goto L_0x0376
        L_0x0371:
            B.f r9 = r1.f232i
            r9.d(r7)
        L_0x0376:
            if (r2 >= r8) goto L_0x0389
            if (r2 >= r6) goto L_0x0389
            if (r23 == 0) goto L_0x0383
            B.f r1 = r1.f232i
            int r1 = r1.f194f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0389
        L_0x0383:
            B.f r1 = r1.f232i
            int r1 = r1.f194f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0389:
            int r2 = r2 + 1
            goto L_0x0305
        L_0x038d:
            r7 = 2
            if (r2 != r7) goto L_0x043d
            int r2 = r0.f229f
            if (r2 != 0) goto L_0x039b
            A.e r2 = r0.f225b
            float r2 = r2.u()
            goto L_0x03a1
        L_0x039b:
            A.e r2 = r0.f225b
            float r2 = r2.I()
        L_0x03a1:
            if (r23 == 0) goto L_0x03a7
            r7 = 1065353216(0x3f800000, float:1.0)
            float r2 = r7 - r2
        L_0x03a7:
            int r3 = r3 - r14
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r2
            int r2 = (int) r3
            if (r2 < 0) goto L_0x03b2
            if (r15 <= 0) goto L_0x03b3
        L_0x03b2:
            r2 = r1
        L_0x03b3:
            if (r23 == 0) goto L_0x03b8
            int r7 = r21 - r2
            goto L_0x03ba
        L_0x03b8:
            int r7 = r21 + r2
        L_0x03ba:
            r2 = r1
        L_0x03bb:
            if (r2 >= r4) goto L_0x043d
            if (r23 == 0) goto L_0x03c4
            int r1 = r2 + 1
            int r1 = r4 - r1
            goto L_0x03c5
        L_0x03c4:
            r1 = r2
        L_0x03c5:
            java.util.ArrayList r3 = r0.f178k
            java.lang.Object r1 = r3.get(r1)
            B.m r1 = (B.m) r1
            A.e r3 = r1.f225b
            int r3 = r3.M()
            r9 = 8
            if (r3 != r9) goto L_0x03e3
            B.f r3 = r1.f231h
            r3.d(r7)
            B.f r1 = r1.f232i
            r1.d(r7)
            r12 = 1
            goto L_0x0439
        L_0x03e3:
            if (r2 <= 0) goto L_0x03f4
            if (r2 < r5) goto L_0x03f4
            if (r23 == 0) goto L_0x03ef
            B.f r3 = r1.f231h
            int r3 = r3.f194f
            int r7 = r7 - r3
            goto L_0x03f4
        L_0x03ef:
            B.f r3 = r1.f231h
            int r3 = r3.f194f
            int r7 = r7 + r3
        L_0x03f4:
            if (r23 == 0) goto L_0x03fc
            B.f r3 = r1.f232i
            r3.d(r7)
            goto L_0x0401
        L_0x03fc:
            B.f r3 = r1.f231h
            r3.d(r7)
        L_0x0401:
            B.g r3 = r1.f228e
            int r10 = r3.f195g
            A.e$b r11 = r1.f227d
            A.e$b r12 = A.e.b.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0413
            int r11 = r1.f224a
            r12 = 1
            if (r11 != r12) goto L_0x0414
            int r10 = r3.f210m
            goto L_0x0414
        L_0x0413:
            r12 = 1
        L_0x0414:
            if (r23 == 0) goto L_0x0418
            int r7 = r7 - r10
            goto L_0x0419
        L_0x0418:
            int r7 = r7 + r10
        L_0x0419:
            if (r23 == 0) goto L_0x0421
            B.f r3 = r1.f231h
            r3.d(r7)
            goto L_0x0426
        L_0x0421:
            B.f r3 = r1.f232i
            r3.d(r7)
        L_0x0426:
            if (r2 >= r8) goto L_0x0439
            if (r2 >= r6) goto L_0x0439
            if (r23 == 0) goto L_0x0433
            B.f r1 = r1.f232i
            int r1 = r1.f194f
            int r1 = -r1
            int r7 = r7 - r1
            goto L_0x0439
        L_0x0433:
            B.f r1 = r1.f232i
            int r1 = r1.f194f
            int r1 = -r1
            int r7 = r7 + r1
        L_0x0439:
            int r2 = r2 + 1
            goto L_0x03bb
        L_0x043d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B.c.a(B.d):void");
    }

    public void d() {
        Iterator it = this.f178k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).d();
        }
        int size = this.f178k.size();
        if (size >= 1) {
            e eVar = ((m) this.f178k.get(0)).f225b;
            e eVar2 = ((m) this.f178k.get(size - 1)).f225b;
            if (this.f229f == 0) {
                d dVar = eVar.f45B;
                d dVar2 = eVar2.f47D;
                f i4 = i(dVar, 0);
                int b4 = dVar.b();
                e r4 = r();
                if (r4 != null) {
                    b4 = r4.f45B.b();
                }
                if (i4 != null) {
                    b(this.f231h, i4, b4);
                }
                f i5 = i(dVar2, 0);
                int b5 = dVar2.b();
                e s4 = s();
                if (s4 != null) {
                    b5 = s4.f47D.b();
                }
                if (i5 != null) {
                    b(this.f232i, i5, -b5);
                }
            } else {
                d dVar3 = eVar.f46C;
                d dVar4 = eVar2.f48E;
                f i6 = i(dVar3, 1);
                int b6 = dVar3.b();
                e r5 = r();
                if (r5 != null) {
                    b6 = r5.f46C.b();
                }
                if (i6 != null) {
                    b(this.f231h, i6, b6);
                }
                f i7 = i(dVar4, 1);
                int b7 = dVar4.b();
                e s5 = s();
                if (s5 != null) {
                    b7 = s5.f48E.b();
                }
                if (i7 != null) {
                    b(this.f232i, i7, -b7);
                }
            }
            this.f231h.f189a = this;
            this.f232i.f189a = this;
        }
    }

    public void e() {
        for (int i4 = 0; i4 < this.f178k.size(); i4++) {
            ((m) this.f178k.get(i4)).e();
        }
    }

    public void f() {
        this.f226c = null;
        Iterator it = this.f178k.iterator();
        while (it.hasNext()) {
            ((m) it.next()).f();
        }
    }

    public long j() {
        int size = this.f178k.size();
        long j4 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            m mVar = (m) this.f178k.get(i4);
            j4 = j4 + ((long) mVar.f231h.f194f) + mVar.j() + ((long) mVar.f232i.f194f);
        }
        return j4;
    }

    public boolean m() {
        int size = this.f178k.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (!((m) this.f178k.get(i4)).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        e eVar;
        e eVar2 = this.f225b;
        e F4 = eVar2.F(this.f229f);
        while (true) {
            e eVar3 = F4;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            F4 = eVar2.F(this.f229f);
        }
        this.f225b = eVar;
        this.f178k.add(eVar.H(this.f229f));
        e D4 = eVar.D(this.f229f);
        while (D4 != null) {
            this.f178k.add(D4.H(this.f229f));
            D4 = D4.D(this.f229f);
        }
        Iterator it = this.f178k.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            int i4 = this.f229f;
            if (i4 == 0) {
                mVar.f225b.f74c = this;
            } else if (i4 == 1) {
                mVar.f225b.f76d = this;
            }
        }
        if (this.f229f == 0 && ((f) this.f225b.E()).V0() && this.f178k.size() > 1) {
            ArrayList arrayList = this.f178k;
            this.f225b = ((m) arrayList.get(arrayList.size() - 1)).f225b;
        }
        this.f179l = this.f229f == 0 ? this.f225b.v() : this.f225b.J();
    }

    public final e r() {
        for (int i4 = 0; i4 < this.f178k.size(); i4++) {
            m mVar = (m) this.f178k.get(i4);
            if (mVar.f225b.M() != 8) {
                return mVar.f225b;
            }
        }
        return null;
    }

    public final e s() {
        for (int size = this.f178k.size() - 1; size >= 0; size--) {
            m mVar = (m) this.f178k.get(size);
            if (mVar.f225b.M() != 8) {
                return mVar.f225b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ChainRun ");
        sb.append(this.f229f == 0 ? "horizontal : " : "vertical : ");
        String sb2 = sb.toString();
        Iterator it = this.f178k.iterator();
        while (it.hasNext()) {
            sb2 = ((sb2 + "<") + ((m) it.next())) + "> ";
        }
        return sb2;
    }
}
