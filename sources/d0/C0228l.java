package D0;

import S.C;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v.C0944a;
import v.g;

/* renamed from: D0.l  reason: case insensitive filesystem */
public abstract class C0228l implements Cloneable {

    /* renamed from: J  reason: collision with root package name */
    public static final int[] f654J = {2, 1, 3, 4};

    /* renamed from: K  reason: collision with root package name */
    public static final C0223g f655K = new a();

    /* renamed from: L  reason: collision with root package name */
    public static ThreadLocal f656L = new ThreadLocal();

    /* renamed from: A  reason: collision with root package name */
    public ArrayList f657A = new ArrayList();

    /* renamed from: B  reason: collision with root package name */
    public int f658B = 0;

    /* renamed from: C  reason: collision with root package name */
    public boolean f659C = false;

    /* renamed from: D  reason: collision with root package name */
    public boolean f660D = false;

    /* renamed from: E  reason: collision with root package name */
    public ArrayList f661E = null;

    /* renamed from: F  reason: collision with root package name */
    public ArrayList f662F = new ArrayList();

    /* renamed from: G  reason: collision with root package name */
    public e f663G;

    /* renamed from: H  reason: collision with root package name */
    public C0944a f664H;

    /* renamed from: I  reason: collision with root package name */
    public C0223g f665I = f655K;

    /* renamed from: e  reason: collision with root package name */
    public String f666e = getClass().getName();

    /* renamed from: f  reason: collision with root package name */
    public long f667f = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f668g = -1;

    /* renamed from: h  reason: collision with root package name */
    public TimeInterpolator f669h = null;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f670i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f671j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f672k = null;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f673l = null;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f674m = null;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f675n = null;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f676o = null;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f677p = null;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f678q = null;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f679r = null;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f680s = null;

    /* renamed from: t  reason: collision with root package name */
    public s f681t = new s();

    /* renamed from: u  reason: collision with root package name */
    public s f682u = new s();

    /* renamed from: v  reason: collision with root package name */
    public p f683v = null;

    /* renamed from: w  reason: collision with root package name */
    public int[] f684w = f654J;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f685x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f686y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f687z = false;

    /* renamed from: D0.l$a */
    public class a extends C0223g {
        public Path a(float f4, float f5, float f6, float f7) {
            Path path = new Path();
            path.moveTo(f4, f5);
            path.lineTo(f6, f7);
            return path;
        }
    }

    /* renamed from: D0.l$b */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C0944a f688a;

