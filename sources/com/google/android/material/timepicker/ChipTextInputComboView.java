package com.google.android.material.timepicker;

import V1.e;
import V1.g;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import g2.h;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: c  reason: collision with root package name */
    public final Chip f8221c;

    /* renamed from: d  reason: collision with root package name */
    public final TextInputLayout f8222d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f8223e;

    /* renamed from: f  reason: collision with root package name */
    public TextWatcher f8224f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f8225g;

    public class b extends h {
        public b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f8221c.setText(ChipTextInputComboView.this.c("00"));
            } else {
                ChipTextInputComboView.this.f8221c.setText(ChipTextInputComboView.this.c(editable));
            }
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final String c(CharSequence charSequence) {
        return c.a(getResources(), charSequence);
    }

    public final void d() {
        this.f8223e.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public boolean isChecked() {
        return this.f8221c.isChecked();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    public void setChecked(boolean z4) {
        this.f8221c.setChecked(z4);
        int i4 = 0;
        this.f8223e.setVisibility(z4 ? 0 : 4);
        Chip chip = this.f8221c;
        if (z4) {
            i4 = 8;
        }
        chip.setVisibility(i4);
        if (isChecked()) {
            this.f8223e.requestFocus();
            if (!TextUtils.isEmpty(this.f8223e.getText())) {
                EditText editText = this.f8223e;
                editText.setSelection(editText.getText().length());
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f8221c.setOnClickListener(onClickListener);
    }

    public void setTag(int i4, Object obj) {
        this.f8221c.setTag(i4, obj);
    }

    public void toggle() {
        this.f8221c.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(g.f3091i, this, false);
        this.f8221c = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(g.f3092j, this, false);
        this.f8222d = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f8223e = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f8224f = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f8225g = (TextView) findViewById(e.f3066k);
        editText.setSaveEnabled(false);
    }
}
