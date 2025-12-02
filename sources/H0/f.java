package H0;

import h3.C0665f;
import i3.C0735l;
import v3.l;

public final class f extends h {

    /* renamed from: b  reason: collision with root package name */
    public final Object f1373b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1374c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1375d;

    /* renamed from: e  reason: collision with root package name */
    public final g f1376e;

    /* renamed from: f  reason: collision with root package name */
    public final j f1377f;

    /* renamed from: g  reason: collision with root package name */
    public final l f1378g;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1379a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                H0.j[] r0 = H0.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                H0.j r1 = H0.j.STRICT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                H0.j r1 = H0.j.LOG     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                H0.j r1 = H0.j.QUIET     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f1379a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: H0.f.a.<clinit>():void");
        }
    }

    public f(Object obj, String str, String str2, g gVar, j jVar) {
        l.e(obj, "value");
        l.e(str, "tag");
        l.e(str2, "message");
        l.e(gVar, "logger");
        l.e(jVar, "verificationMode");
        this.f1373b = obj;
        this.f1374c = str;
        this.f1375d = str2;
        this.f1376e = gVar;
        this.f1377f = jVar;
        l lVar = new l(b(obj, str2));
        StackTraceElement[] stackTrace = lVar.getStackTrace();
        l.d(stackTrace, "stackTrace");
        lVar.setStackTrace((StackTraceElement[]) C0735l.n(stackTrace, 2).toArray(new StackTraceElement[0]));
        this.f1378g = lVar;
    }

    public Object a() {
        int i4 = a.f1379a[this.f1377f.ordinal()];
        if (i4 == 1) {
            throw this.f1378g;
        } else if (i4 == 2) {
            this.f1376e.a(this.f1374c, b(this.f1373b, this.f1375d));
            return null;
        } else if (i4 == 3) {
            return null;
        } else {
            throw new C0665f();
        }
    }

    public h c(String str, u3.l lVar) {
        l.e(str, "message");
        l.e(lVar, "condition");
        return this;
    }
}
