package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e extends h implements Iterable {

    /* renamed from: e  reason: collision with root package name */
    public final List f8345e = new ArrayList();

    public void B(h hVar) {
        if (hVar == null) {
            hVar = j.f8570e;
        }
        this.f8345e.add(hVar);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof e) && ((e) obj).f8345e.equals(this.f8345e));
    }

    public int hashCode() {
        return this.f8345e.hashCode();
    }

    public Iterator iterator() {
        return this.f8345e.iterator();
    }

    public boolean s() {
        if (this.f8345e.size() == 1) {
            return ((h) this.f8345e.get(0)).s();
        }
        throw new IllegalStateException();
    }

    public String w() {
        if (this.f8345e.size() == 1) {
            return ((h) this.f8345e.get(0)).w();
        }
        throw new IllegalStateException();
    }
}
