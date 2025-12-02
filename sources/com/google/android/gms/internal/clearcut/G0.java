package com.google.android.gms.internal.clearcut;

import android.support.v4.media.session.b;
import java.util.Iterator;
import java.util.Map;

public final class G0 implements R0 {

    /* renamed from: a  reason: collision with root package name */
    public final B0 f6789a;

    /* renamed from: b  reason: collision with root package name */
    public final Y0 f6790b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6791c;

    /* renamed from: d  reason: collision with root package name */
    public final P f6792d;

    public G0(Y0 y02, P p4, B0 b02) {
        this.f6790b = y02;
        this.f6791c = p4.g(b02);
        this.f6792d = p4;
        this.f6789a = b02;
    }

    public static G0 a(Y0 y02, P p4, B0 b02) {
        return new G0(y02, p4, b02);
    }

    public final boolean b(Object obj, Object obj2) {
        if (!this.f6790b.k(obj).equals(this.f6790b.k(obj2))) {
            return false;
        }
        if (this.f6791c) {
            return this.f6792d.b(obj).equals(this.f6792d.b(obj2));
        }
        return true;
    }

    public final void c(Object obj) {
        this.f6790b.d(obj);
        this.f6792d.f(obj);
    }

    public final Object d() {
        return this.f6789a.e().i();
    }

    public final int e(Object obj) {
        int hashCode = this.f6790b.k(obj).hashCode();
        return this.f6791c ? (hashCode * 53) + this.f6792d.b(obj).hashCode() : hashCode;
    }

    public final void f(Object obj, C0464t1 t1Var) {
        Iterator e4 = this.f6792d.b(obj).e();
        if (!e4.hasNext()) {
            Y0 y02 = this.f6790b;
            y02.e(y02.k(obj), t1Var);
            return;
        }
        b.a(((Map.Entry) e4.next()).getKey());
        throw null;
    }

    public final void g(Object obj, Object obj2) {
        T0.i(this.f6790b, obj, obj2);
        if (this.f6791c) {
            T0.g(this.f6792d, obj, obj2);
        }
    }

    public final void h(Object obj, byte[] bArr, int i4, int i5, C0468v vVar) {
        C0407a0 a0Var = (C0407a0) obj;
        Z0 z02 = a0Var.zzjp;
        if (z02 == Z0.h()) {
            z02 = Z0.i();
            a0Var.zzjp = z02;
        }
        Z0 z03 = z02;
        while (i4 < i5) {
            int e4 = C0465u.e(bArr, i4, vVar);
            int i6 = vVar.f7173a;
            if (i6 != 11) {
                i4 = (i6 & 7) == 2 ? C0465u.c(i6, bArr, e4, i5, z03, vVar) : C0465u.a(i6, bArr, e4, i5, vVar);
            } else {
                int i7 = 0;
                C0477y yVar = null;
                while (e4 < i5) {
                    e4 = C0465u.e(bArr, e4, vVar);
                    int i8 = vVar.f7173a;
                    int i9 = i8 >>> 3;
                    int i10 = i8 & 7;
                    if (i9 != 2) {
                        if (i9 == 3 && i10 == 2) {
                            e4 = C0465u.m(bArr, e4, vVar);
                            yVar = (C0477y) vVar.f7175c;
                        }
                    } else if (i10 == 0) {
                        e4 = C0465u.e(bArr, e4, vVar);
                        i7 = vVar.f7173a;
                    }
                    if (i8 == 12) {
                        break;
                    }
                    e4 = C0465u.a(i8, bArr, e4, i5, vVar);
                }
                if (yVar != null) {
                    z03.e((i7 << 3) | 2, yVar);
                }
                i4 = e4;
            }
        }
        if (i4 != i5) {
            throw C0425g0.d();
        }
    }

    public final int i(Object obj) {
        Y0 y02 = this.f6790b;
        int l4 = y02.l(y02.k(obj));
        return this.f6791c ? l4 + this.f6792d.b(obj).h() : l4;
    }

    public final boolean j(Object obj) {
        return this.f6792d.b(obj).d();
    }
}