        public b(C0944a aVar) {
            this.f688a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f688a.remove(animator);
            C0228l.this.f657A.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C0228l.this.f657A.add(animator);
        }
    }

    /* renamed from: D0.l$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        public void onAnimationEnd(Animator animator) {
            C0228l.this.u();
            animator.removeListener(this);
        }
    }

    /* renamed from: D0.l$d */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public View f691a;

        /* renamed from: b  reason: collision with root package name */
        public String f692b;

        /* renamed from: c  reason: collision with root package name */
        public r f693c;

        /* renamed from: d  reason: collision with root package name */
        public O f694d;

        /* renamed from: e  reason: collision with root package name */
        public C0228l f695e;

        public d(View view, String str, C0228l lVar, O o4, r rVar) {
            this.f691a = view;
            this.f692b = str;
            this.f693c = rVar;
            this.f694d = o4;
            this.f695e = lVar;
        }
    }

    /* renamed from: D0.l$e */
    public static abstract class e {
    }

    /* renamed from: D0.l$f */
    public interface f {
        void a(C0228l lVar);

        void b(C0228l lVar);

        void c(C0228l lVar);

        void d(C0228l lVar);

        void e(C0228l lVar);
    }

    public static C0944a C() {
        C0944a aVar = (C0944a) f656L.get();
        if (aVar != null) {
            return aVar;
        }
        C0944a aVar2 = new C0944a();
        f656L.set(aVar2);
        return aVar2;
    }

    public static boolean M(r rVar, r rVar2, String str) {
        Object obj = rVar.f714a.get(str);
        Object obj2 = rVar2.f714a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void g(s sVar, View view, r rVar) {
        sVar.f717a.put(view, rVar);
        int id = view.getId();
        if (id >= 0) {
            if (sVar.f718b.indexOfKey(id) >= 0) {
                sVar.f718b.put(id, (Object) null);
            } else {
                sVar.f718b.put(id, view);
            }
        }
        String E4 = C.E(view);
        if (E4 != null) {
            if (sVar.f720d.containsKey(E4)) {
                sVar.f720d.put(E4, (Object) null);
            } else {
                sVar.f720d.put(E4, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (sVar.f719c.k(itemIdAtPosition) >= 0) {
                    View view2 = (View) sVar.f719c.g(itemIdAtPosition);
                    if (view2 != null) {
                        C.p0(view2, false);
                        sVar.f719c.m(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                C.p0(view, true);
                sVar.f719c.m(itemIdAtPosition, view);
            }
        }
    }

    public C0223g A() {
        return this.f665I;
    }

    public C0231o B() {
        return null;
    }

    public long D() {
        return this.f667f;
    }

    public List E() {
        return this.f670i;
    }

    public List F() {
        return this.f672k;
    }

    public List G() {
        return this.f673l;
    }

    public List H() {
        return this.f671j;
    }

    public String[] I() {
        return null;
    }

    public r J(View view, boolean z4) {
        p pVar = this.f683v;
        if (pVar != null) {
            return pVar.J(view, z4);
        }
        return (r) (z4 ? this.f681t : this.f682u).f717a.get(view);
    }

    public boolean K(r rVar, r rVar2) {
        if (rVar == null || rVar2 == null) {
            return false;
        }
        String[] I4 = I();
        if (I4 != null) {
            int length = I4.length;
            int i4 = 0;
            while (i4 < length) {
                if (!M(rVar, rVar2, I4[i4])) {
                    i4++;
                }
            }
            return false;
        }
        for (String M4 : rVar.f714a.keySet()) {
            if (M(rVar, rVar2, M4)) {
            }
        }
        return false;
        return true;
    }

    public boolean L(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f674m;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f675n;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f676o;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (((Class) this.f676o.get(i4)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f677p != null && C.E(view) != null && this.f677p.contains(C.E(view))) {
            return false;
        }
        if ((this.f670i.size() == 0 && this.f671j.size() == 0 && (((arrayList = this.f673l) == null || arrayList.isEmpty()) && ((arrayList2 = this.f672k) == null || arrayList2.isEmpty()))) || this.f670i.contains(Integer.valueOf(id)) || this.f671j.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f672k;
        if (arrayList6 != null && arrayList6.contains(C.E(view))) {
            return true;
        }
        if (this.f673l != null) {
            for (int i5 = 0; i5 < this.f673l.size(); i5++) {
                if (((Class) this.f673l.get(i5)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void N(C0944a aVar, C0944a aVar2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) sparseArray.valueAt(i4);
            if (view2 != null && L(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i4))) != null && L(view)) {
                r rVar = (r) aVar.get(view2);
                r rVar2 = (r) aVar2.get(view);
                if (!(rVar == null || rVar2 == null)) {
                    this.f685x.add(rVar);
                    this.f686y.add(rVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void O(C0944a aVar, C0944a aVar2) {
        r rVar;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.i(size);
            if (view != null && L(view) && (rVar = (r) aVar2.remove(view)) != null && L(rVar.f715b)) {
                this.f685x.add((r) aVar.k(size));
                this.f686y.add(rVar);
            }
        }
    }

    public final void P(C0944a aVar, C0944a aVar2, v.d dVar, v.d dVar2) {
        View view;
        int p4 = dVar.p();
        for (int i4 = 0; i4 < p4; i4++) {
            View view2 = (View) dVar.q(i4);
            if (view2 != null && L(view2) && (view = (View) dVar2.g(dVar.l(i4))) != null && L(view)) {
                r rVar = (r) aVar.get(view2);
                r rVar2 = (r) aVar2.get(view);
                if (!(rVar == null || rVar2 == null)) {
                    this.f685x.add(rVar);
                    this.f686y.add(rVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void Q(C0944a aVar, C0944a aVar2, C0944a aVar3, C0944a aVar4) {
        View view;
        int size = aVar3.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) aVar3.m(i4);
            if (view2 != null && L(view2) && (view = (View) aVar4.get(aVar3.i(i4))) != null && L(view)) {
                r rVar = (r) aVar.get(view2);
                r rVar2 = (r) aVar2.get(view);
                if (!(rVar == null || rVar2 == null)) {
                    this.f685x.add(rVar);
                    this.f686y.add(rVar2);
                    aVar.remove(view2);
                    aVar2.remove(view);
                }
            }
        }
    }

    public final void R(s sVar, s sVar2) {
        C0944a aVar = new C0944a((g) sVar.f717a);
        C0944a aVar2 = new C0944a((g) sVar2.f717a);
        int i4 = 0;
        while (true) {
            int[] iArr = this.f684w;
            if (i4 < iArr.length) {
                int i5 = iArr[i4];
                if (i5 == 1) {
                    O(aVar, aVar2);
                } else if (i5 == 2) {
                    Q(aVar, aVar2, sVar.f720d, sVar2.f720d);
                } else if (i5 == 3) {
                    N(aVar, aVar2, sVar.f718b, sVar2.f718b);
                } else if (i5 == 4) {
                    P(aVar, aVar2, sVar.f719c, sVar2.f719c);
                }
                i4++;
            } else {
                e(aVar, aVar2);
                return;
            }
        }
    }

    public void S(View view) {
        if (!this.f660D) {
            for (int size = this.f657A.size() - 1; size >= 0; size--) {
                C0217a.b((Animator) this.f657A.get(size));
            }
            ArrayList arrayList = this.f661E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f661E.clone();
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((f) arrayList2.get(i4)).c(this);
                }
            }
            this.f659C = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: D0.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void T(android.view.ViewGroup r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f685x = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f686y = r0
            D0.s r0 = r10.f681t
            D0.s r1 = r10.f682u
            r10.R(r0, r1)
            v.a r0 = C()
            int r1 = r0.size()
            D0.O r2 = D0.z.d(r11)
            r3 = 1
            int r1 = r1 - r3
        L_0x0023:
            if (r1 < 0) goto L_0x007f
            java.lang.Object r4 = r0.i(r1)
            android.animation.Animator r4 = (android.animation.Animator) r4
            if (r4 == 0) goto L_0x007c
            java.lang.Object r5 = r0.get(r4)
            D0.l$d r5 = (D0.C0228l.d) r5
            if (r5 == 0) goto L_0x007c
            android.view.View r6 = r5.f691a
            if (r6 == 0) goto L_0x007c
            D0.O r6 = r5.f694d
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L_0x007c
            D0.r r6 = r5.f693c
            android.view.View r7 = r5.f691a
            D0.r r8 = r10.J(r7, r3)
            D0.r r9 = r10.y(r7, r3)
            if (r8 != 0) goto L_0x005c
            if (r9 != 0) goto L_0x005c
            D0.s r9 = r10.f682u
            v.a r9 = r9.f717a
            java.lang.Object r7 = r9.get(r7)
            r9 = r7
            D0.r r9 = (D0.r) r9
        L_0x005c:
            if (r8 != 0) goto L_0x0060
            if (r9 == 0) goto L_0x007c
        L_0x0060:
            D0.l r5 = r5.f695e
            boolean r5 = r5.K(r6, r9)
            if (r5 == 0) goto L_0x007c
            boolean r5 = r4.isRunning()
            if (r5 != 0) goto L_0x0079
            boolean r5 = r4.isStarted()
            if (r5 == 0) goto L_0x0075
            goto L_0x0079
        L_0x0075:
            r0.remove(r4)
            goto L_0x007c
        L_0x0079:
            r4.cancel()
        L_0x007c:
            int r1 = r1 + -1
            goto L_0x0023
        L_0x007f:
            D0.s r6 = r10.f681t
            D0.s r7 = r10.f682u
            java.util.ArrayList r8 = r10.f685x
            java.util.ArrayList r9 = r10.f686y
            r4 = r10
            r5 = r11
            r4.t(r5, r6, r7, r8, r9)
            r10.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.C0228l.T(android.view.ViewGroup):void");
    }

    public C0228l U(f fVar) {
        ArrayList arrayList = this.f661E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f661E.size() == 0) {
            this.f661E = null;
        }
        return this;
    }

    public C0228l V(View view) {
        this.f671j.remove(view);
        return this;
    }

    public void W(View view) {
        if (this.f659C) {
            if (!this.f660D) {
                for (int size = this.f657A.size() - 1; size >= 0; size--) {
                    C0217a.c((Animator) this.f657A.get(size));
                }
                ArrayList arrayList = this.f661E;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f661E.clone();
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((f) arrayList2.get(i4)).e(this);
                    }
                }
            }
            this.f659C = false;
        }
    }

    public final void X(Animator animator, C0944a aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            h(animator);
        }
    }

    public void Y() {
        f0();
        C0944a C4 = C();
        Iterator it = this.f662F.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (C4.containsKey(animator)) {
                f0();
                X(animator, C4);
            }
        }
        this.f662F.clear();
        u();
    }

    public C0228l Z(long j4) {
        this.f668g = j4;
        return this;
    }

    public C0228l a(f fVar) {
        if (this.f661E == null) {
            this.f661E = new ArrayList();
        }
        this.f661E.add(fVar);
        return this;
    }

    public void a0(e eVar) {
        this.f663G = eVar;
    }

    public C0228l b(View view) {
        this.f671j.add(view);
        return this;
    }

    public C0228l b0(TimeInterpolator timeInterpolator) {
        this.f669h = timeInterpolator;
        return this;
    }

    public void c0(C0223g gVar) {
        if (gVar == null) {
            this.f665I = f655K;
        } else {
            this.f665I = gVar;
        }
    }

    public void d0(C0231o oVar) {
    }

    public final void e(C0944a aVar, C0944a aVar2) {
        for (int i4 = 0; i4 < aVar.size(); i4++) {
            r rVar = (r) aVar.m(i4);
            if (L(rVar.f715b)) {
                this.f685x.add(rVar);
                this.f686y.add((Object) null);
            }
        }
        for (int i5 = 0; i5 < aVar2.size(); i5++) {
            r rVar2 = (r) aVar2.m(i5);
            if (L(rVar2.f715b)) {
                this.f686y.add(rVar2);
                this.f685x.add((Object) null);
            }
        }
    }

    public C0228l e0(long j4) {
        this.f667f = j4;
        return this;
    }

    public void f0() {
        if (this.f658B == 0) {
            ArrayList arrayList = this.f661E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f661E.clone();
                int size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((f) arrayList2.get(i4)).a(this);
                }
            }
            this.f660D = false;
        }
        this.f658B++;
    }

    public String g0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f668g != -1) {
            str2 = str2 + "dur(" + this.f668g + ") ";
        }
        if (this.f667f != -1) {
            str2 = str2 + "dly(" + this.f667f + ") ";
        }
        if (this.f669h != null) {
            str2 = str2 + "interp(" + this.f669h + ") ";
        }
        if (this.f670i.size() <= 0 && this.f671j.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f670i.size() > 0) {
            for (int i4 = 0; i4 < this.f670i.size(); i4++) {
                if (i4 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f670i.get(i4);
            }
        }
        if (this.f671j.size() > 0) {
            for (int i5 = 0; i5 < this.f671j.size(); i5++) {
                if (i5 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f671j.get(i5);
            }
        }
        return str3 + ")";
    }

    public void h(Animator animator) {
        if (animator == null) {
            u();
            return;
        }
        if (v() >= 0) {
            animator.setDuration(v());
        }
        if (D() >= 0) {
            animator.setStartDelay(D() + animator.getStartDelay());
        }
        if (x() != null) {
            animator.setInterpolator(x());
        }
        animator.addListener(new c());
        animator.start();
    }

    public void k() {
        for (int size = this.f657A.size() - 1; size >= 0; size--) {
            ((Animator) this.f657A.get(size)).cancel();
        }
        ArrayList arrayList = this.f661E;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f661E.clone();
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((f) arrayList2.get(i4)).b(this);
            }
        }
    }

    public abstract void l(r rVar);

    public final void m(View view, boolean z4) {
        if (view != null) {
            int id = view.getId();
            ArrayList arrayList = this.f674m;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList arrayList2 = this.f675n;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList arrayList3 = this.f676o;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i4 = 0;
                        while (i4 < size) {
                            if (!((Class) this.f676o.get(i4)).isInstance(view)) {
                                i4++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        r rVar = new r(view);
                        if (z4) {
                            o(rVar);
                        } else {
                            l(rVar);
                        }
                        rVar.f716c.add(this);
                        n(rVar);
                        if (z4) {
                            g(this.f681t, view, rVar);
                        } else {
                            g(this.f682u, view, rVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList arrayList4 = this.f678q;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList arrayList5 = this.f679r;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList arrayList6 = this.f680s;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i5 = 0;
                                    while (i5 < size2) {
                                        if (!((Class) this.f680s.get(i5)).isInstance(view)) {
                                            i5++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                                    m(viewGroup.getChildAt(i6), z4);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void n(r rVar) {
    }

    public abstract void o(r rVar);

    public void p(ViewGroup viewGroup, boolean z4) {
        C0944a aVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        q(z4);
        if ((this.f670i.size() > 0 || this.f671j.size() > 0) && (((arrayList = this.f672k) == null || arrayList.isEmpty()) && ((arrayList2 = this.f673l) == null || arrayList2.isEmpty()))) {
            for (int i4 = 0; i4 < this.f670i.size(); i4++) {
                View findViewById = viewGroup.findViewById(((Integer) this.f670i.get(i4)).intValue());
                if (findViewById != null) {
                    r rVar = new r(findViewById);
                    if (z4) {
                        o(rVar);
                    } else {
                        l(rVar);
                    }
                    rVar.f716c.add(this);
                    n(rVar);
                    if (z4) {
                        g(this.f681t, findViewById, rVar);
                    } else {
                        g(this.f682u, findViewById, rVar);
                    }
                }
            }
            for (int i5 = 0; i5 < this.f671j.size(); i5++) {
                View view = (View) this.f671j.get(i5);
                r rVar2 = new r(view);
                if (z4) {
                    o(rVar2);
                } else {
                    l(rVar2);
                }
                rVar2.f716c.add(this);
                n(rVar2);
                if (z4) {
                    g(this.f681t, view, rVar2);
                } else {
                    g(this.f682u, view, rVar2);
                }
            }
        } else {
            m(viewGroup, z4);
        }
        if (!z4 && (aVar = this.f664H) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i6 = 0; i6 < size; i6++) {
                arrayList3.add(this.f681t.f720d.remove((String) this.f664H.i(i6)));
            }
            for (int i7 = 0; i7 < size; i7++) {
                View view2 = (View) arrayList3.get(i7);
                if (view2 != null) {
                    this.f681t.f720d.put((String) this.f664H.m(i7), view2);
                }
            }
        }
    }

    public void q(boolean z4) {
        if (z4) {
            this.f681t.f717a.clear();
            this.f681t.f718b.clear();
            this.f681t.f719c.a();
            return;
        }
        this.f682u.f717a.clear();
        this.f682u.f718b.clear();
        this.f682u.f719c.a();
    }

    /* renamed from: r */
    public C0228l clone() {
        try {
            C0228l lVar = (C0228l) super.clone();
            lVar.f662F = new ArrayList();
            lVar.f681t = new s();
            lVar.f682u = new s();
            lVar.f685x = null;
            lVar.f686y = null;
            return lVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator s(ViewGroup viewGroup, r rVar, r rVar2) {
        return null;
    }

    public void t(ViewGroup viewGroup, s sVar, s sVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i4;
        Animator animator;
        r rVar;
        View view;
        r rVar2;
        Animator animator2;
        C0944a C4 = C();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            r rVar3 = (r) arrayList.get(i5);
            r rVar4 = (r) arrayList2.get(i5);
            if (rVar3 != null && !rVar3.f716c.contains(this)) {
                rVar3 = null;
            }
            if (rVar4 != null && !rVar4.f716c.contains(this)) {
                rVar4 = null;
            }
            if (!(rVar3 == null && rVar4 == null) && (rVar3 == null || rVar4 == null || K(rVar3, rVar4))) {
                Animator s4 = s(viewGroup, rVar3, rVar4);
                if (s4 != null) {
                    if (rVar4 != null) {
                        View view2 = rVar4.f715b;
                        String[] I4 = I();
                        if (I4 != null && I4.length > 0) {
                            rVar2 = new r(view2);
                            r rVar5 = (r) sVar2.f717a.get(view2);
                            if (rVar5 != null) {
                                int i6 = 0;
                                while (i6 < I4.length) {
                                    Map map = rVar2.f714a;
                                    Animator animator3 = s4;
                                    String str = I4[i6];
                                    map.put(str, rVar5.f714a.get(str));
                                    i6++;
                                    s4 = animator3;
                                    I4 = I4;
                                }
                            }
                            Animator animator4 = s4;
                            int size2 = C4.size();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) C4.get((Animator) C4.i(i7));
                                if (dVar.f693c != null && dVar.f691a == view2 && dVar.f692b.equals(z()) && dVar.f693c.equals(rVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            s sVar3 = sVar2;
                            animator2 = s4;
                            rVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        rVar = rVar2;
                    } else {
                        s sVar4 = sVar2;
                        view = rVar3.f715b;
                        animator = s4;
                        rVar = null;
                    }
                    if (animator != null) {
                        i4 = size;
                        d dVar2 = r0;
                        d dVar3 = new d(view, z(), this, z.d(viewGroup), rVar);
                        C4.put(animator, dVar2);
                        this.f662F.add(animator);
                        i5++;
                        size = i4;
                    }
                    i4 = size;
                    i5++;
                    size = i4;
                }
            } else {
                ViewGroup viewGroup2 = viewGroup;
            }
            s sVar5 = sVar2;
            i4 = size;
            i5++;
            size = i4;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                Animator animator5 = (Animator) this.f662F.get(sparseIntArray.keyAt(i8));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    public String toString() {
        return g0("");
    }

    public void u() {
        int i4 = this.f658B - 1;
        this.f658B = i4;
        if (i4 == 0) {
            ArrayList arrayList = this.f661E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f661E.clone();
                int size = arrayList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((f) arrayList2.get(i5)).d(this);
                }
            }
            for (int i6 = 0; i6 < this.f681t.f719c.p(); i6++) {
                View view = (View) this.f681t.f719c.q(i6);
                if (view != null) {
                    C.p0(view, false);
                }
            }
            for (int i7 = 0; i7 < this.f682u.f719c.p(); i7++) {
                View view2 = (View) this.f682u.f719c.q(i7);
                if (view2 != null) {
                    C.p0(view2, false);
                }
            }
            this.f660D = true;
        }
    }

    public long v() {
        return this.f668g;
    }

    public e w() {
        return this.f663G;
    }

    public TimeInterpolator x() {
        return this.f669h;
    }

    public r y(View view, boolean z4) {
        p pVar = this.f683v;
        if (pVar != null) {
            return pVar.y(view, z4);
        }
        ArrayList arrayList = z4 ? this.f685x : this.f686y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i4 = -1;
                break;
            }
            r rVar = (r) arrayList.get(i4);
            if (rVar == null) {
                return null;
            }
            if (rVar.f715b == view) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            return null;
        }
        return (r) (z4 ? this.f686y : this.f685x).get(i4);
    }

    public String z() {
        return this.f666e;
    }
}
