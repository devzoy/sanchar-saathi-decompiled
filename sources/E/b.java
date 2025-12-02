package E;

import R.d;
import R.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import v.g;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final d f873a = new e(10);

    /* renamed from: b  reason: collision with root package name */
    public final g f874b = new g();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f875c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f876d = new HashSet();

    public void a(Object obj, Object obj2) {
        if (!this.f874b.containsKey(obj) || !this.f874b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f874b.get(obj);
        if (arrayList == null) {
            arrayList = f();
            this.f874b.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public void b(Object obj) {
        if (!this.f874b.containsKey(obj)) {
            this.f874b.put(obj, (Object) null);
        }
    }

    public void c() {
        int size = this.f874b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList arrayList = (ArrayList) this.f874b.m(i4);
            if (arrayList != null) {
                j(arrayList);
            }
        }
        this.f874b.clear();
    }

    public boolean d(Object obj) {
        return this.f874b.containsKey(obj);
    }

    public final void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) this.f874b.get(obj);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        e(arrayList2.get(i4), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public final ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f873a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public List g(Object obj) {
        int size = this.f874b.size();
        ArrayList arrayList = null;
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList arrayList2 = (ArrayList) this.f874b.m(i4);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f874b.i(i4));
            }
        }
        return arrayList;
    }

    public ArrayList h() {
        this.f875c.clear();
        this.f876d.clear();
        int size = this.f874b.size();
        for (int i4 = 0; i4 < size; i4++) {
            e(this.f874b.i(i4), this.f875c, this.f876d);
        }
        return this.f875c;
    }

    public boolean i(Object obj) {
        int size = this.f874b.size();
        for (int i4 = 0; i4 < size; i4++) {
            ArrayList arrayList = (ArrayList) this.f874b.m(i4);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j(ArrayList arrayList) {
        arrayList.clear();
        this.f873a.a(arrayList);
    }
}
