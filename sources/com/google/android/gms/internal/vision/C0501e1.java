package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.vision.e1  reason: case insensitive filesystem */
public final class C0501e1 extends C0493c1 {

    /* renamed from: c  reason: collision with root package name */
    public static final Class f7434c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    public C0501e1() {
        super();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.vision.b1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.vision.b1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.vision.b1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List e(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = f(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.C0497d1
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.vision.b1 r0 = new com.google.android.gms.internal.vision.b1
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.D1
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.X0
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.vision.X0 r0 = (com.google.android.gms.internal.vision.X0) r0
            com.google.android.gms.internal.vision.X0 r6 = r0.b(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.vision.h2.j(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class r1 = f7434c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.vision.h2.j(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.f2
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.vision.b1 r1 = new com.google.android.gms.internal.vision.b1
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.vision.f2 r0 = (com.google.android.gms.internal.vision.f2) r0
            r1.addAll(r0)
            com.google.android.gms.internal.vision.h2.j(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.D1
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.vision.X0
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.vision.X0 r1 = (com.google.android.gms.internal.vision.X0) r1
            boolean r2 = r1.a()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.vision.X0 r0 = r1.b(r0)
            com.google.android.gms.internal.vision.h2.j(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C0501e1.e(java.lang.Object, long, int):java.util.List");
    }

    public static List f(Object obj, long j4) {
        return (List) h2.F(obj, j4);
    }

    public final void b(Object obj, Object obj2, long j4) {
        List f4 = f(obj2, j4);
        List e4 = e(obj, j4, f4.size());
        int size = e4.size();
        int size2 = f4.size();
        if (size > 0 && size2 > 0) {
            e4.addAll(f4);
        }
        if (size > 0) {
            f4 = e4;
        }
        h2.j(obj, j4, f4);
    }

    public final void d(Object obj, long j4) {
        Object obj2;
        List list = (List) h2.F(obj, j4);
        if (list instanceof C0497d1) {
            obj2 = ((C0497d1) list).c();
        } else if (!f7434c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof D1) || !(list instanceof X0)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                X0 x02 = (X0) list;
                if (x02.a()) {
                    x02.d();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        h2.j(obj, j4, obj2);
    }
}
