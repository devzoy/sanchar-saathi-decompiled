package androidx.preference;

import I.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import q0.C0891g;
import v.g;

public abstract class PreferenceGroup extends Preference {

    /* renamed from: H  reason: collision with root package name */
    public final g f5500H;

    /* renamed from: I  reason: collision with root package name */
    public final Handler f5501I;

    /* renamed from: J  reason: collision with root package name */
    public final List f5502J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f5503K;

    /* renamed from: L  reason: collision with root package name */
    public int f5504L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f5505M;

    /* renamed from: N  reason: collision with root package name */
    public int f5506N;

    /* renamed from: O  reason: collision with root package name */
    public final Runnable f5507O;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            synchronized (this) {
                PreferenceGroup.this.f5500H.clear();
            }
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5500H = new g();
        this.f5501I = new Handler(Looper.getMainLooper());
        this.f5503K = true;
        this.f5504L = 0;
        this.f5505M = false;
        this.f5506N = Integer.MAX_VALUE;
        this.f5507O = new a();
        this.f5502J = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0891g.f11868v0, i4, i5);
        int i6 = C0891g.f11872x0;
        this.f5503K = e.b(obtainStyledAttributes, i6, i6, true);
        if (obtainStyledAttributes.hasValue(C0891g.f11870w0)) {
            int i7 = C0891g.f11870w0;
            P(e.d(obtainStyledAttributes, i7, i7, Integer.MAX_VALUE));
        }
        obtainStyledAttributes.recycle();
    }

    public void A(boolean z4) {
        super.A(z4);
        int O4 = O();
        for (int i4 = 0; i4 < O4; i4++) {
            N(i4).E(this, z4);
        }
    }

    public Preference N(int i4) {
        return (Preference) this.f5502J.get(i4);
    }

    public int O() {
        return this.f5502J.size();
    }

    public void P(int i4) {
        if (i4 != Integer.MAX_VALUE && !w()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f5506N = i4;
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
