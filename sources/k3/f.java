package K3;

import D3.C0243f0;
import l3.i;

public abstract class f extends C0243f0 {

    /* renamed from: h  reason: collision with root package name */
    public final int f1745h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1746i;

    /* renamed from: j  reason: collision with root package name */
    public final long f1747j;

    /* renamed from: k  reason: collision with root package name */
    public final String f1748k;

    /* renamed from: l  reason: collision with root package name */
    public a f1749l = N();

    public f(int i4, int i5, long j4, String str) {
        this.f1745h = i4;
        this.f1746i = i5;
        this.f1747j = j4;
        this.f1748k = str;
    }

    public void K(i iVar, Runnable runnable) {
        a.i(this.f1749l, runnable, (i) null, false, 6, (Object) null);
    }

    public final a N() {
        return new a(this.f1745h, this.f1746i, this.f1747j, this.f1748k);
    }

    public final void O(Runnable runnable, i iVar, boolean z4) {
        this.f1749l.h(runnable, iVar, z4);
    }
}
