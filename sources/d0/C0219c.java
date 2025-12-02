package D0;

import S.C;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: D0.c  reason: case insensitive filesystem */
public class C0219c extends C0228l {

    /* renamed from: P  reason: collision with root package name */
    public static final String[] f592P = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: Q  reason: collision with root package name */
    public static final Property f593Q;

    /* renamed from: R  reason: collision with root package name */
    public static final Property f594R;

    /* renamed from: S  reason: collision with root package name */
    public static final Property f595S;

    /* renamed from: T  reason: collision with root package name */
    public static final Property f596T;

    /* renamed from: U  reason: collision with root package name */
    public static final Property f597U;

    /* renamed from: V  reason: collision with root package name */
    public static final Property f598V;

    /* renamed from: W  reason: collision with root package name */
    public static C0226j f599W = new C0226j();

    /* renamed from: M  reason: collision with root package name */
    public int[] f600M = new int[2];

    /* renamed from: N  reason: collision with root package name */
    public boolean f601N = false;

    /* renamed from: O  reason: collision with root package name */
    public boolean f602O = false;

    /* renamed from: D0.c$a */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f603a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ BitmapDrawable f604b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f605c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f606d;

        public a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f4) {
            this.f603a = viewGroup;
            this.f604b = bitmapDrawable;
            this.f605c = view;
            this.f606d = f4;
        }

        public void onAnimationEnd(Animator animator) {
            z.b(this.f603a).d(this.f604b);
            z.g(this.f605c, this.f606d);
        }
    }

    /* renamed from: D0.c$b */
    public class b extends Property {

        /* renamed from: a  reason: collision with root package name */
        public Rect f608a = new Rect();

        public b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f608a);
            Rect rect = this.f608a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f608a);
            this.f608a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f608a);
        }
    }

    /* renamed from: D0.c$c  reason: collision with other inner class name */
    public class C0003c extends Property {
        public C0003c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    /* renamed from: D0.c$d */
    public class d extends Property {
        public d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    /* renamed from: D0.c$e */
    public class e extends Property {
        public e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            z.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: D0.c$f */
    public class f extends Property {
        public f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            z.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: D0.c$g */
    public class g extends Property {
        public g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            z.f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: D0.c$h */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ k f609a;
        private k mViewBounds;

        public h(k kVar) {
            this.f609a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: D0.c$i */
    public class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f611a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f612b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Rect f613c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f614d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f615e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f616f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f617g;

        public i(View view, Rect rect, int i4, int i5, int i6, int i7) {
            this.f612b = view;
            this.f613c = rect;
            this.f614d = i4;
            this.f615e = i5;
            this.f616f = i6;
            this.f617g = i7;
        }

        public void onAnimationCancel(Animator animator) {
            this.f611a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f611a) {
                C.m0(this.f612b, this.f613c);
                z.f(this.f612b, this.f614d, this.f615e, this.f616f, this.f617g);
            }
        }
    }

    /* renamed from: D0.c$j */
    public class j extends C0229m {

        /* renamed from: a  reason: collision with root package name */
        public boolean f619a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f620b;

        public j(ViewGroup viewGroup) {
            this.f620b = viewGroup;
        }

        public void b(C0228l lVar) {
            w.c(this.f620b, false);
            this.f619a = true;
        }

        public void c(C0228l lVar) {
            w.c(this.f620b, false);
        }

        public void d(C0228l lVar) {
            if (!this.f619a) {
                w.c(this.f620b, false);
            }
            lVar.U(this);
        }

        public void e(C0228l lVar) {
            w.c(this.f620b, true);
        }
    }

    /* renamed from: D0.c$k */
    public static class k {

        /* renamed from: a  reason: collision with root package name */
        public int f622a;

        /* renamed from: b  reason: collision with root package name */
        public int f623b;

        /* renamed from: c  reason: collision with root package name */
        public int f624c;

        /* renamed from: d  reason: collision with root package name */
        public int f625d;

        /* renamed from: e  reason: collision with root package name */
        public View f626e;

        /* renamed from: f  reason: collision with root package name */
        public int f627f;

        /* renamed from: g  reason: collision with root package name */
        public int f628g;

        public k(View view) {
            this.f626e = view;
        }

        public void a(PointF pointF) {
            this.f624c = Math.round(pointF.x);
            this.f625d = Math.round(pointF.y);
            int i4 = this.f628g + 1;
            this.f628g = i4;
            if (this.f627f == i4) {
                b();
            }
        }

        public final void b() {
            z.f(this.f626e, this.f622a, this.f623b, this.f624c, this.f625d);
            this.f627f = 0;
            this.f628g = 0;
        }

        public void c(PointF pointF) {
            this.f622a = Math.round(pointF.x);
            this.f623b = Math.round(pointF.y);
            int i4 = this.f627f + 1;
            this.f627f = i4;
            if (i4 == this.f628g) {
                b();
            }
        }
    }

    static {
        Class<PointF> cls = PointF.class;
        f593Q = new b(cls, "boundsOrigin");
        f594R = new C0003c(cls, "topLeft");
        f595S = new d(cls, "bottomRight");
        f596T = new e(cls, "bottomRight");
        f597U = new f(cls, "topLeft");
        f598V = new g(cls, "position");
    }

    public String[] I() {
        return f592P;
    }

    public final void h0(r rVar) {
        View view = rVar.f715b;
        if (C.M(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            rVar.f714a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            rVar.f714a.put("android:changeBounds:parent", rVar.f715b.getParent());
            if (this.f602O) {
                rVar.f715b.getLocationInWindow(this.f600M);
                rVar.f714a.put("android:changeBounds:windowX", Integer.valueOf(this.f600M[0]));
                rVar.f714a.put("android:changeBounds:windowY", Integer.valueOf(this.f600M[1]));
            }
            if (this.f601N) {
                rVar.f714a.put("android:changeBounds:clip", C.r(view));
            }
        }
    }

    public final boolean i0(View view, View view2) {
        if (!this.f602O) {
            return true;
        }
        r y4 = y(view, true);
        if (y4 == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == y4.f715b) {
            return true;
        }
        return false;
    }

    public void l(r rVar) {
        h0(rVar);
    }

    public void o(r rVar) {
        h0(rVar);
    }

    public Animator s(ViewGroup viewGroup, r rVar, r rVar2) {
        int i4;
        View view;
        Animator animator;
        int i5;
        ObjectAnimator objectAnimator;
        r rVar3 = rVar;
        r rVar4 = rVar2;
        if (rVar3 == null || rVar4 == null) {
            return null;
        }
        Map map = rVar3.f714a;
        Map map2 = rVar4.f714a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = rVar4.f715b;
        if (i0(viewGroup2, viewGroup3)) {
            Rect rect = (Rect) rVar3.f714a.get("android:changeBounds:bounds");
            Rect rect2 = (Rect) rVar4.f714a.get("android:changeBounds:bounds");
            int i6 = rect.left;
            int i7 = rect2.left;
            int i8 = rect.top;
            int i9 = rect2.top;
            int i10 = rect.right;
            int i11 = rect2.right;
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            int i14 = i10 - i6;
            int i15 = i12 - i8;
            int i16 = i11 - i7;
            int i17 = i13 - i9;
            View view3 = view2;
            Rect rect3 = (Rect) rVar3.f714a.get("android:changeBounds:clip");
            Rect rect4 = (Rect) rVar4.f714a.get("android:changeBounds:clip");
            if ((i14 == 0 || i15 == 0) && (i16 == 0 || i17 == 0)) {
                i4 = 0;
            } else {
                i4 = (i6 == i7 && i8 == i9) ? 0 : 1;
                if (!(i10 == i11 && i12 == i13)) {
                    i4++;
                }
            }
            if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                i4++;
            }
            if (i4 <= 0) {
                return null;
            }
            Rect rect5 = rect4;
            if (!this.f601N) {
                view = view3;
                z.f(view, i6, i8, i10, i12);
                if (i4 != 2) {
                    animator = (i6 == i7 && i8 == i9) ? C0222f.a(view, f596T, A().a((float) i10, (float) i12, (float) i11, (float) i13)) : C0222f.a(view, f597U, A().a((float) i6, (float) i8, (float) i7, (float) i9));
                } else if (i14 == i16 && i15 == i17) {
                    animator = C0222f.a(view, f598V, A().a((float) i6, (float) i8, (float) i7, (float) i9));
                } else {
                    k kVar = new k(view);
                    ObjectAnimator a4 = C0222f.a(kVar, f594R, A().a((float) i6, (float) i8, (float) i7, (float) i9));
                    ObjectAnimator a5 = C0222f.a(kVar, f595S, A().a((float) i10, (float) i12, (float) i11, (float) i13));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{a4, a5});
                    animatorSet.addListener(new h(kVar));
                    animator = animatorSet;
                }
            } else {
                view = view3;
                z.f(view, i6, i8, Math.max(i14, i16) + i6, Math.max(i15, i17) + i8);
                ObjectAnimator a6 = (i6 == i7 && i8 == i9) ? null : C0222f.a(view, f598V, A().a((float) i6, (float) i8, (float) i7, (float) i9));
                if (rect3 == null) {
                    i5 = 0;
                    rect3 = new Rect(0, 0, i14, i15);
                } else {
                    i5 = 0;
                }
                Rect rect6 = rect5 == null ? new Rect(i5, i5, i16, i17) : rect5;
                if (!rect3.equals(rect6)) {
                    C.m0(view, rect3);
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", f599W, new Object[]{rect3, rect6});
                    ofObject.addListener(new i(view, rect5, i7, i9, i11, i13));
                    objectAnimator = ofObject;
                } else {
                    objectAnimator = null;
                }
                animator = q.c(a6, objectAnimator);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                w.c(viewGroup4, true);
                a(new j(viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) rVar3.f714a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) rVar3.f714a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) rVar4.f714a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) rVar4.f714a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f600M);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c4 = z.c(view2);
        z.g(view2, 0.0f);
        z.b(viewGroup).b(bitmapDrawable);
        C0223g A4 = A();
        int[] iArr = this.f600M;
        int i18 = iArr[0];
        int i19 = iArr[1];
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C0224h.a(f593Q, A4.a((float) (intValue - i18), (float) (intValue2 - i19), (float) (intValue3 - i18), (float) (intValue4 - i19)))});
        ofPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, c4));
        return ofPropertyValuesHolder;
    }
}
