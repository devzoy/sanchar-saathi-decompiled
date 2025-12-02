package com.google.gson.internal.bind;

import D2.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.g;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.s;
import java.util.ArrayList;

public final class ObjectTypeAdapter extends TypeAdapter {

    /* renamed from: c  reason: collision with root package name */
    public static final s f8389c = g(q.DOUBLE);

    /* renamed from: a  reason: collision with root package name */
    public final Gson f8390a;

    /* renamed from: b  reason: collision with root package name */
    public final r f8391b;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8393a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                D2.b[] r0 = D2.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8393a = r0
                D2.b r1 = D2.b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8393a     // Catch:{ NoSuchFieldError -> 0x001d }
                D2.b r1 = D2.b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8393a     // Catch:{ NoSuchFieldError -> 0x0028 }
                D2.b r1 = D2.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8393a     // Catch:{ NoSuchFieldError -> 0x0033 }
                D2.b r1 = D2.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f8393a     // Catch:{ NoSuchFieldError -> 0x003e }
                D2.b r1 = D2.b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f8393a     // Catch:{ NoSuchFieldError -> 0x0049 }
                D2.b r1 = D2.b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ObjectTypeAdapter.a.<clinit>():void");
        }
    }

    public static s f(r rVar) {
        return rVar == q.DOUBLE ? f8389c : g(rVar);
    }

    private static s g(final r rVar) {
        return new s() {
            public TypeAdapter create(Gson gson, C2.a aVar) {
                if (aVar.c() == Object.class) {
                    return new ObjectTypeAdapter(gson, r.this);
                }
                return null;
            }
        };
    }

    public Object c(D2.a aVar) {
        switch (a.f8393a[aVar.F().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.b();
                while (aVar.j()) {
                    arrayList.add(c(aVar));
                }
                aVar.g();
                return arrayList;
            case 2:
                g gVar = new g();
                aVar.c();
                while (aVar.j()) {
                    gVar.put(aVar.x(), c(aVar));
                }
                aVar.h();
                return gVar;
            case 3:
                return aVar.C();
            case 4:
                return this.f8391b.b(aVar);
            case 5:
                return Boolean.valueOf(aVar.r());
            case 6:
                aVar.z();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public void e(c cVar, Object obj) {
        if (obj == null) {
            cVar.r();
            return;
        }
        TypeAdapter k4 = this.f8390a.k(obj.getClass());
        if (k4 instanceof ObjectTypeAdapter) {
            cVar.e();
            cVar.h();
            return;
        }
        k4.e(cVar, obj);
    }

    public ObjectTypeAdapter(Gson gson, r rVar) {
        this.f8390a = gson;
        this.f8391b = rVar;
    }
}
