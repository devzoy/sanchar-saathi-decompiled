package com.google.android.gms.internal.clearcut;

public enum E1 implements C0416d0 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4);
    

    /* renamed from: k  reason: collision with root package name */
    public static final C0419e0 f6765k = null;

    /* renamed from: e  reason: collision with root package name */
    public final int f6767e;

    static {
        f6765k = new I1();
    }

    /* access modifiers changed from: public */
    E1(int i4) {
        this.f6767e = i4;
    }

    public static E1 b(int i4) {
        if (i4 == 0) {
            return DEFAULT;
        }
        if (i4 == 1) {
            return UNMETERED_ONLY;
        }
        if (i4 == 2) {
            return UNMETERED_OR_DAILY;
        }
        if (i4 == 3) {
            return FAST_IF_RADIO_AWAKE;
        }
        if (i4 != 4) {
            return null;
        }
        return NEVER;
    }

    public final int f() {
        return this.f6767e;
    }
}
