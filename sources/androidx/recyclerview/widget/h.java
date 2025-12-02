package androidx.recyclerview.widget;

import androidx.recyclerview.widget.a;
import java.util.List;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final a f6011a;

    public interface a {
        void a(a.b bVar);

        a.b b(int i4, int i5, int i6, Object obj);
    }

    public h(a aVar) {
        this.f6011a = aVar;
    }

    public final int a(List list) {
        boolean z4 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((a.b) list.get(size)).f5883a != 8) {
                z4 = true;
            } else if (z4) {
                return size;
            }
        }
        return -1;
    }

    public void b(List list) {
        while (true) {
            int a4 = a(list);
            if (a4 != -1) {
                d(list, a4, a4 + 1);
            } else {
                return;
            }
        }
    }

    public final void c(List list, int i4, a.b bVar, int i5, a.b bVar2) {
        int i6 = bVar.f5886d;
        int i7 = bVar2.f5884b;
        int i8 = i6 < i7 ? -1 : 0;
        int i9 = bVar.f5884b;
        if (i9 < i7) {
            i8++;
        }
        if (i7 <= i9) {
            bVar.f5884b = i9 + bVar2.f5886d;
        }
        int i10 = bVar2.f5884b;
        if (i10 <= i6) {
            bVar.f5886d = i6 + bVar2.f5886d;
        }
        bVar2.f5884b = i10 + i8;
        list.set(i4, bVar2);
        list.set(i5, bVar);
    }

    public final void d(List list, int i4, int i5) {
        a.b bVar = (a.b) list.get(i4);
        a.b bVar2 = (a.b) list.get(i5);
        int i6 = bVar2.f5883a;
        if (i6 == 1) {
            c(list, i4, bVar, i5, bVar2);
        } else if (i6 == 2) {
            e(list, i4, bVar, i5, bVar2);
        } else if (i6 == 4) {
            f(list, i4, bVar, i5, bVar2);
        }
    }

    public void e(List list, int i4, a.b bVar, int i5, a.b bVar2) {
        boolean z4;
        int i6 = bVar.f5884b;
        int i7 = bVar.f5886d;
        boolean z5 = false;
        if (i6 < i7) {
            if (bVar2.f5884b == i6 && bVar2.f5886d == i7 - i6) {
                z4 = false;
                z5 = true;
            } else {
                z4 = false;
            }
        } else if (bVar2.f5884b == i7 + 1 && bVar2.f5886d == i6 - i7) {
            z4 = true;
            z5 = true;
        } else {
            z4 = true;
        }
        int i8 = bVar2.f5884b;
        if (i7 < i8) {
            bVar2.f5884b = i8 - 1;
        } else {
            int i9 = bVar2.f5886d;
            if (i7 < i8 + i9) {
                bVar2.f5886d = i9 - 1;
                bVar.f5883a = 2;
                bVar.f5886d = 1;
                if (bVar2.f5886d == 0) {
                    list.remove(i5);
                    this.f6011a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i10 = bVar.f5884b;
        int i11 = bVar2.f5884b;
        a.b bVar3 = null;
        if (i10 <= i11) {
            bVar2.f5884b = i11 + 1;
        } else {
            int i12 = bVar2.f5886d;
            if (i10 < i11 + i12) {
                bVar3 = this.f6011a.b(2, i10 + 1, (i11 + i12) - i10, (Object) null);
                bVar2.f5886d = bVar.f5884b - bVar2.f5884b;
            }
        }
        if (z5) {
            list.set(i4, bVar2);
            list.remove(i5);
            this.f6011a.a(bVar);
            return;
        }
        if (z4) {
            if (bVar3 != null) {
                int i13 = bVar.f5884b;
                if (i13 > bVar3.f5884b) {
                    bVar.f5884b = i13 - bVar3.f5886d;
                }
                int i14 = bVar.f5886d;
                if (i14 > bVar3.f5884b) {
                    bVar.f5886d = i14 - bVar3.f5886d;
                }
            }
            int i15 = bVar.f5884b;
            if (i15 > bVar2.f5884b) {
                bVar.f5884b = i15 - bVar2.f5886d;
            }
            int i16 = bVar.f5886d;
            if (i16 > bVar2.f5884b) {
                bVar.f5886d = i16 - bVar2.f5886d;
            }
        } else {
            if (bVar3 != null) {
                int i17 = bVar.f5884b;
                if (i17 >= bVar3.f5884b) {
                    bVar.f5884b = i17 - bVar3.f5886d;
                }
                int i18 = bVar.f5886d;
                if (i18 >= bVar3.f5884b) {
                    bVar.f5886d = i18 - bVar3.f5886d;
                }
            }
            int i19 = bVar.f5884b;
            if (i19 >= bVar2.f5884b) {
                bVar.f5884b = i19 - bVar2.f5886d;
            }
            int i20 = bVar.f5886d;
            if (i20 >= bVar2.f5884b) {
                bVar.f5886d = i20 - bVar2.f5886d;
            }
        }
        list.set(i4, bVar2);
        if (bVar.f5884b != bVar.f5886d) {
            list.set(i5, bVar);
        } else {
            list.remove(i5);
        }
        if (bVar3 != null) {
            list.add(i4, bVar3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(java.util.List r9, int r10, androidx.recyclerview.widget.a.b r11, int r12, androidx.recyclerview.widget.a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f5886d
            int r1 = r13.f5884b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r3
            r13.f5884b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f5886d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r3
            r13.f5886d = r5
            androidx.recyclerview.widget.h$a r0 = r8.f6011a
            int r1 = r11.f5884b
            java.lang.Object r5 = r13.f5885c
            androidx.recyclerview.widget.a$b r0 = r0.b(r2, r1, r3, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r4
        L_0x0021:
            int r1 = r11.f5884b
            int r5 = r13.f5884b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r3
            r13.f5884b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f5886d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.h$a r4 = r8.f6011a
            int r1 = r1 + r3
            java.lang.Object r3 = r13.f5885c
            androidx.recyclerview.widget.a$b r4 = r4.b(r2, r1, r5, r3)
            int r1 = r13.f5886d
            int r1 = r1 - r5
            r13.f5886d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f5886d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.h$a r11 = r8.f6011a
            r11.a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r9.add(r10, r4)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.h.f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
