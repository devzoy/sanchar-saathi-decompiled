package com.dexterous.flutterlocalnotifications;

import C2.a;
import D2.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.internal.k;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.s;
import java.util.LinkedHashMap;
import java.util.Map;

public final class RuntimeTypeAdapterFactory<T> implements s {
    /* access modifiers changed from: private */
    public final Class<?> baseType;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();
    /* access modifiers changed from: private */
    public final String typeFieldName;

    private RuntimeTypeAdapterFactory(Class<?> cls, String str) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str);
    }

    public <R> TypeAdapter create(Gson gson, a<R> aVar) {
        if (aVar.c() != this.baseType) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry next : this.labelToSubtype.entrySet()) {
            TypeAdapter l4 = gson.l(this, a.a((Class) next.getValue()));
            linkedHashMap.put((String) next.getKey(), l4);
            linkedHashMap2.put((Class) next.getValue(), l4);
        }
        return new TypeAdapter() {
            public Object c(D2.a aVar) {
                h a4 = k.a(aVar);
                h E4 = a4.u().E(RuntimeTypeAdapterFactory.this.typeFieldName);
                if (E4 != null) {
                    String w4 = E4.w();
                    TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(w4);
                    if (typeAdapter != null) {
                        return typeAdapter.a(a4);
                    }
                    throw new l("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " subtype named " + w4 + "; did you forget to register a subtype?");
                }
                throw new l("cannot deserialize " + RuntimeTypeAdapterFactory.this.baseType + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
            }

            public void e(c cVar, Object obj) {
                Class<?> cls = obj.getClass();
                String str = (String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls);
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                if (typeAdapter != null) {
                    com.google.gson.k u4 = typeAdapter.d(obj).u();
                    if (!u4.D(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                        com.google.gson.k kVar = new com.google.gson.k();
                        kVar.B(RuntimeTypeAdapterFactory.this.typeFieldName, new m(str));
                        for (Map.Entry entry : u4.C()) {
                            kVar.B((String) entry.getKey(), (h) entry.getValue());
                        }
                        k.b(kVar, cVar);
                        return;
                    }
                    throw new l("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                throw new l("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
            }
        }.b();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        } else if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException("types and labels must be unique");
        } else {
            this.labelToSubtype.put(str, cls);
            this.subtypeToLabel.put(cls, str);
            return this;
        }
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, "type");
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
