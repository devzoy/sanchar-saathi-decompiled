package androidx.recyclerview.widget;

import S.C0310a;
import S.C0325p;
import S.C0326q;
import S.G;
import T.m;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s0.C0919a;
import s0.C0920b;
import s0.c;

public class RecyclerView extends ViewGroup implements C0326q {

    /* renamed from: A0  reason: collision with root package name */
    public static final boolean f5619A0 = true;

    /* renamed from: B0  reason: collision with root package name */
    public static final boolean f5620B0 = true;

    /* renamed from: C0  reason: collision with root package name */
    public static final boolean f5621C0 = true;

    /* renamed from: D0  reason: collision with root package name */
    public static final boolean f5622D0 = false;

    /* renamed from: E0  reason: collision with root package name */
    public static final boolean f5623E0 = false;

    /* renamed from: F0  reason: collision with root package name */
    public static final Class[] f5624F0;

    /* renamed from: G0  reason: collision with root package name */
    public static final Interpolator f5625G0 = new C0387c();

    /* renamed from: y0  reason: collision with root package name */
    public static final int[] f5626y0 = {16843830};

    /* renamed from: z0  reason: collision with root package name */
    public static final boolean f5627z0 = false;

    /* renamed from: A  reason: collision with root package name */
    public int f5628A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f5629B;

    /* renamed from: C  reason: collision with root package name */
    public final AccessibilityManager f5630C;

    /* renamed from: D  reason: collision with root package name */
    public List f5631D;

    /* renamed from: E  reason: collision with root package name */
    public boolean f5632E;

    /* renamed from: F  reason: collision with root package name */
    public boolean f5633F;

    /* renamed from: G  reason: collision with root package name */
    public int f5634G;

    /* renamed from: H  reason: collision with root package name */
    public int f5635H;

    /* renamed from: I  reason: collision with root package name */
    public k f5636I;

    /* renamed from: J  reason: collision with root package name */
    public EdgeEffect f5637J;

    /* renamed from: K  reason: collision with root package name */
    public EdgeEffect f5638K;

    /* renamed from: L  reason: collision with root package name */
    public EdgeEffect f5639L;

    /* renamed from: M  reason: collision with root package name */
    public EdgeEffect f5640M;

    /* renamed from: N  reason: collision with root package name */
    public l f5641N;

    /* renamed from: O  reason: collision with root package name */
    public int f5642O;

    /* renamed from: P  reason: collision with root package name */
    public int f5643P;

    /* renamed from: Q  reason: collision with root package name */
    public VelocityTracker f5644Q;

    /* renamed from: R  reason: collision with root package name */
    public int f5645R;

    /* renamed from: S  reason: collision with root package name */
    public int f5646S;

    /* renamed from: T  reason: collision with root package name */
    public int f5647T;

    /* renamed from: U  reason: collision with root package name */
    public int f5648U;

    /* renamed from: V  reason: collision with root package name */
    public int f5649V;

    /* renamed from: W  reason: collision with root package name */
    public q f5650W;

    /* renamed from: a0  reason: collision with root package name */
    public final int f5651a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f5652b0;

    /* renamed from: c  reason: collision with root package name */
    public final w f5653c;

    /* renamed from: c0  reason: collision with root package name */
    public float f5654c0;

    /* renamed from: d  reason: collision with root package name */
    public final u f5655d;

    /* renamed from: d0  reason: collision with root package name */
    public float f5656d0;

    /* renamed from: e  reason: collision with root package name */
    public x f5657e;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f5658e0;

    /* renamed from: f  reason: collision with root package name */
    public a f5659f;

    /* renamed from: f0  reason: collision with root package name */
    public final B f5660f0;

    /* renamed from: g  reason: collision with root package name */
    public b f5661g;

    /* renamed from: g0  reason: collision with root package name */
    public e f5662g0;

    /* renamed from: h  reason: collision with root package name */
    public final p f5663h;

    /* renamed from: h0  reason: collision with root package name */
    public e.b f5664h0;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5665i;

    /* renamed from: i0  reason: collision with root package name */
    public final z f5666i0;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f5667j;

    /* renamed from: j0  reason: collision with root package name */
    public s f5668j0;

    /* renamed from: k  reason: collision with root package name */
    public final Rect f5669k;

    /* renamed from: k0  reason: collision with root package name */
    public List f5670k0;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f5671l;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f5672l0;

    /* renamed from: m  reason: collision with root package name */
    public final RectF f5673m;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f5674m0;

    /* renamed from: n  reason: collision with root package name */
    public g f5675n;

    /* renamed from: n0  reason: collision with root package name */
    public l.a f5676n0;

    /* renamed from: o  reason: collision with root package name */
    public o f5677o;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f5678o0;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList f5679p;

    /* renamed from: p0  reason: collision with root package name */
    public k f5680p0;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f5681q;

    /* renamed from: q0  reason: collision with root package name */
    public final int[] f5682q0;

    /* renamed from: r  reason: collision with root package name */
    public r f5683r;

    /* renamed from: r0  reason: collision with root package name */
    public S.r f5684r0;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5685s;

    /* renamed from: s0  reason: collision with root package name */
    public final int[] f5686s0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5687t;

    /* renamed from: t0  reason: collision with root package name */
    public final int[] f5688t0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5689u;

    /* renamed from: u0  reason: collision with root package name */
    public final int[] f5690u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5691v;

    /* renamed from: v0  reason: collision with root package name */
    public final List f5692v0;

    /* renamed from: w  reason: collision with root package name */
    public int f5693w;

    /* renamed from: w0  reason: collision with root package name */
    public Runnable f5694w0;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5695x;

    /* renamed from: x0  reason: collision with root package name */
    public final p.b f5696x0;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5697y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5698z;

    public static abstract class A {
    }

    public class B implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public int f5699e;

        /* renamed from: f  reason: collision with root package name */
        public int f5700f;

        /* renamed from: g  reason: collision with root package name */
        public OverScroller f5701g;

        /* renamed from: h  reason: collision with root package name */
        public Interpolator f5702h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5703i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5704j = false;

