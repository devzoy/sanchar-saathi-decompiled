package androidx.recyclerview.widget;

import T.m;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* renamed from: A  reason: collision with root package name */
    public boolean f5819A = false;

    /* renamed from: B  reason: collision with root package name */
    public BitSet f5820B;

    /* renamed from: C  reason: collision with root package name */
    public int f5821C = -1;

    /* renamed from: D  reason: collision with root package name */
    public int f5822D = Integer.MIN_VALUE;

    /* renamed from: E  reason: collision with root package name */
    public d f5823E = new d();

    /* renamed from: F  reason: collision with root package name */
    public int f5824F = 2;

    /* renamed from: G  reason: collision with root package name */
    public boolean f5825G;

    /* renamed from: H  reason: collision with root package name */
    public boolean f5826H;

    /* renamed from: I  reason: collision with root package name */
    public e f5827I;

    /* renamed from: J  reason: collision with root package name */
    public int f5828J;

    /* renamed from: K  reason: collision with root package name */
    public final Rect f5829K = new Rect();

    /* renamed from: L  reason: collision with root package name */
    public final b f5830L = new b();

    /* renamed from: M  reason: collision with root package name */
    public boolean f5831M = false;

    /* renamed from: N  reason: collision with root package name */
    public boolean f5832N = true;

    /* renamed from: O  reason: collision with root package name */
    public int[] f5833O;

    /* renamed from: P  reason: collision with root package name */
    public final Runnable f5834P = new a();

    /* renamed from: s  reason: collision with root package name */
    public int f5835s = -1;

    /* renamed from: t  reason: collision with root package name */
    public f[] f5836t;

    /* renamed from: u  reason: collision with root package name */
    public i f5837u;

    /* renamed from: v  reason: collision with root package name */
    public i f5838v;

    /* renamed from: w  reason: collision with root package name */
    public int f5839w;

    /* renamed from: x  reason: collision with root package name */
    public int f5840x;

    /* renamed from: y  reason: collision with root package name */
    public final f f5841y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5842z = false;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.S1();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f5844a;

        /* renamed from: b  reason: collision with root package name */
        public int f5845b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5846c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5847d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5848e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f5849f;

        public b() {
            c();
        }

        public void a() {
            this.f5845b = this.f5846c ? StaggeredGridLayoutManager.this.f5837u.i() : StaggeredGridLayoutManager.this.f5837u.m();
        }

        public void b(int i4) {
            if (this.f5846c) {
                this.f5845b = StaggeredGridLayoutManager.this.f5837u.i() - i4;
            } else {
                this.f5845b = StaggeredGridLayoutManager.this.f5837u.m() + i4;
            }
        }

        public void c() {
            this.f5844a = -1;
            this.f5845b = Integer.MIN_VALUE;
            this.f5846c = false;
            this.f5847d = false;
            this.f5848e = false;
            int[] iArr = this.f5849f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f5849f;
            if (iArr == null || iArr.length < length) {
                this.f5849f = new int[StaggeredGridLayoutManager.this.f5836t.length];
            }
            for (int i4 = 0; i4 < length; i4++) {
                this.f5849f[i4] = fVarArr[i4].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        public f f5851e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5852f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            f fVar = this.f5851e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f5873e;
        }

        public boolean f() {
            return this.f5852f;
        }

        public c(int i4, int i5) {
            super(i4, i5);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public int f5859e;

        /* renamed from: f  reason: collision with root package name */
        public int f5860f;

        /* renamed from: g  reason: collision with root package name */
        public int f5861g;

        /* renamed from: h  reason: collision with root package name */
        public int[] f5862h;

        /* renamed from: i  reason: collision with root package name */
        public int f5863i;

        /* renamed from: j  reason: collision with root package name */
        public int[] f5864j;

        /* renamed from: k  reason: collision with root package name */
        public List f5865k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5866l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f5867m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f5868n;

        public static class a implements Parcelable.Creator {
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i4) {
                return new e[i4];
            }
        }

        public e() {
        }

        public void a() {
            this.f5862h = null;
            this.f5861g = 0;
            this.f5859e = -1;
            this.f5860f = -1;
        }

        public void c() {
            this.f5862h = null;
            this.f5861g = 0;
            this.f5863i = 0;
            this.f5864j = null;
            this.f5865k = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f5859e);
            parcel.writeInt(this.f5860f);
            parcel.writeInt(this.f5861g);
            if (this.f5861g > 0) {
                parcel.writeIntArray(this.f5862h);
            }
            parcel.writeInt(this.f5863i);
            if (this.f5863i > 0) {
                parcel.writeIntArray(this.f5864j);
            }
            parcel.writeInt(this.f5866l ? 1 : 0);
            parcel.writeInt(this.f5867m ? 1 : 0);
            parcel.writeInt(this.f5868n ? 1 : 0);
            parcel.writeList(this.f5865k);
        }

        public e(Parcel parcel) {
            this.f5859e = parcel.readInt();
            this.f5860f = parcel.readInt();
            int readInt = parcel.readInt();
            this.f5861g = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f5862h = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f5863i = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f5864j = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z4 = false;
            this.f5866l = parcel.readInt() == 1;
            this.f5867m = parcel.readInt() == 1;
            this.f5868n = parcel.readInt() == 1 ? true : z4;
            this.f5865k = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f5861g = eVar.f5861g;
            this.f5859e = eVar.f5859e;
            this.f5860f = eVar.f5860f;
            this.f5862h = eVar.f5862h;
            this.f5863i = eVar.f5863i;
            this.f5864j = eVar.f5864j;
            this.f5866l = eVar.f5866l;
            this.f5867m = eVar.f5867m;
            this.f5868n = eVar.f5868n;
            this.f5865k = eVar.f5865k;
        }
    }

    public class f {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList f5869a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public int f5870b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f5871c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f5872d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f5873e;

        public f(int i4) {
            this.f5873e = i4;
        }

        public void a(View view) {
            c n4 = n(view);
            n4.f5851e = this;
            this.f5869a.add(view);
            this.f5871c = Integer.MIN_VALUE;
            if (this.f5869a.size() == 1) {
                this.f5870b = Integer.MIN_VALUE;
            }
            if (n4.c() || n4.b()) {
                this.f5872d += StaggeredGridLayoutManager.this.f5837u.e(view);
            }
        }

        public void b(boolean z4, int i4) {
            int l4 = z4 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l4 != Integer.MIN_VALUE) {
                if (z4 && l4 < StaggeredGridLayoutManager.this.f5837u.i()) {
                    return;
                }
                if (z4 || l4 <= StaggeredGridLayoutManager.this.f5837u.m()) {
                    if (i4 != Integer.MIN_VALUE) {
                        l4 += i4;
                    }
                    this.f5871c = l4;
                    this.f5870b = l4;
                }
            }
        }

        public void c() {
            d.a f4;
            ArrayList arrayList = this.f5869a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c n4 = n(view);
            this.f5871c = StaggeredGridLayoutManager.this.f5837u.d(view);
            if (n4.f5852f && (f4 = StaggeredGridLayoutManager.this.f5823E.f(n4.a())) != null && f4.f5856f == 1) {
                this.f5871c += f4.a(this.f5873e);
            }
        }

        public void d() {
            d.a f4;
            View view = (View) this.f5869a.get(0);
            c n4 = n(view);
            this.f5870b = StaggeredGridLayoutManager.this.f5837u.g(view);
            if (n4.f5852f && (f4 = StaggeredGridLayoutManager.this.f5823E.f(n4.a())) != null && f4.f5856f == -1) {
                this.f5870b -= f4.a(this.f5873e);
            }
        }

        public void e() {
            this.f5869a.clear();
            q();
            this.f5872d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f5842z ? i(this.f5869a.size() - 1, -1, true) : i(0, this.f5869a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f5842z ? i(0, this.f5869a.size(), true) : i(this.f5869a.size() - 1, -1, true);
        }

        public int h(int i4, int i5, boolean z4, boolean z5, boolean z6) {
            int m4 = StaggeredGridLayoutManager.this.f5837u.m();
            int i6 = StaggeredGridLayoutManager.this.f5837u.i();
            int i7 = i5 > i4 ? 1 : -1;
            while (i4 != i5) {
                View view = (View) this.f5869a.get(i4);
                int g4 = StaggeredGridLayoutManager.this.f5837u.g(view);
                int d4 = StaggeredGridLayoutManager.this.f5837u.d(view);
                boolean z7 = false;
                boolean z8 = !z6 ? g4 < i6 : g4 <= i6;
                if (!z6 ? d4 > m4 : d4 >= m4) {
                    z7 = true;
                }
                if (z8 && z7) {
                    if (!z4 || !z5) {
                        if (z5) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                        if (g4 < m4 || d4 > i6) {
                            return StaggeredGridLayoutManager.this.h0(view);
                        }
                    } else if (g4 >= m4 && d4 <= i6) {
                        return StaggeredGridLayoutManager.this.h0(view);
                    }
                }
                i4 += i7;
            }
            return -1;
        }

        public int i(int i4, int i5, boolean z4) {
            return h(i4, i5, false, false, z4);
        }

        public int j() {
            return this.f5872d;
        }

        public int k() {
            int i4 = this.f5871c;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            c();
            return this.f5871c;
        }

        public int l(int i4) {
            int i5 = this.f5871c;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f5869a.size() == 0) {
                return i4;
            }
            c();
            return this.f5871c;
        }

        public View m(int i4, int i5) {
            View view = null;
            if (i5 != -1) {
                int size = this.f5869a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f5869a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f5842z && staggeredGridLayoutManager.h0(view2) >= i4) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f5842z && staggeredGridLayoutManager2.h0(view2) <= i4) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f5869a.size();
                int i6 = 0;
                while (i6 < size2) {
                    View view3 = (View) this.f5869a.get(i6);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f5842z && staggeredGridLayoutManager3.h0(view3) <= i4) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f5842z && staggeredGridLayoutManager4.h0(view3) >= i4) || !view3.hasFocusable()) {
                        break;
                    }
                    i6++;
                    view = view3;
                }
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i4 = this.f5870b;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            d();
            return this.f5870b;
        }

        public int p(int i4) {
            int i5 = this.f5870b;
            if (i5 != Integer.MIN_VALUE) {
                return i5;
            }
            if (this.f5869a.size() == 0) {
                return i4;
            }
            d();
            return this.f5870b;
        }

        public void q() {
            this.f5870b = Integer.MIN_VALUE;
            this.f5871c = Integer.MIN_VALUE;
        }

        public void r(int i4) {
            int i5 = this.f5870b;
            if (i5 != Integer.MIN_VALUE) {
                this.f5870b = i5 + i4;
            }
            int i6 = this.f5871c;
            if (i6 != Integer.MIN_VALUE) {
                this.f5871c = i6 + i4;
            }
        }

        public void s() {
            int size = this.f5869a.size();
            View view = (View) this.f5869a.remove(size - 1);
            c n4 = n(view);
            n4.f5851e = null;
            if (n4.c() || n4.b()) {
                this.f5872d -= StaggeredGridLayoutManager.this.f5837u.e(view);
            }
            if (size == 1) {
                this.f5870b = Integer.MIN_VALUE;
            }
            this.f5871c = Integer.MIN_VALUE;
        }

        public void t() {
            View view = (View) this.f5869a.remove(0);
            c n4 = n(view);
            n4.f5851e = null;
            if (this.f5869a.size() == 0) {
                this.f5871c = Integer.MIN_VALUE;
            }
            if (n4.c() || n4.b()) {
                this.f5872d -= StaggeredGridLayoutManager.this.f5837u.e(view);
            }
            this.f5870b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c n4 = n(view);
            n4.f5851e = this;
            this.f5869a.add(0, view);
            this.f5870b = Integer.MIN_VALUE;
            if (this.f5869a.size() == 1) {
                this.f5871c = Integer.MIN_VALUE;
            }
            if (n4.c() || n4.b()) {
                this.f5872d += StaggeredGridLayoutManager.this.f5837u.e(view);
            }
        }

        public void v(int i4) {
            this.f5870b = i4;
            this.f5871c = i4;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        RecyclerView.o.d i02 = RecyclerView.o.i0(context, attributeSet, i4, i5);
        H2(i02.f5763a);
        J2(i02.f5764b);
        I2(i02.f5765c);
        this.f5841y = new f();
        a2();
    }

    private void E2() {
        if (this.f5839w == 1 || !t2()) {
            this.f5819A = this.f5842z;
        } else {
            this.f5819A = !this.f5842z;
        }
    }

    private int U1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return l.a(zVar, this.f5837u, e2(!this.f5832N), d2(!this.f5832N), this, this.f5832N);
    }

    private int V1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return l.b(zVar, this.f5837u, e2(!this.f5832N), d2(!this.f5832N), this, this.f5832N, this.f5819A);
    }

    private int W1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        return l.c(zVar, this.f5837u, e2(!this.f5832N), d2(!this.f5832N), this, this.f5832N);
    }

    private int X1(int i4) {
        if (i4 == 1) {
            return (this.f5839w != 1 && t2()) ? 1 : -1;
        }
        if (i4 == 2) {
            return (this.f5839w != 1 && t2()) ? -1 : 1;
        }
        if (i4 == 17) {
            return this.f5839w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i4 == 33) {
            return this.f5839w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i4 == 66) {
            return this.f5839w == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i4 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f5839w == 1 ? 1 : Integer.MIN_VALUE;
    }

    private void u2(View view, int i4, int i5, boolean z4) {
        j(view, this.f5829K);
        c cVar = (c) view.getLayoutParams();
        int i6 = cVar.leftMargin;
        Rect rect = this.f5829K;
        int R22 = R2(i4, i6 + rect.left, cVar.rightMargin + rect.right);
        int i7 = cVar.topMargin;
        Rect rect2 = this.f5829K;
        int R23 = R2(i5, i7 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z4 ? H1(view, R22, R23, cVar) : F1(view, R22, R23, cVar)) {
            view.measure(R22, R23);
        }
    }

    public final void A2(RecyclerView.u uVar, f fVar) {
        if (fVar.f5994a && !fVar.f6002i) {
            if (fVar.f5995b == 0) {
                if (fVar.f5998e == -1) {
                    B2(uVar, fVar.f6000g);
                } else {
                    C2(uVar, fVar.f5999f);
                }
            } else if (fVar.f5998e == -1) {
                int i4 = fVar.f5999f;
                int m22 = i4 - m2(i4);
                B2(uVar, m22 < 0 ? fVar.f6000g : fVar.f6000g - Math.min(m22, fVar.f5995b));
            } else {
                int n22 = n2(fVar.f6000g) - fVar.f6000g;
                C2(uVar, n22 < 0 ? fVar.f5999f : Math.min(n22, fVar.f5995b) + fVar.f5999f);
            }
        }
    }

    public final void B2(RecyclerView.u uVar, int i4) {
        int J4 = J() - 1;
        while (J4 >= 0) {
            View I4 = I(J4);
            if (this.f5837u.g(I4) >= i4 && this.f5837u.q(I4) >= i4) {
                c cVar = (c) I4.getLayoutParams();
                if (cVar.f5852f) {
                    int i5 = 0;
                    while (i5 < this.f5835s) {
                        if (this.f5836t[i5].f5869a.size() != 1) {
                            i5++;
                        } else {
                            return;
                        }
                    }
                    for (int i6 = 0; i6 < this.f5835s; i6++) {
                        this.f5836t[i6].s();
                    }
                } else if (cVar.f5851e.f5869a.size() != 1) {
                    cVar.f5851e.s();
                } else {
                    return;
                }
                m1(I4, uVar);
                J4--;
            } else {
                return;
            }
        }
    }

    public void C0(int i4) {
        super.C0(i4);
        for (int i5 = 0; i5 < this.f5835s; i5++) {
            this.f5836t[i5].r(i4);
        }
    }

    public void C1(Rect rect, int i4, int i5) {
        int i6;
        int i7;
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f5839w == 1) {
            i7 = RecyclerView.o.n(i5, rect.height() + g02, b0());
            i6 = RecyclerView.o.n(i4, (this.f5840x * this.f5835s) + e02, c0());
        } else {
            i6 = RecyclerView.o.n(i4, rect.width() + e02, c0());
            i7 = RecyclerView.o.n(i5, (this.f5840x * this.f5835s) + g02, b0());
        }
        B1(i6, i7);
    }

    public final void C2(RecyclerView.u uVar, int i4) {
        while (J() > 0) {
            View I4 = I(0);
            if (this.f5837u.d(I4) <= i4 && this.f5837u.p(I4) <= i4) {
                c cVar = (c) I4.getLayoutParams();
                if (cVar.f5852f) {
                    int i5 = 0;
                    while (i5 < this.f5835s) {
                        if (this.f5836t[i5].f5869a.size() != 1) {
                            i5++;
                        } else {
                            return;
                        }
                    }
                    for (int i6 = 0; i6 < this.f5835s; i6++) {
                        this.f5836t[i6].t();
                    }
                } else if (cVar.f5851e.f5869a.size() != 1) {
                    cVar.f5851e.t();
                } else {
                    return;
                }
                m1(I4, uVar);
            } else {
                return;
            }
        }
    }

    public RecyclerView.p D() {
        return this.f5839w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public void D0(int i4) {
        super.D0(i4);
        for (int i5 = 0; i5 < this.f5835s; i5++) {
            this.f5836t[i5].r(i4);
        }
    }

    public final void D2() {
        if (this.f5838v.k() != 1073741824) {
            int J4 = J();
            float f4 = 0.0f;
            for (int i4 = 0; i4 < J4; i4++) {
                View I4 = I(i4);
                float e4 = (float) this.f5838v.e(I4);
                if (e4 >= f4) {
                    if (((c) I4.getLayoutParams()).f()) {
                        e4 = (e4 * 1.0f) / ((float) this.f5835s);
                    }
                    f4 = Math.max(f4, e4);
                }
            }
            int i5 = this.f5840x;
            int round = Math.round(f4 * ((float) this.f5835s));
            if (this.f5838v.k() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f5838v.n());
            }
            P2(round);
            if (this.f5840x != i5) {
                for (int i6 = 0; i6 < J4; i6++) {
                    View I5 = I(i6);
                    c cVar = (c) I5.getLayoutParams();
                    if (!cVar.f5852f) {
                        if (!t2() || this.f5839w != 1) {
                            int i7 = cVar.f5851e.f5873e;
                            int i8 = this.f5840x * i7;
                            int i9 = i7 * i5;
                            if (this.f5839w == 1) {
                                I5.offsetLeftAndRight(i8 - i9);
                            } else {
                                I5.offsetTopAndBottom(i8 - i9);
                            }
                        } else {
                            int i10 = this.f5835s;
                            int i11 = cVar.f5851e.f5873e;
                            I5.offsetLeftAndRight(((-((i10 - 1) - i11)) * this.f5840x) - ((-((i10 - 1) - i11)) * i5));
                        }
                    }
                }
            }
        }
    }

    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public int F2(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (J() == 0 || i4 == 0) {
            return 0;
        }
        y2(i4, zVar);
        int b22 = b2(uVar, this.f5841y, zVar);
        if (this.f5841y.f5995b >= b22) {
            i4 = i4 < 0 ? -b22 : b22;
        }
        this.f5837u.r(-i4);
        this.f5825G = this.f5819A;
        f fVar = this.f5841y;
        fVar.f5995b = 0;
        A2(uVar, fVar);
        return i4;
    }

    public final void G2(int i4) {
        f fVar = this.f5841y;
        fVar.f5998e = i4;
        int i5 = 1;
        if (this.f5819A != (i4 == -1)) {
            i5 = -1;
        }
        fVar.f5997d = i5;
    }

    public void H2(int i4) {
        if (i4 == 0 || i4 == 1) {
            g((String) null);
            if (i4 != this.f5839w) {
                this.f5839w = i4;
                i iVar = this.f5837u;
                this.f5837u = this.f5838v;
                this.f5838v = iVar;
                t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void I0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.I0(recyclerView, uVar);
        o1(this.f5834P);
        for (int i4 = 0; i4 < this.f5835s; i4++) {
            this.f5836t[i4].e();
        }
        recyclerView.requestLayout();
    }

    public void I1(RecyclerView recyclerView, RecyclerView.z zVar, int i4) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i4);
        J1(gVar);
    }

    public void I2(boolean z4) {
        g((String) null);
        e eVar = this.f5827I;
        if (!(eVar == null || eVar.f5866l == z4)) {
            eVar.f5866l = z4;
        }
        this.f5842z = z4;
        t1();
    }

    public View J0(View view, int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        View B4;
        View m4;
        if (J() == 0 || (B4 = B(view)) == null) {
            return null;
        }
        E2();
        int X12 = X1(i4);
        if (X12 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) B4.getLayoutParams();
        boolean z4 = cVar.f5852f;
        f fVar = cVar.f5851e;
        int k22 = X12 == 1 ? k2() : j2();
        O2(k22, zVar);
        G2(X12);
        f fVar2 = this.f5841y;
        fVar2.f5996c = fVar2.f5997d + k22;
        fVar2.f5995b = (int) (((float) this.f5837u.n()) * 0.33333334f);
        f fVar3 = this.f5841y;
        fVar3.f6001h = true;
        fVar3.f5994a = false;
        b2(uVar, fVar3, zVar);
        this.f5825G = this.f5819A;
        if (!z4 && (m4 = fVar.m(k22, X12)) != null && m4 != B4) {
            return m4;
        }
        if (x2(X12)) {
            for (int i5 = this.f5835s - 1; i5 >= 0; i5--) {
                View m5 = this.f5836t[i5].m(k22, X12);
                if (m5 != null && m5 != B4) {
                    return m5;
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f5835s; i6++) {
                View m6 = this.f5836t[i6].m(k22, X12);
                if (m6 != null && m6 != B4) {
                    return m6;
                }
            }
        }
        boolean z5 = (this.f5842z ^ true) == (X12 == -1);
        if (!z4) {
            View C4 = C(z5 ? fVar.f() : fVar.g());
            if (!(C4 == null || C4 == B4)) {
                return C4;
            }
        }
        if (x2(X12)) {
            for (int i7 = this.f5835s - 1; i7 >= 0; i7--) {
                if (i7 != fVar.f5873e) {
                    View C5 = C(z5 ? this.f5836t[i7].f() : this.f5836t[i7].g());
                    if (!(C5 == null || C5 == B4)) {
                        return C5;
                    }
                }
            }
        } else {
            for (int i8 = 0; i8 < this.f5835s; i8++) {
                View C6 = C(z5 ? this.f5836t[i8].f() : this.f5836t[i8].g());
                if (C6 != null && C6 != B4) {
                    return C6;
                }
            }
        }
        return null;
    }

    public void J2(int i4) {
        g((String) null);
        if (i4 != this.f5835s) {
            s2();
            this.f5835s = i4;
            this.f5820B = new BitSet(this.f5835s);
            this.f5836t = new f[this.f5835s];
            for (int i5 = 0; i5 < this.f5835s; i5++) {
                this.f5836t[i5] = new f(i5);
            }
            t1();
        }
    }

    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            View e22 = e2(false);
            View d22 = d2(false);
            if (e22 != null && d22 != null) {
                int h02 = h0(e22);
                int h03 = h0(d22);
                if (h02 < h03) {
                    accessibilityEvent.setFromIndex(h02);
                    accessibilityEvent.setToIndex(h03);
                    return;
                }
                accessibilityEvent.setFromIndex(h03);
                accessibilityEvent.setToIndex(h02);
            }
        }
    }

    public final void K2(int i4, int i5) {
        for (int i6 = 0; i6 < this.f5835s; i6++) {
            if (!this.f5836t[i6].f5869a.isEmpty()) {
                Q2(this.f5836t[i6], i4, i5);
            }
        }
    }

    public boolean L1() {
        return this.f5827I == null;
    }

    public final boolean L2(RecyclerView.z zVar, b bVar) {
        bVar.f5844a = this.f5825G ? g2(zVar.b()) : c2(zVar.b());
        bVar.f5845b = Integer.MIN_VALUE;
        return true;
    }

    public final void M1(View view) {
        for (int i4 = this.f5835s - 1; i4 >= 0; i4--) {
            this.f5836t[i4].a(view);
        }
    }

    public boolean M2(RecyclerView.z zVar, b bVar) {
        int i4;
        boolean z4 = false;
        if (!zVar.e() && (i4 = this.f5821C) != -1) {
            if (i4 < 0 || i4 >= zVar.b()) {
                this.f5821C = -1;
                this.f5822D = Integer.MIN_VALUE;
            } else {
                e eVar = this.f5827I;
                if (eVar == null || eVar.f5859e == -1 || eVar.f5861g < 1) {
                    View C4 = C(this.f5821C);
                    if (C4 != null) {
                        bVar.f5844a = this.f5819A ? k2() : j2();
                        if (this.f5822D != Integer.MIN_VALUE) {
                            if (bVar.f5846c) {
                                bVar.f5845b = (this.f5837u.i() - this.f5822D) - this.f5837u.d(C4);
                            } else {
                                bVar.f5845b = (this.f5837u.m() + this.f5822D) - this.f5837u.g(C4);
                            }
                            return true;
                        } else if (this.f5837u.e(C4) > this.f5837u.n()) {
                            bVar.f5845b = bVar.f5846c ? this.f5837u.i() : this.f5837u.m();
                            return true;
                        } else {
                            int g4 = this.f5837u.g(C4) - this.f5837u.m();
                            if (g4 < 0) {
                                bVar.f5845b = -g4;
                                return true;
                            }
                            int i5 = this.f5837u.i() - this.f5837u.d(C4);
                            if (i5 < 0) {
                                bVar.f5845b = i5;
                                return true;
                            }
                            bVar.f5845b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i6 = this.f5821C;
                        bVar.f5844a = i6;
                        int i7 = this.f5822D;
                        if (i7 == Integer.MIN_VALUE) {
                            if (R1(i6) == 1) {
                                z4 = true;
                            }
                            bVar.f5846c = z4;
                            bVar.a();
                        } else {
                            bVar.b(i7);
                        }
                        bVar.f5847d = true;
                    }
                } else {
                    bVar.f5845b = Integer.MIN_VALUE;
                    bVar.f5844a = this.f5821C;
                }
                return true;
            }
        }
        return false;
    }

    public int N(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f5839w == 1 ? this.f5835s : super.N(uVar, zVar);
    }

    public final void N1(b bVar) {
        e eVar = this.f5827I;
        int i4 = eVar.f5861g;
        if (i4 > 0) {
            if (i4 == this.f5835s) {
                for (int i5 = 0; i5 < this.f5835s; i5++) {
                    this.f5836t[i5].e();
                    e eVar2 = this.f5827I;
                    int i6 = eVar2.f5862h[i5];
                    if (i6 != Integer.MIN_VALUE) {
                        i6 += eVar2.f5867m ? this.f5837u.i() : this.f5837u.m();
                    }
                    this.f5836t[i5].v(i6);
                }
            } else {
                eVar.c();
                e eVar3 = this.f5827I;
                eVar3.f5859e = eVar3.f5860f;
            }
        }
        e eVar4 = this.f5827I;
        this.f5826H = eVar4.f5868n;
        I2(eVar4.f5866l);
        E2();
        e eVar5 = this.f5827I;
        int i7 = eVar5.f5859e;
        if (i7 != -1) {
            this.f5821C = i7;
            bVar.f5846c = eVar5.f5867m;
        } else {
            bVar.f5846c = this.f5819A;
        }
        if (eVar5.f5863i > 1) {
            d dVar = this.f5823E;
            dVar.f5853a = eVar5.f5864j;
            dVar.f5854b = eVar5.f5865k;
        }
    }

    public void N2(RecyclerView.z zVar, b bVar) {
        if (!M2(zVar, bVar) && !L2(zVar, bVar)) {
            bVar.a();
            bVar.f5844a = 0;
        }
    }

    public boolean O1() {
        int l4 = this.f5836t[0].l(Integer.MIN_VALUE);
        for (int i4 = 1; i4 < this.f5835s; i4++) {
            if (this.f5836t[i4].l(Integer.MIN_VALUE) != l4) {
                return false;
            }
        }
        return true;
    }

    public final void O2(int i4, RecyclerView.z zVar) {
        int i5;
        int i6;
        int c4;
        f fVar = this.f5841y;
        boolean z4 = false;
        fVar.f5995b = 0;
        fVar.f5996c = i4;
        if (!x0() || (c4 = zVar.c()) == -1) {
            i6 = 0;
            i5 = 0;
        } else {
            if (this.f5819A == (c4 < i4)) {
                i6 = this.f5837u.n();
                i5 = 0;
            } else {
                i5 = this.f5837u.n();
                i6 = 0;
            }
        }
        if (M()) {
            this.f5841y.f5999f = this.f5837u.m() - i5;
            this.f5841y.f6000g = this.f5837u.i() + i6;
        } else {
            this.f5841y.f6000g = this.f5837u.h() + i6;
            this.f5841y.f5999f = -i5;
        }
        f fVar2 = this.f5841y;
        fVar2.f6001h = false;
        fVar2.f5994a = true;
        if (this.f5837u.k() == 0 && this.f5837u.h() == 0) {
            z4 = true;
        }
        fVar2.f6002i = z4;
    }

    public void P0(RecyclerView.u uVar, RecyclerView.z zVar, View view, m mVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.O0(view, mVar);
            return;
        }
        c cVar = (c) layoutParams;
        int i4 = 1;
        if (this.f5839w == 0) {
            int e4 = cVar.e();
            if (cVar.f5852f) {
                i4 = this.f5835s;
            }
            mVar.f0(m.f.a(e4, i4, -1, -1, false, false));
            return;
        }
        int e5 = cVar.e();
        if (cVar.f5852f) {
            i4 = this.f5835s;
        }
        mVar.f0(m.f.a(-1, -1, e5, i4, false, false));
    }

    public boolean P1() {
        int p4 = this.f5836t[0].p(Integer.MIN_VALUE);
        for (int i4 = 1; i4 < this.f5835s; i4++) {
            if (this.f5836t[i4].p(Integer.MIN_VALUE) != p4) {
                return false;
            }
        }
        return true;
    }

    public void P2(int i4) {
        this.f5840x = i4 / this.f5835s;
        this.f5828J = View.MeasureSpec.makeMeasureSpec(i4, this.f5838v.k());
    }

    public final void Q1(View view, c cVar, f fVar) {
        if (fVar.f5998e == 1) {
            if (cVar.f5852f) {
                M1(view);
            } else {
                cVar.f5851e.a(view);
            }
        } else if (cVar.f5852f) {
            z2(view);
        } else {
            cVar.f5851e.u(view);
        }
    }

    public final void Q2(f fVar, int i4, int i5) {
        int j4 = fVar.j();
        if (i4 == -1) {
            if (fVar.o() + j4 <= i5) {
                this.f5820B.set(fVar.f5873e, false);
            }
        } else if (fVar.k() - j4 >= i5) {
            this.f5820B.set(fVar.f5873e, false);
        }
    }

    public void R0(RecyclerView recyclerView, int i4, int i5) {
        q2(i4, i5, 1);
    }

    public final int R1(int i4) {
        if (J() == 0) {
            return this.f5819A ? 1 : -1;
        }
        return (i4 < j2()) != this.f5819A ? -1 : 1;
    }

    public final int R2(int i4, int i5, int i6) {
        if (i5 == 0 && i6 == 0) {
            return i4;
        }
        int mode = View.MeasureSpec.getMode(i4);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i4) - i5) - i6), mode) : i4;
    }

    public void S0(RecyclerView recyclerView) {
        this.f5823E.b();
        t1();
    }

    public boolean S1() {
        int i4;
        int i5;
        if (J() == 0 || this.f5824F == 0 || !r0()) {
            return false;
        }
        if (this.f5819A) {
            i5 = k2();
            i4 = j2();
        } else {
            i5 = j2();
            i4 = k2();
        }
        if (i5 == 0 && r2() != null) {
            this.f5823E.b();
            u1();
            t1();
            return true;
        } else if (!this.f5831M) {
            return false;
        } else {
            int i6 = this.f5819A ? -1 : 1;
            int i7 = i4 + 1;
            d.a e4 = this.f5823E.e(i5, i7, i6, true);
            if (e4 == null) {
                this.f5831M = false;
                this.f5823E.d(i7);
                return false;
            }
            d.a e5 = this.f5823E.e(i5, e4.f5855e, i6 * -1, true);
            if (e5 == null) {
                this.f5823E.d(e4.f5855e);
            } else {
                this.f5823E.d(e5.f5855e + 1);
            }
            u1();
            t1();
            return true;
        }
    }

    public void T0(RecyclerView recyclerView, int i4, int i5, int i6) {
        q2(i4, i5, 8);
    }

    public final boolean T1(f fVar) {
        if (this.f5819A) {
            if (fVar.k() < this.f5837u.i()) {
                ArrayList arrayList = fVar.f5869a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f5852f;
            }
        } else if (fVar.o() > this.f5837u.m()) {
            return !fVar.n((View) fVar.f5869a.get(0)).f5852f;
        }
        return false;
    }

    public void U0(RecyclerView recyclerView, int i4, int i5) {
        q2(i4, i5, 2);
    }

    public void W0(RecyclerView recyclerView, int i4, int i5, Object obj) {
        q2(i4, i5, 4);
    }

    public void X0(RecyclerView.u uVar, RecyclerView.z zVar) {
        w2(uVar, zVar, true);
    }

    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.f5821C = -1;
        this.f5822D = Integer.MIN_VALUE;
        this.f5827I = null;
        this.f5830L.c();
    }

    public final d.a Y1(int i4) {
        d.a aVar = new d.a();
        aVar.f5857g = new int[this.f5835s];
        for (int i5 = 0; i5 < this.f5835s; i5++) {
            aVar.f5857g[i5] = i4 - this.f5836t[i5].l(i4);
        }
        return aVar;
    }

    public final d.a Z1(int i4) {
        d.a aVar = new d.a();
        aVar.f5857g = new int[this.f5835s];
        for (int i5 = 0; i5 < this.f5835s; i5++) {
            aVar.f5857g[i5] = this.f5836t[i5].p(i4) - i4;
        }
        return aVar;
    }

    public PointF a(int i4) {
        int R12 = R1(i4);
        PointF pointF = new PointF();
        if (R12 == 0) {
            return null;
        }
        if (this.f5839w == 0) {
            pointF.x = (float) R12;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) R12;
        }
        return pointF;
    }

    public final void a2() {
        this.f5837u = i.b(this, this.f5839w);
        this.f5838v = i.b(this, 1 - this.f5839w);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    public final int b2(RecyclerView.u uVar, f fVar, RecyclerView.z zVar) {
        f fVar2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        RecyclerView.u uVar2 = uVar;
        f fVar3 = fVar;
        ? r9 = 0;
        this.f5820B.set(0, this.f5835s, true);
        int i8 = this.f5841y.f6002i ? fVar3.f5998e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : fVar3.f5998e == 1 ? fVar3.f6000g + fVar3.f5995b : fVar3.f5999f - fVar3.f5995b;
        K2(fVar3.f5998e, i8);
        int i9 = this.f5819A ? this.f5837u.i() : this.f5837u.m();
        boolean z5 = false;
        while (fVar.a(zVar) && (this.f5841y.f6002i || !this.f5820B.isEmpty())) {
            View b4 = fVar3.b(uVar2);
            c cVar = (c) b4.getLayoutParams();
            int a4 = cVar.a();
            int g4 = this.f5823E.g(a4);
            boolean z6 = g4 == -1 ? true : r9;
            if (z6) {
                fVar2 = cVar.f5852f ? this.f5836t[r9] : p2(fVar3);
                this.f5823E.n(a4, fVar2);
            } else {
                fVar2 = this.f5836t[g4];
            }
            f fVar4 = fVar2;
            cVar.f5851e = fVar4;
            if (fVar3.f5998e == 1) {
                d(b4);
            } else {
                e(b4, r9);
            }
            v2(b4, cVar, r9);
            if (fVar3.f5998e == 1) {
                int l22 = cVar.f5852f ? l2(i9) : fVar4.l(i9);
                int e4 = this.f5837u.e(b4) + l22;
                if (z6 && cVar.f5852f) {
                    d.a Y12 = Y1(l22);
                    Y12.f5856f = -1;
                    Y12.f5855e = a4;
                    this.f5823E.a(Y12);
                }
                i4 = e4;
                i5 = l22;
            } else {
                int o22 = cVar.f5852f ? o2(i9) : fVar4.p(i9);
                i5 = o22 - this.f5837u.e(b4);
                if (z6 && cVar.f5852f) {
                    d.a Z12 = Z1(o22);
                    Z12.f5856f = 1;
                    Z12.f5855e = a4;
                    this.f5823E.a(Z12);
                }
                i4 = o22;
            }
            if (cVar.f5852f && fVar3.f5997d == -1) {
                if (z6) {
                    this.f5831M = true;
                } else {
                    if (!(fVar3.f5998e == 1 ? O1() : P1())) {
                        d.a f4 = this.f5823E.f(a4);
                        if (f4 != null) {
                            f4.f5858h = true;
                        }
                        this.f5831M = true;
                    }
                }
            }
            Q1(b4, cVar, fVar3);
            if (!t2() || this.f5839w != 1) {
                int m4 = cVar.f5852f ? this.f5838v.m() : (fVar4.f5873e * this.f5840x) + this.f5838v.m();
                i7 = m4;
                i6 = this.f5838v.e(b4) + m4;
            } else {
                int i10 = cVar.f5852f ? this.f5838v.i() : this.f5838v.i() - (((this.f5835s - 1) - fVar4.f5873e) * this.f5840x);
                i6 = i10;
                i7 = i10 - this.f5838v.e(b4);
            }
            if (this.f5839w == 1) {
                z0(b4, i7, i5, i6, i4);
            } else {
                z0(b4, i5, i7, i4, i6);
            }
            if (cVar.f5852f) {
                K2(this.f5841y.f5998e, i8);
            } else {
                Q2(fVar4, this.f5841y.f5998e, i8);
            }
            A2(uVar2, this.f5841y);
            if (this.f5841y.f6001h && b4.hasFocusable()) {
                if (cVar.f5852f) {
                    this.f5820B.clear();
                } else {
                    z4 = false;
                    this.f5820B.set(fVar4.f5873e, false);
                    r9 = z4;
                    z5 = true;
                }
            }
            z4 = false;
            r9 = z4;
            z5 = true;
        }
        int i11 = r9;
        if (!z5) {
            A2(uVar2, this.f5841y);
        }
        int m5 = this.f5841y.f5998e == -1 ? this.f5837u.m() - o2(this.f5837u.m()) : l2(this.f5837u.i()) - this.f5837u.i();
        return m5 > 0 ? Math.min(fVar3.f5995b, m5) : i11;
    }

    public void c1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f5827I = (e) parcelable;
            t1();
        }
    }

    public final int c2(int i4) {
        int J4 = J();
        for (int i5 = 0; i5 < J4; i5++) {
            int h02 = h0(I(i5));
            if (h02 >= 0 && h02 < i4) {
                return h02;
            }
        }
        return 0;
    }

    public Parcelable d1() {
        int i4;
        int m4;
        int[] iArr;
        if (this.f5827I != null) {
            return new e(this.f5827I);
        }
        e eVar = new e();
        eVar.f5866l = this.f5842z;
        eVar.f5867m = this.f5825G;
        eVar.f5868n = this.f5826H;
        d dVar = this.f5823E;
        if (dVar == null || (iArr = dVar.f5853a) == null) {
            eVar.f5863i = 0;
        } else {
            eVar.f5864j = iArr;
            eVar.f5863i = iArr.length;
            eVar.f5865k = dVar.f5854b;
        }
        if (J() > 0) {
            eVar.f5859e = this.f5825G ? k2() : j2();
            eVar.f5860f = f2();
            int i5 = this.f5835s;
            eVar.f5861g = i5;
            eVar.f5862h = new int[i5];
            for (int i6 = 0; i6 < this.f5835s; i6++) {
                if (this.f5825G) {
                    i4 = this.f5836t[i6].l(Integer.MIN_VALUE);
                    if (i4 != Integer.MIN_VALUE) {
                        m4 = this.f5837u.i();
                    } else {
                        eVar.f5862h[i6] = i4;
                    }
                } else {
                    i4 = this.f5836t[i6].p(Integer.MIN_VALUE);
                    if (i4 != Integer.MIN_VALUE) {
                        m4 = this.f5837u.m();
                    } else {
                        eVar.f5862h[i6] = i4;
                    }
                }
                i4 -= m4;
                eVar.f5862h[i6] = i4;
            }
        } else {
            eVar.f5859e = -1;
            eVar.f5860f = -1;
            eVar.f5861g = 0;
        }
        return eVar;
    }

    public View d2(boolean z4) {
        int m4 = this.f5837u.m();
        int i4 = this.f5837u.i();
        View view = null;
        for (int J4 = J() - 1; J4 >= 0; J4--) {
            View I4 = I(J4);
            int g4 = this.f5837u.g(I4);
            int d4 = this.f5837u.d(I4);
            if (d4 > m4 && g4 < i4) {
                if (d4 <= i4 || !z4) {
                    return I4;
                }
                if (view == null) {
                    view = I4;
                }
            }
        }
        return view;
    }

    public void e1(int i4) {
        if (i4 == 0) {
            S1();
        }
    }

    public View e2(boolean z4) {
        int m4 = this.f5837u.m();
        int i4 = this.f5837u.i();
        int J4 = J();
        View view = null;
        for (int i5 = 0; i5 < J4; i5++) {
            View I4 = I(i5);
            int g4 = this.f5837u.g(I4);
            if (this.f5837u.d(I4) > m4 && g4 < i4) {
                if (g4 >= m4 || !z4) {
                    return I4;
                }
                if (view == null) {
                    view = I4;
                }
            }
        }
        return view;
    }

    public int f2() {
        View d22 = this.f5819A ? d2(true) : e2(true);
        if (d22 == null) {
            return -1;
        }
        return h0(d22);
    }

    public void g(String str) {
        if (this.f5827I == null) {
            super.g(str);
        }
    }

    public final int g2(int i4) {
        for (int J4 = J() - 1; J4 >= 0; J4--) {
            int h02 = h0(I(J4));
            if (h02 >= 0 && h02 < i4) {
                return h02;
            }
        }
        return 0;
    }

    public final void h2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z4) {
        int i4;
        int l22 = l2(Integer.MIN_VALUE);
        if (l22 != Integer.MIN_VALUE && (i4 = this.f5837u.i() - l22) > 0) {
            int i5 = i4 - (-F2(-i4, uVar, zVar));
            if (z4 && i5 > 0) {
                this.f5837u.r(i5);
            }
        }
    }

    public final void i2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z4) {
        int m4;
        int o22 = o2(Integer.MAX_VALUE);
        if (o22 != Integer.MAX_VALUE && (m4 = o22 - this.f5837u.m()) > 0) {
            int F22 = m4 - F2(m4, uVar, zVar);
            if (z4 && F22 > 0) {
                this.f5837u.r(-F22);
            }
        }
    }

    public int j2() {
        if (J() == 0) {
            return 0;
        }
        return h0(I(0));
    }

    public boolean k() {
        return this.f5839w == 0;
    }

    public int k0(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f5839w == 0 ? this.f5835s : super.k0(uVar, zVar);
    }

    public int k2() {
        int J4 = J();
        if (J4 == 0) {
            return 0;
        }
        return h0(I(J4 - 1));
    }

    public boolean l() {
        return this.f5839w == 1;
    }

    public final int l2(int i4) {
        int l4 = this.f5836t[0].l(i4);
        for (int i5 = 1; i5 < this.f5835s; i5++) {
            int l5 = this.f5836t[i5].l(i4);
            if (l5 > l4) {
                l4 = l5;
            }
        }
        return l4;
    }

    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    public final int m2(int i4) {
        int p4 = this.f5836t[0].p(i4);
        for (int i5 = 1; i5 < this.f5835s; i5++) {
            int p5 = this.f5836t[i5].p(i4);
            if (p5 > p4) {
                p4 = p5;
            }
        }
        return p4;
    }

    public final int n2(int i4) {
        int l4 = this.f5836t[0].l(i4);
        for (int i5 = 1; i5 < this.f5835s; i5++) {
            int l5 = this.f5836t[i5].l(i4);
            if (l5 < l4) {
                l4 = l5;
            }
        }
        return l4;
    }

    public void o(int i4, int i5, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int l4;
        int i6;
        if (this.f5839w != 0) {
            i4 = i5;
        }
        if (J() != 0 && i4 != 0) {
            y2(i4, zVar);
            int[] iArr = this.f5833O;
            if (iArr == null || iArr.length < this.f5835s) {
                this.f5833O = new int[this.f5835s];
            }
            int i7 = 0;
            for (int i8 = 0; i8 < this.f5835s; i8++) {
                f fVar = this.f5841y;
                if (fVar.f5997d == -1) {
                    l4 = fVar.f5999f;
                    i6 = this.f5836t[i8].p(l4);
                } else {
                    l4 = this.f5836t[i8].l(fVar.f6000g);
                    i6 = this.f5841y.f6000g;
                }
                int i9 = l4 - i6;
                if (i9 >= 0) {
                    this.f5833O[i7] = i9;
                    i7++;
                }
            }
            Arrays.sort(this.f5833O, 0, i7);
            for (int i10 = 0; i10 < i7 && this.f5841y.a(zVar); i10++) {
                cVar.a(this.f5841y.f5996c, this.f5833O[i10]);
                f fVar2 = this.f5841y;
                fVar2.f5996c += fVar2.f5997d;
            }
        }
    }

    public final int o2(int i4) {
        int p4 = this.f5836t[0].p(i4);
        for (int i5 = 1; i5 < this.f5835s; i5++) {
            int p5 = this.f5836t[i5].p(i4);
            if (p5 < p4) {
                p4 = p5;
            }
        }
        return p4;
    }

    public final f p2(f fVar) {
        int i4;
        int i5;
        int i6;
        if (x2(fVar.f5998e)) {
            i6 = this.f5835s - 1;
            i5 = -1;
            i4 = -1;
        } else {
            i5 = this.f5835s;
            i6 = 0;
            i4 = 1;
        }
        f fVar2 = null;
        if (fVar.f5998e == 1) {
            int m4 = this.f5837u.m();
            int i7 = Integer.MAX_VALUE;
            while (i6 != i5) {
                f fVar3 = this.f5836t[i6];
                int l4 = fVar3.l(m4);
                if (l4 < i7) {
                    fVar2 = fVar3;
                    i7 = l4;
                }
                i6 += i4;
            }
            return fVar2;
        }
        int i8 = this.f5837u.i();
        int i9 = Integer.MIN_VALUE;
        while (i6 != i5) {
            f fVar4 = this.f5836t[i6];
            int p4 = fVar4.p(i8);
            if (p4 > i9) {
                fVar2 = fVar4;
                i9 = p4;
            }
            i6 += i4;
        }
        return fVar2;
    }

    public int q(RecyclerView.z zVar) {
        return U1(zVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f5819A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.k2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.j2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0017
            int r2 = r8 + 1
        L_0x0015:
            r3 = r7
            goto L_0x001e
        L_0x0017:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001e
        L_0x001b:
            int r2 = r7 + r8
            goto L_0x0015
        L_0x001e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f5823E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003d
            r5 = 2
            if (r9 == r5) goto L_0x0037
            if (r9 == r1) goto L_0x002c
            goto L_0x0042
        L_0x002c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5823E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f5823E
            r7.j(r8, r4)
            goto L_0x0042
        L_0x0037:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5823E
            r9.k(r7, r8)
            goto L_0x0042
        L_0x003d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f5823E
            r9.j(r7, r8)
        L_0x0042:
            if (r2 > r0) goto L_0x0045
            return
        L_0x0045:
            boolean r7 = r6.f5819A
            if (r7 == 0) goto L_0x004e
            int r7 = r6.j2()
            goto L_0x0052
        L_0x004e:
            int r7 = r6.k2()
        L_0x0052:
            if (r3 > r7) goto L_0x0057
            r6.t1()
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q2(int, int, int):void");
    }

    public int r(RecyclerView.z zVar) {
        return V1(zVar);
    }

    public View r2() {
        int i4;
        int J4 = J();
        int i5 = J4 - 1;
        BitSet bitSet = new BitSet(this.f5835s);
        bitSet.set(0, this.f5835s, true);
        int i6 = -1;
        char c4 = (this.f5839w != 1 || !t2()) ? (char) 65535 : 1;
        if (this.f5819A) {
            J4 = -1;
        } else {
            i5 = 0;
        }
        if (i5 < J4) {
            i6 = 1;
        }
        while (i5 != J4) {
            View I4 = I(i5);
            c cVar = (c) I4.getLayoutParams();
            if (bitSet.get(cVar.f5851e.f5873e)) {
                if (T1(cVar.f5851e)) {
                    return I4;
                }
                bitSet.clear(cVar.f5851e.f5873e);
            }
            if (!cVar.f5852f && (i4 = i5 + i6) != J4) {
                View I5 = I(i4);
                if (this.f5819A) {
                    int d4 = this.f5837u.d(I4);
                    int d5 = this.f5837u.d(I5);
                    if (d4 < d5) {
                        return I4;
                    }
                    if (d4 != d5) {
                        continue;
                    }
                } else {
                    int g4 = this.f5837u.g(I4);
                    int g5 = this.f5837u.g(I5);
                    if (g4 > g5) {
                        return I4;
                    }
                    if (g4 != g5) {
                        continue;
                    }
                }
                if ((cVar.f5851e.f5873e - ((c) I5.getLayoutParams()).f5851e.f5873e < 0) != (c4 < 0)) {
                    return I4;
                }
            }
            i5 += i6;
        }
        return null;
    }

    public int s(RecyclerView.z zVar) {
        return W1(zVar);
    }

    public boolean s0() {
        return this.f5824F != 0;
    }

    public void s2() {
        this.f5823E.b();
        t1();
    }

    public int t(RecyclerView.z zVar) {
        return U1(zVar);
    }

    public boolean t2() {
        return Z() == 1;
    }

    public int u(RecyclerView.z zVar) {
        return V1(zVar);
    }

    public int v(RecyclerView.z zVar) {
        return W1(zVar);
    }

    public final void v2(View view, c cVar, boolean z4) {
        if (cVar.f5852f) {
            if (this.f5839w == 1) {
                u2(view, this.f5828J, RecyclerView.o.K(W(), X(), g0() + d0(), cVar.height, true), z4);
            } else {
                u2(view, RecyclerView.o.K(o0(), p0(), e0() + f0(), cVar.width, true), this.f5828J, z4);
            }
        } else if (this.f5839w == 1) {
            u2(view, RecyclerView.o.K(this.f5840x, p0(), 0, cVar.width, false), RecyclerView.o.K(W(), X(), g0() + d0(), cVar.height, true), z4);
        } else {
            u2(view, RecyclerView.o.K(o0(), p0(), e0() + f0(), cVar.width, true), RecyclerView.o.K(this.f5840x, X(), 0, cVar.height, false), z4);
        }
    }

    public int w1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        return F2(i4, uVar, zVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0152, code lost:
        if (S1() != false) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w2(androidx.recyclerview.widget.RecyclerView.u r9, androidx.recyclerview.widget.RecyclerView.z r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f5830L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f5827I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f5821C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.b()
            if (r1 != 0) goto L_0x0018
            r8.k1(r9)
            r0.c()
            return
        L_0x0018:
            boolean r1 = r0.f5848e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f5821C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f5827I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f5827I
            if (r5 == 0) goto L_0x0037
            r8.N1(r0)
            goto L_0x003e
        L_0x0037:
            r8.E2()
            boolean r5 = r8.f5819A
            r0.f5846c = r5
        L_0x003e:
            r8.N2(r10, r0)
            r0.f5848e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f5827I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f5821C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f5846c
            boolean r6 = r8.f5825G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.t2()
            boolean r6 = r8.f5826H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f5823E
            r5.b()
            r0.f5847d = r4
        L_0x0060:
            int r5 = r8.J()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f5827I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f5861g
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f5847d
            if (r5 == 0) goto L_0x008e
            r1 = r3
        L_0x0073:
            int r5 = r8.f5835s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f5836t
            r5 = r5[r1]
            r5.e()
            int r5 = r0.f5845b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f5836t
            r6 = r6[r1]
            r6.v(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f5830L
            int[] r1 = r1.f5849f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r5 = r8.f5835s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f5836t
            r5 = r5[r1]
            r5.e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f5830L
            int[] r6 = r6.f5849f
            r6 = r6[r1]
            r5.v(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = r3
        L_0x00b0:
            int r5 = r8.f5835s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f5836t
            r5 = r5[r1]
            boolean r6 = r8.f5819A
            int r7 = r0.f5845b
            r5.b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f5830L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f5836t
            r1.d(r5)
        L_0x00c9:
            r8.w(r9)
            androidx.recyclerview.widget.f r1 = r8.f5841y
            r1.f5994a = r3
            r8.f5831M = r3
            androidx.recyclerview.widget.i r1 = r8.f5838v
            int r1 = r1.n()
            r8.P2(r1)
            int r1 = r0.f5844a
            r8.O2(r1, r10)
            boolean r1 = r0.f5846c
            if (r1 == 0) goto L_0x00fc
            r8.G2(r2)
            androidx.recyclerview.widget.f r1 = r8.f5841y
            r8.b2(r9, r1, r10)
            r8.G2(r4)
            androidx.recyclerview.widget.f r1 = r8.f5841y
            int r2 = r0.f5844a
            int r5 = r1.f5997d
            int r2 = r2 + r5
            r1.f5996c = r2
            r8.b2(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.G2(r4)
            androidx.recyclerview.widget.f r1 = r8.f5841y
            r8.b2(r9, r1, r10)
            r8.G2(r2)
            androidx.recyclerview.widget.f r1 = r8.f5841y
            int r2 = r0.f5844a
            int r5 = r1.f5997d
            int r2 = r2 + r5
            r1.f5996c = r2
            r8.b2(r9, r1, r10)
        L_0x0113:
            r8.D2()
            int r1 = r8.J()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f5819A
            if (r1 == 0) goto L_0x0127
            r8.h2(r9, r10, r4)
            r8.i2(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.i2(r9, r10, r4)
            r8.h2(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x0155
            boolean r11 = r10.e()
            if (r11 != 0) goto L_0x0155
            int r11 = r8.f5824F
            if (r11 == 0) goto L_0x0155
            int r11 = r8.J()
            if (r11 <= 0) goto L_0x0155
            boolean r11 = r8.f5831M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.r2()
            if (r11 == 0) goto L_0x0155
        L_0x0149:
            java.lang.Runnable r11 = r8.f5834P
            r8.o1(r11)
            boolean r11 = r8.S1()
            if (r11 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r4 = r3
        L_0x0156:
            boolean r11 = r10.e()
            if (r11 == 0) goto L_0x0161
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f5830L
            r11.c()
        L_0x0161:
            boolean r11 = r0.f5846c
            r8.f5825G = r11
            boolean r11 = r8.t2()
            r8.f5826H = r11
            if (r4 == 0) goto L_0x0175
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f5830L
            r11.c()
            r8.w2(r9, r10, r3)
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    public void x1(int i4) {
        e eVar = this.f5827I;
        if (!(eVar == null || eVar.f5859e == i4)) {
            eVar.a();
        }
        this.f5821C = i4;
        this.f5822D = Integer.MIN_VALUE;
        t1();
    }

    public final boolean x2(int i4) {
        if (this.f5839w == 0) {
            return (i4 == -1) != this.f5819A;
        }
        return ((i4 == -1) == this.f5819A) == t2();
    }

    public int y1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        return F2(i4, uVar, zVar);
    }

    public void y2(int i4, RecyclerView.z zVar) {
        int i5;
        int i6;
        if (i4 > 0) {
            i6 = k2();
            i5 = 1;
        } else {
            i6 = j2();
            i5 = -1;
        }
        this.f5841y.f5994a = true;
        O2(i6, zVar);
        G2(i5);
        f fVar = this.f5841y;
        fVar.f5996c = i6 + fVar.f5997d;
        fVar.f5995b = Math.abs(i4);
    }

    public final void z2(View view) {
        for (int i4 = this.f5835s - 1; i4 >= 0; i4--) {
            this.f5836t[i4].u(view);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f5853a;

        /* renamed from: b  reason: collision with root package name */
        public List f5854b;

        public void a(a aVar) {
            if (this.f5854b == null) {
                this.f5854b = new ArrayList();
            }
            int size = this.f5854b.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar2 = (a) this.f5854b.get(i4);
                if (aVar2.f5855e == aVar.f5855e) {
                    this.f5854b.remove(i4);
                }
                if (aVar2.f5855e >= aVar.f5855e) {
                    this.f5854b.add(i4, aVar);
                    return;
                }
            }
            this.f5854b.add(aVar);
        }

        public void b() {
            int[] iArr = this.f5853a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5854b = null;
        }

        public void c(int i4) {
            int[] iArr = this.f5853a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i4, 10) + 1)];
                this.f5853a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[o(i4)];
                this.f5853a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f5853a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i4) {
            List list = this.f5854b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f5854b.get(size)).f5855e >= i4) {
                        this.f5854b.remove(size);
                    }
                }
            }
            return h(i4);
        }

        public a e(int i4, int i5, int i6, boolean z4) {
            List list = this.f5854b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                a aVar = (a) this.f5854b.get(i7);
                int i8 = aVar.f5855e;
                if (i8 >= i5) {
                    return null;
                }
                if (i8 >= i4 && (i6 == 0 || aVar.f5856f == i6 || (z4 && aVar.f5858h))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i4) {
            List list = this.f5854b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f5854b.get(size);
                if (aVar.f5855e == i4) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i4) {
            int[] iArr = this.f5853a;
            if (iArr == null || i4 >= iArr.length) {
                return -1;
            }
            return iArr[i4];
        }

        public int h(int i4) {
            int[] iArr = this.f5853a;
            if (iArr == null || i4 >= iArr.length) {
                return -1;
            }
            int i5 = i(i4);
            if (i5 == -1) {
                int[] iArr2 = this.f5853a;
                Arrays.fill(iArr2, i4, iArr2.length, -1);
                return this.f5853a.length;
            }
            int i6 = i5 + 1;
            Arrays.fill(this.f5853a, i4, i6, -1);
            return i6;
        }

        public final int i(int i4) {
            if (this.f5854b == null) {
                return -1;
            }
            a f4 = f(i4);
            if (f4 != null) {
                this.f5854b.remove(f4);
            }
            int size = this.f5854b.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    i5 = -1;
                    break;
                } else if (((a) this.f5854b.get(i5)).f5855e >= i4) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 == -1) {
                return -1;
            }
            this.f5854b.remove(i5);
            return ((a) this.f5854b.get(i5)).f5855e;
        }

        public void j(int i4, int i5) {
            int[] iArr = this.f5853a;
            if (iArr != null && i4 < iArr.length) {
                int i6 = i4 + i5;
                c(i6);
                int[] iArr2 = this.f5853a;
                System.arraycopy(iArr2, i4, iArr2, i6, (iArr2.length - i4) - i5);
                Arrays.fill(this.f5853a, i4, i6, -1);
                l(i4, i5);
            }
        }

        public void k(int i4, int i5) {
            int[] iArr = this.f5853a;
            if (iArr != null && i4 < iArr.length) {
                int i6 = i4 + i5;
                c(i6);
                int[] iArr2 = this.f5853a;
                System.arraycopy(iArr2, i6, iArr2, i4, (iArr2.length - i4) - i5);
                int[] iArr3 = this.f5853a;
                Arrays.fill(iArr3, iArr3.length - i5, iArr3.length, -1);
                m(i4, i5);
            }
        }

        public final void l(int i4, int i5) {
            List list = this.f5854b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.f5854b.get(size);
                    int i6 = aVar.f5855e;
                    if (i6 >= i4) {
                        aVar.f5855e = i6 + i5;
                    }
                }
            }
        }

        public final void m(int i4, int i5) {
            List list = this.f5854b;
            if (list != null) {
                int i6 = i4 + i5;
                for (int size = list.size() - 1; size >= 0; size--) {
                    a aVar = (a) this.f5854b.get(size);
                    int i7 = aVar.f5855e;
                    if (i7 >= i4) {
                        if (i7 < i6) {
                            this.f5854b.remove(size);
                        } else {
                            aVar.f5855e = i7 - i5;
                        }
                    }
                }
            }
        }

        public void n(int i4, f fVar) {
            c(i4);
            this.f5853a[i4] = fVar.f5873e;
        }

        public int o(int i4) {
            int length = this.f5853a.length;
            while (length <= i4) {
                length *= 2;
            }
            return length;
        }

        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0097a();

            /* renamed from: e  reason: collision with root package name */
            public int f5855e;

            /* renamed from: f  reason: collision with root package name */
            public int f5856f;

            /* renamed from: g  reason: collision with root package name */
            public int[] f5857g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f5858h;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public static class C0097a implements Parcelable.Creator {
                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b */
                public a[] newArray(int i4) {
                    return new a[i4];
                }
            }

            public a(Parcel parcel) {
                this.f5855e = parcel.readInt();
                this.f5856f = parcel.readInt();
                this.f5858h = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f5857g = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i4) {
                int[] iArr = this.f5857g;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i4];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f5855e + ", mGapDir=" + this.f5856f + ", mHasUnwantedGapAfter=" + this.f5858h + ", mGapPerSpan=" + Arrays.toString(this.f5857g) + '}';
            }

            public void writeToParcel(Parcel parcel, int i4) {
                parcel.writeInt(this.f5855e);
                parcel.writeInt(this.f5856f);
                parcel.writeInt(this.f5858h ? 1 : 0);
                int[] iArr = this.f5857g;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f5857g);
            }

            public a() {
            }
        }
    }
}
