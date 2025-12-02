package n2;

import V1.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import g2.e;
import g2.i;
import o2.C0822a;
import p.C0836c;
import p.Q;

/* renamed from: n2.e  reason: case insensitive filesystem */
public class C0805e extends C0836c {

    /* renamed from: f  reason: collision with root package name */
    public final Q f11263f;

    /* renamed from: g  reason: collision with root package name */
    public final AccessibilityManager f11264g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f11265h;

    /* renamed from: n2.e$a */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
            C0805e.this.e(i4 < 0 ? C0805e.this.f11263f.v() : C0805e.this.getAdapter().getItem(i4));
            AdapterView.OnItemClickListener onItemClickListener = C0805e.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i4 < 0) {
                    view = C0805e.this.f11263f.y();
                    i4 = C0805e.this.f11263f.x();
                    j4 = C0805e.this.f11263f.w();
                }
                onItemClickListener.onItemClick(C0805e.this.f11263f.g(), view, i4, j4);
            }
            C0805e.this.f11263f.dismiss();
        }
    }

    public C0805e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, V1.a.f2966a);
    }

    public final TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final int d() {
        ListAdapter adapter = getAdapter();
        TextInputLayout c4 = c();
        int i4 = 0;
        if (adapter == null || c4 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f11263f.x()) + 15);
        View view = null;
        int i5 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(max, view, c4);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        Drawable f4 = this.f11263f.f();
        if (f4 != null) {
            f4.getPadding(this.f11265h);
            Rect rect = this.f11265h;
            i5 += rect.left + rect.right;
        }
        return i5 + c4.getEndIconView().getMeasuredWidth();
    }

    public final void e(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    public CharSequence getHint() {
        TextInputLayout c4 = c();
        return (c4 == null || !c4.O()) ? super.getHint() : c4.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c4 = c();
        if (c4 != null && c4.O() && super.getHint() == null && e.a()) {
            setHint("");
        }
    }

    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), d()), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t4) {
        super.setAdapter(t4);
        this.f11263f.p(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f11264g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f11263f.a();
        }
    }

    public C0805e(Context context, AttributeSet attributeSet, int i4) {
        super(C0822a.c(context, attributeSet, i4, 0), attributeSet, i4);
        this.f11265h = new Rect();
        Context context2 = getContext();
        TypedArray h4 = i.h(context2, attributeSet, j.f3177I1, i4, V1.i.f3121b, new int[0]);
        if (h4.hasValue(j.f3182J1) && h4.getInt(j.f3182J1, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f11264g = (AccessibilityManager) context2.getSystemService("accessibility");
        Q q4 = new Q(context2);
        this.f11263f = q4;
        q4.J(true);
        q4.D(this);
        q4.I(2);
        q4.p(getAdapter());
        q4.L(new a());
        h4.recycle();
    }
}
