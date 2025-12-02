package p;

import K.b;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: p.q  reason: case insensitive filesystem */
public class C0850q {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f11576c = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final ProgressBar f11577a;

    /* renamed from: b  reason: collision with root package name */
    public Bitmap f11578b;

    public C0850q(ProgressBar progressBar) {
        this.f11577a = progressBar;
    }

    public final Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    public Bitmap b() {
        return this.f11578b;
    }

    public void c(AttributeSet attributeSet, int i4) {
        f0 v4 = f0.v(this.f11577a.getContext(), attributeSet, f11576c, i4, 0);
        Drawable h4 = v4.h(0);
        if (h4 != null) {
            this.f11577a.setIndeterminateDrawable(e(h4));
        }
        Drawable h5 = v4.h(1);
        if (h5 != null) {
            this.f11577a.setProgressDrawable(d(h5, false));
        }
        v4.w();
    }

    public final Drawable d(Drawable drawable, boolean z4) {
        if (drawable instanceof b) {
            b bVar = (b) drawable;
            Drawable b4 = bVar.b();
            if (b4 != null) {
                bVar.a(d(b4, z4));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i4 = 0; i4 < numberOfLayers; i4++) {
                int id = layerDrawable.getId(i4);
                drawableArr[i4] = d(layerDrawable.getDrawable(i4), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i5 = 0; i5 < numberOfLayers; i5++) {
                layerDrawable2.setId(i5, layerDrawable.getId(i5));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f11578b == null) {
                this.f11578b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z4 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    public final Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i4 = 0; i4 < numberOfFrames; i4++) {
            Drawable d4 = d(animationDrawable.getFrame(i4), true);
            d4.setLevel(10000);
            animationDrawable2.addFrame(d4, animationDrawable.getDuration(i4));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }
}
