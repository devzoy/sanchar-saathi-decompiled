package c0;

import h3.C0668i;
import h3.C0673n;
import java.util.Iterator;
import java.util.List;
import l3.e;
import m3.C0795c;
import n3.d;
import n3.k;
import u3.l;
import u3.p;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6292a = new a((v3.g) null);

    public static final class a {

        /* renamed from: c0.g$a$a  reason: collision with other inner class name */
        public static final class C0117a extends k implements p {

            /* renamed from: i  reason: collision with root package name */
            public int f6293i;

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f6294j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ List f6295k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0117a(List list, e eVar) {
                super(2, eVar);
                this.f6295k = list;
            }

            public final e j(Object obj, e eVar) {
                C0117a aVar = new C0117a(this.f6295k, eVar);
                aVar.f6294j = obj;
                return aVar;
            }

            public final Object o(Object obj) {
                Object c4 = C0795c.c();
                int i4 = this.f6293i;
                if (i4 == 0) {
                    C0668i.b(obj);
                    a aVar = g.f6292a;
                    List list = this.f6295k;
                    this.f6293i = 1;
                    if (aVar.c(list, (m) this.f6294j, this) == c4) {
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
            public final Object g(m mVar, e eVar) {
                return ((C0117a) j(mVar, eVar)).o(C0673n.f9639a);
            }
        }

        public static final class b extends d {

            /* renamed from: h  reason: collision with root package name */
            public Object f6296h;

            /* renamed from: i  reason: collision with root package name */
            public Object f6297i;

            /* renamed from: j  reason: collision with root package name */
            public /* synthetic */ Object f6298j;

            /* renamed from: k  reason: collision with root package name */
            public final /* synthetic */ a f6299k;

            /* renamed from: l  reason: collision with root package name */
            public int f6300l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(a aVar, e eVar) {
                super(eVar);
                this.f6299k = aVar;
            }

            public final Object o(Object obj) {
                this.f6298j = obj;
                this.f6300l |= Integer.MIN_VALUE;
                return this.f6299k.c((List) null, (m) null, this);
            }
        }

        public static final class c extends k implements p {

            /* renamed from: i  reason: collision with root package name */
            public Object f6301i;

            /* renamed from: j  reason: collision with root package name */
            public Object f6302j;

            /* renamed from: k  reason: collision with root package name */
            public Object f6303k;

            /* renamed from: l  reason: collision with root package name */
            public int f6304l;

            /* renamed from: m  reason: collision with root package name */
            public /* synthetic */ Object f6305m;

            /* renamed from: n  reason: collision with root package name */
            public final /* synthetic */ List f6306n;

            /* renamed from: o  reason: collision with root package name */
            public final /* synthetic */ List f6307o;

            /* renamed from: c0.g$a$c$a  reason: collision with other inner class name */
            public static final class C0118a extends k implements l {

                /* renamed from: i  reason: collision with root package name */
                public int f6308i;

                public C0118a(f fVar, e eVar) {
                    super(1, eVar);
                }

                public final Object o(Object obj) {
                    C0795c.c();
                    int i4 = this.f6308i;
                    if (i4 == 0) {
                        C0668i.b(obj);
                        this.f6308i = 1;
                        throw null;
                    } else if (i4 == 1) {
                        C0668i.b(obj);
                        return C0673n.f9639a;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }

                public final e s(e eVar) {
                    return new C0118a((f) null, eVar);
                }

                /* renamed from: t */
                public final Object i(e eVar) {
                    return ((C0118a) s(eVar)).o(C0673n.f9639a);
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(List list, List list2, e eVar) {
                super(2, eVar);
                this.f6306n = list;
                this.f6307o = list2;
            }

            public final e j(Object obj, e eVar) {
                c cVar = new c(this.f6306n, this.f6307o, eVar);
                cVar.f6305m = obj;
                return cVar;
            }

            public final Object o(Object obj) {
                List list;
                Iterator it;
                C0795c.c();
                int i4 = this.f6304l;
                if (i4 == 0) {
                    C0668i.b(obj);
                    obj = this.f6305m;
                    list = this.f6307o;
                    it = this.f6306n.iterator();
                } else if (i4 == 1) {
                    Object obj2 = this.f6303k;
                    android.support.v4.media.session.b.a(this.f6302j);
                    Iterator it2 = (Iterator) this.f6301i;
                    List list2 = (List) this.f6305m;
                    C0668i.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        obj = obj2;
                        it = it2;
                        list = list2;
                    } else {
                        list2.add(new C0118a((f) null, (e) null));
                        this.f6305m = list2;
                        this.f6301i = it2;
                        this.f6302j = null;
                        this.f6303k = null;
                        this.f6304l = 2;
                        throw null;
                    }
                } else if (i4 == 2) {
                    it = (Iterator) this.f6301i;
                    list = (List) this.f6305m;
                    C0668i.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (!it.hasNext()) {
                    return obj;
                }
                android.support.v4.media.session.b.a(it.next());
                this.f6305m = list;
                this.f6301i = it;
                this.f6302j = null;
                this.f6303k = obj;
                this.f6304l = 1;
                throw null;
            }

            /* renamed from: s */
            public final Object g(Object obj, e eVar) {
                return ((c) j(obj, eVar)).o(C0673n.f9639a);
            }
        }

        public /* synthetic */ a(v3.g gVar) {
            this();
        }

        public final p b(List list) {
            v3.l.e(list, "migrations");
            return new C0117a(list, (e) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object c(java.util.List r7, c0.m r8, l3.e r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof c0.g.a.b
                if (r0 == 0) goto L_0x0013
                r0 = r9
                c0.g$a$b r0 = (c0.g.a.b) r0
                int r1 = r0.f6300l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f6300l = r1
                goto L_0x0018
            L_0x0013:
                c0.g$a$b r0 = new c0.g$a$b
                r0.<init>(r6, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f6298j
                java.lang.Object r1 = m3.C0795c.c()
                int r2 = r0.f6300l
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x003e
                if (r2 != r3) goto L_0x0036
                java.lang.Object r7 = r0.f6297i
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f6296h
                v3.w r8 = (v3.w) r8
                h3.C0668i.b(r9)     // Catch:{ all -> 0x0034 }
                goto L_0x006b
            L_0x0034:
                r9 = move-exception
                goto L_0x0084
            L_0x0036:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x003e:
                java.lang.Object r7 = r0.f6296h
                java.util.List r7 = (java.util.List) r7
                h3.C0668i.b(r9)
                goto L_0x0060
            L_0x0046:
                h3.C0668i.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                c0.g$a$c r2 = new c0.g$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f6296h = r9
                r0.f6300l = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L_0x005f
                return r1
            L_0x005f:
                r7 = r9
            L_0x0060:
                v3.w r8 = new v3.w
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L_0x006b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L_0x0094
                java.lang.Object r9 = r7.next()
                u3.l r9 = (u3.l) r9
                r0.f6296h = r8     // Catch:{ all -> 0x0034 }
                r0.f6297i = r7     // Catch:{ all -> 0x0034 }
                r0.f6300l = r3     // Catch:{ all -> 0x0034 }
                java.lang.Object r9 = r9.i(r0)     // Catch:{ all -> 0x0034 }
                if (r9 != r1) goto L_0x006b
                return r1
            L_0x0084:
                java.lang.Object r2 = r8.f12469e
                if (r2 != 0) goto L_0x008b
                r8.f12469e = r9
                goto L_0x006b
            L_0x008b:
                v3.l.b(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                h3.C0660a.a(r2, r9)
                goto L_0x006b
            L_0x0094:
                java.lang.Object r7 = r8.f12469e
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L_0x009d
                h3.n r7 = h3.C0673n.f9639a
                return r7
            L_0x009d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: c0.g.a.c(java.util.List, c0.m, l3.e):java.lang.Object");
        }

        public a() {
        }
    }
}
