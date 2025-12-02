package O3;

import O3.r;
import java.io.IOException;
import java.util.Map;
import v3.g;
import v3.l;

public final class A extends h {

    /* renamed from: i  reason: collision with root package name */
    public static final a f2074i = new a((g) null);

    /* renamed from: j  reason: collision with root package name */
    public static final r f2075j = r.a.e(r.f2128f, "/", false, 1, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    public final r f2076e;

    /* renamed from: f  reason: collision with root package name */
    public final h f2077f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f2078g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2079h;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public A(r rVar, h hVar, Map map, String str) {
        l.e(rVar, "zipPath");
        l.e(hVar, "fileSystem");
        l.e(map, "entries");
        this.f2076e = rVar;
        this.f2077f = hVar;
        this.f2078g = map;
        this.f2079h = str;
    }

    public void a(r rVar, r rVar2) {
        l.e(rVar, "source");
        l.e(rVar2, "target");
        throw new IOException("zip file systems are read-only");
    }

    public void d(r rVar, boolean z4) {
        l.e(rVar, "dir");
        throw new IOException("zip file systems are read-only");
    }

    public void f(r rVar, boolean z4) {
        l.e(rVar, "path");
        throw new IOException("zip file systems are read-only");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public O3.g h(O3.r r15) {
        /*
            r14 = this;
            java.lang.String r0 = "path"
            v3.l.e(r15, r0)
            O3.r r15 = r14.m(r15)
            java.util.Map r0 = r14.f2078g
            java.lang.Object r15 = r0.get(r15)
            P3.h r15 = (P3.h) r15
            r0 = 0
            if (r15 != 0) goto L_0x0015
            return r0
        L_0x0015:
            O3.g r12 = new O3.g
            boolean r1 = r15.h()
            r2 = r1 ^ 1
            boolean r3 = r15.h()
            boolean r1 = r15.h()
            if (r1 == 0) goto L_0x0029
            r5 = r0
            goto L_0x0032
        L_0x0029:
            long r4 = r15.g()
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r5 = r1
        L_0x0032:
            java.lang.Long r7 = r15.e()
            r10 = 128(0x80, float:1.794E-43)
            r11 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            long r1 = r15.f()
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x004c
            return r12
        L_0x004c:
            O3.h r1 = r14.f2077f
            O3.r r2 = r14.f2076e
            O3.f r1 = r1.i(r2)
            long r2 = r15.f()     // Catch:{ all -> 0x0068 }
            O3.y r15 = r1.w(r2)     // Catch:{ all -> 0x0068 }
            O3.d r15 = O3.o.b(r15)     // Catch:{ all -> 0x0068 }
            if (r1 == 0) goto L_0x0076
            r1.close()     // Catch:{ all -> 0x0066 }
            goto L_0x0076
        L_0x0066:
            r0 = move-exception
            goto L_0x0076
        L_0x0068:
            r15 = move-exception
            if (r1 == 0) goto L_0x0073
            r1.close()     // Catch:{ all -> 0x006f }
            goto L_0x0073
        L_0x006f:
            r1 = move-exception
            h3.C0660a.a(r15, r1)
        L_0x0073:
            r13 = r0
            r0 = r15
            r15 = r13
        L_0x0076:
            if (r0 != 0) goto L_0x0080
            v3.l.b(r15)
            O3.g r15 = P3.i.h(r15, r12)
            return r15
        L_0x0080:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.A.h(O3.r):O3.g");
    }

    public f i(r rVar) {
        l.e(rVar, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    public f k(r rVar, boolean z4, boolean z5) {
        l.e(rVar, "file");
        throw new IOException("zip entries are not writable");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public O3.y l(O3.r r8) {
        /*
            r7 = this;
            java.lang.String r0 = "file"
            v3.l.e(r8, r0)
            O3.r r0 = r7.m(r8)
            java.util.Map r1 = r7.f2078g
            java.lang.Object r0 = r1.get(r0)
            P3.h r0 = (P3.h) r0
            if (r0 == 0) goto L_0x0077
            O3.h r8 = r7.f2077f
            O3.r r1 = r7.f2076e
            O3.f r8 = r8.i(r1)
            r1 = 0
            long r2 = r0.f()     // Catch:{ all -> 0x0030 }
            O3.y r2 = r8.w(r2)     // Catch:{ all -> 0x0030 }
            O3.d r2 = O3.o.b(r2)     // Catch:{ all -> 0x0030 }
            if (r8 == 0) goto L_0x003e
            r8.close()     // Catch:{ all -> 0x002e }
            goto L_0x003e
        L_0x002e:
            r1 = move-exception
            goto L_0x003e
        L_0x0030:
            r2 = move-exception
            if (r8 == 0) goto L_0x003b
            r8.close()     // Catch:{ all -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r8 = move-exception
            h3.C0660a.a(r2, r8)
        L_0x003b:
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x003e:
            if (r1 != 0) goto L_0x0076
            v3.l.b(r2)
            P3.i.k(r2)
            int r8 = r0.d()
            r1 = 1
            if (r8 != 0) goto L_0x0057
            P3.f r8 = new P3.f
            long r3 = r0.g()
            r8.<init>(r2, r3, r1)
            goto L_0x0075
        L_0x0057:
            O3.j r8 = new O3.j
            P3.f r3 = new P3.f
            long r4 = r0.c()
            r3.<init>(r2, r4, r1)
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>(r1)
            r8.<init>((O3.y) r3, (java.util.zip.Inflater) r2)
            P3.f r1 = new P3.f
            long r2 = r0.g()
            r0 = 0
            r1.<init>(r8, r2, r0)
            r8 = r1
        L_0x0075:
            return r8
        L_0x0076:
            throw r1
        L_0x0077:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.A.l(O3.r):O3.y");
    }

    public final r m(r rVar) {
        return f2075j.s(rVar, true);
    }
}
