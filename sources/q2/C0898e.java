package q2;

/* renamed from: q2.e  reason: case insensitive filesystem */
public final class C0898e implements g {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f11897c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile g f11898a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f11899b = f11897c;

    public C0898e(g gVar) {
        this.f11898a = gVar;
    }

    public static g b(g gVar) {
        gVar.getClass();
        return gVar instanceof C0898e ? gVar : new C0898e(gVar);
    }

    public final Object a() {
        Object obj = this.f11899b;
        Object obj2 = f11897c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f11899b;
                    if (obj == obj2) {
                        obj = this.f11898a.a();
                        Object obj3 = this.f11899b;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.f11899b = obj;
                        this.f11898a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
