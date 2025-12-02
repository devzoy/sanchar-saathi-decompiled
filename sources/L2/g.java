package l2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import b2.C0393a;
import e2.C0592a;
import java.util.BitSet;
import k2.C0770a;
import l2.k;
import l2.l;
import l2.m;

public class g extends Drawable implements n {

    /* renamed from: y  reason: collision with root package name */
    public static final String f11003y = "g";

    /* renamed from: z  reason: collision with root package name */
    public static final Paint f11004z = new Paint(1);

    /* renamed from: c  reason: collision with root package name */
    public c f11005c;

    /* renamed from: d  reason: collision with root package name */
    public final m.g[] f11006d;

    /* renamed from: e  reason: collision with root package name */
    public final m.g[] f11007e;

    /* renamed from: f  reason: collision with root package name */
    public final BitSet f11008f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11009g;

    /* renamed from: h  reason: collision with root package name */
    public final Matrix f11010h;

    /* renamed from: i  reason: collision with root package name */
    public final Path f11011i;

    /* renamed from: j  reason: collision with root package name */
    public final Path f11012j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f11013k;

    /* renamed from: l  reason: collision with root package name */
    public final RectF f11014l;

    /* renamed from: m  reason: collision with root package name */
    public final Region f11015m;

    /* renamed from: n  reason: collision with root package name */
    public final Region f11016n;

    /* renamed from: o  reason: collision with root package name */
    public k f11017o;

    /* renamed from: p  reason: collision with root package name */
    public final Paint f11018p;

    /* renamed from: q  reason: collision with root package name */
    public final Paint f11019q;

    /* renamed from: r  reason: collision with root package name */
    public final C0770a f11020r;

    /* renamed from: s  reason: collision with root package name */
    public final l.b f11021s;

    /* renamed from: t  reason: collision with root package name */
    public final l f11022t;

    /* renamed from: u  reason: collision with root package name */
    public PorterDuffColorFilter f11023u;

    /* renamed from: v  reason: collision with root package name */
    public PorterDuffColorFilter f11024v;

    /* renamed from: w  reason: collision with root package name */
    public final RectF f11025w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f11026x;

    public class a implements l.b {
        public a() {
        }

        public void a(m mVar, Matrix matrix, int i4) {
            g.this.f11008f.set(i4 + 4, mVar.e());
            g.this.f11007e[i4] = mVar.f(matrix);
        }

        public void b(m mVar, Matrix matrix, int i4) {
            g.this.f11008f.set(i4, mVar.e());
            g.this.f11006d[i4] = mVar.f(matrix);
        }
    }

    public class b implements k.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f11028a;

        public b(float f4) {
            this.f11028a = f4;
        }

