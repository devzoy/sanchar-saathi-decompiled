package S1;

import S1.b;
import android.util.SparseArray;
import java.util.HashSet;

public class e implements b.C0058b {

    /* renamed from: a  reason: collision with root package name */
    public b f2777a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray f2778b;

    /* renamed from: c  reason: collision with root package name */
    public int f2779c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public e f2780a;

        public a(b bVar) {
            e eVar = new e();
            this.f2780a = eVar;
            if (bVar != null) {
                b unused = eVar.f2777a = bVar;
                return;
            }
            throw new IllegalArgumentException("No factory supplied.");
        }

        public e a() {
            return this.f2780a;
        }
    }

    public interface b {
        f a(Object obj);
    }

    public class c {

        /* renamed from: a  reason: collision with root package name */
        public f f2781a;

        /* renamed from: b  reason: collision with root package name */
        public int f2782b;

        public c(e eVar) {
            this.f2782b = 0;
        }

        public static /* synthetic */ int d(c cVar) {
            int i4 = cVar.f2782b;
            cVar.f2782b = i4 + 1;
            return i4;
        }
    }

    public e() {
        this.f2778b = new SparseArray();
        this.f2779c = 3;
    }

    public void a(b.a aVar) {
        SparseArray a4 = aVar.a();
        for (int i4 = 0; i4 < a4.size(); i4++) {
            int keyAt = a4.keyAt(i4);
            Object valueAt = a4.valueAt(i4);
            if (this.f2778b.get(keyAt) == null) {
                c cVar = new c();
                f unused = cVar.f2781a = this.f2777a.a(valueAt);
                cVar.f2781a.c(keyAt, valueAt);
                this.f2778b.append(keyAt, cVar);
            }
        }
        SparseArray a5 = aVar.a();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i5 = 0; i5 < this.f2778b.size(); i5++) {
            int keyAt2 = this.f2778b.keyAt(i5);
            if (a5.get(keyAt2) == null) {
                c cVar2 = (c) this.f2778b.valueAt(i5);
                c.d(cVar2);
                if (cVar2.f2782b >= this.f2779c) {
                    cVar2.f2781a.a();
                    hashSet.add(Integer.valueOf(keyAt2));
                } else {
                    cVar2.f2781a.b(aVar);
                }
            }
        }
        for (Integer intValue : hashSet) {
            this.f2778b.delete(intValue.intValue());
        }
        SparseArray a6 = aVar.a();
        for (int i6 = 0; i6 < a6.size(); i6++) {
            int keyAt3 = a6.keyAt(i6);
            Object valueAt2 = a6.valueAt(i6);
            c cVar3 = (c) this.f2778b.get(keyAt3);
            int unused2 = cVar3.f2782b = 0;
            cVar3.f2781a.d(aVar, valueAt2);
        }
    }

    public void release() {
        for (int i4 = 0; i4 < this.f2778b.size(); i4++) {
            ((c) this.f2778b.valueAt(i4)).f2781a.a();
        }
        this.f2778b.clear();
    }
}
