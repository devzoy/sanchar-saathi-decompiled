package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.j;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {

    /* renamed from: c  reason: collision with root package name */
    public int f4615c;

    /* renamed from: d  reason: collision with root package name */
    public int f4616d;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference f4617e;

    /* renamed from: f  reason: collision with root package name */
    public LayoutInflater f4618f;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f4615c != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f4618f;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f4615c, viewGroup, false);
            int i4 = this.f4616d;
            if (i4 != -1) {
                inflate.setId(i4);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f4617e = new WeakReference(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f4616d;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f4618f;
    }

    public int getLayoutResource() {
        return this.f4615c;
    }

    public void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.f4616d = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f4618f = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f4615c = i4;
    }

    public void setOnInflateListener(a aVar) {
    }

    public void setVisibility(int i4) {
        WeakReference weakReference = this.f4617e;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i4);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i4);
        if (i4 == 0 || i4 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4615c = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.T3, i4, 0);
        this.f4616d = obtainStyledAttributes.getResourceId(j.W3, -1);
        this.f4615c = obtainStyledAttributes.getResourceId(j.V3, 0);
        setId(obtainStyledAttributes.getResourceId(j.U3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
