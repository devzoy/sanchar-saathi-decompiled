package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* renamed from: A  reason: collision with root package name */
    public int f5578A = -1;

    /* renamed from: B  reason: collision with root package name */
    public int f5579B = Integer.MIN_VALUE;

    /* renamed from: C  reason: collision with root package name */
    public boolean f5580C;

    /* renamed from: D  reason: collision with root package name */
    public d f5581D = null;

    /* renamed from: E  reason: collision with root package name */
    public final a f5582E = new a();

    /* renamed from: F  reason: collision with root package name */
    public final b f5583F = new b();

    /* renamed from: G  reason: collision with root package name */
    public int f5584G = 2;

    /* renamed from: H  reason: collision with root package name */
    public int[] f5585H = new int[2];

    /* renamed from: s  reason: collision with root package name */
    public int f5586s = 1;

    /* renamed from: t  reason: collision with root package name */
    public c f5587t;

    /* renamed from: u  reason: collision with root package name */
    public i f5588u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5589v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5590w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5591x = false;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5592y = false;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5593z = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public i f5594a;

        /* renamed from: b  reason: collision with root package name */
        public int f5595b;

        /* renamed from: c  reason: collision with root package name */
        public int f5596c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5597d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f5598e;

        public a() {
            e();
        }

        public void a() {
            this.f5596c = this.f5597d ? this.f5594a.i() : this.f5594a.m();
        }

        public void b(View view, int i4) {
            if (this.f5597d) {
                this.f5596c = this.f5594a.d(view) + this.f5594a.o();
            } else {
                this.f5596c = this.f5594a.g(view);
            }
            this.f5595b = i4;
        }

        public void c(View view, int i4) {
            int o4 = this.f5594a.o();
            if (o4 >= 0) {
                b(view, i4);
                return;
            }
            this.f5595b = i4;
            if (this.f5597d) {
                int i5 = (this.f5594a.i() - o4) - this.f5594a.d(view);
                this.f5596c = this.f5594a.i() - i5;
                if (i5 > 0) {
                    int e4 = this.f5596c - this.f5594a.e(view);
                    int m4 = this.f5594a.m();
                    int min = e4 - (m4 + Math.min(this.f5594a.g(view) - m4, 0));
                    if (min < 0) {
                        this.f5596c += Math.min(i5, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g4 = this.f5594a.g(view);
            int m5 = g4 - this.f5594a.m();
            this.f5596c = g4;
            if (m5 > 0) {
                int i6 = (this.f5594a.i() - Math.min(0, (this.f5594a.i() - o4) - this.f5594a.d(view))) - (g4 + this.f5594a.e(view));
                if (i6 < 0) {
                    this.f5596c -= Math.min(m5, -i6);
                }
            }
        }

        public boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < zVar.b();
        }

        public void e() {
            this.f5595b = -1;
            this.f5596c = Integer.MIN_VALUE;
            this.f5597d = false;
            this.f5598e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f5595b + ", mCoordinate=" + this.f5596c + ", mLayoutFromEnd=" + this.f5597d + ", mValid=" + this.f5598e + '}';
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f5599a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f5600b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5601c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5602d;

        public void a() {
            this.f5599a = 0;
            this.f5600b = false;
            this.f5601c = false;
            this.f5602d = false;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f5603a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f5604b;

        /* renamed from: c  reason: collision with root package name */
        public int f5605c;

        /* renamed from: d  reason: collision with root package name */
        public int f5606d;

        /* renamed from: e  reason: collision with root package name */
        public int f5607e;

        /* renamed from: f  reason: collision with root package name */
        public int f5608f;

        /* renamed from: g  reason: collision with root package name */
        public int f5609g;

        /* renamed from: h  reason: collision with root package name */
        public int f5610h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f5611i = 0;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5612j = false;

        /* renamed from: k  reason: collision with root package name */
        public int f5613k;

        /* renamed from: l  reason: collision with root package name */
        public List f5614l = null;

        /* renamed from: m  reason: collision with root package name */
        public boolean f5615m;

        public void a() {
            b((View) null);
        }

        public void b(View view) {
            View f4 = f(view);
            if (f4 == null) {
                this.f5606d = -1;
            } else {
                this.f5606d = ((RecyclerView.p) f4.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.z zVar) {
            int i4 = this.f5606d;
            return i4 >= 0 && i4 < zVar.b();
        }

        public View d(RecyclerView.u uVar) {
            if (this.f5614l != null) {
                return e();
            }
            View o4 = uVar.o(this.f5606d);
            this.f5606d += this.f5607e;
            return o4;
        }

        public final View e() {
            int size = this.f5614l.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = ((RecyclerView.C) this.f5614l.get(i4)).f5707a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f5606d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int a4;
            int size = this.f5614l.size();
            View view2 = null;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < size; i5++) {
                View view3 = ((RecyclerView.C) this.f5614l.get(i5)).f5707a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a4 = (pVar.a() - this.f5606d) * this.f5607e) >= 0 && a4 < i4) {
                    view2 = view3;
                    if (a4 == 0) {
                        break;
                    }
                    i4 = a4;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: e  reason: collision with root package name */
        public int f5616e;

        /* renamed from: f  reason: collision with root package name */
        public int f5617f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5618g;

        public static class a implements Parcelable.Creator {
            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i4) {
                return new d[i4];
            }
        }

        public d() {
        }

        public boolean a() {
            return this.f5616e >= 0;
        }

        public void c() {
            this.f5616e = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i4) {
            parcel.writeInt(this.f5616e);
            parcel.writeInt(this.f5617f);
            parcel.writeInt(this.f5618g ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.f5616e = parcel.readInt();
            this.f5617f = parcel.readInt();
            this.f5618g = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f5616e = dVar.f5616e;
            this.f5617f = dVar.f5617f;
            this.f5618g = dVar.f5618g;
        }
    }

    public LinearLayoutManager(Context context, int i4, boolean z4) {
        C2(i4);
        D2(z4);
    }

    public final void A2() {
        if (this.f5586s == 1 || !q2()) {
            this.f5591x = this.f5590w;
        } else {
            this.f5591x = !this.f5590w;
        }
    }

    public int B2(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (J() == 0 || i4 == 0) {
            return 0;
        }
        T1();
        this.f5587t.f5603a = true;
        int i5 = i4 > 0 ? 1 : -1;
        int abs = Math.abs(i4);
        I2(i5, abs, true, zVar);
        c cVar = this.f5587t;
        int U12 = cVar.f5609g + U1(uVar, cVar, zVar, false);
        if (U12 < 0) {
            return 0;
        }
        if (abs > U12) {
            i4 = i5 * U12;
        }
        this.f5588u.r(-i4);
        this.f5587t.f5613k = i4;
        return i4;
    }

    public View C(int i4) {
        int J4 = J();
        if (J4 == 0) {
            return null;
        }
        int h02 = i4 - h0(I(0));
        if (h02 >= 0 && h02 < J4) {
            View I4 = I(h02);
            if (h0(I4) == i4) {
                return I4;
            }
        }
        return super.C(i4);
    }

    public void C2(int i4) {
        if (i4 == 0 || i4 == 1) {
            g((String) null);
            if (i4 != this.f5586s || this.f5588u == null) {
                i b4 = i.b(this, i4);
                this.f5588u = b4;
                this.f5582E.f5594a = b4;
                this.f5586s = i4;
                t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i4);
    }

    public RecyclerView.p D() {
        return new RecyclerView.p(-2, -2);
    }

    public void D2(boolean z4) {
        g((String) null);
        if (z4 != this.f5590w) {
            this.f5590w = z4;
            t1();
        }
    }

    public void E2(boolean z4) {
        g((String) null);
        if (this.f5592y != z4) {
            this.f5592y = z4;
            t1();
        }
    }

    public final boolean F2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (J() == 0) {
            return false;
        }
        View V3 = V();
        if (V3 != null && aVar.d(V3, zVar)) {
            aVar.c(V3, h0(V3));
            return true;
        } else if (this.f5589v != this.f5592y) {
            return false;
        } else {
            View i22 = aVar.f5597d ? i2(uVar, zVar) : j2(uVar, zVar);
            if (i22 == null) {
                return false;
            }
            aVar.b(i22, h0(i22));
            if (!zVar.e() && L1() && (this.f5588u.g(i22) >= this.f5588u.i() || this.f5588u.d(i22) < this.f5588u.m())) {
                aVar.f5596c = aVar.f5597d ? this.f5588u.i() : this.f5588u.m();
            }
            return true;
        }
    }

    public boolean G1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    public final boolean G2(RecyclerView.z zVar, a aVar) {
        int i4;
        boolean z4 = false;
        if (!zVar.e() && (i4 = this.f5578A) != -1) {
            if (i4 < 0 || i4 >= zVar.b()) {
                this.f5578A = -1;
                this.f5579B = Integer.MIN_VALUE;
            } else {
                aVar.f5595b = this.f5578A;
                d dVar = this.f5581D;
                if (dVar != null && dVar.a()) {
                    boolean z5 = this.f5581D.f5618g;
                    aVar.f5597d = z5;
                    if (z5) {
                        aVar.f5596c = this.f5588u.i() - this.f5581D.f5617f;
                    } else {
                        aVar.f5596c = this.f5588u.m() + this.f5581D.f5617f;
                    }
                    return true;
                } else if (this.f5579B == Integer.MIN_VALUE) {
                    View C4 = C(this.f5578A);
                    if (C4 == null) {
                        if (J() > 0) {
                            if ((this.f5578A < h0(I(0))) == this.f5591x) {
                                z4 = true;
                            }
                            aVar.f5597d = z4;
                        }
                        aVar.a();
                    } else if (this.f5588u.e(C4) > this.f5588u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.f5588u.g(C4) - this.f5588u.m() < 0) {
                        aVar.f5596c = this.f5588u.m();
                        aVar.f5597d = false;
                        return true;
                    } else if (this.f5588u.i() - this.f5588u.d(C4) < 0) {
                        aVar.f5596c = this.f5588u.i();
                        aVar.f5597d = true;
                        return true;
                    } else {
                        aVar.f5596c = aVar.f5597d ? this.f5588u.d(C4) + this.f5588u.o() : this.f5588u.g(C4);
                    }
                    return true;
                } else {
                    boolean z6 = this.f5591x;
                    aVar.f5597d = z6;
                    if (z6) {
                        aVar.f5596c = this.f5588u.i() - this.f5579B;
                    } else {
                        aVar.f5596c = this.f5588u.m() + this.f5579B;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void H2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (!G2(zVar, aVar) && !F2(uVar, zVar, aVar)) {
            aVar.a();
            aVar.f5595b = this.f5592y ? zVar.b() - 1 : 0;
        }
    }

    public void I0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.I0(recyclerView, uVar);
        if (this.f5580C) {
            k1(uVar);
            uVar.c();
        }
    }

    public void I1(RecyclerView recyclerView, RecyclerView.z zVar, int i4) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i4);
        J1(gVar);
    }

    public final void I2(int i4, int i5, boolean z4, RecyclerView.z zVar) {
        int i6;
        this.f5587t.f5615m = z2();
        this.f5587t.f5608f = i4;
        int[] iArr = this.f5585H;
        boolean z5 = false;
        iArr[0] = 0;
        int i7 = 1;
        iArr[1] = 0;
        M1(zVar, iArr);
        int max = Math.max(0, this.f5585H[0]);
        int max2 = Math.max(0, this.f5585H[1]);
        if (i4 == 1) {
            z5 = true;
        }
        c cVar = this.f5587t;
        int i8 = z5 ? max2 : max;
        cVar.f5610h = i8;
        if (!z5) {
            max = max2;
        }
        cVar.f5611i = max;
        if (z5) {
            cVar.f5610h = i8 + this.f5588u.j();
            View m22 = m2();
            c cVar2 = this.f5587t;
            if (this.f5591x) {
                i7 = -1;
            }
            cVar2.f5607e = i7;
            int h02 = h0(m22);
            c cVar3 = this.f5587t;
            cVar2.f5606d = h02 + cVar3.f5607e;
            cVar3.f5604b = this.f5588u.d(m22);
            i6 = this.f5588u.d(m22) - this.f5588u.i();
        } else {
            View n22 = n2();
            this.f5587t.f5610h += this.f5588u.m();
            c cVar4 = this.f5587t;
            if (!this.f5591x) {
                i7 = -1;
            }
            cVar4.f5607e = i7;
            int h03 = h0(n22);
            c cVar5 = this.f5587t;
            cVar4.f5606d = h03 + cVar5.f5607e;
            cVar5.f5604b = this.f5588u.g(n22);
            i6 = (-this.f5588u.g(n22)) + this.f5588u.m();
        }
        c cVar6 = this.f5587t;
        cVar6.f5605c = i5;
        if (z4) {
            cVar6.f5605c = i5 - i6;
        }
        cVar6.f5609g = i6;
    }

    public View J0(View view, int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        int R12;
        A2();
        if (J() == 0 || (R12 = R1(i4)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        I2(R12, (int) (((float) this.f5588u.n()) * 0.33333334f), false, zVar);
        c cVar = this.f5587t;
        cVar.f5609g = Integer.MIN_VALUE;
        cVar.f5603a = false;
        U1(uVar, cVar, zVar, true);
        View g22 = R12 == -1 ? g2() : f2();
        View n22 = R12 == -1 ? n2() : m2();
        if (!n22.hasFocusable()) {
            return g22;
        }
        if (g22 == null) {
            return null;
        }
        return n22;
    }

    public final void J2(int i4, int i5) {
        this.f5587t.f5605c = this.f5588u.i() - i5;
        c cVar = this.f5587t;
        cVar.f5607e = this.f5591x ? -1 : 1;
        cVar.f5606d = i4;
        cVar.f5608f = 1;
        cVar.f5604b = i5;
        cVar.f5609g = Integer.MIN_VALUE;
    }

    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Z1());
            accessibilityEvent.setToIndex(c2());
        }
    }

    public final void K2(a aVar) {
        J2(aVar.f5595b, aVar.f5596c);
    }

    public boolean L1() {
        return this.f5581D == null && this.f5589v == this.f5592y;
    }

    public final void L2(int i4, int i5) {
        this.f5587t.f5605c = i5 - this.f5588u.m();
        c cVar = this.f5587t;
        cVar.f5606d = i4;
        cVar.f5607e = this.f5591x ? 1 : -1;
        cVar.f5608f = -1;
        cVar.f5604b = i5;
        cVar.f5609g = Integer.MIN_VALUE;
    }

    public void M1(RecyclerView.z zVar, int[] iArr) {
        int i4;
        int o22 = o2(zVar);
        if (this.f5587t.f5608f == -1) {
            i4 = 0;
        } else {
            i4 = o22;
            o22 = 0;
        }
        iArr[0] = o22;
        iArr[1] = i4;
    }

    public final void M2(a aVar) {
        L2(aVar.f5595b, aVar.f5596c);
    }

    public void N1(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i4 = cVar.f5606d;
        if (i4 >= 0 && i4 < zVar.b()) {
            cVar2.a(i4, Math.max(0, cVar.f5609g));
        }
    }

    public final int O1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        i iVar = this.f5588u;
        View Y12 = Y1(!this.f5593z, true);
        return l.a(zVar, iVar, Y12, X1(!this.f5593z, true), this, this.f5593z);
    }

    public final int P1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        i iVar = this.f5588u;
        View Y12 = Y1(!this.f5593z, true);
        return l.b(zVar, iVar, Y12, X1(!this.f5593z, true), this, this.f5593z, this.f5591x);
    }

    public final int Q1(RecyclerView.z zVar) {
        if (J() == 0) {
            return 0;
        }
        T1();
        i iVar = this.f5588u;
        View Y12 = Y1(!this.f5593z, true);
        return l.c(zVar, iVar, Y12, X1(!this.f5593z, true), this, this.f5593z);
    }

    public int R1(int i4) {
        if (i4 == 1) {
            return (this.f5586s != 1 && q2()) ? 1 : -1;
        }
        if (i4 == 2) {
            return (this.f5586s != 1 && q2()) ? -1 : 1;
        }
        if (i4 == 17) {
            return this.f5586s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i4 == 33) {
            return this.f5586s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i4 == 66) {
            return this.f5586s == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i4 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f5586s == 1 ? 1 : Integer.MIN_VALUE;
    }

    public c S1() {
        return new c();
    }

    public void T1() {
        if (this.f5587t == null) {
            this.f5587t = S1();
        }
    }

    public int U1(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z4) {
        int i4 = cVar.f5605c;
        int i5 = cVar.f5609g;
        if (i5 != Integer.MIN_VALUE) {
            if (i4 < 0) {
                cVar.f5609g = i5 + i4;
            }
            v2(uVar, cVar);
        }
        int i6 = cVar.f5605c + cVar.f5610h;
        b bVar = this.f5583F;
        while (true) {
            if ((!cVar.f5615m && i6 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            s2(uVar, zVar, cVar, bVar);
            if (!bVar.f5600b) {
                cVar.f5604b += bVar.f5599a * cVar.f5608f;
                if (!bVar.f5601c || cVar.f5614l != null || !zVar.e()) {
                    int i7 = cVar.f5605c;
                    int i8 = bVar.f5599a;
                    cVar.f5605c = i7 - i8;
                    i6 -= i8;
                }
                int i9 = cVar.f5609g;
                if (i9 != Integer.MIN_VALUE) {
                    int i10 = i9 + bVar.f5599a;
                    cVar.f5609g = i10;
                    int i11 = cVar.f5605c;
                    if (i11 < 0) {
                        cVar.f5609g = i10 + i11;
                    }
                    v2(uVar, cVar);
                }
                if (z4 && bVar.f5602d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i4 - cVar.f5605c;
    }

    public final View V1() {
        return d2(0, J());
    }

    public final View W1(RecyclerView.u uVar, RecyclerView.z zVar) {
        return h2(uVar, zVar, 0, J(), zVar.b());
    }

    public void X0(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int k22;
        int i8;
        View C4;
        int g4;
        int i9;
        int i10 = -1;
        if (!(this.f5581D == null && this.f5578A == -1) && zVar.b() == 0) {
            k1(uVar);
            return;
        }
        d dVar = this.f5581D;
        if (dVar != null && dVar.a()) {
            this.f5578A = this.f5581D.f5616e;
        }
        T1();
        this.f5587t.f5603a = false;
        A2();
        View V3 = V();
        a aVar = this.f5582E;
        if (!aVar.f5598e || this.f5578A != -1 || this.f5581D != null) {
            aVar.e();
            a aVar2 = this.f5582E;
            aVar2.f5597d = this.f5591x ^ this.f5592y;
            H2(uVar, zVar, aVar2);
            this.f5582E.f5598e = true;
        } else if (V3 != null && (this.f5588u.g(V3) >= this.f5588u.i() || this.f5588u.d(V3) <= this.f5588u.m())) {
            this.f5582E.c(V3, h0(V3));
        }
        c cVar = this.f5587t;
        cVar.f5608f = cVar.f5613k >= 0 ? 1 : -1;
        int[] iArr = this.f5585H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(zVar, iArr);
        int max = Math.max(0, this.f5585H[0]) + this.f5588u.m();
        int max2 = Math.max(0, this.f5585H[1]) + this.f5588u.j();
        if (!(!zVar.e() || (i8 = this.f5578A) == -1 || this.f5579B == Integer.MIN_VALUE || (C4 = C(i8)) == null)) {
            if (this.f5591x) {
                i9 = this.f5588u.i() - this.f5588u.d(C4);
                g4 = this.f5579B;
            } else {
                g4 = this.f5588u.g(C4) - this.f5588u.m();
                i9 = this.f5579B;
            }
            int i11 = i9 - g4;
            if (i11 > 0) {
                max += i11;
            } else {
                max2 -= i11;
            }
        }
        a aVar3 = this.f5582E;
        if (!aVar3.f5597d ? !this.f5591x : this.f5591x) {
            i10 = 1;
        }
        u2(uVar, zVar, aVar3, i10);
        w(uVar);
        this.f5587t.f5615m = z2();
        this.f5587t.f5612j = zVar.e();
        this.f5587t.f5611i = 0;
        a aVar4 = this.f5582E;
        if (aVar4.f5597d) {
            M2(aVar4);
            c cVar2 = this.f5587t;
            cVar2.f5610h = max;
            U1(uVar, cVar2, zVar, false);
            c cVar3 = this.f5587t;
            i5 = cVar3.f5604b;
            int i12 = cVar3.f5606d;
            int i13 = cVar3.f5605c;
            if (i13 > 0) {
                max2 += i13;
            }
            K2(this.f5582E);
            c cVar4 = this.f5587t;
            cVar4.f5610h = max2;
            cVar4.f5606d += cVar4.f5607e;
            U1(uVar, cVar4, zVar, false);
            c cVar5 = this.f5587t;
            i4 = cVar5.f5604b;
            int i14 = cVar5.f5605c;
            if (i14 > 0) {
                L2(i12, i5);
                c cVar6 = this.f5587t;
                cVar6.f5610h = i14;
                U1(uVar, cVar6, zVar, false);
                i5 = this.f5587t.f5604b;
            }
        } else {
            K2(aVar4);
            c cVar7 = this.f5587t;
            cVar7.f5610h = max2;
            U1(uVar, cVar7, zVar, false);
            c cVar8 = this.f5587t;
            i4 = cVar8.f5604b;
            int i15 = cVar8.f5606d;
            int i16 = cVar8.f5605c;
            if (i16 > 0) {
                max += i16;
            }
            M2(this.f5582E);
            c cVar9 = this.f5587t;
            cVar9.f5610h = max;
            cVar9.f5606d += cVar9.f5607e;
            U1(uVar, cVar9, zVar, false);
            c cVar10 = this.f5587t;
            i5 = cVar10.f5604b;
            int i17 = cVar10.f5605c;
            if (i17 > 0) {
                J2(i15, i4);
                c cVar11 = this.f5587t;
                cVar11.f5610h = i17;
                U1(uVar, cVar11, zVar, false);
                i4 = this.f5587t.f5604b;
            }
        }
        if (J() > 0) {
            if (this.f5591x ^ this.f5592y) {
                int k23 = k2(i4, uVar, zVar, true);
                i6 = i5 + k23;
                i7 = i4 + k23;
                k22 = l2(i6, uVar, zVar, false);
            } else {
                int l22 = l2(i5, uVar, zVar, true);
                i6 = i5 + l22;
                i7 = i4 + l22;
                k22 = k2(i7, uVar, zVar, false);
            }
            i5 = i6 + k22;
            i4 = i7 + k22;
        }
        t2(uVar, zVar, i5, i4);
        if (!zVar.e()) {
            this.f5588u.s();
        } else {
            this.f5582E.e();
        }
        this.f5589v = this.f5592y;
    }

    public View X1(boolean z4, boolean z5) {
        return this.f5591x ? e2(0, J(), z4, z5) : e2(J() - 1, -1, z4, z5);
    }

    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.f5581D = null;
        this.f5578A = -1;
        this.f5579B = Integer.MIN_VALUE;
        this.f5582E.e();
    }

    public View Y1(boolean z4, boolean z5) {
        return this.f5591x ? e2(J() - 1, -1, z4, z5) : e2(0, J(), z4, z5);
    }

    public int Z1() {
        View e22 = e2(0, J(), false, true);
        if (e22 == null) {
            return -1;
        }
        return h0(e22);
    }

    public PointF a(int i4) {
        if (J() == 0) {
            return null;
        }
        boolean z4 = false;
        int i5 = 1;
        if (i4 < h0(I(0))) {
            z4 = true;
        }
        if (z4 != this.f5591x) {
            i5 = -1;
        }
        return this.f5586s == 0 ? new PointF((float) i5, 0.0f) : new PointF(0.0f, (float) i5);
    }

    public final View a2() {
        return d2(J() - 1, -1);
    }

    public final View b2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return h2(uVar, zVar, J() - 1, -1, zVar.b());
    }

    public void c1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.f5581D = (d) parcelable;
            t1();
        }
    }

    public int c2() {
        View e22 = e2(J() - 1, -1, false, true);
        if (e22 == null) {
            return -1;
        }
        return h0(e22);
    }

    public Parcelable d1() {
        if (this.f5581D != null) {
            return new d(this.f5581D);
        }
        d dVar = new d();
        if (J() > 0) {
            T1();
            boolean z4 = this.f5589v ^ this.f5591x;
            dVar.f5618g = z4;
            if (z4) {
                View m22 = m2();
                dVar.f5617f = this.f5588u.i() - this.f5588u.d(m22);
                dVar.f5616e = h0(m22);
            } else {
                View n22 = n2();
                dVar.f5616e = h0(n22);
                dVar.f5617f = this.f5588u.g(n22) - this.f5588u.m();
            }
        } else {
            dVar.c();
        }
        return dVar;
    }

    public View d2(int i4, int i5) {
        int i6;
        int i7;
        T1();
        if (i5 <= i4 && i5 >= i4) {
            return I(i4);
        }
        if (this.f5588u.g(I(i4)) < this.f5588u.m()) {
            i7 = 16644;
            i6 = 16388;
        } else {
            i7 = 4161;
            i6 = 4097;
        }
        return this.f5586s == 0 ? this.f5747e.a(i4, i5, i7, i6) : this.f5748f.a(i4, i5, i7, i6);
    }

    public View e2(int i4, int i5, boolean z4, boolean z5) {
        T1();
        int i6 = 320;
        int i7 = z4 ? 24579 : 320;
        if (!z5) {
            i6 = 0;
        }
        return this.f5586s == 0 ? this.f5747e.a(i4, i5, i7, i6) : this.f5748f.a(i4, i5, i7, i6);
    }

    public final View f2() {
        return this.f5591x ? V1() : a2();
    }

    public void g(String str) {
        if (this.f5581D == null) {
            super.g(str);
        }
    }

    public final View g2() {
        return this.f5591x ? a2() : V1();
    }

    public View h2(RecyclerView.u uVar, RecyclerView.z zVar, int i4, int i5, int i6) {
        T1();
        int m4 = this.f5588u.m();
        int i7 = this.f5588u.i();
        int i8 = i5 > i4 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i4 != i5) {
            View I4 = I(i4);
            int h02 = h0(I4);
            if (h02 >= 0 && h02 < i6) {
                if (((RecyclerView.p) I4.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I4;
                    }
                } else if (this.f5588u.g(I4) < i7 && this.f5588u.d(I4) >= m4) {
                    return I4;
                } else {
                    if (view == null) {
                        view = I4;
                    }
                }
            }
            i4 += i8;
        }
        return view != null ? view : view2;
    }

    public final View i2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f5591x ? W1(uVar, zVar) : b2(uVar, zVar);
    }

    public final View j2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f5591x ? b2(uVar, zVar) : W1(uVar, zVar);
    }

    public boolean k() {
        return this.f5586s == 0;
    }

    public final int k2(int i4, RecyclerView.u uVar, RecyclerView.z zVar, boolean z4) {
        int i5;
        int i6 = this.f5588u.i() - i4;
        if (i6 <= 0) {
            return 0;
        }
        int i7 = -B2(-i6, uVar, zVar);
        int i8 = i4 + i7;
        if (!z4 || (i5 = this.f5588u.i() - i8) <= 0) {
            return i7;
        }
        this.f5588u.r(i5);
        return i5 + i7;
    }

    public boolean l() {
        return this.f5586s == 1;
    }

    public final int l2(int i4, RecyclerView.u uVar, RecyclerView.z zVar, boolean z4) {
        int m4;
        int m5 = i4 - this.f5588u.m();
        if (m5 <= 0) {
            return 0;
        }
        int i5 = -B2(m5, uVar, zVar);
        int i6 = i4 + i5;
        if (!z4 || (m4 = i6 - this.f5588u.m()) <= 0) {
            return i5;
        }
        this.f5588u.r(-m4);
        return i5 - m4;
    }

    public final View m2() {
        return I(this.f5591x ? 0 : J() - 1);
    }

    public final View n2() {
        return I(this.f5591x ? J() - 1 : 0);
    }

    public void o(int i4, int i5, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        if (this.f5586s != 0) {
            i4 = i5;
        }
        if (J() != 0 && i4 != 0) {
            T1();
            I2(i4 > 0 ? 1 : -1, Math.abs(i4), true, zVar);
            N1(zVar, this.f5587t, cVar);
        }
    }

    public int o2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.f5588u.n();
        }
        return 0;
    }

    public void p(int i4, RecyclerView.o.c cVar) {
        boolean z4;
        int i5;
        d dVar = this.f5581D;
        int i6 = -1;
        if (dVar == null || !dVar.a()) {
            A2();
            z4 = this.f5591x;
            i5 = this.f5578A;
            if (i5 == -1) {
                i5 = z4 ? i4 - 1 : 0;
            }
        } else {
            d dVar2 = this.f5581D;
            z4 = dVar2.f5618g;
            i5 = dVar2.f5616e;
        }
        if (!z4) {
            i6 = 1;
        }
        for (int i7 = 0; i7 < this.f5584G && i5 >= 0 && i5 < i4; i7++) {
            cVar.a(i5, 0);
            i5 += i6;
        }
    }

    public int p2() {
        return this.f5586s;
    }

    public int q(RecyclerView.z zVar) {
        return O1(zVar);
    }

    public boolean q2() {
        return Z() == 1;
    }

    public int r(RecyclerView.z zVar) {
        return P1(zVar);
    }

    public boolean r2() {
        return this.f5593z;
    }

    public int s(RecyclerView.z zVar) {
        return Q1(zVar);
    }

    public boolean s0() {
        return true;
    }

    public void s2(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        View d4 = cVar.d(uVar);
        if (d4 == null) {
            bVar.f5600b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d4.getLayoutParams();
        if (cVar.f5614l == null) {
            if (this.f5591x == (cVar.f5608f == -1)) {
                d(d4);
            } else {
                e(d4, 0);
            }
        } else {
            if (this.f5591x == (cVar.f5608f == -1)) {
                b(d4);
            } else {
                c(d4, 0);
            }
        }
        A0(d4, 0, 0);
        bVar.f5599a = this.f5588u.e(d4);
        if (this.f5586s == 1) {
            if (q2()) {
                i8 = o0() - f0();
                i7 = i8 - this.f5588u.f(d4);
            } else {
                i7 = e0();
                i8 = this.f5588u.f(d4) + i7;
            }
            if (cVar.f5608f == -1) {
                int i9 = cVar.f5604b;
                i4 = i9;
                i5 = i8;
                i6 = i9 - bVar.f5599a;
            } else {
                int i10 = cVar.f5604b;
                i6 = i10;
                i5 = i8;
                i4 = bVar.f5599a + i10;
            }
        } else {
            int g02 = g0();
            int f4 = this.f5588u.f(d4) + g02;
            if (cVar.f5608f == -1) {
                int i11 = cVar.f5604b;
                i5 = i11;
                i6 = g02;
                i4 = f4;
                i7 = i11 - bVar.f5599a;
            } else {
                int i12 = cVar.f5604b;
                i6 = g02;
                i5 = bVar.f5599a + i12;
                i4 = f4;
                i7 = i12;
            }
        }
        z0(d4, i7, i6, i5, i4);
        if (pVar.c() || pVar.b()) {
            bVar.f5601c = true;
        }
        bVar.f5602d = d4.hasFocusable();
    }

    public int t(RecyclerView.z zVar) {
        return O1(zVar);
    }

    public final void t2(RecyclerView.u uVar, RecyclerView.z zVar, int i4, int i5) {
        if (zVar.g() && J() != 0 && !zVar.e() && L1()) {
            List k4 = uVar.k();
            int size = k4.size();
            int h02 = h0(I(0));
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < size; i8++) {
                RecyclerView.C c4 = (RecyclerView.C) k4.get(i8);
                if (!c4.v()) {
                    if ((c4.m() < h02) != this.f5591x) {
                        i6 += this.f5588u.e(c4.f5707a);
                    } else {
                        i7 += this.f5588u.e(c4.f5707a);
                    }
                }
            }
            this.f5587t.f5614l = k4;
            if (i6 > 0) {
                L2(h0(n2()), i4);
                c cVar = this.f5587t;
                cVar.f5610h = i6;
                cVar.f5605c = 0;
                cVar.a();
                U1(uVar, this.f5587t, zVar, false);
            }
            if (i7 > 0) {
                J2(h0(m2()), i5);
                c cVar2 = this.f5587t;
                cVar2.f5610h = i7;
                cVar2.f5605c = 0;
                cVar2.a();
                U1(uVar, this.f5587t, zVar, false);
            }
            this.f5587t.f5614l = null;
        }
    }

    public int u(RecyclerView.z zVar) {
        return P1(zVar);
    }

    public void u2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i4) {
    }

    public int v(RecyclerView.z zVar) {
        return Q1(zVar);
    }

    public final void v2(RecyclerView.u uVar, c cVar) {
        if (cVar.f5603a && !cVar.f5615m) {
            int i4 = cVar.f5609g;
            int i5 = cVar.f5611i;
            if (cVar.f5608f == -1) {
                x2(uVar, i4, i5);
            } else {
                y2(uVar, i4, i5);
            }
        }
    }

    public int w1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f5586s == 1) {
            return 0;
        }
        return B2(i4, uVar, zVar);
    }

    public final void w2(RecyclerView.u uVar, int i4, int i5) {
        if (i4 != i5) {
            if (i5 > i4) {
                for (int i6 = i5 - 1; i6 >= i4; i6--) {
                    n1(i6, uVar);
                }
                return;
            }
            while (i4 > i5) {
                n1(i4, uVar);
                i4--;
            }
        }
    }

    public void x1(int i4) {
        this.f5578A = i4;
        this.f5579B = Integer.MIN_VALUE;
        d dVar = this.f5581D;
        if (dVar != null) {
            dVar.c();
        }
        t1();
    }

    public final void x2(RecyclerView.u uVar, int i4, int i5) {
        int J4 = J();
        if (i4 >= 0) {
            int h4 = (this.f5588u.h() - i4) + i5;
            if (this.f5591x) {
                for (int i6 = 0; i6 < J4; i6++) {
                    View I4 = I(i6);
                    if (this.f5588u.g(I4) < h4 || this.f5588u.q(I4) < h4) {
                        w2(uVar, 0, i6);
                        return;
                    }
                }
                return;
            }
            int i7 = J4 - 1;
            for (int i8 = i7; i8 >= 0; i8--) {
                View I5 = I(i8);
                if (this.f5588u.g(I5) < h4 || this.f5588u.q(I5) < h4) {
                    w2(uVar, i7, i8);
                    return;
                }
            }
        }
    }

    public int y1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f5586s == 0) {
            return 0;
        }
        return B2(i4, uVar, zVar);
    }

    public final void y2(RecyclerView.u uVar, int i4, int i5) {
        if (i4 >= 0) {
            int i6 = i4 - i5;
            int J4 = J();
            if (this.f5591x) {
                int i7 = J4 - 1;
                for (int i8 = i7; i8 >= 0; i8--) {
                    View I4 = I(i8);
                    if (this.f5588u.d(I4) > i6 || this.f5588u.p(I4) > i6) {
                        w2(uVar, i7, i8);
                        return;
                    }
                }
                return;
            }
            for (int i9 = 0; i9 < J4; i9++) {
                View I5 = I(i9);
                if (this.f5588u.d(I5) > i6 || this.f5588u.p(I5) > i6) {
                    w2(uVar, 0, i9);
                    return;
                }
            }
        }
    }

    public boolean z2() {
        return this.f5588u.k() == 0 && this.f5588u.h() == 0;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        RecyclerView.o.d i02 = RecyclerView.o.i0(context, attributeSet, i4, i5);
        C2(i02.f5763a);
        D2(i02.f5765c);
        E2(i02.f5766d);
    }
}
