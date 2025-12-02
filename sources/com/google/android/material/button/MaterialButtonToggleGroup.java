package com.google.android.material.button;

import S.C;
import S.C0310a;
import S.C0320k;
import T.m;
import V1.i;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import g2.j;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import l2.C0778a;
import l2.C0780c;
import l2.k;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: m  reason: collision with root package name */
    public static final String f7731m = "MaterialButtonToggleGroup";

    /* renamed from: n  reason: collision with root package name */
    public static final int f7732n = i.f3131l;

    /* renamed from: c  reason: collision with root package name */
    public final List f7733c;

    /* renamed from: d  reason: collision with root package name */
    public final c f7734d;

    /* renamed from: e  reason: collision with root package name */
    public final f f7735e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet f7736f;

    /* renamed from: g  reason: collision with root package name */
    public final Comparator f7737g;

    /* renamed from: h  reason: collision with root package name */
    public Integer[] f7738h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7739i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7740j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7741k;

    /* renamed from: l  reason: collision with root package name */
    public int f7742l;

    public class a implements Comparator {
        public a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends C0310a {
        public b() {
        }

        public void g(View view, m mVar) {
            super.g(view, mVar);
            mVar.f0(m.f.a(0, 1, MaterialButtonToggleGroup.this.n(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public class c implements MaterialButton.a {
        public c() {
        }

        public void a(MaterialButton materialButton, boolean z4) {
            if (!MaterialButtonToggleGroup.this.f7739i) {
                if (MaterialButtonToggleGroup.this.f7740j) {
                    int unused = MaterialButtonToggleGroup.this.f7742l = z4 ? materialButton.getId() : -1;
                }
                if (MaterialButtonToggleGroup.this.u(materialButton.getId(), z4)) {
                    MaterialButtonToggleGroup.this.l(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }

        public /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public static class d {

        /* renamed from: e  reason: collision with root package name */
        public static final C0780c f7746e = new C0778a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public C0780c f7747a;

        /* renamed from: b  reason: collision with root package name */
        public C0780c f7748b;

        /* renamed from: c  reason: collision with root package name */
        public C0780c f7749c;

        /* renamed from: d  reason: collision with root package name */
        public C0780c f7750d;

        public d(C0780c cVar, C0780c cVar2, C0780c cVar3, C0780c cVar4) {
            this.f7747a = cVar;
            this.f7748b = cVar3;
            this.f7749c = cVar4;
            this.f7750d = cVar2;
        }

        public static d a(d dVar) {
            C0780c cVar = f7746e;
            return new d(cVar, dVar.f7750d, cVar, dVar.f7749c);
        }

        public static d b(d dVar, View view) {
            return j.d(view) ? c(dVar) : d(dVar);
        }

        public static d c(d dVar) {
            C0780c cVar = dVar.f7747a;
            C0780c cVar2 = dVar.f7750d;
            C0780c cVar3 = f7746e;
            return new d(cVar, cVar2, cVar3, cVar3);
        }

        public static d d(d dVar) {
            C0780c cVar = f7746e;
            return new d(cVar, cVar, dVar.f7748b, dVar.f7749c);
        }

        public static d e(d dVar, View view) {
            return j.d(view) ? d(dVar) : c(dVar);
        }

        public static d f(d dVar) {
            C0780c cVar = dVar.f7747a;
            C0780c cVar2 = f7746e;
            return new d(cVar, cVar2, dVar.f7748b, cVar2);
        }
    }

    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i4, boolean z4);
    }

    public class f implements MaterialButton.b {
        public f() {
        }

        public void a(MaterialButton materialButton, boolean z4) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, V1.a.f2982q);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (p(i4)) {
                return i4;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (p(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if ((getChildAt(i5) instanceof MaterialButton) && p(i5)) {
                i4++;
            }
        }
        return i4;
    }

    private void setCheckedId(int i4) {
        this.f7742l = i4;
        l(i4, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C.i());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.a(this.f7734d);
        materialButton.setOnPressedChangeListenerInternal(this.f7735e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public static void t(k.b bVar, d dVar) {
        if (dVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(dVar.f7747a).t(dVar.f7750d).F(dVar.f7748b).x(dVar.f7749c);
        }
    }

    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f7731m, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i4, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            u(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f7733c.add(new d(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        C.g0(materialButton, new b());
    }

    public void dispatchDraw(Canvas canvas) {
        v();
        super.dispatchDraw(canvas);
    }

    public void g(e eVar) {
        this.f7736f.add(eVar);
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f7740j) {
            return this.f7742l;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            MaterialButton m4 = m(i4);
            if (m4.isChecked()) {
                arrayList.add(Integer.valueOf(m4.getId()));
            }
        }
        return arrayList;
    }

    public int getChildDrawingOrder(int i4, int i5) {
        Integer[] numArr = this.f7738h;
        if (numArr != null && i5 < numArr.length) {
            return numArr[i5].intValue();
        }
        Log.w(f7731m, "Child order wasn't updated");
        return i5;
    }

    public final void h() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i4 = firstVisibleChildIndex + 1; i4 < getChildCount(); i4++) {
                MaterialButton m4 = m(i4);
                int min = Math.min(m4.getStrokeWidth(), m(i4 - 1).getStrokeWidth());
                LinearLayout.LayoutParams i5 = i(m4);
                if (getOrientation() == 0) {
                    C0320k.c(i5, 0);
                    C0320k.d(i5, -min);
                    i5.topMargin = 0;
                } else {
                    i5.bottomMargin = 0;
                    i5.topMargin = -min;
                    C0320k.d(i5, 0);
                }
                m4.setLayoutParams(i5);
            }
            r(firstVisibleChildIndex);
        }
    }

    public final LinearLayout.LayoutParams i(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    public final void j(int i4) {
        s(i4, true);
        u(i4, true);
        setCheckedId(i4);
    }

    public void k() {
        this.f7739i = true;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            MaterialButton m4 = m(i4);
            m4.setChecked(false);
            l(m4.getId(), false);
        }
        this.f7739i = false;
        setCheckedId(-1);
    }

    public final void l(int i4, boolean z4) {
        Iterator it = this.f7736f.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(this, i4, z4);
        }
    }

    public final MaterialButton m(int i4) {
        return (MaterialButton) getChildAt(i4);
    }

    public final int n(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) == view) {
                return i4;
            }
            if ((getChildAt(i5) instanceof MaterialButton) && p(i5)) {
                i4++;
            }
        }
        return -1;
    }

    public final d o(int i4, int i5, int i6) {
        d dVar = (d) this.f7733c.get(i4);
        if (i5 == i6) {
            return dVar;
        }
        boolean z4 = getOrientation() == 0;
        if (i4 == i5) {
            return z4 ? d.e(dVar, this) : d.f(dVar);
        }
        if (i4 == i6) {
            return z4 ? d.b(dVar, this) : d.a(dVar);
        }
        return null;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f7742l;
        if (i4 != -1) {
            j(i4);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m.C0(accessibilityNodeInfo).e0(m.e.a(1, getVisibleButtonCount(), false, q() ? 1 : 2));
    }

    public void onMeasure(int i4, int i5) {
        w();
        h();
        super.onMeasure(i4, i5);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.h(this.f7734d);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton.b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f7733c.remove(indexOfChild);
        }
        w();
        h();
    }

    public final boolean p(int i4) {
        return getChildAt(i4).getVisibility() != 8;
    }

    public boolean q() {
        return this.f7740j;
    }

    public final void r(int i4) {
        if (getChildCount() != 0 && i4 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m(i4).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C0320k.c(layoutParams, 0);
            C0320k.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void s(int i4, boolean z4) {
        View findViewById = findViewById(i4);
        if (findViewById instanceof MaterialButton) {
            this.f7739i = true;
            ((MaterialButton) findViewById).setChecked(z4);
            this.f7739i = false;
        }
    }

    public void setSelectionRequired(boolean z4) {
        this.f7741k = z4;
    }

    public void setSingleSelection(boolean z4) {
        if (this.f7740j != z4) {
            this.f7740j = z4;
            k();
        }
    }

    public final boolean u(int i4, boolean z4) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.f7741k || !checkedButtonIds.isEmpty()) {
            if (z4 && this.f7740j) {
                checkedButtonIds.remove(Integer.valueOf(i4));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    s(intValue2, false);
                    l(intValue2, false);
                }
            }
            return true;
        }
        s(i4, true);
        this.f7742l = i4;
        return false;
    }

    public final void v() {
        TreeMap treeMap = new TreeMap(this.f7737g);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            treeMap.put(m(i4), Integer.valueOf(i4));
        }
        this.f7738h = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void w() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i4 = 0; i4 < childCount; i4++) {
            MaterialButton m4 = m(i4);
            if (m4.getVisibility() != 8) {
                k.b v4 = m4.getShapeAppearanceModel().v();
                t(v4, o(i4, firstVisibleChildIndex, lastVisibleChildIndex));
                m4.setShapeAppearanceModel(v4.m());
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f7732n
            android.content.Context r7 = o2.C0822a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f7733c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.f7734d = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.f7735e = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f7736f = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f7737g = r7
            r7 = 0
            r6.f7739i = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = V1.j.f3279e2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = g2.i.h(r0, r1, r2, r3, r4, r5)
            int r9 = V1.j.f3294h2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = V1.j.f3284f2
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f7742l = r9
            int r9 = V1.j.f3289g2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f7741k = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            S.C.q0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }
}
