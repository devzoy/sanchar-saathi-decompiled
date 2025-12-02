package io.flutter.view;

import X2.a;
import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import g3.C0640d;
import g3.C0644h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sqlcipher.database.SQLiteDatabase;

public class d extends AccessibilityNodeProvider {

    /* renamed from: A  reason: collision with root package name */
    public static final int f10621A = (((((((((((i.HAS_CHECKED_STATE.f10726e | i.IS_CHECKED.f10726e) | i.IS_SELECTED.f10726e) | i.IS_TEXT_FIELD.f10726e) | i.IS_FOCUSED.f10726e) | i.HAS_ENABLED_STATE.f10726e) | i.IS_ENABLED.f10726e) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f10726e) | i.HAS_TOGGLED_STATE.f10726e) | i.IS_TOGGLED.f10726e) | i.IS_FOCUSABLE.f10726e) | i.IS_SLIDER.f10726e);

    /* renamed from: B  reason: collision with root package name */
    public static int f10622B = 267386881;

    /* renamed from: C  reason: collision with root package name */
    public static int f10623C = ((g.DID_GAIN_ACCESSIBILITY_FOCUS.f10690e & g.DID_LOSE_ACCESSIBILITY_FOCUS.f10690e) & g.SHOW_ON_SCREEN.f10690e);

    /* renamed from: z  reason: collision with root package name */
    public static final int f10624z = (((g.SCROLL_RIGHT.f10690e | g.SCROLL_LEFT.f10690e) | g.SCROLL_UP.f10690e) | g.SCROLL_DOWN.f10690e);

    /* renamed from: a  reason: collision with root package name */
    public final View f10625a;

    /* renamed from: b  reason: collision with root package name */
    public final X2.a f10626b;

    /* renamed from: c  reason: collision with root package name */
    public final AccessibilityManager f10627c;

    /* renamed from: d  reason: collision with root package name */
    public final AccessibilityViewEmbedder f10628d;

    /* renamed from: e  reason: collision with root package name */
    public final io.flutter.plugin.platform.n f10629e;

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f10630f;

    /* renamed from: g  reason: collision with root package name */
    public final Map f10631g;

    /* renamed from: h  reason: collision with root package name */
    public final Map f10632h;

    /* renamed from: i  reason: collision with root package name */
    public l f10633i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f10634j;

    /* renamed from: k  reason: collision with root package name */
    public Integer f10635k;

    /* renamed from: l  reason: collision with root package name */
    public int f10636l;

    /* renamed from: m  reason: collision with root package name */
    public l f10637m;

    /* renamed from: n  reason: collision with root package name */
    public l f10638n;

    /* renamed from: o  reason: collision with root package name */
    public l f10639o;

    /* renamed from: p  reason: collision with root package name */
    public final List f10640p;

    /* renamed from: q  reason: collision with root package name */
    public int f10641q;

    /* renamed from: r  reason: collision with root package name */
    public Integer f10642r;

    /* renamed from: s  reason: collision with root package name */
    public k f10643s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f10644t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10645u;

    /* renamed from: v  reason: collision with root package name */
    public final a.b f10646v;

    /* renamed from: w  reason: collision with root package name */
    public final AccessibilityManager.AccessibilityStateChangeListener f10647w;

    /* renamed from: x  reason: collision with root package name */
    public final AccessibilityManager.TouchExplorationStateChangeListener f10648x;

    /* renamed from: y  reason: collision with root package name */
    public final ContentObserver f10649y;

    public class a implements a.b {
        public a() {
        }

        public void a(String str) {
            d.this.f10625a.announceForAccessibility(str);
        }

