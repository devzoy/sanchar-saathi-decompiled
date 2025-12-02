package com.google.gson.internal.bind;

import D2.b;
import D2.c;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.o;
import com.google.gson.q;
import com.google.gson.r;
import com.google.gson.s;

public final class NumberTypeAdapter extends TypeAdapter {

    /* renamed from: b  reason: collision with root package name */
    public static final s f8385b = g(q.LAZILY_PARSED_NUMBER);

    /* renamed from: a  reason: collision with root package name */
    public final r f8386a;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8388a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                D2.b[] r0 = D2.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8388a = r0
                D2.b r1 = D2.b.NULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8388a     // Catch:{ NoSuchFieldError -> 0x001d }
                D2.b r1 = D2.b.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8388a     // Catch:{ NoSuchFieldError -> 0x0028 }
                D2.b r1 = D2.b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.NumberTypeAdapter.a.<clinit>():void");
        }
    }

    public NumberTypeAdapter(r rVar) {
        this.f8386a = rVar;
    }

    public static s f(r rVar) {
        return rVar == q.LAZILY_PARSED_NUMBER ? f8385b : g(rVar);
    }

    public static s g(r rVar) {
        return new s() {
            public TypeAdapter create(Gson gson, C2.a aVar) {
                if (aVar.c() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    /* renamed from: h */
    public Number c(D2.a aVar) {
        b F4 = aVar.F();
        int i4 = a.f8388a[F4.ordinal()];
        if (i4 == 1) {
            aVar.z();
            return null;
        } else if (i4 == 2 || i4 == 3) {
            return this.f8386a.b(aVar);
        } else {
            throw new o("Expecting number, got: " + F4);
        }
    }

    /* renamed from: i */
    public void e(c cVar, Number number) {
        cVar.J(number);
    }
}
