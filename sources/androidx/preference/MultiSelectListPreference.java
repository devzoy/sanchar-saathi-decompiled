package androidx.preference;

import I.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;
import q0.C0887c;
import q0.C0891g;

public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: N  reason: collision with root package name */
    public CharSequence[] f5467N;

    /* renamed from: O  reason: collision with root package name */
    public CharSequence[] f5468O;

    /* renamed from: P  reason: collision with root package name */
    public Set f5469P;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5469P = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0891g.f11774D, i4, i5);
        this.f5467N = e.h(obtainStyledAttributes, C0891g.f11780G, C0891g.f11776E);
        this.f5468O = e.h(obtainStyledAttributes, C0891g.f11782H, C0891g.f11778F);
        obtainStyledAttributes.recycle();
    }

    public Object D(TypedArray typedArray, int i4) {
        CharSequence[] textArray = typedArray.getTextArray(i4);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, C0887c.f11756b, 16842897));
    }
}
