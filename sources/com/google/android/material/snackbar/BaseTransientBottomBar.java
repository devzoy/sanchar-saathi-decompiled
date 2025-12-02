package com.google.android.material.snackbar;

import S.C;
import S.C0310a;
import S.C0330v;
import S.O;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b2.C0393a;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.a;
import java.util.List;
import m2.C0791a;
import o2.C0822a;

public abstract class BaseTransientBottomBar {

    /* renamed from: u  reason: collision with root package name */
    public static final Handler f7993u = new Handler(Looper.getMainLooper(), new j());

    /* renamed from: v  reason: collision with root package name */
    public static final boolean f7994v = false;

    /* renamed from: w  reason: collision with root package name */
    public static final int[] f7995w = {V1.a.f2989x};

    /* renamed from: x  reason: collision with root package name */
    public static final String f7996x = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f7997a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f7998b;

    /* renamed from: c  reason: collision with root package name */
    public final v f7999c;

    /* renamed from: d  reason: collision with root package name */
    public final C0791a f8000d;

    /* renamed from: e  reason: collision with root package name */
    public int f8001e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8002f;

    /* renamed from: g  reason: collision with root package name */
    public View f8003g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8004h = false;

    /* renamed from: i  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f8005i = new k();

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f8006j = new l();

    /* renamed from: k  reason: collision with root package name */
    public Rect f8007k;

    /* renamed from: l  reason: collision with root package name */
    public int f8008l;

    /* renamed from: m  reason: collision with root package name */
    public int f8009m;

    /* renamed from: n  reason: collision with root package name */
    public int f8010n;

    /* renamed from: o  reason: collision with root package name */
    public int f8011o;

    /* renamed from: p  reason: collision with root package name */
    public int f8012p;

    /* renamed from: q  reason: collision with root package name */
    public List f8013q;

    /* renamed from: r  reason: collision with root package name */
    public Behavior f8014r;

    /* renamed from: s  reason: collision with root package name */
    public final AccessibilityManager f8015s;

    /* renamed from: t  reason: collision with root package name */
    public a.b f8016t = new o();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k  reason: collision with root package name */
        public final s f8017k = new s(this);

        public boolean E(View view) {
            return this.f8017k.a(view);
        }

