package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.j0  reason: case insensitive filesystem */
public final class C0434j0 extends C0459s implements C0437k0, RandomAccess {

    /* renamed from: g  reason: collision with root package name */
    public static final C0434j0 f7115g;

    /* renamed from: h  reason: collision with root package name */
    public static final C0437k0 f7116h;

    /* renamed from: f  reason: collision with root package name */
    public final List f7117f;

    static {
        C0434j0 j0Var = new C0434j0();
        f7115g = j0Var;
        j0Var.m();
        f7116h = j0Var;
    }

    public C0434j0() {
        this(10);
    }

    public static String t(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C0477y ? ((C0477y) obj).D() : C0413c0.h((byte[]) obj);
    }

    public final /* synthetic */ void add(int i4, Object obj) {
        s();
        this.f7117f.add(i4, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i4, Collection collection) {
        s();
        if (collection instanceof C0437k0) {
            collection = ((C0437k0) collection).l();
        }
        boolean addAll = this.f7117f.addAll(i4, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        s();
        this.f7117f.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final Object g(int i4) {
        return this.f7117f.get(i4);
    }

    public final /* synthetic */ Object get(int i4) {
        Object obj = this.f7117f.get(i4);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0477y) {
            C0477y yVar = (C0477y) obj;
            String D4 = yVar.D();
            if (yVar.w()) {
                this.f7117f.set(i4, D4);
            }
            return D4;
        }
        byte[] bArr = (byte[]) obj;
        String h4 = C0413c0.h(bArr);
        if (C0413c0.g(bArr)) {
            this.f7117f.set(i4, h4);
        }
        return h4;
    }

    public final /* synthetic */ C0422f0 h(int i4) {
        if (i4 >= size()) {
            ArrayList arrayList = new ArrayList(i4);
            arrayList.addAll(this.f7117f);
            return new C0434j0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    public final List l() {
        return Collections.unmodifiableList(this.f7117f);
    }

    public final C0437k0 p() {
        return j() ? new C0414c1(this) : this;
    }

    public final /* synthetic */ Object remove(int i4) {
        s();
        Object remove = this.f7117f.remove(i4);
        this.modCount++;
        return t(remove);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i4, Object obj) {
        s();
        return t(this.f7117f.set(i4, (String) obj));
    }

    public final int size() {
        return this.f7117f.size();
    }

    public C0434j0(int i4) {
        this(new ArrayList(i4));
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C0434j0(ArrayList arrayList) {
        this.f7117f = arrayList;
    }
}