        public B() {
            Interpolator interpolator = RecyclerView.f5625G0;
            this.f5702h = interpolator;
            this.f5701g = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i4, int i5, int i6, int i7) {
            int i8;
            int abs = Math.abs(i4);
            int abs2 = Math.abs(i5);
            boolean z4 = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i6 * i6) + (i7 * i7)));
            int sqrt2 = (int) Math.sqrt((double) ((i4 * i4) + (i5 * i5)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i9 = width / 2;
            float f4 = (float) width;
            float f5 = (float) i9;
            float b4 = f5 + (b(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f4)) * f5);
            if (sqrt > 0) {
                i8 = Math.round(Math.abs(b4 / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z4) {
                    abs = abs2;
                }
                i8 = (int) (((((float) abs) / f4) + 1.0f) * 300.0f);
            }
            return Math.min(i8, 2000);
        }

        public final float b(float f4) {
            return (float) Math.sin((double) ((f4 - 0.5f) * 0.47123894f));
        }

        public void c(int i4, int i5) {
            RecyclerView.this.setScrollState(2);
            this.f5700f = 0;
            this.f5699e = 0;
            Interpolator interpolator = this.f5702h;
            Interpolator interpolator2 = RecyclerView.f5625G0;
            if (interpolator != interpolator2) {
                this.f5702h = interpolator2;
                this.f5701g = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f5701g.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        public final void d() {
            RecyclerView.this.removeCallbacks(this);
            S.C.Y(RecyclerView.this, this);
        }

        public void e() {
            if (this.f5703i) {
                this.f5704j = true;
            } else {
                d();
            }
        }

        public void f(int i4, int i5, int i6, Interpolator interpolator) {
            if (i6 == Integer.MIN_VALUE) {
                i6 = a(i4, i5, 0, 0);
            }
            int i7 = i6;
            if (interpolator == null) {
                interpolator = RecyclerView.f5625G0;
            }
            if (this.f5702h != interpolator) {
                this.f5702h = interpolator;
                this.f5701g = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f5700f = 0;
            this.f5699e = 0;
            RecyclerView.this.setScrollState(2);
            this.f5701g.startScroll(0, 0, i4, i5, i7);
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f5701g.abortAnimation();
        }

        public void run() {
            int i4;
            int i5;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5677o == null) {
                g();
                return;
            }
            this.f5704j = false;
            this.f5703i = true;
            recyclerView.u();
            OverScroller overScroller = this.f5701g;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.f5699e;
                int i7 = currY - this.f5700f;
                this.f5699e = currX;
                this.f5700f = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f5690u0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i6, i7, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f5690u0;
                    i6 -= iArr2[0];
                    i7 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(i6, i7);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f5675n != null) {
                    int[] iArr3 = recyclerView3.f5690u0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.f1(i6, i7, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f5690u0;
                    i4 = iArr4[0];
                    i5 = iArr4[1];
                    i6 -= i4;
                    i7 -= i5;
                    y yVar = recyclerView4.f5677o.f5749g;
                    if (yVar != null && !yVar.g() && yVar.h()) {
                        int b4 = RecyclerView.this.f5666i0.b();
                        if (b4 == 0) {
                            yVar.r();
                        } else if (yVar.f() >= b4) {
                            yVar.p(b4 - 1);
                            yVar.j(i4, i5);
                        } else {
                            yVar.j(i4, i5);
                        }
                    }
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (!RecyclerView.this.f5679p.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f5690u0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i4, i5, i6, i7, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f5690u0;
                int i8 = i6 - iArr6[0];
                int i9 = i7 - iArr6[1];
                if (!(i4 == 0 && i5 == 0)) {
                    recyclerView6.I(i4, i5);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z4 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i8 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i9 != 0));
                y yVar2 = RecyclerView.this.f5677o.f5749g;
                if ((yVar2 == null || !yVar2.g()) && z4) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i10 = i8 < 0 ? -currVelocity : i8 > 0 ? currVelocity : 0;
                        if (i9 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i9 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i10, currVelocity);
                    }
                    if (RecyclerView.f5621C0) {
                        RecyclerView.this.f5664h0.b();
                    }
                } else {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    e eVar = recyclerView7.f5662g0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i4, i5);
                    }
                }
            }
            y yVar3 = RecyclerView.this.f5677o.f5749g;
            if (yVar3 != null && yVar3.g()) {
                yVar3.j(0, 0);
            }
            this.f5703i = false;
            if (this.f5704j) {
                d();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.s1(1);
        }
    }

    public static abstract class C {

        /* renamed from: s  reason: collision with root package name */
        public static final List f5706s = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f5707a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference f5708b;

        /* renamed from: c  reason: collision with root package name */
        public int f5709c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f5710d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f5711e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f5712f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f5713g = -1;

        /* renamed from: h  reason: collision with root package name */
        public C f5714h = null;

        /* renamed from: i  reason: collision with root package name */
        public C f5715i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f5716j;

        /* renamed from: k  reason: collision with root package name */
        public List f5717k = null;

        /* renamed from: l  reason: collision with root package name */
        public List f5718l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f5719m = 0;

        /* renamed from: n  reason: collision with root package name */
        public u f5720n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f5721o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f5722p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f5723q = -1;

        /* renamed from: r  reason: collision with root package name */
        public RecyclerView f5724r;

        public C(View view) {
            if (view != null) {
                this.f5707a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public void A(int i4, boolean z4) {
            if (this.f5710d == -1) {
                this.f5710d = this.f5709c;
            }
            if (this.f5713g == -1) {
                this.f5713g = this.f5709c;
            }
            if (z4) {
                this.f5713g += i4;
            }
            this.f5709c += i4;
            if (this.f5707a.getLayoutParams() != null) {
                ((p) this.f5707a.getLayoutParams()).f5769c = true;
            }
        }

        public void B(RecyclerView recyclerView) {
            int i4 = this.f5723q;
            if (i4 != -1) {
                this.f5722p = i4;
            } else {
                this.f5722p = S.C.v(this.f5707a);
            }
            recyclerView.i1(this, 4);
        }

        public void C(RecyclerView recyclerView) {
            recyclerView.i1(this, this.f5722p);
            this.f5722p = 0;
        }

        public void D() {
            this.f5716j = 0;
            this.f5709c = -1;
            this.f5710d = -1;
            this.f5711e = -1;
            this.f5713g = -1;
            this.f5719m = 0;
            this.f5714h = null;
            this.f5715i = null;
            d();
            this.f5722p = 0;
            this.f5723q = -1;
            RecyclerView.r(this);
        }

        public void E() {
            if (this.f5710d == -1) {
                this.f5710d = this.f5709c;
            }
        }

        public void F(int i4, int i5) {
            this.f5716j = (i4 & i5) | (this.f5716j & (~i5));
        }

        public final void G(boolean z4) {
            int i4 = this.f5719m;
            int i5 = z4 ? i4 - 1 : i4 + 1;
            this.f5719m = i5;
            if (i5 < 0) {
                this.f5719m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z4 && i5 == 1) {
                this.f5716j |= 16;
            } else if (z4 && i5 == 0) {
                this.f5716j &= -17;
            }
        }

        public void H(u uVar, boolean z4) {
            this.f5720n = uVar;
            this.f5721o = z4;
        }

        public boolean I() {
            return (this.f5716j & 16) != 0;
        }

        public boolean J() {
            return (this.f5716j & 128) != 0;
        }

        public void K() {
            this.f5720n.J(this);
        }

        public boolean L() {
            return (this.f5716j & 32) != 0;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f5716j) == 0) {
                g();
                this.f5717k.add(obj);
            }
        }

        public void b(int i4) {
            this.f5716j = i4 | this.f5716j;
        }

        public void c() {
            this.f5710d = -1;
            this.f5713g = -1;
        }

        public void d() {
            List list = this.f5717k;
            if (list != null) {
                list.clear();
            }
            this.f5716j &= -1025;
        }

        public void e() {
            this.f5716j &= -33;
        }

        public void f() {
            this.f5716j &= -257;
        }

        public final void g() {
            if (this.f5717k == null) {
                ArrayList arrayList = new ArrayList();
                this.f5717k = arrayList;
                this.f5718l = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean h() {
            return (this.f5716j & 16) == 0 && S.C.J(this.f5707a);
        }

        public void i(int i4, int i5, boolean z4) {
            b(8);
            A(i5, z4);
            this.f5709c = i4;
        }

        public final int j() {
            RecyclerView recyclerView = this.f5724r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b0(this);
        }

        public final long k() {
            return this.f5711e;
        }

        public final int l() {
            return this.f5712f;
        }

        public final int m() {
            int i4 = this.f5713g;
            return i4 == -1 ? this.f5709c : i4;
        }

        public final int n() {
            return this.f5710d;
        }

        public List o() {
            if ((this.f5716j & 1024) != 0) {
                return f5706s;
            }
            List list = this.f5717k;
            return (list == null || list.size() == 0) ? f5706s : this.f5718l;
        }

        public boolean p(int i4) {
            return (i4 & this.f5716j) != 0;
        }

        public boolean q() {
            return (this.f5716j & 512) != 0 || t();
        }

        public boolean r() {
            return (this.f5707a.getParent() == null || this.f5707a.getParent() == this.f5724r) ? false : true;
        }

        public boolean s() {
            return (this.f5716j & 1) != 0;
        }

        public boolean t() {
            return (this.f5716j & 4) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f5709c + " id=" + this.f5711e + ", oldPos=" + this.f5710d + ", pLpos:" + this.f5713g);
            if (w()) {
                sb.append(" scrap ");
                sb.append(this.f5721o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.f5719m + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f5707a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.f5716j & 16) == 0 && !S.C.J(this.f5707a);
        }

        public boolean v() {
            return (this.f5716j & 8) != 0;
        }

        public boolean w() {
            return this.f5720n != null;
        }

        public boolean x() {
            return (this.f5716j & 256) != 0;
        }

        public boolean y() {
            return (this.f5716j & 2) != 0;
        }

        public boolean z() {
            return (this.f5716j & 2) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a  reason: case insensitive filesystem */
    public class C0385a implements Runnable {
        public C0385a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5691v && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f5685s) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f5697y) {
                    recyclerView2.f5695x = true;
                } else {
                    recyclerView2.u();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b  reason: case insensitive filesystem */
    public class C0386b implements Runnable {
        public C0386b() {
        }

        public void run() {
            l lVar = RecyclerView.this.f5641N;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.f5678o0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c  reason: case insensitive filesystem */
    public static class C0387c implements Interpolator {
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    public class d implements p.b {
        public d() {
        }

        public void a(C c4) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5677o.m1(c4.f5707a, recyclerView.f5655d);
        }

        public void b(C c4, l.b bVar, l.b bVar2) {
            RecyclerView.this.l(c4, bVar, bVar2);
        }

        public void c(C c4, l.b bVar, l.b bVar2) {
            RecyclerView.this.f5655d.J(c4);
            RecyclerView.this.n(c4, bVar, bVar2);
        }

        public void d(C c4, l.b bVar, l.b bVar2) {
            c4.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5632E) {
                if (recyclerView.f5641N.b(c4, c4, bVar, bVar2)) {
                    RecyclerView.this.L0();
                }
            } else if (recyclerView.f5641N.d(c4, bVar, bVar2)) {
                RecyclerView.this.L0();
            }
        }
    }

    public class e implements b.C0099b {
        public e() {
        }

        public View a(int i4) {
            return RecyclerView.this.getChildAt(i4);
        }

        public void b(View view) {
            C f02 = RecyclerView.f0(view);
            if (f02 != null) {
                f02.B(RecyclerView.this);
            }
        }

        public C c(View view) {
            return RecyclerView.f0(view);
        }

        public void d(int i4) {
            C f02;
            View a4 = a(i4);
            if (!(a4 == null || (f02 = RecyclerView.f0(a4)) == null)) {
                if (!f02.x() || f02.J()) {
                    f02.b(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + f02 + RecyclerView.this.P());
                }
            }
            RecyclerView.this.detachViewFromParent(i4);
        }

        public void e(View view) {
            C f02 = RecyclerView.f0(view);
            if (f02 != null) {
                f02.C(RecyclerView.this);
            }
        }

        public void f(View view, int i4) {
            RecyclerView.this.addView(view, i4);
            RecyclerView.this.y(view);
        }

        public int g() {
            return RecyclerView.this.getChildCount();
        }

        public void h(int i4) {
            View childAt = RecyclerView.this.getChildAt(i4);
            if (childAt != null) {
                RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i4);
        }

        public void i() {
            int g4 = g();
            for (int i4 = 0; i4 < g4; i4++) {
                View a4 = a(i4);
                RecyclerView.this.z(a4);
                a4.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        public void j(View view, int i4, ViewGroup.LayoutParams layoutParams) {
            C f02 = RecyclerView.f0(view);
            if (f02 != null) {
                if (f02.x() || f02.J()) {
                    f02.f();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + f02 + RecyclerView.this.P());
                }
            }
            RecyclerView.this.attachViewToParent(view, i4, layoutParams);
        }

        public int k(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    public class f implements a.C0098a {
        public f() {
        }

        public void a(int i4, int i5) {
            RecyclerView.this.B0(i4, i5);
            RecyclerView.this.f5672l0 = true;
        }

        public void b(a.b bVar) {
            i(bVar);
        }

        public C c(int i4) {
            C Z3 = RecyclerView.this.Z(i4, true);
            if (Z3 != null && !RecyclerView.this.f5661g.n(Z3.f5707a)) {
                return Z3;
            }
            return null;
        }

        public void d(int i4, int i5) {
            RecyclerView.this.C0(i4, i5, false);
            RecyclerView.this.f5672l0 = true;
        }

        public void e(int i4, int i5) {
            RecyclerView.this.A0(i4, i5);
            RecyclerView.this.f5672l0 = true;
        }

        public void f(int i4, int i5) {
            RecyclerView.this.C0(i4, i5, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5672l0 = true;
            recyclerView.f5666i0.f5805d += i5;
        }

        public void g(a.b bVar) {
            i(bVar);
        }

        public void h(int i4, int i5, Object obj) {
            RecyclerView.this.v1(i4, i5, obj);
            RecyclerView.this.f5674m0 = true;
        }

        public void i(a.b bVar) {
            int i4 = bVar.f5883a;
            if (i4 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f5677o.R0(recyclerView, bVar.f5884b, bVar.f5886d);
            } else if (i4 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f5677o.U0(recyclerView2, bVar.f5884b, bVar.f5886d);
            } else if (i4 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f5677o.W0(recyclerView3, bVar.f5884b, bVar.f5886d, bVar.f5885c);
            } else if (i4 == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f5677o.T0(recyclerView4, bVar.f5884b, bVar.f5886d, 1);
            }
        }
    }

    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        public final h f5730a = new h();

        /* renamed from: b  reason: collision with root package name */
        public boolean f5731b = false;

        public final void a(C c4, int i4) {
            c4.f5709c = i4;
            if (g()) {
                c4.f5711e = d(i4);
            }
            c4.F(1, 519);
            O.g.a("RV OnBindView");
            j(c4, i4, c4.o());
            c4.d();
            ViewGroup.LayoutParams layoutParams = c4.f5707a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f5769c = true;
            }
            O.g.b();
        }

        public final C b(ViewGroup viewGroup, int i4) {
            try {
                O.g.a("RV CreateView");
                C k4 = k(viewGroup, i4);
                if (k4.f5707a.getParent() == null) {
                    k4.f5712f = i4;
                    return k4;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                O.g.b();
            }
        }

        public abstract int c();

        public long d(int i4) {
            return -1;
        }

        public int e(int i4) {
            return 0;
        }

        public final boolean f() {
            return this.f5730a.a();
        }

        public final boolean g() {
            return this.f5731b;
        }

        public void h(RecyclerView recyclerView) {
        }

        public abstract void i(C c4, int i4);

        public void j(C c4, int i4, List list) {
            i(c4, i4);
        }

        public abstract C k(ViewGroup viewGroup, int i4);

        public void l(RecyclerView recyclerView) {
        }

        public boolean m(C c4) {
            return false;
        }

        public void n(C c4) {
        }

        public void o(C c4) {
        }

        public void p(C c4) {
        }

        public void q(i iVar) {
            this.f5730a.registerObserver(iVar);
        }

        public void r(boolean z4) {
            if (!f()) {
                this.f5731b = z4;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void s(i iVar) {
            this.f5730a.unregisterObserver(iVar);
        }
    }

    public static class h extends Observable {
        public boolean a() {
            return !this.mObservers.isEmpty();
        }
    }

    public static abstract class i {
    }

    public interface j {
    }

    public static class k {
        public EdgeEffect a(RecyclerView recyclerView, int i4) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        public a f5732a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f5733b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public long f5734c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f5735d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f5736e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f5737f = 250;

        public interface a {
            void a(C c4);
        }

        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public int f5738a;

            /* renamed from: b  reason: collision with root package name */
            public int f5739b;

            /* renamed from: c  reason: collision with root package name */
            public int f5740c;

            /* renamed from: d  reason: collision with root package name */
            public int f5741d;

            public b a(C c4) {
                return b(c4, 0);
            }

            public b b(C c4, int i4) {
                View view = c4.f5707a;
                this.f5738a = view.getLeft();
                this.f5739b = view.getTop();
                this.f5740c = view.getRight();
                this.f5741d = view.getBottom();
                return this;
            }
        }

        public static int e(C c4) {
            int i4 = c4.f5716j;
            int i5 = i4 & 14;
            if (c4.t()) {
                return 4;
            }
            if ((i4 & 4) != 0) {
                return i5;
            }
            int n4 = c4.n();
            int j4 = c4.j();
            return (n4 == -1 || j4 == -1 || n4 == j4) ? i5 : i5 | 2048;
        }

        public abstract boolean a(C c4, b bVar, b bVar2);

        public abstract boolean b(C c4, C c5, b bVar, b bVar2);

        public abstract boolean c(C c4, b bVar, b bVar2);

        public abstract boolean d(C c4, b bVar, b bVar2);

        public abstract boolean f(C c4);

        public boolean g(C c4, List list) {
            return f(c4);
        }

        public final void h(C c4) {
            r(c4);
            a aVar = this.f5732a;
            if (aVar != null) {
                aVar.a(c4);
            }
        }

        public final void i() {
            if (this.f5733b.size() <= 0) {
                this.f5733b.clear();
            } else {
                android.support.v4.media.session.b.a(this.f5733b.get(0));
                throw null;
            }
        }

        public abstract void j(C c4);

        public abstract void k();

        public long l() {
            return this.f5734c;
        }

        public long m() {
            return this.f5737f;
        }

        public long n() {
            return this.f5736e;
        }

        public long o() {
            return this.f5735d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(C c4) {
        }

        public b s(z zVar, C c4) {
            return q().a(c4);
        }

        public b t(z zVar, C c4, int i4, List list) {
            return q().a(c4);
        }

        public abstract void u();

        public void v(a aVar) {
            this.f5732a = aVar;
        }
    }

    public class m implements l.a {
        public m() {
        }

        public void a(C c4) {
            c4.G(true);
            if (c4.f5714h != null && c4.f5715i == null) {
                c4.f5714h = null;
            }
            c4.f5715i = null;
            if (!c4.I() && !RecyclerView.this.U0(c4.f5707a) && c4.x()) {
                RecyclerView.this.removeDetachedView(c4.f5707a, false);
            }
        }
    }

    public static abstract class n {
        public void d(Rect rect, int i4, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, z zVar) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* renamed from: a  reason: collision with root package name */
        public b f5743a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f5744b;

        /* renamed from: c  reason: collision with root package name */
        public final o.b f5745c;

        /* renamed from: d  reason: collision with root package name */
        public final o.b f5746d;

        /* renamed from: e  reason: collision with root package name */
        public o f5747e;

        /* renamed from: f  reason: collision with root package name */
        public o f5748f;

        /* renamed from: g  reason: collision with root package name */
        public y f5749g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5750h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5751i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5752j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5753k = true;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5754l = true;

        /* renamed from: m  reason: collision with root package name */
        public int f5755m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f5756n;

        /* renamed from: o  reason: collision with root package name */
        public int f5757o;

        /* renamed from: p  reason: collision with root package name */
        public int f5758p;

        /* renamed from: q  reason: collision with root package name */
        public int f5759q;

        /* renamed from: r  reason: collision with root package name */
        public int f5760r;

        public class a implements o.b {
            public a() {
            }

            public View a(int i4) {
                return o.this.I(i4);
            }

            public int b() {
                return o.this.o0() - o.this.f0();
            }

            public int c(View view) {
                return o.this.Q(view) - ((p) view.getLayoutParams()).leftMargin;
            }

            public int d() {
                return o.this.e0();
            }

            public int e(View view) {
                return o.this.T(view) + ((p) view.getLayoutParams()).rightMargin;
            }
        }

        public class b implements o.b {
            public b() {
            }

            public View a(int i4) {
                return o.this.I(i4);
            }

            public int b() {
                return o.this.W() - o.this.d0();
            }

            public int c(View view) {
                return o.this.U(view) - ((p) view.getLayoutParams()).topMargin;
            }

            public int d() {
                return o.this.g0();
            }

            public int e(View view) {
                return o.this.O(view) + ((p) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
            void a(int i4, int i5);
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f5763a;

            /* renamed from: b  reason: collision with root package name */
            public int f5764b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f5765c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f5766d;
        }

        public o() {
            a aVar = new a();
            this.f5745c = aVar;
            b bVar = new b();
            this.f5746d = bVar;
            this.f5747e = new o(aVar);
            this.f5748f = new o(bVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
            if (r5 == 1073741824) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001d
                if (r7 < 0) goto L_0x0012
            L_0x0010:
                r5 = r3
                goto L_0x0030
            L_0x0012:
                if (r7 != r1) goto L_0x001a
                if (r5 == r2) goto L_0x0022
                if (r5 == 0) goto L_0x001a
                if (r5 == r3) goto L_0x0022
            L_0x001a:
                r5 = r6
                r7 = r5
                goto L_0x0030
            L_0x001d:
                if (r7 < 0) goto L_0x0020
                goto L_0x0010
            L_0x0020:
                if (r7 != r1) goto L_0x0024
            L_0x0022:
                r7 = r4
                goto L_0x0030
            L_0x0024:
                if (r7 != r0) goto L_0x001a
                if (r5 == r2) goto L_0x002e
                if (r5 != r3) goto L_0x002b
                goto L_0x002e
            L_0x002b:
                r7 = r4
                r5 = r6
                goto L_0x0030
            L_0x002e:
                r7 = r4
                r5 = r2
            L_0x0030:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.K(int, int, int, int, boolean):int");
        }

        public static d i0(Context context, AttributeSet attributeSet, int i4, int i5) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0.c.f11994f, i4, i5);
            dVar.f5763a = obtainStyledAttributes.getInt(s0.c.f11995g, 1);
            dVar.f5764b = obtainStyledAttributes.getInt(s0.c.f12005q, 1);
            dVar.f5765c = obtainStyledAttributes.getBoolean(s0.c.f12004p, false);
            dVar.f5766d = obtainStyledAttributes.getBoolean(s0.c.f12006r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i5, i6) : size : Math.min(size, Math.max(i5, i6));
        }

        public static boolean w0(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i5);
            int size = View.MeasureSpec.getSize(i5);
            if (i6 > 0 && i4 != i6) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i4;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i4;
            }
            return true;
        }

        public void A(RecyclerView recyclerView, u uVar) {
            this.f5751i = false;
            I0(recyclerView, uVar);
        }

        public void A0(View view, int i4, int i5) {
            p pVar = (p) view.getLayoutParams();
            Rect j02 = this.f5744b.j0(view);
            int i6 = i4 + j02.left + j02.right;
            int i7 = i5 + j02.top + j02.bottom;
            int K4 = K(o0(), p0(), e0() + f0() + pVar.leftMargin + pVar.rightMargin + i6, pVar.width, k());
            int K5 = K(W(), X(), g0() + d0() + pVar.topMargin + pVar.bottomMargin + i7, pVar.height, l());
            if (F1(view, K4, K5, pVar)) {
                view.measure(K4, K5);
            }
        }

        public void A1(int i4, int i5) {
            this.f5759q = View.MeasureSpec.getSize(i4);
            int mode = View.MeasureSpec.getMode(i4);
            this.f5757o = mode;
            if (mode == 0 && !RecyclerView.f5619A0) {
                this.f5759q = 0;
            }
            this.f5760r = View.MeasureSpec.getSize(i5);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.f5758p = mode2;
            if (mode2 == 0 && !RecyclerView.f5619A0) {
                this.f5760r = 0;
            }
        }

        public View B(View view) {
            View R3;
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView == null || (R3 = recyclerView.R(view)) == null || this.f5743a.n(R3)) {
                return null;
            }
            return R3;
        }

        public void B0(int i4, int i5) {
            View I4 = I(i4);
            if (I4 != null) {
                x(i4);
                h(I4, i5);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i4 + this.f5744b.toString());
        }

        public void B1(int i4, int i5) {
            this.f5744b.setMeasuredDimension(i4, i5);
        }

        public View C(int i4) {
            int J4 = J();
            for (int i5 = 0; i5 < J4; i5++) {
                View I4 = I(i5);
                C f02 = RecyclerView.f0(I4);
                if (f02 != null && f02.m() == i4 && !f02.J() && (this.f5744b.f5666i0.e() || !f02.v())) {
                    return I4;
                }
            }
            return null;
        }

        public void C0(int i4) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                recyclerView.y0(i4);
            }
        }

        public void C1(Rect rect, int i4, int i5) {
            B1(n(i4, rect.width() + e0() + f0(), c0()), n(i5, rect.height() + g0() + d0(), b0()));
        }

        public abstract p D();

        public void D0(int i4) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                recyclerView.z0(i4);
            }
        }

        public void D1(int i4, int i5) {
            int J4 = J();
            if (J4 == 0) {
                this.f5744b.w(i4, i5);
                return;
            }
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MAX_VALUE;
            int i8 = Integer.MIN_VALUE;
            int i9 = Integer.MAX_VALUE;
            for (int i10 = 0; i10 < J4; i10++) {
                View I4 = I(i10);
                Rect rect = this.f5744b.f5669k;
                P(I4, rect);
                int i11 = rect.left;
                if (i11 < i9) {
                    i9 = i11;
                }
                int i12 = rect.right;
                if (i12 > i6) {
                    i6 = i12;
                }
                int i13 = rect.top;
                if (i13 < i7) {
                    i7 = i13;
                }
                int i14 = rect.bottom;
                if (i14 > i8) {
                    i8 = i14;
                }
            }
            this.f5744b.f5669k.set(i9, i7, i6, i8);
            C1(this.f5744b.f5669k, i4, i5);
        }

        public p E(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void E0(g gVar, g gVar2) {
        }

        public void E1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f5744b = null;
                this.f5743a = null;
                this.f5759q = 0;
                this.f5760r = 0;
            } else {
                this.f5744b = recyclerView;
                this.f5743a = recyclerView.f5661g;
                this.f5759q = recyclerView.getWidth();
                this.f5760r = recyclerView.getHeight();
            }
            this.f5757o = 1073741824;
            this.f5758p = 1073741824;
        }

        public p F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public boolean F0(RecyclerView recyclerView, ArrayList arrayList, int i4, int i5) {
            return false;
        }

        public boolean F1(View view, int i4, int i5, p pVar) {
            return view.isLayoutRequested() || !this.f5753k || !w0(view.getWidth(), i4, pVar.width) || !w0(view.getHeight(), i5, pVar.height);
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        public boolean G1() {
            return false;
        }

        public int H(View view) {
            return ((p) view.getLayoutParams()).f5768b.bottom;
        }

        public void H0(RecyclerView recyclerView) {
        }

        public boolean H1(View view, int i4, int i5, p pVar) {
            return !this.f5753k || !w0(view.getMeasuredWidth(), i4, pVar.width) || !w0(view.getMeasuredHeight(), i5, pVar.height);
        }

        public View I(int i4) {
            b bVar = this.f5743a;
            if (bVar != null) {
                return bVar.f(i4);
            }
            return null;
        }

        public void I0(RecyclerView recyclerView, u uVar) {
            H0(recyclerView);
        }

        public abstract void I1(RecyclerView recyclerView, z zVar, int i4);

        public int J() {
            b bVar = this.f5743a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public abstract View J0(View view, int i4, u uVar, z zVar);

        public void J1(y yVar) {
            y yVar2 = this.f5749g;
            if (!(yVar2 == null || yVar == yVar2 || !yVar2.h())) {
                this.f5749g.r();
            }
            this.f5749g = yVar;
            yVar.q(this.f5744b, this);
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5744b;
            L0(recyclerView.f5655d, recyclerView.f5666i0, accessibilityEvent);
        }

        public void K1() {
            y yVar = this.f5749g;
            if (yVar != null) {
                yVar.r();
            }
        }

        public final int[] L(View view, Rect rect) {
            int e02 = e0();
            int g02 = g0();
            int o02 = o0() - f0();
            int W3 = W() - d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i4 = left - e02;
            int min = Math.min(0, i4);
            int i5 = top - g02;
            int min2 = Math.min(0, i5);
            int i6 = width - o02;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, height - W3);
            if (Z() != 1) {
                if (min == 0) {
                    min = Math.min(i4, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i6);
            }
            if (min2 == 0) {
                min2 = Math.min(i5, max2);
            }
            return new int[]{max, min2};
        }

        public void L0(u uVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z4 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f5744b.canScrollVertically(-1) && !this.f5744b.canScrollHorizontally(-1) && !this.f5744b.canScrollHorizontally(1)) {
                    z4 = false;
                }
                accessibilityEvent.setScrollable(z4);
                g gVar = this.f5744b.f5675n;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.c());
                }
            }
        }

        public abstract boolean L1();

        public boolean M() {
            RecyclerView recyclerView = this.f5744b;
            return recyclerView != null && recyclerView.f5665i;
        }

        public void M0(T.m mVar) {
            RecyclerView recyclerView = this.f5744b;
            N0(recyclerView.f5655d, recyclerView.f5666i0, mVar);
        }

        public int N(u uVar, z zVar) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView == null || recyclerView.f5675n == null || !k()) {
                return 1;
            }
            return this.f5744b.f5675n.c();
        }

        public void N0(u uVar, z zVar, T.m mVar) {
            if (this.f5744b.canScrollVertically(-1) || this.f5744b.canScrollHorizontally(-1)) {
                mVar.a(8192);
                mVar.u0(true);
            }
            if (this.f5744b.canScrollVertically(1) || this.f5744b.canScrollHorizontally(1)) {
                mVar.a(4096);
                mVar.u0(true);
            }
            mVar.e0(m.e.a(k0(uVar, zVar), N(uVar, zVar), v0(uVar, zVar), l0(uVar, zVar)));
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        public void O0(View view, T.m mVar) {
            C f02 = RecyclerView.f0(view);
            if (f02 != null && !f02.v() && !this.f5743a.n(f02.f5707a)) {
                RecyclerView recyclerView = this.f5744b;
                P0(recyclerView.f5655d, recyclerView.f5666i0, view, mVar);
            }
        }

        public void P(View view, Rect rect) {
            RecyclerView.g0(view, rect);
        }

        public void P0(u uVar, z zVar, View view, T.m mVar) {
            int i4 = 0;
            int h02 = l() ? h0(view) : 0;
            if (k()) {
                i4 = h0(view);
            }
            mVar.f0(m.f.a(h02, 1, i4, 1, false, false));
        }

        public int Q(View view) {
            return view.getLeft() - a0(view);
        }

        public View Q0(View view, int i4) {
            return null;
        }

        public int R(View view) {
            Rect rect = ((p) view.getLayoutParams()).f5768b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView, int i4, int i5) {
        }

        public int S(View view) {
            Rect rect = ((p) view.getLayoutParams()).f5768b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public int T(View view) {
            return view.getRight() + j0(view);
        }

        public void T0(RecyclerView recyclerView, int i4, int i5, int i6) {
        }

        public int U(View view) {
            return view.getTop() - m0(view);
        }

        public void U0(RecyclerView recyclerView, int i4, int i5) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f5743a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i4, int i5) {
        }

        public int W() {
            return this.f5760r;
        }

        public void W0(RecyclerView recyclerView, int i4, int i5, Object obj) {
            V0(recyclerView, i4, i5);
        }

        public int X() {
            return this.f5758p;
        }

        public abstract void X0(u uVar, z zVar);

        public int Y() {
            RecyclerView recyclerView = this.f5744b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.c();
            }
            return 0;
        }

        public void Y0(z zVar) {
        }

        public int Z() {
            return S.C.x(this.f5744b);
        }

        public void Z0(u uVar, z zVar, int i4, int i5) {
            this.f5744b.w(i4, i5);
        }

        public int a0(View view) {
            return ((p) view.getLayoutParams()).f5768b.left;
        }

        public boolean a1(RecyclerView recyclerView, View view, View view2) {
            return x0() || recyclerView.t0();
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return S.C.y(this.f5744b);
        }

        public boolean b1(RecyclerView recyclerView, z zVar, View view, View view2) {
            return a1(recyclerView, view, view2);
        }

        public void c(View view, int i4) {
            f(view, i4, true);
        }

        public int c0() {
            return S.C.z(this.f5744b);
        }

        public abstract void c1(Parcelable parcelable);

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public abstract Parcelable d1();

        public void e(View view, int i4) {
            f(view, i4, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e1(int i4) {
        }

        public final void f(View view, int i4, boolean z4) {
            C f02 = RecyclerView.f0(view);
            if (z4 || f02.v()) {
                this.f5744b.f5663h.b(f02);
            } else {
                this.f5744b.f5663h.p(f02);
            }
            p pVar = (p) view.getLayoutParams();
            if (f02.L() || f02.w()) {
                if (f02.w()) {
                    f02.K();
                } else {
                    f02.e();
                }
                this.f5743a.c(view, i4, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f5744b) {
                int m4 = this.f5743a.m(view);
                if (i4 == -1) {
                    i4 = this.f5743a.g();
                }
                if (m4 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f5744b.indexOfChild(view) + this.f5744b.P());
                } else if (m4 != i4) {
                    this.f5744b.f5677o.B0(m4, i4);
                }
            } else {
                this.f5743a.a(view, i4, false);
                pVar.f5769c = true;
                y yVar = this.f5749g;
                if (yVar != null && yVar.h()) {
                    this.f5749g.k(view);
                }
            }
            if (pVar.f5770d) {
                f02.f5707a.invalidate();
                pVar.f5770d = false;
            }
        }

        public int f0() {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void f1(y yVar) {
            if (this.f5749g == yVar) {
                this.f5749g = null;
            }
        }

        public void g(String str) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean g1(int i4, Bundle bundle) {
            RecyclerView recyclerView = this.f5744b;
            return h1(recyclerView.f5655d, recyclerView.f5666i0, i4, bundle);
        }

        public void h(View view, int i4) {
            i(view, i4, (p) view.getLayoutParams());
        }

        public int h0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0076 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean h1(androidx.recyclerview.widget.RecyclerView.u r8, androidx.recyclerview.widget.RecyclerView.z r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f5744b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0047
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = r9
                r3 = r2
                goto L_0x0074
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.W()
                int r11 = r7.g0()
                int r8 = r8 - r11
                int r11 = r7.d0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = r9
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f5744b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0044
                int r10 = r7.o0()
                int r11 = r7.e0()
                int r10 = r10 - r11
                int r11 = r7.f0()
                int r10 = r10 - r11
                int r10 = -r10
            L_0x0041:
                r3 = r8
                r2 = r10
                goto L_0x0074
            L_0x0044:
                r3 = r8
                r2 = r9
                goto L_0x0074
            L_0x0047:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x005c
                int r8 = r7.W()
                int r10 = r7.g0()
                int r8 = r8 - r10
                int r10 = r7.d0()
                int r8 = r8 - r10
                goto L_0x005d
            L_0x005c:
                r8 = r9
            L_0x005d:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f5744b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0044
                int r10 = r7.o0()
                int r11 = r7.e0()
                int r10 = r10 - r11
                int r11 = r7.f0()
                int r10 = r10 - r11
                goto L_0x0041
            L_0x0074:
                if (r3 != 0) goto L_0x0079
                if (r2 != 0) goto L_0x0079
                return r9
            L_0x0079:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f5744b
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r4 = 0
                r1.n1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.h1(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, int, android.os.Bundle):boolean");
        }

        public void i(View view, int i4, p pVar) {
            C f02 = RecyclerView.f0(view);
            if (f02.v()) {
                this.f5744b.f5663h.b(f02);
            } else {
                this.f5744b.f5663h.p(f02);
            }
            this.f5743a.c(view, i4, pVar, f02.v());
        }

        public boolean i1(View view, int i4, Bundle bundle) {
            RecyclerView recyclerView = this.f5744b;
            return j1(recyclerView.f5655d, recyclerView.f5666i0, view, i4, bundle);
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.j0(view));
            }
        }

        public int j0(View view) {
            return ((p) view.getLayoutParams()).f5768b.right;
        }

        public boolean j1(u uVar, z zVar, View view, int i4, Bundle bundle) {
            return false;
        }

        public abstract boolean k();

        public int k0(u uVar, z zVar) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView == null || recyclerView.f5675n == null || !l()) {
                return 1;
            }
            return this.f5744b.f5675n.c();
        }

        public void k1(u uVar) {
            for (int J4 = J() - 1; J4 >= 0; J4--) {
                if (!RecyclerView.f0(I(J4)).J()) {
                    n1(J4, uVar);
                }
            }
        }

        public abstract boolean l();

        public int l0(u uVar, z zVar) {
            return 0;
        }

        public void l1(u uVar) {
            int j4 = uVar.j();
            for (int i4 = j4 - 1; i4 >= 0; i4--) {
                View n4 = uVar.n(i4);
                C f02 = RecyclerView.f0(n4);
                if (!f02.J()) {
                    f02.G(false);
                    if (f02.x()) {
                        this.f5744b.removeDetachedView(n4, false);
                    }
                    l lVar = this.f5744b.f5641N;
                    if (lVar != null) {
                        lVar.j(f02);
                    }
                    f02.G(true);
                    uVar.y(n4);
                }
            }
            uVar.e();
            if (j4 > 0) {
                this.f5744b.invalidate();
            }
        }

        public boolean m(p pVar) {
            return pVar != null;
        }

        public int m0(View view) {
            return ((p) view.getLayoutParams()).f5768b.top;
        }

        public void m1(View view, u uVar) {
            p1(view);
            uVar.B(view);
        }

        public void n0(View view, boolean z4, Rect rect) {
            Matrix matrix;
            if (z4) {
                Rect rect2 = ((p) view.getLayoutParams()).f5768b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f5744b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f5744b.f5673m;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void n1(int i4, u uVar) {
            View I4 = I(i4);
            q1(i4);
            uVar.B(I4);
        }

        public abstract void o(int i4, int i5, z zVar, c cVar);

        public int o0() {
            return this.f5759q;
        }

        public boolean o1(Runnable runnable) {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void p(int i4, c cVar) {
        }

        public int p0() {
            return this.f5757o;
        }

        public void p1(View view) {
            this.f5743a.p(view);
        }

        public abstract int q(z zVar);

        public boolean q0() {
            int J4 = J();
            for (int i4 = 0; i4 < J4; i4++) {
                ViewGroup.LayoutParams layoutParams = I(i4).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void q1(int i4) {
            if (I(i4) != null) {
                this.f5743a.q(i4);
            }
        }

        public abstract int r(z zVar);

        public boolean r0() {
            return this.f5751i;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z4) {
            return s1(recyclerView, view, rect, z4, false);
        }

        public abstract int s(z zVar);

        public abstract boolean s0();

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z5) {
            int[] L4 = L(view, rect);
            int i4 = L4[0];
            int i5 = L4[1];
            if ((z5 && !t0(recyclerView, i4, i5)) || (i4 == 0 && i5 == 0)) {
                return false;
            }
            if (z4) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.k1(i4, i5);
            }
            return true;
        }

        public abstract int t(z zVar);

        public final boolean t0(RecyclerView recyclerView, int i4, int i5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e02 = e0();
            int g02 = g0();
            int o02 = o0() - f0();
            int W3 = W() - d0();
            Rect rect = this.f5744b.f5669k;
            P(focusedChild, rect);
            return rect.left - i4 < o02 && rect.right - i4 > e02 && rect.top - i5 < W3 && rect.bottom - i5 > g02;
        }

        public void t1() {
            RecyclerView recyclerView = this.f5744b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int u(z zVar);

        public final boolean u0() {
            return this.f5754l;
        }

        public void u1() {
            this.f5750h = true;
        }

        public abstract int v(z zVar);

        public boolean v0(u uVar, z zVar) {
            return false;
        }

        public final void v1(u uVar, int i4, View view) {
            C f02 = RecyclerView.f0(view);
            if (!f02.J()) {
                if (!f02.t() || f02.v() || this.f5744b.f5675n.g()) {
                    x(i4);
                    uVar.D(view);
                    this.f5744b.f5663h.k(f02);
                    return;
                }
                q1(i4);
                uVar.C(f02);
            }
        }

        public void w(u uVar) {
            for (int J4 = J() - 1; J4 >= 0; J4--) {
                v1(uVar, J4, I(J4));
            }
        }

        public abstract int w1(int i4, u uVar, z zVar);

        public void x(int i4) {
            y(i4, I(i4));
        }

        public boolean x0() {
            y yVar = this.f5749g;
            return yVar != null && yVar.h();
        }

        public abstract void x1(int i4);

        public final void y(int i4, View view) {
            this.f5743a.d(i4);
        }

        public boolean y0(View view, boolean z4, boolean z5) {
            boolean z6 = this.f5747e.b(view, 24579) && this.f5748f.b(view, 24579);
            return z4 ? z6 : !z6;
        }

        public abstract int y1(int i4, u uVar, z zVar);

        public void z(RecyclerView recyclerView) {
            this.f5751i = true;
            G0(recyclerView);
        }

        public void z0(View view, int i4, int i5, int i6, int i7) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f5768b;
            view.layout(i4 + rect.left + pVar.leftMargin, i5 + rect.top + pVar.topMargin, (i6 - rect.right) - pVar.rightMargin, (i7 - rect.bottom) - pVar.bottomMargin);
        }

        public void z1(RecyclerView recyclerView) {
            A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    public static abstract class q {
        public abstract boolean a(int i4, int i5);
    }

    public interface r {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z4);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i4) {
        }

        public abstract void b(RecyclerView recyclerView, int i4, int i5);
    }

    public static class t {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray f5771a = new SparseArray();

        /* renamed from: b  reason: collision with root package name */
        public int f5772b = 0;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList f5773a = new ArrayList();

            /* renamed from: b  reason: collision with root package name */
            public int f5774b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f5775c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f5776d = 0;
        }

        public void a() {
            this.f5772b++;
        }

        public void b() {
            for (int i4 = 0; i4 < this.f5771a.size(); i4++) {
                ((a) this.f5771a.valueAt(i4)).f5773a.clear();
            }
        }

        public void c() {
            this.f5772b--;
        }

        public void d(int i4, long j4) {
            a g4 = g(i4);
            g4.f5776d = j(g4.f5776d, j4);
        }

        public void e(int i4, long j4) {
            a g4 = g(i4);
            g4.f5775c = j(g4.f5775c, j4);
        }

        public C f(int i4) {
            a aVar = (a) this.f5771a.get(i4);
            if (aVar == null || aVar.f5773a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f5773a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((C) arrayList.get(size)).r()) {
                    return (C) arrayList.remove(size);
                }
            }
            return null;
        }

        public final a g(int i4) {
            a aVar = (a) this.f5771a.get(i4);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f5771a.put(i4, aVar2);
            return aVar2;
        }

        public void h(g gVar, g gVar2, boolean z4) {
            if (gVar != null) {
                c();
            }
            if (!z4 && this.f5772b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(C c4) {
            int l4 = c4.l();
            ArrayList arrayList = g(l4).f5773a;
            if (((a) this.f5771a.get(l4)).f5774b > arrayList.size()) {
                c4.D();
                arrayList.add(c4);
            }
        }

        public long j(long j4, long j5) {
            return j4 == 0 ? j5 : ((j4 / 4) * 3) + (j5 / 4);
        }

        public boolean k(int i4, long j4, long j5) {
            long j6 = g(i4).f5776d;
            return j6 == 0 || j4 + j6 < j5;
        }

        public boolean l(int i4, long j4, long j5) {
            long j6 = g(i4).f5775c;
            return j6 == 0 || j4 + j6 < j5;
        }
    }

    public final class u {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f5777a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList f5778b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f5779c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public final List f5780d;

        /* renamed from: e  reason: collision with root package name */
        public int f5781e;

        /* renamed from: f  reason: collision with root package name */
        public int f5782f;

        /* renamed from: g  reason: collision with root package name */
        public t f5783g;

        public u() {
            ArrayList arrayList = new ArrayList();
            this.f5777a = arrayList;
            this.f5780d = Collections.unmodifiableList(arrayList);
            this.f5781e = 2;
            this.f5782f = 2;
        }

        public void A(int i4) {
            a((C) this.f5779c.get(i4), true);
            this.f5779c.remove(i4);
        }

        public void B(View view) {
            C f02 = RecyclerView.f0(view);
            if (f02.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (f02.w()) {
                f02.K();
            } else if (f02.L()) {
                f02.e();
            }
            C(f02);
            if (RecyclerView.this.f5641N != null && !f02.u()) {
                RecyclerView.this.f5641N.j(f02);
            }
        }

        public void C(C c4) {
            boolean z4;
            boolean z5 = false;
            boolean z6 = true;
            if (c4.w() || c4.f5707a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(c4.w());
                sb.append(" isAttached:");
                if (c4.f5707a.getParent() != null) {
                    z5 = true;
                }
                sb.append(z5);
                sb.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb.toString());
            } else if (c4.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c4 + RecyclerView.this.P());
            } else if (!c4.J()) {
                boolean h4 = c4.h();
                g gVar = RecyclerView.this.f5675n;
                if ((gVar != null && h4 && gVar.m(c4)) || c4.u()) {
                    if (this.f5782f <= 0 || c4.p(526)) {
                        z4 = false;
                    } else {
                        int size = this.f5779c.size();
                        if (size >= this.f5782f && size > 0) {
                            A(0);
                            size--;
                        }
                        if (RecyclerView.f5621C0 && size > 0 && !RecyclerView.this.f5664h0.d(c4.f5709c)) {
                            int i4 = size - 1;
                            while (i4 >= 0) {
                                if (!RecyclerView.this.f5664h0.d(((C) this.f5779c.get(i4)).f5709c)) {
                                    break;
                                }
                                i4--;
                            }
                            size = i4 + 1;
                        }
                        this.f5779c.add(size, c4);
                        z4 = true;
                    }
                    if (!z4) {
                        a(c4, true);
                    } else {
                        z6 = false;
                    }
                    z5 = z4;
                } else {
                    z6 = false;
                }
                RecyclerView.this.f5663h.q(c4);
                if (!z5 && !z6 && h4) {
                    c4.f5724r = null;
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            }
        }

        public void D(View view) {
            C f02 = RecyclerView.f0(view);
            if (!f02.p(12) && f02.y() && !RecyclerView.this.p(f02)) {
                if (this.f5778b == null) {
                    this.f5778b = new ArrayList();
                }
                f02.H(this, true);
                this.f5778b.add(f02);
            } else if (!f02.t() || f02.v() || RecyclerView.this.f5675n.g()) {
                f02.H(this, false);
                this.f5777a.add(f02);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
            }
        }

        public void E(t tVar) {
            t tVar2 = this.f5783g;
            if (tVar2 != null) {
                tVar2.c();
            }
            this.f5783g = tVar;
            if (tVar != null && RecyclerView.this.getAdapter() != null) {
                this.f5783g.a();
            }
        }

        public void F(A a4) {
        }

        public void G(int i4) {
            this.f5781e = i4;
            K();
        }

        public final boolean H(C c4, int i4, int i5, long j4) {
            c4.f5724r = RecyclerView.this;
            int l4 = c4.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j4 != Long.MAX_VALUE && !this.f5783g.k(l4, nanoTime, j4)) {
                return false;
            }
            RecyclerView.this.f5675n.a(c4, i4);
            this.f5783g.d(c4.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(c4);
            if (!RecyclerView.this.f5666i0.e()) {
                return true;
            }
            c4.f5713g = i5;
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x014e  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0177  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x017a  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01aa  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x01b8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x01db
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.f5666i0
                int r1 = r1.b()
                if (r3 >= r1) goto L_0x01db
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.f5666i0
                boolean r1 = r1.e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$C r1 = r16.h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = r7
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = r8
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$C r1 = r16.m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.b(r5)
                boolean r5 = r1.w()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f5707a
                r5.removeDetachedView(r9, r8)
                r1.K()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.L()
                if (r5 == 0) goto L_0x0057
                r1.e()
            L_0x0057:
                r6.C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = r7
            L_0x005d:
                if (r1 != 0) goto L_0x00f5
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f5659f
                int r5 = r5.m(r3)
                if (r5 < 0) goto L_0x00f7
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f5675n
                int r9 = r9.c()
                if (r5 >= r9) goto L_0x00f7
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.f5675n
                int r9 = r9.e(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.f5675n
                boolean r10 = r10.g()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.f5675n
                long r10 = r1.d(r5)
                androidx.recyclerview.widget.RecyclerView$C r1 = r6.l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f5709c = r5
                r4 = r7
            L_0x0096:
                if (r1 != 0) goto L_0x00ad
                androidx.recyclerview.widget.RecyclerView$t r0 = r16.i()
                androidx.recyclerview.widget.RecyclerView$C r0 = r0.f(r9)
                if (r0 == 0) goto L_0x00ac
                r0.D()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f5627z0
                if (r1 == 0) goto L_0x00ac
                r6.r(r0)
            L_0x00ac:
                r1 = r0
            L_0x00ad:
                if (r1 != 0) goto L_0x00f5
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x00cb
                androidx.recyclerview.widget.RecyclerView$t r10 = r6.f5783g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.l(r11, r12, r14)
                if (r5 != 0) goto L_0x00cb
                return r2
            L_0x00cb:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.f5675n
                androidx.recyclerview.widget.RecyclerView$C r2 = r5.b(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f5621C0
                if (r5 == 0) goto L_0x00e6
                android.view.View r5 = r2.f5707a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.V(r5)
                if (r5 == 0) goto L_0x00e6
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f5708b = r10
            L_0x00e6:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$t r5 = r6.f5783g
                long r10 = r10 - r0
                r5.e(r9, r10)
                r9 = r2
            L_0x00f3:
                r10 = r4
                goto L_0x012f
            L_0x00f5:
                r9 = r1
                goto L_0x00f3
            L_0x00f7:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.f5666i0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.P()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x012f:
                if (r10 == 0) goto L_0x0167
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f5666i0
                boolean r0 = r0.e()
                if (r0 != 0) goto L_0x0167
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.p(r0)
                if (r1 == 0) goto L_0x0167
                r9.F(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f5666i0
                boolean r0 = r0.f5812k
                if (r0 == 0) goto L_0x0167
                int r0 = androidx.recyclerview.widget.RecyclerView.l.e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.f5641N
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.f5666i0
                java.util.List r4 = r9.o()
                androidx.recyclerview.widget.RecyclerView$l$b r0 = r2.t(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.Q0(r9, r0)
            L_0x0167:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f5666i0
                boolean r0 = r0.e()
                if (r0 == 0) goto L_0x017a
                boolean r0 = r9.s()
                if (r0 == 0) goto L_0x017a
                r9.f5713g = r3
                goto L_0x018d
            L_0x017a:
                boolean r0 = r9.s()
                if (r0 == 0) goto L_0x018f
                boolean r0 = r9.z()
                if (r0 != 0) goto L_0x018f
                boolean r0 = r9.t()
                if (r0 == 0) goto L_0x018d
                goto L_0x018f
            L_0x018d:
                r0 = r8
                goto L_0x01a2
            L_0x018f:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f5659f
                int r2 = r0.m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.H(r1, r2, r3, r4)
            L_0x01a2:
                android.view.View r1 = r9.f5707a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x01b8
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
                android.view.View r2 = r9.f5707a
                r2.setLayoutParams(r1)
                goto L_0x01d0
            L_0x01b8:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x01ce
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
                android.view.View r2 = r9.f5707a
                r2.setLayoutParams(r1)
                goto L_0x01d0
            L_0x01ce:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.p) r1
            L_0x01d0:
                r1.f5767a = r9
                if (r10 == 0) goto L_0x01d7
                if (r0 == 0) goto L_0x01d7
                goto L_0x01d8
            L_0x01d7:
                r7 = r8
            L_0x01d8:
                r1.f5770d = r7
                return r9
            L_0x01db:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.f5666i0
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.P()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$C");
        }

        public void J(C c4) {
            if (c4.f5721o) {
                this.f5778b.remove(c4);
            } else {
                this.f5777a.remove(c4);
            }
            c4.f5720n = null;
            c4.f5721o = false;
            c4.e();
        }

        public void K() {
            o oVar = RecyclerView.this.f5677o;
            this.f5782f = this.f5781e + (oVar != null ? oVar.f5755m : 0);
            for (int size = this.f5779c.size() - 1; size >= 0 && this.f5779c.size() > this.f5782f; size--) {
                A(size);
            }
        }

        public boolean L(C c4) {
            if (c4.v()) {
                return RecyclerView.this.f5666i0.e();
            }
            int i4 = c4.f5709c;
            if (i4 < 0 || i4 >= RecyclerView.this.f5675n.c()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c4 + RecyclerView.this.P());
            } else if (!RecyclerView.this.f5666i0.e() && RecyclerView.this.f5675n.e(c4.f5709c) != c4.l()) {
                return false;
            } else {
                if (RecyclerView.this.f5675n.g()) {
                    return c4.k() == RecyclerView.this.f5675n.d(c4.f5709c);
                }
                return true;
            }
        }

        public void M(int i4, int i5) {
            int i6;
            int i7 = i5 + i4;
            for (int size = this.f5779c.size() - 1; size >= 0; size--) {
                C c4 = (C) this.f5779c.get(size);
                if (c4 != null && (i6 = c4.f5709c) >= i4 && i6 < i7) {
                    c4.b(2);
                    A(size);
                }
            }
        }

        public void a(C c4, boolean z4) {
            RecyclerView.r(c4);
            View view = c4.f5707a;
            k kVar = RecyclerView.this.f5680p0;
            if (kVar != null) {
                C0310a n4 = kVar.n();
                S.C.g0(view, n4 instanceof k.a ? ((k.a) n4).n(view) : null);
            }
            if (z4) {
                g(c4);
            }
            c4.f5724r = null;
            i().i(c4);
        }

        public final void b(C c4) {
            if (RecyclerView.this.s0()) {
                View view = c4.f5707a;
                if (S.C.v(view) == 0) {
                    S.C.q0(view, 1);
                }
                k kVar = RecyclerView.this.f5680p0;
                if (kVar != null) {
                    C0310a n4 = kVar.n();
                    if (n4 instanceof k.a) {
                        ((k.a) n4).o(view);
                    }
                    S.C.g0(view, n4);
                }
            }
        }

        public void c() {
            this.f5777a.clear();
            z();
        }

        public void d() {
            int size = this.f5779c.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((C) this.f5779c.get(i4)).c();
            }
            int size2 = this.f5777a.size();
            for (int i5 = 0; i5 < size2; i5++) {
                ((C) this.f5777a.get(i5)).c();
            }
            ArrayList arrayList = this.f5778b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    ((C) this.f5778b.get(i6)).c();
                }
            }
        }

        public void e() {
            this.f5777a.clear();
            ArrayList arrayList = this.f5778b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i4) {
            if (i4 >= 0 && i4 < RecyclerView.this.f5666i0.b()) {
                return !RecyclerView.this.f5666i0.e() ? i4 : RecyclerView.this.f5659f.m(i4);
            }
            throw new IndexOutOfBoundsException("invalid position " + i4 + ". State item count is " + RecyclerView.this.f5666i0.b() + RecyclerView.this.P());
        }

        public void g(C c4) {
            RecyclerView.this.getClass();
            g gVar = RecyclerView.this.f5675n;
            if (gVar != null) {
                gVar.p(c4);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f5666i0 != null) {
                recyclerView.f5663h.q(c4);
            }
        }

        public C h(int i4) {
            int size;
            int m4;
            ArrayList arrayList = this.f5778b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i5 = 0;
                int i6 = 0;
                while (i6 < size) {
                    C c4 = (C) this.f5778b.get(i6);
                    if (c4.L() || c4.m() != i4) {
                        i6++;
                    } else {
                        c4.b(32);
                        return c4;
                    }
                }
                if (RecyclerView.this.f5675n.g() && (m4 = RecyclerView.this.f5659f.m(i4)) > 0 && m4 < RecyclerView.this.f5675n.c()) {
                    long d4 = RecyclerView.this.f5675n.d(m4);
                    while (i5 < size) {
                        C c5 = (C) this.f5778b.get(i5);
                        if (c5.L() || c5.k() != d4) {
                            i5++;
                        } else {
                            c5.b(32);
                            return c5;
                        }
                    }
                }
            }
            return null;
        }

        public t i() {
            if (this.f5783g == null) {
                this.f5783g = new t();
            }
            return this.f5783g;
        }

        public int j() {
            return this.f5777a.size();
        }

        public List k() {
            return this.f5780d;
        }

        public C l(long j4, int i4, boolean z4) {
            for (int size = this.f5777a.size() - 1; size >= 0; size--) {
                C c4 = (C) this.f5777a.get(size);
                if (c4.k() == j4 && !c4.L()) {
                    if (i4 == c4.l()) {
                        c4.b(32);
                        if (c4.v() && !RecyclerView.this.f5666i0.e()) {
                            c4.F(2, 14);
                        }
                        return c4;
                    } else if (!z4) {
                        this.f5777a.remove(size);
                        RecyclerView.this.removeDetachedView(c4.f5707a, false);
                        y(c4.f5707a);
                    }
                }
            }
            int size2 = this.f5779c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C c5 = (C) this.f5779c.get(size2);
                if (c5.k() == j4 && !c5.r()) {
                    if (i4 == c5.l()) {
                        if (!z4) {
                            this.f5779c.remove(size2);
                        }
                        return c5;
                    } else if (!z4) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public C m(int i4, boolean z4) {
            View e4;
            int size = this.f5777a.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                C c4 = (C) this.f5777a.get(i6);
                if (c4.L() || c4.m() != i4 || c4.t() || (!RecyclerView.this.f5666i0.f5809h && c4.v())) {
                    i6++;
                } else {
                    c4.b(32);
                    return c4;
                }
            }
            if (z4 || (e4 = RecyclerView.this.f5661g.e(i4)) == null) {
                int size2 = this.f5779c.size();
                while (i5 < size2) {
                    C c5 = (C) this.f5779c.get(i5);
                    if (c5.t() || c5.m() != i4 || c5.r()) {
                        i5++;
                    } else {
                        if (!z4) {
                            this.f5779c.remove(i5);
                        }
                        return c5;
                    }
                }
                return null;
            }
            C f02 = RecyclerView.f0(e4);
            RecyclerView.this.f5661g.s(e4);
            int m4 = RecyclerView.this.f5661g.m(e4);
            if (m4 != -1) {
                RecyclerView.this.f5661g.d(m4);
                D(e4);
                f02.b(8224);
                return f02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + f02 + RecyclerView.this.P());
        }

        public View n(int i4) {
            return ((C) this.f5777a.get(i4)).f5707a;
        }

        public View o(int i4) {
            return p(i4, false);
        }

        public View p(int i4, boolean z4) {
            return I(i4, z4, Long.MAX_VALUE).f5707a;
        }

        public final void q(ViewGroup viewGroup, boolean z4) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z4) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public final void r(C c4) {
            View view = c4.f5707a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.f5779c.size();
            for (int i4 = 0; i4 < size; i4++) {
                p pVar = (p) ((C) this.f5779c.get(i4)).f5707a.getLayoutParams();
                if (pVar != null) {
                    pVar.f5769c = true;
                }
            }
        }

        public void t() {
            int size = this.f5779c.size();
            for (int i4 = 0; i4 < size; i4++) {
                C c4 = (C) this.f5779c.get(i4);
                if (c4 != null) {
                    c4.b(6);
                    c4.a((Object) null);
                }
            }
            g gVar = RecyclerView.this.f5675n;
            if (gVar == null || !gVar.g()) {
                z();
            }
        }

        public void u(int i4, int i5) {
            int size = this.f5779c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C c4 = (C) this.f5779c.get(i6);
                if (c4 != null && c4.f5709c >= i4) {
                    c4.A(i5, true);
                }
            }
        }

        public void v(int i4, int i5) {
            int i6;
            int i7;
            int i8;
            int i9;
            if (i4 < i5) {
                i8 = -1;
                i7 = i4;
                i6 = i5;
            } else {
                i8 = 1;
                i6 = i4;
                i7 = i5;
            }
            int size = this.f5779c.size();
            for (int i10 = 0; i10 < size; i10++) {
                C c4 = (C) this.f5779c.get(i10);
                if (c4 != null && (i9 = c4.f5709c) >= i7 && i9 <= i6) {
                    if (i9 == i4) {
                        c4.A(i5 - i4, false);
                    } else {
                        c4.A(i8, false);
                    }
                }
            }
        }

        public void w(int i4, int i5, boolean z4) {
            int i6 = i4 + i5;
            for (int size = this.f5779c.size() - 1; size >= 0; size--) {
                C c4 = (C) this.f5779c.get(size);
                if (c4 != null) {
                    int i7 = c4.f5709c;
                    if (i7 >= i6) {
                        c4.A(-i5, z4);
                    } else if (i7 >= i4) {
                        c4.b(8);
                        A(size);
                    }
                }
            }
        }

        public void x(g gVar, g gVar2, boolean z4) {
            c();
            i().h(gVar, gVar2, z4);
        }

        public void y(View view) {
            C f02 = RecyclerView.f0(view);
            f02.f5720n = null;
            f02.f5721o = false;
            f02.e();
            C(f02);
        }

        public void z() {
            for (int size = this.f5779c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f5779c.clear();
            if (RecyclerView.f5621C0) {
                RecyclerView.this.f5664h0.b();
            }
        }
    }

    public interface v {
    }

    public class w extends i {
        public w() {
        }
    }

    public static abstract class y {

        /* renamed from: a  reason: collision with root package name */
        public int f5787a = -1;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f5788b;

        /* renamed from: c  reason: collision with root package name */
        public o f5789c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5790d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5791e;

        /* renamed from: f  reason: collision with root package name */
        public View f5792f;

        /* renamed from: g  reason: collision with root package name */
        public final a f5793g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        public boolean f5794h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f5795a;

            /* renamed from: b  reason: collision with root package name */
            public int f5796b;

            /* renamed from: c  reason: collision with root package name */
            public int f5797c;

            /* renamed from: d  reason: collision with root package name */
            public int f5798d;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f5799e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f5800f;

            /* renamed from: g  reason: collision with root package name */
            public int f5801g;

            public a(int i4, int i5) {
                this(i4, i5, Integer.MIN_VALUE, (Interpolator) null);
            }

            public boolean a() {
                return this.f5798d >= 0;
            }

            public void b(int i4) {
                this.f5798d = i4;
            }

            public void c(RecyclerView recyclerView) {
                int i4 = this.f5798d;
                if (i4 >= 0) {
                    this.f5798d = -1;
                    recyclerView.v0(i4);
                    this.f5800f = false;
                } else if (this.f5800f) {
                    e();
                    recyclerView.f5660f0.f(this.f5795a, this.f5796b, this.f5797c, this.f5799e);
                    int i5 = this.f5801g + 1;
                    this.f5801g = i5;
                    if (i5 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f5800f = false;
                } else {
                    this.f5801g = 0;
                }
            }

            public void d(int i4, int i5, int i6, Interpolator interpolator) {
                this.f5795a = i4;
                this.f5796b = i5;
                this.f5797c = i6;
                this.f5799e = interpolator;
                this.f5800f = true;
            }

            public final void e() {
                if (this.f5799e != null && this.f5797c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f5797c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i4, int i5, int i6, Interpolator interpolator) {
                this.f5798d = -1;
                this.f5800f = false;
                this.f5801g = 0;
                this.f5795a = i4;
                this.f5796b = i5;
                this.f5797c = i6;
                this.f5799e = interpolator;
            }
        }

        public interface b {
            PointF a(int i4);
        }

        public PointF a(int i4) {
            o e4 = e();
            if (e4 instanceof b) {
                return ((b) e4).a(i4);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i4) {
            return this.f5788b.f5677o.C(i4);
        }

        public int c() {
            return this.f5788b.f5677o.J();
        }

        public int d(View view) {
            return this.f5788b.d0(view);
        }

        public o e() {
            return this.f5789c;
        }

        public int f() {
            return this.f5787a;
        }

        public boolean g() {
            return this.f5790d;
        }

        public boolean h() {
            return this.f5791e;
        }

        public void i(PointF pointF) {
            float f4 = pointF.x;
            float f5 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f4 * f4) + (f5 * f5)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void j(int i4, int i5) {
            PointF a4;
            RecyclerView recyclerView = this.f5788b;
            if (this.f5787a == -1 || recyclerView == null) {
                r();
            }
            if (this.f5790d && this.f5792f == null && this.f5789c != null && (a4 = a(this.f5787a)) != null) {
                float f4 = a4.x;
                if (!(f4 == 0.0f && a4.y == 0.0f)) {
                    recyclerView.f1((int) Math.signum(f4), (int) Math.signum(a4.y), (int[]) null);
                }
            }
            this.f5790d = false;
            View view = this.f5792f;
            if (view != null) {
                if (d(view) == this.f5787a) {
                    o(this.f5792f, recyclerView.f5666i0, this.f5793g);
                    this.f5793g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f5792f = null;
                }
            }
            if (this.f5791e) {
                l(i4, i5, recyclerView.f5666i0, this.f5793g);
                boolean a5 = this.f5793g.a();
                this.f5793g.c(recyclerView);
                if (a5 && this.f5791e) {
                    this.f5790d = true;
                    recyclerView.f5660f0.e();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f5792f = view;
            }
        }

        public abstract void l(int i4, int i5, z zVar, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, z zVar, a aVar);

        public void p(int i4) {
            this.f5787a = i4;
        }

        public void q(RecyclerView recyclerView, o oVar) {
            recyclerView.f5660f0.g();
            if (this.f5794h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f5788b = recyclerView;
            this.f5789c = oVar;
            int i4 = this.f5787a;
            if (i4 != -1) {
                recyclerView.f5666i0.f5802a = i4;
                this.f5791e = true;
                this.f5790d = true;
                this.f5792f = b(f());
                m();
                this.f5788b.f5660f0.e();
                this.f5794h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final void r() {
            if (this.f5791e) {
                this.f5791e = false;
                n();
                this.f5788b.f5666i0.f5802a = -1;
                this.f5792f = null;
                this.f5787a = -1;
                this.f5790d = false;
                this.f5789c.f1(this);
                this.f5789c = null;
                this.f5788b = null;
            }
        }
    }

    public static class z {

        /* renamed from: a  reason: collision with root package name */
        public int f5802a = -1;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray f5803b;

        /* renamed from: c  reason: collision with root package name */
        public int f5804c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f5805d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f5806e = 1;

        /* renamed from: f  reason: collision with root package name */
        public int f5807f = 0;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5808g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5809h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5810i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5811j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5812k = false;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5813l = false;

        /* renamed from: m  reason: collision with root package name */
        public int f5814m;

        /* renamed from: n  reason: collision with root package name */
        public long f5815n;

        /* renamed from: o  reason: collision with root package name */
        public int f5816o;

        /* renamed from: p  reason: collision with root package name */
        public int f5817p;

        /* renamed from: q  reason: collision with root package name */
        public int f5818q;

        public void a(int i4) {
            if ((this.f5806e & i4) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i4) + " but it is " + Integer.toBinaryString(this.f5806e));
            }
        }

        public int b() {
            return this.f5809h ? this.f5804c - this.f5805d : this.f5807f;
        }

        public int c() {
            return this.f5802a;
        }

        public boolean d() {
            return this.f5802a != -1;
        }

        public boolean e() {
            return this.f5809h;
        }

        public void f(g gVar) {
            this.f5806e = 1;
            this.f5807f = gVar.c();
            this.f5809h = false;
            this.f5810i = false;
            this.f5811j = false;
        }

        public boolean g() {
            return this.f5813l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f5802a + ", mData=" + this.f5803b + ", mItemCount=" + this.f5807f + ", mIsMeasuring=" + this.f5811j + ", mPreviousLayoutItemCount=" + this.f5804c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5805d + ", mStructureChanged=" + this.f5808g + ", mInPreLayout=" + this.f5809h + ", mRunSimpleAnimations=" + this.f5812k + ", mRunPredictiveAnimations=" + this.f5813l + '}';
        }
    }

    static {
        Class cls = Integer.TYPE;
        f5624F0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0919a.f11985a);
    }

    public static RecyclerView V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            RecyclerView V3 = V(viewGroup.getChildAt(i4));
            if (V3 != null) {
                return V3;
            }
        }
        return null;
    }

    public static C f0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f5767a;
    }

    public static void g0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f5768b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    private S.r getScrollingChildHelper() {
        if (this.f5684r0 == null) {
            this.f5684r0 = new S.r(this);
        }
        return this.f5684r0;
    }

    public static void r(C c4) {
        WeakReference weakReference = c4.f5708b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != c4.f5707a) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            c4.f5708b = null;
        }
    }

    public final void A() {
        int i4 = this.f5628A;
        this.f5628A = 0;
        if (i4 != 0 && s0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            T.b.b(obtain, i4);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    public void A0(int i4, int i5) {
        int j4 = this.f5661g.j();
        for (int i6 = 0; i6 < j4; i6++) {
            C f02 = f0(this.f5661g.i(i6));
            if (f02 != null && !f02.J() && f02.f5709c >= i4) {
                f02.A(i5, false);
                this.f5666i0.f5808g = true;
            }
        }
        this.f5655d.u(i4, i5);
        requestLayout();
    }

    public void B() {
        if (this.f5675n == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f5677o == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            z zVar = this.f5666i0;
            zVar.f5811j = false;
            if (zVar.f5806e == 1) {
                C();
                this.f5677o.z1(this);
                D();
            } else if (!this.f5659f.q() && this.f5677o.o0() == getWidth() && this.f5677o.W() == getHeight()) {
                this.f5677o.z1(this);
            } else {
                this.f5677o.z1(this);
                D();
            }
            E();
        }
    }

    public void B0(int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int j4 = this.f5661g.j();
        if (i4 < i5) {
            i8 = -1;
            i7 = i4;
            i6 = i5;
        } else {
            i6 = i4;
            i7 = i5;
            i8 = 1;
        }
        for (int i10 = 0; i10 < j4; i10++) {
            C f02 = f0(this.f5661g.i(i10));
            if (f02 != null && (i9 = f02.f5709c) >= i7 && i9 <= i6) {
                if (i9 == i4) {
                    f02.A(i5 - i4, false);
                } else {
                    f02.A(i8, false);
                }
                this.f5666i0.f5808g = true;
            }
        }
        this.f5655d.v(i4, i5);
        requestLayout();
    }

    public final void C() {
        boolean z4 = true;
        this.f5666i0.a(1);
        Q(this.f5666i0);
        this.f5666i0.f5811j = false;
        p1();
        this.f5663h.f();
        F0();
        N0();
        c1();
        z zVar = this.f5666i0;
        if (!zVar.f5812k || !this.f5674m0) {
            z4 = false;
        }
        zVar.f5810i = z4;
        this.f5674m0 = false;
        this.f5672l0 = false;
        zVar.f5809h = zVar.f5813l;
        zVar.f5807f = this.f5675n.c();
        U(this.f5682q0);
        if (this.f5666i0.f5812k) {
            int g4 = this.f5661g.g();
            for (int i4 = 0; i4 < g4; i4++) {
                C f02 = f0(this.f5661g.f(i4));
                if (!f02.J() && (!f02.t() || this.f5675n.g())) {
                    this.f5663h.e(f02, this.f5641N.t(this.f5666i0, f02, l.e(f02), f02.o()));
                    if (this.f5666i0.f5810i && f02.y() && !f02.v() && !f02.J() && !f02.t()) {
                        this.f5663h.c(c0(f02), f02);
                    }
                }
            }
        }
        if (this.f5666i0.f5813l) {
            d1();
            z zVar2 = this.f5666i0;
            boolean z5 = zVar2.f5808g;
            zVar2.f5808g = false;
            this.f5677o.X0(this.f5655d, zVar2);
            this.f5666i0.f5808g = z5;
            for (int i5 = 0; i5 < this.f5661g.g(); i5++) {
                C f03 = f0(this.f5661g.f(i5));
                if (!f03.J() && !this.f5663h.i(f03)) {
                    int e4 = l.e(f03);
                    boolean p4 = f03.p(8192);
                    if (!p4) {
                        e4 |= 4096;
                    }
                    l.b t4 = this.f5641N.t(this.f5666i0, f03, e4, f03.o());
                    if (p4) {
                        Q0(f03, t4);
                    } else {
                        this.f5663h.a(f03, t4);
                    }
                }
            }
            s();
        } else {
            s();
        }
        G0();
        r1(false);
        this.f5666i0.f5806e = 2;
    }

    public void C0(int i4, int i5, boolean z4) {
        int i6 = i4 + i5;
        int j4 = this.f5661g.j();
        for (int i7 = 0; i7 < j4; i7++) {
            C f02 = f0(this.f5661g.i(i7));
            if (f02 != null && !f02.J()) {
                int i8 = f02.f5709c;
                if (i8 >= i6) {
                    f02.A(-i5, z4);
                    this.f5666i0.f5808g = true;
                } else if (i8 >= i4) {
                    f02.i(i4 - 1, -i5, z4);
                    this.f5666i0.f5808g = true;
                }
            }
        }
        this.f5655d.w(i4, i5, z4);
        requestLayout();
    }

    public final void D() {
        p1();
        F0();
        this.f5666i0.a(6);
        this.f5659f.j();
        this.f5666i0.f5807f = this.f5675n.c();
        z zVar = this.f5666i0;
        zVar.f5805d = 0;
        zVar.f5809h = false;
        this.f5677o.X0(this.f5655d, zVar);
        z zVar2 = this.f5666i0;
        zVar2.f5808g = false;
        this.f5657e = null;
        zVar2.f5812k = zVar2.f5812k && this.f5641N != null;
        zVar2.f5806e = 4;
        G0();
        r1(false);
    }

    public void D0(View view) {
    }

    public final void E() {
        this.f5666i0.a(4);
        p1();
        F0();
        z zVar = this.f5666i0;
        zVar.f5806e = 1;
        if (zVar.f5812k) {
            for (int g4 = this.f5661g.g() - 1; g4 >= 0; g4--) {
                C f02 = f0(this.f5661g.f(g4));
                if (!f02.J()) {
                    long c02 = c0(f02);
                    l.b s4 = this.f5641N.s(this.f5666i0, f02);
                    C g5 = this.f5663h.g(c02);
                    if (g5 == null || g5.J()) {
                        this.f5663h.d(f02, s4);
                    } else {
                        boolean h4 = this.f5663h.h(g5);
                        boolean h5 = this.f5663h.h(f02);
                        if (!h4 || g5 != f02) {
                            l.b n4 = this.f5663h.n(g5);
                            this.f5663h.d(f02, s4);
                            l.b m4 = this.f5663h.m(f02);
                            if (n4 == null) {
                                k0(c02, f02, g5);
                            } else {
                                m(g5, f02, n4, m4, h4, h5);
                            }
                        } else {
                            this.f5663h.d(f02, s4);
                        }
                    }
                }
            }
            this.f5663h.o(this.f5696x0);
        }
        this.f5677o.l1(this.f5655d);
        z zVar2 = this.f5666i0;
        zVar2.f5804c = zVar2.f5807f;
        this.f5632E = false;
        this.f5633F = false;
        zVar2.f5812k = false;
        zVar2.f5813l = false;
        this.f5677o.f5750h = false;
        ArrayList arrayList = this.f5655d.f5778b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.f5677o;
        if (oVar.f5756n) {
            oVar.f5755m = 0;
            oVar.f5756n = false;
            this.f5655d.K();
        }
        this.f5677o.Y0(this.f5666i0);
        G0();
        r1(false);
        this.f5663h.f();
        int[] iArr = this.f5682q0;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        R0();
        a1();
    }

    public void E0(View view) {
    }

    public boolean F(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return getScrollingChildHelper().d(i4, i5, iArr, iArr2, i6);
    }

    public void F0() {
        this.f5634G++;
    }

    public final void G(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        getScrollingChildHelper().e(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    public void G0() {
        H0(true);
    }

    public void H(int i4) {
        o oVar = this.f5677o;
        if (oVar != null) {
            oVar.e1(i4);
        }
        J0(i4);
        s sVar = this.f5668j0;
        if (sVar != null) {
            sVar.a(this, i4);
        }
        List list = this.f5670k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f5670k0.get(size)).a(this, i4);
            }
        }
    }

    public void H0(boolean z4) {
        int i4 = this.f5634G - 1;
        this.f5634G = i4;
        if (i4 < 1) {
            this.f5634G = 0;
            if (z4) {
                A();
                J();
            }
        }
    }

    public void I(int i4, int i5) {
        this.f5635H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i4, scrollY - i5);
        K0(i4, i5);
        s sVar = this.f5668j0;
        if (sVar != null) {
            sVar.b(this, i4, i5);
        }
        List list = this.f5670k0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f5670k0.get(size)).b(this, i4, i5);
            }
        }
        this.f5635H--;
    }

    public final void I0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5643P) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f5643P = motionEvent.getPointerId(i4);
            int x4 = (int) (motionEvent.getX(i4) + 0.5f);
            this.f5647T = x4;
            this.f5645R = x4;
            int y4 = (int) (motionEvent.getY(i4) + 0.5f);
            this.f5648U = y4;
            this.f5646S = y4;
        }
    }

    public void J() {
        int i4;
        for (int size = this.f5692v0.size() - 1; size >= 0; size--) {
            C c4 = (C) this.f5692v0.get(size);
            if (c4.f5707a.getParent() == this && !c4.J() && (i4 = c4.f5723q) != -1) {
                S.C.q0(c4.f5707a, i4);
                c4.f5723q = -1;
            }
        }
        this.f5692v0.clear();
    }

    public void J0(int i4) {
    }

    public final boolean K(MotionEvent motionEvent) {
        r rVar = this.f5683r;
        if (rVar != null) {
            rVar.b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f5683r = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return T(motionEvent);
        }
    }

    public void K0(int i4, int i5) {
    }

    public void L() {
        if (this.f5640M == null) {
            EdgeEffect a4 = this.f5636I.a(this, 3);
            this.f5640M = a4;
            if (this.f5665i) {
                a4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a4.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void L0() {
        if (!this.f5678o0 && this.f5685s) {
            S.C.Y(this, this.f5694w0);
            this.f5678o0 = true;
        }
    }

    public void M() {
        if (this.f5637J == null) {
            EdgeEffect a4 = this.f5636I.a(this, 0);
            this.f5637J = a4;
            if (this.f5665i) {
                a4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a4.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final boolean M0() {
        return this.f5641N != null && this.f5677o.L1();
    }

    public void N() {
        if (this.f5639L == null) {
            EdgeEffect a4 = this.f5636I.a(this, 2);
            this.f5639L = a4;
            if (this.f5665i) {
                a4.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a4.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void N0() {
        boolean z4;
        if (this.f5632E) {
            this.f5659f.u();
            if (this.f5633F) {
                this.f5677o.S0(this);
            }
        }
        if (M0()) {
            this.f5659f.s();
        } else {
            this.f5659f.j();
        }
        boolean z5 = true;
        boolean z6 = this.f5672l0 || this.f5674m0;
        this.f5666i0.f5812k = this.f5691v && this.f5641N != null && ((z4 = this.f5632E) || z6 || this.f5677o.f5750h) && (!z4 || this.f5675n.g());
        z zVar = this.f5666i0;
        if (!zVar.f5812k || !z6 || this.f5632E || !M0()) {
            z5 = false;
        }
        zVar.f5813l = z5;
    }

    public void O() {
        if (this.f5638K == null) {
            EdgeEffect a4 = this.f5636I.a(this, 1);
            this.f5638K = a4;
            if (this.f5665i) {
                a4.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a4.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void O0(boolean z4) {
        this.f5633F = z4 | this.f5633F;
        this.f5632E = true;
        x0();
    }

    public String P() {
        return " " + super.toString() + ", adapter:" + this.f5675n + ", layout:" + this.f5677o + ", context:" + getContext();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.M()
            android.widget.EdgeEffect r1 = r6.f5637J
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            X.d.c(r1, r4, r9)
        L_0x001f:
            r9 = r3
            goto L_0x003c
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003b
            r6.N()
            android.widget.EdgeEffect r1 = r6.f5639L
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            X.d.c(r1, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            r6.O()
            android.widget.EdgeEffect r9 = r6.f5638K
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            X.d.c(r9, r1, r7)
            goto L_0x0072
        L_0x0056:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            r6.L()
            android.widget.EdgeEffect r9 = r6.f5640M
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            X.d.c(r9, r1, r2)
            goto L_0x0072
        L_0x0071:
            r3 = r9
        L_0x0072:
            if (r3 != 0) goto L_0x007c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            S.C.X(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.P0(float, float, float, float):void");
    }

    public final void Q(z zVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f5660f0.f5701g;
            zVar.f5817p = overScroller.getFinalX() - overScroller.getCurrX();
            zVar.f5818q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        zVar.f5817p = 0;
        zVar.f5818q = 0;
    }

    public void Q0(C c4, l.b bVar) {
        c4.F(0, 8192);
        if (this.f5666i0.f5810i && c4.y() && !c4.v() && !c4.J()) {
            this.f5663h.c(c0(c4), c4);
        }
        this.f5663h.e(c4, bVar);
    }

    public View R(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final void R0() {
        View findViewById;
        if (this.f5658e0 && this.f5675n != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f5623E0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f5661g.n(focusedChild)) {
                            return;
                        }
                    } else if (this.f5661g.g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                C Y3 = (this.f5666i0.f5815n == -1 || !this.f5675n.g()) ? null : Y(this.f5666i0.f5815n);
                if (Y3 != null && !this.f5661g.n(Y3.f5707a) && Y3.f5707a.hasFocusable()) {
                    view = Y3.f5707a;
                } else if (this.f5661g.g() > 0) {
                    view = W();
                }
                if (view != null) {
                    int i4 = this.f5666i0.f5816o;
                    if (!(((long) i4) == -1 || (findViewById = view.findViewById(i4)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    public C S(View view) {
        View R3 = R(view);
        if (R3 == null) {
            return null;
        }
        return e0(R3);
    }

    public final void S0() {
        boolean z4;
        EdgeEffect edgeEffect = this.f5637J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z4 = this.f5637J.isFinished();
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f5638K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z4 |= this.f5638K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5639L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z4 |= this.f5639L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5640M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z4 |= this.f5640M.isFinished();
        }
        if (z4) {
            S.C.X(this);
        }
    }

    public final boolean T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f5681q.size();
        int i4 = 0;
        while (i4 < size) {
            r rVar = (r) this.f5681q.get(i4);
            if (!rVar.a(this, motionEvent) || action == 3) {
                i4++;
            } else {
                this.f5683r = rVar;
                return true;
            }
        }
        return false;
    }

    public void T0() {
        l lVar = this.f5641N;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.f5677o;
        if (oVar != null) {
            oVar.k1(this.f5655d);
            this.f5677o.l1(this.f5655d);
        }
        this.f5655d.c();
    }

    public final void U(int[] iArr) {
        int g4 = this.f5661g.g();
        if (g4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        for (int i6 = 0; i6 < g4; i6++) {
            C f02 = f0(this.f5661g.f(i6));
            if (!f02.J()) {
                int m4 = f02.m();
                if (m4 < i4) {
                    i4 = m4;
                }
                if (m4 > i5) {
                    i5 = m4;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
    }

    public boolean U0(View view) {
        p1();
        boolean r4 = this.f5661g.r(view);
        if (r4) {
            C f02 = f0(view);
            this.f5655d.J(f02);
            this.f5655d.C(f02);
        }
        r1(!r4);
        return r4;
    }

    public void V0(n nVar) {
        o oVar = this.f5677o;
        if (oVar != null) {
            oVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f5679p.remove(nVar);
        if (this.f5679p.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        w0();
        requestLayout();
    }

    public final View W() {
        C X3;
        z zVar = this.f5666i0;
        int i4 = zVar.f5814m;
        if (i4 == -1) {
            i4 = 0;
        }
        int b4 = zVar.b();
        int i5 = i4;
        while (i5 < b4) {
            C X4 = X(i5);
            if (X4 == null) {
                break;
            } else if (X4.f5707a.hasFocusable()) {
                return X4.f5707a;
            } else {
                i5++;
            }
        }
        int min = Math.min(b4, i4);
        while (true) {
            min--;
            if (min < 0 || (X3 = X(min)) == null) {
                return null;
            }
            if (X3.f5707a.hasFocusable()) {
                return X3.f5707a;
            }
        }
    }

    public void W0(r rVar) {
        this.f5681q.remove(rVar);
        if (this.f5683r == rVar) {
            this.f5683r = null;
        }
    }

    public C X(int i4) {
        C c4 = null;
        if (this.f5632E) {
            return null;
        }
        int j4 = this.f5661g.j();
        for (int i5 = 0; i5 < j4; i5++) {
            C f02 = f0(this.f5661g.i(i5));
            if (f02 != null && !f02.v() && b0(f02) == i4) {
                if (!this.f5661g.n(f02.f5707a)) {
                    return f02;
                }
                c4 = f02;
            }
        }
        return c4;
    }

    public void X0(s sVar) {
        List list = this.f5670k0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public C Y(long j4) {
        g gVar = this.f5675n;
        C c4 = null;
        if (gVar != null && gVar.g()) {
            int j5 = this.f5661g.j();
            for (int i4 = 0; i4 < j5; i4++) {
                C f02 = f0(this.f5661g.i(i4));
                if (f02 != null && !f02.v() && f02.k() == j4) {
                    if (!this.f5661g.n(f02.f5707a)) {
                        return f02;
                    }
                    c4 = f02;
                }
            }
        }
        return c4;
    }

    public void Y0() {
        C c4;
        int g4 = this.f5661g.g();
        for (int i4 = 0; i4 < g4; i4++) {
            View f4 = this.f5661g.f(i4);
            C e02 = e0(f4);
            if (!(e02 == null || (c4 = e02.f5715i) == null)) {
                View view = c4.f5707a;
                int left = f4.getLeft();
                int top = f4.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public C Z(int i4, boolean z4) {
        int j4 = this.f5661g.j();
        C c4 = null;
        for (int i5 = 0; i5 < j4; i5++) {
            C f02 = f0(this.f5661g.i(i5));
            if (f02 != null && !f02.v()) {
                if (z4) {
                    if (f02.f5709c != i4) {
                        continue;
                    }
                } else if (f02.m() != i4) {
                    continue;
                }
                if (!this.f5661g.n(f02.f5707a)) {
                    return f02;
                }
                c4 = f02;
            }
        }
        return c4;
    }

    public final void Z0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f5669k.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f5769c) {
                Rect rect = pVar.f5768b;
                Rect rect2 = this.f5669k;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f5669k);
            offsetRectIntoDescendantCoords(view, this.f5669k);
        }
        this.f5677o.s1(this, view, this.f5669k, !this.f5691v, view2 == null);
    }

    public void a(int i4, int i5) {
        if (i4 < 0) {
            M();
            if (this.f5637J.isFinished()) {
                this.f5637J.onAbsorb(-i4);
            }
        } else if (i4 > 0) {
            N();
            if (this.f5639L.isFinished()) {
                this.f5639L.onAbsorb(i4);
            }
        }
        if (i5 < 0) {
            O();
            if (this.f5638K.isFinished()) {
                this.f5638K.onAbsorb(-i5);
            }
        } else if (i5 > 0) {
            L();
            if (this.f5640M.isFinished()) {
                this.f5640M.onAbsorb(i5);
            }
        }
        if (i4 != 0 || i5 != 0) {
            S.C.X(this);
        }
    }

    public boolean a0(int i4, int i5) {
        o oVar = this.f5677o;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f5697y) {
            return false;
        } else {
            boolean k4 = oVar.k();
            boolean l4 = this.f5677o.l();
            if (!k4 || Math.abs(i4) < this.f5651a0) {
                i4 = 0;
            }
            if (!l4 || Math.abs(i5) < this.f5651a0) {
                i5 = 0;
            }
            if (i4 == 0 && i5 == 0) {
                return false;
            }
            float f4 = (float) i4;
            float f5 = (float) i5;
            if (!dispatchNestedPreFling(f4, f5)) {
                boolean z4 = k4 || l4;
                dispatchNestedFling(f4, f5, z4);
                q qVar = this.f5650W;
                if (qVar != null && qVar.a(i4, i5)) {
                    return true;
                }
                if (z4) {
                    if (l4) {
                        k4 |= true;
                    }
                    q1(k4 ? 1 : 0, 1);
                    int i6 = this.f5652b0;
                    int max = Math.max(-i6, Math.min(i4, i6));
                    int i7 = this.f5652b0;
                    this.f5660f0.c(max, Math.max(-i7, Math.min(i5, i7)));
                    return true;
                }
            }
            return false;
        }
    }

    public final void a1() {
        z zVar = this.f5666i0;
        zVar.f5815n = -1;
        zVar.f5814m = -1;
        zVar.f5816o = -1;
    }

    public void addFocusables(ArrayList arrayList, int i4, int i5) {
        o oVar = this.f5677o;
        if (oVar == null || !oVar.F0(this, arrayList, i4, i5)) {
            super.addFocusables(arrayList, i4, i5);
        }
    }

    public int b0(C c4) {
        if (c4.p(524) || !c4.s()) {
            return -1;
        }
        return this.f5659f.e(c4.f5709c);
    }

    public final void b1() {
        VelocityTracker velocityTracker = this.f5644Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        s1(0);
        S0();
    }

    public long c0(C c4) {
        return this.f5675n.g() ? c4.k() : (long) c4.f5709c;
    }

    public final void c1() {
        C c4 = null;
        View focusedChild = (!this.f5658e0 || !hasFocus() || this.f5675n == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            c4 = S(focusedChild);
        }
        if (c4 == null) {
            a1();
            return;
        }
        this.f5666i0.f5815n = this.f5675n.g() ? c4.k() : -1;
        this.f5666i0.f5814m = this.f5632E ? -1 : c4.v() ? c4.f5710d : c4.j();
        this.f5666i0.f5816o = h0(c4.f5707a);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.f5677o.m((p) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        o oVar = this.f5677o;
        if (oVar != null && oVar.k()) {
            return this.f5677o.q(this.f5666i0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        o oVar = this.f5677o;
        if (oVar != null && oVar.k()) {
            return this.f5677o.r(this.f5666i0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        o oVar = this.f5677o;
        if (oVar != null && oVar.k()) {
            return this.f5677o.s(this.f5666i0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        o oVar = this.f5677o;
        if (oVar != null && oVar.l()) {
            return this.f5677o.t(this.f5666i0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        o oVar = this.f5677o;
        if (oVar != null && oVar.l()) {
            return this.f5677o.u(this.f5666i0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        o oVar = this.f5677o;
        if (oVar != null && oVar.l()) {
            return this.f5677o.v(this.f5666i0);
        }
        return 0;
    }

    public int d0(View view) {
        C f02 = f0(view);
        if (f02 != null) {
            return f02.m();
        }
        return -1;
    }

    public void d1() {
        int j4 = this.f5661g.j();
        for (int i4 = 0; i4 < j4; i4++) {
            C f02 = f0(this.f5661g.i(i4));
            if (!f02.J()) {
                f02.E();
            }
        }
    }

    public boolean dispatchNestedFling(float f4, float f5, boolean z4) {
        return getScrollingChildHelper().a(f4, f5, z4);
    }

    public boolean dispatchNestedPreFling(float f4, float f5) {
        return getScrollingChildHelper().b(f4, f5);
    }

    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().f(i4, i5, i6, i7, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        int size = this.f5679p.size();
        boolean z5 = false;
        for (int i4 = 0; i4 < size; i4++) {
            ((n) this.f5679p.get(i4)).i(canvas, this, this.f5666i0);
        }
        EdgeEffect edgeEffect = this.f5637J;
        boolean z6 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f5665i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f5637J;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f5638K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f5665i) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5638K;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f5639L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5665i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.f5639L;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f5640M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5665i) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f5640M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z5 = true;
            }
            z4 |= z5;
            canvas.restoreToCount(save4);
        }
        if (z4 || this.f5641N == null || this.f5679p.size() <= 0 || !this.f5641N.p()) {
            z6 = z4;
        }
        if (z6) {
            S.C.X(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public C e0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return f0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean e1(int i4, int i5, MotionEvent motionEvent) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = i4;
        int i11 = i5;
        MotionEvent motionEvent2 = motionEvent;
        u();
        if (this.f5675n != null) {
            int[] iArr = this.f5690u0;
            iArr[0] = 0;
            iArr[1] = 0;
            f1(i10, i11, iArr);
            int[] iArr2 = this.f5690u0;
            int i12 = iArr2[0];
            int i13 = iArr2[1];
            i9 = i13;
            i8 = i12;
            i7 = i10 - i12;
            i6 = i11 - i13;
        } else {
            i9 = 0;
            i8 = 0;
            i7 = 0;
            i6 = 0;
        }
        if (!this.f5679p.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f5690u0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i8, i9, i7, i6, this.f5686s0, 0, iArr3);
        int[] iArr4 = this.f5690u0;
        int i14 = iArr4[0];
        int i15 = i7 - i14;
        int i16 = iArr4[1];
        int i17 = i6 - i16;
        boolean z4 = (i14 == 0 && i16 == 0) ? false : true;
        int i18 = this.f5647T;
        int[] iArr5 = this.f5686s0;
        int i19 = iArr5[0];
        this.f5647T = i18 - i19;
        int i20 = this.f5648U;
        int i21 = iArr5[1];
        this.f5648U = i20 - i21;
        int[] iArr6 = this.f5688t0;
        iArr6[0] = iArr6[0] + i19;
        iArr6[1] = iArr6[1] + i21;
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C0325p.a(motionEvent2, 8194)) {
                P0(motionEvent.getX(), (float) i15, motionEvent.getY(), (float) i17);
            }
            t(i4, i5);
        }
        if (!(i8 == 0 && i9 == 0)) {
            I(i8, i9);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i8 == 0 && i9 == 0) ? false : true;
    }

    public void f1(int i4, int i5, int[] iArr) {
        p1();
        F0();
        O.g.a("RV Scroll");
        Q(this.f5666i0);
        int w12 = i4 != 0 ? this.f5677o.w1(i4, this.f5655d, this.f5666i0) : 0;
        int y12 = i5 != 0 ? this.f5677o.y1(i5, this.f5655d, this.f5666i0) : 0;
        O.g.b();
        Y0();
        G0();
        r1(false);
        if (iArr != null) {
            iArr[0] = w12;
            iArr[1] = y12;
        }
    }

    public View focusSearch(View view, int i4) {
        View view2;
        boolean z4;
        View Q02 = this.f5677o.Q0(view, i4);
        if (Q02 != null) {
            return Q02;
        }
        boolean z5 = true;
        boolean z6 = this.f5675n != null && this.f5677o != null && !t0() && !this.f5697y;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z6 || !(i4 == 2 || i4 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i4);
            if (findNextFocus != null || !z6) {
                view2 = findNextFocus;
            } else {
                u();
                if (R(view) == null) {
                    return null;
                }
                p1();
                view2 = this.f5677o.J0(view, i4, this.f5655d, this.f5666i0);
                r1(false);
            }
        } else {
            if (this.f5677o.l()) {
                int i5 = i4 == 2 ? 130 : 33;
                z4 = instance.findNextFocus(this, view, i5) == null;
                if (f5622D0) {
                    i4 = i5;
                }
            } else {
                z4 = false;
            }
            if (!z4 && this.f5677o.k()) {
                int i6 = (this.f5677o.Z() == 1) ^ (i4 == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i6) != null) {
                    z5 = false;
                }
                if (f5622D0) {
                    i4 = i6;
                }
                z4 = z5;
            }
            if (z4) {
                u();
                if (R(view) == null) {
                    return null;
                }
                p1();
                this.f5677o.J0(view, i4, this.f5655d, this.f5666i0);
                r1(false);
            }
            view2 = instance.findNextFocus(this, view, i4);
        }
        if (view2 == null || view2.hasFocusable()) {
            return u0(view, view2, i4) ? view2 : super.focusSearch(view, i4);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i4);
        }
        Z0(view2, (View) null);
        return view;
    }

    public final void g(C c4) {
        View view = c4.f5707a;
        boolean z4 = view.getParent() == this;
        this.f5655d.J(e0(view));
        if (c4.x()) {
            this.f5661g.c(view, -1, view.getLayoutParams(), true);
        } else if (!z4) {
            this.f5661g.b(view, true);
        } else {
            this.f5661g.k(view);
        }
    }

    public void g1(int i4) {
        if (!this.f5697y) {
            t1();
            o oVar = this.f5677o;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.x1(i4);
            awakenScrollBars();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f5677o;
        if (oVar != null) {
            return oVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f5677o;
        if (oVar != null) {
            return oVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.f5675n;
    }

    public int getBaseline() {
        o oVar = this.f5677o;
        return oVar != null ? oVar.G() : super.getBaseline();
    }

    public int getChildDrawingOrder(int i4, int i5) {
        return super.getChildDrawingOrder(i4, i5);
    }

    public boolean getClipToPadding() {
        return this.f5665i;
    }

    public k getCompatAccessibilityDelegate() {
        return this.f5680p0;
    }

    public k getEdgeEffectFactory() {
        return this.f5636I;
    }

    public l getItemAnimator() {
        return this.f5641N;
    }

    public int getItemDecorationCount() {
        return this.f5679p.size();
    }

    public o getLayoutManager() {
        return this.f5677o;
    }

    public int getMaxFlingVelocity() {
        return this.f5652b0;
    }

    public int getMinFlingVelocity() {
        return this.f5651a0;
    }

    public long getNanoTime() {
        if (f5621C0) {
            return System.nanoTime();
        }
        return 0;
    }

    public q getOnFlingListener() {
        return this.f5650W;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5658e0;
    }

    public t getRecycledViewPool() {
        return this.f5655d.i();
    }

    public int getScrollState() {
        return this.f5642O;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    public final int h0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public final void h1(g gVar, boolean z4, boolean z5) {
        g gVar2 = this.f5675n;
        if (gVar2 != null) {
            gVar2.s(this.f5653c);
            this.f5675n.l(this);
        }
        if (!z4 || z5) {
            T0();
        }
        this.f5659f.u();
        g gVar3 = this.f5675n;
        this.f5675n = gVar;
        if (gVar != null) {
            gVar.q(this.f5653c);
            gVar.h(this);
        }
        o oVar = this.f5677o;
        if (oVar != null) {
            oVar.E0(gVar3, this.f5675n);
        }
        this.f5655d.x(gVar3, this.f5675n, z4);
        this.f5666i0.f5808g = true;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i4) {
        o oVar = this.f5677o;
        if (oVar != null) {
            oVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f5679p.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i4 < 0) {
            this.f5679p.add(nVar);
        } else {
            this.f5679p.add(i4, nVar);
        }
        w0();
        requestLayout();
    }

    public final String i0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    public boolean i1(C c4, int i4) {
        if (t0()) {
            c4.f5723q = i4;
            this.f5692v0.add(c4);
            return false;
        }
        S.C.q0(c4.f5707a, i4);
        return true;
    }

    public boolean isAttachedToWindow() {
        return this.f5685s;
    }

    public final boolean isLayoutSuppressed() {
        return this.f5697y;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(r rVar) {
        this.f5681q.add(rVar);
    }

    public Rect j0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f5769c) {
            return pVar.f5768b;
        }
        if (this.f5666i0.e() && (pVar.b() || pVar.d())) {
            return pVar.f5768b;
        }
        Rect rect = pVar.f5768b;
        rect.set(0, 0, 0, 0);
        int size = this.f5679p.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.f5669k.set(0, 0, 0, 0);
            ((n) this.f5679p.get(i4)).e(this.f5669k, view, this, this.f5666i0);
            int i5 = rect.left;
            Rect rect2 = this.f5669k;
            rect.left = i5 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f5769c = false;
        return rect;
    }

    public boolean j1(AccessibilityEvent accessibilityEvent) {
        int i4 = 0;
        if (!t0()) {
            return false;
        }
        int a4 = accessibilityEvent != null ? T.b.a(accessibilityEvent) : 0;
        if (a4 != 0) {
            i4 = a4;
        }
        this.f5628A |= i4;
        return true;
    }

    public void k(s sVar) {
        if (this.f5670k0 == null) {
            this.f5670k0 = new ArrayList();
        }
        this.f5670k0.add(sVar);
    }

    public final void k0(long j4, C c4, C c5) {
        int g4 = this.f5661g.g();
        for (int i4 = 0; i4 < g4; i4++) {
            C f02 = f0(this.f5661g.f(i4));
            if (f02 != c4 && c0(f02) == j4) {
                g gVar = this.f5675n;
                if (gVar == null || !gVar.g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + f02 + " \n View Holder 2:" + c4 + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + f02 + " \n View Holder 2:" + c4 + P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c5 + " cannot be found but it is necessary for " + c4 + P());
    }

    public void k1(int i4, int i5) {
        l1(i4, i5, (Interpolator) null);
    }

    public void l(C c4, l.b bVar, l.b bVar2) {
        c4.G(false);
        if (this.f5641N.a(c4, bVar, bVar2)) {
            L0();
        }
    }

    public boolean l0() {
        return !this.f5691v || this.f5632E || this.f5659f.p();
    }

    public void l1(int i4, int i5, Interpolator interpolator) {
        m1(i4, i5, interpolator, Integer.MIN_VALUE);
    }

    public final void m(C c4, C c5, l.b bVar, l.b bVar2, boolean z4, boolean z5) {
        c4.G(false);
        if (z4) {
            g(c4);
        }
        if (c4 != c5) {
            if (z5) {
                g(c5);
            }
            c4.f5714h = c5;
            g(c4);
            this.f5655d.J(c4);
            c5.G(false);
            c5.f5715i = c4;
        }
        if (this.f5641N.b(c4, c5, bVar, bVar2)) {
            L0();
        }
    }

    public final boolean m0() {
        int g4 = this.f5661g.g();
        for (int i4 = 0; i4 < g4; i4++) {
            C f02 = f0(this.f5661g.f(i4));
            if (f02 != null && !f02.J() && f02.y()) {
                return true;
            }
        }
        return false;
    }

    public void m1(int i4, int i5, Interpolator interpolator, int i6) {
        n1(i4, i5, interpolator, i6, false);
    }

    public void n(C c4, l.b bVar, l.b bVar2) {
        g(c4);
        c4.G(false);
        if (this.f5641N.c(c4, bVar, bVar2)) {
            L0();
        }
    }

    public void n0() {
        this.f5659f = new a(new f());
    }

    public void n1(int i4, int i5, Interpolator interpolator, int i6, boolean z4) {
        o oVar = this.f5677o;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f5697y) {
            int i7 = 0;
            if (!oVar.k()) {
                i4 = 0;
            }
            if (!this.f5677o.l()) {
                i5 = 0;
            }
            if (i4 != 0 || i5 != 0) {
                if (i6 == Integer.MIN_VALUE || i6 > 0) {
                    if (z4) {
                        if (i4 != 0) {
                            i7 = 1;
                        }
                        if (i5 != 0) {
                            i7 |= 2;
                        }
                        q1(i7, 1);
                    }
                    this.f5660f0.f(i4, i5, i6, interpolator);
                    return;
                }
                scrollBy(i4, i5);
            }
        }
    }

    public void o(String str) {
        if (t0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
            }
            throw new IllegalStateException(str);
        } else if (this.f5635H > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    public final void o0() {
        if (S.C.w(this) == 0) {
            S.C.s0(this, 8);
        }
    }

    public void o1(int i4) {
        if (!this.f5697y) {
            o oVar = this.f5677o;
            if (oVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.I1(this, this.f5666i0, i4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r1 >= 30.0f) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f5634G = r0
            r1 = 1
            r5.f5685s = r1
            boolean r2 = r5.f5691v
            if (r2 == 0) goto L_0x0014
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = r0
        L_0x0015:
            r5.f5691v = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r5.f5677o
            if (r1 == 0) goto L_0x001e
            r1.z(r5)
        L_0x001e:
            r5.f5678o0 = r0
            boolean r0 = f5621C0
            if (r0 == 0) goto L_0x0061
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.f5979i
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f5662g0 = r1
            if (r1 != 0) goto L_0x005c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f5662g0 = r1
            android.view.Display r1 = S.C.s(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L_0x004e
            if (r1 == 0) goto L_0x004e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r1 = 1114636288(0x42700000, float:60.0)
        L_0x0050:
            androidx.recyclerview.widget.e r2 = r5.f5662g0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f5983g = r3
            r0.set(r2)
        L_0x005c:
            androidx.recyclerview.widget.e r0 = r5.f5662g0
            r0.a(r5)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onDetachedFromWindow() {
        e eVar;
        super.onDetachedFromWindow();
        l lVar = this.f5641N;
        if (lVar != null) {
            lVar.k();
        }
        t1();
        this.f5685s = false;
        o oVar = this.f5677o;
        if (oVar != null) {
            oVar.A(this, this.f5655d);
        }
        this.f5692v0.clear();
        removeCallbacks(this.f5694w0);
        this.f5663h.j();
        if (f5621C0 && (eVar = this.f5662g0) != null) {
            eVar.j(this);
            this.f5662g0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f5679p.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((n) this.f5679p.get(i4)).g(canvas, this, this.f5666i0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f4;
        float f5;
        if (this.f5677o != null && !this.f5697y && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f5 = this.f5677o.l() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f5677o.k()) {
                    f4 = motionEvent.getAxisValue(10);
                    if (!(f5 == 0.0f && f4 == 0.0f)) {
                        e1((int) (f4 * this.f5654c0), (int) (f5 * this.f5656d0), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f5677o.l()) {
                        f5 = -axisValue;
                    } else if (this.f5677o.k()) {
                        f4 = axisValue;
                        f5 = 0.0f;
                        e1((int) (f4 * this.f5654c0), (int) (f5 * this.f5656d0), motionEvent);
                    }
                }
                f5 = 0.0f;
                f4 = 0.0f;
                e1((int) (f4 * this.f5654c0), (int) (f5 * this.f5656d0), motionEvent);
            }
            f4 = 0.0f;
            e1((int) (f4 * this.f5654c0), (int) (f5 * this.f5656d0), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (this.f5697y) {
            return false;
        }
        this.f5683r = null;
        if (T(motionEvent)) {
            q();
            return true;
        }
        o oVar = this.f5677o;
        if (oVar == null) {
            return false;
        }
        boolean k4 = oVar.k();
        boolean l4 = this.f5677o.l();
        if (this.f5644Q == null) {
            this.f5644Q = VelocityTracker.obtain();
        }
        this.f5644Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f5698z) {
                this.f5698z = false;
            }
            this.f5643P = motionEvent.getPointerId(0);
            int x4 = (int) (motionEvent.getX() + 0.5f);
            this.f5647T = x4;
            this.f5645R = x4;
            int y4 = (int) (motionEvent.getY() + 0.5f);
            this.f5648U = y4;
            this.f5646S = y4;
            if (this.f5642O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                s1(1);
            }
            int[] iArr = this.f5688t0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (l4) {
                k4 |= true;
            }
            q1(k4 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f5644Q.clear();
            s1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f5643P);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5643P + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x5 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y5 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f5642O != 1) {
                int i4 = x5 - this.f5645R;
                int i5 = y5 - this.f5646S;
                if (!k4 || Math.abs(i4) <= this.f5649V) {
                    z4 = false;
                } else {
                    this.f5647T = x5;
                    z4 = true;
                }
                if (l4 && Math.abs(i5) > this.f5649V) {
                    this.f5648U = y5;
                    z4 = true;
                }
                if (z4) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.f5643P = motionEvent.getPointerId(actionIndex);
            int x6 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f5647T = x6;
            this.f5645R = x6;
            int y6 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f5648U = y6;
            this.f5646S = y6;
        } else if (actionMasked == 6) {
            I0(motionEvent);
        }
        return this.f5642O == 1;
    }

    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        O.g.a("RV OnLayout");
        B();
        O.g.b();
        this.f5691v = true;
    }

    public void onMeasure(int i4, int i5) {
        o oVar = this.f5677o;
        if (oVar == null) {
            w(i4, i5);
        } else if (oVar.s0()) {
            int mode = View.MeasureSpec.getMode(i4);
            int mode2 = View.MeasureSpec.getMode(i5);
            this.f5677o.Z0(this.f5655d, this.f5666i0, i4, i5);
            if ((mode != 1073741824 || mode2 != 1073741824) && this.f5675n != null) {
                if (this.f5666i0.f5806e == 1) {
                    C();
                }
                this.f5677o.A1(i4, i5);
                this.f5666i0.f5811j = true;
                D();
                this.f5677o.D1(i4, i5);
                if (this.f5677o.G1()) {
                    this.f5677o.A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f5666i0.f5811j = true;
                    D();
                    this.f5677o.D1(i4, i5);
                }
            }
        } else if (this.f5687t) {
            this.f5677o.Z0(this.f5655d, this.f5666i0, i4, i5);
        } else {
            if (this.f5629B) {
                p1();
                F0();
                N0();
                G0();
                z zVar = this.f5666i0;
                if (zVar.f5813l) {
                    zVar.f5809h = true;
                } else {
                    this.f5659f.j();
                    this.f5666i0.f5809h = false;
                }
                this.f5629B = false;
                r1(false);
            } else if (this.f5666i0.f5813l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.f5675n;
            if (gVar != null) {
                this.f5666i0.f5807f = gVar.c();
            } else {
                this.f5666i0.f5807f = 0;
            }
            p1();
            this.f5677o.Z0(this.f5655d, this.f5666i0, i4, i5);
            r1(false);
            this.f5666i0.f5809h = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (t0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.f5657e = xVar;
        super.onRestoreInstanceState(xVar.a());
        o oVar = this.f5677o;
        if (oVar != null && (parcelable2 = this.f5657e.f5786g) != null) {
            oVar.c1(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.f5657e;
        if (xVar2 != null) {
            xVar.c(xVar2);
        } else {
            o oVar = this.f5677o;
            if (oVar != null) {
                xVar.f5786g = oVar.d1();
            } else {
                xVar.f5786g = null;
            }
        }
        return xVar;
    }

    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 != i6 || i5 != i7) {
            r0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f5697y
            r8 = 0
            if (r0 != 0) goto L_0x01da
            boolean r0 = r6.f5698z
            if (r0 == 0) goto L_0x000f
            goto L_0x01da
        L_0x000f:
            boolean r0 = r17.K(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.q()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f5677o
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.k()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.f5677o
            boolean r11 = r0.l()
            android.view.VelocityTracker r0 = r6.f5644Q
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f5644Q = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f5688t0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f5688t0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b0
            if (r0 == r9) goto L_0x016f
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d1
        L_0x0066:
            r17.I0(r18)
            goto L_0x01d1
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f5643P = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f5647T = r0
            r6.f5645R = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f5648U = r0
            r6.f5646S = r0
            goto L_0x01d1
        L_0x0087:
            r17.q()
            goto L_0x01d1
        L_0x008c:
            int r0 = r6.f5643P
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f5643P
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f5647T
            int r0 = r0 - r13
            int r1 = r6.f5648U
            int r1 = r1 - r14
            int r2 = r6.f5642O
            if (r2 == r9) goto L_0x00fb
            if (r10 == 0) goto L_0x00df
            if (r0 <= 0) goto L_0x00d4
            int r2 = r6.f5649V
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00db
        L_0x00d4:
            int r2 = r6.f5649V
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            r2 = r9
            goto L_0x00e0
        L_0x00df:
            r2 = r8
        L_0x00e0:
            if (r11 == 0) goto L_0x00f6
            if (r1 <= 0) goto L_0x00ec
            int r3 = r6.f5649V
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f3
        L_0x00ec:
            int r3 = r6.f5649V
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r2 = r9
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            r6.setScrollState(r9)
        L_0x00fb:
            r15 = r0
            r16 = r1
            int r0 = r6.f5642O
            if (r0 != r9) goto L_0x01d1
            int[] r3 = r6.f5690u0
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x010c
            r1 = r15
            goto L_0x010d
        L_0x010c:
            r1 = r8
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            r2 = r16
            goto L_0x0113
        L_0x0112:
            r2 = r8
        L_0x0113:
            int[] r4 = r6.f5686s0
            r5 = 0
            r0 = r17
            boolean r0 = r0.F(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0140
            int[] r0 = r6.f5690u0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f5688t0
            r1 = r0[r8]
            int[] r2 = r6.f5686s0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0140:
            r0 = r16
            int[] r1 = r6.f5686s0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f5647T = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f5648U = r14
            if (r10 == 0) goto L_0x0152
            r1 = r15
            goto L_0x0153
        L_0x0152:
            r1 = r8
        L_0x0153:
            if (r11 == 0) goto L_0x0156
            r8 = r0
        L_0x0156:
            boolean r1 = r6.e1(r1, r8, r7)
            if (r1 == 0) goto L_0x0163
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0163:
            androidx.recyclerview.widget.e r1 = r6.f5662g0
            if (r1 == 0) goto L_0x01d1
            if (r15 != 0) goto L_0x016b
            if (r0 == 0) goto L_0x01d1
        L_0x016b:
            r1.f(r6, r15, r0)
            goto L_0x01d1
        L_0x016f:
            android.view.VelocityTracker r0 = r6.f5644Q
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f5644Q
            int r1 = r6.f5652b0
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            r0 = 0
            if (r10 == 0) goto L_0x018b
            android.view.VelocityTracker r1 = r6.f5644Q
            int r2 = r6.f5643P
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018c
        L_0x018b:
            r1 = r0
        L_0x018c:
            if (r11 == 0) goto L_0x0198
            android.view.VelocityTracker r2 = r6.f5644Q
            int r3 = r6.f5643P
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0199
        L_0x0198:
            r2 = r0
        L_0x0199:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a9
        L_0x01a1:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.a0(r0, r1)
            if (r0 != 0) goto L_0x01ac
        L_0x01a9:
            r6.setScrollState(r8)
        L_0x01ac:
            r17.b1()
            goto L_0x01d6
        L_0x01b0:
            int r0 = r7.getPointerId(r8)
            r6.f5643P = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f5647T = r0
            r6.f5645R = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f5648U = r0
            r6.f5646S = r0
            if (r11 == 0) goto L_0x01ce
            r10 = r10 | 2
        L_0x01ce:
            r6.q1(r10, r8)
        L_0x01d1:
            android.view.VelocityTracker r0 = r6.f5644Q
            r0.addMovement(r12)
        L_0x01d6:
            r12.recycle()
            return r9
        L_0x01da:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(C c4) {
        l lVar = this.f5641N;
        return lVar == null || lVar.g(c4, c4.o());
    }

    public final void p0() {
        this.f5661g = new b(new e());
    }

    public void p1() {
        int i4 = this.f5693w + 1;
        this.f5693w = i4;
        if (i4 == 1 && !this.f5697y) {
            this.f5695x = false;
        }
    }

    public final void q() {
        b1();
        setScrollState(0);
    }

    public void q0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
        Resources resources = getContext().getResources();
        new d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C0920b.f11986a), resources.getDimensionPixelSize(C0920b.f11988c), resources.getDimensionPixelOffset(C0920b.f11987b));
    }

    public boolean q1(int i4, int i5) {
        return getScrollingChildHelper().p(i4, i5);
    }

    public void r0() {
        this.f5640M = null;
        this.f5638K = null;
        this.f5639L = null;
        this.f5637J = null;
    }

    public void r1(boolean z4) {
        if (this.f5693w < 1) {
            this.f5693w = 1;
        }
        if (!z4 && !this.f5697y) {
            this.f5695x = false;
        }
        if (this.f5693w == 1) {
            if (z4 && this.f5695x && !this.f5697y && this.f5677o != null && this.f5675n != null) {
                B();
            }
            if (!this.f5697y) {
                this.f5695x = false;
            }
        }
        this.f5693w--;
    }

    public void removeDetachedView(View view, boolean z4) {
        C f02 = f0(view);
        if (f02 != null) {
            if (f02.x()) {
                f02.f();
            } else if (!f02.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + f02 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z4);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f5677o.b1(this, this.f5666i0, view, view2) && view2 != null) {
            Z0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.f5677o.r1(this, view, rect, z4);
    }

    public void requestDisallowInterceptTouchEvent(boolean z4) {
        int size = this.f5681q.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((r) this.f5681q.get(i4)).c(z4);
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    public void requestLayout() {
        if (this.f5693w != 0 || this.f5697y) {
            this.f5695x = true;
        } else {
            super.requestLayout();
        }
    }

    public void s() {
        int j4 = this.f5661g.j();
        for (int i4 = 0; i4 < j4; i4++) {
            C f02 = f0(this.f5661g.i(i4));
            if (!f02.J()) {
                f02.c();
            }
        }
        this.f5655d.d();
    }

    public boolean s0() {
        AccessibilityManager accessibilityManager = this.f5630C;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void s1(int i4) {
        getScrollingChildHelper().r(i4);
    }

    public void scrollBy(int i4, int i5) {
        o oVar = this.f5677o;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f5697y) {
            boolean k4 = oVar.k();
            boolean l4 = this.f5677o.l();
            if (k4 || l4) {
                if (!k4) {
                    i4 = 0;
                }
                if (!l4) {
                    i5 = 0;
                }
                e1(i4, i5, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i4, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!j1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(k kVar) {
        this.f5680p0 = kVar;
        S.C.g0(this, kVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        h1(gVar, false, true);
        O0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar != null) {
            setChildrenDrawingOrderEnabled(false);
        }
    }

    public void setClipToPadding(boolean z4) {
        if (z4 != this.f5665i) {
            r0();
        }
        this.f5665i = z4;
        super.setClipToPadding(z4);
        if (this.f5691v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        R.g.c(kVar);
        this.f5636I = kVar;
        r0();
    }

    public void setHasFixedSize(boolean z4) {
        this.f5687t = z4;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.f5641N;
        if (lVar2 != null) {
            lVar2.k();
            this.f5641N.v((l.a) null);
        }
        this.f5641N = lVar;
        if (lVar != null) {
            lVar.v(this.f5676n0);
        }
    }

    public void setItemViewCacheSize(int i4) {
        this.f5655d.G(i4);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z4) {
        suppressLayout(z4);
    }

    public void setLayoutManager(o oVar) {
        if (oVar != this.f5677o) {
            t1();
            if (this.f5677o != null) {
                l lVar = this.f5641N;
                if (lVar != null) {
                    lVar.k();
                }
                this.f5677o.k1(this.f5655d);
                this.f5677o.l1(this.f5655d);
                this.f5655d.c();
                if (this.f5685s) {
                    this.f5677o.A(this, this.f5655d);
                }
                this.f5677o.E1((RecyclerView) null);
                this.f5677o = null;
            } else {
                this.f5655d.c();
            }
            this.f5661g.o();
            this.f5677o = oVar;
            if (oVar != null) {
                if (oVar.f5744b == null) {
                    oVar.E1(this);
                    if (this.f5685s) {
                        this.f5677o.z(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f5744b.P());
                }
            }
            this.f5655d.K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z4) {
        getScrollingChildHelper().m(z4);
    }

    public void setOnFlingListener(q qVar) {
        this.f5650W = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.f5668j0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.f5658e0 = z4;
    }

    public void setRecycledViewPool(t tVar) {
        this.f5655d.E(tVar);
    }

    public void setRecyclerListener(v vVar) {
    }

    public void setScrollState(int i4) {
        if (i4 != this.f5642O) {
            this.f5642O = i4;
            if (i4 != 2) {
                u1();
            }
            H(i4);
        }
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
            } else {
                this.f5649V = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f5649V = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(A a4) {
        this.f5655d.F(a4);
    }

    public boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().o(i4);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    public final void suppressLayout(boolean z4) {
        if (z4 != this.f5697y) {
            o("Do not suppressLayout in layout or scroll");
            if (!z4) {
                this.f5697y = false;
                if (!(!this.f5695x || this.f5677o == null || this.f5675n == null)) {
                    requestLayout();
                }
                this.f5695x = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f5697y = true;
            this.f5698z = true;
            t1();
        }
    }

    public void t(int i4, int i5) {
        boolean z4;
        EdgeEffect edgeEffect = this.f5637J;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            z4 = false;
        } else {
            this.f5637J.onRelease();
            z4 = this.f5637J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5639L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.f5639L.onRelease();
            z4 |= this.f5639L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5638K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.f5638K.onRelease();
            z4 |= this.f5638K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5640M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.f5640M.onRelease();
            z4 |= this.f5640M.isFinished();
        }
        if (z4) {
            S.C.X(this);
        }
    }

    public boolean t0() {
        return this.f5634G > 0;
    }

    public void t1() {
        setScrollState(0);
        u1();
    }

    public void u() {
        if (!this.f5691v || this.f5632E) {
            O.g.a("RV FullInvalidate");
            B();
            O.g.b();
        } else if (this.f5659f.p()) {
            if (this.f5659f.o(4) && !this.f5659f.o(11)) {
                O.g.a("RV PartialInvalidate");
                p1();
                F0();
                this.f5659f.s();
                if (!this.f5695x) {
                    if (m0()) {
                        B();
                    } else {
                        this.f5659f.i();
                    }
                }
                r1(true);
                G0();
                O.g.b();
            } else if (this.f5659f.p()) {
                O.g.a("RV FullInvalidate");
                B();
                O.g.b();
            }
        }
    }

    public final boolean u0(View view, View view2, int i4) {
        int i5;
        if (view2 == null || view2 == this || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.f5669k.set(0, 0, view.getWidth(), view.getHeight());
        this.f5671l.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f5669k);
        offsetDescendantRectToMyCoords(view2, this.f5671l);
        char c4 = 65535;
        int i6 = this.f5677o.Z() == 1 ? -1 : 1;
        Rect rect = this.f5669k;
        int i7 = rect.left;
        Rect rect2 = this.f5671l;
        int i8 = rect2.left;
        if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
            i5 = 1;
        } else {
            int i9 = rect.right;
            int i10 = rect2.right;
            i5 = ((i9 > i10 || i7 >= i10) && i7 > i8) ? -1 : 0;
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
            c4 = 1;
        } else {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if ((i13 <= i14 && i11 < i14) || i11 <= i12) {
                c4 = 0;
            }
        }
        if (i4 == 1) {
            return c4 < 0 || (c4 == 0 && i5 * i6 <= 0);
        }
        if (i4 == 2) {
            return c4 > 0 || (c4 == 0 && i5 * i6 >= 0);
        }
        if (i4 == 17) {
            return i5 < 0;
        }
        if (i4 == 33) {
            return c4 < 0;
        }
        if (i4 == 66) {
            return i5 > 0;
        }
        if (i4 == 130) {
            return c4 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i4 + P());
    }

    public final void u1() {
        this.f5660f0.g();
        o oVar = this.f5677o;
        if (oVar != null) {
            oVar.K1();
        }
    }

    public final void v(Context context, String str, AttributeSet attributeSet, int i4, int i5) {
        Object[] objArr;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String i02 = i0(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(i02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                    try {
                        constructor = asSubclass.getConstructor(f5624F0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i4), Integer.valueOf(i5)};
                    } catch (NoSuchMethodException e4) {
                        objArr = null;
                        constructor = asSubclass.getConstructor((Class[]) null);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e5) {
                    e5.initCause(e4);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + i02, e5);
                } catch (ClassNotFoundException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + i02, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + i02, e7);
                } catch (InstantiationException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + i02, e8);
                } catch (IllegalAccessException e9) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + i02, e9);
                } catch (ClassCastException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + i02, e10);
                }
            }
        }
    }

    public void v0(int i4) {
        if (this.f5677o != null) {
            setScrollState(2);
            this.f5677o.x1(i4);
            awakenScrollBars();
        }
    }

    public void v1(int i4, int i5, Object obj) {
        int i6;
        int j4 = this.f5661g.j();
        int i7 = i4 + i5;
        for (int i8 = 0; i8 < j4; i8++) {
            View i9 = this.f5661g.i(i8);
            C f02 = f0(i9);
            if (f02 != null && !f02.J() && (i6 = f02.f5709c) >= i4 && i6 < i7) {
                f02.b(2);
                f02.a(obj);
                ((p) i9.getLayoutParams()).f5769c = true;
            }
        }
        this.f5655d.M(i4, i5);
    }

    public void w(int i4, int i5) {
        setMeasuredDimension(o.n(i4, getPaddingLeft() + getPaddingRight(), S.C.z(this)), o.n(i5, getPaddingTop() + getPaddingBottom(), S.C.y(this)));
    }

    public void w0() {
        int j4 = this.f5661g.j();
        for (int i4 = 0; i4 < j4; i4++) {
            ((p) this.f5661g.i(i4).getLayoutParams()).f5769c = true;
        }
        this.f5655d.s();
    }

    public final boolean x(int i4, int i5) {
        U(this.f5682q0);
        int[] iArr = this.f5682q0;
        return (iArr[0] == i4 && iArr[1] == i5) ? false : true;
    }

    public void x0() {
        int j4 = this.f5661g.j();
        for (int i4 = 0; i4 < j4; i4++) {
            C f02 = f0(this.f5661g.i(i4));
            if (f02 != null && !f02.J()) {
                f02.b(6);
            }
        }
        w0();
        this.f5655d.t();
    }

    public void y(View view) {
        int size;
        C f02 = f0(view);
        D0(view);
        g gVar = this.f5675n;
        if (!(gVar == null || f02 == null)) {
            gVar.n(f02);
        }
        List list = this.f5631D;
        if (list != null && list.size() - 1 >= 0) {
            android.support.v4.media.session.b.a(this.f5631D.get(size));
            throw null;
        }
    }

    public void y0(int i4) {
        int g4 = this.f5661g.g();
        for (int i5 = 0; i5 < g4; i5++) {
            this.f5661g.f(i5).offsetLeftAndRight(i4);
        }
    }

    public void z(View view) {
        int size;
        C f02 = f0(view);
        E0(view);
        g gVar = this.f5675n;
        if (!(gVar == null || f02 == null)) {
            gVar.o(f02);
        }
        List list = this.f5631D;
        if (list != null && list.size() - 1 >= 0) {
            android.support.v4.media.session.b.a(this.f5631D.get(size));
            throw null;
        }
    }

    public void z0(int i4) {
        int g4 = this.f5661g.g();
        for (int i5 = 0; i5 < g4; i5++) {
            this.f5661g.f(i5).offsetTopAndBottom(i4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i5 = i4;
        this.f5653c = new w();
        this.f5655d = new u();
        this.f5663h = new p();
        this.f5667j = new C0385a();
        this.f5669k = new Rect();
        this.f5671l = new Rect();
        this.f5673m = new RectF();
        this.f5679p = new ArrayList();
        this.f5681q = new ArrayList();
        this.f5693w = 0;
        this.f5632E = false;
        this.f5633F = false;
        this.f5634G = 0;
        this.f5635H = 0;
        this.f5636I = new k();
        this.f5641N = new c();
        this.f5642O = 0;
        this.f5643P = -1;
        this.f5654c0 = Float.MIN_VALUE;
        this.f5656d0 = Float.MIN_VALUE;
        this.f5658e0 = true;
        this.f5660f0 = new B();
        this.f5664h0 = f5621C0 ? new e.b() : null;
        this.f5666i0 = new z();
        this.f5672l0 = false;
        this.f5674m0 = false;
        this.f5676n0 = new m();
        this.f5678o0 = false;
        this.f5682q0 = new int[2];
        this.f5686s0 = new int[2];
        this.f5688t0 = new int[2];
        this.f5690u0 = new int[2];
        this.f5692v0 = new ArrayList();
        this.f5694w0 = new C0386b();
        this.f5696x0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5649V = viewConfiguration.getScaledTouchSlop();
        this.f5654c0 = G.e(viewConfiguration, context2);
        this.f5656d0 = G.h(viewConfiguration, context2);
        this.f5651a0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5652b0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5641N.v(this.f5676n0);
        n0();
        p0();
        o0();
        if (S.C.v(this) == 0) {
            S.C.q0(this, 1);
        }
        this.f5630C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new k(this));
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, c.f11994f, i5, 0);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            saveAttributeDataForStyleable(context, c.f11994f, attributeSet, obtainStyledAttributes, i4, 0);
        }
        String string = obtainStyledAttributes.getString(c.f12003o);
        if (obtainStyledAttributes.getInt(c.f11997i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f5665i = obtainStyledAttributes.getBoolean(c.f11996h, true);
        boolean z4 = obtainStyledAttributes.getBoolean(c.f11998j, false);
        this.f5689u = z4;
        if (z4) {
            q0((StateListDrawable) obtainStyledAttributes.getDrawable(c.f12001m), obtainStyledAttributes.getDrawable(c.f12002n), (StateListDrawable) obtainStyledAttributes.getDrawable(c.f11999k), obtainStyledAttributes.getDrawable(c.f12000l));
        }
        obtainStyledAttributes.recycle();
        v(context, string, attributeSet, i4, 0);
        int[] iArr = f5626y0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr, i5, 0);
        if (i6 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes2, i4, 0);
        }
        boolean z5 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z5);
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public C f5767a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f5768b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f5769c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5770d = false;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int a() {
            return this.f5767a.m();
        }

        public boolean b() {
            return this.f5767a.y();
        }

        public boolean c() {
            return this.f5767a.v();
        }

        public boolean d() {
            return this.f5767a.t();
        }

        public p(int i4, int i5) {
            super(i4, i5);
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public p(p pVar) {
            super(pVar);
        }
    }

    public static class x extends Z.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public Parcelable f5786g;

        public static class a implements Parcelable.ClassLoaderCreator {
            /* renamed from: a */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            /* renamed from: c */
            public x[] newArray(int i4) {
                return new x[i4];
            }
        }

        public x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5786g = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public void c(x xVar) {
            this.f5786g = xVar.f5786g;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeParcelable(this.f5786g, 0);
        }

        public x(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f5677o;
        if (oVar != null) {
            return oVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }
}
