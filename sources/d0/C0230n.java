package D0;

import S.C;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import v.C0944a;

/* renamed from: D0.n  reason: case insensitive filesystem */
public abstract class C0230n {

    /* renamed from: a  reason: collision with root package name */
    public static C0228l f696a = new C0218b();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal f697b = new ThreadLocal();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList f698c = new ArrayList();

    /* renamed from: D0.n$a */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: c  reason: collision with root package name */
        public C0228l f699c;

        /* renamed from: d  reason: collision with root package name */
        public ViewGroup f700d;

        /* renamed from: D0.n$a$a  reason: collision with other inner class name */
        public class C0005a extends C0229m {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ C0944a f701a;

            public C0005a(C0944a aVar) {
                this.f701a = aVar;
            }

            public void d(C0228l lVar) {
                ((ArrayList) this.f701a.get(a.this.f700d)).remove(lVar);
                lVar.U(this);
            }
        }

        public a(C0228l lVar, ViewGroup viewGroup) {
            this.f699c = lVar;
            this.f700d = viewGroup;
        }

        public final void a() {
            this.f700d.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f700d.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            a();
            if (!C0230n.f698c.remove(this.f700d)) {
                return true;
            }
            C0944a b4 = C0230n.b();
            ArrayList arrayList = (ArrayList) b4.get(this.f700d);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                b4.put(this.f700d, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f699c);
            this.f699c.a(new C0005a(b4));
            this.f699c.p(this.f700d, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C0228l) it.next()).W(this.f700d);
                }
            }
            this.f699c.T(this.f700d);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            a();
            C0230n.f698c.remove(this.f700d);
            ArrayList arrayList = (ArrayList) C0230n.b().get(this.f700d);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C0228l) it.next()).W(this.f700d);
                }
            }
            this.f699c.q(true);
        }
    }

    public static void a(ViewGroup viewGroup, C0228l lVar) {
        if (!f698c.contains(viewGroup) && C.M(viewGroup)) {
            f698c.add(viewGroup);
            if (lVar == null) {
                lVar = f696a;
            }
            C0228l r4 = lVar.clone();
            d(viewGroup, r4);
            C0227k.b(viewGroup, (C0227k) null);
            c(viewGroup, r4);
        }
    }

    public static C0944a b() {
        C0944a aVar;
        WeakReference weakReference = (WeakReference) f697b.get();
        if (weakReference != null && (aVar = (C0944a) weakReference.get()) != null) {
            return aVar;
        }
        C0944a aVar2 = new C0944a();
        f697b.set(new WeakReference(aVar2));
        return aVar2;
    }

    public static void c(ViewGroup viewGroup, C0228l lVar) {
        if (lVar != null && viewGroup != null) {
            a aVar = new a(lVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    public static void d(ViewGroup viewGroup, C0228l lVar) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C0228l) it.next()).S(viewGroup);
            }
        }
        if (lVar != null) {
            lVar.p(viewGroup, true);
        }
        C0227k.a(viewGroup);
    }
}
