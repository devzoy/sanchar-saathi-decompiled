package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import q0.C0887c;

public class DropDownPreference extends ListPreference {

    /* renamed from: S  reason: collision with root package name */
    public final Context f5454S;

    /* renamed from: T  reason: collision with root package name */
    public final ArrayAdapter f5455T;

    /* renamed from: U  reason: collision with root package name */
    public Spinner f5456U;

    /* renamed from: V  reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f5457V;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
            if (i4 >= 0) {
                String charSequence = DropDownPreference.this.Q()[i4].toString();
                if (!charSequence.equals(DropDownPreference.this.R()) && DropDownPreference.this.b(charSequence)) {
                    DropDownPreference.this.T(charSequence);
                }
            }
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0887c.f11757c);
    }

    public void B() {
        this.f5456U.performClick();
    }

    public ArrayAdapter U() {
        return new ArrayAdapter(this.f5454S, 17367049);
    }

    public final void V() {
        this.f5455T.clear();
        if (O() != null) {
            for (CharSequence charSequence : O()) {
                this.f5455T.add(charSequence.toString());
            }
        }
    }

    public void z() {
        super.z();
        ArrayAdapter arrayAdapter = this.f5455T;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5457V = new a();
        this.f5454S = context;
        this.f5455T = U();
        V();
    }
}
