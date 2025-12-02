package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import g2.h;
import j.C0754a;
import n2.C0803c;

public class c extends C0803c {

    /* renamed from: d  reason: collision with root package name */
    public final TextWatcher f8212d = new a();

    /* renamed from: e  reason: collision with root package name */
    public final TextInputLayout.f f8213e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.g f8214f = new C0136c();

    public class a extends h {
        public a() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            c cVar = c.this;
            cVar.f11236c.setChecked(!cVar.g());
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            c cVar = c.this;
            cVar.f11236c.setChecked(!cVar.g());
            editText.removeTextChangedListener(c.this.f8212d);
            editText.addTextChangedListener(c.this.f8212d);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c  reason: collision with other inner class name */
    public class C0136c implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        public class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ EditText f8218e;

            public a(EditText editText) {
                this.f8218e = editText;
            }

            public void run() {
                this.f8218e.removeTextChangedListener(c.this.f8212d);
            }
        }

        public C0136c() {
        }

        public void a(TextInputLayout textInputLayout, int i4) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i4 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new a(editText));
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            EditText editText = c.this.f11234a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (c.this.g()) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                c.this.f11234a.V();
            }
        }
    }

    public c(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public static boolean h(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    public void a() {
        this.f11234a.setEndIconDrawable(C0754a.b(this.f11235b, V1.d.f3037a));
        TextInputLayout textInputLayout = this.f11234a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(V1.h.f3119p));
        this.f11234a.setEndIconOnClickListener(new d());
        this.f11234a.e(this.f8213e);
        this.f11234a.f(this.f8214f);
        EditText editText = this.f11234a.getEditText();
        if (h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean g() {
        EditText editText = this.f11234a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
