package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import q0.C0887c;
import q0.C0891g;

public class SeekBarPreference extends Preference {

    /* renamed from: H  reason: collision with root package name */
    public int f5510H;

    /* renamed from: I  reason: collision with root package name */
    public int f5511I;

    /* renamed from: J  reason: collision with root package name */
    public int f5512J;

    /* renamed from: K  reason: collision with root package name */
    public int f5513K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f5514L;

    /* renamed from: M  reason: collision with root package name */
    public SeekBar f5515M;

    /* renamed from: N  reason: collision with root package name */
    public TextView f5516N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f5517O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f5518P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f5519Q;

    /* renamed from: R  reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f5520R;

    /* renamed from: S  reason: collision with root package name */
    public final View.OnKeyListener f5521S;

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        public void onProgressChanged(SeekBar seekBar, int i4, boolean z4) {
            if (z4) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f5519Q || !seekBarPreference.f5514L) {
                    seekBarPreference.Q(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.R(i4 + seekBarPreference2.f5511I);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f5514L = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f5514L = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f5511I != seekBarPreference.f5510H) {
                seekBarPreference.Q(seekBar);
            }
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f5517O && (i4 == 21 || i4 == 22)) || i4 == 23 || i4 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f5515M;
            if (seekBar != null) {
                return seekBar.onKeyDown(i4, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5520R = new a();
        this.f5521S = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0891g.f11773C0, i4, i5);
        this.f5511I = obtainStyledAttributes.getInt(C0891g.f11779F0, 0);
        N(obtainStyledAttributes.getInt(C0891g.f11775D0, 100));
        O(obtainStyledAttributes.getInt(C0891g.f11781G0, 0));
        this.f5517O = obtainStyledAttributes.getBoolean(C0891g.f11777E0, true);
        this.f5518P = obtainStyledAttributes.getBoolean(C0891g.f11783H0, false);
        this.f5519Q = obtainStyledAttributes.getBoolean(C0891g.f11785I0, false);
        obtainStyledAttributes.recycle();
    }

    public Object D(TypedArray typedArray, int i4) {
        return Integer.valueOf(typedArray.getInt(i4, 0));
    }

    public final void N(int i4) {
        int i5 = this.f5511I;
        if (i4 < i5) {
            i4 = i5;
        }
        if (i4 != this.f5512J) {
            this.f5512J = i4;
            z();
        }
    }

    public final void O(int i4) {
        if (i4 != this.f5513K) {
            this.f5513K = Math.min(this.f5512J - this.f5511I, Math.abs(i4));
            z();
        }
    }

    public final void P(int i4, boolean z4) {
        int i5 = this.f5511I;
        if (i4 < i5) {
            i4 = i5;
        }
        int i6 = this.f5512J;
        if (i4 > i6) {
            i4 = i6;
        }
        if (i4 != this.f5510H) {
            this.f5510H = i4;
            R(i4);
            I(i4);
            if (z4) {
                z();
            }
        }
    }

    public void Q(SeekBar seekBar) {
        int progress = this.f5511I + seekBar.getProgress();
        if (progress == this.f5510H) {
            return;
        }
        if (b(Integer.valueOf(progress))) {
            P(progress, false);
            return;
        }
        seekBar.setProgress(this.f5510H - this.f5511I);
        R(this.f5510H);
    }

    public void R(int i4) {
        TextView textView = this.f5516N;
        if (textView != null) {
            textView.setText(String.valueOf(i4));
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0887c.f11762h);
    }
}
