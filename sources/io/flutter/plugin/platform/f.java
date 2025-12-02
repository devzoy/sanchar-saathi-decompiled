package io.flutter.plugin.platform;

import S.m0;
import X2.o;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.Window;
import d.s;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f10538a;

    /* renamed from: b  reason: collision with root package name */
    public final o f10539b;

    /* renamed from: c  reason: collision with root package name */
    public final d f10540c;

    /* renamed from: d  reason: collision with root package name */
    public o.j f10541d;

    /* renamed from: e  reason: collision with root package name */
    public int f10542e = 1280;

    /* renamed from: f  reason: collision with root package name */
    public final o.h f10543f;

    public class a implements o.h {
        public a() {
        }

        public void c() {
            f.this.t();
        }

        public void h(boolean z4) {
            f.this.w(z4);
        }

        public CharSequence i(o.e eVar) {
            return f.this.r(eVar);
        }

        public void j(o.c cVar) {
            f.this.x(cVar);
        }

        public void k(List list) {
            f.this.A(list);
        }

        public void l(o.g gVar) {
            f.this.F(gVar);
        }

        public void m() {
            f.this.y();
        }

        public void n(o.i iVar) {
            f.this.s(iVar);
        }

        public void o() {
            f.this.u();
        }

        public void p(String str) {
            f.this.v(str);
        }

        public void q(o.j jVar) {
            f.this.C(jVar);
        }

        public void r(int i4) {
            f.this.B(i4);
        }

        public void s(String str) {
            f.this.D(str);
        }

        public boolean t() {
            return f.this.p();
        }

        public void u(o.k kVar) {
            f.this.z(kVar);
        }
    }

    public class b implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f10545a;

        public b(View view) {
            this.f10545a = view;
        }

        public final /* synthetic */ void b(int i4) {
            if ((i4 & 4) == 0) {
                f.this.f10539b.m(true);
            } else {
                f.this.f10539b.m(false);
            }
        }

        public void onSystemUiVisibilityChange(int i4) {
            this.f10545a.post(new g(this, i4));
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10547a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f10548b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f10549c;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0069 */
        static {
            /*
                X2.o$d[] r0 = X2.o.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10549c = r0
                r1 = 1
                X2.o$d r2 = X2.o.d.DARK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f10549c     // Catch:{ NoSuchFieldError -> 0x001d }
                X2.o$d r3 = X2.o.d.LIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                X2.o$l[] r2 = X2.o.l.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f10548b = r2
                X2.o$l r3 = X2.o.l.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f10548b     // Catch:{ NoSuchFieldError -> 0x0038 }
                X2.o$l r3 = X2.o.l.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                X2.o$g[] r2 = X2.o.g.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f10547a = r2
                X2.o$g r3 = X2.o.g.STANDARD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f10547a     // Catch:{ NoSuchFieldError -> 0x0053 }
                X2.o$g r2 = X2.o.g.LIGHT_IMPACT     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f10547a     // Catch:{ NoSuchFieldError -> 0x005e }
                X2.o$g r1 = X2.o.g.MEDIUM_IMPACT     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f10547a     // Catch:{ NoSuchFieldError -> 0x0069 }
                X2.o$g r1 = X2.o.g.HEAVY_IMPACT     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f10547a     // Catch:{ NoSuchFieldError -> 0x0074 }
                X2.o$g r1 = X2.o.g.SELECTION_CLICK     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.f.c.<clinit>():void");
        }
    }

    public interface d {
        boolean c();

        void h(boolean z4);
    }

    public f(Activity activity, o oVar, d dVar) {
        a aVar = new a();
        this.f10543f = aVar;
        this.f10538a = activity;
        this.f10539b = oVar;
        oVar.l(aVar);
        this.f10540c = dVar;
    }

    public final void A(List list) {
        int i4 = list.size() == 0 ? 5894 : 1798;
        for (int i5 = 0; i5 < list.size(); i5++) {
            int i6 = c.f10548b[((o.l) list.get(i5)).ordinal()];
            if (i6 == 1) {
                i4 &= -5;
            } else if (i6 == 2) {
                i4 &= -515;
            }
        }
        this.f10542e = i4;
        E();
    }

    public final void B(int i4) {
        this.f10538a.setRequestedOrientation(i4);
    }

    public final void C(o.j jVar) {
        Window window = this.f10538a.getWindow();
        m0 m0Var = new m0(window, window.getDecorView());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        o.d dVar = jVar.f3563b;
        if (dVar != null) {
            int i5 = c.f10549c[dVar.ordinal()];
            if (i5 == 1) {
                m0Var.b(true);
            } else if (i5 == 2) {
                m0Var.b(false);
            }
        }
        Integer num = jVar.f3562a;
        if (num != null) {
            window.setStatusBarColor(num.intValue());
        }
        Boolean bool = jVar.f3564c;
        if (bool != null && i4 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        o.d dVar2 = jVar.f3566e;
        if (dVar2 != null) {
            int i6 = c.f10549c[dVar2.ordinal()];
            if (i6 == 1) {
                m0Var.a(true);
            } else if (i6 == 2) {
                m0Var.a(false);
            }
        }
        Integer num2 = jVar.f3565d;
        if (num2 != null) {
            window.setNavigationBarColor(num2.intValue());
        }
        Integer num3 = jVar.f3567f;
        if (num3 != null) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f3568g;
        if (bool2 != null && i4 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f10541d = jVar;
    }

    public final void D(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        this.f10538a.startActivity(Intent.createChooser(intent, (CharSequence) null));
    }

    public void E() {
        this.f10538a.getWindow().getDecorView().setSystemUiVisibility(this.f10542e);
        o.j jVar = this.f10541d;
        if (jVar != null) {
            C(jVar);
        }
    }

    public void F(o.g gVar) {
        View decorView = this.f10538a.getWindow().getDecorView();
        int i4 = c.f10547a[gVar.ordinal()];
        if (i4 == 1) {
            decorView.performHapticFeedback(0);
        } else if (i4 == 2) {
            decorView.performHapticFeedback(1);
        } else if (i4 == 3) {
            decorView.performHapticFeedback(3);
        } else if (i4 == 4) {
            decorView.performHapticFeedback(6);
        } else if (i4 == 5) {
            decorView.performHapticFeedback(4);
        }
    }

    public final boolean p() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f10538a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    public void q() {
        this.f10539b.l((o.h) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        M2.b.g("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
        M2.b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0090, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x0023 }, ExcHandler: SecurityException (r7v3 'e' java.lang.SecurityException A[CUSTOM_DECLARE, Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x0023 }]), Splitter:B:3:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:3:0x0014] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence r(X2.o.e r7) {
        /*
            r6 = this;
            java.lang.String r0 = "PlatformPlugin"
            android.app.Activity r1 = r6.f10538a
            java.lang.String r2 = "clipboard"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            boolean r2 = r1.hasPrimaryClip()
            r3 = 0
            if (r2 != 0) goto L_0x0014
            return r3
        L_0x0014:
            android.content.ClipData r1 = r1.getPrimaryClip()     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x0023 }
            if (r1 != 0) goto L_0x001b
            return r3
        L_0x001b:
            if (r7 == 0) goto L_0x0027
            X2.o$e r2 = X2.o.e.PLAIN_TEXT     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x0023 }
            if (r7 != r2) goto L_0x0022
            goto L_0x0027
        L_0x0022:
            return r3
        L_0x0023:
            r7 = move-exception
            goto L_0x007f
        L_0x0025:
            r7 = move-exception
            goto L_0x008b
        L_0x0027:
            r7 = 0
            android.content.ClipData$Item r7 = r1.getItemAt(r7)     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x0023 }
            java.lang.CharSequence r1 = r7.getText()     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x0023 }
            if (r1 != 0) goto L_0x007e
            android.net.Uri r2 = r7.getUri()     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            if (r2 != 0) goto L_0x0041
            java.lang.String r7 = "Clipboard item contained no textual content nor a URI to retrieve it from."
            M2.b.g(r0, r7)     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            return r3
        L_0x003e:
            r7 = move-exception
            r3 = r1
            goto L_0x007f
        L_0x0041:
            java.lang.String r4 = r2.getScheme()     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            java.lang.String r5 = "content"
            boolean r5 = r4.equals(r5)     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            if (r5 != 0) goto L_0x0067
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            r7.<init>()     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            java.lang.String r2 = "Clipboard item contains a Uri with scheme '"
            r7.append(r2)     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            r7.append(r4)     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            java.lang.String r2 = "'that is unhandled."
            r7.append(r2)     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            java.lang.String r7 = r7.toString()     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            M2.b.g(r0, r7)     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            return r3
        L_0x0067:
            android.app.Activity r4 = r6.f10538a     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            java.lang.String r5 = "text/*"
            android.content.res.AssetFileDescriptor r2 = r4.openTypedAssetFileDescriptor(r2, r5, r3)     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            android.app.Activity r4 = r6.f10538a     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            java.lang.CharSequence r1 = r7.coerceToText(r4)     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
            if (r2 == 0) goto L_0x007e
            r2.close()     // Catch:{ SecurityException -> 0x0025, FileNotFoundException -> 0x0085, IOException -> 0x003e }
        L_0x007e:
            return r1
        L_0x007f:
            java.lang.String r1 = "Failed to close AssetFileDescriptor while trying to read text from URI."
            M2.b.h(r0, r1, r7)
            return r3
        L_0x0085:
            java.lang.String r7 = "Clipboard text was unable to be received from content URI."
            M2.b.g(r0, r7)
            return r3
        L_0x008b:
            java.lang.String r1 = "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview"
            M2.b.h(r0, r1, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.platform.f.r(X2.o$e):java.lang.CharSequence");
    }

    public final void s(o.i iVar) {
        if (iVar == o.i.CLICK) {
            this.f10538a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    public final void t() {
        d dVar = this.f10540c;
        if (dVar == null || !dVar.c()) {
            Activity activity = this.f10538a;
            if (activity instanceof s) {
                ((s) activity).k().k();
            } else {
                activity.finish();
            }
        }
    }

    public final void u() {
        E();
    }

    public final void v(String str) {
        ((ClipboardManager) this.f10538a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    public final void w(boolean z4) {
        d dVar = this.f10540c;
        if (dVar != null) {
            dVar.h(z4);
        }
    }

    public final void x(o.c cVar) {
        this.f10538a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f3537b, 0, cVar.f3536a));
    }

    public final void y() {
        View decorView = this.f10538a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    public final void z(o.k kVar) {
        int i4;
        if (kVar == o.k.LEAN_BACK) {
            i4 = 1798;
        } else if (kVar == o.k.IMMERSIVE) {
            i4 = 3846;
        } else if (kVar == o.k.IMMERSIVE_STICKY) {
            i4 = 5894;
        } else if (kVar == o.k.EDGE_TO_EDGE && Build.VERSION.SDK_INT >= 29) {
            i4 = 1792;
        } else {
            return;
        }
        this.f10542e = i4;
        E();
    }
}
