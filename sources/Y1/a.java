package Y1;

import S.C;
import V1.j;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import b2.C0393a;
import com.google.android.material.button.MaterialButton;
import i2.c;
import j2.C0760a;
import j2.C0761b;
import l2.g;
import l2.k;
import l2.n;

public class a {

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f3722t = true;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f3723a;

    /* renamed from: b  reason: collision with root package name */
    public k f3724b;

    /* renamed from: c  reason: collision with root package name */
    public int f3725c;

    /* renamed from: d  reason: collision with root package name */
    public int f3726d;

    /* renamed from: e  reason: collision with root package name */
    public int f3727e;

    /* renamed from: f  reason: collision with root package name */
    public int f3728f;

    /* renamed from: g  reason: collision with root package name */
    public int f3729g;

    /* renamed from: h  reason: collision with root package name */
    public int f3730h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f3731i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f3732j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f3733k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f3734l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f3735m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3736n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3737o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3738p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3739q;

    /* renamed from: r  reason: collision with root package name */
    public LayerDrawable f3740r;

    /* renamed from: s  reason: collision with root package name */
    public int f3741s;

    public a(MaterialButton materialButton, k kVar) {
        this.f3723a = materialButton;
        this.f3724b = kVar;
    }

    public void A(ColorStateList colorStateList) {
        if (this.f3733k != colorStateList) {
            this.f3733k = colorStateList;
            H();
        }
    }

    public void B(int i4) {
        if (this.f3730h != i4) {
            this.f3730h = i4;
            H();
        }
    }

    public void C(ColorStateList colorStateList) {
        if (this.f3732j != colorStateList) {
            this.f3732j = colorStateList;
            if (f() != null) {
                K.a.i(f(), this.f3732j);
            }
        }
    }

    public void D(PorterDuff.Mode mode) {
        if (this.f3731i != mode) {
            this.f3731i = mode;
            if (f() != null && this.f3731i != null) {
                K.a.j(f(), this.f3731i);
            }
        }
    }

    public final void E(int i4, int i5) {
        int B4 = C.B(this.f3723a);
        int paddingTop = this.f3723a.getPaddingTop();
        int A4 = C.A(this.f3723a);
        int paddingBottom = this.f3723a.getPaddingBottom();
        int i6 = this.f3727e;
        int i7 = this.f3728f;
        this.f3728f = i5;
        this.f3727e = i4;
        if (!this.f3737o) {
            F();
        }
        C.u0(this.f3723a, B4, (paddingTop + i4) - i6, A4, (paddingBottom + i5) - i7);
    }

    public final void F() {
        this.f3723a.setInternalBackground(a());
        g f4 = f();
        if (f4 != null) {
            f4.T((float) this.f3741s);
        }
    }

