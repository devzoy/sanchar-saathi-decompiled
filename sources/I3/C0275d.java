package I3;

import u3.p;

/* renamed from: I3.d  reason: case insensitive filesystem */
public abstract class C0275d {

    /* renamed from: a  reason: collision with root package name */
    public static final F f1546a = new F("CLOSED");

    public static final C0276e b(C0276e eVar) {
        while (true) {
            Object a4 = eVar.f();
            if (a4 == f1546a) {
                return eVar;
            }
            C0276e eVar2 = (C0276e) a4;
            if (eVar2 != null) {
                eVar = eVar2;
            } else if (eVar.j()) {
                return eVar;
            }
        }
    }

    public static final Object c(C c4, long j4, p pVar) {
        while (true) {
            if (c4.f1526g >= j4 && !c4.h()) {
                return D.a(c4);
            }
            Object a4 = c4.f();
            if (a4 == f1546a) {
                return D.a(f1546a);
            }
            C c5 = (C) ((C0276e) a4);
            if (c5 == null) {
                c5 = (C) pVar.g(Long.valueOf(c4.f1526g + 1), c4);
                if (c4.l(c5)) {
                    if (c4.h()) {
                        c4.k();
                    }
                }
            }
            c4 = c5;
        }
    }
}
