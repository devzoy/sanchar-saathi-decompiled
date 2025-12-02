package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;

public class I {

    /* renamed from: a  reason: collision with root package name */
    public final a f5036a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5037b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5038c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final r0.b f5039a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f5040b;

        /* renamed from: c  reason: collision with root package name */
        public final r0.b f5041c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f5042d;

        public a(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
            this.f5039a = bVar;
            this.f5040b = obj;
            this.f5041c = bVar2;
            this.f5042d = obj2;
        }
    }

    public I(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        this.f5036a = new a(bVar, obj, bVar2, obj2);
        this.f5037b = obj;
        this.f5038c = obj2;
    }

    public static int b(a aVar, Object obj, Object obj2) {
        return C0366s.b(aVar.f5039a, 1, obj) + C0366s.b(aVar.f5041c, 2, obj2);
    }

    public static I d(r0.b bVar, Object obj, r0.b bVar2, Object obj2) {
        return new I(bVar, obj, bVar2, obj2);
    }

    public static void e(C0358j jVar, a aVar, Object obj, Object obj2) {
        C0366s.u(jVar, aVar.f5039a, 1, obj);
        C0366s.u(jVar, aVar.f5041c, 2, obj2);
    }

    public int a(int i4, Object obj, Object obj2) {
        return C0358j.O(i4) + C0358j.y(b(this.f5036a, obj, obj2));
    }

    public a c() {
        return this.f5036a;
    }
}
