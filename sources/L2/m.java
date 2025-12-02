package l2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import k2.C0770a;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public float f11097a;

    /* renamed from: b  reason: collision with root package name */
    public float f11098b;

    /* renamed from: c  reason: collision with root package name */
    public float f11099c;

    /* renamed from: d  reason: collision with root package name */
    public float f11100d;

    /* renamed from: e  reason: collision with root package name */
    public float f11101e;

    /* renamed from: f  reason: collision with root package name */
    public float f11102f;

    /* renamed from: g  reason: collision with root package name */
    public final List f11103g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List f11104h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public boolean f11105i;

    public class a extends g {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ List f11106b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Matrix f11107c;

        public a(List list, Matrix matrix) {
            this.f11106b = list;
            this.f11107c = matrix;
        }

        public void a(Matrix matrix, C0770a aVar, int i4, Canvas canvas) {
            for (g a4 : this.f11106b) {
                a4.a(this.f11107c, aVar, i4, canvas);
            }
        }
    }

    public static class b extends g {

        /* renamed from: b  reason: collision with root package name */
        public final d f11109b;

        public b(d dVar) {
            this.f11109b = dVar;
        }

        public void a(Matrix matrix, C0770a aVar, int i4, Canvas canvas) {
            float h4 = this.f11109b.m();
            float i5 = this.f11109b.n();
            aVar.a(canvas, matrix, new RectF(this.f11109b.k(), this.f11109b.o(), this.f11109b.l(), this.f11109b.j()), i4, h4, i5);
        }
    }

    public static class c extends g {

        /* renamed from: b  reason: collision with root package name */
        public final e f11110b;

        /* renamed from: c  reason: collision with root package name */
        public final float f11111c;

        /* renamed from: d  reason: collision with root package name */
        public final float f11112d;

        public c(e eVar, float f4, float f5) {
            this.f11110b = eVar;
            this.f11111c = f4;
            this.f11112d = f5;
        }

        public void a(Matrix matrix, C0770a aVar, int i4, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (this.f11110b.f11121c - this.f11112d), (double) (this.f11110b.f11120b - this.f11111c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f11111c, this.f11112d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i4);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((double) ((this.f11110b.f11121c - this.f11112d) / (this.f11110b.f11120b - this.f11111c))));
        }
    }

    public static class d extends f {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f11113h = new RectF();

        /* renamed from: b  reason: collision with root package name */
        public float f11114b;

        /* renamed from: c  reason: collision with root package name */
        public float f11115c;

        /* renamed from: d  reason: collision with root package name */
        public float f11116d;

        /* renamed from: e  reason: collision with root package name */
        public float f11117e;

        /* renamed from: f  reason: collision with root package name */
        public float f11118f;

        /* renamed from: g  reason: collision with root package name */
        public float f11119g;

        public d(float f4, float f5, float f6, float f7) {
            q(f4);
            u(f5);
            r(f6);
            p(f7);
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f11122a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f11113h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f11117e;
        }

        public final float k() {
            return this.f11114b;
        }

        public final float l() {
            return this.f11116d;
        }

        public final float m() {
            return this.f11118f;
        }

        public final float n() {
            return this.f11119g;
        }

        public final float o() {
            return this.f11115c;
        }

        public final void p(float f4) {
            this.f11117e = f4;
        }

        public final void q(float f4) {
            this.f11114b = f4;
        }

        public final void r(float f4) {
            this.f11116d = f4;
        }

        public final void s(float f4) {
            this.f11118f = f4;
        }

        public final void t(float f4) {
            this.f11119g = f4;
        }

        public final void u(float f4) {
            this.f11115c = f4;
        }
    }

    public static class e extends f {

        /* renamed from: b  reason: collision with root package name */
        public float f11120b;

        /* renamed from: c  reason: collision with root package name */
        public float f11121c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f11122a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f11120b, this.f11121c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f11122a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class g {

        /* renamed from: a  reason: collision with root package name */
        public static final Matrix f11123a = new Matrix();

        public abstract void a(Matrix matrix, C0770a aVar, int i4, Canvas canvas);

        public final void b(C0770a aVar, int i4, Canvas canvas) {
            a(f11123a, aVar, i4, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    public void a(float f4, float f5, float f6, float f7, float f8, float f9) {
        d dVar = new d(f4, f5, f6, f7);
        dVar.s(f8);
        dVar.t(f9);
        this.f11103g.add(dVar);
        b bVar = new b(dVar);
        float f10 = f8 + f9;
        boolean z4 = f9 < 0.0f;
        if (z4) {
            f8 = (f8 + 180.0f) % 360.0f;
        }
        c(bVar, f8, z4 ? (180.0f + f10) % 360.0f : f10);
        double d4 = (double) f10;
        r(((f4 + f6) * 0.5f) + (((f6 - f4) / 2.0f) * ((float) Math.cos(Math.toRadians(d4)))));
        s(((f5 + f7) * 0.5f) + (((f7 - f5) / 2.0f) * ((float) Math.sin(Math.toRadians(d4)))));
    }

    public final void b(float f4) {
        if (g() != f4) {
            float g4 = ((f4 - g()) + 360.0f) % 360.0f;
            if (g4 <= 180.0f) {
                d dVar = new d(i(), j(), i(), j());
                dVar.s(g());
                dVar.t(g4);
                this.f11104h.add(new b(dVar));
                p(f4);
            }
        }
    }

    public final void c(g gVar, float f4, float f5) {
        b(f4);
        this.f11104h.add(gVar);
        p(f5);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f11103g.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((f) this.f11103g.get(i4)).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f11105i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f11104h), new Matrix(matrix));
    }

    public final float g() {
        return this.f11101e;
    }

    public final float h() {
        return this.f11102f;
    }

    public float i() {
        return this.f11099c;
    }

    public float j() {
        return this.f11100d;
    }

    public float k() {
        return this.f11097a;
    }

    public float l() {
        return this.f11098b;
    }

    public void m(float f4, float f5) {
        e eVar = new e();
        float unused = eVar.f11120b = f4;
        float unused2 = eVar.f11121c = f5;
        this.f11103g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f4);
        s(f5);
    }

    public void n(float f4, float f5) {
        o(f4, f5, 270.0f, 0.0f);
    }

    public void o(float f4, float f5, float f6, float f7) {
        t(f4);
        u(f5);
        r(f4);
        s(f5);
        p(f6);
        q((f6 + f7) % 360.0f);
        this.f11103g.clear();
        this.f11104h.clear();
        this.f11105i = false;
    }

    public final void p(float f4) {
        this.f11101e = f4;
    }

    public final void q(float f4) {
        this.f11102f = f4;
    }

    public final void r(float f4) {
        this.f11099c = f4;
    }

    public final void s(float f4) {
        this.f11100d = f4;
    }

    public final void t(float f4) {
        this.f11097a = f4;
    }

    public final void u(float f4) {
        this.f11098b = f4;
    }
}
