package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import h.C0645a;
import h.C0647c;
import h.C0649e;
import j.C0754a;
import p.V;

/* renamed from: p.i  reason: case insensitive filesystem */
public final class C0842i {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f11550b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static C0842i f11551c;

    /* renamed from: a  reason: collision with root package name */
    public V f11552a;

    /* renamed from: p.i$a */
    public class a implements V.c {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f11553a = {C0649e.f9226S, C0649e.f9224Q, C0649e.f9228a};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f11554b = {C0649e.f9242o, C0649e.f9209B, C0649e.f9247t, C0649e.f9243p, C0649e.f9244q, C0649e.f9246s, C0649e.f9245r};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f11555c = {C0649e.f9223P, C0649e.f9225R, C0649e.f9238k, C0649e.f9216I, C0649e.f9217J, C0649e.f9219L, C0649e.f9221N, C0649e.f9218K, C0649e.f9220M, C0649e.f9222O};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f11556d = {C0649e.f9250w, C0649e.f9236i, C0649e.f9249v};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f11557e = {C0649e.f9215H, C0649e.f9227T};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f11558f = {C0649e.f9230c, C0649e.f9234g, C0649e.f9231d, C0649e.f9235h};

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006c A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
            /*
                r7 = this;
                android.graphics.PorterDuff$Mode r0 = p.C0842i.f11550b
                int[] r1 = r7.f11553a
                boolean r1 = r7.f(r1, r9)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L_0x0015
                int r9 = h.C0645a.f9186t
            L_0x0011:
                r1 = r0
                r5 = r2
            L_0x0013:
                r0 = r4
                goto L_0x004f
            L_0x0015:
                int[] r1 = r7.f11555c
                boolean r1 = r7.f(r1, r9)
                if (r1 == 0) goto L_0x0020
                int r9 = h.C0645a.f9184r
                goto L_0x0011
            L_0x0020:
                int[] r1 = r7.f11556d
                boolean r1 = r7.f(r1, r9)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L_0x0032
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L_0x002d:
                r1 = r0
                r0 = r4
                r9 = r5
                r5 = r2
                goto L_0x004f
            L_0x0032:
                int r1 = h.C0649e.f9248u
                if (r9 != r1) goto L_0x0046
                r9 = 1109603123(0x42233333, float:40.8)
                int r9 = java.lang.Math.round(r9)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r2
                r6 = r0
                r0 = r9
                r9 = r1
                r1 = r6
                goto L_0x004f
            L_0x0046:
                int r1 = h.C0649e.f9239l
                if (r9 != r1) goto L_0x004b
                goto L_0x002d
            L_0x004b:
                r1 = r0
                r9 = r3
                r5 = r9
                goto L_0x0013
            L_0x004f:
                if (r5 == 0) goto L_0x006c
                boolean r3 = p.K.a(r10)
                if (r3 == 0) goto L_0x005b
                android.graphics.drawable.Drawable r10 = r10.mutate()
            L_0x005b:
                int r8 = p.b0.c(r8, r9)
                android.graphics.PorterDuffColorFilter r8 = p.C0842i.e(r8, r1)
                r10.setColorFilter(r8)
                if (r0 == r4) goto L_0x006b
                r10.setAlpha(r0)
            L_0x006b:
                return r2
            L_0x006c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p.C0842i.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        public Drawable b(V v4, Context context, int i4) {
            if (i4 == C0649e.f9237j) {
                return new LayerDrawable(new Drawable[]{v4.i(context, C0649e.f9236i), v4.i(context, C0649e.f9238k)});
            }
            return null;
        }

        public PorterDuff.Mode c(int i4) {
            if (i4 == C0649e.f9213F) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public ColorStateList d(Context context, int i4) {
            if (i4 == C0649e.f9240m) {
                return C0754a.a(context, C0647c.f9198e);
            }
            if (i4 == C0649e.f9214G) {
                return C0754a.a(context, C0647c.f9201h);
            }
            if (i4 == C0649e.f9213F) {
                return k(context);
            }
            if (i4 == C0649e.f9233f) {
                return j(context);
            }
            if (i4 == C0649e.f9229b) {
                return g(context);
            }
            if (i4 == C0649e.f9232e) {
                return i(context);
            }
            if (i4 == C0649e.f9211D || i4 == C0649e.f9212E) {
                return C0754a.a(context, C0647c.f9200g);
            }
            if (f(this.f11554b, i4)) {
                return b0.e(context, C0645a.f9186t);
            }
            if (f(this.f11557e, i4)) {
                return C0754a.a(context, C0647c.f9197d);
            }
            if (f(this.f11558f, i4)) {
                return C0754a.a(context, C0647c.f9196c);
            }
            if (i4 == C0649e.f9208A) {
                return C0754a.a(context, C0647c.f9199f);
            }
            return null;
        }

        public boolean e(Context context, int i4, Drawable drawable) {
            if (i4 == C0649e.f9210C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                l(layerDrawable.findDrawableByLayerId(16908288), b0.c(context, C0645a.f9186t), C0842i.f11550b);
                l(layerDrawable.findDrawableByLayerId(16908303), b0.c(context, C0645a.f9186t), C0842i.f11550b);
                l(layerDrawable.findDrawableByLayerId(16908301), b0.c(context, C0645a.f9184r), C0842i.f11550b);
                return true;
            } else if (i4 != C0649e.f9252y && i4 != C0649e.f9251x && i4 != C0649e.f9253z) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                l(layerDrawable2.findDrawableByLayerId(16908288), b0.b(context, C0645a.f9186t), C0842i.f11550b);
                l(layerDrawable2.findDrawableByLayerId(16908303), b0.c(context, C0645a.f9184r), C0842i.f11550b);
                l(layerDrawable2.findDrawableByLayerId(16908301), b0.c(context, C0645a.f9184r), C0842i.f11550b);
                return true;
            }
        }

        public final boolean f(int[] iArr, int i4) {
            for (int i5 : iArr) {
                if (i5 == i4) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i4) {
            int c4 = b0.c(context, C0645a.f9185s);
            int b4 = b0.b(context, C0645a.f9183q);
            return new ColorStateList(new int[][]{b0.f11505b, b0.f11508e, b0.f11506c, b0.f11512i}, new int[]{b4, J.a.b(c4, i4), J.a.b(c4, i4), i4});
        }

        public final ColorStateList i(Context context) {
            return h(context, b0.c(context, C0645a.f9182p));
        }

        public final ColorStateList j(Context context) {
            return h(context, b0.c(context, C0645a.f9183q));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList e4 = b0.e(context, C0645a.f9187u);
            if (e4 == null || !e4.isStateful()) {
                iArr[0] = b0.f11505b;
                iArr2[0] = b0.b(context, C0645a.f9187u);
                iArr[1] = b0.f11509f;
                iArr2[1] = b0.c(context, C0645a.f9184r);
                iArr[2] = b0.f11512i;
                iArr2[2] = b0.c(context, C0645a.f9187u);
            } else {
                int[] iArr3 = b0.f11505b;
                iArr[0] = iArr3;
                iArr2[0] = e4.getColorForState(iArr3, 0);
                iArr[1] = b0.f11509f;
                iArr2[1] = b0.c(context, C0645a.f9184r);
                iArr[2] = b0.f11512i;
                iArr2[2] = e4.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final void l(Drawable drawable, int i4, PorterDuff.Mode mode) {
            if (K.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0842i.f11550b;
            }
            drawable.setColorFilter(C0842i.e(i4, mode));
        }
    }

    public static synchronized C0842i b() {
        C0842i iVar;
        synchronized (C0842i.class) {
            try {
                if (f11551c == null) {
                    h();
                }
                iVar = f11551c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return iVar;
    }

    public static synchronized PorterDuffColorFilter e(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter k4;
        synchronized (C0842i.class) {
            k4 = V.k(i4, mode);
        }
        return k4;
    }

    public static synchronized void h() {
        synchronized (C0842i.class) {
            if (f11551c == null) {
                C0842i iVar = new C0842i();
                f11551c = iVar;
                iVar.f11552a = V.g();
                f11551c.f11552a.t(new a());
            }
        }
    }

    public static void i(Drawable drawable, d0 d0Var, int[] iArr) {
        V.v(drawable, d0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i4) {
        return this.f11552a.i(context, i4);
    }

    public synchronized Drawable d(Context context, int i4, boolean z4) {
        return this.f11552a.j(context, i4, z4);
    }

    public synchronized ColorStateList f(Context context, int i4) {
        return this.f11552a.l(context, i4);
    }

    public synchronized void g(Context context) {
        this.f11552a.r(context);
    }
}
