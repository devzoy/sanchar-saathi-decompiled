package androidx.lifecycle;

import androidx.lifecycle.C0380g;
import v3.l;

/* renamed from: androidx.lifecycle.c  reason: case insensitive filesystem */
public final class C0376c implements C0382i {

    /* renamed from: c  reason: collision with root package name */
    public final DefaultLifecycleObserver f5371c;

    /* renamed from: d  reason: collision with root package name */
    public final C0382i f5372d;

    /* renamed from: androidx.lifecycle.c$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5373a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.lifecycle.g$a[] r0 = androidx.lifecycle.C0380g.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0380g.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0380g.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0380g.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0380g.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0380g.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0380g.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0380g.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f5373a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0376c.a.<clinit>():void");
        }
    }

    public C0376c(DefaultLifecycleObserver defaultLifecycleObserver, C0382i iVar) {
        l.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f5371c = defaultLifecycleObserver;
        this.f5372d = iVar;
    }

    public void d(C0384k kVar, C0380g.a aVar) {
        l.e(kVar, "source");
        l.e(aVar, "event");
        switch (a.f5373a[aVar.ordinal()]) {
            case 1:
                this.f5371c.c(kVar);
                break;
            case 2:
                this.f5371c.f(kVar);
                break;
            case 3:
                this.f5371c.a(kVar);
                break;
            case 4:
                this.f5371c.e(kVar);
                break;
            case 5:
                this.f5371c.g(kVar);
                break;
            case 6:
                this.f5371c.b(kVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0382i iVar = this.f5372d;
        if (iVar != null) {
            iVar.d(kVar, aVar);
        }
    }
}
