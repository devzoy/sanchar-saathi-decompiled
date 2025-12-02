package H0;

import android.graphics.Rect;
import v3.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f1359a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1360b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1361c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1362d;

    public b(int i4, int i5, int i6, int i7) {
        this.f1359a = i4;
        this.f1360b = i5;
        this.f1361c = i6;
        this.f1362d = i7;
        if (i4 > i6) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i4 + ", right: " + i6).toString());
        } else if (i5 > i7) {
            throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i5 + ", bottom: " + i7).toString());
        }
    }

    public final int a() {
        return this.f1362d - this.f1360b;
    }

    public final int b() {
        return this.f1359a;
    }

    public final int c() {
        return this.f1360b;
    }

    public final int d() {
        return this.f1361c - this.f1359a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.a(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f1359a == bVar.f1359a && this.f1360b == bVar.f1360b && this.f1361c == bVar.f1361c && this.f1362d == bVar.f1362d;
    }

    public final Rect f() {
        return new Rect(this.f1359a, this.f1360b, this.f1361c, this.f1362d);
    }

    public int hashCode() {
        return (((((this.f1359a * 31) + this.f1360b) * 31) + this.f1361c) * 31) + this.f1362d;
    }

    public String toString() {
        return b.class.getSimpleName() + " { [" + this.f1359a + ',' + this.f1360b + ',' + this.f1361c + ',' + this.f1362d + "] }";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        l.e(rect, "rect");
    }
}
