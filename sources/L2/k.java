package l2;

import V1.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

public class k {

    /* renamed from: m  reason: collision with root package name */
    public static final C0780c f11054m = new i(0.5f);

    /* renamed from: a  reason: collision with root package name */
    public C0781d f11055a;

    /* renamed from: b  reason: collision with root package name */
    public C0781d f11056b;

    /* renamed from: c  reason: collision with root package name */
    public C0781d f11057c;

    /* renamed from: d  reason: collision with root package name */
    public C0781d f11058d;

    /* renamed from: e  reason: collision with root package name */
    public C0780c f11059e;

    /* renamed from: f  reason: collision with root package name */
    public C0780c f11060f;

    /* renamed from: g  reason: collision with root package name */
    public C0780c f11061g;

    /* renamed from: h  reason: collision with root package name */
    public C0780c f11062h;

    /* renamed from: i  reason: collision with root package name */
    public f f11063i;

    /* renamed from: j  reason: collision with root package name */
    public f f11064j;

    /* renamed from: k  reason: collision with root package name */
    public f f11065k;

    /* renamed from: l  reason: collision with root package name */
    public f f11066l;

    public interface c {
        C0780c a(C0780c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i4, int i5) {
        return c(context, i4, i5, 0);
    }

    public static b c(Context context, int i4, int i5, int i6) {
        return d(context, i4, i5, new C0778a((float) i6));
    }

