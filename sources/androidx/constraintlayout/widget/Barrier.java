package androidx.constraintlayout.widget;

import A.a;
import A.e;
import C.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class Barrier extends b {

    /* renamed from: k  reason: collision with root package name */
    public int f4689k;

    /* renamed from: l  reason: collision with root package name */
    public int f4690l;

    /* renamed from: m  reason: collision with root package name */
    public a f4691m;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        this.f4691m = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.f395a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == d.f430h1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == d.f425g1) {
                    this.f4691m.K0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == d.f435i1) {
                    this.f4691m.M0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f4811f = this.f4691m;
        k();
    }

    public void f(e eVar, boolean z4) {
        m(eVar, this.f4689k, z4);
    }

    public int getMargin() {
        return this.f4691m.I0();
    }

    public int getType() {
        return this.f4689k;
    }

    public boolean l() {
        return this.f4691m.G0();
    }

    public final void m(e eVar, int i4, boolean z4) {
        this.f4690l = i4;
        if (z4) {
            int i5 = this.f4689k;
            if (i5 == 5) {
                this.f4690l = 1;
            } else if (i5 == 6) {
                this.f4690l = 0;
            }
        } else {
            int i6 = this.f4689k;
            if (i6 == 5) {
                this.f4690l = 0;
            } else if (i6 == 6) {
                this.f4690l = 1;
            }
        }
        if (eVar instanceof a) {
            ((a) eVar).L0(this.f4690l);
        }
    }

    public void setAllowsGoneWidget(boolean z4) {
        this.f4691m.K0(z4);
    }

    public void setDpMargin(int i4) {
        a aVar = this.f4691m;
        aVar.M0((int) ((((float) i4) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i4) {
        this.f4691m.M0(i4);
    }

    public void setType(int i4) {
        this.f4689k = i4;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
