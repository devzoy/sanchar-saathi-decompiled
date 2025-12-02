package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import h.C0645a;

/* renamed from: p.s  reason: case insensitive filesystem */
public class C0851s extends RatingBar {

    /* renamed from: c  reason: collision with root package name */
    public final C0850q f11582c;

    public C0851s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9159D);
    }

    public synchronized void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        Bitmap b4 = this.f11582c.b();
        if (b4 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b4.getWidth() * getNumStars(), i4, 0), getMeasuredHeight());
        }
    }

    public C0851s(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        b0.a(this, getContext());
        C0850q qVar = new C0850q(this);
        this.f11582c = qVar;
        qVar.c(attributeSet, i4);
    }
}
