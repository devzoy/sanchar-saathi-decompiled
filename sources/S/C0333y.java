package S;

import android.os.Build;
import android.view.View;

/* renamed from: S.y  reason: case insensitive filesystem */
public final class C0333y {

    /* renamed from: a  reason: collision with root package name */
    public final c f2714a;

    /* renamed from: S.y$a */
    public static class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final View f2715a;

        public a(View view) {
            this.f2715a = view;
        }
    }

    /* renamed from: S.y$b */
    public static class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public View f2716b;

        public b(View view) {
            super(view);
            this.f2716b = view;
        }
    }

    /* renamed from: S.y$c */
    public static class c {
    }

    public C0333y(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2714a = new b(view);
        } else {
            this.f2714a = new a(view);
        }
    }
}
