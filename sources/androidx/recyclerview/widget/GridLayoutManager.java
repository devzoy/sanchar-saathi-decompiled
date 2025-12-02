package androidx.recyclerview.widget;

import T.m;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I  reason: collision with root package name */
    public boolean f5563I = false;

    /* renamed from: J  reason: collision with root package name */
    public int f5564J = -1;

    /* renamed from: K  reason: collision with root package name */
    public int[] f5565K;

    /* renamed from: L  reason: collision with root package name */
    public View[] f5566L;

    /* renamed from: M  reason: collision with root package name */
    public final SparseIntArray f5567M = new SparseIntArray();

    /* renamed from: N  reason: collision with root package name */
    public final SparseIntArray f5568N = new SparseIntArray();

    /* renamed from: O  reason: collision with root package name */
    public c f5569O = new a();

    /* renamed from: P  reason: collision with root package name */
    public final Rect f5570P = new Rect();

    /* renamed from: Q  reason: collision with root package name */
    public boolean f5571Q;

    public static final class a extends c {
        public int e(int i4, int i5) {
            return i4 % i5;
        }

        public int f(int i4) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f5574a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f5575b = new SparseIntArray();

        /* renamed from: c  reason: collision with root package name */
        public boolean f5576c = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5577d = false;

        public static int a(SparseIntArray sparseIntArray, int i4) {
            int size = sparseIntArray.size() - 1;
            int i5 = 0;
            while (i5 <= size) {
                int i6 = (i5 + size) >>> 1;
                if (sparseIntArray.keyAt(i6) < i4) {
                    i5 = i6 + 1;
                } else {
                    size = i6 - 1;
                }
            }
            int i7 = i5 - 1;
            if (i7 < 0 || i7 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i7);
        }

        public int b(int i4, int i5) {
            if (!this.f5577d) {
                return d(i4, i5);
            }
            int i6 = this.f5575b.get(i4, -1);
            if (i6 != -1) {
                return i6;
            }
            int d4 = d(i4, i5);
            this.f5575b.put(i4, d4);
            return d4;
        }

        public int c(int i4, int i5) {
            if (!this.f5576c) {
                return e(i4, i5);
            }
            int i6 = this.f5574a.get(i4, -1);
            if (i6 != -1) {
                return i6;
            }
            int e4 = e(i4, i5);
            this.f5574a.put(i4, e4);
            return e4;
        }

        public int d(int i4, int i5) {
            int i6;
            int i7;
            int i8;
            int a4;
            if (!this.f5577d || (a4 = a(this.f5575b, i4)) == -1) {
                i8 = 0;
                i7 = 0;
                i6 = 0;
            } else {
                i8 = this.f5575b.get(a4);
                i7 = a4 + 1;
                i6 = c(a4, i5) + f(a4);
                if (i6 == i5) {
                    i8++;
                    i6 = 0;
                }
            }
            int f4 = f(i4);
            while (i7 < i4) {
                int f5 = f(i7);
                int i9 = i6 + f5;
                if (i9 == i5) {
                    i8++;
                    i9 = 0;
                } else if (i9 > i5) {
                    i8++;
                    i9 = f5;
                }
                i7++;
            }
            return i6 + f4 > i5 ? i8 + 1 : i8;
        }

        public abstract int e(int i4, int i5);

        public abstract int f(int i4);

        public void g() {
            this.f5575b.clear();
        }

        public void h() {
            this.f5574a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        d3(RecyclerView.o.i0(context, attributeSet, i4, i5).f5764b);
    }

    public static int[] Q2(int[] iArr, int i4, int i5) {
        int i6;
        if (!(iArr != null && iArr.length == i4 + 1 && iArr[iArr.length - 1] == i5)) {
            iArr = new int[(i4 + 1)];
        }
        int i7 = 0;
        iArr[0] = 0;
        int i8 = i5 / i4;
        int i9 = i5 % i4;
        int i10 = 0;
        for (int i11 = 1; i11 <= i4; i11++) {
            i7 += i9;
            if (i7 <= 0 || i4 - i7 >= i9) {
                i6 = i8;
            } else {
                i6 = i8 + 1;
                i7 -= i4;
            }
            i10 += i6;
            iArr[i11] = i10;
        }
        return iArr;
    }

    public void C1(Rect rect, int i4, int i5) {
        int i6;
        int i7;
        if (this.f5565K == null) {
            super.C1(rect, i4, i5);
        }
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f5586s == 1) {
            i7 = RecyclerView.o.n(i5, rect.height() + g02, b0());
            int[] iArr = this.f5565K;
            i6 = RecyclerView.o.n(i4, iArr[iArr.length - 1] + e02, c0());
        } else {
            i6 = RecyclerView.o.n(i4, rect.width() + e02, c0());
            int[] iArr2 = this.f5565K;
            i7 = RecyclerView.o.n(i5, iArr2[iArr2.length - 1] + g02, b0());
        }
        B1(i6, i7);
    }

    public RecyclerView.p D() {
        return this.f5586s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public void E2(boolean z4) {
        if (!z4) {
            super.E2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d1, code lost:
        if (r13 == (r2 > r15)) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00f1, code lost:
        if (r13 == r10) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.u r26, androidx.recyclerview.widget.RecyclerView.z r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.B(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.f5572e
            int r5 = r5.f5573f
            int r5 = r5 + r6
            android.view.View r7 = super.J0(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.R1(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f5591x
            r11 = -1
            if (r7 == r10) goto L_0x0039
            int r7 = r23.J()
            int r7 = r7 - r9
            r10 = r11
            r12 = r10
            goto L_0x0040
        L_0x0039:
            int r7 = r23.J()
            r10 = r7
            r12 = r9
            r7 = 0
        L_0x0040:
            int r13 = r0.f5586s
            if (r13 != r9) goto L_0x004c
            boolean r13 = r23.q2()
            if (r13 == 0) goto L_0x004c
            r13 = r9
            goto L_0x004d
        L_0x004c:
            r13 = 0
        L_0x004d:
            int r14 = r0.X2(r1, r2, r7)
            r15 = r11
            r16 = r15
            r8 = 0
            r17 = 0
            r11 = r7
            r7 = r4
        L_0x0059:
            if (r11 == r10) goto L_0x0065
            int r9 = r0.X2(r1, r2, r11)
            android.view.View r1 = r0.I(r11)
            if (r1 != r3) goto L_0x0069
        L_0x0065:
            r21 = r7
            goto L_0x0137
        L_0x0069:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0082
            if (r9 == r14) goto L_0x0082
            if (r4 == 0) goto L_0x0074
            goto L_0x0065
        L_0x0074:
            r18 = r3
            r21 = r7
        L_0x0078:
            r19 = r8
            r20 = r10
        L_0x007c:
            r7 = r16
            r8 = r17
            goto L_0x0123
        L_0x0082:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.b) r9
            int r2 = r9.f5572e
            r18 = r3
            int r3 = r9.f5573f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009a
            if (r2 != r6) goto L_0x009a
            if (r3 != r5) goto L_0x009a
            return r1
        L_0x009a:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a2
            if (r4 == 0) goto L_0x00aa
        L_0x00a2:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b5
            if (r7 != 0) goto L_0x00b5
        L_0x00aa:
            r21 = r7
        L_0x00ac:
            r19 = r8
            r20 = r10
            r7 = r16
            r8 = r17
            goto L_0x00f3
        L_0x00b5:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d4
            if (r7 <= r8) goto L_0x00ca
        L_0x00c9:
            goto L_0x00ac
        L_0x00ca:
            if (r7 != r8) goto L_0x0078
            if (r2 <= r15) goto L_0x00d0
            r7 = 1
            goto L_0x00d1
        L_0x00d0:
            r7 = 0
        L_0x00d1:
            if (r13 != r7) goto L_0x0078
            goto L_0x00c9
        L_0x00d4:
            if (r4 != 0) goto L_0x0078
            r19 = r8
            r20 = r10
            r8 = 0
            r10 = 1
            boolean r22 = r0.y0(r1, r8, r10)
            if (r22 == 0) goto L_0x007c
            r8 = r17
            if (r7 <= r8) goto L_0x00e9
            r7 = r16
            goto L_0x00f3
        L_0x00e9:
            if (r7 != r8) goto L_0x0121
            r7 = r16
            if (r2 <= r7) goto L_0x00f0
            goto L_0x00f1
        L_0x00f0:
            r10 = 0
        L_0x00f1:
            if (r13 != r10) goto L_0x0123
        L_0x00f3:
            boolean r10 = r1.hasFocusable()
            if (r10 == 0) goto L_0x010f
            int r4 = r9.f5572e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x012b
        L_0x010f:
            int r7 = r9.f5572e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x012b
        L_0x0121:
            r7 = r16
        L_0x0123:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x012b:
            int r11 = r11 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r10 = r20
            r9 = 1
            goto L_0x0059
        L_0x0137:
            if (r4 == 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r4 = r21
        L_0x013c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    public boolean L1() {
        return this.f5581D == null && !this.f5563I;
    }

    public int N(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f5586s == 1) {
            return this.f5564J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return X2(uVar, zVar, zVar.b() - 1) + 1;
    }

    public void N1(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i4 = this.f5564J;
        for (int i5 = 0; i5 < this.f5564J && cVar.c(zVar) && i4 > 0; i5++) {
            int i6 = cVar.f5606d;
            cVar2.a(i6, Math.max(0, cVar.f5609g));
            i4 -= this.f5569O.f(i6);
            cVar.f5606d += cVar.f5607e;
        }
    }

    public final void N2(RecyclerView.u uVar, RecyclerView.z zVar, int i4, boolean z4) {
        int i5;
        int i6;
        int i7;
        int i8 = 0;
        if (z4) {
            i7 = 1;
            i5 = i4;
            i6 = 0;
        } else {
            i6 = i4 - 1;
            i5 = -1;
            i7 = -1;
        }
        while (i6 != i5) {
            View view = this.f5566L[i6];
            b bVar = (b) view.getLayoutParams();
            int Z22 = Z2(uVar, zVar, h0(view));
            bVar.f5573f = Z22;
            bVar.f5572e = i8;
            i8 += Z22;
            i6 += i7;
        }
    }

    public final void O2() {
        int J4 = J();
        for (int i4 = 0; i4 < J4; i4++) {
            b bVar = (b) I(i4).getLayoutParams();
            int a4 = bVar.a();
            this.f5567M.put(a4, bVar.f());
            this.f5568N.put(a4, bVar.e());
        }
    }

    public void P0(RecyclerView.u uVar, RecyclerView.z zVar, View view, m mVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.O0(view, mVar);
            return;
        }
        b bVar = (b) layoutParams;
        int X22 = X2(uVar, zVar, bVar.a());
        if (this.f5586s == 0) {
            mVar.f0(m.f.a(bVar.e(), bVar.f(), X22, 1, false, false));
            return;
        }
        mVar.f0(m.f.a(X22, 1, bVar.e(), bVar.f(), false, false));
    }

    public final void P2(int i4) {
        this.f5565K = Q2(this.f5565K, this.f5564J, i4);
    }

    public void R0(RecyclerView recyclerView, int i4, int i5) {
        this.f5569O.h();
        this.f5569O.g();
    }

    public final void R2() {
        this.f5567M.clear();
        this.f5568N.clear();
    }

    public void S0(RecyclerView recyclerView) {
        this.f5569O.h();
        this.f5569O.g();
    }

    public final int S2(RecyclerView.z zVar) {
        if (!(J() == 0 || zVar.b() == 0)) {
            T1();
            boolean r22 = r2();
            View Y12 = Y1(!r22, true);
            View X12 = X1(!r22, true);
            if (!(Y12 == null || X12 == null)) {
                int b4 = this.f5569O.b(h0(Y12), this.f5564J);
                int b5 = this.f5569O.b(h0(X12), this.f5564J);
                int min = Math.min(b4, b5);
                int max = this.f5591x ? Math.max(0, ((this.f5569O.b(zVar.b() - 1, this.f5564J) + 1) - Math.max(b4, b5)) - 1) : Math.max(0, min);
                if (!r22) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f5588u.d(X12) - this.f5588u.g(Y12))) / ((float) ((this.f5569O.b(h0(X12), this.f5564J) - this.f5569O.b(h0(Y12), this.f5564J)) + 1)))) + ((float) (this.f5588u.m() - this.f5588u.g(Y12))));
            }
        }
        return 0;
    }

    public void T0(RecyclerView recyclerView, int i4, int i5, int i6) {
        this.f5569O.h();
        this.f5569O.g();
    }

    public final int T2(RecyclerView.z zVar) {
        if (!(J() == 0 || zVar.b() == 0)) {
            T1();
            View Y12 = Y1(!r2(), true);
            View X12 = X1(!r2(), true);
            if (!(Y12 == null || X12 == null)) {
                if (!r2()) {
                    return this.f5569O.b(zVar.b() - 1, this.f5564J) + 1;
                }
                int d4 = this.f5588u.d(X12) - this.f5588u.g(Y12);
                int b4 = this.f5569O.b(h0(Y12), this.f5564J);
                return (int) ((((float) d4) / ((float) ((this.f5569O.b(h0(X12), this.f5564J) - b4) + 1))) * ((float) (this.f5569O.b(zVar.b() - 1, this.f5564J) + 1)));
            }
        }
        return 0;
    }

    public void U0(RecyclerView recyclerView, int i4, int i5) {
        this.f5569O.h();
        this.f5569O.g();
    }

    public final void U2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i4) {
        boolean z4 = i4 == 1;
        int Y22 = Y2(uVar, zVar, aVar.f5595b);
        if (z4) {
            while (Y22 > 0) {
                int i5 = aVar.f5595b;
                if (i5 > 0) {
                    int i6 = i5 - 1;
                    aVar.f5595b = i6;
                    Y22 = Y2(uVar, zVar, i6);
                } else {
                    return;
                }
            }
            return;
        }
        int b4 = zVar.b() - 1;
        int i7 = aVar.f5595b;
        while (i7 < b4) {
            int i8 = i7 + 1;
            int Y23 = Y2(uVar, zVar, i8);
            if (Y23 <= Y22) {
                break;
            }
            i7 = i8;
            Y22 = Y23;
        }
        aVar.f5595b = i7;
    }

    public final void V2() {
        View[] viewArr = this.f5566L;
        if (viewArr == null || viewArr.length != this.f5564J) {
            this.f5566L = new View[this.f5564J];
        }
    }

    public void W0(RecyclerView recyclerView, int i4, int i5, Object obj) {
        this.f5569O.h();
        this.f5569O.g();
    }

    public int W2(int i4, int i5) {
        if (this.f5586s != 1 || !q2()) {
            int[] iArr = this.f5565K;
            return iArr[i5 + i4] - iArr[i4];
        }
        int[] iArr2 = this.f5565K;
        int i6 = this.f5564J;
        return iArr2[i6 - i4] - iArr2[(i6 - i4) - i5];
    }

    public void X0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.e()) {
            O2();
        }
        super.X0(uVar, zVar);
        R2();
    }

    public final int X2(RecyclerView.u uVar, RecyclerView.z zVar, int i4) {
        if (!zVar.e()) {
            return this.f5569O.b(i4, this.f5564J);
        }
        int f4 = uVar.f(i4);
        if (f4 != -1) {
            return this.f5569O.b(f4, this.f5564J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.f5563I = false;
    }

    public final int Y2(RecyclerView.u uVar, RecyclerView.z zVar, int i4) {
        if (!zVar.e()) {
            return this.f5569O.c(i4, this.f5564J);
        }
        int i5 = this.f5568N.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int f4 = uVar.f(i4);
        if (f4 != -1) {
            return this.f5569O.c(f4, this.f5564J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 0;
    }

    public final int Z2(RecyclerView.u uVar, RecyclerView.z zVar, int i4) {
        if (!zVar.e()) {
            return this.f5569O.f(i4);
        }
        int i5 = this.f5567M.get(i4, -1);
        if (i5 != -1) {
            return i5;
        }
        int f4 = uVar.f(i4);
        if (f4 != -1) {
            return this.f5569O.f(f4);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i4);
        return 1;
    }

    public final void a3(float f4, int i4) {
        P2(Math.max(Math.round(f4 * ((float) this.f5564J)), i4));
    }

    public final void b3(View view, int i4, boolean z4) {
        int i5;
        int i6;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f5768b;
        int i7 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i8 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int W22 = W2(bVar.f5572e, bVar.f5573f);
        if (this.f5586s == 1) {
            i5 = RecyclerView.o.K(W22, i4, i8, bVar.width, false);
            i6 = RecyclerView.o.K(this.f5588u.n(), X(), i7, bVar.height, true);
        } else {
            int K4 = RecyclerView.o.K(W22, i4, i7, bVar.height, false);
            int K5 = RecyclerView.o.K(this.f5588u.n(), p0(), i8, bVar.width, true);
            i6 = K4;
            i5 = K5;
        }
        c3(view, i5, i6, z4);
    }

    public final void c3(View view, int i4, int i5, boolean z4) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z4 ? H1(view, i4, i5, pVar) : F1(view, i4, i5, pVar)) {
            view.measure(i4, i5);
        }
    }

    public void d3(int i4) {
        if (i4 != this.f5564J) {
            this.f5563I = true;
            if (i4 >= 1) {
                this.f5564J = i4;
                this.f5569O.h();
                t1();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i4);
        }
    }

    public final void e3() {
        int W3;
        int g02;
        if (p2() == 1) {
            W3 = o0() - f0();
            g02 = e0();
        } else {
            W3 = W() - d0();
            g02 = g0();
        }
        P2(W3 - g02);
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
            if (h02 >= 0 && h02 < i6 && Y2(uVar, zVar, h02) == 0) {
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

    public int k0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f5586s == 0) {
            return this.f5564J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return X2(uVar, zVar, zVar.b() - 1) + 1;
    }

    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    public int r(RecyclerView.z zVar) {
        return this.f5571Q ? S2(zVar) : super.r(zVar);
    }

    public int s(RecyclerView.z zVar) {
        return this.f5571Q ? T2(zVar) : super.s(zVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0215 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s2(androidx.recyclerview.widget.RecyclerView.u r18, androidx.recyclerview.widget.RecyclerView.z r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r1 = r19
            r2 = r20
            r7 = r21
            androidx.recyclerview.widget.i r3 = r6.f5588u
            int r3 = r3.l()
            r8 = 1
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 == r5) goto L_0x0018
            r9 = r8
            goto L_0x0019
        L_0x0018:
            r9 = r4
        L_0x0019:
            int r10 = r17.J()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.f5565K
            int r11 = r6.f5564J
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = r4
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r17.e3()
        L_0x002c:
            int r11 = r2.f5607e
            if (r11 != r8) goto L_0x0032
            r11 = r8
            goto L_0x0033
        L_0x0032:
            r11 = r4
        L_0x0033:
            int r12 = r6.f5564J
            if (r11 != 0) goto L_0x0044
            int r12 = r2.f5606d
            int r12 = r6.Y2(r0, r1, r12)
            int r13 = r2.f5606d
            int r13 = r6.Z2(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = r4
        L_0x0045:
            int r14 = r6.f5564J
            if (r13 >= r14) goto L_0x009d
            boolean r14 = r2.c(r1)
            if (r14 == 0) goto L_0x009d
            if (r12 <= 0) goto L_0x009d
            int r14 = r2.f5606d
            int r15 = r6.Z2(r0, r1, r14)
            int r5 = r6.f5564J
            if (r15 > r5) goto L_0x006f
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x005f
            goto L_0x009d
        L_0x005f:
            android.view.View r5 = r2.d(r0)
            if (r5 != 0) goto L_0x0066
            goto L_0x009d
        L_0x0066:
            android.view.View[] r14 = r6.f5566L
            r14[r13] = r5
            int r13 = r13 + 1
            r5 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.f5564J
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r13 != 0) goto L_0x00a2
            r7.f5600b = r8
            return
        L_0x00a2:
            r6.N2(r0, r1, r13, r11)
            r0 = 0
            r1 = r4
            r5 = r1
        L_0x00a8:
            if (r1 >= r13) goto L_0x00f2
            android.view.View[] r12 = r6.f5566L
            r12 = r12[r1]
            java.util.List r14 = r2.f5614l
            if (r14 != 0) goto L_0x00bc
            if (r11 == 0) goto L_0x00b8
            r6.d(r12)
            goto L_0x00c5
        L_0x00b8:
            r6.e(r12, r4)
            goto L_0x00c5
        L_0x00bc:
            if (r11 == 0) goto L_0x00c2
            r6.b(r12)
            goto L_0x00c5
        L_0x00c2:
            r6.c(r12, r4)
        L_0x00c5:
            android.graphics.Rect r14 = r6.f5570P
            r6.j(r12, r14)
            r6.b3(r12, r3, r4)
            androidx.recyclerview.widget.i r14 = r6.f5588u
            int r14 = r14.e(r12)
            if (r14 <= r5) goto L_0x00d6
            r5 = r14
        L_0x00d6:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r14 = (androidx.recyclerview.widget.GridLayoutManager.b) r14
            androidx.recyclerview.widget.i r15 = r6.f5588u
            int r12 = r15.f(r12)
            float r12 = (float) r12
            r15 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 * r15
            int r14 = r14.f5573f
            float r14 = (float) r14
            float r12 = r12 / r14
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 <= 0) goto L_0x00ef
            r0 = r12
        L_0x00ef:
            int r1 = r1 + 1
            goto L_0x00a8
        L_0x00f2:
            if (r9 == 0) goto L_0x0110
            r6.a3(r0, r10)
            r0 = r4
            r5 = r0
        L_0x00f9:
            if (r0 >= r13) goto L_0x0110
            android.view.View[] r1 = r6.f5566L
            r1 = r1[r0]
            r3 = 1073741824(0x40000000, float:2.0)
            r6.b3(r1, r3, r8)
            androidx.recyclerview.widget.i r3 = r6.f5588u
            int r1 = r3.e(r1)
            if (r1 <= r5) goto L_0x010d
            r5 = r1
        L_0x010d:
            int r0 = r0 + 1
            goto L_0x00f9
        L_0x0110:
            r0 = r4
        L_0x0111:
            if (r0 >= r13) goto L_0x0170
            android.view.View[] r1 = r6.f5566L
            r1 = r1[r0]
            androidx.recyclerview.widget.i r3 = r6.f5588u
            int r3 = r3.e(r1)
            if (r3 == r5) goto L_0x016b
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r3 = (androidx.recyclerview.widget.GridLayoutManager.b) r3
            android.graphics.Rect r9 = r3.f5768b
            int r10 = r9.top
            int r11 = r9.bottom
            int r10 = r10 + r11
            int r11 = r3.topMargin
            int r10 = r10 + r11
            int r11 = r3.bottomMargin
            int r10 = r10 + r11
            int r11 = r9.left
            int r9 = r9.right
            int r11 = r11 + r9
            int r9 = r3.leftMargin
            int r11 = r11 + r9
            int r9 = r3.rightMargin
            int r11 = r11 + r9
            int r9 = r3.f5572e
            int r12 = r3.f5573f
            int r9 = r6.W2(r9, r12)
            int r12 = r6.f5586s
            if (r12 != r8) goto L_0x0158
            int r3 = r3.width
            r12 = 1073741824(0x40000000, float:2.0)
            int r3 = androidx.recyclerview.widget.RecyclerView.o.K(r9, r12, r11, r3, r4)
            int r9 = r5 - r10
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r12)
            goto L_0x0167
        L_0x0158:
            r12 = 1073741824(0x40000000, float:2.0)
            int r11 = r5 - r11
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            int r3 = r3.height
            int r9 = androidx.recyclerview.widget.RecyclerView.o.K(r9, r12, r10, r3, r4)
            r3 = r11
        L_0x0167:
            r6.c3(r1, r3, r9, r8)
            goto L_0x016d
        L_0x016b:
            r12 = 1073741824(0x40000000, float:2.0)
        L_0x016d:
            int r0 = r0 + 1
            goto L_0x0111
        L_0x0170:
            r7.f5599a = r5
            int r0 = r6.f5586s
            r1 = -1
            if (r0 != r8) goto L_0x0188
            int r0 = r2.f5608f
            if (r0 != r1) goto L_0x0183
            int r0 = r2.f5604b
            int r1 = r0 - r5
        L_0x017f:
            r2 = r1
            r1 = r4
            r3 = r1
            goto L_0x019a
        L_0x0183:
            int r1 = r2.f5604b
            int r0 = r1 + r5
            goto L_0x017f
        L_0x0188:
            int r0 = r2.f5608f
            if (r0 != r1) goto L_0x0195
            int r0 = r2.f5604b
            int r1 = r0 - r5
        L_0x0190:
            r3 = r1
            r2 = r4
            r1 = r0
            r0 = r2
            goto L_0x019a
        L_0x0195:
            int r1 = r2.f5604b
            int r0 = r1 + r5
            goto L_0x0190
        L_0x019a:
            r9 = r4
        L_0x019b:
            if (r9 >= r13) goto L_0x0227
            android.view.View[] r4 = r6.f5566L
            r10 = r4[r9]
            android.view.ViewGroup$LayoutParams r4 = r10.getLayoutParams()
            r11 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.b) r11
            int r4 = r6.f5586s
            if (r4 != r8) goto L_0x01e6
            boolean r1 = r17.q2()
            if (r1 == 0) goto L_0x01ce
            int r1 = r17.e0()
            int[] r3 = r6.f5565K
            int r4 = r6.f5564J
            int r5 = r11.f5572e
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.i r3 = r6.f5588u
            int r3 = r3.f(r10)
            int r3 = r1 - r3
            r12 = r0
            r14 = r1
            r15 = r2
        L_0x01cb:
            r16 = r3
            goto L_0x01fc
        L_0x01ce:
            int r1 = r17.e0()
            int[] r3 = r6.f5565K
            int r4 = r11.f5572e
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.i r3 = r6.f5588u
            int r3 = r3.f(r10)
            int r3 = r3 + r1
            r12 = r0
            r16 = r1
            r15 = r2
            r14 = r3
            goto L_0x01fc
        L_0x01e6:
            int r0 = r17.g0()
            int[] r2 = r6.f5565K
            int r4 = r11.f5572e
            r2 = r2[r4]
            int r0 = r0 + r2
            androidx.recyclerview.widget.i r2 = r6.f5588u
            int r2 = r2.f(r10)
            int r2 = r2 + r0
            r15 = r0
            r14 = r1
            r12 = r2
            goto L_0x01cb
        L_0x01fc:
            r0 = r17
            r1 = r10
            r2 = r16
            r3 = r15
            r4 = r14
            r5 = r12
            r0.z0(r1, r2, r3, r4, r5)
            boolean r0 = r11.c()
            if (r0 != 0) goto L_0x0213
            boolean r0 = r11.b()
            if (r0 == 0) goto L_0x0215
        L_0x0213:
            r7.f5601c = r8
        L_0x0215:
            boolean r0 = r7.f5602d
            boolean r1 = r10.hasFocusable()
            r0 = r0 | r1
            r7.f5602d = r0
            int r9 = r9 + 1
            r0 = r12
            r1 = r14
            r2 = r15
            r3 = r16
            goto L_0x019b
        L_0x0227:
            android.view.View[] r0 = r6.f5566L
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.s2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    public int u(RecyclerView.z zVar) {
        return this.f5571Q ? S2(zVar) : super.u(zVar);
    }

    public void u2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i4) {
        super.u2(uVar, zVar, aVar, i4);
        e3();
        if (zVar.b() > 0 && !zVar.e()) {
            U2(uVar, zVar, aVar, i4);
        }
        V2();
    }

    public int v(RecyclerView.z zVar) {
        return this.f5571Q ? T2(zVar) : super.v(zVar);
    }

    public int w1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        e3();
        V2();
        return super.w1(i4, uVar, zVar);
    }

    public int y1(int i4, RecyclerView.u uVar, RecyclerView.z zVar) {
        e3();
        V2();
        return super.y1(i4, uVar, zVar);
    }

    public static class b extends RecyclerView.p {

        /* renamed from: e  reason: collision with root package name */
        public int f5572e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f5573f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int e() {
            return this.f5572e;
        }

        public int f() {
            return this.f5573f;
        }

        public b(int i4, int i5) {
            super(i4, i5);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i4, int i5, boolean z4) {
        super(context, i5, z4);
        d3(i4);
    }
}
