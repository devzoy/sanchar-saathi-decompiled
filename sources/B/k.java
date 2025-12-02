package B;

import A.f;
import java.util.ArrayList;

public class k {

    /* renamed from: h  reason: collision with root package name */
    public static int f213h;

    /* renamed from: a  reason: collision with root package name */
    public int f214a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f215b = false;

    /* renamed from: c  reason: collision with root package name */
    public m f216c = null;

    /* renamed from: d  reason: collision with root package name */
    public m f217d = null;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f218e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public int f219f;

    /* renamed from: g  reason: collision with root package name */
    public int f220g;

    public k(m mVar, int i4) {
        int i5 = f213h;
        this.f219f = i5;
        f213h = i5 + 1;
        this.f216c = mVar;
        this.f217d = mVar;
        this.f220g = i4;
    }

    public void a(m mVar) {
        this.f218e.add(mVar);
        this.f217d = mVar;
    }

    public long b(f fVar, int i4) {
        long j4;
        int i5;
        m mVar = this.f216c;
        long j5 = 0;
        if (mVar instanceof c) {
            if (((c) mVar).f229f != i4) {
                return 0;
            }
        } else if (i4 == 0) {
            if (!(mVar instanceof j)) {
                return 0;
            }
        } else if (!(mVar instanceof l)) {
            return 0;
        }
        f fVar2 = (i4 == 0 ? fVar.f78e : fVar.f80f).f231h;
        f fVar3 = (i4 == 0 ? fVar.f78e : fVar.f80f).f232i;
        boolean contains = mVar.f231h.f200l.contains(fVar2);
        boolean contains2 = this.f216c.f232i.f200l.contains(fVar3);
        long j6 = this.f216c.j();
        if (contains && contains2) {
            long d4 = d(this.f216c.f231h, 0);
            long c4 = c(this.f216c.f232i, 0);
            long j7 = d4 - j6;
            m mVar2 = this.f216c;
            int i6 = mVar2.f232i.f194f;
            if (j7 >= ((long) (-i6))) {
                j7 += (long) i6;
            }
            int i7 = mVar2.f231h.f194f;
            long j8 = ((-c4) - j6) - ((long) i7);
            if (j8 >= ((long) i7)) {
                j8 -= (long) i7;
            }
            float m4 = mVar2.f225b.m(i4);
            if (m4 > 0.0f) {
                j5 = (long) ((((float) j8) / m4) + (((float) j7) / (1.0f - m4)));
            }
            float f4 = (float) j5;
            long j9 = ((long) ((f4 * m4) + 0.5f)) + j6 + ((long) ((f4 * (1.0f - m4)) + 0.5f));
            m mVar3 = this.f216c;
            j4 = ((long) mVar3.f231h.f194f) + j9;
            i5 = mVar3.f232i.f194f;
        } else if (contains) {
            f fVar4 = this.f216c.f231h;
            return Math.max(d(fVar4, (long) fVar4.f194f), ((long) this.f216c.f231h.f194f) + j6);
        } else if (contains2) {
            f fVar5 = this.f216c.f232i;
            return Math.max(-c(fVar5, (long) fVar5.f194f), ((long) (-this.f216c.f232i.f194f)) + j6);
        } else {
            m mVar4 = this.f216c;
            j4 = ((long) mVar4.f231h.f194f) + mVar4.j();
            i5 = this.f216c.f232i.f194f;
        }
        return j4 - ((long) i5);
    }

    public final long c(f fVar, long j4) {
        m mVar = fVar.f192d;
        if (mVar instanceof i) {
            return j4;
        }
        int size = fVar.f199k.size();
        long j5 = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) fVar.f199k.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f192d != mVar) {
                    j5 = Math.min(j5, c(fVar2, ((long) fVar2.f194f) + j4));
                }
            }
        }
        if (fVar != mVar.f232i) {
            return j5;
        }
        long j6 = j4 - mVar.j();
        return Math.min(Math.min(j5, c(mVar.f231h, j6)), j6 - ((long) mVar.f231h.f194f));
    }

    public final long d(f fVar, long j4) {
        m mVar = fVar.f192d;
        if (mVar instanceof i) {
            return j4;
        }
        int size = fVar.f199k.size();
        long j5 = j4;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) fVar.f199k.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f192d != mVar) {
                    j5 = Math.max(j5, d(fVar2, ((long) fVar2.f194f) + j4));
                }
            }
        }
        if (fVar != mVar.f231h) {
            return j5;
        }
        long j6 = j4 + mVar.j();
        return Math.max(Math.max(j5, d(mVar.f232i, j6)), j6 - ((long) mVar.f232i.f194f));
    }
}
