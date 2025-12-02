package com.google.gson;

import D2.c;
import com.google.gson.internal.k;
import java.io.IOException;
import java.io.StringWriter;

public abstract class h {
    public boolean A() {
        return this instanceof m;
    }

    public boolean s() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public e t() {
        if (x()) {
            return (e) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c cVar = new c(stringWriter);
            cVar.B(true);
            k.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e4) {
            throw new AssertionError(e4);
        }
    }

    public k u() {
        if (z()) {
            return (k) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public m v() {
        if (A()) {
            return (m) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String w() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean x() {
        return this instanceof e;
    }

    public boolean y() {
        return this instanceof j;
    }

    public boolean z() {
        return this instanceof k;
    }
}
