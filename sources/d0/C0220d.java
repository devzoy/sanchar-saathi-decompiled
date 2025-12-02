package D0;

import S.C;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: D0.d  reason: case insensitive filesystem */
public class C0220d extends M {

    /* renamed from: D0.d$a */
    public class a extends C0229m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f629a;

        public a(View view) {
            this.f629a = view;
        }

        public void d(C0228l lVar) {
            z.g(this.f629a, 1.0f);
            z.a(this.f629a);
            lVar.U(this);
        }
    }

    /* renamed from: D0.d$b */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f631a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f632b = false;

        public b(View view) {
            this.f631a = view;
        }

        public void onAnimationEnd(Animator animator) {
            z.g(this.f631a, 1.0f);
            if (this.f632b) {
                this.f631a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C.I(this.f631a) && this.f631a.getLayerType() == 0) {
                this.f632b = true;
                this.f631a.setLayerType(2, (Paint) null);
            }
        }
    }

    public C0220d(int i4) {
        n0(i4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f714a.get("android:fade:transitionAlpha");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static float p0(D0.r r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map r1 = r1.f714a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.C0220d.p0(D0.r, float):float");
    }

    public Animator k0(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        float f4 = 0.0f;
        float p02 = p0(rVar, 0.0f);
        if (p02 != 1.0f) {
            f4 = p02;
        }
        return o0(view, f4, 1.0f);
    }

    public Animator m0(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        z.e(view);
        return o0(view, p0(rVar, 1.0f), 0.0f);
    }

    public void o(r rVar) {
        super.o(rVar);
        rVar.f714a.put("android:fade:transitionAlpha", Float.valueOf(z.c(rVar.f715b)));
    }

    public final Animator o0(View view, float f4, float f5) {
        if (f4 == f5) {
            return null;
        }
        z.g(view, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, z.f725b, new float[]{f5});
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }
}
