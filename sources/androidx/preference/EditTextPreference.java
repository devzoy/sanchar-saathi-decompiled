package androidx.preference;

import I.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import q0.C0887c;
import q0.C0890f;
import q0.C0891g;

public class EditTextPreference extends DialogPreference {

    /* renamed from: N  reason: collision with root package name */
    public String f5459N;

    public static final class a implements Preference.b {

        /* renamed from: a  reason: collision with root package name */
        public static a f5460a;

        public static a b() {
            if (f5460a == null) {
                f5460a = new a();
            }
            return f5460a;
        }

        /* renamed from: c */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.N()) ? editTextPreference.k().getString(C0890f.f11767a) : editTextPreference.N();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0891g.f11867v, i4, i5);
        int i6 = C0891g.f11869w;
        if (e.b(obtainStyledAttributes, i6, i6, false)) {
            K(a.b());
        }
        obtainStyledAttributes.recycle();
    }

    public Object D(TypedArray typedArray, int i4) {
        return typedArray.getString(i4);
    }

    public boolean L() {
        return TextUtils.isEmpty(this.f5459N) || super.L();
    }

    public String N() {
        return this.f5459N;
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, C0887c.f11758d, 16842898));
    }
}
