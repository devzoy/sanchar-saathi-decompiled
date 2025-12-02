package com.google.gson.internal;

import C2.a;
import D2.c;
import android.support.v4.media.session.b;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.s;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import z2.C1043a;
import z2.d;
import z2.e;

public final class Excluder implements s, Cloneable {

    /* renamed from: k  reason: collision with root package name */
    public static final Excluder f8346k = new Excluder();

    /* renamed from: e  reason: collision with root package name */
    public double f8347e = -1.0d;

    /* renamed from: f  reason: collision with root package name */
    public int f8348f = 136;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8349g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8350h;

    /* renamed from: i  reason: collision with root package name */
    public List f8351i = Collections.emptyList();

    /* renamed from: j  reason: collision with root package name */
    public List f8352j = Collections.emptyList();

    /* renamed from: a */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public boolean b(Class cls, boolean z4) {
        return e(cls) || g(cls, z4);
    }

    public TypeAdapter create(Gson gson, a aVar) {
        Class c4 = aVar.c();
        boolean e4 = e(c4);
        final boolean z4 = e4 || g(c4, true);
        final boolean z5 = e4 || g(c4, false);
        if (!z4 && !z5) {
            return null;
        }
        final Gson gson2 = gson;
        final a aVar2 = aVar;
        return new TypeAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public TypeAdapter f8353a;

            public Object c(D2.a aVar) {
                if (!z5) {
                    return f().c(aVar);
                }
                aVar.R();
                return null;
            }

            public void e(c cVar, Object obj) {
                if (z4) {
                    cVar.r();
                } else {
                    f().e(cVar, obj);
                }
            }

            public final TypeAdapter f() {
                TypeAdapter typeAdapter = this.f8353a;
                if (typeAdapter != null) {
                    return typeAdapter;
                }
                TypeAdapter l4 = gson2.l(Excluder.this, aVar2);
                this.f8353a = l4;
                return l4;
            }
        };
    }

    public final boolean e(Class cls) {
        if (this.f8347e == -1.0d || p((d) cls.getAnnotation(d.class), (e) cls.getAnnotation(e.class))) {
            return (!this.f8349g && l(cls)) || k(cls);
        }
        return true;
    }

    public final boolean g(Class cls, boolean z4) {
        Iterator it = (z4 ? this.f8351i : this.f8352j).iterator();
        if (!it.hasNext()) {
            return false;
        }
        b.a(it.next());
        throw null;
    }

    public boolean h(Field field, boolean z4) {
        C1043a aVar;
        if ((this.f8348f & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f8347e != -1.0d && !p((d) field.getAnnotation(d.class), (e) field.getAnnotation(e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f8350h && ((aVar = (C1043a) field.getAnnotation(C1043a.class)) == null || (!z4 ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.f8349g && l(field.getType())) || k(field.getType())) {
            return true;
        }
        List list = z4 ? this.f8351i : this.f8352j;
        if (list.isEmpty()) {
            return false;
        }
        new com.google.gson.a(field);
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        b.a(it.next());
        throw null;
    }

    public final boolean k(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && !m(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean l(Class cls) {
        return cls.isMemberClass() && !m(cls);
    }

    public final boolean m(Class cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean n(d dVar) {
        return dVar == null || dVar.value() <= this.f8347e;
    }

    public final boolean o(e eVar) {
        return eVar == null || eVar.value() > this.f8347e;
    }

    public final boolean p(d dVar, e eVar) {
        return n(dVar) && o(eVar);
    }
}
