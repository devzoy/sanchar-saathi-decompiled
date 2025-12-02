package g2;

import S.C;
import S.C0330v;
import S.O;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import net.sqlcipher.database.SQLiteDatabase;

public abstract class j {

    public static class a implements C0330v {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f9149a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f9150b;

        public a(c cVar, d dVar) {
            this.f9149a = cVar;
            this.f9150b = dVar;
        }

        public O a(View view, O o4) {
            return this.f9149a.a(view, o4, new d(this.f9150b));
        }
    }

    public static class b implements View.OnAttachStateChangeListener {
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C.d0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        O a(View view, O o4, d dVar);
    }

    public static void a(View view, c cVar) {
        C.t0(view, new a(cVar, new d(C.B(view), view.getPaddingTop(), C.A(view), view.getPaddingBottom())));
        f(view);
    }

    public static float b(Context context, int i4) {
        return TypedValue.applyDimension(1, (float) i4, context.getResources().getDisplayMetrics());
    }

    public static float c(View view) {
        float f4 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f4 += C.t((View) parent);
        }
        return f4;
    }

    public static boolean d(View view) {
        return C.x(view) == 1;
    }

    public static PorterDuff.Mode e(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void f(View view) {
        if (C.L(view)) {
            C.d0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int f9151a;

        /* renamed from: b  reason: collision with root package name */
        public int f9152b;

        /* renamed from: c  reason: collision with root package name */
        public int f9153c;

        /* renamed from: d  reason: collision with root package name */
        public int f9154d;

        public d(int i4, int i5, int i6, int i7) {
            this.f9151a = i4;
            this.f9152b = i5;
            this.f9153c = i6;
            this.f9154d = i7;
        }

        public d(d dVar) {
            this.f9151a = dVar.f9151a;
            this.f9152b = dVar.f9152b;
            this.f9153c = dVar.f9153c;
            this.f9154d = dVar.f9154d;
        }
    }
}
