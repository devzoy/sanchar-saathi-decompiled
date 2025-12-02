package g2;

import R.g;
import S.C;
import S.C0317h;
import W1.a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import i2.C0716a;
import i2.d;

/* renamed from: g2.a  reason: case insensitive filesystem */
public final class C0636a {

    /* renamed from: b0  reason: collision with root package name */
    public static final boolean f9062b0 = false;

    /* renamed from: c0  reason: collision with root package name */
    public static final Paint f9063c0 = null;

    /* renamed from: A  reason: collision with root package name */
    public boolean f9064A;

    /* renamed from: B  reason: collision with root package name */
    public Bitmap f9065B;

    /* renamed from: C  reason: collision with root package name */
    public Paint f9066C;

    /* renamed from: D  reason: collision with root package name */
    public float f9067D;

    /* renamed from: E  reason: collision with root package name */
    public float f9068E;

    /* renamed from: F  reason: collision with root package name */
    public int[] f9069F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f9070G;

    /* renamed from: H  reason: collision with root package name */
    public final TextPaint f9071H;

    /* renamed from: I  reason: collision with root package name */
    public final TextPaint f9072I;

    /* renamed from: J  reason: collision with root package name */
    public TimeInterpolator f9073J;

    /* renamed from: K  reason: collision with root package name */
    public TimeInterpolator f9074K;

    /* renamed from: L  reason: collision with root package name */
    public float f9075L;

    /* renamed from: M  reason: collision with root package name */
    public float f9076M;

    /* renamed from: N  reason: collision with root package name */
    public float f9077N;

    /* renamed from: O  reason: collision with root package name */
    public ColorStateList f9078O;

    /* renamed from: P  reason: collision with root package name */
    public float f9079P;

    /* renamed from: Q  reason: collision with root package name */
    public float f9080Q;

    /* renamed from: R  reason: collision with root package name */
    public float f9081R;

    /* renamed from: S  reason: collision with root package name */
    public ColorStateList f9082S;

    /* renamed from: T  reason: collision with root package name */
    public float f9083T;

    /* renamed from: U  reason: collision with root package name */
    public float f9084U;

    /* renamed from: V  reason: collision with root package name */
    public StaticLayout f9085V;

    /* renamed from: W  reason: collision with root package name */
    public float f9086W;

    /* renamed from: X  reason: collision with root package name */
    public float f9087X;

    /* renamed from: Y  reason: collision with root package name */
    public float f9088Y;

    /* renamed from: Z  reason: collision with root package name */
    public CharSequence f9089Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f9090a;

    /* renamed from: a0  reason: collision with root package name */
    public int f9091a0 = 1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9092b;

    /* renamed from: c  reason: collision with root package name */
    public float f9093c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f9094d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f9095e;

    /* renamed from: f  reason: collision with root package name */
    public final RectF f9096f;

    /* renamed from: g  reason: collision with root package name */
    public int f9097g = 16;

    /* renamed from: h  reason: collision with root package name */
    public int f9098h = 16;

    /* renamed from: i  reason: collision with root package name */
    public float f9099i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public float f9100j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f9101k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f9102l;

    /* renamed from: m  reason: collision with root package name */
    public float f9103m;

    /* renamed from: n  reason: collision with root package name */
    public float f9104n;

    /* renamed from: o  reason: collision with root package name */
    public float f9105o;

    /* renamed from: p  reason: collision with root package name */
    public float f9106p;

    /* renamed from: q  reason: collision with root package name */
    public float f9107q;

    /* renamed from: r  reason: collision with root package name */
    public float f9108r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f9109s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f9110t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f9111u;

    /* renamed from: v  reason: collision with root package name */
    public C0716a f9112v;

    /* renamed from: w  reason: collision with root package name */
    public C0716a f9113w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f9114x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f9115y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f9116z;

    /* renamed from: g2.a$a  reason: collision with other inner class name */
    public class C0164a implements C0716a.C0171a {
        public C0164a() {
        }

        public void a(Typeface typeface) {
            C0636a.this.M(typeface);
        }
    }

    public C0636a(View view) {
        this.f9090a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f9071H = textPaint;
        this.f9072I = new TextPaint(textPaint);
        this.f9095e = new Rect();
        this.f9094d = new Rect();
        this.f9096f = new RectF();
    }

