package com.google.android.gms.internal.vision;

import android.support.v4.media.session.b;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.z1  reason: case insensitive filesystem */
public final class C0564z1 implements K1 {

    /* renamed from: a  reason: collision with root package name */
    public final C0546t1 f7610a;

    /* renamed from: b  reason: collision with root package name */
    public final C0486a2 f7611b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7612c;

    /* renamed from: d  reason: collision with root package name */
    public final C0 f7613d;

    public C0564z1(C0486a2 a2Var, C0 c02, C0546t1 t1Var) {
        this.f7611b = a2Var;
        this.f7612c = c02.d(t1Var);
        this.f7613d = c02;
        this.f7610a = t1Var;
    }

    public static C0564z1 j(C0486a2 a2Var, C0 c02, C0546t1 t1Var) {
        return new C0564z1(a2Var, c02, t1Var);
    }

    public final Object a() {
        return this.f7610a.e().c();
    }

    public final int b(Object obj) {
        int hashCode = this.f7611b.f(obj).hashCode();
        return this.f7612c ? (hashCode * 53) + this.f7613d.b(obj).hashCode() : hashCode;
    }

    public final void c(Object obj) {
        this.f7611b.j(obj);
        this.f7613d.f(obj);
    }

    public final boolean d(Object obj) {
        return this.f7613d.b(obj).m();
    }

    public final boolean e(Object obj, Object obj2) {
        if (!this.f7611b.f(obj).equals(this.f7611b.f(obj2))) {
            return false;
        }
        if (this.f7612c) {
            return this.f7613d.b(obj).equals(this.f7613d.b(obj2));
        }
        return true;
    }

    public final void f(Object obj, Object obj2) {
        L1.o(this.f7611b, obj, obj2);
        if (this.f7612c) {
            L1.m(this.f7613d, obj, obj2);
        }
    }

    public final int g(Object obj) {
        C0486a2 a2Var = this.f7611b;
        int k4 = a2Var.k(a2Var.f(obj));
        return this.f7612c ? k4 + this.f7613d.b(obj).n() : k4;
    }

    public final void h(Object obj, y2 y2Var) {
        Iterator j4 = this.f7613d.b(obj).j();
        if (!j4.hasNext()) {
            C0486a2 a2Var = this.f7611b;
            a2Var.g(a2Var.f(obj), y2Var);
            return;
        }
        b.a(((Map.Entry) j4.next()).getKey());
        throw null;
    }

    public final void i(Object obj, byte[] bArr, int i4, int i5, C0492c0 c0Var) {
        N0 n02 = (N0) obj;
        if (n02.zzb == C0498d2.a()) {
            n02.zzb = C0498d2.g();
        }
        b.a(obj);
        throw null;
    }
}
