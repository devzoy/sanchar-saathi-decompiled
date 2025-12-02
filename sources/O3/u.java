package O3;

import i3.C0734k;
import v3.g;
import v3.l;

public final class u {

    /* renamed from: h  reason: collision with root package name */
    public static final a f2139h = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2140a;

    /* renamed from: b  reason: collision with root package name */
    public int f2141b;

    /* renamed from: c  reason: collision with root package name */
    public int f2142c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2143d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2144e;

    /* renamed from: f  reason: collision with root package name */
    public u f2145f;

    /* renamed from: g  reason: collision with root package name */
    public u f2146g;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    public u() {
        this.f2140a = new byte[8192];
        this.f2144e = true;
        this.f2143d = false;
    }

    public final void a() {
        int i4;
        u uVar = this.f2146g;
        if (uVar != this) {
            l.b(uVar);
            if (uVar.f2144e) {
                int i5 = this.f2142c - this.f2141b;
                u uVar2 = this.f2146g;
                l.b(uVar2);
                int i6 = 8192 - uVar2.f2142c;
                u uVar3 = this.f2146g;
                l.b(uVar3);
                if (uVar3.f2143d) {
                    i4 = 0;
                } else {
                    u uVar4 = this.f2146g;
                    l.b(uVar4);
                    i4 = uVar4.f2141b;
                }
                if (i5 <= i6 + i4) {
                    u uVar5 = this.f2146g;
                    l.b(uVar5);
                    f(uVar5, i5);
                    b();
                    v.b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact");
    }

    public final u b() {
        u uVar = this.f2145f;
        if (uVar == this) {
            uVar = null;
        }
        u uVar2 = this.f2146g;
        l.b(uVar2);
        uVar2.f2145f = this.f2145f;
        u uVar3 = this.f2145f;
        l.b(uVar3);
        uVar3.f2146g = this.f2146g;
        this.f2145f = null;
        this.f2146g = null;
        return uVar;
    }

    public final u c(u uVar) {
        l.e(uVar, "segment");
        uVar.f2146g = this;
        uVar.f2145f = this.f2145f;
        u uVar2 = this.f2145f;
        l.b(uVar2);
        uVar2.f2146g = uVar;
        this.f2145f = uVar;
        return uVar;
    }

    public final u d() {
        this.f2143d = true;
        return new u(this.f2140a, this.f2141b, this.f2142c, true, false);
    }

    public final u e(int i4) {
        u uVar;
        if (i4 <= 0 || i4 > this.f2142c - this.f2141b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i4 >= 1024) {
            uVar = d();
        } else {
            uVar = v.c();
            byte[] bArr = this.f2140a;
            byte[] bArr2 = uVar.f2140a;
            int i5 = this.f2141b;
            C0734k.f(bArr, bArr2, 0, i5, i5 + i4, 2, (Object) null);
        }
        uVar.f2142c = uVar.f2141b + i4;
        this.f2141b += i4;
        u uVar2 = this.f2146g;
        l.b(uVar2);
        uVar2.c(uVar);
        return uVar;
    }

    public final void f(u uVar, int i4) {
        l.e(uVar, "sink");
        if (uVar.f2144e) {
            int i5 = uVar.f2142c;
            if (i5 + i4 > 8192) {
                if (!uVar.f2143d) {
                    int i6 = uVar.f2141b;
                    if ((i5 + i4) - i6 <= 8192) {
                        byte[] bArr = uVar.f2140a;
                        C0734k.f(bArr, bArr, 0, i6, i5, 2, (Object) null);
                        uVar.f2142c -= uVar.f2141b;
                        uVar.f2141b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f2140a;
            byte[] bArr3 = uVar.f2140a;
            int i7 = uVar.f2142c;
            int i8 = this.f2141b;
            C0734k.d(bArr2, bArr3, i7, i8, i8 + i4);
            uVar.f2142c += i4;
            this.f2141b += i4;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public u(byte[] bArr, int i4, int i5, boolean z4, boolean z5) {
        l.e(bArr, "data");
        this.f2140a = bArr;
        this.f2141b = i4;
        this.f2142c = i5;
        this.f2143d = z4;
        this.f2144e = z5;
    }
}
