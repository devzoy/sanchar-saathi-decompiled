package z1;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import u1.d;
import v1.C0947a;
import v1.C0952f;
import w1.C0971d;
import w1.C0977j;

/* renamed from: z1.h  reason: case insensitive filesystem */
public abstract class C1025h extends C1021d implements C0947a.f {

    /* renamed from: J  reason: collision with root package name */
    public static volatile Executor f12991J;

    /* renamed from: G  reason: collision with root package name */
    public final C1022e f12992G;

    /* renamed from: H  reason: collision with root package name */
    public final Set f12993H;

    /* renamed from: I  reason: collision with root package name */
    public final Account f12994I;

    public C1025h(Context context, Looper looper, int i4, C1022e eVar, C0952f.a aVar, C0952f.b bVar) {
        this(context, looper, i4, eVar, (C0971d) aVar, (C0977j) bVar);
    }

    public static void k0(Executor executor) {
        f12991J = executor;
    }

    public final Set B() {
        return this.f12993H;
    }

    public Set c() {
        return o() ? this.f12993H : Collections.emptySet();
    }

    public Set i0(Set set) {
        return set;
    }

    public final Set j0(Set set) {
        Set<Scope> i02 = i0(set);
        for (Scope contains : i02) {
            if (!set.contains(contains)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return i02;
    }

    public final Account t() {
        return this.f12994I;
    }

    public Executor v() {
        return f12991J;
    }

    public C1025h(Context context, Looper looper, int i4, C1022e eVar, C0971d dVar, C0977j jVar) {
        this(context, looper, C1026i.a(context), d.m(), i4, eVar, (C0971d) C1032o.f(dVar), (C0977j) C1032o.f(jVar));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1025h(android.content.Context r11, android.os.Looper r12, z1.C1026i r13, u1.d r14, int r15, z1.C1022e r16, w1.C0971d r17, w1.C0977j r18) {
        /*
            r10 = this;
            r9 = r10
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r6 = r2
            goto L_0x0010
        L_0x000a:
            z1.A r3 = new z1.A
            r3.<init>(r0)
            r6 = r3
        L_0x0010:
            if (r1 != 0) goto L_0x0014
            r7 = r2
            goto L_0x001a
        L_0x0014:
            z1.B r0 = new z1.B
            r0.<init>(r1)
            r7 = r0
        L_0x001a:
            java.lang.String r8 = r16.f()
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = r16
            r9.f12992G = r0
            android.accounts.Account r1 = r16.a()
            r9.f12994I = r1
            java.util.Set r0 = r16.c()
            java.util.Set r0 = r10.j0(r0)
            r9.f12993H = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.C1025h.<init>(android.content.Context, android.os.Looper, z1.i, u1.d, int, z1.e, w1.d, w1.j):void");
    }
}
