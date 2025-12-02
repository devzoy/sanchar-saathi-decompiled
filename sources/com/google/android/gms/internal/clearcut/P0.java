package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.util.Arrays;

public final class P0 {

    /* renamed from: A  reason: collision with root package name */
    public int f6864A;

    /* renamed from: B  reason: collision with root package name */
    public int f6865B;

    /* renamed from: C  reason: collision with root package name */
    public Field f6866C;

    /* renamed from: D  reason: collision with root package name */
    public Object f6867D;

    /* renamed from: E  reason: collision with root package name */
    public Object f6868E;

    /* renamed from: F  reason: collision with root package name */
    public Object f6869F;

    /* renamed from: a  reason: collision with root package name */
    public final Q0 f6870a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f6871b;

    /* renamed from: c  reason: collision with root package name */
    public Class f6872c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6873d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6874e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6875f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6876g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6877h;

    /* renamed from: i  reason: collision with root package name */
    public final int f6878i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6879j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6880k;

    /* renamed from: l  reason: collision with root package name */
    public final int f6881l;

    /* renamed from: m  reason: collision with root package name */
    public final int f6882m;

    /* renamed from: n  reason: collision with root package name */
    public final int[] f6883n;

    /* renamed from: o  reason: collision with root package name */
    public int f6884o;

    /* renamed from: p  reason: collision with root package name */
    public int f6885p;

    /* renamed from: q  reason: collision with root package name */
    public int f6886q = Integer.MAX_VALUE;

    /* renamed from: r  reason: collision with root package name */
    public int f6887r = Integer.MIN_VALUE;

    /* renamed from: s  reason: collision with root package name */
    public int f6888s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f6889t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f6890u = 0;

    /* renamed from: v  reason: collision with root package name */
    public int f6891v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f6892w = 0;

    /* renamed from: x  reason: collision with root package name */
    public int f6893x;

    /* renamed from: y  reason: collision with root package name */
    public int f6894y;

    /* renamed from: z  reason: collision with root package name */
    public int f6895z;

    public P0(Class cls, String str, Object[] objArr) {
        this.f6872c = cls;
        Q0 q02 = new Q0(str);
        this.f6870a = q02;
        this.f6871b = objArr;
        this.f6873d = q02.b();
        int b4 = q02.b();
        this.f6874e = b4;
        int[] iArr = null;
        if (b4 == 0) {
            this.f6875f = 0;
            this.f6876g = 0;
            this.f6877h = 0;
            this.f6878i = 0;
            this.f6879j = 0;
            this.f6881l = 0;
            this.f6880k = 0;
            this.f6882m = 0;
            this.f6883n = null;
            return;
        }
        int b5 = q02.b();
        this.f6875f = b5;
        int b6 = q02.b();
        this.f6876g = b6;
        this.f6877h = q02.b();
        this.f6878i = q02.b();
        this.f6881l = q02.b();
        this.f6880k = q02.b();
        this.f6879j = q02.b();
        this.f6882m = q02.b();
        int b7 = q02.b();
        this.f6883n = b7 != 0 ? new int[b7] : iArr;
        this.f6884o = (b5 << 1) + b6;
    }