    public final void G(k kVar) {
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    public final void H() {
        g f4 = f();
        g n4 = n();
        if (f4 != null) {
            f4.Z((float) this.f3730h, this.f3733k);
            if (n4 != null) {
                n4.Y((float) this.f3730h, this.f3736n ? C0393a.c(this.f3723a, V1.a.f2976k) : 0);
            }
        }
    }

    public final InsetDrawable I(Drawable drawable) {
        return new InsetDrawable(drawable, this.f3725c, this.f3727e, this.f3726d, this.f3728f);
    }

    public final Drawable a() {
        g gVar = new g(this.f3724b);
        gVar.K(this.f3723a.getContext());
        K.a.i(gVar, this.f3732j);
        PorterDuff.Mode mode = this.f3731i;
        if (mode != null) {
            K.a.j(gVar, mode);
        }
        gVar.Z((float) this.f3730h, this.f3733k);
        g gVar2 = new g(this.f3724b);
        gVar2.setTint(0);
        gVar2.Y((float) this.f3730h, this.f3736n ? C0393a.c(this.f3723a, V1.a.f2976k) : 0);
        if (f3722t) {
            g gVar3 = new g(this.f3724b);
            this.f3735m = gVar3;
            K.a.h(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C0761b.a(this.f3734l), I(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f3735m);
            this.f3740r = rippleDrawable;
            return rippleDrawable;
        }
        C0760a aVar = new C0760a(this.f3724b);
        this.f3735m = aVar;
        K.a.i(aVar, C0761b.a(this.f3734l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f3735m});
        this.f3740r = layerDrawable;
        return I(layerDrawable);
    }

    public int b() {
        return this.f3729g;
    }

    public int c() {
        return this.f3728f;
    }

    public int d() {
        return this.f3727e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f3740r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f3740r.getNumberOfLayers() > 2 ? (n) this.f3740r.getDrawable(2) : (n) this.f3740r.getDrawable(1);
    }

    public g f() {
        return g(false);
    }

    public final g g(boolean z4) {
        LayerDrawable layerDrawable = this.f3740r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f3722t ? (g) ((LayerDrawable) ((InsetDrawable) this.f3740r.getDrawable(0)).getDrawable()).getDrawable(z4 ^ true ? 1 : 0) : (g) this.f3740r.getDrawable(z4 ^ true ? 1 : 0);
    }

    public ColorStateList h() {
        return this.f3734l;
    }

    public k i() {
        return this.f3724b;
    }

    public ColorStateList j() {
        return this.f3733k;
    }

    public int k() {
        return this.f3730h;
    }

    public ColorStateList l() {
        return this.f3732j;
    }

    public PorterDuff.Mode m() {
        return this.f3731i;
    }

    public final g n() {
        return g(true);
    }

    public boolean o() {
        return this.f3737o;
    }

    public boolean p() {
        return this.f3739q;
    }

    public void q(TypedArray typedArray) {
        this.f3725c = typedArray.getDimensionPixelOffset(j.f3197M1, 0);
        this.f3726d = typedArray.getDimensionPixelOffset(j.f3202N1, 0);
        this.f3727e = typedArray.getDimensionPixelOffset(j.f3207O1, 0);
        this.f3728f = typedArray.getDimensionPixelOffset(j.f3212P1, 0);
        if (typedArray.hasValue(j.f3230T1)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(j.f3230T1, -1);
            this.f3729g = dimensionPixelSize;
            y(this.f3724b.w((float) dimensionPixelSize));
            this.f3738p = true;
        }
        this.f3730h = typedArray.getDimensionPixelSize(j.f3274d2, 0);
        this.f3731i = g2.j.e(typedArray.getInt(j.f3226S1, -1), PorterDuff.Mode.SRC_IN);
        this.f3732j = c.a(this.f3723a.getContext(), typedArray, j.f3222R1);
        this.f3733k = c.a(this.f3723a.getContext(), typedArray, j.f3269c2);
        this.f3734l = c.a(this.f3723a.getContext(), typedArray, j.f3264b2);
        this.f3739q = typedArray.getBoolean(j.f3217Q1, false);
        this.f3741s = typedArray.getDimensionPixelSize(j.f3234U1, 0);
        int B4 = C.B(this.f3723a);
        int paddingTop = this.f3723a.getPaddingTop();
        int A4 = C.A(this.f3723a);
        int paddingBottom = this.f3723a.getPaddingBottom();
        if (typedArray.hasValue(j.f3192L1)) {
            s();
        } else {
            F();
        }
        C.u0(this.f3723a, B4 + this.f3725c, paddingTop + this.f3727e, A4 + this.f3726d, paddingBottom + this.f3728f);
    }

    public void r(int i4) {
        if (f() != null) {
            f().setTint(i4);
        }
    }

    public void s() {
        this.f3737o = true;
        this.f3723a.setSupportBackgroundTintList(this.f3732j);
        this.f3723a.setSupportBackgroundTintMode(this.f3731i);
    }

    public void t(boolean z4) {
        this.f3739q = z4;
    }

    public void u(int i4) {
        if (!this.f3738p || this.f3729g != i4) {
            this.f3729g = i4;
            this.f3738p = true;
            y(this.f3724b.w((float) i4));
        }
    }

    public void v(int i4) {
        E(this.f3727e, i4);
    }

    public void w(int i4) {
        E(i4, this.f3728f);
    }

    public void x(ColorStateList colorStateList) {
        if (this.f3734l != colorStateList) {
            this.f3734l = colorStateList;
            boolean z4 = f3722t;
            if (z4 && (this.f3723a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f3723a.getBackground()).setColor(C0761b.a(colorStateList));
            } else if (!z4 && (this.f3723a.getBackground() instanceof C0760a)) {
                ((C0760a) this.f3723a.getBackground()).setTintList(C0761b.a(colorStateList));
            }
        }
    }

    public void y(k kVar) {
        this.f3724b = kVar;
        G(kVar);
    }

    public void z(boolean z4) {
        this.f3736n = z4;
        H();
    }
}