    public static b d(Context context, int i4, int i5, C0780c cVar) {
        if (i5 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i4);
            i4 = i5;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i4, j.f3365v3);
        try {
            int i6 = obtainStyledAttributes.getInt(j.f3370w3, 0);
            int i7 = obtainStyledAttributes.getInt(j.f3385z3, i6);
            int i8 = obtainStyledAttributes.getInt(j.f3139A3, i6);
            int i9 = obtainStyledAttributes.getInt(j.f3380y3, i6);
            int i10 = obtainStyledAttributes.getInt(j.f3375x3, i6);
            C0780c m4 = m(obtainStyledAttributes, j.f3144B3, cVar);
            C0780c m5 = m(obtainStyledAttributes, j.f3159E3, m4);
            C0780c m6 = m(obtainStyledAttributes, j.f3164F3, m4);
            C0780c m7 = m(obtainStyledAttributes, j.f3154D3, m4);
            return new b().y(i7, m5).C(i8, m6).u(i9, m7).q(i10, m(obtainStyledAttributes, j.f3149C3, m4));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i4, int i5) {
        return f(context, attributeSet, i4, i5, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i4, int i5, int i6) {
        return g(context, attributeSet, i4, i5, new C0778a((float) i6));
    }

    public static b g(Context context, AttributeSet attributeSet, int i4, int i5, C0780c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3183J2, i4, i5);
        int resourceId = obtainStyledAttributes.getResourceId(j.f3188K2, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(j.f3193L2, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    public static C0780c m(TypedArray typedArray, int i4, C0780c cVar) {
        TypedValue peekValue = typedArray.peekValue(i4);
        if (peekValue == null) {
            return cVar;
        }
        int i5 = peekValue.type;
        return i5 == 5 ? new C0778a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i5 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f11065k;
    }

    public C0781d i() {
        return this.f11058d;
    }

    public C0780c j() {
        return this.f11062h;
    }

    public C0781d k() {
        return this.f11057c;
    }

    public C0780c l() {
        return this.f11061g;
    }

    public f n() {
        return this.f11066l;
    }

    public f o() {
        return this.f11064j;
    }

    public f p() {
        return this.f11063i;
    }

    public C0781d q() {
        return this.f11055a;
    }

    public C0780c r() {
        return this.f11059e;
    }

    public C0781d s() {
        return this.f11056b;
    }

    public C0780c t() {
        return this.f11060f;
    }

    public boolean u(RectF rectF) {
        Class<f> cls = f.class;
        boolean z4 = this.f11066l.getClass().equals(cls) && this.f11064j.getClass().equals(cls) && this.f11063i.getClass().equals(cls) && this.f11065k.getClass().equals(cls);
        float a4 = this.f11059e.a(rectF);
        return z4 && ((this.f11060f.a(rectF) > a4 ? 1 : (this.f11060f.a(rectF) == a4 ? 0 : -1)) == 0 && (this.f11062h.a(rectF) > a4 ? 1 : (this.f11062h.a(rectF) == a4 ? 0 : -1)) == 0 && (this.f11061g.a(rectF) > a4 ? 1 : (this.f11061g.a(rectF) == a4 ? 0 : -1)) == 0) && ((this.f11056b instanceof j) && (this.f11055a instanceof j) && (this.f11057c instanceof j) && (this.f11058d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f4) {
        return v().o(f4).m();
    }

    public k x(C0780c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    public k(b bVar) {
        this.f11055a = bVar.f11067a;
        this.f11056b = bVar.f11068b;
        this.f11057c = bVar.f11069c;
        this.f11058d = bVar.f11070d;
        this.f11059e = bVar.f11071e;
        this.f11060f = bVar.f11072f;
        this.f11061g = bVar.f11073g;
        this.f11062h = bVar.f11074h;
        this.f11063i = bVar.f11075i;
        this.f11064j = bVar.f11076j;
        this.f11065k = bVar.f11077k;
        this.f11066l = bVar.f11078l;
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public C0781d f11067a = h.b();

        /* renamed from: b  reason: collision with root package name */
        public C0781d f11068b = h.b();

        /* renamed from: c  reason: collision with root package name */
        public C0781d f11069c = h.b();

        /* renamed from: d  reason: collision with root package name */
        public C0781d f11070d = h.b();

        /* renamed from: e  reason: collision with root package name */
        public C0780c f11071e = new C0778a(0.0f);

        /* renamed from: f  reason: collision with root package name */
        public C0780c f11072f = new C0778a(0.0f);

        /* renamed from: g  reason: collision with root package name */
        public C0780c f11073g = new C0778a(0.0f);

        /* renamed from: h  reason: collision with root package name */
        public C0780c f11074h = new C0778a(0.0f);

        /* renamed from: i  reason: collision with root package name */
        public f f11075i = h.c();

        /* renamed from: j  reason: collision with root package name */
        public f f11076j = h.c();

        /* renamed from: k  reason: collision with root package name */
        public f f11077k = h.c();

        /* renamed from: l  reason: collision with root package name */
        public f f11078l = h.c();

        public b() {
        }

        public static float n(C0781d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f11053a;
            }
            if (dVar instanceof C0782e) {
                return ((C0782e) dVar).f11002a;
            }
            return -1.0f;
        }

        public b A(float f4) {
            this.f11071e = new C0778a(f4);
            return this;
        }

        public b B(C0780c cVar) {
            this.f11071e = cVar;
            return this;
        }

        public b C(int i4, C0780c cVar) {
            return D(h.a(i4)).F(cVar);
        }

        public b D(C0781d dVar) {
            this.f11068b = dVar;
            float n4 = n(dVar);
            if (n4 != -1.0f) {
                E(n4);
            }
            return this;
        }

        public b E(float f4) {
            this.f11072f = new C0778a(f4);
            return this;
        }

        public b F(C0780c cVar) {
            this.f11072f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f4) {
            return A(f4).E(f4).w(f4).s(f4);
        }

        public b p(C0780c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i4, C0780c cVar) {
            return r(h.a(i4)).t(cVar);
        }

        public b r(C0781d dVar) {
            this.f11070d = dVar;
            float n4 = n(dVar);
            if (n4 != -1.0f) {
                s(n4);
            }
            return this;
        }

        public b s(float f4) {
            this.f11074h = new C0778a(f4);
            return this;
        }

        public b t(C0780c cVar) {
            this.f11074h = cVar;
            return this;
        }

        public b u(int i4, C0780c cVar) {
            return v(h.a(i4)).x(cVar);
        }

        public b v(C0781d dVar) {
            this.f11069c = dVar;
            float n4 = n(dVar);
            if (n4 != -1.0f) {
                w(n4);
            }
            return this;
        }

        public b w(float f4) {
            this.f11073g = new C0778a(f4);
            return this;
        }

        public b x(C0780c cVar) {
            this.f11073g = cVar;
            return this;
        }

        public b y(int i4, C0780c cVar) {
            return z(h.a(i4)).B(cVar);
        }

        public b z(C0781d dVar) {
            this.f11067a = dVar;
            float n4 = n(dVar);
            if (n4 != -1.0f) {
                A(n4);
            }
            return this;
        }

        public b(k kVar) {
            this.f11067a = kVar.f11055a;
            this.f11068b = kVar.f11056b;
            this.f11069c = kVar.f11057c;
            this.f11070d = kVar.f11058d;
            this.f11071e = kVar.f11059e;
            this.f11072f = kVar.f11060f;
            this.f11073g = kVar.f11061g;
            this.f11074h = kVar.f11062h;
            this.f11075i = kVar.f11063i;
            this.f11076j = kVar.f11064j;
            this.f11077k = kVar.f11065k;
            this.f11078l = kVar.f11066l;
        }
    }

    public k() {
        this.f11055a = h.b();
        this.f11056b = h.b();
        this.f11057c = h.b();
        this.f11058d = h.b();
        this.f11059e = new C0778a(0.0f);
        this.f11060f = new C0778a(0.0f);
        this.f11061g = new C0778a(0.0f);
        this.f11062h = new C0778a(0.0f);
        this.f11063i = h.c();
        this.f11064j = h.c();
        this.f11065k = h.c();
        this.f11066l = h.c();
    }
}
