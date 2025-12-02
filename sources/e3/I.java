package e3;

import D3.C0246h;
import T2.a;
import android.content.Context;
import android.util.Log;
import e3.C0597E;
import g0.f;
import h3.C0668i;
import h3.C0673n;
import i3.C0746w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m3.C0795c;
import v3.w;

public final class I implements T2.a, C0597E {

    /* renamed from: c  reason: collision with root package name */
    public Context f8794c;

    /* renamed from: d  reason: collision with root package name */
    public F f8795d;

    /* renamed from: e  reason: collision with root package name */
    public G f8796e = new C0599b();

    public static final class a extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public int f8797i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ I f8798j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ List f8799k;

        /* renamed from: e3.I$a$a  reason: collision with other inner class name */
        public static final class C0147a extends n3.k implements u3.p {

            /* renamed from: i  reason: collision with root package name */
            public int f8800i;

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f8801j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ List f8802k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0147a(List list, l3.e eVar) {
                super(2, eVar);
                this.f8802k = list;
            }

            public final l3.e j(Object obj, l3.e eVar) {
                C0147a aVar = new C0147a(this.f8802k, eVar);
                aVar.f8801j = obj;
                return aVar;
            }

            public final Object o(Object obj) {
                C0795c.c();
                if (this.f8800i == 0) {
                    C0668i.b(obj);
                    g0.c cVar = (g0.c) this.f8801j;
                    List<String> list = this.f8802k;
                    if (list != null) {
                        for (String a4 : list) {
                            cVar.i(g0.h.a(a4));
                        }
                    } else {
                        cVar.f();
                    }
                    return C0673n.f9639a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: s */
            public final Object g(g0.c cVar, l3.e eVar) {
                return ((C0147a) j(cVar, eVar)).o(C0673n.f9639a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(I i4, List list, l3.e eVar) {
            super(2, eVar);
            this.f8798j = i4;
            this.f8799k = list;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new a(this.f8798j, this.f8799k, eVar);
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f8797i;
            if (i4 == 0) {
                C0668i.b(obj);
                Context q4 = this.f8798j.f8794c;
                if (q4 == null) {
                    v3.l.n("context");
                    q4 = null;
                }
                c0.h a4 = J.b(q4);
                C0147a aVar = new C0147a(this.f8799k, (l3.e) null);
                this.f8797i = 1;
                obj = g0.i.a(a4, aVar, this);
                if (obj == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((a) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class b extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public int f8803i;

        /* renamed from: j  reason: collision with root package name */
        public /* synthetic */ Object f8804j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ f.a f8805k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ String f8806l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f.a aVar, String str, l3.e eVar) {
            super(2, eVar);
            this.f8805k = aVar;
            this.f8806l = str;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            b bVar = new b(this.f8805k, this.f8806l, eVar);
            bVar.f8804j = obj;
            return bVar;
        }

        public final Object o(Object obj) {
            C0795c.c();
            if (this.f8803i == 0) {
                C0668i.b(obj);
                ((g0.c) this.f8804j).j(this.f8805k, this.f8806l);
                return C0673n.f9639a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: s */
        public final Object g(g0.c cVar, l3.e eVar) {
            return ((b) j(cVar, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class c extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public int f8807i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ I f8808j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ List f8809k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(I i4, List list, l3.e eVar) {
            super(2, eVar);
            this.f8808j = i4;
            this.f8809k = list;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new c(this.f8808j, this.f8809k, eVar);
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f8807i;
            if (i4 == 0) {
                C0668i.b(obj);
                I i5 = this.f8808j;
                List list = this.f8809k;
                this.f8807i = 1;
                obj = i5.u(list, this);
                if (obj == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((c) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class d extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public Object f8810i;

        /* renamed from: j  reason: collision with root package name */
        public int f8811j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ String f8812k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ I f8813l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ w f8814m;

        public static final class a implements G3.d {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ G3.d f8815e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ f.a f8816f;

            /* renamed from: e3.I$d$a$a  reason: collision with other inner class name */
            public static final class C0148a implements G3.e {

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ G3.e f8817e;

                /* renamed from: f  reason: collision with root package name */
                public final /* synthetic */ f.a f8818f;

                /* renamed from: e3.I$d$a$a$a  reason: collision with other inner class name */
                public static final class C0149a extends n3.d {

                    /* renamed from: h  reason: collision with root package name */
                    public /* synthetic */ Object f8819h;

                    /* renamed from: i  reason: collision with root package name */
                    public int f8820i;

                    /* renamed from: j  reason: collision with root package name */
                    public final /* synthetic */ C0148a f8821j;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0149a(C0148a aVar, l3.e eVar) {
                        super(eVar);
                        this.f8821j = aVar;
                    }

                    public final Object o(Object obj) {
                        this.f8819h = obj;
                        this.f8820i |= Integer.MIN_VALUE;
                        return this.f8821j.b((Object) null, this);
                    }
                }

                public C0148a(G3.e eVar, f.a aVar) {
                    this.f8817e = eVar;
                    this.f8818f = aVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object b(java.lang.Object r5, l3.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof e3.I.d.a.C0148a.C0149a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        e3.I$d$a$a$a r0 = (e3.I.d.a.C0148a.C0149a) r0
                        int r1 = r0.f8820i
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f8820i = r1
                        goto L_0x0018
                    L_0x0013:
                        e3.I$d$a$a$a r0 = new e3.I$d$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f8819h
                        java.lang.Object r1 = m3.C0795c.c()
                        int r2 = r0.f8820i
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        h3.C0668i.b(r6)
                        goto L_0x0047
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        h3.C0668i.b(r6)
                        G3.e r6 = r4.f8817e
                        g0.f r5 = (g0.f) r5
                        g0.f$a r2 = r4.f8818f
                        java.lang.Object r5 = r5.b(r2)
                        r0.f8820i = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L_0x0047
                        return r1
                    L_0x0047:
                        h3.n r5 = h3.C0673n.f9639a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e3.I.d.a.C0148a.b(java.lang.Object, l3.e):java.lang.Object");
                }
            }

            public a(G3.d dVar, f.a aVar) {
                this.f8815e = dVar;
                this.f8816f = aVar;
            }

            public Object c(G3.e eVar, l3.e eVar2) {
                Object c4 = this.f8815e.c(new C0148a(eVar, this.f8816f), eVar2);
                return c4 == C0795c.c() ? c4 : C0673n.f9639a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(String str, I i4, w wVar, l3.e eVar) {
            super(2, eVar);
            this.f8812k = str;
            this.f8813l = i4;
            this.f8814m = wVar;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new d(this.f8812k, this.f8813l, this.f8814m, eVar);
        }

        public final Object o(Object obj) {
            w wVar;
            Object c4 = C0795c.c();
            int i4 = this.f8811j;
            if (i4 == 0) {
                C0668i.b(obj);
                f.a a4 = g0.h.a(this.f8812k);
                Context q4 = this.f8813l.f8794c;
                if (q4 == null) {
                    v3.l.n("context");
                    q4 = null;
                }
                a aVar = new a(J.b(q4).b(), a4);
                w wVar2 = this.f8814m;
                this.f8810i = wVar2;
                this.f8811j = 1;
                Object i5 = G3.f.i(aVar, this);
                if (i5 == c4) {
                    return c4;
                }
                wVar = wVar2;
                obj = i5;
            } else if (i4 == 1) {
                wVar = (w) this.f8810i;
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar.f12469e = obj;
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((d) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class e extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public Object f8822i;

        /* renamed from: j  reason: collision with root package name */
        public int f8823j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ String f8824k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ I f8825l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ w f8826m;

        public static final class a implements G3.d {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ G3.d f8827e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ f.a f8828f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ I f8829g;

            /* renamed from: e3.I$e$a$a  reason: collision with other inner class name */
            public static final class C0150a implements G3.e {

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ G3.e f8830e;

                /* renamed from: f  reason: collision with root package name */
                public final /* synthetic */ f.a f8831f;

                /* renamed from: g  reason: collision with root package name */
                public final /* synthetic */ I f8832g;

                /* renamed from: e3.I$e$a$a$a  reason: collision with other inner class name */
                public static final class C0151a extends n3.d {

                    /* renamed from: h  reason: collision with root package name */
                    public /* synthetic */ Object f8833h;

                    /* renamed from: i  reason: collision with root package name */
                    public int f8834i;

                    /* renamed from: j  reason: collision with root package name */
                    public final /* synthetic */ C0150a f8835j;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0151a(C0150a aVar, l3.e eVar) {
                        super(eVar);
                        this.f8835j = aVar;
                    }

                    public final Object o(Object obj) {
                        this.f8833h = obj;
                        this.f8834i |= Integer.MIN_VALUE;
                        return this.f8835j.b((Object) null, this);
                    }
                }

                public C0150a(G3.e eVar, f.a aVar, I i4) {
                    this.f8830e = eVar;
                    this.f8831f = aVar;
                    this.f8832g = i4;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object b(java.lang.Object r5, l3.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof e3.I.e.a.C0150a.C0151a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        e3.I$e$a$a$a r0 = (e3.I.e.a.C0150a.C0151a) r0
                        int r1 = r0.f8834i
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f8834i = r1
                        goto L_0x0018
                    L_0x0013:
                        e3.I$e$a$a$a r0 = new e3.I$e$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f8833h
                        java.lang.Object r1 = m3.C0795c.c()
                        int r2 = r0.f8834i
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        h3.C0668i.b(r6)
                        goto L_0x0053
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        h3.C0668i.b(r6)
                        G3.e r6 = r4.f8830e
                        g0.f r5 = (g0.f) r5
                        g0.f$a r2 = r4.f8831f
                        java.lang.Object r5 = r5.b(r2)
                        e3.I r2 = r4.f8832g
                        e3.G r2 = r2.f8796e
                        java.lang.Object r5 = e3.J.d(r5, r2)
                        java.lang.Double r5 = (java.lang.Double) r5
                        r0.f8834i = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L_0x0053
                        return r1
                    L_0x0053:
                        h3.n r5 = h3.C0673n.f9639a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e3.I.e.a.C0150a.b(java.lang.Object, l3.e):java.lang.Object");
                }
            }

            public a(G3.d dVar, f.a aVar, I i4) {
                this.f8827e = dVar;
                this.f8828f = aVar;
                this.f8829g = i4;
            }

            public Object c(G3.e eVar, l3.e eVar2) {
                Object c4 = this.f8827e.c(new C0150a(eVar, this.f8828f, this.f8829g), eVar2);
                return c4 == C0795c.c() ? c4 : C0673n.f9639a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str, I i4, w wVar, l3.e eVar) {
            super(2, eVar);
            this.f8824k = str;
            this.f8825l = i4;
            this.f8826m = wVar;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new e(this.f8824k, this.f8825l, this.f8826m, eVar);
        }

        public final Object o(Object obj) {
            w wVar;
            Object c4 = C0795c.c();
            int i4 = this.f8823j;
            if (i4 == 0) {
                C0668i.b(obj);
                f.a g4 = g0.h.g(this.f8824k);
                Context q4 = this.f8825l.f8794c;
                if (q4 == null) {
                    v3.l.n("context");
                    q4 = null;
                }
                a aVar = new a(J.b(q4).b(), g4, this.f8825l);
                w wVar2 = this.f8826m;
                this.f8822i = wVar2;
                this.f8823j = 1;
                Object i5 = G3.f.i(aVar, this);
                if (i5 == c4) {
                    return c4;
                }
                wVar = wVar2;
                obj = i5;
            } else if (i4 == 1) {
                wVar = (w) this.f8822i;
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar.f12469e = obj;
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((e) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class f extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public Object f8836i;

        /* renamed from: j  reason: collision with root package name */
        public int f8837j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ String f8838k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ I f8839l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ w f8840m;

        public static final class a implements G3.d {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ G3.d f8841e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ f.a f8842f;

            /* renamed from: e3.I$f$a$a  reason: collision with other inner class name */
            public static final class C0152a implements G3.e {

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ G3.e f8843e;

                /* renamed from: f  reason: collision with root package name */
                public final /* synthetic */ f.a f8844f;

                /* renamed from: e3.I$f$a$a$a  reason: collision with other inner class name */
                public static final class C0153a extends n3.d {

                    /* renamed from: h  reason: collision with root package name */
                    public /* synthetic */ Object f8845h;

                    /* renamed from: i  reason: collision with root package name */
                    public int f8846i;

                    /* renamed from: j  reason: collision with root package name */
                    public final /* synthetic */ C0152a f8847j;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0153a(C0152a aVar, l3.e eVar) {
                        super(eVar);
                        this.f8847j = aVar;
                    }

                    public final Object o(Object obj) {
                        this.f8845h = obj;
                        this.f8846i |= Integer.MIN_VALUE;
                        return this.f8847j.b((Object) null, this);
                    }
                }

                public C0152a(G3.e eVar, f.a aVar) {
                    this.f8843e = eVar;
                    this.f8844f = aVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object b(java.lang.Object r5, l3.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof e3.I.f.a.C0152a.C0153a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        e3.I$f$a$a$a r0 = (e3.I.f.a.C0152a.C0153a) r0
                        int r1 = r0.f8846i
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f8846i = r1
                        goto L_0x0018
                    L_0x0013:
                        e3.I$f$a$a$a r0 = new e3.I$f$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f8845h
                        java.lang.Object r1 = m3.C0795c.c()
                        int r2 = r0.f8846i
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        h3.C0668i.b(r6)
                        goto L_0x0047
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        h3.C0668i.b(r6)
                        G3.e r6 = r4.f8843e
                        g0.f r5 = (g0.f) r5
                        g0.f$a r2 = r4.f8844f
                        java.lang.Object r5 = r5.b(r2)
                        r0.f8846i = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L_0x0047
                        return r1
                    L_0x0047:
                        h3.n r5 = h3.C0673n.f9639a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e3.I.f.a.C0152a.b(java.lang.Object, l3.e):java.lang.Object");
                }
            }

            public a(G3.d dVar, f.a aVar) {
                this.f8841e = dVar;
                this.f8842f = aVar;
            }

            public Object c(G3.e eVar, l3.e eVar2) {
                Object c4 = this.f8841e.c(new C0152a(eVar, this.f8842f), eVar2);
                return c4 == C0795c.c() ? c4 : C0673n.f9639a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str, I i4, w wVar, l3.e eVar) {
            super(2, eVar);
            this.f8838k = str;
            this.f8839l = i4;
            this.f8840m = wVar;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new f(this.f8838k, this.f8839l, this.f8840m, eVar);
        }

        public final Object o(Object obj) {
            w wVar;
            Object c4 = C0795c.c();
            int i4 = this.f8837j;
            if (i4 == 0) {
                C0668i.b(obj);
                f.a f4 = g0.h.f(this.f8838k);
                Context q4 = this.f8839l.f8794c;
                if (q4 == null) {
                    v3.l.n("context");
                    q4 = null;
                }
                a aVar = new a(J.b(q4).b(), f4);
                w wVar2 = this.f8840m;
                this.f8836i = wVar2;
                this.f8837j = 1;
                Object i5 = G3.f.i(aVar, this);
                if (i5 == c4) {
                    return c4;
                }
                wVar = wVar2;
                obj = i5;
            } else if (i4 == 1) {
                wVar = (w) this.f8836i;
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar.f12469e = obj;
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((f) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class g extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public int f8848i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ I f8849j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ List f8850k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(I i4, List list, l3.e eVar) {
            super(2, eVar);
            this.f8849j = i4;
            this.f8850k = list;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new g(this.f8849j, this.f8850k, eVar);
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f8848i;
            if (i4 == 0) {
                C0668i.b(obj);
                I i5 = this.f8849j;
                List list = this.f8850k;
                this.f8848i = 1;
                obj = i5.u(list, this);
                if (obj == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((g) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class h extends n3.d {

        /* renamed from: h  reason: collision with root package name */
        public Object f8851h;

        /* renamed from: i  reason: collision with root package name */
        public Object f8852i;

        /* renamed from: j  reason: collision with root package name */
        public Object f8853j;

        /* renamed from: k  reason: collision with root package name */
        public Object f8854k;

        /* renamed from: l  reason: collision with root package name */
        public Object f8855l;

        /* renamed from: m  reason: collision with root package name */
        public /* synthetic */ Object f8856m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ I f8857n;

        /* renamed from: o  reason: collision with root package name */
        public int f8858o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(I i4, l3.e eVar) {
            super(eVar);
            this.f8857n = i4;
        }

        public final Object o(Object obj) {
            this.f8856m = obj;
            this.f8858o |= Integer.MIN_VALUE;
            return this.f8857n.u((List) null, this);
        }
    }

    public static final class i extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public Object f8859i;

        /* renamed from: j  reason: collision with root package name */
        public int f8860j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ String f8861k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ I f8862l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ w f8863m;

        public static final class a implements G3.d {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ G3.d f8864e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ f.a f8865f;

            /* renamed from: e3.I$i$a$a  reason: collision with other inner class name */
            public static final class C0154a implements G3.e {

                /* renamed from: e  reason: collision with root package name */
                public final /* synthetic */ G3.e f8866e;

                /* renamed from: f  reason: collision with root package name */
                public final /* synthetic */ f.a f8867f;

                /* renamed from: e3.I$i$a$a$a  reason: collision with other inner class name */
                public static final class C0155a extends n3.d {

                    /* renamed from: h  reason: collision with root package name */
                    public /* synthetic */ Object f8868h;

                    /* renamed from: i  reason: collision with root package name */
                    public int f8869i;

                    /* renamed from: j  reason: collision with root package name */
                    public final /* synthetic */ C0154a f8870j;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0155a(C0154a aVar, l3.e eVar) {
                        super(eVar);
                        this.f8870j = aVar;
                    }

                    public final Object o(Object obj) {
                        this.f8868h = obj;
                        this.f8869i |= Integer.MIN_VALUE;
                        return this.f8870j.b((Object) null, this);
                    }
                }

                public C0154a(G3.e eVar, f.a aVar) {
                    this.f8866e = eVar;
                    this.f8867f = aVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object b(java.lang.Object r5, l3.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof e3.I.i.a.C0154a.C0155a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        e3.I$i$a$a$a r0 = (e3.I.i.a.C0154a.C0155a) r0
                        int r1 = r0.f8869i
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f8869i = r1
                        goto L_0x0018
                    L_0x0013:
                        e3.I$i$a$a$a r0 = new e3.I$i$a$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f8868h
                        java.lang.Object r1 = m3.C0795c.c()
                        int r2 = r0.f8869i
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        h3.C0668i.b(r6)
                        goto L_0x0047
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        h3.C0668i.b(r6)
                        G3.e r6 = r4.f8866e
                        g0.f r5 = (g0.f) r5
                        g0.f$a r2 = r4.f8867f
                        java.lang.Object r5 = r5.b(r2)
                        r0.f8869i = r3
                        java.lang.Object r5 = r6.b(r5, r0)
                        if (r5 != r1) goto L_0x0047
                        return r1
                    L_0x0047:
                        h3.n r5 = h3.C0673n.f9639a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: e3.I.i.a.C0154a.b(java.lang.Object, l3.e):java.lang.Object");
                }
            }

            public a(G3.d dVar, f.a aVar) {
                this.f8864e = dVar;
                this.f8865f = aVar;
            }

            public Object c(G3.e eVar, l3.e eVar2) {
                Object c4 = this.f8864e.c(new C0154a(eVar, this.f8865f), eVar2);
                return c4 == C0795c.c() ? c4 : C0673n.f9639a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str, I i4, w wVar, l3.e eVar) {
            super(2, eVar);
            this.f8861k = str;
            this.f8862l = i4;
            this.f8863m = wVar;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new i(this.f8861k, this.f8862l, this.f8863m, eVar);
        }

        public final Object o(Object obj) {
            w wVar;
            Object c4 = C0795c.c();
            int i4 = this.f8860j;
            if (i4 == 0) {
                C0668i.b(obj);
                f.a g4 = g0.h.g(this.f8861k);
                Context q4 = this.f8862l.f8794c;
                if (q4 == null) {
                    v3.l.n("context");
                    q4 = null;
                }
                a aVar = new a(J.b(q4).b(), g4);
                w wVar2 = this.f8863m;
                this.f8859i = wVar2;
                this.f8860j = 1;
                Object i5 = G3.f.i(aVar, this);
                if (i5 == c4) {
                    return c4;
                }
                wVar = wVar2;
                obj = i5;
            } else if (i4 == 1) {
                wVar = (w) this.f8859i;
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar.f12469e = obj;
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((i) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class j implements G3.d {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ G3.d f8871e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.a f8872f;

        public static final class a implements G3.e {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ G3.e f8873e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ f.a f8874f;

            /* renamed from: e3.I$j$a$a  reason: collision with other inner class name */
            public static final class C0156a extends n3.d {

                /* renamed from: h  reason: collision with root package name */
                public /* synthetic */ Object f8875h;

                /* renamed from: i  reason: collision with root package name */
                public int f8876i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ a f8877j;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0156a(a aVar, l3.e eVar) {
                    super(eVar);
                    this.f8877j = aVar;
                }

                public final Object o(Object obj) {
                    this.f8875h = obj;
                    this.f8876i |= Integer.MIN_VALUE;
                    return this.f8877j.b((Object) null, this);
                }
            }

            public a(G3.e eVar, f.a aVar) {
                this.f8873e = eVar;
                this.f8874f = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object b(java.lang.Object r5, l3.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof e3.I.j.a.C0156a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    e3.I$j$a$a r0 = (e3.I.j.a.C0156a) r0
                    int r1 = r0.f8876i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f8876i = r1
                    goto L_0x0018
                L_0x0013:
                    e3.I$j$a$a r0 = new e3.I$j$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f8875h
                    java.lang.Object r1 = m3.C0795c.c()
                    int r2 = r0.f8876i
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    h3.C0668i.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    h3.C0668i.b(r6)
                    G3.e r6 = r4.f8873e
                    g0.f r5 = (g0.f) r5
                    g0.f$a r2 = r4.f8874f
                    java.lang.Object r5 = r5.b(r2)
                    r0.f8876i = r3
                    java.lang.Object r5 = r6.b(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    h3.n r5 = h3.C0673n.f9639a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: e3.I.j.a.b(java.lang.Object, l3.e):java.lang.Object");
            }
        }

        public j(G3.d dVar, f.a aVar) {
            this.f8871e = dVar;
            this.f8872f = aVar;
        }

        public Object c(G3.e eVar, l3.e eVar2) {
            Object c4 = this.f8871e.c(new a(eVar, this.f8872f), eVar2);
            return c4 == C0795c.c() ? c4 : C0673n.f9639a;
        }
    }

    public static final class k implements G3.d {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ G3.d f8878e;

        public static final class a implements G3.e {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ G3.e f8879e;

            /* renamed from: e3.I$k$a$a  reason: collision with other inner class name */
            public static final class C0157a extends n3.d {

                /* renamed from: h  reason: collision with root package name */
                public /* synthetic */ Object f8880h;

                /* renamed from: i  reason: collision with root package name */
                public int f8881i;

                /* renamed from: j  reason: collision with root package name */
                public final /* synthetic */ a f8882j;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0157a(a aVar, l3.e eVar) {
                    super(eVar);
                    this.f8882j = aVar;
                }

                public final Object o(Object obj) {
                    this.f8880h = obj;
                    this.f8881i |= Integer.MIN_VALUE;
                    return this.f8882j.b((Object) null, this);
                }
            }

            public a(G3.e eVar) {
                this.f8879e = eVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object b(java.lang.Object r5, l3.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof e3.I.k.a.C0157a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    e3.I$k$a$a r0 = (e3.I.k.a.C0157a) r0
                    int r1 = r0.f8881i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f8881i = r1
                    goto L_0x0018
                L_0x0013:
                    e3.I$k$a$a r0 = new e3.I$k$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f8880h
                    java.lang.Object r1 = m3.C0795c.c()
                    int r2 = r0.f8881i
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    h3.C0668i.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    h3.C0668i.b(r6)
                    G3.e r6 = r4.f8879e
                    g0.f r5 = (g0.f) r5
                    java.util.Map r5 = r5.a()
                    java.util.Set r5 = r5.keySet()
                    r0.f8881i = r3
                    java.lang.Object r5 = r6.b(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    h3.n r5 = h3.C0673n.f9639a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: e3.I.k.a.b(java.lang.Object, l3.e):java.lang.Object");
            }
        }

        public k(G3.d dVar) {
            this.f8878e = dVar;
        }

        public Object c(G3.e eVar, l3.e eVar2) {
            Object c4 = this.f8878e.c(new a(eVar), eVar2);
            return c4 == C0795c.c() ? c4 : C0673n.f9639a;
        }
    }

    public static final class l extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public int f8883i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f8884j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ I f8885k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ boolean f8886l;

        public static final class a extends n3.k implements u3.p {

            /* renamed from: i  reason: collision with root package name */
            public int f8887i;

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f8888j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ f.a f8889k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ boolean f8890l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f.a aVar, boolean z4, l3.e eVar) {
                super(2, eVar);
                this.f8889k = aVar;
                this.f8890l = z4;
            }

            public final l3.e j(Object obj, l3.e eVar) {
                a aVar = new a(this.f8889k, this.f8890l, eVar);
                aVar.f8888j = obj;
                return aVar;
            }

            public final Object o(Object obj) {
                C0795c.c();
                if (this.f8887i == 0) {
                    C0668i.b(obj);
                    ((g0.c) this.f8888j).j(this.f8889k, n3.b.a(this.f8890l));
                    return C0673n.f9639a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: s */
            public final Object g(g0.c cVar, l3.e eVar) {
                return ((a) j(cVar, eVar)).o(C0673n.f9639a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(String str, I i4, boolean z4, l3.e eVar) {
            super(2, eVar);
            this.f8884j = str;
            this.f8885k = i4;
            this.f8886l = z4;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new l(this.f8884j, this.f8885k, this.f8886l, eVar);
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f8883i;
            if (i4 == 0) {
                C0668i.b(obj);
                f.a a4 = g0.h.a(this.f8884j);
                Context q4 = this.f8885k.f8794c;
                if (q4 == null) {
                    v3.l.n("context");
                    q4 = null;
                }
                c0.h a5 = J.b(q4);
                a aVar = new a(a4, this.f8886l, (l3.e) null);
                this.f8883i = 1;
                if (g0.i.a(a5, aVar, this) == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((l) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class m extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public int f8891i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ I f8892j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ String f8893k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ String f8894l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(I i4, String str, String str2, l3.e eVar) {
            super(2, eVar);
            this.f8892j = i4;
            this.f8893k = str;
            this.f8894l = str2;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new m(this.f8892j, this.f8893k, this.f8894l, eVar);
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f8891i;
            if (i4 == 0) {
                C0668i.b(obj);
                I i5 = this.f8892j;
                String str = this.f8893k;
                String str2 = this.f8894l;
                this.f8891i = 1;
                if (i5.t(str, str2, this) == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((m) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class n extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public int f8895i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f8896j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ I f8897k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ double f8898l;

        public static final class a extends n3.k implements u3.p {

            /* renamed from: i  reason: collision with root package name */
            public int f8899i;

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f8900j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ f.a f8901k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ double f8902l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f.a aVar, double d4, l3.e eVar) {
                super(2, eVar);
                this.f8901k = aVar;
                this.f8902l = d4;
            }

            public final l3.e j(Object obj, l3.e eVar) {
                a aVar = new a(this.f8901k, this.f8902l, eVar);
                aVar.f8900j = obj;
                return aVar;
            }

            public final Object o(Object obj) {
                C0795c.c();
                if (this.f8899i == 0) {
                    C0668i.b(obj);
                    ((g0.c) this.f8900j).j(this.f8901k, n3.b.b(this.f8902l));
                    return C0673n.f9639a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: s */
            public final Object g(g0.c cVar, l3.e eVar) {
                return ((a) j(cVar, eVar)).o(C0673n.f9639a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(String str, I i4, double d4, l3.e eVar) {
            super(2, eVar);
            this.f8896j = str;
            this.f8897k = i4;
            this.f8898l = d4;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new n(this.f8896j, this.f8897k, this.f8898l, eVar);
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f8895i;
            if (i4 == 0) {
                C0668i.b(obj);
                f.a c5 = g0.h.c(this.f8896j);
                Context q4 = this.f8897k.f8794c;
                if (q4 == null) {
                    v3.l.n("context");
                    q4 = null;
                }
                c0.h a4 = J.b(q4);
                a aVar = new a(c5, this.f8898l, (l3.e) null);
                this.f8895i = 1;
                if (g0.i.a(a4, aVar, this) == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((n) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class o extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public int f8903i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ I f8904j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ String f8905k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ String f8906l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(I i4, String str, String str2, l3.e eVar) {
            super(2, eVar);
            this.f8904j = i4;
            this.f8905k = str;
            this.f8906l = str2;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new o(this.f8904j, this.f8905k, this.f8906l, eVar);
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f8903i;
            if (i4 == 0) {
                C0668i.b(obj);
                I i5 = this.f8904j;
                String str = this.f8905k;
                String str2 = this.f8906l;
                this.f8903i = 1;
                if (i5.t(str, str2, this) == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((o) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class p extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public int f8907i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f8908j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ I f8909k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ long f8910l;

        public static final class a extends n3.k implements u3.p {

            /* renamed from: i  reason: collision with root package name */
            public int f8911i;

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f8912j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ f.a f8913k;

            /* renamed from: l  reason: collision with root package name */
            public final /* synthetic */ long f8914l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f.a aVar, long j4, l3.e eVar) {
                super(2, eVar);
                this.f8913k = aVar;
                this.f8914l = j4;
            }

            public final l3.e j(Object obj, l3.e eVar) {
                a aVar = new a(this.f8913k, this.f8914l, eVar);
                aVar.f8912j = obj;
                return aVar;
            }

            public final Object o(Object obj) {
                C0795c.c();
                if (this.f8911i == 0) {
                    C0668i.b(obj);
                    ((g0.c) this.f8912j).j(this.f8913k, n3.b.d(this.f8914l));
                    return C0673n.f9639a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: s */
            public final Object g(g0.c cVar, l3.e eVar) {
                return ((a) j(cVar, eVar)).o(C0673n.f9639a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(String str, I i4, long j4, l3.e eVar) {
            super(2, eVar);
            this.f8908j = str;
            this.f8909k = i4;
            this.f8910l = j4;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new p(this.f8908j, this.f8909k, this.f8910l, eVar);
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f8907i;
            if (i4 == 0) {
                C0668i.b(obj);
                f.a f4 = g0.h.f(this.f8908j);
                Context q4 = this.f8909k.f8794c;
                if (q4 == null) {
                    v3.l.n("context");
                    q4 = null;
                }
                c0.h a4 = J.b(q4);
                a aVar = new a(f4, this.f8910l, (l3.e) null);
                this.f8907i = 1;
                if (g0.i.a(a4, aVar, this) == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((p) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public static final class q extends n3.k implements u3.p {

        /* renamed from: i  reason: collision with root package name */
        public int f8915i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ I f8916j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ String f8917k;

        /* renamed from: l  reason: collision with root package name */
        public final /* synthetic */ String f8918l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(I i4, String str, String str2, l3.e eVar) {
            super(2, eVar);
            this.f8916j = i4;
            this.f8917k = str;
            this.f8918l = str2;
        }

        public final l3.e j(Object obj, l3.e eVar) {
            return new q(this.f8916j, this.f8917k, this.f8918l, eVar);
        }

        public final Object o(Object obj) {
            Object c4 = C0795c.c();
            int i4 = this.f8915i;
            if (i4 == 0) {
                C0668i.b(obj);
                I i5 = this.f8916j;
                String str = this.f8917k;
                String str2 = this.f8918l;
                this.f8915i = 1;
                if (i5.t(str, str2, this) == c4) {
                    return c4;
                }
            } else if (i4 == 1) {
                C0668i.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C0673n.f9639a;
        }

        /* renamed from: s */
        public final Object g(D3.I i4, l3.e eVar) {
            return ((q) j(i4, eVar)).o(C0673n.f9639a);
        }
    }

    public List a(List list, H h4) {
        v3.l.e(h4, "options");
        return C0746w.I(((Map) C0246h.b((l3.i) null, new g(this, list, (l3.e) null), 1, (Object) null)).keySet());
    }

    public void b(String str, String str2, H h4) {
        v3.l.e(str, "key");
        v3.l.e(str2, "value");
        v3.l.e(h4, "options");
        Object unused = C0246h.b((l3.i) null, new q(this, str, str2, (l3.e) null), 1, (Object) null);
    }

    public void c(String str, boolean z4, H h4) {
        v3.l.e(str, "key");
        v3.l.e(h4, "options");
        Object unused = C0246h.b((l3.i) null, new l(str, this, z4, (l3.e) null), 1, (Object) null);
    }

    public List d(String str, H h4) {
        List list;
        v3.l.e(str, "key");
        v3.l.e(h4, "options");
        String k4 = k(str, h4);
        ArrayList arrayList = null;
        if (k4 != null && !C3.o.v(k4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, (Object) null) && C3.o.v(k4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, (Object) null) && (list = (List) J.d(k4, this.f8796e)) != null) {
            arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof String) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public Map e(List list, H h4) {
        v3.l.e(h4, "options");
        return (Map) C0246h.b((l3.i) null, new c(this, list, (l3.e) null), 1, (Object) null);
    }

    public void f(String str, List list, H h4) {
        v3.l.e(str, "key");
        v3.l.e(list, "value");
        v3.l.e(h4, "options");
        String a4 = this.f8796e.a(list);
        Object unused = C0246h.b((l3.i) null, new m(this, str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + a4, (l3.e) null), 1, (Object) null);
    }

    public void g(List list, H h4) {
        v3.l.e(h4, "options");
        Object unused = C0246h.b((l3.i) null, new a(this, list, (l3.e) null), 1, (Object) null);
    }

    public Boolean h(String str, H h4) {
        v3.l.e(str, "key");
        v3.l.e(h4, "options");
        w wVar = new w();
        Object unused = C0246h.b((l3.i) null, new d(str, this, wVar, (l3.e) null), 1, (Object) null);
        return (Boolean) wVar.f12469e;
    }

    public M i(String str, H h4) {
        v3.l.e(str, "key");
        v3.l.e(h4, "options");
        String k4 = k(str, h4);
        if (k4 == null) {
            return null;
        }
        if (C3.o.v(k4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, (Object) null)) {
            return new M(k4, K.JSON_ENCODED);
        }
        return C3.o.v(k4, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, (Object) null) ? new M((String) null, K.PLATFORM_ENCODED) : new M((String) null, K.UNEXPECTED_STRING);
    }

    public void j(String str, long j4, H h4) {
        v3.l.e(str, "key");
        v3.l.e(h4, "options");
        Object unused = C0246h.b((l3.i) null, new p(str, this, j4, (l3.e) null), 1, (Object) null);
    }

    public String k(String str, H h4) {
        v3.l.e(str, "key");
        v3.l.e(h4, "options");
        w wVar = new w();
        Object unused = C0246h.b((l3.i) null, new i(str, this, wVar, (l3.e) null), 1, (Object) null);
        return (String) wVar.f12469e;
    }

    public Double l(String str, H h4) {
        v3.l.e(str, "key");
        v3.l.e(h4, "options");
        w wVar = new w();
        Object unused = C0246h.b((l3.i) null, new e(str, this, wVar, (l3.e) null), 1, (Object) null);
        return (Double) wVar.f12469e;
    }

    public void m(String str, double d4, H h4) {
        v3.l.e(str, "key");
        v3.l.e(h4, "options");
        Object unused = C0246h.b((l3.i) null, new n(str, this, d4, (l3.e) null), 1, (Object) null);
    }

    public Long n(String str, H h4) {
        v3.l.e(str, "key");
        v3.l.e(h4, "options");
        w wVar = new w();
        Object unused = C0246h.b((l3.i) null, new f(str, this, wVar, (l3.e) null), 1, (Object) null);
        return (Long) wVar.f12469e;
    }

    public void o(String str, String str2, H h4) {
        v3.l.e(str, "key");
        v3.l.e(str2, "value");
        v3.l.e(h4, "options");
        Object unused = C0246h.b((l3.i) null, new o(this, str, str2, (l3.e) null), 1, (Object) null);
    }

    public void onAttachedToEngine(a.b bVar) {
        v3.l.e(bVar, "binding");
        Y2.b b4 = bVar.b();
        v3.l.d(b4, "getBinaryMessenger(...)");
        Context a4 = bVar.a();
        v3.l.d(a4, "getApplicationContext(...)");
        x(b4, a4);
        new C0598a().onAttachedToEngine(bVar);
    }

    public void onDetachedFromEngine(a.b bVar) {
        v3.l.e(bVar, "binding");
        C0597E.a aVar = C0597E.f8785b;
        Y2.b b4 = bVar.b();
        v3.l.d(b4, "getBinaryMessenger(...)");
        aVar.s(b4, (C0597E) null, "data_store");
        F f4 = this.f8795d;
        if (f4 != null) {
            f4.q();
        }
        this.f8795d = null;
    }

    public final Object t(String str, String str2, l3.e eVar) {
        f.a g4 = g0.h.g(str);
        Context context = this.f8794c;
        if (context == null) {
            v3.l.n("context");
            context = null;
        }
        Object a4 = g0.i.a(J.b(context), new b(g4, str2, (l3.e) null), eVar);
        return a4 == C0795c.c() ? a4 : C0673n.f9639a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(java.util.List r9, l3.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof e3.I.h
            if (r0 == 0) goto L_0x0013
            r0 = r10
            e3.I$h r0 = (e3.I.h) r0
            int r1 = r0.f8858o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8858o = r1
            goto L_0x0018
        L_0x0013:
            e3.I$h r0 = new e3.I$h
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f8856m
            java.lang.Object r1 = m3.C0795c.c()
            int r2 = r0.f8858o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0059
            if (r2 == r4) goto L_0x0049
            if (r2 != r3) goto L_0x0041
            java.lang.Object r9 = r0.f8855l
            g0.f$a r9 = (g0.f.a) r9
            java.lang.Object r2 = r0.f8854k
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f8853j
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.f8852i
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.f8851h
            e3.I r6 = (e3.I) r6
            h3.C0668i.b(r10)
            goto L_0x00a8
        L_0x0041:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0049:
            java.lang.Object r9 = r0.f8853j
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r2 = r0.f8852i
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r0.f8851h
            e3.I r4 = (e3.I) r4
            h3.C0668i.b(r10)
            goto L_0x007d
        L_0x0059:
            h3.C0668i.b(r10)
            if (r9 == 0) goto L_0x0066
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Set r9 = i3.C0746w.L(r9)
        L_0x0064:
            r2 = r9
            goto L_0x0068
        L_0x0066:
            r9 = 0
            goto L_0x0064
        L_0x0068:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r0.f8851h = r8
            r0.f8852i = r2
            r0.f8853j = r9
            r0.f8858o = r4
            java.lang.Object r10 = r8.w(r0)
            if (r10 != r1) goto L_0x007c
            return r1
        L_0x007c:
            r4 = r8
        L_0x007d:
            java.util.Set r10 = (java.util.Set) r10
            if (r10 == 0) goto L_0x00c3
            java.util.Iterator r10 = r10.iterator()
            r5 = r2
            r6 = r4
            r4 = r9
            r2 = r10
        L_0x0089:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x00c2
            java.lang.Object r9 = r2.next()
            g0.f$a r9 = (g0.f.a) r9
            r0.f8851h = r6
            r0.f8852i = r5
            r0.f8853j = r4
            r0.f8854k = r2
            r0.f8855l = r9
            r0.f8858o = r3
            java.lang.Object r10 = r6.v(r9, r0)
            if (r10 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            java.lang.String r7 = r9.toString()
            boolean r7 = e3.J.c(r7, r10, r5)
            if (r7 == 0) goto L_0x0089
            e3.G r7 = r6.f8796e
            java.lang.Object r10 = e3.J.d(r10, r7)
            if (r10 == 0) goto L_0x0089
            java.lang.String r9 = r9.toString()
            r4.put(r9, r10)
            goto L_0x0089
        L_0x00c2:
            r9 = r4
        L_0x00c3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.I.u(java.util.List, l3.e):java.lang.Object");
    }

    public final Object v(f.a aVar, l3.e eVar) {
        Context context = this.f8794c;
        if (context == null) {
            v3.l.n("context");
            context = null;
        }
        return G3.f.i(new j(J.b(context).b(), aVar), eVar);
    }

    public final Object w(l3.e eVar) {
        Context context = this.f8794c;
        if (context == null) {
            v3.l.n("context");
            context = null;
        }
        return G3.f.i(new k(J.b(context).b()), eVar);
    }

    public final void x(Y2.b bVar, Context context) {
        this.f8794c = context;
        try {
            C0597E.f8785b.s(bVar, this, "data_store");
            this.f8795d = new F(bVar, context, this.f8796e);
        } catch (Exception e4) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e4);
        }
    }
}
