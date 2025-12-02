package androidx.preference;

import I.e;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import q0.C0885a;
import q0.C0886b;
import q0.C0887c;
import q0.C0889e;
import q0.C0891g;

public class Preference implements Comparable<Preference> {

    /* renamed from: A  reason: collision with root package name */
    public boolean f5470A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f5471B;

    /* renamed from: C  reason: collision with root package name */
    public int f5472C;

    /* renamed from: D  reason: collision with root package name */
    public int f5473D;

    /* renamed from: E  reason: collision with root package name */
    public List f5474E;

    /* renamed from: F  reason: collision with root package name */
    public b f5475F;

    /* renamed from: G  reason: collision with root package name */
    public final View.OnClickListener f5476G;

    /* renamed from: e  reason: collision with root package name */
    public final Context f5477e;

    /* renamed from: f  reason: collision with root package name */
    public int f5478f;

    /* renamed from: g  reason: collision with root package name */
    public int f5479g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f5480h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f5481i;

    /* renamed from: j  reason: collision with root package name */
    public int f5482j;

    /* renamed from: k  reason: collision with root package name */
    public String f5483k;

    /* renamed from: l  reason: collision with root package name */
    public Intent f5484l;

    /* renamed from: m  reason: collision with root package name */
    public String f5485m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5486n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5487o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5488p;

    /* renamed from: q  reason: collision with root package name */
    public String f5489q;

