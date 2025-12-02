package io.flutter.plugin.editing;

import N2.E;
import X2.t;
import X2.x;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.plugin.editing.i;
import java.util.HashMap;

public class p implements i.b {

    /* renamed from: a  reason: collision with root package name */
    public final View f10467a;

    /* renamed from: b  reason: collision with root package name */
    public final InputMethodManager f10468b;

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f10469c;

    /* renamed from: d  reason: collision with root package name */
    public final t f10470d;

    /* renamed from: e  reason: collision with root package name */
    public final x f10471e;

    /* renamed from: f  reason: collision with root package name */
    public c f10472f = new c(c.a.NO_TARGET, 0);

    /* renamed from: g  reason: collision with root package name */
    public x.b f10473g;

    /* renamed from: h  reason: collision with root package name */
    public SparseArray f10474h;

    /* renamed from: i  reason: collision with root package name */
    public i f10475i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f10476j;

    /* renamed from: k  reason: collision with root package name */
    public InputConnection f10477k;

    /* renamed from: l  reason: collision with root package name */
    public io.flutter.plugin.platform.t f10478l;

    /* renamed from: m  reason: collision with root package name */
    public Rect f10479m;

    /* renamed from: n  reason: collision with root package name */
    public ImeSyncDeferringInsetsCallback f10480n;

    /* renamed from: o  reason: collision with root package name */
    public x.e f10481o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10482p;

    public class a implements x.f {
        public a() {
        }

        public void a() {
            p pVar = p.this;
            pVar.E(pVar.f10467a);
        }

        public void b() {
            p.this.l();
        }

        public void c(String str, Bundle bundle) {
            p.this.A(str, bundle);
        }

        public void d(int i4, boolean z4) {
            p.this.B(i4, z4);
        }

        public void e(double d4, double d5, double[] dArr) {
            p.this.z(d4, d5, dArr);
        }

        public void f() {
            p.this.w();
        }

        public void g(x.e eVar) {
            p pVar = p.this;
            pVar.D(pVar.f10467a, eVar);
        }

        public void h(int i4, x.b bVar) {
            p.this.C(i4, bVar);
        }

        public void i(boolean z4) {
            if (p.this.f10469c != null) {
                if (z4) {
                    p.this.f10469c.commit();
                } else {
                    p.this.f10469c.cancel();
                }
            }
        }

        public void j() {
            if (p.this.f10472f.f10488a == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
                p.this.x();
                return;
            }
            p pVar = p.this;
            pVar.r(pVar.f10467a);
        }
    }

    public class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f10484a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ double[] f10485b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ double[] f10486c;

        public b(boolean z4, double[] dArr, double[] dArr2) {
            this.f10484a = z4;
            this.f10485b = dArr;
            this.f10486c = dArr2;
        }

        public void a(double d4, double d5) {
            double d6 = 1.0d;
            if (!this.f10484a) {
                double[] dArr = this.f10485b;
                d6 = 1.0d / (((dArr[3] * d4) + (dArr[7] * d5)) + dArr[15]);
            }
            double[] dArr2 = this.f10485b;
            double d7 = ((dArr2[0] * d4) + (dArr2[4] * d5) + dArr2[12]) * d6;
            double d8 = ((dArr2[1] * d4) + (dArr2[5] * d5) + dArr2[13]) * d6;
            double[] dArr3 = this.f10486c;
            if (d7 < dArr3[0]) {
                dArr3[0] = d7;
            } else if (d7 > dArr3[1]) {
                dArr3[1] = d7;
            }
            if (d8 < dArr3[2]) {
                dArr3[2] = d8;
            } else if (d8 > dArr3[3]) {
                dArr3[3] = d8;
            }
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public a f10488a;

        /* renamed from: b  reason: collision with root package name */
        public int f10489b;

        public enum a {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            VIRTUAL_DISPLAY_PLATFORM_VIEW,
            PHYSICAL_DISPLAY_PLATFORM_VIEW
        }

        public c(a aVar, int i4) {
            this.f10488a = aVar;
            this.f10489b = i4;
        }
    }

    public interface d {
        void a(double d4, double d5);
    }

