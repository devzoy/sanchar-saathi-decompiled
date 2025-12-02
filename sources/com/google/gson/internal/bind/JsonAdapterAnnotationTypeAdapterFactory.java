package com.google.gson.internal.bind;

import C2.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.s;
import z2.b;

public final class JsonAdapterAnnotationTypeAdapterFactory implements s {

    /* renamed from: e  reason: collision with root package name */
    public final c f8378e;

    public JsonAdapterAnnotationTypeAdapterFactory(c cVar) {
        this.f8378e = cVar;
    }

    /* JADX WARNING: type inference failed for: r7v16, types: [com.google.gson.TypeAdapter] */
    /* JADX WARNING: type inference failed for: r7v17, types: [com.google.gson.TypeAdapter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.TypeAdapter a(com.google.gson.internal.c r7, com.google.gson.Gson r8, C2.a r9, z2.b r10) {
        /*
            r6 = this;
            java.lang.Class r0 = r10.value()
            C2.a r0 = C2.a.a(r0)
            com.google.gson.internal.h r7 = r7.a(r0)
            java.lang.Object r7 = r7.a()
            boolean r0 = r7 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L_0x0017
            com.google.gson.TypeAdapter r7 = (com.google.gson.TypeAdapter) r7
            goto L_0x003a
        L_0x0017:
            boolean r0 = r7 instanceof com.google.gson.s
            if (r0 == 0) goto L_0x0022
            com.google.gson.s r7 = (com.google.gson.s) r7
            com.google.gson.TypeAdapter r7 = r7.create(r8, r9)
            goto L_0x003a
        L_0x0022:
            boolean r0 = r7 instanceof com.google.gson.g
            if (r0 == 0) goto L_0x0047
            boolean r0 = r7 instanceof com.google.gson.g
            if (r0 == 0) goto L_0x002e
            com.google.gson.g r7 = (com.google.gson.g) r7
        L_0x002c:
            r2 = r7
            goto L_0x0030
        L_0x002e:
            r7 = 0
            goto L_0x002c
        L_0x0030:
            com.google.gson.internal.bind.TreeTypeAdapter r7 = new com.google.gson.internal.bind.TreeTypeAdapter
            r5 = 0
            r1 = 0
            r0 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x003a:
            if (r7 == 0) goto L_0x0046
            boolean r8 = r10.nullSafe()
            if (r8 == 0) goto L_0x0046
            com.google.gson.TypeAdapter r7 = r7.b()
        L_0x0046:
            return r7
        L_0x0047:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r10.append(r0)
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r10.append(r7)
            java.lang.String r7 = " as a @JsonAdapter for "
            r10.append(r7)
            java.lang.String r7 = r9.toString()
            r10.append(r7)
            java.lang.String r7 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory.a(com.google.gson.internal.c, com.google.gson.Gson, C2.a, z2.b):com.google.gson.TypeAdapter");
    }

    public TypeAdapter create(Gson gson, a aVar) {
        b bVar = (b) aVar.c().getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return a(this.f8378e, gson, aVar, bVar);
    }
}
