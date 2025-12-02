package P3;

import O3.C0298b;
import O3.e;
import O3.r;
import i3.C0743t;
import i3.C0746w;
import java.util.ArrayList;
import v3.l;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final e f2271a;

    /* renamed from: b  reason: collision with root package name */
    public static final e f2272b;

    /* renamed from: c  reason: collision with root package name */
    public static final e f2273c;

    /* renamed from: d  reason: collision with root package name */
    public static final e f2274d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f2275e;

    static {
        e.a aVar = e.f2092h;
        f2271a = aVar.a("/");
        f2272b = aVar.a("\\");
        f2273c = aVar.a("/\\");
        f2274d = aVar.a(".");
        f2275e = aVar.a("..");
    }

    public static final r j(r rVar, r rVar2, boolean z4) {
        l.e(rVar, "<this>");
        l.e(rVar2, "child");
        if (rVar2.m() || rVar2.w() != null) {
            return rVar2;
        }
        e m4 = m(rVar);
        if (m4 == null && (m4 = m(rVar2)) == null) {
            m4 = s(r.f2129g);
        }
        C0298b bVar = new C0298b();
        bVar.M(rVar.f());
        if (bVar.H() > 0) {
            bVar.M(m4);
        }
        bVar.M(rVar2.f());
        return q(bVar, z4);
    }

    public static final r k(String str, boolean z4) {
        l.e(str, "<this>");
        return q(new C0298b().Q(str), z4);
    }

    public static final int l(r rVar) {
        int x4 = e.x(rVar.f(), f2271a, 0, 2, (Object) null);
        return x4 != -1 ? x4 : e.x(rVar.f(), f2272b, 0, 2, (Object) null);
    }

    public static final e m(r rVar) {
        e f4 = rVar.f();
        e eVar = f2271a;
        if (e.s(f4, eVar, 0, 2, (Object) null) != -1) {
            return eVar;
        }
        e f5 = rVar.f();
        e eVar2 = f2272b;
        if (e.s(f5, eVar2, 0, 2, (Object) null) != -1) {
            return eVar2;
        }
        return null;
    }

    public static final boolean n(r rVar) {
        return rVar.f().f(f2275e) && (rVar.f().C() == 2 || rVar.f().y(rVar.f().C() + -3, f2271a, 0, 1) || rVar.f().y(rVar.f().C() + -3, f2272b, 0, 1));
    }

    public static final int o(r rVar) {
        if (rVar.f().C() == 0) {
            return -1;
        }
        if (rVar.f().k(0) == 47) {
            return 1;
        }
        if (rVar.f().k(0) != 92) {
            if (rVar.f().C() > 2 && rVar.f().k(1) == 58 && rVar.f().k(2) == 92) {
                char k4 = (char) rVar.f().k(0);
                if ('a' > k4 || k4 >= '{') {
                    return ('A' > k4 || k4 >= '[') ? -1 : 3;
                }
                return 3;
            }
        } else if (rVar.f().C() <= 2 || rVar.f().k(1) != 92) {
            return 1;
        } else {
            int q4 = rVar.f().q(f2272b, 2);
            return q4 == -1 ? rVar.f().C() : q4;
        }
    }

    public static final boolean p(C0298b bVar, e eVar) {
        if (!l.a(eVar, f2272b) || bVar.H() < 2 || bVar.k(1) != 58) {
            return false;
        }
        char k4 = (char) bVar.k(0);
        return ('a' <= k4 && k4 < '{') || ('A' <= k4 && k4 < '[');
    }

    public static final r q(C0298b bVar, boolean z4) {
        e eVar;
        e eVar2;
        C0298b bVar2 = bVar;
        l.e(bVar2, "<this>");
        C0298b bVar3 = new C0298b();
        e eVar3 = null;
        int i4 = 0;
        while (true) {
            if (!bVar2.r(0, f2271a)) {
                eVar = f2272b;
                if (!bVar2.r(0, eVar)) {
                    break;
                }
            }
            byte readByte = bVar.readByte();
            if (eVar3 == null) {
                eVar3 = r(readByte);
            }
            i4++;
        }
        boolean z5 = i4 >= 2 && l.a(eVar3, eVar);
        if (z5) {
            l.b(eVar3);
            bVar3.M(eVar3);
            bVar3.M(eVar3);
        } else if (i4 > 0) {
            l.b(eVar3);
            bVar3.M(eVar3);
        } else {
            long l4 = bVar2.l(f2273c);
            if (eVar3 == null) {
                eVar3 = l4 == -1 ? s(r.f2129g) : r(bVar2.k(l4));
            }
            if (p(bVar2, eVar3)) {
                if (l4 == 2) {
                    bVar3.I(bVar2, 3);
                } else {
                    bVar3.I(bVar2, 2);
                }
            }
        }
        boolean z6 = bVar3.H() > 0;
        ArrayList arrayList = new ArrayList();
        while (!bVar.p()) {
            long l5 = bVar2.l(f2273c);
            if (l5 == -1) {
                eVar2 = bVar.w();
            } else {
                eVar2 = bVar2.x(l5);
                bVar.readByte();
            }
            e eVar4 = f2275e;
            if (l.a(eVar2, eVar4)) {
                if (!z6 || !arrayList.isEmpty()) {
                    if (!z4 || (!z6 && (arrayList.isEmpty() || l.a(C0746w.B(arrayList), eVar4)))) {
                        arrayList.add(eVar2);
                    } else if (!z5 || arrayList.size() != 1) {
                        C0743t.r(arrayList);
                    }
                }
            } else if (!l.a(eVar2, f2274d) && !l.a(eVar2, e.f2093i)) {
                arrayList.add(eVar2);
            }
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 > 0) {
                bVar3.M(eVar3);
            }
            bVar3.M((e) arrayList.get(i5));
        }
        if (bVar3.H() == 0) {
            bVar3.M(f2274d);
        }
        return new r(bVar3.w());
    }

    public static final e r(byte b4) {
        if (b4 == 47) {
            return f2271a;
        }
        if (b4 == 92) {
            return f2272b;
        }
        throw new IllegalArgumentException("not a directory separator: " + b4);
    }

    public static final e s(String str) {
        if (l.a(str, "/")) {
            return f2271a;
        }
        if (l.a(str, "\\")) {
            return f2272b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
