package J;

import android.graphics.Insets;
import android.graphics.Rect;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f1590e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f1591a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1592b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1593c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1594d;

    public static class a {
        public static Insets a(int i4, int i5, int i6, int i7) {
            return Insets.of(i4, i5, i6, i7);
        }
    }

    public b(int i4, int i5, int i6, int i7) {
        this.f1591a = i4;
        this.f1592b = i5;
        this.f1593c = i6;
        this.f1594d = i7;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f1591a, bVar2.f1591a), Math.max(bVar.f1592b, bVar2.f1592b), Math.max(bVar.f1593c, bVar2.f1593c), Math.max(bVar.f1594d, bVar2.f1594d));
    }

    public static b b(int i4, int i5, int i6, int i7) {
        return (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f1590e : new b(i4, i5, i6, i7);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f1591a, this.f1592b, this.f1593c, this.f1594d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1594d == bVar.f1594d && this.f1591a == bVar.f1591a && this.f1593c == bVar.f1593c && this.f1592b == bVar.f1592b;
    }

    public int hashCode() {
        return (((((this.f1591a * 31) + this.f1592b) * 31) + this.f1593c) * 31) + this.f1594d;
    }

    public String toString() {
        return "Insets{left=" + this.f1591a + ", top=" + this.f1592b + ", right=" + this.f1593c + ", bottom=" + this.f1594d + '}';
    }
}
