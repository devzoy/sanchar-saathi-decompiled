package p;

import S.C;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import h.j;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: p.z  reason: case insensitive filesystem */
public class C0858z {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f11641l = new RectF();

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap f11642m = new ConcurrentHashMap();

    /* renamed from: n  reason: collision with root package name */
    public static ConcurrentHashMap f11643n = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f11644a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11645b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f11646c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f11647d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f11648e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f11649f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f11650g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f11651h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f11652i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f11653j;

    /* renamed from: k  reason: collision with root package name */
    public final c f11654k;

    /* renamed from: p.z$a */
    public static class a extends c {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C0858z.n(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* renamed from: p.z$b */
    public static class b extends a {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* renamed from: p.z$c */
    public static class c {
        public abstract void a(StaticLayout.Builder builder, TextView textView);

        public boolean b(TextView textView) {
            return ((Boolean) C0858z.n(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C0858z(TextView textView) {
        this.f11652i = textView;
        this.f11653j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f11654k = new b();
        } else {
            this.f11654k = new a();
        }
    }

    public static Method l(String str) {
        try {
            Method method = (Method) f11642m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, (Class[]) null)) != null) {
                method.setAccessible(true);
                f11642m.put(str, method);
            }
            return method;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + r4 + "() method", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object n(java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
        /*
            java.lang.reflect.Method r0 = l(r4)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            r1 = 0
            java.lang.Object r5 = r0.invoke(r3, r1)     // Catch:{ Exception -> 0x000c, all -> 0x000a }
            goto L_0x002a
        L_0x000a:
            r3 = move-exception
            goto L_0x000e
        L_0x000c:
            r3 = move-exception
            goto L_0x000f
        L_0x000e:
            throw r3
        L_0x000f:
            java.lang.String r0 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to invoke TextView#"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "() method"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.w(r0, r4, r3)
        L_0x002a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C0858z.n(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public final void A(float f4, float f5, float f6) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
        } else if (f5 <= f4) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        } else if (f6 > 0.0f) {
            this.f11644a = 1;
            this.f11647d = f4;
            this.f11648e = f5;
            this.f11646c = f6;
            this.f11650g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
    }

    public void a() {
        if (o()) {
            if (this.f11645b) {
                if (this.f11652i.getMeasuredHeight() > 0 && this.f11652i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f11654k.b(this.f11652i) ? 1048576 : (this.f11652i.getMeasuredWidth() - this.f11652i.getTotalPaddingLeft()) - this.f11652i.getTotalPaddingRight();
                    int height = (this.f11652i.getHeight() - this.f11652i.getCompoundPaddingBottom()) - this.f11652i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f11641l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = (float) measuredWidth;
                                rectF.bottom = (float) height;
                                float f4 = (float) f(rectF);
                                if (f4 != this.f11652i.getTextSize()) {
                                    u(0, f4);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f11645b = true;
        }
    }

    public final int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                arrayList.add(Integer.valueOf(i4));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
        }
        return iArr2;
    }

    public final void c() {
        this.f11644a = 0;
        this.f11647d = -1.0f;
        this.f11648e = -1.0f;
        this.f11646c = -1.0f;
        this.f11649f = new int[0];
        this.f11645b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i4, int i5) {
        return e(charSequence, alignment, i4, i5);
    }

    public final StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i4, int i5) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f11651h, i4);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f11652i.getLineSpacingExtra(), this.f11652i.getLineSpacingMultiplier()).setIncludePad(this.f11652i.getIncludeFontPadding()).setBreakStrategy(this.f11652i.getBreakStrategy()).setHyphenationFrequency(this.f11652i.getHyphenationFrequency());
        if (i5 == -1) {
            i5 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i5);
        try {
            this.f11654k.a(obtain, this.f11652i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }

    public final int f(RectF rectF) {
        int length = this.f11649f.length;
        if (length != 0) {
            int i4 = 1;
            int i5 = length - 1;
            int i6 = 0;
            while (i4 <= i5) {
                int i7 = (i4 + i5) / 2;
                if (y(this.f11649f[i7], rectF)) {
                    int i8 = i7 + 1;
                    i6 = i4;
                    i4 = i8;
                } else {
                    i6 = i7 - 1;
                    i5 = i6;
                }
            }
            return this.f11649f[i6];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public int g() {
        return Math.round(this.f11648e);
    }

    public int h() {
        return Math.round(this.f11647d);
    }

    public int i() {
        return Math.round(this.f11646c);
    }

    public int[] j() {
        return this.f11649f;
    }

    public int k() {
        return this.f11644a;
    }

    public void m(int i4) {
        TextPaint textPaint = this.f11651h;
        if (textPaint == null) {
            this.f11651h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f11651h.set(this.f11652i.getPaint());
        this.f11651h.setTextSize((float) i4);
    }

    public boolean o() {
        return z() && this.f11644a != 0;
    }

    public void p(AttributeSet attributeSet, int i4) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f11653j.obtainStyledAttributes(attributeSet, j.f9491i0, i4, 0);
        TextView textView = this.f11652i;
        C.e0(textView, textView.getContext(), j.f9491i0, attributeSet, obtainStyledAttributes, i4, 0);
        if (obtainStyledAttributes.hasValue(j.f9516n0)) {
            this.f11644a = obtainStyledAttributes.getInt(j.f9516n0, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(j.f9511m0) ? obtainStyledAttributes.getDimension(j.f9511m0, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(j.f9501k0) ? obtainStyledAttributes.getDimension(j.f9501k0, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(j.f9496j0) ? obtainStyledAttributes.getDimension(j.f9496j0, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(j.f9506l0) && (resourceId = obtainStyledAttributes.getResourceId(j.f9506l0, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            w(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!z()) {
            this.f11644a = 0;
        } else if (this.f11644a == 1) {
            if (!this.f11650g) {
                DisplayMetrics displayMetrics = this.f11653j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                A(dimension2, dimension3, dimension);
            }
            v();
        }
    }

    public void q(int i4, int i5, int i6, int i7) {
        if (z()) {
            DisplayMetrics displayMetrics = this.f11653j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(i7, (float) i4, displayMetrics), TypedValue.applyDimension(i7, (float) i5, displayMetrics), TypedValue.applyDimension(i7, (float) i6, displayMetrics));
            if (v()) {
                a();
            }
        }
    }

    public void r(int[] iArr, int i4) {
        if (z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i4 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f11653j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArr2[i5] = Math.round(TypedValue.applyDimension(i4, (float) iArr[i5], displayMetrics));
                    }
                }
                this.f11649f = b(iArr2);
                if (!x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f11650g = false;
            }
            if (v()) {
                a();
            }
        }
    }

    public void s(int i4) {
        if (!z()) {
            return;
        }
        if (i4 == 0) {
            c();
        } else if (i4 == 1) {
            DisplayMetrics displayMetrics = this.f11653j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (v()) {
                a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i4);
        }
    }

    public final void t(float f4) {
        if (f4 != this.f11652i.getPaint().getTextSize()) {
            this.f11652i.getPaint().setTextSize(f4);
            boolean isInLayout = this.f11652i.isInLayout();
            if (this.f11652i.getLayout() != null) {
                this.f11645b = false;
                try {
                    Method l4 = l("nullLayouts");
                    if (l4 != null) {
                        l4.invoke(this.f11652i, (Object[]) null);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (!isInLayout) {
                    this.f11652i.requestLayout();
                } else {
                    this.f11652i.forceLayout();
                }
                this.f11652i.invalidate();
            }
        }
    }

    public void u(int i4, float f4) {
        Context context = this.f11653j;
        t(TypedValue.applyDimension(i4, f4, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean v() {
        if (!z() || this.f11644a != 1) {
            this.f11645b = false;
        } else {
            if (!this.f11650g || this.f11649f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f11648e - this.f11647d) / this.f11646c))) + 1;
                int[] iArr = new int[floor];
                for (int i4 = 0; i4 < floor; i4++) {
                    iArr[i4] = Math.round(this.f11647d + (((float) i4) * this.f11646c));
                }
                this.f11649f = b(iArr);
            }
            this.f11645b = true;
        }
        return this.f11645b;
    }

    public final void w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = typedArray.getDimensionPixelSize(i4, -1);
            }
            this.f11649f = b(iArr);
            x();
        }
    }

    public final boolean x() {
        int[] iArr = this.f11649f;
        int length = iArr.length;
        boolean z4 = length > 0;
        this.f11650g = z4;
        if (z4) {
            this.f11644a = 1;
            this.f11647d = (float) iArr[0];
            this.f11648e = (float) iArr[length - 1];
            this.f11646c = -1.0f;
        }
        return z4;
    }

    public final boolean y(int i4, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f11652i.getText();
        TransformationMethod transformationMethod = this.f11652i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f11652i)) == null)) {
            text = transformation;
        }
        int maxLines = this.f11652i.getMaxLines();
        m(i4);
        StaticLayout d4 = d(text, (Layout.Alignment) n(this.f11652i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (d4.getLineCount() <= maxLines && d4.getLineEnd(d4.getLineCount() - 1) == text.length())) && ((float) d4.getHeight()) <= rectF.bottom;
    }

    public final boolean z() {
        return !(this.f11652i instanceof C0843j);
    }
}
