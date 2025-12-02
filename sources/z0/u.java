package Z0;

import Q0.i;
import Q0.m;
import Q0.s;
import s.C0918a;
import v3.g;
import v3.l;
import z3.e;

public final class u {

    /* renamed from: u  reason: collision with root package name */
    public static final a f3831u = new a((g) null);

    /* renamed from: v  reason: collision with root package name */
    public static final String f3832v;

    /* renamed from: w  reason: collision with root package name */
    public static final C0918a f3833w = new t();

    /* renamed from: a  reason: collision with root package name */
    public final String f3834a;

    /* renamed from: b  reason: collision with root package name */
    public s f3835b;

    /* renamed from: c  reason: collision with root package name */
    public String f3836c;

    /* renamed from: d  reason: collision with root package name */
    public String f3837d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.work.b f3838e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.work.b f3839f;

    /* renamed from: g  reason: collision with root package name */
    public long f3840g;

    /* renamed from: h  reason: collision with root package name */
    public long f3841h;

    /* renamed from: i  reason: collision with root package name */
    public long f3842i;

    /* renamed from: j  reason: collision with root package name */
    public Q0.b f3843j;

    /* renamed from: k  reason: collision with root package name */
    public int f3844k;

    /* renamed from: l  reason: collision with root package name */
    public Q0.a f3845l;

    /* renamed from: m  reason: collision with root package name */
    public long f3846m;

    /* renamed from: n  reason: collision with root package name */
    public long f3847n;

    /* renamed from: o  reason: collision with root package name */
    public long f3848o;

    /* renamed from: p  reason: collision with root package name */
    public long f3849p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3850q;

    /* renamed from: r  reason: collision with root package name */
    public m f3851r;

    /* renamed from: s  reason: collision with root package name */
    public int f3852s;

    /* renamed from: t  reason: collision with root package name */
    public final int f3853t;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f3854a;

        /* renamed from: b  reason: collision with root package name */
        public s f3855b;

        public b(String str, s sVar) {
            l.e(str, "id");
            l.e(sVar, "state");
            this.f3854a = str;
            this.f3855b = sVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return l.a(this.f3854a, bVar.f3854a) && this.f3855b == bVar.f3855b;
        }

        public int hashCode() {
            return (this.f3854a.hashCode() * 31) + this.f3855b.hashCode();
        }

