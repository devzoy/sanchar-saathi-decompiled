package e3;

import o3.C0824b;
import v3.g;

public enum K {
    PLATFORM_ENCODED(0),
    JSON_ENCODED(1),
    UNEXPECTED_STRING(2);
    

    /* renamed from: f  reason: collision with root package name */
    public static final a f8921f = null;

    /* renamed from: e  reason: collision with root package name */
    public final int f8927e;

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final K a(int i4) {
            for (K k4 : K.values()) {
                if (k4.f() == i4) {
                    return k4;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        K[] b4;
        f8926k = C0824b.a(b4);
        f8921f = new a((g) null);
    }

    /* access modifiers changed from: public */
    K(int i4) {
        this.f8927e = i4;
    }

    public final int f() {
        return this.f8927e;
    }
}