    /* renamed from: r  reason: collision with root package name */
    public Object f5490r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5491s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f5492t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5493u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5494v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5495w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f5496x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f5497y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f5498z;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            Preference.this.G(view);
        }
    }

    public interface b {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f5478f = Integer.MAX_VALUE;
        this.f5479g = 0;
        this.f5486n = true;
        this.f5487o = true;
        this.f5488p = true;
        this.f5491s = true;
        this.f5492t = true;
        this.f5493u = true;
        this.f5494v = true;
        this.f5495w = true;
        this.f5497y = true;
        this.f5471B = true;
        this.f5472C = C0889e.f11766a;
        this.f5476G = new a();
        this.f5477e = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0891g.f11784I, i4, i5);
        this.f5482j = e.e(obtainStyledAttributes, C0891g.f11838g0, C0891g.f11786J, 0);
        this.f5483k = e.f(obtainStyledAttributes, C0891g.f11844j0, C0891g.f11798P);
        this.f5480h = e.g(obtainStyledAttributes, C0891g.f11860r0, C0891g.f11794N);
        this.f5481i = e.g(obtainStyledAttributes, C0891g.f11858q0, C0891g.f11800Q);
        this.f5478f = e.d(obtainStyledAttributes, C0891g.f11848l0, C0891g.f11802R, Integer.MAX_VALUE);
        this.f5485m = e.f(obtainStyledAttributes, C0891g.f11836f0, C0891g.f11812W);
        this.f5472C = e.e(obtainStyledAttributes, C0891g.f11846k0, C0891g.f11792M, C0889e.f11766a);
        this.f5473D = e.e(obtainStyledAttributes, C0891g.f11862s0, C0891g.f11804S, 0);
        this.f5486n = e.b(obtainStyledAttributes, C0891g.f11833e0, C0891g.f11790L, true);
        this.f5487o = e.b(obtainStyledAttributes, C0891g.f11852n0, C0891g.f11796O, true);
        this.f5488p = e.b(obtainStyledAttributes, C0891g.f11850m0, C0891g.f11788K, true);
        this.f5489q = e.f(obtainStyledAttributes, C0891g.f11827c0, C0891g.f11806T);
        int i6 = C0891g.f11818Z;
        this.f5494v = e.b(obtainStyledAttributes, i6, i6, this.f5487o);
        int i7 = C0891g.f11821a0;
        this.f5495w = e.b(obtainStyledAttributes, i7, i7, this.f5487o);
        if (obtainStyledAttributes.hasValue(C0891g.f11824b0)) {
            this.f5490r = D(obtainStyledAttributes, C0891g.f11824b0);
        } else if (obtainStyledAttributes.hasValue(C0891g.f11808U)) {
            this.f5490r = D(obtainStyledAttributes, C0891g.f11808U);
        }
        this.f5471B = e.b(obtainStyledAttributes, C0891g.f11854o0, C0891g.f11810V, true);
        boolean hasValue = obtainStyledAttributes.hasValue(C0891g.f11856p0);
        this.f5496x = hasValue;
        if (hasValue) {
            this.f5497y = e.b(obtainStyledAttributes, C0891g.f11856p0, C0891g.f11814X, true);
        }
        this.f5498z = e.b(obtainStyledAttributes, C0891g.f11840h0, C0891g.f11816Y, false);
        int i8 = C0891g.f11842i0;
        this.f5493u = e.b(obtainStyledAttributes, i8, i8, true);
        int i9 = C0891g.f11830d0;
        this.f5470A = e.b(obtainStyledAttributes, i9, i9, false);
        obtainStyledAttributes.recycle();
    }

    public void A(boolean z4) {
        List list = this.f5474E;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((Preference) list.get(i4)).C(this, z4);
            }
        }
    }

    public void B() {
    }

    public void C(Preference preference, boolean z4) {
        if (this.f5491s == z4) {
            this.f5491s = !z4;
            A(L());
            z();
        }
    }

    public Object D(TypedArray typedArray, int i4) {
        return null;
    }

    public void E(Preference preference, boolean z4) {
        if (this.f5492t == z4) {
            this.f5492t = !z4;
            A(L());
            z();
        }
    }

    public void F() {
        if (x() && y()) {
            B();
            s();
            if (this.f5484l != null) {
                k().startActivity(this.f5484l);
            }
        }
    }

    public void G(View view) {
        F();
    }

    public boolean H(boolean z4) {
        if (!M()) {
            return false;
        }
        if (z4 == o(!z4)) {
            return true;
        }
        r();
        Throwable th = null;
        th.getClass();
        throw th;
    }

    public boolean I(int i4) {
        if (!M()) {
            return false;
        }
        if (i4 == p(~i4)) {
            return true;
        }
        r();
        Throwable th = null;
        th.getClass();
        throw th;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Throwable, java.lang.Object, java.lang.String] */
    public boolean J(String str) {
        if (!M()) {
            return false;
        }
        ? r02 = 0;
        if (TextUtils.equals(str, q(r02))) {
            return true;
        }
        r();
        r02.getClass();
        throw r02;
    }

    public final void K(b bVar) {
        this.f5475F = bVar;
        z();
    }

    public boolean L() {
        return !x();
    }

    public boolean M() {
        return false;
    }

    public boolean b(Object obj) {
        return true;
    }

    /* renamed from: f */
    public int compareTo(Preference preference) {
        int i4 = this.f5478f;
        int i5 = preference.f5478f;
        if (i4 != i5) {
            return i4 - i5;
        }
        CharSequence charSequence = this.f5480h;
        CharSequence charSequence2 = preference.f5480h;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f5480h.toString());
    }

    public Context k() {
        return this.f5477e;
    }

    public StringBuilder l() {
        StringBuilder sb = new StringBuilder();
        CharSequence v4 = v();
        if (!TextUtils.isEmpty(v4)) {
            sb.append(v4);
            sb.append(' ');
        }
        CharSequence t4 = t();
        if (!TextUtils.isEmpty(t4)) {
            sb.append(t4);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String m() {
        return this.f5485m;
    }

    public Intent n() {
        return this.f5484l;
    }

    public boolean o(boolean z4) {
        if (!M()) {
            return z4;
        }
        r();
        Throwable th = null;
        th.getClass();
        throw th;
    }

    public int p(int i4) {
        if (!M()) {
            return i4;
        }
        r();
        Throwable th = null;
        th.getClass();
        throw th;
    }

    public String q(String str) {
        if (!M()) {
            return str;
        }
        r();
        Throwable th = null;
        th.getClass();
        throw th;
    }

    public C0885a r() {
        return null;
    }

    public C0886b s() {
        return null;
    }

    public CharSequence t() {
        return u() != null ? u().a(this) : this.f5481i;
    }

    public String toString() {
        return l().toString();
    }

    public final b u() {
        return this.f5475F;
    }

    public CharSequence v() {
        return this.f5480h;
    }

    public boolean w() {
        return !TextUtils.isEmpty(this.f5483k);
    }

    public boolean x() {
        return this.f5486n && this.f5491s && this.f5492t;
    }

    public boolean y() {
        return this.f5487o;
    }

    public void z() {
    }

    public Preference(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a(context, C0887c.f11761g, 16842894));
    }
}
