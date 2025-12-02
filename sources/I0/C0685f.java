package i0;

import S.C;
import S.C0332x;
import S.H;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import d.C0566b;
import h3.C0666g;
import h3.C0670k;
import h3.C0673n;
import i0.C0700v;
import i0.Z;
import i3.C0739p;
import i3.C0743t;
import i3.C0746w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import v.C0944a;
import v3.l;
import v3.m;
import v3.w;

/* renamed from: i0.f  reason: case insensitive filesystem */
public final class C0685f extends Z {

    /* renamed from: i0.f$a */
    public static final class a extends Z.b {

        /* renamed from: d  reason: collision with root package name */
        public final b f10049d;

        /* renamed from: i0.f$a$a  reason: collision with other inner class name */
        public static final class C0168a implements Animation.AnimationListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Z.d f10050a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ViewGroup f10051b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ View f10052c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ a f10053d;

            public C0168a(Z.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f10050a = dVar;
                this.f10051b = viewGroup;
                this.f10052c = view;
                this.f10053d = aVar;
            }

            public static final void b(ViewGroup viewGroup, View view, a aVar) {
                l.e(viewGroup, "$container");
                l.e(aVar, "this$0");
                viewGroup.endViewTransition(view);
                aVar.h().a().f(aVar);
            }

