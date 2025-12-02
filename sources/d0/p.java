package D0;

import D0.C0228l;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class p extends C0228l {

    /* renamed from: M  reason: collision with root package name */
    public ArrayList f703M = new ArrayList();

    /* renamed from: N  reason: collision with root package name */
    public boolean f704N = true;

    /* renamed from: O  reason: collision with root package name */
    public int f705O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f706P = false;

    /* renamed from: Q  reason: collision with root package name */
    public int f707Q = 0;

    public class a extends C0229m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C0228l f708a;

        public a(C0228l lVar) {
            this.f708a = lVar;
        }

        public void d(C0228l lVar) {
            this.f708a.Y();
            lVar.U(this);
        }
    }

    public static class b extends C0229m {

        /* renamed from: a  reason: collision with root package name */
        public p f710a;

        public b(p pVar) {
            this.f710a = pVar;
        }

        public void a(C0228l lVar) {
            p pVar = this.f710a;
            if (!pVar.f706P) {
                pVar.f0();
                this.f710a.f706P = true;
            }
        }

        public void d(C0228l lVar) {
            p pVar = this.f710a;
            int i4 = pVar.f705O - 1;
            pVar.f705O = i4;
            if (i4 == 0) {
                pVar.f706P = false;
                pVar.u();
            }
            lVar.U(this);
        }
    }

    public void S(View view) {
        super.S(view);
        int size = this.f703M.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0228l) this.f703M.get(i4)).S(view);
        }
    }

    public void W(View view) {
        super.W(view);
        int size = this.f703M.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0228l) this.f703M.get(i4)).W(view);
        }
    }

    public void Y() {
        if (this.f703M.isEmpty()) {
            f0();
            u();
            return;
        }
        t0();
        if (!this.f704N) {
            for (int i4 = 1; i4 < this.f703M.size(); i4++) {
                ((C0228l) this.f703M.get(i4 - 1)).a(new a((C0228l) this.f703M.get(i4)));
            }
            C0228l lVar = (C0228l) this.f703M.get(0);
            if (lVar != null) {
                lVar.Y();
                return;
            }
            return;
        }
        Iterator it = this.f703M.iterator();
        while (it.hasNext()) {
            ((C0228l) it.next()).Y();
        }
    }

    public void a0(C0228l.e eVar) {
        super.a0(eVar);
        this.f707Q |= 8;
        int size = this.f703M.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0228l) this.f703M.get(i4)).a0(eVar);
        }
    }

    public void c0(C0223g gVar) {
        super.c0(gVar);
        this.f707Q |= 4;
        if (this.f703M != null) {
            for (int i4 = 0; i4 < this.f703M.size(); i4++) {
                ((C0228l) this.f703M.get(i4)).c0(gVar);
            }
        }
    }

    public void d0(C0231o oVar) {
        super.d0(oVar);
        this.f707Q |= 2;
        int size = this.f703M.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0228l) this.f703M.get(i4)).d0(oVar);
        }
    }

    public String g0(String str) {
        String g02 = super.g0(str);
        for (int i4 = 0; i4 < this.f703M.size(); i4++) {
            StringBuilder sb = new StringBuilder();
            sb.append(g02);
            sb.append("\n");
            sb.append(((C0228l) this.f703M.get(i4)).g0(str + "  "));
            g02 = sb.toString();
        }
        return g02;
    }

    /* renamed from: h0 */
    public p a(C0228l.f fVar) {
        return (p) super.a(fVar);
    }

    /* renamed from: i0 */
    public p b(View view) {
        for (int i4 = 0; i4 < this.f703M.size(); i4++) {
            ((C0228l) this.f703M.get(i4)).b(view);
        }
        return (p) super.b(view);
    }

    public p j0(C0228l lVar) {
        k0(lVar);
        long j4 = this.f668g;
        if (j4 >= 0) {
            lVar.Z(j4);
        }
        if ((this.f707Q & 1) != 0) {
            lVar.b0(x());
        }
        if ((this.f707Q & 2) != 0) {
            B();
            lVar.d0((C0231o) null);
        }
        if ((this.f707Q & 4) != 0) {
            lVar.c0(A());
        }
        if ((this.f707Q & 8) != 0) {
            lVar.a0(w());
        }
        return this;
    }

    public void k() {
        super.k();
        int size = this.f703M.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0228l) this.f703M.get(i4)).k();
        }
    }

    public final void k0(C0228l lVar) {
        this.f703M.add(lVar);
        lVar.f683v = this;
    }

    public void l(r rVar) {
        if (L(rVar.f715b)) {
            Iterator it = this.f703M.iterator();
            while (it.hasNext()) {
                C0228l lVar = (C0228l) it.next();
                if (lVar.L(rVar.f715b)) {
                    lVar.l(rVar);
                    rVar.f716c.add(lVar);
                }
            }
        }
    }

    public C0228l l0(int i4) {
        if (i4 < 0 || i4 >= this.f703M.size()) {
            return null;
        }
        return (C0228l) this.f703M.get(i4);
    }

    public int m0() {
        return this.f703M.size();
    }

    public void n(r rVar) {
        super.n(rVar);
        int size = this.f703M.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((C0228l) this.f703M.get(i4)).n(rVar);
        }
    }

    /* renamed from: n0 */
    public p U(C0228l.f fVar) {
        return (p) super.U(fVar);
    }

    public void o(r rVar) {
        if (L(rVar.f715b)) {
            Iterator it = this.f703M.iterator();
            while (it.hasNext()) {
                C0228l lVar = (C0228l) it.next();
                if (lVar.L(rVar.f715b)) {
                    lVar.o(rVar);
                    rVar.f716c.add(lVar);
                }
            }
        }
    }

    /* renamed from: o0 */
    public p V(View view) {
        for (int i4 = 0; i4 < this.f703M.size(); i4++) {
            ((C0228l) this.f703M.get(i4)).V(view);
        }
        return (p) super.V(view);
    }

    /* renamed from: p0 */
    public p Z(long j4) {
        ArrayList arrayList;
        super.Z(j4);
        if (this.f668g >= 0 && (arrayList = this.f703M) != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((C0228l) this.f703M.get(i4)).Z(j4);
            }
        }
        return this;
    }

    /* renamed from: q0 */
    public p b0(TimeInterpolator timeInterpolator) {
        this.f707Q |= 1;
        ArrayList arrayList = this.f703M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((C0228l) this.f703M.get(i4)).b0(timeInterpolator);
            }
        }
        return (p) super.b0(timeInterpolator);
    }

    /* renamed from: r */
    public C0228l clone() {
        p pVar = (p) super.clone();
        pVar.f703M = new ArrayList();
        int size = this.f703M.size();
        for (int i4 = 0; i4 < size; i4++) {
            pVar.k0(((C0228l) this.f703M.get(i4)).clone());
        }
        return pVar;
    }

    public p r0(int i4) {
        if (i4 == 0) {
            this.f704N = true;
        } else if (i4 == 1) {
            this.f704N = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i4);
        }
        return this;
    }

    /* renamed from: s0 */
    public p e0(long j4) {
        return (p) super.e0(j4);
    }

    public void t(ViewGroup viewGroup, s sVar, s sVar2, ArrayList arrayList, ArrayList arrayList2) {
        long D4 = D();
        int size = this.f703M.size();
        for (int i4 = 0; i4 < size; i4++) {
            C0228l lVar = (C0228l) this.f703M.get(i4);
            if (D4 > 0 && (this.f704N || i4 == 0)) {
                long D5 = lVar.D();
                if (D5 > 0) {
                    lVar.e0(D5 + D4);
                } else {
                    lVar.e0(D4);
                }
            }
            lVar.t(viewGroup, sVar, sVar2, arrayList, arrayList2);
        }
    }

    public final void t0() {
        b bVar = new b(this);
        Iterator it = this.f703M.iterator();
        while (it.hasNext()) {
            ((C0228l) it.next()).a(bVar);
        }
        this.f705O = this.f703M.size();
    }
}
