package p;

import S.C;
import S.K;
import S.L;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.a;
import h.C0645a;
import h.j;

/* renamed from: p.a  reason: case insensitive filesystem */
public abstract class C0834a extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    public final C0190a f11473c = new C0190a();

    /* renamed from: d  reason: collision with root package name */
    public final Context f11474d;

    /* renamed from: e  reason: collision with root package name */
    public ActionMenuView f11475e;

    /* renamed from: f  reason: collision with root package name */
    public a f11476f;

    /* renamed from: g  reason: collision with root package name */
    public int f11477g;

    /* renamed from: h  reason: collision with root package name */
    public K f11478h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11479i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11480j;

    /* renamed from: p.a$a  reason: collision with other inner class name */
    public class C0190a implements L {

        /* renamed from: a  reason: collision with root package name */
        public boolean f11481a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f11482b;

        public C0190a() {
        }

        public void a(View view) {
            this.f11481a = true;
        }

        public void b(View view) {
            if (!this.f11481a) {
                C0834a aVar = C0834a.this;
                aVar.f11478h = null;
                C0834a.super.setVisibility(this.f11482b);
            }
        }

        public void c(View view) {
            C0834a.super.setVisibility(0);
            this.f11481a = false;
        }

        public C0190a d(K k4, int i4) {
            C0834a.this.f11478h = k4;
            this.f11482b = i4;
            return this;
        }
    }

    public C0834a(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0645a.f9167a, typedValue, true) || typedValue.resourceId == 0) {
            this.f11474d = context;
        } else {
            this.f11474d = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i4, int i5, boolean z4) {
        return z4 ? i4 - i5 : i4 + i5;
    }

    public int c(View view, int i4, int i5, int i6) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), i5);
        return Math.max(0, (i4 - view.getMeasuredWidth()) - i6);
    }

    public int e(View view, int i4, int i5, int i6, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = i5 + ((i6 - measuredHeight) / 2);
        if (z4) {
            view.layout(i4 - measuredWidth, i7, i4, measuredHeight + i7);
        } else {
            view.layout(i4, i7, i4 + measuredWidth, measuredHeight + i7);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public K f(int i4, long j4) {
        K k4 = this.f11478h;
        if (k4 != null) {
            k4.c();
        }
        if (i4 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            K b4 = C.d(this).b(1.0f);
            b4.f(j4);
            b4.h(this.f11473c.d(b4, i4));
            return b4;
        }
        K b5 = C.d(this).b(0.0f);
        b5.f(j4);
        b5.h(this.f11473c.d(b5, i4));
        return b5;
    }

    public int getAnimatedVisibility() {
        return this.f11478h != null ? this.f11473c.f11482b : getVisibility();
    }

    public int getContentHeight() {
        return this.f11477g;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.f9450a, C0645a.f9169c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.f9495j, 0));
        obtainStyledAttributes.recycle();
        a aVar = this.f11476f;
        if (aVar != null) {
            aVar.F(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f11480j = false;
        }
        if (!this.f11480j) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f11480j = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f11480j = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f11479i = false;
        }
        if (!this.f11479i) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f11479i = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f11479i = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i4);

    public void setVisibility(int i4) {
        if (i4 != getVisibility()) {
            K k4 = this.f11478h;
            if (k4 != null) {
                k4.c();
            }
            super.setVisibility(i4);
        }
    }
}
