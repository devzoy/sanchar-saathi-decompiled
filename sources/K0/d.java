package K0;

import K0.c;
import android.graphics.Rect;
import v3.g;
import v3.l;

public final class d implements c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1639d = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final H0.b f1640a;

    /* renamed from: b  reason: collision with root package name */
    public final b f1641b;

    /* renamed from: c  reason: collision with root package name */
    public final c.b f1642c;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(H0.b bVar) {
            l.e(bVar, "bounds");
            if (bVar.d() == 0 && bVar.a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            } else if (bVar.b() != 0 && bVar.c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f1643b = new a((g) null);

        /* renamed from: c  reason: collision with root package name */
        public static final b f1644c = new b("FOLD");

        /* renamed from: d  reason: collision with root package name */
        public static final b f1645d = new b("HINGE");

        /* renamed from: a  reason: collision with root package name */
        public final String f1646a;

        public static final class a {
            public /* synthetic */ a(g gVar) {
                this();
            }

            public final b a() {
                return b.f1644c;
            }

            public final b b() {
                return b.f1645d;
            }

            public a() {
            }
        }

        public b(String str) {
            this.f1646a = str;
        }

        public String toString() {
            return this.f1646a;
        }
    }

    public d(H0.b bVar, b bVar2, c.b bVar3) {
        l.e(bVar, "featureBounds");
        l.e(bVar2, "type");
        l.e(bVar3, "state");
        this.f1640a = bVar;
        this.f1641b = bVar2;
        this.f1642c = bVar3;
        f1639d.a(bVar);
    }

    public Rect a() {
        return this.f1640a.f();
    }

    public c.a b() {
        return (this.f1640a.d() == 0 || this.f1640a.a() == 0) ? c.a.f1632c : c.a.f1633d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l.a(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        d dVar = (d) obj;
        return l.a(this.f1640a, dVar.f1640a) && l.a(this.f1641b, dVar.f1641b) && l.a(getState(), dVar.getState());
    }

    public c.b getState() {
        return this.f1642c;
    }

    public int hashCode() {
        return (((this.f1640a.hashCode() * 31) + this.f1641b.hashCode()) * 31) + getState().hashCode();
    }

    public String toString() {
        return d.class.getSimpleName() + " { " + this.f1640a + ", type=" + this.f1641b + ", state=" + getState() + " }";
    }
}
