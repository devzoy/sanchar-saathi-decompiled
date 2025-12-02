package com.google.android.gms.internal.clearcut;

import android.support.v4.media.session.b;
import com.google.android.gms.internal.clearcut.C0407a0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;
import sun.misc.Unsafe;

public final class F0 implements R0 {

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f6769s = C0423f1.z();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f6770a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f6771b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6772c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6773d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6774e;

    /* renamed from: f  reason: collision with root package name */
    public final B0 f6775f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6776g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6777h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f6778i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f6779j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f6780k;

    /* renamed from: l  reason: collision with root package name */
    public final int[] f6781l;

    /* renamed from: m  reason: collision with root package name */
    public final int[] f6782m;

    /* renamed from: n  reason: collision with root package name */
    public final H0 f6783n;

    /* renamed from: o  reason: collision with root package name */
    public final C0440l0 f6784o;

    /* renamed from: p  reason: collision with root package name */
    public final Y0 f6785p;

    /* renamed from: q  reason: collision with root package name */
    public final P f6786q;

    /* renamed from: r  reason: collision with root package name */
    public final C0472w0 f6787r;

    public F0(int[] iArr, Object[] objArr, int i4, int i5, int i6, B0 b02, boolean z4, boolean z5, int[] iArr2, int[] iArr3, int[] iArr4, H0 h02, C0440l0 l0Var, Y0 y02, P p4, C0472w0 w0Var) {
        B0 b03 = b02;
        P p5 = p4;
        this.f6770a = iArr;
        this.f6771b = objArr;
        this.f6772c = i4;
        this.f6773d = i5;
        this.f6774e = i6;
        this.f6777h = b03 instanceof C0407a0;
        this.f6778i = z4;
        this.f6776g = p5 != null && p5.g(b02);
        this.f6779j = false;
        this.f6780k = iArr2;
        this.f6781l = iArr3;
        this.f6782m = iArr4;
        this.f6783n = h02;
        this.f6784o = l0Var;
        this.f6785p = y02;
        this.f6786q = p5;
        this.f6775f = b03;
        this.f6787r = w0Var;
    }

    public static boolean B(Object obj, int i4, R0 r02) {
        return r02.j(C0423f1.M(obj, (long) (i4 & 1048575)));
    }

    public static List N(Object obj, long j4) {
        return (List) C0423f1.M(obj, j4);
    }

    public static double O(Object obj, long j4) {
        return ((Double) C0423f1.M(obj, j4)).doubleValue();
    }

    public static float P(Object obj, long j4) {
        return ((Float) C0423f1.M(obj, j4)).floatValue();
    }

    public static int Q(Object obj, long j4) {
        return ((Integer) C0423f1.M(obj, j4)).intValue();
    }

    public static long R(Object obj, long j4) {
        return ((Long) C0423f1.M(obj, j4)).longValue();
    }

    public static boolean S(Object obj, long j4) {
        return ((Boolean) C0423f1.M(obj, j4)).booleanValue();
    }

    public static Z0 T(Object obj) {
        C0407a0 a0Var = (C0407a0) obj;
        Z0 z02 = a0Var.zzjp;
        if (z02 != Z0.h()) {
            return z02;
        }
        Z0 i4 = Z0.i();
        a0Var.zzjp = i4;
        return i4;
    }

    public static int a(int i4, byte[] bArr, int i5, int i6, Object obj, C0468v vVar) {
        return C0465u.c(i4, bArr, i5, i6, T(obj), vVar);
    }

    public static int k(R0 r02, int i4, byte[] bArr, int i5, int i6, C0422f0 f0Var, C0468v vVar) {
        int m4 = m(r02, bArr, i5, i6, vVar);
        while (true) {
            f0Var.add(vVar.f7175c);
            if (m4 >= i6) {
                break;
            }
            int e4 = C0465u.e(bArr, m4, vVar);
            if (i4 != vVar.f7173a) {
                break;
            }
            m4 = m(r02, bArr, e4, i6, vVar);
        }
        return m4;
    }

