package com.google.gson.internal.bind;

import C2.a;
import D2.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.b;
import com.google.gson.s;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends TypeAdapter {

    /* renamed from: c  reason: collision with root package name */
    public static final s f8366c = new s() {
        public TypeAdapter create(Gson gson, a aVar) {
            Type e4 = aVar.e();
            if (!(e4 instanceof GenericArrayType) && (!(e4 instanceof Class) || !((Class) e4).isArray())) {
                return null;
            }
            Type g4 = b.g(e4);
            return new ArrayTypeAdapter(gson, gson.j(a.b(g4)), b.k(g4));
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Class f8367a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter f8368b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter typeAdapter, Class cls) {
        this.f8368b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f8367a = cls;
    }

    public Object c(D2.a aVar) {
        if (aVar.F() == D2.b.NULL) {
            aVar.z();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.b();
        while (aVar.j()) {
            arrayList.add(this.f8368b.c(aVar));
        }
        aVar.g();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.f8367a, size);
        for (int i4 = 0; i4 < size; i4++) {
            Array.set(newInstance, i4, arrayList.get(i4));
        }
        return newInstance;
    }

    public void e(c cVar, Object obj) {
        if (obj == null) {
            cVar.r();
            return;
        }
        cVar.d();
        int length = Array.getLength(obj);
        for (int i4 = 0; i4 < length; i4++) {
            this.f8368b.e(cVar, Array.get(obj, i4));
        }
        cVar.g();
    }
}
