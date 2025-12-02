package m3;

import h3.C0668i;
import l3.e;
import l3.i;
import n3.C0807a;
import n3.d;
import n3.h;
import n3.j;
import u3.p;
import v3.l;
import v3.z;

/* renamed from: m3.b  reason: case insensitive filesystem */
public abstract class C0794b {

    /* renamed from: m3.b$a */
    public static final class a extends j {

        /* renamed from: f  reason: collision with root package name */
        public int f11147f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ p f11148g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Object f11149h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e eVar, p pVar, Object obj) {
            super(eVar);
            this.f11148g = pVar;
            this.f11149h = obj;
            l.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        public Object o(Object obj) {
            int i4 = this.f11147f;
            if (i4 == 0) {
                this.f11147f = 1;
                C0668i.b(obj);
                l.c(this.f11148g, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) z.a(this.f11148g, 2)).g(this.f11149h, this);
            } else if (i4 == 1) {
                this.f11147f = 2;
                C0668i.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed");
            }
        }
    }

    /* renamed from: m3.b$b  reason: collision with other inner class name */
    public static final class C0185b extends d {

        /* renamed from: h  reason: collision with root package name */
        public int f11150h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ p f11151i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Object f11152j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0185b(e eVar, i iVar, p pVar, Object obj) {
            super(eVar, iVar);
            this.f11151i = pVar;
            this.f11152j = obj;
            l.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        public Object o(Object obj) {
            int i4 = this.f11150h;
            if (i4 == 0) {
                this.f11150h = 1;
                C0668i.b(obj);
                l.c(this.f11151i, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) z.a(this.f11151i, 2)).g(this.f11152j, this);
            } else if (i4 == 1) {
                this.f11150h = 2;
                C0668i.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed");
            }
        }
    }

    public static e a(p pVar, Object obj, e eVar) {
        l.e(pVar, "<this>");
        l.e(eVar, "completion");
        e a4 = h.a(eVar);
        if (pVar instanceof C0807a) {
            return ((C0807a) pVar).j(obj, a4);
        }
        i a5 = a4.a();
        return a5 == l3.j.f11131e ? new a(a4, pVar, obj) : new C0185b(a4, a5, pVar, obj);
    }

    public static e b(e eVar) {
        e r4;
        l.e(eVar, "<this>");
        d dVar = eVar instanceof d ? (d) eVar : null;
        return (dVar == null || (r4 = dVar.r()) == null) ? eVar : r4;
    }
}
