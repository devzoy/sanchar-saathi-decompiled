package g3;

import K0.k;
import K0.l;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: g3.h  reason: case insensitive filesystem */
public abstract class C0644h {

    /* renamed from: g3.h$a */
    public interface a {
        void a(float f4, float f5, float f6);
    }

    /* renamed from: g3.h$b */
    public interface b {
        boolean a(View view);
    }

    public static void c(Context context, a aVar) {
        Activity e4 = e(context);
        if (e4 != null) {
            k a4 = l.b().a(e4);
            aVar.a((float) a4.a().width(), (float) a4.a().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean d(View view) {
        return i(view, new C0643g());
    }

    public static Activity e(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean f(View view, Class[] clsArr) {
        return i(view, new C0642f(clsArr));
    }

    public static /* synthetic */ boolean h(Class[] clsArr, View view) {
        for (Class isInstance : clsArr) {
            if (isInstance.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(View view, b bVar) {
        if (view == null) {
            return false;
        }
        if (bVar.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                if (i(viewGroup.getChildAt(i4), bVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