            public void onAnimationEnd(Animation animation) {
                l.e(animation, "animation");
                ViewGroup viewGroup = this.f10051b;
                viewGroup.post(new C0684e(viewGroup, this.f10052c, this.f10053d));
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f10050a + " has ended.");
                }
            }

            public void onAnimationRepeat(Animation animation) {
                l.e(animation, "animation");
            }

            public void onAnimationStart(Animation animation) {
                l.e(animation, "animation");
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f10050a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b bVar) {
            l.e(bVar, "animationInfo");
            this.f10049d = bVar;
        }

        public void c(ViewGroup viewGroup) {
            l.e(viewGroup, "container");
            Z.d a4 = this.f10049d.a();
            View view = a4.i().f10144L;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.f10049d.a().f(this);
            if (I.I0(2)) {
                Log.v("FragmentManager", "Animation from operation " + a4 + " has been cancelled.");
            }
        }

        public void d(ViewGroup viewGroup) {
            l.e(viewGroup, "container");
            if (this.f10049d.b()) {
                this.f10049d.a().f(this);
                return;
            }
            Context context = viewGroup.getContext();
            Z.d a4 = this.f10049d.a();
            View view = a4.i().f10144L;
            b bVar = this.f10049d;
            l.d(context, "context");
            C0700v.a c4 = bVar.c(context);
            if (c4 != null) {
                Animation animation = c4.f10225a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (a4.h() != Z.d.b.REMOVED) {
                    view.startAnimation(animation);
                    this.f10049d.a().f(this);
                } else {
                    viewGroup.startViewTransition(view);
                    C0700v.b bVar2 = new C0700v.b(animation, viewGroup, view);
                    bVar2.setAnimationListener(new C0168a(a4, viewGroup, view, this));
                    view.startAnimation(bVar2);
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + a4 + " has started.");
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }

        public final b h() {
            return this.f10049d;
        }
    }

    /* renamed from: i0.f$b */
    public static final class b extends C0169f {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10054b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10055c;

        /* renamed from: d  reason: collision with root package name */
        public C0700v.a f10056d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Z.d dVar, boolean z4) {
            super(dVar);
            l.e(dVar, "operation");
            this.f10054b = z4;
        }

        public final C0700v.a c(Context context) {
            l.e(context, "context");
            if (this.f10055c) {
                return this.f10056d;
            }
            C0700v.a b4 = C0700v.b(context, a().i(), a().h() == Z.d.b.VISIBLE, this.f10054b);
            this.f10056d = b4;
            this.f10055c = true;
            return b4;
        }
    }

    /* renamed from: i0.f$c */
    public static final class c extends Z.b {

        /* renamed from: d  reason: collision with root package name */
        public final b f10057d;

        /* renamed from: e  reason: collision with root package name */
        public AnimatorSet f10058e;

        /* renamed from: i0.f$c$a */
        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ViewGroup f10059a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f10060b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ boolean f10061c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ Z.d f10062d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ c f10063e;

            public a(ViewGroup viewGroup, View view, boolean z4, Z.d dVar, c cVar) {
                this.f10059a = viewGroup;
                this.f10060b = view;
                this.f10061c = z4;
                this.f10062d = dVar;
                this.f10063e = cVar;
            }

            public void onAnimationEnd(Animator animator) {
                l.e(animator, "anim");
                this.f10059a.endViewTransition(this.f10060b);
                if (this.f10061c) {
                    Z.d.b h4 = this.f10062d.h();
                    View view = this.f10060b;
                    l.d(view, "viewToAnimate");
                    h4.f(view, this.f10059a);
                }
                this.f10063e.h().a().f(this.f10063e);
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f10062d + " has ended.");
                }
            }
        }

        public c(b bVar) {
            l.e(bVar, "animatorInfo");
            this.f10057d = bVar;
        }

        public boolean b() {
            return true;
        }

        public void c(ViewGroup viewGroup) {
            l.e(viewGroup, "container");
            AnimatorSet animatorSet = this.f10058e;
            if (animatorSet == null) {
                this.f10057d.a().f(this);
                return;
            }
            Z.d a4 = this.f10057d.a();
            if (a4.n()) {
                e.f10065a.a(animatorSet);
            } else {
                animatorSet.end();
            }
            if (I.I0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Animator from operation ");
                sb.append(a4);
                sb.append(" has been canceled");
                sb.append(a4.n() ? " with seeking." : ".");
                sb.append(' ');
                Log.v("FragmentManager", sb.toString());
            }
        }

        public void d(ViewGroup viewGroup) {
            l.e(viewGroup, "container");
            Z.d a4 = this.f10057d.a();
            AnimatorSet animatorSet = this.f10058e;
            if (animatorSet == null) {
                this.f10057d.a().f(this);
                return;
            }
            animatorSet.start();
            if (I.I0(2)) {
                Log.v("FragmentManager", "Animator from operation " + a4 + " has started.");
            }
        }

        public void e(C0566b bVar, ViewGroup viewGroup) {
            l.e(bVar, "backEvent");
            l.e(viewGroup, "container");
            Z.d a4 = this.f10057d.a();
            AnimatorSet animatorSet = this.f10058e;
            if (animatorSet == null) {
                this.f10057d.a().f(this);
            } else if (Build.VERSION.SDK_INT >= 34 && a4.i().f10177p) {
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + a4);
                }
                long a5 = d.f10064a.a(animatorSet);
                long a6 = (long) (bVar.a() * ((float) a5));
                if (a6 == 0) {
                    a6 = 1;
                }
                if (a6 == a5) {
                    a6 = a5 - 1;
                }
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Setting currentPlayTime to " + a6 + " for Animator " + animatorSet + " on operation " + a4);
                }
                e.f10065a.b(animatorSet, a6);
            }
        }

        public void f(ViewGroup viewGroup) {
            l.e(viewGroup, "container");
            if (!this.f10057d.b()) {
                Context context = viewGroup.getContext();
                b bVar = this.f10057d;
                l.d(context, "context");
                C0700v.a c4 = bVar.c(context);
                this.f10058e = c4 != null ? c4.f10226b : null;
                Z.d a4 = this.f10057d.a();
                C0695p i4 = a4.i();
                boolean z4 = a4.h() == Z.d.b.GONE;
                View view = i4.f10144L;
                viewGroup.startViewTransition(view);
                AnimatorSet animatorSet = this.f10058e;
                if (animatorSet != null) {
                    animatorSet.addListener(new a(viewGroup, view, z4, a4, this));
                }
                AnimatorSet animatorSet2 = this.f10058e;
                if (animatorSet2 != null) {
                    animatorSet2.setTarget(view);
                }
            }
        }

        public final b h() {
            return this.f10057d;
        }
    }

    /* renamed from: i0.f$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public static final d f10064a = new d();

        public final long a(AnimatorSet animatorSet) {
            l.e(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* renamed from: i0.f$e */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f10065a = new e();

        public final void a(AnimatorSet animatorSet) {
            l.e(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j4) {
            l.e(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j4);
        }
    }

    /* renamed from: i0.f$f  reason: collision with other inner class name */
    public static class C0169f {

        /* renamed from: a  reason: collision with root package name */
        public final Z.d f10066a;

        public C0169f(Z.d dVar) {
            l.e(dVar, "operation");
            this.f10066a = dVar;
        }

        public final Z.d a() {
            return this.f10066a;
        }

        public final boolean b() {
            Z.d.b bVar;
            View view = this.f10066a.i().f10144L;
            Z.d.b a4 = view != null ? Z.d.b.f10015e.a(view) : null;
            Z.d.b h4 = this.f10066a.h();
            return a4 == h4 || !(a4 == (bVar = Z.d.b.VISIBLE) || h4 == bVar);
        }
    }

    /* renamed from: i0.f$g */
    public static final class g extends Z.b {

        /* renamed from: d  reason: collision with root package name */
        public final List f10067d;

        /* renamed from: e  reason: collision with root package name */
        public final Z.d f10068e;

        /* renamed from: f  reason: collision with root package name */
        public final Z.d f10069f;

        /* renamed from: g  reason: collision with root package name */
        public final U f10070g;

        /* renamed from: h  reason: collision with root package name */
        public final Object f10071h;

        /* renamed from: i  reason: collision with root package name */
        public final ArrayList f10072i;

        /* renamed from: j  reason: collision with root package name */
        public final ArrayList f10073j;

        /* renamed from: k  reason: collision with root package name */
        public final C0944a f10074k;

        /* renamed from: l  reason: collision with root package name */
        public final ArrayList f10075l;

        /* renamed from: m  reason: collision with root package name */
        public final ArrayList f10076m;

        /* renamed from: n  reason: collision with root package name */
        public final C0944a f10077n;

        /* renamed from: o  reason: collision with root package name */
        public final C0944a f10078o;

        /* renamed from: p  reason: collision with root package name */
        public final boolean f10079p;

        /* renamed from: q  reason: collision with root package name */
        public final O.a f10080q = new O.a();

        /* renamed from: r  reason: collision with root package name */
        public Object f10081r;

        /* renamed from: i0.f$g$a */
        public static final class a extends m implements u3.a {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ g f10082f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ ViewGroup f10083g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ Object f10084h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(g gVar, ViewGroup viewGroup, Object obj) {
                super(0);
                this.f10082f = gVar;
                this.f10083g = viewGroup;
                this.f10084h = obj;
            }

            public final void a() {
                this.f10082f.v().e(this.f10083g, this.f10084h);
            }

            public /* bridge */ /* synthetic */ Object c() {
                a();
                return C0673n.f9639a;
            }
        }

        /* renamed from: i0.f$g$b */
        public static final class b extends m implements u3.a {

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ g f10085f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ ViewGroup f10086g;

            /* renamed from: h  reason: collision with root package name */
            public final /* synthetic */ Object f10087h;

            /* renamed from: i  reason: collision with root package name */
            public final /* synthetic */ w f10088i;

            /* renamed from: i0.f$g$b$a */
            public static final class a extends m implements u3.a {

                /* renamed from: f  reason: collision with root package name */
                public final /* synthetic */ g f10089f;

                /* renamed from: g  reason: collision with root package name */
                public final /* synthetic */ ViewGroup f10090g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public a(g gVar, ViewGroup viewGroup) {
                    super(0);
                    this.f10089f = gVar;
                    this.f10090g = viewGroup;
                }

                public static final void e(g gVar, ViewGroup viewGroup) {
                    l.e(gVar, "this$0");
                    l.e(viewGroup, "$container");
                    for (h a4 : gVar.w()) {
                        Z.d a5 = a4.a();
                        View V3 = a5.i().V();
                        if (V3 != null) {
                            a5.h().f(V3, viewGroup);
                        }
                    }
                }

                public final void b() {
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    U v4 = this.f10089f.v();
                    Object s4 = this.f10089f.s();
                    l.b(s4);
                    v4.d(s4, new C0692m(this.f10089f, this.f10090g));
                }

                public /* bridge */ /* synthetic */ Object c() {
                    b();
                    return C0673n.f9639a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(g gVar, ViewGroup viewGroup, Object obj, w wVar) {
                super(0);
                this.f10085f = gVar;
                this.f10086g = viewGroup;
                this.f10087h = obj;
                this.f10088i = wVar;
            }

            public final void a() {
                g gVar = this.f10085f;
                gVar.C(gVar.v().j(this.f10086g, this.f10087h));
                boolean z4 = this.f10085f.s() != null;
                Object obj = this.f10087h;
                ViewGroup viewGroup = this.f10086g;
                if (z4) {
                    this.f10088i.f12469e = new a(this.f10085f, viewGroup);
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + this.f10085f.t() + " to " + this.f10085f.u());
                        return;
                    }
                    return;
                }
                throw new IllegalStateException(("Unable to start transition " + obj + " for container " + viewGroup + '.').toString());
            }

            public /* bridge */ /* synthetic */ Object c() {
                a();
                return C0673n.f9639a;
            }
        }

        public g(List list, Z.d dVar, Z.d dVar2, U u4, Object obj, ArrayList arrayList, ArrayList arrayList2, C0944a aVar, ArrayList arrayList3, ArrayList arrayList4, C0944a aVar2, C0944a aVar3, boolean z4) {
            l.e(list, "transitionInfos");
            l.e(u4, "transitionImpl");
            l.e(arrayList, "sharedElementFirstOutViews");
            l.e(arrayList2, "sharedElementLastInViews");
            l.e(aVar, "sharedElementNameMapping");
            l.e(arrayList3, "enteringNames");
            l.e(arrayList4, "exitingNames");
            l.e(aVar2, "firstOutViews");
            l.e(aVar3, "lastInViews");
            this.f10067d = list;
            this.f10068e = dVar;
            this.f10069f = dVar2;
            this.f10070g = u4;
            this.f10071h = obj;
            this.f10072i = arrayList;
            this.f10073j = arrayList2;
            this.f10074k = aVar;
            this.f10075l = arrayList3;
            this.f10076m = arrayList4;
            this.f10077n = aVar2;
            this.f10078o = aVar3;
            this.f10079p = z4;
        }

        public static final void A(Z.d dVar, g gVar) {
            l.e(dVar, "$operation");
            l.e(gVar, "this$0");
            if (I.I0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.f(gVar);
        }

        public static final void p(Z.d dVar, Z.d dVar2, g gVar) {
            l.e(gVar, "this$0");
            S.a(dVar.i(), dVar2.i(), gVar.f10079p, gVar.f10078o, false);
        }

        public static final void q(U u4, View view, Rect rect) {
            l.e(u4, "$impl");
            l.e(rect, "$lastInEpicenterRect");
            u4.k(view, rect);
        }

        public static final void r(ArrayList arrayList) {
            l.e(arrayList, "$transitioningViews");
            S.d(arrayList, 4);
        }

        public static final void y(Z.d dVar, g gVar) {
            l.e(dVar, "$operation");
            l.e(gVar, "this$0");
            if (I.I0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.f(gVar);
        }

        public static final void z(w wVar) {
            l.e(wVar, "$seekCancelLambda");
            u3.a aVar = (u3.a) wVar.f12469e;
            if (aVar != null) {
                aVar.c();
            }
        }

        public final void B(ArrayList arrayList, ViewGroup viewGroup, u3.a aVar) {
            S.d(arrayList, 4);
            ArrayList q4 = this.f10070g.q(this.f10073j);
            if (I.I0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator it = this.f10072i.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    l.d(next, "sharedElementFirstOutViews");
                    View view = (View) next;
                    Log.v("FragmentManager", "View: " + view + " Name: " + C.E(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator it2 = this.f10073j.iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    l.d(next2, "sharedElementLastInViews");
                    View view2 = (View) next2;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + C.E(view2));
                }
            }
            aVar.c();
            this.f10070g.y(viewGroup, this.f10072i, this.f10073j, q4, this.f10074k);
            S.d(arrayList, 0);
            this.f10070g.A(this.f10071h, this.f10072i, this.f10073j);
        }

        public final void C(Object obj) {
            this.f10081r = obj;
        }

        public boolean b() {
            if (this.f10070g.m()) {
                Iterable iterable = this.f10067d;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        h hVar = (h) it.next();
                        if (Build.VERSION.SDK_INT >= 34) {
                            if (hVar.f() != null) {
                                if (!this.f10070g.n(hVar.f())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                Object obj = this.f10071h;
                if (obj == null || this.f10070g.n(obj)) {
                    return true;
                }
            }
            return false;
        }

        public void c(ViewGroup viewGroup) {
            l.e(viewGroup, "container");
            this.f10080q.a();
        }

        public void d(ViewGroup viewGroup) {
            l.e(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h hVar : this.f10067d) {
                    Z.d a4 = hVar.a();
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + a4);
                    }
                    hVar.a().f(this);
                }
                return;
            }
            Object obj = this.f10081r;
            if (obj != null) {
                U u4 = this.f10070g;
                l.b(obj);
                u4.c(obj);
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.f10068e + " to " + this.f10069f);
                    return;
                }
                return;
            }
            C0666g o4 = o(viewGroup, this.f10069f, this.f10068e);
            ArrayList arrayList = (ArrayList) o4.a();
            Object b4 = o4.b();
            Iterable<h> iterable = this.f10067d;
            ArrayList<Z.d> arrayList2 = new ArrayList<>(C0739p.m(iterable, 10));
            for (h a5 : iterable) {
                arrayList2.add(a5.a());
            }
            for (Z.d dVar : arrayList2) {
                this.f10070g.w(dVar.i(), b4, this.f10080q, new C0688i(dVar, this));
            }
            B(arrayList, viewGroup, new a(this, viewGroup, b4));
            if (I.I0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f10068e + " to " + this.f10069f);
            }
        }

        public void e(C0566b bVar, ViewGroup viewGroup) {
            l.e(bVar, "backEvent");
            l.e(viewGroup, "container");
            Object obj = this.f10081r;
            if (obj != null) {
                this.f10070g.t(obj, bVar.a());
            }
        }

        public void f(ViewGroup viewGroup) {
            l.e(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h a4 : this.f10067d) {
                    Z.d a5 = a4.a();
                    if (I.I0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + a5);
                    }
                }
                return;
            }
            if (x() && this.f10071h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f10071h + " between " + this.f10068e + " and " + this.f10069f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                w wVar = new w();
                C0666g o4 = o(viewGroup, this.f10069f, this.f10068e);
                ArrayList arrayList = (ArrayList) o4.a();
                Object b4 = o4.b();
                Iterable<h> iterable = this.f10067d;
                ArrayList<Z.d> arrayList2 = new ArrayList<>(C0739p.m(iterable, 10));
                for (h a6 : iterable) {
                    arrayList2.add(a6.a());
                }
                for (Z.d dVar : arrayList2) {
                    C0686g gVar = new C0686g(wVar);
                    this.f10070g.x(dVar.i(), b4, this.f10080q, gVar, new C0687h(dVar, this));
                }
                B(arrayList, viewGroup, new b(this, viewGroup, b4, wVar));
            }
        }

        public final void n(ArrayList arrayList, View view) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!H.a(viewGroup)) {
                    int childCount = viewGroup.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = viewGroup.getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            l.d(childAt, "child");
                            n(arrayList, childAt);
                        }
                    }
                } else if (!arrayList.contains(view)) {
                    arrayList.add(view);
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(view);
            }
        }

        public final C0666g o(ViewGroup viewGroup, Z.d dVar, Z.d dVar2) {
            ViewGroup viewGroup2 = viewGroup;
            Z.d dVar3 = dVar;
            Z.d dVar4 = dVar2;
            View view = new View(viewGroup.getContext());
            Rect rect = new Rect();
            boolean z4 = false;
            View view2 = null;
            for (h g4 : this.f10067d) {
                if (!(!g4.g() || dVar4 == null || dVar3 == null || this.f10074k.isEmpty() || this.f10071h == null)) {
                    S.a(dVar.i(), dVar2.i(), this.f10079p, this.f10077n, true);
                    C0332x.a(viewGroup2, new C0689j(dVar3, dVar4, this));
                    this.f10072i.addAll(this.f10077n.values());
                    if (!this.f10076m.isEmpty()) {
                        Object obj = this.f10076m.get(0);
                        l.d(obj, "exitingNames[0]");
                        view2 = (View) this.f10077n.get((String) obj);
                        this.f10070g.v(this.f10071h, view2);
                    }
                    this.f10073j.addAll(this.f10078o.values());
                    if (!this.f10075l.isEmpty()) {
                        Object obj2 = this.f10075l.get(0);
                        l.d(obj2, "enteringNames[0]");
                        View view3 = (View) this.f10078o.get((String) obj2);
                        if (view3 != null) {
                            C0332x.a(viewGroup2, new C0690k(this.f10070g, view3, rect));
                            z4 = true;
                        }
                    }
                    this.f10070g.z(this.f10071h, view, this.f10072i);
                    U u4 = this.f10070g;
                    Object obj3 = this.f10071h;
                    u4.s(obj3, (Object) null, (ArrayList) null, (Object) null, (ArrayList) null, obj3, this.f10073j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f10067d.iterator();
            Object obj4 = null;
            Object obj5 = null;
            while (it.hasNext()) {
                h hVar = (h) it.next();
                Z.d a4 = hVar.a();
                Iterator it2 = it;
                Object h4 = this.f10070g.h(hVar.f());
                if (h4 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Object obj6 = obj5;
                    View view4 = a4.i().f10144L;
                    Object obj7 = obj4;
                    l.d(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.f10071h != null && (a4 == dVar4 || a4 == dVar3)) {
                        if (a4 == dVar4) {
                            arrayList2.removeAll(C0746w.L(this.f10072i));
                        } else {
                            arrayList2.removeAll(C0746w.L(this.f10073j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f10070g.a(h4, view);
                    } else {
                        this.f10070g.b(h4, arrayList2);
                        this.f10070g.s(h4, h4, arrayList2, (Object) null, (ArrayList) null, (Object) null, (ArrayList) null);
                        if (a4.h() == Z.d.b.GONE) {
                            a4.r(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(a4.i().f10144L);
                            this.f10070g.r(h4, a4.i().f10144L, arrayList3);
                            C0332x.a(viewGroup2, new C0691l(arrayList2));
                        }
                    }
                    if (a4.h() == Z.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z4) {
                            this.f10070g.u(h4, rect);
                        }
                        if (I.I0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + h4);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                Object next = it3.next();
                                l.d(next, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) next));
                            }
                        }
                    } else {
                        this.f10070g.v(h4, view2);
                        if (I.I0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + h4);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            Iterator it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                Object next2 = it4.next();
                                l.d(next2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) next2));
                            }
                        }
                    }
                    if (hVar.h()) {
                        obj4 = this.f10070g.p(obj7, h4, (Object) null);
                        dVar3 = dVar;
                        it = it2;
                        obj5 = obj6;
                    } else {
                        obj4 = obj7;
                        obj5 = this.f10070g.p(obj6, h4, (Object) null);
                    }
                }
                dVar3 = dVar;
                it = it2;
            }
            Object o4 = this.f10070g.o(obj4, obj5, this.f10071h);
            if (I.I0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + o4);
            }
            return new C0666g(arrayList, o4);
        }

        public final Object s() {
            return this.f10081r;
        }

        public final Z.d t() {
            return this.f10068e;
        }

        public final Z.d u() {
            return this.f10069f;
        }

        public final U v() {
            return this.f10070g;
        }

        public final List w() {
            return this.f10067d;
        }

        public final boolean x() {
            Iterable<h> iterable = this.f10067d;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            for (h a4 : iterable) {
                if (!a4.a().i().f10177p) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: i0.f$h */
    public static final class h extends C0169f {

        /* renamed from: b  reason: collision with root package name */
        public final Object f10091b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f10092c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f10093d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(Z.d dVar, boolean z4, boolean z5) {
            super(dVar);
            Object obj;
            l.e(dVar, "operation");
            Z.d.b h4 = dVar.h();
            Z.d.b bVar = Z.d.b.VISIBLE;
            if (h4 == bVar) {
                C0695p i4 = dVar.i();
                obj = z4 ? i4.M() : i4.w();
            } else {
                C0695p i5 = dVar.i();
                obj = z4 ? i5.O() : i5.z();
            }
            this.f10091b = obj;
            this.f10092c = dVar.h() == bVar ? z4 ? dVar.i().p() : dVar.i().n() : true;
            this.f10093d = z5 ? z4 ? dVar.i().Q() : dVar.i().P() : null;
        }

        public final U c() {
            U d4 = d(this.f10091b);
            U d5 = d(this.f10093d);
            if (d4 == null || d5 == null || d4 == d5) {
                return d4 == null ? d5 : d4;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().i() + " returned Transition " + this.f10091b + " which uses a different Transition  type than its shared element transition " + this.f10093d).toString());
        }

        public final U d(Object obj) {
            if (obj == null) {
                return null;
            }
            U u4 = S.f9955b;
            if (u4 != null && u4.g(obj)) {
                return u4;
            }
            U u5 = S.f9956c;
            if (u5 != null && u5.g(obj)) {
                return u5;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().i() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final Object e() {
            return this.f10093d;
        }

        public final Object f() {
            return this.f10091b;
        }

        public final boolean g() {
            return this.f10093d != null;
        }

        public final boolean h() {
            return this.f10092c;
        }
    }

    /* renamed from: i0.f$i */
    public static final class i extends m implements u3.l {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Collection f10094f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(Collection collection) {
            super(1);
            this.f10094f = collection;
        }

        /* renamed from: a */
        public final Boolean i(Map.Entry entry) {
            l.e(entry, "entry");
            return Boolean.valueOf(C0746w.t(this.f10094f, C.E((View) entry.getValue())));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0685f(ViewGroup viewGroup) {
        super(viewGroup);
        l.e(viewGroup, "container");
    }

    public static final void E(C0685f fVar, Z.d dVar) {
        l.e(fVar, "this$0");
        l.e(dVar, "$operation");
        fVar.c(dVar);
    }

    public final void D(List list) {
        ArrayList<b> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0743t.p(arrayList2, ((b) it.next()).a().g());
        }
        boolean isEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z4 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = t().getContext();
            Z.d a4 = bVar.a();
            l.d(context, "context");
            C0700v.a c4 = bVar.c(context);
            if (c4 != null) {
                if (c4.f10226b == null) {
                    arrayList.add(bVar);
                } else {
                    C0695p i4 = a4.i();
                    if (a4.g().isEmpty()) {
                        if (a4.h() == Z.d.b.GONE) {
                            a4.r(false);
                        }
                        a4.b(new c(bVar));
                        z4 = true;
                    } else if (I.I0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + i4 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            Z.d a5 = bVar2.a();
            C0695p i5 = a5.i();
            if (!isEmpty) {
                if (I.I0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + i5 + " as Animations cannot run alongside Transitions.");
                }
            } else if (!z4) {
                a5.b(new a(bVar2));
            } else if (I.I0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + i5 + " as Animations cannot run alongside Animators.");
            }
        }
    }

    public final void F(List list, boolean z4, Z.d dVar, Z.d dVar2) {
        Object obj;
        U u4;
        Iterator it;
        C0666g gVar;
        Z.d dVar3 = dVar;
        Z.d dVar4 = dVar2;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (!((h) next).b()) {
                arrayList.add(next);
            }
        }
        ArrayList<h> arrayList2 = new ArrayList<>();
        for (Object next2 : arrayList) {
            if (((h) next2).c() != null) {
                arrayList2.add(next2);
            }
        }
        U u5 = null;
        for (h hVar : arrayList2) {
            U c4 = hVar.c();
            if (u5 == null || c4 == u5) {
                u5 = c4;
            } else {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().i() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
        }
        if (u5 != null) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            C0944a aVar = new C0944a();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            C0944a aVar2 = new C0944a();
            C0944a aVar3 = new C0944a();
            Iterator it2 = arrayList2.iterator();
            ArrayList arrayList7 = arrayList5;
            ArrayList arrayList8 = arrayList6;
            loop3:
            while (true) {
                obj = null;
                while (it2.hasNext()) {
                    h hVar2 = (h) it2.next();
                    if (!hVar2.g() || dVar3 == null || dVar4 == null) {
                        u4 = u5;
                        it = it2;
                    } else {
                        obj = u5.B(u5.h(hVar2.e()));
                        arrayList8 = dVar2.i().R();
                        l.d(arrayList8, "lastIn.fragment.sharedElementSourceNames");
                        ArrayList R3 = dVar.i().R();
                        l.d(R3, "firstOut.fragment.sharedElementSourceNames");
                        ArrayList S3 = dVar.i().S();
                        l.d(S3, "firstOut.fragment.sharedElementTargetNames");
                        int size = S3.size();
                        it = it2;
                        int i4 = 0;
                        while (i4 < size) {
                            int i5 = size;
                            int indexOf = arrayList8.indexOf(S3.get(i4));
                            ArrayList arrayList9 = S3;
                            if (indexOf != -1) {
                                arrayList8.set(indexOf, R3.get(i4));
                            }
                            i4++;
                            size = i5;
                            S3 = arrayList9;
                        }
                        arrayList7 = dVar2.i().S();
                        l.d(arrayList7, "lastIn.fragment.sharedElementTargetNames");
                        if (!z4) {
                            dVar.i().A();
                            dVar2.i().x();
                            gVar = C0670k.a((Object) null, (Object) null);
                        } else {
                            dVar.i().x();
                            dVar2.i().A();
                            gVar = C0670k.a((Object) null, (Object) null);
                        }
                        android.support.v4.media.session.b.a(gVar.a());
                        android.support.v4.media.session.b.a(gVar.b());
                        int size2 = arrayList8.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj2 = arrayList8.get(i6);
                            int i7 = size2;
                            l.d(obj2, "exitingNames[i]");
                            Object obj3 = arrayList7.get(i6);
                            l.d(obj3, "enteringNames[i]");
                            aVar.put((String) obj2, (String) obj3);
                            i6++;
                            size2 = i7;
                            u5 = u5;
                        }
                        u4 = u5;
                        if (I.I0(2)) {
                            Log.v("FragmentManager", ">>> entering view names <<<");
                            for (Iterator it3 = arrayList7.iterator(); it3.hasNext(); it3 = it3) {
                                Log.v("FragmentManager", "Name: " + ((String) it3.next()));
                            }
                            Log.v("FragmentManager", ">>> exiting view names <<<");
                            for (Iterator it4 = arrayList8.iterator(); it4.hasNext(); it4 = it4) {
                                Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                            }
                        }
                        View view = dVar.i().f10144L;
                        l.d(view, "firstOut.fragment.mView");
                        G(aVar2, view);
                        aVar2.o(arrayList8);
                        aVar.o(aVar2.keySet());
                        View view2 = dVar2.i().f10144L;
                        l.d(view2, "lastIn.fragment.mView");
                        G(aVar3, view2);
                        aVar3.o(arrayList7);
                        aVar3.o(aVar.values());
                        S.c(aVar, aVar3);
                        Set keySet = aVar.keySet();
                        l.d(keySet, "sharedElementNameMapping.keys");
                        H(aVar2, keySet);
                        Collection values = aVar.values();
                        l.d(values, "sharedElementNameMapping.values");
                        H(aVar3, values);
                        if (aVar.isEmpty()) {
                            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + dVar3 + " and " + dVar4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                            arrayList3.clear();
                            arrayList4.clear();
                            it2 = it;
                            u5 = u4;
                        }
                    }
                    it2 = it;
                    u5 = u4;
                }
                break loop3;
            }
            U u6 = u5;
            if (obj != null) {
                g gVar2 = r1;
                g gVar3 = new g(arrayList2, dVar, dVar2, u6, obj, arrayList3, arrayList4, aVar, arrayList7, arrayList8, aVar2, aVar3, z4);
            } else if (!arrayList2.isEmpty()) {
                for (h f4 : arrayList2) {
                    if (f4.f() != null) {
                    }
                }
                return;
            } else {
                return;
            }
            g gVar22 = gVar3;
            g gVar32 = new g(arrayList2, dVar, dVar2, u6, obj, arrayList3, arrayList4, aVar, arrayList7, arrayList8, aVar2, aVar3, z4);
            for (h a4 : arrayList2) {
                a4.a().b(gVar22);
            }
        }
    }

    public final void G(Map map, View view) {
        String E4 = C.E(view);
        if (E4 != null) {
            map.put(E4, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = viewGroup.getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    l.d(childAt, "child");
                    G(map, childAt);
                }
            }
        }
    }

    public final void H(C0944a aVar, Collection collection) {
        Set entrySet = aVar.entrySet();
        l.d(entrySet, "entries");
        C0743t.s(entrySet, new i(collection));
    }

    public final void I(List list) {
        C0695p i4 = ((Z.d) C0746w.B(list)).i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Z.d dVar = (Z.d) it.next();
            dVar.i().f10147O.f10197c = i4.f10147O.f10197c;
            dVar.i().f10147O.f10198d = i4.f10147O.f10198d;
            dVar.i().f10147O.f10199e = i4.f10147O.f10199e;
            dVar.i().f10147O.f10200f = i4.f10147O.f10200f;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: i0.Z$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: i0.Z$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: i0.Z$d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: i0.Z$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(java.util.List r9, boolean r10) {
        /*
            r8 = this;
            java.lang.String r0 = "operations"
            v3.l.e(r9, r0)
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r1 = r0.hasNext()
            r2 = 0
            java.lang.String r3 = "operation.fragment.mView"
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            r4 = r1
            i0.Z$d r4 = (i0.Z.d) r4
            i0.Z$d$b$a r5 = i0.Z.d.b.f10015e
            i0.p r6 = r4.i()
            android.view.View r6 = r6.f10144L
            v3.l.d(r6, r3)
            i0.Z$d$b r5 = r5.a(r6)
            i0.Z$d$b r6 = i0.Z.d.b.VISIBLE
            if (r5 != r6) goto L_0x000c
            i0.Z$d$b r4 = r4.h()
            if (r4 == r6) goto L_0x000c
            goto L_0x0037
        L_0x0036:
            r1 = r2
        L_0x0037:
            i0.Z$d r1 = (i0.Z.d) r1
            int r0 = r9.size()
            java.util.ListIterator r0 = r9.listIterator(r0)
        L_0x0041:
            boolean r4 = r0.hasPrevious()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r0.previous()
            r5 = r4
            i0.Z$d r5 = (i0.Z.d) r5
            i0.Z$d$b$a r6 = i0.Z.d.b.f10015e
            i0.p r7 = r5.i()
            android.view.View r7 = r7.f10144L
            v3.l.d(r7, r3)
            i0.Z$d$b r6 = r6.a(r7)
            i0.Z$d$b r7 = i0.Z.d.b.VISIBLE
            if (r6 == r7) goto L_0x0041
            i0.Z$d$b r5 = r5.h()
            if (r5 != r7) goto L_0x0041
            r2 = r4
        L_0x0068:
            i0.Z$d r2 = (i0.Z.d) r2
            r0 = 2
            boolean r0 = i0.I.I0(r0)
            if (r0 == 0) goto L_0x008f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Executing operations from "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = " to "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r0)
        L_0x008f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r8.I(r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x00a0:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L_0x00d0
            java.lang.Object r4 = r9.next()
            i0.Z$d r4 = (i0.Z.d) r4
            i0.f$b r5 = new i0.f$b
            r5.<init>(r4, r10)
            r0.add(r5)
            i0.f$h r5 = new i0.f$h
            r6 = 0
            r7 = 1
            if (r10 == 0) goto L_0x00be
            if (r4 != r1) goto L_0x00c1
        L_0x00bc:
            r6 = r7
            goto L_0x00c1
        L_0x00be:
            if (r4 != r2) goto L_0x00c1
            goto L_0x00bc
        L_0x00c1:
            r5.<init>(r4, r10, r6)
            r3.add(r5)
            i0.d r5 = new i0.d
            r5.<init>(r8, r4)
            r4.a(r5)
            goto L_0x00a0
        L_0x00d0:
            r8.F(r3, r10, r1, r2)
            r8.D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.C0685f.d(java.util.List, boolean):void");
    }
}
