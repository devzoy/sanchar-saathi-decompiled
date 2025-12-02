package z1;

/* renamed from: z1.p  reason: case insensitive filesystem */
public final class C1033p {

    /* renamed from: b  reason: collision with root package name */
    public static C1033p f13012b;

    /* renamed from: c  reason: collision with root package name */
    public static final C1034q f13013c = new C1034q(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public C1034q f13014a;

    public static synchronized C1033p b() {
        C1033p pVar;
        synchronized (C1033p.class) {
            try {
                if (f13012b == null) {
                    f13012b = new C1033p();
                }
                pVar = f13012b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return pVar;
    }

    public C1034q a() {
        return this.f13014a;
    }

    public final synchronized void c(C1034q qVar) {
        if (qVar == null) {
            this.f13014a = f13013c;
            return;
        }
        C1034q qVar2 = this.f13014a;
        if (qVar2 == null || qVar2.i() < qVar.i()) {
            this.f13014a = qVar;
        }
    }
}
