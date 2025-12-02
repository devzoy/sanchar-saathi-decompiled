package l3;

import java.io.Serializable;
import l3.i;
import u3.p;
import v3.l;

public final class j implements i, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final j f11131e = new j();

    public i B(i.c cVar) {
        l.e(cVar, "key");
        return this;
    }

    public Object H(Object obj, p pVar) {
        l.e(pVar, "operation");
        return obj;
    }

    public i.b d(i.c cVar) {
        l.e(cVar, "key");
        return null;
    }

    public i h(i iVar) {
        l.e(iVar, "context");
        return iVar;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
