package i2;

import I.b;
import V1.j;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f10264a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f10265b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f10266c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f10267d;

    /* renamed from: e  reason: collision with root package name */
    public final String f10268e;

    /* renamed from: f  reason: collision with root package name */
    public final int f10269f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10270g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f10271h;

    /* renamed from: i  reason: collision with root package name */
    public final float f10272i;

    /* renamed from: j  reason: collision with root package name */
    public final float f10273j;

    /* renamed from: k  reason: collision with root package name */
    public final float f10274k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f10275l;

    /* renamed from: m  reason: collision with root package name */
    public final float f10276m;

    /* renamed from: n  reason: collision with root package name */
    public float f10277n;

    /* renamed from: o  reason: collision with root package name */
    public final int f10278o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10279p = false;

    /* renamed from: q  reason: collision with root package name */
    public Typeface f10280q;

    public class a extends b.C0023b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f10281a;

        public a(f fVar) {
            this.f10281a = fVar;
        }

        public void h(int i4) {
            boolean unused = d.this.f10279p = true;
            this.f10281a.a(i4);
        }

        public void i(Typeface typeface) {
            d dVar = d.this;
            Typeface unused = dVar.f10280q = Typeface.create(typeface, dVar.f10269f);
            boolean unused2 = d.this.f10279p = true;
            this.f10281a.b(d.this.f10280q, false);
        }
    }

    public class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextPaint f10283a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f f10284b;

        public b(TextPaint textPaint, f fVar) {
            this.f10283a = textPaint;
            this.f10284b = fVar;
        }

        public void a(int i4) {
            this.f10284b.a(i4);
        }

        public void b(Typeface typeface, boolean z4) {
            d.this.l(this.f10283a, typeface);
            this.f10284b.b(typeface, z4);
        }
    }

    public d(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, j.b4);
        this.f10277n = obtainStyledAttributes.getDimension(j.c4, 0.0f);
        this.f10264a = c.a(context, obtainStyledAttributes, j.f4);
        this.f10265b = c.a(context, obtainStyledAttributes, j.g4);
        this.f10266c = c.a(context, obtainStyledAttributes, j.h4);
        this.f10269f = obtainStyledAttributes.getInt(j.e4, 0);
        this.f10270g = obtainStyledAttributes.getInt(j.d4, 1);
        int e4 = c.e(obtainStyledAttributes, j.n4, j.m4);
        this.f10278o = obtainStyledAttributes.getResourceId(e4, 0);
        this.f10268e = obtainStyledAttributes.getString(e4);
        this.f10271h = obtainStyledAttributes.getBoolean(j.o4, false);
        this.f10267d = c.a(context, obtainStyledAttributes, j.i4);
        this.f10272i = obtainStyledAttributes.getFloat(j.j4, 0.0f);
        this.f10273j = obtainStyledAttributes.getFloat(j.k4, 0.0f);
        this.f10274k = obtainStyledAttributes.getFloat(j.l4, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i4, j.f3198M2);
        this.f10275l = obtainStyledAttributes2.hasValue(j.f3203N2);
        this.f10276m = obtainStyledAttributes2.getFloat(j.f3203N2, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void d() {
        String str;
        if (this.f10280q == null && (str = this.f10268e) != null) {
            this.f10280q = Typeface.create(str, this.f10269f);
        }
        if (this.f10280q == null) {
            int i4 = this.f10270g;
            if (i4 == 1) {
                this.f10280q = Typeface.SANS_SERIF;
            } else if (i4 == 2) {
                this.f10280q = Typeface.SERIF;
            } else if (i4 != 3) {
                this.f10280q = Typeface.DEFAULT;
            } else {
                this.f10280q = Typeface.MONOSPACE;
            }
            this.f10280q = Typeface.create(this.f10280q, this.f10269f);
        }
    }

    public Typeface e() {
        d();
        return this.f10280q;
    }

    public Typeface f(Context context) {
        if (this.f10279p) {
            return this.f10280q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b4 = I.b.b(context, this.f10278o);
                this.f10280q = b4;
                if (b4 != null) {
                    this.f10280q = Typeface.create(b4, this.f10269f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e4) {
                Log.d("TextAppearance", "Error loading font " + this.f10268e, e4);
            }
        }
        d();
        this.f10279p = true;
        return this.f10280q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        l(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (i(context)) {
            f(context);
        } else {
            d();
        }
        int i4 = this.f10278o;
        if (i4 == 0) {
            this.f10279p = true;
        }
        if (this.f10279p) {
            fVar.b(this.f10280q, true);
            return;
        }
        try {
            I.b.d(context, i4, new a(fVar), (Handler) null);
        } catch (Resources.NotFoundException unused) {
            this.f10279p = true;
            fVar.a(1);
        } catch (Exception e4) {
            Log.d("TextAppearance", "Error loading font " + this.f10268e, e4);
            this.f10279p = true;
            fVar.a(-3);
        }
    }

    public final boolean i(Context context) {
        return e.a();
    }

    public void j(Context context, TextPaint textPaint, f fVar) {
        k(context, textPaint, fVar);
        ColorStateList colorStateList = this.f10264a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f4 = this.f10274k;
        float f5 = this.f10272i;
        float f6 = this.f10273j;
        ColorStateList colorStateList2 = this.f10267d;
        textPaint.setShadowLayer(f4, f5, f6, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void k(Context context, TextPaint textPaint, f fVar) {
        if (i(context)) {
            l(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i4 = (~typeface.getStyle()) & this.f10269f;
        textPaint.setFakeBoldText((i4 & 1) != 0);
        textPaint.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f10277n);
        if (this.f10275l) {
            textPaint.setLetterSpacing(this.f10276m);
        }
    }
}
