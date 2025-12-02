package D3;

import J3.b;
import h3.C0665f;
import l3.e;
import l3.g;
import u3.l;
import u3.p;

public enum K {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f791a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                D3.K[] r0 = D3.K.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                D3.K r1 = D3.K.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                D3.K r1 = D3.K.ATOMIC     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                D3.K r1 = D3.K.UNDISPATCHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                D3.K r1 = D3.K.LAZY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f791a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: D3.K.a.<clinit>():void");
        }
    }

    public final void f(p pVar, Object obj, e eVar) {
        int i4 = a.f791a[ordinal()];
        if (i4 == 1) {
            J3.a.d(pVar, obj, eVar, (l) null, 4, (Object) null);
        } else if (i4 == 2) {
            g.a(pVar, obj, eVar);
        } else if (i4 == 3) {
            b.a(pVar, obj, eVar);
        } else if (i4 != 4) {
            throw new C0665f();
        }
    }

    public final boolean k() {
        return this == LAZY;
    }
}
