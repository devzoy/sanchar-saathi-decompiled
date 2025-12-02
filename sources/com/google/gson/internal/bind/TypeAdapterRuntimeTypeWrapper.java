package com.google.gson.internal.bind;

import D2.a;
import D2.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final Gson f8422a;

    /* renamed from: b  reason: collision with root package name */
    public final TypeAdapter f8423b;

    /* renamed from: c  reason: collision with root package name */
    public final Type f8424c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.f8422a = gson;
        this.f8423b = typeAdapter;
        this.f8424c = type;
    }

    public Object c(a aVar) {
        return this.f8423b.c(aVar);
    }

    public void e(c cVar, Object obj) {
        TypeAdapter typeAdapter = this.f8423b;
        Type f4 = f(this.f8424c, obj);
        if (f4 != this.f8424c) {
            typeAdapter = this.f8422a.j(C2.a.b(f4));
            if (typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter typeAdapter2 = this.f8423b;
                if (!(typeAdapter2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapter = typeAdapter2;
                }
            }
        }
        typeAdapter.e(cVar, obj);
    }

    public final Type f(Type type, Object obj) {
        return obj != null ? (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class)) ? obj.getClass() : type : type;
    }
}
