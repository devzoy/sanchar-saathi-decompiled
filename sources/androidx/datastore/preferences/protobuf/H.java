package androidx.datastore.preferences.protobuf;

public final class H implements g0 {

    /* renamed from: b  reason: collision with root package name */
    public static final O f5032b = new a();

    /* renamed from: a  reason: collision with root package name */
    public final O f5033a;

    public class a implements O {
        public N a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        public boolean b(Class cls) {
            return false;
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5034a;

        static {
            int[] iArr = new int[a0.values().length];
            f5034a = iArr;
            try {
                iArr[a0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class c implements O {

        /* renamed from: a  reason: collision with root package name */
        public O[] f5035a;

        public c(O... oArr) {
            this.f5035a = oArr;
        }

        public N a(Class cls) {
            for (O o4 : this.f5035a) {
                if (o4.b(cls)) {
                    return o4.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        public boolean b(Class cls) {
            for (O b4 : this.f5035a) {
                if (b4.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public H() {
        this(c());
    }

    public static boolean b(N n4) {
        return b.f5034a[n4.b().ordinal()] != 1;
    }

    public static O c() {
        return new c(C0369v.c(), d());
    }

    public static O d() {
        if (b0.f5079d) {
            return f5032b;
        }
        try {
            return (O) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return f5032b;
        }
    }

    public static f0 e(Class cls, N n4) {
        C0364p pVar = null;
        if (f(cls)) {
            V b4 = X.b();
            D b5 = F.b();
            m0 K4 = h0.K();
            if (b(n4)) {
                pVar = r.b();
            }
            return T.N(cls, n4, b4, b5, K4, pVar, M.b());
        }
        V a4 = X.a();
        D a5 = F.a();
        m0 J4 = h0.J();
        if (b(n4)) {
            pVar = r.a();
        }
        return T.N(cls, n4, a4, a5, J4, pVar, M.a());
    }

    public static boolean f(Class cls) {
        return b0.f5079d || C0370w.class.isAssignableFrom(cls);
    }

    public f0 a(Class cls) {
        h0.G(cls);
        N a4 = this.f5033a.a(cls);
        return a4.a() ? f(cls) ? U.l(h0.K(), r.b(), a4.c()) : U.l(h0.J(), r.a(), a4.c()) : e(cls, a4);
    }

    public H(O o4) {
        this.f5033a = (O) C0372y.b(o4, "messageInfoFactory");
    }
}
