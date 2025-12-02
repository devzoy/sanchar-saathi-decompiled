package B;

import A.d;
import A.e;
import A.h;
import B.f;
import B.m;

public class j extends m {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f211k = new int[2];

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f212a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                B.m$b[] r0 = B.m.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f212a = r0
                B.m$b r1 = B.m.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f212a     // Catch:{ NoSuchFieldError -> 0x001d }
                B.m$b r1 = B.m.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f212a     // Catch:{ NoSuchFieldError -> 0x0028 }
                B.m$b r1 = B.m.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: B.j.a.<clinit>():void");
        }
    }

    public j(e eVar) {
        super(eVar);
        this.f231h.f193e = f.a.LEFT;
        this.f232i.f193e = f.a.RIGHT;
        this.f229f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ba, code lost:
        if (r14 != 1) goto L_0x031f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(B.d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = B.j.a.f212a
            B.m$b r1 = r8.f233j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            A.e r0 = r8.f225b
            A.d r1 = r0.f45B
            A.d r0 = r0.f47D
            r3 = r17
            r8.n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.p(r17)
        L_0x002e:
            B.g r0 = r8.f228e
            boolean r0 = r0.f198j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x031f
            A.e$b r0 = r8.f227d
            A.e$b r3 = A.e.b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x031f
            A.e r0 = r8.f225b
            int r3 = r0.f92l
            if (r3 == r1) goto L_0x0302
            if (r3 == r2) goto L_0x0046
            goto L_0x031f
        L_0x0046:
            int r1 = r0.f94m
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.s()
            if (r0 == r3) goto L_0x007a
            if (r0 == 0) goto L_0x006b
            if (r0 == r9) goto L_0x005a
            r0 = r10
            goto L_0x0088
        L_0x005a:
            A.e r0 = r8.f225b
            B.l r1 = r0.f80f
            B.g r1 = r1.f228e
            int r1 = r1.f195g
            float r1 = (float) r1
            float r0 = r0.r()
        L_0x0067:
            float r1 = r1 * r0
        L_0x0068:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L_0x0088
        L_0x006b:
            A.e r0 = r8.f225b
            B.l r1 = r0.f80f
            B.g r1 = r1.f228e
            int r1 = r1.f195g
            float r1 = (float) r1
            float r0 = r0.r()
            float r1 = r1 / r0
            goto L_0x0068
        L_0x007a:
            A.e r0 = r8.f225b
            B.l r1 = r0.f80f
            B.g r1 = r1.f228e
            int r1 = r1.f195g
            float r1 = (float) r1
            float r0 = r0.r()
            goto L_0x0067
        L_0x0088:
            B.g r1 = r8.f228e
            r1.d(r0)
            goto L_0x031f
        L_0x008f:
            B.l r1 = r0.f80f
            B.f r12 = r1.f231h
            B.f r13 = r1.f232i
            A.d r1 = r0.f45B
            A.d r1 = r1.f28d
            if (r1 == 0) goto L_0x009d
            r1 = r9
            goto L_0x009e
        L_0x009d:
            r1 = r10
        L_0x009e:
            A.d r2 = r0.f46C
            A.d r2 = r2.f28d
            if (r2 == 0) goto L_0x00a6
            r2 = r9
            goto L_0x00a7
        L_0x00a6:
            r2 = r10
        L_0x00a7:
            A.d r4 = r0.f47D
            A.d r4 = r4.f28d
            if (r4 == 0) goto L_0x00af
            r4 = r9
            goto L_0x00b0
        L_0x00af:
            r4 = r10
        L_0x00b0:
            A.d r5 = r0.f48E
            A.d r5 = r5.f28d
            if (r5 == 0) goto L_0x00b8
            r5 = r9
            goto L_0x00b9
        L_0x00b8:
            r5 = r10
        L_0x00b9:
            int r14 = r0.s()
            if (r1 == 0) goto L_0x0200
            if (r2 == 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            if (r5 == 0) goto L_0x0200
            A.e r0 = r8.f225b
            float r15 = r0.r()
            boolean r0 = r12.f198j
            if (r0 == 0) goto L_0x012e
            boolean r0 = r13.f198j
            if (r0 == 0) goto L_0x012e
            B.f r0 = r8.f231h
            boolean r1 = r0.f191c
            if (r1 == 0) goto L_0x012d
            B.f r1 = r8.f232i
            boolean r1 = r1.f191c
            if (r1 != 0) goto L_0x00e0
            goto L_0x012d
        L_0x00e0:
            java.util.List r0 = r0.f200l
            java.lang.Object r0 = r0.get(r10)
            B.f r0 = (B.f) r0
            int r0 = r0.f195g
            B.f r1 = r8.f231h
            int r1 = r1.f194f
            int r2 = r0 + r1
            B.f r0 = r8.f232i
            java.util.List r0 = r0.f200l
            java.lang.Object r0 = r0.get(r10)
            B.f r0 = (B.f) r0
            int r0 = r0.f195g
            B.f r1 = r8.f232i
            int r1 = r1.f194f
            int r3 = r0 - r1
            int r0 = r12.f195g
            int r1 = r12.f194f
            int r4 = r0 + r1
            int r0 = r13.f195g
            int r1 = r13.f194f
            int r5 = r0 - r1
            int[] r1 = f211k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            B.g r0 = r8.f228e
            int[] r1 = f211k
            r1 = r1[r10]
            r0.d(r1)
            A.e r0 = r8.f225b
            B.l r0 = r0.f80f
            B.g r0 = r0.f228e
            int[] r1 = f211k
            r1 = r1[r9]
            r0.d(r1)
        L_0x012d:
            return
        L_0x012e:
            B.f r0 = r8.f231h
            boolean r1 = r0.f198j
            if (r1 == 0) goto L_0x018b
            B.f r1 = r8.f232i
            boolean r2 = r1.f198j
            if (r2 == 0) goto L_0x018b
            boolean r2 = r12.f191c
            if (r2 == 0) goto L_0x018a
            boolean r2 = r13.f191c
            if (r2 != 0) goto L_0x0143
            goto L_0x018a
        L_0x0143:
            int r2 = r0.f195g
            int r0 = r0.f194f
            int r2 = r2 + r0
            int r0 = r1.f195g
            int r1 = r1.f194f
            int r3 = r0 - r1
            java.util.List r0 = r12.f200l
            java.lang.Object r0 = r0.get(r10)
            B.f r0 = (B.f) r0
            int r0 = r0.f195g
            int r1 = r12.f194f
            int r4 = r0 + r1
            java.util.List r0 = r13.f200l
            java.lang.Object r0 = r0.get(r10)
            B.f r0 = (B.f) r0
            int r0 = r0.f195g
            int r1 = r13.f194f
            int r5 = r0 - r1
            int[] r1 = f211k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            B.g r0 = r8.f228e
            int[] r1 = f211k
            r1 = r1[r10]
            r0.d(r1)
            A.e r0 = r8.f225b
            B.l r0 = r0.f80f
            B.g r0 = r0.f228e
            int[] r1 = f211k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x018b
        L_0x018a:
            return
        L_0x018b:
            B.f r0 = r8.f231h
            boolean r1 = r0.f191c
            if (r1 == 0) goto L_0x01ff
            B.f r1 = r8.f232i
            boolean r1 = r1.f191c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r12.f191c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r13.f191c
            if (r1 != 0) goto L_0x01a0
            goto L_0x01ff
        L_0x01a0:
            java.util.List r0 = r0.f200l
            java.lang.Object r0 = r0.get(r10)
            B.f r0 = (B.f) r0
            int r0 = r0.f195g
            B.f r1 = r8.f231h
            int r1 = r1.f194f
            int r2 = r0 + r1
            B.f r0 = r8.f232i
            java.util.List r0 = r0.f200l
            java.lang.Object r0 = r0.get(r10)
            B.f r0 = (B.f) r0
            int r0 = r0.f195g
            B.f r1 = r8.f232i
            int r1 = r1.f194f
            int r3 = r0 - r1
            java.util.List r0 = r12.f200l
            java.lang.Object r0 = r0.get(r10)
            B.f r0 = (B.f) r0
            int r0 = r0.f195g
            int r1 = r12.f194f
            int r4 = r0 + r1
            java.util.List r0 = r13.f200l
            java.lang.Object r0 = r0.get(r10)
            B.f r0 = (B.f) r0
            int r0 = r0.f195g
            int r1 = r13.f194f
            int r5 = r0 - r1
            int[] r1 = f211k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            B.g r0 = r8.f228e
            int[] r1 = f211k
            r1 = r1[r10]
            r0.d(r1)
            A.e r0 = r8.f225b
            B.l r0 = r0.f80f
            B.g r0 = r0.f228e
            int[] r1 = f211k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x031f
        L_0x01ff:
            return
        L_0x0200:
            if (r1 == 0) goto L_0x0289
            if (r4 == 0) goto L_0x0289
            B.f r0 = r8.f231h
            boolean r0 = r0.f191c
            if (r0 == 0) goto L_0x0288
            B.f r0 = r8.f232i
            boolean r0 = r0.f191c
            if (r0 != 0) goto L_0x0212
            goto L_0x0288
        L_0x0212:
            A.e r0 = r8.f225b
            float r0 = r0.r()
            B.f r1 = r8.f231h
            java.util.List r1 = r1.f200l
            java.lang.Object r1 = r1.get(r10)
            B.f r1 = (B.f) r1
            int r1 = r1.f195g
            B.f r2 = r8.f231h
            int r2 = r2.f194f
            int r1 = r1 + r2
            B.f r2 = r8.f232i
            java.util.List r2 = r2.f200l
            java.lang.Object r2 = r2.get(r10)
            B.f r2 = (B.f) r2
            int r2 = r2.f195g
            B.f r4 = r8.f232i
            int r4 = r4.f194f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0265
            if (r14 == 0) goto L_0x0265
            if (r14 == r9) goto L_0x0242
            goto L_0x031f
        L_0x0242:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0255
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0255:
            B.g r0 = r8.f228e
            r0.d(r1)
            A.e r0 = r8.f225b
            B.l r0 = r0.f80f
            B.g r0 = r0.f228e
            r0.d(r3)
            goto L_0x031f
        L_0x0265:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0278
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0278:
            B.g r0 = r8.f228e
            r0.d(r1)
            A.e r0 = r8.f225b
            B.l r0 = r0.f80f
            B.g r0 = r0.f228e
            r0.d(r3)
            goto L_0x031f
        L_0x0288:
            return
        L_0x0289:
            if (r2 == 0) goto L_0x031f
            if (r5 == 0) goto L_0x031f
            boolean r0 = r12.f191c
            if (r0 == 0) goto L_0x0301
            boolean r0 = r13.f191c
            if (r0 != 0) goto L_0x0296
            goto L_0x0301
        L_0x0296:
            A.e r0 = r8.f225b
            float r0 = r0.r()
            java.util.List r1 = r12.f200l
            java.lang.Object r1 = r1.get(r10)
            B.f r1 = (B.f) r1
            int r1 = r1.f195g
            int r2 = r12.f194f
            int r1 = r1 + r2
            java.util.List r2 = r13.f200l
            java.lang.Object r2 = r2.get(r10)
            B.f r2 = (B.f) r2
            int r2 = r2.f195g
            int r4 = r13.f194f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02df
            if (r14 == 0) goto L_0x02bd
            if (r14 == r9) goto L_0x02df
            goto L_0x031f
        L_0x02bd:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02d0
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02d0:
            B.g r0 = r8.f228e
            r0.d(r3)
            A.e r0 = r8.f225b
            B.l r0 = r0.f80f
            B.g r0 = r0.f228e
            r0.d(r1)
            goto L_0x031f
        L_0x02df:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02f2
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f2:
            B.g r0 = r8.f228e
            r0.d(r3)
            A.e r0 = r8.f225b
            B.l r0 = r0.f80f
            B.g r0 = r0.f228e
            r0.d(r1)
            goto L_0x031f
        L_0x0301:
            return
        L_0x0302:
            A.e r0 = r0.E()
            if (r0 == 0) goto L_0x031f
            B.j r0 = r0.f78e
            B.g r0 = r0.f228e
            boolean r1 = r0.f198j
            if (r1 == 0) goto L_0x031f
            A.e r1 = r8.f225b
            float r1 = r1.f102q
            int r0 = r0.f195g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            B.g r1 = r8.f228e
            r1.d(r0)
        L_0x031f:
            B.f r0 = r8.f231h
            boolean r1 = r0.f191c
            if (r1 == 0) goto L_0x043f
            B.f r1 = r8.f232i
            boolean r2 = r1.f191c
            if (r2 != 0) goto L_0x032d
            goto L_0x043f
        L_0x032d:
            boolean r0 = r0.f198j
            if (r0 == 0) goto L_0x033c
            boolean r0 = r1.f198j
            if (r0 == 0) goto L_0x033c
            B.g r0 = r8.f228e
            boolean r0 = r0.f198j
            if (r0 == 0) goto L_0x033c
            return
        L_0x033c:
            B.g r0 = r8.f228e
            boolean r0 = r0.f198j
            if (r0 != 0) goto L_0x0386
            A.e$b r0 = r8.f227d
            A.e$b r1 = A.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0386
            A.e r0 = r8.f225b
            int r1 = r0.f92l
            if (r1 != 0) goto L_0x0386
            boolean r0 = r0.T()
            if (r0 != 0) goto L_0x0386
            B.f r0 = r8.f231h
            java.util.List r0 = r0.f200l
            java.lang.Object r0 = r0.get(r10)
            B.f r0 = (B.f) r0
            B.f r1 = r8.f232i
            java.util.List r1 = r1.f200l
            java.lang.Object r1 = r1.get(r10)
            B.f r1 = (B.f) r1
            int r0 = r0.f195g
            B.f r2 = r8.f231h
            int r3 = r2.f194f
            int r0 = r0 + r3
            int r1 = r1.f195g
            B.f r3 = r8.f232i
            int r3 = r3.f194f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.d(r0)
            B.f r0 = r8.f232i
            r0.d(r1)
            B.g r0 = r8.f228e
            r0.d(r3)
            return
        L_0x0386:
            B.g r0 = r8.f228e
            boolean r0 = r0.f198j
            if (r0 != 0) goto L_0x03ea
            A.e$b r0 = r8.f227d
            A.e$b r1 = A.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ea
            int r0 = r8.f224a
            if (r0 != r9) goto L_0x03ea
            B.f r0 = r8.f231h
            java.util.List r0 = r0.f200l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ea
            B.f r0 = r8.f232i
            java.util.List r0 = r0.f200l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ea
            B.f r0 = r8.f231h
            java.util.List r0 = r0.f200l
            java.lang.Object r0 = r0.get(r10)
            B.f r0 = (B.f) r0
            B.f r1 = r8.f232i
            java.util.List r1 = r1.f200l
            java.lang.Object r1 = r1.get(r10)
            B.f r1 = (B.f) r1
            int r0 = r0.f195g
            B.f r2 = r8.f231h
            int r2 = r2.f194f
            int r0 = r0 + r2
            int r1 = r1.f195g
            B.f r2 = r8.f232i
            int r2 = r2.f194f
            int r1 = r1 + r2
            int r1 = r1 - r0
            B.g r0 = r8.f228e
            int r0 = r0.f210m
            int r0 = java.lang.Math.min(r1, r0)
            A.e r1 = r8.f225b
            int r2 = r1.f100p
            int r1 = r1.f98o
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03e5
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03e5:
            B.g r1 = r8.f228e
            r1.d(r0)
        L_0x03ea:
            B.g r0 = r8.f228e
            boolean r0 = r0.f198j
            if (r0 != 0) goto L_0x03f1
            return
        L_0x03f1:
            B.f r0 = r8.f231h
            java.util.List r0 = r0.f200l
            java.lang.Object r0 = r0.get(r10)
            B.f r0 = (B.f) r0
            B.f r1 = r8.f232i
            java.util.List r1 = r1.f200l
            java.lang.Object r1 = r1.get(r10)
            B.f r1 = (B.f) r1
            int r2 = r0.f195g
            B.f r3 = r8.f231h
            int r3 = r3.f194f
            int r2 = r2 + r3
            int r3 = r1.f195g
            B.f r4 = r8.f232i
            int r4 = r4.f194f
            int r3 = r3 + r4
            A.e r4 = r8.f225b
            float r4 = r4.u()
            if (r0 != r1) goto L_0x0420
            int r2 = r0.f195g
            int r3 = r1.f195g
            r4 = r11
        L_0x0420:
            int r3 = r3 - r2
            B.g r0 = r8.f228e
            int r0 = r0.f195g
            int r3 = r3 - r0
            B.f r0 = r8.f231h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.d(r1)
            B.f r0 = r8.f232i
            B.f r1 = r8.f231h
            int r1 = r1.f195g
            B.g r2 = r8.f228e
            int r2 = r2.f195g
            int r1 = r1 + r2
            r0.d(r1)
        L_0x043f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B.j.a(B.d):void");
    }

    public void d() {
        e E4;
        e E5;
        e eVar = this.f225b;
        if (eVar.f70a) {
            this.f228e.d(eVar.N());
        }
        if (!this.f228e.f198j) {
            e.b w4 = this.f225b.w();
            this.f227d = w4;
            if (w4 != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (w4 == bVar && (((E5 = this.f225b.E()) != null && E5.w() == e.b.FIXED) || E5.w() == bVar)) {
                    int N4 = (E5.N() - this.f225b.f45B.b()) - this.f225b.f47D.b();
                    b(this.f231h, E5.f78e.f231h, this.f225b.f45B.b());
                    b(this.f232i, E5.f78e.f232i, -this.f225b.f47D.b());
                    this.f228e.d(N4);
                    return;
                } else if (this.f227d == e.b.FIXED) {
                    this.f228e.d(this.f225b.N());
                }
            }
        } else {
            e.b bVar2 = this.f227d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (((E4 = this.f225b.E()) != null && E4.w() == e.b.FIXED) || E4.w() == bVar3)) {
                b(this.f231h, E4.f78e.f231h, this.f225b.f45B.b());
                b(this.f232i, E4.f78e.f232i, -this.f225b.f47D.b());
                return;
            }
        }
        g gVar = this.f228e;
        if (gVar.f198j) {
            e eVar2 = this.f225b;
            if (eVar2.f70a) {
                d[] dVarArr = eVar2.f53J;
                d dVar = dVarArr[0];
                d dVar2 = dVar.f28d;
                if (dVar2 == null || dVarArr[1].f28d == null) {
                    if (dVar2 != null) {
                        f h4 = h(dVar);
                        if (h4 != null) {
                            b(this.f231h, h4, this.f225b.f53J[0].b());
                            b(this.f232i, this.f231h, this.f228e.f195g);
                            return;
                        }
                        return;
                    }
                    d dVar3 = dVarArr[1];
                    if (dVar3.f28d != null) {
                        f h5 = h(dVar3);
                        if (h5 != null) {
                            b(this.f232i, h5, -this.f225b.f53J[1].b());
                            b(this.f231h, this.f232i, -this.f228e.f195g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof h) && eVar2.E() != null && this.f225b.k(d.b.CENTER).f28d == null) {
                        b(this.f231h, this.f225b.E().f78e.f231h, this.f225b.O());
                        b(this.f232i, this.f231h, this.f228e.f195g);
                        return;
                    } else {
                        return;
                    }
                } else if (eVar2.T()) {
                    this.f231h.f194f = this.f225b.f53J[0].b();
                    this.f232i.f194f = -this.f225b.f53J[1].b();
                    return;
                } else {
                    f h6 = h(this.f225b.f53J[0]);
                    if (h6 != null) {
                        b(this.f231h, h6, this.f225b.f53J[0].b());
                    }
                    f h7 = h(this.f225b.f53J[1]);
                    if (h7 != null) {
                        b(this.f232i, h7, -this.f225b.f53J[1].b());
                    }
                    this.f231h.f190b = true;
                    this.f232i.f190b = true;
                    return;
                }
            }
        }
        if (this.f227d == e.b.MATCH_CONSTRAINT) {
            e eVar3 = this.f225b;
            int i4 = eVar3.f92l;
            if (i4 == 2) {
                e E6 = eVar3.E();
                if (E6 != null) {
                    g gVar2 = E6.f80f.f228e;
                    this.f228e.f200l.add(gVar2);
                    gVar2.f199k.add(this.f228e);
                    g gVar3 = this.f228e;
                    gVar3.f190b = true;
                    gVar3.f199k.add(this.f231h);
                    this.f228e.f199k.add(this.f232i);
                }
            } else if (i4 == 3) {
                if (eVar3.f94m == 3) {
                    this.f231h.f189a = this;
                    this.f232i.f189a = this;
                    l lVar = eVar3.f80f;
                    lVar.f231h.f189a = this;
                    lVar.f232i.f189a = this;
                    gVar.f189a = this;
                    if (eVar3.V()) {
                        this.f228e.f200l.add(this.f225b.f80f.f228e);
                        this.f225b.f80f.f228e.f199k.add(this.f228e);
                        l lVar2 = this.f225b.f80f;
                        lVar2.f228e.f189a = this;
                        this.f228e.f200l.add(lVar2.f231h);
                        this.f228e.f200l.add(this.f225b.f80f.f232i);
                        this.f225b.f80f.f231h.f199k.add(this.f228e);
                        this.f225b.f80f.f232i.f199k.add(this.f228e);
                    } else if (this.f225b.T()) {
                        this.f225b.f80f.f228e.f200l.add(this.f228e);
                        this.f228e.f199k.add(this.f225b.f80f.f228e);
                    } else {
                        this.f225b.f80f.f228e.f200l.add(this.f228e);
                    }
                } else {
                    g gVar4 = eVar3.f80f.f228e;
                    gVar.f200l.add(gVar4);
                    gVar4.f199k.add(this.f228e);
                    this.f225b.f80f.f231h.f199k.add(this.f228e);
                    this.f225b.f80f.f232i.f199k.add(this.f228e);
                    g gVar5 = this.f228e;
                    gVar5.f190b = true;
                    gVar5.f199k.add(this.f231h);
                    this.f228e.f199k.add(this.f232i);
                    this.f231h.f200l.add(this.f228e);
                    this.f232i.f200l.add(this.f228e);
                }
            }
        }
        e eVar4 = this.f225b;
        d[] dVarArr2 = eVar4.f53J;
        d dVar4 = dVarArr2[0];
        d dVar5 = dVar4.f28d;
        if (dVar5 == null || dVarArr2[1].f28d == null) {
            if (dVar5 != null) {
                f h8 = h(dVar4);
                if (h8 != null) {
                    b(this.f231h, h8, this.f225b.f53J[0].b());
                    c(this.f232i, this.f231h, 1, this.f228e);
                    return;
                }
                return;
            }
            d dVar6 = dVarArr2[1];
            if (dVar6.f28d != null) {
                f h9 = h(dVar6);
                if (h9 != null) {
                    b(this.f232i, h9, -this.f225b.f53J[1].b());
                    c(this.f231h, this.f232i, -1, this.f228e);
                }
            } else if (!(eVar4 instanceof h) && eVar4.E() != null) {
                b(this.f231h, this.f225b.E().f78e.f231h, this.f225b.O());
                c(this.f232i, this.f231h, 1, this.f228e);
            }
        } else if (eVar4.T()) {
            this.f231h.f194f = this.f225b.f53J[0].b();
            this.f232i.f194f = -this.f225b.f53J[1].b();
        } else {
            f h10 = h(this.f225b.f53J[0]);
            f h11 = h(this.f225b.f53J[1]);
            h10.b(this);
            h11.b(this);
            this.f233j = m.b.CENTER;
        }
    }

    public void e() {
        f fVar = this.f231h;
        if (fVar.f198j) {
            this.f225b.B0(fVar.f195g);
        }
    }

    public void f() {
        this.f226c = null;
        this.f231h.c();
        this.f232i.c();
        this.f228e.c();
        this.f230g = false;
    }

    public boolean m() {
        return this.f227d != e.b.MATCH_CONSTRAINT || this.f225b.f92l == 0;
    }

    public final void q(int[] iArr, int i4, int i5, int i6, int i7, float f4, int i8) {
        int i9 = i5 - i4;
        int i10 = i7 - i6;
        if (i8 == -1) {
            int i11 = (int) ((((float) i10) * f4) + 0.5f);
            int i12 = (int) ((((float) i9) / f4) + 0.5f);
            if (i11 <= i9) {
                iArr[0] = i11;
                iArr[1] = i10;
            } else if (i12 <= i10) {
                iArr[0] = i9;
                iArr[1] = i12;
            }
        } else if (i8 == 0) {
            iArr[0] = (int) ((((float) i10) * f4) + 0.5f);
            iArr[1] = i10;
        } else if (i8 == 1) {
            iArr[0] = i9;
            iArr[1] = (int) ((((float) i9) * f4) + 0.5f);
        }
    }

    public void r() {
        this.f230g = false;
        this.f231h.c();
        this.f231h.f198j = false;
        this.f232i.c();
        this.f232i.f198j = false;
        this.f228e.f198j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f225b.p();
    }
}
