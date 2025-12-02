package H3;

import D3.I;
import D3.J;
import D3.K;
import D3.M;
import F3.r;
import F3.s;
import G3.d;
import G3.f;
import h3.C0668i;
import h3.C0673n;
import i3.C0746w;
import java.util.ArrayList;
import l3.i;
import l3.j;
import m3.C0795c;
import n3.k;
import u3.p;
import v3.l;

public abstract class e implements k {

    /* renamed from: e  reason: collision with root package name */
    public final i f1442e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1443f;

    /* renamed from: g  reason: collision with root package name */
    public final F3.a f1444g;

    public static final class a extends k implements p {

        /* renamed from: i  reason: collision with root package name */
        public int f1445i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f1446j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ G3.e f1447k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ e f1448l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(G3.e eVar, e eVar2, l3.e eVar3) {
            super(2, eVar3);
            this.f1447k = eVar;
            this.f1448l = eVar2;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            a aVar = new a(this.f1447k, this.f1448l, eVar);
            aVar.f1446j = obj;
            return aVar;
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f1445i;
            if (i4 == 0) {
                C0668i.b(obj);
                G3.e eVar = this.f1447k;
                s j4 = this.f1448l.j((I) this.f1446j);
                this.f1445i = 1;
                if (f.f(eVar, j4, this) == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(I i4, l3.e eVar) {
            return ((a) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class b extends k implements p {

        /* renamed from: i  reason: collision with root package name */
        public int f1449i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f1450j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ e f1451k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e eVar, l3.e eVar2) {
            super(2, eVar2);
            this.f1451k = eVar;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            b bVar = new b(this.f1451k, eVar);
            bVar.f1450j = obj;
            return bVar;
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f1449i;
            if (i4 == 0) {
                C0668i.b(obj);
                e eVar = this.f1451k;
                this.f1449i = 1;
                if (eVar.f((r) this.f1450j, this) == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(r rVar, l3.e eVar) {
            return ((b) j(rVar, eVar)).o(C0673n.f9639a);
        }
    }

    public e(i iVar, int i4, F3.a aVar) {
        this.f1442e = iVar;
        this.f1443f = i4;
        this.f1444g = aVar;
    }

    public static /* synthetic */ Object d(e eVar, G3.e eVar2, l3.e eVar3) {
        Object b4 = J.b(new a(eVar2, eVar, (l3.e) null), eVar3);
        return b4 == C0795c.c() ? b4 : C0673n.f9639a;
    }

    public d a(i iVar, int i4, F3.a aVar) {
        i h4 = iVar.h(this.f1442e);
        if (aVar == F3.a.SUSPEND) {
            int i5 = this.f1443f;
            if (i5 != -3) {
                if (i4 != -3) {
                    if (i5 != -2) {
                        if (i4 != -2) {
                            i4 += i5;
                            if (i4 < 0) {
                                i4 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i4 = i5;
            }
            aVar = this.f1444g;
        }
        return (l.a(h4, this.f1442e) && i4 == this.f1443f && aVar == this.f1444g) ? this : g(h4, i4, aVar);
    }

    public String b() {
        return null;
    }

    public Object c(G3.e eVar, l3.e eVar2) {
        return d(this, eVar, eVar2);
    }

    public abstract Object f(r rVar, l3.e eVar);

    public abstract e g(i iVar, int i4, F3.a aVar);

    public final p h() {
        return new b(this, (l3.e) null);
    }

    public final int i() {
        int i4 = this.f1443f;
        if (i4 == -3) {
            return -2;
        }
        return i4;
    }

    public s j(I i4) {
        return F3.p.c(i4, this.f1442e, i(), this.f1444g, K.ATOMIC, (u3.l) null, h(), 16, (Object) null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String b4 = b();
        if (b4 != null) {
            arrayList.add(b4);
        }
        if (this.f1442e != j.f11131e) {
            arrayList.add("context=" + this.f1442e);
        }
        if (this.f1443f != -3) {
            arrayList.add("capacity=" + this.f1443f);
        }
        if (this.f1444g != F3.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f1444g);
        }
        return M.a(this) + '[' + C0746w.A(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (u3.l) null, 62, (Object) null) + ']';
    }
}
