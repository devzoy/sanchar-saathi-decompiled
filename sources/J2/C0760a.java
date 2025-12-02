package j2;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import l2.g;
import l2.k;
import l2.n;

/* renamed from: j2.a  reason: case insensitive filesystem */
public class C0760a extends Drawable implements n {

    /* renamed from: c  reason: collision with root package name */
    public b f10900c;

    /* renamed from: a */
    public C0760a mutate() {
        this.f10900c = new b(this.f10900c);
        return this;
    }

    public void draw(Canvas canvas) {
        b bVar = this.f10900c;
        if (bVar.f10902b) {
            bVar.f10901a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f10900c;
    }

    public int getOpacity() {
        return this.f10900c.f10901a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f10900c.f10901a.setBounds(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f10900c.f10901a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b4 = C0761b.b(iArr);
        b bVar = this.f10900c;
        if (bVar.f10902b == b4) {
            return onStateChange;
        }
        bVar.f10902b = b4;
        return true;
    }

    public void setAlpha(int i4) {
        this.f10900c.f10901a.setAlpha(i4);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f10900c.f10901a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f10900c.f10901a.setShapeAppearanceModel(kVar);
    }

    public void setTint(int i4) {
        this.f10900c.f10901a.setTint(i4);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f10900c.f10901a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f10900c.f10901a.setTintMode(mode);
    }

    public C0760a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* renamed from: j2.a$b */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public g f10901a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10902b;

        public b(g gVar) {
            this.f10901a = gVar;
            this.f10902b = false;
        }

        /* renamed from: a */
        public C0760a newDrawable() {
            return new C0760a(new b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f10901a = (g) bVar.f10901a.getConstantState().newDrawable();
            this.f10902b = bVar.f10902b;
        }
    }

    public C0760a(b bVar) {
        this.f10900c = bVar;
    }
}
