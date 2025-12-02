package l2;

import android.graphics.drawable.Drawable;
import android.view.View;
import g2.j;

public abstract class h {
    public static C0781d a(int i4) {
        return i4 != 0 ? i4 != 1 ? b() : new C0782e() : new j();
    }

    public static C0781d b() {
        return new j();
    }

    public static f c() {
        return new f();
    }

    public static void d(View view, float f4) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).T(f4);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.M()) {
            gVar.X(j.c(view));
        }
    }
}
