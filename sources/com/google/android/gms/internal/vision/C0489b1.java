package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.b1  reason: case insensitive filesystem */
public final class C0489b1 extends C0484a0 implements C0497d1, RandomAccess {

    /* renamed from: g  reason: collision with root package name */
    public static final C0489b1 f7415g;

    /* renamed from: h  reason: collision with root package name */
    public static final C0497d1 f7416h;

    /* renamed from: f  reason: collision with root package name */
    public final List f7417f;

    static {
        C0489b1 b1Var = new C0489b1();
        f7415g = b1Var;
        b1Var.d();
        f7416h = b1Var;
    }

    public C0489b1() {
        this(10);
    }

    public static String t(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C0507g0 ? ((C0507g0) obj).E() : R0.i((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    public final /* synthetic */ void add(int i4, Object obj) {
        s();
        this.f7417f.add(i4, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final /* synthetic */ X0 b(int i4) {
        if (i4 >= size()) {
            ArrayList arrayList = new ArrayList(i4);
            arrayList.addAll(this.f7417f);
            return new C0489b1(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final C0497d1 c() {
        return a() ? new f2(this) : this;
    }

    public final void clear() {
        s();
        this.f7417f.clear();
        this.modCount++;
    }

    public final List e() {
        return Collections.unmodifiableList(this.f7417f);
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final Object f(int i4) {
        return this.f7417f.get(i4);
    }

    public final /* synthetic */ Object get(int i4) {
        Object obj = this.f7417f.get(i4);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0507g0) {
            C0507g0 g0Var = (C0507g0) obj;
            String E4 = g0Var.E();
            if (g0Var.G()) {
                this.f7417f.set(i4, E4);
            }
            return E4;
        }
        byte[] bArr = (byte[]) obj;
        String i5 = R0.i(bArr);
        if (R0.h(bArr)) {
            this.f7417f.set(i4, i5);
        }
        return i5;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final void n(C0507g0 g0Var) {
        s();
        this.f7417f.add(g0Var);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i4, Object obj) {
        s();
        return t(this.f7417f.set(i4, (String) obj));
    }

    public final int size() {
        return this.f7417f.size();
    }

    public C0489b1(int i4) {
        this(new ArrayList(i4));
    }

    public final boolean addAll(int i4, Collection collection) {
        s();
        if (collection instanceof C0497d1) {
            collection = ((C0497d1) collection).e();
        }
        boolean addAll = this.f7417f.addAll(i4, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i4) {
        s();
        Object remove = this.f7417f.remove(i4);
        this.modCount++;
        return t(remove);
    }

    public C0489b1(ArrayList arrayList) {
        this.f7417f = arrayList;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }
}
