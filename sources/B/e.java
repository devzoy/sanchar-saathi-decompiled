package B;

import A.d;
import A.e;
import A.f;
import A.g;
import A.i;
import B.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public f f180a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f181b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f182c = true;

    /* renamed from: d  reason: collision with root package name */
    public f f183d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f184e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f185f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public b.C0001b f186g = null;

    /* renamed from: h  reason: collision with root package name */
    public b.a f187h = new b.a();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f188i = new ArrayList();

    public e(f fVar) {
        this.f180a = fVar;
        this.f183d = fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: B.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: B.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(B.f r9, int r10, int r11, B.f r12, java.util.ArrayList r13, B.k r14) {
        /*
            r8 = this;
            B.m r9 = r9.f192d
            B.k r0 = r9.f226c
            if (r0 != 0) goto L_0x0107
            A.f r0 = r8.f180a
            B.j r1 = r0.f78e
            if (r9 == r1) goto L_0x0107
            B.l r0 = r0.f80f
            if (r9 != r0) goto L_0x0012
            goto L_0x0107
        L_0x0012:
            if (r14 != 0) goto L_0x001c
            B.k r14 = new B.k
            r14.<init>(r9, r11)
            r13.add(r14)
        L_0x001c:
            r9.f226c = r14
            r14.a(r9)
            B.f r11 = r9.f231h
            java.util.List r11 = r11.f199k
            java.util.Iterator r11 = r11.iterator()
        L_0x0029:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r11.next()
            B.d r0 = (B.d) r0
            boolean r1 = r0 instanceof B.f
            if (r1 == 0) goto L_0x0029
            r1 = r0
            B.f r1 = (B.f) r1
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x0029
        L_0x0046:
            B.f r11 = r9.f232i
            java.util.List r11 = r11.f199k
            java.util.Iterator r11 = r11.iterator()
        L_0x004e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r11.next()
            B.d r0 = (B.d) r0
            boolean r1 = r0 instanceof B.f
            if (r1 == 0) goto L_0x004e
            r1 = r0
            B.f r1 = (B.f) r1
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x004e
        L_0x006b:
            r11 = 1
            if (r10 != r11) goto L_0x009a
            boolean r0 = r9 instanceof B.l
            if (r0 == 0) goto L_0x009a
            r0 = r9
            B.l r0 = (B.l) r0
            B.f r0 = r0.f221k
            java.util.List r0 = r0.f199k
            java.util.Iterator r7 = r0.iterator()
        L_0x007d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r7.next()
            B.d r0 = (B.d) r0
            boolean r1 = r0 instanceof B.f
            if (r1 == 0) goto L_0x007d
            r1 = r0
            B.f r1 = (B.f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x007d
        L_0x009a:
            B.f r0 = r9.f231h
            java.util.List r0 = r0.f200l
            java.util.Iterator r7 = r0.iterator()
        L_0x00a2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r7.next()
            r1 = r0
            B.f r1 = (B.f) r1
            if (r1 != r12) goto L_0x00b3
            r14.f215b = r11
        L_0x00b3:
            r3 = 0
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00a2
        L_0x00bd:
            B.f r0 = r9.f232i
            java.util.List r0 = r0.f200l
            java.util.Iterator r7 = r0.iterator()
        L_0x00c5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r7.next()
            r1 = r0
            B.f r1 = (B.f) r1
            if (r1 != r12) goto L_0x00d6
            r14.f215b = r11
        L_0x00d6:
            r3 = 1
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00c5
        L_0x00e0:
            if (r10 != r11) goto L_0x0107
            boolean r11 = r9 instanceof B.l
            if (r11 == 0) goto L_0x0107
            B.l r9 = (B.l) r9
            B.f r9 = r9.f221k
            java.util.List r9 = r9.f200l
            java.util.Iterator r9 = r9.iterator()
        L_0x00f0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x0107
            java.lang.Object r11 = r9.next()
            r1 = r11
            B.f r1 = (B.f) r1
            r3 = 2
            r0 = r8
            r2 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r0.a(r1, r2, r3, r4, r5, r6)
            goto L_0x00f0
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B.e.a(B.f, int, int, B.f, java.util.ArrayList, B.k):void");
    }

    public final boolean b(f fVar) {
        e.b bVar;
        e.b bVar2;
        e.b bVar3;
        int i4;
        e.b bVar4;
        int i5;
        e.b bVar5;
        f fVar2 = fVar;
        Iterator it = fVar2.f157w0.iterator();
        while (it.hasNext()) {
            A.e eVar = (A.e) it.next();
            e.b[] bVarArr = eVar.f56M;
            e.b bVar6 = bVarArr[0];
            e.b bVar7 = bVarArr[1];
            if (eVar.M() == 8) {
                eVar.f70a = true;
            } else {
                if (eVar.f102q < 1.0f && bVar6 == e.b.MATCH_CONSTRAINT) {
                    eVar.f92l = 2;
                }
                if (eVar.f108t < 1.0f && bVar7 == e.b.MATCH_CONSTRAINT) {
                    eVar.f94m = 2;
                }
                if (eVar.r() > 0.0f) {
                    e.b bVar8 = e.b.MATCH_CONSTRAINT;
                    if (bVar6 == bVar8 && (bVar7 == e.b.WRAP_CONTENT || bVar7 == e.b.FIXED)) {
                        eVar.f92l = 3;
                    } else if (bVar7 == bVar8 && (bVar6 == e.b.WRAP_CONTENT || bVar6 == e.b.FIXED)) {
                        eVar.f94m = 3;
                    } else if (bVar6 == bVar8 && bVar7 == bVar8) {
                        if (eVar.f92l == 0) {
                            eVar.f92l = 3;
                        }
                        if (eVar.f94m == 0) {
                            eVar.f94m = 3;
                        }
                    }
                }
                e.b bVar9 = e.b.MATCH_CONSTRAINT;
                if (bVar6 == bVar9 && eVar.f92l == 1 && (eVar.f45B.f28d == null || eVar.f47D.f28d == null)) {
                    bVar6 = e.b.WRAP_CONTENT;
                }
                e.b bVar10 = bVar6;
                if (bVar7 == bVar9 && eVar.f94m == 1 && (eVar.f46C.f28d == null || eVar.f48E.f28d == null)) {
                    bVar7 = e.b.WRAP_CONTENT;
                }
                e.b bVar11 = bVar7;
                j jVar = eVar.f78e;
                jVar.f227d = bVar10;
                int i6 = eVar.f92l;
                jVar.f224a = i6;
                l lVar = eVar.f80f;
                lVar.f227d = bVar11;
                int i7 = eVar.f94m;
                lVar.f224a = i7;
                e.b bVar12 = e.b.MATCH_PARENT;
                if ((bVar10 == bVar12 || bVar10 == e.b.FIXED || bVar10 == e.b.WRAP_CONTENT) && (bVar11 == bVar12 || bVar11 == e.b.FIXED || bVar11 == e.b.WRAP_CONTENT)) {
                    int N4 = eVar.N();
                    if (bVar10 == bVar12) {
                        i4 = (fVar.N() - eVar.f45B.f29e) - eVar.f47D.f29e;
                        bVar4 = e.b.FIXED;
                    } else {
                        i4 = N4;
                        bVar4 = bVar10;
                    }
                    int t4 = eVar.t();
                    if (bVar11 == bVar12) {
                        i5 = (fVar.t() - eVar.f46C.f29e) - eVar.f48E.f29e;
                        bVar5 = e.b.FIXED;
                    } else {
                        i5 = t4;
                        bVar5 = bVar11;
                    }
                    l(eVar, bVar4, i4, bVar5, i5);
                    eVar.f78e.f228e.d(eVar.N());
                    eVar.f80f.f228e.d(eVar.t());
                    eVar.f70a = true;
                } else {
                    if (bVar10 == bVar9 && (bVar11 == (bVar3 = e.b.WRAP_CONTENT) || bVar11 == e.b.FIXED)) {
                        if (i6 == 3) {
                            if (bVar11 == bVar3) {
                                l(eVar, bVar3, 0, bVar3, 0);
                            }
                            int t5 = eVar.t();
                            e.b bVar13 = e.b.FIXED;
                            l(eVar, bVar13, (int) ((((float) t5) * eVar.f60Q) + 0.5f), bVar13, t5);
                            eVar.f78e.f228e.d(eVar.N());
                            eVar.f80f.f228e.d(eVar.t());
                            eVar.f70a = true;
                        } else if (i6 == 1) {
                            l(eVar, bVar3, 0, bVar11, 0);
                            eVar.f78e.f228e.f210m = eVar.N();
                        } else if (i6 == 2) {
                            e.b bVar14 = fVar2.f56M[0];
                            e.b bVar15 = e.b.FIXED;
                            if (bVar14 == bVar15 || bVar14 == bVar12) {
                                l(eVar, bVar15, (int) ((eVar.f102q * ((float) fVar.N())) + 0.5f), bVar11, eVar.t());
                                eVar.f78e.f228e.d(eVar.N());
                                eVar.f80f.f228e.d(eVar.t());
                                eVar.f70a = true;
                            }
                        } else {
                            d[] dVarArr = eVar.f53J;
                            if (dVarArr[0].f28d == null || dVarArr[1].f28d == null) {
                                l(eVar, bVar3, 0, bVar11, 0);
                                eVar.f78e.f228e.d(eVar.N());
                                eVar.f80f.f228e.d(eVar.t());
                                eVar.f70a = true;
                            }
                        }
                    }
                    if (bVar11 == bVar9 && (bVar10 == (bVar2 = e.b.WRAP_CONTENT) || bVar10 == e.b.FIXED)) {
                        if (i7 == 3) {
                            if (bVar10 == bVar2) {
                                l(eVar, bVar2, 0, bVar2, 0);
                            }
                            int N5 = eVar.N();
                            float f4 = eVar.f60Q;
                            if (eVar.s() == -1) {
                                f4 = 1.0f / f4;
                            }
                            e.b bVar16 = e.b.FIXED;
                            l(eVar, bVar16, N5, bVar16, (int) ((((float) N5) * f4) + 0.5f));
                            eVar.f78e.f228e.d(eVar.N());
                            eVar.f80f.f228e.d(eVar.t());
                            eVar.f70a = true;
                        } else if (i7 == 1) {
                            l(eVar, bVar10, 0, bVar2, 0);
                            eVar.f80f.f228e.f210m = eVar.t();
                        } else if (i7 == 2) {
                            e.b bVar17 = fVar2.f56M[1];
                            e.b bVar18 = e.b.FIXED;
                            if (bVar17 == bVar18 || bVar17 == bVar12) {
                                A.e eVar2 = eVar;
                                e.b bVar19 = bVar10;
                                l(eVar2, bVar19, eVar.N(), bVar18, (int) ((eVar.f108t * ((float) fVar.t())) + 0.5f));
                                eVar.f78e.f228e.d(eVar.N());
                                eVar.f80f.f228e.d(eVar.t());
                                eVar.f70a = true;
                            }
                        } else {
                            d[] dVarArr2 = eVar.f53J;
                            if (dVarArr2[2].f28d == null || dVarArr2[3].f28d == null) {
                                l(eVar, bVar2, 0, bVar11, 0);
                                eVar.f78e.f228e.d(eVar.N());
                                eVar.f80f.f228e.d(eVar.t());
                                eVar.f70a = true;
                            }
                        }
                    }
                    if (bVar10 == bVar9 && bVar11 == bVar9) {
                        if (i6 == 1 || i7 == 1) {
                            e.b bVar20 = e.b.WRAP_CONTENT;
                            l(eVar, bVar20, 0, bVar20, 0);
                            eVar.f78e.f228e.f210m = eVar.N();
                            eVar.f80f.f228e.f210m = eVar.t();
                        } else if (i7 == 2 && i6 == 2) {
                            e.b[] bVarArr2 = fVar2.f56M;
                            e.b bVar21 = bVarArr2[0];
                            e.b bVar22 = e.b.FIXED;
                            if ((bVar21 == bVar22 || bVar21 == bVar22) && ((bVar = bVarArr2[1]) == bVar22 || bVar == bVar22)) {
                                float f5 = eVar.f102q;
                                float f6 = eVar.f108t;
                                l(eVar, bVar22, (int) ((f5 * ((float) fVar.N())) + 0.5f), bVar22, (int) ((f6 * ((float) fVar.t())) + 0.5f));
                                eVar.f78e.f228e.d(eVar.N());
                                eVar.f80f.f228e.d(eVar.t());
                                eVar.f70a = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        d(this.f184e);
        this.f188i.clear();
        k.f213h = 0;
        i(this.f180a.f78e, 0, this.f188i);
        i(this.f180a.f80f, 1, this.f188i);
        this.f181b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f183d.f78e.f();
        this.f183d.f80f.f();
        arrayList.add(this.f183d.f78e);
        arrayList.add(this.f183d.f80f);
        Iterator it = this.f183d.f157w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            A.e eVar = (A.e) it.next();
            if (eVar instanceof g) {
                arrayList.add(new h(eVar));
            } else {
                if (eVar.T()) {
                    if (eVar.f74c == null) {
                        eVar.f74c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f74c);
                } else {
                    arrayList.add(eVar.f78e);
                }
                if (eVar.V()) {
                    if (eVar.f76d == null) {
                        eVar.f76d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f76d);
                } else {
                    arrayList.add(eVar.f80f);
                }
                if (eVar instanceof i) {
                    arrayList.add(new i(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (mVar.f225b != this.f183d) {
                mVar.d();
            }
        }
    }

    public final int e(f fVar, int i4) {
        int size = this.f188i.size();
        long j4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            j4 = Math.max(j4, ((k) this.f188i.get(i5)).b(fVar, i4));
        }
        return (int) j4;
    }

    public boolean f(boolean z4) {
        boolean z5;
        boolean z6 = false;
        if (this.f181b || this.f182c) {
            Iterator it = this.f180a.f157w0.iterator();
            while (it.hasNext()) {
                A.e eVar = (A.e) it.next();
                eVar.f70a = false;
                eVar.f78e.r();
                eVar.f80f.q();
            }
            f fVar = this.f180a;
            fVar.f70a = false;
            fVar.f78e.r();
            this.f180a.f80f.q();
            this.f182c = false;
        }
        if (b(this.f183d)) {
            return false;
        }
        this.f180a.B0(0);
        this.f180a.C0(0);
        e.b q4 = this.f180a.q(0);
        e.b q5 = this.f180a.q(1);
        if (this.f181b) {
            c();
        }
        int O4 = this.f180a.O();
        int P4 = this.f180a.P();
        this.f180a.f78e.f231h.d(O4);
        this.f180a.f80f.f231h.d(P4);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (q4 == bVar || q5 == bVar) {
            if (z4) {
                Iterator it2 = this.f184e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((m) it2.next()).m()) {
                            z4 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z4 && q4 == e.b.WRAP_CONTENT) {
                this.f180a.i0(e.b.FIXED);
                f fVar2 = this.f180a;
                fVar2.A0(e(fVar2, 0));
                f fVar3 = this.f180a;
                fVar3.f78e.f228e.d(fVar3.N());
            }
            if (z4 && q5 == e.b.WRAP_CONTENT) {
                this.f180a.w0(e.b.FIXED);
                f fVar4 = this.f180a;
                fVar4.e0(e(fVar4, 1));
                f fVar5 = this.f180a;
                fVar5.f80f.f228e.d(fVar5.t());
            }
        }
        f fVar6 = this.f180a;
        e.b bVar2 = fVar6.f56M[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int N4 = fVar6.N() + O4;
            this.f180a.f78e.f232i.d(N4);
            this.f180a.f78e.f228e.d(N4 - O4);
            m();
            f fVar7 = this.f180a;
            e.b bVar4 = fVar7.f56M[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int t4 = fVar7.t() + P4;
                this.f180a.f80f.f232i.d(t4);
                this.f180a.f80f.f228e.d(t4 - P4);
            }
            m();
            z5 = true;
        } else {
            z5 = false;
        }
        Iterator it3 = this.f184e.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (mVar.f225b != this.f180a || mVar.f230g) {
                mVar.e();
            }
        }
        Iterator it4 = this.f184e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z6 = true;
                break;
            }
            m mVar2 = (m) it4.next();
            if ((z5 || mVar2.f225b != this.f180a) && (!mVar2.f231h.f198j || ((!mVar2.f232i.f198j && !(mVar2 instanceof h)) || (!mVar2.f228e.f198j && !(mVar2 instanceof c) && !(mVar2 instanceof h))))) {
                break;
            }
        }
        this.f180a.i0(q4);
        this.f180a.w0(q5);
        return z6;
    }

    public boolean g(boolean z4) {
        if (this.f181b) {
            Iterator it = this.f180a.f157w0.iterator();
            while (it.hasNext()) {
                A.e eVar = (A.e) it.next();
                eVar.f70a = false;
                j jVar = eVar.f78e;
                jVar.f228e.f198j = false;
                jVar.f230g = false;
                jVar.r();
                l lVar = eVar.f80f;
                lVar.f228e.f198j = false;
                lVar.f230g = false;
                lVar.q();
            }
            f fVar = this.f180a;
            fVar.f70a = false;
            j jVar2 = fVar.f78e;
            jVar2.f228e.f198j = false;
            jVar2.f230g = false;
            jVar2.r();
            l lVar2 = this.f180a.f80f;
            lVar2.f228e.f198j = false;
            lVar2.f230g = false;
            lVar2.q();
            c();
        }
        if (b(this.f183d)) {
            return false;
        }
        this.f180a.B0(0);
        this.f180a.C0(0);
        this.f180a.f78e.f231h.d(0);
        this.f180a.f80f.f231h.d(0);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(boolean r10, int r11) {
        /*
            r9 = this;
            A.f r0 = r9.f180a
            r1 = 0
            A.e$b r0 = r0.q(r1)
            A.f r2 = r9.f180a
            r3 = 1
            A.e$b r2 = r2.q(r3)
            A.f r4 = r9.f180a
            int r4 = r4.O()
            A.f r5 = r9.f180a
            int r5 = r5.P()
            if (r10 == 0) goto L_0x0088
            A.e$b r6 = A.e.b.WRAP_CONTENT
            if (r0 == r6) goto L_0x0022
            if (r2 != r6) goto L_0x0088
        L_0x0022:
            java.util.ArrayList r6 = r9.f184e
            java.util.Iterator r6 = r6.iterator()
        L_0x0028:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x003f
            java.lang.Object r7 = r6.next()
            B.m r7 = (B.m) r7
            int r8 = r7.f229f
            if (r8 != r11) goto L_0x0028
            boolean r7 = r7.m()
            if (r7 != 0) goto L_0x0028
            r10 = r1
        L_0x003f:
            if (r11 != 0) goto L_0x0065
            if (r10 == 0) goto L_0x0088
            A.e$b r10 = A.e.b.WRAP_CONTENT
            if (r0 != r10) goto L_0x0088
            A.f r10 = r9.f180a
            A.e$b r6 = A.e.b.FIXED
            r10.i0(r6)
            A.f r10 = r9.f180a
            int r6 = r9.e(r10, r1)
            r10.A0(r6)
            A.f r10 = r9.f180a
            B.j r6 = r10.f78e
            B.g r6 = r6.f228e
            int r10 = r10.N()
            r6.d(r10)
            goto L_0x0088
        L_0x0065:
            if (r10 == 0) goto L_0x0088
            A.e$b r10 = A.e.b.WRAP_CONTENT
            if (r2 != r10) goto L_0x0088
            A.f r10 = r9.f180a
            A.e$b r6 = A.e.b.FIXED
            r10.w0(r6)
            A.f r10 = r9.f180a
            int r6 = r9.e(r10, r3)
            r10.e0(r6)
            A.f r10 = r9.f180a
            B.l r6 = r10.f80f
            B.g r6 = r6.f228e
            int r10 = r10.t()
            r6.d(r10)
        L_0x0088:
            if (r11 != 0) goto L_0x00b2
            A.f r10 = r9.f180a
            A.e$b[] r5 = r10.f56M
            r5 = r5[r1]
            A.e$b r6 = A.e.b.FIXED
            if (r5 == r6) goto L_0x0098
            A.e$b r6 = A.e.b.MATCH_PARENT
            if (r5 != r6) goto L_0x00c1
        L_0x0098:
            int r10 = r10.N()
            int r10 = r10 + r4
            A.f r5 = r9.f180a
            B.j r5 = r5.f78e
            B.f r5 = r5.f232i
            r5.d(r10)
            A.f r5 = r9.f180a
            B.j r5 = r5.f78e
            B.g r5 = r5.f228e
            int r10 = r10 - r4
            r5.d(r10)
        L_0x00b0:
            r10 = r3
            goto L_0x00dc
        L_0x00b2:
            A.f r10 = r9.f180a
            A.e$b[] r4 = r10.f56M
            r4 = r4[r3]
            A.e$b r6 = A.e.b.FIXED
            if (r4 == r6) goto L_0x00c3
            A.e$b r6 = A.e.b.MATCH_PARENT
            if (r4 != r6) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r10 = r1
            goto L_0x00dc
        L_0x00c3:
            int r10 = r10.t()
            int r10 = r10 + r5
            A.f r4 = r9.f180a
            B.l r4 = r4.f80f
            B.f r4 = r4.f232i
            r4.d(r10)
            A.f r4 = r9.f180a
            B.l r4 = r4.f80f
            B.g r4 = r4.f228e
            int r10 = r10 - r5
            r4.d(r10)
            goto L_0x00b0
        L_0x00dc:
            r9.m()
            java.util.ArrayList r4 = r9.f184e
            java.util.Iterator r4 = r4.iterator()
        L_0x00e5:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0105
            java.lang.Object r5 = r4.next()
            B.m r5 = (B.m) r5
            int r6 = r5.f229f
            if (r6 == r11) goto L_0x00f6
            goto L_0x00e5
        L_0x00f6:
            A.e r6 = r5.f225b
            A.f r7 = r9.f180a
            if (r6 != r7) goto L_0x0101
            boolean r6 = r5.f230g
            if (r6 != 0) goto L_0x0101
            goto L_0x00e5
        L_0x0101:
            r5.e()
            goto L_0x00e5
        L_0x0105:
            java.util.ArrayList r4 = r9.f184e
            java.util.Iterator r4 = r4.iterator()
        L_0x010b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x013e
            java.lang.Object r5 = r4.next()
            B.m r5 = (B.m) r5
            int r6 = r5.f229f
            if (r6 == r11) goto L_0x011c
            goto L_0x010b
        L_0x011c:
            if (r10 != 0) goto L_0x0125
            A.e r6 = r5.f225b
            A.f r7 = r9.f180a
            if (r6 != r7) goto L_0x0125
            goto L_0x010b
        L_0x0125:
            B.f r6 = r5.f231h
            boolean r6 = r6.f198j
            if (r6 != 0) goto L_0x012c
            goto L_0x013f
        L_0x012c:
            B.f r6 = r5.f232i
            boolean r6 = r6.f198j
            if (r6 != 0) goto L_0x0133
            goto L_0x013f
        L_0x0133:
            boolean r6 = r5 instanceof B.c
            if (r6 != 0) goto L_0x010b
            B.g r5 = r5.f228e
            boolean r5 = r5.f198j
            if (r5 != 0) goto L_0x010b
            goto L_0x013f
        L_0x013e:
            r1 = r3
        L_0x013f:
            A.f r10 = r9.f180a
            r10.i0(r0)
            A.f r10 = r9.f180a
            r10.w0(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B.e.h(boolean, int):boolean");
    }

    public final void i(m mVar, int i4, ArrayList arrayList) {
        for (d dVar : mVar.f231h.f199k) {
            if (dVar instanceof f) {
                a((f) dVar, i4, 0, mVar.f232i, arrayList, (k) null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f231h, i4, 0, mVar.f232i, arrayList, (k) null);
            }
        }
        for (d dVar2 : mVar.f232i.f199k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i4, 1, mVar.f231h, arrayList, (k) null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f232i, i4, 1, mVar.f231h, arrayList, (k) null);
            }
        }
        if (i4 == 1) {
            for (d dVar3 : ((l) mVar).f221k.f199k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i4, 2, (f) null, arrayList, (k) null);
                }
            }
        }
    }

    public void j() {
        this.f181b = true;
    }

    public void k() {
        this.f182c = true;
    }

    public final void l(A.e eVar, e.b bVar, int i4, e.b bVar2, int i5) {
        b.a aVar = this.f187h;
        aVar.f168a = bVar;
        aVar.f169b = bVar2;
        aVar.f170c = i4;
        aVar.f171d = i5;
        this.f186g.b(eVar, aVar);
        eVar.A0(this.f187h.f172e);
        eVar.e0(this.f187h.f173f);
        eVar.d0(this.f187h.f175h);
        eVar.Y(this.f187h.f174g);
    }

    public void m() {
        g gVar;
        Iterator it = this.f180a.f157w0.iterator();
        while (it.hasNext()) {
            A.e eVar = (A.e) it.next();
            if (!eVar.f70a) {
                e.b[] bVarArr = eVar.f56M;
                boolean z4 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i4 = eVar.f92l;
                int i5 = eVar.f94m;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z5 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i4 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i5 == 1)) {
                    z4 = true;
                }
                g gVar2 = eVar.f78e.f228e;
                boolean z6 = gVar2.f198j;
                g gVar3 = eVar.f80f.f228e;
                boolean z7 = gVar3.f198j;
                if (z6 && z7) {
                    e.b bVar4 = e.b.FIXED;
                    l(eVar, bVar4, gVar2.f195g, bVar4, gVar3.f195g);
                    eVar.f70a = true;
                } else if (z6 && z4) {
                    l(eVar, e.b.FIXED, gVar2.f195g, bVar3, gVar3.f195g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        eVar.f80f.f228e.f210m = eVar.t();
                    } else {
                        eVar.f80f.f228e.d(eVar.t());
                        eVar.f70a = true;
                    }
                } else if (z7 && z5) {
                    l(eVar, bVar3, gVar2.f195g, e.b.FIXED, gVar3.f195g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        eVar.f78e.f228e.f210m = eVar.N();
                    } else {
                        eVar.f78e.f228e.d(eVar.N());
                        eVar.f70a = true;
                    }
                }
                if (eVar.f70a && (gVar = eVar.f80f.f222l) != null) {
                    gVar.d(eVar.l());
                }
            }
        }
    }

    public void n(b.C0001b bVar) {
        this.f186g = bVar;
    }
}