        public C0780c a(C0780c cVar) {
            return cVar instanceof i ? cVar : new C0779b(this.f11028a, cVar);
        }
    }

    public /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public static int P(int i4, int i5) {
        return (i4 * (i5 + (i5 >>> 7))) >>> 8;
    }

    public static g m(Context context, float f4) {
        int b4 = C0393a.b(context, V1.a.f2976k, g.class.getSimpleName());
        g gVar = new g();
        gVar.K(context);
        gVar.U(ColorStateList.valueOf(b4));
        gVar.T(f4);
        return gVar;
    }

    public int A() {
        c cVar = this.f11005c;
        return (int) (((double) cVar.f11048s) * Math.cos(Math.toRadians((double) cVar.f11049t)));
    }

    public k B() {
        return this.f11005c.f11030a;
    }

    public final float C() {
        if (J()) {
            return this.f11019q.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float D() {
        return this.f11005c.f11030a.r().a(u());
    }

    public float E() {
        return this.f11005c.f11030a.t().a(u());
    }

    public float F() {
        return this.f11005c.f11045p;
    }

    public float G() {
        return w() + F();
    }

    public final boolean H() {
        c cVar = this.f11005c;
        int i4 = cVar.f11046q;
        return i4 != 1 && cVar.f11047r > 0 && (i4 == 2 || R());
    }

    public final boolean I() {
        Paint.Style style = this.f11005c.f11051v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean J() {
        Paint.Style style = this.f11005c.f11051v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f11019q.getStrokeWidth() > 0.0f;
    }

    public void K(Context context) {
        this.f11005c.f11031b = new C0592a(context);
        e0();
    }

    public final void L() {
        super.invalidateSelf();
    }

    public boolean M() {
        C0592a aVar = this.f11005c.f11031b;
        return aVar != null && aVar.d();
    }

    public boolean N() {
        return this.f11005c.f11030a.u(u());
    }

    public final void O(Canvas canvas) {
        if (H()) {
            canvas.save();
            Q(canvas);
            if (!this.f11026x) {
                n(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f11025w.width() - ((float) getBounds().width()));
            int height = (int) (this.f11025w.height() - ((float) getBounds().height()));
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f11025w.width()) + (this.f11005c.f11047r * 2) + width, ((int) this.f11025w.height()) + (this.f11005c.f11047r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f4 = (float) ((getBounds().left - this.f11005c.f11047r) - width);
            float f5 = (float) ((getBounds().top - this.f11005c.f11047r) - height);
            canvas2.translate(-f4, -f5);
            n(canvas2);
            canvas.drawBitmap(createBitmap, f4, f5, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    public final void Q(Canvas canvas) {
        canvas.translate((float) z(), (float) A());
    }

    public boolean R() {
        return !N() && !this.f11011i.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    public void S(C0780c cVar) {
        setShapeAppearanceModel(this.f11005c.f11030a.x(cVar));
    }

    public void T(float f4) {
        c cVar = this.f11005c;
        if (cVar.f11044o != f4) {
            cVar.f11044o = f4;
            e0();
        }
    }

    public void U(ColorStateList colorStateList) {
        c cVar = this.f11005c;
        if (cVar.f11033d != colorStateList) {
            cVar.f11033d = colorStateList;
            onStateChange(getState());
        }
    }

    public void V(float f4) {
        c cVar = this.f11005c;
        if (cVar.f11040k != f4) {
            cVar.f11040k = f4;
            this.f11009g = true;
            invalidateSelf();
        }
    }

    public void W(int i4, int i5, int i6, int i7) {
        c cVar = this.f11005c;
        if (cVar.f11038i == null) {
            cVar.f11038i = new Rect();
        }
        this.f11005c.f11038i.set(i4, i5, i6, i7);
        invalidateSelf();
    }

    public void X(float f4) {
        c cVar = this.f11005c;
        if (cVar.f11043n != f4) {
            cVar.f11043n = f4;
            e0();
        }
    }

    public void Y(float f4, int i4) {
        b0(f4);
        a0(ColorStateList.valueOf(i4));
    }

    public void Z(float f4, ColorStateList colorStateList) {
        b0(f4);
        a0(colorStateList);
    }

    public void a0(ColorStateList colorStateList) {
        c cVar = this.f11005c;
        if (cVar.f11034e != colorStateList) {
            cVar.f11034e = colorStateList;
            onStateChange(getState());
        }
    }

    public void b0(float f4) {
        this.f11005c.f11041l = f4;
        invalidateSelf();
    }

    public final boolean c0(int[] iArr) {
        boolean z4;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f11005c.f11033d == null || (color2 = this.f11018p.getColor()) == (colorForState2 = this.f11005c.f11033d.getColorForState(iArr, color2))) {
            z4 = false;
        } else {
            this.f11018p.setColor(colorForState2);
            z4 = true;
        }
        if (this.f11005c.f11034e == null || (color = this.f11019q.getColor()) == (colorForState = this.f11005c.f11034e.getColorForState(iArr, color))) {
            return z4;
        }
        this.f11019q.setColor(colorForState);
        return true;
    }

    public final boolean d0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f11023u;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f11024v;
        c cVar = this.f11005c;
        this.f11023u = k(cVar.f11036g, cVar.f11037h, this.f11018p, true);
        c cVar2 = this.f11005c;
        this.f11024v = k(cVar2.f11035f, cVar2.f11037h, this.f11019q, false);
        c cVar3 = this.f11005c;
        if (cVar3.f11050u) {
            this.f11020r.d(cVar3.f11036g.getColorForState(getState(), 0));
        }
        return !R.c.a(porterDuffColorFilter, this.f11023u) || !R.c.a(porterDuffColorFilter2, this.f11024v);
    }

    public void draw(Canvas canvas) {
        this.f11018p.setColorFilter(this.f11023u);
        int alpha = this.f11018p.getAlpha();
        this.f11018p.setAlpha(P(alpha, this.f11005c.f11042m));
        this.f11019q.setColorFilter(this.f11024v);
        this.f11019q.setStrokeWidth(this.f11005c.f11041l);
        int alpha2 = this.f11019q.getAlpha();
        this.f11019q.setAlpha(P(alpha2, this.f11005c.f11042m));
        if (this.f11009g) {
            i();
            g(u(), this.f11011i);
            this.f11009g = false;
        }
        O(canvas);
        if (I()) {
            o(canvas);
        }
        if (J()) {
            r(canvas);
        }
        this.f11018p.setAlpha(alpha);
        this.f11019q.setAlpha(alpha2);
    }

    public final void e0() {
        float G4 = G();
        this.f11005c.f11047r = (int) Math.ceil((double) (0.75f * G4));
        this.f11005c.f11048s = (int) Math.ceil((double) (G4 * 0.25f));
        d0();
        L();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r2 = r2.getColor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.PorterDuffColorFilter f(android.graphics.Paint r2, boolean r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L_0x0014
            int r2 = r2.getColor()
            int r3 = r1.l(r2)
            if (r3 == r2) goto L_0x0014
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r2.<init>(r3, r0)
            return r2
        L_0x0014:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.g.f(android.graphics.Paint, boolean):android.graphics.PorterDuffColorFilter");
    }

    public final void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f11005c.f11039j != 1.0f) {
            this.f11010h.reset();
            Matrix matrix = this.f11010h;
            float f4 = this.f11005c.f11039j;
            matrix.setScale(f4, f4, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f11010h);
        }
        path.computeBounds(this.f11025w, true);
    }

    public Drawable.ConstantState getConstantState() {
        return this.f11005c;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        if (this.f11005c.f11046q != 2) {
            if (N()) {
                outline.setRoundRect(getBounds(), D() * this.f11005c.f11040k);
                return;
            }
            g(u(), this.f11011i);
            if (this.f11011i.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f11011i);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f11005c.f11038i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f11015m.set(getBounds());
        g(u(), this.f11011i);
        this.f11016n.setPath(this.f11011i, this.f11015m);
        this.f11015m.op(this.f11016n, Region.Op.DIFFERENCE);
        return this.f11015m;
    }

    public final void h(RectF rectF, Path path) {
        l lVar = this.f11022t;
        c cVar = this.f11005c;
        k kVar = cVar.f11030a;
        float f4 = cVar.f11040k;
        lVar.e(kVar, f4, rectF, this.f11021s, path);
    }

    public final void i() {
        k y4 = B().y(new b(-C()));
        this.f11017o = y4;
        this.f11022t.d(y4, this.f11005c.f11040k, v(), this.f11012j);
    }

    public void invalidateSelf() {
        this.f11009g = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f11005c.f11034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f11005c.f11033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f11005c.f11036g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f11005c.f11035f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            l2.g$c r0 = r1.f11005c
            android.content.res.ColorStateList r0 = r0.f11036g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            l2.g$c r0 = r1.f11005c
            android.content.res.ColorStateList r0 = r0.f11035f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            l2.g$c r0 = r1.f11005c
            android.content.res.ColorStateList r0 = r0.f11034e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            l2.g$c r0 = r1.f11005c
            android.content.res.ColorStateList r0 = r0.f11033d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.g.isStateful():boolean");
    }

    public final PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z4) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z4) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z4) {
        return (colorStateList == null || mode == null) ? f(paint, z4) : j(colorStateList, mode, z4);
    }

    public int l(int i4) {
        float G4 = G() + y();
        C0592a aVar = this.f11005c.f11031b;
        return aVar != null ? aVar.c(i4, G4) : i4;
    }

    public Drawable mutate() {
        this.f11005c = new c(this.f11005c);
        return this;
    }

    public final void n(Canvas canvas) {
        if (this.f11008f.cardinality() > 0) {
            Log.w(f11003y, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f11005c.f11048s != 0) {
            canvas.drawPath(this.f11011i, this.f11020r.c());
        }
        for (int i4 = 0; i4 < 4; i4++) {
            this.f11006d[i4].b(this.f11020r, this.f11005c.f11047r, canvas);
            this.f11007e[i4].b(this.f11020r, this.f11005c.f11047r, canvas);
        }
        if (this.f11026x) {
            int z4 = z();
            int A4 = A();
            canvas.translate((float) (-z4), (float) (-A4));
            canvas.drawPath(this.f11011i, f11004z);
            canvas.translate((float) z4, (float) A4);
        }
    }

    public final void o(Canvas canvas) {
        q(canvas, this.f11018p, this.f11011i, this.f11005c.f11030a, u());
    }

    public void onBoundsChange(Rect rect) {
        this.f11009g = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z4 = c0(iArr) || d0();
        if (z4) {
            invalidateSelf();
        }
        return z4;
    }

    public void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f11005c.f11030a, rectF);
    }

    public final void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a4 = kVar.t().a(rectF) * this.f11005c.f11040k;
            canvas.drawRoundRect(rectF, a4, a4, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final void r(Canvas canvas) {
        q(canvas, this.f11019q, this.f11012j, this.f11017o, v());
    }

    public float s() {
        return this.f11005c.f11030a.j().a(u());
    }

    public void setAlpha(int i4) {
        c cVar = this.f11005c;
        if (cVar.f11042m != i4) {
            cVar.f11042m = i4;
            L();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11005c.f11032c = colorFilter;
        L();
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f11005c.f11030a = kVar;
        invalidateSelf();
    }

    public void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f11005c.f11036g = colorStateList;
        d0();
        L();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f11005c;
        if (cVar.f11037h != mode) {
            cVar.f11037h = mode;
            d0();
            L();
        }
    }

    public float t() {
        return this.f11005c.f11030a.l().a(u());
    }

    public RectF u() {
        this.f11013k.set(getBounds());
        return this.f11013k;
    }

    public final RectF v() {
        this.f11014l.set(u());
        float C4 = C();
        this.f11014l.inset(C4, C4);
        return this.f11014l;
    }

    public float w() {
        return this.f11005c.f11044o;
    }

    public ColorStateList x() {
        return this.f11005c.f11033d;
    }

    public float y() {
        return this.f11005c.f11043n;
    }

    public int z() {
        c cVar = this.f11005c;
        return (int) (((double) cVar.f11048s) * Math.sin(Math.toRadians((double) cVar.f11049t)));
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i4, int i5) {
        this(k.e(context, attributeSet, i4, i5).m());
    }

    public g(k kVar) {
        this(new c(kVar, (C0592a) null));
    }

    public g(c cVar) {
        this.f11006d = new m.g[4];
        this.f11007e = new m.g[4];
        this.f11008f = new BitSet(8);
        this.f11010h = new Matrix();
        this.f11011i = new Path();
        this.f11012j = new Path();
        this.f11013k = new RectF();
        this.f11014l = new RectF();
        this.f11015m = new Region();
        this.f11016n = new Region();
        Paint paint = new Paint(1);
        this.f11018p = paint;
        Paint paint2 = new Paint(1);
        this.f11019q = paint2;
        this.f11020r = new C0770a();
        this.f11022t = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.f11025w = new RectF();
        this.f11026x = true;
        this.f11005c = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f11004z;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        d0();
        c0(getState());
        this.f11021s = new a();
    }

    public static final class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public k f11030a;

        /* renamed from: b  reason: collision with root package name */
        public C0592a f11031b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f11032c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f11033d = null;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f11034e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f11035f = null;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f11036g = null;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f11037h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i  reason: collision with root package name */
        public Rect f11038i = null;

        /* renamed from: j  reason: collision with root package name */
        public float f11039j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f11040k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f11041l;

        /* renamed from: m  reason: collision with root package name */
        public int f11042m = 255;

        /* renamed from: n  reason: collision with root package name */
        public float f11043n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public float f11044o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public float f11045p = 0.0f;

        /* renamed from: q  reason: collision with root package name */
        public int f11046q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f11047r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f11048s = 0;

        /* renamed from: t  reason: collision with root package name */
        public int f11049t = 0;

        /* renamed from: u  reason: collision with root package name */
        public boolean f11050u = false;

        /* renamed from: v  reason: collision with root package name */
        public Paint.Style f11051v = Paint.Style.FILL_AND_STROKE;

        public c(k kVar, C0592a aVar) {
            this.f11030a = kVar;
            this.f11031b = aVar;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            g gVar = new g(this, (a) null);
            boolean unused = gVar.f11009g = true;
            return gVar;
        }

        public c(c cVar) {
            this.f11030a = cVar.f11030a;
            this.f11031b = cVar.f11031b;
            this.f11041l = cVar.f11041l;
            this.f11032c = cVar.f11032c;
            this.f11033d = cVar.f11033d;
            this.f11034e = cVar.f11034e;
            this.f11037h = cVar.f11037h;
            this.f11036g = cVar.f11036g;
            this.f11042m = cVar.f11042m;
            this.f11039j = cVar.f11039j;
            this.f11048s = cVar.f11048s;
            this.f11046q = cVar.f11046q;
            this.f11050u = cVar.f11050u;
            this.f11040k = cVar.f11040k;
            this.f11043n = cVar.f11043n;
            this.f11044o = cVar.f11044o;
            this.f11045p = cVar.f11045p;
            this.f11047r = cVar.f11047r;
            this.f11049t = cVar.f11049t;
            this.f11035f = cVar.f11035f;
            this.f11051v = cVar.f11051v;
            if (cVar.f11038i != null) {
                this.f11038i = new Rect(cVar.f11038i);
            }
        }
    }
}
