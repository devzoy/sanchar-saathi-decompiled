package i;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import h.j;
import n.b;

/* renamed from: i.a  reason: case insensitive filesystem */
public abstract class C0674a {
    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z4);

    public abstract int j();

    public abstract Context k();

    public boolean l() {
        return false;
    }

    public abstract void m(Configuration configuration);

    public void n() {
    }

    public abstract boolean o(int i4, KeyEvent keyEvent);

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(boolean z4);

    public abstract void s(boolean z4);

    public abstract void t(CharSequence charSequence);

    public abstract b u(b.a aVar);

    /* renamed from: i.a$a  reason: collision with other inner class name */
    public static class C0165a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f9640a = 8388627;

        public C0165a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f9545t);
            this.f9640a = obtainStyledAttributes.getInt(j.f9550u, 0);
            obtainStyledAttributes.recycle();
        }

        public C0165a(int i4, int i5) {
            super(i4, i5);
        }

        public C0165a(C0165a aVar) {
            super(aVar);
            this.f9640a = aVar.f9640a;
        }

        public C0165a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
