package androidx.preference;

import I.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import q0.C0887c;
import q0.C0890f;
import q0.C0891g;

public class ListPreference extends DialogPreference {

    /* renamed from: N  reason: collision with root package name */
    public CharSequence[] f5461N;

    /* renamed from: O  reason: collision with root package name */
    public CharSequence[] f5462O;

    /* renamed from: P  reason: collision with root package name */
    public String f5463P;

    /* renamed from: Q  reason: collision with root package name */
    public String f5464Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f5465R;

    public static final class a implements Preference.b {

        /* renamed from: a  reason: collision with root package name */
        public static a f5466a;

        public static a b() {
            if (f5466a == null) {
                f5466a = new a();
            }
            return f5466a;
        }

        /* renamed from: c */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.P()) ? listPreference.k().getString(C0890f.f11767a) : listPreference.P();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0891g.f11871x, i4, i5);
        this.f5461N = e.h(obtainStyledAttributes, C0891g.f11768A, C0891g.f11873y);
        this.f5462O = e.h(obtainStyledAttributes, C0891g.f11770B, C0891g.f11875z);
        int i6 = C0891g.f11772C;
        if (e.b(obtainStyledAttributes, i6, i6, false)) {
            K(a.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0891g.f11784I, i4, i5);
        this.f5464Q = e.f(obtainStyledAttributes2, C0891g.f11858q0, C0891g.f11800Q);
        obtainStyledAttributes2.recycle();
    }

    public Object D(TypedArray typedArray, int i4) {
        return typedArray.getString(i4);
    }

    public int N(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f5462O) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f5462O[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] O() {
        return this.f5461N;
    }

    public CharSequence P() {
        CharSequence[] charSequenceArr;
        int S3 = S();
        if (S3 < 0 || (charSequenceArr = this.f5461N) == null) {
            return null;
        }
        return charSequenceArr[S3];
    }

    public CharSequence[] Q() {
        return this.f5462O;
    }

    public String R() {
        return this.f5463P;
    }

    public final int S() {
        return N(this.f5463P);
    }

    public void T(String str) {
        boolean equals = TextUtils.equals(this.f5463P, str);
        if (!equals || !this.f5465R) {
            this.f5463P = str;
            this.f5465R = true;
            J(str);
            if (!equals) {
                z();
            }
        }
    }

    public CharSequence t() {
        if (u() != null) {
            return u().a(this);
        }
        Object P4 = P();
        CharSequence t4 = super.t();
        String str = this.f5464Q;
        if (str == null) {
            return t4;
        }
        if (P4 == null) {
            P4 = "";
        }
        String format = String.format(str, new Object[]{P4});
        if (TextUtils.equals(format, t4)) {
            return t4;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, C0887c.f11756b, 16842897));
    }
}
