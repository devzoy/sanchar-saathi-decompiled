package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.e;
import p.f0;

public final class ExpandedMenuView extends ListView implements e.b, j, AdapterView.OnItemClickListener {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f4176e = {16842964, 16843049};

    /* renamed from: c  reason: collision with root package name */
    public e f4177c;

    /* renamed from: d  reason: collision with root package name */
    public int f4178d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public boolean a(g gVar) {
        return this.f4177c.L(gVar, 0);
    }

    public void b(e eVar) {
        this.f4177c = eVar;
    }

    public int getWindowAnimations() {
        return this.f4178d;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        a((g) getAdapter().getItem(i4));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        f0 v4 = f0.v(context, attributeSet, f4176e, i4, 0);
        if (v4.s(0)) {
            setBackgroundDrawable(v4.g(0));
        }
        if (v4.s(1)) {
            setDivider(v4.g(1));
        }
        v4.w();
    }
}
