package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.a;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public Excluder f8327a = Excluder.f8346k;

    /* renamed from: b  reason: collision with root package name */
    public p f8328b = p.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    public c f8329c = b.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    public final Map f8330d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final List f8331e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List f8332f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public boolean f8333g = false;

    /* renamed from: h  reason: collision with root package name */
    public String f8334h;

    /* renamed from: i  reason: collision with root package name */
    public int f8335i = 2;

    /* renamed from: j  reason: collision with root package name */
    public int f8336j = 2;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8337k = false;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8338l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f8339m = true;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8340n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8341o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8342p = false;

    /* renamed from: q  reason: collision with root package name */
    public r f8343q = q.DOUBLE;

    /* renamed from: r  reason: collision with root package name */
    public r f8344r = q.LAZILY_PARSED_NUMBER;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r5, int r6, int r7, java.util.List r8) {
        /*
            r4 = this;
            boolean r0 = com.google.gson.internal.sql.a.f8564a
            r1 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.String r2 = r5.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0026
            com.google.gson.internal.bind.DefaultDateTypeAdapter$b r6 = com.google.gson.internal.bind.DefaultDateTypeAdapter.b.f8376b
            com.google.gson.s r6 = r6.b(r5)
            if (r0 == 0) goto L_0x0024
            com.google.gson.internal.bind.DefaultDateTypeAdapter$b r7 = com.google.gson.internal.sql.a.f8566c
            com.google.gson.s r1 = r7.b(r5)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$b r7 = com.google.gson.internal.sql.a.f8565b
            com.google.gson.s r5 = r7.b(r5)
            goto L_0x0045
        L_0x0024:
            r5 = r1
            goto L_0x0045
        L_0x0026:
            r5 = 2
            if (r6 == r5) goto L_0x0050
            if (r7 == r5) goto L_0x0050
            com.google.gson.internal.bind.DefaultDateTypeAdapter$b r5 = com.google.gson.internal.bind.DefaultDateTypeAdapter.b.f8376b
            com.google.gson.s r5 = r5.a(r6, r7)
            if (r0 == 0) goto L_0x0043
            com.google.gson.internal.bind.DefaultDateTypeAdapter$b r1 = com.google.gson.internal.sql.a.f8566c
            com.google.gson.s r1 = r1.a(r6, r7)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$b r2 = com.google.gson.internal.sql.a.f8565b
            com.google.gson.s r6 = r2.a(r6, r7)
            r3 = r6
            r6 = r5
            r5 = r3
            goto L_0x0045
        L_0x0043:
            r6 = r5
            goto L_0x0024
        L_0x0045:
            r8.add(r6)
            if (r0 == 0) goto L_0x0050
            r8.add(r1)
            r8.add(r5)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.d.a(java.lang.String, int, int, java.util.List):void");
    }

    public Gson b() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f8331e.size() + this.f8332f.size() + 3);
        arrayList2.addAll(this.f8331e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f8332f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        a(this.f8334h, this.f8335i, this.f8336j, arrayList2);
        return new Gson(this.f8327a, this.f8329c, this.f8330d, this.f8333g, this.f8337k, this.f8341o, this.f8339m, this.f8340n, this.f8342p, this.f8338l, this.f8328b, this.f8334h, this.f8335i, this.f8336j, this.f8331e, this.f8332f, arrayList, this.f8343q, this.f8344r);
    }

    public d c(Type type, Object obj) {
        a.a((obj instanceof g) || (obj instanceof TypeAdapter));
        if (obj instanceof g) {
            this.f8331e.add(TreeTypeAdapter.g(C2.a.b(type), obj));
        }
        if (obj instanceof TypeAdapter) {
            this.f8331e.add(TypeAdapters.a(C2.a.b(type), (TypeAdapter) obj));
        }
        return this;
    }

    public d d(s sVar) {
        this.f8331e.add(sVar);
        return this;
    }
}