    public static float C(float f4, float f5, float f6, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f6 = timeInterpolator.getInterpolation(f6);
        }
        return a.a(f4, f5, f6);
    }

    public static boolean F(Rect rect, int i4, int i5, int i6, int i7) {
        return rect.left == i4 && rect.top == i5 && rect.right == i6 && rect.bottom == i7;
    }

    public static int a(int i4, int i5, float f4) {
        float f5 = 1.0f - f4;
        return Color.argb((int) ((((float) Color.alpha(i4)) * f5) + (((float) Color.alpha(i5)) * f4)), (int) ((((float) Color.red(i4)) * f5) + (((float) Color.red(i5)) * f4)), (int) ((((float) Color.green(i4)) * f5) + (((float) Color.green(i5)) * f4)), (int) ((((float) Color.blue(i4)) * f5) + (((float) Color.blue(i5)) * f4)));
    }

    public static boolean z(float f4, float f5) {
        return Math.abs(f4 - f5) < 0.001f;
    }

    public final boolean A() {
        return C.x(this.f9090a) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f9101k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean B() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f9102l
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0014
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f9101k
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.C0636a.B():boolean");
    }

    public void D() {
        this.f9092b = this.f9095e.width() > 0 && this.f9095e.height() > 0 && this.f9094d.width() > 0 && this.f9094d.height() > 0;
    }

    public void E() {
        if (this.f9090a.getHeight() > 0 && this.f9090a.getWidth() > 0) {
            b();
            d();
        }
    }

    public void G(int i4, int i5, int i6, int i7) {
        if (!F(this.f9095e, i4, i5, i6, i7)) {
            this.f9095e.set(i4, i5, i6, i7);
            this.f9070G = true;
            D();
        }
    }

    public void H(Rect rect) {
        G(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void I(int i4) {
        d dVar = new d(this.f9090a.getContext(), i4);
        ColorStateList colorStateList = dVar.f10264a;
        if (colorStateList != null) {
            this.f9102l = colorStateList;
        }
        float f4 = dVar.f10277n;
        if (f4 != 0.0f) {
            this.f9100j = f4;
        }
        ColorStateList colorStateList2 = dVar.f10267d;
        if (colorStateList2 != null) {
            this.f9078O = colorStateList2;
        }
        this.f9076M = dVar.f10272i;
        this.f9077N = dVar.f10273j;
        this.f9075L = dVar.f10274k;
        this.f9083T = dVar.f10276m;
        C0716a aVar = this.f9113w;
        if (aVar != null) {
            aVar.c();
        }
        this.f9113w = new C0716a(new C0164a(), dVar.e());
        dVar.h(this.f9090a.getContext(), this.f9113w);
        E();
    }

    public final void J(float f4) {
        this.f9086W = f4;
        C.X(this.f9090a);
    }

    public void K(ColorStateList colorStateList) {
        if (this.f9102l != colorStateList) {
            this.f9102l = colorStateList;
            E();
        }
    }

    public void L(int i4) {
        if (this.f9098h != i4) {
            this.f9098h = i4;
            E();
        }
    }

    public void M(Typeface typeface) {
        if (N(typeface)) {
            E();
        }
    }

    public final boolean N(Typeface typeface) {
        C0716a aVar = this.f9113w;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f9109s == typeface) {
            return false;
        }
        this.f9109s = typeface;
        return true;
    }

    public void O(int i4, int i5, int i6, int i7) {
        if (!F(this.f9094d, i4, i5, i6, i7)) {
            this.f9094d.set(i4, i5, i6, i7);
            this.f9070G = true;
            D();
        }
    }

    public void P(Rect rect) {
        O(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void Q(float f4) {
        this.f9087X = f4;
        C.X(this.f9090a);
    }

    public void R(ColorStateList colorStateList) {
        if (this.f9101k != colorStateList) {
            this.f9101k = colorStateList;
            E();
        }
    }

    public void S(int i4) {
        if (this.f9097g != i4) {
            this.f9097g = i4;
            E();
        }
    }

    public void T(float f4) {
        if (this.f9099i != f4) {
            this.f9099i = f4;
            E();
        }
    }

    public final boolean U(Typeface typeface) {
        C0716a aVar = this.f9112v;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f9110t == typeface) {
            return false;
        }
        this.f9110t = typeface;
        return true;
    }

    public void V(float f4) {
        float a4 = M.a.a(f4, 0.0f, 1.0f);
        if (a4 != this.f9093c) {
            this.f9093c = a4;
            d();
        }
    }

    public final void W(float f4) {
        g(f4);
        boolean z4 = f9062b0 && this.f9067D != 1.0f;
        this.f9064A = z4;
        if (z4) {
            l();
        }
        C.X(this.f9090a);
    }

    public void X(TimeInterpolator timeInterpolator) {
        this.f9073J = timeInterpolator;
        E();
    }

    public final boolean Y(int[] iArr) {
        this.f9069F = iArr;
        if (!B()) {
            return false;
        }
        E();
        return true;
    }

    public void Z(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f9114x, charSequence)) {
            this.f9114x = charSequence;
            this.f9115y = null;
            h();
            E();
        }
    }

    public void a0(TimeInterpolator timeInterpolator) {
        this.f9074K = timeInterpolator;
        E();
    }

    public final void b() {
        StaticLayout staticLayout;
        float f4 = this.f9068E;
        g(this.f9100j);
        CharSequence charSequence = this.f9115y;
        if (!(charSequence == null || (staticLayout = this.f9085V) == null)) {
            this.f9089Z = TextUtils.ellipsize(charSequence, this.f9071H, (float) staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f9089Z;
        float f5 = 0.0f;
        float measureText = charSequence2 != null ? this.f9071H.measureText(charSequence2, 0, charSequence2.length()) : 0.0f;
        int b4 = C0317h.b(this.f9098h, this.f9116z ? 1 : 0);
        int i4 = b4 & 112;
        if (i4 == 48) {
            this.f9104n = (float) this.f9095e.top;
        } else if (i4 != 80) {
            this.f9104n = ((float) this.f9095e.centerY()) - ((this.f9071H.descent() - this.f9071H.ascent()) / 2.0f);
        } else {
            this.f9104n = ((float) this.f9095e.bottom) + this.f9071H.ascent();
        }
        int i5 = b4 & 8388615;
        if (i5 == 1) {
            this.f9106p = ((float) this.f9095e.centerX()) - (measureText / 2.0f);
        } else if (i5 != 5) {
            this.f9106p = (float) this.f9095e.left;
        } else {
            this.f9106p = ((float) this.f9095e.right) - measureText;
        }
        g(this.f9099i);
        StaticLayout staticLayout2 = this.f9085V;
        float height = staticLayout2 != null ? (float) staticLayout2.getHeight() : 0.0f;
        CharSequence charSequence3 = this.f9115y;
        float measureText2 = charSequence3 != null ? this.f9071H.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        StaticLayout staticLayout3 = this.f9085V;
        if (staticLayout3 != null && this.f9091a0 > 1 && !this.f9116z) {
            measureText2 = (float) staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f9085V;
        if (staticLayout4 != null) {
            f5 = staticLayout4.getLineLeft(0);
        }
        this.f9088Y = f5;
        int b5 = C0317h.b(this.f9097g, this.f9116z ? 1 : 0);
        int i6 = b5 & 112;
        if (i6 == 48) {
            this.f9103m = (float) this.f9094d.top;
        } else if (i6 != 80) {
            this.f9103m = ((float) this.f9094d.centerY()) - (height / 2.0f);
        } else {
            this.f9103m = (((float) this.f9094d.bottom) - height) + this.f9071H.descent();
        }
        int i7 = b5 & 8388615;
        if (i7 == 1) {
            this.f9105o = ((float) this.f9094d.centerX()) - (measureText2 / 2.0f);
        } else if (i7 != 5) {
            this.f9105o = (float) this.f9094d.left;
        } else {
            this.f9105o = ((float) this.f9094d.right) - measureText2;
        }
        h();
        W(f4);
    }

    public void b0(Typeface typeface) {
        boolean N4 = N(typeface);
        boolean U3 = U(typeface);
        if (N4 || U3) {
            E();
        }
    }

    public float c() {
        if (this.f9114x == null) {
            return 0.0f;
        }
        w(this.f9072I);
        TextPaint textPaint = this.f9072I;
        CharSequence charSequence = this.f9114x;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final boolean c0() {
        return this.f9091a0 > 1 && !this.f9116z && !this.f9064A;
    }

    public final void d() {
        f(this.f9093c);
    }

    public final boolean e(CharSequence charSequence) {
        return (A() ? Q.d.f2332d : Q.d.f2331c).a(charSequence, 0, charSequence.length());
    }

    public final void f(float f4) {
        y(f4);
        this.f9107q = C(this.f9105o, this.f9106p, f4, this.f9073J);
        this.f9108r = C(this.f9103m, this.f9104n, f4, this.f9073J);
        W(C(this.f9099i, this.f9100j, f4, this.f9074K));
        TimeInterpolator timeInterpolator = a.f3397b;
        J(1.0f - C(0.0f, 1.0f, 1.0f - f4, timeInterpolator));
        Q(C(1.0f, 0.0f, f4, timeInterpolator));
        if (this.f9102l != this.f9101k) {
            this.f9071H.setColor(a(t(), r(), f4));
        } else {
            this.f9071H.setColor(r());
        }
        float f5 = this.f9083T;
        float f6 = this.f9084U;
        if (f5 != f6) {
            this.f9071H.setLetterSpacing(C(f6, f5, f4, timeInterpolator));
        } else {
            this.f9071H.setLetterSpacing(f5);
        }
        this.f9071H.setShadowLayer(C(this.f9079P, this.f9075L, f4, (TimeInterpolator) null), C(this.f9080Q, this.f9076M, f4, (TimeInterpolator) null), C(this.f9081R, this.f9077N, f4, (TimeInterpolator) null), a(s(this.f9082S), s(this.f9078O), f4));
        C.X(this.f9090a);
    }

    public final void g(float f4) {
        float f5;
        boolean z4;
        boolean z5;
        if (this.f9114x != null) {
            float width = (float) this.f9095e.width();
            float width2 = (float) this.f9094d.width();
            boolean z6 = false;
            int i4 = 1;
            if (z(f4, this.f9100j)) {
                f5 = this.f9100j;
                this.f9067D = 1.0f;
                Typeface typeface = this.f9111u;
                Typeface typeface2 = this.f9109s;
                if (typeface != typeface2) {
                    this.f9111u = typeface2;
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                float f6 = this.f9099i;
                Typeface typeface3 = this.f9111u;
                Typeface typeface4 = this.f9110t;
                if (typeface3 != typeface4) {
                    this.f9111u = typeface4;
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z(f4, f6)) {
                    this.f9067D = 1.0f;
                } else {
                    this.f9067D = f4 / this.f9099i;
                }
                float f7 = this.f9100j / this.f9099i;
                width = width2 * f7 > width ? Math.min(width / f7, width2) : width2;
                f5 = f6;
                z4 = z5;
            }
            if (width > 0.0f) {
                z4 = this.f9068E != f5 || this.f9070G || z4;
                this.f9068E = f5;
                this.f9070G = false;
            }
            if (this.f9115y == null || z4) {
                this.f9071H.setTextSize(this.f9068E);
                this.f9071H.setTypeface(this.f9111u);
                TextPaint textPaint = this.f9071H;
                if (this.f9067D != 1.0f) {
                    z6 = true;
                }
                textPaint.setLinearText(z6);
                this.f9116z = e(this.f9114x);
                if (c0()) {
                    i4 = this.f9091a0;
                }
                StaticLayout i5 = i(i4, width, this.f9116z);
                this.f9085V = i5;
                this.f9115y = i5.getText();
            }
        }
    }

    public final void h() {
        Bitmap bitmap = this.f9065B;
        if (bitmap != null) {
            bitmap.recycle();
            this.f9065B = null;
        }
    }

    public final StaticLayout i(int i4, float f4, boolean z4) {
        return (StaticLayout) g.c(f.b(this.f9114x, this.f9071H, (int) f4).d(TextUtils.TruncateAt.END).f(z4).c(Layout.Alignment.ALIGN_NORMAL).e(false).g(i4).a());
    }

    public void j(Canvas canvas) {
        int save = canvas.save();
        if (this.f9115y != null && this.f9092b) {
            boolean z4 = false;
            float lineLeft = (this.f9107q + this.f9085V.getLineLeft(0)) - (this.f9088Y * 2.0f);
            this.f9071H.setTextSize(this.f9068E);
            float f4 = this.f9107q;
            float f5 = this.f9108r;
            if (this.f9064A && this.f9065B != null) {
                z4 = true;
            }
            float f6 = this.f9067D;
            if (f6 != 1.0f) {
                canvas.scale(f6, f6, f4, f5);
            }
            if (z4) {
                canvas.drawBitmap(this.f9065B, f4, f5, this.f9066C);
                canvas.restoreToCount(save);
                return;
            }
            if (c0()) {
                k(canvas, lineLeft, f5);
            } else {
                canvas.translate(f4, f5);
                this.f9085V.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public final void k(Canvas canvas, float f4, float f5) {
        int alpha = this.f9071H.getAlpha();
        canvas.translate(f4, f5);
        float f6 = (float) alpha;
        this.f9071H.setAlpha((int) (this.f9087X * f6));
        this.f9085V.draw(canvas);
        this.f9071H.setAlpha((int) (this.f9086W * f6));
        int lineBaseline = this.f9085V.getLineBaseline(0);
        CharSequence charSequence = this.f9089Z;
        float f7 = (float) lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f7, this.f9071H);
        String trim = this.f9089Z.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.f9071H.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f9085V.getLineEnd(0), str.length()), 0.0f, f7, this.f9071H);
    }

    public final void l() {
        if (this.f9065B == null && !this.f9094d.isEmpty() && !TextUtils.isEmpty(this.f9115y)) {
            f(0.0f);
            int width = this.f9085V.getWidth();
            int height = this.f9085V.getHeight();
            if (width > 0 && height > 0) {
                this.f9065B = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f9085V.draw(new Canvas(this.f9065B));
                if (this.f9066C == null) {
                    this.f9066C = new Paint(3);
                }
            }
        }
    }

    public void m(RectF rectF, int i4, int i5) {
        this.f9116z = e(this.f9114x);
        rectF.left = p(i4, i5);
        rectF.top = (float) this.f9095e.top;
        rectF.right = q(rectF, i4, i5);
        rectF.bottom = ((float) this.f9095e.top) + o();
    }

    public ColorStateList n() {
        return this.f9102l;
    }

    public float o() {
        w(this.f9072I);
        return -this.f9072I.ascent();
    }

    public final float p(int i4, int i5) {
        return (i5 == 17 || (i5 & 7) == 1) ? (((float) i4) / 2.0f) - (c() / 2.0f) : ((i5 & 8388613) == 8388613 || (i5 & 5) == 5) ? this.f9116z ? (float) this.f9095e.left : ((float) this.f9095e.right) - c() : this.f9116z ? ((float) this.f9095e.right) - c() : (float) this.f9095e.left;
    }

    public final float q(RectF rectF, int i4, int i5) {
        return (i5 == 17 || (i5 & 7) == 1) ? (((float) i4) / 2.0f) + (c() / 2.0f) : ((i5 & 8388613) == 8388613 || (i5 & 5) == 5) ? this.f9116z ? rectF.left + c() : (float) this.f9095e.right : this.f9116z ? (float) this.f9095e.right : rectF.left + c();
    }

    public int r() {
        return s(this.f9102l);
    }

    public final int s(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f9069F;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final int t() {
        return s(this.f9101k);
    }

    public float u() {
        x(this.f9072I);
        return -this.f9072I.ascent();
    }

    public float v() {
        return this.f9093c;
    }

    public final void w(TextPaint textPaint) {
        textPaint.setTextSize(this.f9100j);
        textPaint.setTypeface(this.f9109s);
        textPaint.setLetterSpacing(this.f9083T);
    }

    public final void x(TextPaint textPaint) {
        textPaint.setTextSize(this.f9099i);
        textPaint.setTypeface(this.f9110t);
        textPaint.setLetterSpacing(this.f9084U);
    }

    public final void y(float f4) {
        this.f9096f.left = C((float) this.f9094d.left, (float) this.f9095e.left, f4, this.f9073J);
        this.f9096f.top = C(this.f9103m, this.f9104n, f4, this.f9073J);
        this.f9096f.right = C((float) this.f9094d.right, (float) this.f9095e.right, f4, this.f9073J);
        this.f9096f.bottom = C((float) this.f9094d.bottom, (float) this.f9095e.bottom, f4, this.f9073J);
    }
}
