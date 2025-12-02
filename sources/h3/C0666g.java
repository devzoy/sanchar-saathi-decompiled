package h3;

import java.io.Serializable;
import v3.l;

/* renamed from: h3.g  reason: case insensitive filesystem */
public final class C0666g implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public final Object f9631e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f9632f;

    public C0666g(Object obj, Object obj2) {
        this.f9631e = obj;
        this.f9632f = obj2;
    }

    public final Object a() {
        return this.f9631e;
    }

    public final Object b() {
        return this.f9632f;
    }

    public final Object c() {
        return this.f9631e;
    }

    public final Object d() {
        return this.f9632f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0666g)) {
            return false;
        }
        C0666g gVar = (C0666g) obj;
        return l.a(this.f9631e, gVar.f9631e) && l.a(this.f9632f, gVar.f9632f);
    }

    public int hashCode() {
        Object obj = this.f9631e;
        int i4 = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f9632f;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return hashCode + i4;
    }

    public String toString() {
        return '(' + this.f9631e + ", " + this.f9632f + ')';
    }
}
