package D0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

public class x implements y {

    /* renamed from: a  reason: collision with root package name */
    public final ViewOverlay f723a;

    public x(View view) {
        this.f723a = view.getOverlay();
    }

    public void b(Drawable drawable) {
        this.f723a.add(drawable);
    }

    public void d(Drawable drawable) {
        this.f723a.remove(drawable);
    }
}
