package com.google.android.gms.internal.vision;

import android.support.v4.media.session.b;
import com.google.android.gms.internal.vision.N0;
import java.util.Collections;
import java.util.Map;

public class A0 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile A0 f7190b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile A0 f7191c;

    /* renamed from: d  reason: collision with root package name */
    public static final A0 f7192d = new A0(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map f7193a = Collections.emptyMap();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Object f7194a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7195b;

        public a(Object obj, int i4) {
            this.f7194a = obj;
            this.f7195b = i4;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f7194a == aVar.f7194a && this.f7195b == aVar.f7195b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f7194a) * 65535) + this.f7195b;
        }
    }

    public A0(boolean z4) {
    }

    public static A0 b() {
        A0 a02 = f7190b;
        if (a02 == null) {
            synchronized (A0.class) {
                try {
                    a02 = f7190b;
                    if (a02 == null) {
                        a02 = f7192d;
                        f7190b = a02;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return a02;
    }

    public static A0 c() {
        A0 a02 = f7191c;
        if (a02 != null) {
            return a02;
        }
        synchronized (A0.class) {
            try {
                A0 a03 = f7191c;
                if (a03 != null) {
                    return a03;
                }
                A0 a4 = K0.a(A0.class);
                f7191c = a4;
                return a4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final N0.c a(C0546t1 t1Var, int i4) {
        b.a(this.f7193a.get(new a(t1Var, i4)));
        return null;
    }
}
