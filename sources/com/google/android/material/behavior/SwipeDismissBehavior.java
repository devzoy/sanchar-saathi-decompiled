package com.google.android.material.behavior;

import S.C;
import T.m;
import T.p;
import a0.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public a0.c f7630a;

    /* renamed from: b  reason: collision with root package name */
    public c f7631b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7632c;

    /* renamed from: d  reason: collision with root package name */
    public float f7633d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7634e;

    /* renamed from: f  reason: collision with root package name */
    public int f7635f = 2;

    /* renamed from: g  reason: collision with root package name */
    public float f7636g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public float f7637h = 0.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f7638i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    public final c.C0078c f7639j = new a();

    public class a extends c.C0078c {

        /* renamed from: a  reason: collision with root package name */
        public int f7640a;

        /* renamed from: b  reason: collision with root package name */
        public int f7641b = -1;

        public a() {
        }

        public int a(View view, int i4, int i5) {
            int i6;
            int i7;
            int width;
            boolean z4 = C.x(view) == 1;
            int i8 = SwipeDismissBehavior.this.f7635f;
            if (i8 != 0) {
                if (i8 != 1) {
                    i6 = this.f7640a - view.getWidth();
                    i7 = view.getWidth() + this.f7640a;
                } else if (z4) {
                    i6 = this.f7640a;
                    width = view.getWidth();
                } else {
                    i6 = this.f7640a - view.getWidth();
                    i7 = this.f7640a;
                }
                return SwipeDismissBehavior.G(i6, i4, i7);
            } else if (z4) {
                i6 = this.f7640a - view.getWidth();
                i7 = this.f7640a;
                return SwipeDismissBehavior.G(i6, i4, i7);
            } else {
                i6 = this.f7640a;
                width = view.getWidth();
            }
            i7 = width + i6;
            return SwipeDismissBehavior.G(i6, i4, i7);
        }

        public int b(View view, int i4, int i5) {
            return view.getTop();
        }

        public int d(View view) {
            return view.getWidth();
        }

        public void i(View view, int i4) {
            this.f7641b = i4;
            this.f7640a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void j(int i4) {
            c cVar = SwipeDismissBehavior.this.f7631b;
            if (cVar != null) {
                cVar.b(i4);
            }
        }

        public void k(View view, int i4, int i5, int i6, int i7) {
            float width = ((float) this.f7640a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f7637h);
            float width2 = ((float) this.f7640a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f7638i);
            float f4 = (float) i4;
            if (f4 <= width) {
                view.setAlpha(1.0f);
            } else if (f4 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f4), 1.0f));
            }
        }

        public void l(View view, float f4, float f5) {
            boolean z4;
            int i4;
            c cVar;
            this.f7641b = -1;
            int width = view.getWidth();
            if (n(view, f4)) {
                int left = view.getLeft();
                int i5 = this.f7640a;
                i4 = left < i5 ? i5 - width : i5 + width;
                z4 = true;
            } else {
                i4 = this.f7640a;
                z4 = false;
            }
            if (SwipeDismissBehavior.this.f7630a.F(i4, view.getTop())) {
                C.Y(view, new d(view, z4));
            } else if (z4 && (cVar = SwipeDismissBehavior.this.f7631b) != null) {
                cVar.a(view);
            }
        }

        public boolean m(View view, int i4) {
            int i5 = this.f7641b;
            return (i5 == -1 || i5 == i4) && SwipeDismissBehavior.this.E(view);
        }

        public final boolean n(View view, float f4) {
            int i4 = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
            if (i4 != 0) {
                boolean z4 = C.x(view) == 1;
                int i5 = SwipeDismissBehavior.this.f7635f;
                if (i5 == 2) {
                    return true;
                }
                if (i5 == 0) {
                    if (z4) {
                        if (f4 >= 0.0f) {
                            return false;
                        }
                    } else if (i4 <= 0) {
                        return false;
                    }
                    return true;
                } else if (i5 != 1) {
                    return false;
                } else {
                    if (z4) {
                        if (i4 <= 0) {
                            return false;
                        }
                    } else if (f4 >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            } else {
                return Math.abs(view.getLeft() - this.f7640a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f7636g);
            }
        }
    }

    public class b implements p {
        public b() {
        }

        public boolean a(View view, p.a aVar) {
            boolean z4 = false;
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            if (C.x(view) == 1) {
                z4 = true;
            }
            int i4 = SwipeDismissBehavior.this.f7635f;
            C.R(view, ((i4 != 0 || !z4) && (i4 != 1 || z4)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f7631b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i4);
    }

    public class d implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        public final View f7644e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f7645f;

        public d(View view, boolean z4) {
            this.f7644e = view;
            this.f7645f = z4;
        }

        public void run() {
            c cVar;
            a0.c cVar2 = SwipeDismissBehavior.this.f7630a;
            if (cVar2 != null && cVar2.k(true)) {
                C.Y(this.f7644e, this);
            } else if (this.f7645f && (cVar = SwipeDismissBehavior.this.f7631b) != null) {
                cVar.a(this.f7644e);
            }
        }
    }

    public static float F(float f4, float f5, float f6) {
        return Math.min(Math.max(f4, f5), f6);
    }

    public static int G(int i4, int i5, int i6) {
        return Math.min(Math.max(i4, i5), i6);
    }

    public static float I(float f4, float f5, float f6) {
        return (f6 - f4) / (f5 - f4);
    }

    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        a0.c cVar = this.f7630a;
        if (cVar == null) {
            return false;
        }
        cVar.z(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public final void H(ViewGroup viewGroup) {
        if (this.f7630a == null) {
            this.f7630a = this.f7634e ? a0.c.l(viewGroup, this.f7633d, this.f7639j) : a0.c.m(viewGroup, this.f7639j);
        }
    }

    public void J(float f4) {
        this.f7638i = F(0.0f, f4, 1.0f);
    }

    public void K(c cVar) {
        this.f7631b = cVar;
    }

    public void L(float f4) {
        this.f7637h = F(0.0f, f4, 1.0f);
    }

    public void M(int i4) {
        this.f7635f = i4;
    }

    public final void N(View view) {
        C.a0(view, 1048576);
        if (E(view)) {
            C.c0(view, m.a.f2842y, (CharSequence) null, new b());
        }
    }

    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z4 = this.f7632c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z4 = coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f7632c = z4;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f7632c = false;
        }
        if (!z4) {
            return false;
        }
        H(coordinatorLayout);
        return this.f7630a.G(motionEvent);
    }

    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
        boolean l4 = super.l(coordinatorLayout, view, i4);
        if (C.v(view) == 0) {
            C.q0(view, 1);
            N(view);
        }
        return l4;
    }
}
