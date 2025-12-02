package H3;

import h3.C0667h;
import h3.C0673n;
import java.util.Arrays;
import l3.e;
import v3.l;

public abstract class b {

    /* renamed from: e  reason: collision with root package name */
    public d[] f1438e;

    /* renamed from: f  reason: collision with root package name */
    public int f1439f;

    /* renamed from: g  reason: collision with root package name */
    public int f1440g;

    public final d d() {
        d dVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f1438e;
                if (dVarArr == null) {
                    dVarArr = g(2);
                    this.f1438e = dVarArr;
                } else if (this.f1439f >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    l.d(copyOf, "copyOf(this, newSize)");
                    this.f1438e = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i4 = this.f1440g;
                do {
                    dVar = dVarArr[i4];
                    if (dVar == null) {
                        dVar = f();
                        dVarArr[i4] = dVar;
                    }
                    i4++;
                    if (i4 >= dVarArr.length) {
                        i4 = 0;
                    }
                    l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.f1440g = i4;
                this.f1439f++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public abstract d f();

    public abstract d[] g(int i4);

    public final void h(d dVar) {
        int i4;
        e[] b4;
        synchronized (this) {
            try {
                int i5 = this.f1439f - 1;
                this.f1439f = i5;
                if (i5 == 0) {
                    this.f1440g = 0;
                }
                l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b4 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (e eVar : b4) {
            if (eVar != null) {
                C0667h.a aVar = C0667h.f9633e;
                eVar.q(C0667h.a(C0673n.f9639a));
            }
        }
    }

    public final d[] i() {
        return this.f1438e;
    }
}
