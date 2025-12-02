package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.a1  reason: case insensitive filesystem */
public final class C0408a1 extends Y0 {
    public static void m(Object obj, Z0 z02) {
        ((C0407a0) obj).zzjp = z02;
    }

    public final /* synthetic */ void a(Object obj, int i4, long j4) {
        ((Z0) obj).e(i4 << 3, Long.valueOf(j4));
    }

    public final /* synthetic */ void b(Object obj, int i4, C0477y yVar) {
        ((Z0) obj).e((i4 << 3) | 2, yVar);
    }

    public final /* synthetic */ void c(Object obj, C0464t1 t1Var) {
        ((Z0) obj).g(t1Var);
    }

    public final void d(Object obj) {
        ((C0407a0) obj).zzjp.k();
    }

    public final /* synthetic */ void e(Object obj, C0464t1 t1Var) {
        ((Z0) obj).b(t1Var);
    }

    public final /* synthetic */ Object f() {
        return Z0.i();
    }

    public final /* synthetic */ void g(Object obj, Object obj2) {
        m(obj, (Z0) obj2);
    }

    public final /* synthetic */ void h(Object obj, Object obj2) {
        m(obj, (Z0) obj2);
    }

    public final /* synthetic */ Object i(Object obj, Object obj2) {
        Z0 z02 = (Z0) obj;
        Z0 z03 = (Z0) obj2;
        return z03.equals(Z0.h()) ? z02 : Z0.a(z02, z03);
    }

    public final /* synthetic */ int j(Object obj) {
        return ((Z0) obj).d();
    }

    public final /* synthetic */ Object k(Object obj) {
        return ((C0407a0) obj).zzjp;
    }

    public final /* synthetic */ int l(Object obj) {
        return ((Z0) obj).j();
    }
}