        public String toString() {
            return "IdAndState(id=" + this.f3854a + ", state=" + this.f3855b + ')';
        }
    }

    static {
        String i4 = i.i("WorkSpec");
        l.d(i4, "tagWithPrefix(\"WorkSpec\")");
        f3832v = i4;
    }

    public u(String str, s sVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j4, long j5, long j6, Q0.b bVar3, int i4, Q0.a aVar, long j7, long j8, long j9, long j10, boolean z4, m mVar, int i5, int i6) {
        androidx.work.b bVar4 = bVar2;
        Q0.b bVar5 = bVar3;
        Q0.a aVar2 = aVar;
        m mVar2 = mVar;
        l.e(str, "id");
        l.e(sVar, "state");
        l.e(str2, "workerClassName");
        l.e(bVar, "input");
        l.e(bVar4, "output");
        l.e(bVar5, "constraints");
        l.e(aVar2, "backoffPolicy");
        l.e(mVar2, "outOfQuotaPolicy");
        this.f3834a = str;
        this.f3835b = sVar;
        this.f3836c = str2;
        this.f3837d = str3;
        this.f3838e = bVar;
        this.f3839f = bVar4;
        this.f3840g = j4;
        this.f3841h = j5;
        this.f3842i = j6;
        this.f3843j = bVar5;
        this.f3844k = i4;
        this.f3845l = aVar2;
        this.f3846m = j7;
        this.f3847n = j8;
        this.f3848o = j9;
        this.f3849p = j10;
        this.f3850q = z4;
        this.f3851r = mVar2;
        this.f3852s = i5;
        this.f3853t = i6;
    }

    public static /* synthetic */ u c(u uVar, String str, s sVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j4, long j5, long j6, Q0.b bVar3, int i4, Q0.a aVar, long j7, long j8, long j9, long j10, boolean z4, m mVar, int i5, int i6, int i7, Object obj) {
        u uVar2 = uVar;
        int i8 = i7;
        return uVar.b((i8 & 1) != 0 ? uVar2.f3834a : str, (i8 & 2) != 0 ? uVar2.f3835b : sVar, (i8 & 4) != 0 ? uVar2.f3836c : str2, (i8 & 8) != 0 ? uVar2.f3837d : str3, (i8 & 16) != 0 ? uVar2.f3838e : bVar, (i8 & 32) != 0 ? uVar2.f3839f : bVar2, (i8 & 64) != 0 ? uVar2.f3840g : j4, (i8 & 128) != 0 ? uVar2.f3841h : j5, (i8 & 256) != 0 ? uVar2.f3842i : j6, (i8 & 512) != 0 ? uVar2.f3843j : bVar3, (i8 & 1024) != 0 ? uVar2.f3844k : i4, (i8 & 2048) != 0 ? uVar2.f3845l : aVar, (i8 & 4096) != 0 ? uVar2.f3846m : j7, (i8 & 8192) != 0 ? uVar2.f3847n : j8, (i8 & 16384) != 0 ? uVar2.f3848o : j9, (i8 & 32768) != 0 ? uVar2.f3849p : j10, (i8 & 65536) != 0 ? uVar2.f3850q : z4, (131072 & i8) != 0 ? uVar2.f3851r : mVar, (i8 & 262144) != 0 ? uVar2.f3852s : i5, (i8 & 524288) != 0 ? uVar2.f3853t : i6);
    }

    public final long a() {
        if (g()) {
            return this.f3847n + e.d(this.f3845l == Q0.a.LINEAR ? this.f3846m * ((long) this.f3844k) : (long) Math.scalb((float) this.f3846m, this.f3844k - 1), 18000000);
        }
        long j4 = 0;
        if (h()) {
            int i4 = this.f3852s;
            long j5 = this.f3847n;
            if (i4 == 0) {
                j5 += this.f3840g;
            }
            long j6 = this.f3842i;
            long j7 = this.f3841h;
            if (j6 != j7) {
                if (i4 == 0) {
                    j4 = ((long) -1) * j6;
                }
                j5 += j7;
            } else if (i4 != 0) {
                j4 = j7;
            }
            return j5 + j4;
        }
        long j8 = this.f3847n;
        if (j8 == 0) {
            j8 = System.currentTimeMillis();
        }
        return j8 + this.f3840g;
    }

    public final u b(String str, s sVar, String str2, String str3, androidx.work.b bVar, androidx.work.b bVar2, long j4, long j5, long j6, Q0.b bVar3, int i4, Q0.a aVar, long j7, long j8, long j9, long j10, boolean z4, m mVar, int i5, int i6) {
        String str4 = str;
        l.e(str4, "id");
        l.e(sVar, "state");
        l.e(str2, "workerClassName");
        l.e(bVar, "input");
        l.e(bVar2, "output");
        l.e(bVar3, "constraints");
        l.e(aVar, "backoffPolicy");
        l.e(mVar, "outOfQuotaPolicy");
        return new u(str4, sVar, str2, str3, bVar, bVar2, j4, j5, j6, bVar3, i4, aVar, j7, j8, j9, j10, z4, mVar, i5, i6);
    }

    public final int d() {
        return this.f3853t;
    }

    public final int e() {
        return this.f3852s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return l.a(this.f3834a, uVar.f3834a) && this.f3835b == uVar.f3835b && l.a(this.f3836c, uVar.f3836c) && l.a(this.f3837d, uVar.f3837d) && l.a(this.f3838e, uVar.f3838e) && l.a(this.f3839f, uVar.f3839f) && this.f3840g == uVar.f3840g && this.f3841h == uVar.f3841h && this.f3842i == uVar.f3842i && l.a(this.f3843j, uVar.f3843j) && this.f3844k == uVar.f3844k && this.f3845l == uVar.f3845l && this.f3846m == uVar.f3846m && this.f3847n == uVar.f3847n && this.f3848o == uVar.f3848o && this.f3849p == uVar.f3849p && this.f3850q == uVar.f3850q && this.f3851r == uVar.f3851r && this.f3852s == uVar.f3852s && this.f3853t == uVar.f3853t;
    }

    public final boolean f() {
        return !l.a(Q0.b.f2345j, this.f3843j);
    }

    public final boolean g() {
        return this.f3835b == s.ENQUEUED && this.f3844k > 0;
    }

    public final boolean h() {
        return this.f3841h != 0;
    }

    public int hashCode() {
        int hashCode = ((((this.f3834a.hashCode() * 31) + this.f3835b.hashCode()) * 31) + this.f3836c.hashCode()) * 31;
        String str = this.f3837d;
        int hashCode2 = (((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f3838e.hashCode()) * 31) + this.f3839f.hashCode()) * 31) + Long.hashCode(this.f3840g)) * 31) + Long.hashCode(this.f3841h)) * 31) + Long.hashCode(this.f3842i)) * 31) + this.f3843j.hashCode()) * 31) + Integer.hashCode(this.f3844k)) * 31) + this.f3845l.hashCode()) * 31) + Long.hashCode(this.f3846m)) * 31) + Long.hashCode(this.f3847n)) * 31) + Long.hashCode(this.f3848o)) * 31) + Long.hashCode(this.f3849p)) * 31;
        boolean z4 = this.f3850q;
        if (z4) {
            z4 = true;
        }
        return ((((((hashCode2 + (z4 ? 1 : 0)) * 31) + this.f3851r.hashCode()) * 31) + Integer.hashCode(this.f3852s)) * 31) + Integer.hashCode(this.f3853t);
    }

    public final void i(long j4) {
        if (j4 < 900000) {
            i.e().k(f3832v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        j(e.b(j4, 900000), e.b(j4, 900000));
    }

    public final void j(long j4, long j5) {
        if (j4 < 900000) {
            i.e().k(f3832v, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        this.f3841h = e.b(j4, 900000);
        if (j5 < 300000) {
            i.e().k(f3832v, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j5 > this.f3841h) {
            i e4 = i.e();
            String str = f3832v;
            e4.k(str, "Flex duration greater than interval duration; Changed to " + j4);
        }
        this.f3842i = e.e(j5, 300000, this.f3841h);
    }

    public String toString() {
        return "{WorkSpec: " + this.f3834a + '}';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ u(java.lang.String r31, Q0.s r32, java.lang.String r33, java.lang.String r34, androidx.work.b r35, androidx.work.b r36, long r37, long r39, long r41, Q0.b r43, int r44, Q0.a r45, long r46, long r48, long r50, long r52, boolean r54, Q0.m r55, int r56, int r57, int r58, v3.g r59) {
        /*
            r30 = this;
            r0 = r58
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            Q0.s r1 = Q0.s.ENQUEUED
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r32
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r6 = r1
            goto L_0x0015
        L_0x0013:
            r6 = r34
        L_0x0015:
            r1 = r0 & 16
            java.lang.String r2 = "EMPTY"
            if (r1 == 0) goto L_0x0022
            androidx.work.b r1 = androidx.work.b.f6127c
            v3.l.d(r1, r2)
            r7 = r1
            goto L_0x0024
        L_0x0022:
            r7 = r35
        L_0x0024:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002f
            androidx.work.b r1 = androidx.work.b.f6127c
            v3.l.d(r1, r2)
            r8 = r1
            goto L_0x0031
        L_0x002f:
            r8 = r36
        L_0x0031:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0039
            r9 = r2
            goto L_0x003b
        L_0x0039:
            r9 = r37
        L_0x003b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0041
            r11 = r2
            goto L_0x0043
        L_0x0041:
            r11 = r39
        L_0x0043:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0049
            r13 = r2
            goto L_0x004b
        L_0x0049:
            r13 = r41
        L_0x004b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0053
            Q0.b r1 = Q0.b.f2345j
            r15 = r1
            goto L_0x0055
        L_0x0053:
            r15 = r43
        L_0x0055:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x005d
            r16 = r5
            goto L_0x005f
        L_0x005d:
            r16 = r44
        L_0x005f:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0068
            Q0.a r1 = Q0.a.EXPONENTIAL
            r17 = r1
            goto L_0x006a
        L_0x0068:
            r17 = r45
        L_0x006a:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0071
            r18 = 30000(0x7530, double:1.4822E-319)
            goto L_0x0073
        L_0x0071:
            r18 = r46
        L_0x0073:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x007a
            r20 = r2
            goto L_0x007c
        L_0x007a:
            r20 = r48
        L_0x007c:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0083
            r22 = r2
            goto L_0x0085
        L_0x0083:
            r22 = r50
        L_0x0085:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0090
            r1 = -1
            r24 = r1
            goto L_0x0092
        L_0x0090:
            r24 = r52
        L_0x0092:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009a
            r26 = r5
            goto L_0x009c
        L_0x009a:
            r26 = r54
        L_0x009c:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a6
            Q0.m r1 = Q0.m.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            r27 = r1
            goto L_0x00a8
        L_0x00a6:
            r27 = r55
        L_0x00a8:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b0
            r28 = r5
            goto L_0x00b2
        L_0x00b0:
            r28 = r56
        L_0x00b2:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00ba
            r29 = r5
            goto L_0x00bc
        L_0x00ba:
            r29 = r57
        L_0x00bc:
            r2 = r30
            r3 = r31
            r5 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.u.<init>(java.lang.String, Q0.s, java.lang.String, java.lang.String, androidx.work.b, androidx.work.b, long, long, long, Q0.b, int, Q0.a, long, long, long, long, boolean, Q0.m, int, int, int, v3.g):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u(String str, String str2) {
        this(str, (s) null, str2, (String) null, (androidx.work.b) null, (androidx.work.b) null, 0, 0, 0, (Q0.b) null, 0, (Q0.a) null, 0, 0, 0, 0, false, (m) null, 0, 0, 1048570, (g) null);
        l.e(str, "id");
        l.e(str2, "workerClassName_");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public u(java.lang.String r34, Z0.u r35) {
        /*
            r33 = this;
            r0 = r35
            r1 = r33
            r2 = r34
            java.lang.String r3 = "newId"
            r4 = r34
            v3.l.e(r4, r3)
            java.lang.String r3 = "other"
            v3.l.e(r0, r3)
            java.lang.String r4 = r0.f3836c
            Q0.s r3 = r0.f3835b
            java.lang.String r5 = r0.f3837d
            androidx.work.b r7 = new androidx.work.b
            r6 = r7
            androidx.work.b r8 = r0.f3838e
            r7.<init>((androidx.work.b) r8)
            androidx.work.b r8 = new androidx.work.b
            r7 = r8
            androidx.work.b r9 = r0.f3839f
            r8.<init>((androidx.work.b) r9)
            long r8 = r0.f3840g
            long r10 = r0.f3841h
            long r12 = r0.f3842i
            Q0.b r15 = new Q0.b
            r14 = r15
            r31 = r1
            Q0.b r1 = r0.f3843j
            r15.<init>(r1)
            int r15 = r0.f3844k
            Q0.a r1 = r0.f3845l
            r16 = r1
            r32 = r2
            long r1 = r0.f3846m
            r17 = r1
            long r1 = r0.f3847n
            r19 = r1
            long r1 = r0.f3848o
            r21 = r1
            long r1 = r0.f3849p
            r23 = r1
            boolean r1 = r0.f3850q
            r25 = r1
            Q0.m r1 = r0.f3851r
            r26 = r1
            int r0 = r0.f3852s
            r27 = r0
            r29 = 524288(0x80000, float:7.34684E-40)
            r30 = 0
            r28 = 0
            r1 = r31
            r2 = r32
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r12, r14, r15, r16, r17, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.u.<init>(java.lang.String, Z0.u):void");
    }
}
