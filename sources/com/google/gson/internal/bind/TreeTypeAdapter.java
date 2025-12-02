package com.google.gson.internal.bind;

import D2.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.internal.k;
import com.google.gson.n;
import com.google.gson.s;

public final class TreeTypeAdapter<T> extends TypeAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final g f8411a;

    /* renamed from: b  reason: collision with root package name */
    public final Gson f8412b;

    /* renamed from: c  reason: collision with root package name */
    public final C2.a f8413c;

    /* renamed from: d  reason: collision with root package name */
    public final s f8414d;

    /* renamed from: e  reason: collision with root package name */
    public final b f8415e = new b();

    /* renamed from: f  reason: collision with root package name */
    public TypeAdapter f8416f;

    public static final class SingleTypeFactory implements s {

        /* renamed from: e  reason: collision with root package name */
        public final C2.a f8417e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f8418f;

        /* renamed from: g  reason: collision with root package name */
        public final Class f8419g;

        /* renamed from: h  reason: collision with root package name */
        public final g f8420h;

        public SingleTypeFactory(Object obj, C2.a aVar, boolean z4, Class cls) {
            g gVar = obj instanceof g ? (g) obj : null;
            this.f8420h = gVar;
            com.google.gson.internal.a.a(gVar != null);
            this.f8417e = aVar;
            this.f8418f = z4;
            this.f8419g = cls;
        }

        public TypeAdapter create(Gson gson, C2.a aVar) {
            C2.a aVar2 = this.f8417e;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f8418f && this.f8417e.e() == aVar.c()) : this.f8419g.isAssignableFrom(aVar.c())) {
                return new TreeTypeAdapter((n) null, this.f8420h, gson, aVar, this);
            }
            return null;
        }
    }

    public final class b implements f {
        public b() {
        }
    }

    public TreeTypeAdapter(n nVar, g gVar, Gson gson, C2.a aVar, s sVar) {
        this.f8411a = gVar;
        this.f8412b = gson;
        this.f8413c = aVar;
        this.f8414d = sVar;
    }

    private TypeAdapter f() {
        TypeAdapter typeAdapter = this.f8416f;
        if (typeAdapter != null) {
            return typeAdapter;
        }
        TypeAdapter l4 = this.f8412b.l(this.f8414d, this.f8413c);
        this.f8416f = l4;
        return l4;
    }

    public static s g(C2.a aVar, Object obj) {
        return new SingleTypeFactory(obj, aVar, aVar.e() == aVar.c(), (Class) null);
    }

    public Object c(D2.a aVar) {
        if (this.f8411a == null) {
            return f().c(aVar);
        }
        h a4 = k.a(aVar);
        if (a4.y()) {
            return null;
        }
        return this.f8411a.a(a4, this.f8413c.e(), this.f8415e);
    }

    public void e(c cVar, Object obj) {
        f().e(cVar, obj);
    }
}