    public p(View view, x xVar, t tVar, io.flutter.plugin.platform.t tVar2) {
        this.f10467a = view;
        this.f10475i = new i((x.e) null, view);
        this.f10468b = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i4 = Build.VERSION.SDK_INT;
        this.f10469c = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (i4 >= 30) {
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view);
            this.f10480n = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.f10471e = xVar;
        xVar.n(new a());
        xVar.k();
        this.f10470d = tVar;
        this.f10478l = tVar2;
        tVar2.D(this);
    }

    public static boolean m(x.e eVar, x.e eVar2) {
        int i4 = eVar.f3692e - eVar.f3691d;
        if (i4 != eVar2.f3692e - eVar2.f3691d) {
            return true;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (eVar.f3688a.charAt(eVar.f3691d + i5) != eVar2.f3688a.charAt(eVar2.f3691d + i5)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int s(X2.x.c r1, boolean r2, boolean r3, boolean r4, boolean r5, X2.x.d r6) {
        /*
            X2.x$g r5 = r1.f3679a
            X2.x$g r0 = X2.x.g.DATETIME
            if (r5 != r0) goto L_0x0008
            r1 = 4
            return r1
        L_0x0008:
            X2.x$g r0 = X2.x.g.NUMBER
            if (r5 != r0) goto L_0x001b
            boolean r2 = r1.f3680b
            if (r2 == 0) goto L_0x0013
            r2 = 4098(0x1002, float:5.743E-42)
            goto L_0x0014
        L_0x0013:
            r2 = 2
        L_0x0014:
            boolean r1 = r1.f3681c
            if (r1 == 0) goto L_0x001a
            r2 = r2 | 8192(0x2000, float:1.14794E-41)
        L_0x001a:
            return r2
        L_0x001b:
            X2.x$g r1 = X2.x.g.PHONE
            if (r5 != r1) goto L_0x0021
            r1 = 3
            return r1
        L_0x0021:
            X2.x$g r1 = X2.x.g.NONE
            if (r5 != r1) goto L_0x0027
            r1 = 0
            return r1
        L_0x0027:
            X2.x$g r1 = X2.x.g.MULTILINE
            if (r5 != r1) goto L_0x002f
            r1 = 131073(0x20001, float:1.83672E-40)
            goto L_0x005d
        L_0x002f:
            X2.x$g r1 = X2.x.g.EMAIL_ADDRESS
            if (r5 == r1) goto L_0x005b
            X2.x$g r1 = X2.x.g.TWITTER
            if (r5 != r1) goto L_0x0038
            goto L_0x005b
        L_0x0038:
            X2.x$g r1 = X2.x.g.URL
            if (r5 == r1) goto L_0x0058
            X2.x$g r1 = X2.x.g.WEB_SEARCH
            if (r5 != r1) goto L_0x0041
            goto L_0x0058
        L_0x0041:
            X2.x$g r1 = X2.x.g.VISIBLE_PASSWORD
            if (r5 != r1) goto L_0x0048
            r1 = 145(0x91, float:2.03E-43)
            goto L_0x005d
        L_0x0048:
            X2.x$g r1 = X2.x.g.NAME
            if (r5 != r1) goto L_0x004f
            r1 = 97
            goto L_0x005d
        L_0x004f:
            X2.x$g r1 = X2.x.g.POSTAL_ADDRESS
            if (r5 != r1) goto L_0x0056
            r1 = 113(0x71, float:1.58E-43)
            goto L_0x005d
        L_0x0056:
            r1 = 1
            goto L_0x005d
        L_0x0058:
            r1 = 17
            goto L_0x005d
        L_0x005b:
            r1 = 33
        L_0x005d:
            if (r2 == 0) goto L_0x0064
            r2 = 524416(0x80080, float:7.34863E-40)
        L_0x0062:
            r1 = r1 | r2
            goto L_0x0070
        L_0x0064:
            if (r3 == 0) goto L_0x006a
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
        L_0x006a:
            if (r4 != 0) goto L_0x0070
            r2 = 524432(0x80090, float:7.34886E-40)
            goto L_0x0062
        L_0x0070:
            X2.x$d r2 = X2.x.d.CHARACTERS
            if (r6 != r2) goto L_0x0077
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            goto L_0x0084
        L_0x0077:
            X2.x$d r2 = X2.x.d.WORDS
            if (r6 != r2) goto L_0x007e
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            goto L_0x0084
        L_0x007e:
            X2.x$d r2 = X2.x.d.SENTENCES
            if (r6 != r2) goto L_0x0084
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.p.s(X2.x$c, boolean, boolean, boolean, boolean, X2.x$d):int");
    }

    public void A(String str, Bundle bundle) {
        this.f10468b.sendAppPrivateCommand(this.f10467a, str, bundle);
    }

    public final void B(int i4, boolean z4) {
        if (z4) {
            this.f10467a.requestFocus();
            this.f10472f = new c(c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW, i4);
            this.f10468b.restartInput(this.f10467a);
            this.f10476j = false;
            return;
        }
        this.f10472f = new c(c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW, i4);
        this.f10477k = null;
    }

    public void C(int i4, x.b bVar) {
        x();
        this.f10473g = bVar;
        this.f10472f = new c(c.a.FRAMEWORK_CLIENT, i4);
        this.f10475i.l(this);
        x.b.a aVar = bVar.f3672j;
        this.f10475i = new i(aVar != null ? aVar.f3677c : null, this.f10467a);
        G(bVar);
        this.f10476j = true;
        F();
        this.f10479m = null;
        this.f10475i.a(this);
    }

    public void D(View view, x.e eVar) {
        x.e eVar2;
        if (!this.f10476j && (eVar2 = this.f10481o) != null && eVar2.b()) {
            boolean m4 = m(this.f10481o, eVar);
            this.f10476j = m4;
            if (m4) {
                M2.b.e("TextInputPlugin", "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.f10481o = eVar;
        this.f10475i.n(eVar);
        if (this.f10476j) {
            this.f10468b.restartInput(view);
            this.f10476j = false;
        }
    }

    public void E(View view) {
        x.c cVar;
        x.b bVar = this.f10473g;
        if (bVar == null || (cVar = bVar.f3669g) == null || cVar.f3679a != x.g.NONE) {
            view.requestFocus();
            this.f10468b.showSoftInput(view, 0);
            return;
        }
        r(view);
    }

    public void F() {
        if (this.f10472f.f10488a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f10482p = false;
        }
    }

    public final void G(x.b bVar) {
        if (bVar == null || bVar.f3672j == null) {
            this.f10474h = null;
            return;
        }
        x.b[] bVarArr = bVar.f3674l;
        SparseArray sparseArray = new SparseArray();
        this.f10474h = sparseArray;
        if (bVarArr == null) {
            sparseArray.put(bVar.f3672j.f3675a.hashCode(), bVar);
            return;
        }
        for (x.b bVar2 : bVarArr) {
            x.b.a aVar = bVar2.f3672j;
            if (aVar != null) {
                this.f10474h.put(aVar.f3675a.hashCode(), bVar2);
                this.f10469c.notifyValueChanged(this.f10467a, aVar.f3675a.hashCode(), AutofillValue.forText(aVar.f3677c.f3688a));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r7 == r1.f3692e) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x000b
            io.flutter.plugin.editing.i r9 = r8.f10475i
            java.lang.String r9 = r9.toString()
            r8.v(r9)
        L_0x000b:
            io.flutter.plugin.editing.i r9 = r8.f10475i
            int r9 = r9.i()
            io.flutter.plugin.editing.i r10 = r8.f10475i
            int r10 = r10.h()
            io.flutter.plugin.editing.i r11 = r8.f10475i
            int r11 = r11.g()
            io.flutter.plugin.editing.i r0 = r8.f10475i
            int r7 = r0.f()
            io.flutter.plugin.editing.i r0 = r8.f10475i
            java.util.ArrayList r0 = r0.e()
            X2.x$e r1 = r8.f10481o
            if (r1 == 0) goto L_0x00a7
            io.flutter.plugin.editing.i r1 = r8.f10475i
            java.lang.String r1 = r1.toString()
            X2.x$e r2 = r8.f10481o
            java.lang.String r2 = r2.f3688a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0050
            X2.x$e r1 = r8.f10481o
            int r2 = r1.f3689b
            if (r9 != r2) goto L_0x0050
            int r2 = r1.f3690c
            if (r10 != r2) goto L_0x0050
            int r2 = r1.f3691d
            if (r11 != r2) goto L_0x0050
            int r1 = r1.f3692e
            if (r7 != r1) goto L_0x0050
            goto L_0x00a7
        L_0x0050:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.i r2 = r8.f10475i
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            M2.b.f(r2, r1)
            X2.x$b r1 = r8.f10473g
            boolean r1 = r1.f3667e
            if (r1 == 0) goto L_0x0081
            X2.x r1 = r8.f10471e
            io.flutter.plugin.editing.p$c r2 = r8.f10472f
            int r2 = r2.f10489b
            r1.q(r2, r0)
            io.flutter.plugin.editing.i r0 = r8.f10475i
            r0.c()
            goto L_0x0094
        L_0x0081:
            X2.x r0 = r8.f10471e
            io.flutter.plugin.editing.p$c r1 = r8.f10472f
            int r1 = r1.f10489b
            io.flutter.plugin.editing.i r2 = r8.f10475i
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.p(r1, r2, r3, r4, r5, r6)
        L_0x0094:
            X2.x$e r6 = new X2.x$e
            io.flutter.plugin.editing.i r0 = r8.f10475i
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.f10481o = r6
            goto L_0x00ac
        L_0x00a7:
            io.flutter.plugin.editing.i r9 = r8.f10475i
            r9.c()
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.editing.p.a(boolean, boolean, boolean):void");
    }

    public void j(SparseArray sparseArray) {
        x.b.a aVar;
        x.b.a aVar2;
        x.b bVar = this.f10473g;
        if (bVar != null && this.f10474h != null && (aVar = bVar.f3672j) != null) {
            HashMap hashMap = new HashMap();
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                x.b bVar2 = (x.b) this.f10474h.get(sparseArray.keyAt(i4));
                if (!(bVar2 == null || (aVar2 = bVar2.f3672j) == null)) {
                    String charSequence = ((AutofillValue) sparseArray.valueAt(i4)).getTextValue().toString();
                    x.e eVar = new x.e(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    if (aVar2.f3675a.equals(aVar.f3675a)) {
                        this.f10475i.n(eVar);
                    } else {
                        hashMap.put(aVar2.f3675a, eVar);
                    }
                }
            }
            this.f10471e.r(this.f10472f.f10489b, hashMap);
        }
    }

    public void k(int i4) {
        c cVar = this.f10472f;
        c.a aVar = cVar.f10488a;
        if ((aVar == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW || aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) && cVar.f10489b == i4) {
            this.f10472f = new c(c.a.NO_TARGET, 0);
            x();
            this.f10468b.hideSoftInputFromWindow(this.f10467a.getApplicationWindowToken(), 0);
            this.f10468b.restartInput(this.f10467a);
            this.f10476j = false;
        }
    }

    public void l() {
        if (this.f10472f.f10488a != c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f10475i.l(this);
            x();
            this.f10473g = null;
            G((x.b) null);
            this.f10472f = new c(c.a.NO_TARGET, 0);
            F();
            this.f10479m = null;
        }
    }

    public InputConnection n(View view, E e4, EditorInfo editorInfo) {
        c cVar = this.f10472f;
        c.a aVar = cVar.f10488a;
        if (aVar == c.a.NO_TARGET) {
            this.f10477k = null;
            return null;
        } else if (aVar == c.a.PHYSICAL_DISPLAY_PLATFORM_VIEW) {
            return null;
        } else {
            if (aVar != c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
                x.b bVar = this.f10473g;
                int s4 = s(bVar.f3669g, bVar.f3663a, bVar.f3664b, bVar.f3665c, bVar.f3666d, bVar.f3668f);
                editorInfo.inputType = s4;
                editorInfo.imeOptions = 33554432;
                int i4 = Build.VERSION.SDK_INT;
                x.b bVar2 = this.f10473g;
                if (!bVar2.f3666d) {
                    editorInfo.imeOptions = 33554432 | 16777216;
                }
                Integer num = bVar2.f3670h;
                int intValue = num == null ? (s4 & 131072) != 0 ? 1 : 6 : num.intValue();
                x.b bVar3 = this.f10473g;
                String str = bVar3.f3671i;
                if (str != null) {
                    editorInfo.actionLabel = str;
                    editorInfo.actionId = intValue;
                }
                editorInfo.imeOptions = intValue | editorInfo.imeOptions;
                String[] strArr = bVar3.f3673k;
                if (strArr != null) {
                    W.a.a(editorInfo, strArr);
                }
                if (i4 >= 34) {
                    W.a.b(editorInfo, true);
                }
                h hVar = new h(view, this.f10472f.f10489b, this.f10471e, this.f10470d, e4, this.f10475i, editorInfo);
                editorInfo.initialSelStart = this.f10475i.i();
                editorInfo.initialSelEnd = this.f10475i.h();
                this.f10477k = hVar;
                return hVar;
            } else if (this.f10482p) {
                return this.f10477k;
            } else {
                InputConnection onCreateInputConnection = this.f10478l.c(cVar.f10489b).onCreateInputConnection(editorInfo);
                this.f10477k = onCreateInputConnection;
                return onCreateInputConnection;
            }
        }
    }

    public void o() {
        this.f10478l.Q();
        this.f10471e.n((x.f) null);
        x();
        this.f10475i.l(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.f10480n;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    public InputMethodManager p() {
        return this.f10468b;
    }

    public boolean q(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!p().isAcceptingText() || (inputConnection = this.f10477k) == null) {
            return false;
        }
        return inputConnection instanceof h ? ((h) inputConnection).f(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public final void r(View view) {
        x();
        this.f10468b.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    public void t() {
        if (this.f10472f.f10488a == c.a.VIRTUAL_DISPLAY_PLATFORM_VIEW) {
            this.f10482p = true;
        }
    }

    public final boolean u() {
        return this.f10474h != null;
    }

    public final void v(String str) {
        if (this.f10469c != null && u()) {
            this.f10469c.notifyValueChanged(this.f10467a, this.f10473g.f3672j.f3675a.hashCode(), AutofillValue.forText(str));
        }
    }

    public final void w() {
        if (this.f10469c != null && u()) {
            String str = this.f10473g.f3672j.f3675a;
            int[] iArr = new int[2];
            this.f10467a.getLocationOnScreen(iArr);
            Rect rect = new Rect(this.f10479m);
            rect.offset(iArr[0], iArr[1]);
            this.f10469c.notifyViewEntered(this.f10467a, str.hashCode(), rect);
        }
    }

    public final void x() {
        x.b bVar;
        if (this.f10469c != null && (bVar = this.f10473g) != null && bVar.f3672j != null && u()) {
            this.f10469c.notifyViewExited(this.f10467a, this.f10473g.f3672j.f3675a.hashCode());
        }
    }

    public void y(ViewStructure viewStructure, int i4) {
        Rect rect;
        ViewStructure viewStructure2 = viewStructure;
        if (u()) {
            String str = this.f10473g.f3672j.f3675a;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i5 = 0; i5 < this.f10474h.size(); i5++) {
                int keyAt = this.f10474h.keyAt(i5);
                x.b.a aVar = ((x.b) this.f10474h.valueAt(i5)).f3672j;
                if (aVar != null) {
                    viewStructure2.addChildCount(1);
                    ViewStructure newChild = viewStructure2.newChild(i5);
                    newChild.setAutofillId(autofillId, keyAt);
                    String[] strArr = aVar.f3676b;
                    if (strArr.length > 0) {
                        newChild.setAutofillHints(strArr);
                    }
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = aVar.f3678d;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = this.f10479m) == null) {
                        ViewStructure viewStructure3 = newChild;
                        viewStructure3.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructure3.setAutofillValue(AutofillValue.forText(aVar.f3677c.f3688a));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.f10479m.height());
                        newChild.setAutofillValue(AutofillValue.forText(this.f10475i));
                    }
                }
            }
        }
    }

    public final void z(double d4, double d5, double[] dArr) {
        double d6 = d4;
        double d7 = d5;
        double[] dArr2 = dArr;
        double[] dArr3 = new double[4];
        boolean z4 = dArr2[3] == 0.0d && dArr2[7] == 0.0d && dArr2[15] == 1.0d;
        double d8 = dArr2[12];
        double d9 = dArr2[15];
        double d10 = d8 / d9;
        dArr3[1] = d10;
        dArr3[0] = d10;
        double d11 = dArr2[13] / d9;
        dArr3[3] = d11;
        dArr3[2] = d11;
        b bVar = new b(z4, dArr2, dArr3);
        bVar.a(d6, 0.0d);
        bVar.a(d6, d7);
        bVar.a(0.0d, d7);
        double d12 = (double) this.f10467a.getContext().getResources().getDisplayMetrics().density;
        this.f10479m = new Rect((int) (dArr3[0] * d12), (int) (dArr3[2] * d12), (int) Math.ceil(dArr3[1] * d12), (int) Math.ceil(dArr3[3] * d12));
    }
}
