package v3;

import A3.b;
import A3.d;
import A3.e;
import A3.f;
import A3.g;

public class y {
    public e a(i iVar) {
        return iVar;
    }

    public b b(Class cls) {
        return new e(cls);
    }

    public d c(Class cls, String str) {
        return new n(cls, str);
    }

    public f d(o oVar) {
        return oVar;
    }

    public g e(q qVar) {
        return qVar;
    }

    public String f(h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }

    public String g(m mVar) {
        return f(mVar);
    }
}
