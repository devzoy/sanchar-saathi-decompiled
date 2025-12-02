package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

public class e0 extends W {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f11533b;

    public e0(Context context, Resources resources) {
        super(resources);
        this.f11533b = new WeakReference(context);
    }

    public Drawable getDrawable(int i4) {
        Drawable drawable = super.getDrawable(i4);
        Context context = (Context) this.f11533b.get();
        if (!(drawable == null || context == null)) {
            V.g().w(context, i4, drawable);
        }
        return drawable;
    }
}
