package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.c;
import com.google.gson.internal.h;
import com.google.gson.internal.j;
import com.google.gson.o;
import com.google.gson.s;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements s {

    /* renamed from: e  reason: collision with root package name */
    public final c f8394e;

    /* renamed from: f  reason: collision with root package name */
    public final com.google.gson.c f8395f;

    /* renamed from: g  reason: collision with root package name */
    public final Excluder f8396g;

    /* renamed from: h  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f8397h;

    /* renamed from: i  reason: collision with root package name */
    public final B2.b f8398i = B2.b.a();

    public static final class Adapter<T> extends TypeAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final h f8399a;

        /* renamed from: b  reason: collision with root package name */
        public final Map f8400b;

        public Adapter(h hVar, Map map) {
            this.f8399a = hVar;
            this.f8400b = map;
        }

        public Object c(D2.a aVar) {
            if (aVar.F() == D2.b.NULL) {
                aVar.z();
                return null;
            }
            Object a4 = this.f8399a.a();
            try {
                aVar.c();
                while (aVar.j()) {
                    b bVar = (b) this.f8400b.get(aVar.x());
                    if (bVar != null) {
                        if (bVar.f8410c) {
                            bVar.a(aVar, a4);
                        }
                    }
                    aVar.R();
                }
                aVar.h();
                return a4;
            } catch (IllegalStateException e4) {
                throw new o((Throwable) e4);
            } catch (IllegalAccessException e5) {
                throw new AssertionError(e5);
            }
        }

        public void e(D2.c cVar, Object obj) {
            if (obj == null) {
                cVar.r();
                return;
            }
            cVar.e();
            try {
                for (b bVar : this.f8400b.values()) {
                    if (bVar.c(obj)) {
                        cVar.l(bVar.f8408a);
                        bVar.b(cVar, obj);
                    }
                }
                cVar.h();
            } catch (IllegalAccessException e4) {
                throw new AssertionError(e4);
            }
        }
    }

    public class a extends b {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Field f8401d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f8402e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ TypeAdapter f8403f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ Gson f8404g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ C2.a f8405h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ boolean f8406i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z4, boolean z5, Field field, boolean z6, TypeAdapter typeAdapter, Gson gson, C2.a aVar, boolean z7) {
            super(str, z4, z5);
            this.f8401d = field;
            this.f8402e = z6;
            this.f8403f = typeAdapter;
            this.f8404g = gson;
            this.f8405h = aVar;
            this.f8406i = z7;
        }

        public void a(D2.a aVar, Object obj) {
            Object c4 = this.f8403f.c(aVar);
            if (c4 != null || !this.f8406i) {
                this.f8401d.set(obj, c4);
            }
        }

        public void b(D2.c cVar, Object obj) {
            (this.f8402e ? this.f8403f : new TypeAdapterRuntimeTypeWrapper(this.f8404g, this.f8403f, this.f8405h.e())).e(cVar, this.f8401d.get(obj));
        }

        public boolean c(Object obj) {
            return this.f8409b && this.f8401d.get(obj) != obj;
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f8408a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f8409b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f8410c;

        public b(String str, boolean z4, boolean z5) {
            this.f8408a = str;
            this.f8409b = z4;
            this.f8410c = z5;
        }

        public abstract void a(D2.a aVar, Object obj);

        public abstract void b(D2.c cVar, Object obj);

        public abstract boolean c(Object obj);
    }

    public ReflectiveTypeAdapterFactory(c cVar, com.google.gson.c cVar2, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.f8394e = cVar;
        this.f8395f = cVar2;
        this.f8396g = excluder;
        this.f8397h = jsonAdapterAnnotationTypeAdapterFactory;
    }

    public static boolean c(Field field, boolean z4, Excluder excluder) {
        return !excluder.b(field.getType(), z4) && !excluder.h(field, z4);
    }

    public final b a(Gson gson, Field field, String str, C2.a aVar, boolean z4, boolean z5) {
        Gson gson2 = gson;
        C2.a aVar2 = aVar;
        boolean a4 = j.a(aVar.c());
        Field field2 = field;
        z2.b bVar = (z2.b) field.getAnnotation(z2.b.class);
        TypeAdapter a5 = bVar != null ? this.f8397h.a(this.f8394e, gson, aVar2, bVar) : null;
        boolean z6 = a5 != null;
        if (a5 == null) {
            a5 = gson.j(aVar2);
        }
        return new a(str, z4, z5, field, z6, a5, gson, aVar, a4);
    }

    public boolean b(Field field, boolean z4) {
        return c(field, z4, this.f8396g);
    }

    public TypeAdapter create(Gson gson, C2.a aVar) {
        Class c4 = aVar.c();
        if (!Object.class.isAssignableFrom(c4)) {
            return null;
        }
        return new Adapter(this.f8394e.a(aVar), d(gson, aVar, c4));
    }

    public final Map d(Gson gson, C2.a aVar, Class cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e4 = aVar.e();
        C2.a aVar2 = aVar;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z4 = false;
            int i4 = 0;
            while (i4 < length) {
                Field field = declaredFields[i4];
                boolean b4 = b(field, true);
                boolean b5 = b(field, z4);
                if (b4 || b5) {
                    this.f8398i.b(field);
                    Type p4 = com.google.gson.internal.b.p(aVar2.e(), cls2, field.getGenericType());
                    List e5 = e(field);
                    int size = e5.size();
                    b bVar = null;
                    int i5 = z4;
                    while (i5 < size) {
                        String str = (String) e5.get(i5);
                        boolean z5 = i5 != 0 ? z4 : b4;
                        String str2 = str;
                        int i6 = i5;
                        b bVar2 = bVar;
                        int i7 = size;
                        List list = e5;
                        Field field2 = field;
                        bVar = bVar2 == null ? (b) linkedHashMap.put(str2, a(gson, field, str2, C2.a.b(p4), z5, b5)) : bVar2;
                        i5 = i6 + 1;
                        b4 = z5;
                        e5 = list;
                        size = i7;
                        field = field2;
                        z4 = false;
                    }
                    b bVar3 = bVar;
                    if (bVar3 != null) {
                        throw new IllegalArgumentException(e4 + " declares multiple JSON fields named " + bVar3.f8408a);
                    }
                }
                i4++;
                z4 = false;
            }
            aVar2 = C2.a.b(com.google.gson.internal.b.p(aVar2.e(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.c();
        }
        return linkedHashMap;
    }

    public final List e(Field field) {
        z2.c cVar = (z2.c) field.getAnnotation(z2.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f8395f.b(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
