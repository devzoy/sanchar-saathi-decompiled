package com.amolg.flutterbarcodescanner.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.amolg.flutterbarcodescanner.BarcodeCaptureActivity;
import com.amolg.flutterbarcodescanner.b;
import com.amolg.flutterbarcodescanner.camera.GraphicOverlay.a;
import g1.C0635a;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class GraphicOverlay<T extends a> extends View {

    /* renamed from: c  reason: collision with root package name */
    public final Object f6574c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public float f6575d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f6576e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int f6577f = 0;

    /* renamed from: g  reason: collision with root package name */
    public Set f6578g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public float f6579h;

    /* renamed from: i  reason: collision with root package name */
    public float f6580i;

    /* renamed from: j  reason: collision with root package name */
    public float f6581j;

    /* renamed from: k  reason: collision with root package name */
    public int f6582k;

    /* renamed from: l  reason: collision with root package name */
    public int f6583l;

    /* renamed from: m  reason: collision with root package name */
    public int f6584m;

    /* renamed from: n  reason: collision with root package name */
    public int f6585n;

    /* renamed from: o  reason: collision with root package name */
    public int f6586o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f6587p;

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public GraphicOverlay f6588a;

        public a(GraphicOverlay graphicOverlay) {
            this.f6588a = graphicOverlay;
        }

        public void a() {
            this.f6588a.postInvalidate();
        }
    }

    public GraphicOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i4 = 350;
        this.f6582k = 350;
        this.f6583l = BarcodeCaptureActivity.f6512N != BarcodeCaptureActivity.e.QR.ordinal() ? 233 : i4;
        this.f6585n = Color.parseColor(b.f6550n);
        this.f6586o = 4;
        this.f6584m = 5;
    }

    public void a(a aVar) {
        synchronized (this.f6574c) {
            this.f6578g.add(aVar);
        }
        postInvalidate();
    }

    public void b() {
        synchronized (this.f6574c) {
            this.f6578g.clear();
        }
        postInvalidate();
    }

    public void c(a aVar) {
        synchronized (this.f6574c) {
            this.f6578g.remove(aVar);
        }
        postInvalidate();
    }

    public void d(int i4, int i5, int i6) {
        synchronized (this.f6574c) {
            this.f6577f = i6;
        }
        postInvalidate();
    }

    public List<T> getGraphics() {
        Vector vector;
        synchronized (this.f6574c) {
            vector = new Vector(this.f6578g);
        }
        return vector;
    }

    public float getHeightScaleFactor() {
        return this.f6576e;
    }

    public float getWidthScaleFactor() {
        return this.f6575d;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        float f4 = (float) 0;
        canvas.drawRoundRect(new RectF(this.f6579h, this.f6580i, ((float) C0635a.a(getContext(), this.f6582k)) + this.f6579h, ((float) C0635a.a(getContext(), this.f6583l)) + this.f6580i), f4, f4, paint);
        Paint paint2 = new Paint();
        paint2.setColor(this.f6585n);
        paint2.setStrokeWidth((float) this.f6586o);
        float f5 = this.f6581j;
        float a4 = this.f6580i + ((float) C0635a.a(getContext(), this.f6583l));
        int i4 = this.f6584m;
        if (f5 >= a4 + ((float) i4)) {
            this.f6587p = true;
        } else if (this.f6581j == this.f6580i + ((float) i4)) {
            this.f6587p = false;
        }
        if (this.f6587p) {
            this.f6581j -= (float) i4;
        } else {
            this.f6581j += (float) i4;
        }
        float f6 = this.f6579h;
        canvas.drawLine(f6, this.f6581j, f6 + ((float) C0635a.a(getContext(), this.f6582k)), this.f6581j, paint2);
        invalidate();
    }

    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        this.f6579h = (float) ((i4 - C0635a.a(getContext(), this.f6582k)) / 2);
        float a4 = (float) ((i5 - C0635a.a(getContext(), this.f6583l)) / 2);
        this.f6580i = a4;
        this.f6581j = a4;
        super.onSizeChanged(i4, i5, i6, i7);
    }
}