    public static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        if (i() != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014b, code lost:
        if ((r5.f6894y & 2048) != 0) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0153, code lost:
        if (i() != false) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r5 = this;
            com.google.android.gms.internal.clearcut.Q0 r0 = r5.f6870a
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            com.google.android.gms.internal.clearcut.Q0 r0 = r5.f6870a
            int r0 = r0.b()
            r5.f6893x = r0
            com.google.android.gms.internal.clearcut.Q0 r0 = r5.f6870a
            int r0 = r0.b()
            r5.f6894y = r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            r5.f6895z = r0
            int r1 = r5.f6893x
            int r2 = r5.f6886q
            if (r1 >= r2) goto L_0x0026
            r5.f6886q = r1
        L_0x0026:
            int r2 = r5.f6887r
            if (r1 <= r2) goto L_0x002c
            r5.f6887r = r1
        L_0x002c:
            com.google.android.gms.internal.clearcut.W r1 = com.google.android.gms.internal.clearcut.W.MAP
            int r2 = r1.b()
            r3 = 1
            if (r0 != r2) goto L_0x003b
            int r0 = r5.f6888s
            int r0 = r0 + r3
            r5.f6888s = r0
            goto L_0x0054
        L_0x003b:
            int r0 = r5.f6895z
            com.google.android.gms.internal.clearcut.W r2 = com.google.android.gms.internal.clearcut.W.DOUBLE_LIST
            int r2 = r2.b()
            if (r0 < r2) goto L_0x0054
            int r0 = r5.f6895z
            com.google.android.gms.internal.clearcut.W r2 = com.google.android.gms.internal.clearcut.W.GROUP_LIST
            int r2 = r2.b()
            if (r0 > r2) goto L_0x0054
            int r0 = r5.f6889t
            int r0 = r0 + r3
            r5.f6889t = r0
        L_0x0054:
            int r0 = r5.f6892w
            int r0 = r0 + r3
            r5.f6892w = r0
            int r2 = r5.f6886q
            int r4 = r5.f6893x
            boolean r0 = com.google.android.gms.internal.clearcut.T0.s(r2, r4, r0)
            if (r0 == 0) goto L_0x006e
            int r0 = r5.f6893x
            int r0 = r0 + r3
            r5.f6891v = r0
            int r2 = r5.f6886q
            int r0 = r0 - r2
        L_0x006b:
            r5.f6890u = r0
            goto L_0x0072
        L_0x006e:
            int r0 = r5.f6890u
            int r0 = r0 + r3
            goto L_0x006b
        L_0x0072:
            int r0 = r5.f6894y
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0084
            int[] r0 = r5.f6883n
            int r2 = r5.f6885p
            int r4 = r2 + 1
            r5.f6885p = r4
            int r4 = r5.f6893x
            r0[r2] = r4
        L_0x0084:
            r0 = 0
            r5.f6867D = r0
            r5.f6868E = r0
            r5.f6869F = r0
            boolean r0 = r5.k()
            if (r0 == 0) goto L_0x00d4
            com.google.android.gms.internal.clearcut.Q0 r0 = r5.f6870a
            int r0 = r0.b()
            r5.f6864A = r0
            int r0 = r5.f6895z
            com.google.android.gms.internal.clearcut.W r1 = com.google.android.gms.internal.clearcut.W.MESSAGE
            int r1 = r1.b()
            int r1 = r1 + 51
            if (r0 == r1) goto L_0x00cc
            int r0 = r5.f6895z
            com.google.android.gms.internal.clearcut.W r1 = com.google.android.gms.internal.clearcut.W.GROUP
            int r1 = r1.b()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x00b2
            goto L_0x00cc
        L_0x00b2:
            int r0 = r5.f6895z
            com.google.android.gms.internal.clearcut.W r1 = com.google.android.gms.internal.clearcut.W.ENUM
            int r1 = r1.b()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x015f
            boolean r0 = r5.i()
            if (r0 == 0) goto L_0x015f
        L_0x00c4:
            java.lang.Object r0 = r5.f()
            r5.f6868E = r0
            goto L_0x015f
        L_0x00cc:
            java.lang.Object r0 = r5.f()
        L_0x00d0:
            r5.f6867D = r0
            goto L_0x015f
        L_0x00d4:
            java.lang.Class r0 = r5.f6872c
            java.lang.Object r2 = r5.f()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r0 = c(r0, r2)
            r5.f6866C = r0
            boolean r0 = r5.o()
            if (r0 == 0) goto L_0x00f0
            com.google.android.gms.internal.clearcut.Q0 r0 = r5.f6870a
            int r0 = r0.b()
            r5.f6865B = r0
        L_0x00f0:
            int r0 = r5.f6895z
            com.google.android.gms.internal.clearcut.W r2 = com.google.android.gms.internal.clearcut.W.MESSAGE
            int r2 = r2.b()
            if (r0 == r2) goto L_0x0157
            int r0 = r5.f6895z
            com.google.android.gms.internal.clearcut.W r2 = com.google.android.gms.internal.clearcut.W.GROUP
            int r2 = r2.b()
            if (r0 != r2) goto L_0x0105
            goto L_0x0157
        L_0x0105:
            int r0 = r5.f6895z
            com.google.android.gms.internal.clearcut.W r2 = com.google.android.gms.internal.clearcut.W.MESSAGE_LIST
            int r2 = r2.b()
            if (r0 == r2) goto L_0x00cc
            int r0 = r5.f6895z
            com.google.android.gms.internal.clearcut.W r2 = com.google.android.gms.internal.clearcut.W.GROUP_LIST
            int r2 = r2.b()
            if (r0 != r2) goto L_0x011a
            goto L_0x00cc
        L_0x011a:
            int r0 = r5.f6895z
            com.google.android.gms.internal.clearcut.W r2 = com.google.android.gms.internal.clearcut.W.ENUM
            int r2 = r2.b()
            if (r0 == r2) goto L_0x014f
            int r0 = r5.f6895z
            com.google.android.gms.internal.clearcut.W r2 = com.google.android.gms.internal.clearcut.W.ENUM_LIST
            int r2 = r2.b()
            if (r0 == r2) goto L_0x014f
            int r0 = r5.f6895z
            com.google.android.gms.internal.clearcut.W r2 = com.google.android.gms.internal.clearcut.W.ENUM_LIST_PACKED
            int r2 = r2.b()
            if (r0 != r2) goto L_0x0139
            goto L_0x014f
        L_0x0139:
            int r0 = r5.f6895z
            int r1 = r1.b()
            if (r0 != r1) goto L_0x015f
            java.lang.Object r0 = r5.f()
            r5.f6869F = r0
            int r0 = r5.f6894y
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x015f
            goto L_0x00c4
        L_0x014f:
            boolean r0 = r5.i()
            if (r0 == 0) goto L_0x015f
            goto L_0x00c4
        L_0x0157:
            java.lang.reflect.Field r0 = r5.f6866C
            java.lang.Class r0 = r0.getType()
            goto L_0x00d0
        L_0x015f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.P0.a():boolean");
    }

