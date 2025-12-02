package com.google.android.gms.internal.vision;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.x0  reason: case insensitive filesystem */
public final class C0557x0 implements y2 {

    /* renamed from: a  reason: collision with root package name */
    public final C0551v0 f7586a;

    public C0557x0(C0551v0 v0Var) {
        C0551v0 v0Var2 = (C0551v0) R0.f(v0Var, "output");
        this.f7586a = v0Var2;
        v0Var2.f7570a = this;
    }

    public static C0557x0 P(C0551v0 v0Var) {
        C0557x0 x0Var = v0Var.f7570a;
        return x0Var != null ? x0Var : new C0557x0(v0Var);
    }

    public final void A(int i4, List list) {
        int i5 = 0;
        if (list instanceof C0497d1) {
            C0497d1 d1Var = (C0497d1) list;
            while (i5 < list.size()) {
                Object f4 = d1Var.f(i5);
                if (f4 instanceof String) {
                    this.f7586a.p(i4, (String) f4);
                } else {
                    this.f7586a.m(i4, (C0507g0) f4);
                }
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.p(i4, (String) list.get(i5));
            i5++;
        }
    }

    public final void B(int i4, int i5) {
        this.f7586a.f0(i4, i5);
    }

    public final void C(int i4, long j4) {
        this.f7586a.l(i4, j4);
    }

    public final void D(int i4, double d4) {
        this.f7586a.i(i4, d4);
    }

    public final void E(int i4, float f4) {
        this.f7586a.j(i4, f4);
    }

    public final void F(int i4, boolean z4) {
        this.f7586a.q(i4, z4);
    }

    public final void G(int i4, C0507g0 g0Var) {
        this.f7586a.m(i4, g0Var);
    }

    public final void H(int i4, int i5) {
        this.f7586a.L(i4, i5);
    }

    public final void I(int i4, C0532o1 o1Var, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f7586a.k(i4, 2);
            this.f7586a.K(C0523l1.a(o1Var, entry.getKey(), entry.getValue()));
            C0523l1.b(this.f7586a, o1Var, entry.getKey(), entry.getValue());
        }
    }

    public final void J(int i4, List list, K1 k12) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            N(i4, list.get(i5), k12);
        }
    }

    public final void K(int i4, Object obj, K1 k12) {
        this.f7586a.o(i4, (C0546t1) obj, k12);
    }

    public final void L(int i4, long j4) {
        this.f7586a.U(i4, j4);
    }

    public final void M(int i4, long j4) {
        this.f7586a.M(i4, j4);
    }

    public final void N(int i4, Object obj, K1 k12) {
        C0551v0 v0Var = this.f7586a;
        v0Var.k(i4, 3);
        k12.h((C0546t1) obj, v0Var.f7570a);
        v0Var.k(i4, 4);
    }

    public final void O(int i4, List list, K1 k12) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            K(i4, list.get(i5), k12);
        }
    }

    public final int a() {
        return x2.f7606a;
    }

    public final void b(int i4) {
        this.f7586a.k(i4, 3);
    }

    public final void c(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.n0(((Long) list.get(i7)).longValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.V(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.U(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void d(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.H(((Boolean) list.get(i7)).booleanValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.w(((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.q(i4, ((Boolean) list.get(i5)).booleanValue());
            i5++;
        }
    }

    public final void e(int i4, int i5) {
        this.f7586a.b0(i4, i5);
    }

    public final void f(int i4) {
        this.f7586a.k(i4, 4);
    }

    public final void g(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.j0(((Long) list.get(i7)).longValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.O(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.M(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void h(int i4, long j4) {
        this.f7586a.U(i4, j4);
    }

    public final void i(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.g0(((Integer) list.get(i7)).intValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.h(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.L(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void j(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.e0(((Long) list.get(i7)).longValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.r(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.l(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void k(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.x0(((Integer) list.get(i7)).intValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.h(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.L(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void l(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.o0(((Integer) list.get(i7)).intValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.S(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.b0(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void m(int i4, int i5) {
        this.f7586a.L(i4, i5);
    }

    public final void n(int i4, long j4) {
        this.f7586a.l(i4, j4);
    }

    public final void o(int i4, Object obj) {
        if (obj instanceof C0507g0) {
            this.f7586a.N(i4, (C0507g0) obj);
        } else {
            this.f7586a.n(i4, (C0546t1) obj);
        }
    }

    public final void p(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.Z(((Long) list.get(i7)).longValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.r(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.l(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void q(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.x(((Double) list.get(i7)).doubleValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.f(((Double) list.get(i5)).doubleValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.i(i4, ((Double) list.get(i5)).doubleValue());
            i5++;
        }
    }

    public final void r(int i4, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f7586a.m(i4, (C0507g0) list.get(i5));
        }
    }

    public final void s(int i4, int i5) {
        this.f7586a.f0(i4, i5);
    }

    public final void t(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.r0(((Long) list.get(i7)).longValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.V(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.U(i4, ((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    public final void u(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.s0(((Integer) list.get(i7)).intValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.a0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.f0(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void v(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.y(((Float) list.get(i7)).floatValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.g(((Float) list.get(i5)).floatValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.j(i4, ((Float) list.get(i5)).floatValue());
            i5++;
        }
    }

    public final void w(int i4, String str) {
        this.f7586a.p(i4, str);
    }

    public final void x(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.k0(((Integer) list.get(i7)).intValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.K(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.T(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void y(int i4, int i5) {
        this.f7586a.T(i4, i5);
    }

    public final void z(int i4, List list, boolean z4) {
        int i5 = 0;
        if (z4) {
            this.f7586a.k(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                i6 += C0551v0.v0(((Integer) list.get(i7)).intValue());
            }
            this.f7586a.K(i6);
            while (i5 < list.size()) {
                this.f7586a.a0(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.f7586a.f0(i4, ((Integer) list.get(i5)).intValue());
            i5++;
        }
    }
}
