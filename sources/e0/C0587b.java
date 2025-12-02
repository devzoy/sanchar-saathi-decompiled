package e0;

import O3.h;
import c0.r;
import l3.e;
import n3.d;
import v3.l;

/* renamed from: e0.b  reason: case insensitive filesystem */
public class C0587b implements r {

    /* renamed from: a  reason: collision with root package name */
    public final h f8709a;

    /* renamed from: b  reason: collision with root package name */
    public final O3.r f8710b;

    /* renamed from: c  reason: collision with root package name */
    public final c f8711c;

    /* renamed from: d  reason: collision with root package name */
    public final C0586a f8712d = new C0586a(false);

    /* renamed from: e0.b$a */
    public static final class a extends d {

        /* renamed from: h  reason: collision with root package name */
        public Object f8713h;

        /* renamed from: i  reason: collision with root package name */
        public Object f8714i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f8715j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ C0587b f8716k;

        /* renamed from: l  reason: collision with root package name */
        public int f8717l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C0587b bVar, e eVar) {
            super(eVar);
            this.f8716k = bVar;
        }

        public final Object o(Object obj) {
            this.f8715j = obj;
            this.f8717l |= Integer.MIN_VALUE;
            return C0587b.j(this.f8716k, this);
        }
    }

    public C0587b(h hVar, O3.r rVar, c cVar) {
        l.e(hVar, "fileSystem");
        l.e(rVar, "path");
        l.e(cVar, "serializer");
        this.f8709a = hVar;
        this.f8710b = rVar;
        this.f8711c = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[SYNTHETIC, Splitter:B:29:0x0072] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0090 A[Catch:{ FileNotFoundException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0094 A[Catch:{ FileNotFoundException -> 0x008a }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00bf A[SYNTHETIC, Splitter:B:57:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object j(e0.C0587b r7, l3.e r8) {
        /*
            boolean r0 = r8 instanceof e0.C0587b.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            e0.b$a r0 = (e0.C0587b.a) r0
            int r1 = r0.f8717l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8717l = r1
            goto L_0x0018
        L_0x0013:
            e0.b$a r0 = new e0.b$a
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f8715j
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f8717l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004b
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r7 = r0.f8713h
            java.io.Closeable r7 = (java.io.Closeable) r7
            h3.C0668i.b(r8)     // Catch:{ all -> 0x0032 }
            goto L_0x00bd
        L_0x0032:
            r8 = move-exception
            goto L_0x00c9
        L_0x0035:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003d:
            java.lang.Object r7 = r0.f8714i
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r2 = r0.f8713h
            e0.b r2 = (e0.C0587b) r2
            h3.C0668i.b(r8)     // Catch:{ all -> 0x0049 }
            goto L_0x0070
        L_0x0049:
            r8 = move-exception
            goto L_0x007f
        L_0x004b:
            h3.C0668i.b(r8)
            r7.f()
            O3.h r8 = r7.f8709a     // Catch:{ FileNotFoundException -> 0x0095 }
            O3.r r2 = r7.f8710b     // Catch:{ FileNotFoundException -> 0x0095 }
            O3.y r8 = r8.l(r2)     // Catch:{ FileNotFoundException -> 0x0095 }
            O3.d r8 = O3.o.b(r8)     // Catch:{ FileNotFoundException -> 0x0095 }
            e0.c r2 = r7.f8711c     // Catch:{ all -> 0x007a }
            r0.f8713h = r7     // Catch:{ all -> 0x007a }
            r0.f8714i = r8     // Catch:{ all -> 0x007a }
            r0.f8717l = r4     // Catch:{ all -> 0x007a }
            java.lang.Object r2 = r2.b(r8, r0)     // Catch:{ all -> 0x007a }
            if (r2 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L_0x0070:
            if (r7 == 0) goto L_0x0078
            r7.close()     // Catch:{ all -> 0x0076 }
            goto L_0x0078
        L_0x0076:
            r7 = move-exception
            goto L_0x008e
        L_0x0078:
            r7 = r5
            goto L_0x008e
        L_0x007a:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L_0x007f:
            if (r7 == 0) goto L_0x008c
            r7.close()     // Catch:{ all -> 0x0085 }
            goto L_0x008c
        L_0x0085:
            r7 = move-exception
            h3.C0660a.a(r8, r7)     // Catch:{ FileNotFoundException -> 0x008a }
            goto L_0x008c
        L_0x008a:
            r7 = r2
            goto L_0x0095
        L_0x008c:
            r7 = r8
            r8 = r5
        L_0x008e:
            if (r7 != 0) goto L_0x0094
            v3.l.b(r8)     // Catch:{ FileNotFoundException -> 0x008a }
            goto L_0x00e4
        L_0x0094:
            throw r7     // Catch:{ FileNotFoundException -> 0x008a }
        L_0x0095:
            O3.h r8 = r7.f8709a
            O3.r r2 = r7.f8710b
            boolean r8 = r8.g(r2)
            if (r8 == 0) goto L_0x00dd
            O3.h r8 = r7.f8709a
            O3.r r2 = r7.f8710b
            O3.y r8 = r8.l(r2)
            O3.d r8 = O3.o.b(r8)
            e0.c r7 = r7.f8711c     // Catch:{ all -> 0x00c5 }
            r0.f8713h = r8     // Catch:{ all -> 0x00c5 }
            r0.f8714i = r5     // Catch:{ all -> 0x00c5 }
            r0.f8717l = r3     // Catch:{ all -> 0x00c5 }
            java.lang.Object r7 = r7.b(r8, r0)     // Catch:{ all -> 0x00c5 }
            if (r7 != r1) goto L_0x00ba
            return r1
        L_0x00ba:
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x00bd:
            if (r7 == 0) goto L_0x00d6
            r7.close()     // Catch:{ all -> 0x00c3 }
            goto L_0x00d6
        L_0x00c3:
            r5 = move-exception
            goto L_0x00d6
        L_0x00c5:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x00c9:
            if (r7 == 0) goto L_0x00d3
            r7.close()     // Catch:{ all -> 0x00cf }
            goto L_0x00d3
        L_0x00cf:
            r7 = move-exception
            h3.C0660a.a(r8, r7)
        L_0x00d3:
            r6 = r5
            r5 = r8
            r8 = r6
        L_0x00d6:
            if (r5 != 0) goto L_0x00dc
            v3.l.b(r8)
            goto L_0x00e4
        L_0x00dc:
            throw r5
        L_0x00dd:
            e0.c r7 = r7.f8711c
            java.lang.Object r7 = r7.a()
            r8 = r7
        L_0x00e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.C0587b.j(e0.b, l3.e):java.lang.Object");
    }

    public void close() {
        this.f8712d.b(true);
    }

    public Object e(e eVar) {
        return j(this, eVar);
    }

    public final void f() {
        if (this.f8712d.a()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    public final h g() {
        return this.f8709a;
    }

    public final O3.r h() {
        return this.f8710b;
    }

    public final c i() {
        return this.f8711c;
    }
}
