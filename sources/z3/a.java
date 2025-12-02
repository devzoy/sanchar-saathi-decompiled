package z3;

import i3.C0718B;
import p3.C0879c;
import v3.g;

public class a implements Iterable {

    /* renamed from: h  reason: collision with root package name */
    public static final C0216a f13032h = new C0216a((g) null);

    /* renamed from: e  reason: collision with root package name */
    public final int f13033e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13034f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13035g;

    /* renamed from: z3.a$a  reason: collision with other inner class name */
    public static final class C0216a {
        public /* synthetic */ C0216a(g gVar) {
            this();
        }

        public final a a(int i4, int i5, int i6) {
            return new a(i4, i5, i6);
        }

        public C0216a() {
        }
    }

    public a(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i6 != Integer.MIN_VALUE) {
            this.f13033e = i4;
            this.f13034f = C0879c.b(i4, i5, i6);
            this.f13035g = i6;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (!(this.f13033e == aVar.f13033e && this.f13034f == aVar.f13034f && this.f13035g == aVar.f13035g)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f13033e * 31) + this.f13034f) * 31) + this.f13035g;
    }

    public boolean isEmpty() {
        if (this.f13035g > 0) {
            if (this.f13033e <= this.f13034f) {
                return false;
            }
        } else if (this.f13033e >= this.f13034f) {
            return false;
        }
        return true;
    }

    public final int s() {
        return this.f13033e;
    }

    public final int t() {
        return this.f13034f;
    }

    public String toString() {
        StringBuilder sb;
        int i4;
        if (this.f13035g > 0) {
            sb = new StringBuilder();
            sb.append(this.f13033e);
            sb.append("..");
            sb.append(this.f13034f);
            sb.append(" step ");
            i4 = this.f13035g;
        } else {
            sb = new StringBuilder();
            sb.append(this.f13033e);
            sb.append(" downTo ");
            sb.append(this.f13034f);
            sb.append(" step ");
            i4 = -this.f13035g;
        }
        sb.append(i4);
        return sb.toString();
    }

    public final int u() {
        return this.f13035g;
    }

    /* renamed from: v */
    public C0718B iterator() {
        return new b(this.f13033e, this.f13034f, this.f13035g);
    }
}
