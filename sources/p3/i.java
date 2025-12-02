package P3;

import C3.o;
import O3.d;
import O3.r;
import h3.C0670k;
import h3.C0673n;
import i3.C0721E;
import i3.C0746w;
import java.io.IOException;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import k3.C0771a;
import u3.p;
import v3.g;
import v3.l;
import v3.m;
import v3.t;
import v3.v;
import v3.w;

public abstract class i {

    public static final class a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C0771a.a(((h) obj).a(), ((h) obj2).a());
        }
    }

    public static final class b extends m implements p {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ t f2297f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f2298g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ v f2299h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ d f2300i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ v f2301j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ v f2302k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(t tVar, long j4, v vVar, d dVar, v vVar2, v vVar3) {
            super(2);
            this.f2297f = tVar;
            this.f2298g = j4;
            this.f2299h = vVar;
            this.f2300i = dVar;
            this.f2301j = vVar2;
            this.f2302k = vVar3;
        }

        public final void a(int i4, long j4) {
            if (i4 == 1) {
                t tVar = this.f2297f;
                if (!tVar.f12466e) {
                    tVar.f12466e = true;
                    if (j4 >= this.f2298g) {
                        v vVar = this.f2299h;
                        long j5 = vVar.f12468e;
                        if (j5 == 4294967295L) {
                            j5 = this.f2300i.u();
                        }
                        vVar.f12468e = j5;
                        v vVar2 = this.f2301j;
                        long j6 = 0;
                        vVar2.f12468e = vVar2.f12468e == 4294967295L ? this.f2300i.u() : 0;
                        v vVar3 = this.f2302k;
                        if (vVar3.f12468e == 4294967295L) {
                            j6 = this.f2300i.u();
                        }
                        vVar3.f12468e = j6;
                        return;
                    }
                    throw new IOException("bad zip: zip64 extra too short");
                }
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }

        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C0673n.f9639a;
        }
    }

    public static final class c extends m implements p {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ d f2303f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ w f2304g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ w f2305h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ w f2306i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(d dVar, w wVar, w wVar2, w wVar3) {
            super(2);
            this.f2303f = dVar;
            this.f2304g = wVar;
            this.f2305h = wVar2;
            this.f2306i = wVar3;
        }

        public final void a(int i4, long j4) {
            if (i4 == 21589) {
                long j5 = 1;
                if (j4 >= 1) {
                    byte readByte = this.f2303f.readByte();
                    boolean z4 = false;
                    boolean z5 = (readByte & 1) == 1;
                    boolean z6 = (readByte & 2) == 2;
                    if ((readByte & 4) == 4) {
                        z4 = true;
                    }
                    d dVar = this.f2303f;
                    if (z5) {
                        j5 = 5;
                    }
                    if (z6) {
                        j5 += 4;
                    }
                    if (z4) {
                        j5 += 4;
                    }
                    if (j4 >= j5) {
                        if (z5) {
                            this.f2304g.f12469e = Long.valueOf(((long) dVar.n()) * 1000);
                        }
                        if (z6) {
                            this.f2305h.f12469e = Long.valueOf(((long) this.f2303f.n()) * 1000);
                        }
                        if (z4) {
                            this.f2306i.f12469e = Long.valueOf(((long) this.f2303f.n()) * 1000);
                            return;
                        }
                        return;
                    }
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }

        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2) {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return C0673n.f9639a;
        }
    }

    public static final Map a(List list) {
        r e4 = r.a.e(r.f2128f, "/", false, 1, (Object) null);
        Map j4 = C0721E.j(C0670k.a(e4, new h(e4, true, (String) null, 0, 0, 0, 0, (Long) null, 0, 508, (g) null)));
        for (h hVar : C0746w.F(list, new a())) {
            if (((h) j4.put(hVar.a(), hVar)) == null) {
                while (true) {
                    r q4 = hVar.a().q();
                    if (q4 == null) {
                        break;
                    }
                    h hVar2 = (h) j4.get(q4);
                    if (hVar2 != null) {
                        hVar2.b().add(hVar.a());
                        break;
                    }
                    h hVar3 = r4;
                    h hVar4 = new h(q4, true, (String) null, 0, 0, 0, 0, (Long) null, 0, 508, (g) null);
                    h hVar5 = hVar3;
                    j4.put(q4, hVar5);
                    hVar5.b().add(hVar.a());
                    hVar = hVar5;
                }
            }
        }
        return j4;
    }

    public static final Long b(int i4, int i5) {
        if (i5 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        GregorianCalendar gregorianCalendar2 = gregorianCalendar;
        gregorianCalendar2.set(((i4 >> 9) & 127) + 1980, ((i4 >> 5) & 15) - 1, i4 & 31, (i5 >> 11) & 31, (i5 >> 5) & 63, (i5 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    public static final String c(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String num = Integer.toString(i4, C3.a.a(16));
        l.d(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r10.close();
        r4 = r4 - ((long) 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r4 <= 0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r4 = O3.o.b(r3.w(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r4.n() != 117853008) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r5 = r4.n();
        r12 = r4.u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (r4.n() != 1) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r5 != 0) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r5 = O3.o.b(r3.w(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r10 = r5.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r10 != 101075792) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r8 = j(r5, r8);
        r10 = h3.C0673n.f9639a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        s3.b.a(r5, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        throw new java.io.IOException("bad zip: expected " + c(101075792) + " but was " + c(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c6, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        s3.b.a(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ca, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d2, code lost:
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
        r5 = h3.C0673n.f9639a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        s3.b.a(r4, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        s3.b.a(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        r4 = new java.util.ArrayList();
        r5 = O3.o.b(r3.w(r8.a()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r12 = r8.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fb, code lost:
        if (r6 >= r12) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00fd, code lost:
        r10 = e(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010b, code lost:
        if (r10.f() >= r8.a()) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0117, code lost:
        if (((java.lang.Boolean) r2.i(r10)).booleanValue() == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0119, code lost:
        r4.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x011e, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0120, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012b, code lost:
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012c, code lost:
        r2 = h3.C0673n.f9639a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        s3.b.a(r5, (java.lang.Throwable) null);
        r4 = new O3.A(r0, r1, a(r4), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x013a, code lost:
        s3.b.a(r3, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x013d, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0140, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        s3.b.a(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0144, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        r8 = f(r10);
        r9 = r10.a((long) r8.b());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final O3.A d(O3.r r18, O3.h r19, u3.l r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "zipPath"
            v3.l.e(r0, r3)
            java.lang.String r3 = "fileSystem"
            v3.l.e(r1, r3)
            java.lang.String r3 = "predicate"
            v3.l.e(r2, r3)
            O3.f r3 = r1.i(r0)
            long r4 = r3.t()     // Catch:{ all -> 0x00d9 }
            r6 = 22
            long r6 = (long) r6     // Catch:{ all -> 0x00d9 }
            long r4 = r4 - r6
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x015f
            r8 = 65536(0x10000, double:3.2379E-319)
            long r8 = r4 - r8
            long r8 = java.lang.Math.max(r8, r6)     // Catch:{ all -> 0x00d9 }
        L_0x0030:
            O3.y r10 = r3.w(r4)     // Catch:{ all -> 0x00d9 }
            O3.d r10 = O3.o.b(r10)     // Catch:{ all -> 0x00d9 }
            int r11 = r10.n()     // Catch:{ all -> 0x0145 }
            r12 = 101010256(0x6054b50, float:2.506985E-35)
            if (r11 != r12) goto L_0x0147
            P3.e r8 = f(r10)     // Catch:{ all -> 0x0145 }
            int r9 = r8.b()     // Catch:{ all -> 0x0145 }
            long r11 = (long) r9     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = r10.a(r11)     // Catch:{ all -> 0x0145 }
            r10.close()     // Catch:{ all -> 0x00d9 }
            r10 = 20
            long r10 = (long) r10     // Catch:{ all -> 0x00d9 }
            long r4 = r4 - r10
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r11 = 0
            if (r10 <= 0) goto L_0x00e4
            O3.y r4 = r3.w(r4)     // Catch:{ all -> 0x00d9 }
            O3.d r4 = O3.o.b(r4)     // Catch:{ all -> 0x00d9 }
            int r5 = r4.n()     // Catch:{ all -> 0x0097 }
            r10 = 117853008(0x7064b50, float:1.0103172E-34)
            if (r5 != r10) goto L_0x00d3
            int r5 = r4.n()     // Catch:{ all -> 0x0097 }
            long r12 = r4.u()     // Catch:{ all -> 0x0097 }
            int r10 = r4.n()     // Catch:{ all -> 0x0097 }
            r14 = 1
            if (r10 != r14) goto L_0x00cb
            if (r5 != 0) goto L_0x00cb
            O3.y r5 = r3.w(r12)     // Catch:{ all -> 0x0097 }
            O3.d r5 = O3.o.b(r5)     // Catch:{ all -> 0x0097 }
            int r10 = r5.n()     // Catch:{ all -> 0x009a }
            r12 = 101075792(0x6064b50, float:2.525793E-35)
            if (r10 != r12) goto L_0x009d
            P3.e r8 = j(r5, r8)     // Catch:{ all -> 0x009a }
            h3.n r10 = h3.C0673n.f9639a     // Catch:{ all -> 0x009a }
            s3.b.a(r5, r11)     // Catch:{ all -> 0x0097 }
            goto L_0x00d3
        L_0x0097:
            r0 = move-exception
            r1 = r0
            goto L_0x00dd
        L_0x009a:
            r0 = move-exception
            r1 = r0
            goto L_0x00c4
        L_0x009d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r1.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "bad zip: expected "
            r1.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = c(r12)     // Catch:{ all -> 0x009a }
            r1.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = " but was "
            r1.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = c(r10)     // Catch:{ all -> 0x009a }
            r1.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x009a }
            r0.<init>(r1)     // Catch:{ all -> 0x009a }
            throw r0     // Catch:{ all -> 0x009a }
        L_0x00c4:
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            r2 = r0
            s3.b.a(r5, r1)     // Catch:{ all -> 0x0097 }
            throw r2     // Catch:{ all -> 0x0097 }
        L_0x00cb:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = "unsupported zip: spanned"
            r0.<init>(r1)     // Catch:{ all -> 0x0097 }
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x00d3:
            h3.n r5 = h3.C0673n.f9639a     // Catch:{ all -> 0x0097 }
            s3.b.a(r4, r11)     // Catch:{ all -> 0x00d9 }
            goto L_0x00e4
        L_0x00d9:
            r0 = move-exception
            r1 = r0
            goto L_0x017a
        L_0x00dd:
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            r2 = r0
            s3.b.a(r4, r1)     // Catch:{ all -> 0x00d9 }
            throw r2     // Catch:{ all -> 0x00d9 }
        L_0x00e4:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00d9 }
            r4.<init>()     // Catch:{ all -> 0x00d9 }
            long r12 = r8.a()     // Catch:{ all -> 0x00d9 }
            O3.y r5 = r3.w(r12)     // Catch:{ all -> 0x00d9 }
            O3.d r5 = O3.o.b(r5)     // Catch:{ all -> 0x00d9 }
            long r12 = r8.c()     // Catch:{ all -> 0x011d }
        L_0x00f9:
            int r10 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x012c
            P3.h r10 = e(r5)     // Catch:{ all -> 0x011d }
            long r14 = r10.f()     // Catch:{ all -> 0x011d }
            long r16 = r8.a()     // Catch:{ all -> 0x011d }
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L_0x0124
            java.lang.Object r14 = r2.i(r10)     // Catch:{ all -> 0x011d }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x011d }
            boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x011d }
            if (r14 == 0) goto L_0x0120
            r4.add(r10)     // Catch:{ all -> 0x011d }
            goto L_0x0120
        L_0x011d:
            r0 = move-exception
            r1 = r0
            goto L_0x013e
        L_0x0120:
            r14 = 1
            long r6 = r6 + r14
            goto L_0x00f9
        L_0x0124:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x011d }
            java.lang.String r1 = "bad zip: local file header offset >= central directory offset"
            r0.<init>(r1)     // Catch:{ all -> 0x011d }
            throw r0     // Catch:{ all -> 0x011d }
        L_0x012c:
            h3.n r2 = h3.C0673n.f9639a     // Catch:{ all -> 0x011d }
            s3.b.a(r5, r11)     // Catch:{ all -> 0x00d9 }
            java.util.Map r2 = a(r4)     // Catch:{ all -> 0x00d9 }
            O3.A r4 = new O3.A     // Catch:{ all -> 0x00d9 }
            r4.<init>(r0, r1, r2, r9)     // Catch:{ all -> 0x00d9 }
            s3.b.a(r3, r11)
            return r4
        L_0x013e:
            throw r1     // Catch:{ all -> 0x013f }
        L_0x013f:
            r0 = move-exception
            r2 = r0
            s3.b.a(r5, r1)     // Catch:{ all -> 0x00d9 }
            throw r2     // Catch:{ all -> 0x00d9 }
        L_0x0145:
            r0 = move-exception
            goto L_0x015b
        L_0x0147:
            r10.close()     // Catch:{ all -> 0x00d9 }
            r10 = -1
            long r4 = r4 + r10
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 < 0) goto L_0x0153
            goto L_0x0030
        L_0x0153:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = "not a zip: end of central directory signature not found"
            r0.<init>(r1)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x015b:
            r10.close()     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x015f:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r1.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = "not a zip: size="
            r1.append(r2)     // Catch:{ all -> 0x00d9 }
            long r4 = r3.t()     // Catch:{ all -> 0x00d9 }
            r1.append(r4)     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00d9 }
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x017a:
            throw r1     // Catch:{ all -> 0x017b }
        L_0x017b:
            r0 = move-exception
            r2 = r0
            s3.b.a(r3, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: P3.i.d(O3.r, O3.h, u3.l):O3.A");
    }

    public static final h e(d dVar) {
        d dVar2 = dVar;
        l.e(dVar2, "<this>");
        int n4 = dVar.n();
        if (n4 == 33639248) {
            dVar2.skip(4);
            short q4 = dVar.q();
            short s4 = q4 & 65535;
            if ((q4 & 1) == 0) {
                short q5 = dVar.q() & 65535;
                Long b4 = b(dVar.q() & 65535, dVar.q() & 65535);
                long n5 = ((long) dVar.n()) & 4294967295L;
                v vVar = new v();
                vVar.f12468e = ((long) dVar.n()) & 4294967295L;
                v vVar2 = new v();
                vVar2.f12468e = ((long) dVar.n()) & 4294967295L;
                short q6 = dVar.q() & 65535;
                short q7 = dVar.q() & 65535;
                dVar2.skip(8);
                v vVar3 = new v();
                vVar3.f12468e = ((long) dVar.n()) & 4294967295L;
                String a4 = dVar2.a((long) (dVar.q() & 65535));
                if (!C3.p.y(a4, 0, false, 2, (Object) null)) {
                    long j4 = vVar2.f12468e == 4294967295L ? (long) 8 : 0;
                    long j5 = vVar.f12468e == 4294967295L ? j4 + ((long) 8) : j4;
                    String str = a4;
                    if (vVar3.f12468e == 4294967295L) {
                        j5 += (long) 8;
                    }
                    long j6 = j5;
                    t tVar = new t();
                    long j7 = n5;
                    b bVar = r0;
                    t tVar2 = tVar;
                    String str2 = str;
                    v vVar4 = vVar3;
                    b bVar2 = new b(tVar, j6, vVar2, dVar, vVar, vVar3);
                    g(dVar2, q6, bVar);
                    if (j6 <= 0 || tVar2.f12466e) {
                        String str3 = str2;
                        return new h(r.a.e(r.f2128f, "/", false, 1, (Object) null).t(str3), o.n(str3, "/", false, 2, (Object) null), dVar2.a((long) q7), j7, vVar.f12468e, vVar2.f12468e, q5, b4, vVar4.f12468e);
                    }
                    throw new IOException("bad zip: zip64 extra required but absent");
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(s4));
        }
        throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(n4));
    }

    public static final e f(d dVar) {
        short q4 = dVar.q() & 65535;
        short q5 = dVar.q() & 65535;
        long q6 = (long) (dVar.q() & 65535);
        if (q6 == ((long) (dVar.q() & 65535)) && q4 == 0 && q5 == 0) {
            dVar.skip(4);
            return new e(q6, 4294967295L & ((long) dVar.n()), dVar.q() & 65535);
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void g(d dVar, int i4, p pVar) {
        long j4 = (long) i4;
        while (j4 != 0) {
            if (j4 >= 4) {
                short q4 = dVar.q() & 65535;
                long q5 = ((long) dVar.q()) & 65535;
                long j5 = j4 - ((long) 4);
                if (j5 >= q5) {
                    dVar.A(q5);
                    long H4 = dVar.o().H();
                    pVar.g(Integer.valueOf(q4), Long.valueOf(q5));
                    long H5 = (dVar.o().H() + q5) - H4;
                    int i5 = (H5 > 0 ? 1 : (H5 == 0 ? 0 : -1));
                    if (i5 >= 0) {
                        if (i5 > 0) {
                            dVar.o().skip(H5);
                        }
                        j4 = j5 - q5;
                    } else {
                        throw new IOException("unsupported zip: too many bytes processed for " + q4);
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final O3.g h(d dVar, O3.g gVar) {
        l.e(dVar, "<this>");
        l.e(gVar, "basicMetadata");
        O3.g i4 = i(dVar, gVar);
        l.b(i4);
        return i4;
    }

    public static final O3.g i(d dVar, O3.g gVar) {
        d dVar2 = dVar;
        w wVar = new w();
        wVar.f12469e = gVar != null ? gVar.a() : null;
        w wVar2 = new w();
        w wVar3 = new w();
        int n4 = dVar.n();
        if (n4 == 67324752) {
            dVar2.skip(2);
            short q4 = dVar.q();
            short s4 = q4 & 65535;
            if ((q4 & 1) == 0) {
                dVar2.skip(18);
                short q5 = dVar.q() & 65535;
                dVar2.skip(((long) dVar.q()) & 65535);
                if (gVar == null) {
                    dVar2.skip((long) q5);
                    return null;
                }
                g(dVar2, q5, new c(dVar2, wVar, wVar2, wVar3));
                return new O3.g(gVar.d(), gVar.c(), (r) null, gVar.b(), (Long) wVar3.f12469e, (Long) wVar.f12469e, (Long) wVar2.f12469e, (Map) null, 128, (g) null);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(s4));
        }
        throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(n4));
    }

    public static final e j(d dVar, e eVar) {
        dVar.skip(12);
        int n4 = dVar.n();
        int n5 = dVar.n();
        long u4 = dVar.u();
        if (u4 == dVar.u() && n4 == 0 && n5 == 0) {
            dVar.skip(8);
            return new e(u4, dVar.u(), eVar.b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void k(d dVar) {
        l.e(dVar, "<this>");
        i(dVar, (O3.g) null);
    }
}
