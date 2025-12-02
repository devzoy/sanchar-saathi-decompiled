package androidx.recyclerview.widget;

import S.C;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends m {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f5892s;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f5893h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f5894i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f5895j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f5896k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f5897l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f5898m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f5899n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f5900o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f5901p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f5902q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public ArrayList f5903r = new ArrayList();

    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5904e;

        public a(ArrayList arrayList) {
            this.f5904e = arrayList;
        }

        public void run() {
            Iterator it = this.f5904e.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.S(jVar.f5938a, jVar.f5939b, jVar.f5940c, jVar.f5941d, jVar.f5942e);
            }
            this.f5904e.clear();
            c.this.f5898m.remove(this.f5904e);
        }
    }

    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5906e;

        public b(ArrayList arrayList) {
            this.f5906e = arrayList;
        }

        public void run() {
            Iterator it = this.f5906e.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f5906e.clear();
            c.this.f5899n.remove(this.f5906e);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c  reason: collision with other inner class name */
    public class C0100c implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ArrayList f5908e;

        public C0100c(ArrayList arrayList) {
            this.f5908e = arrayList;
        }

        public void run() {
            Iterator it = this.f5908e.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.C) it.next());
            }
            this.f5908e.clear();
            c.this.f5897l.remove(this.f5908e);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.C f5910a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f5911b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f5912c;

        public d(RecyclerView.C c4, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5910a = c4;
            this.f5911b = viewPropertyAnimator;
            this.f5912c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5911b.setListener((Animator.AnimatorListener) null);
            this.f5912c.setAlpha(1.0f);
            c.this.G(this.f5910a);
            c.this.f5902q.remove(this.f5910a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.H(this.f5910a);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.C f5914a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f5915b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f5916c;

        public e(RecyclerView.C c4, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5914a = c4;
            this.f5915b = view;
            this.f5916c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f5915b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f5916c.setListener((Animator.AnimatorListener) null);
            c.this.A(this.f5914a);
            c.this.f5900o.remove(this.f5914a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.B(this.f5914a);
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.C f5918a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f5919b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f5920c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f5921d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f5922e;

        public f(RecyclerView.C c4, int i4, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
            this.f5918a = c4;
            this.f5919b = i4;
            this.f5920c = view;
            this.f5921d = i5;
            this.f5922e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f5919b != 0) {
                this.f5920c.setTranslationX(0.0f);
            }
            if (this.f5921d != 0) {
                this.f5920c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f5922e.setListener((Animator.AnimatorListener) null);
            c.this.E(this.f5918a);
            c.this.f5901p.remove(this.f5918a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.F(this.f5918a);
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f5924a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f5925b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f5926c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5924a = iVar;
            this.f5925b = viewPropertyAnimator;
            this.f5926c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5925b.setListener((Animator.AnimatorListener) null);
            this.f5926c.setAlpha(1.0f);
            this.f5926c.setTranslationX(0.0f);
            this.f5926c.setTranslationY(0.0f);
            c.this.C(this.f5924a.f5932a, true);
            c.this.f5903r.remove(this.f5924a.f5932a);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.f5924a.f5932a, true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f5928a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f5929b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f5930c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f5928a = iVar;
            this.f5929b = viewPropertyAnimator;
            this.f5930c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f5929b.setListener((Animator.AnimatorListener) null);
            this.f5930c.setAlpha(1.0f);
            this.f5930c.setTranslationX(0.0f);
            this.f5930c.setTranslationY(0.0f);
            c.this.C(this.f5928a.f5933b, false);
            c.this.f5903r.remove(this.f5928a.f5933b);
            c.this.V();
        }

        public void onAnimationStart(Animator animator) {
            c.this.D(this.f5928a.f5933b, false);
        }
    }

    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.C f5938a;

        /* renamed from: b  reason: collision with root package name */
        public int f5939b;

        /* renamed from: c  reason: collision with root package name */
        public int f5940c;

        /* renamed from: d  reason: collision with root package name */
        public int f5941d;

        /* renamed from: e  reason: collision with root package name */
        public int f5942e;

        public j(RecyclerView.C c4, int i4, int i5, int i6, int i7) {
            this.f5938a = c4;
            this.f5939b = i4;
            this.f5940c = i5;
            this.f5941d = i6;
            this.f5942e = i7;
        }
    }

    public void Q(RecyclerView.C c4) {
        View view = c4.f5707a;
        ViewPropertyAnimator animate = view.animate();
        this.f5900o.add(c4);
        animate.alpha(1.0f).setDuration(l()).setListener(new e(c4, view, animate)).start();
    }

    public void R(i iVar) {
        RecyclerView.C c4 = iVar.f5932a;
        View view = null;
        View view2 = c4 == null ? null : c4.f5707a;
        RecyclerView.C c5 = iVar.f5933b;
        if (c5 != null) {
            view = c5.f5707a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(m());
            this.f5903r.add(iVar.f5932a);
            duration.translationX((float) (iVar.f5936e - iVar.f5934c));
            duration.translationY((float) (iVar.f5937f - iVar.f5935d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f5903r.add(iVar.f5933b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, animate, view)).start();
        }
    }

    public void S(RecyclerView.C c4, int i4, int i5, int i6, int i7) {
        View view = c4.f5707a;
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (i8 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i9 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f5901p.add(c4);
        animate.setDuration(n()).setListener(new f(c4, i8, view, i9, animate)).start();
    }

    public final void T(RecyclerView.C c4) {
        View view = c4.f5707a;
        ViewPropertyAnimator animate = view.animate();
        this.f5902q.add(c4);
        animate.setDuration(o()).alpha(0.0f).setListener(new d(c4, animate, view)).start();
    }

    public void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.C) list.get(size)).f5707a.animate().cancel();
        }
    }

    public void V() {
        if (!p()) {
            i();
        }
    }

    public final void W(List list, RecyclerView.C c4) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, c4) && iVar.f5932a == null && iVar.f5933b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void X(i iVar) {
        RecyclerView.C c4 = iVar.f5932a;
        if (c4 != null) {
            Y(iVar, c4);
        }
        RecyclerView.C c5 = iVar.f5933b;
        if (c5 != null) {
            Y(iVar, c5);
        }
    }

    public final boolean Y(i iVar, RecyclerView.C c4) {
        boolean z4 = false;
        if (iVar.f5933b == c4) {
            iVar.f5933b = null;
        } else if (iVar.f5932a != c4) {
            return false;
        } else {
            iVar.f5932a = null;
            z4 = true;
        }
        c4.f5707a.setAlpha(1.0f);
        c4.f5707a.setTranslationX(0.0f);
        c4.f5707a.setTranslationY(0.0f);
        C(c4, z4);
        return true;
    }

    public final void Z(RecyclerView.C c4) {
        if (f5892s == null) {
            f5892s = new ValueAnimator().getInterpolator();
        }
        c4.f5707a.animate().setInterpolator(f5892s);
        j(c4);
    }

    public boolean g(RecyclerView.C c4, List list) {
        return !list.isEmpty() || super.g(c4, list);
    }

    public void j(RecyclerView.C c4) {
        View view = c4.f5707a;
        view.animate().cancel();
        int size = this.f5895j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((j) this.f5895j.get(size)).f5938a == c4) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(c4);
                this.f5895j.remove(size);
            }
        }
        W(this.f5896k, c4);
        if (this.f5893h.remove(c4)) {
            view.setAlpha(1.0f);
            G(c4);
        }
        if (this.f5894i.remove(c4)) {
            view.setAlpha(1.0f);
            A(c4);
        }
        for (int size2 = this.f5899n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f5899n.get(size2);
            W(arrayList, c4);
            if (arrayList.isEmpty()) {
                this.f5899n.remove(size2);
            }
        }
        for (int size3 = this.f5898m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f5898m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).f5938a == c4) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(c4);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f5898m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f5897l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f5897l.get(size5);
            if (arrayList3.remove(c4)) {
                view.setAlpha(1.0f);
                A(c4);
                if (arrayList3.isEmpty()) {
                    this.f5897l.remove(size5);
                }
            }
        }
        this.f5902q.remove(c4);
        this.f5900o.remove(c4);
        this.f5903r.remove(c4);
        this.f5901p.remove(c4);
        V();
    }

    public void k() {
        int size = this.f5895j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f5895j.get(size);
            View view = jVar.f5938a.f5707a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f5938a);
            this.f5895j.remove(size);
        }
        for (int size2 = this.f5893h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.C) this.f5893h.get(size2));
            this.f5893h.remove(size2);
        }
        int size3 = this.f5894i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C c4 = (RecyclerView.C) this.f5894i.get(size3);
            c4.f5707a.setAlpha(1.0f);
            A(c4);
            this.f5894i.remove(size3);
        }
        for (int size4 = this.f5896k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f5896k.get(size4));
        }
        this.f5896k.clear();
        if (p()) {
            for (int size5 = this.f5898m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f5898m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f5938a.f5707a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f5938a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f5898m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f5897l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f5897l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C c5 = (RecyclerView.C) arrayList2.get(size8);
                    c5.f5707a.setAlpha(1.0f);
                    A(c5);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f5897l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f5899n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f5899n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f5899n.remove(arrayList3);
                    }
                }
            }
            U(this.f5902q);
            U(this.f5901p);
            U(this.f5900o);
            U(this.f5903r);
            i();
        }
    }

    public boolean p() {
        return !this.f5894i.isEmpty() || !this.f5896k.isEmpty() || !this.f5895j.isEmpty() || !this.f5893h.isEmpty() || !this.f5901p.isEmpty() || !this.f5902q.isEmpty() || !this.f5900o.isEmpty() || !this.f5903r.isEmpty() || !this.f5898m.isEmpty() || !this.f5897l.isEmpty() || !this.f5899n.isEmpty();
    }

    public void u() {
        boolean isEmpty = this.f5893h.isEmpty();
        boolean isEmpty2 = this.f5895j.isEmpty();
        boolean isEmpty3 = this.f5896k.isEmpty();
        boolean isEmpty4 = this.f5894i.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            Iterator it = this.f5893h.iterator();
            while (it.hasNext()) {
                T((RecyclerView.C) it.next());
            }
            this.f5893h.clear();
            if (!isEmpty2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f5895j);
                this.f5898m.add(arrayList);
                this.f5895j.clear();
                a aVar = new a(arrayList);
                if (!isEmpty) {
                    C.Z(((j) arrayList.get(0)).f5938a.f5707a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (!isEmpty3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f5896k);
                this.f5899n.add(arrayList2);
                this.f5896k.clear();
                b bVar = new b(arrayList2);
                if (!isEmpty) {
                    C.Z(((i) arrayList2.get(0)).f5932a.f5707a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (!isEmpty4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f5894i);
                this.f5897l.add(arrayList3);
                this.f5894i.clear();
                C0100c cVar = new C0100c(arrayList3);
                if (!isEmpty || !isEmpty2 || !isEmpty3) {
                    long j4 = 0;
                    long o4 = !isEmpty ? o() : 0;
                    long n4 = !isEmpty2 ? n() : 0;
                    if (!isEmpty3) {
                        j4 = m();
                    }
                    C.Z(((RecyclerView.C) arrayList3.get(0)).f5707a, cVar, o4 + Math.max(n4, j4));
                    return;
                }
                cVar.run();
            }
        }
    }

    public boolean w(RecyclerView.C c4) {
        Z(c4);
        c4.f5707a.setAlpha(0.0f);
        this.f5894i.add(c4);
        return true;
    }

    public boolean x(RecyclerView.C c4, RecyclerView.C c5, int i4, int i5, int i6, int i7) {
        if (c4 == c5) {
            return y(c4, i4, i5, i6, i7);
        }
        float translationX = c4.f5707a.getTranslationX();
        float translationY = c4.f5707a.getTranslationY();
        float alpha = c4.f5707a.getAlpha();
        Z(c4);
        int i8 = (int) (((float) (i6 - i4)) - translationX);
        int i9 = (int) (((float) (i7 - i5)) - translationY);
        c4.f5707a.setTranslationX(translationX);
        c4.f5707a.setTranslationY(translationY);
        c4.f5707a.setAlpha(alpha);
        if (c5 != null) {
            Z(c5);
            c5.f5707a.setTranslationX((float) (-i8));
            c5.f5707a.setTranslationY((float) (-i9));
            c5.f5707a.setAlpha(0.0f);
        }
        this.f5896k.add(new i(c4, c5, i4, i5, i6, i7));
        return true;
    }

    public boolean y(RecyclerView.C c4, int i4, int i5, int i6, int i7) {
        View view = c4.f5707a;
        int translationX = i4 + ((int) view.getTranslationX());
        int translationY = i5 + ((int) c4.f5707a.getTranslationY());
        Z(c4);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            E(c4);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX((float) (-i8));
        }
        if (i9 != 0) {
            view.setTranslationY((float) (-i9));
        }
        this.f5895j.add(new j(c4, translationX, translationY, i6, i7));
        return true;
    }

    public boolean z(RecyclerView.C c4) {
        Z(c4);
        this.f5893h.add(c4);
        return true;
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.C f5932a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.C f5933b;

        /* renamed from: c  reason: collision with root package name */
        public int f5934c;

        /* renamed from: d  reason: collision with root package name */
        public int f5935d;

        /* renamed from: e  reason: collision with root package name */
        public int f5936e;

        /* renamed from: f  reason: collision with root package name */
        public int f5937f;

        public i(RecyclerView.C c4, RecyclerView.C c5) {
            this.f5932a = c4;
            this.f5933b = c5;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f5932a + ", newHolder=" + this.f5933b + ", fromX=" + this.f5934c + ", fromY=" + this.f5935d + ", toX=" + this.f5936e + ", toY=" + this.f5937f + '}';
        }

        public i(RecyclerView.C c4, RecyclerView.C c5, int i4, int i5, int i6, int i7) {
            this(c4, c5);
            this.f5934c = i4;
            this.f5935d = i5;
            this.f5936e = i6;
            this.f5937f = i7;
        }
    }
}
