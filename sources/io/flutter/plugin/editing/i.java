package io.flutter.plugin.editing;

import X2.x;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;

public class i extends SpannableStringBuilder {

    /* renamed from: e  reason: collision with root package name */
    public int f10438e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f10439f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList f10440g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f10441h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f10442i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public String f10443j;

    /* renamed from: k  reason: collision with root package name */
    public String f10444k;

    /* renamed from: l  reason: collision with root package name */
    public int f10445l;

    /* renamed from: m  reason: collision with root package name */
    public int f10446m;

    /* renamed from: n  reason: collision with root package name */
    public int f10447n;

    /* renamed from: o  reason: collision with root package name */
    public int f10448o;

    /* renamed from: p  reason: collision with root package name */
    public BaseInputConnection f10449p;

    public class a extends BaseInputConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Editable f10450a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view, boolean z4, Editable editable) {
            super(view, z4);
            this.f10450a = editable;
        }

        public Editable getEditable() {
            return this.f10450a;
        }
    }

    public interface b {
        void a(boolean z4, boolean z5, boolean z6);
    }

    public i(x.e eVar, View view) {
        this.f10449p = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    public void a(b bVar) {
        if (this.f10439f > 0) {
            M2.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f10438e > 0) {
            M2.b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            this.f10441h.add(bVar);
            return;
        }
        this.f10440g.add(bVar);
    }

    public void b() {
        this.f10438e++;
        if (this.f10439f > 0) {
            M2.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f10438e == 1 && !this.f10440g.isEmpty()) {
            this.f10444k = toString();
            this.f10445l = i();
            this.f10446m = h();
            this.f10447n = g();
            this.f10448o = f();
        }
    }

    public void c() {
        this.f10442i.clear();
    }

    public void d() {
        int i4 = this.f10438e;
        if (i4 == 0) {
            M2.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i4 == 1) {
            Iterator it = this.f10441h.iterator();
            while (it.hasNext()) {
                j((b) it.next(), true, true, true);
            }
            if (!this.f10440g.isEmpty()) {
                M2.b.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f10440g.size()) + " listener(s)");
                boolean equals = toString().equals(this.f10444k) ^ true;
                boolean z4 = false;
                boolean z5 = (this.f10445l == i() && this.f10446m == h()) ? false : true;
                if (!(this.f10447n == g() && this.f10448o == f())) {
                    z4 = true;
                }
                k(equals, z5, z4);
            }
        }
        this.f10440g.addAll(this.f10441h);
        this.f10441h.clear();
        this.f10438e--;
    }

    public ArrayList e() {
        ArrayList arrayList = new ArrayList(this.f10442i);
        this.f10442i.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public final void j(b bVar, boolean z4, boolean z5, boolean z6) {
        this.f10439f++;
        bVar.a(z4, z5, z6);
        this.f10439f--;
    }

    public final void k(boolean z4, boolean z5, boolean z6) {
        if (z4 || z5 || z6) {
            Iterator it = this.f10440g.iterator();
            while (it.hasNext()) {
                j((b) it.next(), z4, z5, z6);
            }
        }
    }

    public void l(b bVar) {
        if (this.f10439f > 0) {
            M2.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f10440g.remove(bVar);
        if (this.f10438e > 0) {
            this.f10441h.remove(bVar);
        }
    }

    public void m(int i4, int i5) {
        if (i4 < 0 || i4 >= i5) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f10449p.setComposingRegion(i4, i5);
        }
    }

    public void n(x.e eVar) {
        b();
        replace(0, length(), eVar.f3688a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f3689b, eVar.f3690c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f3691d, eVar.f3692e);
        c();
        d();
    }

    public void setSpan(Object obj, int i4, int i5, int i6) {
        super.setSpan(obj, i4, i5, i6);
        this.f10442i.add(new o(toString(), i(), h(), g(), f()));
    }

    public String toString() {
        String str = this.f10443j;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f10443j = spannableStringBuilder;
        return spannableStringBuilder;
    }

    public SpannableStringBuilder replace(int i4, int i5, CharSequence charSequence, int i6, int i7) {
        boolean z4;
        boolean z5;
        if (this.f10439f > 0) {
            M2.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String iVar = toString();
        int i8 = i5 - i4;
        boolean z6 = i8 != i7 - i6;
        for (int i9 = 0; i9 < i8 && !z6; i9++) {
            z6 |= charAt(i4 + i9) != charSequence.charAt(i6 + i9);
        }
        CharSequence charSequence2 = charSequence;
        if (z6) {
            this.f10443j = null;
        }
        int i10 = i();
        int h4 = h();
        int g4 = g();
        int f4 = f();
        SpannableStringBuilder replace = super.replace(i4, i5, charSequence, i6, i7);
        o oVar = r1;
        boolean z7 = z6;
        int i11 = f4;
        o oVar2 = new o(iVar, i4, i5, charSequence, i(), h(), g(), f());
        this.f10442i.add(oVar);
        if (this.f10438e > 0) {
            return replace;
        }
        boolean z8 = (i() == i10 && h() == h4) ? false : true;
        if (g() == g4 && f() == i11) {
            z4 = z7;
            z5 = false;
        } else {
            z4 = z7;
            z5 = true;
        }
        k(z4, z8, z5);
        return replace;
    }
}
