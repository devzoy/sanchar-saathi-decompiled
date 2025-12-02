package androidx.datastore.preferences.protobuf;

public final class d0 implements N {

    /* renamed from: a  reason: collision with root package name */
    public final P f5089a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5090b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f5091c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5092d;

    public d0(P p4, String str, Object[] objArr) {
        this.f5089a = p4;
        this.f5090b = str;
        this.f5091c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f5092d = charAt;
            return;
        }
        char c4 = charAt & 8191;
        int i4 = 13;
        int i5 = 1;
        while (true) {
            int i6 = i5 + 1;
            char charAt2 = str.charAt(i5);
            if (charAt2 >= 55296) {
                c4 |= (charAt2 & 8191) << i4;
                i4 += 13;
                i5 = i6;
            } else {
                this.f5092d = c4 | (charAt2 << i4);
                return;
            }
        }
    }

    public boolean a() {
        return (this.f5092d & 2) == 2;
    }

    public a0 b() {
        int i4 = this.f5092d;
        return (i4 & 1) != 0 ? a0.PROTO2 : (i4 & 4) == 4 ? a0.EDITIONS : a0.PROTO3;
    }

    public P c() {
        return this.f5089a;
    }

    public Object[] d() {
        return this.f5091c;
    }

    public String e() {
        return this.f5090b;
    }
}
