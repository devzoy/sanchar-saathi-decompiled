package com.google.android.material.chip;

import S.C;
import T.m;
import V1.i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.List;

public class ChipGroup extends g2.c {

    /* renamed from: o  reason: collision with root package name */
    public static final int f7775o = i.f3127h;

    /* renamed from: g  reason: collision with root package name */
    public int f7776g;

    /* renamed from: h  reason: collision with root package name */
    public int f7777h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7778i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7779j;

    /* renamed from: k  reason: collision with root package name */
    public final b f7780k;

    /* renamed from: l  reason: collision with root package name */
    public e f7781l;

    /* renamed from: m  reason: collision with root package name */
    public int f7782m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7783n;

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z4) {
            if (!ChipGroup.this.f7783n) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.f7779j) {
                    int id = compoundButton.getId();
                    if (z4) {
                        if (!(ChipGroup.this.f7782m == -1 || ChipGroup.this.f7782m == id || !ChipGroup.this.f7778i)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.r(chipGroup.f7782m, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.f7782m == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                } else {
                    ChipGroup.this.r(compoundButton.getId(), true);
                    ChipGroup.this.q(compoundButton.getId(), false);
                }
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i4, int i5) {
            super(i4, i5);
        }
    }

    public interface d {
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f7785a;

        public e() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C.i());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.f7780k);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f7785a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f7785a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, V1.a.f2969d);
    }

    private int getChipCount() {
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) instanceof Chip) {
                i4++;
            }
        }
        return i4;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i4) {
        q(i4, true);
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i5 = this.f7782m;
                if (i5 != -1 && this.f7778i) {
                    r(i5, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i4, layoutParams);
    }

    public boolean c() {
        return super.c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.f7778i) {
            return this.f7782m;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f7778i) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f7776g;
    }

    public int getChipSpacingVertical() {
        return this.f7777h;
    }

    public void m(int i4) {
        int i5 = this.f7782m;
        if (i4 != i5) {
            if (i5 != -1 && this.f7778i) {
                r(i5, false);
            }
            if (i4 != -1) {
                r(i4, true);
            }
            setCheckedId(i4);
        }
    }

    public void n() {
        this.f7783n = true;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f7783n = false;
        setCheckedId(-1);
    }

    public int o(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) instanceof Chip) {
                if (((Chip) getChildAt(i5)) == view) {
                    return i4;
                }
                i4++;
            }
        }
        return -1;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f7782m;
        if (i4 != -1) {
            r(i4, true);
            setCheckedId(this.f7782m);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m.C0(accessibilityNodeInfo).e0(m.e.a(getRowCount(), c() ? getChipCount() : -1, false, p() ? 1 : 2));
    }

    public boolean p() {
        return this.f7778i;
    }

    public final void q(int i4, boolean z4) {
        this.f7782m = i4;
    }

    public final void r(int i4, boolean z4) {
        View findViewById = findViewById(i4);
        if (findViewById instanceof Chip) {
            this.f7783n = true;
            ((Chip) findViewById).setChecked(z4);
            this.f7783n = false;
        }
    }

    public void setChipSpacing(int i4) {
        setChipSpacingHorizontal(i4);
        setChipSpacingVertical(i4);
    }

    public void setChipSpacingHorizontal(int i4) {
        if (this.f7776g != i4) {
            this.f7776g = i4;
            setItemSpacing(i4);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i4) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i4));
    }

    public void setChipSpacingResource(int i4) {
        setChipSpacing(getResources().getDimensionPixelOffset(i4));
    }

    public void setChipSpacingVertical(int i4) {
        if (this.f7777h != i4) {
            this.f7777h = i4;
            setLineSpacing(i4);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i4) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i4));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i4) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f7781l.f7785a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z4) {
        this.f7779j = z4;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i4) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i4) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z4) {
        super.setSingleLine(z4);
    }

    public void setSingleSelection(boolean z4) {
        if (this.f7778i != z4) {
            this.f7778i = z4;
            n();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f7775o
            android.content.Context r8 = o2.C0822a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$b r8 = new com.google.android.material.chip.ChipGroup$b
            r0 = 0
            r8.<init>()
            r7.f7780k = r8
            com.google.android.material.chip.ChipGroup$e r8 = new com.google.android.material.chip.ChipGroup$e
            r8.<init>()
            r7.f7781l = r8
            r8 = -1
            r7.f7782m = r8
            r6 = 0
            r7.f7783n = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = V1.j.f3136A0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = g2.i.h(r0, r1, r2, r3, r4, r5)
            int r10 = V1.j.f3146C0
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = V1.j.f3151D0
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingHorizontal(r0)
            int r0 = V1.j.f3156E0
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingVertical(r10)
            int r10 = V1.j.f3166G0
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleLine((boolean) r10)
            int r10 = V1.j.f3171H0
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleSelection((boolean) r10)
            int r10 = V1.j.f3161F0
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSelectionRequired(r10)
            int r10 = V1.j.f3141B0
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L_0x0069
            r7.f7782m = r10
        L_0x0069:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$e r8 = r7.f7781l
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            S.C.q0(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i4) {
        setSingleLine(getResources().getBoolean(i4));
    }

    public void setSingleSelection(int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }
}