    public final Object f() {
        Object[] objArr = this.f6871b;
        int i4 = this.f6884o;
        this.f6884o = i4 + 1;
        return objArr[i4];
    }

    public final int g() {
        return this.f6893x;
    }

    public final int h() {
        return this.f6895z;
    }

    public final boolean i() {
        return (this.f6873d & 1) == 1;
    }

    public final boolean k() {
        return this.f6895z > W.MAP.b();
    }

    public final Field l() {
        int i4 = this.f6864A << 1;
        Object obj = this.f6871b[i4];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c4 = c(this.f6872c, (String) obj);
        this.f6871b[i4] = c4;
        return c4;
    }

    public final Field m() {
        int i4 = (this.f6864A << 1) + 1;
        Object obj = this.f6871b[i4];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c4 = c(this.f6872c, (String) obj);
        this.f6871b[i4] = c4;
        return c4;
    }

    public final Field n() {
        return this.f6866C;
    }

    public final boolean o() {
        return i() && this.f6895z <= W.GROUP.b();
    }

    public final Field p() {
        int i4 = (this.f6875f << 1) + (this.f6865B / 32);
        Object obj = this.f6871b[i4];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c4 = c(this.f6872c, (String) obj);
        this.f6871b[i4] = c4;
        return c4;
    }

    public final int q() {
        return this.f6865B % 32;
    }

    public final boolean r() {
        return (this.f6894y & 256) != 0;
    }

    public final boolean s() {
        return (this.f6894y & 512) != 0;
    }

    public final Object t() {
        return this.f6867D;
    }

    public final Object u() {
        return this.f6868E;
    }

    public final Object v() {
        return this.f6869F;
    }
}
