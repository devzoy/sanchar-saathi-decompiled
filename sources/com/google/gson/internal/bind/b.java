package com.google.gson.internal.bind;

import D2.c;
import com.google.gson.e;
import com.google.gson.h;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.m;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class b extends c {

    /* renamed from: s  reason: collision with root package name */
    public static final Writer f8499s = new a();

    /* renamed from: t  reason: collision with root package name */
    public static final m f8500t = new m("closed");

    /* renamed from: p  reason: collision with root package name */
    public final List f8501p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public String f8502q;

    /* renamed from: r  reason: collision with root package name */
    public h f8503r = j.f8570e;

    public class a extends Writer {
        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i4, int i5) {
            throw new AssertionError();
        }
    }

    public b() {
        super(f8499s);
    }

    public c F(long j4) {
        P(new m((Number) Long.valueOf(j4)));
        return this;
    }

    public c H(Boolean bool) {
        if (bool == null) {
            return r();
        }
        P(new m(bool));
        return this;
    }

    public c J(Number number) {
        if (number == null) {
            return r();
        }
        if (!k()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        P(new m(number));
        return this;
    }

    public c K(String str) {
        if (str == null) {
            return r();
        }
        P(new m(str));
        return this;
    }

    public c L(boolean z4) {
        P(new m(Boolean.valueOf(z4)));
        return this;
    }

    public h N() {
        if (this.f8501p.isEmpty()) {
            return this.f8503r;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f8501p);
    }

    public final h O() {
        List list = this.f8501p;
        return (h) list.get(list.size() - 1);
    }

    public final void P(h hVar) {
        if (this.f8502q != null) {
            if (!hVar.y() || i()) {
                ((k) O()).B(this.f8502q, hVar);
            }
            this.f8502q = null;
        } else if (this.f8501p.isEmpty()) {
            this.f8503r = hVar;
        } else {
            h O4 = O();
            if (O4 instanceof e) {
                ((e) O4).B(hVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public void close() {
        if (this.f8501p.isEmpty()) {
            this.f8501p.add(f8500t);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d() {
        e eVar = new e();
        P(eVar);
        this.f8501p.add(eVar);
        return this;
    }

    public c e() {
        k kVar = new k();
        P(kVar);
        this.f8501p.add(kVar);
        return this;
    }

    public void flush() {
    }

    public c g() {
        if (this.f8501p.isEmpty() || this.f8502q != null) {
            throw new IllegalStateException();
        } else if (O() instanceof e) {
            List list = this.f8501p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c h() {
        if (this.f8501p.isEmpty() || this.f8502q != null) {
            throw new IllegalStateException();
        } else if (O() instanceof k) {
            List list = this.f8501p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c l(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f8501p.isEmpty() || this.f8502q != null) {
            throw new IllegalStateException();
        } else if (O() instanceof k) {
            this.f8502q = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c r() {
        P(j.f8570e);
        return this;
    }
}
