package D0;

import D0.C0228l;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

public abstract class M extends C0228l {

    /* renamed from: N  reason: collision with root package name */
    public static final String[] f573N = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: M  reason: collision with root package name */
    public int f574M = 3;

    public class a extends C0229m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f575a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f576b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f577c;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.f575a = viewGroup;
            this.f576b = view;
            this.f577c = view2;
        }

        public void c(C0228l lVar) {
            w.a(this.f575a).c(this.f576b);
        }

        public void d(C0228l lVar) {
            this.f577c.setTag(C0225i.f651a, (Object) null);
            w.a(this.f575a).c(this.f576b);
            lVar.U(this);
        }

        public void e(C0228l lVar) {
            if (this.f576b.getParent() == null) {
                w.a(this.f575a).a(this.f576b);
            } else {
                M.this.k();
            }
        }
    }

    public static class b extends AnimatorListenerAdapter implements C0228l.f {

        /* renamed from: a  reason: collision with root package name */
        public final View f579a;

        /* renamed from: b  reason: collision with root package name */
        public final int f580b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f581c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f582d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f583e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f584f = false;

        public b(View view, int i4, boolean z4) {
            this.f579a = view;
            this.f580b = i4;
            this.f581c = (ViewGroup) view.getParent();
            this.f582d = z4;
            g(true);
        }

        public void a(C0228l lVar) {
        }

        public void b(C0228l lVar) {
        }

        public void c(C0228l lVar) {
            g(false);
        }

        public void d(C0228l lVar) {
            f();
            lVar.U(this);
        }

        public void e(C0228l lVar) {
            g(true);
        }

        public final void f() {
            if (!this.f584f) {
                z.h(this.f579a, this.f580b);
                ViewGroup viewGroup = this.f581c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z4) {
            ViewGroup viewGroup;
            if (this.f582d && this.f583e != z4 && (viewGroup = this.f581c) != null) {
                this.f583e = z4;
                w.c(viewGroup, z4);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f584f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f584f) {
                z.h(this.f579a, this.f580b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f584f) {
                z.h(this.f579a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f585a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f586b;

        /* renamed from: c  reason: collision with root package name */
        public int f587c;

        /* renamed from: d  reason: collision with root package name */
        public int f588d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f589e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f590f;
    }

    private void h0(r rVar) {
        rVar.f714a.put("android:visibility:visibility", Integer.valueOf(rVar.f715b.getVisibility()));
        rVar.f714a.put("android:visibility:parent", rVar.f715b.getParent());
        int[] iArr = new int[2];
        rVar.f715b.getLocationOnScreen(iArr);
        rVar.f714a.put("android:visibility:screenLocation", iArr);
    }

    public String[] I() {
        return f573N;
    }

    public boolean K(r rVar, r rVar2) {
        if (rVar == null && rVar2 == null) {
            return false;
        }
        if (rVar != null && rVar2 != null && rVar2.f714a.containsKey("android:visibility:visibility") != rVar.f714a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c i02 = i0(rVar, rVar2);
        if (i02.f585a) {
            return i02.f587c == 0 || i02.f588d == 0;
        }
        return false;
    }

    public final c i0(r rVar, r rVar2) {
        c cVar = new c();
        cVar.f585a = false;
        cVar.f586b = false;
        if (rVar == null || !rVar.f714a.containsKey("android:visibility:visibility")) {
            cVar.f587c = -1;
            cVar.f589e = null;
        } else {
            cVar.f587c = ((Integer) rVar.f714a.get("android:visibility:visibility")).intValue();
            cVar.f589e = (ViewGroup) rVar.f714a.get("android:visibility:parent");
        }
        if (rVar2 == null || !rVar2.f714a.containsKey("android:visibility:visibility")) {
            cVar.f588d = -1;
            cVar.f590f = null;
        } else {
            cVar.f588d = ((Integer) rVar2.f714a.get("android:visibility:visibility")).intValue();
            cVar.f590f = (ViewGroup) rVar2.f714a.get("android:visibility:parent");
        }
        if (rVar != null && rVar2 != null) {
            int i4 = cVar.f587c;
            int i5 = cVar.f588d;
            if (i4 == i5 && cVar.f589e == cVar.f590f) {
                return cVar;
            }
            if (i4 != i5) {
                if (i4 == 0) {
                    cVar.f586b = false;
                    cVar.f585a = true;
                } else if (i5 == 0) {
                    cVar.f586b = true;
                    cVar.f585a = true;
                }
            } else if (cVar.f590f == null) {
                cVar.f586b = false;
                cVar.f585a = true;
            } else if (cVar.f589e == null) {
                cVar.f586b = true;
                cVar.f585a = true;
            }
        } else if (rVar == null && cVar.f588d == 0) {
            cVar.f586b = true;
            cVar.f585a = true;
        } else if (rVar2 == null && cVar.f587c == 0) {
            cVar.f586b = false;
            cVar.f585a = true;
        }
        return cVar;
    }

    public Animator j0(ViewGroup viewGroup, r rVar, int i4, r rVar2, int i5) {
        if ((this.f574M & 1) != 1 || rVar2 == null) {
            return null;
        }
        if (rVar == null) {
            View view = (View) rVar2.f715b.getParent();
            if (i0(y(view, false), J(view, false)).f585a) {
                return null;
            }
        }
        return k0(viewGroup, rVar2.f715b, rVar, rVar2);
    }

    public abstract Animator k0(ViewGroup viewGroup, View view, r rVar, r rVar2);

    public void l(r rVar) {
        h0(rVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if (r10.f687z != false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator l0(android.view.ViewGroup r11, D0.r r12, int r13, D0.r r14, int r15) {
        /*
            r10 = this;
            int r13 = r10.f574M
            r0 = 2
            r13 = r13 & r0
            r1 = 0
            if (r13 == r0) goto L_0x0008
            return r1
        L_0x0008:
            if (r12 != 0) goto L_0x000b
            return r1
        L_0x000b:
            android.view.View r13 = r12.f715b
            if (r14 == 0) goto L_0x0012
            android.view.View r2 = r14.f715b
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            int r3 = D0.C0225i.f651a
            java.lang.Object r3 = r13.getTag(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0023
            r2 = r1
            r6 = r5
            goto L_0x0088
        L_0x0023:
            if (r2 == 0) goto L_0x003a
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L_0x002c
            goto L_0x003a
        L_0x002c:
            r3 = 4
            if (r15 != r3) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            if (r13 != r2) goto L_0x0036
        L_0x0032:
            r3 = r2
            r6 = r4
            r2 = r1
            goto L_0x003e
        L_0x0036:
            r2 = r1
            r3 = r2
            r6 = r5
            goto L_0x003e
        L_0x003a:
            if (r2 == 0) goto L_0x0036
            r3 = r1
            r6 = r4
        L_0x003e:
            if (r6 == 0) goto L_0x0069
            android.view.ViewParent r6 = r13.getParent()
            if (r6 != 0) goto L_0x0047
            goto L_0x0085
        L_0x0047:
            android.view.ViewParent r6 = r13.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L_0x0069
            android.view.ViewParent r6 = r13.getParent()
            android.view.View r6 = (android.view.View) r6
            D0.r r7 = r10.J(r6, r5)
            D0.r r8 = r10.y(r6, r5)
            D0.M$c r7 = r10.i0(r7, r8)
            boolean r7 = r7.f585a
            if (r7 != 0) goto L_0x006e
            android.view.View r2 = D0.q.a(r11, r13, r6)
        L_0x0069:
            r6 = r4
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x0088
        L_0x006e:
            int r7 = r6.getId()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L_0x0069
            r6 = -1
            if (r7 == r6) goto L_0x0069
            android.view.View r6 = r11.findViewById(r7)
            if (r6 == 0) goto L_0x0069
            boolean r6 = r10.f687z
            if (r6 == 0) goto L_0x0069
        L_0x0085:
            r2 = r3
            r6 = r4
            r3 = r13
        L_0x0088:
            if (r3 == 0) goto L_0x00da
            if (r6 != 0) goto L_0x00bc
            java.util.Map r15 = r12.f714a
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r15 = r15.get(r1)
            int[] r15 = (int[]) r15
            r1 = r15[r4]
            r15 = r15[r5]
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r3.getLeft()
            int r1 = r1 - r2
            r3.offsetLeftAndRight(r1)
            r0 = r0[r5]
            int r15 = r15 - r0
            int r0 = r3.getTop()
            int r15 = r15 - r0
            r3.offsetTopAndBottom(r15)
            D0.u r15 = D0.w.a(r11)
            r15.a(r3)
        L_0x00bc:
            android.animation.Animator r12 = r10.m0(r11, r3, r12, r14)
            if (r6 != 0) goto L_0x00d9
            if (r12 != 0) goto L_0x00cc
            D0.u r11 = D0.w.a(r11)
            r11.c(r3)
            goto L_0x00d9
        L_0x00cc:
            int r14 = D0.C0225i.f651a
            r13.setTag(r14, r3)
            D0.M$a r14 = new D0.M$a
            r14.<init>(r11, r3, r13)
            r10.a(r14)
        L_0x00d9:
            return r12
        L_0x00da:
            if (r2 == 0) goto L_0x00fc
            int r13 = r2.getVisibility()
            D0.z.h(r2, r4)
            android.animation.Animator r11 = r10.m0(r11, r2, r12, r14)
            if (r11 == 0) goto L_0x00f8
            D0.M$b r12 = new D0.M$b
            r12.<init>(r2, r15, r5)
            r11.addListener(r12)
            D0.C0217a.a(r11, r12)
            r10.a(r12)
            goto L_0x00fb
        L_0x00f8:
            D0.z.h(r2, r13)
        L_0x00fb:
            return r11
        L_0x00fc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.M.l0(android.view.ViewGroup, D0.r, int, D0.r, int):android.animation.Animator");
    }

    public abstract Animator m0(ViewGroup viewGroup, View view, r rVar, r rVar2);

    public void n0(int i4) {
        if ((i4 & -4) == 0) {
            this.f574M = i4;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public void o(r rVar) {
        h0(rVar);
    }

    public Animator s(ViewGroup viewGroup, r rVar, r rVar2) {
        c i02 = i0(rVar, rVar2);
        if (!i02.f585a) {
            return null;
        }
        if (i02.f589e == null && i02.f590f == null) {
            return null;
        }
        if (i02.f586b) {
            return j0(viewGroup, rVar, i02.f587c, rVar2, i02.f588d);
        }
        return l0(viewGroup, rVar, i02.f587c, rVar2, i02.f588d);
    }
}
