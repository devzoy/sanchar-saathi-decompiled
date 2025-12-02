package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import h.C0645a;
import i.f;

public class a extends f implements DialogInterface {

    /* renamed from: e  reason: collision with root package name */
    public final AlertController f4161e = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.a$a  reason: collision with other inner class name */
    public static class C0082a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f4162a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4163b;

        public C0082a(Context context) {
            this(context, a.f(context, 0));
        }

        public a a() {
            a aVar = new a(this.f4162a.f4122a, this.f4163b);
            this.f4162a.a(aVar.f4161e);
            aVar.setCancelable(this.f4162a.f4139r);
            if (this.f4162a.f4139r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f4162a.f4140s);
            aVar.setOnDismissListener(this.f4162a.f4141t);
            DialogInterface.OnKeyListener onKeyListener = this.f4162a.f4142u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.f4162a.f4122a;
        }

        public C0082a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f4162a;
            bVar.f4144w = listAdapter;
            bVar.f4145x = onClickListener;
            return this;
        }

        public C0082a d(View view) {
            this.f4162a.f4128g = view;
            return this;
        }

        public C0082a e(Drawable drawable) {
            this.f4162a.f4125d = drawable;
            return this;
        }

        public C0082a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f4162a.f4142u = onKeyListener;
            return this;
        }

        public C0082a g(ListAdapter listAdapter, int i4, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f4162a;
            bVar.f4144w = listAdapter;
            bVar.f4145x = onClickListener;
            bVar.f4115I = i4;
            bVar.f4114H = true;
            return this;
        }

        public C0082a h(CharSequence charSequence) {
            this.f4162a.f4127f = charSequence;
            return this;
        }

        public C0082a(Context context, int i4) {
            this.f4162a = new AlertController.b(new ContextThemeWrapper(context, a.f(context, i4)));
            this.f4163b = i4;
        }
    }

    public a(Context context, int i4) {
        super(context, f(context, i4));
    }

    public static int f(Context context, int i4) {
        if (((i4 >>> 24) & 255) >= 1) {
            return i4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0645a.f9178l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f4161e.d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4161e.e();
    }

    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (this.f4161e.f(i4, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        if (this.f4161e.g(i4, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f4161e.p(charSequence);
    }
}
