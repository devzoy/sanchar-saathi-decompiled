package com.google.android.gms.internal.vision;

import java.util.Map;

public final class T1 implements Comparable, Map.Entry {

    /* renamed from: e  reason: collision with root package name */
    public final Comparable f7382e;

    /* renamed from: f  reason: collision with root package name */
    public Object f7383f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ O1 f7384g;

    public T1(O1 o12, Map.Entry entry) {
        this(o12, (Comparable) entry.getKey(), entry.getValue());
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((T1) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return b(this.f7382e, entry.getKey()) && b(this.f7383f, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.f7382e;
    }

    public final Object getValue() {
        return this.f7383f;
    }

    public final int hashCode() {
        Comparable comparable = this.f7382e;
        int i4 = 0;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f7383f;
        if (obj != null) {
            i4 = obj.hashCode();
        }
        return hashCode ^ i4;
    }

    public final Object setValue(Object obj) {
        this.f7384g.p();
        Object obj2 = this.f7383f;
        this.f7383f = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f7382e);
        String valueOf2 = String.valueOf(this.f7383f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    public T1(O1 o12, Comparable comparable, Object obj) {
        this.f7384g = o12;
        this.f7382e = comparable;
        this.f7383f = obj;
    }
}
