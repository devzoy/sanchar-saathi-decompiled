package w1;

import R1.g;
import u1.c;
import v1.C0947a;
import z1.C1032o;

/* renamed from: w1.n  reason: case insensitive filesystem */
public abstract class C0981n {

    /* renamed from: a  reason: collision with root package name */
    public final c[] f12613a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12614b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12615c;

    /* renamed from: w1.n$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public C0978k f12616a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f12617b = true;

        /* renamed from: c  reason: collision with root package name */
        public c[] f12618c;

        /* renamed from: d  reason: collision with root package name */
        public int f12619d = 0;

        public /* synthetic */ a(byte[] bArr) {
        }

        public C0981n a() {
            C1032o.b(this.f12616a != null, "execute parameter required");
            return new N(this, this.f12618c, this.f12617b, this.f12619d);
        }

        public a b(C0978k kVar) {
            this.f12616a = kVar;
            return this;
        }

        public a c(boolean z4) {
            this.f12617b = z4;
            return this;
        }

        public a d(c... cVarArr) {
            this.f12618c = cVarArr;
            return this;
        }

        public final /* synthetic */ C0978k e() {
            return this.f12616a;
        }
    }

    public C0981n(c[] cVarArr, boolean z4, int i4) {
        this.f12613a = cVarArr;
        boolean z5 = false;
        if (cVarArr != null && z4) {
            z5 = true;
        }
        this.f12614b = z5;
        this.f12615c = i4;
    }

    public static a a() {
        return new a((byte[]) null);
    }

    public abstract void b(C0947a.b bVar, g gVar);

    public boolean c() {
        return this.f12614b;
    }

    public final c[] d() {
        return this.f12613a;
    }

    public final int e() {
        return this.f12615c;
    }
}
