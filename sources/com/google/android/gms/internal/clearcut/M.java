package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0407a0;
import java.util.List;
import java.util.Map;

public final class M implements C0464t1 {

    /* renamed from: a  reason: collision with root package name */
    public final K f6826a;

    public M(K k4) {
        K k5 = (K) C0413c0.e(k4, "output");
        this.f6826a = k5;
        k5.f6807a = this;
    }

    public static M a(K k4) {
        M m4 = k4.f6807a;
        return m4 != null ? m4 : new M(k4);
    }

    public final void A(int i4, List list) {
        int i5 = 0;
        if (list instanceof C0437k0) {
            C0437k0 k0Var = (C0437k0) list;
            while (i5 < list.size()) {
                Object g4 = k0Var.g(i5);
                if (g4 instanceof String) {
                    this.f6826a.n(i4, (String) g4);
                } else {
                    this.f6826a.k(i4, (C0477y) g4);
                }
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.n(i4, (String) list.get(i5));
            i5++;
        }
    }

    public final void C(int i4, long j4) {
        this.f6826a.j(i4, j4);
    }

    public final void D(int i4, double d4) {
        this.f6826a.h(i4, d4);
    }

    public final void E(int i4, float f4) {
        this.f6826a.i(i4, f4);
    }

    public final void F(int i4, int i5) {
        this.f6826a.Q(i4, i5);
    }

    public final void G(int i4, C0477y yVar) {
        this.f6826a.k(i4, yVar);
    }

    public final void H(int i4, long j4) {
        this.f6826a.R(i4, j4);
    }

    public final void I(int i4, List list, R0 r02) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            M(i4, list.get(i5), r02);
        }
    }

    public final void J(int i4, Object obj, R0 r02) {
        this.f6826a.m(i4, (B0) obj, r02);
    }

    public final void K(int i4) {
        this.f6826a.D(i4, 3);
    }

    public final void L(int i4, boolean z4) {
        this.f6826a.H(i4, z4);
    }

    public final void M(int i4, Object obj, R0 r02) {
        K k4 = this.f6826a;
        k4.D(i4, 3);
        r02.f((B0) obj, k4.f6807a);
        k4.D(i4, 4);
    }

    public final void N(int i4, List list, R0 r02) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            J(i4, list.get(i5), r02);
        }
    }

    public final int O() {
        return C0407a0.c.f7031l;
    }

    public final void P(int i4) {
        this.f6826a.D(i4, 4);
    }

    public final void Q(int i4, C0466u0 u0Var, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f6826a.D(i4, 2);
            this.f6826a.s0(C0463t0.a(u0Var, entry.getKey(), entry.getValue()));
            C0463t0.b(this.f6826a, u0Var, entry.getKey(), entry.getValue());
        }
    }

    public final void R(int i4, int i5) {
        this.f6826a.c0(i4, i5);
    }

    public final void S(int i4, long j4) {
        this.f6826a.j(i4, j4);
    }

    public final void c(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.j0(((Long) list.get(i7)).longValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.W(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.R(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void d(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.C(((Boolean) list.get(i7)).booleanValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.r(((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.H(i4, ((Boolean) list.get(i5)).booleanValue());
            i5++;
        }
    }

    public final void e(int i4, int i5) {
        this.f6826a.c0(i4, i5);
    }

    public final void g(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.f0(((Long) list.get(i7)).longValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.S(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.E(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void h(int i4, long j4) {
        this.f6826a.E(i4, j4);
    }

    public final void i(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.w0(((Integer) list.get(i7)).intValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.r0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.Q(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void j(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.b0(((Long) list.get(i7)).longValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.I(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.j(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void k(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.B0(((Integer) list.get(i7)).intValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.r0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.Q(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void l(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.y0(((Integer) list.get(i7)).intValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.t0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.Z(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void m(int i4, int i5) {
        this.f6826a.Q(i4, i5);
    }

    public final void n(int i4, long j4) {
        this.f6826a.R(i4, j4);
    }

    public final void o(int i4, Object obj) {
        if (obj instanceof C0477y) {
            this.f6826a.F(i4, (C0477y) obj);
        } else {
            this.f6826a.G(i4, (B0) obj);
        }
    }

    public final void p(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.Y(((Long) list.get(i7)).longValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.I(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.j(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void q(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.u(((Double) list.get(i7)).doubleValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.f(((Double) list.get(i5)).doubleValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.h(i4, ((Double) list.get(i5)).doubleValue());
            i5++;
        }
    }

    public final void r(int i4, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f6826a.k(i4, (C0477y) list.get(i5));
        }
    }

    public final void s(int i4, int i5) {
        this.f6826a.V(i4, i5);
    }

    public final void t(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.m0(((Long) list.get(i7)).longValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.W(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.R(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void u(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.z0(((Integer) list.get(i7)).intValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.u0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.c0(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void v(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.v(((Float) list.get(i7)).floatValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.g(((Float) list.get(i5)).floatValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.i(i4, ((Float) list.get(i5)).floatValue());
            i5++;
        }
    }

    public final void w(int i4, String str) {
        this.f6826a.n(i4, str);
    }

    public final void x(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.x0(((Integer) list.get(i7)).intValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.s0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.V(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void y(int i4, int i5) {
        this.f6826a.Z(i4, i5);
    }

    public final void z(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f6826a.D(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += K.A0(((Integer) list.get(i7)).intValue());
            }
            this.f6826a.s0(i6);
            while (i5 < list.size()) {
                this.f6826a.u0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f6826a.c0(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }
}
