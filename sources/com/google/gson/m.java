package com.google.gson;

import com.google.gson.internal.a;
import com.google.gson.internal.f;
import java.math.BigInteger;

public final class m extends h {

    /* renamed from: e  reason: collision with root package name */
    public final Object f8572e;

    public m(Boolean bool) {
        this.f8572e = a.b(bool);
    }

    public static boolean G(m mVar) {
        Object obj = mVar.f8572e;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public double B() {
        return H() ? E().doubleValue() : Double.parseDouble(w());
    }

    public int C() {
        return H() ? E().intValue() : Integer.parseInt(w());
    }

    public long D() {
        return H() ? E().longValue() : Long.parseLong(w());
    }

    public Number E() {
        Object obj = this.f8572e;
        return obj instanceof String ? new f((String) obj) : (Number) obj;
    }

    public boolean F() {
        return this.f8572e instanceof Boolean;
    }

    public boolean H() {
        return this.f8572e instanceof Number;
    }

    public boolean I() {
        return this.f8572e instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f8572e == null) {
            return mVar.f8572e == null;
        }
        if (G(this) && G(mVar)) {
            return E().longValue() == mVar.E().longValue();
        }
        Object obj2 = this.f8572e;
        if (!(obj2 instanceof Number) || !(mVar.f8572e instanceof Number)) {
            return obj2.equals(mVar.f8572e);
        }
        double doubleValue = E().doubleValue();
        double doubleValue2 = mVar.E().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f8572e == null) {
            return 31;
        }
        if (G(this)) {
            doubleToLongBits = E().longValue();
        } else {
            Object obj = this.f8572e;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(E().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean s() {
        return F() ? ((Boolean) this.f8572e).booleanValue() : Boolean.parseBoolean(w());
    }

    public String w() {
        return H() ? E().toString() : F() ? ((Boolean) this.f8572e).toString() : (String) this.f8572e;
    }

    public m(Number number) {
        this.f8572e = a.b(number);
    }

    public m(String str) {
        this.f8572e = a.b(str);
    }
}
