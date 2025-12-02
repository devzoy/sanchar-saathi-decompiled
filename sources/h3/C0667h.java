package h3;

import java.io.Serializable;
import v3.g;
import v3.l;

/* renamed from: h3.h  reason: case insensitive filesystem */
public abstract class C0667h implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final a f9633e = new a((g) null);

    /* renamed from: h3.h$a */
    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: h3.h$b */
    public static final class b implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        public final Throwable f9634e;

        public b(Throwable th) {
            l.e(th, "exception");
            this.f9634e = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && l.a(this.f9634e, ((b) obj).f9634e);
        }

        public int hashCode() {
            return this.f9634e.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f9634e + ')';
        }
    }

    public static Object a(Object obj) {
        return obj;
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f9634e;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }
}
