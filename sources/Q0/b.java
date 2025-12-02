package Q0;

import android.net.Uri;
import i3.C0746w;
import java.util.LinkedHashSet;
import java.util.Set;
import v3.g;
import v3.l;

public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final C0052b f2344i = new C0052b((g) null);

    /* renamed from: j  reason: collision with root package name */
    public static final b f2345j = new b((j) null, false, false, false, false, 0, 0, (Set) null, 255, (g) null);

    /* renamed from: a  reason: collision with root package name */
    public final j f2346a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2347b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2348c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2349d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f2350e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2351f;

    /* renamed from: g  reason: collision with root package name */
    public final long f2352g;

    /* renamed from: h  reason: collision with root package name */
    public final Set f2353h;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2354a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2355b;

        /* renamed from: c  reason: collision with root package name */
        public j f2356c = j.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2357d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2358e;

        /* renamed from: f  reason: collision with root package name */
        public long f2359f = -1;

        /* renamed from: g  reason: collision with root package name */
        public long f2360g = -1;

        /* renamed from: h  reason: collision with root package name */
        public Set f2361h = new LinkedHashSet();

        public final b a() {
            Set L4 = C0746w.L(this.f2361h);
            long j4 = this.f2359f;
            long j5 = this.f2360g;
            return new b(this.f2356c, this.f2354a, this.f2355b, this.f2357d, this.f2358e, j4, j5, L4);
        }

        public final a b(j jVar) {
            l.e(jVar, "networkType");
            this.f2356c = jVar;
            return this;
        }
    }

    /* renamed from: Q0.b$b  reason: collision with other inner class name */
    public static final class C0052b {
        public /* synthetic */ C0052b(g gVar) {
            this();
        }

        public C0052b() {
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f2362a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2363b;

        public c(Uri uri, boolean z4) {
            l.e(uri, "uri");
            this.f2362a = uri;
            this.f2363b = z4;
        }

        public final Uri a() {
            return this.f2362a;
        }

        public final boolean b() {
            return this.f2363b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!l.a(c.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            l.c(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) obj;
            return l.a(this.f2362a, cVar.f2362a) && this.f2363b == cVar.f2363b;
        }

        public int hashCode() {
            return (this.f2362a.hashCode() * 31) + Boolean.hashCode(this.f2363b);
        }
    }

    public b(j jVar, boolean z4, boolean z5, boolean z6, boolean z7, long j4, long j5, Set set) {
        l.e(jVar, "requiredNetworkType");
        l.e(set, "contentUriTriggers");
        this.f2346a = jVar;
        this.f2347b = z4;
        this.f2348c = z5;
        this.f2349d = z6;
        this.f2350e = z7;
        this.f2351f = j4;
        this.f2352g = j5;
        this.f2353h = set;
    }

    public final long a() {
        return this.f2352g;
    }

    public final long b() {
        return this.f2351f;
    }

    public final Set c() {
        return this.f2353h;
    }

    public final j d() {
        return this.f2346a;
    }

    public final boolean e() {
        return !this.f2353h.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!l.a(b.class, obj.getClass())) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2347b == bVar.f2347b && this.f2348c == bVar.f2348c && this.f2349d == bVar.f2349d && this.f2350e == bVar.f2350e && this.f2351f == bVar.f2351f && this.f2352g == bVar.f2352g && this.f2346a == bVar.f2346a) {
            return l.a(this.f2353h, bVar.f2353h);
        }
        return false;
    }

    public final boolean f() {
        return this.f2349d;
    }

    public final boolean g() {
        return this.f2347b;
    }

    public final boolean h() {
        return this.f2348c;
    }

    public int hashCode() {
        long j4 = this.f2351f;
        long j5 = this.f2352g;
        return (((((((((((((this.f2346a.hashCode() * 31) + (this.f2347b ? 1 : 0)) * 31) + (this.f2348c ? 1 : 0)) * 31) + (this.f2349d ? 1 : 0)) * 31) + (this.f2350e ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f2353h.hashCode();
    }

    public final boolean i() {
        return this.f2350e;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(Q0.j r12, boolean r13, boolean r14, boolean r15, boolean r16, long r17, long r19, java.util.Set r21, int r22, v3.g r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            Q0.j r1 = Q0.j.NOT_REQUIRED
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r13
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r3
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r3
            goto L_0x0020
        L_0x001f:
            r5 = r15
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r3 = r16
        L_0x0027:
            r6 = r0 & 32
            r7 = -1
            if (r6 == 0) goto L_0x002f
            r9 = r7
            goto L_0x0031
        L_0x002f:
            r9 = r17
        L_0x0031:
            r6 = r0 & 64
            if (r6 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = r19
        L_0x0038:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0041
            java.util.Set r0 = i3.C0723G.d()
            goto L_0x0043
        L_0x0041:
            r0 = r21
        L_0x0043:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r4
            r16 = r5
            r17 = r3
            r18 = r9
            r20 = r7
            r22 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.b.<init>(Q0.j, boolean, boolean, boolean, boolean, long, long, java.util.Set, int, v3.g):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(Q0.b r13) {
        /*
            r12 = this;
            java.lang.String r0 = "other"
            v3.l.e(r13, r0)
            boolean r3 = r13.f2347b
            boolean r4 = r13.f2348c
            Q0.j r2 = r13.f2346a
            boolean r5 = r13.f2349d
            boolean r6 = r13.f2350e
            java.util.Set r11 = r13.f2353h
            long r7 = r13.f2351f
            long r9 = r13.f2352g
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.b.<init>(Q0.b):void");
    }
}
