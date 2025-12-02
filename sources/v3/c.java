package v3;

import A3.d;
import java.io.Serializable;
import t3.b;

public abstract class c implements A3.a, Serializable {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f12444k = a.f12451e;

    /* renamed from: e  reason: collision with root package name */
    public transient A3.a f12445e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f12446f;

    /* renamed from: g  reason: collision with root package name */
    public final Class f12447g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12448h;

    /* renamed from: i  reason: collision with root package name */
    public final String f12449i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f12450j;

    public static class a implements Serializable {

        /* renamed from: e  reason: collision with root package name */
        public static final a f12451e = new a();
    }

    public c(Object obj, Class cls, String str, String str2, boolean z4) {
        this.f12446f = obj;
        this.f12447g = cls;
        this.f12448h = str;
        this.f12449i = str2;
        this.f12450j = z4;
    }

    public A3.a a() {
        A3.a aVar = this.f12445e;
        if (aVar != null) {
            return aVar;
        }
        A3.a b4 = b();
        this.f12445e = b4;
        return b4;
    }

    public abstract A3.a b();

    public Object e() {
        return this.f12446f;
    }

    public String j() {
        return this.f12448h;
    }

    public d l() {
        Class cls = this.f12447g;
        if (cls == null) {
            return null;
        }
        return this.f12450j ? x.c(cls) : x.b(cls);
    }

    public A3.a m() {
        A3.a a4 = a();
        if (a4 != this) {
            return a4;
        }
        throw new b();
    }

    public String n() {
        return this.f12449i;
    }
}
