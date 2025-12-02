package com.google.gson.internal.bind;

import D2.a;
import D2.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.s;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements s {

    /* renamed from: e  reason: collision with root package name */
    public final c f8369e;

    public static final class Adapter<E> extends TypeAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final TypeAdapter f8370a;

        /* renamed from: b  reason: collision with root package name */
        public final h f8371b;

        public Adapter(Gson gson, Type type, TypeAdapter typeAdapter, h hVar) {
            this.f8370a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f8371b = hVar;
        }

        /* renamed from: f */
        public Collection c(a aVar) {
            if (aVar.F() == b.NULL) {
                aVar.z();
                return null;
            }
            Collection collection = (Collection) this.f8371b.a();
            aVar.b();
            while (aVar.j()) {
                collection.add(this.f8370a.c(aVar));
            }
            aVar.g();
            return collection;
        }

        /* renamed from: g */
        public void e(D2.c cVar, Collection collection) {
            if (collection == null) {
                cVar.r();
                return;
            }
            cVar.d();
            for (Object e4 : collection) {
                this.f8370a.e(cVar, e4);
            }
            cVar.g();
        }
    }

    public CollectionTypeAdapterFactory(c cVar) {
        this.f8369e = cVar;
    }

    public TypeAdapter create(Gson gson, C2.a aVar) {
        Type e4 = aVar.e();
        Class c4 = aVar.c();
        if (!Collection.class.isAssignableFrom(c4)) {
            return null;
        }
        Type h4 = com.google.gson.internal.b.h(e4, c4);
        return new Adapter(gson, h4, gson.j(C2.a.b(h4)), this.f8369e.a(aVar));
    }
}
