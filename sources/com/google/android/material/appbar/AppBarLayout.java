package com.google.android.material.appbar;

import S.C;
import S.C0326q;
import T.m;
import V1.j;
import X1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class AppBarLayout extends LinearLayout {

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public /* bridge */ /* synthetic */ int E() {
            return super.E();
        }

        public /* bridge */ /* synthetic */ boolean X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4) {
            return super.X(coordinatorLayout, appBarLayout, i4);
        }

        public /* bridge */ /* synthetic */ boolean Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4, int i5, int i6, int i7) {
            return super.Y(coordinatorLayout, appBarLayout, i4, i5, i6, i7);
        }

        public /* bridge */ /* synthetic */ void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int i5, int[] iArr, int i6) {
            super.Z(coordinatorLayout, appBarLayout, view, i4, i5, iArr, i6);
        }

        public /* bridge */ /* synthetic */ void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            super.a0(coordinatorLayout, appBarLayout, view, i4, i5, i6, i7, i8, iArr);
        }

        public /* bridge */ /* synthetic */ void b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.b0(coordinatorLayout, appBarLayout, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.c0(coordinatorLayout, appBarLayout);
        }

        public /* bridge */ /* synthetic */ boolean d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i4, int i5) {
            return super.d0(coordinatorLayout, appBarLayout, view, view2, i4, i5);
        }

        public /* bridge */ /* synthetic */ void e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4) {
            super.e0(coordinatorLayout, appBarLayout, view, i4);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends b {
        public ScrollingViewBehavior() {
        }

        public /* bridge */ /* synthetic */ View G(List list) {
            O(list);
            return null;
        }

        public float I(View view) {
            return 0.0f;
        }

        public int J(View view) {
            return super.J(view);
        }

        public AppBarLayout O(List list) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) list.get(i4);
            }
            return null;
        }

        public final void P(View view, View view2) {
            CoordinatorLayout.b e4 = ((CoordinatorLayout.e) view2.getLayoutParams()).e();
            if (e4 instanceof BaseBehavior) {
                C.S(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) e4).f7614k) + K()) - H(view2));
            }
        }

        public final void Q(View view, View view2) {
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            P(view, view2);
            Q(view, view2);
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            return super.l(coordinatorLayout, view, i4);
        }

        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
            return super.m(coordinatorLayout, view, i4, i5, i6, i7);
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z4) {
            O(coordinatorLayout.q(view));
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f3350s3);
            M(obtainStyledAttributes.getDimensionPixelSize(j.f3355t3, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public static class BaseBehavior<T extends AppBarLayout> extends X1.a {

        /* renamed from: k  reason: collision with root package name */
        public int f7614k;

        /* renamed from: l  reason: collision with root package name */
        public int f7615l;

        /* renamed from: m  reason: collision with root package name */
        public int f7616m = -1;

        /* renamed from: n  reason: collision with root package name */
        public boolean f7617n;

        /* renamed from: o  reason: collision with root package name */
        public float f7618o;

        /* renamed from: p  reason: collision with root package name */
        public WeakReference f7619p;

        public static class a extends Z.a {
            public static final Parcelable.Creator<a> CREATOR = new C0127a();

            /* renamed from: g  reason: collision with root package name */
            public int f7620g;

            /* renamed from: h  reason: collision with root package name */
            public float f7621h;

            /* renamed from: i  reason: collision with root package name */
            public boolean f7622i;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a  reason: collision with other inner class name */
            public static class C0127a implements Parcelable.ClassLoaderCreator {
                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }

                /* renamed from: c */
                public a[] newArray(int i4) {
                    return new a[i4];
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f7620g = parcel.readInt();
                this.f7621h = parcel.readFloat();
                this.f7622i = parcel.readByte() != 0;
            }

            public void writeToParcel(Parcel parcel, int i4) {
                super.writeToParcel(parcel, i4);
                parcel.writeInt(this.f7620g);
                parcel.writeFloat(this.f7621h);
                parcel.writeByte(this.f7622i ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i4, int i5) {
            android.support.v4.media.session.b.a(view);
            return d0(coordinatorLayout, (AppBarLayout) null, view2, view3, i4, i5);
        }

        public /* bridge */ /* synthetic */ void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i4) {
            android.support.v4.media.session.b.a(view);
            e0(coordinatorLayout, (AppBarLayout) null, view2, i4);
        }

        public /* bridge */ /* synthetic */ boolean G(View view) {
            android.support.v4.media.session.b.a(view);
            return R((AppBarLayout) null);
        }

        public /* bridge */ /* synthetic */ int J(View view) {
            android.support.v4.media.session.b.a(view);
            return U((AppBarLayout) null);
        }

        public /* bridge */ /* synthetic */ int K(View view) {
            android.support.v4.media.session.b.a(view);
            return V((AppBarLayout) null);
        }

        public int L() {
            return E() + this.f7614k;
        }

        public /* bridge */ /* synthetic */ void M(CoordinatorLayout coordinatorLayout, View view) {
            android.support.v4.media.session.b.a(view);
            W(coordinatorLayout, (AppBarLayout) null);
        }

        public /* bridge */ /* synthetic */ int P(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6) {
            android.support.v4.media.session.b.a(view);
            return f0(coordinatorLayout, (AppBarLayout) null, i4, i5, i6);
        }

        public boolean R(AppBarLayout appBarLayout) {
            WeakReference weakReference = this.f7619p;
            if (weakReference == null) {
                return true;
            }
            View view = (View) weakReference.get();
            return view != null && view.isShown() && !view.canScrollVertically(-1);
        }

        public final View S(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                if ((childAt instanceof C0326q) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final int T(AppBarLayout appBarLayout, int i4) {
            throw null;
        }

        public int U(AppBarLayout appBarLayout) {
            throw null;
        }

        public int V(AppBarLayout appBarLayout) {
            throw null;
        }

        public void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            g0(coordinatorLayout, appBarLayout);
            throw null;
        }

        public boolean X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4) {
            super.l(coordinatorLayout, appBarLayout, i4);
            throw null;
        }

        public boolean Y(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4, int i5, int i6, int i7) {
            throw null;
        }

        public void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int i5, int[] iArr, int i6) {
            if (i5 == 0) {
                throw null;
            } else if (i5 < 0) {
                throw null;
            } else {
                throw null;
            }
        }

        public void a0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            if (i7 < 0) {
                throw null;
            } else if (i7 == 0) {
                h0(coordinatorLayout, appBarLayout);
            }
        }

        public void b0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            if (parcelable instanceof a) {
                a aVar = (a) parcelable;
                super.x(coordinatorLayout, appBarLayout, aVar.a());
                this.f7616m = aVar.f7620g;
                this.f7618o = aVar.f7621h;
                this.f7617n = aVar.f7622i;
                return;
            }
            super.x(coordinatorLayout, appBarLayout, parcelable);
            this.f7616m = -1;
        }

        public Parcelable c0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            super.y(coordinatorLayout, appBarLayout);
            E();
            throw null;
        }

        public boolean d0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i4, int i5) {
            if ((i4 & 2) == 0) {
                this.f7619p = null;
                this.f7615l = i5;
                return false;
            }
            throw null;
        }

        public void e0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i4) {
            if (this.f7615l == 0 || i4 == 1) {
                g0(coordinatorLayout, appBarLayout);
                throw null;
            } else {
                this.f7619p = new WeakReference(view);
            }
        }

        public int f0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i4, int i5, int i6) {
            int L4 = L();
            if (i5 == 0 || L4 < i5 || L4 > i6) {
                this.f7614k = 0;
            } else if (L4 != M.a.b(i4, i5, i6)) {
                throw null;
            }
            h0(coordinatorLayout, appBarLayout);
            return 0;
        }

        public final void g0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (T(appBarLayout, L()) >= 0) {
                throw null;
            }
        }

        public final void h0(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            C.a0(coordinatorLayout, m.a.f2834q.b());
            C.a0(coordinatorLayout, m.a.f2835r.b());
            if (S(coordinatorLayout) != null) {
                throw null;
            }
        }

        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i4) {
            android.support.v4.media.session.b.a(view);
            return X(coordinatorLayout, (AppBarLayout) null, i4);
        }

        public /* bridge */ /* synthetic */ boolean m(CoordinatorLayout coordinatorLayout, View view, int i4, int i5, int i6, int i7) {
            android.support.v4.media.session.b.a(view);
            return Y(coordinatorLayout, (AppBarLayout) null, i4, i5, i6, i7);
        }

        public /* bridge */ /* synthetic */ void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int[] iArr, int i6) {
            android.support.v4.media.session.b.a(view);
            Z(coordinatorLayout, (AppBarLayout) null, view2, i4, i5, iArr, i6);
        }

        public /* bridge */ /* synthetic */ void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
            android.support.v4.media.session.b.a(view);
            a0(coordinatorLayout, (AppBarLayout) null, view2, i4, i5, i6, i7, i8, iArr);
        }

        public /* bridge */ /* synthetic */ void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            android.support.v4.media.session.b.a(view);
            b0(coordinatorLayout, (AppBarLayout) null, parcelable);
        }

        public /* bridge */ /* synthetic */ Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            android.support.v4.media.session.b.a(view);
            return c0(coordinatorLayout, (AppBarLayout) null);
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }
}
