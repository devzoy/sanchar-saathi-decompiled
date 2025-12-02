package l2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public final m[] f11079a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f11080b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f11081c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f11082d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f11083e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f11084f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final m f11085g = new m();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f11086h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f11087i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f11088j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f11089k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public boolean f11090l = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final l f11091a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i4);

        void b(m mVar, Matrix matrix, int i4);
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final k f11092a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f11093b;

        /* renamed from: c  reason: collision with root package name */
        public final RectF f11094c;

        /* renamed from: d  reason: collision with root package name */
        public final b f11095d;

        /* renamed from: e  reason: collision with root package name */
        public final float f11096e;

        public c(k kVar, float f4, RectF rectF, b bVar, Path path) {
            this.f11095d = bVar;
            this.f11092a = kVar;
            this.f11096e = f4;
            this.f11094c = rectF;
            this.f11093b = path;
        }
    }

    public l() {
        for (int i4 = 0; i4 < 4; i4++) {
            this.f11079a[i4] = new m();
            this.f11080b[i4] = new Matrix();
            this.f11081c[i4] = new Matrix();
        }
    }

    public static l k() {
        return a.f11091a;
    }

    public final float a(int i4) {
        return (float) ((i4 + 1) * 90);
    }

    public final void b(c cVar, int i4) {
        this.f11086h[0] = this.f11079a[i4].k();
        this.f11086h[1] = this.f11079a[i4].l();
        this.f11080b[i4].mapPoints(this.f11086h);
        if (i4 == 0) {
            Path path = cVar.f11093b;
            float[] fArr = this.f11086h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.f11093b;
            float[] fArr2 = this.f11086h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.f11079a[i4].d(this.f11080b[i4], cVar.f11093b);
        b bVar = cVar.f11095d;
        if (bVar != null) {
            bVar.b(this.f11079a[i4], this.f11080b[i4], i4);
        }
    }

    public final void c(c cVar, int i4) {
        int i5 = (i4 + 1) % 4;
        this.f11086h[0] = this.f11079a[i4].i();
        this.f11086h[1] = this.f11079a[i4].j();
        this.f11080b[i4].mapPoints(this.f11086h);
        this.f11087i[0] = this.f11079a[i5].k();
        this.f11087i[1] = this.f11079a[i5].l();
        this.f11080b[i5].mapPoints(this.f11087i);
        float[] fArr = this.f11086h;
        float f4 = fArr[0];
        float[] fArr2 = this.f11087i;
        float max = Math.max(((float) Math.hypot((double) (f4 - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
        float i6 = i(cVar.f11094c, i4);
        this.f11085g.n(0.0f, 0.0f);
        f j4 = j(i4, cVar.f11092a);
        j4.b(max, i6, cVar.f11096e, this.f11085g);
        this.f11088j.reset();
        this.f11085g.d(this.f11081c[i4], this.f11088j);
        if (!this.f11090l || (!j4.a() && !l(this.f11088j, i4) && !l(this.f11088j, i5))) {
            this.f11085g.d(this.f11081c[i4], cVar.f11093b);
        } else {
            Path path = this.f11088j;
            path.op(path, this.f11084f, Path.Op.DIFFERENCE);
            this.f11086h[0] = this.f11085g.k();
            this.f11086h[1] = this.f11085g.l();
            this.f11081c[i4].mapPoints(this.f11086h);
            Path path2 = this.f11083e;
            float[] fArr3 = this.f11086h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.f11085g.d(this.f11081c[i4], this.f11083e);
        }
        b bVar = cVar.f11095d;
        if (bVar != null) {
            bVar.a(this.f11085g, this.f11081c[i4], i4);
        }
    }

    public void d(k kVar, float f4, RectF rectF, Path path) {
        e(kVar, f4, rectF, (b) null, path);
    }

    public void e(k kVar, float f4, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f11083e.rewind();
        this.f11084f.rewind();
        this.f11084f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f4, rectF, bVar, path);
        for (int i4 = 0; i4 < 4; i4++) {
            m(cVar, i4);
            n(i4);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            b(cVar, i5);
            c(cVar, i5);
        }
        path.close();
        this.f11083e.close();
        if (!this.f11083e.isEmpty()) {
            path.op(this.f11083e, Path.Op.UNION);
        }
    }

    public final void f(int i4, RectF rectF, PointF pointF) {
        if (i4 == 1) {
            pointF.set(rectF.right, rectF.bottom);
        } else if (i4 == 2) {
            pointF.set(rectF.left, rectF.bottom);
        } else if (i4 != 3) {
            pointF.set(rectF.right, rectF.top);
        } else {
            pointF.set(rectF.left, rectF.top);
        }
    }

    public final C0780c g(int i4, k kVar) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    public final C0781d h(int i4, k kVar) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    public final float i(RectF rectF, int i4) {
        float[] fArr = this.f11086h;
        m mVar = this.f11079a[i4];
        fArr[0] = mVar.f11099c;
        fArr[1] = mVar.f11100d;
        this.f11080b[i4].mapPoints(fArr);
        return (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - this.f11086h[0]) : Math.abs(rectF.centerY() - this.f11086h[1]);
    }

    public final f j(int i4, k kVar) {
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public final boolean l(Path path, int i4) {
        this.f11089k.reset();
        this.f11079a[i4].d(this.f11080b[i4], this.f11089k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f11089k.computeBounds(rectF, true);
        path.op(this.f11089k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    public final void m(c cVar, int i4) {
        h(i4, cVar.f11092a).b(this.f11079a[i4], 90.0f, cVar.f11096e, cVar.f11094c, g(i4, cVar.f11092a));
        float a4 = a(i4);
        this.f11080b[i4].reset();
        f(i4, cVar.f11094c, this.f11082d);
        Matrix matrix = this.f11080b[i4];
        PointF pointF = this.f11082d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f11080b[i4].preRotate(a4);
    }

    public final void n(int i4) {
        this.f11086h[0] = this.f11079a[i4].i();
        this.f11086h[1] = this.f11079a[i4].j();
        this.f11080b[i4].mapPoints(this.f11086h);
        float a4 = a(i4);
        this.f11081c[i4].reset();
        Matrix matrix = this.f11081c[i4];
        float[] fArr = this.f11086h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f11081c[i4].preRotate(a4);
    }
}
