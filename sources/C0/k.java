package c0;

import G3.d;
import G3.n;
import G3.t;
import v3.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final n f6460a;

    public k() {
        z zVar = z.f6502b;
        l.c(zVar, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.f6460a = t.a(zVar);
    }

    public final v a() {
        return (v) this.f6460a.getValue();
    }

    public final d b() {
        return this.f6460a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: c0.v} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r6.a() > r2.a()) goto L_0x002b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final c0.v c(c0.v r6) {
        /*
            r5 = this;
            java.lang.String r0 = "newState"
            v3.l.e(r6, r0)
            G3.n r0 = r5.f6460a
        L_0x0007:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            c0.v r2 = (c0.v) r2
            boolean r3 = r2 instanceof c0.q
            if (r3 == 0) goto L_0x0014
            r3 = 1
            goto L_0x001a
        L_0x0014:
            c0.z r3 = c0.z.f6502b
            boolean r3 = v3.l.a(r2, r3)
        L_0x001a:
            if (r3 == 0) goto L_0x001d
            goto L_0x002b
        L_0x001d:
            boolean r3 = r2 instanceof c0.e
            if (r3 == 0) goto L_0x002d
            int r3 = r6.a()
            int r4 = r2.a()
            if (r3 <= r4) goto L_0x0031
        L_0x002b:
            r2 = r6
            goto L_0x0031
        L_0x002d:
            boolean r3 = r2 instanceof c0.l
            if (r3 == 0) goto L_0x0038
        L_0x0031:
            boolean r1 = r0.e(r1, r2)
            if (r1 == 0) goto L_0x0007
            return r2
        L_0x0038:
            h3.f r6 = new h3.f
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.k.c(c0.v):c0.v");
    }
}
