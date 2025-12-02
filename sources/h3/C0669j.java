package h3;

import java.io.Serializable;
import u3.a;
import v3.g;
import v3.l;

/* renamed from: h3.j  reason: case insensitive filesystem */
public final class C0669j implements C0663d, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public a f9635e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f9636f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f9637g;

    public C0669j(a aVar, Object obj) {
        l.e(aVar, "initializer");
        this.f9635e = aVar;
        this.f9636f = C0671l.f9638a;
        this.f9637g = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f9636f != C0671l.f9638a;
    }

    public Object getValue() {
        Object obj;
        Object obj2 = this.f9636f;
        C0671l lVar = C0671l.f9638a;
        if (obj2 != lVar) {
            return obj2;
        }
        synchronized (this.f9637g) {
            obj = this.f9636f;
            if (obj == lVar) {
                a aVar = this.f9635e;
                l.b(aVar);
                obj = aVar.c();
                this.f9636f = obj;
                this.f9635e = null;
            }
        }
        return obj;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0669j(a aVar, Object obj, int i4, g gVar) {
        this(aVar, (i4 & 2) != 0 ? null : obj);
    }
}
