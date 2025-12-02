package i0;

import S.C0332x;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import h0.C0650a;

/* renamed from: i0.v  reason: case insensitive filesystem */
public abstract class C0700v {
    public static int a(C0695p pVar, boolean z4, boolean z5) {
        return z5 ? z4 ? pVar.J() : pVar.K() : z4 ? pVar.v() : pVar.y();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x006b */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b A[SYNTHETIC, Splitter:B:31:0x006b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i0.C0700v.a b(android.content.Context r4, i0.C0695p r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.F()
            int r7 = a(r5, r6, r7)
            r1 = 0
            r5.v1(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.f10143K
            r2 = 0
            if (r1 == 0) goto L_0x0020
            int r3 = h0.C0651b.f9588c
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L_0x0020
            android.view.ViewGroup r1 = r5.f10143K
            int r3 = h0.C0651b.f9588c
            r1.setTag(r3, r2)
        L_0x0020:
            android.view.ViewGroup r1 = r5.f10143K
            if (r1 == 0) goto L_0x002b
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L_0x002b
            return r2
        L_0x002b:
            android.view.animation.Animation r1 = r5.q0(r0, r6, r7)
            if (r1 == 0) goto L_0x0037
            i0.v$a r4 = new i0.v$a
            r4.<init>((android.view.animation.Animation) r1)
            return r4
        L_0x0037:
            android.animation.Animator r5 = r5.r0(r0, r6, r7)
            if (r5 == 0) goto L_0x0043
            i0.v$a r4 = new i0.v$a
            r4.<init>((android.animation.Animator) r5)
            return r4
        L_0x0043:
            if (r7 != 0) goto L_0x004b
            if (r0 == 0) goto L_0x004b
            int r7 = d(r4, r0, r6)
        L_0x004b:
            if (r7 == 0) goto L_0x0087
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x006b
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch:{ NotFoundException -> 0x0069, RuntimeException -> 0x006b }
            if (r6 == 0) goto L_0x0087
            i0.v$a r0 = new i0.v$a     // Catch:{ NotFoundException -> 0x0069, RuntimeException -> 0x006b }
            r0.<init>((android.view.animation.Animation) r6)     // Catch:{ NotFoundException -> 0x0069, RuntimeException -> 0x006b }
            return r0
        L_0x0069:
            r4 = move-exception
            throw r4
        L_0x006b:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch:{ RuntimeException -> 0x0077 }
            if (r6 == 0) goto L_0x0087
            i0.v$a r0 = new i0.v$a     // Catch:{ RuntimeException -> 0x0077 }
            r0.<init>((android.animation.Animator) r6)     // Catch:{ RuntimeException -> 0x0077 }
            return r0
        L_0x0077:
            r6 = move-exception
            if (r5 != 0) goto L_0x0086
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L_0x0087
            i0.v$a r5 = new i0.v$a
            r5.<init>((android.view.animation.Animation) r4)
            return r5
        L_0x0086:
            throw r6
        L_0x0087:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C0700v.b(android.content.Context, i0.p, boolean, boolean):i0.v$a");
    }

    public static int c(Context context, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i4});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i4, boolean z4) {
        if (i4 == 4097) {
            return z4 ? C0650a.f9584e : C0650a.f9585f;
        }
        if (i4 == 8194) {
            return z4 ? C0650a.f9580a : C0650a.f9581b;
        }
        if (i4 == 8197) {
            return z4 ? c(context, 16842938) : c(context, 16842939);
        }
        if (i4 == 4099) {
            return z4 ? C0650a.f9582c : C0650a.f9583d;
        }
        if (i4 != 4100) {
            return -1;
        }
        return z4 ? c(context, 16842936) : c(context, 16842937);
    }

    /* renamed from: i0.v$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f10225a;

        /* renamed from: b  reason: collision with root package name */
        public final AnimatorSet f10226b;

        public a(Animation animation) {
            this.f10225a = animation;
            this.f10226b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f10225a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f10226b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: i0.v$b */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final ViewGroup f10227e;

        /* renamed from: f  reason: collision with root package name */
        public final View f10228f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f10229g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f10230h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f10231i = true;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f10227e = viewGroup;
            this.f10228f = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j4, Transformation transformation) {
            this.f10231i = true;
            if (this.f10229g) {
                return !this.f10230h;
            }
            if (!super.getTransformation(j4, transformation)) {
                this.f10229g = true;
                C0332x.a(this.f10227e, this);
            }
            return true;
        }

        public void run() {
            if (this.f10229g || !this.f10231i) {
                this.f10227e.endViewTransition(this.f10228f);
                this.f10230h = true;
                return;
            }
            this.f10231i = false;
            this.f10227e.post(this);
        }

        public boolean getTransformation(long j4, Transformation transformation, float f4) {
            this.f10231i = true;
            if (this.f10229g) {
                return !this.f10230h;
            }
            if (!super.getTransformation(j4, transformation, f4)) {
                this.f10229g = true;
                C0332x.a(this.f10227e, this);
            }
            return true;
        }
    }
}
