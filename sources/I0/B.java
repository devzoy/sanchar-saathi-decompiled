package i0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import h0.C0652c;
import j0.c;

public class B implements LayoutInflater.Factory2 {

    /* renamed from: c  reason: collision with root package name */
    public final I f9809c;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ O f9810c;

        public a(O o4) {
            this.f9810c = o4;
        }

        public void onViewAttachedToWindow(View view) {
            C0695p k4 = this.f9810c.k();
            this.f9810c.m();
            Z.u((ViewGroup) k4.f10144L.getParent(), B.this.f9809c).q();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public B(I i4) {
        this.f9809c = i4;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        O o4;
        if (C0702x.class.getName().equals(str)) {
            return new C0702x(context, attributeSet, this.f9809c);
        }
        C0695p pVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0652c.f9589a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(C0652c.f9590b);
        }
        int resourceId = obtainStyledAttributes.getResourceId(C0652c.f9591c, -1);
        String string = obtainStyledAttributes.getString(C0652c.f9592d);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !C0704z.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        if (resourceId != -1) {
            pVar = this.f9809c.h0(resourceId);
        }
        if (pVar == null && string != null) {
            pVar = this.f9809c.i0(string);
        }
        if (pVar == null && id != -1) {
            pVar = this.f9809c.h0(id);
        }
        if (pVar == null) {
            pVar = this.f9809c.t0().a(context.getClassLoader(), attributeValue);
            pVar.f10179r = true;
            pVar.f10133A = resourceId != 0 ? resourceId : id;
            pVar.f10134B = id;
            pVar.f10135C = string;
            pVar.f10180s = true;
            I i4 = this.f9809c;
            pVar.f10184w = i4;
            pVar.f10185x = i4.v0();
            pVar.B0(this.f9809c.v0().o(), attributeSet, pVar.f10163d);
            o4 = this.f9809c.i(pVar);
            if (I.I0(2)) {
                Log.v("FragmentManager", "Fragment " + pVar + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else if (!pVar.f10180s) {
            pVar.f10180s = true;
            I i5 = this.f9809c;
            pVar.f10184w = i5;
            pVar.f10185x = i5.v0();
            pVar.B0(this.f9809c.v0().o(), attributeSet, pVar.f10163d);
            o4 = this.f9809c.v(pVar);
            if (I.I0(2)) {
                Log.v("FragmentManager", "Retained Fragment " + pVar + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        c.g(pVar, viewGroup);
        pVar.f10143K = viewGroup;
        o4.m();
        o4.j();
        View view2 = pVar.f10144L;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (pVar.f10144L.getTag() == null) {
                pVar.f10144L.setTag(string);
            }
            pVar.f10144L.addOnAttachStateChangeListener(new a(o4));
            return pVar.f10144L;
        }
        throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
    }
}
