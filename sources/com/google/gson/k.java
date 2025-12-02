package com.google.gson;

import com.google.gson.internal.g;
import java.util.Set;

public final class k extends h {

    /* renamed from: e  reason: collision with root package name */
    public final g f8571e = new g();

    public void B(String str, h hVar) {
        g gVar = this.f8571e;
        if (hVar == null) {
            hVar = j.f8570e;
        }
        gVar.put(str, hVar);
    }

    public Set C() {
        return this.f8571e.entrySet();
    }

    public boolean D(String str) {
        return this.f8571e.containsKey(str);
    }

    public h E(String str) {
        return (h) this.f8571e.remove(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof k) && ((k) obj).f8571e.equals(this.f8571e));
    }

    public int hashCode() {
        return this.f8571e.hashCode();
    }
}
