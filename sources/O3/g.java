package O3;

import i3.C0721E;
import i3.C0746w;
import java.util.ArrayList;
import java.util.Map;
import v3.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2107a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2108b;

    /* renamed from: c  reason: collision with root package name */
    public final r f2109c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f2110d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f2111e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f2112f;

    /* renamed from: g  reason: collision with root package name */
    public final Long f2113g;

    /* renamed from: h  reason: collision with root package name */
    public final Map f2114h;

    public g(boolean z4, boolean z5, r rVar, Long l4, Long l5, Long l6, Long l7, Map map) {
        l.e(map, "extras");
        this.f2107a = z4;
        this.f2108b = z5;
        this.f2109c = rVar;
        this.f2110d = l4;
        this.f2111e = l5;
        this.f2112f = l6;
        this.f2113g = l7;
        this.f2114h = C0721E.q(map);
    }

    public final Long a() {
        return this.f2112f;
    }

    public final Long b() {
        return this.f2110d;
    }

    public final boolean c() {
        return this.f2108b;
    }

    public final boolean d() {
        return this.f2107a;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f2107a) {
            arrayList.add("isRegularFile");
        }
        if (this.f2108b) {
            arrayList.add("isDirectory");
        }
        if (this.f2110d != null) {
            arrayList.add("byteCount=" + this.f2110d);
        }
        if (this.f2111e != null) {
            arrayList.add("createdAt=" + this.f2111e);
        }
        if (this.f2112f != null) {
            arrayList.add("lastModifiedAt=" + this.f2112f);
        }
        if (this.f2113g != null) {
            arrayList.add("lastAccessedAt=" + this.f2113g);
        }
        if (!this.f2114h.isEmpty()) {
            arrayList.add("extras=" + this.f2114h);
        }
        return C0746w.A(arrayList, ", ", "FileMetadata(", ")", 0, (CharSequence) null, (u3.l) null, 56, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ g(boolean r10, boolean r11, O3.r r12, java.lang.Long r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.util.Map r17, int r18, v3.g r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r10
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r2 = r11
        L_0x0010:
            r3 = r0 & 4
            r4 = 0
            if (r3 == 0) goto L_0x0017
            r3 = r4
            goto L_0x0018
        L_0x0017:
            r3 = r12
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r4
            goto L_0x001f
        L_0x001e:
            r5 = r13
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r4
            goto L_0x0026
        L_0x0025:
            r6 = r14
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r4
            goto L_0x002d
        L_0x002c:
            r7 = r15
        L_0x002d:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r4 = r16
        L_0x0034:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003d
            java.util.Map r0 = i3.C0721E.g()
            goto L_0x003f
        L_0x003d:
            r0 = r17
        L_0x003f:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r5
            r15 = r6
            r16 = r7
            r17 = r4
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O3.g.<init>(boolean, boolean, O3.r, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.Map, int, v3.g):void");
    }
}
