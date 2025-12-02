package com.google.gson.internal.bind;

import D2.a;
import D2.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.internal.e;
import com.google.gson.internal.h;
import com.google.gson.internal.k;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.s;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class MapTypeAdapterFactory implements s {

    /* renamed from: e  reason: collision with root package name */
    public final c f8379e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8380f;

    public final class Adapter<K, V> extends TypeAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final TypeAdapter f8381a;

        /* renamed from: b  reason: collision with root package name */
        public final TypeAdapter f8382b;

        /* renamed from: c  reason: collision with root package name */
        public final h f8383c;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, Type type2, TypeAdapter typeAdapter2, h hVar) {
            this.f8381a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f8382b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f8383c = hVar;
        }

        public final String f(com.google.gson.h hVar) {
            if (hVar.A()) {
                m v4 = hVar.v();
                if (v4.H()) {
                    return String.valueOf(v4.E());
                }
                if (v4.F()) {
                    return Boolean.toString(v4.s());
                }
                if (v4.I()) {
                    return v4.w();
                }
                throw new AssertionError();
            } else if (hVar.y()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: g */
        public Map c(a aVar) {
            b F4 = aVar.F();
            if (F4 == b.NULL) {
                aVar.z();
                return null;
            }
            Map map = (Map) this.f8383c.a();
            if (F4 == b.BEGIN_ARRAY) {
                aVar.b();
                while (aVar.j()) {
                    aVar.b();
                    Object c4 = this.f8381a.c(aVar);
                    if (map.put(c4, this.f8382b.c(aVar)) == null) {
                        aVar.g();
                    } else {
                        throw new o("duplicate key: " + c4);
                    }
                }
                aVar.g();
            } else {
                aVar.c();
                while (aVar.j()) {
                    e.f8524a.a(aVar);
                    Object c5 = this.f8381a.c(aVar);
                    if (map.put(c5, this.f8382b.c(aVar)) != null) {
                        throw new o("duplicate key: " + c5);
                    }
                }
                aVar.h();
            }
            return map;
        }

        /* renamed from: h */
        public void e(D2.c cVar, Map map) {
            if (map == null) {
                cVar.r();
            } else if (!MapTypeAdapterFactory.this.f8380f) {
                cVar.e();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.l(String.valueOf(entry.getKey()));
                    this.f8382b.e(cVar, entry.getValue());
                }
                cVar.h();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i4 = 0;
                boolean z4 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    com.google.gson.h d4 = this.f8381a.d(entry2.getKey());
                    arrayList.add(d4);
                    arrayList2.add(entry2.getValue());
                    z4 |= d4.x() || d4.z();
                }
                if (z4) {
                    cVar.d();
                    int size = arrayList.size();
                    while (i4 < size) {
                        cVar.d();
                        k.b((com.google.gson.h) arrayList.get(i4), cVar);
                        this.f8382b.e(cVar, arrayList2.get(i4));
                        cVar.g();
                        i4++;
                    }
                    cVar.g();
                    return;
                }
                cVar.e();
                int size2 = arrayList.size();
                while (i4 < size2) {
                    cVar.l(f((com.google.gson.h) arrayList.get(i4)));
                    this.f8382b.e(cVar, arrayList2.get(i4));
                    i4++;
                }
                cVar.h();
            }
        }
    }

    public MapTypeAdapterFactory(c cVar, boolean z4) {
        this.f8379e = cVar;
        this.f8380f = z4;
    }

    public final TypeAdapter a(Gson gson, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? TypeAdapters.f8453f : gson.j(C2.a.b(type));
    }

    public TypeAdapter create(Gson gson, C2.a aVar) {
        Type e4 = aVar.e();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] j4 = com.google.gson.internal.b.j(e4, com.google.gson.internal.b.k(e4));
        return new Adapter(gson, j4[0], a(gson, j4[0]), j4[1], gson.j(C2.a.b(j4[1])), this.f8379e.a(aVar));
    }
}
