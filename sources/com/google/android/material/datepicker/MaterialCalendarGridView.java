package com.google.android.material.datepicker;

import S.C;
import S.C0310a;
import T.m;
import V1.e;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: c  reason: collision with root package name */
    public final Calendar f7851c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7852d;

    public class a extends C0310a {
        public a() {
        }

        public void g(View view, m mVar) {
            super.g(view, mVar);
            mVar.e0((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i4, Rect rect) {
        if (i4 == 33) {
            setSelection(getAdapter().g());
        } else if (i4 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i4, rect);
        }
    }

    /* renamed from: b */
    public l getAdapter() {
        return (l) super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        l b4 = getAdapter();
        b4.getClass();
        b4.getItem(b4.b());
        b4.getItem(b4.g());
        throw null;
    }

    public void onFocusChanged(boolean z4, int i4, Rect rect) {
        if (z4) {
            a(i4, rect);
        } else {
            super.onFocusChanged(false, i4, rect);
        }
    }

    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (!super.onKeyDown(i4, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i4) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void onMeasure(int i4, int i5) {
        if (this.f7852d) {
            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i4, i5);
    }

    public void setSelection(int i4) {
        if (i4 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i4);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f7851c = r.i();
        if (i.a2(getContext())) {
            setNextFocusLeftId(e.f3056a);
            setNextFocusRightId(e.f3058c);
        }
        this.f7852d = i.b2(getContext());
        C.g0(this, new a());
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof l) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), l.class.getCanonicalName()}));
    }
}
