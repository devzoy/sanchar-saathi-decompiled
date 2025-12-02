package androidx.constraintlayout.widget;

import A.e;
import A.h;
import C.c;
import C.d;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

public abstract class b extends View {

    /* renamed from: c  reason: collision with root package name */
    public int[] f4808c = new int[32];

    /* renamed from: d  reason: collision with root package name */
    public int f4809d;

    /* renamed from: e  reason: collision with root package name */
    public Context f4810e;

    /* renamed from: f  reason: collision with root package name */
    public h f4811f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4812g = false;

    /* renamed from: h  reason: collision with root package name */
    public String f4813h;

    /* renamed from: i  reason: collision with root package name */
    public View[] f4814i = null;

    /* renamed from: j  reason: collision with root package name */
    public HashMap f4815j = new HashMap();

    public b(Context context) {
        super(context);
        this.f4810e = context;
        e((AttributeSet) null);
    }

    public final void a(String str) {
        if (str != null && str.length() != 0 && this.f4810e != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int d4 = d(trim);
            if (d4 != 0) {
                this.f4815j.put(Integer.valueOf(d4), trim);
                b(d4);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void b(int i4) {
        if (i4 != getId()) {
            int i5 = this.f4809d + 1;
            int[] iArr = this.f4808c;
            if (i5 > iArr.length) {
                this.f4808c = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f4808c;
            int i6 = this.f4809d;
            iArr2[i6] = i4;
            this.f4809d = i6 + 1;
        }
    }

    public final int c(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f4810e.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int d(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i4 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f4 = constraintLayout.f(0, str);
            if (f4 instanceof Integer) {
                i4 = ((Integer) f4).intValue();
            }
        }
        if (i4 == 0 && constraintLayout != null) {
            i4 = c(constraintLayout, str);
        }
        if (i4 == 0) {
            try {
                i4 = c.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        return i4 == 0 ? this.f4810e.getResources().getIdentifier(str, "id", this.f4810e.getPackageName()) : i4;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f395a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == d.f445k1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f4813h = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(e eVar, boolean z4);

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f4808c, this.f4809d);
    }

    public void h(ConstraintLayout constraintLayout) {
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = (java.lang.String) r5.f4815j.get(java.lang.Integer.valueOf(r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f4813h
            r5.setIds(r0)
        L_0x000b:
            A.h r0 = r5.f4811f
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.b()
            r0 = 0
        L_0x0014:
            int r1 = r5.f4809d
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f4808c
            r1 = r1[r0]
            android.view.View r2 = r6.h(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap r3 = r5.f4815j
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.c(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f4808c
            r2[r0] = r3
            java.util.HashMap r2 = r5.f4815j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.h(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            A.h r1 = r5.f4811f
            A.e r2 = r6.i(r2)
            r1.a(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            A.h r0 = r5.f4811f
            A.f r6 = r6.f4694e
            r0.c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.j(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    public void k() {
        if (this.f4811f != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.b) {
                ((ConstraintLayout.b) layoutParams).f4769n0 = (e) this.f4811f;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f4813h;
        if (str != null) {
            setIds(str);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i4, int i5) {
        if (this.f4812g) {
            super.onMeasure(i4, i5);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f4813h = str;
        if (str != null) {
            int i4 = 0;
            this.f4809d = 0;
            while (true) {
                int indexOf = str.indexOf(44, i4);
                if (indexOf == -1) {
                    a(str.substring(i4));
                    return;
                } else {
                    a(str.substring(i4, indexOf));
                    i4 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f4813h = null;
        this.f4809d = 0;
        for (int b4 : iArr) {
            b(b4);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4810e = context;
        e(attributeSet);
    }
}
