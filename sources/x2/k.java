package X2;

import Y2.q;
import java.util.Locale;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public b f3507a;

    /* renamed from: b  reason: collision with root package name */
    public b f3508b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3509c;

    /* renamed from: d  reason: collision with root package name */
    public final Y2.a f3510d;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3511a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                X2.k$b[] r0 = X2.k.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3511a = r0
                X2.k$b r1 = X2.k.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3511a     // Catch:{ NoSuchFieldError -> 0x001d }
                X2.k$b r1 = X2.k.b.INACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3511a     // Catch:{ NoSuchFieldError -> 0x0028 }
                X2.k$b r1 = X2.k.b.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3511a     // Catch:{ NoSuchFieldError -> 0x0033 }
                X2.k$b r1 = X2.k.b.PAUSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f3511a     // Catch:{ NoSuchFieldError -> 0x003e }
                X2.k$b r1 = X2.k.b.DETACHED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X2.k.a.<clinit>():void");
        }
    }

    public enum b {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public k(P2.a aVar) {
        this(new Y2.a(aVar, "flutter/lifecycle", q.f3784b));
    }

    public void a() {
        g(this.f3507a, true);
    }

    public void b() {
        g(b.DETACHED, this.f3509c);
    }

    public void c() {
        g(b.INACTIVE, this.f3509c);
    }

    public void d() {
        g(b.PAUSED, this.f3509c);
    }

    public void e() {
        g(b.RESUMED, this.f3509c);
    }

    public void f() {
        g(this.f3507a, false);
    }

    public final void g(b bVar, boolean z4) {
        b bVar2 = this.f3507a;
        if (bVar2 != bVar || z4 != this.f3509c) {
            if (bVar == null && bVar2 == null) {
                this.f3509c = z4;
                return;
            }
            int i4 = a.f3511a[bVar.ordinal()];
            b bVar3 = i4 != 1 ? (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) ? bVar : null : z4 ? b.RESUMED : b.INACTIVE;
            this.f3507a = bVar;
            this.f3509c = z4;
            if (bVar3 != this.f3508b) {
                String str = "AppLifecycleState." + bVar3.name().toLowerCase(Locale.ROOT);
                M2.b.f("LifecycleChannel", "Sending " + str + " message.");
                this.f3510d.c(str);
                this.f3508b = bVar3;
            }
        }
    }

    public k(Y2.a aVar) {
        this.f3507a = null;
        this.f3508b = null;
        this.f3509c = true;
        this.f3510d = aVar;
    }
}
