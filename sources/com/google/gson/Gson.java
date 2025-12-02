package com.google.gson;

import C2.a;
import D2.b;
import D2.d;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.c;
import com.google.gson.internal.k;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson {

    /* renamed from: x  reason: collision with root package name */
    public static final a f8289x = a.a(Object.class);

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal f8290a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public final Map f8291b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final c f8292c;

    /* renamed from: d  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f8293d;

    /* renamed from: e  reason: collision with root package name */
    public final List f8294e;

    /* renamed from: f  reason: collision with root package name */
    public final Excluder f8295f;

    /* renamed from: g  reason: collision with root package name */
    public final c f8296g;

    /* renamed from: h  reason: collision with root package name */
    public final Map f8297h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8298i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8299j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f8300k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f8301l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f8302m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f8303n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f8304o;

    /* renamed from: p  reason: collision with root package name */
    public final String f8305p;

    /* renamed from: q  reason: collision with root package name */
    public final int f8306q;

    /* renamed from: r  reason: collision with root package name */
    public final int f8307r;

    /* renamed from: s  reason: collision with root package name */
    public final p f8308s;

    /* renamed from: t  reason: collision with root package name */
    public final List f8309t;

    /* renamed from: u  reason: collision with root package name */
    public final List f8310u;

    /* renamed from: v  reason: collision with root package name */
    public final r f8311v;

    /* renamed from: w  reason: collision with root package name */
    public final r f8312w;

    public static class FutureTypeAdapter<T> extends TypeAdapter {

        /* renamed from: a  reason: collision with root package name */
        public TypeAdapter f8317a;

        public Object c(D2.a aVar) {
            TypeAdapter typeAdapter = this.f8317a;
            if (typeAdapter != null) {
                return typeAdapter.c(aVar);
            }
            throw new IllegalStateException();
        }

        public void e(D2.c cVar, Object obj) {
            TypeAdapter typeAdapter = this.f8317a;
            if (typeAdapter != null) {
                typeAdapter.e(cVar, obj);
                return;
            }
            throw new IllegalStateException();
        }

        public void f(TypeAdapter typeAdapter) {
            if (this.f8317a == null) {
                this.f8317a = typeAdapter;
                return;
            }
            throw new AssertionError();
        }
    }

    public Gson(Excluder excluder, c cVar, Map map, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, p pVar, String str, int i4, int i5, List list, List list2, List list3, r rVar, r rVar2) {
        boolean z11 = z5;
        boolean z12 = z10;
        this.f8295f = excluder;
        this.f8296g = cVar;
        this.f8297h = map;
        c cVar2 = new c(map);
        this.f8292c = cVar2;
        this.f8298i = z4;
        this.f8299j = z11;
        this.f8300k = z6;
        this.f8301l = z7;
        this.f8302m = z8;
        this.f8303n = z9;
        this.f8304o = z12;
        this.f8308s = pVar;
        this.f8305p = str;
        this.f8306q = i4;
        this.f8307r = i5;
        this.f8309t = list;
        this.f8310u = list2;
        this.f8311v = rVar;
        this.f8312w = rVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f8446V);
        arrayList.add(ObjectTypeAdapter.f(rVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f8426B);
        arrayList.add(TypeAdapters.f8460m);
        arrayList.add(TypeAdapters.f8454g);
        arrayList.add(TypeAdapters.f8456i);
        arrayList.add(TypeAdapters.f8458k);
        TypeAdapter m4 = m(pVar);
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, m4));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, e(z12)));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, f(z12)));
        arrayList.add(NumberTypeAdapter.f(rVar2));
        arrayList.add(TypeAdapters.f8462o);
        arrayList.add(TypeAdapters.f8464q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, b(m4)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, c(m4)));
        arrayList.add(TypeAdapters.f8466s);
        arrayList.add(TypeAdapters.f8471x);
        arrayList.add(TypeAdapters.f8428D);
        arrayList.add(TypeAdapters.f8430F);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.f8473z));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.f8425A));
        arrayList.add(TypeAdapters.f8432H);
        arrayList.add(TypeAdapters.f8434J);
        arrayList.add(TypeAdapters.f8438N);
        arrayList.add(TypeAdapters.f8440P);
        arrayList.add(TypeAdapters.f8444T);
        arrayList.add(TypeAdapters.f8436L);
        arrayList.add(TypeAdapters.f8451d);
        arrayList.add(DateTypeAdapter.f8372b);
        arrayList.add(TypeAdapters.f8442R);
        if (com.google.gson.internal.sql.a.f8564a) {
            arrayList.add(com.google.gson.internal.sql.a.f8568e);
            arrayList.add(com.google.gson.internal.sql.a.f8567d);
            arrayList.add(com.google.gson.internal.sql.a.f8569f);
        }
        arrayList.add(ArrayTypeAdapter.f8366c);
        arrayList.add(TypeAdapters.f8449b);
        arrayList.add(new CollectionTypeAdapterFactory(cVar2));
        arrayList.add(new MapTypeAdapterFactory(cVar2, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(cVar2);
        this.f8293d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f8447W);
        arrayList.add(new ReflectiveTypeAdapterFactory(cVar2, cVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f8294e = Collections.unmodifiableList(arrayList);
    }

    public static void a(Object obj, D2.a aVar) {
        if (obj != null) {
            try {
                if (aVar.F() != b.END_DOCUMENT) {
                    throw new i("JSON document was not fully consumed.");
                }
            } catch (d e4) {
                throw new o((Throwable) e4);
            } catch (IOException e5) {
                throw new i((Throwable) e5);
            }
        }
    }

    public static TypeAdapter b(final TypeAdapter typeAdapter) {
        return new TypeAdapter() {
            /* renamed from: f */
            public AtomicLong c(D2.a aVar) {
                return new AtomicLong(((Number) TypeAdapter.this.c(aVar)).longValue());
            }

            /* renamed from: g */
            public void e(D2.c cVar, AtomicLong atomicLong) {
                TypeAdapter.this.e(cVar, Long.valueOf(atomicLong.get()));
            }
        }.b();
    }

    public static TypeAdapter c(final TypeAdapter typeAdapter) {
        return new TypeAdapter() {
            /* renamed from: f */
            public AtomicLongArray c(D2.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.j()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.c(aVar)).longValue()));
                }
                aVar.g();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i4 = 0; i4 < size; i4++) {
                    atomicLongArray.set(i4, ((Long) arrayList.get(i4)).longValue());
                }
                return atomicLongArray;
            }

            /* renamed from: g */
            public void e(D2.c cVar, AtomicLongArray atomicLongArray) {
                cVar.d();
                int length = atomicLongArray.length();
                for (int i4 = 0; i4 < length; i4++) {
                    TypeAdapter.this.e(cVar, Long.valueOf(atomicLongArray.get(i4)));
                }
                cVar.g();
            }
        }.b();
    }

    public static void d(double d4) {
        if (Double.isNaN(d4) || Double.isInfinite(d4)) {
            throw new IllegalArgumentException(d4 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static TypeAdapter m(p pVar) {
        return pVar == p.DEFAULT ? TypeAdapters.f8467t : new TypeAdapter() {
            /* renamed from: f */
            public Number c(D2.a aVar) {
                if (aVar.F() != b.NULL) {
                    return Long.valueOf(aVar.w());
                }
                aVar.z();
                return null;
            }

            /* renamed from: g */
            public void e(D2.c cVar, Number number) {
                if (number == null) {
                    cVar.r();
                } else {
                    cVar.K(number.toString());
                }
            }
        };
    }

    public final TypeAdapter e(boolean z4) {
        return z4 ? TypeAdapters.f8469v : new TypeAdapter() {
            /* renamed from: f */
            public Double c(D2.a aVar) {
                if (aVar.F() != b.NULL) {
                    return Double.valueOf(aVar.s());
                }
                aVar.z();
                return null;
            }

            /* renamed from: g */
            public void e(D2.c cVar, Number number) {
                if (number == null) {
                    cVar.r();
                    return;
                }
                Gson.d(number.doubleValue());
                cVar.J(number);
            }
        };
    }

    public final TypeAdapter f(boolean z4) {
        return z4 ? TypeAdapters.f8468u : new TypeAdapter() {
            /* renamed from: f */
            public Float c(D2.a aVar) {
                if (aVar.F() != b.NULL) {
                    return Float.valueOf((float) aVar.s());
                }
                aVar.z();
                return null;
            }

            /* renamed from: g */
            public void e(D2.c cVar, Number number) {
                if (number == null) {
                    cVar.r();
                    return;
                }
                Gson.d((double) number.floatValue());
                cVar.J(number);
            }
        };
    }

    public Object g(D2.a aVar, Type type) {
        boolean k4 = aVar.k();
        aVar.M(true);
        try {
            aVar.F();
            Object c4 = j(a.b(type)).c(aVar);
            aVar.M(k4);
            return c4;
        } catch (EOFException e4) {
            if (1 != 0) {
                aVar.M(k4);
                return null;
            }
            throw new o((Throwable) e4);
        } catch (IllegalStateException e5) {
            throw new o((Throwable) e5);
        } catch (IOException e6) {
            throw new o((Throwable) e6);
        } catch (AssertionError e7) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e7.getMessage());
            assertionError.initCause(e7);
            throw assertionError;
        } catch (Throwable th) {
            aVar.M(k4);
            throw th;
        }
    }

    public Object h(Reader reader, Type type) {
        D2.a n4 = n(reader);
        Object g4 = g(n4, type);
        a(g4, n4);
        return g4;
    }

    public Object i(String str, Type type) {
        if (str == null) {
            return null;
        }
        return h(new StringReader(str), type);
    }

    public TypeAdapter j(a aVar) {
        boolean z4;
        TypeAdapter typeAdapter = (TypeAdapter) this.f8291b.get(aVar == null ? f8289x : aVar);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map map = (Map) this.f8290a.get();
        if (map == null) {
            map = new HashMap();
            this.f8290a.set(map);
            z4 = true;
        } else {
            z4 = false;
        }
        FutureTypeAdapter futureTypeAdapter = (FutureTypeAdapter) map.get(aVar);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter futureTypeAdapter2 = new FutureTypeAdapter();
            map.put(aVar, futureTypeAdapter2);
            for (s create : this.f8294e) {
                TypeAdapter create2 = create.create(this, aVar);
                if (create2 != null) {
                    futureTypeAdapter2.f(create2);
                    this.f8291b.put(aVar, create2);
                    return create2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z4) {
                this.f8290a.remove();
            }
        }
    }

    public TypeAdapter k(Class cls) {
        return j(a.a(cls));
    }

    public TypeAdapter l(s sVar, a aVar) {
        if (!this.f8294e.contains(sVar)) {
            sVar = this.f8293d;
        }
        boolean z4 = false;
        for (s sVar2 : this.f8294e) {
            if (z4) {
                TypeAdapter create = sVar2.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (sVar2 == sVar) {
                z4 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public D2.a n(Reader reader) {
        D2.a aVar = new D2.a(reader);
        aVar.M(this.f8303n);
        return aVar;
    }

    public D2.c o(Writer writer) {
        if (this.f8300k) {
            writer.write(")]}'\n");
        }
        D2.c cVar = new D2.c(writer);
        if (this.f8302m) {
            cVar.z("  ");
        }
        cVar.C(this.f8298i);
        return cVar;
    }

    public String p(h hVar) {
        StringWriter stringWriter = new StringWriter();
        t(hVar, stringWriter);
        return stringWriter.toString();
    }

    public String q(Object obj) {
        return obj == null ? p(j.f8570e) : r(obj, obj.getClass());
    }

    public String r(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        v(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void s(h hVar, D2.c cVar) {
        boolean k4 = cVar.k();
        cVar.B(true);
        boolean j4 = cVar.j();
        cVar.y(this.f8301l);
        boolean i4 = cVar.i();
        cVar.C(this.f8298i);
        try {
            k.b(hVar, cVar);
            cVar.B(k4);
            cVar.y(j4);
            cVar.C(i4);
        } catch (IOException e4) {
            throw new i((Throwable) e4);
        } catch (AssertionError e5) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e5.getMessage());
            assertionError.initCause(e5);
            throw assertionError;
        } catch (Throwable th) {
            cVar.B(k4);
            cVar.y(j4);
            cVar.C(i4);
            throw th;
        }
    }

    public void t(h hVar, Appendable appendable) {
        try {
            s(hVar, o(k.c(appendable)));
        } catch (IOException e4) {
            throw new i((Throwable) e4);
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f8298i + ",factories:" + this.f8294e + ",instanceCreators:" + this.f8292c + "}";
    }

    public void u(Object obj, Type type, D2.c cVar) {
        TypeAdapter j4 = j(a.b(type));
        boolean k4 = cVar.k();
        cVar.B(true);
        boolean j5 = cVar.j();
        cVar.y(this.f8301l);
        boolean i4 = cVar.i();
        cVar.C(this.f8298i);
        try {
            j4.e(cVar, obj);
            cVar.B(k4);
            cVar.y(j5);
            cVar.C(i4);
        } catch (IOException e4) {
            throw new i((Throwable) e4);
        } catch (AssertionError e5) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e5.getMessage());
            assertionError.initCause(e5);
            throw assertionError;
        } catch (Throwable th) {
            cVar.B(k4);
            cVar.y(j5);
            cVar.C(i4);
            throw th;
        }
    }

    public void v(Object obj, Type type, Appendable appendable) {
        try {
            u(obj, type, o(k.c(appendable)));
        } catch (IOException e4) {
            throw new i((Throwable) e4);
        }
    }
}
