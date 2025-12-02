package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

public class a implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public int f8269a;

    public a(int i4) {
        this.f8269a = i4;
    }

    public CharSequence filter(CharSequence charSequence, int i4, int i5, Spanned spanned, int i6, int i7) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i6, i7, charSequence.subSequence(i4, i5).toString());
            if (Integer.parseInt(sb.toString()) <= this.f8269a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
