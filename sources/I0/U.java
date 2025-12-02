package i0;

import S.C;
import S.C0332x;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class U {

    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f9973e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f9974f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ ArrayList f9975g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ ArrayList f9976h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ ArrayList f9977i;

        public a(int i4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f9973e = i4;
            this.f9974f = arrayList;
            this.f9975g = arrayList2;
            this.f9976h = arrayList3;
            this.f9977i = arrayList4;
        }

        public void run() {
            for (int i4 = 0; i4 < this.f9973e; i4++) {
                C.w0((View) this.f9974f.get(i4), (String) this.f9975g.get(i4));
                C.w0((View) this.f9976h.get(i4), (String) this.f9977i.get(i4));
            }
        }
    }

    public static void f(List list, View view) {
        int size = list.size();
        if (!i(list, view, size)) {
            if (C.E(view) != null) {
                list.add(view);
            }
            for (int i4 = size; i4 < list.size(); i4++) {
                View view2 = (View) list.get(i4);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = viewGroup.getChildAt(i5);
                        if (!i(list, childAt, size) && C.E(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static boolean i(List list, View view, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (list.get(i5) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public void c(Object obj) {
    }

    public void d(Object obj, Runnable runnable) {
    }

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract boolean g(Object obj);

    public abstract Object h(Object obj);

    public Object j(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public void k(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public boolean m() {
        if (!I.I0(4)) {
            return false;
        }
        Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    public boolean n(Object obj) {
        return false;
    }

    public abstract Object o(Object obj, Object obj2, Object obj3);

    public abstract Object p(Object obj, Object obj2, Object obj3);

    public ArrayList q(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            arrayList2.add(C.E(view));
            C.w0(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void r(Object obj, View view, ArrayList arrayList);

    public abstract void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public void t(Object obj, float f4) {
    }

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public abstract void w(C0695p pVar, Object obj, O.a aVar, Runnable runnable);

    public void x(C0695p pVar, Object obj, O.a aVar, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    public void y(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList.get(i4);
            String E4 = C.E(view2);
            arrayList4.add(E4);
            if (E4 != null) {
                C.w0(view2, (String) null);
                String str = (String) map.get(E4);
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i5))) {
                        C.w0((View) arrayList2.get(i5), E4);
                        break;
                    } else {
                        i5++;
                    }
                }
            }
        }
        C0332x.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList arrayList);
}