        public final void P(BaseTransientBottomBar baseTransientBottomBar) {
            this.f8017k.c(baseTransientBottomBar);
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f8017k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            v vVar = BaseTransientBottomBar.this.f7999c;
            if (vVar != null) {
                if (vVar.getParent() != null) {
                    BaseTransientBottomBar.this.f7999c.setVisibility(0);
                }
                if (BaseTransientBottomBar.this.f7999c.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.T();
                } else {
                    BaseTransientBottomBar.this.V();
                }
            }
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.L();
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8020a;

        public c(int i4) {
            this.f8020a = i4;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.K(this.f8020a);
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f7999c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public class e implements ValueAnimator.AnimatorUpdateListener {
        public e() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f7999c.setScaleX(floatValue);
            BaseTransientBottomBar.this.f7999c.setScaleY(floatValue);
        }
    }

    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.L();
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f8000d.a(70, 180);
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public int f8025a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f8026b;

        public g(int i4) {
            this.f8026b = i4;
            this.f8025a = i4;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f7994v) {
                C.S(BaseTransientBottomBar.this.f7999c, intValue - this.f8025a);
            } else {
                BaseTransientBottomBar.this.f7999c.setTranslationY((float) intValue);
            }
            this.f8025a = intValue;
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8028a;

        public h(int i4) {
            this.f8028a = i4;
        }

        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.K(this.f8028a);
        }

        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f8000d.b(0, 180);
        }
    }

    public class i implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public int f8030a = 0;

        public i() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.f7994v) {
                C.S(BaseTransientBottomBar.this.f7999c, intValue - this.f8030a);
            } else {
                BaseTransientBottomBar.this.f7999c.setTranslationY((float) intValue);
            }
            this.f8030a = intValue;
        }
    }

    public static class j implements Handler.Callback {
        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 0) {
                ((BaseTransientBottomBar) message.obj).R();
                return true;
            } else if (i4 != 1) {
                return false;
            } else {
                ((BaseTransientBottomBar) message.obj).H(message.arg1);
                return true;
            }
        }
    }

    public class k implements ViewTreeObserver.OnGlobalLayoutListener {
        public k() {
        }

        public void onGlobalLayout() {
            if (BaseTransientBottomBar.this.f8004h) {
                BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
                int unused = baseTransientBottomBar.f8012p = baseTransientBottomBar.u();
                BaseTransientBottomBar.this.X();
            }
        }
    }

    public class l implements Runnable {
        public l() {
        }

        public void run() {
            int m4;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f7999c != null && baseTransientBottomBar.f7998b != null && (m4 = (BaseTransientBottomBar.this.C() - BaseTransientBottomBar.this.F()) + ((int) BaseTransientBottomBar.this.f7999c.getTranslationY())) < BaseTransientBottomBar.this.f8011o) {
                ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f7999c.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f7996x, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f8011o - m4;
                BaseTransientBottomBar.this.f7999c.requestLayout();
            }
        }
    }

    public class m implements C0330v {
        public m() {
        }

        public O a(View view, O o4) {
            int unused = BaseTransientBottomBar.this.f8008l = o4.i();
            int unused2 = BaseTransientBottomBar.this.f8009m = o4.j();
            int unused3 = BaseTransientBottomBar.this.f8010n = o4.k();
            BaseTransientBottomBar.this.X();
            return o4;
        }
    }

    public class n extends C0310a {
        public n() {
        }

        public void g(View view, T.m mVar) {
            super.g(view, mVar);
            mVar.a(1048576);
            mVar.h0(true);
        }

        public boolean j(View view, int i4, Bundle bundle) {
            if (i4 != 1048576) {
                return super.j(view, i4, bundle);
            }
            BaseTransientBottomBar.this.v();
            return true;
        }
    }

    public class o implements a.b {
        public o() {
        }

        public void a() {
            Handler handler = BaseTransientBottomBar.f7993u;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        public void b(int i4) {
            Handler handler = BaseTransientBottomBar.f7993u;
            handler.sendMessage(handler.obtainMessage(1, i4, 0, BaseTransientBottomBar.this));
        }
    }

    public class p implements t {

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                BaseTransientBottomBar.this.K(3);
            }
        }

        public p() {
        }

        public void onViewAttachedToWindow(View view) {
            WindowInsets rootWindowInsets;
            if (Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = BaseTransientBottomBar.this.f7999c.getRootWindowInsets()) != null) {
                int unused = BaseTransientBottomBar.this.f8011o = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                BaseTransientBottomBar.this.X();
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (BaseTransientBottomBar.this.I()) {
                BaseTransientBottomBar.f7993u.post(new a());
            }
        }
    }

    public class q implements u {
        public q() {
        }

        public void a(View view, int i4, int i5, int i6, int i7) {
            BaseTransientBottomBar.this.f7999c.setOnLayoutChangeListener((u) null);
            BaseTransientBottomBar.this.S();
        }
    }

    public class r implements SwipeDismissBehavior.c {
        public r() {
        }

        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.w(0);
        }

        public void b(int i4) {
            if (i4 == 0) {
                a.c().k(BaseTransientBottomBar.this.f8016t);
            } else if (i4 == 1 || i4 == 2) {
                a.c().j(BaseTransientBottomBar.this.f8016t);
            }
        }
    }

    public static class s {

        /* renamed from: a  reason: collision with root package name */
        public a.b f8041a;

        public s(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.J(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof v;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    a.c().k(this.f8041a);
                }
            } else if (coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                a.c().j(this.f8041a);
            }
        }

        public void c(BaseTransientBottomBar baseTransientBottomBar) {
            this.f8041a = baseTransientBottomBar.f8016t;
        }
    }

    public interface t {
        void onViewAttachedToWindow(View view);

        void onViewDetachedFromWindow(View view);
    }

    public interface u {
        void a(View view, int i4, int i5, int i6, int i7);
    }

    public static class v extends FrameLayout {

        /* renamed from: j  reason: collision with root package name */
        public static final View.OnTouchListener f8042j = new a();

        /* renamed from: c  reason: collision with root package name */
        public u f8043c;

        /* renamed from: d  reason: collision with root package name */
        public t f8044d;

        /* renamed from: e  reason: collision with root package name */
        public int f8045e;

        /* renamed from: f  reason: collision with root package name */
        public final float f8046f;

        /* renamed from: g  reason: collision with root package name */
        public final float f8047g;

        /* renamed from: h  reason: collision with root package name */
        public ColorStateList f8048h;

        /* renamed from: i  reason: collision with root package name */
        public PorterDuff.Mode f8049i;

        public static class a implements View.OnTouchListener {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public v(Context context, AttributeSet attributeSet) {
            super(C0822a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, V1.j.f3184J3);
            if (obtainStyledAttributes.hasValue(V1.j.f3219Q3)) {
                C.n0(this, (float) obtainStyledAttributes.getDimensionPixelSize(V1.j.f3219Q3, 0));
            }
            this.f8045e = obtainStyledAttributes.getInt(V1.j.f3199M3, 0);
            this.f8046f = obtainStyledAttributes.getFloat(V1.j.f3204N3, 1.0f);
            setBackgroundTintList(i2.c.a(context2, obtainStyledAttributes, V1.j.f3209O3));
            setBackgroundTintMode(g2.j.e(obtainStyledAttributes.getInt(V1.j.f3214P3, -1), PorterDuff.Mode.SRC_IN));
            this.f8047g = obtainStyledAttributes.getFloat(V1.j.f3194L3, 1.0f);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f8042j);
            setFocusable(true);
            if (getBackground() == null) {
                C.j0(this, a());
            }
        }

        public final Drawable a() {
            float dimension = getResources().getDimension(V1.c.f3006I);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C0393a.g(this, V1.a.f2976k, V1.a.f2973h, getBackgroundOverlayColorAlpha()));
            if (this.f8048h == null) {
                return K.a.l(gradientDrawable);
            }
            Drawable l4 = K.a.l(gradientDrawable);
            K.a.i(l4, this.f8048h);
            return l4;
        }

        public float getActionTextColorAlpha() {
            return this.f8047g;
        }

        public int getAnimationMode() {
            return this.f8045e;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f8046f;
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            t tVar = this.f8044d;
            if (tVar != null) {
                tVar.onViewAttachedToWindow(this);
            }
            C.d0(this);
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            t tVar = this.f8044d;
            if (tVar != null) {
                tVar.onViewDetachedFromWindow(this);
            }
        }

        public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
            super.onLayout(z4, i4, i5, i6, i7);
            u uVar = this.f8043c;
            if (uVar != null) {
                uVar.a(this, i4, i5, i6, i7);
            }
        }

        public void setAnimationMode(int i4) {
            this.f8045e = i4;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f8048h == null)) {
                drawable = K.a.l(drawable.mutate());
                K.a.i(drawable, this.f8048h);
                K.a.j(drawable, this.f8049i);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f8048h = colorStateList;
            if (getBackground() != null) {
                Drawable l4 = K.a.l(getBackground().mutate());
                K.a.i(l4, colorStateList);
                K.a.j(l4, this.f8049i);
                if (l4 != getBackground()) {
                    super.setBackgroundDrawable(l4);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f8049i = mode;
            if (getBackground() != null) {
                Drawable l4 = K.a.l(getBackground().mutate());
                K.a.j(l4, mode);
                if (l4 != getBackground()) {
                    super.setBackgroundDrawable(l4);
                }
            }
        }

        public void setOnAttachStateChangeListener(t tVar) {
            this.f8044d = tVar;
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f8042j);
            super.setOnClickListener(onClickListener);
        }

        public void setOnLayoutChangeListener(u uVar) {
            this.f8043c = uVar;
        }
    }

    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, C0791a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else if (aVar != null) {
            this.f7997a = viewGroup;
            this.f8000d = aVar;
            this.f7998b = context;
            g2.i.a(context);
            v vVar = (v) LayoutInflater.from(context).inflate(D(), viewGroup, false);
            this.f7999c = vVar;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout) view).c(vVar.getActionTextColorAlpha());
            }
            vVar.addView(view);
            ViewGroup.LayoutParams layoutParams = vVar.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f8007k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            C.i0(vVar, 1);
            C.q0(vVar, 1);
            C.o0(vVar, true);
            C.t0(vVar, new m());
            C.g0(vVar, new n());
            this.f8015s = (AccessibilityManager) context.getSystemService("accessibility");
        } else {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
    }

    public SwipeDismissBehavior A() {
        return new Behavior();
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(W1.a.f3399d);
        ofFloat.addUpdateListener(new e());
        return ofFloat;
    }

    public final int C() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f7998b.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public int D() {
        return G() ? V1.g.f3100r : V1.g.f3083a;
    }

    public final int E() {
        int height = this.f7999c.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f7999c.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    public final int F() {
        int[] iArr = new int[2];
        this.f7999c.getLocationOnScreen(iArr);
        return iArr[1] + this.f7999c.getHeight();
    }

    public boolean G() {
        TypedArray obtainStyledAttributes = this.f7998b.obtainStyledAttributes(f7995w);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public final void H(int i4) {
        if (!O() || this.f7999c.getVisibility() != 0) {
            K(i4);
        } else {
            t(i4);
        }
    }

    public boolean I() {
        return a.c().e(this.f8016t);
    }

    public final boolean J() {
        ViewGroup.LayoutParams layoutParams = this.f7999c.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.e) && (((CoordinatorLayout.e) layoutParams).e() instanceof SwipeDismissBehavior);
    }

    public void K(int i4) {
        int size;
        a.c().h(this.f8016t);
        List list = this.f8013q;
        if (list == null || list.size() - 1 < 0) {
            ViewParent parent = this.f7999c.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f7999c);
                return;
            }
            return;
        }
        android.support.v4.media.session.b.a(this.f8013q.get(size));
        throw null;
    }

    public void L() {
        int size;
        a.c().i(this.f8016t);
        List list = this.f8013q;
        if (list != null && list.size() - 1 >= 0) {
            android.support.v4.media.session.b.a(this.f8013q.get(size));
            throw null;
        }
    }

    public BaseTransientBottomBar M(int i4) {
        this.f8001e = i4;
        return this;
    }

    public final void N(CoordinatorLayout.e eVar) {
        SwipeDismissBehavior swipeDismissBehavior = this.f8014r;
        if (swipeDismissBehavior == null) {
            swipeDismissBehavior = A();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior) swipeDismissBehavior).P(this);
        }
        swipeDismissBehavior.K(new r());
        eVar.n(swipeDismissBehavior);
        if (this.f8003g == null) {
            eVar.f4950g = 80;
        }
    }

    public boolean O() {
        AccessibilityManager accessibilityManager = this.f8015s;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public final boolean P() {
        return this.f8011o > 0 && !this.f8002f && J();
    }

    public void Q() {
        a.c().m(z(), this.f8016t);
    }

    public final void R() {
        this.f7999c.setOnAttachStateChangeListener(new p());
        if (this.f7999c.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f7999c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.e) {
                N((CoordinatorLayout.e) layoutParams);
            }
            this.f8012p = u();
            X();
            this.f7999c.setVisibility(4);
            this.f7997a.addView(this.f7999c);
        }
        if (C.M(this.f7999c)) {
            S();
        } else {
            this.f7999c.setOnLayoutChangeListener(new q());
        }
    }

    public final void S() {
        if (O()) {
            s();
            return;
        }
        if (this.f7999c.getParent() != null) {
            this.f7999c.setVisibility(0);
        }
        L();
    }

    public final void T() {
        ValueAnimator x4 = x(0.0f, 1.0f);
        ValueAnimator B4 = B(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{x4, B4});
        animatorSet.setDuration(150);
        animatorSet.addListener(new b());
        animatorSet.start();
    }

    public final void U(int i4) {
        ValueAnimator x4 = x(1.0f, 0.0f);
        x4.setDuration(75);
        x4.addListener(new c(i4));
        x4.start();
    }

    public final void V() {
        int E4 = E();
        if (f7994v) {
            C.S(this.f7999c, E4);
        } else {
            this.f7999c.setTranslationY((float) E4);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{E4, 0});
        valueAnimator.setInterpolator(W1.a.f3397b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new f());
        valueAnimator.addUpdateListener(new g(E4));
        valueAnimator.start();
    }

    public final void W(int i4) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{0, E()});
        valueAnimator.setInterpolator(W1.a.f3397b);
        valueAnimator.setDuration(250);
        valueAnimator.addListener(new h(i4));
        valueAnimator.addUpdateListener(new i());
        valueAnimator.start();
    }

    public final void X() {
        Rect rect;
        ViewGroup.LayoutParams layoutParams = this.f7999c.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (rect = this.f8007k) == null) {
            Log.w(f7996x, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = rect.bottom + (this.f8003g != null ? this.f8012p : this.f8008l);
        marginLayoutParams.leftMargin = rect.left + this.f8009m;
        marginLayoutParams.rightMargin = rect.right + this.f8010n;
        this.f7999c.requestLayout();
        if (Build.VERSION.SDK_INT >= 29 && P()) {
            this.f7999c.removeCallbacks(this.f8006j);
            this.f7999c.post(this.f8006j);
        }
    }

    public void s() {
        this.f7999c.post(new a());
    }

    public final void t(int i4) {
        if (this.f7999c.getAnimationMode() == 1) {
            U(i4);
        } else {
            W(i4);
        }
    }

    public final int u() {
        View view = this.f8003g;
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i4 = iArr[1];
        int[] iArr2 = new int[2];
        this.f7997a.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f7997a.getHeight()) - i4;
    }

    public void v() {
        w(3);
    }

    public void w(int i4) {
        a.c().b(this.f8016t, i4);
    }

    public final ValueAnimator x(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(W1.a.f3396a);
        ofFloat.addUpdateListener(new d());
        return ofFloat;
    }

    public Context y() {
        return this.f7998b;
    }

    public int z() {
        return this.f8001e;
    }
}
