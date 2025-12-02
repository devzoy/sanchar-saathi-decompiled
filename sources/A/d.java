package A;

import java.util.HashSet;
import java.util.Iterator;
import net.sqlcipher.IBulkCursor;
import z.c;
import z.i;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public HashSet f25a = null;

    /* renamed from: b  reason: collision with root package name */
    public final e f26b;

    /* renamed from: c  reason: collision with root package name */
    public final b f27c;

    /* renamed from: d  reason: collision with root package name */
    public d f28d;

    /* renamed from: e  reason: collision with root package name */
    public int f29e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f30f = -1;

    /* renamed from: g  reason: collision with root package name */
    public i f31g;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                A.d$b[] r0 = A.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32a = r0
                A.d$b r1 = A.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32a     // Catch:{ NoSuchFieldError -> 0x001d }
                A.d$b r1 = A.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32a     // Catch:{ NoSuchFieldError -> 0x0028 }
                A.d$b r1 = A.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32a     // Catch:{ NoSuchFieldError -> 0x0033 }
                A.d$b r1 = A.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32a     // Catch:{ NoSuchFieldError -> 0x003e }
                A.d$b r1 = A.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32a     // Catch:{ NoSuchFieldError -> 0x0049 }
                A.d$b r1 = A.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32a     // Catch:{ NoSuchFieldError -> 0x0054 }
                A.d$b r1 = A.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f32a     // Catch:{ NoSuchFieldError -> 0x0060 }
                A.d$b r1 = A.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f32a     // Catch:{ NoSuchFieldError -> 0x006c }
                A.d$b r1 = A.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: A.d.a.<clinit>():void");
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f26b = eVar;
        this.f27c = bVar;
    }

    public boolean a(d dVar, int i4, int i5, boolean z4) {
        if (dVar == null) {
            k();
            return true;
        } else if (!z4 && !j(dVar)) {
            return false;
        } else {
            this.f28d = dVar;
            if (dVar.f25a == null) {
                dVar.f25a = new HashSet();
            }
            this.f28d.f25a.add(this);
            if (i4 > 0) {
                this.f29e = i4;
            } else {
                this.f29e = 0;
            }
            this.f30f = i5;
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = r3.f28d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int b() {
        /*
            r3 = this;
            A.e r0 = r3.f26b
            int r0 = r0.M()
            r1 = 8
            if (r0 != r1) goto L_0x000c
            r0 = 0
            return r0
        L_0x000c:
            int r0 = r3.f30f
            r2 = -1
            if (r0 <= r2) goto L_0x0020
            A.d r0 = r3.f28d
            if (r0 == 0) goto L_0x0020
            A.e r0 = r0.f26b
            int r0 = r0.M()
            if (r0 != r1) goto L_0x0020
            int r0 = r3.f30f
            return r0
        L_0x0020:
            int r0 = r3.f29e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A.d.b():int");
    }

    public final d c() {
        switch (a.f32a[this.f27c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                return null;
            case 2:
                return this.f26b.f47D;
            case 3:
                return this.f26b.f45B;
            case 4:
                return this.f26b.f48E;
            case 5:
                return this.f26b.f46C;
            default:
                throw new AssertionError(this.f27c.name());
        }
    }

    public e d() {
        return this.f26b;
    }

    public i e() {
        return this.f31g;
    }

    public d f() {
        return this.f28d;
    }

    public b g() {
        return this.f27c;
    }

    public boolean h() {
        HashSet hashSet = this.f25a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).c().i()) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        return this.f28d != null;
    }

    public boolean j(d dVar) {
        boolean z4 = false;
        if (dVar == null) {
            return false;
        }
        b g4 = dVar.g();
        b bVar = this.f27c;
        if (g4 == bVar) {
            return bVar != b.BASELINE || (dVar.d().Q() && d().Q());
        }
        switch (a.f32a[bVar.ordinal()]) {
            case 1:
                return (g4 == b.BASELINE || g4 == b.CENTER_X || g4 == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z5 = g4 == b.LEFT || g4 == b.RIGHT;
                if (!(dVar.d() instanceof g)) {
                    return z5;
                }
                if (z5 || g4 == b.CENTER_X) {
                    z4 = true;
                }
                return z4;
            case 4:
            case 5:
                boolean z6 = g4 == b.TOP || g4 == b.BOTTOM;
                if (!(dVar.d() instanceof g)) {
                    return z6;
                }
                if (z6 || g4 == b.CENTER_Y) {
                    z4 = true;
                }
                return z4;
            case 6:
            case 7:
            case 8:
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                return false;
            default:
                throw new AssertionError(this.f27c.name());
        }
    }

    public void k() {
        HashSet hashSet;
        d dVar = this.f28d;
        if (!(dVar == null || (hashSet = dVar.f25a) == null)) {
            hashSet.remove(this);
        }
        this.f28d = null;
        this.f29e = 0;
        this.f30f = -1;
    }

    public void l(c cVar) {
        i iVar = this.f31g;
        if (iVar == null) {
            this.f31g = new i(i.a.UNRESTRICTED, (String) null);
        } else {
            iVar.d();
        }
    }

    public String toString() {
        return this.f26b.p() + ":" + this.f27c.toString();
    }
}
