package M3;

import I3.F;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final F f1820a = new F("NO_OWNER");

    /* renamed from: b  reason: collision with root package name */
    public static final F f1821b = new F("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z4) {
        return new b(z4);
    }

    public static /* synthetic */ a b(boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = false;
        }
        return a(z4);
    }
}
