package i;

import S.C0318i;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import h.C0645a;
import n.b;

public abstract class f extends Dialog implements C0676c {

    /* renamed from: c  reason: collision with root package name */
    public C0677d f9739c;

    /* renamed from: d  reason: collision with root package name */
    public final C0318i.a f9740d = new a();

    public class a implements C0318i.a {
        public a() {
        }

        public boolean f(KeyEvent keyEvent) {
            return f.this.c(keyEvent);
        }
    }

    public f(Context context, int i4) {
        super(context, b(context, i4));
        C0677d a4 = a();
        a4.D(b(context, i4));
        a4.q((Bundle) null);
    }

    public static int b(Context context, int i4) {
        if (i4 != 0) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0645a.f9188v, typedValue, true);
        return typedValue.resourceId;
    }

    public C0677d a() {
        if (this.f9739c == null) {
            this.f9739c = C0677d.h(this, this);
        }
        return this.f9739c;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean d(int i4) {
        return a().z(i4);
    }

    public void dismiss() {
        super.dismiss();
        a().r();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0318i.b(this.f9740d, getWindow().getDecorView(), this, keyEvent);
    }

    public View findViewById(int i4) {
        return a().i(i4);
    }

    public void invalidateOptionsMenu() {
        a().o();
    }

    public void j(b bVar) {
    }

    public b n(b.a aVar) {
        return null;
    }

    public void onCreate(Bundle bundle) {
        a().n();
        super.onCreate(bundle);
        a().q(bundle);
    }

    public void onStop() {
        super.onStop();
        a().w();
    }

    public void setContentView(int i4) {
        a().A(i4);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().E(charSequence);
    }

    public void v(b bVar) {
    }

    public void setContentView(View view) {
        a().B(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().C(view, layoutParams);
    }

    public void setTitle(int i4) {
        super.setTitle(i4);
        a().E(getContext().getString(i4));
    }
}
