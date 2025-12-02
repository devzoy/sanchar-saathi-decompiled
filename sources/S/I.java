package S;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public abstract class I {

    public static class a {
        public static boolean a(ViewParent viewParent, View view, float f4, float f5, boolean z4) {
            return viewParent.onNestedFling(view, f4, f5, z4);
        }

        public static boolean b(ViewParent viewParent, View view, float f4, float f5) {
            return viewParent.onNestedPreFling(view, f4, f5);
        }

        public static void c(ViewParent viewParent, View view, int i4, int i5, int[] iArr) {
            viewParent.onNestedPreScroll(view, i4, i5, iArr);
        }

        public static void d(ViewParent viewParent, View view, int i4, int i5, int i6, int i7) {
            viewParent.onNestedScroll(view, i4, i5, i6, i7);
        }

        public static void e(ViewParent viewParent, View view, View view2, int i4) {
            viewParent.onNestedScrollAccepted(view, view2, i4);
        }

        public static boolean f(ViewParent viewParent, View view, View view2, int i4) {
            return viewParent.onStartNestedScroll(view, view2, i4);
        }

        public static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f4, float f5, boolean z4) {
        try {
            return a.a(viewParent, view, f4, f5, z4);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e4);
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f4, float f5) {
        try {
            return a.b(viewParent, view, f4, f5);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e4);
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i4, int i5, int[] iArr, int i6) {
        if (viewParent instanceof C0327s) {
            ((C0327s) viewParent).j(view, i4, i5, iArr, i6);
        } else if (i6 == 0) {
            try {
                a.c(viewParent, view, i4, i5, iArr);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e4);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof C0328t) {
            ((C0328t) viewParent2).m(view, i4, i5, i6, i7, i8, iArr);
            return;
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (viewParent2 instanceof C0327s) {
            ((C0327s) viewParent2).n(view, i4, i5, i6, i7, i8);
        } else if (i8 == 0) {
            try {
                a.d(viewParent, view, i4, i5, i6, i7);
            } catch (AbstractMethodError e4) {
                AbstractMethodError abstractMethodError = e4;
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i4, int i5) {
        if (viewParent instanceof C0327s) {
            ((C0327s) viewParent).a(view, view2, i4, i5);
        } else if (i5 == 0) {
            try {
                a.e(viewParent, view, view2, i4);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e4);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i4, int i5) {
        if (viewParent instanceof C0327s) {
            return ((C0327s) viewParent).o(view, view2, i4, i5);
        }
        if (i5 != 0) {
            return false;
        }
        try {
            return a.f(viewParent, view, view2, i4);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e4);
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i4) {
        if (viewParent instanceof C0327s) {
            ((C0327s) viewParent).i(view, i4);
        } else if (i4 == 0) {
            try {
                a.g(viewParent, view);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e4);
            }
        }
    }
}
