package K0;

import H0.b;
import S.O;
import android.graphics.Rect;
import v3.l;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final b f1671a;

    /* renamed from: b  reason: collision with root package name */
    public final O f1672b;

    public k(b bVar, O o4) {
        l.e(bVar, "_bounds");
        l.e(o4, "_windowInsetsCompat");
        this.f1671a = bVar;
        this.f1672b = o4;
    }

    public final Rect a() {
        return this.f1671a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.a(k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return l.a(this.f1671a, kVar.f1671a) && l.a(this.f1672b, kVar.f1672b);
    }

    public int hashCode() {
        return (this.f1671a.hashCode() * 31) + this.f1672b.hashCode();
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this.f1671a + ", windowInsetsCompat=" + this.f1672b + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ k(android.graphics.Rect r1, S.O r2, int r3, v3.g r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L_0x0012
            S.O$b r2 = new S.O$b
            r2.<init>()
            S.O r2 = r2.a()
            java.lang.String r3 = "Builder().build()"
            v3.l.d(r2, r3)
        L_0x0012:
            r0.<init>((android.graphics.Rect) r1, (S.O) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.k.<init>(android.graphics.Rect, S.O, int, v3.g):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(Rect rect, O o4) {
        this(new b(rect), o4);
        l.e(rect, "bounds");
        l.e(o4, "insets");
    }
}
