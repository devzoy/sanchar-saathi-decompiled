package c0;

import D3.C0248i;
import D3.I;
import D3.K;
import D3.p0;
import F3.d;
import F3.g;
import F3.h;
import F3.n;
import h3.C0673n;
import l3.e;
import l3.i;
import n3.k;
import u3.l;
import u3.p;
import v3.m;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final I f6474a;

    /* renamed from: b  reason: collision with root package name */
    public final p f6475b;

    /* renamed from: c  reason: collision with root package name */
    public final d f6476c = g.b(Integer.MAX_VALUE, (F3.a) null, (l) null, 6, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    public final C0399a f6477d = new C0399a(0);

    public static final class a extends m implements l {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f6478f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ t f6479g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ p f6480h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(l lVar, t tVar, p pVar) {
            super(1);
            this.f6478f = lVar;
            this.f6479g = tVar;
            this.f6480h = pVar;
        }

        public final void a(Throwable th) {
            C0673n nVar;
            this.f6478f.i(th);
            this.f6479g.f6476c.o(th);
            do {
                Object d4 = h.d(this.f6479g.f6476c.C());
                if (d4 != null) {
                    this.f6480h.g(d4, th);
                    nVar = C0673n.f9639a;
                    continue;
                } else {
                    nVar = null;
                    continue;
                }
            } while (nVar != null);
        }

        public /* bridge */ /* synthetic */ Object i(Object obj) {
            a((Throwable) obj);
            return C0673n.f9639a;
        }
    }

    public static final class b extends k implements p {

        /* renamed from: i  reason: collision with root package name */
        public Object f6481i;

        /* renamed from: j  reason: collision with root package name */
        public int f6482j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ t f6483k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(t tVar, e eVar) {
            super(2, eVar);
            this.f6483k = tVar;
        }

        public final e j(Object obj, e eVar) {
            return new b(this.f6483k, eVar);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x005c A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0069  */
        public final java.lang.Object o(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = m3.C0795c.c()
                int r1 = r5.f6482j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                h3.C0668i.b(r6)
                goto L_0x005d
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r1 = r5.f6481i
                u3.p r1 = (u3.p) r1
                h3.C0668i.b(r6)
                goto L_0x0051
            L_0x0022:
                h3.C0668i.b(r6)
                c0.t r6 = r5.f6483k
                c0.a r6 = r6.f6477d
                int r6 = r6.b()
                if (r6 <= 0) goto L_0x006c
            L_0x0031:
                c0.t r6 = r5.f6483k
                D3.I r6 = r6.f6474a
                D3.J.c(r6)
                c0.t r6 = r5.f6483k
                u3.p r1 = r6.f6475b
                c0.t r6 = r5.f6483k
                F3.d r6 = r6.f6476c
                r5.f6481i = r1
                r5.f6482j = r3
                java.lang.Object r6 = r6.f(r5)
                if (r6 != r0) goto L_0x0051
                return r0
            L_0x0051:
                r4 = 0
                r5.f6481i = r4
                r5.f6482j = r2
                java.lang.Object r6 = r1.g(r6, r5)
                if (r6 != r0) goto L_0x005d
                return r0
            L_0x005d:
                c0.t r6 = r5.f6483k
                c0.a r6 = r6.f6477d
                int r6 = r6.a()
                if (r6 != 0) goto L_0x0031
                h3.n r6 = h3.C0673n.f9639a
                return r6
            L_0x006c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: c0.t.b.o(java.lang.Object):java.lang.Object");
        }

        /* renamed from: s */
        public final Object g(I i4, e eVar) {
            return ((b) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public t(I i4, l lVar, p pVar, p pVar2) {
        v3.l.e(i4, "scope");
        v3.l.e(lVar, "onComplete");
        v3.l.e(pVar, "onUndeliveredElement");
        v3.l.e(pVar2, "consumeMessage");
        this.f6474a = i4;
        this.f6475b = pVar2;
        p0 p0Var = (p0) i4.p().d(p0.f838b);
        if (p0Var != null) {
            p0Var.j(new a(lVar, this, pVar));
        }
    }

    public final void e(Object obj) {
        Object E4 = this.f6476c.E(obj);
        if (E4 instanceof h.a) {
            Throwable c4 = h.c(E4);
            if (c4 == null) {
                c4 = new n("Channel was closed normally");
            }
            throw c4;
        } else if (!h.f(E4)) {
            throw new IllegalStateException("Check failed.");
        } else if (this.f6477d.c() == 0) {
            p0 unused = C0248i.b(this.f6474a, (i) null, (K) null, new b(this, (e) null), 3, (Object) null);
        }
    }
}
