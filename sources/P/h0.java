package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

public class h0 extends Resources {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f11548b = false;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f11549a;

    public h0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f11549a = new WeakReference(context);
    }

    public static boolean a() {
        return f11548b;
    }

    public static boolean b() {
        a();
        return false;
    }

    public final Drawable c(int i4) {
        return super.getDrawable(i4);
    }

    public Drawable getDrawable(int i4) {
        Context context = (Context) this.f11549a.get();
        return context != null ? V.g().s(context, this, i4) : super.getDrawable(i4);
    }
}
