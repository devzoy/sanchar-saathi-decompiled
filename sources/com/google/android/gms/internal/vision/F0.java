package com.google.android.gms.internal.vision;

import android.support.v4.media.session.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.sqlcipher.IBulkCursor;
import net.sqlcipher.database.SQLiteDatabase;

public final class F0 {

    /* renamed from: d  reason: collision with root package name */
    public static final F0 f7217d = new F0(true);

    /* renamed from: a  reason: collision with root package name */
    public final O1 f7218a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f7219b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7220c;

    public F0() {
        this.f7218a = O1.b(16);
    }

    public static int a(s2 s2Var, int i4, Object obj) {
        int c02 = C0551v0.c0(i4);
        if (s2Var == s2.GROUP) {
            R0.g((C0546t1) obj);
            c02 <<= 1;
        }
        return c02 + b(s2Var, obj);
    }

    public static int b(s2 s2Var, Object obj) {
        switch (E0.f7216b[s2Var.ordinal()]) {
            case 1:
                return C0551v0.x(((Double) obj).doubleValue());
            case 2:
                return C0551v0.y(((Float) obj).floatValue());
            case 3:
                return C0551v0.Z(((Long) obj).longValue());
            case 4:
                return C0551v0.e0(((Long) obj).longValue());
            case 5:
                return C0551v0.g0(((Integer) obj).intValue());
            case 6:
                return C0551v0.n0(((Long) obj).longValue());
            case 7:
                return C0551v0.s0(((Integer) obj).intValue());
            case 8:
                return C0551v0.H(((Boolean) obj).booleanValue());
            case IBulkCursor.WANTS_ON_MOVE_TRANSACTION /*9*/:
                return C0551v0.R((C0546t1) obj);
            case IBulkCursor.GET_EXTRAS_TRANSACTION /*10*/:
                return C0551v0.F((C0546t1) obj);
            case IBulkCursor.RESPOND_TRANSACTION /*11*/:
                return obj instanceof C0507g0 ? C0551v0.E((C0507g0) obj) : C0551v0.G((String) obj);
            case IBulkCursor.CLOSE_TRANSACTION /*12*/:
                return obj instanceof C0507g0 ? C0551v0.E((C0507g0) obj) : C0551v0.I((byte[]) obj);
            case 13:
                return C0551v0.k0(((Integer) obj).intValue());
            case 14:
                return C0551v0.v0(((Integer) obj).intValue());
            case 15:
                return C0551v0.r0(((Long) obj).longValue());
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                return C0551v0.o0(((Integer) obj).intValue());
            case 17:
                return C0551v0.j0(((Long) obj).longValue());
            case 18:
                return obj instanceof Q0 ? C0551v0.x0(((Q0) obj).a()) : C0551v0.x0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static boolean e(Map.Entry entry) {
        b.a(entry.getKey());
        throw null;
    }

    public static int h(H0 h02, Object obj) {
        s2 d4 = h02.d();
        int a4 = h02.a();
        if (!h02.e()) {
            return a(d4, a4, obj);
        }
        int i4 = 0;
        if (h02.c()) {
            for (Object b4 : (List) obj) {
                i4 += b(d4, b4);
            }
            return C0551v0.c0(a4) + i4 + C0551v0.z0(i4);
        }
        for (Object a5 : (List) obj) {
            i4 += a(d4, a4, a5);
        }
        return i4;
    }

    public static int i(Map.Entry entry) {
        b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        if ((r4 instanceof byte[]) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        if ((r4 instanceof com.google.android.gms.internal.vision.C0546t1) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if ((r4 instanceof com.google.android.gms.internal.vision.Q0) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void k(com.google.android.gms.internal.vision.H0 r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.vision.s2 r0 = r3.d()
            com.google.android.gms.internal.vision.R0.d(r4)
            int[] r1 = com.google.android.gms.internal.vision.E0.f7215a
            com.google.android.gms.internal.vision.v2 r0 = r0.b()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0040;
                case 2: goto L_0x003d;
                case 3: goto L_0x003a;
                case 4: goto L_0x0037;
                case 5: goto L_0x0034;
                case 6: goto L_0x0031;
                case 7: goto L_0x0028;
                case 8: goto L_0x001f;
                case 9: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = r2
            goto L_0x0042
        L_0x001a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.C0546t1
            if (r0 != 0) goto L_0x0042
            goto L_0x0018
        L_0x001f:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0042
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.Q0
            if (r0 == 0) goto L_0x0018
            goto L_0x0042
        L_0x0028:
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.C0507g0
            if (r0 != 0) goto L_0x0042
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0018
            goto L_0x0042
        L_0x0031:
            boolean r1 = r4 instanceof java.lang.String
            goto L_0x0042
        L_0x0034:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0037:
            boolean r1 = r4 instanceof java.lang.Double
            goto L_0x0042
        L_0x003a:
            boolean r1 = r4 instanceof java.lang.Float
            goto L_0x0042
        L_0x003d:
            boolean r1 = r4 instanceof java.lang.Long
            goto L_0x0042
        L_0x0040:
            boolean r1 = r4 instanceof java.lang.Integer
        L_0x0042:
            if (r1 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.vision.s2 r3 = r3.d()
            com.google.android.gms.internal.vision.v2 r3 = r3.b()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.F0.k(com.google.android.gms.internal.vision.H0, java.lang.Object):void");
    }

    public final void c(F0 f02) {
        for (int i4 = 0; i4 < f02.f7218a.j(); i4++) {
            g(f02.f7218a.h(i4));
        }
        for (Map.Entry g4 : f02.f7218a.m()) {
            g(g4);
        }
    }

    public final /* synthetic */ Object clone() {
        F0 f02 = new F0();
        for (int i4 = 0; i4 < this.f7218a.j(); i4++) {
            Map.Entry h4 = this.f7218a.h(i4);
            b.a(h4.getKey());
            f02.d((H0) null, h4.getValue());
        }
        for (Map.Entry entry : this.f7218a.m()) {
            b.a(entry.getKey());
            f02.d((H0) null, entry.getValue());
        }
        f02.f7220c = this.f7220c;
        return f02;
    }

    public final void d(H0 h02, Object obj) {
        if (!h02.e()) {
            k(h02, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                k(h02, obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f7218a.put(h02, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        return this.f7218a.equals(((F0) obj).f7218a);
    }

    public final void f() {
        if (!this.f7219b) {
            this.f7218a.e();
            this.f7219b = true;
        }
    }

    public final void g(Map.Entry entry) {
        b.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final int hashCode() {
        return this.f7218a.hashCode();
    }

    public final Iterator j() {
        return this.f7220c ? new C0485a1(this.f7218a.entrySet().iterator()) : this.f7218a.entrySet().iterator();
    }

    public final Iterator l() {
        return this.f7220c ? new C0485a1(this.f7218a.o().iterator()) : this.f7218a.o().iterator();
    }

    public final boolean m() {
        for (int i4 = 0; i4 < this.f7218a.j(); i4++) {
            if (!e(this.f7218a.h(i4))) {
                return false;
            }
        }
        for (Map.Entry e4 : this.f7218a.m()) {
            if (!e(e4)) {
                return false;
            }
        }
        return true;
    }

    public final int n() {
        int i4 = 0;
        for (int i5 = 0; i5 < this.f7218a.j(); i5++) {
            i4 += i(this.f7218a.h(i5));
        }
        for (Map.Entry i6 : this.f7218a.m()) {
            i4 += i(i6);
        }
        return i4;
    }

    public F0(boolean z4) {
        this(O1.b(0));
        f();
    }

    public F0(O1 o12) {
        this.f7218a = o12;
        f();
    }
}
