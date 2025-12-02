package p;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: p.b  reason: case insensitive filesystem */
public class C0835b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f11503a;

    public C0835b(ActionBarContainer actionBarContainer) {
        this.f11503a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f11503a;
        if (actionBarContainer.f4368j) {
            Drawable drawable = actionBarContainer.f4367i;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f4365g;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f11503a;
        Drawable drawable3 = actionBarContainer2.f4366h;
        if (drawable3 != null && actionBarContainer2.f4369k) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f11503a;
        if (actionBarContainer.f4368j) {
            Drawable drawable = actionBarContainer.f4367i;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f4365g;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    public void setAlpha(int i4) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