    public static int l(R0 r02, byte[] bArr, int i4, int i5, int i6, C0468v vVar) {
        F0 f02 = (F0) r02;
        Object d4 = f02.d();
        int r4 = f02.r(d4, bArr, i4, i5, i6, vVar);
        f02.c(d4);
        vVar.f7175c = d4;
        return r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m(com.google.android.gms.internal.clearcut.R0 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.clearcut.C0468v r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = com.google.android.gms.internal.clearcut.C0465u.d(r8, r7, r0, r10)
            int r8 = r10.f7173a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.d()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.h(r1, r2, r3, r4, r5)
            r6.c(r9)
            r10.f7175c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.clearcut.g0 r6 = com.google.android.gms.internal.clearcut.C0425g0.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.F0.m(com.google.android.gms.internal.clearcut.R0, byte[], int, int, com.google.android.gms.internal.clearcut.v):int");
    }

    public static int n(Y0 y02, Object obj) {
        return y02.j(y02.k(obj));
    }

    public static F0 s(Class cls, C0481z0 z0Var, H0 h02, C0440l0 l0Var, Y0 y02, P p4, C0472w0 w0Var) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C0481z0 z0Var2 = z0Var;
        int[] iArr = null;
        if (z0Var2 instanceof O0) {
            O0 o02 = (O0) z0Var2;
            boolean z4 = o02.a() == C0407a0.c.f7029j;
            if (o02.d() == 0) {
                i6 = 0;
                i5 = 0;
                i4 = 0;
            } else {
                int f4 = o02.f();
                int g4 = o02.g();
                i6 = o02.k();
                i5 = f4;
                i4 = g4;
            }
            int[] iArr2 = new int[(i6 << 2)];
            Object[] objArr = new Object[(i6 << 1)];
            int[] iArr3 = o02.h() > 0 ? new int[o02.h()] : null;
            if (o02.i() > 0) {
                iArr = new int[o02.i()];
            }
            int[] iArr4 = iArr;
            P0 e4 = o02.e();
            if (e4.a()) {
                int g5 = e4.g();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    if (g5 >= o02.l() || i10 >= ((g5 - i5) << 2)) {
                        if (e4.k()) {
                            i9 = (int) C0423f1.b(e4.l());
                            i8 = (int) C0423f1.b(e4.m());
                            i7 = 0;
                        } else {
                            i9 = (int) C0423f1.b(e4.n());
                            if (e4.o()) {
                                i8 = (int) C0423f1.b(e4.p());
                                i7 = e4.q();
                            } else {
                                i8 = 0;
                                i7 = 0;
                            }
                        }
                        iArr2[i10] = e4.g();
                        int i13 = i10 + 1;
                        iArr2[i13] = (e4.s() ? 536870912 : 0) | (e4.r() ? SQLiteDatabase.CREATE_IF_NECESSARY : 0) | (e4.h() << 20) | i9;
                        iArr2[i10 + 2] = i8 | (i7 << 20);
                        if (e4.v() != null) {
                            int i14 = (i10 / 4) << 1;
                            objArr[i14] = e4.v();
                            if (e4.t() != null) {
                                objArr[i14 + 1] = e4.t();
                            } else if (e4.u() != null) {
                                objArr[i14 + 1] = e4.u();
                            }
                        } else if (e4.t() != null) {
                            objArr[((i10 / 4) << 1) + 1] = e4.t();
                        } else if (e4.u() != null) {
                            objArr[((i10 / 4) << 1) + 1] = e4.u();
                        }
                        int h4 = e4.h();
                        if (h4 == W.MAP.ordinal()) {
                            iArr3[i11] = i10;
                            i11++;
                        } else if (h4 >= 18 && h4 <= 49) {
                            iArr4[i12] = iArr2[i13] & 1048575;
                            i12++;
                        }
                        if (!e4.a()) {
                            break;
                        }
                        g5 = e4.g();
                    } else {
                        for (int i15 = 0; i15 < 4; i15++) {
                            iArr2[i10 + i15] = -1;
                        }
                    }
                    i10 += 4;
                }
            }
            return new F0(iArr2, objArr, i5, i4, o02.l(), o02.c(), z4, false, o02.j(), iArr3, iArr4, h02, l0Var, y02, p4, w0Var);
        }
        b.a(z0Var);
        throw null;
    }

    public static void u(int i4, Object obj, C0464t1 t1Var) {
        if (obj instanceof String) {
            t1Var.w(i4, (String) obj);
        } else {
            t1Var.G(i4, (C0477y) obj);
        }
    }

    public static void v(Y0 y02, Object obj, C0464t1 t1Var) {
        y02.c(y02.k(obj), t1Var);
    }

    public final boolean A(Object obj, int i4, int i5, int i6) {
        return this.f6778i ? y(obj, i4) : (i5 & i6) != 0;
    }

    public final R0 C(int i4) {
        int i5 = (i4 / 4) << 1;
        R0 r02 = (R0) this.f6771b[i5];
        if (r02 != null) {
            return r02;
        }
        R0 b4 = M0.a().b((Class) this.f6771b[i5 + 1]);
        this.f6771b[i5] = b4;
        return b4;
    }

    public final Object D(int i4) {
        return this.f6771b[(i4 / 4) << 1];
    }

    public final C0419e0 E(int i4) {
        return (C0419e0) this.f6771b[((i4 / 4) << 1) + 1];
    }

    public final int F(int i4) {
        return this.f6770a[i4 + 1];
    }

    public final int G(int i4) {
        return this.f6770a[i4 + 2];
    }

    public final int H(int i4) {
        int i5 = this.f6772c;
        if (i4 >= i5) {
            int i6 = this.f6774e;
            if (i4 < i6) {
                int i7 = (i4 - i5) << 2;
                if (this.f6770a[i7] == i4) {
                    return i7;
                }
                return -1;
            } else if (i4 <= this.f6773d) {
                int i8 = i6 - i5;
                int length = (this.f6770a.length / 4) - 1;
                while (i8 <= length) {
                    int i9 = (length + i8) >>> 1;
                    int i10 = i9 << 2;
                    int i11 = this.f6770a[i10];
                    if (i4 == i11) {
                        return i10;
                    }
                    if (i4 < i11) {
                        length = i9 - 1;
                    } else {
                        i8 = i9 + 1;
                    }
                }
            }
        }
        return -1;
    }

    public final void I(Object obj, int i4) {
        if (!this.f6778i) {
            int G4 = G(i4);
            long j4 = (long) (G4 & 1048575);
            C0423f1.g(obj, j4, C0423f1.H(obj, j4) | (1 << (G4 >>> 20)));
        }
    }

    public final void J(Object obj, int i4, int i5) {
        C0423f1.g(obj, (long) (G(i5) & 1048575), i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0484, code lost:
        r10 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x029b, code lost:
        r15 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(java.lang.Object r18, com.google.android.gms.internal.clearcut.C0464t1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f6776g
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.clearcut.P r3 = r0.f6786q
            com.google.android.gms.internal.clearcut.U r3 = r3.b(r1)
            boolean r5 = r3.b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.e()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f6770a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f6769s
            r9 = -1
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r6) goto L_0x0488
            int r12 = r0.F(r10)
            int[] r13 = r0.f6770a
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f6778i
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x0059
            r4 = 17
            if (r15 > r4) goto L_0x0059
            int r4 = r10 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            if (r13 == r9) goto L_0x0053
            long r8 = (long) r13
            int r11 = r7.getInt(r1, r8)
            r9 = r13
        L_0x0053:
            int r4 = r4 >>> 20
            r8 = 1
            int r4 = r8 << r4
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            if (r5 == 0) goto L_0x0078
            com.google.android.gms.internal.clearcut.P r8 = r0.f6786q
            int r8 = r8.a(r5)
            if (r8 > r14) goto L_0x0078
            com.google.android.gms.internal.clearcut.P r8 = r0.f6786q
            r8.c(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0076
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005a
        L_0x0076:
            r5 = 0
            goto L_0x005a
        L_0x0078:
            r8 = r12 & r16
            long r12 = (long) r8
            switch(r15) {
                case 0: goto L_0x0479;
                case 1: goto L_0x046d;
                case 2: goto L_0x0461;
                case 3: goto L_0x0455;
                case 4: goto L_0x0449;
                case 5: goto L_0x043d;
                case 6: goto L_0x0431;
                case 7: goto L_0x0425;
                case 8: goto L_0x0419;
                case 9: goto L_0x0408;
                case 10: goto L_0x03f9;
                case 11: goto L_0x03ec;
                case 12: goto L_0x03df;
                case 13: goto L_0x03d2;
                case 14: goto L_0x03c5;
                case 15: goto L_0x03b8;
                case 16: goto L_0x03ab;
                case 17: goto L_0x039a;
                case 18: goto L_0x038a;
                case 19: goto L_0x037a;
                case 20: goto L_0x036a;
                case 21: goto L_0x035a;
                case 22: goto L_0x034a;
                case 23: goto L_0x033a;
                case 24: goto L_0x032a;
                case 25: goto L_0x031a;
                case 26: goto L_0x030b;
                case 27: goto L_0x02f8;
                case 28: goto L_0x02e9;
                case 29: goto L_0x02da;
                case 30: goto L_0x02cb;
                case 31: goto L_0x02bc;
                case 32: goto L_0x02ad;
                case 33: goto L_0x029e;
                case 34: goto L_0x028d;
                case 35: goto L_0x027d;
                case 36: goto L_0x026d;
                case 37: goto L_0x025d;
                case 38: goto L_0x024d;
                case 39: goto L_0x023d;
                case 40: goto L_0x022d;
                case 41: goto L_0x021d;
                case 42: goto L_0x020d;
                case 43: goto L_0x01fd;
                case 44: goto L_0x01ed;
                case 45: goto L_0x01dd;
                case 46: goto L_0x01cd;
                case 47: goto L_0x01bd;
                case 48: goto L_0x01ad;
                case 49: goto L_0x019a;
                case 50: goto L_0x0191;
                case 51: goto L_0x0182;
                case 52: goto L_0x0173;
                case 53: goto L_0x0164;
                case 54: goto L_0x0155;
                case 55: goto L_0x0146;
                case 56: goto L_0x0137;
                case 57: goto L_0x0128;
                case 58: goto L_0x0119;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f7;
                case 61: goto L_0x00e7;
                case 62: goto L_0x00d9;
                case 63: goto L_0x00cb;
                case 64: goto L_0x00bd;
                case 65: goto L_0x00af;
                case 66: goto L_0x00a1;
                case 67: goto L_0x0093;
                case 68: goto L_0x0081;
                default: goto L_0x007e;
            }
        L_0x007e:
            r15 = 0
            goto L_0x0484
        L_0x0081:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.R0 r8 = r0.C(r10)
            r2.M(r14, r4, r8)
            goto L_0x007e
        L_0x0093:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r12 = R(r1, r12)
            r2.h(r14, r12)
            goto L_0x007e
        L_0x00a1:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Q(r1, r12)
            r2.y(r14, r4)
            goto L_0x007e
        L_0x00af:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r12 = R(r1, r12)
            r2.H(r14, r12)
            goto L_0x007e
        L_0x00bd:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Q(r1, r12)
            r2.R(r14, r4)
            goto L_0x007e
        L_0x00cb:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Q(r1, r12)
            r2.F(r14, r4)
            goto L_0x007e
        L_0x00d9:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Q(r1, r12)
            r2.s(r14, r4)
            goto L_0x007e
        L_0x00e7:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.y r4 = (com.google.android.gms.internal.clearcut.C0477y) r4
            r2.G(r14, r4)
            goto L_0x007e
        L_0x00f7:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.R0 r8 = r0.C(r10)
            r2.J(r14, r4, r8)
            goto L_0x007e
        L_0x010a:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r12)
            u(r14, r4, r2)
            goto L_0x007e
        L_0x0119:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            boolean r4 = S(r1, r12)
            r2.L(r14, r4)
            goto L_0x007e
        L_0x0128:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Q(r1, r12)
            r2.e(r14, r4)
            goto L_0x007e
        L_0x0137:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r12 = R(r1, r12)
            r2.n(r14, r12)
            goto L_0x007e
        L_0x0146:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Q(r1, r12)
            r2.m(r14, r4)
            goto L_0x007e
        L_0x0155:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r12 = R(r1, r12)
            r2.C(r14, r12)
            goto L_0x007e
        L_0x0164:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r12 = R(r1, r12)
            r2.S(r14, r12)
            goto L_0x007e
        L_0x0173:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            float r4 = P(r1, r12)
            r2.E(r14, r4)
            goto L_0x007e
        L_0x0182:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            double r12 = O(r1, r12)
            r2.D(r14, r12)
            goto L_0x007e
        L_0x0191:
            java.lang.Object r4 = r7.getObject(r1, r12)
            r0.w(r2, r14, r4, r10)
            goto L_0x007e
        L_0x019a:
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.R0 r12 = r0.C(r10)
            com.google.android.gms.internal.clearcut.T0.l(r4, r8, r2, r12)
            goto L_0x007e
        L_0x01ad:
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r14 = 1
            com.google.android.gms.internal.clearcut.T0.F(r4, r8, r2, r14)
            goto L_0x007e
        L_0x01bd:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.Q(r4, r8, r2, r14)
            goto L_0x007e
        L_0x01cd:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.K(r4, r8, r2, r14)
            goto L_0x007e
        L_0x01dd:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.S(r4, r8, r2, r14)
            goto L_0x007e
        L_0x01ed:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.T(r4, r8, r2, r14)
            goto L_0x007e
        L_0x01fd:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.O(r4, r8, r2, r14)
            goto L_0x007e
        L_0x020d:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.U(r4, r8, r2, r14)
            goto L_0x007e
        L_0x021d:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.R(r4, r8, r2, r14)
            goto L_0x007e
        L_0x022d:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.H(r4, r8, r2, r14)
            goto L_0x007e
        L_0x023d:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.M(r4, r8, r2, r14)
            goto L_0x007e
        L_0x024d:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.x(r4, r8, r2, r14)
            goto L_0x007e
        L_0x025d:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.r(r4, r8, r2, r14)
            goto L_0x007e
        L_0x026d:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.m(r4, r8, r2, r14)
            goto L_0x007e
        L_0x027d:
            r14 = 1
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.f(r4, r8, r2, r14)
            goto L_0x007e
        L_0x028d:
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            com.google.android.gms.internal.clearcut.T0.F(r4, r8, r2, r14)
        L_0x029b:
            r15 = r14
            goto L_0x0484
        L_0x029e:
            r14 = 0
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.Q(r4, r8, r2, r14)
            goto L_0x029b
        L_0x02ad:
            r14 = 0
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.K(r4, r8, r2, r14)
            goto L_0x029b
        L_0x02bc:
            r14 = 0
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.S(r4, r8, r2, r14)
            goto L_0x029b
        L_0x02cb:
            r14 = 0
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.T(r4, r8, r2, r14)
            goto L_0x029b
        L_0x02da:
            r14 = 0
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.O(r4, r8, r2, r14)
            goto L_0x029b
        L_0x02e9:
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.k(r4, r8, r2)
            goto L_0x007e
        L_0x02f8:
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.R0 r12 = r0.C(r10)
            com.google.android.gms.internal.clearcut.T0.e(r4, r8, r2, r12)
            goto L_0x007e
        L_0x030b:
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.d(r4, r8, r2)
            goto L_0x007e
        L_0x031a:
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.clearcut.T0.U(r4, r8, r2, r15)
            goto L_0x0484
        L_0x032a:
            r15 = 0
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.R(r4, r8, r2, r15)
            goto L_0x0484
        L_0x033a:
            r15 = 0
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.H(r4, r8, r2, r15)
            goto L_0x0484
        L_0x034a:
            r15 = 0
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.M(r4, r8, r2, r15)
            goto L_0x0484
        L_0x035a:
            r15 = 0
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.x(r4, r8, r2, r15)
            goto L_0x0484
        L_0x036a:
            r15 = 0
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.r(r4, r8, r2, r15)
            goto L_0x0484
        L_0x037a:
            r15 = 0
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.m(r4, r8, r2, r15)
            goto L_0x0484
        L_0x038a:
            r15 = 0
            int[] r4 = r0.f6770a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.f(r4, r8, r2, r15)
            goto L_0x0484
        L_0x039a:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            java.lang.Object r4 = r7.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.R0 r8 = r0.C(r10)
            r2.M(r14, r4, r8)
            goto L_0x0484
        L_0x03ab:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            long r12 = r7.getLong(r1, r12)
            r2.h(r14, r12)
            goto L_0x0484
        L_0x03b8:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            int r4 = r7.getInt(r1, r12)
            r2.y(r14, r4)
            goto L_0x0484
        L_0x03c5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            long r12 = r7.getLong(r1, r12)
            r2.H(r14, r12)
            goto L_0x0484
        L_0x03d2:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            int r4 = r7.getInt(r1, r12)
            r2.R(r14, r4)
            goto L_0x0484
        L_0x03df:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            int r4 = r7.getInt(r1, r12)
            r2.F(r14, r4)
            goto L_0x0484
        L_0x03ec:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            int r4 = r7.getInt(r1, r12)
            r2.s(r14, r4)
            goto L_0x0484
        L_0x03f9:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            java.lang.Object r4 = r7.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.y r4 = (com.google.android.gms.internal.clearcut.C0477y) r4
            r2.G(r14, r4)
            goto L_0x0484
        L_0x0408:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            java.lang.Object r4 = r7.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.R0 r8 = r0.C(r10)
            r2.J(r14, r4, r8)
            goto L_0x0484
        L_0x0419:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            java.lang.Object r4 = r7.getObject(r1, r12)
            u(r14, r4, r2)
            goto L_0x0484
        L_0x0425:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            boolean r4 = com.google.android.gms.internal.clearcut.C0423f1.J(r1, r12)
            r2.L(r14, r4)
            goto L_0x0484
        L_0x0431:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            int r4 = r7.getInt(r1, r12)
            r2.e(r14, r4)
            goto L_0x0484
        L_0x043d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            long r12 = r7.getLong(r1, r12)
            r2.n(r14, r12)
            goto L_0x0484
        L_0x0449:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            int r4 = r7.getInt(r1, r12)
            r2.m(r14, r4)
            goto L_0x0484
        L_0x0455:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            long r12 = r7.getLong(r1, r12)
            r2.C(r14, r12)
            goto L_0x0484
        L_0x0461:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            long r12 = r7.getLong(r1, r12)
            r2.S(r14, r12)
            goto L_0x0484
        L_0x046d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            float r4 = com.google.android.gms.internal.clearcut.C0423f1.K(r1, r12)
            r2.E(r14, r4)
            goto L_0x0484
        L_0x0479:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            double r12 = com.google.android.gms.internal.clearcut.C0423f1.L(r1, r12)
            r2.D(r14, r12)
        L_0x0484:
            int r10 = r10 + 4
            goto L_0x002b
        L_0x0488:
            if (r5 == 0) goto L_0x049f
            com.google.android.gms.internal.clearcut.P r4 = r0.f6786q
            r4.c(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x049d
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x0488
        L_0x049d:
            r5 = 0
            goto L_0x0488
        L_0x049f:
            com.google.android.gms.internal.clearcut.Y0 r3 = r0.f6785p
            v(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.F0.K(java.lang.Object, com.google.android.gms.internal.clearcut.t1):void");
    }

    public final void L(Object obj, Object obj2, int i4) {
        int F4 = F(i4);
        int i5 = this.f6770a[i4];
        long j4 = (long) (F4 & 1048575);
        if (z(obj2, i5, i4)) {
            Object M4 = C0423f1.M(obj, j4);
            Object M5 = C0423f1.M(obj2, j4);
            if (M4 != null && M5 != null) {
                C0423f1.i(obj, j4, C0413c0.d(M4, M5));
                J(obj, i5, i4);
            } else if (M5 != null) {
                C0423f1.i(obj, j4, M5);
                J(obj, i5, i4);
            }
        }
    }

    public final boolean M(Object obj, Object obj2, int i4) {
        return y(obj, i4) == y(obj2, i4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (com.google.android.gms.internal.clearcut.T0.y(com.google.android.gms.internal.clearcut.C0423f1.M(r10, r6), com.google.android.gms.internal.clearcut.C0423f1.M(r11, r6)) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.I(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.I(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.I(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.I(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c7, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dd, code lost:
        if (com.google.android.gms.internal.clearcut.T0.y(com.google.android.gms.internal.clearcut.C0423f1.M(r10, r6), com.google.android.gms.internal.clearcut.C0423f1.M(r11, r6)) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (com.google.android.gms.internal.clearcut.T0.y(com.google.android.gms.internal.clearcut.C0423f1.M(r10, r6), com.google.android.gms.internal.clearcut.C0423f1.M(r11, r6)) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0109, code lost:
        if (com.google.android.gms.internal.clearcut.T0.y(com.google.android.gms.internal.clearcut.C0423f1.M(r10, r6), com.google.android.gms.internal.clearcut.C0423f1.M(r11, r6)) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011b, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.J(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.J(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012d, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0141, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.I(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.I(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0153, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0167, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.I(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.I(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017b, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.I(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.I(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018d, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a1, code lost:
        if (com.google.android.gms.internal.clearcut.C0423f1.I(r10, r6) == com.google.android.gms.internal.clearcut.C0423f1.I(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.clearcut.T0.y(com.google.android.gms.internal.clearcut.C0423f1.M(r10, r6), com.google.android.gms.internal.clearcut.C0423f1.M(r11, r6)) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.lang.Object r10, java.lang.Object r11) {
        /*
            r9 = this;
            int[] r0 = r9.f6770a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01ac
            int r4 = r9.F(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0191;
                case 1: goto L_0x017f;
                case 2: goto L_0x016b;
                case 3: goto L_0x0157;
                case 4: goto L_0x0145;
                case 5: goto L_0x0131;
                case 6: goto L_0x011f;
                case 7: goto L_0x010d;
                case 8: goto L_0x00f7;
                case 9: goto L_0x00e1;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00b9;
                case 12: goto L_0x00a8;
                case 13: goto L_0x0097;
                case 14: goto L_0x0084;
                case 15: goto L_0x0073;
                case 16: goto L_0x0060;
                case 17: goto L_0x004b;
                case 18: goto L_0x003d;
                case 19: goto L_0x003d;
                case 20: goto L_0x003d;
                case 21: goto L_0x003d;
                case 22: goto L_0x003d;
                case 23: goto L_0x003d;
                case 24: goto L_0x003d;
                case 25: goto L_0x003d;
                case 26: goto L_0x003d;
                case 27: goto L_0x003d;
                case 28: goto L_0x003d;
                case 29: goto L_0x003d;
                case 30: goto L_0x003d;
                case 31: goto L_0x003d;
                case 32: goto L_0x003d;
                case 33: goto L_0x003d;
                case 34: goto L_0x003d;
                case 35: goto L_0x003d;
                case 36: goto L_0x003d;
                case 37: goto L_0x003d;
                case 38: goto L_0x003d;
                case 39: goto L_0x003d;
                case 40: goto L_0x003d;
                case 41: goto L_0x003d;
                case 42: goto L_0x003d;
                case 43: goto L_0x003d;
                case 44: goto L_0x003d;
                case 45: goto L_0x003d;
                case 46: goto L_0x003d;
                case 47: goto L_0x003d;
                case 48: goto L_0x003d;
                case 49: goto L_0x003d;
                case 50: goto L_0x003d;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01a5
        L_0x001c:
            int r4 = r9.G(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.clearcut.C0423f1.H(r10, r4)
            int r4 = com.google.android.gms.internal.clearcut.C0423f1.H(r11, r4)
            if (r8 != r4) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C0423f1.M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.T0.y(r4, r5)
            if (r4 != 0) goto L_0x01a5
        L_0x003a:
            r3 = r1
            goto L_0x01a5
        L_0x003d:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C0423f1.M(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r11, r6)
            boolean r3 = com.google.android.gms.internal.clearcut.T0.y(r3, r4)
            goto L_0x01a5
        L_0x004b:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C0423f1.M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.T0.y(r4, r5)
            if (r4 != 0) goto L_0x01a5
            goto L_0x003a
        L_0x0060:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.clearcut.C0423f1.I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C0423f1.I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            goto L_0x003a
        L_0x0073:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x0084:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.clearcut.C0423f1.I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C0423f1.I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            goto L_0x003a
        L_0x0097:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x00a8:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x00b9:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x00cb:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C0423f1.M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.T0.y(r4, r5)
            if (r4 != 0) goto L_0x01a5
            goto L_0x003a
        L_0x00e1:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C0423f1.M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.T0.y(r4, r5)
            if (r4 != 0) goto L_0x01a5
            goto L_0x003a
        L_0x00f7:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C0423f1.M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.T0.y(r4, r5)
            if (r4 != 0) goto L_0x01a5
            goto L_0x003a
        L_0x010d:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            boolean r4 = com.google.android.gms.internal.clearcut.C0423f1.J(r10, r6)
            boolean r5 = com.google.android.gms.internal.clearcut.C0423f1.J(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x011f:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x0131:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.clearcut.C0423f1.I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C0423f1.I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            goto L_0x003a
        L_0x0145:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x0157:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.clearcut.C0423f1.I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C0423f1.I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            goto L_0x003a
        L_0x016b:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.clearcut.C0423f1.I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C0423f1.I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            goto L_0x003a
        L_0x017f:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C0423f1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C0423f1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x0191:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.clearcut.C0423f1.I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C0423f1.I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            goto L_0x003a
        L_0x01a5:
            if (r3 != 0) goto L_0x01a8
            return r1
        L_0x01a8:
            int r2 = r2 + 4
            goto L_0x0005
        L_0x01ac:
            com.google.android.gms.internal.clearcut.Y0 r0 = r9.f6785p
            java.lang.Object r0 = r0.k(r10)
            com.google.android.gms.internal.clearcut.Y0 r2 = r9.f6785p
            java.lang.Object r2 = r2.k(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01bf
            return r1
        L_0x01bf:
            boolean r0 = r9.f6776g
            if (r0 == 0) goto L_0x01d4
            com.google.android.gms.internal.clearcut.P r0 = r9.f6786q
            com.google.android.gms.internal.clearcut.U r10 = r0.b(r10)
            com.google.android.gms.internal.clearcut.P r0 = r9.f6786q
            com.google.android.gms.internal.clearcut.U r11 = r0.b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01d4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.F0.b(java.lang.Object, java.lang.Object):boolean");
    }

    public final void c(Object obj) {
        int[] iArr = this.f6781l;
        if (iArr != null) {
            for (int F4 : iArr) {
                long F5 = (long) (F(F4) & 1048575);
                Object M4 = C0423f1.M(obj, F5);
                if (M4 != null) {
                    C0423f1.i(obj, F5, this.f6787r.g(M4));
                }
            }
        }
        int[] iArr2 = this.f6782m;
        if (iArr2 != null) {
            for (int i4 : iArr2) {
                this.f6784o.a(obj, (long) i4);
            }
        }
        this.f6785p.d(obj);
        if (this.f6776g) {
            this.f6786q.f(obj);
        }
    }

    public final Object d() {
        return this.f6783n.a(this.f6775f);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r2 = r2 * 53;
        r3 = R(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r3 = com.google.android.gms.internal.clearcut.C0413c0.i(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r2 = r2 * 53;
        r3 = Q(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.C0423f1.M(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.clearcut.C0423f1.M(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        r3 = com.google.android.gms.internal.clearcut.C0413c0.f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f2, code lost:
        if (r3 != null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f4, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f8, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0110, code lost:
        if (r3 != null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0128, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r3 = com.google.android.gms.internal.clearcut.C0423f1.M(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r2 = r2 + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f6770a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x012c
            int r3 = r8.F(r1)
            int[] r4 = r8.f6770a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0121;
                case 1: goto L_0x011a;
                case 2: goto L_0x00fc;
                case 3: goto L_0x00fc;
                case 4: goto L_0x0104;
                case 5: goto L_0x00fc;
                case 6: goto L_0x0104;
                case 7: goto L_0x0113;
                case 8: goto L_0x0087;
                case 9: goto L_0x010c;
                case 10: goto L_0x0073;
                case 11: goto L_0x0104;
                case 12: goto L_0x0104;
                case 13: goto L_0x0104;
                case 14: goto L_0x00fc;
                case 15: goto L_0x0104;
                case 16: goto L_0x00fc;
                case 17: goto L_0x00ee;
                case 18: goto L_0x0073;
                case 19: goto L_0x0073;
                case 20: goto L_0x0073;
                case 21: goto L_0x0073;
                case 22: goto L_0x0073;
                case 23: goto L_0x0073;
                case 24: goto L_0x0073;
                case 25: goto L_0x0073;
                case 26: goto L_0x0073;
                case 27: goto L_0x0073;
                case 28: goto L_0x0073;
                case 29: goto L_0x0073;
                case 30: goto L_0x0073;
                case 31: goto L_0x0073;
                case 32: goto L_0x0073;
                case 33: goto L_0x0073;
                case 34: goto L_0x0073;
                case 35: goto L_0x0073;
                case 36: goto L_0x0073;
                case 37: goto L_0x0073;
                case 38: goto L_0x0073;
                case 39: goto L_0x0073;
                case 40: goto L_0x0073;
                case 41: goto L_0x0073;
                case 42: goto L_0x0073;
                case 43: goto L_0x0073;
                case 44: goto L_0x0073;
                case 45: goto L_0x0073;
                case 46: goto L_0x0073;
                case 47: goto L_0x0073;
                case 48: goto L_0x0073;
                case 49: goto L_0x0073;
                case 50: goto L_0x0073;
                case 51: goto L_0x00dc;
                case 52: goto L_0x00ca;
                case 53: goto L_0x00c2;
                case 54: goto L_0x00ba;
                case 55: goto L_0x00b3;
                case 56: goto L_0x00ac;
                case 57: goto L_0x00a5;
                case 58: goto L_0x0094;
                case 59: goto L_0x0081;
                case 60: goto L_0x007a;
                case 61: goto L_0x006d;
                case 62: goto L_0x0066;
                case 63: goto L_0x005f;
                case 64: goto L_0x0058;
                case 65: goto L_0x0051;
                case 66: goto L_0x0044;
                case 67: goto L_0x0033;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0128
        L_0x0020:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0026:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C0423f1.M(r9, r5)
            int r2 = r2 * 53
        L_0x002c:
            int r3 = r3.hashCode()
        L_0x0030:
            int r2 = r2 + r3
            goto L_0x0128
        L_0x0033:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0039:
            int r2 = r2 * 53
            long r3 = R(r9, r5)
        L_0x003f:
            int r3 = com.google.android.gms.internal.clearcut.C0413c0.i(r3)
            goto L_0x0030
        L_0x0044:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x004a:
            int r2 = r2 * 53
            int r3 = Q(r9, r5)
            goto L_0x0030
        L_0x0051:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0039
        L_0x0058:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x004a
        L_0x005f:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x004a
        L_0x0066:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x004a
        L_0x006d:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0073:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C0423f1.M(r9, r5)
            goto L_0x002c
        L_0x007a:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0026
        L_0x0081:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0087:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C0423f1.M(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x0094:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            boolean r3 = S(r9, r5)
        L_0x00a0:
            int r3 = com.google.android.gms.internal.clearcut.C0413c0.f(r3)
            goto L_0x0030
        L_0x00a5:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x004a
        L_0x00ac:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0039
        L_0x00b3:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x004a
        L_0x00ba:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0039
        L_0x00c2:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0039
        L_0x00ca:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            float r3 = P(r9, r5)
        L_0x00d6:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0030
        L_0x00dc:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            double r3 = O(r9, r5)
        L_0x00e8:
            long r3 = java.lang.Double.doubleToLongBits(r3)
            goto L_0x003f
        L_0x00ee:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C0423f1.M(r9, r5)
            if (r3 == 0) goto L_0x00f8
        L_0x00f4:
            int r7 = r3.hashCode()
        L_0x00f8:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0128
        L_0x00fc:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.clearcut.C0423f1.I(r9, r5)
            goto L_0x003f
        L_0x0104:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.clearcut.C0423f1.H(r9, r5)
            goto L_0x0030
        L_0x010c:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C0423f1.M(r9, r5)
            if (r3 == 0) goto L_0x00f8
            goto L_0x00f4
        L_0x0113:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.clearcut.C0423f1.J(r9, r5)
            goto L_0x00a0
        L_0x011a:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.clearcut.C0423f1.K(r9, r5)
            goto L_0x00d6
        L_0x0121:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.clearcut.C0423f1.L(r9, r5)
            goto L_0x00e8
        L_0x0128:
            int r1 = r1 + 4
            goto L_0x0005
        L_0x012c:
            int r2 = r2 * 53
            com.google.android.gms.internal.clearcut.Y0 r0 = r8.f6785p
            java.lang.Object r0 = r0.k(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f6776g
            if (r0 == 0) goto L_0x014a
            int r2 = r2 * 53
            com.google.android.gms.internal.clearcut.P r0 = r8.f6786q
            com.google.android.gms.internal.clearcut.U r9 = r0.b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.F0.e(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0533, code lost:
        r15.M(r10, com.google.android.gms.internal.clearcut.C0423f1.M(r14, (long) (r9 & 1048575)), C(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x054e, code lost:
        r15.h(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x055f, code lost:
        r15.y(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0570, code lost:
        r15.H(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0581, code lost:
        r15.R(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0592, code lost:
        r15.F(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05a3, code lost:
        r15.s(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05ae, code lost:
        r15.G(r10, (com.google.android.gms.internal.clearcut.C0477y) com.google.android.gms.internal.clearcut.C0423f1.M(r14, (long) (r9 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        r15.M(r9, com.google.android.gms.internal.clearcut.C0423f1.M(r14, (long) (r8 & 1048575)), C(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05c1, code lost:
        r15.J(r10, com.google.android.gms.internal.clearcut.C0423f1.M(r14, (long) (r9 & 1048575)), C(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05d6, code lost:
        u(r10, com.google.android.gms.internal.clearcut.C0423f1.M(r14, (long) (r9 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05ed, code lost:
        r15.L(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05fe, code lost:
        r15.e(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x060f, code lost:
        r15.n(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0620, code lost:
        r15.m(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0631, code lost:
        r15.C(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0642, code lost:
        r15.S(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0653, code lost:
        r15.E(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0664, code lost:
        r15.D(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        r15.h(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        r15.y(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        r15.H(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        r15.R(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        r15.F(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
        r15.s(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e9, code lost:
        r15.G(r9, (com.google.android.gms.internal.clearcut.C0477y) com.google.android.gms.internal.clearcut.C0423f1.M(r14, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fc, code lost:
        r15.J(r9, com.google.android.gms.internal.clearcut.C0423f1.M(r14, (long) (r8 & 1048575)), C(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0111, code lost:
        u(r9, com.google.android.gms.internal.clearcut.C0423f1.M(r14, (long) (r8 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0128, code lost:
        r15.L(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0139, code lost:
        r15.e(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014a, code lost:
        r15.n(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015b, code lost:
        r15.m(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016c, code lost:
        r15.C(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017d, code lost:
        r15.S(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018e, code lost:
        r15.E(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019f, code lost:
        r15.D(r9, r10);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0986  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.Object r14, com.google.android.gms.internal.clearcut.C0464t1 r15) {
        /*
            r13 = this;
            int r0 = r15.O()
            int r1 = com.google.android.gms.internal.clearcut.C0407a0.c.f7032m
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04d7
            com.google.android.gms.internal.clearcut.Y0 r0 = r13.f6785p
            v(r0, r14, r15)
            boolean r0 = r13.f6776g
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.clearcut.P r0 = r13.f6786q
            com.google.android.gms.internal.clearcut.U r0 = r0.b(r14)
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.a()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.f6770a
            int r7 = r7.length
            int r7 = r7 + -4
        L_0x0037:
            if (r7 < 0) goto L_0x04bf
            int r8 = r13.F(r7)
            int[] r9 = r13.f6770a
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.clearcut.P r10 = r13.f6786q
            int r10 = r10.a(r1)
            if (r10 <= r9) goto L_0x005f
            com.google.android.gms.internal.clearcut.P r10 = r13.f6786q
            r10.c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0041
        L_0x005d:
            r1 = r3
            goto L_0x0041
        L_0x005f:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04ad;
                case 1: goto L_0x049f;
                case 2: goto L_0x0491;
                case 3: goto L_0x0483;
                case 4: goto L_0x0475;
                case 5: goto L_0x0467;
                case 6: goto L_0x0459;
                case 7: goto L_0x044b;
                case 8: goto L_0x0443;
                case 9: goto L_0x043b;
                case 10: goto L_0x0433;
                case 11: goto L_0x0425;
                case 12: goto L_0x0417;
                case 13: goto L_0x0409;
                case 14: goto L_0x03fb;
                case 15: goto L_0x03ed;
                case 16: goto L_0x03df;
                case 17: goto L_0x03d7;
                case 18: goto L_0x03c6;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0393;
                case 22: goto L_0x0382;
                case 23: goto L_0x0371;
                case 24: goto L_0x0360;
                case 25: goto L_0x034f;
                case 26: goto L_0x033e;
                case 27: goto L_0x0329;
                case 28: goto L_0x0318;
                case 29: goto L_0x0307;
                case 30: goto L_0x02f6;
                case 31: goto L_0x02e5;
                case 32: goto L_0x02d4;
                case 33: goto L_0x02c3;
                case 34: goto L_0x02b2;
                case 35: goto L_0x02a1;
                case 36: goto L_0x0290;
                case 37: goto L_0x027f;
                case 38: goto L_0x026e;
                case 39: goto L_0x025d;
                case 40: goto L_0x024c;
                case 41: goto L_0x023b;
                case 42: goto L_0x022a;
                case 43: goto L_0x0219;
                case 44: goto L_0x0208;
                case 45: goto L_0x01f7;
                case 46: goto L_0x01e6;
                case 47: goto L_0x01d5;
                case 48: goto L_0x01c4;
                case 49: goto L_0x01af;
                case 50: goto L_0x01a4;
                case 51: goto L_0x0193;
                case 52: goto L_0x0182;
                case 53: goto L_0x0171;
                case 54: goto L_0x0160;
                case 55: goto L_0x014f;
                case 56: goto L_0x013e;
                case 57: goto L_0x012d;
                case 58: goto L_0x011c;
                case 59: goto L_0x010b;
                case 60: goto L_0x00f6;
                case 61: goto L_0x00e3;
                case 62: goto L_0x00d2;
                case 63: goto L_0x00c1;
                case 64: goto L_0x00b0;
                case 65: goto L_0x009f;
                case 66: goto L_0x008e;
                case 67: goto L_0x007d;
                case 68: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x04bb
        L_0x0068:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
        L_0x006e:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            com.google.android.gms.internal.clearcut.R0 r10 = r13.C(r7)
            r15.M(r9, r8, r10)
            goto L_0x04bb
        L_0x007d:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = R(r14, r10)
        L_0x0089:
            r15.h(r9, r10)
            goto L_0x04bb
        L_0x008e:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = Q(r14, r10)
        L_0x009a:
            r15.y(r9, r8)
            goto L_0x04bb
        L_0x009f:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = R(r14, r10)
        L_0x00ab:
            r15.H(r9, r10)
            goto L_0x04bb
        L_0x00b0:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = Q(r14, r10)
        L_0x00bc:
            r15.R(r9, r8)
            goto L_0x04bb
        L_0x00c1:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = Q(r14, r10)
        L_0x00cd:
            r15.F(r9, r8)
            goto L_0x04bb
        L_0x00d2:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = Q(r14, r10)
        L_0x00de:
            r15.s(r9, r8)
            goto L_0x04bb
        L_0x00e3:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
        L_0x00e9:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            com.google.android.gms.internal.clearcut.y r8 = (com.google.android.gms.internal.clearcut.C0477y) r8
            r15.G(r9, r8)
            goto L_0x04bb
        L_0x00f6:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
        L_0x00fc:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            com.google.android.gms.internal.clearcut.R0 r10 = r13.C(r7)
            r15.J(r9, r8, r10)
            goto L_0x04bb
        L_0x010b:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
        L_0x0111:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            u(r9, r8, r15)
            goto L_0x04bb
        L_0x011c:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = S(r14, r10)
        L_0x0128:
            r15.L(r9, r8)
            goto L_0x04bb
        L_0x012d:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = Q(r14, r10)
        L_0x0139:
            r15.e(r9, r8)
            goto L_0x04bb
        L_0x013e:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = R(r14, r10)
        L_0x014a:
            r15.n(r9, r10)
            goto L_0x04bb
        L_0x014f:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = Q(r14, r10)
        L_0x015b:
            r15.m(r9, r8)
            goto L_0x04bb
        L_0x0160:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = R(r14, r10)
        L_0x016c:
            r15.C(r9, r10)
            goto L_0x04bb
        L_0x0171:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = R(r14, r10)
        L_0x017d:
            r15.S(r9, r10)
            goto L_0x04bb
        L_0x0182:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = P(r14, r10)
        L_0x018e:
            r15.E(r9, r8)
            goto L_0x04bb
        L_0x0193:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = O(r14, r10)
        L_0x019f:
            r15.D(r9, r10)
            goto L_0x04bb
        L_0x01a4:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            r13.w(r15, r9, r8, r7)
            goto L_0x04bb
        L_0x01af:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.R0 r10 = r13.C(r7)
            com.google.android.gms.internal.clearcut.T0.l(r9, r8, r15, r10)
            goto L_0x04bb
        L_0x01c4:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.F(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x01d5:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.Q(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x01e6:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.K(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x01f7:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.S(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x0208:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.T(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x0219:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.O(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x022a:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.U(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x023b:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.R(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x024c:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.H(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x025d:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.M(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x026e:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.x(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x027f:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.r(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x0290:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.m(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x02a1:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.f(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x02b2:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.F(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x02c3:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.Q(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x02d4:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.K(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x02e5:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.S(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x02f6:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.T(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x0307:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.O(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x0318:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.k(r9, r8, r15)
            goto L_0x04bb
        L_0x0329:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.R0 r10 = r13.C(r7)
            com.google.android.gms.internal.clearcut.T0.e(r9, r8, r15, r10)
            goto L_0x04bb
        L_0x033e:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.d(r9, r8, r15)
            goto L_0x04bb
        L_0x034f:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.U(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x0360:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.R(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x0371:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.H(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x0382:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.M(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x0393:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.x(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x03a4:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.r(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x03b5:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.m(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x03c6:
            int[] r9 = r13.f6770a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.T0.f(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x03d7:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            goto L_0x006e
        L_0x03df:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C0423f1.I(r14, r10)
            goto L_0x0089
        L_0x03ed:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C0423f1.H(r14, r10)
            goto L_0x009a
        L_0x03fb:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C0423f1.I(r14, r10)
            goto L_0x00ab
        L_0x0409:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C0423f1.H(r14, r10)
            goto L_0x00bc
        L_0x0417:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C0423f1.H(r14, r10)
            goto L_0x00cd
        L_0x0425:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C0423f1.H(r14, r10)
            goto L_0x00de
        L_0x0433:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            goto L_0x00e9
        L_0x043b:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            goto L_0x00fc
        L_0x0443:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            goto L_0x0111
        L_0x044b:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.clearcut.C0423f1.J(r14, r10)
            goto L_0x0128
        L_0x0459:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C0423f1.H(r14, r10)
            goto L_0x0139
        L_0x0467:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C0423f1.I(r14, r10)
            goto L_0x014a
        L_0x0475:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C0423f1.H(r14, r10)
            goto L_0x015b
        L_0x0483:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C0423f1.I(r14, r10)
            goto L_0x016c
        L_0x0491:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C0423f1.I(r14, r10)
            goto L_0x017d
        L_0x049f:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.clearcut.C0423f1.K(r14, r10)
            goto L_0x018e
        L_0x04ad:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.clearcut.C0423f1.L(r14, r10)
            goto L_0x019f
        L_0x04bb:
            int r7 = r7 + -4
            goto L_0x0037
        L_0x04bf:
            if (r1 == 0) goto L_0x04d6
            com.google.android.gms.internal.clearcut.P r14 = r13.f6786q
            r14.c(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x04d4
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x04bf
        L_0x04d4:
            r1 = r3
            goto L_0x04bf
        L_0x04d6:
            return
        L_0x04d7:
            boolean r0 = r13.f6778i
            if (r0 == 0) goto L_0x09a0
            boolean r0 = r13.f6776g
            if (r0 == 0) goto L_0x04f6
            com.google.android.gms.internal.clearcut.P r0 = r13.f6786q
            com.google.android.gms.internal.clearcut.U r0 = r0.b(r14)
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x04f6
            java.util.Iterator r0 = r0.e()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x04f8
        L_0x04f6:
            r0 = r3
            r1 = r0
        L_0x04f8:
            int[] r7 = r13.f6770a
            int r7 = r7.length
            r8 = r5
        L_0x04fc:
            if (r8 >= r7) goto L_0x0984
            int r9 = r13.F(r8)
            int[] r10 = r13.f6770a
            r10 = r10[r8]
        L_0x0506:
            if (r1 == 0) goto L_0x0524
            com.google.android.gms.internal.clearcut.P r11 = r13.f6786q
            int r11 = r11.a(r1)
            if (r11 > r10) goto L_0x0524
            com.google.android.gms.internal.clearcut.P r11 = r13.f6786q
            r11.c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0522
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0506
        L_0x0522:
            r1 = r3
            goto L_0x0506
        L_0x0524:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0972;
                case 1: goto L_0x0964;
                case 2: goto L_0x0956;
                case 3: goto L_0x0948;
                case 4: goto L_0x093a;
                case 5: goto L_0x092c;
                case 6: goto L_0x091e;
                case 7: goto L_0x0910;
                case 8: goto L_0x0908;
                case 9: goto L_0x0900;
                case 10: goto L_0x08f8;
                case 11: goto L_0x08ea;
                case 12: goto L_0x08dc;
                case 13: goto L_0x08ce;
                case 14: goto L_0x08c0;
                case 15: goto L_0x08b2;
                case 16: goto L_0x08a4;
                case 17: goto L_0x089c;
                case 18: goto L_0x088b;
                case 19: goto L_0x087a;
                case 20: goto L_0x0869;
                case 21: goto L_0x0858;
                case 22: goto L_0x0847;
                case 23: goto L_0x0836;
                case 24: goto L_0x0825;
                case 25: goto L_0x0814;
                case 26: goto L_0x0803;
                case 27: goto L_0x07ee;
                case 28: goto L_0x07dd;
                case 29: goto L_0x07cc;
                case 30: goto L_0x07bb;
                case 31: goto L_0x07aa;
                case 32: goto L_0x0799;
                case 33: goto L_0x0788;
                case 34: goto L_0x0777;
                case 35: goto L_0x0766;
                case 36: goto L_0x0755;
                case 37: goto L_0x0744;
                case 38: goto L_0x0733;
                case 39: goto L_0x0722;
                case 40: goto L_0x0711;
                case 41: goto L_0x0700;
                case 42: goto L_0x06ef;
                case 43: goto L_0x06de;
                case 44: goto L_0x06cd;
                case 45: goto L_0x06bc;
                case 46: goto L_0x06ab;
                case 47: goto L_0x069a;
                case 48: goto L_0x0689;
                case 49: goto L_0x0674;
                case 50: goto L_0x0669;
                case 51: goto L_0x0658;
                case 52: goto L_0x0647;
                case 53: goto L_0x0636;
                case 54: goto L_0x0625;
                case 55: goto L_0x0614;
                case 56: goto L_0x0603;
                case 57: goto L_0x05f2;
                case 58: goto L_0x05e1;
                case 59: goto L_0x05d0;
                case 60: goto L_0x05bb;
                case 61: goto L_0x05a8;
                case 62: goto L_0x0597;
                case 63: goto L_0x0586;
                case 64: goto L_0x0575;
                case 65: goto L_0x0564;
                case 66: goto L_0x0553;
                case 67: goto L_0x0542;
                case 68: goto L_0x052d;
                default: goto L_0x052b;
            }
        L_0x052b:
            goto L_0x0980
        L_0x052d:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
        L_0x0533:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            com.google.android.gms.internal.clearcut.R0 r11 = r13.C(r8)
            r15.M(r10, r9, r11)
            goto L_0x0980
        L_0x0542:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = R(r14, r11)
        L_0x054e:
            r15.h(r10, r11)
            goto L_0x0980
        L_0x0553:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = Q(r14, r11)
        L_0x055f:
            r15.y(r10, r9)
            goto L_0x0980
        L_0x0564:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = R(r14, r11)
        L_0x0570:
            r15.H(r10, r11)
            goto L_0x0980
        L_0x0575:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = Q(r14, r11)
        L_0x0581:
            r15.R(r10, r9)
            goto L_0x0980
        L_0x0586:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = Q(r14, r11)
        L_0x0592:
            r15.F(r10, r9)
            goto L_0x0980
        L_0x0597:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = Q(r14, r11)
        L_0x05a3:
            r15.s(r10, r9)
            goto L_0x0980
        L_0x05a8:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
        L_0x05ae:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            com.google.android.gms.internal.clearcut.y r9 = (com.google.android.gms.internal.clearcut.C0477y) r9
            r15.G(r10, r9)
            goto L_0x0980
        L_0x05bb:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
        L_0x05c1:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            com.google.android.gms.internal.clearcut.R0 r11 = r13.C(r8)
            r15.J(r10, r9, r11)
            goto L_0x0980
        L_0x05d0:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
        L_0x05d6:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            u(r10, r9, r15)
            goto L_0x0980
        L_0x05e1:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = S(r14, r11)
        L_0x05ed:
            r15.L(r10, r9)
            goto L_0x0980
        L_0x05f2:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = Q(r14, r11)
        L_0x05fe:
            r15.e(r10, r9)
            goto L_0x0980
        L_0x0603:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = R(r14, r11)
        L_0x060f:
            r15.n(r10, r11)
            goto L_0x0980
        L_0x0614:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = Q(r14, r11)
        L_0x0620:
            r15.m(r10, r9)
            goto L_0x0980
        L_0x0625:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = R(r14, r11)
        L_0x0631:
            r15.C(r10, r11)
            goto L_0x0980
        L_0x0636:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = R(r14, r11)
        L_0x0642:
            r15.S(r10, r11)
            goto L_0x0980
        L_0x0647:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = P(r14, r11)
        L_0x0653:
            r15.E(r10, r9)
            goto L_0x0980
        L_0x0658:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = O(r14, r11)
        L_0x0664:
            r15.D(r10, r11)
            goto L_0x0980
        L_0x0669:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            r13.w(r15, r10, r9, r8)
            goto L_0x0980
        L_0x0674:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.R0 r11 = r13.C(r8)
            com.google.android.gms.internal.clearcut.T0.l(r10, r9, r15, r11)
            goto L_0x0980
        L_0x0689:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.F(r10, r9, r15, r4)
            goto L_0x0980
        L_0x069a:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.Q(r10, r9, r15, r4)
            goto L_0x0980
        L_0x06ab:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.K(r10, r9, r15, r4)
            goto L_0x0980
        L_0x06bc:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.S(r10, r9, r15, r4)
            goto L_0x0980
        L_0x06cd:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.T(r10, r9, r15, r4)
            goto L_0x0980
        L_0x06de:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.O(r10, r9, r15, r4)
            goto L_0x0980
        L_0x06ef:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.U(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0700:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.R(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0711:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.H(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0722:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.M(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0733:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.x(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0744:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.r(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0755:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.m(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0766:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.f(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0777:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.F(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0788:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.Q(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0799:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.K(r10, r9, r15, r5)
            goto L_0x0980
        L_0x07aa:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.S(r10, r9, r15, r5)
            goto L_0x0980
        L_0x07bb:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.T(r10, r9, r15, r5)
            goto L_0x0980
        L_0x07cc:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.O(r10, r9, r15, r5)
            goto L_0x0980
        L_0x07dd:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.k(r10, r9, r15)
            goto L_0x0980
        L_0x07ee:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.R0 r11 = r13.C(r8)
            com.google.android.gms.internal.clearcut.T0.e(r10, r9, r15, r11)
            goto L_0x0980
        L_0x0803:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.d(r10, r9, r15)
            goto L_0x0980
        L_0x0814:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.U(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0825:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.R(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0836:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.H(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0847:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.M(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0858:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.x(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0869:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.r(r10, r9, r15, r5)
            goto L_0x0980
        L_0x087a:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.m(r10, r9, r15, r5)
            goto L_0x0980
        L_0x088b:
            int[] r10 = r13.f6770a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C0423f1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.T0.f(r10, r9, r15, r5)
            goto L_0x0980
        L_0x089c:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            goto L_0x0533
        L_0x08a4:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C0423f1.I(r14, r11)
            goto L_0x054e
        L_0x08b2:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C0423f1.H(r14, r11)
            goto L_0x055f
        L_0x08c0:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C0423f1.I(r14, r11)
            goto L_0x0570
        L_0x08ce:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C0423f1.H(r14, r11)
            goto L_0x0581
        L_0x08dc:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C0423f1.H(r14, r11)
            goto L_0x0592
        L_0x08ea:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C0423f1.H(r14, r11)
            goto L_0x05a3
        L_0x08f8:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            goto L_0x05ae
        L_0x0900:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            goto L_0x05c1
        L_0x0908:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            goto L_0x05d6
        L_0x0910:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.clearcut.C0423f1.J(r14, r11)
            goto L_0x05ed
        L_0x091e:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C0423f1.H(r14, r11)
            goto L_0x05fe
        L_0x092c:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C0423f1.I(r14, r11)
            goto L_0x060f
        L_0x093a:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C0423f1.H(r14, r11)
            goto L_0x0620
        L_0x0948:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C0423f1.I(r14, r11)
            goto L_0x0631
        L_0x0956:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C0423f1.I(r14, r11)
            goto L_0x0642
        L_0x0964:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.clearcut.C0423f1.K(r14, r11)
            goto L_0x0653
        L_0x0972:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.clearcut.C0423f1.L(r14, r11)
            goto L_0x0664
        L_0x0980:
            int r8 = r8 + 4
            goto L_0x04fc
        L_0x0984:
            if (r1 == 0) goto L_0x099a
            com.google.android.gms.internal.clearcut.P r2 = r13.f6786q
            r2.c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0998
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0984
        L_0x0998:
            r1 = r3
            goto L_0x0984
        L_0x099a:
            com.google.android.gms.internal.clearcut.Y0 r0 = r13.f6785p
            v(r0, r14, r15)
            return
        L_0x09a0:
            r13.K(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.F0.f(java.lang.Object, com.google.android.gms.internal.clearcut.t1):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        com.google.android.gms.internal.clearcut.C0423f1.h(r7, r2, com.google.android.gms.internal.clearcut.C0423f1.I(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        I(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        com.google.android.gms.internal.clearcut.C0423f1.g(r7, r2, com.google.android.gms.internal.clearcut.C0423f1.H(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        com.google.android.gms.internal.clearcut.C0423f1.i(r7, r2, com.google.android.gms.internal.clearcut.C0423f1.M(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f1, code lost:
        r0 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        com.google.android.gms.internal.clearcut.C0423f1.i(r7, r2, com.google.android.gms.internal.clearcut.C0423f1.M(r8, r2));
        J(r7, r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r8.getClass()
            r0 = 0
        L_0x0004:
            int[] r1 = r6.f6770a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f5
            int r1 = r6.F(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f6770a
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00e2;
                case 1: goto L_0x00d3;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00c5;
                case 4: goto L_0x00be;
                case 5: goto L_0x00b7;
                case 6: goto L_0x00b0;
                case 7: goto L_0x00a2;
                case 8: goto L_0x009b;
                case 9: goto L_0x004c;
                case 10: goto L_0x008d;
                case 11: goto L_0x0086;
                case 12: goto L_0x007f;
                case 13: goto L_0x0078;
                case 14: goto L_0x0071;
                case 15: goto L_0x0063;
                case 16: goto L_0x0051;
                case 17: goto L_0x004c;
                case 18: goto L_0x0045;
                case 19: goto L_0x0045;
                case 20: goto L_0x0045;
                case 21: goto L_0x0045;
                case 22: goto L_0x0045;
                case 23: goto L_0x0045;
                case 24: goto L_0x0045;
                case 25: goto L_0x0045;
                case 26: goto L_0x0045;
                case 27: goto L_0x0045;
                case 28: goto L_0x0045;
                case 29: goto L_0x0045;
                case 30: goto L_0x0045;
                case 31: goto L_0x0045;
                case 32: goto L_0x0045;
                case 33: goto L_0x0045;
                case 34: goto L_0x0045;
                case 35: goto L_0x0045;
                case 36: goto L_0x0045;
                case 37: goto L_0x0045;
                case 38: goto L_0x0045;
                case 39: goto L_0x0045;
                case 40: goto L_0x0045;
                case 41: goto L_0x0045;
                case 42: goto L_0x0045;
                case 43: goto L_0x0045;
                case 44: goto L_0x0045;
                case 45: goto L_0x0045;
                case 46: goto L_0x0045;
                case 47: goto L_0x0045;
                case 48: goto L_0x0045;
                case 49: goto L_0x0045;
                case 50: goto L_0x003e;
                case 51: goto L_0x0037;
                case 52: goto L_0x0037;
                case 53: goto L_0x0037;
                case 54: goto L_0x0037;
                case 55: goto L_0x0037;
                case 56: goto L_0x0037;
                case 57: goto L_0x0037;
                case 58: goto L_0x0037;
                case 59: goto L_0x0037;
                case 60: goto L_0x0020;
                case 61: goto L_0x0025;
                case 62: goto L_0x0025;
                case 63: goto L_0x0025;
                case 64: goto L_0x0025;
                case 65: goto L_0x0025;
                case 66: goto L_0x0025;
                case 67: goto L_0x0025;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x00f1
        L_0x0020:
            r6.L(r7, r8, r0)
            goto L_0x00f1
        L_0x0025:
            boolean r1 = r6.z(r8, r4, r0)
            if (r1 == 0) goto L_0x00f1
        L_0x002b:
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C0423f1.M(r8, r2)
            com.google.android.gms.internal.clearcut.C0423f1.i(r7, r2, r1)
            r6.J(r7, r4, r0)
            goto L_0x00f1
        L_0x0037:
            boolean r1 = r6.z(r8, r4, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x002b
        L_0x003e:
            com.google.android.gms.internal.clearcut.w0 r1 = r6.f6787r
            com.google.android.gms.internal.clearcut.T0.h(r1, r7, r8, r2)
            goto L_0x00f1
        L_0x0045:
            com.google.android.gms.internal.clearcut.l0 r1 = r6.f6784o
            r1.b(r7, r8, r2)
            goto L_0x00f1
        L_0x004c:
            r6.x(r7, r8, r0)
            goto L_0x00f1
        L_0x0051:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
        L_0x0057:
            long r4 = com.google.android.gms.internal.clearcut.C0423f1.I(r8, r2)
            com.google.android.gms.internal.clearcut.C0423f1.h(r7, r2, r4)
        L_0x005e:
            r6.I(r7, r0)
            goto L_0x00f1
        L_0x0063:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
        L_0x0069:
            int r1 = com.google.android.gms.internal.clearcut.C0423f1.H(r8, r2)
            com.google.android.gms.internal.clearcut.C0423f1.g(r7, r2, r1)
            goto L_0x005e
        L_0x0071:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0057
        L_0x0078:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0069
        L_0x007f:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0069
        L_0x0086:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0069
        L_0x008d:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
        L_0x0093:
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C0423f1.M(r8, r2)
            com.google.android.gms.internal.clearcut.C0423f1.i(r7, r2, r1)
            goto L_0x005e
        L_0x009b:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0093
        L_0x00a2:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            boolean r1 = com.google.android.gms.internal.clearcut.C0423f1.J(r8, r2)
            com.google.android.gms.internal.clearcut.C0423f1.j(r7, r2, r1)
            goto L_0x005e
        L_0x00b0:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0069
        L_0x00b7:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0057
        L_0x00be:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0069
        L_0x00c5:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0057
        L_0x00cc:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0057
        L_0x00d3:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            float r1 = com.google.android.gms.internal.clearcut.C0423f1.K(r8, r2)
            com.google.android.gms.internal.clearcut.C0423f1.f(r7, r2, r1)
            goto L_0x005e
        L_0x00e2:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            double r4 = com.google.android.gms.internal.clearcut.C0423f1.L(r8, r2)
            com.google.android.gms.internal.clearcut.C0423f1.e(r7, r2, r4)
            goto L_0x005e
        L_0x00f1:
            int r0 = r0 + 4
            goto L_0x0004
        L_0x00f5:
            boolean r0 = r6.f6778i
            if (r0 != 0) goto L_0x0107
            com.google.android.gms.internal.clearcut.Y0 r0 = r6.f6785p
            com.google.android.gms.internal.clearcut.T0.i(r0, r7, r8)
            boolean r0 = r6.f6776g
            if (r0 == 0) goto L_0x0107
            com.google.android.gms.internal.clearcut.P r0 = r6.f6786q
            com.google.android.gms.internal.clearcut.T0.g(r0, r7, r8)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.F0.g(java.lang.Object, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r9.putLong(r23, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r7 == 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r0 = com.google.android.gms.internal.clearcut.C0465u.e(r12, r10, r11);
        r1 = r11.f7173a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        r1 = r11.f7175c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        r0 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e4, code lost:
        if (r7 == 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0163, code lost:
        if (r0 == r15) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0196, code lost:
        if (r0 == r15) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01af, code lost:
        if (r0 == r15) goto L_0x0165;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.lang.Object r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.clearcut.C0468v r27) {
        /*
            r22 = this;
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            boolean r0 = r15.f6778i
            if (r0 == 0) goto L_0x01cb
            sun.misc.Unsafe r9 = f6769s
            r0 = r25
        L_0x0012:
            if (r0 >= r13) goto L_0x01c2
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0024
            int r0 = com.google.android.gms.internal.clearcut.C0465u.d(r0, r12, r1, r11)
            int r1 = r11.f7173a
            r10 = r0
            r16 = r1
            goto L_0x0027
        L_0x0024:
            r16 = r0
            r10 = r1
        L_0x0027:
            int r6 = r16 >>> 3
            r7 = r16 & 7
            int r8 = r15.H(r6)
            if (r8 < 0) goto L_0x004b
            int[] r0 = r15.f6770a
            int r1 = r8 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r4 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r2 = (long) r0
            r0 = 17
            r1 = 2
            if (r4 > r0) goto L_0x0105
            r0 = 5
            r6 = 1
            switch(r4) {
                case 0: goto L_0x00fb;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00e7;
                case 3: goto L_0x00e7;
                case 4: goto L_0x00e4;
                case 5: goto L_0x00d4;
                case 6: goto L_0x00c7;
                case 7: goto L_0x00b2;
                case 8: goto L_0x00a1;
                case 9: goto L_0x0089;
                case 10: goto L_0x007d;
                case 11: goto L_0x00e4;
                case 12: goto L_0x0074;
                case 13: goto L_0x00c7;
                case 14: goto L_0x00d4;
                case 15: goto L_0x0064;
                case 16: goto L_0x0050;
                default: goto L_0x004b;
            }
        L_0x004b:
            r21 = r9
            r15 = r10
            goto L_0x01b2
        L_0x0050:
            if (r7 != 0) goto L_0x004b
            int r6 = com.google.android.gms.internal.clearcut.C0465u.g(r12, r10, r11)
            long r0 = r11.f7174b
            long r4 = com.google.android.gms.internal.clearcut.H.a(r0)
        L_0x005c:
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x0012
        L_0x0064:
            if (r7 != 0) goto L_0x004b
            int r0 = com.google.android.gms.internal.clearcut.C0465u.e(r12, r10, r11)
            int r1 = r11.f7173a
            int r1 = com.google.android.gms.internal.clearcut.H.e(r1)
        L_0x0070:
            r9.putInt(r14, r2, r1)
            goto L_0x0012
        L_0x0074:
            if (r7 != 0) goto L_0x004b
        L_0x0076:
            int r0 = com.google.android.gms.internal.clearcut.C0465u.e(r12, r10, r11)
            int r1 = r11.f7173a
            goto L_0x0070
        L_0x007d:
            if (r7 != r1) goto L_0x004b
            int r0 = com.google.android.gms.internal.clearcut.C0465u.m(r12, r10, r11)
        L_0x0083:
            java.lang.Object r1 = r11.f7175c
        L_0x0085:
            r9.putObject(r14, r2, r1)
            goto L_0x0012
        L_0x0089:
            if (r7 != r1) goto L_0x004b
            com.google.android.gms.internal.clearcut.R0 r0 = r15.C(r8)
            int r0 = m(r0, r12, r10, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x009a
            goto L_0x0083
        L_0x009a:
            java.lang.Object r4 = r11.f7175c
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C0413c0.d(r1, r4)
            goto L_0x0085
        L_0x00a1:
            if (r7 != r1) goto L_0x004b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00ad
            int r0 = com.google.android.gms.internal.clearcut.C0465u.i(r12, r10, r11)
            goto L_0x0083
        L_0x00ad:
            int r0 = com.google.android.gms.internal.clearcut.C0465u.j(r12, r10, r11)
            goto L_0x0083
        L_0x00b2:
            if (r7 != 0) goto L_0x004b
            int r0 = com.google.android.gms.internal.clearcut.C0465u.g(r12, r10, r11)
            long r4 = r11.f7174b
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r6 = 0
        L_0x00c2:
            com.google.android.gms.internal.clearcut.C0423f1.j(r14, r2, r6)
            goto L_0x0012
        L_0x00c7:
            if (r7 != r0) goto L_0x004b
            int r0 = com.google.android.gms.internal.clearcut.C0465u.h(r12, r10)
            r9.putInt(r14, r2, r0)
        L_0x00d0:
            int r0 = r10 + 4
            goto L_0x0012
        L_0x00d4:
            if (r7 != r6) goto L_0x004b
            long r4 = com.google.android.gms.internal.clearcut.C0465u.k(r12, r10)
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
        L_0x00e0:
            int r0 = r10 + 8
            goto L_0x0012
        L_0x00e4:
            if (r7 != 0) goto L_0x004b
            goto L_0x0076
        L_0x00e7:
            if (r7 != 0) goto L_0x004b
            int r6 = com.google.android.gms.internal.clearcut.C0465u.g(r12, r10, r11)
            long r4 = r11.f7174b
            goto L_0x005c
        L_0x00f1:
            if (r7 != r0) goto L_0x004b
            float r0 = com.google.android.gms.internal.clearcut.C0465u.n(r12, r10)
            com.google.android.gms.internal.clearcut.C0423f1.f(r14, r2, r0)
            goto L_0x00d0
        L_0x00fb:
            if (r7 != r6) goto L_0x004b
            double r0 = com.google.android.gms.internal.clearcut.C0465u.l(r12, r10)
            com.google.android.gms.internal.clearcut.C0423f1.e(r14, r2, r0)
            goto L_0x00e0
        L_0x0105:
            r0 = 27
            if (r4 != r0) goto L_0x013d
            if (r7 != r1) goto L_0x004b
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.android.gms.internal.clearcut.f0 r0 = (com.google.android.gms.internal.clearcut.C0422f0) r0
            boolean r1 = r0.j()
            if (r1 != 0) goto L_0x0129
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0120
            r1 = 10
            goto L_0x0122
        L_0x0120:
            int r1 = r1 << 1
        L_0x0122:
            com.google.android.gms.internal.clearcut.f0 r0 = r0.h(r1)
            r9.putObject(r14, r2, r0)
        L_0x0129:
            r5 = r0
            com.google.android.gms.internal.clearcut.R0 r0 = r15.C(r8)
            r1 = r16
            r2 = r24
            r3 = r10
            r4 = r26
            r6 = r27
            int r0 = k(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0012
        L_0x013d:
            r0 = 49
            if (r4 > r0) goto L_0x0175
            long r0 = (long) r5
            r17 = r0
            r0 = r22
            r1 = r23
            r19 = r2
            r2 = r24
            r3 = r10
            r5 = r4
            r4 = r26
            r25 = r5
            r5 = r16
            r21 = r9
            r15 = r10
            r9 = r17
            r11 = r25
            r12 = r19
            r14 = r27
            int r0 = r0.p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0167
        L_0x0165:
            r2 = r0
            goto L_0x01b3
        L_0x0167:
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            r9 = r21
            goto L_0x0012
        L_0x0175:
            r19 = r2
            r25 = r4
            r21 = r9
            r15 = r10
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0199
            if (r7 != r1) goto L_0x01b2
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r5 = r8
            r7 = r19
            r9 = r27
            int r0 = r0.q(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 != r15) goto L_0x0167
            goto L_0x0165
        L_0x0199:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r10 = r5
            r5 = r16
            r12 = r8
            r8 = r10
            r10 = r19
            r13 = r27
            int r0 = r0.o(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0167
            goto L_0x0165
        L_0x01b2:
            r2 = r15
        L_0x01b3:
            r0 = r16
            r1 = r24
            r3 = r26
            r4 = r23
            r5 = r27
            int r0 = a(r0, r1, r2, r3, r4, r5)
            goto L_0x0167
        L_0x01c2:
            r4 = r13
            if (r0 != r4) goto L_0x01c6
            return
        L_0x01c6:
            com.google.android.gms.internal.clearcut.g0 r0 = com.google.android.gms.internal.clearcut.C0425g0.d()
            throw r0
        L_0x01cb:
            r4 = r13
            r5 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r27
            r0.r(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.F0.h(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.v):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d8, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e9, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01fa, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x020b, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x021d, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x022f, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0241, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0253, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0265, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0277, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.M(r3, (com.google.android.gms.internal.clearcut.B0) com.google.android.gms.internal.clearcut.C0423f1.M(r1, r4), C(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0365, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.C0477y) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03b5, code lost:
        r12 = r12 + 4;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.a0(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x041f, code lost:
        if (z(r1, r15, r4) != false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0421, code lost:
        r6 = com.google.android.gms.internal.clearcut.K.M(r15, (com.google.android.gms.internal.clearcut.B0) r2.getObject(r1, r10), C(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x042f, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0431, code lost:
        r9 = false;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0442, code lost:
        r6 = com.google.android.gms.internal.clearcut.K.a0(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0451, code lost:
        r6 = com.google.android.gms.internal.clearcut.K.l0(r15, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x045a, code lost:
        if (z(r1, r15, r4) != false) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x045c, code lost:
        r6 = com.google.android.gms.internal.clearcut.K.i0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0467, code lost:
        if (z(r1, r15, r4) != false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0469, code lost:
        r9 = com.google.android.gms.internal.clearcut.K.p0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x046e, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.l0(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x047a, code lost:
        r6 = com.google.android.gms.internal.clearcut.K.q0(r15, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0489, code lost:
        r6 = com.google.android.gms.internal.clearcut.K.h0(r15, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0492, code lost:
        if (z(r1, r15, r4) != false) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0494, code lost:
        r6 = r2.getObject(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0498, code lost:
        r6 = com.google.android.gms.internal.clearcut.K.K(r15, (com.google.android.gms.internal.clearcut.C0477y) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04a3, code lost:
        if (z(r1, r15, r4) != false) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04a5, code lost:
        r6 = com.google.android.gms.internal.clearcut.T0.n(r15, r2.getObject(r1, r10), C(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04bf, code lost:
        if ((r6 instanceof com.google.android.gms.internal.clearcut.C0477y) != false) goto L_0x0498;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04c2, code lost:
        r6 = com.google.android.gms.internal.clearcut.K.z(r15, (java.lang.String) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04ce, code lost:
        if (z(r1, r15, r4) != false) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04d0, code lost:
        r6 = com.google.android.gms.internal.clearcut.K.N(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.i0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0569, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x056b, code lost:
        r2.putInt(r1, (long) r9, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x056f, code lost:
        r9 = (com.google.android.gms.internal.clearcut.K.v0(r15) + com.google.android.gms.internal.clearcut.K.x0(r6)) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0589, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x059a, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.p0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05ab, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x05bc, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05cd, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05de, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05ef, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0601, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0613, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0625, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0637, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0649, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.q0(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x065b, code lost:
        if (r0.f6779j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x066a, code lost:
        r5 = r5 + r6;
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0715, code lost:
        if ((r12 & r18) != 0) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x072f, code lost:
        if ((r12 & r18) != 0) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0735, code lost:
        if ((r12 & r18) != 0) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x074f, code lost:
        if ((r12 & r18) != 0) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0755, code lost:
        if ((r12 & r18) != 0) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.h0(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0763, code lost:
        if ((r6 instanceof com.google.android.gms.internal.clearcut.C0477y) != false) goto L_0x0498;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0769, code lost:
        if ((r12 & r18) != 0) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0784, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
        r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x07d6, code lost:
        r4 = r4 + 4;
        r11 = r6;
        r6 = r9;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.K(r3, (com.google.android.gms.internal.clearcut.C0477y) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        r3 = com.google.android.gms.internal.clearcut.T0.n(r3, com.google.android.gms.internal.clearcut.C0423f1.M(r1, r4), C(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.C0477y) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e3, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.z(r3, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f1, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.N(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.n0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0109, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.e0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0119, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.d0(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0129, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.X(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0139, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.T(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0145, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.x(r3, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0151, code lost:
        r3 = com.google.android.gms.internal.clearcut.K.w(r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0185, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0187, code lost:
        r2.putInt(r1, (long) r14, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018b, code lost:
        r3 = (com.google.android.gms.internal.clearcut.K.v0(r3) + com.google.android.gms.internal.clearcut.K.x0(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a5, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b6, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c7, code lost:
        if (r0.f6779j != false) goto L_0x0187;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f6778i
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x03c3
            sun.misc.Unsafe r2 = f6769s
            r12 = r11
            r13 = r12
        L_0x0016:
            int[] r14 = r0.f6770a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x03bb
            int r14 = r0.F(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f6770a
            r3 = r3[r12]
            r14 = r14 & r8
            long r4 = (long) r14
            com.google.android.gms.internal.clearcut.W r14 = com.google.android.gms.internal.clearcut.W.DOUBLE_LIST_PACKED
            int r14 = r14.b()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.clearcut.W r14 = com.google.android.gms.internal.clearcut.W.SINT64_LIST_PACKED
            int r14 = r14.b()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f6770a
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = r11
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x03ad;
                case 1: goto L_0x03a5;
                case 2: goto L_0x0399;
                case 3: goto L_0x038d;
                case 4: goto L_0x0381;
                case 5: goto L_0x0379;
                case 6: goto L_0x0371;
                case 7: goto L_0x0369;
                case 8: goto L_0x0359;
                case 9: goto L_0x0351;
                case 10: goto L_0x0349;
                case 11: goto L_0x033d;
                case 12: goto L_0x0331;
                case 13: goto L_0x0329;
                case 14: goto L_0x0321;
                case 15: goto L_0x0315;
                case 16: goto L_0x0309;
                case 17: goto L_0x0301;
                case 18: goto L_0x028f;
                case 19: goto L_0x0299;
                case 20: goto L_0x02f7;
                case 21: goto L_0x02ed;
                case 22: goto L_0x02e3;
                case 23: goto L_0x028f;
                case 24: goto L_0x0299;
                case 25: goto L_0x02d9;
                case 26: goto L_0x02cf;
                case 27: goto L_0x02c1;
                case 28: goto L_0x02b7;
                case 29: goto L_0x02ad;
                case 30: goto L_0x02a3;
                case 31: goto L_0x0299;
                case 32: goto L_0x028f;
                case 33: goto L_0x0285;
                case 34: goto L_0x027b;
                case 35: goto L_0x0269;
                case 36: goto L_0x0257;
                case 37: goto L_0x0245;
                case 38: goto L_0x0233;
                case 39: goto L_0x0221;
                case 40: goto L_0x020f;
                case 41: goto L_0x01fd;
                case 42: goto L_0x01ec;
                case 43: goto L_0x01db;
                case 44: goto L_0x01ca;
                case 45: goto L_0x01b9;
                case 46: goto L_0x01a8;
                case 47: goto L_0x0197;
                case 48: goto L_0x0177;
                case 49: goto L_0x0169;
                case 50: goto L_0x0159;
                case 51: goto L_0x014b;
                case 52: goto L_0x013f;
                case 53: goto L_0x012f;
                case 54: goto L_0x011f;
                case 55: goto L_0x010f;
                case 56: goto L_0x0103;
                case 57: goto L_0x00f7;
                case 58: goto L_0x00eb;
                case 59: goto L_0x00d4;
                case 60: goto L_0x00c1;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a1;
                case 63: goto L_0x0092;
                case 64: goto L_0x0087;
                case 65: goto L_0x007c;
                case 66: goto L_0x006d;
                case 67: goto L_0x005e;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x03b5
        L_0x0047:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
        L_0x004d:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r1, r4)
            com.google.android.gms.internal.clearcut.B0 r4 = (com.google.android.gms.internal.clearcut.B0) r4
            com.google.android.gms.internal.clearcut.R0 r5 = r0.C(r12)
            int r3 = com.google.android.gms.internal.clearcut.K.M(r3, r4, r5)
        L_0x005b:
            int r13 = r13 + r3
            goto L_0x03b5
        L_0x005e:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            long r4 = R(r1, r4)
        L_0x0068:
            int r3 = com.google.android.gms.internal.clearcut.K.a0(r3, r4)
            goto L_0x005b
        L_0x006d:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = Q(r1, r4)
        L_0x0077:
            int r3 = com.google.android.gms.internal.clearcut.K.l0(r3, r4)
            goto L_0x005b
        L_0x007c:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x0082:
            int r3 = com.google.android.gms.internal.clearcut.K.i0(r3, r9)
            goto L_0x005b
        L_0x0087:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x008d:
            int r3 = com.google.android.gms.internal.clearcut.K.p0(r3, r11)
            goto L_0x005b
        L_0x0092:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = Q(r1, r4)
        L_0x009c:
            int r3 = com.google.android.gms.internal.clearcut.K.q0(r3, r4)
            goto L_0x005b
        L_0x00a1:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = Q(r1, r4)
        L_0x00ab:
            int r3 = com.google.android.gms.internal.clearcut.K.h0(r3, r4)
            goto L_0x005b
        L_0x00b0:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
        L_0x00b6:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r1, r4)
        L_0x00ba:
            com.google.android.gms.internal.clearcut.y r4 = (com.google.android.gms.internal.clearcut.C0477y) r4
            int r3 = com.google.android.gms.internal.clearcut.K.K(r3, r4)
            goto L_0x005b
        L_0x00c1:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
        L_0x00c7:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r1, r4)
            com.google.android.gms.internal.clearcut.R0 r5 = r0.C(r12)
            int r3 = com.google.android.gms.internal.clearcut.T0.n(r3, r4, r5)
            goto L_0x005b
        L_0x00d4:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r1, r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.clearcut.C0477y
            if (r5 == 0) goto L_0x00e3
        L_0x00e2:
            goto L_0x00ba
        L_0x00e3:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.google.android.gms.internal.clearcut.K.z(r3, r4)
            goto L_0x005b
        L_0x00eb:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x00f1:
            int r3 = com.google.android.gms.internal.clearcut.K.N(r3, r7)
            goto L_0x005b
        L_0x00f7:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x00fd:
            int r3 = com.google.android.gms.internal.clearcut.K.n0(r3, r11)
            goto L_0x005b
        L_0x0103:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x0109:
            int r3 = com.google.android.gms.internal.clearcut.K.e0(r3, r9)
            goto L_0x005b
        L_0x010f:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = Q(r1, r4)
        L_0x0119:
            int r3 = com.google.android.gms.internal.clearcut.K.d0(r3, r4)
            goto L_0x005b
        L_0x011f:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            long r4 = R(r1, r4)
        L_0x0129:
            int r3 = com.google.android.gms.internal.clearcut.K.X(r3, r4)
            goto L_0x005b
        L_0x012f:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            long r4 = R(r1, r4)
        L_0x0139:
            int r3 = com.google.android.gms.internal.clearcut.K.T(r3, r4)
            goto L_0x005b
        L_0x013f:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x0145:
            int r3 = com.google.android.gms.internal.clearcut.K.x(r3, r6)
            goto L_0x005b
        L_0x014b:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x0151:
            r4 = 0
            int r3 = com.google.android.gms.internal.clearcut.K.w(r3, r4)
            goto L_0x005b
        L_0x0159:
            com.google.android.gms.internal.clearcut.w0 r14 = r0.f6787r
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r1, r4)
            java.lang.Object r5 = r0.D(r12)
            int r3 = r14.h(r3, r4, r5)
            goto L_0x005b
        L_0x0169:
            java.util.List r4 = N(r1, r4)
            com.google.android.gms.internal.clearcut.R0 r5 = r0.C(r12)
            int r3 = com.google.android.gms.internal.clearcut.T0.u(r3, r4, r5)
            goto L_0x005b
        L_0x0177:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.q(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
        L_0x0187:
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x018b:
            int r3 = com.google.android.gms.internal.clearcut.K.v0(r3)
            int r5 = com.google.android.gms.internal.clearcut.K.x0(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            goto L_0x005b
        L_0x0197:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.J(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x01a8:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.N(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x01b9:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.L(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x01ca:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.v(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x01db:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.G(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x01ec:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.P(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x01fd:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.L(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x020f:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.N(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x0221:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.E(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x0233:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.j(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x0245:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.a(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x0257:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.L(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x0269:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.T0.N(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f6779j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x027b:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.T0.X(r3, r4, r11)
            goto L_0x005b
        L_0x0285:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.T0.b0(r3, r4, r11)
            goto L_0x005b
        L_0x028f:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.T0.d0(r3, r4, r11)
            goto L_0x005b
        L_0x0299:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.T0.c0(r3, r4, r11)
            goto L_0x005b
        L_0x02a3:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.T0.Y(r3, r4, r11)
            goto L_0x005b
        L_0x02ad:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.T0.a0(r3, r4, r11)
            goto L_0x005b
        L_0x02b7:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.T0.t(r3, r4)
            goto L_0x005b
        L_0x02c1:
            java.util.List r4 = N(r1, r4)
            com.google.android.gms.internal.clearcut.R0 r5 = r0.C(r12)
            int r3 = com.google.android.gms.internal.clearcut.T0.p(r3, r4, r5)
            goto L_0x005b
        L_0x02cf:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.T0.o(r3, r4)
            goto L_0x005b
        L_0x02d9:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.T0.e0(r3, r4, r11)
            goto L_0x005b
        L_0x02e3:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.T0.Z(r3, r4, r11)
            goto L_0x005b
        L_0x02ed:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.T0.W(r3, r4, r11)
            goto L_0x005b
        L_0x02f7:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.T0.V(r3, r4, r11)
            goto L_0x005b
        L_0x0301:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            goto L_0x004d
        L_0x0309:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            long r4 = com.google.android.gms.internal.clearcut.C0423f1.I(r1, r4)
            goto L_0x0068
        L_0x0315:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = com.google.android.gms.internal.clearcut.C0423f1.H(r1, r4)
            goto L_0x0077
        L_0x0321:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x0082
        L_0x0329:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x008d
        L_0x0331:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = com.google.android.gms.internal.clearcut.C0423f1.H(r1, r4)
            goto L_0x009c
        L_0x033d:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = com.google.android.gms.internal.clearcut.C0423f1.H(r1, r4)
            goto L_0x00ab
        L_0x0349:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            goto L_0x00b6
        L_0x0351:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            goto L_0x00c7
        L_0x0359:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C0423f1.M(r1, r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.clearcut.C0477y
            if (r5 == 0) goto L_0x00e3
            goto L_0x00e2
        L_0x0369:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x00f1
        L_0x0371:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x00fd
        L_0x0379:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x0109
        L_0x0381:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = com.google.android.gms.internal.clearcut.C0423f1.H(r1, r4)
            goto L_0x0119
        L_0x038d:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            long r4 = com.google.android.gms.internal.clearcut.C0423f1.I(r1, r4)
            goto L_0x0129
        L_0x0399:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            long r4 = com.google.android.gms.internal.clearcut.C0423f1.I(r1, r4)
            goto L_0x0139
        L_0x03a5:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x0145
        L_0x03ad:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x0151
        L_0x03b5:
            int r12 = r12 + 4
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x03bb:
            com.google.android.gms.internal.clearcut.Y0 r2 = r0.f6785p
            int r1 = n(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x03c3:
            sun.misc.Unsafe r2 = f6769s
            r3 = -1
            r4 = r11
            r5 = r4
            r12 = r5
        L_0x03c9:
            int[] r13 = r0.f6770a
            int r13 = r13.length
            if (r4 >= r13) goto L_0x07dd
            int r13 = r0.F(r4)
            int[] r14 = r0.f6770a
            r15 = r14[r4]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r6 = r17 >>> 20
            r11 = 17
            if (r6 > r11) goto L_0x03f4
            int r11 = r4 + 2
            r11 = r14[r11]
            r14 = r11 & r8
            int r18 = r11 >>> 20
            int r18 = r7 << r18
            if (r14 == r3) goto L_0x03f2
            long r9 = (long) r14
            int r12 = r2.getInt(r1, r9)
            r3 = r14
        L_0x03f2:
            r9 = r11
            goto L_0x0414
        L_0x03f4:
            boolean r9 = r0.f6779j
            if (r9 == 0) goto L_0x0412
            com.google.android.gms.internal.clearcut.W r9 = com.google.android.gms.internal.clearcut.W.DOUBLE_LIST_PACKED
            int r9 = r9.b()
            if (r6 < r9) goto L_0x0412
            com.google.android.gms.internal.clearcut.W r9 = com.google.android.gms.internal.clearcut.W.SINT64_LIST_PACKED
            int r9 = r9.b()
            if (r6 > r9) goto L_0x0412
            int[] r9 = r0.f6770a
            int r10 = r4 + 2
            r9 = r9[r10]
            r9 = r9 & r8
        L_0x040f:
            r18 = 0
            goto L_0x0414
        L_0x0412:
            r9 = 0
            goto L_0x040f
        L_0x0414:
            r10 = r13 & r8
            long r10 = (long) r10
            switch(r6) {
                case 0: goto L_0x07c7;
                case 1: goto L_0x07b9;
                case 2: goto L_0x07a9;
                case 3: goto L_0x0799;
                case 4: goto L_0x0789;
                case 5: goto L_0x0779;
                case 6: goto L_0x076d;
                case 7: goto L_0x0767;
                case 8: goto L_0x0759;
                case 9: goto L_0x0753;
                case 10: goto L_0x074d;
                case 11: goto L_0x0743;
                case 12: goto L_0x0739;
                case 13: goto L_0x0733;
                case 14: goto L_0x072d;
                case 15: goto L_0x0723;
                case 16: goto L_0x0719;
                case 17: goto L_0x0713;
                case 18: goto L_0x0706;
                case 19: goto L_0x0686;
                case 20: goto L_0x06f9;
                case 21: goto L_0x06ec;
                case 22: goto L_0x06df;
                case 23: goto L_0x067a;
                case 24: goto L_0x0686;
                case 25: goto L_0x06d3;
                case 26: goto L_0x06c7;
                case 27: goto L_0x06b7;
                case 28: goto L_0x06ab;
                case 29: goto L_0x069e;
                case 30: goto L_0x0692;
                case 31: goto L_0x0686;
                case 32: goto L_0x067a;
                case 33: goto L_0x066e;
                case 34: goto L_0x065f;
                case 35: goto L_0x064d;
                case 36: goto L_0x063b;
                case 37: goto L_0x0629;
                case 38: goto L_0x0617;
                case 39: goto L_0x0605;
                case 40: goto L_0x05f3;
                case 41: goto L_0x05e1;
                case 42: goto L_0x05d0;
                case 43: goto L_0x05bf;
                case 44: goto L_0x05ae;
                case 45: goto L_0x059d;
                case 46: goto L_0x058c;
                case 47: goto L_0x057b;
                case 48: goto L_0x055b;
                case 49: goto L_0x054b;
                case 50: goto L_0x053b;
                case 51: goto L_0x052d;
                case 52: goto L_0x0520;
                case 53: goto L_0x0510;
                case 54: goto L_0x0500;
                case 55: goto L_0x04f0;
                case 56: goto L_0x04e2;
                case 57: goto L_0x04d6;
                case 58: goto L_0x04ca;
                case 59: goto L_0x04b3;
                case 60: goto L_0x049f;
                case 61: goto L_0x048e;
                case 62: goto L_0x047f;
                case 63: goto L_0x0470;
                case 64: goto L_0x0463;
                case 65: goto L_0x0456;
                case 66: goto L_0x0447;
                case 67: goto L_0x0438;
                case 68: goto L_0x041b;
                default: goto L_0x041a;
            }
        L_0x041a:
            goto L_0x0430
        L_0x041b:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
        L_0x0421:
            java.lang.Object r6 = r2.getObject(r1, r10)
            com.google.android.gms.internal.clearcut.B0 r6 = (com.google.android.gms.internal.clearcut.B0) r6
            com.google.android.gms.internal.clearcut.R0 r9 = r0.C(r4)
            int r6 = com.google.android.gms.internal.clearcut.K.M(r15, r6, r9)
        L_0x042f:
            int r5 = r5 + r6
        L_0x0430:
            r6 = 0
        L_0x0431:
            r9 = 0
            r10 = 0
            r13 = 0
            goto L_0x07d6
        L_0x0438:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            long r9 = R(r1, r10)
        L_0x0442:
            int r6 = com.google.android.gms.internal.clearcut.K.a0(r15, r9)
            goto L_0x042f
        L_0x0447:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            int r6 = Q(r1, r10)
        L_0x0451:
            int r6 = com.google.android.gms.internal.clearcut.K.l0(r15, r6)
            goto L_0x042f
        L_0x0456:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
        L_0x045c:
            r9 = 0
            int r6 = com.google.android.gms.internal.clearcut.K.i0(r15, r9)
            goto L_0x042f
        L_0x0463:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
        L_0x0469:
            r6 = 0
            int r9 = com.google.android.gms.internal.clearcut.K.p0(r15, r6)
        L_0x046e:
            int r5 = r5 + r9
            goto L_0x0430
        L_0x0470:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            int r6 = Q(r1, r10)
        L_0x047a:
            int r6 = com.google.android.gms.internal.clearcut.K.q0(r15, r6)
            goto L_0x042f
        L_0x047f:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            int r6 = Q(r1, r10)
        L_0x0489:
            int r6 = com.google.android.gms.internal.clearcut.K.h0(r15, r6)
            goto L_0x042f
        L_0x048e:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
        L_0x0494:
            java.lang.Object r6 = r2.getObject(r1, r10)
        L_0x0498:
            com.google.android.gms.internal.clearcut.y r6 = (com.google.android.gms.internal.clearcut.C0477y) r6
            int r6 = com.google.android.gms.internal.clearcut.K.K(r15, r6)
            goto L_0x042f
        L_0x049f:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
        L_0x04a5:
            java.lang.Object r6 = r2.getObject(r1, r10)
            com.google.android.gms.internal.clearcut.R0 r9 = r0.C(r4)
            int r6 = com.google.android.gms.internal.clearcut.T0.n(r15, r6, r9)
            goto L_0x042f
        L_0x04b3:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            java.lang.Object r6 = r2.getObject(r1, r10)
            boolean r9 = r6 instanceof com.google.android.gms.internal.clearcut.C0477y
            if (r9 == 0) goto L_0x04c2
        L_0x04c1:
            goto L_0x0498
        L_0x04c2:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.android.gms.internal.clearcut.K.z(r15, r6)
            goto L_0x042f
        L_0x04ca:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
        L_0x04d0:
            int r6 = com.google.android.gms.internal.clearcut.K.N(r15, r7)
            goto L_0x042f
        L_0x04d6:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            r6 = 0
            int r9 = com.google.android.gms.internal.clearcut.K.n0(r15, r6)
            goto L_0x046e
        L_0x04e2:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            r9 = 0
            int r6 = com.google.android.gms.internal.clearcut.K.e0(r15, r9)
            goto L_0x042f
        L_0x04f0:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            int r6 = Q(r1, r10)
            int r6 = com.google.android.gms.internal.clearcut.K.d0(r15, r6)
            goto L_0x042f
        L_0x0500:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            long r9 = R(r1, r10)
            int r6 = com.google.android.gms.internal.clearcut.K.X(r15, r9)
            goto L_0x042f
        L_0x0510:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            long r9 = R(r1, r10)
            int r6 = com.google.android.gms.internal.clearcut.K.T(r15, r9)
            goto L_0x042f
        L_0x0520:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            r6 = 0
            int r9 = com.google.android.gms.internal.clearcut.K.x(r15, r6)
            goto L_0x046e
        L_0x052d:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            r9 = 0
            int r6 = com.google.android.gms.internal.clearcut.K.w(r15, r9)
            goto L_0x042f
        L_0x053b:
            com.google.android.gms.internal.clearcut.w0 r6 = r0.f6787r
            java.lang.Object r9 = r2.getObject(r1, r10)
            java.lang.Object r10 = r0.D(r4)
            int r6 = r6.h(r15, r9, r10)
            goto L_0x042f
        L_0x054b:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.clearcut.R0 r9 = r0.C(r4)
            int r6 = com.google.android.gms.internal.clearcut.T0.u(r15, r6, r9)
            goto L_0x042f
        L_0x055b:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.q(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
        L_0x056b:
            long r9 = (long) r9
            r2.putInt(r1, r9, r6)
        L_0x056f:
            int r9 = com.google.android.gms.internal.clearcut.K.v0(r15)
            int r10 = com.google.android.gms.internal.clearcut.K.x0(r6)
            int r9 = r9 + r10
            int r9 = r9 + r6
            goto L_0x046e
        L_0x057b:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.J(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x058c:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.N(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x059d:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.L(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x05ae:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.v(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x05bf:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.G(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x05d0:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.P(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x05e1:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.L(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x05f3:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.N(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x0605:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.E(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x0617:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.j(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x0629:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.a(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x063b:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.L(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x064d:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.N(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f6779j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x065f:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            r9 = 0
            int r6 = com.google.android.gms.internal.clearcut.T0.X(r15, r6, r9)
        L_0x066a:
            int r5 = r5 + r6
            r6 = r9
            goto L_0x0431
        L_0x066e:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.b0(r15, r6, r9)
            goto L_0x066a
        L_0x067a:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.d0(r15, r6, r9)
            goto L_0x066a
        L_0x0686:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.c0(r15, r6, r9)
            goto L_0x066a
        L_0x0692:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.Y(r15, r6, r9)
            goto L_0x066a
        L_0x069e:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.a0(r15, r6, r9)
            goto L_0x042f
        L_0x06ab:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.t(r15, r6)
            goto L_0x042f
        L_0x06b7:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.clearcut.R0 r9 = r0.C(r4)
            int r6 = com.google.android.gms.internal.clearcut.T0.p(r15, r6, r9)
            goto L_0x042f
        L_0x06c7:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.o(r15, r6)
            goto L_0x042f
        L_0x06d3:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            r9 = 0
            int r6 = com.google.android.gms.internal.clearcut.T0.e0(r15, r6, r9)
            goto L_0x066a
        L_0x06df:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.Z(r15, r6, r9)
            goto L_0x066a
        L_0x06ec:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.W(r15, r6, r9)
            goto L_0x066a
        L_0x06f9:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.V(r15, r6, r9)
            goto L_0x066a
        L_0x0706:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.T0.d0(r15, r6, r9)
            goto L_0x042f
        L_0x0713:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            goto L_0x0421
        L_0x0719:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            long r9 = r2.getLong(r1, r10)
            goto L_0x0442
        L_0x0723:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            int r6 = r2.getInt(r1, r10)
            goto L_0x0451
        L_0x072d:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            goto L_0x045c
        L_0x0733:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            goto L_0x0469
        L_0x0739:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            int r6 = r2.getInt(r1, r10)
            goto L_0x047a
        L_0x0743:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            int r6 = r2.getInt(r1, r10)
            goto L_0x0489
        L_0x074d:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            goto L_0x0494
        L_0x0753:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            goto L_0x04a5
        L_0x0759:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            java.lang.Object r6 = r2.getObject(r1, r10)
            boolean r9 = r6 instanceof com.google.android.gms.internal.clearcut.C0477y
            if (r9 == 0) goto L_0x04c2
            goto L_0x04c1
        L_0x0767:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            goto L_0x04d0
        L_0x076d:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            r6 = 0
            int r9 = com.google.android.gms.internal.clearcut.K.n0(r15, r6)
            int r5 = r5 + r9
            goto L_0x0431
        L_0x0779:
            r6 = 0
            r9 = r12 & r18
            r13 = 0
            if (r9 == 0) goto L_0x0785
            int r9 = com.google.android.gms.internal.clearcut.K.e0(r15, r13)
        L_0x0784:
            int r5 = r5 + r9
        L_0x0785:
            r9 = 0
        L_0x0786:
            r10 = 0
            goto L_0x07d6
        L_0x0789:
            r6 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0785
            int r9 = r2.getInt(r1, r10)
            int r9 = com.google.android.gms.internal.clearcut.K.d0(r15, r9)
            goto L_0x0784
        L_0x0799:
            r6 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0785
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.clearcut.K.X(r15, r9)
            goto L_0x0784
        L_0x07a9:
            r6 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0785
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.clearcut.K.T(r15, r9)
            goto L_0x0784
        L_0x07b9:
            r6 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0785
            r9 = 0
            int r10 = com.google.android.gms.internal.clearcut.K.x(r15, r9)
            int r5 = r5 + r10
            goto L_0x0786
        L_0x07c7:
            r6 = 0
            r9 = 0
            r13 = 0
            r10 = r12 & r18
            if (r10 == 0) goto L_0x0786
            r10 = 0
            int r15 = com.google.android.gms.internal.clearcut.K.w(r15, r10)
            int r5 = r5 + r15
        L_0x07d6:
            int r4 = r4 + 4
            r11 = r6
            r6 = r9
            r9 = r13
            goto L_0x03c9
        L_0x07dd:
            com.google.android.gms.internal.clearcut.Y0 r2 = r0.f6785p
            int r2 = n(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f6776g
            if (r2 == 0) goto L_0x07f3
            com.google.android.gms.internal.clearcut.P r2 = r0.f6786q
            com.google.android.gms.internal.clearcut.U r1 = r2.b(r1)
            int r1 = r1.g()
            int r5 = r5 + r1
        L_0x07f3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.F0.i(java.lang.Object):int");
    }

    public final boolean j(Object obj) {
        int i4;
        int i5;
        Object obj2 = obj;
        int[] iArr = this.f6780k;
        int i6 = 1;
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        int length = iArr.length;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = iArr[i8];
            int H4 = H(i10);
            int F4 = F(H4);
            if (!this.f6778i) {
                int i11 = this.f6770a[H4 + 2];
                int i12 = i11 & 1048575;
                i5 = i6 << (i11 >>> 20);
                if (i12 != i7) {
                    i4 = length;
                    i9 = f6769s.getInt(obj2, (long) i12);
                    i7 = i12;
                } else {
                    i4 = length;
                }
            } else {
                i4 = length;
                i5 = 0;
            }
            if ((268435456 & F4) != 0 && !A(obj2, H4, i9, i5)) {
                return false;
            }
            int i13 = (267386880 & F4) >>> 20;
            if (i13 != 9 && i13 != 17) {
                if (i13 != 27) {
                    if (i13 == 60 || i13 == 68) {
                        if (z(obj2, i10, H4) && !B(obj2, F4, C(H4))) {
                            return false;
                        }
                    } else if (i13 != 49) {
                        if (i13 == 50 && !this.f6787r.j(C0423f1.M(obj2, (long) (F4 & 1048575))).isEmpty()) {
                            this.f6787r.k(D(H4));
                            throw null;
                        }
                    }
                }
                List list = (List) C0423f1.M(obj2, (long) (F4 & 1048575));
                if (!list.isEmpty()) {
                    R0 C4 = C(H4);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (!C4.j(list.get(i14))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (A(obj2, H4, i9, i5) && !B(obj2, F4, C(H4))) {
                return false;
            }
            i8++;
            length = i4;
            i6 = 1;
        }
        return !this.f6776g || this.f6786q.b(obj2).d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b1, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bd, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0130, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0141, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int o(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.clearcut.C0468v r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f6769s
            int[] r7 = r0.f6770a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0167;
                case 52: goto L_0x015c;
                case 53: goto L_0x0152;
                case 54: goto L_0x0152;
                case 55: goto L_0x0148;
                case 56: goto L_0x0136;
                case 57: goto L_0x0126;
                case 58: goto L_0x0110;
                case 59: goto L_0x00e4;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00a5;
                case 62: goto L_0x0148;
                case 63: goto L_0x0078;
                case 64: goto L_0x0126;
                case 65: goto L_0x0136;
                case 66: goto L_0x0067;
                case 67: goto L_0x0056;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0173
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0173
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.clearcut.R0 r2 = r0.C(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = l(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f7175c
            if (r15 != 0) goto L_0x0051
            goto L_0x00b1
        L_0x0051:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C0413c0.d(r15, r3)
            goto L_0x00b1
        L_0x0056:
            if (r5 != 0) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C0465u.g(r3, r4, r11)
            long r3 = r11.f7174b
            long r3 = com.google.android.gms.internal.clearcut.H.a(r3)
        L_0x0062:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x00b1
        L_0x0067:
            if (r5 != 0) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r11)
            int r3 = r11.f7173a
            int r3 = com.google.android.gms.internal.clearcut.H.e(r3)
        L_0x0073:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00b1
        L_0x0078:
            if (r5 != 0) goto L_0x0173
            int r3 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r11)
            int r4 = r11.f7173a
            com.google.android.gms.internal.clearcut.e0 r5 = r0.E(r6)
            if (r5 == 0) goto L_0x009c
            com.google.android.gms.internal.clearcut.d0 r5 = r5.f(r4)
            if (r5 == 0) goto L_0x008d
            goto L_0x009c
        L_0x008d:
            com.google.android.gms.internal.clearcut.Z0 r1 = T(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.e(r2, r4)
            r2 = r3
            goto L_0x0174
        L_0x009c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x00bd
        L_0x00a5:
            if (r5 != r15) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r11)
            int r4 = r11.f7173a
            if (r4 != 0) goto L_0x00b5
            com.google.android.gms.internal.clearcut.y r3 = com.google.android.gms.internal.clearcut.C0477y.f7181f
        L_0x00b1:
            r12.putObject(r1, r9, r3)
            goto L_0x00bd
        L_0x00b5:
            com.google.android.gms.internal.clearcut.y r3 = com.google.android.gms.internal.clearcut.C0477y.z(r3, r2, r4)
            r12.putObject(r1, r9, r3)
        L_0x00bc:
            int r2 = r2 + r4
        L_0x00bd:
            r12.putInt(r1, r13, r8)
            goto L_0x0174
        L_0x00c2:
            if (r5 != r15) goto L_0x0173
            com.google.android.gms.internal.clearcut.R0 r2 = r0.C(r6)
            r5 = r20
            int r2 = m(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d9
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00da
        L_0x00d9:
            r15 = 0
        L_0x00da:
            java.lang.Object r3 = r11.f7175c
            if (r15 != 0) goto L_0x00df
        L_0x00de:
            goto L_0x00b1
        L_0x00df:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C0413c0.d(r15, r3)
            goto L_0x00de
        L_0x00e4:
            if (r5 != r15) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r11)
            int r4 = r11.f7173a
            if (r4 != 0) goto L_0x00f1
            java.lang.String r3 = ""
            goto L_0x00b1
        L_0x00f1:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0105
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.clearcut.C0429h1.i(r3, r2, r5)
            if (r5 == 0) goto L_0x0100
            goto L_0x0105
        L_0x0100:
            com.google.android.gms.internal.clearcut.g0 r1 = com.google.android.gms.internal.clearcut.C0425g0.e()
            throw r1
        L_0x0105:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.clearcut.C0413c0.f7045a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            goto L_0x00bc
        L_0x0110:
            if (r5 != 0) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C0465u.g(r3, r4, r11)
            long r3 = r11.f7174b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0120
            r15 = 1
            goto L_0x0121
        L_0x0120:
            r15 = 0
        L_0x0121:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x00b1
        L_0x0126:
            if (r5 != r7) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C0465u.h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0130:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x00bd
        L_0x0136:
            r2 = 1
            if (r5 != r2) goto L_0x0173
            long r2 = com.google.android.gms.internal.clearcut.C0465u.k(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x0141:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
            goto L_0x00bd
        L_0x0148:
            if (r5 != 0) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r11)
            int r3 = r11.f7173a
            goto L_0x0073
        L_0x0152:
            if (r5 != 0) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C0465u.g(r3, r4, r11)
            long r3 = r11.f7174b
            goto L_0x0062
        L_0x015c:
            if (r5 != r7) goto L_0x0173
            float r2 = com.google.android.gms.internal.clearcut.C0465u.n(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x0130
        L_0x0167:
            r2 = 1
            if (r5 != r2) goto L_0x0173
            double r2 = com.google.android.gms.internal.clearcut.C0465u.l(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            goto L_0x0141
        L_0x0173:
            r2 = r4
        L_0x0174:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.F0.o(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.clearcut.v):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011a, code lost:
        if (r4 == 0) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011c, code lost:
        r12.add(com.google.android.gms.internal.clearcut.C0477y.f7181f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0122, code lost:
        r12.add(com.google.android.gms.internal.clearcut.C0477y.z(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012a, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012c, code lost:
        r4 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0132, code lost:
        if (r2 != r7.f7173a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0134, code lost:
        r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7);
        r4 = r7.f7173a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013a, code lost:
        if (r4 != 0) goto L_0x0122;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int p(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.clearcut.C0468v r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f6769s
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.f0 r12 = (com.google.android.gms.internal.clearcut.C0422f0) r12
            boolean r13 = r12.j()
            r14 = 1
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 << r14
        L_0x002c:
            com.google.android.gms.internal.clearcut.f0 r12 = r12.h(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 2
            r11 = 0
            switch(r26) {
                case 18: goto L_0x02bc;
                case 19: goto L_0x0298;
                case 20: goto L_0x0272;
                case 21: goto L_0x0272;
                case 22: goto L_0x0258;
                case 23: goto L_0x0232;
                case 24: goto L_0x020c;
                case 25: goto L_0x01e4;
                case 26: goto L_0x0157;
                case 27: goto L_0x013d;
                case 28: goto L_0x0112;
                case 29: goto L_0x0258;
                case 30: goto L_0x00d9;
                case 31: goto L_0x020c;
                case 32: goto L_0x0232;
                case 33: goto L_0x00a9;
                case 34: goto L_0x0079;
                case 35: goto L_0x02bc;
                case 36: goto L_0x0298;
                case 37: goto L_0x0272;
                case 38: goto L_0x0272;
                case 39: goto L_0x0258;
                case 40: goto L_0x0232;
                case 41: goto L_0x020c;
                case 42: goto L_0x01e4;
                case 43: goto L_0x0258;
                case 44: goto L_0x00d9;
                case 45: goto L_0x020c;
                case 46: goto L_0x0232;
                case 47: goto L_0x00a9;
                case 48: goto L_0x0079;
                case 49: goto L_0x003b;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x02d8
        L_0x003b:
            r1 = 3
            if (r6 != r1) goto L_0x0076
            com.google.android.gms.internal.clearcut.R0 r1 = r15.C(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = l(r21, r22, r23, r24, r25, r26)
        L_0x0056:
            java.lang.Object r8 = r7.f7175c
            r12.add(r8)
            if (r4 >= r5) goto L_0x0076
            int r8 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r9 = r7.f7173a
            if (r2 != r9) goto L_0x0076
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = l(r21, r22, r23, r24, r25, r26)
            goto L_0x0056
        L_0x0076:
            r1 = r4
            goto L_0x02da
        L_0x0079:
            if (r6 != r10) goto L_0x0099
            android.support.v4.media.session.b.a(r12)
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r2 = r7.f7173a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x0090
            if (r1 != r2) goto L_0x008b
            goto L_0x02da
        L_0x008b:
            com.google.android.gms.internal.clearcut.g0 r1 = com.google.android.gms.internal.clearcut.C0425g0.a()
            throw r1
        L_0x0090:
            com.google.android.gms.internal.clearcut.C0465u.g(r3, r1, r7)
            long r1 = r7.f7174b
            com.google.android.gms.internal.clearcut.H.a(r1)
            throw r11
        L_0x0099:
            if (r6 == 0) goto L_0x009d
            goto L_0x02d8
        L_0x009d:
            android.support.v4.media.session.b.a(r12)
            com.google.android.gms.internal.clearcut.C0465u.g(r3, r4, r7)
            long r1 = r7.f7174b
            com.google.android.gms.internal.clearcut.H.a(r1)
            throw r11
        L_0x00a9:
            if (r6 != r10) goto L_0x00c9
            android.support.v4.media.session.b.a(r12)
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r2 = r7.f7173a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x00c0
            if (r1 != r2) goto L_0x00bb
            goto L_0x02da
        L_0x00bb:
            com.google.android.gms.internal.clearcut.g0 r1 = com.google.android.gms.internal.clearcut.C0425g0.a()
            throw r1
        L_0x00c0:
            com.google.android.gms.internal.clearcut.C0465u.e(r3, r1, r7)
            int r1 = r7.f7173a
            com.google.android.gms.internal.clearcut.H.e(r1)
            throw r11
        L_0x00c9:
            if (r6 == 0) goto L_0x00cd
            goto L_0x02d8
        L_0x00cd:
            android.support.v4.media.session.b.a(r12)
            com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r1 = r7.f7173a
            com.google.android.gms.internal.clearcut.H.e(r1)
            throw r11
        L_0x00d9:
            if (r6 != r10) goto L_0x00e0
            int r2 = com.google.android.gms.internal.clearcut.C0465u.f(r3, r4, r12, r7)
            goto L_0x00f1
        L_0x00e0:
            if (r6 != 0) goto L_0x0076
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.clearcut.C0465u.b(r2, r3, r4, r5, r6, r7)
        L_0x00f1:
            com.google.android.gms.internal.clearcut.a0 r1 = (com.google.android.gms.internal.clearcut.C0407a0) r1
            com.google.android.gms.internal.clearcut.Z0 r3 = r1.zzjp
            com.google.android.gms.internal.clearcut.Z0 r4 = com.google.android.gms.internal.clearcut.Z0.h()
            if (r3 != r4) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r11 = r3
        L_0x00fd:
            com.google.android.gms.internal.clearcut.e0 r3 = r15.E(r8)
            com.google.android.gms.internal.clearcut.Y0 r4 = r0.f6785p
            r5 = r21
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.T0.c(r5, r12, r3, r11, r4)
            com.google.android.gms.internal.clearcut.Z0 r3 = (com.google.android.gms.internal.clearcut.Z0) r3
            if (r3 == 0) goto L_0x010f
            r1.zzjp = r3
        L_0x010f:
            r1 = r2
            goto L_0x02da
        L_0x0112:
            if (r6 != r10) goto L_0x0076
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r4 = r7.f7173a
            if (r4 != 0) goto L_0x0122
        L_0x011c:
            com.google.android.gms.internal.clearcut.y r4 = com.google.android.gms.internal.clearcut.C0477y.f7181f
            r12.add(r4)
            goto L_0x012a
        L_0x0122:
            com.google.android.gms.internal.clearcut.y r6 = com.google.android.gms.internal.clearcut.C0477y.z(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x012a:
            if (r1 >= r5) goto L_0x02da
            int r4 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r1, r7)
            int r6 = r7.f7173a
            if (r2 != r6) goto L_0x02da
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r4 = r7.f7173a
            if (r4 != 0) goto L_0x0122
            goto L_0x011c
        L_0x013d:
            if (r6 != r10) goto L_0x0076
            com.google.android.gms.internal.clearcut.R0 r1 = r15.C(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = k(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x02da
        L_0x0157:
            if (r6 != r10) goto L_0x0076
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            r10 = 0
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0198
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r4 = r7.f7173a
            if (r4 != 0) goto L_0x0172
        L_0x016e:
            r12.add(r6)
            goto L_0x017d
        L_0x0172:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.clearcut.C0413c0.f7045a
            r8.<init>(r3, r1, r4, r9)
        L_0x0179:
            r12.add(r8)
            int r1 = r1 + r4
        L_0x017d:
            if (r1 >= r5) goto L_0x02da
            int r4 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r1, r7)
            int r8 = r7.f7173a
            if (r2 != r8) goto L_0x02da
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r4 = r7.f7173a
            if (r4 != 0) goto L_0x0190
            goto L_0x016e
        L_0x0190:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.clearcut.C0413c0.f7045a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x0179
        L_0x0198:
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r4 = r7.f7173a
            if (r4 != 0) goto L_0x01a4
        L_0x01a0:
            r12.add(r6)
            goto L_0x01b7
        L_0x01a4:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.clearcut.C0429h1.i(r3, r1, r8)
            if (r9 == 0) goto L_0x01df
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.C0413c0.f7045a
            r9.<init>(r3, r1, r4, r10)
        L_0x01b3:
            r12.add(r9)
            r1 = r8
        L_0x01b7:
            if (r1 >= r5) goto L_0x02da
            int r4 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r1, r7)
            int r8 = r7.f7173a
            if (r2 != r8) goto L_0x02da
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r4 = r7.f7173a
            if (r4 != 0) goto L_0x01ca
            goto L_0x01a0
        L_0x01ca:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.clearcut.C0429h1.i(r3, r1, r8)
            if (r9 == 0) goto L_0x01da
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.C0413c0.f7045a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01b3
        L_0x01da:
            com.google.android.gms.internal.clearcut.g0 r1 = com.google.android.gms.internal.clearcut.C0425g0.e()
            throw r1
        L_0x01df:
            com.google.android.gms.internal.clearcut.g0 r1 = com.google.android.gms.internal.clearcut.C0425g0.e()
            throw r1
        L_0x01e4:
            if (r6 != r10) goto L_0x01ff
            android.support.v4.media.session.b.a(r12)
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r2 = r7.f7173a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x01fb
            if (r1 != r2) goto L_0x01f6
            goto L_0x02da
        L_0x01f6:
            com.google.android.gms.internal.clearcut.g0 r1 = com.google.android.gms.internal.clearcut.C0425g0.a()
            throw r1
        L_0x01fb:
            com.google.android.gms.internal.clearcut.C0465u.g(r3, r1, r7)
            throw r11
        L_0x01ff:
            if (r6 == 0) goto L_0x0203
            goto L_0x02d8
        L_0x0203:
            android.support.v4.media.session.b.a(r12)
            com.google.android.gms.internal.clearcut.C0465u.g(r3, r4, r7)
            long r1 = r7.f7174b
            throw r11
        L_0x020c:
            if (r6 != r10) goto L_0x0227
            android.support.v4.media.session.b.a(r12)
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r2 = r7.f7173a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x0223
            if (r1 != r2) goto L_0x021e
            goto L_0x02da
        L_0x021e:
            com.google.android.gms.internal.clearcut.g0 r1 = com.google.android.gms.internal.clearcut.C0425g0.a()
            throw r1
        L_0x0223:
            com.google.android.gms.internal.clearcut.C0465u.h(r3, r1)
            throw r11
        L_0x0227:
            if (r6 == r9) goto L_0x022b
            goto L_0x02d8
        L_0x022b:
            android.support.v4.media.session.b.a(r12)
            com.google.android.gms.internal.clearcut.C0465u.h(r17, r18)
            throw r11
        L_0x0232:
            if (r6 != r10) goto L_0x024d
            android.support.v4.media.session.b.a(r12)
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r2 = r7.f7173a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x0249
            if (r1 != r2) goto L_0x0244
            goto L_0x02da
        L_0x0244:
            com.google.android.gms.internal.clearcut.g0 r1 = com.google.android.gms.internal.clearcut.C0425g0.a()
            throw r1
        L_0x0249:
            com.google.android.gms.internal.clearcut.C0465u.k(r3, r1)
            throw r11
        L_0x024d:
            if (r6 == r14) goto L_0x0251
            goto L_0x02d8
        L_0x0251:
            android.support.v4.media.session.b.a(r12)
            com.google.android.gms.internal.clearcut.C0465u.k(r17, r18)
            throw r11
        L_0x0258:
            if (r6 != r10) goto L_0x0260
            int r1 = com.google.android.gms.internal.clearcut.C0465u.f(r3, r4, r12, r7)
            goto L_0x02da
        L_0x0260:
            if (r6 != 0) goto L_0x0076
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.clearcut.C0465u.b(r20, r21, r22, r23, r24, r25)
            goto L_0x02da
        L_0x0272:
            if (r6 != r10) goto L_0x028c
            android.support.v4.media.session.b.a(r12)
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r2 = r7.f7173a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x0288
            if (r1 != r2) goto L_0x0283
            goto L_0x02da
        L_0x0283:
            com.google.android.gms.internal.clearcut.g0 r1 = com.google.android.gms.internal.clearcut.C0425g0.a()
            throw r1
        L_0x0288:
            com.google.android.gms.internal.clearcut.C0465u.g(r3, r1, r7)
            throw r11
        L_0x028c:
            if (r6 == 0) goto L_0x028f
            goto L_0x02d8
        L_0x028f:
            android.support.v4.media.session.b.a(r12)
            com.google.android.gms.internal.clearcut.C0465u.g(r3, r4, r7)
            long r1 = r7.f7174b
            throw r11
        L_0x0298:
            if (r6 != r10) goto L_0x02b2
            android.support.v4.media.session.b.a(r12)
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r2 = r7.f7173a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x02ae
            if (r1 != r2) goto L_0x02a9
            goto L_0x02da
        L_0x02a9:
            com.google.android.gms.internal.clearcut.g0 r1 = com.google.android.gms.internal.clearcut.C0425g0.a()
            throw r1
        L_0x02ae:
            com.google.android.gms.internal.clearcut.C0465u.n(r3, r1)
            throw r11
        L_0x02b2:
            if (r6 == r9) goto L_0x02b5
            goto L_0x02d8
        L_0x02b5:
            android.support.v4.media.session.b.a(r12)
            com.google.android.gms.internal.clearcut.C0465u.n(r17, r18)
            throw r11
        L_0x02bc:
            if (r6 != r10) goto L_0x02d6
            android.support.v4.media.session.b.a(r12)
            int r1 = com.google.android.gms.internal.clearcut.C0465u.e(r3, r4, r7)
            int r2 = r7.f7173a
            int r2 = r2 + r1
            if (r1 < r2) goto L_0x02d2
            if (r1 != r2) goto L_0x02cd
            goto L_0x02da
        L_0x02cd:
            com.google.android.gms.internal.clearcut.g0 r1 = com.google.android.gms.internal.clearcut.C0425g0.a()
            throw r1
        L_0x02d2:
            com.google.android.gms.internal.clearcut.C0465u.l(r3, r1)
            throw r11
        L_0x02d6:
            if (r6 == r14) goto L_0x02db
        L_0x02d8:
            goto L_0x0076
        L_0x02da:
            return r1
        L_0x02db:
            android.support.v4.media.session.b.a(r12)
            com.google.android.gms.internal.clearcut.C0465u.l(r17, r18)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.F0.p(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.v):int");
    }

    public final int q(Object obj, byte[] bArr, int i4, int i5, int i6, int i7, long j4, C0468v vVar) {
        Unsafe unsafe = f6769s;
        Object D4 = D(i6);
        Object object = unsafe.getObject(obj, j4);
        if (this.f6787r.i(object)) {
            Object m4 = this.f6787r.m(D4);
            this.f6787r.f(m4, object);
            unsafe.putObject(obj, j4, m4);
            object = m4;
        }
        this.f6787r.k(D4);
        this.f6787r.l(object);
        int e4 = C0465u.e(bArr, i4, vVar);
        int i8 = vVar.f7173a;
        if (i8 < 0 || i8 > i5 - e4) {
            throw C0425g0.a();
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02f5, code lost:
        if (r0 == r15) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0302, code lost:
        r15 = r26;
        r14 = r27;
        r12 = r28;
        r1 = r29;
        r13 = r30;
        r11 = r31;
        r9 = r32;
        r7 = r19;
        r6 = r20;
        r10 = r25;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0346, code lost:
        if (r0 == r15) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0362, code lost:
        if (r0 == r15) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        r5 = r4;
        r29 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ae, code lost:
        r1 = r9;
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        r11 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        r12 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f4, code lost:
        r6 = r6 | r20;
        r13 = r30;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016b, code lost:
        r6 = r6 | r20;
        r7 = r29;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0170, code lost:
        r1 = r9;
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0172, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0177, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0199, code lost:
        r10.putObject(r14, r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f3, code lost:
        r6 = r6 | r20;
        r7 = r29;
        r13 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0263, code lost:
        r7 = r29;
        r8 = r31;
        r2 = r5;
        r25 = r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0376 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int r(java.lang.Object r27, byte[] r28, int r29, int r30, int r31, com.google.android.gms.internal.clearcut.C0468v r32) {
        /*
            r26 = this;
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            sun.misc.Unsafe r10 = f6769s
            r8 = -1
            r16 = 0
            r0 = r29
            r7 = r8
            r1 = r16
            r6 = r1
        L_0x0017:
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 >= r13) goto L_0x0398
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.clearcut.C0465u.d(r0, r12, r1, r9)
            int r1 = r9.f7173a
            r4 = r0
            r5 = r1
            goto L_0x002d
        L_0x002b:
            r5 = r0
            r4 = r1
        L_0x002d:
            int r3 = r5 >>> 3
            r2 = r5 & 7
            int r1 = r15.H(r3)
            if (r1 == r8) goto L_0x0365
            int[] r0 = r15.f6770a
            int r18 = r1 + 1
            r8 = r0[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r8 & r18
            int r11 = r18 >>> 20
            r29 = r5
            r5 = r8 & r17
            long r12 = (long) r5
            r5 = 17
            r18 = r8
            if (r11 > r5) goto L_0x026c
            int r5 = r1 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r8 = 1
            int r20 = r8 << r5
            r0 = r0 & r17
            r5 = -1
            if (r0 == r7) goto L_0x0068
            if (r7 == r5) goto L_0x0062
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x0062:
            long r6 = (long) r0
            int r6 = r10.getInt(r14, r6)
            r7 = r0
        L_0x0068:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x024c;
                case 1: goto L_0x0236;
                case 2: goto L_0x0211;
                case 3: goto L_0x0211;
                case 4: goto L_0x01fb;
                case 5: goto L_0x01d5;
                case 6: goto L_0x01be;
                case 7: goto L_0x019d;
                case 8: goto L_0x017a;
                case 9: goto L_0x0143;
                case 10: goto L_0x012e;
                case 11: goto L_0x01fb;
                case 12: goto L_0x00fa;
                case 13: goto L_0x01be;
                case 14: goto L_0x01d5;
                case 15: goto L_0x00dd;
                case 16: goto L_0x00bb;
                case 17: goto L_0x0077;
                default: goto L_0x006c;
            }
        L_0x006c:
            r12 = r28
            r9 = r29
            r11 = r32
        L_0x0072:
            r5 = r4
            r29 = r7
            goto L_0x0263
        L_0x0077:
            r0 = 3
            if (r2 != r0) goto L_0x00b4
            int r0 = r3 << 3
            r8 = r0 | 4
            com.google.android.gms.internal.clearcut.R0 r0 = r15.C(r1)
            r1 = r28
            r2 = r4
            r3 = r30
            r4 = r8
            r9 = r29
            r8 = r5
            r5 = r32
            int r0 = l(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r20
            r11 = r32
            if (r1 != 0) goto L_0x009d
            java.lang.Object r1 = r11.f7175c
        L_0x0099:
            r10.putObject(r14, r12, r1)
            goto L_0x00a8
        L_0x009d:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r11.f7175c
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C0413c0.d(r1, r2)
            goto L_0x0099
        L_0x00a8:
            r6 = r6 | r20
            r12 = r28
        L_0x00ac:
            r13 = r30
        L_0x00ae:
            r1 = r9
            r9 = r11
        L_0x00b0:
            r11 = r31
            goto L_0x0017
        L_0x00b4:
            r9 = r29
            r11 = r32
        L_0x00b8:
            r12 = r28
            goto L_0x0072
        L_0x00bb:
            r9 = r29
            r11 = r32
            r8 = r5
            if (r2 != 0) goto L_0x00b8
            r2 = r12
            r12 = r28
            int r13 = com.google.android.gms.internal.clearcut.C0465u.g(r12, r4, r11)
            long r0 = r11.f7174b
            long r4 = com.google.android.gms.internal.clearcut.H.a(r0)
            r0 = r10
            r1 = r27
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            r1 = r9
            r9 = r11
            r0 = r13
            r13 = r30
            goto L_0x00b0
        L_0x00dd:
            r9 = r29
            r11 = r32
            r8 = r5
            r0 = r12
            r12 = r28
            if (r2 != 0) goto L_0x0072
            int r2 = com.google.android.gms.internal.clearcut.C0465u.e(r12, r4, r11)
            int r3 = r11.f7173a
            int r3 = com.google.android.gms.internal.clearcut.H.e(r3)
            r10.putInt(r14, r0, r3)
        L_0x00f4:
            r6 = r6 | r20
            r13 = r30
            r0 = r2
            goto L_0x00ae
        L_0x00fa:
            r9 = r29
            r11 = r32
            r8 = r5
            r21 = r12
            r12 = r28
            if (r2 != 0) goto L_0x0072
            int r0 = com.google.android.gms.internal.clearcut.C0465u.e(r12, r4, r11)
            int r2 = r11.f7173a
            com.google.android.gms.internal.clearcut.e0 r1 = r15.E(r1)
            if (r1 == 0) goto L_0x0117
            com.google.android.gms.internal.clearcut.d0 r1 = r1.f(r2)
            if (r1 == 0) goto L_0x011a
        L_0x0117:
            r3 = r21
            goto L_0x0127
        L_0x011a:
            com.google.android.gms.internal.clearcut.Z0 r1 = T(r27)
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.e(r9, r2)
            goto L_0x00ac
        L_0x0127:
            r10.putInt(r14, r3, r2)
            r6 = r6 | r20
            goto L_0x00ac
        L_0x012e:
            r9 = r29
            r11 = r32
            r8 = r5
            r0 = r12
            r3 = 2
            r12 = r28
            if (r2 != r3) goto L_0x0072
            int r2 = com.google.android.gms.internal.clearcut.C0465u.m(r12, r4, r11)
            java.lang.Object r3 = r11.f7175c
            r10.putObject(r14, r0, r3)
            goto L_0x00f4
        L_0x0143:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r3 = 2
            r12 = r28
            if (r2 != r3) goto L_0x0175
            com.google.android.gms.internal.clearcut.R0 r0 = r15.C(r1)
            r5 = r30
            int r0 = m(r0, r12, r4, r5, r11)
            r1 = r6 & r20
            if (r1 != 0) goto L_0x0160
            java.lang.Object r1 = r11.f7175c
            goto L_0x0199
        L_0x0160:
            java.lang.Object r1 = r10.getObject(r14, r7)
            java.lang.Object r2 = r11.f7175c
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C0413c0.d(r1, r2)
            goto L_0x0199
        L_0x016b:
            r6 = r6 | r20
            r7 = r29
            r13 = r5
        L_0x0170:
            r1 = r9
            r9 = r11
        L_0x0172:
            r8 = -1
            goto L_0x00b0
        L_0x0175:
            r5 = r30
        L_0x0177:
            r5 = r4
            goto L_0x0263
        L_0x017a:
            r9 = r29
            r5 = r30
            r11 = r32
            r29 = r7
            r7 = r12
            r0 = 2
            r12 = r28
            if (r2 != r0) goto L_0x0177
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r18 & r0
            if (r0 != 0) goto L_0x0193
            int r0 = com.google.android.gms.internal.clearcut.C0465u.i(r12, r4, r11)
            goto L_0x0197
        L_0x0193:
            int r0 = com.google.android.gms.internal.clearcut.C0465u.j(r12, r4, r11)
        L_0x0197:
            java.lang.Object r1 = r11.f7175c
        L_0x0199:
            r10.putObject(r14, r7, r1)
            goto L_0x016b
        L_0x019d:
            r9 = r29
            r5 = r30
            r11 = r32
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != 0) goto L_0x0177
            int r0 = com.google.android.gms.internal.clearcut.C0465u.g(r12, r4, r11)
            long r1 = r11.f7174b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x01b8
            r1 = 1
            goto L_0x01ba
        L_0x01b8:
            r1 = r16
        L_0x01ba:
            com.google.android.gms.internal.clearcut.C0423f1.j(r14, r7, r1)
            goto L_0x016b
        L_0x01be:
            r9 = r29
            r5 = r30
            r11 = r32
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != r0) goto L_0x0177
            int r0 = com.google.android.gms.internal.clearcut.C0465u.h(r12, r4)
            r10.putInt(r14, r7, r0)
            int r0 = r4 + 4
            goto L_0x016b
        L_0x01d5:
            r9 = r29
            r5 = r30
            r11 = r32
            r29 = r7
            r7 = r12
            r0 = 1
            r12 = r28
            if (r2 != r0) goto L_0x0177
            long r17 = com.google.android.gms.internal.clearcut.C0465u.k(r12, r4)
            r0 = r10
            r1 = r27
            r2 = r7
            r7 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
        L_0x01f3:
            r6 = r6 | r20
            r7 = r29
            r13 = r30
            goto L_0x0170
        L_0x01fb:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != 0) goto L_0x0263
            int r0 = com.google.android.gms.internal.clearcut.C0465u.e(r12, r5, r11)
            int r1 = r11.f7173a
            r10.putInt(r14, r7, r1)
            goto L_0x01f3
        L_0x0211:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != 0) goto L_0x0263
            int r17 = com.google.android.gms.internal.clearcut.C0465u.g(r12, r5, r11)
            long r4 = r11.f7174b
            r0 = r10
            r1 = r27
            r2 = r7
            r0.putLong(r1, r2, r4)
            r6 = r6 | r20
            r7 = r29
            r13 = r30
            r1 = r9
            r9 = r11
            r0 = r17
            goto L_0x0172
        L_0x0236:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            if (r2 != r0) goto L_0x0263
            float r0 = com.google.android.gms.internal.clearcut.C0465u.n(r12, r5)
            com.google.android.gms.internal.clearcut.C0423f1.f(r14, r7, r0)
            int r0 = r5 + 4
            goto L_0x01f3
        L_0x024c:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r0 = 1
            r12 = r28
            if (r2 != r0) goto L_0x0263
            double r0 = com.google.android.gms.internal.clearcut.C0465u.l(r12, r5)
            com.google.android.gms.internal.clearcut.C0423f1.e(r14, r7, r0)
            int r0 = r5 + 8
            goto L_0x01f3
        L_0x0263:
            r7 = r29
            r8 = r31
            r2 = r5
            r25 = r10
            goto L_0x0374
        L_0x026c:
            r9 = r29
            r5 = r4
            r19 = r7
            r7 = r12
            r12 = r28
            r0 = 27
            if (r11 != r0) goto L_0x02c3
            r0 = 2
            if (r2 != r0) goto L_0x02ba
            java.lang.Object r0 = r10.getObject(r14, r7)
            com.google.android.gms.internal.clearcut.f0 r0 = (com.google.android.gms.internal.clearcut.C0422f0) r0
            boolean r2 = r0.j()
            if (r2 != 0) goto L_0x0299
            int r2 = r0.size()
            if (r2 != 0) goto L_0x0290
            r2 = 10
            goto L_0x0292
        L_0x0290:
            int r2 = r2 << 1
        L_0x0292:
            com.google.android.gms.internal.clearcut.f0 r0 = r0.h(r2)
            r10.putObject(r14, r7, r0)
        L_0x0299:
            r7 = r0
            com.google.android.gms.internal.clearcut.R0 r0 = r15.C(r1)
            r1 = r9
            r2 = r28
            r3 = r5
            r4 = r30
            r5 = r7
            r20 = r6
            r6 = r32
            int r0 = k(r0, r1, r2, r3, r4, r5, r6)
            r13 = r30
            r11 = r31
            r7 = r19
            r6 = r20
        L_0x02b5:
            r8 = -1
            r9 = r32
            goto L_0x0017
        L_0x02ba:
            r20 = r6
            r15 = r5
            r29 = r9
        L_0x02bf:
            r25 = r10
            goto L_0x036e
        L_0x02c3:
            r20 = r6
            r0 = 49
            if (r11 > r0) goto L_0x0319
            r6 = r18
            long r13 = (long) r6
            r0 = r26
            r18 = r1
            r1 = r27
            r6 = r2
            r2 = r28
            r21 = r3
            r3 = r5
            r4 = r30
            r15 = r5
            r5 = r9
            r22 = r6
            r6 = r21
            r23 = r7
            r7 = r22
            r8 = r18
            r29 = r9
            r25 = r10
            r9 = r13
            r14 = r31
            r12 = r23
            r14 = r32
            int r0 = r0.p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0302
        L_0x02f7:
            r9 = r29
            r8 = r31
            r2 = r0
        L_0x02fc:
            r7 = r19
            r6 = r20
            goto L_0x0374
        L_0x0302:
            r15 = r26
            r14 = r27
            r12 = r28
            r1 = r29
            r13 = r30
            r11 = r31
            r9 = r32
            r7 = r19
            r6 = r20
            r10 = r25
            r8 = -1
            goto L_0x0017
        L_0x0319:
            r22 = r2
            r21 = r3
            r15 = r5
            r23 = r7
            r29 = r9
            r25 = r10
            r6 = r18
            r18 = r1
            r0 = 50
            r7 = r22
            if (r11 != r0) goto L_0x0349
            r0 = 2
            if (r7 != r0) goto L_0x036e
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r18
            r6 = r21
            r7 = r23
            r9 = r32
            int r0 = r0.q(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 != r15) goto L_0x0302
            goto L_0x02f7
        L_0x0349:
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r29
            r8 = r6
            r6 = r21
            r9 = r11
            r10 = r23
            r12 = r18
            r13 = r32
            int r0 = r0.o(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0302
            goto L_0x02f7
        L_0x0365:
            r15 = r4
            r29 = r5
            r20 = r6
            r19 = r7
            goto L_0x02bf
        L_0x036e:
            r9 = r29
            r8 = r31
            r2 = r15
            goto L_0x02fc
        L_0x0374:
            if (r9 != r8) goto L_0x037d
            if (r8 != 0) goto L_0x0379
            goto L_0x037d
        L_0x0379:
            r0 = r7
            r1 = -1
            r7 = r2
            goto L_0x03a4
        L_0x037d:
            r0 = r9
            r1 = r28
            r3 = r30
            r4 = r27
            r5 = r32
            int r0 = a(r0, r1, r2, r3, r4, r5)
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r8
            r1 = r9
            r10 = r25
            goto L_0x02b5
        L_0x0398:
            r20 = r6
            r19 = r7
            r25 = r10
            r8 = r11
            r7 = r0
            r9 = r1
            r0 = r19
            r1 = -1
        L_0x03a4:
            if (r0 == r1) goto L_0x03b1
            long r0 = (long) r0
            r10 = r27
            r2 = r25
            r2.putInt(r10, r0, r6)
        L_0x03ae:
            r11 = r26
            goto L_0x03b4
        L_0x03b1:
            r10 = r27
            goto L_0x03ae
        L_0x03b4:
            int[] r12 = r11.f6781l
            if (r12 == 0) goto L_0x03f4
            int r13 = r12.length
            r0 = 0
            r5 = r0
            r14 = r16
        L_0x03bd:
            if (r14 >= r13) goto L_0x03ed
            r1 = r12[r14]
            com.google.android.gms.internal.clearcut.Y0 r6 = r11.f6785p
            int[] r0 = r11.f6770a
            r2 = r0[r1]
            int r0 = r11.F(r1)
            r0 = r0 & r17
            long r3 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.clearcut.C0423f1.M(r10, r3)
            if (r0 != 0) goto L_0x03d5
            goto L_0x03e8
        L_0x03d5:
            com.google.android.gms.internal.clearcut.e0 r4 = r11.E(r1)
            if (r4 != 0) goto L_0x03dc
            goto L_0x03e8
        L_0x03dc:
            com.google.android.gms.internal.clearcut.w0 r3 = r11.f6787r
            java.util.Map r3 = r3.l(r0)
            r0 = r26
            java.lang.Object r5 = r0.t(r1, r2, r3, r4, r5, r6)
        L_0x03e8:
            com.google.android.gms.internal.clearcut.Z0 r5 = (com.google.android.gms.internal.clearcut.Z0) r5
            int r14 = r14 + 1
            goto L_0x03bd
        L_0x03ed:
            if (r5 == 0) goto L_0x03f4
            com.google.android.gms.internal.clearcut.Y0 r0 = r11.f6785p
            r0.h(r10, r5)
        L_0x03f4:
            r0 = r30
            if (r8 != 0) goto L_0x0400
            if (r7 != r0) goto L_0x03fb
            goto L_0x0404
        L_0x03fb:
            com.google.android.gms.internal.clearcut.g0 r0 = com.google.android.gms.internal.clearcut.C0425g0.d()
            throw r0
        L_0x0400:
            if (r7 > r0) goto L_0x0405
            if (r9 != r8) goto L_0x0405
        L_0x0404:
            return r7
        L_0x0405:
            com.google.android.gms.internal.clearcut.g0 r0 = com.google.android.gms.internal.clearcut.C0425g0.d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.F0.r(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.clearcut.v):int");
    }

    public final Object t(int i4, int i5, Map map, C0419e0 e0Var, Object obj, Y0 y02) {
        this.f6787r.k(D(i4));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (e0Var.f(((Integer) entry.getValue()).intValue()) == null) {
                if (obj == null) {
                    obj = y02.f();
                }
                D C4 = C0477y.C(C0463t0.a((C0466u0) null, entry.getKey(), entry.getValue()));
                try {
                    C0463t0.b(C4.b(), (C0466u0) null, entry.getKey(), entry.getValue());
                    y02.b(obj, i5, C4.a());
                    it.remove();
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return obj;
    }

    public final void w(C0464t1 t1Var, int i4, Object obj, int i5) {
        if (obj != null) {
            this.f6787r.k(D(i5));
            t1Var.Q(i4, (C0466u0) null, this.f6787r.j(obj));
        }
    }

    public final void x(Object obj, Object obj2, int i4) {
        long F4 = (long) (F(i4) & 1048575);
        if (y(obj2, i4)) {
            Object M4 = C0423f1.M(obj, F4);
            Object M5 = C0423f1.M(obj2, F4);
            if (M4 != null && M5 != null) {
                C0423f1.i(obj, F4, C0413c0.d(M4, M5));
                I(obj, i4);
            } else if (M5 != null) {
                C0423f1.i(obj, F4, M5);
                I(obj, i4);
            }
        }
    }

    public final boolean y(Object obj, int i4) {
        if (this.f6778i) {
            int F4 = F(i4);
            long j4 = (long) (F4 & 1048575);
            switch ((F4 & 267386880) >>> 20) {
                case 0:
                    return C0423f1.L(obj, j4) != 0.0d;
                case 1:
                    return C0423f1.K(obj, j4) != 0.0f;
                case 2:
                    return C0423f1.I(obj, j4) != 0;
                case 3:
                    return C0423f1.I(obj, j4) != 0;
                case 4:
                    return C0423f1.H(obj, j4) != 0;
                case 5:
                    return C0423f1.I(obj, j4) != 0;
                case 6:
                    return C0423f1.H(obj, j4) != 0;
                case 7:
                    return C0423f1.J(obj, j4);
                case 8:
                    Object M4 = C0423f1.M(obj, j4);
                    if (M4 instanceof String) {
                        return !((String) M4).isEmpty();
                    }
                    if (M4 instanceof C0477y) {
                        return !C0477y.f7181f.equals(M4);
                    }
                    throw new IllegalArgumentException();
                case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                    return C0423f1.M(obj, j4) != null;
                case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                    return !C0477y.f7181f.equals(C0423f1.M(obj, j4));
                case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                    return C0423f1.H(obj, j4) != 0;
                case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                    return C0423f1.H(obj, j4) != 0;
                case 13:
                    return C0423f1.H(obj, j4) != 0;
                case 14:
                    return C0423f1.I(obj, j4) != 0;
                case 15:
                    return C0423f1.H(obj, j4) != 0;
                case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                    return C0423f1.I(obj, j4) != 0;
                case 17:
                    return C0423f1.M(obj, j4) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int G4 = G(i4);
            return (C0423f1.H(obj, (long) (G4 & 1048575)) & (1 << (G4 >>> 20))) != 0;
        }
    }

    public final boolean z(Object obj, int i4, int i5) {
        return C0423f1.H(obj, (long) (G(i5) & 1048575)) == i4;
    }
}