        public void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer order : byteBufferArr) {
                order.order(ByteOrder.LITTLE_ENDIAN);
            }
            d.this.b0(byteBuffer, strArr, byteBufferArr);
        }

        public void c(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            d.this.a0(byteBuffer, strArr);
        }

        public void d(String str) {
        }

        public void e(int i4) {
            d.this.R(i4, 8);
        }

        public void f(int i4) {
            d.this.R(i4, 2);
        }

        public void g(int i4) {
            d.this.R(i4, 1);
        }
    }

    public class b implements AccessibilityManager.AccessibilityStateChangeListener {
        public b() {
        }

        public void onAccessibilityStateChanged(boolean z4) {
            if (!d.this.f10645u) {
                if (z4) {
                    d.this.f10626b.g(d.this.f10646v);
                    d.this.f10626b.e();
                } else {
                    d.this.W(false);
                    d.this.f10626b.g((a.b) null);
                    d.this.f10626b.d();
                }
                if (d.this.f10643s != null) {
                    d.this.f10643s.a(z4, d.this.f10627c.isTouchExplorationEnabled());
                }
            }
        }
    }

    public class c extends ContentObserver {
        public c(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z4) {
            onChange(z4, (Uri) null);
        }

        public void onChange(boolean z4, Uri uri) {
            if (!d.this.f10645u) {
                if (Settings.Global.getFloat(d.this.f10630f, "transition_animation_scale", 1.0f) == 0.0f) {
                    d.f(d.this, f.DISABLE_ANIMATIONS.f10664e);
                } else {
                    d.e(d.this, ~f.DISABLE_ANIMATIONS.f10664e);
                }
                d.this.T();
            }
        }
    }

    /* renamed from: io.flutter.view.d$d  reason: collision with other inner class name */
    public class C0175d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AccessibilityManager f10653a;

        public C0175d(AccessibilityManager accessibilityManager) {
            this.f10653a = accessibilityManager;
        }

        public void onTouchExplorationStateChanged(boolean z4) {
            if (!d.this.f10645u) {
                if (!z4) {
                    d.this.W(false);
                    d.this.L();
                }
                if (d.this.f10643s != null) {
                    d.this.f10643s.a(this.f10653a.isEnabled(), z4);
                }
            }
        }
    }

    public static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10655a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                io.flutter.view.d$o[] r0 = io.flutter.view.d.o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10655a = r0
                io.flutter.view.d$o r1 = io.flutter.view.d.o.SPELLOUT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10655a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.view.d$o r1 = io.flutter.view.d.o.LOCALE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.d.e.<clinit>():void");
        }
    }

    public enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        

        /* renamed from: e  reason: collision with root package name */
        public final int f10664e;

        /* access modifiers changed from: public */
        f(int i4) {
            this.f10664e = i4;
        }
    }

    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152),
        FOCUS(4194304),
        SCROLL_TO_OFFSET(8388608);
        

        /* renamed from: e  reason: collision with root package name */
        public final int f10690e;

        /* access modifiers changed from: public */
        g(int i4) {
            this.f10690e = i4;
        }
    }

    public static class h {

        /* renamed from: a  reason: collision with root package name */
        public int f10691a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f10692b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f10693c = -1;

        /* renamed from: d  reason: collision with root package name */
        public String f10694d;

        /* renamed from: e  reason: collision with root package name */
        public String f10695e;
    }

    public enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432),
        HAS_EXPANDED_STATE(67108864),
        IS_EXPANDED(134217728),
        HAS_SELECTED_STATE(SQLiteDatabase.CREATE_IF_NECESSARY);
        

        /* renamed from: e  reason: collision with root package name */
        public final int f10726e;

        /* access modifiers changed from: public */
        i(int i4) {
            this.f10726e = i4;
        }
    }

    public static class j extends n {

        /* renamed from: d  reason: collision with root package name */
        public String f10727d;

        public j() {
            super((a) null);
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    public interface k {
        void a(boolean z4, boolean z5);
    }

    public static class l {

        /* renamed from: A  reason: collision with root package name */
        public int f10728A = -1;

        /* renamed from: B  reason: collision with root package name */
        public p f10729B;

        /* renamed from: C  reason: collision with root package name */
        public boolean f10730C = false;

        /* renamed from: D  reason: collision with root package name */
        public int f10731D;

        /* renamed from: E  reason: collision with root package name */
        public int f10732E;

        /* renamed from: F  reason: collision with root package name */
        public int f10733F;

        /* renamed from: G  reason: collision with root package name */
        public int f10734G;

        /* renamed from: H  reason: collision with root package name */
        public float f10735H;

        /* renamed from: I  reason: collision with root package name */
        public float f10736I;

        /* renamed from: J  reason: collision with root package name */
        public float f10737J;

        /* renamed from: K  reason: collision with root package name */
        public String f10738K;

        /* renamed from: L  reason: collision with root package name */
        public String f10739L;

        /* renamed from: M  reason: collision with root package name */
        public float f10740M;

        /* renamed from: N  reason: collision with root package name */
        public float f10741N;

        /* renamed from: O  reason: collision with root package name */
        public float f10742O;

        /* renamed from: P  reason: collision with root package name */
        public float f10743P;

        /* renamed from: Q  reason: collision with root package name */
        public float[] f10744Q;

        /* renamed from: R  reason: collision with root package name */
        public l f10745R;

        /* renamed from: S  reason: collision with root package name */
        public List f10746S = new ArrayList();

        /* renamed from: T  reason: collision with root package name */
        public List f10747T = new ArrayList();

        /* renamed from: U  reason: collision with root package name */
        public List f10748U;

        /* renamed from: V  reason: collision with root package name */
        public h f10749V;

        /* renamed from: W  reason: collision with root package name */
        public h f10750W;

        /* renamed from: X  reason: collision with root package name */
        public boolean f10751X = true;

        /* renamed from: Y  reason: collision with root package name */
        public float[] f10752Y;

        /* renamed from: Z  reason: collision with root package name */
        public boolean f10753Z = true;

        /* renamed from: a  reason: collision with root package name */
        public final d f10754a;

        /* renamed from: a0  reason: collision with root package name */
        public float[] f10755a0;

        /* renamed from: b  reason: collision with root package name */
        public int f10756b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public Rect f10757b0;

        /* renamed from: c  reason: collision with root package name */
        public int f10758c;

        /* renamed from: d  reason: collision with root package name */
        public int f10759d;

        /* renamed from: e  reason: collision with root package name */
        public int f10760e;

        /* renamed from: f  reason: collision with root package name */
        public int f10761f;

        /* renamed from: g  reason: collision with root package name */
        public int f10762g;

        /* renamed from: h  reason: collision with root package name */
        public int f10763h;

        /* renamed from: i  reason: collision with root package name */
        public int f10764i;

        /* renamed from: j  reason: collision with root package name */
        public int f10765j;

        /* renamed from: k  reason: collision with root package name */
        public int f10766k;

        /* renamed from: l  reason: collision with root package name */
        public float f10767l;

        /* renamed from: m  reason: collision with root package name */
        public float f10768m;

        /* renamed from: n  reason: collision with root package name */
        public float f10769n;

        /* renamed from: o  reason: collision with root package name */
        public String f10770o;

        /* renamed from: p  reason: collision with root package name */
        public String f10771p;

        /* renamed from: q  reason: collision with root package name */
        public List f10772q;

        /* renamed from: r  reason: collision with root package name */
        public String f10773r;

        /* renamed from: s  reason: collision with root package name */
        public List f10774s;

        /* renamed from: t  reason: collision with root package name */
        public String f10775t;

        /* renamed from: u  reason: collision with root package name */
        public List f10776u;

        /* renamed from: v  reason: collision with root package name */
        public String f10777v;

        /* renamed from: w  reason: collision with root package name */
        public List f10778w;

        /* renamed from: x  reason: collision with root package name */
        public String f10779x;

        /* renamed from: y  reason: collision with root package name */
        public List f10780y;

        /* renamed from: z  reason: collision with root package name */
        public String f10781z;

        public l(d dVar) {
            this.f10754a = dVar;
        }

        public static boolean C0(l lVar, C0640d dVar) {
            return (lVar == null || lVar.l0(dVar) == null) ? false : true;
        }

        public static /* synthetic */ int n(l lVar, int i4) {
            int i5 = lVar.f10763h + i4;
            lVar.f10763h = i5;
            return i5;
        }

        public static /* synthetic */ int o(l lVar, int i4) {
            int i5 = lVar.f10763h - i4;
            lVar.f10763h = i5;
            return i5;
        }

        public final float A0(float f4, float f5, float f6, float f7) {
            return Math.max(f4, Math.max(f5, Math.max(f6, f7)));
        }

        public final float B0(float f4, float f5, float f6, float f7) {
            return Math.min(f4, Math.min(f5, Math.min(f6, f7)));
        }

        public final void D0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f4 = fArr[3];
            fArr[0] = fArr[0] / f4;
            fArr[1] = fArr[1] / f4;
            fArr[2] = fArr[2] / f4;
            fArr[3] = 0.0f;
        }

        public final void E0(float[] fArr, Set set, boolean z4) {
            set.add(this);
            if (this.f10753Z) {
                z4 = true;
            }
            if (z4) {
                if (this.f10755a0 == null) {
                    this.f10755a0 = new float[16];
                }
                if (this.f10744Q == null) {
                    this.f10744Q = new float[16];
                }
                Matrix.multiplyMM(this.f10755a0, 0, fArr, 0, this.f10744Q, 0);
                float[] fArr2 = new float[4];
                fArr2[2] = 0.0f;
                fArr2[3] = 1.0f;
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                fArr2[0] = this.f10740M;
                fArr2[1] = this.f10741N;
                D0(fArr3, this.f10755a0, fArr2);
                fArr2[0] = this.f10742O;
                fArr2[1] = this.f10741N;
                D0(fArr4, this.f10755a0, fArr2);
                fArr2[0] = this.f10742O;
                fArr2[1] = this.f10743P;
                D0(fArr5, this.f10755a0, fArr2);
                fArr2[0] = this.f10740M;
                fArr2[1] = this.f10743P;
                D0(fArr6, this.f10755a0, fArr2);
                if (this.f10757b0 == null) {
                    this.f10757b0 = new Rect();
                }
                this.f10757b0.set(Math.round(B0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(B0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(A0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(A0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.f10753Z = false;
            }
            int i4 = -1;
            for (l lVar : this.f10746S) {
                lVar.f10728A = i4;
                i4 = lVar.f10756b;
                lVar.E0(this.f10755a0, set, z4);
            }
        }

        public final void F0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.f10730C = true;
            this.f10738K = this.f10773r;
            this.f10739L = this.f10771p;
            this.f10731D = this.f10758c;
            this.f10732E = this.f10759d;
            this.f10733F = this.f10762g;
            this.f10734G = this.f10763h;
            this.f10735H = this.f10767l;
            this.f10736I = this.f10768m;
            this.f10737J = this.f10769n;
            this.f10758c = byteBuffer.getInt();
            this.f10759d = byteBuffer.getInt();
            this.f10760e = byteBuffer.getInt();
            this.f10761f = byteBuffer.getInt();
            this.f10762g = byteBuffer.getInt();
            this.f10763h = byteBuffer.getInt();
            this.f10764i = byteBuffer.getInt();
            this.f10765j = byteBuffer.getInt();
            this.f10766k = byteBuffer.getInt();
            this.f10767l = byteBuffer.getFloat();
            this.f10768m = byteBuffer.getFloat();
            this.f10769n = byteBuffer.getFloat();
            int i4 = byteBuffer.getInt();
            this.f10770o = i4 == -1 ? null : strArr[i4];
            int i5 = byteBuffer.getInt();
            this.f10771p = i5 == -1 ? null : strArr[i5];
            this.f10772q = q0(byteBuffer, byteBufferArr);
            int i6 = byteBuffer.getInt();
            this.f10773r = i6 == -1 ? null : strArr[i6];
            this.f10774s = q0(byteBuffer, byteBufferArr);
            int i7 = byteBuffer.getInt();
            this.f10775t = i7 == -1 ? null : strArr[i7];
            this.f10776u = q0(byteBuffer, byteBufferArr);
            int i8 = byteBuffer.getInt();
            this.f10777v = i8 == -1 ? null : strArr[i8];
            this.f10778w = q0(byteBuffer, byteBufferArr);
            int i9 = byteBuffer.getInt();
            this.f10779x = i9 == -1 ? null : strArr[i9];
            this.f10780y = q0(byteBuffer, byteBufferArr);
            int i10 = byteBuffer.getInt();
            this.f10781z = i10 == -1 ? null : strArr[i10];
            this.f10729B = p.f(byteBuffer.getInt());
            this.f10740M = byteBuffer.getFloat();
            this.f10741N = byteBuffer.getFloat();
            this.f10742O = byteBuffer.getFloat();
            this.f10743P = byteBuffer.getFloat();
            if (this.f10744Q == null) {
                this.f10744Q = new float[16];
            }
            for (int i11 = 0; i11 < 16; i11++) {
                this.f10744Q[i11] = byteBuffer.getFloat();
            }
            this.f10751X = true;
            this.f10753Z = true;
            int i12 = byteBuffer.getInt();
            this.f10746S.clear();
            this.f10747T.clear();
            for (int i13 = 0; i13 < i12; i13++) {
                l m4 = this.f10754a.x(byteBuffer.getInt());
                m4.f10745R = this;
                this.f10746S.add(m4);
            }
            for (int i14 = 0; i14 < i12; i14++) {
                l m5 = this.f10754a.x(byteBuffer.getInt());
                m5.f10745R = this;
                this.f10747T.add(m5);
            }
            int i15 = byteBuffer.getInt();
            if (i15 == 0) {
                this.f10748U = null;
                return;
            }
            List list = this.f10748U;
            if (list == null) {
                this.f10748U = new ArrayList(i15);
            } else {
                list.clear();
            }
            for (int i16 = 0; i16 < i15; i16++) {
                h n4 = this.f10754a.w(byteBuffer.getInt());
                if (n4.f10693c == g.TAP.f10690e) {
                    this.f10749V = n4;
                } else if (n4.f10693c == g.LONG_PRESS.f10690e) {
                    this.f10750W = n4;
                } else {
                    this.f10748U.add(n4);
                }
                this.f10748U.add(n4);
            }
        }

        public final void g0(List list) {
            if (x0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (l g02 : this.f10746S) {
                g02.g0(list);
            }
        }

        public final SpannableString h0(String str, List list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    n nVar = (n) it.next();
                    int i4 = e.f10655a[nVar.f10784c.ordinal()];
                    if (i4 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f10782a, nVar.f10783b, 0);
                    } else if (i4 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).f10727d)), nVar.f10782a, nVar.f10783b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
            r2 = r3.f10739L;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean i0() {
            /*
                r3 = this;
                java.lang.String r0 = r3.f10771p
                r1 = 0
                if (r0 != 0) goto L_0x000a
                java.lang.String r2 = r3.f10739L
                if (r2 != 0) goto L_0x000a
                return r1
            L_0x000a:
                if (r0 == 0) goto L_0x0016
                java.lang.String r2 = r3.f10739L
                if (r2 == 0) goto L_0x0016
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L_0x0017
            L_0x0016:
                r1 = 1
            L_0x0017:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.d.l.i0():boolean");
        }

        public final boolean j0() {
            return !Float.isNaN(this.f10767l) && !Float.isNaN(this.f10735H) && this.f10735H != this.f10767l;
        }

        public final void k0() {
            if (this.f10751X) {
                this.f10751X = false;
                if (this.f10752Y == null) {
                    this.f10752Y = new float[16];
                }
                if (!Matrix.invertM(this.f10752Y, 0, this.f10744Q, 0)) {
                    Arrays.fill(this.f10752Y, 0.0f);
                }
            }
        }

        public final l l0(C0640d dVar) {
            for (l lVar = this.f10745R; lVar != null; lVar = lVar.f10745R) {
                if (dVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        public final Rect m0() {
            return this.f10757b0;
        }

        public final CharSequence n0() {
            return h0(this.f10779x, this.f10780y);
        }

        public final CharSequence o0() {
            return h0(this.f10771p, this.f10772q);
        }

        public final String p0() {
            String str;
            if (x0(i.NAMES_ROUTE) && (str = this.f10771p) != null && !str.isEmpty()) {
                return this.f10771p;
            }
            for (l p02 : this.f10746S) {
                String p03 = p02.p0();
                if (p03 != null && !p03.isEmpty()) {
                    return p03;
                }
            }
            return null;
        }

        public final List q0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i4 = byteBuffer.getInt();
            if (i4 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = byteBuffer.getInt();
                int i7 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i8 = e.f10655a[oVar.ordinal()];
                if (i8 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m((a) null);
                    mVar.f10782a = i6;
                    mVar.f10783b = i7;
                    mVar.f10784c = oVar;
                    arrayList.add(mVar);
                } else if (i8 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j((a) null);
                    jVar.f10782a = i6;
                    jVar.f10783b = i7;
                    jVar.f10784c = oVar;
                    jVar.f10727d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        public final CharSequence r0() {
            CharSequence[] charSequenceArr = {o0(), n0()};
            CharSequence charSequence = null;
            for (int i4 = 0; i4 < 2; i4++) {
                CharSequence charSequence2 = charSequenceArr[i4];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        public final CharSequence s0() {
            return h0(this.f10773r, this.f10774s);
        }

        public final CharSequence t0() {
            CharSequence[] charSequenceArr = {s0(), o0(), n0()};
            CharSequence charSequence = null;
            for (int i4 = 0; i4 < 3; i4++) {
                CharSequence charSequence2 = charSequenceArr[i4];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    if (charSequence == null || charSequence.length() == 0) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = TextUtils.concat(new CharSequence[]{charSequence, ", ", charSequence2});
                    }
                }
            }
            return charSequence;
        }

        public final boolean u0(g gVar) {
            return (gVar.f10690e & this.f10732E) != 0;
        }

        public final boolean v0(i iVar) {
            return (iVar.f10726e & this.f10731D) != 0;
        }

        public final boolean w0(g gVar) {
            return (gVar.f10690e & this.f10759d) != 0;
        }

        public final boolean x0(i iVar) {
            return (iVar.f10726e & this.f10758c) != 0;
        }

        public final l y0(float[] fArr, boolean z4) {
            float f4 = fArr[3];
            boolean z5 = false;
            float f5 = fArr[0] / f4;
            float f6 = fArr[1] / f4;
            if (f5 < this.f10740M || f5 >= this.f10742O || f6 < this.f10741N || f6 >= this.f10743P) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.f10747T) {
                if (!lVar.x0(i.IS_HIDDEN)) {
                    lVar.k0();
                    Matrix.multiplyMV(fArr2, 0, lVar.f10752Y, 0, fArr, 0);
                    l y02 = lVar.y0(fArr2, z4);
                    if (y02 != null) {
                        return y02;
                    }
                }
            }
            if (z4 && this.f10764i != -1) {
                z5 = true;
            }
            if (z0() || z5) {
                return this;
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
            r0 = r4.f10771p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
            r0 = r4.f10773r;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            r0 = r4.f10779x;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean z0() {
            /*
                r4 = this;
                io.flutter.view.d$i r0 = io.flutter.view.d.i.SCOPES_ROUTE
                boolean r0 = r4.x0(r0)
                r1 = 0
                if (r0 == 0) goto L_0x000a
                return r1
            L_0x000a:
                io.flutter.view.d$i r0 = io.flutter.view.d.i.IS_FOCUSABLE
                boolean r0 = r4.x0(r0)
                r2 = 1
                if (r0 == 0) goto L_0x0014
                return r2
            L_0x0014:
                int r0 = r4.f10759d
                int r3 = io.flutter.view.d.f10624z
                int r3 = ~r3
                r0 = r0 & r3
                if (r0 != 0) goto L_0x0045
                int r0 = r4.f10758c
                int r3 = io.flutter.view.d.f10621A
                r0 = r0 & r3
                if (r0 != 0) goto L_0x0045
                java.lang.String r0 = r4.f10771p
                if (r0 == 0) goto L_0x0031
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0045
            L_0x0031:
                java.lang.String r0 = r4.f10773r
                if (r0 == 0) goto L_0x003b
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L_0x0045
            L_0x003b:
                java.lang.String r0 = r4.f10779x
                if (r0 == 0) goto L_0x0046
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x0046
            L_0x0045:
                r1 = r2
            L_0x0046:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.d.l.z0():boolean");
        }
    }

    public static class m extends n {
        public m() {
            super((a) null);
        }

        public /* synthetic */ m(a aVar) {
            this();
        }
    }

    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public int f10782a;

        /* renamed from: b  reason: collision with root package name */
        public int f10783b;

        /* renamed from: c  reason: collision with root package name */
        public o f10784c;

        public n() {
        }

        public /* synthetic */ n(a aVar) {
            this();
        }
    }

    public enum o {
        SPELLOUT,
        LOCALE
    }

    public enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p f(int i4) {
            return i4 != 1 ? i4 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public d(View view, X2.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.n nVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), nVar);
    }

    public static /* synthetic */ boolean D(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    public static /* synthetic */ int e(d dVar, int i4) {
        int i5 = i4 & dVar.f10636l;
        dVar.f10636l = i5;
        return i5;
    }

    public static /* synthetic */ int f(d dVar, int i4) {
        int i5 = i4 | dVar.f10636l;
        dVar.f10636l = i5;
        return i5;
    }

    public boolean A() {
        return this.f10627c.isEnabled();
    }

    public final boolean B(l lVar) {
        if (lVar.x0(i.SCOPES_ROUTE)) {
            return false;
        }
        if (lVar.t0() != null) {
            return true;
        }
        return (lVar.f10759d & (~f10623C)) != 0;
    }

    public boolean C() {
        return this.f10627c.isTouchExplorationEnabled();
    }

    public AccessibilityEvent F(int i4) {
        return AccessibilityEvent.obtain(i4);
    }

    public final AccessibilityEvent G(int i4, int i5) {
        AccessibilityEvent F4 = F(i5);
        F4.setPackageName(this.f10625a.getContext().getPackageName());
        F4.setSource(this.f10625a, i4);
        return F4;
    }

    public AccessibilityNodeInfo H(View view) {
        return AccessibilityNodeInfo.obtain(view);
    }

    public AccessibilityNodeInfo I(View view, int i4) {
        return AccessibilityNodeInfo.obtain(view, i4);
    }

    public boolean J(MotionEvent motionEvent) {
        return K(motionEvent, false);
    }

    public boolean K(MotionEvent motionEvent, boolean z4) {
        if (!this.f10627c.isTouchExplorationEnabled() || this.f10631g.isEmpty()) {
            return false;
        }
        l L4 = y().y0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z4);
        if (L4 == null || L4.f10764i == -1) {
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                z(motionEvent.getX(), motionEvent.getY(), z4);
            } else if (motionEvent.getAction() == 10) {
                L();
            } else {
                M2.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            }
            return true;
        } else if (z4) {
            return false;
        } else {
            return this.f10628d.onAccessibilityHoverEvent(L4.f10756b, motionEvent);
        }
    }

    public final void L() {
        l lVar = this.f10639o;
        if (lVar != null) {
            R(lVar.f10756b, 256);
            this.f10639o = null;
        }
    }

    public final void M(l lVar) {
        String f02 = lVar.p0();
        if (f02 == null) {
            f02 = " ";
        }
        V(f02);
    }

    public final boolean N(l lVar, int i4, Bundle bundle, boolean z4) {
        int i5 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z5 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int j4 = lVar.f10762g;
        int l4 = lVar.f10763h;
        P(lVar, i5, z4, z5);
        if (!(j4 == lVar.f10762g && l4 == lVar.f10763h)) {
            String r4 = lVar.f10773r != null ? lVar.f10773r : "";
            AccessibilityEvent G4 = G(lVar.f10756b, 8192);
            G4.getText().add(r4);
            G4.setFromIndex(lVar.f10762g);
            G4.setToIndex(lVar.f10763h);
            G4.setItemCount(r4.length());
            S(G4);
        }
        if (i5 == 1) {
            if (z4) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.w0(gVar)) {
                    this.f10626b.c(i4, gVar, Boolean.valueOf(z5));
                    return true;
                }
            }
            if (z4) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (!lVar.w0(gVar2)) {
                return false;
            }
            this.f10626b.c(i4, gVar2, Boolean.valueOf(z5));
            return true;
        } else if (i5 != 2) {
            return i5 == 4 || i5 == 8 || i5 == 16;
        } else {
            if (z4) {
                g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
                if (lVar.w0(gVar3)) {
                    this.f10626b.c(i4, gVar3, Boolean.valueOf(z5));
                    return true;
                }
            }
            if (z4) {
                return false;
            }
            g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (!lVar.w0(gVar4)) {
                return false;
            }
            this.f10626b.c(i4, gVar4, Boolean.valueOf(z5));
            return true;
        }
    }

    public final boolean O(l lVar, int i4, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f10626b.c(i4, g.SET_TEXT, string);
        String unused = lVar.f10773r = string;
        List unused2 = lVar.f10774s = null;
        return true;
    }

    public final void P(l lVar, int i4, boolean z4, boolean z5) {
        if (lVar.f10763h >= 0 && lVar.f10762g >= 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 == 8 || i4 == 16) {
                            if (z4) {
                                int unused = lVar.f10763h = lVar.f10773r.length();
                            } else {
                                int unused2 = lVar.f10763h = 0;
                            }
                        }
                    } else if (z4 && lVar.f10763h < lVar.f10773r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(lVar.f10773r.substring(lVar.f10763h));
                        if (matcher.find()) {
                            l.n(lVar, matcher.start(1));
                        } else {
                            int unused3 = lVar.f10763h = lVar.f10773r.length();
                        }
                    } else if (!z4 && lVar.f10763h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(lVar.f10773r.substring(0, lVar.f10763h));
                        if (matcher2.find()) {
                            int unused4 = lVar.f10763h = matcher2.start(1);
                        } else {
                            int unused5 = lVar.f10763h = 0;
                        }
                    }
                } else if (z4 && lVar.f10763h < lVar.f10773r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(lVar.f10773r.substring(lVar.f10763h));
                    matcher3.find();
                    if (matcher3.find()) {
                        l.n(lVar, matcher3.start(1));
                    } else {
                        int unused6 = lVar.f10763h = lVar.f10773r.length();
                    }
                } else if (!z4 && lVar.f10763h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(lVar.f10773r.substring(0, lVar.f10763h));
                    if (matcher4.find()) {
                        int unused7 = lVar.f10763h = matcher4.start(1);
                    }
                }
            } else if (z4 && lVar.f10763h < lVar.f10773r.length()) {
                l.n(lVar, 1);
            } else if (!z4 && lVar.f10763h > 0) {
                l.o(lVar, 1);
            }
            if (!z5) {
                int unused8 = lVar.f10762g = lVar.f10763h;
            }
        }
    }

    public void Q() {
        this.f10645u = true;
        this.f10629e.d();
        Y((k) null);
        this.f10627c.removeAccessibilityStateChangeListener(this.f10647w);
        this.f10627c.removeTouchExplorationStateChangeListener(this.f10648x);
        this.f10630f.unregisterContentObserver(this.f10649y);
        this.f10626b.g((a.b) null);
    }

    public void R(int i4, int i5) {
        if (this.f10627c.isEnabled()) {
            S(G(i4, i5));
        }
    }

    public final void S(AccessibilityEvent accessibilityEvent) {
        if (this.f10627c.isEnabled()) {
            this.f10625a.getParent().requestSendAccessibilityEvent(this.f10625a, accessibilityEvent);
        }
    }

    public final void T() {
        this.f10626b.f(this.f10636l);
    }

    public final void U(int i4) {
        AccessibilityEvent G4 = G(i4, 2048);
        G4.setContentChangeTypes(1);
        S(G4);
    }

    public final void V(String str) {
        this.f10625a.setAccessibilityPaneTitle(str);
    }

    public final void W(boolean z4) {
        if (this.f10644t != z4) {
            this.f10644t = z4;
            if (z4) {
                this.f10636l |= f.ACCESSIBLE_NAVIGATION.f10664e;
            } else {
                this.f10636l &= ~f.ACCESSIBLE_NAVIGATION.f10664e;
            }
            T();
        }
    }

    public final void X() {
        View view = this.f10625a;
        if (view != null && view.getResources() != null) {
            int a4 = this.f10625a.getResources().getConfiguration().fontWeightAdjustment;
            if (a4 == Integer.MAX_VALUE || a4 < 300) {
                this.f10636l &= ~f.BOLD_TEXT.f10664e;
            } else {
                this.f10636l |= f.BOLD_TEXT.f10664e;
            }
            T();
        }
    }

    public void Y(k kVar) {
        this.f10643s = kVar;
    }

    public final boolean Z(l lVar) {
        return lVar.f10765j > 0 && (l.C0(this.f10633i, new b(lVar)) || !l.C0(this.f10633i, new c()));
    }

    public void a0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h w4 = w(byteBuffer.getInt());
            int unused = w4.f10693c = byteBuffer.getInt();
            int i4 = byteBuffer.getInt();
            String str = null;
            String unused2 = w4.f10694d = i4 == -1 ? null : strArr[i4];
            int i5 = byteBuffer.getInt();
            if (i5 != -1) {
                str = strArr[i5];
            }
            String unused3 = w4.f10695e = str;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: io.flutter.view.d$l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b0(java.nio.ByteBuffer r9, java.lang.String[] r10, java.nio.ByteBuffer[] r11) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0005:
            boolean r1 = r9.hasRemaining()
            r2 = 0
            if (r1 == 0) goto L_0x0056
            int r1 = r9.getInt()
            io.flutter.view.d$l r1 = r8.x(r1)
            r1.F0(r9, r10, r11)
            io.flutter.view.d$i r3 = io.flutter.view.d.i.IS_HIDDEN
            boolean r3 = r1.x0(r3)
            if (r3 == 0) goto L_0x0020
            goto L_0x0005
        L_0x0020:
            io.flutter.view.d$i r3 = io.flutter.view.d.i.IS_FOCUSED
            boolean r3 = r1.x0(r3)
            if (r3 == 0) goto L_0x002a
            r8.f10637m = r1
        L_0x002a:
            boolean r3 = r1.f10730C
            if (r3 == 0) goto L_0x0033
            r0.add(r1)
        L_0x0033:
            int r3 = r1.f10764i
            r4 = -1
            if (r3 == r4) goto L_0x0005
            io.flutter.plugin.platform.n r3 = r8.f10629e
            int r4 = r1.f10764i
            boolean r3 = r3.b(r4)
            if (r3 != 0) goto L_0x0005
            io.flutter.plugin.platform.n r3 = r8.f10629e
            int r1 = r1.f10764i
            android.view.View r1 = r3.c(r1)
            if (r1 == 0) goto L_0x0005
            r1.setImportantForAccessibility(r2)
            goto L_0x0005
        L_0x0056:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            io.flutter.view.d$l r10 = r8.y()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r1 = 1
            if (r10 == 0) goto L_0x00ab
            r3 = 16
            float[] r3 = new float[r3]
            android.opengl.Matrix.setIdentityM(r3, r2)
            boolean r4 = r8.t()
            if (r4 == 0) goto L_0x00a5
            android.view.View r4 = r8.f10625a
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
            if (r4 == 0) goto L_0x00a5
            java.lang.Integer r5 = r8.f10642r
            int r6 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0092
            boolean unused = r10.f10753Z = r1
            boolean unused = r10.f10751X = r1
        L_0x0092:
            int r4 = r4.getSystemWindowInsetLeft()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r8.f10642r = r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            r5 = 0
            android.opengl.Matrix.translateM(r3, r2, r4, r5, r5)
        L_0x00a5:
            r10.E0(r3, r9, r2)
            r10.g0(r11)
        L_0x00ab:
            java.util.Iterator r10 = r11.iterator()
            r3 = 0
            r4 = r3
        L_0x00b1:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L_0x00cf
            java.lang.Object r5 = r10.next()
            io.flutter.view.d$l r5 = (io.flutter.view.d.l) r5
            java.util.List r6 = r8.f10640p
            int r7 = r5.f10756b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto L_0x00b1
            r4 = r5
            goto L_0x00b1
        L_0x00cf:
            if (r4 != 0) goto L_0x00e3
            int r10 = r11.size()
            if (r10 <= 0) goto L_0x00e3
            int r10 = r11.size()
            int r10 = r10 - r1
            java.lang.Object r10 = r11.get(r10)
            r4 = r10
            io.flutter.view.d$l r4 = (io.flutter.view.d.l) r4
        L_0x00e3:
            if (r4 == 0) goto L_0x0102
            int r10 = r4.f10756b
            int r5 = r8.f10641q
            if (r10 != r5) goto L_0x00f9
            int r10 = r11.size()
            java.util.List r5 = r8.f10640p
            int r5 = r5.size()
            if (r10 == r5) goto L_0x0102
        L_0x00f9:
            int r10 = r4.f10756b
            r8.f10641q = r10
            r8.M(r4)
        L_0x0102:
            java.util.List r10 = r8.f10640p
            r10.clear()
            java.util.Iterator r10 = r11.iterator()
        L_0x010b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0125
            java.lang.Object r11 = r10.next()
            io.flutter.view.d$l r11 = (io.flutter.view.d.l) r11
            java.util.List r4 = r8.f10640p
            int r11 = r11.f10756b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4.add(r11)
            goto L_0x010b
        L_0x0125:
            java.util.Map r10 = r8.f10631g
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x012f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x014e
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r11 = r11.getValue()
            io.flutter.view.d$l r11 = (io.flutter.view.d.l) r11
            boolean r4 = r9.contains(r11)
            if (r4 != 0) goto L_0x012f
            r8.c0(r11)
            r10.remove()
            goto L_0x012f
        L_0x014e:
            r8.U(r2)
            java.util.Iterator r9 = r0.iterator()
        L_0x0155:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x032e
            java.lang.Object r10 = r9.next()
            io.flutter.view.d$l r10 = (io.flutter.view.d.l) r10
            boolean r11 = r10.j0()
            if (r11 == 0) goto L_0x0220
            int r11 = r10.f10756b
            r0 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r11 = r8.G(r11, r0)
            float r0 = r10.f10767l
            float r4 = r10.f10768m
            float r5 = r10.f10768m
            boolean r5 = java.lang.Float.isInfinite(r5)
            r6 = 1203982336(0x47c35000, float:100000.0)
            if (r5 == 0) goto L_0x018f
            r4 = 1200142336(0x4788b800, float:70000.0)
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x018e
            r0 = r4
        L_0x018e:
            r4 = r6
        L_0x018f:
            float r5 = r10.f10769n
            boolean r5 = java.lang.Float.isInfinite(r5)
            if (r5 == 0) goto L_0x01a4
            float r4 = r4 + r6
            r5 = -947341312(0xffffffffc788b800, float:-70000.0)
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x01a2
            r0 = r5
        L_0x01a2:
            float r0 = r0 + r6
            goto L_0x01ae
        L_0x01a4:
            float r5 = r10.f10769n
            float r4 = r4 - r5
            float r5 = r10.f10769n
            float r0 = r0 - r5
        L_0x01ae:
            io.flutter.view.d$g r5 = io.flutter.view.d.g.SCROLL_UP
            boolean r5 = r10.u0(r5)
            if (r5 != 0) goto L_0x01d8
            io.flutter.view.d$g r5 = io.flutter.view.d.g.SCROLL_DOWN
            boolean r5 = r10.u0(r5)
            if (r5 == 0) goto L_0x01bf
            goto L_0x01d8
        L_0x01bf:
            io.flutter.view.d$g r5 = io.flutter.view.d.g.SCROLL_LEFT
            boolean r5 = r10.u0(r5)
            if (r5 != 0) goto L_0x01cf
            io.flutter.view.d$g r5 = io.flutter.view.d.g.SCROLL_RIGHT
            boolean r5 = r10.u0(r5)
            if (r5 == 0) goto L_0x01e0
        L_0x01cf:
            int r0 = (int) r0
            r11.setScrollX(r0)
            int r0 = (int) r4
            r11.setMaxScrollX(r0)
            goto L_0x01e0
        L_0x01d8:
            int r0 = (int) r0
            r11.setScrollY(r0)
            int r0 = (int) r4
            r11.setMaxScrollY(r0)
        L_0x01e0:
            int r0 = r10.f10765j
            if (r0 <= 0) goto L_0x021d
            int r0 = r10.f10765j
            r11.setItemCount(r0)
            int r0 = r10.f10766k
            r11.setFromIndex(r0)
            java.util.List r0 = r10.f10747T
            java.util.Iterator r0 = r0.iterator()
            r4 = r2
        L_0x01fd:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0214
            java.lang.Object r5 = r0.next()
            io.flutter.view.d$l r5 = (io.flutter.view.d.l) r5
            io.flutter.view.d$i r6 = io.flutter.view.d.i.IS_HIDDEN
            boolean r5 = r5.x0(r6)
            if (r5 != 0) goto L_0x01fd
            int r4 = r4 + 1
            goto L_0x01fd
        L_0x0214:
            int r0 = r10.f10766k
            int r0 = r0 + r4
            int r0 = r0 - r1
            r11.setToIndex(r0)
        L_0x021d:
            r8.S(r11)
        L_0x0220:
            io.flutter.view.d$i r11 = io.flutter.view.d.i.IS_LIVE_REGION
            boolean r11 = r10.x0(r11)
            if (r11 == 0) goto L_0x0235
            boolean r11 = r10.i0()
            if (r11 == 0) goto L_0x0235
            int r11 = r10.f10756b
            r8.U(r11)
        L_0x0235:
            io.flutter.view.d$l r11 = r8.f10633i
            if (r11 == 0) goto L_0x0268
            int r11 = r11.f10756b
            int r0 = r10.f10756b
            if (r11 != r0) goto L_0x0268
            io.flutter.view.d$i r11 = io.flutter.view.d.i.IS_SELECTED
            boolean r0 = r10.v0(r11)
            if (r0 != 0) goto L_0x0268
            boolean r11 = r10.x0(r11)
            if (r11 == 0) goto L_0x0268
            int r11 = r10.f10756b
            r0 = 4
            android.view.accessibility.AccessibilityEvent r11 = r8.G(r11, r0)
            java.util.List r0 = r11.getText()
            java.lang.String r4 = r10.f10771p
            r0.add(r4)
            r8.S(r11)
        L_0x0268:
            io.flutter.view.d$l r11 = r8.f10637m
            if (r11 == 0) goto L_0x0298
            int r11 = r11.f10756b
            int r0 = r10.f10756b
            if (r11 != r0) goto L_0x0298
            io.flutter.view.d$l r11 = r8.f10638n
            if (r11 == 0) goto L_0x0286
            int r11 = r11.f10756b
            io.flutter.view.d$l r0 = r8.f10637m
            int r0 = r0.f10756b
            if (r11 == r0) goto L_0x0298
        L_0x0286:
            io.flutter.view.d$l r11 = r8.f10637m
            r8.f10638n = r11
            int r11 = r10.f10756b
            r0 = 8
            android.view.accessibility.AccessibilityEvent r11 = r8.G(r11, r0)
            r8.S(r11)
            goto L_0x029e
        L_0x0298:
            io.flutter.view.d$l r11 = r8.f10637m
            if (r11 != 0) goto L_0x029e
            r8.f10638n = r3
        L_0x029e:
            io.flutter.view.d$l r11 = r8.f10637m
            if (r11 == 0) goto L_0x0155
            int r11 = r11.f10756b
            int r0 = r10.f10756b
            if (r11 != r0) goto L_0x0155
            io.flutter.view.d$i r11 = io.flutter.view.d.i.IS_TEXT_FIELD
            boolean r0 = r10.v0(r11)
            if (r0 == 0) goto L_0x0155
            boolean r11 = r10.x0(r11)
            if (r11 == 0) goto L_0x0155
            io.flutter.view.d$l r11 = r8.f10633i
            if (r11 == 0) goto L_0x02ca
            int r11 = r11.f10756b
            io.flutter.view.d$l r0 = r8.f10637m
            int r0 = r0.f10756b
            if (r11 != r0) goto L_0x0155
        L_0x02ca:
            java.lang.String r11 = r10.f10738K
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x02d7
            java.lang.String r11 = r10.f10738K
            goto L_0x02d8
        L_0x02d7:
            r11 = r0
        L_0x02d8:
            java.lang.String r4 = r10.f10773r
            if (r4 == 0) goto L_0x02e2
            java.lang.String r0 = r10.f10773r
        L_0x02e2:
            int r4 = r10.f10756b
            android.view.accessibility.AccessibilityEvent r11 = r8.s(r4, r11, r0)
            if (r11 == 0) goto L_0x02ef
            r8.S(r11)
        L_0x02ef:
            int r11 = r10.f10733F
            int r4 = r10.f10762g
            if (r11 != r4) goto L_0x0303
            int r11 = r10.f10734G
            int r4 = r10.f10763h
            if (r11 == r4) goto L_0x0155
        L_0x0303:
            int r11 = r10.f10756b
            r4 = 8192(0x2000, float:1.14794E-41)
            android.view.accessibility.AccessibilityEvent r11 = r8.G(r11, r4)
            java.util.List r4 = r11.getText()
            r4.add(r0)
            int r4 = r10.f10762g
            r11.setFromIndex(r4)
            int r10 = r10.f10763h
            r11.setToIndex(r10)
            int r10 = r0.length()
            r11.setItemCount(r10)
            r8.S(r11)
            goto L_0x0155
        L_0x032e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.d.b0(java.nio.ByteBuffer, java.lang.String[], java.nio.ByteBuffer[]):void");
    }

    public final void c0(l lVar) {
        View c4;
        Integer num;
        l unused = lVar.f10745R = null;
        if (!(lVar.f10764i == -1 || (num = this.f10634j) == null || this.f10628d.platformViewOfNode(num.intValue()) != this.f10629e.c(lVar.f10764i))) {
            R(this.f10634j.intValue(), 65536);
            this.f10634j = null;
        }
        if (!(lVar.f10764i == -1 || (c4 = this.f10629e.c(lVar.f10764i)) == null)) {
            c4.setImportantForAccessibility(4);
        }
        l lVar2 = this.f10633i;
        if (lVar2 == lVar) {
            R(lVar2.f10756b, 65536);
            this.f10633i = null;
        }
        if (this.f10637m == lVar) {
            this.f10637m = null;
        }
        if (this.f10639o == lVar) {
            this.f10639o = null;
        }
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        CharSequence B4;
        int i5;
        boolean z4 = true;
        W(true);
        if (i4 >= 65536) {
            return this.f10628d.createAccessibilityNodeInfo(i4);
        }
        if (i4 == -1) {
            AccessibilityNodeInfo H4 = H(this.f10625a);
            this.f10625a.onInitializeAccessibilityNodeInfo(H4);
            if (this.f10631g.containsKey(0)) {
                H4.addChild(this.f10625a, 0);
            }
            H4.setImportantForAccessibility(false);
            return H4;
        }
        l lVar = (l) this.f10631g.get(Integer.valueOf(i4));
        if (lVar == null) {
            return null;
        }
        if (lVar.f10764i == -1 || !this.f10629e.b(lVar.f10764i)) {
            AccessibilityNodeInfo I4 = I(this.f10625a, i4);
            I4.setImportantForAccessibility(B(lVar));
            I4.setViewIdResourceName("");
            if (lVar.f10770o != null) {
                I4.setViewIdResourceName(lVar.f10770o);
            }
            I4.setPackageName(this.f10625a.getContext().getPackageName());
            I4.setClassName("android.view.View");
            I4.setSource(this.f10625a, i4);
            I4.setFocusable(lVar.z0());
            l lVar2 = this.f10637m;
            if (lVar2 != null) {
                I4.setFocused(lVar2.f10756b == i4);
            }
            l lVar3 = this.f10633i;
            if (lVar3 != null) {
                I4.setAccessibilityFocused(lVar3.f10756b == i4);
            }
            i iVar = i.IS_TEXT_FIELD;
            if (lVar.x0(iVar)) {
                I4.setPassword(lVar.x0(i.IS_OBSCURED));
                i iVar2 = i.IS_READ_ONLY;
                if (!lVar.x0(iVar2)) {
                    I4.setClassName("android.widget.EditText");
                }
                I4.setEditable(!lVar.x0(iVar2));
                if (!(lVar.f10762g == -1 || lVar.f10763h == -1)) {
                    I4.setTextSelection(lVar.f10762g, lVar.f10763h);
                }
                l lVar4 = this.f10633i;
                if (lVar4 != null && lVar4.f10756b == i4) {
                    I4.setLiveRegion(1);
                }
                if (lVar.w0(g.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                    I4.addAction(256);
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                if (lVar.w0(g.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                    I4.addAction(512);
                    i5 = 1;
                }
                if (lVar.w0(g.MOVE_CURSOR_FORWARD_BY_WORD)) {
                    I4.addAction(256);
                    i5 |= 2;
                }
                if (lVar.w0(g.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                    I4.addAction(512);
                    i5 |= 2;
                }
                I4.setMovementGranularities(i5);
                if (lVar.f10760e >= 0) {
                    int length = lVar.f10773r == null ? 0 : lVar.f10773r.length();
                    int unused = lVar.f10761f;
                    int unused2 = lVar.f10760e;
                    I4.setMaxTextLength((length - lVar.f10761f) + lVar.f10760e);
                }
            }
            if (lVar.w0(g.SET_SELECTION)) {
                I4.addAction(131072);
            }
            if (lVar.w0(g.COPY)) {
                I4.addAction(16384);
            }
            if (lVar.w0(g.CUT)) {
                I4.addAction(65536);
            }
            if (lVar.w0(g.PASTE)) {
                I4.addAction(32768);
            }
            if (lVar.w0(g.SET_TEXT)) {
                I4.addAction(2097152);
            }
            if (lVar.x0(i.IS_BUTTON) || lVar.x0(i.IS_LINK)) {
                I4.setClassName("android.widget.Button");
            }
            if (lVar.x0(i.IS_IMAGE)) {
                I4.setClassName("android.widget.ImageView");
            }
            if (lVar.w0(g.DISMISS)) {
                I4.setDismissable(true);
                I4.addAction(1048576);
            }
            if (lVar.f10745R != null) {
                I4.setParent(this.f10625a, lVar.f10745R.f10756b);
            } else {
                I4.setParent(this.f10625a);
            }
            if (lVar.f10728A != -1) {
                I4.setTraversalAfter(this.f10625a, lVar.f10728A);
            }
            Rect f4 = lVar.m0();
            if (lVar.f10745R != null) {
                Rect f5 = lVar.f10745R.m0();
                Rect rect = new Rect(f4);
                rect.offset(-f5.left, -f5.top);
                I4.setBoundsInParent(rect);
            } else {
                I4.setBoundsInParent(f4);
            }
            I4.setBoundsInScreen(v(f4));
            I4.setVisibleToUser(true);
            I4.setEnabled(!lVar.x0(i.HAS_ENABLED_STATE) || lVar.x0(i.IS_ENABLED));
            if (lVar.w0(g.TAP)) {
                if (lVar.f10749V != null) {
                    I4.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, lVar.f10749V.f10695e));
                    I4.setClickable(true);
                } else {
                    I4.addAction(16);
                    I4.setClickable(true);
                }
            } else if (lVar.x0(i.IS_SLIDER)) {
                I4.addAction(16);
                I4.setClickable(true);
            }
            if (lVar.w0(g.LONG_PRESS)) {
                if (lVar.f10750W != null) {
                    I4.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, lVar.f10750W.f10695e));
                    I4.setLongClickable(true);
                } else {
                    I4.addAction(32);
                    I4.setLongClickable(true);
                }
            }
            g gVar = g.SCROLL_LEFT;
            if (lVar.w0(gVar) || lVar.w0(g.SCROLL_UP) || lVar.w0(g.SCROLL_RIGHT) || lVar.w0(g.SCROLL_DOWN)) {
                I4.setScrollable(true);
                if (lVar.x0(i.HAS_IMPLICIT_SCROLLING)) {
                    if (lVar.w0(gVar) || lVar.w0(g.SCROLL_RIGHT)) {
                        if (Z(lVar)) {
                            I4.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(0, lVar.f10765j, false));
                        } else {
                            I4.setClassName("android.widget.HorizontalScrollView");
                        }
                    } else if (Z(lVar)) {
                        I4.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(lVar.f10765j, 0, false));
                    } else {
                        I4.setClassName("android.widget.ScrollView");
                    }
                }
                if (lVar.w0(gVar) || lVar.w0(g.SCROLL_UP)) {
                    I4.addAction(4096);
                }
                if (lVar.w0(g.SCROLL_RIGHT) || lVar.w0(g.SCROLL_DOWN)) {
                    I4.addAction(8192);
                }
            }
            g gVar2 = g.INCREASE;
            if (lVar.w0(gVar2) || lVar.w0(g.DECREASE)) {
                I4.setClassName("android.widget.SeekBar");
                if (lVar.w0(gVar2)) {
                    I4.addAction(4096);
                }
                if (lVar.w0(g.DECREASE)) {
                    I4.addAction(8192);
                }
            }
            if (lVar.x0(i.IS_LIVE_REGION)) {
                I4.setLiveRegion(1);
            }
            if (lVar.x0(iVar)) {
                I4.setText(lVar.s0());
                I4.setHintText(lVar.r0());
            } else if (!lVar.x0(i.SCOPES_ROUTE) && (B4 = lVar.t0()) != null) {
                I4.setContentDescription(B4);
            }
            if (lVar.f10781z != null) {
                I4.setTooltipText(lVar.f10781z);
            }
            boolean i6 = lVar.x0(i.HAS_CHECKED_STATE);
            boolean i7 = lVar.x0(i.HAS_TOGGLED_STATE);
            if (!i6 && !i7) {
                z4 = false;
            }
            I4.setCheckable(z4);
            if (i6) {
                I4.setChecked(lVar.x0(i.IS_CHECKED));
                if (lVar.x0(i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP)) {
                    I4.setClassName("android.widget.RadioButton");
                } else {
                    I4.setClassName("android.widget.CheckBox");
                }
            } else if (i7) {
                I4.setChecked(lVar.x0(i.IS_TOGGLED));
                I4.setClassName("android.widget.Switch");
            }
            I4.setSelected(lVar.x0(i.IS_SELECTED));
            I4.setHeading(lVar.x0(i.IS_HEADER));
            l lVar5 = this.f10633i;
            if (lVar5 == null || lVar5.f10756b != i4) {
                I4.addAction(64);
            } else {
                I4.addAction(128);
            }
            if (lVar.f10748U != null) {
                for (h hVar : lVar.f10748U) {
                    I4.addAction(new AccessibilityNodeInfo.AccessibilityAction(hVar.f10691a, hVar.f10694d));
                }
            }
            for (l lVar6 : lVar.f10746S) {
                if (!lVar6.x0(i.IS_HIDDEN)) {
                    if (lVar6.f10764i != -1) {
                        View c4 = this.f10629e.c(lVar6.f10764i);
                        if (!this.f10629e.b(lVar6.f10764i)) {
                            I4.addChild(c4);
                        }
                    }
                    I4.addChild(this.f10625a, lVar6.f10756b);
                }
            }
            return I4;
        }
        View c5 = this.f10629e.c(lVar.f10764i);
        if (c5 == null) {
            return null;
        }
        return this.f10628d.getRootNode(c5, lVar.f10756b, lVar.m0());
    }

    public AccessibilityNodeInfo findFocus(int i4) {
        if (i4 == 1) {
            l lVar = this.f10637m;
            if (lVar != null) {
                return createAccessibilityNodeInfo(lVar.f10756b);
            }
            Integer num = this.f10635k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i4 != 2) {
            return null;
        }
        l lVar2 = this.f10633i;
        if (lVar2 != null) {
            return createAccessibilityNodeInfo(lVar2.f10756b);
        }
        Integer num2 = this.f10634j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public boolean performAction(int i4, int i5, Bundle bundle) {
        if (i4 >= 65536) {
            boolean performAction = this.f10628d.performAction(i4, i5, bundle);
            if (performAction && i5 == 128) {
                this.f10634j = null;
            }
            return performAction;
        }
        l lVar = (l) this.f10631g.get(Integer.valueOf(i4));
        if (lVar == null) {
            return false;
        }
        switch (i5) {
            case SQLiteDatabase.NO_LOCALIZED_COLLATORS /*16*/:
                this.f10626b.b(i4, g.TAP);
                return true;
            case 32:
                this.f10626b.b(i4, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f10633i == null) {
                    this.f10625a.invalidate();
                }
                this.f10633i = lVar;
                this.f10626b.b(i4, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                HashMap hashMap = new HashMap();
                hashMap.put("type", "didGainFocus");
                hashMap.put("nodeId", Integer.valueOf(lVar.f10756b));
                this.f10626b.f3486a.c(hashMap);
                R(i4, 32768);
                if (lVar.w0(g.INCREASE) || lVar.w0(g.DECREASE)) {
                    R(i4, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f10633i;
                if (lVar2 != null && lVar2.f10756b == i4) {
                    this.f10633i = null;
                }
                Integer num = this.f10634j;
                if (num != null && num.intValue() == i4) {
                    this.f10634j = null;
                }
                this.f10626b.b(i4, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                R(i4, 65536);
                return true;
            case 256:
                return N(lVar, i4, bundle, true);
            case 512:
                return N(lVar, i4, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (lVar.w0(gVar)) {
                    this.f10626b.b(i4, gVar);
                } else {
                    g gVar2 = g.SCROLL_LEFT;
                    if (lVar.w0(gVar2)) {
                        this.f10626b.b(i4, gVar2);
                    } else {
                        g gVar3 = g.INCREASE;
                        if (!lVar.w0(gVar3)) {
                            return false;
                        }
                        String unused = lVar.f10773r = lVar.f10775t;
                        List unused2 = lVar.f10774s = lVar.f10776u;
                        R(i4, 4);
                        this.f10626b.b(i4, gVar3);
                    }
                }
                return true;
            case 8192:
                g gVar4 = g.SCROLL_DOWN;
                if (lVar.w0(gVar4)) {
                    this.f10626b.b(i4, gVar4);
                } else {
                    g gVar5 = g.SCROLL_RIGHT;
                    if (lVar.w0(gVar5)) {
                        this.f10626b.b(i4, gVar5);
                    } else {
                        g gVar6 = g.DECREASE;
                        if (!lVar.w0(gVar6)) {
                            return false;
                        }
                        String unused3 = lVar.f10773r = lVar.f10777v;
                        List unused4 = lVar.f10774s = lVar.f10778w;
                        R(i4, 4);
                        this.f10626b.b(i4, gVar6);
                    }
                }
                return true;
            case 16384:
                this.f10626b.b(i4, g.COPY);
                return true;
            case 32768:
                this.f10626b.b(i4, g.PASTE);
                return true;
            case 65536:
                this.f10626b.b(i4, g.CUT);
                return true;
            case 131072:
                HashMap hashMap2 = new HashMap();
                if (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") || !bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    hashMap2.put("base", Integer.valueOf(lVar.f10763h));
                    hashMap2.put("extent", Integer.valueOf(lVar.f10763h));
                } else {
                    hashMap2.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    hashMap2.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                }
                this.f10626b.c(i4, g.SET_SELECTION, hashMap2);
                l lVar3 = (l) this.f10631g.get(Integer.valueOf(i4));
                int unused5 = lVar3.f10762g = ((Integer) hashMap2.get("base")).intValue();
                int unused6 = lVar3.f10763h = ((Integer) hashMap2.get("extent")).intValue();
                return true;
            case 1048576:
                this.f10626b.b(i4, g.DISMISS);
                return true;
            case 2097152:
                return O(lVar, i4, bundle);
            case 16908342:
                this.f10626b.b(i4, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = (h) this.f10632h.get(Integer.valueOf(i5 - f10622B));
                if (hVar == null) {
                    return false;
                }
                this.f10626b.c(i4, g.CUSTOM_ACTION, Integer.valueOf(hVar.f10692b));
                return true;
        }
    }

    public final AccessibilityEvent s(int i4, String str, String str2) {
        AccessibilityEvent G4 = G(i4, 16);
        G4.setBeforeText(str);
        G4.getText().add(str2);
        int i5 = 0;
        while (i5 < str.length() && i5 < str2.length() && str.charAt(i5) == str2.charAt(i5)) {
            i5++;
        }
        if (i5 >= str.length() && i5 >= str2.length()) {
            return null;
        }
        G4.setFromIndex(i5);
        int length = str.length() - 1;
        int length2 = str2.length() - 1;
        while (length >= i5 && length2 >= i5 && str.charAt(length) == str2.charAt(length2)) {
            length--;
            length2--;
        }
        G4.setRemovedCount((length - i5) + 1);
        G4.setAddedCount((length2 - i5) + 1);
        return G4;
    }

    public final boolean t() {
        Activity e4 = C0644h.e(this.f10625a.getContext());
        if (e4 == null || e4.getWindow() == null) {
            return false;
        }
        int i4 = e4.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i4 == 2 || i4 == 0;
    }

    public boolean u(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (!this.f10628d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = this.f10628d.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.f10635k = recordFlutterId;
            this.f10637m = null;
            return true;
        } else if (eventType == 128) {
            this.f10639o = null;
            return true;
        } else if (eventType == 32768) {
            this.f10634j = recordFlutterId;
            this.f10633i = null;
            return true;
        } else if (eventType != 65536) {
            return true;
        } else {
            this.f10635k = null;
            this.f10634j = null;
            return true;
        }
    }

    public final Rect v(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f10625a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    public final h w(int i4) {
        h hVar = (h) this.f10632h.get(Integer.valueOf(i4));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        int unused = hVar2.f10692b = i4;
        int unused2 = hVar2.f10691a = f10622B + i4;
        this.f10632h.put(Integer.valueOf(i4), hVar2);
        return hVar2;
    }

    public final l x(int i4) {
        l lVar = (l) this.f10631g.get(Integer.valueOf(i4));
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        int unused = lVar2.f10756b = i4;
        this.f10631g.put(Integer.valueOf(i4), lVar2);
        return lVar2;
    }

    public final l y() {
        return (l) this.f10631g.get(0);
    }

    public final void z(float f4, float f5, boolean z4) {
        l L4;
        if (!this.f10631g.isEmpty() && (L4 = y().y0(new float[]{f4, f5, 0.0f, 1.0f}, z4)) != this.f10639o) {
            if (L4 != null) {
                R(L4.f10756b, 128);
            }
            l lVar = this.f10639o;
            if (lVar != null) {
                R(lVar.f10756b, 256);
            }
            this.f10639o = L4;
        }
    }

    public d(View view, X2.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.n nVar) {
        this.f10631g = new HashMap();
        this.f10632h = new HashMap();
        this.f10636l = 0;
        this.f10640p = new ArrayList();
        this.f10641q = 0;
        this.f10642r = 0;
        this.f10644t = false;
        this.f10645u = false;
        this.f10646v = new a();
        b bVar = new b();
        this.f10647w = bVar;
        c cVar = new c(new Handler());
        this.f10649y = cVar;
        this.f10625a = view;
        this.f10626b = aVar;
        this.f10627c = accessibilityManager;
        this.f10630f = contentResolver;
        this.f10628d = accessibilityViewEmbedder;
        this.f10629e = nVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        C0175d dVar = new C0175d(accessibilityManager);
        this.f10648x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (Build.VERSION.SDK_INT >= 31) {
            X();
        }
        nVar.a(this);
    }
}
