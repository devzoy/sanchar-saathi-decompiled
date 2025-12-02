package T;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f2794a;

    /* renamed from: b  reason: collision with root package name */
    public final m f2795b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2796c;

    public a(int i4, m mVar, int i5) {
        this.f2794a = i4;
        this.f2795b = mVar;
        this.f2796c = i5;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2794a);
        this.f2795b.V(this.f2796c, bundle);
    }
}
