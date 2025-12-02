package p;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import h.C0645a;

/* renamed from: p.t  reason: case insensitive filesystem */
public class C0852t extends SeekBar {

    /* renamed from: c  reason: collision with root package name */
    public final C0853u f11583c;

    public C0852t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0645a.f9161F);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f11583c.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f11583c.i();
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f11583c.g(canvas);
    }

    public C0852t(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        b0.a(this, getContext());
        C0853u uVar = new C0853u(this);
        this.f11583c = uVar;
        uVar.c(attributeSet, i4);
    }
}
