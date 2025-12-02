package n2;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: n2.c  reason: case insensitive filesystem */
public abstract class C0803c {

    /* renamed from: a  reason: collision with root package name */
    public TextInputLayout f11234a;

    /* renamed from: b  reason: collision with root package name */
    public Context f11235b;

    /* renamed from: c  reason: collision with root package name */
    public CheckableImageButton f11236c;

    public C0803c(TextInputLayout textInputLayout) {
        this.f11234a = textInputLayout;
        this.f11235b = textInputLayout.getContext();
        this.f11236c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public boolean b(int i4) {
        return true;
    }

    public void c(boolean z4) {
    }

    public boolean d() {
        return false;
    }
}
