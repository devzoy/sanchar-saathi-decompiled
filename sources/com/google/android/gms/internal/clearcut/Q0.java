package com.google.android.gms.internal.clearcut;

public final class Q0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f6896a;

    /* renamed from: b  reason: collision with root package name */
    public int f6897b = 0;

    public Q0(String str) {
        this.f6896a = str;
    }

    public final boolean a() {
        return this.f6897b < this.f6896a.length();
    }

    public final int b() {
        String str = this.f6896a;
        int i4 = this.f6897b;
        this.f6897b = i4 + 1;
        char charAt = str.charAt(i4);
        if (charAt < 55296) {
            return charAt;
        }
        char c4 = charAt & 8191;
        int i5 = 13;
        while (true) {
            String str2 = this.f6896a;
            int i6 = this.f6897b;
            this.f6897b = i6 + 1;
            char charAt2 = str2.charAt(i6);
            if (charAt2 < 55296) {
                return c4 | (charAt2 << i5);
            }
            c4 |= (charAt2 & 8191) << i5;
            i5 += 13;
        }
    }
}
