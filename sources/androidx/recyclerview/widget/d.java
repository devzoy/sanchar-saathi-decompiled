package androidx.recyclerview.widget;

import S.C;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class d extends RecyclerView.n implements RecyclerView.r {

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f5943D = {16842919};

    /* renamed from: E  reason: collision with root package name */
    public static final int[] f5944E = new int[0];

    /* renamed from: A  reason: collision with root package name */
    public int f5945A;

    /* renamed from: B  reason: collision with root package name */
    public final Runnable f5946B;

    /* renamed from: C  reason: collision with root package name */
    public final RecyclerView.s f5947C;

    /* renamed from: a  reason: collision with root package name */
    public final int f5948a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5949b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f5950c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f5951d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5952e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5953f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f5954g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f5955h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5956i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5957j;

    /* renamed from: k  reason: collision with root package name */
    public int f5958k;

    /* renamed from: l  reason: collision with root package name */
    public int f5959l;

    /* renamed from: m  reason: collision with root package name */
    public float f5960m;

    /* renamed from: n  reason: collision with root package name */
    public int f5961n;

    /* renamed from: o  reason: collision with root package name */
    public int f5962o;

    /* renamed from: p  reason: collision with root package name */
    public float f5963p;

    /* renamed from: q  reason: collision with root package name */
    public int f5964q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f5965r = 0;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f5966s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5967t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5968u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f5969v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f5970w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f5971x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f5972y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f5973z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            d.this.q(500);
        }
    }

    public class b extends RecyclerView.s {
        public b() {
        }

        public void b(RecyclerView recyclerView, int i4, int i5) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5976a = false;

        public c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f5976a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f5976a) {
                this.f5976a = false;
            } else if (((Float) d.this.f5973z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f5945A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.f5945A = 2;
                dVar2.v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d  reason: collision with other inner class name */
    public class C0101d implements ValueAnimator.AnimatorUpdateListener {
        public C0101d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f5950c.setAlpha(floatValue);
            d.this.f5951d.setAlpha(floatValue);
            d.this.v();
        }
    }

    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f5973z = ofFloat;
        this.f5945A = 0;
        this.f5946B = new a();
        this.f5947C = new b();
        this.f5950c = stateListDrawable;
        this.f5951d = drawable;
        this.f5954g = stateListDrawable2;
        this.f5955h = drawable2;
        this.f5952e = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f5953f = Math.max(i4, drawable.getIntrinsicWidth());
        this.f5956i = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f5957j = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f5948a = i5;
        this.f5949b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0101d());
        j(recyclerView);
    }

    public void A() {
        int i4 = this.f5945A;
        if (i4 != 0) {
            if (i4 == 3) {
                this.f5973z.cancel();
            } else {
                return;
            }
        }
        this.f5945A = 1;
        ValueAnimator valueAnimator = this.f5973z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f5973z.setDuration(500);
        this.f5973z.setStartDelay(0);
        this.f5973z.start();
    }

    public void B(int i4, int i5) {
        int computeVerticalScrollRange = this.f5966s.computeVerticalScrollRange();
        int i6 = this.f5965r;
        this.f5967t = computeVerticalScrollRange - i6 > 0 && i6 >= this.f5948a;
        int computeHorizontalScrollRange = this.f5966s.computeHorizontalScrollRange();
        int i7 = this.f5964q;
        boolean z4 = computeHorizontalScrollRange - i7 > 0 && i7 >= this.f5948a;
        this.f5968u = z4;
        boolean z5 = this.f5967t;
        if (z5 || z4) {
            if (z5) {
                float f4 = (float) i6;
                this.f5959l = (int) ((f4 * (((float) i5) + (f4 / 2.0f))) / ((float) computeVerticalScrollRange));
                this.f5958k = Math.min(i6, (i6 * i6) / computeVerticalScrollRange);
            }
            if (this.f5968u) {
                float f5 = (float) i7;
                this.f5962o = (int) ((f5 * (((float) i4) + (f5 / 2.0f))) / ((float) computeHorizontalScrollRange));
                this.f5961n = Math.min(i7, (i7 * i7) / computeHorizontalScrollRange);
            }
            int i8 = this.f5969v;
            if (i8 == 0 || i8 == 1) {
                y(1);
            }
        } else if (this.f5969v != 0) {
            y(0);
        }
    }

    public final void C(float f4) {
        int[] p4 = p();
        float max = Math.max((float) p4[0], Math.min((float) p4[1], f4));
        if (Math.abs(((float) this.f5959l) - max) >= 2.0f) {
            int x4 = x(this.f5960m, max, p4, this.f5966s.computeVerticalScrollRange(), this.f5966s.computeVerticalScrollOffset(), this.f5965r);
            if (x4 != 0) {
                this.f5966s.scrollBy(0, x4);
            }
            this.f5960m = max;
        }
    }

    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i4 = this.f5969v;
        if (i4 == 1) {
            boolean u4 = u(motionEvent.getX(), motionEvent.getY());
            boolean t4 = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!u4 && !t4) {
                return false;
            }
            if (t4) {
                this.f5970w = 1;
                this.f5963p = (float) ((int) motionEvent.getX());
            } else if (u4) {
                this.f5970w = 2;
                this.f5960m = (float) ((int) motionEvent.getY());
            }
            y(2);
        } else if (i4 != 2) {
            return false;
        }
        return true;
    }

    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f5969v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean u4 = u(motionEvent.getX(), motionEvent.getY());
                boolean t4 = t(motionEvent.getX(), motionEvent.getY());
                if (u4 || t4) {
                    if (t4) {
                        this.f5970w = 1;
                        this.f5963p = (float) ((int) motionEvent.getX());
                    } else if (u4) {
                        this.f5970w = 2;
                        this.f5960m = (float) ((int) motionEvent.getY());
                    }
                    y(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f5969v == 2) {
                this.f5960m = 0.0f;
                this.f5963p = 0.0f;
                y(1);
                this.f5970w = 0;
            } else if (motionEvent.getAction() == 2 && this.f5969v == 2) {
                A();
                if (this.f5970w == 1) {
                    r(motionEvent.getX());
                }
                if (this.f5970w == 2) {
                    C(motionEvent.getY());
                }
            }
        }
    }

    public void c(boolean z4) {
    }

    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (this.f5964q != this.f5966s.getWidth() || this.f5965r != this.f5966s.getHeight()) {
            this.f5964q = this.f5966s.getWidth();
            this.f5965r = this.f5966s.getHeight();
            y(0);
        } else if (this.f5945A != 0) {
            if (this.f5967t) {
                n(canvas);
            }
            if (this.f5968u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5966s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                l();
            }
            this.f5966s = recyclerView;
            if (recyclerView != null) {
                z();
            }
        }
    }

    public final void k() {
        this.f5966s.removeCallbacks(this.f5946B);
    }

    public final void l() {
        this.f5966s.V0(this);
        this.f5966s.W0(this);
        this.f5966s.X0(this.f5947C);
        k();
    }

    public final void m(Canvas canvas) {
        int i4 = this.f5965r;
        int i5 = this.f5956i;
        int i6 = i4 - i5;
        int i7 = this.f5962o;
        int i8 = this.f5961n;
        int i9 = i7 - (i8 / 2);
        this.f5954g.setBounds(0, 0, i8, i5);
        this.f5955h.setBounds(0, 0, this.f5964q, this.f5957j);
        canvas.translate(0.0f, (float) i6);
        this.f5955h.draw(canvas);
        canvas.translate((float) i9, 0.0f);
        this.f5954g.draw(canvas);
        canvas.translate((float) (-i9), (float) (-i6));
    }

    public final void n(Canvas canvas) {
        int i4 = this.f5964q;
        int i5 = this.f5952e;
        int i6 = i4 - i5;
        int i7 = this.f5959l;
        int i8 = this.f5958k;
        int i9 = i7 - (i8 / 2);
        this.f5950c.setBounds(0, 0, i5, i8);
        this.f5951d.setBounds(0, 0, this.f5953f, this.f5965r);
        if (s()) {
            this.f5951d.draw(canvas);
            canvas.translate((float) this.f5952e, (float) i9);
            canvas.scale(-1.0f, 1.0f);
            this.f5950c.draw(canvas);
            canvas.scale(1.0f, 1.0f);
            canvas.translate((float) (-this.f5952e), (float) (-i9));
            return;
        }
        canvas.translate((float) i6, 0.0f);
        this.f5951d.draw(canvas);
        canvas.translate(0.0f, (float) i9);
        this.f5950c.draw(canvas);
        canvas.translate((float) (-i6), (float) (-i9));
    }

    public final int[] o() {
        int[] iArr = this.f5972y;
        int i4 = this.f5949b;
        iArr[0] = i4;
        iArr[1] = this.f5964q - i4;
        return iArr;
    }

    public final int[] p() {
        int[] iArr = this.f5971x;
        int i4 = this.f5949b;
        iArr[0] = i4;
        iArr[1] = this.f5965r - i4;
        return iArr;
    }

    public void q(int i4) {
        int i5 = this.f5945A;
        if (i5 == 1) {
            this.f5973z.cancel();
        } else if (i5 != 2) {
            return;
        }
        this.f5945A = 3;
        ValueAnimator valueAnimator = this.f5973z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        this.f5973z.setDuration((long) i4);
        this.f5973z.start();
    }

    public final void r(float f4) {
        int[] o4 = o();
        float max = Math.max((float) o4[0], Math.min((float) o4[1], f4));
        if (Math.abs(((float) this.f5962o) - max) >= 2.0f) {
            int x4 = x(this.f5963p, max, o4, this.f5966s.computeHorizontalScrollRange(), this.f5966s.computeHorizontalScrollOffset(), this.f5964q);
            if (x4 != 0) {
                this.f5966s.scrollBy(x4, 0);
            }
            this.f5963p = max;
        }
    }

    public final boolean s() {
        return C.x(this.f5966s) == 1;
    }

    public boolean t(float f4, float f5) {
        if (f5 >= ((float) (this.f5965r - this.f5956i))) {
            int i4 = this.f5962o;
            int i5 = this.f5961n;
            return f4 >= ((float) (i4 - (i5 / 2))) && f4 <= ((float) (i4 + (i5 / 2)));
        }
    }

    public boolean u(float f4, float f5) {
        if (!s() ? f4 >= ((float) (this.f5964q - this.f5952e)) : f4 <= ((float) (this.f5952e / 2))) {
            int i4 = this.f5959l;
            int i5 = this.f5958k;
            return f5 >= ((float) (i4 - (i5 / 2))) && f5 <= ((float) (i4 + (i5 / 2)));
        }
    }

    public void v() {
        this.f5966s.invalidate();
    }

    public final void w(int i4) {
        k();
        this.f5966s.postDelayed(this.f5946B, (long) i4);
    }

    public final int x(float f4, float f5, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 == 0) {
            return 0;
        }
        int i8 = i4 - i6;
        int i9 = (int) (((f5 - f4) / ((float) i7)) * ((float) i8));
        int i10 = i5 + i9;
        if (i10 >= i8 || i10 < 0) {
            return 0;
        }
        return i9;
    }

    public void y(int i4) {
        if (i4 == 2 && this.f5969v != 2) {
            this.f5950c.setState(f5943D);
            k();
        }
        if (i4 == 0) {
            v();
        } else {
            A();
        }
        if (this.f5969v == 2 && i4 != 2) {
            this.f5950c.setState(f5944E);
            w(1200);
        } else if (i4 == 1) {
            w(1500);
        }
        this.f5969v = i4;
    }

    public final void z() {
        this.f5966s.h(this);
        this.f5966s.j(this);
        this.f5966s.k(this.f5947C);
    }
}
