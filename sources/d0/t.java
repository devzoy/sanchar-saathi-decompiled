package D0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

public class t implements u {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroupOverlay f721a;

    public t(ViewGroup viewGroup) {
        this.f721a = viewGroup.getOverlay();
    }

    public void a(View view) {
        this.f721a.add(view);
    }

    public void b(Drawable drawable) {
        this.f721a.add(drawable);
    }

    public void c(View view) {
        this.f721a.remove(view);
    }

    public void d(Drawable drawable) {
        this.f721a.remove(drawable);
    }
}
