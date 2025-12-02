package com.google.android.gms.internal.vision;

public final class I1 implements C0540r1 {

    /* renamed from: a  reason: collision with root package name */
    public final C0546t1 f7294a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7295b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f7296c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7297d;

    public I1(C0546t1 t1Var, String str, Object[] objArr) {
        this.f7294a = t1Var;
        this.f7295b = str;
        this.f7296c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f7297d = charAt;
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
                this.f7297d = c4 | (charAt2 << i4);
                return;
            }
        }
    }

    public final int a() {
        return (this.f7297d & 1) == 1 ? G1.f7284a : G1.f7285b;
    }

    public final C0546t1 b() {
        return this.f7294a;
    }

    public final String c() {
        return this.f7295b;
    }

    public final boolean d() {
        return (this.f7297d & 2) == 2;
    }

    public final Object[] e() {
        return this.f7296c;
    }
}
